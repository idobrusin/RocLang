package robotcontrol.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRocLexer extends Lexer {
    public static final int RULE_WITH=7;
    public static final int RULE_DURATION=9;
    public static final int RULE_STRING=12;
    public static final int RULE_AND=5;
    public static final int RULE_SL_COMMENT=14;
    public static final int T__19=19;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int RULE_SPEED_KEY=8;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int RULE_FOR=6;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=11;
    public static final int RULE_WS=15;
    public static final int RULE_PERIOD=4;
    public static final int RULE_ANY_OTHER=16;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=10;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=13;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalRocLexer() {;} 
    public InternalRocLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalRocLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalRoc.g"; }

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRoc.g:11:7: ( 'pronounced' )
            // InternalRoc.g:11:9: 'pronounced'
            {
            match("pronounced"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRoc.g:12:7: ( 'trace of' )
            // InternalRoc.g:12:9: 'trace of'
            {
            match("trace of"); 


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
            // InternalRoc.g:13:7: ( 'slightly' )
            // InternalRoc.g:13:9: 'slightly'
            {
            match("slightly"); 


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
            // InternalRoc.g:14:7: ( 'severe' )
            // InternalRoc.g:14:9: 'severe'
            {
            match("severe"); 


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
            // InternalRoc.g:15:7: ( 'maximum' )
            // InternalRoc.g:15:9: 'maximum'
            {
            match("maximum"); 


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
            // InternalRoc.g:16:7: ( 'milliseconds' )
            // InternalRoc.g:16:9: 'milliseconds'
            {
            match("milliseconds"); 


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
            // InternalRoc.g:17:7: ( 'seconds' )
            // InternalRoc.g:17:9: 'seconds'
            {
            match("seconds"); 


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
            // InternalRoc.g:18:7: ( 'minutes' )
            // InternalRoc.g:18:9: 'minutes'
            {
            match("minutes"); 


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
            // InternalRoc.g:19:7: ( 'neutral face' )
            // InternalRoc.g:19:9: 'neutral face'
            {
            match("neutral face"); 


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
            // InternalRoc.g:20:7: ( 'drop jaw' )
            // InternalRoc.g:20:9: 'drop jaw'
            {
            match("drop jaw"); 


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
            // InternalRoc.g:21:7: ( 'nod head' )
            // InternalRoc.g:21:9: 'nod head'
            {
            match("nod head"); 


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
            // InternalRoc.g:22:7: ( 'tilt head' )
            // InternalRoc.g:22:9: 'tilt head'
            {
            match("tilt head"); 


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
            // InternalRoc.g:23:7: ( 'left' )
            // InternalRoc.g:23:9: 'left'
            {
            match("left"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRoc.g:24:7: ( 'right' )
            // InternalRoc.g:24:9: 'right'
            {
            match("right"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRoc.g:25:7: ( 'turn head' )
            // InternalRoc.g:25:9: 'turn head'
            {
            match("turn head"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRoc.g:26:7: ( 'turn eyes' )
            // InternalRoc.g:26:9: 'turn eyes'
            {
            match("turn eyes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRoc.g:27:7: ( 'up' )
            // InternalRoc.g:27:9: 'up'
            {
            match("up"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRoc.g:28:7: ( 'down' )
            // InternalRoc.g:28:9: 'down'
            {
            match("down"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRoc.g:29:7: ( 'slowest' )
            // InternalRoc.g:29:9: 'slowest'
            {
            match("slowest"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRoc.g:30:7: ( 'slow' )
            // InternalRoc.g:30:9: 'slow'
            {
            match("slow"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRoc.g:31:7: ( 'normal' )
            // InternalRoc.g:31:9: 'normal'
            {
            match("normal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRoc.g:32:7: ( 'fast' )
            // InternalRoc.g:32:9: 'fast'
            {
            match("fast"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRoc.g:33:7: ( 'full' )
            // InternalRoc.g:33:9: 'full'
            {
            match("full"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "RULE_DURATION"
    public final void mRULE_DURATION() throws RecognitionException {
        try {
            int _type = RULE_DURATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRoc.g:1836:15: ( RULE_INT )
            // InternalRoc.g:1836:17: RULE_INT
            {
            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DURATION"

    // $ANTLR start "RULE_FOR"
    public final void mRULE_FOR() throws RecognitionException {
        try {
            int _type = RULE_FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRoc.g:1838:10: ( 'for' )
            // InternalRoc.g:1838:12: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FOR"

    // $ANTLR start "RULE_WITH"
    public final void mRULE_WITH() throws RecognitionException {
        try {
            int _type = RULE_WITH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRoc.g:1840:11: ( 'with' )
            // InternalRoc.g:1840:13: 'with'
            {
            match("with"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WITH"

    // $ANTLR start "RULE_SPEED_KEY"
    public final void mRULE_SPEED_KEY() throws RecognitionException {
        try {
            int _type = RULE_SPEED_KEY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRoc.g:1842:16: ( 'speed' )
            // InternalRoc.g:1842:18: 'speed'
            {
            match("speed"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SPEED_KEY"

    // $ANTLR start "RULE_AND"
    public final void mRULE_AND() throws RecognitionException {
        try {
            int _type = RULE_AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRoc.g:1844:10: ( 'and' )
            // InternalRoc.g:1844:12: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AND"

    // $ANTLR start "RULE_PERIOD"
    public final void mRULE_PERIOD() throws RecognitionException {
        try {
            int _type = RULE_PERIOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRoc.g:1846:13: ( '.' )
            // InternalRoc.g:1846:15: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PERIOD"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRoc.g:1848:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalRoc.g:1848:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalRoc.g:1848:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalRoc.g:1848:11: '^'
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

            // InternalRoc.g:1848:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalRoc.g:
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
            	    break loop2;
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
            // InternalRoc.g:1850:19: ( ( '0' .. '9' )+ )
            // InternalRoc.g:1850:21: ( '0' .. '9' )+
            {
            // InternalRoc.g:1850:21: ( '0' .. '9' )+
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
            	    // InternalRoc.g:1850:22: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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
            // InternalRoc.g:1852:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalRoc.g:1852:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalRoc.g:1852:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalRoc.g:1852:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalRoc.g:1852:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalRoc.g:1852:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRoc.g:1852:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalRoc.g:1852:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalRoc.g:1852:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalRoc.g:1852:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRoc.g:1852:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop5;
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
            // InternalRoc.g:1854:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalRoc.g:1854:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalRoc.g:1854:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRoc.g:1854:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
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
            // InternalRoc.g:1856:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalRoc.g:1856:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalRoc.g:1856:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRoc.g:1856:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop8;
                }
            } while (true);

            // InternalRoc.g:1856:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRoc.g:1856:41: ( '\\r' )? '\\n'
                    {
                    // InternalRoc.g:1856:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalRoc.g:1856:41: '\\r'
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
            // InternalRoc.g:1858:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalRoc.g:1858:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalRoc.g:1858:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRoc.g:
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
            // InternalRoc.g:1860:16: ( . )
            // InternalRoc.g:1860:18: .
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
        // InternalRoc.g:1:8: ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | RULE_DURATION | RULE_FOR | RULE_WITH | RULE_SPEED_KEY | RULE_AND | RULE_PERIOD | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=35;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalRoc.g:1:10: T__17
                {
                mT__17(); 

                }
                break;
            case 2 :
                // InternalRoc.g:1:16: T__18
                {
                mT__18(); 

                }
                break;
            case 3 :
                // InternalRoc.g:1:22: T__19
                {
                mT__19(); 

                }
                break;
            case 4 :
                // InternalRoc.g:1:28: T__20
                {
                mT__20(); 

                }
                break;
            case 5 :
                // InternalRoc.g:1:34: T__21
                {
                mT__21(); 

                }
                break;
            case 6 :
                // InternalRoc.g:1:40: T__22
                {
                mT__22(); 

                }
                break;
            case 7 :
                // InternalRoc.g:1:46: T__23
                {
                mT__23(); 

                }
                break;
            case 8 :
                // InternalRoc.g:1:52: T__24
                {
                mT__24(); 

                }
                break;
            case 9 :
                // InternalRoc.g:1:58: T__25
                {
                mT__25(); 

                }
                break;
            case 10 :
                // InternalRoc.g:1:64: T__26
                {
                mT__26(); 

                }
                break;
            case 11 :
                // InternalRoc.g:1:70: T__27
                {
                mT__27(); 

                }
                break;
            case 12 :
                // InternalRoc.g:1:76: T__28
                {
                mT__28(); 

                }
                break;
            case 13 :
                // InternalRoc.g:1:82: T__29
                {
                mT__29(); 

                }
                break;
            case 14 :
                // InternalRoc.g:1:88: T__30
                {
                mT__30(); 

                }
                break;
            case 15 :
                // InternalRoc.g:1:94: T__31
                {
                mT__31(); 

                }
                break;
            case 16 :
                // InternalRoc.g:1:100: T__32
                {
                mT__32(); 

                }
                break;
            case 17 :
                // InternalRoc.g:1:106: T__33
                {
                mT__33(); 

                }
                break;
            case 18 :
                // InternalRoc.g:1:112: T__34
                {
                mT__34(); 

                }
                break;
            case 19 :
                // InternalRoc.g:1:118: T__35
                {
                mT__35(); 

                }
                break;
            case 20 :
                // InternalRoc.g:1:124: T__36
                {
                mT__36(); 

                }
                break;
            case 21 :
                // InternalRoc.g:1:130: T__37
                {
                mT__37(); 

                }
                break;
            case 22 :
                // InternalRoc.g:1:136: T__38
                {
                mT__38(); 

                }
                break;
            case 23 :
                // InternalRoc.g:1:142: T__39
                {
                mT__39(); 

                }
                break;
            case 24 :
                // InternalRoc.g:1:148: RULE_DURATION
                {
                mRULE_DURATION(); 

                }
                break;
            case 25 :
                // InternalRoc.g:1:162: RULE_FOR
                {
                mRULE_FOR(); 

                }
                break;
            case 26 :
                // InternalRoc.g:1:171: RULE_WITH
                {
                mRULE_WITH(); 

                }
                break;
            case 27 :
                // InternalRoc.g:1:181: RULE_SPEED_KEY
                {
                mRULE_SPEED_KEY(); 

                }
                break;
            case 28 :
                // InternalRoc.g:1:196: RULE_AND
                {
                mRULE_AND(); 

                }
                break;
            case 29 :
                // InternalRoc.g:1:205: RULE_PERIOD
                {
                mRULE_PERIOD(); 

                }
                break;
            case 30 :
                // InternalRoc.g:1:217: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 31 :
                // InternalRoc.g:1:225: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 32 :
                // InternalRoc.g:1:237: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 33 :
                // InternalRoc.g:1:253: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 34 :
                // InternalRoc.g:1:269: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 35 :
                // InternalRoc.g:1:277: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\12\27\1\uffff\2\27\1\uffff\1\25\1\uffff\3\25\2\uffff\1\27\1\uffff\16\27\1\105\3\27\1\uffff\2\27\5\uffff\23\27\1\uffff\2\27\1\140\1\27\1\142\5\27\1\151\7\27\1\uffff\2\27\1\163\1\164\1\27\1\166\1\167\1\uffff\1\170\1\uffff\2\27\2\uffff\2\27\1\uffff\2\27\1\u0081\5\27\3\uffff\1\u0087\3\uffff\1\27\3\uffff\2\27\1\u008b\1\27\1\uffff\4\27\1\u0091\1\uffff\2\27\1\u0094\1\uffff\1\u0095\1\u0096\1\27\1\u0098\1\27\1\uffff\1\27\1\u009b\3\uffff\1\27\2\uffff\1\27\1\uffff\1\27\1\u009f\1\27\1\uffff\1\27\1\u00a2\1\uffff";
    static final String DFA12_eofS =
        "\u00a3\uffff";
    static final String DFA12_minS =
        "\1\0\1\162\1\151\1\145\1\141\1\145\1\157\1\145\1\151\1\160\1\141\1\uffff\1\151\1\156\1\uffff\1\101\1\uffff\2\0\1\52\2\uffff\1\157\1\uffff\1\141\1\154\1\162\1\151\1\143\1\145\1\170\1\154\1\165\1\144\1\157\1\167\1\146\1\147\1\60\1\163\1\154\1\162\1\uffff\1\164\1\144\5\uffff\1\156\1\143\1\164\1\156\1\147\1\167\1\145\1\157\1\145\1\151\1\154\1\165\1\164\1\40\1\155\1\160\1\156\1\164\1\150\1\uffff\1\164\1\154\1\60\1\150\1\60\1\157\1\145\2\40\1\150\1\60\1\162\1\156\1\144\1\155\1\151\1\164\1\162\1\uffff\1\141\1\40\2\60\1\164\2\60\1\uffff\1\60\1\uffff\1\165\1\40\1\uffff\1\145\1\164\1\163\1\uffff\1\145\1\144\1\60\1\165\1\163\1\145\1\141\1\154\3\uffff\1\60\3\uffff\1\156\3\uffff\1\154\1\164\1\60\1\163\1\uffff\1\155\1\145\1\163\1\154\1\60\1\uffff\1\143\1\171\1\60\1\uffff\2\60\1\143\1\60\1\40\1\uffff\1\145\1\60\3\uffff\1\157\2\uffff\1\144\1\uffff\1\156\1\60\1\144\1\uffff\1\163\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\162\1\165\1\160\1\151\1\157\1\162\1\145\1\151\1\160\1\165\1\uffff\1\151\1\156\1\uffff\1\172\1\uffff\2\uffff\1\57\2\uffff\1\157\1\uffff\1\141\1\154\1\162\1\157\1\166\1\145\1\170\1\156\1\165\1\162\1\157\1\167\1\146\1\147\1\172\1\163\1\154\1\162\1\uffff\1\164\1\144\5\uffff\1\156\1\143\1\164\1\156\1\147\1\167\1\145\1\157\1\145\1\151\1\154\1\165\1\164\1\40\1\155\1\160\1\156\1\164\1\150\1\uffff\1\164\1\154\1\172\1\150\1\172\1\157\1\145\2\40\1\150\1\172\1\162\1\156\1\144\1\155\1\151\1\164\1\162\1\uffff\1\141\1\40\2\172\1\164\2\172\1\uffff\1\172\1\uffff\1\165\1\40\1\uffff\1\150\1\164\1\163\1\uffff\1\145\1\144\1\172\1\165\1\163\1\145\1\141\1\154\3\uffff\1\172\3\uffff\1\156\3\uffff\1\154\1\164\1\172\1\163\1\uffff\1\155\1\145\1\163\1\154\1\172\1\uffff\1\143\1\171\1\172\1\uffff\2\172\1\143\1\172\1\40\1\uffff\1\145\1\172\3\uffff\1\157\2\uffff\1\144\1\uffff\1\156\1\172\1\144\1\uffff\1\163\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\13\uffff\1\30\2\uffff\1\35\1\uffff\1\36\3\uffff\1\42\1\43\1\uffff\1\36\22\uffff\1\30\2\uffff\1\35\1\37\1\40\1\41\1\42\23\uffff\1\21\22\uffff\1\13\7\uffff\1\31\1\uffff\1\34\2\uffff\1\14\3\uffff\1\24\10\uffff\1\12\1\22\1\15\1\uffff\1\26\1\27\1\32\1\uffff\1\2\1\17\1\20\4\uffff\1\33\5\uffff\1\16\3\uffff\1\4\5\uffff\1\25\2\uffff\1\23\1\7\1\5\1\uffff\1\10\1\11\1\uffff\1\3\3\uffff\1\1\2\uffff\1\6";
    static final String DFA12_specialS =
        "\1\1\20\uffff\1\0\1\2\u0090\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\25\2\24\2\25\1\24\22\25\1\24\1\25\1\21\4\25\1\22\6\25\1\16\1\23\12\13\7\25\32\20\3\25\1\17\1\20\1\25\1\15\2\20\1\6\1\20\1\12\5\20\1\7\1\4\1\5\1\20\1\1\1\20\1\10\1\3\1\2\1\11\1\20\1\14\3\20\uff85\25",
            "\1\26",
            "\1\31\10\uffff\1\30\2\uffff\1\32",
            "\1\34\6\uffff\1\33\3\uffff\1\35",
            "\1\36\7\uffff\1\37",
            "\1\40\11\uffff\1\41",
            "\1\43\2\uffff\1\42",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47\15\uffff\1\51\5\uffff\1\50",
            "",
            "\1\53",
            "\1\54",
            "",
            "\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\0\56",
            "\0\56",
            "\1\57\4\uffff\1\60",
            "",
            "",
            "\1\62",
            "",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66\5\uffff\1\67",
            "\1\71\22\uffff\1\70",
            "\1\72",
            "\1\73",
            "\1\74\1\uffff\1\75",
            "\1\76",
            "\1\77\15\uffff\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\106",
            "\1\107",
            "\1\110",
            "",
            "\1\111",
            "\1\112",
            "",
            "",
            "",
            "",
            "",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "",
            "\1\136",
            "\1\137",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\141",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\27\1\150\25\27",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "",
            "\1\161",
            "\1\162",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\165",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\1\171",
            "\1\172",
            "",
            "\1\174\2\uffff\1\173",
            "\1\175",
            "\1\176",
            "",
            "\1\177",
            "\1\u0080",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "",
            "",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "",
            "",
            "\1\u0088",
            "",
            "",
            "",
            "\1\u0089",
            "\1\u008a",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u008c",
            "",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\1\u0092",
            "\1\u0093",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u0097",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u0099",
            "",
            "\1\u009a",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "",
            "",
            "\1\u009c",
            "",
            "",
            "\1\u009d",
            "",
            "\1\u009e",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u00a0",
            "",
            "\1\u00a1",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | RULE_DURATION | RULE_FOR | RULE_WITH | RULE_SPEED_KEY | RULE_AND | RULE_PERIOD | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_17 = input.LA(1);

                        s = -1;
                        if ( ((LA12_17>='\u0000' && LA12_17<='\uFFFF')) ) {s = 46;}

                        else s = 21;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='p') ) {s = 1;}

                        else if ( (LA12_0=='t') ) {s = 2;}

                        else if ( (LA12_0=='s') ) {s = 3;}

                        else if ( (LA12_0=='m') ) {s = 4;}

                        else if ( (LA12_0=='n') ) {s = 5;}

                        else if ( (LA12_0=='d') ) {s = 6;}

                        else if ( (LA12_0=='l') ) {s = 7;}

                        else if ( (LA12_0=='r') ) {s = 8;}

                        else if ( (LA12_0=='u') ) {s = 9;}

                        else if ( (LA12_0=='f') ) {s = 10;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 11;}

                        else if ( (LA12_0=='w') ) {s = 12;}

                        else if ( (LA12_0=='a') ) {s = 13;}

                        else if ( (LA12_0=='.') ) {s = 14;}

                        else if ( (LA12_0=='^') ) {s = 15;}

                        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='b' && LA12_0<='c')||LA12_0=='e'||(LA12_0>='g' && LA12_0<='k')||LA12_0=='o'||LA12_0=='q'||LA12_0=='v'||(LA12_0>='x' && LA12_0<='z')) ) {s = 16;}

                        else if ( (LA12_0=='\"') ) {s = 17;}

                        else if ( (LA12_0=='\'') ) {s = 18;}

                        else if ( (LA12_0=='/') ) {s = 19;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 20;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='-')||(LA12_0>=':' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||(LA12_0>='{' && LA12_0<='\uFFFF')) ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_18 = input.LA(1);

                        s = -1;
                        if ( ((LA12_18>='\u0000' && LA12_18<='\uFFFF')) ) {s = 46;}

                        else s = 21;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}