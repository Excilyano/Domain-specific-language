package fr.imta.tp.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.imta.tp.services.CalcDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCalcDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DOUBLE", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'int'", "'float'", "'double'", "'='", "'+'", "'-'", "'/'", "'*'", "'%'"
    };
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


        public InternalCalcDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCalcDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCalcDSLParser.tokenNames; }
    public String getGrammarFileName() { return "../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g"; }



     	private CalcDSLGrammarAccess grammarAccess;
     	
        public InternalCalcDSLParser(TokenStream input, CalcDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "CalcDSL";	
       	}
       	
       	@Override
       	protected CalcDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleCalcDSL"
    // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:67:1: entryRuleCalcDSL returns [EObject current=null] : iv_ruleCalcDSL= ruleCalcDSL EOF ;
    public final EObject entryRuleCalcDSL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCalcDSL = null;


        try {
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:68:2: (iv_ruleCalcDSL= ruleCalcDSL EOF )
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:69:2: iv_ruleCalcDSL= ruleCalcDSL EOF
            {
             newCompositeNode(grammarAccess.getCalcDSLRule()); 
            pushFollow(FOLLOW_ruleCalcDSL_in_entryRuleCalcDSL75);
            iv_ruleCalcDSL=ruleCalcDSL();

            state._fsp--;

             current =iv_ruleCalcDSL; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCalcDSL85); 

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
    // $ANTLR end "entryRuleCalcDSL"


    // $ANTLR start "ruleCalcDSL"
    // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:76:1: ruleCalcDSL returns [EObject current=null] : ( (lv_instructions_0_0= ruleInstruction ) )* ;
    public final EObject ruleCalcDSL() throws RecognitionException {
        EObject current = null;

        EObject lv_instructions_0_0 = null;


         enterRule(); 
            
        try {
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:79:28: ( ( (lv_instructions_0_0= ruleInstruction ) )* )
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:80:1: ( (lv_instructions_0_0= ruleInstruction ) )*
            {
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:80:1: ( (lv_instructions_0_0= ruleInstruction ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||(LA1_0>=13 && LA1_0<=15)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:81:1: (lv_instructions_0_0= ruleInstruction )
            	    {
            	    // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:81:1: (lv_instructions_0_0= ruleInstruction )
            	    // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:82:3: lv_instructions_0_0= ruleInstruction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCalcDSLAccess().getInstructionsInstructionParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInstruction_in_ruleCalcDSL130);
            	    lv_instructions_0_0=ruleInstruction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCalcDSLRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"instructions",
            	            		lv_instructions_0_0, 
            	            		"Instruction");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleCalcDSL"


    // $ANTLR start "entryRuleInstruction"
    // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:106:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:107:2: (iv_ruleInstruction= ruleInstruction EOF )
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:108:2: iv_ruleInstruction= ruleInstruction EOF
            {
             newCompositeNode(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_ruleInstruction_in_entryRuleInstruction166);
            iv_ruleInstruction=ruleInstruction();

            state._fsp--;

             current =iv_ruleInstruction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstruction176); 

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
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:115:1: ruleInstruction returns [EObject current=null] : (this_Declaration_0= ruleDeclaration | this_Operation_1= ruleOperation ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        EObject this_Declaration_0 = null;

        EObject this_Operation_1 = null;


         enterRule(); 
            
        try {
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:118:28: ( (this_Declaration_0= ruleDeclaration | this_Operation_1= ruleOperation ) )
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:119:1: (this_Declaration_0= ruleDeclaration | this_Operation_1= ruleOperation )
            {
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:119:1: (this_Declaration_0= ruleDeclaration | this_Operation_1= ruleOperation )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=13 && LA2_0<=15)) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:120:5: this_Declaration_0= ruleDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getDeclarationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDeclaration_in_ruleInstruction223);
                    this_Declaration_0=ruleDeclaration();

                    state._fsp--;

                     
                            current = this_Declaration_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:130:5: this_Operation_1= ruleOperation
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getOperationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleOperation_in_ruleInstruction250);
                    this_Operation_1=ruleOperation();

                    state._fsp--;

                     
                            current = this_Operation_1; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleDeclaration"
    // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:146:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:147:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:148:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration285);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration295); 

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
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:155:1: ruleDeclaration returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_variable_1_0= ruleVariable ) ) otherlv_2= ';' ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_type_0_0 = null;

        EObject lv_variable_1_0 = null;


         enterRule(); 
            
        try {
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:158:28: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_variable_1_0= ruleVariable ) ) otherlv_2= ';' ) )
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:159:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_variable_1_0= ruleVariable ) ) otherlv_2= ';' )
            {
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:159:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_variable_1_0= ruleVariable ) ) otherlv_2= ';' )
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:159:2: ( (lv_type_0_0= ruleType ) ) ( (lv_variable_1_0= ruleVariable ) ) otherlv_2= ';'
            {
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:159:2: ( (lv_type_0_0= ruleType ) )
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:160:1: (lv_type_0_0= ruleType )
            {
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:160:1: (lv_type_0_0= ruleType )
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:161:3: lv_type_0_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getDeclarationAccess().getTypeTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleDeclaration341);
            lv_type_0_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:177:2: ( (lv_variable_1_0= ruleVariable ) )
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:178:1: (lv_variable_1_0= ruleVariable )
            {
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:178:1: (lv_variable_1_0= ruleVariable )
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:179:3: lv_variable_1_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getDeclarationAccess().getVariableVariableParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVariable_in_ruleDeclaration362);
            lv_variable_1_0=ruleVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"variable",
                    		lv_variable_1_0, 
                    		"Variable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleDeclaration374); 

                	newLeafNode(otherlv_2, grammarAccess.getDeclarationAccess().getSemicolonKeyword_2());
                

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
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleType"
    // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:207:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:208:2: (iv_ruleType= ruleType EOF )
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:209:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType411);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType422); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:216:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'int' | kw= 'float' | kw= 'double' ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:219:28: ( (kw= 'int' | kw= 'float' | kw= 'double' ) )
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:220:1: (kw= 'int' | kw= 'float' | kw= 'double' )
            {
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:220:1: (kw= 'int' | kw= 'float' | kw= 'double' )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt3=1;
                }
                break;
            case 14:
                {
                alt3=2;
                }
                break;
            case 15:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:221:2: kw= 'int'
                    {
                    kw=(Token)match(input,13,FOLLOW_13_in_ruleType460); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getIntKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:228:2: kw= 'float'
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleType479); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getFloatKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:235:2: kw= 'double'
                    {
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleType498); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getDoubleKeyword_2()); 
                        

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleOperation"
    // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:248:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:249:2: (iv_ruleOperation= ruleOperation EOF )
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:250:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_ruleOperation_in_entryRuleOperation538);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperation548); 

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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:257:1: ruleOperation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_calculation_2_0= ruleCalculation ) ) ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_calculation_2_0 = null;


         enterRule(); 
            
        try {
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:260:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_calculation_2_0= ruleCalculation ) ) ) )
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:261:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_calculation_2_0= ruleCalculation ) ) )
            {
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:261:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_calculation_2_0= ruleCalculation ) ) )
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:261:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_calculation_2_0= ruleCalculation ) )
            {
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:261:2: ( (otherlv_0= RULE_ID ) )
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:262:1: (otherlv_0= RULE_ID )
            {
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:262:1: (otherlv_0= RULE_ID )
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:263:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getOperationRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOperation593); 

            		newLeafNode(otherlv_0, grammarAccess.getOperationAccess().getVariableVariableCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleOperation605); 

                	newLeafNode(otherlv_1, grammarAccess.getOperationAccess().getEqualsSignKeyword_1());
                
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:278:1: ( (lv_calculation_2_0= ruleCalculation ) )
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:279:1: (lv_calculation_2_0= ruleCalculation )
            {
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:279:1: (lv_calculation_2_0= ruleCalculation )
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:280:3: lv_calculation_2_0= ruleCalculation
            {
             
            	        newCompositeNode(grammarAccess.getOperationAccess().getCalculationCalculationParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleCalculation_in_ruleOperation626);
            lv_calculation_2_0=ruleCalculation();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOperationRule());
            	        }
                   		set(
                   			current, 
                   			"calculation",
                    		lv_calculation_2_0, 
                    		"Calculation");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleCalculation"
    // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:304:1: entryRuleCalculation returns [EObject current=null] : iv_ruleCalculation= ruleCalculation EOF ;
    public final EObject entryRuleCalculation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCalculation = null;


        try {
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:305:2: (iv_ruleCalculation= ruleCalculation EOF )
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:306:2: iv_ruleCalculation= ruleCalculation EOF
            {
             newCompositeNode(grammarAccess.getCalculationRule()); 
            pushFollow(FOLLOW_ruleCalculation_in_entryRuleCalculation662);
            iv_ruleCalculation=ruleCalculation();

            state._fsp--;

             current =iv_ruleCalculation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCalculation672); 

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
    // $ANTLR end "entryRuleCalculation"


    // $ANTLR start "ruleCalculation"
    // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:313:1: ruleCalculation returns [EObject current=null] : ( ( (lv_init_0_0= ruleOperand ) ) ( ruleOperator ( (lv_vectors_2_0= ruleOperand ) ) )* otherlv_3= ';' ) ;
    public final EObject ruleCalculation() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject lv_init_0_0 = null;

        EObject lv_vectors_2_0 = null;


         enterRule(); 
            
        try {
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:316:28: ( ( ( (lv_init_0_0= ruleOperand ) ) ( ruleOperator ( (lv_vectors_2_0= ruleOperand ) ) )* otherlv_3= ';' ) )
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:317:1: ( ( (lv_init_0_0= ruleOperand ) ) ( ruleOperator ( (lv_vectors_2_0= ruleOperand ) ) )* otherlv_3= ';' )
            {
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:317:1: ( ( (lv_init_0_0= ruleOperand ) ) ( ruleOperator ( (lv_vectors_2_0= ruleOperand ) ) )* otherlv_3= ';' )
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:317:2: ( (lv_init_0_0= ruleOperand ) ) ( ruleOperator ( (lv_vectors_2_0= ruleOperand ) ) )* otherlv_3= ';'
            {
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:317:2: ( (lv_init_0_0= ruleOperand ) )
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:318:1: (lv_init_0_0= ruleOperand )
            {
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:318:1: (lv_init_0_0= ruleOperand )
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:319:3: lv_init_0_0= ruleOperand
            {
             
            	        newCompositeNode(grammarAccess.getCalculationAccess().getInitOperandParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleOperand_in_ruleCalculation718);
            lv_init_0_0=ruleOperand();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCalculationRule());
            	        }
                   		set(
                   			current, 
                   			"init",
                    		lv_init_0_0, 
                    		"Operand");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:335:2: ( ruleOperator ( (lv_vectors_2_0= ruleOperand ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=17 && LA4_0<=21)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:336:5: ruleOperator ( (lv_vectors_2_0= ruleOperand ) )
            	    {
            	     
            	            newCompositeNode(grammarAccess.getCalculationAccess().getOperatorParserRuleCall_1_0()); 
            	        
            	    pushFollow(FOLLOW_ruleOperator_in_ruleCalculation735);
            	    ruleOperator();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:343:1: ( (lv_vectors_2_0= ruleOperand ) )
            	    // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:344:1: (lv_vectors_2_0= ruleOperand )
            	    {
            	    // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:344:1: (lv_vectors_2_0= ruleOperand )
            	    // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:345:3: lv_vectors_2_0= ruleOperand
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCalculationAccess().getVectorsOperandParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOperand_in_ruleCalculation755);
            	    lv_vectors_2_0=ruleOperand();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCalculationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"vectors",
            	            		lv_vectors_2_0, 
            	            		"Operand");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleCalculation769); 

                	newLeafNode(otherlv_3, grammarAccess.getCalculationAccess().getSemicolonKeyword_2());
                

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
    // $ANTLR end "ruleCalculation"


    // $ANTLR start "entryRuleOperand"
    // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:373:1: entryRuleOperand returns [EObject current=null] : iv_ruleOperand= ruleOperand EOF ;
    public final EObject entryRuleOperand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperand = null;


        try {
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:374:2: (iv_ruleOperand= ruleOperand EOF )
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:375:2: iv_ruleOperand= ruleOperand EOF
            {
             newCompositeNode(grammarAccess.getOperandRule()); 
            pushFollow(FOLLOW_ruleOperand_in_entryRuleOperand805);
            iv_ruleOperand=ruleOperand();

            state._fsp--;

             current =iv_ruleOperand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperand815); 

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
    // $ANTLR end "entryRuleOperand"


    // $ANTLR start "ruleOperand"
    // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:382:1: ruleOperand returns [EObject current=null] : (this_Variable_0= ruleVariable | this_DOUBLE_1= RULE_DOUBLE | this_INT_2= RULE_INT ) ;
    public final EObject ruleOperand() throws RecognitionException {
        EObject current = null;

        Token this_DOUBLE_1=null;
        Token this_INT_2=null;
        EObject this_Variable_0 = null;


         enterRule(); 
            
        try {
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:385:28: ( (this_Variable_0= ruleVariable | this_DOUBLE_1= RULE_DOUBLE | this_INT_2= RULE_INT ) )
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:386:1: (this_Variable_0= ruleVariable | this_DOUBLE_1= RULE_DOUBLE | this_INT_2= RULE_INT )
            {
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:386:1: (this_Variable_0= ruleVariable | this_DOUBLE_1= RULE_DOUBLE | this_INT_2= RULE_INT )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt5=1;
                }
                break;
            case RULE_DOUBLE:
                {
                alt5=2;
                }
                break;
            case RULE_INT:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:387:5: this_Variable_0= ruleVariable
                    {
                     
                            newCompositeNode(grammarAccess.getOperandAccess().getVariableParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleVariable_in_ruleOperand862);
                    this_Variable_0=ruleVariable();

                    state._fsp--;

                     
                            current = this_Variable_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:396:6: this_DOUBLE_1= RULE_DOUBLE
                    {
                    this_DOUBLE_1=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleOperand878); 
                     
                        newLeafNode(this_DOUBLE_1, grammarAccess.getOperandAccess().getDOUBLETerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:401:6: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleOperand894); 
                     
                        newLeafNode(this_INT_2, grammarAccess.getOperandAccess().getINTTerminalRuleCall_2()); 
                        

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
    // $ANTLR end "ruleOperand"


    // $ANTLR start "entryRuleOperator"
    // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:413:1: entryRuleOperator returns [String current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final String entryRuleOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperator = null;


        try {
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:414:2: (iv_ruleOperator= ruleOperator EOF )
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:415:2: iv_ruleOperator= ruleOperator EOF
            {
             newCompositeNode(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_ruleOperator_in_entryRuleOperator930);
            iv_ruleOperator=ruleOperator();

            state._fsp--;

             current =iv_ruleOperator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperator941); 

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
    // $ANTLR end "entryRuleOperator"


    // $ANTLR start "ruleOperator"
    // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:422:1: ruleOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '/' | kw= '*' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:425:28: ( (kw= '+' | kw= '-' | kw= '/' | kw= '*' | kw= '%' ) )
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:426:1: (kw= '+' | kw= '-' | kw= '/' | kw= '*' | kw= '%' )
            {
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:426:1: (kw= '+' | kw= '-' | kw= '/' | kw= '*' | kw= '%' )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt6=1;
                }
                break;
            case 18:
                {
                alt6=2;
                }
                break;
            case 19:
                {
                alt6=3;
                }
                break;
            case 20:
                {
                alt6=4;
                }
                break;
            case 21:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:427:2: kw= '+'
                    {
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleOperator979); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOperatorAccess().getPlusSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:434:2: kw= '-'
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleOperator998); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOperatorAccess().getHyphenMinusKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:441:2: kw= '/'
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleOperator1017); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOperatorAccess().getSolidusKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:448:2: kw= '*'
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_ruleOperator1036); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOperatorAccess().getAsteriskKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:455:2: kw= '%'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleOperator1055); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOperatorAccess().getPercentSignKeyword_4()); 
                        

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
    // $ANTLR end "ruleOperator"


    // $ANTLR start "entryRuleVariable"
    // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:468:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:469:2: (iv_ruleVariable= ruleVariable EOF )
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:470:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable1095);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable1105); 

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:477:1: ruleVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:480:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:481:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:481:1: ( (lv_name_0_0= RULE_ID ) )
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:482:1: (lv_name_0_0= RULE_ID )
            {
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:482:1: (lv_name_0_0= RULE_ID )
            // ../fr.imta.tp.calcDSL/src-gen/fr/imta/tp/parser/antlr/internal/InternalCalcDSL.g:483:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable1146); 

            			newLeafNode(lv_name_0_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVariableRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleVariable"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleCalcDSL_in_entryRuleCalcDSL75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCalcDSL85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleCalcDSL130 = new BitSet(new long[]{0x000000000000E012L});
    public static final BitSet FOLLOW_ruleInstruction_in_entryRuleInstruction166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstruction176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleInstruction223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_ruleInstruction250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleDeclaration341 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleDeclaration362 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDeclaration374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType411 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleType460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleType479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleType498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation538 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperation548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOperation593 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleOperation605 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleCalculation_in_ruleOperation626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCalculation_in_entryRuleCalculation662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCalculation672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperand_in_ruleCalculation718 = new BitSet(new long[]{0x00000000003E1000L});
    public static final BitSet FOLLOW_ruleOperator_in_ruleCalculation735 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleOperand_in_ruleCalculation755 = new BitSet(new long[]{0x00000000003E1000L});
    public static final BitSet FOLLOW_12_in_ruleCalculation769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperand_in_entryRuleOperand805 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperand815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleOperand862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleOperand878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleOperand894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperator_in_entryRuleOperator930 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperator941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleOperator979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleOperator998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleOperator1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleOperator1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleOperator1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable1095 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable1105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable1146 = new BitSet(new long[]{0x0000000000000002L});

}