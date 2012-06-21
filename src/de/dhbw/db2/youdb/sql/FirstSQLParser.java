// $ANTLR 3.3 Nov 30, 2010 12:45:30 /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g 2011-11-07 09:10:16
 
package de.dhbw.db2.youdb.sql; 

import org.antlr.runtime.BitSet;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.Parser;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;

import de.dhbw.db2.youdb.catalog.objects.Attribute;
import de.dhbw.db2.youdb.catalog.objects.DataType;
import de.dhbw.db2.youdb.catalog.objects.Index;
import de.dhbw.db2.youdb.catalog.objects.Table;
import de.dhbw.db2.youdb.sql.statement.CommitStatement;
import de.dhbw.db2.youdb.sql.statement.Constant;
import de.dhbw.db2.youdb.sql.statement.CreateIndexStatement;
import de.dhbw.db2.youdb.sql.statement.CreateTableStatement;
import de.dhbw.db2.youdb.sql.statement.InsertStatement;
import de.dhbw.db2.youdb.sql.statement.Predicate;
import de.dhbw.db2.youdb.sql.statement.SelectStatement;
import de.dhbw.db2.youdb.sql.statement.SimplePredicate;
import de.dhbw.db2.youdb.sql.statement.Statement;
import de.dhbw.db2.youdb.storage.types.SQLType;

