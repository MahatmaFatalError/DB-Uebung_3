grammar FirstSQL;

tokens {
    EQUAL1              =   '=';
    EQUAL2              =   '==';
    NOT_EQUAL1          =   '!=';
    NOT_EQUAL2          =   '<>';
    LESS                =   '<';
    LESS_OR_EQ1         =   '<=';
    LESS_OR_EQ2         =   '!>';
    GREATER             =   '>';
    GREATER_OR_EQ1      =   '>=';
    GREATER_OR_EQ2      =   '!<';
    SHIFT_LEFT          =   '<<';
    SHIFT_RIGHT         =   '>>';
    AMPERSAND           =   '&';
    HAT                 =   '^';
    PIPE                =   '|';
    DOUBLE_PIPE         =   '||';
    DIV                 =   '/';
    STAR                =   '*';
    PLUS                =   '+';
    MINUS               =   '-';
    TILDE               =   '~';
    BACKSLASH           =   '\\';
    MOD                 =   '%';
    SEMI                =   ';';
    DOT                 =   '.';
    COMMA               =   ',';
    LPAREN              =   '(';
    RPAREN              =   ')';
    QUESTION            =   '?';
    AT                  =   '@';
    DOLLAR              =   '$';
    QUOTE_DOUBLE        =   '"';
    QUOTE_TRIPLE        =   '\'\'\'';
    QUOTE_SINGLE        =   '\'';    
    APOSTROPHE          =   '`';
    LBRACKET            =   '[';
    RBRACKET            =   ']';
    UNDERSCORE          =   '_';
    COLON               =   ':';
}

@parser::header { 
package de.dhbw.db2.firstdb.sql; 

import de.dhbw.db2.firstdb.storage.types.SQLType;

import de.dhbw.db2.firstdb.sql.statement.*; 
import de.dhbw.db2.firstdb.catalog.objects.*;
}

@lexer::header { 
package de.dhbw.db2.firstdb.sql; 
}

/*------------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------*/

statement returns [Statement stmt]
        :       
        (
                (
                createTableStatement 
                {
                	$stmt = $createTableStatement.stmt;
                }
                | createIndexStatement 
                {
                	$stmt = $createIndexStatement.stmt;
                }
                | selectStatement 
                {
                	$stmt = $selectStatement.stmt;
                }
                | insertStatement
                {
                	$stmt = $insertStatement.stmt;
                }
                | commitStatement
                {
                	$stmt = $commitStatement.stmt;
                }
                )
                SEMI?
        );
        
commitStatement returns [CommitStatement stmt]
        @init{
        	$stmt = new CommitStatement();
        }
        :	
        (
        	COMMIT
        )
        ;

createTableStatement returns [CreateTableStatement stmt]
        @init{
        	$stmt = new CreateTableStatement();
        }
        :
        (
                CREATE
                TABLE 
                tableName 
                {
                	$stmt.setTable($tableName.table);
                }
                LPAREN
                att1=attributeName type1=sqlType                 
                {
                	$stmt.addAttribute($att1.attribute);
                	$stmt.addType($type1.type);
                }
                (
                PRIMARY KEY
                {
                	$stmt.addPrimaryKey($att1.attribute);
                }
                )?
                (
                COMMA att2=attributeName type2=sqlType
                {
                	$stmt.addAttribute($att2.attribute);
                	$stmt.addType($type2.type);
                }
                (
                PRIMARY KEY
                {
                	$stmt.addPrimaryKey($att2.attribute);
                }
                )?
                )*
                RPAREN
        )
        ;

createIndexStatement returns [CreateIndexStatement stmt]
        @init{
        	$stmt = new CreateIndexStatement();
        }
        :
        (
                CREATE
                (
                UNIQUE
                {
                	$stmt.setUnique(true);
                }
                )?
                INDEX
                indexName
                {
                	$stmt.setIndex($indexName.index);
                }
                ON
                tableName
                {
                	$stmt.setTable($tableName.table);
                }
                LPAREN
                attributeName
                {
                	$stmt.setAttribute($attributeName.attribute);
                }
                RPAREN
        )
        ;

selectStatement returns [SelectStatement stmt]
        @init{
        	$stmt = new SelectStatement();
        }
        :
        (
                SELECT
                att1=attributeName
                {
                	$stmt.addSelectAttribute($att1.attribute);
                }
                (
                COMMA att2=attributeName
                {
                	$stmt.addSelectAttribute($att2.attribute);
                }
                )*
                FROM
                tab1=tableName
                {
                	$stmt.addFromTable($tab1.table);
                }
                (
                COMMA tab2=tableName
                {
                	$stmt.addFromTable($tab2.table);
                }
                )*
                (WHERE predicate
                {
                	$stmt.setWherePredicate($predicate.pred);
                }
                )?
        )
        ;

