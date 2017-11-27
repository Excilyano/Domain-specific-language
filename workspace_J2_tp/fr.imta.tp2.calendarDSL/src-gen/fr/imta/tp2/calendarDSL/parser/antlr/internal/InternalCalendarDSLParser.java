package fr.imta.tp2.calendarDSL.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.imta.tp2.calendarDSL.services.CalendarDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCalendarDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_TIME", "RULE_YEAR", "RULE_MONTH", "RULE_DAY", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'calendar'", "'{'", "'}'", "'event'", "'on'", "'from'", "'to'", "'at'", "'/'", "''"
    };
    public static final int RULE_ID=9;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int RULE_DAY=8;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=14;
    public static final int T__21=21;
    public static final int RULE_MONTH=7;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=12;
    public static final int EOF=-1;
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


        public InternalCalendarDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCalendarDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCalendarDSLParser.tokenNames; }
    public String getGrammarFileName() { return "../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g"; }



     	private CalendarDSLGrammarAccess grammarAccess;
     	
        public InternalCalendarDSLParser(TokenStream input, CalendarDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Calendar";	
       	}
       	
       	@Override
       	protected CalendarDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleCalendar"
    // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:67:1: entryRuleCalendar returns [EObject current=null] : iv_ruleCalendar= ruleCalendar EOF ;
    public final EObject entryRuleCalendar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCalendar = null;


        try {
            // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:68:2: (iv_ruleCalendar= ruleCalendar EOF )
            // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:69:2: iv_ruleCalendar= ruleCalendar EOF
            {
             newCompositeNode(grammarAccess.getCalendarRule()); 
            pushFollow(FOLLOW_ruleCalendar_in_entryRuleCalendar75);
            iv_ruleCalendar=ruleCalendar();

            state._fsp--;

             current =iv_ruleCalendar; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCalendar85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCalendar"


    // $ANTLR start "ruleCalendar"
    // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:76:1: ruleCalendar returns [EObject current=null] : ( () otherlv_1= 'calendar' otherlv_2= '{' ( (lv_events_3_0= ruleEvent ) )* otherlv_4= '}' ) ;
    public final EObject ruleCalendar() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_events_3_0 = null;


         enterRule(); 
            
        try {
            // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:79:28: ( ( () otherlv_1= 'calendar' otherlv_2= '{' ( (lv_events_3_0= ruleEvent ) )* otherlv_4= '}' ) )
            // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:80:1: ( () otherlv_1= 'calendar' otherlv_2= '{' ( (lv_events_3_0= ruleEvent ) )* otherlv_4= '}' )
            {
            // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:80:1: ( () otherlv_1= 'calendar' otherlv_2= '{' ( (lv_events_3_0= ruleEvent ) )* otherlv_4= '}' )
            // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:80:2: () otherlv_1= 'calendar' otherlv_2= '{' ( (lv_events_3_0= ruleEvent ) )* otherlv_4= '}'
            {
            // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:80:2: ()
            // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCalendarAccess().getCalendarAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleCalendar131); 

                	newLeafNode(otherlv_1, grammarAccess.getCalendarAccess().getCalendarKeyword_1());
                
            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleCalendar143); 

                	newLeafNode(otherlv_2, grammarAccess.getCalendarAccess().getLeftCurlyBracketKeyword_2());
                
            // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:94:1: ( (lv_events_3_0= ruleEvent ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:95:1: (lv_events_3_0= ruleEvent )
            	    {
            	    // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:95:1: (lv_events_3_0= ruleEvent )
            	    // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:96:3: lv_events_3_0= ruleEvent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCalendarAccess().getEventsEventParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEvent_in_ruleCalendar164);
            	    lv_events_3_0=ruleEvent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCalendarRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"events",
            	            		lv_events_3_0, 
            	            		"Event");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleCalendar177); 

                	newLeafNode(otherlv_4, grammarAccess.getCalendarAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCalendar"


    // $ANTLR start "entryRuleEvent"
    // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:124:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:125:2: (iv_ruleEvent= ruleEvent EOF )
            // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:126:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent213);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent223); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:133:1: ruleEvent returns [EObject current=null] : (otherlv_0= 'event' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'on' ( (lv_on_5_0= ruleDate ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'from' ( (lv_from_7_0= RULE_TIME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'to' ( (lv_to_9_0= RULE_TIME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'at' ( (lv_at_11_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_12= '}' ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_from_7_0=null;
        Token otherlv_8=null;
        Token lv_to_9_0=null;
        Token otherlv_10=null;
        Token lv_at_11_0=null;
        Token otherlv_12=null;
        EObject lv_on_5_0 = null;


         enterRule(); 
            
        try {
            // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:136:28: ( (otherlv_0= 'event' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'on' ( (lv_on_5_0= ruleDate ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'from' ( (lv_from_7_0= RULE_TIME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'to' ( (lv_to_9_0= RULE_TIME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'at' ( (lv_at_11_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_12= '}' ) )
            // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:137:1: (otherlv_0= 'event' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'on' ( (lv_on_5_0= ruleDate ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'from' ( (lv_from_7_0= RULE_TIME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'to' ( (lv_to_9_0= RULE_TIME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'at' ( (lv_at_11_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_12= '}' )
            {
            // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:137:1: (otherlv_0= 'event' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'on' ( (lv_on_5_0= ruleDate ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'from' ( (lv_from_7_0= RULE_TIME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'to' ( (lv_to_9_0= RULE_TIME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'at' ( (lv_at_11_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_12= '}' )
            // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:137:3: otherlv_0= 'event' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'on' ( (lv_on_5_0= ruleDate ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'from' ( (lv_from_7_0= RULE_TIME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'to' ( (lv_to_9_0= RULE_TIME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'at' ( (lv_at_11_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleEvent260); 

                	newLeafNode(otherlv_0, grammarAccess.getEventAccess().getEventKeyword_0());
                
            // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:141:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:142:1: (lv_name_1_0= RULE_STRING )
            {
            // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:142:1: (lv_name_1_0= RULE_STRING )
            // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:143:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEvent277); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEventAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEventRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleEvent294); 

                	newLeafNode(otherlv_2, grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_2());
                
            // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:163:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'on' ( (lv_on_5_0= ruleDate ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'from' ( (lv_from_7_0= RULE_TIME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'to' ( (lv_to_9_0= RULE_TIME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'at' ( (lv_at_11_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )
            // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:165:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'on' ( (lv_on_5_0= ruleDate ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'from' ( (lv_from_7_0= RULE_TIME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'to' ( (lv_to_9_0= RULE_TIME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'at' ( (lv_at_11_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) )
            {
            // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:165:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'on' ( (lv_on_5_0= ruleDate ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'from' ( (lv_from_7_0= RULE_TIME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'to' ( (lv_to_9_0= RULE_TIME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'at' ( (lv_at_11_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) )
            // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:166:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'on' ( (lv_on_5_0= ruleDate ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'from' ( (lv_from_7_0= RULE_TIME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'to' ( (lv_to_9_0= RULE_TIME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'at' ( (lv_at_11_0= RULE_STRING ) ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getEventAccess().getUnorderedGroup_3());
            	
            // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:169:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'on' ( (lv_on_5_0= ruleDate ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'from' ( (lv_from_7_0= RULE_TIME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'to' ( (lv_to_9_0= RULE_TIME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'at' ( (lv_at_11_0= RULE_STRING ) ) ) ) ) ) )+ {...}?)
            // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:170:3: ( ({...}? => ( ({...}? => (otherlv_4= 'on' ( (lv_on_5_0= ruleDate ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'from' ( (lv_from_7_0= RULE_TIME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'to' ( (lv_to_9_0= RULE_TIME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'at' ( (lv_at_11_0= RULE_STRING ) ) ) ) ) ) )+ {...}?
            {
            // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:170:3: ( ({...}? => ( ({...}? => (otherlv_4= 'on' ( (lv_on_5_0= ruleDate ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'from' ( (lv_from_7_0= RULE_TIME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'to' ( (lv_to_9_0= RULE_TIME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'at' ( (lv_at_11_0= RULE_STRING ) ) ) ) ) ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=5;
                int LA2_0 = input.LA(1);

                if ( LA2_0 ==19 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_3(), 0) ) {
                    alt2=1;
                }
                else if ( LA2_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_3(), 1) ) {
                    alt2=2;
                }
                else if ( LA2_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_3(), 2) ) {
                    alt2=3;
                }
                else if ( LA2_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_3(), 3) ) {
                    alt2=4;
                }


                switch (alt2) {
            	case 1 :
            	    // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:172:4: ({...}? => ( ({...}? => (otherlv_4= 'on' ( (lv_on_5_0= ruleDate ) ) ) ) ) )
            	    {
            	    // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:172:4: ({...}? => ( ({...}? => (otherlv_4= 'on' ( (lv_on_5_0= ruleDate ) ) ) ) ) )
            	    // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:173:5: {...}? => ( ({...}? => (otherlv_4= 'on' ( (lv_on_5_0= ruleDate ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEvent", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:173:102: ( ({...}? => (otherlv_4= 'on' ( (lv_on_5_0= ruleDate ) ) ) ) )
            	    // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:174:6: ({...}? => (otherlv_4= 'on' ( (lv_on_5_0= ruleDate ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEventAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:177:6: ({...}? => (otherlv_4= 'on' ( (lv_on_5_0= ruleDate ) ) ) )
            	    // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:177:7: {...}? => (otherlv_4= 'on' ( (lv_on_5_0= ruleDate ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEvent", "true");
            	    }
            	    // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:177:16: (otherlv_4= 'on' ( (lv_on_5_0= ruleDate ) ) )
            	    // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:177:18: otherlv_4= 'on' ( (lv_on_5_0= ruleDate ) )
            	    {
            	    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleEvent352); 

            	        	newLeafNode(otherlv_4, grammarAccess.getEventAccess().getOnKeyword_3_0_0());
            	        
            	    // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:181:1: ( (lv_on_5_0= ruleDate ) )
            	    // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:182:1: (lv_on_5_0= ruleDate )
            	    {
            	    // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:182:1: (lv_on_5_0= ruleDate )
            	    // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:183:3: lv_on_5_0= ruleDate
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEventAccess().getOnDateParserRuleCall_3_0_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDate_in_ruleEvent373);
            	    lv_on_5_0=ruleDate();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEventRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"on",
            	            		lv_on_5_0, 
            	            		"Date");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEventAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:206:4: ({...}? => ( ({...}? => (otherlv_6= 'from' ( (lv_from_7_0= RULE_TIME ) ) ) ) ) )
            	    {
            	    // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:206:4: ({...}? => ( ({...}? => (otherlv_6= 'from' ( (lv_from_7_0= RULE_TIME ) ) ) ) ) )
            	    // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:207:5: {...}? => ( ({...}? => (otherlv_6= 'from' ( (lv_from_7_0= RULE_TIME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEvent", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:207:102: ( ({...}? => (otherlv_6= 'from' ( (lv_from_7_0= RULE_TIME ) ) ) ) )
            	    // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:208:6: ({...}? => (otherlv_6= 'from' ( (lv_from_7_0= RULE_TIME ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEventAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:211:6: ({...}? => (otherlv_6= 'from' ( (lv_from_7_0= RULE_TIME ) ) ) )
            	    // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:211:7: {...}? => (otherlv_6= 'from' ( (lv_from_7_0= RULE_TIME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEvent", "true");
            	    }
            	    // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:211:16: (otherlv_6= 'from' ( (lv_from_7_0= RULE_TIME ) ) )
            	    // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:211:18: otherlv_6= 'from' ( (lv_from_7_0= RULE_TIME ) )
            	    {
            	    otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleEvent441); 

            	        	newLeafNode(otherlv_6, grammarAccess.getEventAccess().getFromKeyword_3_1_0());
            	        
            	    // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:215:1: ( (lv_from_7_0= RULE_TIME ) )
            	    // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:216:1: (lv_from_7_0= RULE_TIME )
            	    {
            	    // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:216:1: (lv_from_7_0= RULE_TIME )
            	    // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:217:3: lv_from_7_0= RULE_TIME
            	    {
            	    lv_from_7_0=(Token)match(input,RULE_TIME,FOLLOW_RULE_TIME_in_ruleEvent458); 

            	    			newLeafNode(lv_from_7_0, grammarAccess.getEventAccess().getFromTIMETerminalRuleCall_3_1_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getEventRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"from",
            	            		lv_from_7_0, 
            	            		"TIME");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEventAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:240:4: ({...}? => ( ({...}? => (otherlv_8= 'to' ( (lv_to_9_0= RULE_TIME ) ) ) ) ) )
            	    {
            	    // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:240:4: ({...}? => ( ({...}? => (otherlv_8= 'to' ( (lv_to_9_0= RULE_TIME ) ) ) ) ) )
            	    // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:241:5: {...}? => ( ({...}? => (otherlv_8= 'to' ( (lv_to_9_0= RULE_TIME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEvent", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:241:102: ( ({...}? => (otherlv_8= 'to' ( (lv_to_9_0= RULE_TIME ) ) ) ) )
            	    // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:242:6: ({...}? => (otherlv_8= 'to' ( (lv_to_9_0= RULE_TIME ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEventAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:245:6: ({...}? => (otherlv_8= 'to' ( (lv_to_9_0= RULE_TIME ) ) ) )
            	    // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:245:7: {...}? => (otherlv_8= 'to' ( (lv_to_9_0= RULE_TIME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEvent", "true");
            	    }
            	    // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:245:16: (otherlv_8= 'to' ( (lv_to_9_0= RULE_TIME ) ) )
            	    // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:245:18: otherlv_8= 'to' ( (lv_to_9_0= RULE_TIME ) )
            	    {
            	    otherlv_8=(Token)match(input,21,FOLLOW_21_in_ruleEvent531); 

            	        	newLeafNode(otherlv_8, grammarAccess.getEventAccess().getToKeyword_3_2_0());
            	        
            	    // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:249:1: ( (lv_to_9_0= RULE_TIME ) )
            	    // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:250:1: (lv_to_9_0= RULE_TIME )
            	    {
            	    // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:250:1: (lv_to_9_0= RULE_TIME )
            	    // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:251:3: lv_to_9_0= RULE_TIME
            	    {
            	    lv_to_9_0=(Token)match(input,RULE_TIME,FOLLOW_RULE_TIME_in_ruleEvent548); 

            	    			newLeafNode(lv_to_9_0, grammarAccess.getEventAccess().getToTIMETerminalRuleCall_3_2_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getEventRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"to",
            	            		lv_to_9_0, 
            	            		"TIME");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEventAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:274:4: ({...}? => ( ({...}? => (otherlv_10= 'at' ( (lv_at_11_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:274:4: ({...}? => ( ({...}? => (otherlv_10= 'at' ( (lv_at_11_0= RULE_STRING ) ) ) ) ) )
            	    // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:275:5: {...}? => ( ({...}? => (otherlv_10= 'at' ( (lv_at_11_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEvent", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:275:102: ( ({...}? => (otherlv_10= 'at' ( (lv_at_11_0= RULE_STRING ) ) ) ) )
            	    // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:276:6: ({...}? => (otherlv_10= 'at' ( (lv_at_11_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEventAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:279:6: ({...}? => (otherlv_10= 'at' ( (lv_at_11_0= RULE_STRING ) ) ) )
            	    // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:279:7: {...}? => (otherlv_10= 'at' ( (lv_at_11_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEvent", "true");
            	    }
            	    // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:279:16: (otherlv_10= 'at' ( (lv_at_11_0= RULE_STRING ) ) )
            	    // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:279:18: otherlv_10= 'at' ( (lv_at_11_0= RULE_STRING ) )
            	    {
            	    otherlv_10=(Token)match(input,22,FOLLOW_22_in_ruleEvent621); 

            	        	newLeafNode(otherlv_10, grammarAccess.getEventAccess().getAtKeyword_3_3_0());
            	        
            	    // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:283:1: ( (lv_at_11_0= RULE_STRING ) )
            	    // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:284:1: (lv_at_11_0= RULE_STRING )
            	    {
            	    // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:284:1: (lv_at_11_0= RULE_STRING )
            	    // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:285:3: lv_at_11_0= RULE_STRING
            	    {
            	    lv_at_11_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEvent638); 

            	    			newLeafNode(lv_at_11_0, grammarAccess.getEventAccess().getAtSTRINGTerminalRuleCall_3_3_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getEventRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"at",
            	            		lv_at_11_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEventAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getEventAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleEvent", "getUnorderedGroupHelper().canLeave(grammarAccess.getEventAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getEventAccess().getUnorderedGroup_3());
            	

            }

            otherlv_12=(Token)match(input,17,FOLLOW_17_in_ruleEvent702); 

                	newLeafNode(otherlv_12, grammarAccess.getEventAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleDate"
    // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:328:1: entryRuleDate returns [EObject current=null] : iv_ruleDate= ruleDate EOF ;
    public final EObject entryRuleDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDate = null;


        try {
            // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:329:2: (iv_ruleDate= ruleDate EOF )
            // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:330:2: iv_ruleDate= ruleDate EOF
            {
             newCompositeNode(grammarAccess.getDateRule()); 
            pushFollow(FOLLOW_ruleDate_in_entryRuleDate738);
            iv_ruleDate=ruleDate();

            state._fsp--;

             current =iv_ruleDate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDate748); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDate"


    // $ANTLR start "ruleDate"
    // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:337:1: ruleDate returns [EObject current=null] : ( ( (lv_year_0_0= RULE_YEAR ) ) otherlv_1= '/' ( (lv_month_2_0= RULE_MONTH ) ) otherlv_3= '' ( (lv_day_4_0= RULE_DAY ) ) ) ;
    public final EObject ruleDate() throws RecognitionException {
        EObject current = null;

        Token lv_year_0_0=null;
        Token otherlv_1=null;
        Token lv_month_2_0=null;
        Token otherlv_3=null;
        Token lv_day_4_0=null;

         enterRule(); 
            
        try {
            // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:340:28: ( ( ( (lv_year_0_0= RULE_YEAR ) ) otherlv_1= '/' ( (lv_month_2_0= RULE_MONTH ) ) otherlv_3= '' ( (lv_day_4_0= RULE_DAY ) ) ) )
            // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:341:1: ( ( (lv_year_0_0= RULE_YEAR ) ) otherlv_1= '/' ( (lv_month_2_0= RULE_MONTH ) ) otherlv_3= '' ( (lv_day_4_0= RULE_DAY ) ) )
            {
            // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:341:1: ( ( (lv_year_0_0= RULE_YEAR ) ) otherlv_1= '/' ( (lv_month_2_0= RULE_MONTH ) ) otherlv_3= '' ( (lv_day_4_0= RULE_DAY ) ) )
            // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:341:2: ( (lv_year_0_0= RULE_YEAR ) ) otherlv_1= '/' ( (lv_month_2_0= RULE_MONTH ) ) otherlv_3= '' ( (lv_day_4_0= RULE_DAY ) )
            {
            // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:341:2: ( (lv_year_0_0= RULE_YEAR ) )
            // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:342:1: (lv_year_0_0= RULE_YEAR )
            {
            // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:342:1: (lv_year_0_0= RULE_YEAR )
            // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:343:3: lv_year_0_0= RULE_YEAR
            {
            lv_year_0_0=(Token)match(input,RULE_YEAR,FOLLOW_RULE_YEAR_in_ruleDate790); 

            			newLeafNode(lv_year_0_0, grammarAccess.getDateAccess().getYearYEARTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"year",
                    		lv_year_0_0, 
                    		"YEAR");
            	    

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleDate807); 

                	newLeafNode(otherlv_1, grammarAccess.getDateAccess().getSolidusKeyword_1());
                
            // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:363:1: ( (lv_month_2_0= RULE_MONTH ) )
            // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:364:1: (lv_month_2_0= RULE_MONTH )
            {
            // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:364:1: (lv_month_2_0= RULE_MONTH )
            // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:365:3: lv_month_2_0= RULE_MONTH
            {
            lv_month_2_0=(Token)match(input,RULE_MONTH,FOLLOW_RULE_MONTH_in_ruleDate824); 

            			newLeafNode(lv_month_2_0, grammarAccess.getDateAccess().getMonthMONTHTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"month",
                    		lv_month_2_0, 
                    		"MONTH");
            	    

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleDate841); 

                	newLeafNode(otherlv_3, grammarAccess.getDateAccess().getKeyword_3());
                
            // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:385:1: ( (lv_day_4_0= RULE_DAY ) )
            // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:386:1: (lv_day_4_0= RULE_DAY )
            {
            // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:386:1: (lv_day_4_0= RULE_DAY )
            // ../fr.imta.tp2.calendarDSL/src-gen/fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.g:387:3: lv_day_4_0= RULE_DAY
            {
            lv_day_4_0=(Token)match(input,RULE_DAY,FOLLOW_RULE_DAY_in_ruleDate858); 

            			newLeafNode(lv_day_4_0, grammarAccess.getDateAccess().getDayDAYTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"day",
                    		lv_day_4_0, 
                    		"DAY");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDate"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleCalendar_in_entryRuleCalendar75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCalendar85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleCalendar131 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCalendar143 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleCalendar164 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleCalendar177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent213 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleEvent260 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEvent277 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleEvent294 = new BitSet(new long[]{0x0000000000780000L});
    public static final BitSet FOLLOW_19_in_ruleEvent352 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDate_in_ruleEvent373 = new BitSet(new long[]{0x00000000007A0000L});
    public static final BitSet FOLLOW_20_in_ruleEvent441 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_TIME_in_ruleEvent458 = new BitSet(new long[]{0x00000000007A0000L});
    public static final BitSet FOLLOW_21_in_ruleEvent531 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_TIME_in_ruleEvent548 = new BitSet(new long[]{0x00000000007A0000L});
    public static final BitSet FOLLOW_22_in_ruleEvent621 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEvent638 = new BitSet(new long[]{0x00000000007A0000L});
    public static final BitSet FOLLOW_17_in_ruleEvent702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDate_in_entryRuleDate738 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDate748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_YEAR_in_ruleDate790 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleDate807 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_MONTH_in_ruleDate824 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleDate841 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_DAY_in_ruleDate858 = new BitSet(new long[]{0x0000000000000002L});

}
