package fr.imta.tp2.statDSL.ui.contentassist.antlr.internal; 

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
import fr.imta.tp2.statDSL.services.StatDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalStatDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'moyenne'", "'variance'", "'ecart-type'", "'mode'", "'program'", "'begin'", "'return'", "';'", "'end'", "'eff : '", "','", "'mod : '"
    };
    public static final int RULE_ID=5;
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
    public static final int RULE_INT=4;
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
    public String getGrammarFileName() { return "../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g"; }


     
     	private StatDSLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(StatDSLGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleStatDSL"
    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:60:1: entryRuleStatDSL : ruleStatDSL EOF ;
    public final void entryRuleStatDSL() throws RecognitionException {
        try {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:61:1: ( ruleStatDSL EOF )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:62:1: ruleStatDSL EOF
            {
             before(grammarAccess.getStatDSLRule()); 
            pushFollow(FOLLOW_ruleStatDSL_in_entryRuleStatDSL61);
            ruleStatDSL();

            state._fsp--;

             after(grammarAccess.getStatDSLRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatDSL68); 

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
    // $ANTLR end "entryRuleStatDSL"


    // $ANTLR start "ruleStatDSL"
    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:69:1: ruleStatDSL : ( ( rule__StatDSL__ProgramAssignment ) ) ;
    public final void ruleStatDSL() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:73:2: ( ( ( rule__StatDSL__ProgramAssignment ) ) )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:74:1: ( ( rule__StatDSL__ProgramAssignment ) )
            {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:74:1: ( ( rule__StatDSL__ProgramAssignment ) )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:75:1: ( rule__StatDSL__ProgramAssignment )
            {
             before(grammarAccess.getStatDSLAccess().getProgramAssignment()); 
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:76:1: ( rule__StatDSL__ProgramAssignment )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:76:2: rule__StatDSL__ProgramAssignment
            {
            pushFollow(FOLLOW_rule__StatDSL__ProgramAssignment_in_ruleStatDSL94);
            rule__StatDSL__ProgramAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStatDSLAccess().getProgramAssignment()); 

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
    // $ANTLR end "ruleStatDSL"


    // $ANTLR start "entryRuleProgram"
    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:88:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:89:1: ( ruleProgram EOF )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:90:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram121);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram128); 

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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:97:1: ruleProgram : ( ( rule__Program__Group__0 ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:101:2: ( ( ( rule__Program__Group__0 ) ) )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:102:1: ( ( rule__Program__Group__0 ) )
            {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:102:1: ( ( rule__Program__Group__0 ) )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:103:1: ( rule__Program__Group__0 )
            {
             before(grammarAccess.getProgramAccess().getGroup()); 
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:104:1: ( rule__Program__Group__0 )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:104:2: rule__Program__Group__0
            {
            pushFollow(FOLLOW_rule__Program__Group__0_in_ruleProgram154);
            rule__Program__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getGroup()); 

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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleKeyword"
    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:116:1: entryRuleKeyword : ruleKeyword EOF ;
    public final void entryRuleKeyword() throws RecognitionException {
        try {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:117:1: ( ruleKeyword EOF )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:118:1: ruleKeyword EOF
            {
             before(grammarAccess.getKeywordRule()); 
            pushFollow(FOLLOW_ruleKeyword_in_entryRuleKeyword181);
            ruleKeyword();

            state._fsp--;

             after(grammarAccess.getKeywordRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeyword188); 

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
    // $ANTLR end "entryRuleKeyword"


    // $ANTLR start "ruleKeyword"
    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:125:1: ruleKeyword : ( ( rule__Keyword__Alternatives ) ) ;
    public final void ruleKeyword() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:129:2: ( ( ( rule__Keyword__Alternatives ) ) )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:130:1: ( ( rule__Keyword__Alternatives ) )
            {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:130:1: ( ( rule__Keyword__Alternatives ) )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:131:1: ( rule__Keyword__Alternatives )
            {
             before(grammarAccess.getKeywordAccess().getAlternatives()); 
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:132:1: ( rule__Keyword__Alternatives )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:132:2: rule__Keyword__Alternatives
            {
            pushFollow(FOLLOW_rule__Keyword__Alternatives_in_ruleKeyword214);
            rule__Keyword__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getKeywordAccess().getAlternatives()); 

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
    // $ANTLR end "ruleKeyword"


    // $ANTLR start "entryRuleInstructions"
    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:144:1: entryRuleInstructions : ruleInstructions EOF ;
    public final void entryRuleInstructions() throws RecognitionException {
        try {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:145:1: ( ruleInstructions EOF )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:146:1: ruleInstructions EOF
            {
             before(grammarAccess.getInstructionsRule()); 
            pushFollow(FOLLOW_ruleInstructions_in_entryRuleInstructions241);
            ruleInstructions();

            state._fsp--;

             after(grammarAccess.getInstructionsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstructions248); 

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
    // $ANTLR end "entryRuleInstructions"


    // $ANTLR start "ruleInstructions"
    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:153:1: ruleInstructions : ( ( rule__Instructions__UnorderedGroup ) ) ;
    public final void ruleInstructions() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:157:2: ( ( ( rule__Instructions__UnorderedGroup ) ) )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:158:1: ( ( rule__Instructions__UnorderedGroup ) )
            {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:158:1: ( ( rule__Instructions__UnorderedGroup ) )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:159:1: ( rule__Instructions__UnorderedGroup )
            {
             before(grammarAccess.getInstructionsAccess().getUnorderedGroup()); 
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:160:1: ( rule__Instructions__UnorderedGroup )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:160:2: rule__Instructions__UnorderedGroup
            {
            pushFollow(FOLLOW_rule__Instructions__UnorderedGroup_in_ruleInstructions274);
            rule__Instructions__UnorderedGroup();

            state._fsp--;


            }

             after(grammarAccess.getInstructionsAccess().getUnorderedGroup()); 

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
    // $ANTLR end "ruleInstructions"


    // $ANTLR start "entryRuleEff"
    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:172:1: entryRuleEff : ruleEff EOF ;
    public final void entryRuleEff() throws RecognitionException {
        try {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:173:1: ( ruleEff EOF )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:174:1: ruleEff EOF
            {
             before(grammarAccess.getEffRule()); 
            pushFollow(FOLLOW_ruleEff_in_entryRuleEff301);
            ruleEff();

            state._fsp--;

             after(grammarAccess.getEffRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEff308); 

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
    // $ANTLR end "entryRuleEff"


    // $ANTLR start "ruleEff"
    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:181:1: ruleEff : ( ( rule__Eff__Group__0 ) ) ;
    public final void ruleEff() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:185:2: ( ( ( rule__Eff__Group__0 ) ) )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:186:1: ( ( rule__Eff__Group__0 ) )
            {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:186:1: ( ( rule__Eff__Group__0 ) )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:187:1: ( rule__Eff__Group__0 )
            {
             before(grammarAccess.getEffAccess().getGroup()); 
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:188:1: ( rule__Eff__Group__0 )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:188:2: rule__Eff__Group__0
            {
            pushFollow(FOLLOW_rule__Eff__Group__0_in_ruleEff334);
            rule__Eff__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEffAccess().getGroup()); 

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
    // $ANTLR end "ruleEff"


    // $ANTLR start "entryRuleMod"
    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:200:1: entryRuleMod : ruleMod EOF ;
    public final void entryRuleMod() throws RecognitionException {
        try {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:201:1: ( ruleMod EOF )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:202:1: ruleMod EOF
            {
             before(grammarAccess.getModRule()); 
            pushFollow(FOLLOW_ruleMod_in_entryRuleMod361);
            ruleMod();

            state._fsp--;

             after(grammarAccess.getModRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMod368); 

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
    // $ANTLR end "entryRuleMod"


    // $ANTLR start "ruleMod"
    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:209:1: ruleMod : ( ( rule__Mod__Group__0 ) ) ;
    public final void ruleMod() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:213:2: ( ( ( rule__Mod__Group__0 ) ) )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:214:1: ( ( rule__Mod__Group__0 ) )
            {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:214:1: ( ( rule__Mod__Group__0 ) )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:215:1: ( rule__Mod__Group__0 )
            {
             before(grammarAccess.getModAccess().getGroup()); 
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:216:1: ( rule__Mod__Group__0 )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:216:2: rule__Mod__Group__0
            {
            pushFollow(FOLLOW_rule__Mod__Group__0_in_ruleMod394);
            rule__Mod__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModAccess().getGroup()); 

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
    // $ANTLR end "ruleMod"


    // $ANTLR start "rule__Keyword__Alternatives"
    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:228:1: rule__Keyword__Alternatives : ( ( 'moyenne' ) | ( 'variance' ) | ( 'ecart-type' ) | ( 'mode' ) );
    public final void rule__Keyword__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:232:1: ( ( 'moyenne' ) | ( 'variance' ) | ( 'ecart-type' ) | ( 'mode' ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            case 14:
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
                    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:233:1: ( 'moyenne' )
                    {
                    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:233:1: ( 'moyenne' )
                    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:234:1: 'moyenne'
                    {
                     before(grammarAccess.getKeywordAccess().getMoyenneKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__Keyword__Alternatives431); 
                     after(grammarAccess.getKeywordAccess().getMoyenneKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:241:6: ( 'variance' )
                    {
                    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:241:6: ( 'variance' )
                    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:242:1: 'variance'
                    {
                     before(grammarAccess.getKeywordAccess().getVarianceKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__Keyword__Alternatives451); 
                     after(grammarAccess.getKeywordAccess().getVarianceKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:249:6: ( 'ecart-type' )
                    {
                    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:249:6: ( 'ecart-type' )
                    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:250:1: 'ecart-type'
                    {
                     before(grammarAccess.getKeywordAccess().getEcartTypeKeyword_2()); 
                    match(input,13,FOLLOW_13_in_rule__Keyword__Alternatives471); 
                     after(grammarAccess.getKeywordAccess().getEcartTypeKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:257:6: ( 'mode' )
                    {
                    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:257:6: ( 'mode' )
                    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:258:1: 'mode'
                    {
                     before(grammarAccess.getKeywordAccess().getModeKeyword_3()); 
                    match(input,14,FOLLOW_14_in_rule__Keyword__Alternatives491); 
                     after(grammarAccess.getKeywordAccess().getModeKeyword_3()); 

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
    // $ANTLR end "rule__Keyword__Alternatives"


    // $ANTLR start "rule__Program__Group__0"
    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:272:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:276:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:277:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_rule__Program__Group__0__Impl_in_rule__Program__Group__0523);
            rule__Program__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group__1_in_rule__Program__Group__0526);
            rule__Program__Group__1();

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
    // $ANTLR end "rule__Program__Group__0"


    // $ANTLR start "rule__Program__Group__0__Impl"
    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:284:1: rule__Program__Group__0__Impl : ( 'program' ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:288:1: ( ( 'program' ) )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:289:1: ( 'program' )
            {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:289:1: ( 'program' )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:290:1: 'program'
            {
             before(grammarAccess.getProgramAccess().getProgramKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Program__Group__0__Impl554); 
             after(grammarAccess.getProgramAccess().getProgramKeyword_0()); 

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
    // $ANTLR end "rule__Program__Group__0__Impl"


    // $ANTLR start "rule__Program__Group__1"
    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:303:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:307:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:308:2: rule__Program__Group__1__Impl rule__Program__Group__2
            {
            pushFollow(FOLLOW_rule__Program__Group__1__Impl_in_rule__Program__Group__1585);
            rule__Program__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group__2_in_rule__Program__Group__1588);
            rule__Program__Group__2();

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
    // $ANTLR end "rule__Program__Group__1"


    // $ANTLR start "rule__Program__Group__1__Impl"
    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:315:1: rule__Program__Group__1__Impl : ( ( rule__Program__NameAssignment_1 ) ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:319:1: ( ( ( rule__Program__NameAssignment_1 ) ) )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:320:1: ( ( rule__Program__NameAssignment_1 ) )
            {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:320:1: ( ( rule__Program__NameAssignment_1 ) )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:321:1: ( rule__Program__NameAssignment_1 )
            {
             before(grammarAccess.getProgramAccess().getNameAssignment_1()); 
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:322:1: ( rule__Program__NameAssignment_1 )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:322:2: rule__Program__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Program__NameAssignment_1_in_rule__Program__Group__1__Impl615);
            rule__Program__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Program__Group__1__Impl"


    // $ANTLR start "rule__Program__Group__2"
    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:332:1: rule__Program__Group__2 : rule__Program__Group__2__Impl rule__Program__Group__3 ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:336:1: ( rule__Program__Group__2__Impl rule__Program__Group__3 )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:337:2: rule__Program__Group__2__Impl rule__Program__Group__3
            {
            pushFollow(FOLLOW_rule__Program__Group__2__Impl_in_rule__Program__Group__2645);
            rule__Program__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group__3_in_rule__Program__Group__2648);
            rule__Program__Group__3();

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
    // $ANTLR end "rule__Program__Group__2"


    // $ANTLR start "rule__Program__Group__2__Impl"
    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:344:1: rule__Program__Group__2__Impl : ( 'begin' ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:348:1: ( ( 'begin' ) )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:349:1: ( 'begin' )
            {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:349:1: ( 'begin' )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:350:1: 'begin'
            {
             before(grammarAccess.getProgramAccess().getBeginKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__Program__Group__2__Impl676); 
             after(grammarAccess.getProgramAccess().getBeginKeyword_2()); 

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
    // $ANTLR end "rule__Program__Group__2__Impl"


    // $ANTLR start "rule__Program__Group__3"
    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:363:1: rule__Program__Group__3 : rule__Program__Group__3__Impl rule__Program__Group__4 ;
    public final void rule__Program__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:367:1: ( rule__Program__Group__3__Impl rule__Program__Group__4 )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:368:2: rule__Program__Group__3__Impl rule__Program__Group__4
            {
            pushFollow(FOLLOW_rule__Program__Group__3__Impl_in_rule__Program__Group__3707);
            rule__Program__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group__4_in_rule__Program__Group__3710);
            rule__Program__Group__4();

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
    // $ANTLR end "rule__Program__Group__3"


    // $ANTLR start "rule__Program__Group__3__Impl"
    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:375:1: rule__Program__Group__3__Impl : ( ruleInstructions ) ;
    public final void rule__Program__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:379:1: ( ( ruleInstructions ) )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:380:1: ( ruleInstructions )
            {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:380:1: ( ruleInstructions )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:381:1: ruleInstructions
            {
             before(grammarAccess.getProgramAccess().getInstructionsParserRuleCall_3()); 
            pushFollow(FOLLOW_ruleInstructions_in_rule__Program__Group__3__Impl737);
            ruleInstructions();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getInstructionsParserRuleCall_3()); 

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
    // $ANTLR end "rule__Program__Group__3__Impl"


    // $ANTLR start "rule__Program__Group__4"
    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:392:1: rule__Program__Group__4 : rule__Program__Group__4__Impl rule__Program__Group__5 ;
    public final void rule__Program__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:396:1: ( rule__Program__Group__4__Impl rule__Program__Group__5 )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:397:2: rule__Program__Group__4__Impl rule__Program__Group__5
            {
            pushFollow(FOLLOW_rule__Program__Group__4__Impl_in_rule__Program__Group__4766);
            rule__Program__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group__5_in_rule__Program__Group__4769);
            rule__Program__Group__5();

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
    // $ANTLR end "rule__Program__Group__4"


    // $ANTLR start "rule__Program__Group__4__Impl"
    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:404:1: rule__Program__Group__4__Impl : ( 'return' ) ;
    public final void rule__Program__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:408:1: ( ( 'return' ) )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:409:1: ( 'return' )
            {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:409:1: ( 'return' )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:410:1: 'return'
            {
             before(grammarAccess.getProgramAccess().getReturnKeyword_4()); 
            match(input,17,FOLLOW_17_in_rule__Program__Group__4__Impl797); 
             after(grammarAccess.getProgramAccess().getReturnKeyword_4()); 

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
    // $ANTLR end "rule__Program__Group__4__Impl"


    // $ANTLR start "rule__Program__Group__5"
    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:423:1: rule__Program__Group__5 : rule__Program__Group__5__Impl rule__Program__Group__6 ;
    public final void rule__Program__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:427:1: ( rule__Program__Group__5__Impl rule__Program__Group__6 )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:428:2: rule__Program__Group__5__Impl rule__Program__Group__6
            {
            pushFollow(FOLLOW_rule__Program__Group__5__Impl_in_rule__Program__Group__5828);
            rule__Program__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group__6_in_rule__Program__Group__5831);
            rule__Program__Group__6();

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
    // $ANTLR end "rule__Program__Group__5"


    // $ANTLR start "rule__Program__Group__5__Impl"
    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:435:1: rule__Program__Group__5__Impl : ( ruleKeyword ) ;
    public final void rule__Program__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:439:1: ( ( ruleKeyword ) )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:440:1: ( ruleKeyword )
            {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:440:1: ( ruleKeyword )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:441:1: ruleKeyword
            {
             before(grammarAccess.getProgramAccess().getKeywordParserRuleCall_5()); 
            pushFollow(FOLLOW_ruleKeyword_in_rule__Program__Group__5__Impl858);
            ruleKeyword();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getKeywordParserRuleCall_5()); 

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
    // $ANTLR end "rule__Program__Group__5__Impl"


    // $ANTLR start "rule__Program__Group__6"
    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:452:1: rule__Program__Group__6 : rule__Program__Group__6__Impl rule__Program__Group__7 ;
    public final void rule__Program__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:456:1: ( rule__Program__Group__6__Impl rule__Program__Group__7 )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:457:2: rule__Program__Group__6__Impl rule__Program__Group__7
            {
            pushFollow(FOLLOW_rule__Program__Group__6__Impl_in_rule__Program__Group__6887);
            rule__Program__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group__7_in_rule__Program__Group__6890);
            rule__Program__Group__7();

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
    // $ANTLR end "rule__Program__Group__6"


    // $ANTLR start "rule__Program__Group__6__Impl"
    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:464:1: rule__Program__Group__6__Impl : ( ';' ) ;
    public final void rule__Program__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:468:1: ( ( ';' ) )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:469:1: ( ';' )
            {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:469:1: ( ';' )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:470:1: ';'
            {
             before(grammarAccess.getProgramAccess().getSemicolonKeyword_6()); 
            match(input,18,FOLLOW_18_in_rule__Program__Group__6__Impl918); 
             after(grammarAccess.getProgramAccess().getSemicolonKeyword_6()); 

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
    // $ANTLR end "rule__Program__Group__6__Impl"


    // $ANTLR start "rule__Program__Group__7"
    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:483:1: rule__Program__Group__7 : rule__Program__Group__7__Impl ;
    public final void rule__Program__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:487:1: ( rule__Program__Group__7__Impl )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:488:2: rule__Program__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group__7__Impl_in_rule__Program__Group__7949);
            rule__Program__Group__7__Impl();

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
    // $ANTLR end "rule__Program__Group__7"


    // $ANTLR start "rule__Program__Group__7__Impl"
    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:494:1: rule__Program__Group__7__Impl : ( 'end' ) ;
    public final void rule__Program__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:498:1: ( ( 'end' ) )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:499:1: ( 'end' )
            {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:499:1: ( 'end' )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:500:1: 'end'
            {
             before(grammarAccess.getProgramAccess().getEndKeyword_7()); 
            match(input,19,FOLLOW_19_in_rule__Program__Group__7__Impl977); 
             after(grammarAccess.getProgramAccess().getEndKeyword_7()); 

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
    // $ANTLR end "rule__Program__Group__7__Impl"


    // $ANTLR start "rule__Eff__Group__0"
    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:529:1: rule__Eff__Group__0 : rule__Eff__Group__0__Impl rule__Eff__Group__1 ;
    public final void rule__Eff__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:533:1: ( rule__Eff__Group__0__Impl rule__Eff__Group__1 )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:534:2: rule__Eff__Group__0__Impl rule__Eff__Group__1
            {
            pushFollow(FOLLOW_rule__Eff__Group__0__Impl_in_rule__Eff__Group__01024);
            rule__Eff__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Eff__Group__1_in_rule__Eff__Group__01027);
            rule__Eff__Group__1();

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
    // $ANTLR end "rule__Eff__Group__0"


    // $ANTLR start "rule__Eff__Group__0__Impl"
    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:541:1: rule__Eff__Group__0__Impl : ( 'eff : ' ) ;
    public final void rule__Eff__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:545:1: ( ( 'eff : ' ) )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:546:1: ( 'eff : ' )
            {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:546:1: ( 'eff : ' )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:547:1: 'eff : '
            {
             before(grammarAccess.getEffAccess().getEffKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__Eff__Group__0__Impl1055); 
             after(grammarAccess.getEffAccess().getEffKeyword_0()); 

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
    // $ANTLR end "rule__Eff__Group__0__Impl"


    // $ANTLR start "rule__Eff__Group__1"
    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:560:1: rule__Eff__Group__1 : rule__Eff__Group__1__Impl rule__Eff__Group__2 ;
    public final void rule__Eff__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:564:1: ( rule__Eff__Group__1__Impl rule__Eff__Group__2 )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:565:2: rule__Eff__Group__1__Impl rule__Eff__Group__2
            {
            pushFollow(FOLLOW_rule__Eff__Group__1__Impl_in_rule__Eff__Group__11086);
            rule__Eff__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Eff__Group__2_in_rule__Eff__Group__11089);
            rule__Eff__Group__2();

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
    // $ANTLR end "rule__Eff__Group__1"


    // $ANTLR start "rule__Eff__Group__1__Impl"
    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:572:1: rule__Eff__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__Eff__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:576:1: ( ( RULE_INT ) )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:577:1: ( RULE_INT )
            {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:577:1: ( RULE_INT )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:578:1: RULE_INT
            {
             before(grammarAccess.getEffAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Eff__Group__1__Impl1116); 
             after(grammarAccess.getEffAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Eff__Group__1__Impl"


    // $ANTLR start "rule__Eff__Group__2"
    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:589:1: rule__Eff__Group__2 : rule__Eff__Group__2__Impl rule__Eff__Group__3 ;
    public final void rule__Eff__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:593:1: ( rule__Eff__Group__2__Impl rule__Eff__Group__3 )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:594:2: rule__Eff__Group__2__Impl rule__Eff__Group__3
            {
            pushFollow(FOLLOW_rule__Eff__Group__2__Impl_in_rule__Eff__Group__21145);
            rule__Eff__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Eff__Group__3_in_rule__Eff__Group__21148);
            rule__Eff__Group__3();

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
    // $ANTLR end "rule__Eff__Group__2"


    // $ANTLR start "rule__Eff__Group__2__Impl"
    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:601:1: rule__Eff__Group__2__Impl : ( ( rule__Eff__Group_2__0 )* ) ;
    public final void rule__Eff__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:605:1: ( ( ( rule__Eff__Group_2__0 )* ) )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:606:1: ( ( rule__Eff__Group_2__0 )* )
            {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:606:1: ( ( rule__Eff__Group_2__0 )* )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:607:1: ( rule__Eff__Group_2__0 )*
            {
             before(grammarAccess.getEffAccess().getGroup_2()); 
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:608:1: ( rule__Eff__Group_2__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==21) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:608:2: rule__Eff__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Eff__Group_2__0_in_rule__Eff__Group__2__Impl1175);
            	    rule__Eff__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getEffAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Eff__Group__2__Impl"


    // $ANTLR start "rule__Eff__Group__3"
    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:618:1: rule__Eff__Group__3 : rule__Eff__Group__3__Impl ;
    public final void rule__Eff__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:622:1: ( rule__Eff__Group__3__Impl )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:623:2: rule__Eff__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Eff__Group__3__Impl_in_rule__Eff__Group__31206);
            rule__Eff__Group__3__Impl();

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
    // $ANTLR end "rule__Eff__Group__3"


    // $ANTLR start "rule__Eff__Group__3__Impl"
    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:629:1: rule__Eff__Group__3__Impl : ( ';' ) ;
    public final void rule__Eff__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:633:1: ( ( ';' ) )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:634:1: ( ';' )
            {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:634:1: ( ';' )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:635:1: ';'
            {
             before(grammarAccess.getEffAccess().getSemicolonKeyword_3()); 
            match(input,18,FOLLOW_18_in_rule__Eff__Group__3__Impl1234); 
             after(grammarAccess.getEffAccess().getSemicolonKeyword_3()); 

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
    // $ANTLR end "rule__Eff__Group__3__Impl"


    // $ANTLR start "rule__Eff__Group_2__0"
    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:656:1: rule__Eff__Group_2__0 : rule__Eff__Group_2__0__Impl rule__Eff__Group_2__1 ;
    public final void rule__Eff__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:660:1: ( rule__Eff__Group_2__0__Impl rule__Eff__Group_2__1 )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:661:2: rule__Eff__Group_2__0__Impl rule__Eff__Group_2__1
            {
            pushFollow(FOLLOW_rule__Eff__Group_2__0__Impl_in_rule__Eff__Group_2__01273);
            rule__Eff__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Eff__Group_2__1_in_rule__Eff__Group_2__01276);
            rule__Eff__Group_2__1();

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
    // $ANTLR end "rule__Eff__Group_2__0"


    // $ANTLR start "rule__Eff__Group_2__0__Impl"
    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:668:1: rule__Eff__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Eff__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:672:1: ( ( ',' ) )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:673:1: ( ',' )
            {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:673:1: ( ',' )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:674:1: ','
            {
             before(grammarAccess.getEffAccess().getCommaKeyword_2_0()); 
            match(input,21,FOLLOW_21_in_rule__Eff__Group_2__0__Impl1304); 
             after(grammarAccess.getEffAccess().getCommaKeyword_2_0()); 

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
    // $ANTLR end "rule__Eff__Group_2__0__Impl"


    // $ANTLR start "rule__Eff__Group_2__1"
    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:687:1: rule__Eff__Group_2__1 : rule__Eff__Group_2__1__Impl ;
    public final void rule__Eff__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:691:1: ( rule__Eff__Group_2__1__Impl )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:692:2: rule__Eff__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Eff__Group_2__1__Impl_in_rule__Eff__Group_2__11335);
            rule__Eff__Group_2__1__Impl();

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
    // $ANTLR end "rule__Eff__Group_2__1"


    // $ANTLR start "rule__Eff__Group_2__1__Impl"
    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:698:1: rule__Eff__Group_2__1__Impl : ( RULE_INT ) ;
    public final void rule__Eff__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:702:1: ( ( RULE_INT ) )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:703:1: ( RULE_INT )
            {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:703:1: ( RULE_INT )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:704:1: RULE_INT
            {
             before(grammarAccess.getEffAccess().getINTTerminalRuleCall_2_1()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Eff__Group_2__1__Impl1362); 
             after(grammarAccess.getEffAccess().getINTTerminalRuleCall_2_1()); 

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
    // $ANTLR end "rule__Eff__Group_2__1__Impl"


    // $ANTLR start "rule__Mod__Group__0"
    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:719:1: rule__Mod__Group__0 : rule__Mod__Group__0__Impl rule__Mod__Group__1 ;
    public final void rule__Mod__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:723:1: ( rule__Mod__Group__0__Impl rule__Mod__Group__1 )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:724:2: rule__Mod__Group__0__Impl rule__Mod__Group__1
            {
            pushFollow(FOLLOW_rule__Mod__Group__0__Impl_in_rule__Mod__Group__01395);
            rule__Mod__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mod__Group__1_in_rule__Mod__Group__01398);
            rule__Mod__Group__1();

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
    // $ANTLR end "rule__Mod__Group__0"


    // $ANTLR start "rule__Mod__Group__0__Impl"
    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:731:1: rule__Mod__Group__0__Impl : ( 'mod : ' ) ;
    public final void rule__Mod__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:735:1: ( ( 'mod : ' ) )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:736:1: ( 'mod : ' )
            {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:736:1: ( 'mod : ' )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:737:1: 'mod : '
            {
             before(grammarAccess.getModAccess().getModKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__Mod__Group__0__Impl1426); 
             after(grammarAccess.getModAccess().getModKeyword_0()); 

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
    // $ANTLR end "rule__Mod__Group__0__Impl"


    // $ANTLR start "rule__Mod__Group__1"
    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:750:1: rule__Mod__Group__1 : rule__Mod__Group__1__Impl rule__Mod__Group__2 ;
    public final void rule__Mod__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:754:1: ( rule__Mod__Group__1__Impl rule__Mod__Group__2 )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:755:2: rule__Mod__Group__1__Impl rule__Mod__Group__2
            {
            pushFollow(FOLLOW_rule__Mod__Group__1__Impl_in_rule__Mod__Group__11457);
            rule__Mod__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mod__Group__2_in_rule__Mod__Group__11460);
            rule__Mod__Group__2();

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
    // $ANTLR end "rule__Mod__Group__1"


    // $ANTLR start "rule__Mod__Group__1__Impl"
    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:762:1: rule__Mod__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__Mod__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:766:1: ( ( RULE_INT ) )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:767:1: ( RULE_INT )
            {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:767:1: ( RULE_INT )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:768:1: RULE_INT
            {
             before(grammarAccess.getModAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Mod__Group__1__Impl1487); 
             after(grammarAccess.getModAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Mod__Group__1__Impl"


    // $ANTLR start "rule__Mod__Group__2"
    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:779:1: rule__Mod__Group__2 : rule__Mod__Group__2__Impl rule__Mod__Group__3 ;
    public final void rule__Mod__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:783:1: ( rule__Mod__Group__2__Impl rule__Mod__Group__3 )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:784:2: rule__Mod__Group__2__Impl rule__Mod__Group__3
            {
            pushFollow(FOLLOW_rule__Mod__Group__2__Impl_in_rule__Mod__Group__21516);
            rule__Mod__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mod__Group__3_in_rule__Mod__Group__21519);
            rule__Mod__Group__3();

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
    // $ANTLR end "rule__Mod__Group__2"


    // $ANTLR start "rule__Mod__Group__2__Impl"
    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:791:1: rule__Mod__Group__2__Impl : ( ( rule__Mod__Group_2__0 )* ) ;
    public final void rule__Mod__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:795:1: ( ( ( rule__Mod__Group_2__0 )* ) )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:796:1: ( ( rule__Mod__Group_2__0 )* )
            {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:796:1: ( ( rule__Mod__Group_2__0 )* )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:797:1: ( rule__Mod__Group_2__0 )*
            {
             before(grammarAccess.getModAccess().getGroup_2()); 
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:798:1: ( rule__Mod__Group_2__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==21) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:798:2: rule__Mod__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Mod__Group_2__0_in_rule__Mod__Group__2__Impl1546);
            	    rule__Mod__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getModAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Mod__Group__2__Impl"


    // $ANTLR start "rule__Mod__Group__3"
    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:808:1: rule__Mod__Group__3 : rule__Mod__Group__3__Impl ;
    public final void rule__Mod__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:812:1: ( rule__Mod__Group__3__Impl )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:813:2: rule__Mod__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Mod__Group__3__Impl_in_rule__Mod__Group__31577);
            rule__Mod__Group__3__Impl();

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
    // $ANTLR end "rule__Mod__Group__3"


    // $ANTLR start "rule__Mod__Group__3__Impl"
    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:819:1: rule__Mod__Group__3__Impl : ( ';' ) ;
    public final void rule__Mod__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:823:1: ( ( ';' ) )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:824:1: ( ';' )
            {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:824:1: ( ';' )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:825:1: ';'
            {
             before(grammarAccess.getModAccess().getSemicolonKeyword_3()); 
            match(input,18,FOLLOW_18_in_rule__Mod__Group__3__Impl1605); 
             after(grammarAccess.getModAccess().getSemicolonKeyword_3()); 

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
    // $ANTLR end "rule__Mod__Group__3__Impl"


    // $ANTLR start "rule__Mod__Group_2__0"
    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:846:1: rule__Mod__Group_2__0 : rule__Mod__Group_2__0__Impl rule__Mod__Group_2__1 ;
    public final void rule__Mod__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:850:1: ( rule__Mod__Group_2__0__Impl rule__Mod__Group_2__1 )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:851:2: rule__Mod__Group_2__0__Impl rule__Mod__Group_2__1
            {
            pushFollow(FOLLOW_rule__Mod__Group_2__0__Impl_in_rule__Mod__Group_2__01644);
            rule__Mod__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mod__Group_2__1_in_rule__Mod__Group_2__01647);
            rule__Mod__Group_2__1();

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
    // $ANTLR end "rule__Mod__Group_2__0"


    // $ANTLR start "rule__Mod__Group_2__0__Impl"
    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:858:1: rule__Mod__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Mod__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:862:1: ( ( ',' ) )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:863:1: ( ',' )
            {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:863:1: ( ',' )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:864:1: ','
            {
             before(grammarAccess.getModAccess().getCommaKeyword_2_0()); 
            match(input,21,FOLLOW_21_in_rule__Mod__Group_2__0__Impl1675); 
             after(grammarAccess.getModAccess().getCommaKeyword_2_0()); 

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
    // $ANTLR end "rule__Mod__Group_2__0__Impl"


    // $ANTLR start "rule__Mod__Group_2__1"
    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:877:1: rule__Mod__Group_2__1 : rule__Mod__Group_2__1__Impl ;
    public final void rule__Mod__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:881:1: ( rule__Mod__Group_2__1__Impl )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:882:2: rule__Mod__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Mod__Group_2__1__Impl_in_rule__Mod__Group_2__11706);
            rule__Mod__Group_2__1__Impl();

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
    // $ANTLR end "rule__Mod__Group_2__1"


    // $ANTLR start "rule__Mod__Group_2__1__Impl"
    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:888:1: rule__Mod__Group_2__1__Impl : ( RULE_INT ) ;
    public final void rule__Mod__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:892:1: ( ( RULE_INT ) )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:893:1: ( RULE_INT )
            {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:893:1: ( RULE_INT )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:894:1: RULE_INT
            {
             before(grammarAccess.getModAccess().getINTTerminalRuleCall_2_1()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Mod__Group_2__1__Impl1733); 
             after(grammarAccess.getModAccess().getINTTerminalRuleCall_2_1()); 

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
    // $ANTLR end "rule__Mod__Group_2__1__Impl"


    // $ANTLR start "rule__Instructions__UnorderedGroup"
    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:910:1: rule__Instructions__UnorderedGroup : rule__Instructions__UnorderedGroup__0 {...}?;
    public final void rule__Instructions__UnorderedGroup() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getInstructionsAccess().getUnorderedGroup());
            
        try {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:915:1: ( rule__Instructions__UnorderedGroup__0 {...}?)
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:916:2: rule__Instructions__UnorderedGroup__0 {...}?
            {
            pushFollow(FOLLOW_rule__Instructions__UnorderedGroup__0_in_rule__Instructions__UnorderedGroup1767);
            rule__Instructions__UnorderedGroup__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getInstructionsAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "rule__Instructions__UnorderedGroup", "getUnorderedGroupHelper().canLeave(grammarAccess.getInstructionsAccess().getUnorderedGroup())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getInstructionsAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instructions__UnorderedGroup"


    // $ANTLR start "rule__Instructions__UnorderedGroup__Impl"
    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:927:1: rule__Instructions__UnorderedGroup__Impl : ( ({...}? => ( ( ( ruleMod ) ) ) ) | ({...}? => ( ( ( ruleEff ) ) ) ) ) ;
    public final void rule__Instructions__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:932:1: ( ( ({...}? => ( ( ( ruleMod ) ) ) ) | ({...}? => ( ( ( ruleEff ) ) ) ) ) )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:933:3: ( ({...}? => ( ( ( ruleMod ) ) ) ) | ({...}? => ( ( ( ruleEff ) ) ) ) )
            {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:933:3: ( ({...}? => ( ( ( ruleMod ) ) ) ) | ({...}? => ( ( ( ruleEff ) ) ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( LA4_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getInstructionsAccess().getUnorderedGroup(), 0) ) {
                alt4=1;
            }
            else if ( LA4_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getInstructionsAccess().getUnorderedGroup(), 1) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:935:4: ({...}? => ( ( ( ruleMod ) ) ) )
                    {
                    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:935:4: ({...}? => ( ( ( ruleMod ) ) ) )
                    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:936:5: {...}? => ( ( ( ruleMod ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInstructionsAccess().getUnorderedGroup(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Instructions__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getInstructionsAccess().getUnorderedGroup(), 0)");
                    }
                    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:936:107: ( ( ( ruleMod ) ) )
                    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:937:6: ( ( ruleMod ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getInstructionsAccess().getUnorderedGroup(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:943:6: ( ( ruleMod ) )
                    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:945:7: ( ruleMod )
                    {
                     before(grammarAccess.getInstructionsAccess().getModParserRuleCall_0()); 
                    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:946:7: ( ruleMod )
                    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:946:9: ruleMod
                    {
                    pushFollow(FOLLOW_ruleMod_in_rule__Instructions__UnorderedGroup__Impl1857);
                    ruleMod();

                    state._fsp--;


                    }

                     after(grammarAccess.getInstructionsAccess().getModParserRuleCall_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:952:4: ({...}? => ( ( ( ruleEff ) ) ) )
                    {
                    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:952:4: ({...}? => ( ( ( ruleEff ) ) ) )
                    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:953:5: {...}? => ( ( ( ruleEff ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInstructionsAccess().getUnorderedGroup(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Instructions__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getInstructionsAccess().getUnorderedGroup(), 1)");
                    }
                    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:953:107: ( ( ( ruleEff ) ) )
                    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:954:6: ( ( ruleEff ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getInstructionsAccess().getUnorderedGroup(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:960:6: ( ( ruleEff ) )
                    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:962:7: ( ruleEff )
                    {
                     before(grammarAccess.getInstructionsAccess().getEffParserRuleCall_1()); 
                    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:963:7: ( ruleEff )
                    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:963:9: ruleEff
                    {
                    pushFollow(FOLLOW_ruleEff_in_rule__Instructions__UnorderedGroup__Impl1949);
                    ruleEff();

                    state._fsp--;


                    }

                     after(grammarAccess.getInstructionsAccess().getEffParserRuleCall_1()); 

                    }


                    }


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

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInstructionsAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instructions__UnorderedGroup__Impl"


    // $ANTLR start "rule__Instructions__UnorderedGroup__0"
    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:978:1: rule__Instructions__UnorderedGroup__0 : rule__Instructions__UnorderedGroup__Impl ( rule__Instructions__UnorderedGroup__1 )? ;
    public final void rule__Instructions__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:982:1: ( rule__Instructions__UnorderedGroup__Impl ( rule__Instructions__UnorderedGroup__1 )? )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:983:2: rule__Instructions__UnorderedGroup__Impl ( rule__Instructions__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_rule__Instructions__UnorderedGroup__Impl_in_rule__Instructions__UnorderedGroup__02008);
            rule__Instructions__UnorderedGroup__Impl();

            state._fsp--;

            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:984:2: ( rule__Instructions__UnorderedGroup__1 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( LA5_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getInstructionsAccess().getUnorderedGroup(), 0) ) {
                alt5=1;
            }
            else if ( LA5_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getInstructionsAccess().getUnorderedGroup(), 1) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:984:2: rule__Instructions__UnorderedGroup__1
                    {
                    pushFollow(FOLLOW_rule__Instructions__UnorderedGroup__1_in_rule__Instructions__UnorderedGroup__02011);
                    rule__Instructions__UnorderedGroup__1();

                    state._fsp--;


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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instructions__UnorderedGroup__0"


    // $ANTLR start "rule__Instructions__UnorderedGroup__1"
    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:991:1: rule__Instructions__UnorderedGroup__1 : rule__Instructions__UnorderedGroup__Impl ;
    public final void rule__Instructions__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:995:1: ( rule__Instructions__UnorderedGroup__Impl )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:996:2: rule__Instructions__UnorderedGroup__Impl
            {
            pushFollow(FOLLOW_rule__Instructions__UnorderedGroup__Impl_in_rule__Instructions__UnorderedGroup__12036);
            rule__Instructions__UnorderedGroup__Impl();

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
    // $ANTLR end "rule__Instructions__UnorderedGroup__1"


    // $ANTLR start "rule__StatDSL__ProgramAssignment"
    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:1007:1: rule__StatDSL__ProgramAssignment : ( ruleProgram ) ;
    public final void rule__StatDSL__ProgramAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:1011:1: ( ( ruleProgram ) )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:1012:1: ( ruleProgram )
            {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:1012:1: ( ruleProgram )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:1013:1: ruleProgram
            {
             before(grammarAccess.getStatDSLAccess().getProgramProgramParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleProgram_in_rule__StatDSL__ProgramAssignment2068);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getStatDSLAccess().getProgramProgramParserRuleCall_0()); 

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
    // $ANTLR end "rule__StatDSL__ProgramAssignment"


    // $ANTLR start "rule__Program__NameAssignment_1"
    // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:1022:1: rule__Program__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Program__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:1026:1: ( ( RULE_ID ) )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:1027:1: ( RULE_ID )
            {
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:1027:1: ( RULE_ID )
            // ../fr.imta.tp2.statDSL.ui/src-gen/fr/imta/tp2/statDSL/ui/contentassist/antlr/internal/InternalStatDSL.g:1028:1: RULE_ID
            {
             before(grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Program__NameAssignment_12099); 
             after(grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Program__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleStatDSL_in_entryRuleStatDSL61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatDSL68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StatDSL__ProgramAssignment_in_ruleStatDSL94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__0_in_ruleProgram154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyword_in_entryRuleKeyword181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeyword188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Keyword__Alternatives_in_ruleKeyword214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstructions_in_entryRuleInstructions241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstructions248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instructions__UnorderedGroup_in_ruleInstructions274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEff_in_entryRuleEff301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEff308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eff__Group__0_in_ruleEff334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMod_in_entryRuleMod361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMod368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mod__Group__0_in_ruleMod394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Keyword__Alternatives431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Keyword__Alternatives451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Keyword__Alternatives471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Keyword__Alternatives491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__0__Impl_in_rule__Program__Group__0523 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Program__Group__1_in_rule__Program__Group__0526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Program__Group__0__Impl554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__1__Impl_in_rule__Program__Group__1585 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Program__Group__2_in_rule__Program__Group__1588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__NameAssignment_1_in_rule__Program__Group__1__Impl615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__2__Impl_in_rule__Program__Group__2645 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_rule__Program__Group__3_in_rule__Program__Group__2648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Program__Group__2__Impl676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__3__Impl_in_rule__Program__Group__3707 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Program__Group__4_in_rule__Program__Group__3710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstructions_in_rule__Program__Group__3__Impl737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__4__Impl_in_rule__Program__Group__4766 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_rule__Program__Group__5_in_rule__Program__Group__4769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Program__Group__4__Impl797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__5__Impl_in_rule__Program__Group__5828 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Program__Group__6_in_rule__Program__Group__5831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyword_in_rule__Program__Group__5__Impl858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__6__Impl_in_rule__Program__Group__6887 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Program__Group__7_in_rule__Program__Group__6890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Program__Group__6__Impl918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__7__Impl_in_rule__Program__Group__7949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Program__Group__7__Impl977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eff__Group__0__Impl_in_rule__Eff__Group__01024 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Eff__Group__1_in_rule__Eff__Group__01027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Eff__Group__0__Impl1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eff__Group__1__Impl_in_rule__Eff__Group__11086 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_rule__Eff__Group__2_in_rule__Eff__Group__11089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Eff__Group__1__Impl1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eff__Group__2__Impl_in_rule__Eff__Group__21145 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_rule__Eff__Group__3_in_rule__Eff__Group__21148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eff__Group_2__0_in_rule__Eff__Group__2__Impl1175 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Eff__Group__3__Impl_in_rule__Eff__Group__31206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Eff__Group__3__Impl1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eff__Group_2__0__Impl_in_rule__Eff__Group_2__01273 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Eff__Group_2__1_in_rule__Eff__Group_2__01276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Eff__Group_2__0__Impl1304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eff__Group_2__1__Impl_in_rule__Eff__Group_2__11335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Eff__Group_2__1__Impl1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mod__Group__0__Impl_in_rule__Mod__Group__01395 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Mod__Group__1_in_rule__Mod__Group__01398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Mod__Group__0__Impl1426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mod__Group__1__Impl_in_rule__Mod__Group__11457 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_rule__Mod__Group__2_in_rule__Mod__Group__11460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Mod__Group__1__Impl1487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mod__Group__2__Impl_in_rule__Mod__Group__21516 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_rule__Mod__Group__3_in_rule__Mod__Group__21519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mod__Group_2__0_in_rule__Mod__Group__2__Impl1546 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Mod__Group__3__Impl_in_rule__Mod__Group__31577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Mod__Group__3__Impl1605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mod__Group_2__0__Impl_in_rule__Mod__Group_2__01644 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Mod__Group_2__1_in_rule__Mod__Group_2__01647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Mod__Group_2__0__Impl1675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mod__Group_2__1__Impl_in_rule__Mod__Group_2__11706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Mod__Group_2__1__Impl1733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instructions__UnorderedGroup__0_in_rule__Instructions__UnorderedGroup1767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMod_in_rule__Instructions__UnorderedGroup__Impl1857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEff_in_rule__Instructions__UnorderedGroup__Impl1949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instructions__UnorderedGroup__Impl_in_rule__Instructions__UnorderedGroup__02008 = new BitSet(new long[]{0x0000000000500002L});
    public static final BitSet FOLLOW_rule__Instructions__UnorderedGroup__1_in_rule__Instructions__UnorderedGroup__02011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instructions__UnorderedGroup__Impl_in_rule__Instructions__UnorderedGroup__12036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProgram_in_rule__StatDSL__ProgramAssignment2068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Program__NameAssignment_12099 = new BitSet(new long[]{0x0000000000000002L});

}
