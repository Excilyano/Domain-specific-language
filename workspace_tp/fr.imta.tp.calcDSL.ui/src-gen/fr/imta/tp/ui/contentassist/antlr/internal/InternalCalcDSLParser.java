package fr.imta.tp.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import fr.imta.tp.services.CalcDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCalcDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOUBLE", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'int'", "'float'", "'double'", "'+'", "'-'", "'/'", "'*'", "'%'", "';'", "'='"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int RULE_DOUBLE=4;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=5;
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
    public String getGrammarFileName() { return "../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g"; }


     
     	private CalcDSLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(CalcDSLGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleCalcDSL"
    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:60:1: entryRuleCalcDSL : ruleCalcDSL EOF ;
    public final void entryRuleCalcDSL() throws RecognitionException {
        try {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:61:1: ( ruleCalcDSL EOF )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:62:1: ruleCalcDSL EOF
            {
             before(grammarAccess.getCalcDSLRule()); 
            pushFollow(FOLLOW_ruleCalcDSL_in_entryRuleCalcDSL61);
            ruleCalcDSL();

            state._fsp--;

             after(grammarAccess.getCalcDSLRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCalcDSL68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCalcDSL"


    // $ANTLR start "ruleCalcDSL"
    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:69:1: ruleCalcDSL : ( ( rule__CalcDSL__InstructionsAssignment )* ) ;
    public final void ruleCalcDSL() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:73:2: ( ( ( rule__CalcDSL__InstructionsAssignment )* ) )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:74:1: ( ( rule__CalcDSL__InstructionsAssignment )* )
            {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:74:1: ( ( rule__CalcDSL__InstructionsAssignment )* )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:75:1: ( rule__CalcDSL__InstructionsAssignment )*
            {
             before(grammarAccess.getCalcDSLAccess().getInstructionsAssignment()); 
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:76:1: ( rule__CalcDSL__InstructionsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||(LA1_0>=12 && LA1_0<=14)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:76:2: rule__CalcDSL__InstructionsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__CalcDSL__InstructionsAssignment_in_ruleCalcDSL94);
            	    rule__CalcDSL__InstructionsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getCalcDSLAccess().getInstructionsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCalcDSL"


    // $ANTLR start "entryRuleInstruction"
    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:88:1: entryRuleInstruction : ruleInstruction EOF ;
    public final void entryRuleInstruction() throws RecognitionException {
        try {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:89:1: ( ruleInstruction EOF )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:90:1: ruleInstruction EOF
            {
             before(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_ruleInstruction_in_entryRuleInstruction122);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getInstructionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstruction129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:97:1: ruleInstruction : ( ( rule__Instruction__Alternatives ) ) ;
    public final void ruleInstruction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:101:2: ( ( ( rule__Instruction__Alternatives ) ) )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:102:1: ( ( rule__Instruction__Alternatives ) )
            {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:102:1: ( ( rule__Instruction__Alternatives ) )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:103:1: ( rule__Instruction__Alternatives )
            {
             before(grammarAccess.getInstructionAccess().getAlternatives()); 
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:104:1: ( rule__Instruction__Alternatives )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:104:2: rule__Instruction__Alternatives
            {
            pushFollow(FOLLOW_rule__Instruction__Alternatives_in_ruleInstruction155);
            rule__Instruction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInstructionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleDeclaration"
    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:116:1: entryRuleDeclaration : ruleDeclaration EOF ;
    public final void entryRuleDeclaration() throws RecognitionException {
        try {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:117:1: ( ruleDeclaration EOF )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:118:1: ruleDeclaration EOF
            {
             before(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration182);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:125:1: ruleDeclaration : ( ( rule__Declaration__Group__0 ) ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:129:2: ( ( ( rule__Declaration__Group__0 ) ) )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:130:1: ( ( rule__Declaration__Group__0 ) )
            {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:130:1: ( ( rule__Declaration__Group__0 ) )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:131:1: ( rule__Declaration__Group__0 )
            {
             before(grammarAccess.getDeclarationAccess().getGroup()); 
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:132:1: ( rule__Declaration__Group__0 )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:132:2: rule__Declaration__Group__0
            {
            pushFollow(FOLLOW_rule__Declaration__Group__0_in_ruleDeclaration215);
            rule__Declaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleType"
    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:144:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:145:1: ( ruleType EOF )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:146:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType242);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType249); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:153:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:157:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:158:1: ( ( rule__Type__Alternatives ) )
            {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:158:1: ( ( rule__Type__Alternatives ) )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:159:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:160:1: ( rule__Type__Alternatives )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:160:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType275);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleOperation"
    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:172:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:173:1: ( ruleOperation EOF )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:174:1: ruleOperation EOF
            {
             before(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_ruleOperation_in_entryRuleOperation302);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getOperationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperation309); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:181:1: ruleOperation : ( ( rule__Operation__Group__0 ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:185:2: ( ( ( rule__Operation__Group__0 ) ) )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:186:1: ( ( rule__Operation__Group__0 ) )
            {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:186:1: ( ( rule__Operation__Group__0 ) )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:187:1: ( rule__Operation__Group__0 )
            {
             before(grammarAccess.getOperationAccess().getGroup()); 
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:188:1: ( rule__Operation__Group__0 )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:188:2: rule__Operation__Group__0
            {
            pushFollow(FOLLOW_rule__Operation__Group__0_in_ruleOperation335);
            rule__Operation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleCalculation"
    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:200:1: entryRuleCalculation : ruleCalculation EOF ;
    public final void entryRuleCalculation() throws RecognitionException {
        try {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:201:1: ( ruleCalculation EOF )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:202:1: ruleCalculation EOF
            {
             before(grammarAccess.getCalculationRule()); 
            pushFollow(FOLLOW_ruleCalculation_in_entryRuleCalculation362);
            ruleCalculation();

            state._fsp--;

             after(grammarAccess.getCalculationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCalculation369); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCalculation"


    // $ANTLR start "ruleCalculation"
    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:209:1: ruleCalculation : ( ( rule__Calculation__Group__0 ) ) ;
    public final void ruleCalculation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:213:2: ( ( ( rule__Calculation__Group__0 ) ) )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:214:1: ( ( rule__Calculation__Group__0 ) )
            {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:214:1: ( ( rule__Calculation__Group__0 ) )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:215:1: ( rule__Calculation__Group__0 )
            {
             before(grammarAccess.getCalculationAccess().getGroup()); 
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:216:1: ( rule__Calculation__Group__0 )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:216:2: rule__Calculation__Group__0
            {
            pushFollow(FOLLOW_rule__Calculation__Group__0_in_ruleCalculation395);
            rule__Calculation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCalculationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCalculation"


    // $ANTLR start "entryRuleOperand"
    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:228:1: entryRuleOperand : ruleOperand EOF ;
    public final void entryRuleOperand() throws RecognitionException {
        try {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:229:1: ( ruleOperand EOF )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:230:1: ruleOperand EOF
            {
             before(grammarAccess.getOperandRule()); 
            pushFollow(FOLLOW_ruleOperand_in_entryRuleOperand422);
            ruleOperand();

            state._fsp--;

             after(grammarAccess.getOperandRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperand429); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperand"


    // $ANTLR start "ruleOperand"
    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:237:1: ruleOperand : ( ( rule__Operand__Alternatives ) ) ;
    public final void ruleOperand() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:241:2: ( ( ( rule__Operand__Alternatives ) ) )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:242:1: ( ( rule__Operand__Alternatives ) )
            {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:242:1: ( ( rule__Operand__Alternatives ) )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:243:1: ( rule__Operand__Alternatives )
            {
             before(grammarAccess.getOperandAccess().getAlternatives()); 
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:244:1: ( rule__Operand__Alternatives )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:244:2: rule__Operand__Alternatives
            {
            pushFollow(FOLLOW_rule__Operand__Alternatives_in_ruleOperand455);
            rule__Operand__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperandAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperand"


    // $ANTLR start "entryRuleOperator"
    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:256:1: entryRuleOperator : ruleOperator EOF ;
    public final void entryRuleOperator() throws RecognitionException {
        try {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:257:1: ( ruleOperator EOF )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:258:1: ruleOperator EOF
            {
             before(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_ruleOperator_in_entryRuleOperator482);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getOperatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperator489); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperator"


    // $ANTLR start "ruleOperator"
    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:265:1: ruleOperator : ( ( rule__Operator__Alternatives ) ) ;
    public final void ruleOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:269:2: ( ( ( rule__Operator__Alternatives ) ) )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:270:1: ( ( rule__Operator__Alternatives ) )
            {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:270:1: ( ( rule__Operator__Alternatives ) )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:271:1: ( rule__Operator__Alternatives )
            {
             before(grammarAccess.getOperatorAccess().getAlternatives()); 
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:272:1: ( rule__Operator__Alternatives )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:272:2: rule__Operator__Alternatives
            {
            pushFollow(FOLLOW_rule__Operator__Alternatives_in_ruleOperator515);
            rule__Operator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperator"


    // $ANTLR start "entryRuleVariable"
    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:284:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:285:1: ( ruleVariable EOF )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:286:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable542);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable549); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:293:1: ruleVariable : ( ( rule__Variable__NameAssignment ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:297:2: ( ( ( rule__Variable__NameAssignment ) ) )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:298:1: ( ( rule__Variable__NameAssignment ) )
            {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:298:1: ( ( rule__Variable__NameAssignment ) )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:299:1: ( rule__Variable__NameAssignment )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment()); 
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:300:1: ( rule__Variable__NameAssignment )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:300:2: rule__Variable__NameAssignment
            {
            pushFollow(FOLLOW_rule__Variable__NameAssignment_in_ruleVariable575);
            rule__Variable__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "rule__Instruction__Alternatives"
    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:312:1: rule__Instruction__Alternatives : ( ( ruleDeclaration ) | ( ruleOperation ) );
    public final void rule__Instruction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:316:1: ( ( ruleDeclaration ) | ( ruleOperation ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=12 && LA2_0<=14)) ) {
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
                    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:317:1: ( ruleDeclaration )
                    {
                    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:317:1: ( ruleDeclaration )
                    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:318:1: ruleDeclaration
                    {
                     before(grammarAccess.getInstructionAccess().getDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDeclaration_in_rule__Instruction__Alternatives611);
                    ruleDeclaration();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:323:6: ( ruleOperation )
                    {
                    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:323:6: ( ruleOperation )
                    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:324:1: ruleOperation
                    {
                     before(grammarAccess.getInstructionAccess().getOperationParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleOperation_in_rule__Instruction__Alternatives628);
                    ruleOperation();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getOperationParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:334:1: rule__Type__Alternatives : ( ( 'int' ) | ( 'float' ) | ( 'double' ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:338:1: ( ( 'int' ) | ( 'float' ) | ( 'double' ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt3=1;
                }
                break;
            case 13:
                {
                alt3=2;
                }
                break;
            case 14:
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
                    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:339:1: ( 'int' )
                    {
                    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:339:1: ( 'int' )
                    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:340:1: 'int'
                    {
                     before(grammarAccess.getTypeAccess().getIntKeyword_0()); 
                    match(input,12,FOLLOW_12_in_rule__Type__Alternatives661); 
                     after(grammarAccess.getTypeAccess().getIntKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:347:6: ( 'float' )
                    {
                    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:347:6: ( 'float' )
                    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:348:1: 'float'
                    {
                     before(grammarAccess.getTypeAccess().getFloatKeyword_1()); 
                    match(input,13,FOLLOW_13_in_rule__Type__Alternatives681); 
                     after(grammarAccess.getTypeAccess().getFloatKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:355:6: ( 'double' )
                    {
                    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:355:6: ( 'double' )
                    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:356:1: 'double'
                    {
                     before(grammarAccess.getTypeAccess().getDoubleKeyword_2()); 
                    match(input,14,FOLLOW_14_in_rule__Type__Alternatives701); 
                     after(grammarAccess.getTypeAccess().getDoubleKeyword_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Operand__Alternatives"
    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:368:1: rule__Operand__Alternatives : ( ( ruleVariable ) | ( RULE_DOUBLE ) | ( RULE_INT ) );
    public final void rule__Operand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:372:1: ( ( ruleVariable ) | ( RULE_DOUBLE ) | ( RULE_INT ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt4=1;
                }
                break;
            case RULE_DOUBLE:
                {
                alt4=2;
                }
                break;
            case RULE_INT:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:373:1: ( ruleVariable )
                    {
                    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:373:1: ( ruleVariable )
                    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:374:1: ruleVariable
                    {
                     before(grammarAccess.getOperandAccess().getVariableParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleVariable_in_rule__Operand__Alternatives735);
                    ruleVariable();

                    state._fsp--;

                     after(grammarAccess.getOperandAccess().getVariableParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:379:6: ( RULE_DOUBLE )
                    {
                    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:379:6: ( RULE_DOUBLE )
                    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:380:1: RULE_DOUBLE
                    {
                     before(grammarAccess.getOperandAccess().getDOUBLETerminalRuleCall_1()); 
                    match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_rule__Operand__Alternatives752); 
                     after(grammarAccess.getOperandAccess().getDOUBLETerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:385:6: ( RULE_INT )
                    {
                    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:385:6: ( RULE_INT )
                    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:386:1: RULE_INT
                    {
                     before(grammarAccess.getOperandAccess().getINTTerminalRuleCall_2()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Operand__Alternatives769); 
                     after(grammarAccess.getOperandAccess().getINTTerminalRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operand__Alternatives"


    // $ANTLR start "rule__Operator__Alternatives"
    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:396:1: rule__Operator__Alternatives : ( ( '+' ) | ( '-' ) | ( '/' ) | ( '*' ) | ( '%' ) );
    public final void rule__Operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:400:1: ( ( '+' ) | ( '-' ) | ( '/' ) | ( '*' ) | ( '%' ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt5=1;
                }
                break;
            case 16:
                {
                alt5=2;
                }
                break;
            case 17:
                {
                alt5=3;
                }
                break;
            case 18:
                {
                alt5=4;
                }
                break;
            case 19:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:401:1: ( '+' )
                    {
                    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:401:1: ( '+' )
                    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:402:1: '+'
                    {
                     before(grammarAccess.getOperatorAccess().getPlusSignKeyword_0()); 
                    match(input,15,FOLLOW_15_in_rule__Operator__Alternatives802); 
                     after(grammarAccess.getOperatorAccess().getPlusSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:409:6: ( '-' )
                    {
                    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:409:6: ( '-' )
                    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:410:1: '-'
                    {
                     before(grammarAccess.getOperatorAccess().getHyphenMinusKeyword_1()); 
                    match(input,16,FOLLOW_16_in_rule__Operator__Alternatives822); 
                     after(grammarAccess.getOperatorAccess().getHyphenMinusKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:417:6: ( '/' )
                    {
                    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:417:6: ( '/' )
                    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:418:1: '/'
                    {
                     before(grammarAccess.getOperatorAccess().getSolidusKeyword_2()); 
                    match(input,17,FOLLOW_17_in_rule__Operator__Alternatives842); 
                     after(grammarAccess.getOperatorAccess().getSolidusKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:425:6: ( '*' )
                    {
                    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:425:6: ( '*' )
                    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:426:1: '*'
                    {
                     before(grammarAccess.getOperatorAccess().getAsteriskKeyword_3()); 
                    match(input,18,FOLLOW_18_in_rule__Operator__Alternatives862); 
                     after(grammarAccess.getOperatorAccess().getAsteriskKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:433:6: ( '%' )
                    {
                    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:433:6: ( '%' )
                    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:434:1: '%'
                    {
                     before(grammarAccess.getOperatorAccess().getPercentSignKeyword_4()); 
                    match(input,19,FOLLOW_19_in_rule__Operator__Alternatives882); 
                     after(grammarAccess.getOperatorAccess().getPercentSignKeyword_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Alternatives"


    // $ANTLR start "rule__Declaration__Group__0"
    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:448:1: rule__Declaration__Group__0 : rule__Declaration__Group__0__Impl rule__Declaration__Group__1 ;
    public final void rule__Declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:452:1: ( rule__Declaration__Group__0__Impl rule__Declaration__Group__1 )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:453:2: rule__Declaration__Group__0__Impl rule__Declaration__Group__1
            {
            pushFollow(FOLLOW_rule__Declaration__Group__0__Impl_in_rule__Declaration__Group__0914);
            rule__Declaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__1_in_rule__Declaration__Group__0917);
            rule__Declaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__0"


    // $ANTLR start "rule__Declaration__Group__0__Impl"
    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:460:1: rule__Declaration__Group__0__Impl : ( ( rule__Declaration__TypeAssignment_0 ) ) ;
    public final void rule__Declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:464:1: ( ( ( rule__Declaration__TypeAssignment_0 ) ) )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:465:1: ( ( rule__Declaration__TypeAssignment_0 ) )
            {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:465:1: ( ( rule__Declaration__TypeAssignment_0 ) )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:466:1: ( rule__Declaration__TypeAssignment_0 )
            {
             before(grammarAccess.getDeclarationAccess().getTypeAssignment_0()); 
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:467:1: ( rule__Declaration__TypeAssignment_0 )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:467:2: rule__Declaration__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Declaration__TypeAssignment_0_in_rule__Declaration__Group__0__Impl944);
            rule__Declaration__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__0__Impl"


    // $ANTLR start "rule__Declaration__Group__1"
    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:477:1: rule__Declaration__Group__1 : rule__Declaration__Group__1__Impl rule__Declaration__Group__2 ;
    public final void rule__Declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:481:1: ( rule__Declaration__Group__1__Impl rule__Declaration__Group__2 )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:482:2: rule__Declaration__Group__1__Impl rule__Declaration__Group__2
            {
            pushFollow(FOLLOW_rule__Declaration__Group__1__Impl_in_rule__Declaration__Group__1974);
            rule__Declaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__2_in_rule__Declaration__Group__1977);
            rule__Declaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__1"


    // $ANTLR start "rule__Declaration__Group__1__Impl"
    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:489:1: rule__Declaration__Group__1__Impl : ( ( rule__Declaration__VariableAssignment_1 ) ) ;
    public final void rule__Declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:493:1: ( ( ( rule__Declaration__VariableAssignment_1 ) ) )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:494:1: ( ( rule__Declaration__VariableAssignment_1 ) )
            {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:494:1: ( ( rule__Declaration__VariableAssignment_1 ) )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:495:1: ( rule__Declaration__VariableAssignment_1 )
            {
             before(grammarAccess.getDeclarationAccess().getVariableAssignment_1()); 
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:496:1: ( rule__Declaration__VariableAssignment_1 )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:496:2: rule__Declaration__VariableAssignment_1
            {
            pushFollow(FOLLOW_rule__Declaration__VariableAssignment_1_in_rule__Declaration__Group__1__Impl1004);
            rule__Declaration__VariableAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getVariableAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__1__Impl"


    // $ANTLR start "rule__Declaration__Group__2"
    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:506:1: rule__Declaration__Group__2 : rule__Declaration__Group__2__Impl ;
    public final void rule__Declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:510:1: ( rule__Declaration__Group__2__Impl )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:511:2: rule__Declaration__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Declaration__Group__2__Impl_in_rule__Declaration__Group__21034);
            rule__Declaration__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__2"


    // $ANTLR start "rule__Declaration__Group__2__Impl"
    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:517:1: rule__Declaration__Group__2__Impl : ( ';' ) ;
    public final void rule__Declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:521:1: ( ( ';' ) )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:522:1: ( ';' )
            {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:522:1: ( ';' )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:523:1: ';'
            {
             before(grammarAccess.getDeclarationAccess().getSemicolonKeyword_2()); 
            match(input,20,FOLLOW_20_in_rule__Declaration__Group__2__Impl1062); 
             after(grammarAccess.getDeclarationAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__2__Impl"


    // $ANTLR start "rule__Operation__Group__0"
    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:542:1: rule__Operation__Group__0 : rule__Operation__Group__0__Impl rule__Operation__Group__1 ;
    public final void rule__Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:546:1: ( rule__Operation__Group__0__Impl rule__Operation__Group__1 )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:547:2: rule__Operation__Group__0__Impl rule__Operation__Group__1
            {
            pushFollow(FOLLOW_rule__Operation__Group__0__Impl_in_rule__Operation__Group__01099);
            rule__Operation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__1_in_rule__Operation__Group__01102);
            rule__Operation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__0"


    // $ANTLR start "rule__Operation__Group__0__Impl"
    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:554:1: rule__Operation__Group__0__Impl : ( ( rule__Operation__VariableAssignment_0 ) ) ;
    public final void rule__Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:558:1: ( ( ( rule__Operation__VariableAssignment_0 ) ) )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:559:1: ( ( rule__Operation__VariableAssignment_0 ) )
            {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:559:1: ( ( rule__Operation__VariableAssignment_0 ) )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:560:1: ( rule__Operation__VariableAssignment_0 )
            {
             before(grammarAccess.getOperationAccess().getVariableAssignment_0()); 
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:561:1: ( rule__Operation__VariableAssignment_0 )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:561:2: rule__Operation__VariableAssignment_0
            {
            pushFollow(FOLLOW_rule__Operation__VariableAssignment_0_in_rule__Operation__Group__0__Impl1129);
            rule__Operation__VariableAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getVariableAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__0__Impl"


    // $ANTLR start "rule__Operation__Group__1"
    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:571:1: rule__Operation__Group__1 : rule__Operation__Group__1__Impl rule__Operation__Group__2 ;
    public final void rule__Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:575:1: ( rule__Operation__Group__1__Impl rule__Operation__Group__2 )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:576:2: rule__Operation__Group__1__Impl rule__Operation__Group__2
            {
            pushFollow(FOLLOW_rule__Operation__Group__1__Impl_in_rule__Operation__Group__11159);
            rule__Operation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__2_in_rule__Operation__Group__11162);
            rule__Operation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__1"


    // $ANTLR start "rule__Operation__Group__1__Impl"
    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:583:1: rule__Operation__Group__1__Impl : ( '=' ) ;
    public final void rule__Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:587:1: ( ( '=' ) )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:588:1: ( '=' )
            {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:588:1: ( '=' )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:589:1: '='
            {
             before(grammarAccess.getOperationAccess().getEqualsSignKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__Operation__Group__1__Impl1190); 
             after(grammarAccess.getOperationAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__1__Impl"


    // $ANTLR start "rule__Operation__Group__2"
    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:602:1: rule__Operation__Group__2 : rule__Operation__Group__2__Impl ;
    public final void rule__Operation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:606:1: ( rule__Operation__Group__2__Impl )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:607:2: rule__Operation__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Operation__Group__2__Impl_in_rule__Operation__Group__21221);
            rule__Operation__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__2"


    // $ANTLR start "rule__Operation__Group__2__Impl"
    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:613:1: rule__Operation__Group__2__Impl : ( ( rule__Operation__CalculationAssignment_2 ) ) ;
    public final void rule__Operation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:617:1: ( ( ( rule__Operation__CalculationAssignment_2 ) ) )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:618:1: ( ( rule__Operation__CalculationAssignment_2 ) )
            {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:618:1: ( ( rule__Operation__CalculationAssignment_2 ) )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:619:1: ( rule__Operation__CalculationAssignment_2 )
            {
             before(grammarAccess.getOperationAccess().getCalculationAssignment_2()); 
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:620:1: ( rule__Operation__CalculationAssignment_2 )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:620:2: rule__Operation__CalculationAssignment_2
            {
            pushFollow(FOLLOW_rule__Operation__CalculationAssignment_2_in_rule__Operation__Group__2__Impl1248);
            rule__Operation__CalculationAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getCalculationAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__2__Impl"


    // $ANTLR start "rule__Calculation__Group__0"
    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:636:1: rule__Calculation__Group__0 : rule__Calculation__Group__0__Impl rule__Calculation__Group__1 ;
    public final void rule__Calculation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:640:1: ( rule__Calculation__Group__0__Impl rule__Calculation__Group__1 )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:641:2: rule__Calculation__Group__0__Impl rule__Calculation__Group__1
            {
            pushFollow(FOLLOW_rule__Calculation__Group__0__Impl_in_rule__Calculation__Group__01284);
            rule__Calculation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calculation__Group__1_in_rule__Calculation__Group__01287);
            rule__Calculation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculation__Group__0"


    // $ANTLR start "rule__Calculation__Group__0__Impl"
    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:648:1: rule__Calculation__Group__0__Impl : ( ( rule__Calculation__InitAssignment_0 ) ) ;
    public final void rule__Calculation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:652:1: ( ( ( rule__Calculation__InitAssignment_0 ) ) )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:653:1: ( ( rule__Calculation__InitAssignment_0 ) )
            {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:653:1: ( ( rule__Calculation__InitAssignment_0 ) )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:654:1: ( rule__Calculation__InitAssignment_0 )
            {
             before(grammarAccess.getCalculationAccess().getInitAssignment_0()); 
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:655:1: ( rule__Calculation__InitAssignment_0 )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:655:2: rule__Calculation__InitAssignment_0
            {
            pushFollow(FOLLOW_rule__Calculation__InitAssignment_0_in_rule__Calculation__Group__0__Impl1314);
            rule__Calculation__InitAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCalculationAccess().getInitAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculation__Group__0__Impl"


    // $ANTLR start "rule__Calculation__Group__1"
    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:665:1: rule__Calculation__Group__1 : rule__Calculation__Group__1__Impl rule__Calculation__Group__2 ;
    public final void rule__Calculation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:669:1: ( rule__Calculation__Group__1__Impl rule__Calculation__Group__2 )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:670:2: rule__Calculation__Group__1__Impl rule__Calculation__Group__2
            {
            pushFollow(FOLLOW_rule__Calculation__Group__1__Impl_in_rule__Calculation__Group__11344);
            rule__Calculation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calculation__Group__2_in_rule__Calculation__Group__11347);
            rule__Calculation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculation__Group__1"


    // $ANTLR start "rule__Calculation__Group__1__Impl"
    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:677:1: rule__Calculation__Group__1__Impl : ( ( rule__Calculation__Group_1__0 )* ) ;
    public final void rule__Calculation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:681:1: ( ( ( rule__Calculation__Group_1__0 )* ) )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:682:1: ( ( rule__Calculation__Group_1__0 )* )
            {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:682:1: ( ( rule__Calculation__Group_1__0 )* )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:683:1: ( rule__Calculation__Group_1__0 )*
            {
             before(grammarAccess.getCalculationAccess().getGroup_1()); 
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:684:1: ( rule__Calculation__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=15 && LA6_0<=19)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:684:2: rule__Calculation__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Calculation__Group_1__0_in_rule__Calculation__Group__1__Impl1374);
            	    rule__Calculation__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getCalculationAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculation__Group__1__Impl"


    // $ANTLR start "rule__Calculation__Group__2"
    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:694:1: rule__Calculation__Group__2 : rule__Calculation__Group__2__Impl ;
    public final void rule__Calculation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:698:1: ( rule__Calculation__Group__2__Impl )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:699:2: rule__Calculation__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Calculation__Group__2__Impl_in_rule__Calculation__Group__21405);
            rule__Calculation__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculation__Group__2"


    // $ANTLR start "rule__Calculation__Group__2__Impl"
    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:705:1: rule__Calculation__Group__2__Impl : ( ';' ) ;
    public final void rule__Calculation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:709:1: ( ( ';' ) )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:710:1: ( ';' )
            {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:710:1: ( ';' )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:711:1: ';'
            {
             before(grammarAccess.getCalculationAccess().getSemicolonKeyword_2()); 
            match(input,20,FOLLOW_20_in_rule__Calculation__Group__2__Impl1433); 
             after(grammarAccess.getCalculationAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculation__Group__2__Impl"


    // $ANTLR start "rule__Calculation__Group_1__0"
    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:730:1: rule__Calculation__Group_1__0 : rule__Calculation__Group_1__0__Impl rule__Calculation__Group_1__1 ;
    public final void rule__Calculation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:734:1: ( rule__Calculation__Group_1__0__Impl rule__Calculation__Group_1__1 )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:735:2: rule__Calculation__Group_1__0__Impl rule__Calculation__Group_1__1
            {
            pushFollow(FOLLOW_rule__Calculation__Group_1__0__Impl_in_rule__Calculation__Group_1__01470);
            rule__Calculation__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calculation__Group_1__1_in_rule__Calculation__Group_1__01473);
            rule__Calculation__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculation__Group_1__0"


    // $ANTLR start "rule__Calculation__Group_1__0__Impl"
    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:742:1: rule__Calculation__Group_1__0__Impl : ( ruleOperator ) ;
    public final void rule__Calculation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:746:1: ( ( ruleOperator ) )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:747:1: ( ruleOperator )
            {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:747:1: ( ruleOperator )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:748:1: ruleOperator
            {
             before(grammarAccess.getCalculationAccess().getOperatorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleOperator_in_rule__Calculation__Group_1__0__Impl1500);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getCalculationAccess().getOperatorParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculation__Group_1__0__Impl"


    // $ANTLR start "rule__Calculation__Group_1__1"
    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:759:1: rule__Calculation__Group_1__1 : rule__Calculation__Group_1__1__Impl ;
    public final void rule__Calculation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:763:1: ( rule__Calculation__Group_1__1__Impl )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:764:2: rule__Calculation__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Calculation__Group_1__1__Impl_in_rule__Calculation__Group_1__11529);
            rule__Calculation__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculation__Group_1__1"


    // $ANTLR start "rule__Calculation__Group_1__1__Impl"
    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:770:1: rule__Calculation__Group_1__1__Impl : ( ( rule__Calculation__VectorsAssignment_1_1 ) ) ;
    public final void rule__Calculation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:774:1: ( ( ( rule__Calculation__VectorsAssignment_1_1 ) ) )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:775:1: ( ( rule__Calculation__VectorsAssignment_1_1 ) )
            {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:775:1: ( ( rule__Calculation__VectorsAssignment_1_1 ) )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:776:1: ( rule__Calculation__VectorsAssignment_1_1 )
            {
             before(grammarAccess.getCalculationAccess().getVectorsAssignment_1_1()); 
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:777:1: ( rule__Calculation__VectorsAssignment_1_1 )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:777:2: rule__Calculation__VectorsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Calculation__VectorsAssignment_1_1_in_rule__Calculation__Group_1__1__Impl1556);
            rule__Calculation__VectorsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCalculationAccess().getVectorsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculation__Group_1__1__Impl"


    // $ANTLR start "rule__CalcDSL__InstructionsAssignment"
    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:792:1: rule__CalcDSL__InstructionsAssignment : ( ruleInstruction ) ;
    public final void rule__CalcDSL__InstructionsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:796:1: ( ( ruleInstruction ) )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:797:1: ( ruleInstruction )
            {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:797:1: ( ruleInstruction )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:798:1: ruleInstruction
            {
             before(grammarAccess.getCalcDSLAccess().getInstructionsInstructionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleInstruction_in_rule__CalcDSL__InstructionsAssignment1595);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getCalcDSLAccess().getInstructionsInstructionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalcDSL__InstructionsAssignment"


    // $ANTLR start "rule__Declaration__TypeAssignment_0"
    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:807:1: rule__Declaration__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__Declaration__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:811:1: ( ( ruleType ) )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:812:1: ( ruleType )
            {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:812:1: ( ruleType )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:813:1: ruleType
            {
             before(grammarAccess.getDeclarationAccess().getTypeTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Declaration__TypeAssignment_01626);
            ruleType();

            state._fsp--;

             after(grammarAccess.getDeclarationAccess().getTypeTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__TypeAssignment_0"


    // $ANTLR start "rule__Declaration__VariableAssignment_1"
    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:822:1: rule__Declaration__VariableAssignment_1 : ( ruleVariable ) ;
    public final void rule__Declaration__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:826:1: ( ( ruleVariable ) )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:827:1: ( ruleVariable )
            {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:827:1: ( ruleVariable )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:828:1: ruleVariable
            {
             before(grammarAccess.getDeclarationAccess().getVariableVariableParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleVariable_in_rule__Declaration__VariableAssignment_11657);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getDeclarationAccess().getVariableVariableParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__VariableAssignment_1"


    // $ANTLR start "rule__Operation__VariableAssignment_0"
    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:837:1: rule__Operation__VariableAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Operation__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:841:1: ( ( ( RULE_ID ) ) )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:842:1: ( ( RULE_ID ) )
            {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:842:1: ( ( RULE_ID ) )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:843:1: ( RULE_ID )
            {
             before(grammarAccess.getOperationAccess().getVariableVariableCrossReference_0_0()); 
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:844:1: ( RULE_ID )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:845:1: RULE_ID
            {
             before(grammarAccess.getOperationAccess().getVariableVariableIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Operation__VariableAssignment_01692); 
             after(grammarAccess.getOperationAccess().getVariableVariableIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getOperationAccess().getVariableVariableCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__VariableAssignment_0"


    // $ANTLR start "rule__Operation__CalculationAssignment_2"
    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:856:1: rule__Operation__CalculationAssignment_2 : ( ruleCalculation ) ;
    public final void rule__Operation__CalculationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:860:1: ( ( ruleCalculation ) )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:861:1: ( ruleCalculation )
            {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:861:1: ( ruleCalculation )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:862:1: ruleCalculation
            {
             before(grammarAccess.getOperationAccess().getCalculationCalculationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleCalculation_in_rule__Operation__CalculationAssignment_21727);
            ruleCalculation();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getCalculationCalculationParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__CalculationAssignment_2"


    // $ANTLR start "rule__Calculation__InitAssignment_0"
    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:871:1: rule__Calculation__InitAssignment_0 : ( ruleOperand ) ;
    public final void rule__Calculation__InitAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:875:1: ( ( ruleOperand ) )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:876:1: ( ruleOperand )
            {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:876:1: ( ruleOperand )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:877:1: ruleOperand
            {
             before(grammarAccess.getCalculationAccess().getInitOperandParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleOperand_in_rule__Calculation__InitAssignment_01758);
            ruleOperand();

            state._fsp--;

             after(grammarAccess.getCalculationAccess().getInitOperandParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculation__InitAssignment_0"


    // $ANTLR start "rule__Calculation__VectorsAssignment_1_1"
    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:886:1: rule__Calculation__VectorsAssignment_1_1 : ( ruleOperand ) ;
    public final void rule__Calculation__VectorsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:890:1: ( ( ruleOperand ) )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:891:1: ( ruleOperand )
            {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:891:1: ( ruleOperand )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:892:1: ruleOperand
            {
             before(grammarAccess.getCalculationAccess().getVectorsOperandParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleOperand_in_rule__Calculation__VectorsAssignment_1_11789);
            ruleOperand();

            state._fsp--;

             after(grammarAccess.getCalculationAccess().getVectorsOperandParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculation__VectorsAssignment_1_1"


    // $ANTLR start "rule__Variable__NameAssignment"
    // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:901:1: rule__Variable__NameAssignment : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:905:1: ( ( RULE_ID ) )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:906:1: ( RULE_ID )
            {
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:906:1: ( RULE_ID )
            // ../fr.imta.tp.calcDSL.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalCalcDSL.g:907:1: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Variable__NameAssignment1820); 
             after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__NameAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleCalcDSL_in_entryRuleCalcDSL61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCalcDSL68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CalcDSL__InstructionsAssignment_in_ruleCalcDSL94 = new BitSet(new long[]{0x0000000000007042L});
    public static final BitSet FOLLOW_ruleInstruction_in_entryRuleInstruction122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstruction129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__Alternatives_in_ruleInstruction155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__0_in_ruleDeclaration215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperation309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__0_in_ruleOperation335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCalculation_in_entryRuleCalculation362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCalculation369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculation__Group__0_in_ruleCalculation395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperand_in_entryRuleOperand422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperand429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operand__Alternatives_in_ruleOperand455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperator_in_entryRuleOperator482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperator489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operator__Alternatives_in_ruleOperator515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__NameAssignment_in_ruleVariable575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_rule__Instruction__Alternatives611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_rule__Instruction__Alternatives628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Type__Alternatives661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Type__Alternatives681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Type__Alternatives701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__Operand__Alternatives735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_rule__Operand__Alternatives752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Operand__Alternatives769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Operator__Alternatives802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Operator__Alternatives822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Operator__Alternatives842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Operator__Alternatives862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Operator__Alternatives882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__0__Impl_in_rule__Declaration__Group__0914 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Declaration__Group__1_in_rule__Declaration__Group__0917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__TypeAssignment_0_in_rule__Declaration__Group__0__Impl944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__1__Impl_in_rule__Declaration__Group__1974 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__2_in_rule__Declaration__Group__1977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__VariableAssignment_1_in_rule__Declaration__Group__1__Impl1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__2__Impl_in_rule__Declaration__Group__21034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Declaration__Group__2__Impl1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__0__Impl_in_rule__Operation__Group__01099 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Operation__Group__1_in_rule__Operation__Group__01102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__VariableAssignment_0_in_rule__Operation__Group__0__Impl1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__1__Impl_in_rule__Operation__Group__11159 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__Operation__Group__2_in_rule__Operation__Group__11162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Operation__Group__1__Impl1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__2__Impl_in_rule__Operation__Group__21221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__CalculationAssignment_2_in_rule__Operation__Group__2__Impl1248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculation__Group__0__Impl_in_rule__Calculation__Group__01284 = new BitSet(new long[]{0x00000000001F8000L});
    public static final BitSet FOLLOW_rule__Calculation__Group__1_in_rule__Calculation__Group__01287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculation__InitAssignment_0_in_rule__Calculation__Group__0__Impl1314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculation__Group__1__Impl_in_rule__Calculation__Group__11344 = new BitSet(new long[]{0x00000000001F8000L});
    public static final BitSet FOLLOW_rule__Calculation__Group__2_in_rule__Calculation__Group__11347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculation__Group_1__0_in_rule__Calculation__Group__1__Impl1374 = new BitSet(new long[]{0x00000000000F8002L});
    public static final BitSet FOLLOW_rule__Calculation__Group__2__Impl_in_rule__Calculation__Group__21405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Calculation__Group__2__Impl1433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculation__Group_1__0__Impl_in_rule__Calculation__Group_1__01470 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__Calculation__Group_1__1_in_rule__Calculation__Group_1__01473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperator_in_rule__Calculation__Group_1__0__Impl1500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculation__Group_1__1__Impl_in_rule__Calculation__Group_1__11529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calculation__VectorsAssignment_1_1_in_rule__Calculation__Group_1__1__Impl1556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_rule__CalcDSL__InstructionsAssignment1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Declaration__TypeAssignment_01626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__Declaration__VariableAssignment_11657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Operation__VariableAssignment_01692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCalculation_in_rule__Operation__CalculationAssignment_21727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperand_in_rule__Calculation__InitAssignment_01758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperand_in_rule__Calculation__VectorsAssignment_1_11789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Variable__NameAssignment1820 = new BitSet(new long[]{0x0000000000000002L});

}