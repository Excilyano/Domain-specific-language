package fr.imta.tp2.statDSL.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.imta.tp2.statDSL.services.StatDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalStatDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'program'", "'begin'", "'return'", "';'", "'end'", "'moyenne'", "'variance'", "'ecart-type'", "'mode'", "'eff : '", "','", "'mod : '"
    };
    public static final int RULE_ID=4;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalStatDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalStatDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalStatDSLParser.tokenNames; }
    public String getGrammarFileName() { return "../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g"; }



     	private StatDSLGrammarAccess grammarAccess;
     	
        public InternalStatDSLParser(TokenStream input, StatDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "StatDSL";	
       	}
       	
       	@Override
       	protected StatDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleStatDSL"
    // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:67:1: entryRuleStatDSL returns [EObject current=null] : iv_ruleStatDSL= ruleStatDSL EOF ;
    public final EObject entryRuleStatDSL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatDSL = null;


        try {
            // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:68:2: (iv_ruleStatDSL= ruleStatDSL EOF )
            // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:69:2: iv_ruleStatDSL= ruleStatDSL EOF
            {
             newCompositeNode(grammarAccess.getStatDSLRule()); 
            pushFollow(FOLLOW_ruleStatDSL_in_entryRuleStatDSL75);
            iv_ruleStatDSL=ruleStatDSL();

            state._fsp--;

             current =iv_ruleStatDSL; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatDSL85); 

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
    // $ANTLR end "entryRuleStatDSL"


    // $ANTLR start "ruleStatDSL"
    // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:76:1: ruleStatDSL returns [EObject current=null] : ( (lv_program_0_0= ruleProgram ) ) ;
    public final EObject ruleStatDSL() throws RecognitionException {
        EObject current = null;

        EObject lv_program_0_0 = null;


         enterRule(); 
            
        try {
            // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:79:28: ( ( (lv_program_0_0= ruleProgram ) ) )
            // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:80:1: ( (lv_program_0_0= ruleProgram ) )
            {
            // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:80:1: ( (lv_program_0_0= ruleProgram ) )
            // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:81:1: (lv_program_0_0= ruleProgram )
            {
            // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:81:1: (lv_program_0_0= ruleProgram )
            // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:82:3: lv_program_0_0= ruleProgram
            {
             
            	        newCompositeNode(grammarAccess.getStatDSLAccess().getProgramProgramParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleProgram_in_ruleStatDSL130);
            lv_program_0_0=ruleProgram();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStatDSLRule());
            	        }
                   		set(
                   			current, 
                   			"program",
                    		lv_program_0_0, 
                    		"Program");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleStatDSL"


    // $ANTLR start "entryRuleProgram"
    // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:106:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:107:2: (iv_ruleProgram= ruleProgram EOF )
            // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:108:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram165);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram175); 

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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:115:1: ruleProgram returns [EObject current=null] : (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'begin' ruleInstructions otherlv_4= 'return' ruleKeyword otherlv_6= ';' otherlv_7= 'end' ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:118:28: ( (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'begin' ruleInstructions otherlv_4= 'return' ruleKeyword otherlv_6= ';' otherlv_7= 'end' ) )
            // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:119:1: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'begin' ruleInstructions otherlv_4= 'return' ruleKeyword otherlv_6= ';' otherlv_7= 'end' )
            {
            // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:119:1: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'begin' ruleInstructions otherlv_4= 'return' ruleKeyword otherlv_6= ';' otherlv_7= 'end' )
            // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:119:3: otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'begin' ruleInstructions otherlv_4= 'return' ruleKeyword otherlv_6= ';' otherlv_7= 'end'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleProgram212); 

                	newLeafNode(otherlv_0, grammarAccess.getProgramAccess().getProgramKeyword_0());
                
            // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:123:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:124:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:124:1: (lv_name_1_0= RULE_ID )
            // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:125:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProgram229); 

            			newLeafNode(lv_name_1_0, grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProgramRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleProgram246); 

                	newLeafNode(otherlv_2, grammarAccess.getProgramAccess().getBeginKeyword_2());
                
             
                    newCompositeNode(grammarAccess.getProgramAccess().getInstructionsParserRuleCall_3()); 
                
            pushFollow(FOLLOW_ruleInstructions_in_ruleProgram262);
            ruleInstructions();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleProgram273); 

                	newLeafNode(otherlv_4, grammarAccess.getProgramAccess().getReturnKeyword_4());
                
             
                    newCompositeNode(grammarAccess.getProgramAccess().getKeywordParserRuleCall_5()); 
                
            pushFollow(FOLLOW_ruleKeyword_in_ruleProgram289);
            ruleKeyword();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleProgram300); 

                	newLeafNode(otherlv_6, grammarAccess.getProgramAccess().getSemicolonKeyword_6());
                
            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleProgram312); 

                	newLeafNode(otherlv_7, grammarAccess.getProgramAccess().getEndKeyword_7());
                

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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleKeyword"
    // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:181:1: entryRuleKeyword returns [String current=null] : iv_ruleKeyword= ruleKeyword EOF ;
    public final String entryRuleKeyword() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKeyword = null;


        try {
            // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:182:2: (iv_ruleKeyword= ruleKeyword EOF )
            // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:183:2: iv_ruleKeyword= ruleKeyword EOF
            {
             newCompositeNode(grammarAccess.getKeywordRule()); 
            pushFollow(FOLLOW_ruleKeyword_in_entryRuleKeyword349);
            iv_ruleKeyword=ruleKeyword();

            state._fsp--;

             current =iv_ruleKeyword.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeyword360); 

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
    // $ANTLR end "entryRuleKeyword"


    // $ANTLR start "ruleKeyword"
    // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:190:1: ruleKeyword returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'moyenne' | kw= 'variance' | kw= 'ecart-type' | kw= 'mode' ) ;
    public final AntlrDatatypeRuleToken ruleKeyword() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:193:28: ( (kw= 'moyenne' | kw= 'variance' | kw= 'ecart-type' | kw= 'mode' ) )
            // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:194:1: (kw= 'moyenne' | kw= 'variance' | kw= 'ecart-type' | kw= 'mode' )
            {
            // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:194:1: (kw= 'moyenne' | kw= 'variance' | kw= 'ecart-type' | kw= 'mode' )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt1=1;
                }
                break;
            case 17:
                {
                alt1=2;
                }
                break;
            case 18:
                {
                alt1=3;
                }
                break;
            case 19:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:195:2: kw= 'moyenne'
                    {
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleKeyword398); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getKeywordAccess().getMoyenneKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:202:2: kw= 'variance'
                    {
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleKeyword417); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getKeywordAccess().getVarianceKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:209:2: kw= 'ecart-type'
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleKeyword436); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getKeywordAccess().getEcartTypeKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:216:2: kw= 'mode'
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleKeyword455); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getKeywordAccess().getModeKeyword_3()); 
                        

                    }
                    break;

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
    // $ANTLR end "ruleKeyword"


    // $ANTLR start "entryRuleInstructions"
    // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:229:1: entryRuleInstructions returns [String current=null] : iv_ruleInstructions= ruleInstructions EOF ;
    public final String entryRuleInstructions() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInstructions = null;


        try {
            // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:230:2: (iv_ruleInstructions= ruleInstructions EOF )
            // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:231:2: iv_ruleInstructions= ruleInstructions EOF
            {
             newCompositeNode(grammarAccess.getInstructionsRule()); 
            pushFollow(FOLLOW_ruleInstructions_in_entryRuleInstructions496);
            iv_ruleInstructions=ruleInstructions();

            state._fsp--;

             current =iv_ruleInstructions.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstructions507); 

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
    // $ANTLR end "entryRuleInstructions"


    // $ANTLR start "ruleInstructions"
    // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:238:1: ruleInstructions returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( ( ( ({...}? => ( ({...}? => (this_Mod_1= ruleMod ) ) ) ) | ({...}? => ( ({...}? => (this_Eff_2= ruleEff ) ) ) ) )+ {...}?) ) ) ;
    public final AntlrDatatypeRuleToken ruleInstructions() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Mod_1 = null;

        AntlrDatatypeRuleToken this_Eff_2 = null;


         enterRule(); 
            
        try {
            // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:241:28: ( ( ( ( ( ({...}? => ( ({...}? => (this_Mod_1= ruleMod ) ) ) ) | ({...}? => ( ({...}? => (this_Eff_2= ruleEff ) ) ) ) )+ {...}?) ) ) )
            // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:242:1: ( ( ( ( ({...}? => ( ({...}? => (this_Mod_1= ruleMod ) ) ) ) | ({...}? => ( ({...}? => (this_Eff_2= ruleEff ) ) ) ) )+ {...}?) ) )
            {
            // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:242:1: ( ( ( ( ({...}? => ( ({...}? => (this_Mod_1= ruleMod ) ) ) ) | ({...}? => ( ({...}? => (this_Eff_2= ruleEff ) ) ) ) )+ {...}?) ) )
            // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:244:1: ( ( ( ({...}? => ( ({...}? => (this_Mod_1= ruleMod ) ) ) ) | ({...}? => ( ({...}? => (this_Eff_2= ruleEff ) ) ) ) )+ {...}?) )
            {
            // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:244:1: ( ( ( ({...}? => ( ({...}? => (this_Mod_1= ruleMod ) ) ) ) | ({...}? => ( ({...}? => (this_Eff_2= ruleEff ) ) ) ) )+ {...}?) )
            // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:245:2: ( ( ({...}? => ( ({...}? => (this_Mod_1= ruleMod ) ) ) ) | ({...}? => ( ({...}? => (this_Eff_2= ruleEff ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getInstructionsAccess().getUnorderedGroup());
            	
            // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:248:2: ( ( ({...}? => ( ({...}? => (this_Mod_1= ruleMod ) ) ) ) | ({...}? => ( ({...}? => (this_Eff_2= ruleEff ) ) ) ) )+ {...}?)
            // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:249:3: ( ({...}? => ( ({...}? => (this_Mod_1= ruleMod ) ) ) ) | ({...}? => ( ({...}? => (this_Eff_2= ruleEff ) ) ) ) )+ {...}?
            {
            // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:249:3: ( ({...}? => ( ({...}? => (this_Mod_1= ruleMod ) ) ) ) | ({...}? => ( ({...}? => (this_Eff_2= ruleEff ) ) ) ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( LA2_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getInstructionsAccess().getUnorderedGroup(), 0) ) {
                    alt2=1;
                }
                else if ( LA2_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getInstructionsAccess().getUnorderedGroup(), 1) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:251:4: ({...}? => ( ({...}? => (this_Mod_1= ruleMod ) ) ) )
            	    {
            	    // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:251:4: ({...}? => ( ({...}? => (this_Mod_1= ruleMod ) ) ) )
            	    // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:252:5: {...}? => ( ({...}? => (this_Mod_1= ruleMod ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInstructionsAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleInstructions", "getUnorderedGroupHelper().canSelect(grammarAccess.getInstructionsAccess().getUnorderedGroup(), 0)");
            	    }
            	    // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:252:107: ( ({...}? => (this_Mod_1= ruleMod ) ) )
            	    // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:253:6: ({...}? => (this_Mod_1= ruleMod ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getInstructionsAccess().getUnorderedGroup(), 0);
            	    	 				
            	    // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:256:6: ({...}? => (this_Mod_1= ruleMod ) )
            	    // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:256:7: {...}? => (this_Mod_1= ruleMod )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleInstructions", "true");
            	    }
            	    // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:256:16: (this_Mod_1= ruleMod )
            	    // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:257:5: this_Mod_1= ruleMod
            	    {
            	     
            	            newCompositeNode(grammarAccess.getInstructionsAccess().getModParserRuleCall_0()); 
            	        
            	    pushFollow(FOLLOW_ruleMod_in_ruleInstructions599);
            	    this_Mod_1=ruleMod();

            	    state._fsp--;


            	    		current.merge(this_Mod_1);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInstructionsAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:274:4: ({...}? => ( ({...}? => (this_Eff_2= ruleEff ) ) ) )
            	    {
            	    // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:274:4: ({...}? => ( ({...}? => (this_Eff_2= ruleEff ) ) ) )
            	    // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:275:5: {...}? => ( ({...}? => (this_Eff_2= ruleEff ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInstructionsAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleInstructions", "getUnorderedGroupHelper().canSelect(grammarAccess.getInstructionsAccess().getUnorderedGroup(), 1)");
            	    }
            	    // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:275:107: ( ({...}? => (this_Eff_2= ruleEff ) ) )
            	    // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:276:6: ({...}? => (this_Eff_2= ruleEff ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getInstructionsAccess().getUnorderedGroup(), 1);
            	    	 				
            	    // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:279:6: ({...}? => (this_Eff_2= ruleEff ) )
            	    // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:279:7: {...}? => (this_Eff_2= ruleEff )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleInstructions", "true");
            	    }
            	    // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:279:16: (this_Eff_2= ruleEff )
            	    // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:280:5: this_Eff_2= ruleEff
            	    {
            	     
            	            newCompositeNode(grammarAccess.getInstructionsAccess().getEffParserRuleCall_1()); 
            	        
            	    pushFollow(FOLLOW_ruleEff_in_ruleInstructions682);
            	    this_Eff_2=ruleEff();

            	    state._fsp--;


            	    		current.merge(this_Eff_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInstructionsAccess().getUnorderedGroup());
            	    	 				

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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getInstructionsAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleInstructions", "getUnorderedGroupHelper().canLeave(grammarAccess.getInstructionsAccess().getUnorderedGroup())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getInstructionsAccess().getUnorderedGroup());
            	

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
    // $ANTLR end "ruleInstructions"


    // $ANTLR start "entryRuleEff"
    // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:313:1: entryRuleEff returns [String current=null] : iv_ruleEff= ruleEff EOF ;
    public final String entryRuleEff() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEff = null;


        try {
            // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:314:2: (iv_ruleEff= ruleEff EOF )
            // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:315:2: iv_ruleEff= ruleEff EOF
            {
             newCompositeNode(grammarAccess.getEffRule()); 
            pushFollow(FOLLOW_ruleEff_in_entryRuleEff774);
            iv_ruleEff=ruleEff();

            state._fsp--;

             current =iv_ruleEff.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEff785); 

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
    // $ANTLR end "entryRuleEff"


    // $ANTLR start "ruleEff"
    // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:322:1: ruleEff returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'eff : ' this_INT_1= RULE_INT (kw= ',' this_INT_3= RULE_INT )* kw= ';' ) ;
    public final AntlrDatatypeRuleToken ruleEff() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;

         enterRule(); 
            
        try {
            // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:325:28: ( (kw= 'eff : ' this_INT_1= RULE_INT (kw= ',' this_INT_3= RULE_INT )* kw= ';' ) )
            // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:326:1: (kw= 'eff : ' this_INT_1= RULE_INT (kw= ',' this_INT_3= RULE_INT )* kw= ';' )
            {
            // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:326:1: (kw= 'eff : ' this_INT_1= RULE_INT (kw= ',' this_INT_3= RULE_INT )* kw= ';' )
            // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:327:2: kw= 'eff : ' this_INT_1= RULE_INT (kw= ',' this_INT_3= RULE_INT )* kw= ';'
            {
            kw=(Token)match(input,20,FOLLOW_20_in_ruleEff823); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEffAccess().getEffKeyword_0()); 
                
            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEff838); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEffAccess().getINTTerminalRuleCall_1()); 
                
            // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:339:1: (kw= ',' this_INT_3= RULE_INT )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==21) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:340:2: kw= ',' this_INT_3= RULE_INT
            	    {
            	    kw=(Token)match(input,21,FOLLOW_21_in_ruleEff857); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getEffAccess().getCommaKeyword_2_0()); 
            	        
            	    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEff872); 

            	    		current.merge(this_INT_3);
            	        
            	     
            	        newLeafNode(this_INT_3, grammarAccess.getEffAccess().getINTTerminalRuleCall_2_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            kw=(Token)match(input,14,FOLLOW_14_in_ruleEff892); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEffAccess().getSemicolonKeyword_3()); 
                

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
    // $ANTLR end "ruleEff"


    // $ANTLR start "entryRuleMod"
    // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:366:1: entryRuleMod returns [String current=null] : iv_ruleMod= ruleMod EOF ;
    public final String entryRuleMod() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMod = null;


        try {
            // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:367:2: (iv_ruleMod= ruleMod EOF )
            // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:368:2: iv_ruleMod= ruleMod EOF
            {
             newCompositeNode(grammarAccess.getModRule()); 
            pushFollow(FOLLOW_ruleMod_in_entryRuleMod933);
            iv_ruleMod=ruleMod();

            state._fsp--;

             current =iv_ruleMod.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMod944); 

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
    // $ANTLR end "entryRuleMod"


    // $ANTLR start "ruleMod"
    // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:375:1: ruleMod returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'mod : ' this_INT_1= RULE_INT (kw= ',' this_INT_3= RULE_INT )* kw= ';' ) ;
    public final AntlrDatatypeRuleToken ruleMod() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;

         enterRule(); 
            
        try {
            // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:378:28: ( (kw= 'mod : ' this_INT_1= RULE_INT (kw= ',' this_INT_3= RULE_INT )* kw= ';' ) )
            // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:379:1: (kw= 'mod : ' this_INT_1= RULE_INT (kw= ',' this_INT_3= RULE_INT )* kw= ';' )
            {
            // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:379:1: (kw= 'mod : ' this_INT_1= RULE_INT (kw= ',' this_INT_3= RULE_INT )* kw= ';' )
            // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:380:2: kw= 'mod : ' this_INT_1= RULE_INT (kw= ',' this_INT_3= RULE_INT )* kw= ';'
            {
            kw=(Token)match(input,22,FOLLOW_22_in_ruleMod982); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getModAccess().getModKeyword_0()); 
                
            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleMod997); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getModAccess().getINTTerminalRuleCall_1()); 
                
            // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:392:1: (kw= ',' this_INT_3= RULE_INT )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==21) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../fr.imta.tp2.statDSL/src-gen/fr/imta/tp2/statDSL/parser/antlr/internal/InternalStatDSL.g:393:2: kw= ',' this_INT_3= RULE_INT
            	    {
            	    kw=(Token)match(input,21,FOLLOW_21_in_ruleMod1016); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getModAccess().getCommaKeyword_2_0()); 
            	        
            	    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleMod1031); 

            	    		current.merge(this_INT_3);
            	        
            	     
            	        newLeafNode(this_INT_3, grammarAccess.getModAccess().getINTTerminalRuleCall_2_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            kw=(Token)match(input,14,FOLLOW_14_in_ruleMod1051); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getModAccess().getSemicolonKeyword_3()); 
                

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
    // $ANTLR end "ruleMod"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleStatDSL_in_entryRuleStatDSL75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatDSL85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProgram_in_ruleStatDSL130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleProgram212 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProgram229 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleProgram246 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_ruleInstructions_in_ruleProgram262 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleProgram273 = new BitSet(new long[]{0x00000000000F0000L});
    public static final BitSet FOLLOW_ruleKeyword_in_ruleProgram289 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleProgram300 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleProgram312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyword_in_entryRuleKeyword349 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeyword360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleKeyword398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleKeyword417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleKeyword436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleKeyword455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstructions_in_entryRuleInstructions496 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstructions507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMod_in_ruleInstructions599 = new BitSet(new long[]{0x0000000000500002L});
    public static final BitSet FOLLOW_ruleEff_in_ruleInstructions682 = new BitSet(new long[]{0x0000000000500002L});
    public static final BitSet FOLLOW_ruleEff_in_entryRuleEff774 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEff785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleEff823 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEff838 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_21_in_ruleEff857 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEff872 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_14_in_ruleEff892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMod_in_entryRuleMod933 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMod944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleMod982 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleMod997 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_21_in_ruleMod1016 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleMod1031 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_14_in_ruleMod1051 = new BitSet(new long[]{0x0000000000000002L});

}
