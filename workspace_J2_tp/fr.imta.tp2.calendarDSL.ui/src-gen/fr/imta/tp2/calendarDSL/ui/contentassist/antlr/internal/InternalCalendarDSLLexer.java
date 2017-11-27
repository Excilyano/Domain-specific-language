package fr.imta.tp2.calendarDSL.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCalendarDSLLexer extends Lexer {
    public static final int RULE_ID=9;
    public static final int T__24=24;
    public static final int RULE_DAY=8;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=14;
    public static final int T__21=21;
    public static final int RULE_MONTH=7;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=12;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__19=19;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_TIME=5;
    public static final int RULE_INT=10;
    public static final int RULE_WS=13;
    public static final int RULE_YEAR=6;

    // delegates
    // delegators

    public InternalCalendarDSLLexer() {;} 
    public InternalCalendarDSLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalCalendarDSLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g"; }

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:11:7: ( 'calendar' )
            // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:11:9: 'calendar'
            {
            match("calendar"); 


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
            // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:12:7: ( '{' )
            // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:12:9: '{'
            {
            match('{'); 

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
            // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:13:7: ( '}' )
            // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:13:9: '}'
            {
            match('}'); 

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
            // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:14:7: ( 'event' )
            // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:14:9: 'event'
            {
            match("event"); 


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
            // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:15:7: ( 'on' )
            // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:15:9: 'on'
            {
            match("on"); 


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
            // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:16:7: ( 'from' )
            // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:16:9: 'from'
            {
            match("from"); 


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
            // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:17:7: ( 'to' )
            // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:17:9: 'to'
            {
            match("to"); 


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
            // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:18:7: ( 'at' )
            // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:18:9: 'at'
            {
            match("at"); 


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
            // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:19:7: ( '/' )
            // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:19:9: '/'
            {
            match('/'); 

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
            // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:20:7: ( '' )
            // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:20:9: ''
            {
            match(' '); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "RULE_YEAR"
    public final void mRULE_YEAR() throws RecognitionException {
        try {
            int _type = RULE_YEAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:1176:11: ( '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' )
            // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:1176:13: '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9'
            {
            matchRange('0','9'); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            matchRange('0','9'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_YEAR"

    // $ANTLR start "RULE_MONTH"
    public final void mRULE_MONTH() throws RecognitionException {
        try {
            int _type = RULE_MONTH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:1178:12: ( ( '0' .. '1' )? '0' .. '9' )
            // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:1178:14: ( '0' .. '1' )? '0' .. '9'
            {
            // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:1178:14: ( '0' .. '1' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>='0' && LA1_0<='1')) ) {
                int LA1_1 = input.LA(2);

                if ( ((LA1_1>='0' && LA1_1<='9')) ) {
                    alt1=1;
                }
            }
            switch (alt1) {
                case 1 :
                    // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:1178:15: '0' .. '1'
                    {
                    matchRange('0','1'); 

                    }
                    break;

            }

            matchRange('0','9'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MONTH"

    // $ANTLR start "RULE_DAY"
    public final void mRULE_DAY() throws RecognitionException {
        try {
            int _type = RULE_DAY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:1180:10: ( '/' ( '0' .. '3' )? '0' .. '9' )
            // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:1180:12: '/' ( '0' .. '3' )? '0' .. '9'
            {
            match('/'); 
            // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:1180:16: ( '0' .. '3' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>='0' && LA2_0<='3')) ) {
                int LA2_1 = input.LA(2);

                if ( ((LA2_1>='0' && LA2_1<='9')) ) {
                    alt2=1;
                }
            }
            switch (alt2) {
                case 1 :
                    // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:1180:17: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }
                    break;

            }

            matchRange('0','9'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DAY"

    // $ANTLR start "RULE_TIME"
    public final void mRULE_TIME() throws RecognitionException {
        try {
            int _type = RULE_TIME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:1182:11: ( '0' .. '9' '0' .. '9' ':' '0' .. '9' '0' .. '9' )
            // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:1182:13: '0' .. '9' '0' .. '9' ':' '0' .. '9' '0' .. '9'
            {
            matchRange('0','9'); 
            matchRange('0','9'); 
            match(':'); 
            matchRange('0','9'); 
            matchRange('0','9'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TIME"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:1184:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:1184:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:1184:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:1184:11: '^'
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

            // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:1184:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:
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
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:1186:10: ( ( '0' .. '9' )+ )
            // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:1186:12: ( '0' .. '9' )+
            {
            // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:1186:12: ( '0' .. '9' )+
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
            	    // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:1186:13: '0' .. '9'
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
            // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:1188:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:1188:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:1188:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:1188:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:1188:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:1188:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:1188:66: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:1188:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:1188:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:1188:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:1188:137: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop7;
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
            // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:1190:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:1190:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:1190:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:1190:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
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
            // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:1192:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:1192:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:1192:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:1192:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop10;
                }
            } while (true);

            // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:1192:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:1192:41: ( '\\r' )? '\\n'
                    {
                    // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:1192:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:1192:41: '\\r'
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
            // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:1194:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:1194:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:1194:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:
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
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
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
            // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:1196:16: ( . )
            // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:1196:18: .
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
        // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | RULE_YEAR | RULE_MONTH | RULE_DAY | RULE_TIME | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=21;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:1:10: T__15
                {
                mT__15(); 

                }
                break;
            case 2 :
                // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:1:16: T__16
                {
                mT__16(); 

                }
                break;
            case 3 :
                // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:1:22: T__17
                {
                mT__17(); 

                }
                break;
            case 4 :
                // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:1:28: T__18
                {
                mT__18(); 

                }
                break;
            case 5 :
                // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:1:34: T__19
                {
                mT__19(); 

                }
                break;
            case 6 :
                // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:1:40: T__20
                {
                mT__20(); 

                }
                break;
            case 7 :
                // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:1:46: T__21
                {
                mT__21(); 

                }
                break;
            case 8 :
                // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:1:52: T__22
                {
                mT__22(); 

                }
                break;
            case 9 :
                // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:1:58: T__23
                {
                mT__23(); 

                }
                break;
            case 10 :
                // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:1:64: T__24
                {
                mT__24(); 

                }
                break;
            case 11 :
                // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:1:70: RULE_YEAR
                {
                mRULE_YEAR(); 

                }
                break;
            case 12 :
                // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:1:80: RULE_MONTH
                {
                mRULE_MONTH(); 

                }
                break;
            case 13 :
                // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:1:91: RULE_DAY
                {
                mRULE_DAY(); 

                }
                break;
            case 14 :
                // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:1:100: RULE_TIME
                {
                mRULE_TIME(); 

                }
                break;
            case 15 :
                // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:1:110: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 16 :
                // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:1:118: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 17 :
                // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:1:127: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 18 :
                // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:1:139: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 19 :
                // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:1:155: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 20 :
                // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:1:171: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 21 :
                // ../fr.imta.tp2.calendarDSL.ui/src-gen/fr/imta/tp2/calendarDSL/ui/contentassist/antlr/internal/InternalCalendarDSL.g:1:179: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\1\24\2\uffff\5\24\1\36\1\uffff\2\41\1\22\1\uffff\2\22"+
        "\2\uffff\1\24\3\uffff\1\24\1\47\1\24\1\51\1\52\4\uffff\1\41\1\uffff"+
        "\1\55\2\uffff\2\24\1\uffff\1\24\2\uffff\1\55\2\uffff\2\24\1\64\1"+
        "\65\1\24\1\67\2\uffff\1\24\1\uffff\1\24\1\72\1\uffff";
    static final String DFA14_eofS =
        "\1\12\72\uffff";
    static final String DFA14_minS =
        "\1\0\1\141\2\uffff\1\166\1\156\1\162\1\157\1\164\1\52\1\uffff\2"+
        "\60\1\101\1\uffff\2\0\2\uffff\1\154\3\uffff\1\145\1\60\1\157\2\60"+
        "\4\uffff\1\60\1\uffff\1\60\2\uffff\1\145\1\156\1\uffff\1\155\2\uffff"+
        "\1\60\2\uffff\1\156\1\164\2\60\1\144\1\60\2\uffff\1\141\1\uffff"+
        "\1\162\1\60\1\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\141\2\uffff\1\166\1\156\1\162\1\157\1\164\1\71\1\uffff"+
        "\2\71\1\172\1\uffff\2\uffff\2\uffff\1\154\3\uffff\1\145\1\172\1"+
        "\157\2\172\4\uffff\1\72\1\uffff\1\72\2\uffff\1\145\1\156\1\uffff"+
        "\1\155\2\uffff\1\71\2\uffff\1\156\1\164\1\172\1\71\1\144\1\172\2"+
        "\uffff\1\141\1\uffff\1\162\1\172\1\uffff";
    static final String DFA14_acceptS =
        "\2\uffff\1\2\1\3\6\uffff\1\12\3\uffff\1\17\2\uffff\1\24\1\25\1"+
        "\uffff\1\17\1\2\1\3\5\uffff\1\22\1\23\1\11\1\15\1\uffff\1\14\1\uffff"+
        "\1\21\1\24\2\uffff\1\5\1\uffff\1\7\1\10\1\uffff\1\16\1\20\6\uffff"+
        "\1\6\1\13\1\uffff\1\4\2\uffff\1\1";
    static final String DFA14_specialS =
        "\1\2\16\uffff\1\1\1\0\52\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\22\2\21\2\22\1\21\22\22\1\21\1\22\1\17\4\22\1\20\7\22\1"+
            "\11\2\13\10\14\7\22\32\16\3\22\1\15\1\16\1\22\1\10\1\16\1\1"+
            "\1\16\1\4\1\6\10\16\1\5\4\16\1\7\6\16\1\2\1\22\1\3\uff82\22",
            "\1\23",
            "",
            "",
            "\1\27",
            "\1\30",
            "\1\31",
            "\1\32",
            "\1\33",
            "\1\34\4\uffff\1\35\12\37",
            "",
            "\12\40",
            "\12\42",
            "\32\24\4\uffff\1\24\1\uffff\32\24",
            "",
            "\0\43",
            "\0\43",
            "",
            "",
            "\1\45",
            "",
            "",
            "",
            "\1\46",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\50",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "",
            "",
            "",
            "",
            "\12\53\1\54",
            "",
            "\12\53\1\54",
            "",
            "",
            "\1\56",
            "\1\57",
            "",
            "\1\60",
            "",
            "",
            "\12\61",
            "",
            "",
            "\1\62",
            "\1\63",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\12\55",
            "\1\66",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "",
            "",
            "\1\70",
            "",
            "\1\71",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | RULE_YEAR | RULE_MONTH | RULE_DAY | RULE_TIME | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_16 = input.LA(1);

                        s = -1;
                        if ( ((LA14_16>='\u0000' && LA14_16<='\uFFFF')) ) {s = 35;}

                        else s = 18;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_15 = input.LA(1);

                        s = -1;
                        if ( ((LA14_15>='\u0000' && LA14_15<='\uFFFF')) ) {s = 35;}

                        else s = 18;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='c') ) {s = 1;}

                        else if ( (LA14_0=='{') ) {s = 2;}

                        else if ( (LA14_0=='}') ) {s = 3;}

                        else if ( (LA14_0=='e') ) {s = 4;}

                        else if ( (LA14_0=='o') ) {s = 5;}

                        else if ( (LA14_0=='f') ) {s = 6;}

                        else if ( (LA14_0=='t') ) {s = 7;}

                        else if ( (LA14_0=='a') ) {s = 8;}

                        else if ( (LA14_0=='/') ) {s = 9;}

                        else if ( (LA14_0=='O') ) {s = 10;}

                        else if ( ((LA14_0>='0' && LA14_0<='1')) ) {s = 11;}

                        else if ( ((LA14_0>='2' && LA14_0<='9')) ) {s = 12;}

                        else if ( (LA14_0=='^') ) {s = 13;}

                        else if ( ((LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||LA14_0=='b'||LA14_0=='d'||(LA14_0>='g' && LA14_0<='n')||(LA14_0>='p' && LA14_0<='s')||(LA14_0>='u' && LA14_0<='z')) ) {s = 14;}

                        else if ( (LA14_0=='\"') ) {s = 15;}

                        else if ( (LA14_0=='\'') ) {s = 16;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 17;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='#' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='.')||(LA14_0>=':' && LA14_0<='@')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||LA14_0=='|'||(LA14_0>='~' && LA14_0<='\uFFFF')) ) {s = 18;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}