insertStatement returns [InsertStatement stmt]
	@init{
        	$stmt = new InsertStatement();
        }
        :
        (
                INSERT
                INTO 
                tableName
                {
                	$stmt.setTable($tableName.table);
                }
                VALUES
                LPAREN
                const1=constant
                {
                	$stmt.addValue($const1.value);
                }
                (
                COMMA const2=constant
                {
                	$stmt.addValue($const2.value);
                }
                )*
                RPAREN
        )
        ;

predicate returns [Predicate pred]
        @init{
        	$pred = new Predicate();
        }
        :
        (
                term1=simplePredicate
                {
                	$pred.addTerm($term1.term);
                }
                (
                AND term2=simplePredicate
                {
                	$pred.addTerm($term2.term);
                }
                )*
        )       
        ;
        
        
simplePredicate returns [SimplePredicate term]
        @init{
        	$term = new SimplePredicate();
        }
        :
        (
                att1=attributeName
                {
                	$term.setAttribute($att1.attribute);
                }
                EQUAL1
                (
                	constant
               	 	{
                		$term.setConstant($constant.value);
              	  	}
                	|
                	att2=attributeName
                	{
                		$term.setAttribute2($att2.attribute);
                	}
                )
        )
        ;

        
indexName returns [Index index]
        :
        (
                ID{$index = new Index($ID.text);}
        )
        ;
                
tableName returns [Table table]
        :
        (
                ID {$table = new Table($ID.text);}
        )
        ;
        
attributeName returns [Attribute attribute]
        @init{
        	$attribute = new Attribute();
        }
        :
        (
        	(tableName DOT {$attribute.setTable($tableName.table);})?
                ID {$attribute.setName($ID.text);}
        )
        ;
        
constant returns [Constant value]
        @init{
        	$value = new Constant();
        }
        :
        (
                INTEGER {
                	$value.setType(SQLType.SqlInteger);
                	$value.setValue($INTEGER.text);
                }
                |
                STRING {
                	$value.setType(SQLType.SqlVarchar);
                	$value.setValue($STRING.text);
                }
        )
        ;
        
 sqlType returns [DataType type]
 	@init{
        	$type = new DataType();
        }
 	:	
 	(
 		TYPE_INT {
 			$type.setType(SQLType.SqlInteger);
 		}
 		|
 		(TYPE_VARCHAR LPAREN INTEGER RPAREN {
 			$type.setType(SQLType.SqlVarchar);
 			$type.setLength(new Integer($INTEGER.text));
 		}
 		)
 	)
 	;
/*------------------------------------------------------------------
 * LEXER RULES
 *------------------------------------------------------------------*/

SELECT: S E L E C T;
INSERT: I N S E R T;
CREATE: C R E A T E;
COMMIT: C O M M I T;

TABLE: T A B L E;
INDEX: I N D E X;
INTO: I N T O;
VALUES: V A L U E S;
FROM: F R O M;
JOIN: J O I N;
ON: O N;
WHERE: W H E R E;
AND: A N D;

PRIMARY	: P R I M A  R Y;
KEY : K E Y;
UNIQUE : U N I Q U E;

TYPE_VARCHAR: V A R C H A R;
TYPE_INT: (I N T | I N T E G E R);


IGNORE_CHAR: (WS|CONTROL_CHAR) {$channel=HIDDEN;};

STRING
    :
    (QUOTED_STRING)
    ;

INTEGER 
    : 
    (DIGIT)+ 
    ;

ID
    :  
    ( CHAR ( CHAR | DIGIT | '_' | '$' | '#' )* 
    )
    ;
     
fragment WS: (' ') ;
fragment CONTROL_CHAR: ('\r'|'\t'|'\u000B'|'\f'|'\n');
fragment QUOTED_STRING: QUOTE_SINGLE (~QUOTE_SINGLE)* QUOTE_SINGLE;
fragment DIGIT  : '0'..'9' ;
fragment CHAR : ('A' .. 'Z'|'a' .. 'z');

fragment A:('a'|'A');
fragment B:('b'|'B');
fragment C:('c'|'C');
fragment D:('d'|'D');
fragment E:('e'|'E');
fragment F:('f'|'F');
fragment G:('g'|'G');
fragment H:('h'|'H');
fragment I:('i'|'I');
fragment J:('j'|'J');
fragment K:('k'|'K');
fragment L:('l'|'L');
fragment M:('m'|'M');
fragment N:('n'|'N');
fragment O:('o'|'O');
fragment P:('p'|'P');
fragment Q:('q'|'Q');
fragment R:('r'|'R');
fragment S:('s'|'S');
fragment T:('t'|'T');
fragment U:('u'|'U');
fragment V:('v'|'V');
fragment W:('w'|'W');
fragment X:('x'|'X');
fragment Y:('y'|'Y');
fragment Z:('z'|'Z');