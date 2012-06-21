// $ANTLR 3.3 Nov 30, 2010 12:45:30 /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g 2011-11-07 09:10:16
 
package de.dhbw.db2.youdb.sql; 


import org.antlr.runtime.BaseRecognizer;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.DFA;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.IntStream;
import org.antlr.runtime.Lexer;
import org.antlr.runtime.MismatchedSetException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;

public class FirstSQLLexer extends Lexer {
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

    public FirstSQLLexer() {;} 
    public FirstSQLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public FirstSQLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g"; }

    // $ANTLR start "EQUAL1"
    public final void mEQUAL1() throws RecognitionException {
        try {
            int _type = EQUAL1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:7:8: ( '=' )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:7:10: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQUAL1"

    // $ANTLR start "EQUAL2"
    public final void mEQUAL2() throws RecognitionException {
        try {
            int _type = EQUAL2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:8:8: ( '==' )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:8:10: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQUAL2"

    // $ANTLR start "NOT_EQUAL1"
    public final void mNOT_EQUAL1() throws RecognitionException {
        try {
            int _type = NOT_EQUAL1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:9:12: ( '!=' )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:9:14: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT_EQUAL1"

    // $ANTLR start "NOT_EQUAL2"
    public final void mNOT_EQUAL2() throws RecognitionException {
        try {
            int _type = NOT_EQUAL2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:10:12: ( '<>' )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:10:14: '<>'
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT_EQUAL2"

    // $ANTLR start "LESS"
    public final void mLESS() throws RecognitionException {
        try {
            int _type = LESS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:11:6: ( '<' )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:11:8: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LESS"

    // $ANTLR start "LESS_OR_EQ1"
    public final void mLESS_OR_EQ1() throws RecognitionException {
        try {
            int _type = LESS_OR_EQ1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:12:13: ( '<=' )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:12:15: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LESS_OR_EQ1"

    // $ANTLR start "LESS_OR_EQ2"
    public final void mLESS_OR_EQ2() throws RecognitionException {
        try {
            int _type = LESS_OR_EQ2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:13:13: ( '!>' )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:13:15: '!>'
            {
            match("!>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LESS_OR_EQ2"

    // $ANTLR start "GREATER"
    public final void mGREATER() throws RecognitionException {
        try {
            int _type = GREATER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:14:9: ( '>' )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:14:11: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GREATER"

    // $ANTLR start "GREATER_OR_EQ1"
    public final void mGREATER_OR_EQ1() throws RecognitionException {
        try {
            int _type = GREATER_OR_EQ1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:15:16: ( '>=' )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:15:18: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GREATER_OR_EQ1"

    // $ANTLR start "GREATER_OR_EQ2"
    public final void mGREATER_OR_EQ2() throws RecognitionException {
        try {
            int _type = GREATER_OR_EQ2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:16:16: ( '!<' )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:16:18: '!<'
            {
            match("!<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GREATER_OR_EQ2"

    // $ANTLR start "SHIFT_LEFT"
    public final void mSHIFT_LEFT() throws RecognitionException {
        try {
            int _type = SHIFT_LEFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:17:12: ( '<<' )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:17:14: '<<'
            {
            match("<<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SHIFT_LEFT"

    // $ANTLR start "SHIFT_RIGHT"
    public final void mSHIFT_RIGHT() throws RecognitionException {
        try {
            int _type = SHIFT_RIGHT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:18:13: ( '>>' )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:18:15: '>>'
            {
            match(">>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SHIFT_RIGHT"

    // $ANTLR start "AMPERSAND"
    public final void mAMPERSAND() throws RecognitionException {
        try {
            int _type = AMPERSAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:19:11: ( '&' )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:19:13: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AMPERSAND"

    // $ANTLR start "HAT"
    public final void mHAT() throws RecognitionException {
        try {
            int _type = HAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:20:5: ( '^' )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:20:7: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HAT"

    // $ANTLR start "PIPE"
    public final void mPIPE() throws RecognitionException {
        try {
            int _type = PIPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:21:6: ( '|' )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:21:8: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PIPE"

    // $ANTLR start "DOUBLE_PIPE"
    public final void mDOUBLE_PIPE() throws RecognitionException {
        try {
            int _type = DOUBLE_PIPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:22:13: ( '||' )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:22:15: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOUBLE_PIPE"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:23:5: ( '/' )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:23:7: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "STAR"
    public final void mSTAR() throws RecognitionException {
        try {
            int _type = STAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:24:6: ( '*' )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:24:8: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STAR"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:25:6: ( '+' )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:25:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:26:7: ( '-' )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:26:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "TILDE"
    public final void mTILDE() throws RecognitionException {
        try {
            int _type = TILDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:27:7: ( '~' )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:27:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TILDE"

    // $ANTLR start "BACKSLASH"
    public final void mBACKSLASH() throws RecognitionException {
        try {
            int _type = BACKSLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:28:11: ( '\\\\' )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:28:13: '\\\\'
            {
            match('\\'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BACKSLASH"

    // $ANTLR start "MOD"
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:29:5: ( '%' )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:29:7: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MOD"

    // $ANTLR start "SEMI"
    public final void mSEMI() throws RecognitionException {
        try {
            int _type = SEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:30:6: ( ';' )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:30:8: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEMI"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:31:5: ( '.' )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:31:7: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:32:7: ( ',' )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:32:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:33:8: ( '(' )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:33:10: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:34:8: ( ')' )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:34:10: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "QUESTION"
    public final void mQUESTION() throws RecognitionException {
        try {
            int _type = QUESTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:35:10: ( '?' )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:35:12: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUESTION"

    // $ANTLR start "AT"
    public final void mAT() throws RecognitionException {
        try {
            int _type = AT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:36:4: ( '@' )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:36:6: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AT"

    // $ANTLR start "DOLLAR"
    public final void mDOLLAR() throws RecognitionException {
        try {
            int _type = DOLLAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:37:8: ( '$' )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:37:10: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOLLAR"

    // $ANTLR start "QUOTE_DOUBLE"
    public final void mQUOTE_DOUBLE() throws RecognitionException {
        try {
            int _type = QUOTE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:38:14: ( '\"' )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:38:16: '\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUOTE_DOUBLE"

    // $ANTLR start "QUOTE_TRIPLE"
    public final void mQUOTE_TRIPLE() throws RecognitionException {
        try {
            int _type = QUOTE_TRIPLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:39:14: ( '\\'\\'\\'' )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:39:16: '\\'\\'\\''
            {
            match("'''"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUOTE_TRIPLE"

    // $ANTLR start "QUOTE_SINGLE"
    public final void mQUOTE_SINGLE() throws RecognitionException {
        try {
            int _type = QUOTE_SINGLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:40:14: ( '\\'' )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:40:16: '\\''
            {
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUOTE_SINGLE"

    // $ANTLR start "APOSTROPHE"
    public final void mAPOSTROPHE() throws RecognitionException {
        try {
            int _type = APOSTROPHE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:41:12: ( '`' )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:41:14: '`'
            {
            match('`'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "APOSTROPHE"

    // $ANTLR start "LBRACKET"
    public final void mLBRACKET() throws RecognitionException {
        try {
            int _type = LBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:42:10: ( '[' )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:42:12: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LBRACKET"

    // $ANTLR start "RBRACKET"
    public final void mRBRACKET() throws RecognitionException {
        try {
            int _type = RBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:43:10: ( ']' )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:43:12: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RBRACKET"

    // $ANTLR start "UNDERSCORE"
    public final void mUNDERSCORE() throws RecognitionException {
        try {
            int _type = UNDERSCORE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:44:12: ( '_' )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:44:14: '_'
            {
            match('_'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNDERSCORE"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:45:7: ( ':' )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:45:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "SELECT"
    public final void mSELECT() throws RecognitionException {
        try {
            int _type = SELECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:347:7: ( S E L E C T )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:347:9: S E L E C T
            {
            mS(); 
            mE(); 
            mL(); 
            mE(); 
            mC(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SELECT"

    // $ANTLR start "INSERT"
    public final void mINSERT() throws RecognitionException {
        try {
            int _type = INSERT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:348:7: ( I N S E R T )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:348:9: I N S E R T
            {
            mI(); 
            mN(); 
            mS(); 
            mE(); 
            mR(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INSERT"

    // $ANTLR start "CREATE"
    public final void mCREATE() throws RecognitionException {
        try {
            int _type = CREATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:349:7: ( C R E A T E )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:349:9: C R E A T E
            {
            mC(); 
            mR(); 
            mE(); 
            mA(); 
            mT(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CREATE"

    // $ANTLR start "COMMIT"
    public final void mCOMMIT() throws RecognitionException {
        try {
            int _type = COMMIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:350:7: ( C O M M I T )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:350:9: C O M M I T
            {
            mC(); 
            mO(); 
            mM(); 
            mM(); 
            mI(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMIT"

    // $ANTLR start "TABLE"
    public final void mTABLE() throws RecognitionException {
        try {
            int _type = TABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:352:6: ( T A B L E )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:352:8: T A B L E
            {
            mT(); 
            mA(); 
            mB(); 
            mL(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TABLE"

    // $ANTLR start "INDEX"
    public final void mINDEX() throws RecognitionException {
        try {
            int _type = INDEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:353:6: ( I N D E X )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:353:8: I N D E X
            {
            mI(); 
            mN(); 
            mD(); 
            mE(); 
            mX(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INDEX"

    // $ANTLR start "INTO"
    public final void mINTO() throws RecognitionException {
        try {
            int _type = INTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:354:5: ( I N T O )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:354:7: I N T O
            {
            mI(); 
            mN(); 
            mT(); 
            mO(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTO"

    // $ANTLR start "VALUES"
    public final void mVALUES() throws RecognitionException {
        try {
            int _type = VALUES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:355:7: ( V A L U E S )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:355:9: V A L U E S
            {
            mV(); 
            mA(); 
            mL(); 
            mU(); 
            mE(); 
            mS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VALUES"

    // $ANTLR start "FROM"
    public final void mFROM() throws RecognitionException {
        try {
            int _type = FROM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:356:5: ( F R O M )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:356:7: F R O M
            {
            mF(); 
            mR(); 
            mO(); 
            mM(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FROM"

    // $ANTLR start "JOIN"
    public final void mJOIN() throws RecognitionException {
        try {
            int _type = JOIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:357:5: ( J O I N )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:357:7: J O I N
            {
            mJ(); 
            mO(); 
            mI(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "JOIN"

    // $ANTLR start "ON"
    public final void mON() throws RecognitionException {
        try {
            int _type = ON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:358:3: ( O N )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:358:5: O N
            {
            mO(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ON"

    // $ANTLR start "WHERE"
    public final void mWHERE() throws RecognitionException {
        try {
            int _type = WHERE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:359:6: ( W H E R E )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:359:8: W H E R E
            {
            mW(); 
            mH(); 
            mE(); 
            mR(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHERE"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:360:4: ( A N D )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:360:6: A N D
            {
            mA(); 
            mN(); 
            mD(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "PRIMARY"
    public final void mPRIMARY() throws RecognitionException {
        try {
            int _type = PRIMARY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:362:9: ( P R I M A R Y )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:362:11: P R I M A R Y
            {
            mP(); 
            mR(); 
            mI(); 
            mM(); 
            mA(); 
            mR(); 
            mY(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRIMARY"

    // $ANTLR start "KEY"
    public final void mKEY() throws RecognitionException {
        try {
            int _type = KEY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:363:5: ( K E Y )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:363:7: K E Y
            {
            mK(); 
            mE(); 
            mY(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEY"

    // $ANTLR start "UNIQUE"
    public final void mUNIQUE() throws RecognitionException {
        try {
            int _type = UNIQUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:364:8: ( U N I Q U E )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:364:10: U N I Q U E
            {
            mU(); 
            mN(); 
            mI(); 
            mQ(); 
            mU(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNIQUE"

    // $ANTLR start "TYPE_VARCHAR"
    public final void mTYPE_VARCHAR() throws RecognitionException {
        try {
            int _type = TYPE_VARCHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:366:13: ( V A R C H A R )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:366:15: V A R C H A R
            {
            mV(); 
            mA(); 
            mR(); 
            mC(); 
            mH(); 
            mA(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TYPE_VARCHAR"

    // $ANTLR start "TYPE_INT"
    public final void mTYPE_INT() throws RecognitionException {
        try {
            int _type = TYPE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:367:9: ( ( I N T | I N T E G E R ) )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:367:11: ( I N T | I N T E G E R )
            {
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:367:11: ( I N T | I N T E G E R )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='I'||LA1_0=='i') ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='N'||LA1_1=='n') ) {
                    int LA1_2 = input.LA(3);

                    if ( (LA1_2=='T'||LA1_2=='t') ) {
                        int LA1_3 = input.LA(4);

                        if ( (LA1_3=='E'||LA1_3=='e') ) {
                            alt1=2;
                        }
                        else {
                            alt1=1;}
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:367:12: I N T
                    {
                    mI(); 
                    mN(); 
                    mT(); 

                    }
                    break;
                case 2 :
                    // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:367:20: I N T E G E R
                    {
                    mI(); 
                    mN(); 
                    mT(); 
                    mE(); 
                    mG(); 
                    mE(); 
                    mR(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TYPE_INT"

    // $ANTLR start "IGNORE_CHAR"
    public final void mIGNORE_CHAR() throws RecognitionException {
        try {
            int _type = IGNORE_CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:370:12: ( ( WS | CONTROL_CHAR ) )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:370:14: ( WS | CONTROL_CHAR )
            {
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:370:14: ( WS | CONTROL_CHAR )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==' ') ) {
                alt2=1;
            }
            else if ( ((LA2_0>='\t' && LA2_0<='\r')) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:370:15: WS
                    {
                    mWS(); 

                    }
                    break;
                case 2 :
                    // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:370:18: CONTROL_CHAR
                    {
                    mCONTROL_CHAR(); 

                    }
                    break;

            }

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IGNORE_CHAR"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:373:5: ( ( QUOTED_STRING ) )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:374:5: ( QUOTED_STRING )
            {
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:374:5: ( QUOTED_STRING )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:374:6: QUOTED_STRING
            {
            mQUOTED_STRING(); 

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:378:5: ( ( DIGIT )+ )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:379:5: ( DIGIT )+
            {
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:379:5: ( DIGIT )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:379:6: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:383:5: ( ( CHAR ( CHAR | DIGIT | '_' | '$' | '#' )* ) )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:384:5: ( CHAR ( CHAR | DIGIT | '_' | '$' | '#' )* )
            {
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:384:5: ( CHAR ( CHAR | DIGIT | '_' | '$' | '#' )* )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:384:7: CHAR ( CHAR | DIGIT | '_' | '$' | '#' )*
            {
            mCHAR(); 
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:384:12: ( CHAR | DIGIT | '_' | '$' | '#' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='#' && LA4_0<='$')||(LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:
            	    {
            	    if ( (input.LA(1)>='#' && input.LA(1)<='$')||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:388:12: ( ( ' ' ) )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:388:14: ( ' ' )
            {
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:388:14: ( ' ' )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:388:15: ' '
            {
            match(' '); 

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "CONTROL_CHAR"
    public final void mCONTROL_CHAR() throws RecognitionException {
        try {
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:389:22: ( ( '\\r' | '\\t' | '\\u000B' | '\\f' | '\\n' ) )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:389:24: ( '\\r' | '\\t' | '\\u000B' | '\\f' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\r') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "CONTROL_CHAR"

    // $ANTLR start "QUOTED_STRING"
    public final void mQUOTED_STRING() throws RecognitionException {
        try {
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:390:23: ( QUOTE_SINGLE (~ QUOTE_SINGLE )* QUOTE_SINGLE )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:390:25: QUOTE_SINGLE (~ QUOTE_SINGLE )* QUOTE_SINGLE
            {
            mQUOTE_SINGLE(); 
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:390:38: (~ QUOTE_SINGLE )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:390:39: ~ QUOTE_SINGLE
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='$')||(input.LA(1)>='&' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            mQUOTE_SINGLE(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "QUOTED_STRING"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:391:17: ( '0' .. '9' )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:391:19: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:392:15: ( ( 'A' .. 'Z' | 'a' .. 'z' ) )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:392:17: ( 'A' .. 'Z' | 'a' .. 'z' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "CHAR"

    // $ANTLR start "A"
    public final void mA() throws RecognitionException {
        try {
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:394:11: ( ( 'a' | 'A' ) )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:394:12: ( 'a' | 'A' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "A"

    // $ANTLR start "B"
    public final void mB() throws RecognitionException {
        try {
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:395:11: ( ( 'b' | 'B' ) )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:395:12: ( 'b' | 'B' )
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "B"

    // $ANTLR start "C"
    public final void mC() throws RecognitionException {
        try {
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:396:11: ( ( 'c' | 'C' ) )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:396:12: ( 'c' | 'C' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "C"

    // $ANTLR start "D"
    public final void mD() throws RecognitionException {
        try {
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:397:11: ( ( 'd' | 'D' ) )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:397:12: ( 'd' | 'D' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "D"

    // $ANTLR start "E"
    public final void mE() throws RecognitionException {
        try {
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:398:11: ( ( 'e' | 'E' ) )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:398:12: ( 'e' | 'E' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "E"

    // $ANTLR start "F"
    public final void mF() throws RecognitionException {
        try {
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:399:11: ( ( 'f' | 'F' ) )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:399:12: ( 'f' | 'F' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "F"

    // $ANTLR start "G"
    public final void mG() throws RecognitionException {
        try {
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:400:11: ( ( 'g' | 'G' ) )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:400:12: ( 'g' | 'G' )
            {
            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "G"

    // $ANTLR start "H"
    public final void mH() throws RecognitionException {
        try {
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:401:11: ( ( 'h' | 'H' ) )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:401:12: ( 'h' | 'H' )
            {
            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "H"

    // $ANTLR start "I"
    public final void mI() throws RecognitionException {
        try {
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:402:11: ( ( 'i' | 'I' ) )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:402:12: ( 'i' | 'I' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "I"

    // $ANTLR start "J"
    public final void mJ() throws RecognitionException {
        try {
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:403:11: ( ( 'j' | 'J' ) )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:403:12: ( 'j' | 'J' )
            {
            if ( input.LA(1)=='J'||input.LA(1)=='j' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "J"

    // $ANTLR start "K"
    public final void mK() throws RecognitionException {
        try {
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:404:11: ( ( 'k' | 'K' ) )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:404:12: ( 'k' | 'K' )
            {
            if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "K"

    // $ANTLR start "L"
    public final void mL() throws RecognitionException {
        try {
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:405:11: ( ( 'l' | 'L' ) )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:405:12: ( 'l' | 'L' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "L"

    // $ANTLR start "M"
    public final void mM() throws RecognitionException {
        try {
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:406:11: ( ( 'm' | 'M' ) )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:406:12: ( 'm' | 'M' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "M"

    // $ANTLR start "N"
    public final void mN() throws RecognitionException {
        try {
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:407:11: ( ( 'n' | 'N' ) )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:407:12: ( 'n' | 'N' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "N"

    // $ANTLR start "O"
    public final void mO() throws RecognitionException {
        try {
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:408:11: ( ( 'o' | 'O' ) )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:408:12: ( 'o' | 'O' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "O"

    // $ANTLR start "P"
    public final void mP() throws RecognitionException {
        try {
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:409:11: ( ( 'p' | 'P' ) )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:409:12: ( 'p' | 'P' )
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "P"

    // $ANTLR start "Q"
    public final void mQ() throws RecognitionException {
        try {
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:410:11: ( ( 'q' | 'Q' ) )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:410:12: ( 'q' | 'Q' )
            {
            if ( input.LA(1)=='Q'||input.LA(1)=='q' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "Q"

    // $ANTLR start "R"
    public final void mR() throws RecognitionException {
        try {
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:411:11: ( ( 'r' | 'R' ) )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:411:12: ( 'r' | 'R' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "R"

    // $ANTLR start "S"
    public final void mS() throws RecognitionException {
        try {
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:412:11: ( ( 's' | 'S' ) )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:412:12: ( 's' | 'S' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "S"

    // $ANTLR start "T"
    public final void mT() throws RecognitionException {
        try {
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:413:11: ( ( 't' | 'T' ) )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:413:12: ( 't' | 'T' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "T"

    // $ANTLR start "U"
    public final void mU() throws RecognitionException {
        try {
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:414:11: ( ( 'u' | 'U' ) )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:414:12: ( 'u' | 'U' )
            {
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "U"

    // $ANTLR start "V"
    public final void mV() throws RecognitionException {
        try {
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:415:11: ( ( 'v' | 'V' ) )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:415:12: ( 'v' | 'V' )
            {
            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "V"

    // $ANTLR start "W"
    public final void mW() throws RecognitionException {
        try {
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:416:11: ( ( 'w' | 'W' ) )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:416:12: ( 'w' | 'W' )
            {
            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "W"

    // $ANTLR start "X"
    public final void mX() throws RecognitionException {
        try {
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:417:11: ( ( 'x' | 'X' ) )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:417:12: ( 'x' | 'X' )
            {
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "X"

    // $ANTLR start "Y"
    public final void mY() throws RecognitionException {
        try {
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:418:11: ( ( 'y' | 'Y' ) )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:418:12: ( 'y' | 'Y' )
            {
            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "Y"

    // $ANTLR start "Z"
    public final void mZ() throws RecognitionException {
        try {
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:419:11: ( ( 'z' | 'Z' ) )
            // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:419:12: ( 'z' | 'Z' )
            {
            if ( input.LA(1)=='Z'||input.LA(1)=='z' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "Z"

    public void mTokens() throws RecognitionException {
        // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:1:8: ( EQUAL1 | EQUAL2 | NOT_EQUAL1 | NOT_EQUAL2 | LESS | LESS_OR_EQ1 | LESS_OR_EQ2 | GREATER | GREATER_OR_EQ1 | GREATER_OR_EQ2 | SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | HAT | PIPE | DOUBLE_PIPE | DIV | STAR | PLUS | MINUS | TILDE | BACKSLASH | MOD | SEMI | DOT | COMMA | LPAREN | RPAREN | QUESTION | AT | DOLLAR | QUOTE_DOUBLE | QUOTE_TRIPLE | QUOTE_SINGLE | APOSTROPHE | LBRACKET | RBRACKET | UNDERSCORE | COLON | SELECT | INSERT | CREATE | COMMIT | TABLE | INDEX | INTO | VALUES | FROM | JOIN | ON | WHERE | AND | PRIMARY | KEY | UNIQUE | TYPE_VARCHAR | TYPE_INT | IGNORE_CHAR | STRING | INTEGER | ID )
        int alt6=61;
        alt6 = dfa6.predict(input);
        switch (alt6) {
            case 1 :
                // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:1:10: EQUAL1
                {
                mEQUAL1(); 

                }
                break;
            case 2 :
                // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:1:17: EQUAL2
                {
                mEQUAL2(); 

                }
                break;
            case 3 :
                // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:1:24: NOT_EQUAL1
                {
                mNOT_EQUAL1(); 

                }
                break;
            case 4 :
                // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:1:35: NOT_EQUAL2
                {
                mNOT_EQUAL2(); 

                }
                break;
            case 5 :
                // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:1:46: LESS
                {
                mLESS(); 

                }
                break;
            case 6 :
                // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:1:51: LESS_OR_EQ1
                {
                mLESS_OR_EQ1(); 

                }
                break;
            case 7 :
                // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:1:63: LESS_OR_EQ2
                {
                mLESS_OR_EQ2(); 

                }
                break;
            case 8 :
                // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:1:75: GREATER
                {
                mGREATER(); 

                }
                break;
            case 9 :
                // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:1:83: GREATER_OR_EQ1
                {
                mGREATER_OR_EQ1(); 

                }
                break;
            case 10 :
                // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:1:98: GREATER_OR_EQ2
                {
                mGREATER_OR_EQ2(); 

                }
                break;
            case 11 :
                // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:1:113: SHIFT_LEFT
                {
                mSHIFT_LEFT(); 

                }
                break;
            case 12 :
                // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:1:124: SHIFT_RIGHT
                {
                mSHIFT_RIGHT(); 

                }
                break;
            case 13 :
                // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:1:136: AMPERSAND
                {
                mAMPERSAND(); 

                }
                break;
            case 14 :
                // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:1:146: HAT
                {
                mHAT(); 

                }
                break;
            case 15 :
                // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:1:150: PIPE
                {
                mPIPE(); 

                }
                break;
            case 16 :
                // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:1:155: DOUBLE_PIPE
                {
                mDOUBLE_PIPE(); 

                }
                break;
            case 17 :
                // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:1:167: DIV
                {
                mDIV(); 

                }
                break;
            case 18 :
                // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:1:171: STAR
                {
                mSTAR(); 

                }
                break;
            case 19 :
                // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:1:176: PLUS
                {
                mPLUS(); 

                }
                break;
            case 20 :
                // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:1:181: MINUS
                {
                mMINUS(); 

                }
                break;
            case 21 :
                // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:1:187: TILDE
                {
                mTILDE(); 

                }
                break;
            case 22 :
                // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:1:193: BACKSLASH
                {
                mBACKSLASH(); 

                }
                break;
            case 23 :
                // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:1:203: MOD
                {
                mMOD(); 

                }
                break;
            case 24 :
                // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:1:207: SEMI
                {
                mSEMI(); 

                }
                break;
            case 25 :
                // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:1:212: DOT
                {
                mDOT(); 

                }
                break;
            case 26 :
                // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:1:216: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 27 :
                // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:1:222: LPAREN
                {
                mLPAREN(); 

                }
                break;
            case 28 :
                // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:1:229: RPAREN
                {
                mRPAREN(); 

                }
                break;
            case 29 :
                // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:1:236: QUESTION
                {
                mQUESTION(); 

                }
                break;
            case 30 :
                // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:1:245: AT
                {
                mAT(); 

                }
                break;
            case 31 :
                // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:1:248: DOLLAR
                {
                mDOLLAR(); 

                }
                break;
            case 32 :
                // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:1:255: QUOTE_DOUBLE
                {
                mQUOTE_DOUBLE(); 

                }
                break;
            case 33 :
                // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:1:268: QUOTE_TRIPLE
                {
                mQUOTE_TRIPLE(); 

                }
                break;
            case 34 :
                // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:1:281: QUOTE_SINGLE
                {
                mQUOTE_SINGLE(); 

                }
                break;
            case 35 :
                // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:1:294: APOSTROPHE
                {
                mAPOSTROPHE(); 

                }
                break;
            case 36 :
                // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:1:305: LBRACKET
                {
                mLBRACKET(); 

                }
                break;
            case 37 :
                // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:1:314: RBRACKET
                {
                mRBRACKET(); 

                }
                break;
            case 38 :
                // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:1:323: UNDERSCORE
                {
                mUNDERSCORE(); 

                }
                break;
            case 39 :
                // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:1:334: COLON
                {
                mCOLON(); 

                }
                break;
            case 40 :
                // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:1:340: SELECT
                {
                mSELECT(); 

                }
                break;
            case 41 :
                // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:1:347: INSERT
                {
                mINSERT(); 

                }
                break;
            case 42 :
                // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:1:354: CREATE
                {
                mCREATE(); 

                }
                break;
            case 43 :
                // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:1:361: COMMIT
                {
                mCOMMIT(); 

                }
                break;
            case 44 :
                // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:1:368: TABLE
                {
                mTABLE(); 

                }
                break;
            case 45 :
                // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:1:374: INDEX
                {
                mINDEX(); 

                }
                break;
            case 46 :
                // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:1:380: INTO
                {
                mINTO(); 

                }
                break;
            case 47 :
                // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:1:385: VALUES
                {
                mVALUES(); 

                }
                break;
            case 48 :
                // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:1:392: FROM
                {
                mFROM(); 

                }
                break;
            case 49 :
                // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:1:397: JOIN
                {
                mJOIN(); 

                }
                break;
            case 50 :
                // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:1:402: ON
                {
                mON(); 

                }
                break;
            case 51 :
                // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:1:405: WHERE
                {
                mWHERE(); 

                }
                break;
            case 52 :
                // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:1:411: AND
                {
                mAND(); 

                }
                break;
            case 53 :
                // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:1:415: PRIMARY
                {
                mPRIMARY(); 

                }
                break;
            case 54 :
                // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:1:423: KEY
                {
                mKEY(); 

                }
                break;
            case 55 :
                // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:1:427: UNIQUE
                {
                mUNIQUE(); 

                }
                break;
            case 56 :
                // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:1:434: TYPE_VARCHAR
                {
                mTYPE_VARCHAR(); 

                }
                break;
            case 57 :
                // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:1:447: TYPE_INT
                {
                mTYPE_INT(); 

                }
                break;
            case 58 :
                // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:1:456: IGNORE_CHAR
                {
                mIGNORE_CHAR(); 

                }
                break;
            case 59 :
                // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:1:468: STRING
                {
                mSTRING(); 

                }
                break;
            case 60 :
                // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:1:475: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 61 :
                // /Users/cbinnig/Workspace/DHBW_FirstDB_Loesung3/src/de/dhbw/db2/firstdb/sql/FirstSQL.g:1:483: ID
                {
                mID(); 

                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\1\uffff\1\57\1\uffff\1\66\1\71\2\uffff\1\73\20\uffff\1\75\5\uffff"+
        "\15\55\21\uffff\1\76\2\uffff\10\55\1\131\5\55\1\uffff\3\55\1\142"+
        "\7\55\1\uffff\1\55\1\155\1\55\1\157\4\55\1\uffff\1\164\6\55\1\173"+
        "\1\174\1\55\1\uffff\1\55\1\uffff\3\55\1\u0082\1\uffff\3\55\1\u0086"+
        "\2\55\2\uffff\1\u0089\2\55\1\u008c\1\u008d\1\uffff\1\55\1\u008f"+
        "\1\u0090\1\uffff\1\u0091\1\55\1\uffff\1\55\1\u0094\2\uffff\1\142"+
        "\3\uffff\1\u0095\1\u0096\3\uffff";
    static final String DFA6_eofS =
        "\u0097\uffff";
    static final String DFA6_minS =
        "\1\11\1\75\2\74\1\75\2\uffff\1\174\20\uffff\1\0\5\uffff\1\105\1"+
        "\116\1\117\2\101\1\122\1\117\1\116\1\110\1\116\1\122\1\105\1\116"+
        "\21\uffff\1\47\2\uffff\1\114\1\104\1\105\1\115\1\102\1\114\1\117"+
        "\1\111\1\43\1\105\1\104\1\111\1\131\1\111\1\uffff\3\105\1\43\1\101"+
        "\1\115\1\114\1\125\1\103\1\115\1\116\1\uffff\1\122\1\43\1\115\1"+
        "\43\1\121\1\103\1\122\1\130\1\uffff\1\43\1\107\1\124\1\111\2\105"+
        "\1\110\2\43\1\105\1\uffff\1\101\1\uffff\1\125\2\124\1\43\1\uffff"+
        "\2\105\1\124\1\43\1\123\1\101\2\uffff\1\43\1\122\1\105\2\43\1\uffff"+
        "\1\122\2\43\1\uffff\1\43\1\122\1\uffff\1\131\1\43\2\uffff\1\43\3"+
        "\uffff\2\43\3\uffff";
    static final String DFA6_maxS =
        "\1\176\1\75\3\76\2\uffff\1\174\20\uffff\1\uffff\5\uffff\1\145\1"+
        "\156\1\162\2\141\1\162\1\157\1\156\1\150\1\156\1\162\1\145\1\156"+
        "\21\uffff\1\47\2\uffff\1\154\1\164\1\145\1\155\1\142\1\162\1\157"+
        "\1\151\1\172\1\145\1\144\1\151\1\171\1\151\1\uffff\3\145\1\172\1"+
        "\141\1\155\1\154\1\165\1\143\1\155\1\156\1\uffff\1\162\1\172\1\155"+
        "\1\172\1\161\1\143\1\162\1\170\1\uffff\1\172\1\147\1\164\1\151\2"+
        "\145\1\150\2\172\1\145\1\uffff\1\141\1\uffff\1\165\2\164\1\172\1"+
        "\uffff\2\145\1\164\1\172\1\163\1\141\2\uffff\1\172\1\162\1\145\2"+
        "\172\1\uffff\1\162\2\172\1\uffff\1\172\1\162\1\uffff\1\171\1\172"+
        "\2\uffff\1\172\3\uffff\2\172\3\uffff";
    static final String DFA6_acceptS =
        "\5\uffff\1\15\1\16\1\uffff\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1"+
        "\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\uffff\1\43\1\44\1"+
        "\45\1\46\1\47\15\uffff\1\72\1\74\1\75\1\2\1\1\1\3\1\7\1\12\1\4\1"+
        "\6\1\13\1\5\1\11\1\14\1\10\1\20\1\17\1\uffff\1\42\1\73\16\uffff"+
        "\1\41\13\uffff\1\62\10\uffff\1\71\12\uffff\1\64\1\uffff\1\66\4\uffff"+
        "\1\56\6\uffff\1\60\1\61\5\uffff\1\55\3\uffff\1\54\2\uffff\1\63\2"+
        "\uffff\1\50\1\51\1\uffff\1\52\1\53\1\57\2\uffff\1\67\1\70\1\65";
    static final String DFA6_specialS =
        "\30\uffff\1\0\176\uffff}>";
    static final String[] DFA6_transitionS = {
            "\5\53\22\uffff\1\53\1\2\1\27\1\uffff\1\26\1\16\1\5\1\30\1\22"+
            "\1\23\1\11\1\12\1\21\1\13\1\20\1\10\12\54\1\35\1\17\1\3\1\1"+
            "\1\4\1\24\1\25\1\47\1\55\1\40\2\55\1\43\2\55\1\37\1\44\1\51"+
            "\3\55\1\45\1\50\2\55\1\36\1\41\1\52\1\42\1\46\3\55\1\32\1\15"+
            "\1\33\1\6\1\34\1\31\1\47\1\55\1\40\2\55\1\43\2\55\1\37\1\44"+
            "\1\51\3\55\1\45\1\50\2\55\1\36\1\41\1\52\1\42\1\46\3\55\1\uffff"+
            "\1\7\1\uffff\1\14",
            "\1\56",
            "\1\62\1\60\1\61",
            "\1\65\1\64\1\63",
            "\1\67\1\70",
            "",
            "",
            "\1\72",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\47\76\1\74\uffd8\76",
            "",
            "",
            "",
            "",
            "",
            "\1\77\37\uffff\1\77",
            "\1\100\37\uffff\1\100",
            "\1\102\2\uffff\1\101\34\uffff\1\102\2\uffff\1\101",
            "\1\103\37\uffff\1\103",
            "\1\104\37\uffff\1\104",
            "\1\105\37\uffff\1\105",
            "\1\106\37\uffff\1\106",
            "\1\107\37\uffff\1\107",
            "\1\110\37\uffff\1\110",
            "\1\111\37\uffff\1\111",
            "\1\112\37\uffff\1\112",
            "\1\113\37\uffff\1\113",
            "\1\114\37\uffff\1\114",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\115",
            "",
            "",
            "\1\116\37\uffff\1\116",
            "\1\120\16\uffff\1\117\1\121\17\uffff\1\120\16\uffff\1\117\1"+
            "\121",
            "\1\122\37\uffff\1\122",
            "\1\123\37\uffff\1\123",
            "\1\124\37\uffff\1\124",
            "\1\125\5\uffff\1\126\31\uffff\1\125\5\uffff\1\126",
            "\1\127\37\uffff\1\127",
            "\1\130\37\uffff\1\130",
            "\2\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"+
            "\55",
            "\1\132\37\uffff\1\132",
            "\1\133\37\uffff\1\133",
            "\1\134\37\uffff\1\134",
            "\1\135\37\uffff\1\135",
            "\1\136\37\uffff\1\136",
            "",
            "\1\137\37\uffff\1\137",
            "\1\140\37\uffff\1\140",
            "\1\141\37\uffff\1\141",
            "\2\55\13\uffff\12\55\7\uffff\4\55\1\144\11\55\1\143\13\55\4"+
            "\uffff\1\55\1\uffff\4\55\1\144\11\55\1\143\13\55",
            "\1\145\37\uffff\1\145",
            "\1\146\37\uffff\1\146",
            "\1\147\37\uffff\1\147",
            "\1\150\37\uffff\1\150",
            "\1\151\37\uffff\1\151",
            "\1\152\37\uffff\1\152",
            "\1\153\37\uffff\1\153",
            "",
            "\1\154\37\uffff\1\154",
            "\2\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"+
            "\55",
            "\1\156\37\uffff\1\156",
            "\2\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"+
            "\55",
            "\1\160\37\uffff\1\160",
            "\1\161\37\uffff\1\161",
            "\1\162\37\uffff\1\162",
            "\1\163\37\uffff\1\163",
            "",
            "\2\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"+
            "\55",
            "\1\165\37\uffff\1\165",
            "\1\166\37\uffff\1\166",
            "\1\167\37\uffff\1\167",
            "\1\170\37\uffff\1\170",
            "\1\171\37\uffff\1\171",
            "\1\172\37\uffff\1\172",
            "\2\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"+
            "\55",
            "\2\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"+
            "\55",
            "\1\175\37\uffff\1\175",
            "",
            "\1\176\37\uffff\1\176",
            "",
            "\1\177\37\uffff\1\177",
            "\1\u0080\37\uffff\1\u0080",
            "\1\u0081\37\uffff\1\u0081",
            "\2\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"+
            "\55",
            "",
            "\1\u0083\37\uffff\1\u0083",
            "\1\u0084\37\uffff\1\u0084",
            "\1\u0085\37\uffff\1\u0085",
            "\2\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"+
            "\55",
            "\1\u0087\37\uffff\1\u0087",
            "\1\u0088\37\uffff\1\u0088",
            "",
            "",
            "\2\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"+
            "\55",
            "\1\u008a\37\uffff\1\u008a",
            "\1\u008b\37\uffff\1\u008b",
            "\2\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"+
            "\55",
            "\2\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"+
            "\55",
            "",
            "\1\u008e\37\uffff\1\u008e",
            "\2\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"+
            "\55",
            "\2\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"+
            "\55",
            "",
            "\2\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"+
            "\55",
            "\1\u0092\37\uffff\1\u0092",
            "",
            "\1\u0093\37\uffff\1\u0093",
            "\2\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"+
            "\55",
            "",
            "",
            "\2\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"+
            "\55",
            "",
            "",
            "",
            "\2\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"+
            "\55",
            "\2\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"+
            "\55",
            "",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( EQUAL1 | EQUAL2 | NOT_EQUAL1 | NOT_EQUAL2 | LESS | LESS_OR_EQ1 | LESS_OR_EQ2 | GREATER | GREATER_OR_EQ1 | GREATER_OR_EQ2 | SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | HAT | PIPE | DOUBLE_PIPE | DIV | STAR | PLUS | MINUS | TILDE | BACKSLASH | MOD | SEMI | DOT | COMMA | LPAREN | RPAREN | QUESTION | AT | DOLLAR | QUOTE_DOUBLE | QUOTE_TRIPLE | QUOTE_SINGLE | APOSTROPHE | LBRACKET | RBRACKET | UNDERSCORE | COLON | SELECT | INSERT | CREATE | COMMIT | TABLE | INDEX | INTO | VALUES | FROM | JOIN | ON | WHERE | AND | PRIMARY | KEY | UNIQUE | TYPE_VARCHAR | TYPE_INT | IGNORE_CHAR | STRING | INTEGER | ID );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA6_24 = input.LA(1);

                        s = -1;
                        if ( (LA6_24=='\'') ) {s = 60;}

                        else if ( ((LA6_24>='\u0000' && LA6_24<='&')||(LA6_24>='(' && LA6_24<='\uFFFF')) ) {s = 62;}

                        else s = 61;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 6, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}