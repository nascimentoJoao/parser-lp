package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslLexer extends Lexer {
    public static final int RULE_STRING=7;
    public static final int RULE_MATH=11;
    public static final int RULE_NEGATIVE=10;
    public static final int RULE_SL_COMMENT=15;
    public static final int T__19=19;
    public static final int RULE_DOUBLE=6;
    public static final int RULE_OPER=12;
    public static final int T__18=18;
    public static final int EOF=-1;
    public static final int RULE_ID=8;
    public static final int RULE_WS=16;
    public static final int RULE_DIGIT=5;
    public static final int RULE_ANY_OTHER=17;
    public static final int RULE_BOOL=4;
    public static final int RULE_LETTER=9;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=13;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=14;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalMyDslLexer() {;} 
    public InternalMyDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMyDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:11:7: ( '<' )
            // InternalMyDsl.g:11:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:12:7: ( '>' )
            // InternalMyDsl.g:12:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:13:7: ( '=' )
            // InternalMyDsl.g:13:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:14:7: ( '>=' )
            // InternalMyDsl.g:14:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:15:7: ( '<=' )
            // InternalMyDsl.g:15:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:16:7: ( '(' )
            // InternalMyDsl.g:16:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:17:7: ( 'define' )
            // InternalMyDsl.g:17:9: 'define'
            {
            match("define"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:18:7: ( ')' )
            // InternalMyDsl.g:18:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:19:7: ( 'set!' )
            // InternalMyDsl.g:19:9: 'set!'
            {
            match("set!"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:20:7: ( 'if' )
            // InternalMyDsl.g:20:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:21:7: ( 'list' )
            // InternalMyDsl.g:21:9: 'list'
            {
            match("list"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:22:7: ( 'length' )
            // InternalMyDsl.g:22:9: 'length'
            {
            match("length"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "RULE_MATH"
    public final void mRULE_MATH() throws RecognitionException {
        try {
            int _type = RULE_MATH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:2756:11: ( ( 'cos' | 'abs' | 'square' ) )
            // InternalMyDsl.g:2756:13: ( 'cos' | 'abs' | 'square' )
            {
            // InternalMyDsl.g:2756:13: ( 'cos' | 'abs' | 'square' )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 'c':
                {
                alt1=1;
                }
                break;
            case 'a':
                {
                alt1=2;
                }
                break;
            case 's':
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:2756:14: 'cos'
                    {
                    match("cos"); 


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2756:20: 'abs'
                    {
                    match("abs"); 


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:2756:26: 'square'
                    {
                    match("square"); 


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
    // $ANTLR end "RULE_MATH"

    // $ANTLR start "RULE_LETTER"
    public final void mRULE_LETTER() throws RecognitionException {
        try {
            int _type = RULE_LETTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:2758:13: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // InternalMyDsl.g:2758:15: ( 'a' .. 'z' | 'A' .. 'Z' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LETTER"

    // $ANTLR start "RULE_OPER"
    public final void mRULE_OPER() throws RecognitionException {
        try {
            int _type = RULE_OPER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:2760:11: ( ( '+' | '-' | '*' | '/' | 'expt' | 'quotient' | 'remainder' ) )
            // InternalMyDsl.g:2760:13: ( '+' | '-' | '*' | '/' | 'expt' | 'quotient' | 'remainder' )
            {
            // InternalMyDsl.g:2760:13: ( '+' | '-' | '*' | '/' | 'expt' | 'quotient' | 'remainder' )
            int alt2=7;
            switch ( input.LA(1) ) {
            case '+':
                {
                alt2=1;
                }
                break;
            case '-':
                {
                alt2=2;
                }
                break;
            case '*':
                {
                alt2=3;
                }
                break;
            case '/':
                {
                alt2=4;
                }
                break;
            case 'e':
                {
                alt2=5;
                }
                break;
            case 'q':
                {
                alt2=6;
                }
                break;
            case 'r':
                {
                alt2=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:2760:14: '+'
                    {
                    match('+'); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2760:18: '-'
                    {
                    match('-'); 

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:2760:22: '*'
                    {
                    match('*'); 

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:2760:26: '/'
                    {
                    match('/'); 

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:2760:30: 'expt'
                    {
                    match("expt"); 


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:2760:37: 'quotient'
                    {
                    match("quotient"); 


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:2760:48: 'remainder'
                    {
                    match("remainder"); 


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
    // $ANTLR end "RULE_OPER"

    // $ANTLR start "RULE_BOOL"
    public final void mRULE_BOOL() throws RecognitionException {
        try {
            int _type = RULE_BOOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:2762:11: ( ( '#t' | '#f' ) )
            // InternalMyDsl.g:2762:13: ( '#t' | '#f' )
            {
            // InternalMyDsl.g:2762:13: ( '#t' | '#f' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='#') ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1=='t') ) {
                    alt3=1;
                }
                else if ( (LA3_1=='f') ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:2762:14: '#t'
                    {
                    match("#t"); 


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2762:19: '#f'
                    {
                    match("#f"); 


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
    // $ANTLR end "RULE_BOOL"

    // $ANTLR start "RULE_NEGATIVE"
    public final void mRULE_NEGATIVE() throws RecognitionException {
        try {
            int _type = RULE_NEGATIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:2764:15: ( '-' RULE_DIGIT )
            // InternalMyDsl.g:2764:17: '-' RULE_DIGIT
            {
            match('-'); 
            mRULE_DIGIT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NEGATIVE"

    // $ANTLR start "RULE_DOUBLE"
    public final void mRULE_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:2766:13: ( RULE_DIGIT '.' RULE_DIGIT )
            // InternalMyDsl.g:2766:15: RULE_DIGIT '.' RULE_DIGIT
            {
            mRULE_DIGIT(); 
            match('.'); 
            mRULE_DIGIT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            int _type = RULE_DIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:2768:12: ( ( '0' .. '9' )* )
            // InternalMyDsl.g:2768:14: ( '0' .. '9' )*
            {
            // InternalMyDsl.g:2768:14: ( '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:2768:15: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:2770:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMyDsl.g:2770:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMyDsl.g:2770:11: ( '^' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='^') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:2770:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMyDsl.g:2770:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:2772:10: ( ( '0' .. '9' )+ )
            // InternalMyDsl.g:2772:12: ( '0' .. '9' )+
            {
            // InternalMyDsl.g:2772:12: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:2772:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:2774:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMyDsl.g:2774:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMyDsl.g:2774:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\"') ) {
                alt10=1;
            }
            else if ( (LA10_0=='\'') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:2774:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMyDsl.g:2774:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalMyDsl.g:2774:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:2774:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2774:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMyDsl.g:2774:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='&')||(LA9_0>='(' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalMyDsl.g:2774:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:2774:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    match('\''); 

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
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:2776:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMyDsl.g:2776:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMyDsl.g:2776:24: ( options {greedy=false; } : . )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='*') ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1=='/') ) {
                        alt11=2;
                    }
                    else if ( ((LA11_1>='\u0000' && LA11_1<='.')||(LA11_1>='0' && LA11_1<='\uFFFF')) ) {
                        alt11=1;
                    }


                }
                else if ( ((LA11_0>='\u0000' && LA11_0<=')')||(LA11_0>='+' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:2776:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:2778:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMyDsl.g:2778:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMyDsl.g:2778:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:2778:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // InternalMyDsl.g:2778:40: ( ( '\\r' )? '\\n' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\n'||LA14_0=='\r') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:2778:41: ( '\\r' )? '\\n'
                    {
                    // InternalMyDsl.g:2778:41: ( '\\r' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\r') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalMyDsl.g:2778:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

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
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:2780:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMyDsl.g:2780:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMyDsl.g:2780:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:2782:16: ( . )
            // InternalMyDsl.g:2782:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalMyDsl.g:1:8: ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | RULE_MATH | RULE_LETTER | RULE_OPER | RULE_BOOL | RULE_NEGATIVE | RULE_DOUBLE | RULE_DIGIT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt16=26;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // InternalMyDsl.g:1:10: T__18
                {
                mT__18(); 

                }
                break;
            case 2 :
                // InternalMyDsl.g:1:16: T__19
                {
                mT__19(); 

                }
                break;
            case 3 :
                // InternalMyDsl.g:1:22: T__20
                {
                mT__20(); 

                }
                break;
            case 4 :
                // InternalMyDsl.g:1:28: T__21
                {
                mT__21(); 

                }
                break;
            case 5 :
                // InternalMyDsl.g:1:34: T__22
                {
                mT__22(); 

                }
                break;
            case 6 :
                // InternalMyDsl.g:1:40: T__23
                {
                mT__23(); 

                }
                break;
            case 7 :
                // InternalMyDsl.g:1:46: T__24
                {
                mT__24(); 

                }
                break;
            case 8 :
                // InternalMyDsl.g:1:52: T__25
                {
                mT__25(); 

                }
                break;
            case 9 :
                // InternalMyDsl.g:1:58: T__26
                {
                mT__26(); 

                }
                break;
            case 10 :
                // InternalMyDsl.g:1:64: T__27
                {
                mT__27(); 

                }
                break;
            case 11 :
                // InternalMyDsl.g:1:70: T__28
                {
                mT__28(); 

                }
                break;
            case 12 :
                // InternalMyDsl.g:1:76: T__29
                {
                mT__29(); 

                }
                break;
            case 13 :
                // InternalMyDsl.g:1:82: RULE_MATH
                {
                mRULE_MATH(); 

                }
                break;
            case 14 :
                // InternalMyDsl.g:1:92: RULE_LETTER
                {
                mRULE_LETTER(); 

                }
                break;
            case 15 :
                // InternalMyDsl.g:1:104: RULE_OPER
                {
                mRULE_OPER(); 

                }
                break;
            case 16 :
                // InternalMyDsl.g:1:114: RULE_BOOL
                {
                mRULE_BOOL(); 

                }
                break;
            case 17 :
                // InternalMyDsl.g:1:124: RULE_NEGATIVE
                {
                mRULE_NEGATIVE(); 

                }
                break;
            case 18 :
                // InternalMyDsl.g:1:138: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 19 :
                // InternalMyDsl.g:1:150: RULE_DIGIT
                {
                mRULE_DIGIT(); 

                }
                break;
            case 20 :
                // InternalMyDsl.g:1:161: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 21 :
                // InternalMyDsl.g:1:169: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 22 :
                // InternalMyDsl.g:1:178: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 23 :
                // InternalMyDsl.g:1:190: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 24 :
                // InternalMyDsl.g:1:206: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 25 :
                // InternalMyDsl.g:1:222: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 26 :
                // InternalMyDsl.g:1:230: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\1\26\1\37\1\41\2\uffff\1\45\1\uffff\6\45\1\uffff\1\60\1\uffff\1\60\3\45\1\35\1\26\2\uffff\1\35\1\uffff\2\35\10\uffff\1\46\3\uffff\2\46\1\76\5\46\4\uffff\2\46\1\uffff\1\26\3\uffff\3\46\1\uffff\2\46\2\113\4\46\1\uffff\1\46\1\121\1\46\1\uffff\1\60\4\46\1\uffff\3\46\1\132\1\113\1\133\2\46\2\uffff\2\46\1\60\1\46\1\60";
    static final String DFA16_eofS =
        "\141\uffff";
    static final String DFA16_minS =
        "\1\0\2\75\2\uffff\1\60\1\uffff\6\60\1\uffff\1\60\1\uffff\1\52\3\60\1\146\1\56\2\uffff\1\101\1\uffff\2\0\10\uffff\1\146\3\uffff\1\164\1\165\1\60\1\163\1\156\2\163\1\160\4\uffff\1\157\1\155\1\uffff\1\56\3\uffff\1\151\1\41\1\141\1\uffff\1\164\1\147\2\60\2\164\1\141\1\156\1\uffff\1\162\1\60\1\164\1\uffff\1\60\2\151\2\145\1\uffff\1\150\1\145\1\156\3\60\1\156\1\144\2\uffff\1\164\1\145\1\60\1\162\1\60";
    static final String DFA16_maxS =
        "\1\uffff\2\75\2\uffff\1\172\1\uffff\6\172\1\uffff\1\71\1\uffff\1\57\3\172\1\164\1\71\2\uffff\1\172\1\uffff\2\uffff\10\uffff\1\146\3\uffff\1\164\1\165\1\172\1\163\1\156\2\163\1\160\4\uffff\1\157\1\155\1\uffff\1\71\3\uffff\1\151\1\41\1\141\1\uffff\1\164\1\147\2\172\2\164\1\141\1\156\1\uffff\1\162\1\172\1\164\1\uffff\1\172\2\151\2\145\1\uffff\1\150\1\145\1\156\3\172\1\156\1\144\2\uffff\1\164\1\145\1\172\1\162\1\172";
    static final String DFA16_acceptS =
        "\3\uffff\1\3\1\6\1\uffff\1\10\6\uffff\1\17\1\uffff\1\17\6\uffff\1\23\1\22\1\uffff\1\24\2\uffff\1\31\1\32\1\5\1\1\1\4\1\2\1\3\1\6\1\uffff\1\16\1\24\1\10\10\uffff\1\17\1\21\1\27\1\30\2\uffff\1\20\1\uffff\1\22\1\26\1\31\3\uffff\1\12\10\uffff\1\11\3\uffff\1\15\5\uffff\1\13\10\uffff\1\7\1\14\5\uffff";
    static final String DFA16_specialS =
        "\1\2\31\uffff\1\1\1\0\105\uffff}>";
    static final String[] DFA16_transitionS = {
            "\11\35\2\34\2\35\1\34\22\35\1\34\1\35\1\32\1\24\3\35\1\33\1\4\1\6\1\17\1\15\1\35\1\16\1\27\1\20\12\25\2\35\1\1\1\3\1\2\2\35\32\23\3\35\1\30\1\31\1\35\1\13\1\23\1\12\1\5\1\14\3\23\1\10\2\23\1\11\4\23\1\21\1\22\1\7\7\23\uff85\35",
            "\1\36",
            "\1\40",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\4\46\1\44\25\46",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\4\46\1\50\13\46\1\51\11\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\5\46\1\52\24\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\4\46\1\54\3\46\1\53\21\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\16\46\1\55\13\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\1\46\1\56\30\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\27\46\1\57\2\46",
            "",
            "\12\61",
            "",
            "\1\62\4\uffff\1\63",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\24\46\1\64\5\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\4\46\1\65\25\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\66\15\uffff\1\66",
            "\1\70\1\uffff\12\67",
            "",
            "",
            "\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\0\71",
            "\0\71",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\73",
            "",
            "",
            "",
            "\1\74",
            "\1\75",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "",
            "",
            "",
            "",
            "\1\104",
            "\1\105",
            "",
            "\1\70\1\uffff\12\67",
            "",
            "",
            "",
            "\1\106",
            "\1\107",
            "\1\110",
            "",
            "\1\111",
            "\1\112",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "",
            "\1\120",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\122",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "",
            "\1\127",
            "\1\130",
            "\1\131",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\134",
            "\1\135",
            "",
            "",
            "\1\136",
            "\1\137",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\140",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46"
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | RULE_MATH | RULE_LETTER | RULE_OPER | RULE_BOOL | RULE_NEGATIVE | RULE_DOUBLE | RULE_DIGIT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_27 = input.LA(1);

                        s = -1;
                        if ( ((LA16_27>='\u0000' && LA16_27<='\uFFFF')) ) {s = 57;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_26 = input.LA(1);

                        s = -1;
                        if ( ((LA16_26>='\u0000' && LA16_26<='\uFFFF')) ) {s = 57;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_0 = input.LA(1);

                        s = -1;
                        if ( (LA16_0=='<') ) {s = 1;}

                        else if ( (LA16_0=='>') ) {s = 2;}

                        else if ( (LA16_0=='=') ) {s = 3;}

                        else if ( (LA16_0=='(') ) {s = 4;}

                        else if ( (LA16_0=='d') ) {s = 5;}

                        else if ( (LA16_0==')') ) {s = 6;}

                        else if ( (LA16_0=='s') ) {s = 7;}

                        else if ( (LA16_0=='i') ) {s = 8;}

                        else if ( (LA16_0=='l') ) {s = 9;}

                        else if ( (LA16_0=='c') ) {s = 10;}

                        else if ( (LA16_0=='a') ) {s = 11;}

                        else if ( (LA16_0=='e') ) {s = 12;}

                        else if ( (LA16_0=='+') ) {s = 13;}

                        else if ( (LA16_0=='-') ) {s = 14;}

                        else if ( (LA16_0=='*') ) {s = 15;}

                        else if ( (LA16_0=='/') ) {s = 16;}

                        else if ( (LA16_0=='q') ) {s = 17;}

                        else if ( (LA16_0=='r') ) {s = 18;}

                        else if ( ((LA16_0>='A' && LA16_0<='Z')||LA16_0=='b'||(LA16_0>='f' && LA16_0<='h')||(LA16_0>='j' && LA16_0<='k')||(LA16_0>='m' && LA16_0<='p')||(LA16_0>='t' && LA16_0<='z')) ) {s = 19;}

                        else if ( (LA16_0=='#') ) {s = 20;}

                        else if ( ((LA16_0>='0' && LA16_0<='9')) ) {s = 21;}

                        else if ( (LA16_0=='.') ) {s = 23;}

                        else if ( (LA16_0=='^') ) {s = 24;}

                        else if ( (LA16_0=='_') ) {s = 25;}

                        else if ( (LA16_0=='\"') ) {s = 26;}

                        else if ( (LA16_0=='\'') ) {s = 27;}

                        else if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {s = 28;}

                        else if ( ((LA16_0>='\u0000' && LA16_0<='\b')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\u001F')||LA16_0=='!'||(LA16_0>='$' && LA16_0<='&')||LA16_0==','||(LA16_0>=':' && LA16_0<=';')||(LA16_0>='?' && LA16_0<='@')||(LA16_0>='[' && LA16_0<=']')||LA16_0=='`'||(LA16_0>='{' && LA16_0<='\uFFFF')) ) {s = 29;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}