public class FirstSQLParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "EQUAL1", "EQUAL2", "NOT_EQUAL1", "NOT_EQUAL2", "LESS", "LESS_OR_EQ1", "LESS_OR_EQ2", "GREATER", "GREATER_OR_EQ1", "GREATER_OR_EQ2", "SHIFT_LEFT", "SHIFT_RIGHT", "AMPERSAND", "HAT", "PIPE", "DOUBLE_PIPE", "DIV", "STAR", "PLUS", "MINUS", "TILDE", "BACKSLASH", "MOD", "SEMI", "DOT", "COMMA", "LPAREN", "RPAREN", "QUESTION", "AT", "DOLLAR", "QUOTE_DOUBLE", "QUOTE_TRIPLE", "QUOTE_SINGLE", "APOSTROPHE", "LBRACKET", "RBRACKET", "UNDERSCORE", "COLON", "COMMIT", "CREATE", "TABLE", "PRIMARY", "KEY", "UNIQUE", "INDEX", "ON", "SELECT", "FROM", "WHERE", "INSERT", "INTO", "VALUES", "AND", "ID", "INTEGER", "STRING", "TYPE_INT", "TYPE_VARCHAR", "S", "E", "L", "C", "T", "I", "N", "R", "A", "O", "M", "B", "D", "X", "V", "U", "F", "J", "JOIN", "W", "H", "P", "Y", "K", "Q", "G", "WS", "CONTROL_CHAR", "IGNORE_CHAR", "QUOTED_STRING", "DIGIT", "CHAR", "Z"
    };
    public static final int EOF=-1;
    public static final int EQUAL1=4;
    public static final int EQUAL2=5;
    public static final int NOT_EQUAL1=6;
    public static final int NOT_EQUAL2=7;
    public static final int LESS=8;
    public static final int LESS_OR_EQ1=9;
    public static final int LESS_OR_EQ2=10;
    public static final int GREATER=11;
    public static final int GREATER_OR_EQ1=12;
    public static final int GREATER_OR_EQ2=13;
    public static final int SHIFT_LEFT=14;
    public static final int SHIFT_RIGHT=15;
    public static final int AMPERSAND=16;
    public static final int HAT=17;
    public static final int PIPE=18;
    public static final int DOUBLE_PIPE=19;
    public static final int DIV=20;
    public static final int STAR=21;
    public static final int PLUS=22;
    public static final int MINUS=23;
    public static final int TILDE=24;
    public static final int BACKSLASH=25;
    public static final int MOD=26;
    public static final int SEMI=27;
    public static final int DOT=28;
    public static final int COMMA=29;
    public static final int LPAREN=30;
    public static final int RPAREN=31;
    public static final int QUESTION=32;
    public static final int AT=33;
    public static final int DOLLAR=34;
    public static final int QUOTE_DOUBLE=35;
    public static final int QUOTE_TRIPLE=36;
    public static final int QUOTE_SINGLE=37;
    public static final int APOSTROPHE=38;
    public static final int LBRACKET=39;
    public static final int RBRACKET=40;
    public static final int UNDERSCORE=41;
    public static final int COLON=42;
    public static final int COMMIT=43;
    public static final int CREATE=44;
    public static final int TABLE=45;
    public static final int PRIMARY=46;
    public static final int KEY=47;
    public static final int UNIQUE=48;
    public static final int INDEX=49;
    public static final int ON=50;
    public static final int SELECT=51;
    public static final int FROM=52;
    public static final int WHERE=53;
    public static final int INSERT=54;
    public static final int INTO=55;
    public static final int VALUES=56;
    public static final int AND=57;
    public static final int ID=58;
    public static final int INTEGER=59;
    public static final int STRING=60;
    public static final int TYPE_INT=61;
    public static final int TYPE_VARCHAR=62;
    public static final int S=63;
    public static final int E=64;
    public static final int L=65;
    public static final int C=66;
    public static final int T=67;
    public static final int I=68;
    public static final int N=69;
    public static final int R=70;
    public static final int A=71;
    public static final int O=72;
    public static final int M=73;
    public static final int B=74;
    public static final int D=75;
    public static final int X=76;
    public static final int V=77;
    public static final int U=78;
    public static final int F=79;
    public static final int J=80;
    public static final int JOIN=81;
    public static final int W=82;
    public static final int H=83;
    public static final int P=84;
    public static final int Y=85;
    public static final int K=86;
    public static final int Q=87;
    public static final int G=88;
    public static final int WS=89;
    public static final int CONTROL_CHAR=90;
    public static final int IGNORE_CHAR=91;
    public static final int QUOTED_STRING=92;
    public static final int DIGIT=93;
    public static final int CHAR=94;
    public static final int Z=95;

    // delegates
    // delegators


        public FirstSQLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public FirstSQLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return FirstSQLParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g"; }



    // $ANTLR start "statement"
    // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:62:1: statement returns [Statement stmt] : ( ( createTableStatement | createIndexStatement | selectStatement | insertStatement | commitStatement ) ( SEMI )? ) ;
    public final Statement statement() throws RecognitionException {
        Statement stmt = null;

        CreateTableStatement createTableStatement1 = null;

        CreateIndexStatement createIndexStatement2 = null;

        SelectStatement selectStatement3 = null;

        InsertStatement insertStatement4 = null;

        CommitStatement commitStatement5 = null;


        try {
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:63:9: ( ( ( createTableStatement | createIndexStatement | selectStatement | insertStatement | commitStatement ) ( SEMI )? ) )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:64:9: ( ( createTableStatement | createIndexStatement | selectStatement | insertStatement | commitStatement ) ( SEMI )? )
            {
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:64:9: ( ( createTableStatement | createIndexStatement | selectStatement | insertStatement | commitStatement ) ( SEMI )? )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:65:17: ( createTableStatement | createIndexStatement | selectStatement | insertStatement | commitStatement ) ( SEMI )?
            {
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:65:17: ( createTableStatement | createIndexStatement | selectStatement | insertStatement | commitStatement )
            int alt1=5;
            switch ( input.LA(1) ) {
            case CREATE:
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==TABLE) ) {
                    alt1=1;
                }
                else if ( ((LA1_1>=UNIQUE && LA1_1<=INDEX)) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
                }
                break;
            case SELECT:
                {
                alt1=3;
                }
                break;
            case INSERT:
                {
                alt1=4;
                }
                break;
            case COMMIT:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:66:17: createTableStatement
                    {
                    pushFollow(FOLLOW_createTableStatement_in_statement1060);
                    createTableStatement1=createTableStatement();

                    state._fsp--;


                                    	stmt = createTableStatement1;
                                    

                    }
                    break;
                case 2 :
                    // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:70:19: createIndexStatement
                    {
                    pushFollow(FOLLOW_createIndexStatement_in_statement1099);
                    createIndexStatement2=createIndexStatement();

                    state._fsp--;


                                    	stmt = createIndexStatement2;
                                    

                    }
                    break;
                case 3 :
                    // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:74:19: selectStatement
                    {
                    pushFollow(FOLLOW_selectStatement_in_statement1138);
                    selectStatement3=selectStatement();

                    state._fsp--;


                                    	stmt = selectStatement3;
                                    

                    }
                    break;
                case 4 :
                    // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:78:19: insertStatement
                    {
                    pushFollow(FOLLOW_insertStatement_in_statement1177);
                    insertStatement4=insertStatement();

                    state._fsp--;


                                    	stmt = insertStatement4;
                                    

                    }
                    break;
                case 5 :
                    // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:82:19: commitStatement
                    {
                    pushFollow(FOLLOW_commitStatement_in_statement1215);
                    commitStatement5=commitStatement();

                    state._fsp--;


                                    	stmt = commitStatement5;
                                    

                    }
                    break;

            }

            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:87:17: ( SEMI )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==SEMI) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:87:17: SEMI
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_statement1269); 

                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "statement"


    // $ANTLR start "commitStatement"
    // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:90:1: commitStatement returns [CommitStatement stmt] : ( COMMIT ) ;
    public final CommitStatement commitStatement() throws RecognitionException {
        CommitStatement stmt = null;


                	stmt = new CommitStatement();
                
        try {
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:94:9: ( ( COMMIT ) )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:95:9: ( COMMIT )
            {
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:95:9: ( COMMIT )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:96:10: COMMIT
            {
            match(input,COMMIT,FOLLOW_COMMIT_in_commitStatement1340); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "commitStatement"


    // $ANTLR start "createTableStatement"
    // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:100:1: createTableStatement returns [CreateTableStatement stmt] : ( CREATE TABLE tableName LPAREN att1= attributeName type1= sqlType ( PRIMARY KEY )? ( COMMA att2= attributeName type2= sqlType ( PRIMARY KEY )? )* RPAREN ) ;
    public final CreateTableStatement createTableStatement() throws RecognitionException {
        CreateTableStatement stmt = null;

        Attribute att1 = null;

        DataType type1 = null;

        Attribute att2 = null;

        DataType type2 = null;

        Table tableName6 = null;



                	stmt = new CreateTableStatement();
                
        try {
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:104:9: ( ( CREATE TABLE tableName LPAREN att1= attributeName type1= sqlType ( PRIMARY KEY )? ( COMMA att2= attributeName type2= sqlType ( PRIMARY KEY )? )* RPAREN ) )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:105:9: ( CREATE TABLE tableName LPAREN att1= attributeName type1= sqlType ( PRIMARY KEY )? ( COMMA att2= attributeName type2= sqlType ( PRIMARY KEY )? )* RPAREN )
            {
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:105:9: ( CREATE TABLE tableName LPAREN att1= attributeName type1= sqlType ( PRIMARY KEY )? ( COMMA att2= attributeName type2= sqlType ( PRIMARY KEY )? )* RPAREN )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:106:17: CREATE TABLE tableName LPAREN att1= attributeName type1= sqlType ( PRIMARY KEY )? ( COMMA att2= attributeName type2= sqlType ( PRIMARY KEY )? )* RPAREN
            {
            match(input,CREATE,FOLLOW_CREATE_in_createTableStatement1417); 
            match(input,TABLE,FOLLOW_TABLE_in_createTableStatement1435); 
            pushFollow(FOLLOW_tableName_in_createTableStatement1454);
            tableName6=tableName();

            state._fsp--;


                            	stmt.setTable(tableName6);
                            
            match(input,LPAREN,FOLLOW_LPAREN_in_createTableStatement1491); 
            pushFollow(FOLLOW_attributeName_in_createTableStatement1511);
            att1=attributeName();

            state._fsp--;

            pushFollow(FOLLOW_sqlType_in_createTableStatement1515);
            type1=sqlType();

            state._fsp--;


                            	stmt.addAttribute(att1);
                            	stmt.addType(type1);
                            
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:118:17: ( PRIMARY KEY )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==PRIMARY) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:119:17: PRIMARY KEY
                    {
                    match(input,PRIMARY,FOLLOW_PRIMARY_in_createTableStatement1586); 
                    match(input,KEY,FOLLOW_KEY_in_createTableStatement1588); 

                                    	stmt.addPrimaryKey(att1);
                                    

                    }
                    break;

            }

            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:124:17: ( COMMA att2= attributeName type2= sqlType ( PRIMARY KEY )? )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==COMMA) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:125:17: COMMA att2= attributeName type2= sqlType ( PRIMARY KEY )?
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_createTableStatement1661); 
            	    pushFollow(FOLLOW_attributeName_in_createTableStatement1665);
            	    att2=attributeName();

            	    state._fsp--;

            	    pushFollow(FOLLOW_sqlType_in_createTableStatement1669);
            	    type2=sqlType();

            	    state._fsp--;


            	                    	stmt.addAttribute(att2);
            	                    	stmt.addType(type2);
            	                    
            	    // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:130:17: ( PRIMARY KEY )?
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==PRIMARY) ) {
            	        alt4=1;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:131:17: PRIMARY KEY
            	            {
            	            match(input,PRIMARY,FOLLOW_PRIMARY_in_createTableStatement1723); 
            	            match(input,KEY,FOLLOW_KEY_in_createTableStatement1725); 

            	                            	stmt.addPrimaryKey(att2);
            	                            

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match(input,RPAREN,FOLLOW_RPAREN_in_createTableStatement1799); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "createTableStatement"


    // $ANTLR start "createIndexStatement"
    // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:141:1: createIndexStatement returns [CreateIndexStatement stmt] : ( CREATE ( UNIQUE )? INDEX indexName ON tableName LPAREN attributeName RPAREN ) ;
    public final CreateIndexStatement createIndexStatement() throws RecognitionException {
        CreateIndexStatement stmt = null;

        Index indexName7 = null;

        Table tableName8 = null;

        Attribute attributeName9 = null;



                	stmt = new CreateIndexStatement();
                
        try {
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:145:9: ( ( CREATE ( UNIQUE )? INDEX indexName ON tableName LPAREN attributeName RPAREN ) )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:146:9: ( CREATE ( UNIQUE )? INDEX indexName ON tableName LPAREN attributeName RPAREN )
            {
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:146:9: ( CREATE ( UNIQUE )? INDEX indexName ON tableName LPAREN attributeName RPAREN )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:147:17: CREATE ( UNIQUE )? INDEX indexName ON tableName LPAREN attributeName RPAREN
            {
            match(input,CREATE,FOLLOW_CREATE_in_createIndexStatement1876); 
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:148:17: ( UNIQUE )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==UNIQUE) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:149:17: UNIQUE
                    {
                    match(input,UNIQUE,FOLLOW_UNIQUE_in_createIndexStatement1912); 

                                    	stmt.setUnique(true);
                                    

                    }
                    break;

            }

            match(input,INDEX,FOLLOW_INDEX_in_createIndexStatement1967); 
            pushFollow(FOLLOW_indexName_in_createIndexStatement1985);
            indexName7=indexName();

            state._fsp--;


                            	stmt.setIndex(indexName7);
                            
            match(input,ON,FOLLOW_ON_in_createIndexStatement2021); 
            pushFollow(FOLLOW_tableName_in_createIndexStatement2039);
            tableName8=tableName();

            state._fsp--;


                            	stmt.setTable(tableName8);
                            
            match(input,LPAREN,FOLLOW_LPAREN_in_createIndexStatement2075); 
            pushFollow(FOLLOW_attributeName_in_createIndexStatement2093);
            attributeName9=attributeName();

            state._fsp--;


                            	stmt.setAttribute(attributeName9);
                            
            match(input,RPAREN,FOLLOW_RPAREN_in_createIndexStatement2129); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "createIndexStatement"


    // $ANTLR start "selectStatement"
    // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:173:1: selectStatement returns [SelectStatement stmt] : ( SELECT att1= attributeName ( COMMA att2= attributeName )* FROM tab1= tableName ( COMMA tab2= tableName )* ( WHERE predicate )? ) ;
    public final SelectStatement selectStatement() throws RecognitionException {
        SelectStatement stmt = null;

        Attribute att1 = null;

        Attribute att2 = null;

        Table tab1 = null;

        Table tab2 = null;

        Predicate predicate10 = null;



                	stmt = new SelectStatement();
                
        try {
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:177:9: ( ( SELECT att1= attributeName ( COMMA att2= attributeName )* FROM tab1= tableName ( COMMA tab2= tableName )* ( WHERE predicate )? ) )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:178:9: ( SELECT att1= attributeName ( COMMA att2= attributeName )* FROM tab1= tableName ( COMMA tab2= tableName )* ( WHERE predicate )? )
            {
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:178:9: ( SELECT att1= attributeName ( COMMA att2= attributeName )* FROM tab1= tableName ( COMMA tab2= tableName )* ( WHERE predicate )? )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:179:17: SELECT att1= attributeName ( COMMA att2= attributeName )* FROM tab1= tableName ( COMMA tab2= tableName )* ( WHERE predicate )?
            {
            match(input,SELECT,FOLLOW_SELECT_in_selectStatement2206); 
            pushFollow(FOLLOW_attributeName_in_selectStatement2226);
            att1=attributeName();

            state._fsp--;


                            	stmt.addSelectAttribute(att1);
                            
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:184:17: ( COMMA att2= attributeName )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==COMMA) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:185:17: COMMA att2= attributeName
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_selectStatement2280); 
            	    pushFollow(FOLLOW_attributeName_in_selectStatement2284);
            	    att2=attributeName();

            	    state._fsp--;


            	                    	stmt.addSelectAttribute(att2);
            	                    

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match(input,FROM,FOLLOW_FROM_in_selectStatement2339); 
            pushFollow(FOLLOW_tableName_in_selectStatement2359);
            tab1=tableName();

            state._fsp--;


                            	stmt.addFromTable(tab1);
                            
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:195:17: ( COMMA tab2= tableName )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==COMMA) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:196:17: COMMA tab2= tableName
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_selectStatement2413); 
            	    pushFollow(FOLLOW_tableName_in_selectStatement2417);
            	    tab2=tableName();

            	    state._fsp--;


            	                    	stmt.addFromTable(tab2);
            	                    

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:201:17: ( WHERE predicate )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==WHERE) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:201:18: WHERE predicate
                    {
                    match(input,WHERE,FOLLOW_WHERE_in_selectStatement2473); 
                    pushFollow(FOLLOW_predicate_in_selectStatement2475);
                    predicate10=predicate();

                    state._fsp--;


                                    	stmt.setWherePredicate(predicate10);
                                    

                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "selectStatement"


    // $ANTLR start "insertStatement"
    // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:209:1: insertStatement returns [InsertStatement stmt] : ( INSERT INTO tableName VALUES LPAREN const1= constant ( COMMA const2= constant )* RPAREN ) ;
    public final InsertStatement insertStatement() throws RecognitionException {
        InsertStatement stmt = null;

        Constant const1 = null;

        Constant const2 = null;

        Table tableName11 = null;



                	stmt = new InsertStatement();
                
        try {
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:213:9: ( ( INSERT INTO tableName VALUES LPAREN const1= constant ( COMMA const2= constant )* RPAREN ) )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:214:9: ( INSERT INTO tableName VALUES LPAREN const1= constant ( COMMA const2= constant )* RPAREN )
            {
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:214:9: ( INSERT INTO tableName VALUES LPAREN const1= constant ( COMMA const2= constant )* RPAREN )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:215:17: INSERT INTO tableName VALUES LPAREN const1= constant ( COMMA const2= constant )* RPAREN
            {
            match(input,INSERT,FOLLOW_INSERT_in_insertStatement2582); 
            match(input,INTO,FOLLOW_INTO_in_insertStatement2600); 
            pushFollow(FOLLOW_tableName_in_insertStatement2619);
            tableName11=tableName();

            state._fsp--;


                            	stmt.setTable(tableName11);
                            
            match(input,VALUES,FOLLOW_VALUES_in_insertStatement2655); 
            match(input,LPAREN,FOLLOW_LPAREN_in_insertStatement2673); 
            pushFollow(FOLLOW_constant_in_insertStatement2693);
            const1=constant();

            state._fsp--;


                            	stmt.addValue(const1);
                            
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:227:17: ( COMMA const2= constant )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==COMMA) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:228:17: COMMA const2= constant
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_insertStatement2747); 
            	    pushFollow(FOLLOW_constant_in_insertStatement2751);
            	    const2=constant();

            	    state._fsp--;


            	                    	stmt.addValue(const2);
            	                    

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match(input,RPAREN,FOLLOW_RPAREN_in_insertStatement2806); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "insertStatement"


    // $ANTLR start "predicate"
    // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:237:1: predicate returns [Predicate pred] : (term1= simplePredicate ( AND term2= simplePredicate )* ) ;
    public final Predicate predicate() throws RecognitionException {
        Predicate pred = null;

        SimplePredicate term1 = null;

        SimplePredicate term2 = null;



                	pred = new Predicate();
                
        try {
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:241:9: ( (term1= simplePredicate ( AND term2= simplePredicate )* ) )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:242:9: (term1= simplePredicate ( AND term2= simplePredicate )* )
            {
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:242:9: (term1= simplePredicate ( AND term2= simplePredicate )* )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:243:17: term1= simplePredicate ( AND term2= simplePredicate )*
            {
            pushFollow(FOLLOW_simplePredicate_in_predicate2885);
            term1=simplePredicate();

            state._fsp--;


                            	pred.addTerm(term1);
                            
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:247:17: ( AND term2= simplePredicate )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==AND) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:248:17: AND term2= simplePredicate
            	    {
            	    match(input,AND,FOLLOW_AND_in_predicate2939); 
            	    pushFollow(FOLLOW_simplePredicate_in_predicate2943);
            	    term2=simplePredicate();

            	    state._fsp--;


            	                    	pred.addTerm(term2);
            	                    

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return pred;
    }
    // $ANTLR end "predicate"


    // $ANTLR start "simplePredicate"
    // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:257:1: simplePredicate returns [SimplePredicate term] : (att1= attributeName EQUAL1 ( constant | att2= attributeName ) ) ;
    public final SimplePredicate simplePredicate() throws RecognitionException {
        SimplePredicate term = null;

        Attribute att1 = null;

        Attribute att2 = null;

        Constant constant12 = null;



                	term = new SimplePredicate();
                
        try {
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:261:9: ( (att1= attributeName EQUAL1 ( constant | att2= attributeName ) ) )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:262:9: (att1= attributeName EQUAL1 ( constant | att2= attributeName ) )
            {
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:262:9: (att1= attributeName EQUAL1 ( constant | att2= attributeName ) )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:263:17: att1= attributeName EQUAL1 ( constant | att2= attributeName )
            {
            pushFollow(FOLLOW_attributeName_in_simplePredicate3083);
            att1=attributeName();

            state._fsp--;


                            	term.setAttribute(att1);
                            
            match(input,EQUAL1,FOLLOW_EQUAL1_in_simplePredicate3119); 
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:268:17: ( constant | att2= attributeName )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=INTEGER && LA12_0<=STRING)) ) {
                alt12=1;
            }
            else if ( (LA12_0==ID) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:269:18: constant
                    {
                    pushFollow(FOLLOW_constant_in_simplePredicate3156);
                    constant12=constant();

                    state._fsp--;


                                    		term.setConstant(constant12);
                                  	  	

                    }
                    break;
                case 2 :
                    // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:274:18: att2= attributeName
                    {
                    pushFollow(FOLLOW_attributeName_in_simplePredicate3216);
                    att2=attributeName();

                    state._fsp--;


                                    		term.setAttribute2(att2);
                                    	

                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return term;
    }
    // $ANTLR end "simplePredicate"


    // $ANTLR start "indexName"
    // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:283:1: indexName returns [Index index] : ( ID ) ;
    public final Index indexName() throws RecognitionException {
        Index index = null;

        Token ID13=null;

        try {
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:284:9: ( ( ID ) )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:285:9: ( ID )
            {
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:285:9: ( ID )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:286:17: ID
            {
            ID13=(Token)match(input,ID,FOLLOW_ID_in_indexName3327); 
            index = new Index((ID13!=null?ID13.getText():null));

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return index;
    }
    // $ANTLR end "indexName"


    // $ANTLR start "tableName"
    // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:290:1: tableName returns [Table table] : ( ID ) ;
    public final Table tableName() throws RecognitionException {
        Table table = null;

        Token ID14=null;

        try {
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:291:9: ( ( ID ) )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:292:9: ( ID )
            {
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:292:9: ( ID )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:293:17: ID
            {
            ID14=(Token)match(input,ID,FOLLOW_ID_in_tableName3409); 
            table = new Table((ID14!=null?ID14.getText():null));

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return table;
    }
    // $ANTLR end "tableName"


    // $ANTLR start "attributeName"
    // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:297:1: attributeName returns [Attribute attribute] : ( ( tableName DOT )? ID ) ;
    public final Attribute attributeName() throws RecognitionException {
        Attribute attribute = null;

        Token ID16=null;
        Table tableName15 = null;



                	attribute = new Attribute();
                
        try {
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:301:9: ( ( ( tableName DOT )? ID ) )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:302:9: ( ( tableName DOT )? ID )
            {
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:302:9: ( ( tableName DOT )? ID )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:303:10: ( tableName DOT )? ID
            {
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:303:10: ( tableName DOT )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==ID) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==DOT) ) {
                    alt13=1;
                }
            }
            switch (alt13) {
                case 1 :
                    // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:303:11: tableName DOT
                    {
                    pushFollow(FOLLOW_tableName_in_attributeName3490);
                    tableName15=tableName();

                    state._fsp--;

                    match(input,DOT,FOLLOW_DOT_in_attributeName3492); 
                    attribute.setTable(tableName15);

                    }
                    break;

            }

            ID16=(Token)match(input,ID,FOLLOW_ID_in_attributeName3514); 
            attribute.setName((ID16!=null?ID16.getText():null));

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return attribute;
    }
    // $ANTLR end "attributeName"


    // $ANTLR start "constant"
    // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:308:1: constant returns [Constant value] : ( INTEGER | STRING ) ;
    public final Constant constant() throws RecognitionException {
        Constant value = null;

        Token INTEGER17=null;
        Token STRING18=null;


                	value = new Constant();
                
        try {
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:312:9: ( ( INTEGER | STRING ) )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:313:9: ( INTEGER | STRING )
            {
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:313:9: ( INTEGER | STRING )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==INTEGER) ) {
                alt14=1;
            }
            else if ( (LA14_0==STRING) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:314:17: INTEGER
                    {
                    INTEGER17=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_constant3601); 

                                    	value.setType(SQLType.SqlInteger);
                                    	value.setValue((INTEGER17!=null?INTEGER17.getText():null));
                                    

                    }
                    break;
                case 2 :
                    // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:319:17: STRING
                    {
                    STRING18=(Token)match(input,STRING,FOLLOW_STRING_in_constant3639); 

                                    	value.setType(SQLType.SqlVarchar);
                                    	value.setValue((STRING18!=null?STRING18.getText():null));
                                    

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "constant"


    // $ANTLR start "sqlType"
    // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:326:2: sqlType returns [DataType type] : ( TYPE_INT | ( TYPE_VARCHAR LPAREN INTEGER RPAREN ) ) ;
    public final DataType sqlType() throws RecognitionException {
        DataType type = null;

        Token INTEGER19=null;


                	type = new DataType();
                
        try {
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:330:3: ( ( TYPE_INT | ( TYPE_VARCHAR LPAREN INTEGER RPAREN ) ) )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:331:3: ( TYPE_INT | ( TYPE_VARCHAR LPAREN INTEGER RPAREN ) )
            {
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:331:3: ( TYPE_INT | ( TYPE_VARCHAR LPAREN INTEGER RPAREN ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==TYPE_INT) ) {
                alt15=1;
            }
            else if ( (LA15_0==TYPE_VARCHAR) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:332:4: TYPE_INT
                    {
                    match(input,TYPE_INT,FOLLOW_TYPE_INT_in_sqlType3697); 

                     			type.setType(SQLType.SqlInteger);
                     		

                    }
                    break;
                case 2 :
                    // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:336:4: ( TYPE_VARCHAR LPAREN INTEGER RPAREN )
                    {
                    // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:336:4: ( TYPE_VARCHAR LPAREN INTEGER RPAREN )
                    // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:336:5: TYPE_VARCHAR LPAREN INTEGER RPAREN
                    {
                    match(input,TYPE_VARCHAR,FOLLOW_TYPE_VARCHAR_in_sqlType3710); 
                    match(input,LPAREN,FOLLOW_LPAREN_in_sqlType3712); 
                    INTEGER19=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_sqlType3714); 
                    match(input,RPAREN,FOLLOW_RPAREN_in_sqlType3716); 

                     			type.setType(SQLType.SqlVarchar);
                     			type.setLength(new Integer((INTEGER19!=null?INTEGER19.getText():null)));
                     		

                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return type;
    }
    // $ANTLR end "sqlType"

    // Delegated rules


 

    public static final BitSet FOLLOW_createTableStatement_in_statement1060 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_createIndexStatement_in_statement1099 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_selectStatement_in_statement1138 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_insertStatement_in_statement1177 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_commitStatement_in_statement1215 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_SEMI_in_statement1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMIT_in_commitStatement1340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_createTableStatement1417 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_TABLE_in_createTableStatement1435 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_tableName_in_createTableStatement1454 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_LPAREN_in_createTableStatement1491 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_attributeName_in_createTableStatement1511 = new BitSet(new long[]{0x6000000000000000L});
    public static final BitSet FOLLOW_sqlType_in_createTableStatement1515 = new BitSet(new long[]{0x00004000A0000000L});
    public static final BitSet FOLLOW_PRIMARY_in_createTableStatement1586 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_KEY_in_createTableStatement1588 = new BitSet(new long[]{0x00000000A0000000L});
    public static final BitSet FOLLOW_COMMA_in_createTableStatement1661 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_attributeName_in_createTableStatement1665 = new BitSet(new long[]{0x6000000000000000L});
    public static final BitSet FOLLOW_sqlType_in_createTableStatement1669 = new BitSet(new long[]{0x00004000A0000000L});
    public static final BitSet FOLLOW_PRIMARY_in_createTableStatement1723 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_KEY_in_createTableStatement1725 = new BitSet(new long[]{0x00000000A0000000L});
    public static final BitSet FOLLOW_RPAREN_in_createTableStatement1799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_createIndexStatement1876 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_UNIQUE_in_createIndexStatement1912 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_INDEX_in_createIndexStatement1967 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_indexName_in_createIndexStatement1985 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_ON_in_createIndexStatement2021 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_tableName_in_createIndexStatement2039 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_LPAREN_in_createIndexStatement2075 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_attributeName_in_createIndexStatement2093 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_RPAREN_in_createIndexStatement2129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_selectStatement2206 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_attributeName_in_selectStatement2226 = new BitSet(new long[]{0x0010000020000000L});
    public static final BitSet FOLLOW_COMMA_in_selectStatement2280 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_attributeName_in_selectStatement2284 = new BitSet(new long[]{0x0010000020000000L});
    public static final BitSet FOLLOW_FROM_in_selectStatement2339 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_tableName_in_selectStatement2359 = new BitSet(new long[]{0x0020000020000002L});
    public static final BitSet FOLLOW_COMMA_in_selectStatement2413 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_tableName_in_selectStatement2417 = new BitSet(new long[]{0x0020000020000002L});
    public static final BitSet FOLLOW_WHERE_in_selectStatement2473 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_predicate_in_selectStatement2475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSERT_in_insertStatement2582 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_INTO_in_insertStatement2600 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_tableName_in_insertStatement2619 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_VALUES_in_insertStatement2655 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_LPAREN_in_insertStatement2673 = new BitSet(new long[]{0x1800000000000000L});
    public static final BitSet FOLLOW_constant_in_insertStatement2693 = new BitSet(new long[]{0x00000000A0000000L});
    public static final BitSet FOLLOW_COMMA_in_insertStatement2747 = new BitSet(new long[]{0x1800000000000000L});
    public static final BitSet FOLLOW_constant_in_insertStatement2751 = new BitSet(new long[]{0x00000000A0000000L});
    public static final BitSet FOLLOW_RPAREN_in_insertStatement2806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simplePredicate_in_predicate2885 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_AND_in_predicate2939 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_simplePredicate_in_predicate2943 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_attributeName_in_simplePredicate3083 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_EQUAL1_in_simplePredicate3119 = new BitSet(new long[]{0x1C00000000000000L});
    public static final BitSet FOLLOW_constant_in_simplePredicate3156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeName_in_simplePredicate3216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_indexName3327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_tableName3409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tableName_in_attributeName3490 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_DOT_in_attributeName3492 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_ID_in_attributeName3514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_constant3601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_constant3639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_INT_in_sqlType3697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_VARCHAR_in_sqlType3710 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_LPAREN_in_sqlType3712 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_INTEGER_in_sqlType3714 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_RPAREN_in_sqlType3716 = new BitSet(new long[]{0x0000000000000002L});

}