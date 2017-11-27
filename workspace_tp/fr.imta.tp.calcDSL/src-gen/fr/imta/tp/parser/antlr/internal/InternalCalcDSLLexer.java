package fr.imta.tp.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCalcDSLLexer extends Lexer {
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int RULE_DOUBLE=5;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalCalcDSLLexer() {;} 
    public InternalCalcDSLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalCalcDSLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:11:7: ( ';' )
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:11:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:12:7: ( 'int' )
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:12:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:13:7: ( 'float' )
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:13:9: 'float'
            {
            match("float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:14:7: ( 'double' )
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:14:9: 'double'
            {
            match("double"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:15:7: ( '=' )
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:15:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:16:7: ( '+' )
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:16:9: '+'
            {
            match('+'); 

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
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:17:7: ( '-' )
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:17:9: '-'
            {
            match('-'); 

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
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:18:7: ( '/' )
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:18:9: '/'
            {
            match('/'); 

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
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:19:7: ( '*' )
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:19:9: '*'
            {
            match('*'); 

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
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:20:7: ( '%' )
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:20:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "RULE_DOUBLE"
    public final void mRULE_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:506:13: ( ( '-' )? ( '0' .. '9' )+ '.' ( '0' .. '9' )+ ( ( 'e' | 'E' ) ( '-' )? ( '0' .. '9' )+ )? )
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:506:15: ( '-' )? ( '0' .. '9' )+ '.' ( '0' .. '9' )+ ( ( 'e' | 'E' ) ( '-' )? ( '0' .. '9' )+ )?
            {
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:506:15: ( '-' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:506:15: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:506:20: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:506:21: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            match('.'); 
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:506:36: ( '0' .. '9' )+
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
            	    // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:506:37: '0' .. '9'
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

            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:506:48: ( ( 'e' | 'E' ) ( '-' )? ( '0' .. '9' )+ )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='E'||LA6_0=='e') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:506:49: ( 'e' | 'E' ) ( '-' )? ( '0' .. '9' )+
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:506:59: ( '-' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='-') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:506:59: '-'
                            {
                            match('-'); 

                            }
                            break;

                    }

                    // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:506:64: ( '0' .. '9' )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:506:65: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);


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
    // $ANTLR end "RULE_DOUBLE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:508:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:508:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:508:11: ( '^' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='^') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:508:11: '^'
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

            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:508:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='Z')||LA8_0=='_'||(LA8_0>='a' && LA8_0<='z')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:
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
            	    break loop8;
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
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:510:10: ( ( '0' .. '9' )+ )
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:510:12: ( '0' .. '9' )+
            {
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:510:12: ( '0' .. '9' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:510:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
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
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:512:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:512:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:512:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\"') ) {
                alt12=1;
            }
            else if ( (LA12_0=='\'') ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:512:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:512:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='!')||(LA10_0>='#' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:512:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:512:66: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop10;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:512:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:512:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\\') ) {
                            alt11=1;
                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='&')||(LA11_0>='(' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFF')) ) {
                            alt11=2;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:512:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:512:137: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop11;
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
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:514:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:514:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:514:24: ( options {greedy=false; } : . )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='*') ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1=='/') ) {
                        alt13=2;
                    }
                    else if ( ((LA13_1>='\u0000' && LA13_1<='.')||(LA13_1>='0' && LA13_1<='\uFFFF')) ) {
                        alt13=1;
                    }


                }
                else if ( ((LA13_0>='\u0000' && LA13_0<=')')||(LA13_0>='+' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:514:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop13;
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
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:516:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:516:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:516:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\u0000' && LA14_0<='\t')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:516:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop14;
                }
            } while (true);

            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:516:40: ( ( '\\r' )? '\\n' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\n'||LA16_0=='\r') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:516:41: ( '\\r' )? '\\n'
                    {
                    // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:516:41: ( '\\r' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='\r') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:516:41: '\\r'
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
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:518:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:518:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:518:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:
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
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
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
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:520:16: ( . )
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:520:18: .
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
        // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | RULE_DOUBLE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt18=18;
        alt18 = dfa18.predict(input);
        switch (alt18) {
            case 1 :
                // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:1:70: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 12 :
                // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:1:82: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 13 :
                // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:1:90: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 14 :
                // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:1:99: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 15 :
                // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:1:111: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 16 :
                // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:1:127: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 17 :
                // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:1:143: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 18 :
                // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:1:151: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA18_eotS =
        "\2\uffff\3\24\2\uffff\1\31\1\35\2\uffff\1\41\1\21\1\uffff\2\21"+
        "\3\uffff\1\24\1\uffff\2\24\11\uffff\1\41\3\uffff\1\47\2\24\1\uffff"+
        "\2\24\1\54\1\24\1\uffff\1\56\1\uffff";
    static final String DFA18_eofS =
        "\57\uffff";
    static final String DFA18_minS =
        "\1\0\1\uffff\1\156\1\154\1\157\2\uffff\1\60\1\52\2\uffff\1\56\1"+
        "\101\1\uffff\2\0\3\uffff\1\164\1\uffff\1\157\1\165\11\uffff\1\56"+
        "\3\uffff\1\60\1\141\1\142\1\uffff\1\164\1\154\1\60\1\145\1\uffff"+
        "\1\60\1\uffff";
    static final String DFA18_maxS =
        "\1\uffff\1\uffff\1\156\1\154\1\157\2\uffff\1\71\1\57\2\uffff\1"+
        "\71\1\172\1\uffff\2\uffff\3\uffff\1\164\1\uffff\1\157\1\165\11\uffff"+
        "\1\71\3\uffff\1\172\1\141\1\142\1\uffff\1\164\1\154\1\172\1\145"+
        "\1\uffff\1\172\1\uffff";
    static final String DFA18_acceptS =
        "\1\uffff\1\1\3\uffff\1\5\1\6\2\uffff\1\11\1\12\2\uffff\1\14\2\uffff"+
        "\1\21\1\22\1\1\1\uffff\1\14\2\uffff\1\5\1\6\1\7\1\13\1\17\1\20\1"+
        "\10\1\11\1\12\1\uffff\1\15\1\16\1\21\3\uffff\1\2\4\uffff\1\3\1\uffff"+
        "\1\4";
    static final String DFA18_specialS =
        "\1\0\15\uffff\1\2\1\1\37\uffff}>";
    static final String[] DFA18_transitionS = {
            "\11\21\2\20\2\21\1\20\22\21\1\20\1\21\1\16\2\21\1\12\1\21\1"+
            "\17\2\21\1\11\1\6\1\21\1\7\1\21\1\10\12\13\1\21\1\1\1\21\1\5"+
            "\3\21\32\15\3\21\1\14\1\15\1\21\3\15\1\4\1\15\1\3\2\15\1\2\21"+
            "\15\uff85\21",
            "",
            "\1\23",
            "\1\25",
            "\1\26",
            "",
            "",
            "\12\32",
            "\1\33\4\uffff\1\34",
            "",
            "",
            "\1\32\1\uffff\12\40",
            "\32\24\4\uffff\1\24\1\uffff\32\24",
            "",
            "\0\42",
            "\0\42",
            "",
            "",
            "",
            "\1\44",
            "",
            "\1\45",
            "\1\46",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\32\1\uffff\12\40",
            "",
            "",
            "",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\50",
            "\1\51",
            "",
            "\1\52",
            "\1\53",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\55",
            "",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | RULE_DOUBLE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_0 = input.LA(1);

                        s = -1;
                        if ( (LA18_0==';') ) {s = 1;}

                        else if ( (LA18_0=='i') ) {s = 2;}

                        else if ( (LA18_0=='f') ) {s = 3;}

                        else if ( (LA18_0=='d') ) {s = 4;}

                        else if ( (LA18_0=='=') ) {s = 5;}

                        else if ( (LA18_0=='+') ) {s = 6;}

                        else if ( (LA18_0=='-') ) {s = 7;}

                        else if ( (LA18_0=='/') ) {s = 8;}

                        else if ( (LA18_0=='*') ) {s = 9;}

                        else if ( (LA18_0=='%') ) {s = 10;}

                        else if ( ((LA18_0>='0' && LA18_0<='9')) ) {s = 11;}

                        else if ( (LA18_0=='^') ) {s = 12;}

                        else if ( ((LA18_0>='A' && LA18_0<='Z')||LA18_0=='_'||(LA18_0>='a' && LA18_0<='c')||LA18_0=='e'||(LA18_0>='g' && LA18_0<='h')||(LA18_0>='j' && LA18_0<='z')) ) {s = 13;}

                        else if ( (LA18_0=='\"') ) {s = 14;}

                        else if ( (LA18_0=='\'') ) {s = 15;}

                        else if ( ((LA18_0>='\t' && LA18_0<='\n')||LA18_0=='\r'||LA18_0==' ') ) {s = 16;}

                        else if ( ((LA18_0>='\u0000' && LA18_0<='\b')||(LA18_0>='\u000B' && LA18_0<='\f')||(LA18_0>='\u000E' && LA18_0<='\u001F')||LA18_0=='!'||(LA18_0>='#' && LA18_0<='$')||LA18_0=='&'||(LA18_0>='(' && LA18_0<=')')||LA18_0==','||LA18_0=='.'||LA18_0==':'||LA18_0=='<'||(LA18_0>='>' && LA18_0<='@')||(LA18_0>='[' && LA18_0<=']')||LA18_0=='`'||(LA18_0>='{' && LA18_0<='\uFFFF')) ) {s = 17;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_15 = input.LA(1);

                        s = -1;
                        if ( ((LA18_15>='\u0000' && LA18_15<='\uFFFF')) ) {s = 34;}

                        else s = 17;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA18_14 = input.LA(1);

                        s = -1;
                        if ( ((LA18_14>='\u0000' && LA18_14<='\uFFFF')) ) {s = 34;}

                        else s = 17;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}