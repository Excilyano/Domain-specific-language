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
import fr.imta.tp.services.Sql4csvGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSql4csvParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'select'", "'from'", "','", "'where'", "'.'", "'='", "'and'", "'('", "')'", "'or'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalSql4csvParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSql4csvParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSql4csvParser.tokenNames; }
    public String getGrammarFileName() { return "../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g"; }


     
     	private Sql4csvGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(Sql4csvGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleSQL4CSV"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:60:1: entryRuleSQL4CSV : ruleSQL4CSV EOF ;
    public final void entryRuleSQL4CSV() throws RecognitionException {
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:61:1: ( ruleSQL4CSV EOF )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:62:1: ruleSQL4CSV EOF
            {
             before(grammarAccess.getSQL4CSVRule()); 
            pushFollow(FOLLOW_ruleSQL4CSV_in_entryRuleSQL4CSV61);
            ruleSQL4CSV();

            state._fsp--;

             after(grammarAccess.getSQL4CSVRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSQL4CSV68); 

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
    // $ANTLR end "entryRuleSQL4CSV"


    // $ANTLR start "ruleSQL4CSV"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:69:1: ruleSQL4CSV : ( ( rule__SQL4CSV__ProgramAssignment ) ) ;
    public final void ruleSQL4CSV() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:73:2: ( ( ( rule__SQL4CSV__ProgramAssignment ) ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:74:1: ( ( rule__SQL4CSV__ProgramAssignment ) )
            {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:74:1: ( ( rule__SQL4CSV__ProgramAssignment ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:75:1: ( rule__SQL4CSV__ProgramAssignment )
            {
             before(grammarAccess.getSQL4CSVAccess().getProgramAssignment()); 
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:76:1: ( rule__SQL4CSV__ProgramAssignment )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:76:2: rule__SQL4CSV__ProgramAssignment
            {
            pushFollow(FOLLOW_rule__SQL4CSV__ProgramAssignment_in_ruleSQL4CSV94);
            rule__SQL4CSV__ProgramAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSQL4CSVAccess().getProgramAssignment()); 

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
    // $ANTLR end "ruleSQL4CSV"


    // $ANTLR start "entryRuleProgram"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:88:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:89:1: ( ruleProgram EOF )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:90:1: ruleProgram EOF
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
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:97:1: ruleProgram : ( ( rule__Program__QueriesAssignment )* ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:101:2: ( ( ( rule__Program__QueriesAssignment )* ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:102:1: ( ( rule__Program__QueriesAssignment )* )
            {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:102:1: ( ( rule__Program__QueriesAssignment )* )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:103:1: ( rule__Program__QueriesAssignment )*
            {
             before(grammarAccess.getProgramAccess().getQueriesAssignment()); 
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:104:1: ( rule__Program__QueriesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:104:2: rule__Program__QueriesAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Program__QueriesAssignment_in_ruleProgram154);
            	    rule__Program__QueriesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getQueriesAssignment()); 

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


    // $ANTLR start "entryRuleQuery"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:116:1: entryRuleQuery : ruleQuery EOF ;
    public final void entryRuleQuery() throws RecognitionException {
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:117:1: ( ruleQuery EOF )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:118:1: ruleQuery EOF
            {
             before(grammarAccess.getQueryRule()); 
            pushFollow(FOLLOW_ruleQuery_in_entryRuleQuery182);
            ruleQuery();

            state._fsp--;

             after(grammarAccess.getQueryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuery189); 

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
    // $ANTLR end "entryRuleQuery"


    // $ANTLR start "ruleQuery"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:125:1: ruleQuery : ( ( rule__Query__Group__0 ) ) ;
    public final void ruleQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:129:2: ( ( ( rule__Query__Group__0 ) ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:130:1: ( ( rule__Query__Group__0 ) )
            {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:130:1: ( ( rule__Query__Group__0 ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:131:1: ( rule__Query__Group__0 )
            {
             before(grammarAccess.getQueryAccess().getGroup()); 
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:132:1: ( rule__Query__Group__0 )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:132:2: rule__Query__Group__0
            {
            pushFollow(FOLLOW_rule__Query__Group__0_in_ruleQuery215);
            rule__Query__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getGroup()); 

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
    // $ANTLR end "ruleQuery"


    // $ANTLR start "entryRuleColumn"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:144:1: entryRuleColumn : ruleColumn EOF ;
    public final void entryRuleColumn() throws RecognitionException {
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:145:1: ( ruleColumn EOF )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:146:1: ruleColumn EOF
            {
             before(grammarAccess.getColumnRule()); 
            pushFollow(FOLLOW_ruleColumn_in_entryRuleColumn242);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getColumnRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColumn249); 

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
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:153:1: ruleColumn : ( ( rule__Column__Group__0 ) ) ;
    public final void ruleColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:157:2: ( ( ( rule__Column__Group__0 ) ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:158:1: ( ( rule__Column__Group__0 ) )
            {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:158:1: ( ( rule__Column__Group__0 ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:159:1: ( rule__Column__Group__0 )
            {
             before(grammarAccess.getColumnAccess().getGroup()); 
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:160:1: ( rule__Column__Group__0 )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:160:2: rule__Column__Group__0
            {
            pushFollow(FOLLOW_rule__Column__Group__0_in_ruleColumn275);
            rule__Column__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getGroup()); 

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
    // $ANTLR end "ruleColumn"


    // $ANTLR start "entryRuleTable"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:172:1: entryRuleTable : ruleTable EOF ;
    public final void entryRuleTable() throws RecognitionException {
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:173:1: ( ruleTable EOF )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:174:1: ruleTable EOF
            {
             before(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_ruleTable_in_entryRuleTable302);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getTableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTable309); 

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
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:181:1: ruleTable : ( ( rule__Table__NameAssignment ) ) ;
    public final void ruleTable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:185:2: ( ( ( rule__Table__NameAssignment ) ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:186:1: ( ( rule__Table__NameAssignment ) )
            {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:186:1: ( ( rule__Table__NameAssignment ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:187:1: ( rule__Table__NameAssignment )
            {
             before(grammarAccess.getTableAccess().getNameAssignment()); 
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:188:1: ( rule__Table__NameAssignment )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:188:2: rule__Table__NameAssignment
            {
            pushFollow(FOLLOW_rule__Table__NameAssignment_in_ruleTable335);
            rule__Table__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleCondition"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:200:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:201:1: ( ruleCondition EOF )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:202:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition362);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondition369); 

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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:209:1: ruleCondition : ( ( rule__Condition__Alternatives ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:213:2: ( ( ( rule__Condition__Alternatives ) ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:214:1: ( ( rule__Condition__Alternatives ) )
            {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:214:1: ( ( rule__Condition__Alternatives ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:215:1: ( rule__Condition__Alternatives )
            {
             before(grammarAccess.getConditionAccess().getAlternatives()); 
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:216:1: ( rule__Condition__Alternatives )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:216:2: rule__Condition__Alternatives
            {
            pushFollow(FOLLOW_rule__Condition__Alternatives_in_ruleCondition395);
            rule__Condition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleEquality"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:228:1: entryRuleEquality : ruleEquality EOF ;
    public final void entryRuleEquality() throws RecognitionException {
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:229:1: ( ruleEquality EOF )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:230:1: ruleEquality EOF
            {
             before(grammarAccess.getEqualityRule()); 
            pushFollow(FOLLOW_ruleEquality_in_entryRuleEquality422);
            ruleEquality();

            state._fsp--;

             after(grammarAccess.getEqualityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEquality429); 

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
    // $ANTLR end "entryRuleEquality"


    // $ANTLR start "ruleEquality"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:237:1: ruleEquality : ( ( rule__Equality__Group__0 ) ) ;
    public final void ruleEquality() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:241:2: ( ( ( rule__Equality__Group__0 ) ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:242:1: ( ( rule__Equality__Group__0 ) )
            {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:242:1: ( ( rule__Equality__Group__0 ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:243:1: ( rule__Equality__Group__0 )
            {
             before(grammarAccess.getEqualityAccess().getGroup()); 
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:244:1: ( rule__Equality__Group__0 )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:244:2: rule__Equality__Group__0
            {
            pushFollow(FOLLOW_rule__Equality__Group__0_in_ruleEquality455);
            rule__Equality__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEqualityAccess().getGroup()); 

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
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleBinaryCondition"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:256:1: entryRuleBinaryCondition : ruleBinaryCondition EOF ;
    public final void entryRuleBinaryCondition() throws RecognitionException {
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:257:1: ( ruleBinaryCondition EOF )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:258:1: ruleBinaryCondition EOF
            {
             before(grammarAccess.getBinaryConditionRule()); 
            pushFollow(FOLLOW_ruleBinaryCondition_in_entryRuleBinaryCondition482);
            ruleBinaryCondition();

            state._fsp--;

             after(grammarAccess.getBinaryConditionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinaryCondition489); 

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
    // $ANTLR end "entryRuleBinaryCondition"


    // $ANTLR start "ruleBinaryCondition"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:265:1: ruleBinaryCondition : ( ( rule__BinaryCondition__Alternatives ) ) ;
    public final void ruleBinaryCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:269:2: ( ( ( rule__BinaryCondition__Alternatives ) ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:270:1: ( ( rule__BinaryCondition__Alternatives ) )
            {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:270:1: ( ( rule__BinaryCondition__Alternatives ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:271:1: ( rule__BinaryCondition__Alternatives )
            {
             before(grammarAccess.getBinaryConditionAccess().getAlternatives()); 
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:272:1: ( rule__BinaryCondition__Alternatives )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:272:2: rule__BinaryCondition__Alternatives
            {
            pushFollow(FOLLOW_rule__BinaryCondition__Alternatives_in_ruleBinaryCondition515);
            rule__BinaryCondition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBinaryConditionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleBinaryCondition"


    // $ANTLR start "entryRuleColumnEquality"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:284:1: entryRuleColumnEquality : ruleColumnEquality EOF ;
    public final void entryRuleColumnEquality() throws RecognitionException {
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:285:1: ( ruleColumnEquality EOF )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:286:1: ruleColumnEquality EOF
            {
             before(grammarAccess.getColumnEqualityRule()); 
            pushFollow(FOLLOW_ruleColumnEquality_in_entryRuleColumnEquality542);
            ruleColumnEquality();

            state._fsp--;

             after(grammarAccess.getColumnEqualityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColumnEquality549); 

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
    // $ANTLR end "entryRuleColumnEquality"


    // $ANTLR start "ruleColumnEquality"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:293:1: ruleColumnEquality : ( ( rule__ColumnEquality__RightAssignment ) ) ;
    public final void ruleColumnEquality() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:297:2: ( ( ( rule__ColumnEquality__RightAssignment ) ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:298:1: ( ( rule__ColumnEquality__RightAssignment ) )
            {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:298:1: ( ( rule__ColumnEquality__RightAssignment ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:299:1: ( rule__ColumnEquality__RightAssignment )
            {
             before(grammarAccess.getColumnEqualityAccess().getRightAssignment()); 
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:300:1: ( rule__ColumnEquality__RightAssignment )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:300:2: rule__ColumnEquality__RightAssignment
            {
            pushFollow(FOLLOW_rule__ColumnEquality__RightAssignment_in_ruleColumnEquality575);
            rule__ColumnEquality__RightAssignment();

            state._fsp--;


            }

             after(grammarAccess.getColumnEqualityAccess().getRightAssignment()); 

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
    // $ANTLR end "ruleColumnEquality"


    // $ANTLR start "entryRuleValueEquality"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:312:1: entryRuleValueEquality : ruleValueEquality EOF ;
    public final void entryRuleValueEquality() throws RecognitionException {
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:313:1: ( ruleValueEquality EOF )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:314:1: ruleValueEquality EOF
            {
             before(grammarAccess.getValueEqualityRule()); 
            pushFollow(FOLLOW_ruleValueEquality_in_entryRuleValueEquality602);
            ruleValueEquality();

            state._fsp--;

             after(grammarAccess.getValueEqualityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueEquality609); 

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
    // $ANTLR end "entryRuleValueEquality"


    // $ANTLR start "ruleValueEquality"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:321:1: ruleValueEquality : ( ( rule__ValueEquality__RightAssignment ) ) ;
    public final void ruleValueEquality() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:325:2: ( ( ( rule__ValueEquality__RightAssignment ) ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:326:1: ( ( rule__ValueEquality__RightAssignment ) )
            {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:326:1: ( ( rule__ValueEquality__RightAssignment ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:327:1: ( rule__ValueEquality__RightAssignment )
            {
             before(grammarAccess.getValueEqualityAccess().getRightAssignment()); 
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:328:1: ( rule__ValueEquality__RightAssignment )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:328:2: rule__ValueEquality__RightAssignment
            {
            pushFollow(FOLLOW_rule__ValueEquality__RightAssignment_in_ruleValueEquality635);
            rule__ValueEquality__RightAssignment();

            state._fsp--;


            }

             after(grammarAccess.getValueEqualityAccess().getRightAssignment()); 

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
    // $ANTLR end "ruleValueEquality"


    // $ANTLR start "entryRuleAndCondition"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:340:1: entryRuleAndCondition : ruleAndCondition EOF ;
    public final void entryRuleAndCondition() throws RecognitionException {
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:341:1: ( ruleAndCondition EOF )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:342:1: ruleAndCondition EOF
            {
             before(grammarAccess.getAndConditionRule()); 
            pushFollow(FOLLOW_ruleAndCondition_in_entryRuleAndCondition662);
            ruleAndCondition();

            state._fsp--;

             after(grammarAccess.getAndConditionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndCondition669); 

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
    // $ANTLR end "entryRuleAndCondition"


    // $ANTLR start "ruleAndCondition"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:349:1: ruleAndCondition : ( ( rule__AndCondition__Group__0 ) ) ;
    public final void ruleAndCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:353:2: ( ( ( rule__AndCondition__Group__0 ) ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:354:1: ( ( rule__AndCondition__Group__0 ) )
            {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:354:1: ( ( rule__AndCondition__Group__0 ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:355:1: ( rule__AndCondition__Group__0 )
            {
             before(grammarAccess.getAndConditionAccess().getGroup()); 
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:356:1: ( rule__AndCondition__Group__0 )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:356:2: rule__AndCondition__Group__0
            {
            pushFollow(FOLLOW_rule__AndCondition__Group__0_in_ruleAndCondition695);
            rule__AndCondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndConditionAccess().getGroup()); 

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
    // $ANTLR end "ruleAndCondition"


    // $ANTLR start "entryRuleOrCondition"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:368:1: entryRuleOrCondition : ruleOrCondition EOF ;
    public final void entryRuleOrCondition() throws RecognitionException {
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:369:1: ( ruleOrCondition EOF )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:370:1: ruleOrCondition EOF
            {
             before(grammarAccess.getOrConditionRule()); 
            pushFollow(FOLLOW_ruleOrCondition_in_entryRuleOrCondition722);
            ruleOrCondition();

            state._fsp--;

             after(grammarAccess.getOrConditionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrCondition729); 

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
    // $ANTLR end "entryRuleOrCondition"


    // $ANTLR start "ruleOrCondition"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:377:1: ruleOrCondition : ( ( rule__OrCondition__Group__0 ) ) ;
    public final void ruleOrCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:381:2: ( ( ( rule__OrCondition__Group__0 ) ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:382:1: ( ( rule__OrCondition__Group__0 ) )
            {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:382:1: ( ( rule__OrCondition__Group__0 ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:383:1: ( rule__OrCondition__Group__0 )
            {
             before(grammarAccess.getOrConditionAccess().getGroup()); 
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:384:1: ( rule__OrCondition__Group__0 )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:384:2: rule__OrCondition__Group__0
            {
            pushFollow(FOLLOW_rule__OrCondition__Group__0_in_ruleOrCondition755);
            rule__OrCondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrConditionAccess().getGroup()); 

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
    // $ANTLR end "ruleOrCondition"


    // $ANTLR start "rule__Condition__Alternatives"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:396:1: rule__Condition__Alternatives : ( ( ruleBinaryCondition ) | ( ruleEquality ) );
    public final void rule__Condition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:400:1: ( ( ruleBinaryCondition ) | ( ruleEquality ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:401:1: ( ruleBinaryCondition )
                    {
                    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:401:1: ( ruleBinaryCondition )
                    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:402:1: ruleBinaryCondition
                    {
                     before(grammarAccess.getConditionAccess().getBinaryConditionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBinaryCondition_in_rule__Condition__Alternatives791);
                    ruleBinaryCondition();

                    state._fsp--;

                     after(grammarAccess.getConditionAccess().getBinaryConditionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:407:6: ( ruleEquality )
                    {
                    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:407:6: ( ruleEquality )
                    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:408:1: ruleEquality
                    {
                     before(grammarAccess.getConditionAccess().getEqualityParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEquality_in_rule__Condition__Alternatives808);
                    ruleEquality();

                    state._fsp--;

                     after(grammarAccess.getConditionAccess().getEqualityParserRuleCall_1()); 

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
    // $ANTLR end "rule__Condition__Alternatives"


    // $ANTLR start "rule__Equality__RightAlternatives_2_0"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:418:1: rule__Equality__RightAlternatives_2_0 : ( ( ruleColumnEquality ) | ( ruleValueEquality ) );
    public final void rule__Equality__RightAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:422:1: ( ( ruleColumnEquality ) | ( ruleValueEquality ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_STRING) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:423:1: ( ruleColumnEquality )
                    {
                    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:423:1: ( ruleColumnEquality )
                    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:424:1: ruleColumnEquality
                    {
                     before(grammarAccess.getEqualityAccess().getRightColumnEqualityParserRuleCall_2_0_0()); 
                    pushFollow(FOLLOW_ruleColumnEquality_in_rule__Equality__RightAlternatives_2_0840);
                    ruleColumnEquality();

                    state._fsp--;

                     after(grammarAccess.getEqualityAccess().getRightColumnEqualityParserRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:429:6: ( ruleValueEquality )
                    {
                    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:429:6: ( ruleValueEquality )
                    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:430:1: ruleValueEquality
                    {
                     before(grammarAccess.getEqualityAccess().getRightValueEqualityParserRuleCall_2_0_1()); 
                    pushFollow(FOLLOW_ruleValueEquality_in_rule__Equality__RightAlternatives_2_0857);
                    ruleValueEquality();

                    state._fsp--;

                     after(grammarAccess.getEqualityAccess().getRightValueEqualityParserRuleCall_2_0_1()); 

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
    // $ANTLR end "rule__Equality__RightAlternatives_2_0"


    // $ANTLR start "rule__BinaryCondition__Alternatives"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:440:1: rule__BinaryCondition__Alternatives : ( ( ruleAndCondition ) | ( ruleOrCondition ) );
    public final void rule__BinaryCondition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:444:1: ( ( ruleAndCondition ) | ( ruleOrCondition ) )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:445:1: ( ruleAndCondition )
                    {
                    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:445:1: ( ruleAndCondition )
                    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:446:1: ruleAndCondition
                    {
                     before(grammarAccess.getBinaryConditionAccess().getAndConditionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAndCondition_in_rule__BinaryCondition__Alternatives889);
                    ruleAndCondition();

                    state._fsp--;

                     after(grammarAccess.getBinaryConditionAccess().getAndConditionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:451:6: ( ruleOrCondition )
                    {
                    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:451:6: ( ruleOrCondition )
                    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:452:1: ruleOrCondition
                    {
                     before(grammarAccess.getBinaryConditionAccess().getOrConditionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleOrCondition_in_rule__BinaryCondition__Alternatives906);
                    ruleOrCondition();

                    state._fsp--;

                     after(grammarAccess.getBinaryConditionAccess().getOrConditionParserRuleCall_1()); 

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
    // $ANTLR end "rule__BinaryCondition__Alternatives"


    // $ANTLR start "rule__Query__Group__0"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:464:1: rule__Query__Group__0 : rule__Query__Group__0__Impl rule__Query__Group__1 ;
    public final void rule__Query__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:468:1: ( rule__Query__Group__0__Impl rule__Query__Group__1 )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:469:2: rule__Query__Group__0__Impl rule__Query__Group__1
            {
            pushFollow(FOLLOW_rule__Query__Group__0__Impl_in_rule__Query__Group__0936);
            rule__Query__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Query__Group__1_in_rule__Query__Group__0939);
            rule__Query__Group__1();

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
    // $ANTLR end "rule__Query__Group__0"


    // $ANTLR start "rule__Query__Group__0__Impl"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:476:1: rule__Query__Group__0__Impl : ( 'select' ) ;
    public final void rule__Query__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:480:1: ( ( 'select' ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:481:1: ( 'select' )
            {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:481:1: ( 'select' )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:482:1: 'select'
            {
             before(grammarAccess.getQueryAccess().getSelectKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Query__Group__0__Impl967); 
             after(grammarAccess.getQueryAccess().getSelectKeyword_0()); 

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
    // $ANTLR end "rule__Query__Group__0__Impl"


    // $ANTLR start "rule__Query__Group__1"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:495:1: rule__Query__Group__1 : rule__Query__Group__1__Impl rule__Query__Group__2 ;
    public final void rule__Query__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:499:1: ( rule__Query__Group__1__Impl rule__Query__Group__2 )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:500:2: rule__Query__Group__1__Impl rule__Query__Group__2
            {
            pushFollow(FOLLOW_rule__Query__Group__1__Impl_in_rule__Query__Group__1998);
            rule__Query__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Query__Group__2_in_rule__Query__Group__11001);
            rule__Query__Group__2();

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
    // $ANTLR end "rule__Query__Group__1"


    // $ANTLR start "rule__Query__Group__1__Impl"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:507:1: rule__Query__Group__1__Impl : ( ( rule__Query__ColumnAssignment_1 ) ) ;
    public final void rule__Query__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:511:1: ( ( ( rule__Query__ColumnAssignment_1 ) ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:512:1: ( ( rule__Query__ColumnAssignment_1 ) )
            {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:512:1: ( ( rule__Query__ColumnAssignment_1 ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:513:1: ( rule__Query__ColumnAssignment_1 )
            {
             before(grammarAccess.getQueryAccess().getColumnAssignment_1()); 
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:514:1: ( rule__Query__ColumnAssignment_1 )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:514:2: rule__Query__ColumnAssignment_1
            {
            pushFollow(FOLLOW_rule__Query__ColumnAssignment_1_in_rule__Query__Group__1__Impl1028);
            rule__Query__ColumnAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getColumnAssignment_1()); 

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
    // $ANTLR end "rule__Query__Group__1__Impl"


    // $ANTLR start "rule__Query__Group__2"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:524:1: rule__Query__Group__2 : rule__Query__Group__2__Impl rule__Query__Group__3 ;
    public final void rule__Query__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:528:1: ( rule__Query__Group__2__Impl rule__Query__Group__3 )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:529:2: rule__Query__Group__2__Impl rule__Query__Group__3
            {
            pushFollow(FOLLOW_rule__Query__Group__2__Impl_in_rule__Query__Group__21058);
            rule__Query__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Query__Group__3_in_rule__Query__Group__21061);
            rule__Query__Group__3();

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
    // $ANTLR end "rule__Query__Group__2"


    // $ANTLR start "rule__Query__Group__2__Impl"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:536:1: rule__Query__Group__2__Impl : ( ( rule__Query__Group_2__0 )* ) ;
    public final void rule__Query__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:540:1: ( ( ( rule__Query__Group_2__0 )* ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:541:1: ( ( rule__Query__Group_2__0 )* )
            {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:541:1: ( ( rule__Query__Group_2__0 )* )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:542:1: ( rule__Query__Group_2__0 )*
            {
             before(grammarAccess.getQueryAccess().getGroup_2()); 
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:543:1: ( rule__Query__Group_2__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==13) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:543:2: rule__Query__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Query__Group_2__0_in_rule__Query__Group__2__Impl1088);
            	    rule__Query__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getQueryAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Query__Group__2__Impl"


    // $ANTLR start "rule__Query__Group__3"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:553:1: rule__Query__Group__3 : rule__Query__Group__3__Impl rule__Query__Group__4 ;
    public final void rule__Query__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:557:1: ( rule__Query__Group__3__Impl rule__Query__Group__4 )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:558:2: rule__Query__Group__3__Impl rule__Query__Group__4
            {
            pushFollow(FOLLOW_rule__Query__Group__3__Impl_in_rule__Query__Group__31119);
            rule__Query__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Query__Group__4_in_rule__Query__Group__31122);
            rule__Query__Group__4();

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
    // $ANTLR end "rule__Query__Group__3"


    // $ANTLR start "rule__Query__Group__3__Impl"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:565:1: rule__Query__Group__3__Impl : ( 'from' ) ;
    public final void rule__Query__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:569:1: ( ( 'from' ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:570:1: ( 'from' )
            {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:570:1: ( 'from' )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:571:1: 'from'
            {
             before(grammarAccess.getQueryAccess().getFromKeyword_3()); 
            match(input,12,FOLLOW_12_in_rule__Query__Group__3__Impl1150); 
             after(grammarAccess.getQueryAccess().getFromKeyword_3()); 

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
    // $ANTLR end "rule__Query__Group__3__Impl"


    // $ANTLR start "rule__Query__Group__4"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:584:1: rule__Query__Group__4 : rule__Query__Group__4__Impl rule__Query__Group__5 ;
    public final void rule__Query__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:588:1: ( rule__Query__Group__4__Impl rule__Query__Group__5 )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:589:2: rule__Query__Group__4__Impl rule__Query__Group__5
            {
            pushFollow(FOLLOW_rule__Query__Group__4__Impl_in_rule__Query__Group__41181);
            rule__Query__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Query__Group__5_in_rule__Query__Group__41184);
            rule__Query__Group__5();

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
    // $ANTLR end "rule__Query__Group__4"


    // $ANTLR start "rule__Query__Group__4__Impl"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:596:1: rule__Query__Group__4__Impl : ( ( rule__Query__TableAssignment_4 ) ) ;
    public final void rule__Query__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:600:1: ( ( ( rule__Query__TableAssignment_4 ) ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:601:1: ( ( rule__Query__TableAssignment_4 ) )
            {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:601:1: ( ( rule__Query__TableAssignment_4 ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:602:1: ( rule__Query__TableAssignment_4 )
            {
             before(grammarAccess.getQueryAccess().getTableAssignment_4()); 
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:603:1: ( rule__Query__TableAssignment_4 )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:603:2: rule__Query__TableAssignment_4
            {
            pushFollow(FOLLOW_rule__Query__TableAssignment_4_in_rule__Query__Group__4__Impl1211);
            rule__Query__TableAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getTableAssignment_4()); 

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
    // $ANTLR end "rule__Query__Group__4__Impl"


    // $ANTLR start "rule__Query__Group__5"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:613:1: rule__Query__Group__5 : rule__Query__Group__5__Impl rule__Query__Group__6 ;
    public final void rule__Query__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:617:1: ( rule__Query__Group__5__Impl rule__Query__Group__6 )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:618:2: rule__Query__Group__5__Impl rule__Query__Group__6
            {
            pushFollow(FOLLOW_rule__Query__Group__5__Impl_in_rule__Query__Group__51241);
            rule__Query__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Query__Group__6_in_rule__Query__Group__51244);
            rule__Query__Group__6();

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
    // $ANTLR end "rule__Query__Group__5"


    // $ANTLR start "rule__Query__Group__5__Impl"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:625:1: rule__Query__Group__5__Impl : ( ( rule__Query__Group_5__0 )* ) ;
    public final void rule__Query__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:629:1: ( ( ( rule__Query__Group_5__0 )* ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:630:1: ( ( rule__Query__Group_5__0 )* )
            {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:630:1: ( ( rule__Query__Group_5__0 )* )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:631:1: ( rule__Query__Group_5__0 )*
            {
             before(grammarAccess.getQueryAccess().getGroup_5()); 
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:632:1: ( rule__Query__Group_5__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==13) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:632:2: rule__Query__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__Query__Group_5__0_in_rule__Query__Group__5__Impl1271);
            	    rule__Query__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getQueryAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Query__Group__5__Impl"


    // $ANTLR start "rule__Query__Group__6"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:642:1: rule__Query__Group__6 : rule__Query__Group__6__Impl ;
    public final void rule__Query__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:646:1: ( rule__Query__Group__6__Impl )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:647:2: rule__Query__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Query__Group__6__Impl_in_rule__Query__Group__61302);
            rule__Query__Group__6__Impl();

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
    // $ANTLR end "rule__Query__Group__6"


    // $ANTLR start "rule__Query__Group__6__Impl"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:653:1: rule__Query__Group__6__Impl : ( ( rule__Query__Group_6__0 )? ) ;
    public final void rule__Query__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:657:1: ( ( ( rule__Query__Group_6__0 )? ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:658:1: ( ( rule__Query__Group_6__0 )? )
            {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:658:1: ( ( rule__Query__Group_6__0 )? )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:659:1: ( rule__Query__Group_6__0 )?
            {
             before(grammarAccess.getQueryAccess().getGroup_6()); 
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:660:1: ( rule__Query__Group_6__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:660:2: rule__Query__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Query__Group_6__0_in_rule__Query__Group__6__Impl1329);
                    rule__Query__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQueryAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Query__Group__6__Impl"


    // $ANTLR start "rule__Query__Group_2__0"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:684:1: rule__Query__Group_2__0 : rule__Query__Group_2__0__Impl rule__Query__Group_2__1 ;
    public final void rule__Query__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:688:1: ( rule__Query__Group_2__0__Impl rule__Query__Group_2__1 )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:689:2: rule__Query__Group_2__0__Impl rule__Query__Group_2__1
            {
            pushFollow(FOLLOW_rule__Query__Group_2__0__Impl_in_rule__Query__Group_2__01374);
            rule__Query__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Query__Group_2__1_in_rule__Query__Group_2__01377);
            rule__Query__Group_2__1();

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
    // $ANTLR end "rule__Query__Group_2__0"


    // $ANTLR start "rule__Query__Group_2__0__Impl"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:696:1: rule__Query__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Query__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:700:1: ( ( ',' ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:701:1: ( ',' )
            {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:701:1: ( ',' )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:702:1: ','
            {
             before(grammarAccess.getQueryAccess().getCommaKeyword_2_0()); 
            match(input,13,FOLLOW_13_in_rule__Query__Group_2__0__Impl1405); 
             after(grammarAccess.getQueryAccess().getCommaKeyword_2_0()); 

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
    // $ANTLR end "rule__Query__Group_2__0__Impl"


    // $ANTLR start "rule__Query__Group_2__1"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:715:1: rule__Query__Group_2__1 : rule__Query__Group_2__1__Impl ;
    public final void rule__Query__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:719:1: ( rule__Query__Group_2__1__Impl )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:720:2: rule__Query__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Query__Group_2__1__Impl_in_rule__Query__Group_2__11436);
            rule__Query__Group_2__1__Impl();

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
    // $ANTLR end "rule__Query__Group_2__1"


    // $ANTLR start "rule__Query__Group_2__1__Impl"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:726:1: rule__Query__Group_2__1__Impl : ( ( rule__Query__ColumnsAssignment_2_1 ) ) ;
    public final void rule__Query__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:730:1: ( ( ( rule__Query__ColumnsAssignment_2_1 ) ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:731:1: ( ( rule__Query__ColumnsAssignment_2_1 ) )
            {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:731:1: ( ( rule__Query__ColumnsAssignment_2_1 ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:732:1: ( rule__Query__ColumnsAssignment_2_1 )
            {
             before(grammarAccess.getQueryAccess().getColumnsAssignment_2_1()); 
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:733:1: ( rule__Query__ColumnsAssignment_2_1 )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:733:2: rule__Query__ColumnsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Query__ColumnsAssignment_2_1_in_rule__Query__Group_2__1__Impl1463);
            rule__Query__ColumnsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getColumnsAssignment_2_1()); 

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
    // $ANTLR end "rule__Query__Group_2__1__Impl"


    // $ANTLR start "rule__Query__Group_5__0"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:747:1: rule__Query__Group_5__0 : rule__Query__Group_5__0__Impl rule__Query__Group_5__1 ;
    public final void rule__Query__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:751:1: ( rule__Query__Group_5__0__Impl rule__Query__Group_5__1 )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:752:2: rule__Query__Group_5__0__Impl rule__Query__Group_5__1
            {
            pushFollow(FOLLOW_rule__Query__Group_5__0__Impl_in_rule__Query__Group_5__01497);
            rule__Query__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Query__Group_5__1_in_rule__Query__Group_5__01500);
            rule__Query__Group_5__1();

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
    // $ANTLR end "rule__Query__Group_5__0"


    // $ANTLR start "rule__Query__Group_5__0__Impl"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:759:1: rule__Query__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Query__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:763:1: ( ( ',' ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:764:1: ( ',' )
            {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:764:1: ( ',' )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:765:1: ','
            {
             before(grammarAccess.getQueryAccess().getCommaKeyword_5_0()); 
            match(input,13,FOLLOW_13_in_rule__Query__Group_5__0__Impl1528); 
             after(grammarAccess.getQueryAccess().getCommaKeyword_5_0()); 

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
    // $ANTLR end "rule__Query__Group_5__0__Impl"


    // $ANTLR start "rule__Query__Group_5__1"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:778:1: rule__Query__Group_5__1 : rule__Query__Group_5__1__Impl ;
    public final void rule__Query__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:782:1: ( rule__Query__Group_5__1__Impl )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:783:2: rule__Query__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Query__Group_5__1__Impl_in_rule__Query__Group_5__11559);
            rule__Query__Group_5__1__Impl();

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
    // $ANTLR end "rule__Query__Group_5__1"


    // $ANTLR start "rule__Query__Group_5__1__Impl"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:789:1: rule__Query__Group_5__1__Impl : ( ( rule__Query__TablesAssignment_5_1 ) ) ;
    public final void rule__Query__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:793:1: ( ( ( rule__Query__TablesAssignment_5_1 ) ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:794:1: ( ( rule__Query__TablesAssignment_5_1 ) )
            {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:794:1: ( ( rule__Query__TablesAssignment_5_1 ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:795:1: ( rule__Query__TablesAssignment_5_1 )
            {
             before(grammarAccess.getQueryAccess().getTablesAssignment_5_1()); 
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:796:1: ( rule__Query__TablesAssignment_5_1 )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:796:2: rule__Query__TablesAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Query__TablesAssignment_5_1_in_rule__Query__Group_5__1__Impl1586);
            rule__Query__TablesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getTablesAssignment_5_1()); 

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
    // $ANTLR end "rule__Query__Group_5__1__Impl"


    // $ANTLR start "rule__Query__Group_6__0"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:810:1: rule__Query__Group_6__0 : rule__Query__Group_6__0__Impl rule__Query__Group_6__1 ;
    public final void rule__Query__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:814:1: ( rule__Query__Group_6__0__Impl rule__Query__Group_6__1 )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:815:2: rule__Query__Group_6__0__Impl rule__Query__Group_6__1
            {
            pushFollow(FOLLOW_rule__Query__Group_6__0__Impl_in_rule__Query__Group_6__01620);
            rule__Query__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Query__Group_6__1_in_rule__Query__Group_6__01623);
            rule__Query__Group_6__1();

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
    // $ANTLR end "rule__Query__Group_6__0"


    // $ANTLR start "rule__Query__Group_6__0__Impl"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:822:1: rule__Query__Group_6__0__Impl : ( 'where' ) ;
    public final void rule__Query__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:826:1: ( ( 'where' ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:827:1: ( 'where' )
            {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:827:1: ( 'where' )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:828:1: 'where'
            {
             before(grammarAccess.getQueryAccess().getWhereKeyword_6_0()); 
            match(input,14,FOLLOW_14_in_rule__Query__Group_6__0__Impl1651); 
             after(grammarAccess.getQueryAccess().getWhereKeyword_6_0()); 

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
    // $ANTLR end "rule__Query__Group_6__0__Impl"


    // $ANTLR start "rule__Query__Group_6__1"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:841:1: rule__Query__Group_6__1 : rule__Query__Group_6__1__Impl ;
    public final void rule__Query__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:845:1: ( rule__Query__Group_6__1__Impl )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:846:2: rule__Query__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Query__Group_6__1__Impl_in_rule__Query__Group_6__11682);
            rule__Query__Group_6__1__Impl();

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
    // $ANTLR end "rule__Query__Group_6__1"


    // $ANTLR start "rule__Query__Group_6__1__Impl"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:852:1: rule__Query__Group_6__1__Impl : ( ( rule__Query__ConditionsAssignment_6_1 ) ) ;
    public final void rule__Query__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:856:1: ( ( ( rule__Query__ConditionsAssignment_6_1 ) ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:857:1: ( ( rule__Query__ConditionsAssignment_6_1 ) )
            {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:857:1: ( ( rule__Query__ConditionsAssignment_6_1 ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:858:1: ( rule__Query__ConditionsAssignment_6_1 )
            {
             before(grammarAccess.getQueryAccess().getConditionsAssignment_6_1()); 
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:859:1: ( rule__Query__ConditionsAssignment_6_1 )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:859:2: rule__Query__ConditionsAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Query__ConditionsAssignment_6_1_in_rule__Query__Group_6__1__Impl1709);
            rule__Query__ConditionsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getConditionsAssignment_6_1()); 

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
    // $ANTLR end "rule__Query__Group_6__1__Impl"


    // $ANTLR start "rule__Column__Group__0"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:873:1: rule__Column__Group__0 : rule__Column__Group__0__Impl rule__Column__Group__1 ;
    public final void rule__Column__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:877:1: ( rule__Column__Group__0__Impl rule__Column__Group__1 )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:878:2: rule__Column__Group__0__Impl rule__Column__Group__1
            {
            pushFollow(FOLLOW_rule__Column__Group__0__Impl_in_rule__Column__Group__01743);
            rule__Column__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Column__Group__1_in_rule__Column__Group__01746);
            rule__Column__Group__1();

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
    // $ANTLR end "rule__Column__Group__0"


    // $ANTLR start "rule__Column__Group__0__Impl"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:885:1: rule__Column__Group__0__Impl : ( ( rule__Column__Group_0__0 )? ) ;
    public final void rule__Column__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:889:1: ( ( ( rule__Column__Group_0__0 )? ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:890:1: ( ( rule__Column__Group_0__0 )? )
            {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:890:1: ( ( rule__Column__Group_0__0 )? )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:891:1: ( rule__Column__Group_0__0 )?
            {
             before(grammarAccess.getColumnAccess().getGroup_0()); 
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:892:1: ( rule__Column__Group_0__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==15) ) {
                    alt8=1;
                }
            }
            switch (alt8) {
                case 1 :
                    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:892:2: rule__Column__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Column__Group_0__0_in_rule__Column__Group__0__Impl1773);
                    rule__Column__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getColumnAccess().getGroup_0()); 

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
    // $ANTLR end "rule__Column__Group__0__Impl"


    // $ANTLR start "rule__Column__Group__1"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:902:1: rule__Column__Group__1 : rule__Column__Group__1__Impl ;
    public final void rule__Column__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:906:1: ( rule__Column__Group__1__Impl )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:907:2: rule__Column__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Column__Group__1__Impl_in_rule__Column__Group__11804);
            rule__Column__Group__1__Impl();

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
    // $ANTLR end "rule__Column__Group__1"


    // $ANTLR start "rule__Column__Group__1__Impl"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:913:1: rule__Column__Group__1__Impl : ( ( rule__Column__NameAssignment_1 ) ) ;
    public final void rule__Column__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:917:1: ( ( ( rule__Column__NameAssignment_1 ) ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:918:1: ( ( rule__Column__NameAssignment_1 ) )
            {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:918:1: ( ( rule__Column__NameAssignment_1 ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:919:1: ( rule__Column__NameAssignment_1 )
            {
             before(grammarAccess.getColumnAccess().getNameAssignment_1()); 
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:920:1: ( rule__Column__NameAssignment_1 )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:920:2: rule__Column__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Column__NameAssignment_1_in_rule__Column__Group__1__Impl1831);
            rule__Column__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Column__Group__1__Impl"


    // $ANTLR start "rule__Column__Group_0__0"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:934:1: rule__Column__Group_0__0 : rule__Column__Group_0__0__Impl rule__Column__Group_0__1 ;
    public final void rule__Column__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:938:1: ( rule__Column__Group_0__0__Impl rule__Column__Group_0__1 )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:939:2: rule__Column__Group_0__0__Impl rule__Column__Group_0__1
            {
            pushFollow(FOLLOW_rule__Column__Group_0__0__Impl_in_rule__Column__Group_0__01865);
            rule__Column__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Column__Group_0__1_in_rule__Column__Group_0__01868);
            rule__Column__Group_0__1();

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
    // $ANTLR end "rule__Column__Group_0__0"


    // $ANTLR start "rule__Column__Group_0__0__Impl"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:946:1: rule__Column__Group_0__0__Impl : ( ( rule__Column__TableAssignment_0_0 ) ) ;
    public final void rule__Column__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:950:1: ( ( ( rule__Column__TableAssignment_0_0 ) ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:951:1: ( ( rule__Column__TableAssignment_0_0 ) )
            {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:951:1: ( ( rule__Column__TableAssignment_0_0 ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:952:1: ( rule__Column__TableAssignment_0_0 )
            {
             before(grammarAccess.getColumnAccess().getTableAssignment_0_0()); 
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:953:1: ( rule__Column__TableAssignment_0_0 )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:953:2: rule__Column__TableAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Column__TableAssignment_0_0_in_rule__Column__Group_0__0__Impl1895);
            rule__Column__TableAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getTableAssignment_0_0()); 

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
    // $ANTLR end "rule__Column__Group_0__0__Impl"


    // $ANTLR start "rule__Column__Group_0__1"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:963:1: rule__Column__Group_0__1 : rule__Column__Group_0__1__Impl ;
    public final void rule__Column__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:967:1: ( rule__Column__Group_0__1__Impl )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:968:2: rule__Column__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Column__Group_0__1__Impl_in_rule__Column__Group_0__11925);
            rule__Column__Group_0__1__Impl();

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
    // $ANTLR end "rule__Column__Group_0__1"


    // $ANTLR start "rule__Column__Group_0__1__Impl"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:974:1: rule__Column__Group_0__1__Impl : ( '.' ) ;
    public final void rule__Column__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:978:1: ( ( '.' ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:979:1: ( '.' )
            {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:979:1: ( '.' )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:980:1: '.'
            {
             before(grammarAccess.getColumnAccess().getFullStopKeyword_0_1()); 
            match(input,15,FOLLOW_15_in_rule__Column__Group_0__1__Impl1953); 
             after(grammarAccess.getColumnAccess().getFullStopKeyword_0_1()); 

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
    // $ANTLR end "rule__Column__Group_0__1__Impl"


    // $ANTLR start "rule__Equality__Group__0"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:997:1: rule__Equality__Group__0 : rule__Equality__Group__0__Impl rule__Equality__Group__1 ;
    public final void rule__Equality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1001:1: ( rule__Equality__Group__0__Impl rule__Equality__Group__1 )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1002:2: rule__Equality__Group__0__Impl rule__Equality__Group__1
            {
            pushFollow(FOLLOW_rule__Equality__Group__0__Impl_in_rule__Equality__Group__01988);
            rule__Equality__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Equality__Group__1_in_rule__Equality__Group__01991);
            rule__Equality__Group__1();

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
    // $ANTLR end "rule__Equality__Group__0"


    // $ANTLR start "rule__Equality__Group__0__Impl"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1009:1: rule__Equality__Group__0__Impl : ( ( rule__Equality__LeftAssignment_0 ) ) ;
    public final void rule__Equality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1013:1: ( ( ( rule__Equality__LeftAssignment_0 ) ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1014:1: ( ( rule__Equality__LeftAssignment_0 ) )
            {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1014:1: ( ( rule__Equality__LeftAssignment_0 ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1015:1: ( rule__Equality__LeftAssignment_0 )
            {
             before(grammarAccess.getEqualityAccess().getLeftAssignment_0()); 
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1016:1: ( rule__Equality__LeftAssignment_0 )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1016:2: rule__Equality__LeftAssignment_0
            {
            pushFollow(FOLLOW_rule__Equality__LeftAssignment_0_in_rule__Equality__Group__0__Impl2018);
            rule__Equality__LeftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEqualityAccess().getLeftAssignment_0()); 

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
    // $ANTLR end "rule__Equality__Group__0__Impl"


    // $ANTLR start "rule__Equality__Group__1"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1026:1: rule__Equality__Group__1 : rule__Equality__Group__1__Impl rule__Equality__Group__2 ;
    public final void rule__Equality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1030:1: ( rule__Equality__Group__1__Impl rule__Equality__Group__2 )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1031:2: rule__Equality__Group__1__Impl rule__Equality__Group__2
            {
            pushFollow(FOLLOW_rule__Equality__Group__1__Impl_in_rule__Equality__Group__12048);
            rule__Equality__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Equality__Group__2_in_rule__Equality__Group__12051);
            rule__Equality__Group__2();

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
    // $ANTLR end "rule__Equality__Group__1"


    // $ANTLR start "rule__Equality__Group__1__Impl"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1038:1: rule__Equality__Group__1__Impl : ( '=' ) ;
    public final void rule__Equality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1042:1: ( ( '=' ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1043:1: ( '=' )
            {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1043:1: ( '=' )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1044:1: '='
            {
             before(grammarAccess.getEqualityAccess().getEqualsSignKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__Equality__Group__1__Impl2079); 
             after(grammarAccess.getEqualityAccess().getEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__Equality__Group__1__Impl"


    // $ANTLR start "rule__Equality__Group__2"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1057:1: rule__Equality__Group__2 : rule__Equality__Group__2__Impl ;
    public final void rule__Equality__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1061:1: ( rule__Equality__Group__2__Impl )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1062:2: rule__Equality__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Equality__Group__2__Impl_in_rule__Equality__Group__22110);
            rule__Equality__Group__2__Impl();

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
    // $ANTLR end "rule__Equality__Group__2"


    // $ANTLR start "rule__Equality__Group__2__Impl"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1068:1: rule__Equality__Group__2__Impl : ( ( rule__Equality__RightAssignment_2 ) ) ;
    public final void rule__Equality__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1072:1: ( ( ( rule__Equality__RightAssignment_2 ) ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1073:1: ( ( rule__Equality__RightAssignment_2 ) )
            {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1073:1: ( ( rule__Equality__RightAssignment_2 ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1074:1: ( rule__Equality__RightAssignment_2 )
            {
             before(grammarAccess.getEqualityAccess().getRightAssignment_2()); 
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1075:1: ( rule__Equality__RightAssignment_2 )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1075:2: rule__Equality__RightAssignment_2
            {
            pushFollow(FOLLOW_rule__Equality__RightAssignment_2_in_rule__Equality__Group__2__Impl2137);
            rule__Equality__RightAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEqualityAccess().getRightAssignment_2()); 

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
    // $ANTLR end "rule__Equality__Group__2__Impl"


    // $ANTLR start "rule__AndCondition__Group__0"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1091:1: rule__AndCondition__Group__0 : rule__AndCondition__Group__0__Impl rule__AndCondition__Group__1 ;
    public final void rule__AndCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1095:1: ( rule__AndCondition__Group__0__Impl rule__AndCondition__Group__1 )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1096:2: rule__AndCondition__Group__0__Impl rule__AndCondition__Group__1
            {
            pushFollow(FOLLOW_rule__AndCondition__Group__0__Impl_in_rule__AndCondition__Group__02173);
            rule__AndCondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AndCondition__Group__1_in_rule__AndCondition__Group__02176);
            rule__AndCondition__Group__1();

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
    // $ANTLR end "rule__AndCondition__Group__0"


    // $ANTLR start "rule__AndCondition__Group__0__Impl"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1103:1: rule__AndCondition__Group__0__Impl : ( ( rule__AndCondition__LeftAssignment_0 ) ) ;
    public final void rule__AndCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1107:1: ( ( ( rule__AndCondition__LeftAssignment_0 ) ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1108:1: ( ( rule__AndCondition__LeftAssignment_0 ) )
            {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1108:1: ( ( rule__AndCondition__LeftAssignment_0 ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1109:1: ( rule__AndCondition__LeftAssignment_0 )
            {
             before(grammarAccess.getAndConditionAccess().getLeftAssignment_0()); 
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1110:1: ( rule__AndCondition__LeftAssignment_0 )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1110:2: rule__AndCondition__LeftAssignment_0
            {
            pushFollow(FOLLOW_rule__AndCondition__LeftAssignment_0_in_rule__AndCondition__Group__0__Impl2203);
            rule__AndCondition__LeftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAndConditionAccess().getLeftAssignment_0()); 

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
    // $ANTLR end "rule__AndCondition__Group__0__Impl"


    // $ANTLR start "rule__AndCondition__Group__1"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1120:1: rule__AndCondition__Group__1 : rule__AndCondition__Group__1__Impl rule__AndCondition__Group__2 ;
    public final void rule__AndCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1124:1: ( rule__AndCondition__Group__1__Impl rule__AndCondition__Group__2 )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1125:2: rule__AndCondition__Group__1__Impl rule__AndCondition__Group__2
            {
            pushFollow(FOLLOW_rule__AndCondition__Group__1__Impl_in_rule__AndCondition__Group__12233);
            rule__AndCondition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AndCondition__Group__2_in_rule__AndCondition__Group__12236);
            rule__AndCondition__Group__2();

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
    // $ANTLR end "rule__AndCondition__Group__1"


    // $ANTLR start "rule__AndCondition__Group__1__Impl"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1132:1: rule__AndCondition__Group__1__Impl : ( 'and' ) ;
    public final void rule__AndCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1136:1: ( ( 'and' ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1137:1: ( 'and' )
            {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1137:1: ( 'and' )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1138:1: 'and'
            {
             before(grammarAccess.getAndConditionAccess().getAndKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__AndCondition__Group__1__Impl2264); 
             after(grammarAccess.getAndConditionAccess().getAndKeyword_1()); 

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
    // $ANTLR end "rule__AndCondition__Group__1__Impl"


    // $ANTLR start "rule__AndCondition__Group__2"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1151:1: rule__AndCondition__Group__2 : rule__AndCondition__Group__2__Impl rule__AndCondition__Group__3 ;
    public final void rule__AndCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1155:1: ( rule__AndCondition__Group__2__Impl rule__AndCondition__Group__3 )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1156:2: rule__AndCondition__Group__2__Impl rule__AndCondition__Group__3
            {
            pushFollow(FOLLOW_rule__AndCondition__Group__2__Impl_in_rule__AndCondition__Group__22295);
            rule__AndCondition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AndCondition__Group__3_in_rule__AndCondition__Group__22298);
            rule__AndCondition__Group__3();

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
    // $ANTLR end "rule__AndCondition__Group__2"


    // $ANTLR start "rule__AndCondition__Group__2__Impl"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1163:1: rule__AndCondition__Group__2__Impl : ( '(' ) ;
    public final void rule__AndCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1167:1: ( ( '(' ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1168:1: ( '(' )
            {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1168:1: ( '(' )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1169:1: '('
            {
             before(grammarAccess.getAndConditionAccess().getLeftParenthesisKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__AndCondition__Group__2__Impl2326); 
             after(grammarAccess.getAndConditionAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__AndCondition__Group__2__Impl"


    // $ANTLR start "rule__AndCondition__Group__3"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1182:1: rule__AndCondition__Group__3 : rule__AndCondition__Group__3__Impl rule__AndCondition__Group__4 ;
    public final void rule__AndCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1186:1: ( rule__AndCondition__Group__3__Impl rule__AndCondition__Group__4 )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1187:2: rule__AndCondition__Group__3__Impl rule__AndCondition__Group__4
            {
            pushFollow(FOLLOW_rule__AndCondition__Group__3__Impl_in_rule__AndCondition__Group__32357);
            rule__AndCondition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AndCondition__Group__4_in_rule__AndCondition__Group__32360);
            rule__AndCondition__Group__4();

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
    // $ANTLR end "rule__AndCondition__Group__3"


    // $ANTLR start "rule__AndCondition__Group__3__Impl"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1194:1: rule__AndCondition__Group__3__Impl : ( ( rule__AndCondition__RightAssignment_3 ) ) ;
    public final void rule__AndCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1198:1: ( ( ( rule__AndCondition__RightAssignment_3 ) ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1199:1: ( ( rule__AndCondition__RightAssignment_3 ) )
            {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1199:1: ( ( rule__AndCondition__RightAssignment_3 ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1200:1: ( rule__AndCondition__RightAssignment_3 )
            {
             before(grammarAccess.getAndConditionAccess().getRightAssignment_3()); 
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1201:1: ( rule__AndCondition__RightAssignment_3 )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1201:2: rule__AndCondition__RightAssignment_3
            {
            pushFollow(FOLLOW_rule__AndCondition__RightAssignment_3_in_rule__AndCondition__Group__3__Impl2387);
            rule__AndCondition__RightAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAndConditionAccess().getRightAssignment_3()); 

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
    // $ANTLR end "rule__AndCondition__Group__3__Impl"


    // $ANTLR start "rule__AndCondition__Group__4"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1211:1: rule__AndCondition__Group__4 : rule__AndCondition__Group__4__Impl ;
    public final void rule__AndCondition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1215:1: ( rule__AndCondition__Group__4__Impl )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1216:2: rule__AndCondition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__AndCondition__Group__4__Impl_in_rule__AndCondition__Group__42417);
            rule__AndCondition__Group__4__Impl();

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
    // $ANTLR end "rule__AndCondition__Group__4"


    // $ANTLR start "rule__AndCondition__Group__4__Impl"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1222:1: rule__AndCondition__Group__4__Impl : ( ')' ) ;
    public final void rule__AndCondition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1226:1: ( ( ')' ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1227:1: ( ')' )
            {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1227:1: ( ')' )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1228:1: ')'
            {
             before(grammarAccess.getAndConditionAccess().getRightParenthesisKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__AndCondition__Group__4__Impl2445); 
             after(grammarAccess.getAndConditionAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__AndCondition__Group__4__Impl"


    // $ANTLR start "rule__OrCondition__Group__0"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1251:1: rule__OrCondition__Group__0 : rule__OrCondition__Group__0__Impl rule__OrCondition__Group__1 ;
    public final void rule__OrCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1255:1: ( rule__OrCondition__Group__0__Impl rule__OrCondition__Group__1 )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1256:2: rule__OrCondition__Group__0__Impl rule__OrCondition__Group__1
            {
            pushFollow(FOLLOW_rule__OrCondition__Group__0__Impl_in_rule__OrCondition__Group__02486);
            rule__OrCondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OrCondition__Group__1_in_rule__OrCondition__Group__02489);
            rule__OrCondition__Group__1();

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
    // $ANTLR end "rule__OrCondition__Group__0"


    // $ANTLR start "rule__OrCondition__Group__0__Impl"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1263:1: rule__OrCondition__Group__0__Impl : ( ( rule__OrCondition__LeftAssignment_0 ) ) ;
    public final void rule__OrCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1267:1: ( ( ( rule__OrCondition__LeftAssignment_0 ) ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1268:1: ( ( rule__OrCondition__LeftAssignment_0 ) )
            {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1268:1: ( ( rule__OrCondition__LeftAssignment_0 ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1269:1: ( rule__OrCondition__LeftAssignment_0 )
            {
             before(grammarAccess.getOrConditionAccess().getLeftAssignment_0()); 
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1270:1: ( rule__OrCondition__LeftAssignment_0 )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1270:2: rule__OrCondition__LeftAssignment_0
            {
            pushFollow(FOLLOW_rule__OrCondition__LeftAssignment_0_in_rule__OrCondition__Group__0__Impl2516);
            rule__OrCondition__LeftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getOrConditionAccess().getLeftAssignment_0()); 

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
    // $ANTLR end "rule__OrCondition__Group__0__Impl"


    // $ANTLR start "rule__OrCondition__Group__1"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1280:1: rule__OrCondition__Group__1 : rule__OrCondition__Group__1__Impl rule__OrCondition__Group__2 ;
    public final void rule__OrCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1284:1: ( rule__OrCondition__Group__1__Impl rule__OrCondition__Group__2 )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1285:2: rule__OrCondition__Group__1__Impl rule__OrCondition__Group__2
            {
            pushFollow(FOLLOW_rule__OrCondition__Group__1__Impl_in_rule__OrCondition__Group__12546);
            rule__OrCondition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OrCondition__Group__2_in_rule__OrCondition__Group__12549);
            rule__OrCondition__Group__2();

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
    // $ANTLR end "rule__OrCondition__Group__1"


    // $ANTLR start "rule__OrCondition__Group__1__Impl"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1292:1: rule__OrCondition__Group__1__Impl : ( 'or' ) ;
    public final void rule__OrCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1296:1: ( ( 'or' ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1297:1: ( 'or' )
            {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1297:1: ( 'or' )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1298:1: 'or'
            {
             before(grammarAccess.getOrConditionAccess().getOrKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__OrCondition__Group__1__Impl2577); 
             after(grammarAccess.getOrConditionAccess().getOrKeyword_1()); 

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
    // $ANTLR end "rule__OrCondition__Group__1__Impl"


    // $ANTLR start "rule__OrCondition__Group__2"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1311:1: rule__OrCondition__Group__2 : rule__OrCondition__Group__2__Impl rule__OrCondition__Group__3 ;
    public final void rule__OrCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1315:1: ( rule__OrCondition__Group__2__Impl rule__OrCondition__Group__3 )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1316:2: rule__OrCondition__Group__2__Impl rule__OrCondition__Group__3
            {
            pushFollow(FOLLOW_rule__OrCondition__Group__2__Impl_in_rule__OrCondition__Group__22608);
            rule__OrCondition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OrCondition__Group__3_in_rule__OrCondition__Group__22611);
            rule__OrCondition__Group__3();

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
    // $ANTLR end "rule__OrCondition__Group__2"


    // $ANTLR start "rule__OrCondition__Group__2__Impl"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1323:1: rule__OrCondition__Group__2__Impl : ( '(' ) ;
    public final void rule__OrCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1327:1: ( ( '(' ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1328:1: ( '(' )
            {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1328:1: ( '(' )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1329:1: '('
            {
             before(grammarAccess.getOrConditionAccess().getLeftParenthesisKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__OrCondition__Group__2__Impl2639); 
             after(grammarAccess.getOrConditionAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__OrCondition__Group__2__Impl"


    // $ANTLR start "rule__OrCondition__Group__3"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1342:1: rule__OrCondition__Group__3 : rule__OrCondition__Group__3__Impl rule__OrCondition__Group__4 ;
    public final void rule__OrCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1346:1: ( rule__OrCondition__Group__3__Impl rule__OrCondition__Group__4 )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1347:2: rule__OrCondition__Group__3__Impl rule__OrCondition__Group__4
            {
            pushFollow(FOLLOW_rule__OrCondition__Group__3__Impl_in_rule__OrCondition__Group__32670);
            rule__OrCondition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OrCondition__Group__4_in_rule__OrCondition__Group__32673);
            rule__OrCondition__Group__4();

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
    // $ANTLR end "rule__OrCondition__Group__3"


    // $ANTLR start "rule__OrCondition__Group__3__Impl"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1354:1: rule__OrCondition__Group__3__Impl : ( ( rule__OrCondition__RightAssignment_3 ) ) ;
    public final void rule__OrCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1358:1: ( ( ( rule__OrCondition__RightAssignment_3 ) ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1359:1: ( ( rule__OrCondition__RightAssignment_3 ) )
            {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1359:1: ( ( rule__OrCondition__RightAssignment_3 ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1360:1: ( rule__OrCondition__RightAssignment_3 )
            {
             before(grammarAccess.getOrConditionAccess().getRightAssignment_3()); 
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1361:1: ( rule__OrCondition__RightAssignment_3 )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1361:2: rule__OrCondition__RightAssignment_3
            {
            pushFollow(FOLLOW_rule__OrCondition__RightAssignment_3_in_rule__OrCondition__Group__3__Impl2700);
            rule__OrCondition__RightAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOrConditionAccess().getRightAssignment_3()); 

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
    // $ANTLR end "rule__OrCondition__Group__3__Impl"


    // $ANTLR start "rule__OrCondition__Group__4"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1371:1: rule__OrCondition__Group__4 : rule__OrCondition__Group__4__Impl ;
    public final void rule__OrCondition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1375:1: ( rule__OrCondition__Group__4__Impl )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1376:2: rule__OrCondition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__OrCondition__Group__4__Impl_in_rule__OrCondition__Group__42730);
            rule__OrCondition__Group__4__Impl();

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
    // $ANTLR end "rule__OrCondition__Group__4"


    // $ANTLR start "rule__OrCondition__Group__4__Impl"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1382:1: rule__OrCondition__Group__4__Impl : ( ')' ) ;
    public final void rule__OrCondition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1386:1: ( ( ')' ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1387:1: ( ')' )
            {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1387:1: ( ')' )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1388:1: ')'
            {
             before(grammarAccess.getOrConditionAccess().getRightParenthesisKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__OrCondition__Group__4__Impl2758); 
             after(grammarAccess.getOrConditionAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__OrCondition__Group__4__Impl"


    // $ANTLR start "rule__SQL4CSV__ProgramAssignment"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1412:1: rule__SQL4CSV__ProgramAssignment : ( ruleProgram ) ;
    public final void rule__SQL4CSV__ProgramAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1416:1: ( ( ruleProgram ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1417:1: ( ruleProgram )
            {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1417:1: ( ruleProgram )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1418:1: ruleProgram
            {
             before(grammarAccess.getSQL4CSVAccess().getProgramProgramParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleProgram_in_rule__SQL4CSV__ProgramAssignment2804);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getSQL4CSVAccess().getProgramProgramParserRuleCall_0()); 

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
    // $ANTLR end "rule__SQL4CSV__ProgramAssignment"


    // $ANTLR start "rule__Program__QueriesAssignment"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1427:1: rule__Program__QueriesAssignment : ( ruleQuery ) ;
    public final void rule__Program__QueriesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1431:1: ( ( ruleQuery ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1432:1: ( ruleQuery )
            {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1432:1: ( ruleQuery )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1433:1: ruleQuery
            {
             before(grammarAccess.getProgramAccess().getQueriesQueryParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleQuery_in_rule__Program__QueriesAssignment2835);
            ruleQuery();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getQueriesQueryParserRuleCall_0()); 

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
    // $ANTLR end "rule__Program__QueriesAssignment"


    // $ANTLR start "rule__Query__ColumnAssignment_1"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1442:1: rule__Query__ColumnAssignment_1 : ( ruleColumn ) ;
    public final void rule__Query__ColumnAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1446:1: ( ( ruleColumn ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1447:1: ( ruleColumn )
            {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1447:1: ( ruleColumn )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1448:1: ruleColumn
            {
             before(grammarAccess.getQueryAccess().getColumnColumnParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleColumn_in_rule__Query__ColumnAssignment_12866);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getQueryAccess().getColumnColumnParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Query__ColumnAssignment_1"


    // $ANTLR start "rule__Query__ColumnsAssignment_2_1"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1457:1: rule__Query__ColumnsAssignment_2_1 : ( ruleColumn ) ;
    public final void rule__Query__ColumnsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1461:1: ( ( ruleColumn ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1462:1: ( ruleColumn )
            {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1462:1: ( ruleColumn )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1463:1: ruleColumn
            {
             before(grammarAccess.getQueryAccess().getColumnsColumnParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleColumn_in_rule__Query__ColumnsAssignment_2_12897);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getQueryAccess().getColumnsColumnParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Query__ColumnsAssignment_2_1"


    // $ANTLR start "rule__Query__TableAssignment_4"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1472:1: rule__Query__TableAssignment_4 : ( ruleTable ) ;
    public final void rule__Query__TableAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1476:1: ( ( ruleTable ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1477:1: ( ruleTable )
            {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1477:1: ( ruleTable )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1478:1: ruleTable
            {
             before(grammarAccess.getQueryAccess().getTableTableParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleTable_in_rule__Query__TableAssignment_42928);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getQueryAccess().getTableTableParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Query__TableAssignment_4"


    // $ANTLR start "rule__Query__TablesAssignment_5_1"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1487:1: rule__Query__TablesAssignment_5_1 : ( ruleTable ) ;
    public final void rule__Query__TablesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1491:1: ( ( ruleTable ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1492:1: ( ruleTable )
            {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1492:1: ( ruleTable )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1493:1: ruleTable
            {
             before(grammarAccess.getQueryAccess().getTablesTableParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleTable_in_rule__Query__TablesAssignment_5_12959);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getQueryAccess().getTablesTableParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Query__TablesAssignment_5_1"


    // $ANTLR start "rule__Query__ConditionsAssignment_6_1"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1502:1: rule__Query__ConditionsAssignment_6_1 : ( ruleCondition ) ;
    public final void rule__Query__ConditionsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1506:1: ( ( ruleCondition ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1507:1: ( ruleCondition )
            {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1507:1: ( ruleCondition )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1508:1: ruleCondition
            {
             before(grammarAccess.getQueryAccess().getConditionsConditionParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_ruleCondition_in_rule__Query__ConditionsAssignment_6_12990);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getQueryAccess().getConditionsConditionParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__Query__ConditionsAssignment_6_1"


    // $ANTLR start "rule__Column__TableAssignment_0_0"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1517:1: rule__Column__TableAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__Column__TableAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1521:1: ( ( ( RULE_ID ) ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1522:1: ( ( RULE_ID ) )
            {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1522:1: ( ( RULE_ID ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1523:1: ( RULE_ID )
            {
             before(grammarAccess.getColumnAccess().getTableTableCrossReference_0_0_0()); 
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1524:1: ( RULE_ID )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1525:1: RULE_ID
            {
             before(grammarAccess.getColumnAccess().getTableTableIDTerminalRuleCall_0_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Column__TableAssignment_0_03025); 
             after(grammarAccess.getColumnAccess().getTableTableIDTerminalRuleCall_0_0_0_1()); 

            }

             after(grammarAccess.getColumnAccess().getTableTableCrossReference_0_0_0()); 

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
    // $ANTLR end "rule__Column__TableAssignment_0_0"


    // $ANTLR start "rule__Column__NameAssignment_1"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1536:1: rule__Column__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Column__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1540:1: ( ( RULE_ID ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1541:1: ( RULE_ID )
            {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1541:1: ( RULE_ID )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1542:1: RULE_ID
            {
             before(grammarAccess.getColumnAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Column__NameAssignment_13060); 
             after(grammarAccess.getColumnAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Column__NameAssignment_1"


    // $ANTLR start "rule__Table__NameAssignment"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1551:1: rule__Table__NameAssignment : ( RULE_ID ) ;
    public final void rule__Table__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1555:1: ( ( RULE_ID ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1556:1: ( RULE_ID )
            {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1556:1: ( RULE_ID )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1557:1: RULE_ID
            {
             before(grammarAccess.getTableAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Table__NameAssignment3091); 
             after(grammarAccess.getTableAccess().getNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Table__NameAssignment"


    // $ANTLR start "rule__Equality__LeftAssignment_0"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1566:1: rule__Equality__LeftAssignment_0 : ( ruleColumn ) ;
    public final void rule__Equality__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1570:1: ( ( ruleColumn ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1571:1: ( ruleColumn )
            {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1571:1: ( ruleColumn )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1572:1: ruleColumn
            {
             before(grammarAccess.getEqualityAccess().getLeftColumnParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleColumn_in_rule__Equality__LeftAssignment_03122);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getEqualityAccess().getLeftColumnParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Equality__LeftAssignment_0"


    // $ANTLR start "rule__Equality__RightAssignment_2"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1581:1: rule__Equality__RightAssignment_2 : ( ( rule__Equality__RightAlternatives_2_0 ) ) ;
    public final void rule__Equality__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1585:1: ( ( ( rule__Equality__RightAlternatives_2_0 ) ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1586:1: ( ( rule__Equality__RightAlternatives_2_0 ) )
            {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1586:1: ( ( rule__Equality__RightAlternatives_2_0 ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1587:1: ( rule__Equality__RightAlternatives_2_0 )
            {
             before(grammarAccess.getEqualityAccess().getRightAlternatives_2_0()); 
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1588:1: ( rule__Equality__RightAlternatives_2_0 )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1588:2: rule__Equality__RightAlternatives_2_0
            {
            pushFollow(FOLLOW_rule__Equality__RightAlternatives_2_0_in_rule__Equality__RightAssignment_23153);
            rule__Equality__RightAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getEqualityAccess().getRightAlternatives_2_0()); 

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
    // $ANTLR end "rule__Equality__RightAssignment_2"


    // $ANTLR start "rule__ColumnEquality__RightAssignment"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1597:1: rule__ColumnEquality__RightAssignment : ( ruleColumn ) ;
    public final void rule__ColumnEquality__RightAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1601:1: ( ( ruleColumn ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1602:1: ( ruleColumn )
            {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1602:1: ( ruleColumn )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1603:1: ruleColumn
            {
             before(grammarAccess.getColumnEqualityAccess().getRightColumnParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleColumn_in_rule__ColumnEquality__RightAssignment3186);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getColumnEqualityAccess().getRightColumnParserRuleCall_0()); 

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
    // $ANTLR end "rule__ColumnEquality__RightAssignment"


    // $ANTLR start "rule__ValueEquality__RightAssignment"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1612:1: rule__ValueEquality__RightAssignment : ( RULE_STRING ) ;
    public final void rule__ValueEquality__RightAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1616:1: ( ( RULE_STRING ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1617:1: ( RULE_STRING )
            {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1617:1: ( RULE_STRING )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1618:1: RULE_STRING
            {
             before(grammarAccess.getValueEqualityAccess().getRightSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ValueEquality__RightAssignment3217); 
             after(grammarAccess.getValueEqualityAccess().getRightSTRINGTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__ValueEquality__RightAssignment"


    // $ANTLR start "rule__AndCondition__LeftAssignment_0"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1627:1: rule__AndCondition__LeftAssignment_0 : ( ruleEquality ) ;
    public final void rule__AndCondition__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1631:1: ( ( ruleEquality ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1632:1: ( ruleEquality )
            {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1632:1: ( ruleEquality )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1633:1: ruleEquality
            {
             before(grammarAccess.getAndConditionAccess().getLeftEqualityParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleEquality_in_rule__AndCondition__LeftAssignment_03248);
            ruleEquality();

            state._fsp--;

             after(grammarAccess.getAndConditionAccess().getLeftEqualityParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__AndCondition__LeftAssignment_0"


    // $ANTLR start "rule__AndCondition__RightAssignment_3"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1642:1: rule__AndCondition__RightAssignment_3 : ( ruleCondition ) ;
    public final void rule__AndCondition__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1646:1: ( ( ruleCondition ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1647:1: ( ruleCondition )
            {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1647:1: ( ruleCondition )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1648:1: ruleCondition
            {
             before(grammarAccess.getAndConditionAccess().getRightConditionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleCondition_in_rule__AndCondition__RightAssignment_33279);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getAndConditionAccess().getRightConditionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__AndCondition__RightAssignment_3"


    // $ANTLR start "rule__OrCondition__LeftAssignment_0"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1657:1: rule__OrCondition__LeftAssignment_0 : ( ruleEquality ) ;
    public final void rule__OrCondition__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1661:1: ( ( ruleEquality ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1662:1: ( ruleEquality )
            {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1662:1: ( ruleEquality )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1663:1: ruleEquality
            {
             before(grammarAccess.getOrConditionAccess().getLeftEqualityParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleEquality_in_rule__OrCondition__LeftAssignment_03310);
            ruleEquality();

            state._fsp--;

             after(grammarAccess.getOrConditionAccess().getLeftEqualityParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__OrCondition__LeftAssignment_0"


    // $ANTLR start "rule__OrCondition__RightAssignment_3"
    // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1672:1: rule__OrCondition__RightAssignment_3 : ( ruleCondition ) ;
    public final void rule__OrCondition__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1676:1: ( ( ruleCondition ) )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1677:1: ( ruleCondition )
            {
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1677:1: ( ruleCondition )
            // ../fr.imta.tp.sql4csv.ui/src-gen/fr/imta/tp/ui/contentassist/antlr/internal/InternalSql4csv.g:1678:1: ruleCondition
            {
             before(grammarAccess.getOrConditionAccess().getRightConditionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleCondition_in_rule__OrCondition__RightAssignment_33341);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getOrConditionAccess().getRightConditionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__OrCondition__RightAssignment_3"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA2_eotS =
        "\13\uffff";
    static final String DFA2_eofS =
        "\4\uffff\2\7\4\uffff\1\7";
    static final String DFA2_minS =
        "\1\4\1\17\2\4\2\13\1\20\1\uffff\1\4\1\uffff\1\13";
    static final String DFA2_maxS =
        "\1\4\1\20\1\5\1\4\2\24\1\20\1\uffff\1\4\1\uffff\1\24";
    static final String DFA2_acceptS =
        "\7\uffff\1\2\1\uffff\1\1\1\uffff";
    static final String DFA2_specialS =
        "\13\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1",
            "\1\3\1\2",
            "\1\4\1\5",
            "\1\6",
            "\1\7\3\uffff\1\10\1\uffff\1\11\1\uffff\1\7\1\11",
            "\1\7\5\uffff\1\11\1\uffff\1\7\1\11",
            "\1\2",
            "",
            "\1\12",
            "",
            "\1\7\5\uffff\1\11\1\uffff\1\7\1\11"
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "396:1: rule__Condition__Alternatives : ( ( ruleBinaryCondition ) | ( ruleEquality ) );";
        }
    }
    static final String DFA4_eotS =
        "\13\uffff";
    static final String DFA4_eofS =
        "\13\uffff";
    static final String DFA4_minS =
        "\1\4\1\17\2\4\1\17\1\21\1\20\1\4\2\uffff\1\21";
    static final String DFA4_maxS =
        "\1\4\1\20\1\5\1\4\2\24\1\20\1\4\2\uffff\1\24";
    static final String DFA4_acceptS =
        "\10\uffff\1\1\1\2\1\uffff";
    static final String DFA4_specialS =
        "\13\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1",
            "\1\3\1\2",
            "\1\4\1\5",
            "\1\6",
            "\1\7\1\uffff\1\10\2\uffff\1\11",
            "\1\10\2\uffff\1\11",
            "\1\2",
            "\1\12",
            "",
            "",
            "\1\10\2\uffff\1\11"
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "440:1: rule__BinaryCondition__Alternatives : ( ( ruleAndCondition ) | ( ruleOrCondition ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleSQL4CSV_in_entryRuleSQL4CSV61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSQL4CSV68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SQL4CSV__ProgramAssignment_in_ruleSQL4CSV94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__QueriesAssignment_in_ruleProgram154 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleQuery_in_entryRuleQuery182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuery189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group__0_in_ruleQuery215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumn_in_entryRuleColumn242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColumn249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Column__Group__0_in_ruleColumn275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTable_in_entryRuleTable302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTable309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Table__NameAssignment_in_ruleTable335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondition369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Alternatives_in_ruleCondition395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquality_in_entryRuleEquality422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEquality429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group__0_in_ruleEquality455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryCondition_in_entryRuleBinaryCondition482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinaryCondition489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryCondition__Alternatives_in_ruleBinaryCondition515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumnEquality_in_entryRuleColumnEquality542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColumnEquality549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColumnEquality__RightAssignment_in_ruleColumnEquality575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueEquality_in_entryRuleValueEquality602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueEquality609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueEquality__RightAssignment_in_ruleValueEquality635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndCondition_in_entryRuleAndCondition662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndCondition669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndCondition__Group__0_in_ruleAndCondition695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrCondition_in_entryRuleOrCondition722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrCondition729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrCondition__Group__0_in_ruleOrCondition755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryCondition_in_rule__Condition__Alternatives791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquality_in_rule__Condition__Alternatives808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumnEquality_in_rule__Equality__RightAlternatives_2_0840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueEquality_in_rule__Equality__RightAlternatives_2_0857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndCondition_in_rule__BinaryCondition__Alternatives889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrCondition_in_rule__BinaryCondition__Alternatives906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group__0__Impl_in_rule__Query__Group__0936 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Query__Group__1_in_rule__Query__Group__0939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Query__Group__0__Impl967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group__1__Impl_in_rule__Query__Group__1998 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__Query__Group__2_in_rule__Query__Group__11001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__ColumnAssignment_1_in_rule__Query__Group__1__Impl1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group__2__Impl_in_rule__Query__Group__21058 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__Query__Group__3_in_rule__Query__Group__21061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group_2__0_in_rule__Query__Group__2__Impl1088 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Query__Group__3__Impl_in_rule__Query__Group__31119 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Query__Group__4_in_rule__Query__Group__31122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Query__Group__3__Impl1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group__4__Impl_in_rule__Query__Group__41181 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__Query__Group__5_in_rule__Query__Group__41184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__TableAssignment_4_in_rule__Query__Group__4__Impl1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group__5__Impl_in_rule__Query__Group__51241 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__Query__Group__6_in_rule__Query__Group__51244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group_5__0_in_rule__Query__Group__5__Impl1271 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Query__Group__6__Impl_in_rule__Query__Group__61302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group_6__0_in_rule__Query__Group__6__Impl1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group_2__0__Impl_in_rule__Query__Group_2__01374 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Query__Group_2__1_in_rule__Query__Group_2__01377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Query__Group_2__0__Impl1405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group_2__1__Impl_in_rule__Query__Group_2__11436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__ColumnsAssignment_2_1_in_rule__Query__Group_2__1__Impl1463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group_5__0__Impl_in_rule__Query__Group_5__01497 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Query__Group_5__1_in_rule__Query__Group_5__01500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Query__Group_5__0__Impl1528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group_5__1__Impl_in_rule__Query__Group_5__11559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__TablesAssignment_5_1_in_rule__Query__Group_5__1__Impl1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group_6__0__Impl_in_rule__Query__Group_6__01620 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Query__Group_6__1_in_rule__Query__Group_6__01623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Query__Group_6__0__Impl1651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group_6__1__Impl_in_rule__Query__Group_6__11682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__ConditionsAssignment_6_1_in_rule__Query__Group_6__1__Impl1709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Column__Group__0__Impl_in_rule__Column__Group__01743 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Column__Group__1_in_rule__Column__Group__01746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Column__Group_0__0_in_rule__Column__Group__0__Impl1773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Column__Group__1__Impl_in_rule__Column__Group__11804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Column__NameAssignment_1_in_rule__Column__Group__1__Impl1831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Column__Group_0__0__Impl_in_rule__Column__Group_0__01865 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Column__Group_0__1_in_rule__Column__Group_0__01868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Column__TableAssignment_0_0_in_rule__Column__Group_0__0__Impl1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Column__Group_0__1__Impl_in_rule__Column__Group_0__11925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Column__Group_0__1__Impl1953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group__0__Impl_in_rule__Equality__Group__01988 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Equality__Group__1_in_rule__Equality__Group__01991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__LeftAssignment_0_in_rule__Equality__Group__0__Impl2018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group__1__Impl_in_rule__Equality__Group__12048 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Equality__Group__2_in_rule__Equality__Group__12051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Equality__Group__1__Impl2079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group__2__Impl_in_rule__Equality__Group__22110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__RightAssignment_2_in_rule__Equality__Group__2__Impl2137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndCondition__Group__0__Impl_in_rule__AndCondition__Group__02173 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__AndCondition__Group__1_in_rule__AndCondition__Group__02176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndCondition__LeftAssignment_0_in_rule__AndCondition__Group__0__Impl2203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndCondition__Group__1__Impl_in_rule__AndCondition__Group__12233 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__AndCondition__Group__2_in_rule__AndCondition__Group__12236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__AndCondition__Group__1__Impl2264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndCondition__Group__2__Impl_in_rule__AndCondition__Group__22295 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AndCondition__Group__3_in_rule__AndCondition__Group__22298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__AndCondition__Group__2__Impl2326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndCondition__Group__3__Impl_in_rule__AndCondition__Group__32357 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__AndCondition__Group__4_in_rule__AndCondition__Group__32360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndCondition__RightAssignment_3_in_rule__AndCondition__Group__3__Impl2387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndCondition__Group__4__Impl_in_rule__AndCondition__Group__42417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__AndCondition__Group__4__Impl2445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrCondition__Group__0__Impl_in_rule__OrCondition__Group__02486 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__OrCondition__Group__1_in_rule__OrCondition__Group__02489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrCondition__LeftAssignment_0_in_rule__OrCondition__Group__0__Impl2516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrCondition__Group__1__Impl_in_rule__OrCondition__Group__12546 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__OrCondition__Group__2_in_rule__OrCondition__Group__12549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__OrCondition__Group__1__Impl2577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrCondition__Group__2__Impl_in_rule__OrCondition__Group__22608 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__OrCondition__Group__3_in_rule__OrCondition__Group__22611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__OrCondition__Group__2__Impl2639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrCondition__Group__3__Impl_in_rule__OrCondition__Group__32670 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__OrCondition__Group__4_in_rule__OrCondition__Group__32673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrCondition__RightAssignment_3_in_rule__OrCondition__Group__3__Impl2700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrCondition__Group__4__Impl_in_rule__OrCondition__Group__42730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__OrCondition__Group__4__Impl2758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProgram_in_rule__SQL4CSV__ProgramAssignment2804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuery_in_rule__Program__QueriesAssignment2835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumn_in_rule__Query__ColumnAssignment_12866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumn_in_rule__Query__ColumnsAssignment_2_12897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTable_in_rule__Query__TableAssignment_42928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTable_in_rule__Query__TablesAssignment_5_12959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_rule__Query__ConditionsAssignment_6_12990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Column__TableAssignment_0_03025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Column__NameAssignment_13060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Table__NameAssignment3091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumn_in_rule__Equality__LeftAssignment_03122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__RightAlternatives_2_0_in_rule__Equality__RightAssignment_23153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumn_in_rule__ColumnEquality__RightAssignment3186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ValueEquality__RightAssignment3217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquality_in_rule__AndCondition__LeftAssignment_03248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_rule__AndCondition__RightAssignment_33279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquality_in_rule__OrCondition__LeftAssignment_03310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_rule__OrCondition__RightAssignment_33341 = new BitSet(new long[]{0x0000000000000002L});

}