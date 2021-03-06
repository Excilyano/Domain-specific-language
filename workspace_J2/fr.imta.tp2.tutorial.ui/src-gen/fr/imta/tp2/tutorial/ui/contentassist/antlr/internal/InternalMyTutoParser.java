package fr.imta.tp2.tutorial.ui.contentassist.antlr.internal; 

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
import fr.imta.tp2.tutorial.services.MyTutoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyTutoParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'{'", "'}'", "'.'", "'import'", "'.*'", "'datatype'", "'entity'", "'extends'", "':'", "'many'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=8;
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


        public InternalMyTutoParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyTutoParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyTutoParser.tokenNames; }
    public String getGrammarFileName() { return "../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g"; }


     
     	private MyTutoGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MyTutoGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleMyTuto"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:60:1: entryRuleMyTuto : ruleMyTuto EOF ;
    public final void entryRuleMyTuto() throws RecognitionException {
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:61:1: ( ruleMyTuto EOF )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:62:1: ruleMyTuto EOF
            {
             before(grammarAccess.getMyTutoRule()); 
            pushFollow(FOLLOW_ruleMyTuto_in_entryRuleMyTuto61);
            ruleMyTuto();

            state._fsp--;

             after(grammarAccess.getMyTutoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMyTuto68); 

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
    // $ANTLR end "entryRuleMyTuto"


    // $ANTLR start "ruleMyTuto"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:69:1: ruleMyTuto : ( ( rule__MyTuto__ElementsAssignment )* ) ;
    public final void ruleMyTuto() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:73:2: ( ( ( rule__MyTuto__ElementsAssignment )* ) )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:74:1: ( ( rule__MyTuto__ElementsAssignment )* )
            {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:74:1: ( ( rule__MyTuto__ElementsAssignment )* )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:75:1: ( rule__MyTuto__ElementsAssignment )*
            {
             before(grammarAccess.getMyTutoAccess().getElementsAssignment()); 
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:76:1: ( rule__MyTuto__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==15||(LA1_0>=17 && LA1_0<=18)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:76:2: rule__MyTuto__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__MyTuto__ElementsAssignment_in_ruleMyTuto94);
            	    rule__MyTuto__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getMyTutoAccess().getElementsAssignment()); 

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
    // $ANTLR end "ruleMyTuto"


    // $ANTLR start "entryRuleAbstractElement"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:88:1: entryRuleAbstractElement : ruleAbstractElement EOF ;
    public final void entryRuleAbstractElement() throws RecognitionException {
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:89:1: ( ruleAbstractElement EOF )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:90:1: ruleAbstractElement EOF
            {
             before(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement122);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getAbstractElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractElement129); 

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
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:97:1: ruleAbstractElement : ( ( rule__AbstractElement__Alternatives ) ) ;
    public final void ruleAbstractElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:101:2: ( ( ( rule__AbstractElement__Alternatives ) ) )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:102:1: ( ( rule__AbstractElement__Alternatives ) )
            {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:102:1: ( ( rule__AbstractElement__Alternatives ) )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:103:1: ( rule__AbstractElement__Alternatives )
            {
             before(grammarAccess.getAbstractElementAccess().getAlternatives()); 
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:104:1: ( rule__AbstractElement__Alternatives )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:104:2: rule__AbstractElement__Alternatives
            {
            pushFollow(FOLLOW_rule__AbstractElement__Alternatives_in_ruleAbstractElement155);
            rule__AbstractElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRulePackageDeclaration"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:116:1: entryRulePackageDeclaration : rulePackageDeclaration EOF ;
    public final void entryRulePackageDeclaration() throws RecognitionException {
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:117:1: ( rulePackageDeclaration EOF )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:118:1: rulePackageDeclaration EOF
            {
             before(grammarAccess.getPackageDeclarationRule()); 
            pushFollow(FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration182);
            rulePackageDeclaration();

            state._fsp--;

             after(grammarAccess.getPackageDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageDeclaration189); 

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
    // $ANTLR end "entryRulePackageDeclaration"


    // $ANTLR start "rulePackageDeclaration"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:125:1: rulePackageDeclaration : ( ( rule__PackageDeclaration__Group__0 ) ) ;
    public final void rulePackageDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:129:2: ( ( ( rule__PackageDeclaration__Group__0 ) ) )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:130:1: ( ( rule__PackageDeclaration__Group__0 ) )
            {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:130:1: ( ( rule__PackageDeclaration__Group__0 ) )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:131:1: ( rule__PackageDeclaration__Group__0 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getGroup()); 
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:132:1: ( rule__PackageDeclaration__Group__0 )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:132:2: rule__PackageDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__0_in_rulePackageDeclaration215);
            rule__PackageDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackageDeclarationAccess().getGroup()); 

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
    // $ANTLR end "rulePackageDeclaration"


    // $ANTLR start "entryRuleQualifiedName"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:144:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:145:1: ( ruleQualifiedName EOF )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:146:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName242);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName249); 

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:153:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:157:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:158:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:158:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:159:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:160:1: ( rule__QualifiedName__Group__0 )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:160:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName275);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleImport"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:172:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:173:1: ( ruleImport EOF )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:174:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport302);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport309); 

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:181:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:185:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:186:1: ( ( rule__Import__Group__0 ) )
            {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:186:1: ( ( rule__Import__Group__0 ) )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:187:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:188:1: ( rule__Import__Group__0 )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:188:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport335);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedNameSpaceWithWildCard"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:200:1: entryRuleQualifiedNameSpaceWithWildCard : ruleQualifiedNameSpaceWithWildCard EOF ;
    public final void entryRuleQualifiedNameSpaceWithWildCard() throws RecognitionException {
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:201:1: ( ruleQualifiedNameSpaceWithWildCard EOF )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:202:1: ruleQualifiedNameSpaceWithWildCard EOF
            {
             before(grammarAccess.getQualifiedNameSpaceWithWildCardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameSpaceWithWildCard_in_entryRuleQualifiedNameSpaceWithWildCard362);
            ruleQualifiedNameSpaceWithWildCard();

            state._fsp--;

             after(grammarAccess.getQualifiedNameSpaceWithWildCardRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameSpaceWithWildCard369); 

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
    // $ANTLR end "entryRuleQualifiedNameSpaceWithWildCard"


    // $ANTLR start "ruleQualifiedNameSpaceWithWildCard"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:209:1: ruleQualifiedNameSpaceWithWildCard : ( ( rule__QualifiedNameSpaceWithWildCard__Group__0 ) ) ;
    public final void ruleQualifiedNameSpaceWithWildCard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:213:2: ( ( ( rule__QualifiedNameSpaceWithWildCard__Group__0 ) ) )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:214:1: ( ( rule__QualifiedNameSpaceWithWildCard__Group__0 ) )
            {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:214:1: ( ( rule__QualifiedNameSpaceWithWildCard__Group__0 ) )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:215:1: ( rule__QualifiedNameSpaceWithWildCard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameSpaceWithWildCardAccess().getGroup()); 
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:216:1: ( rule__QualifiedNameSpaceWithWildCard__Group__0 )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:216:2: rule__QualifiedNameSpaceWithWildCard__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedNameSpaceWithWildCard__Group__0_in_ruleQualifiedNameSpaceWithWildCard395);
            rule__QualifiedNameSpaceWithWildCard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameSpaceWithWildCardAccess().getGroup()); 

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
    // $ANTLR end "ruleQualifiedNameSpaceWithWildCard"


    // $ANTLR start "entryRuleType"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:228:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:229:1: ( ruleType EOF )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:230:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType422);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType429); 

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
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:237:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:241:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:242:1: ( ( rule__Type__Alternatives ) )
            {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:242:1: ( ( rule__Type__Alternatives ) )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:243:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:244:1: ( rule__Type__Alternatives )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:244:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType455);
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


    // $ANTLR start "entryRuleDataType"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:256:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:257:1: ( ruleDataType EOF )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:258:1: ruleDataType EOF
            {
             before(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType482);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDataTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataType489); 

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
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:265:1: ruleDataType : ( ( rule__DataType__Group__0 ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:269:2: ( ( ( rule__DataType__Group__0 ) ) )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:270:1: ( ( rule__DataType__Group__0 ) )
            {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:270:1: ( ( rule__DataType__Group__0 ) )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:271:1: ( rule__DataType__Group__0 )
            {
             before(grammarAccess.getDataTypeAccess().getGroup()); 
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:272:1: ( rule__DataType__Group__0 )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:272:2: rule__DataType__Group__0
            {
            pushFollow(FOLLOW_rule__DataType__Group__0_in_ruleDataType515);
            rule__DataType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleEntity"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:284:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:285:1: ( ruleEntity EOF )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:286:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity542);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity549); 

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:293:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:297:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:298:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:298:1: ( ( rule__Entity__Group__0 ) )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:299:1: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:300:1: ( rule__Entity__Group__0 )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:300:2: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_rule__Entity__Group__0_in_ruleEntity575);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleFeature"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:312:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:313:1: ( ruleFeature EOF )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:314:1: ruleFeature EOF
            {
             before(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature602);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getFeatureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature609); 

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
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:321:1: ruleFeature : ( ( rule__Feature__Group__0 ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:325:2: ( ( ( rule__Feature__Group__0 ) ) )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:326:1: ( ( rule__Feature__Group__0 ) )
            {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:326:1: ( ( rule__Feature__Group__0 ) )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:327:1: ( rule__Feature__Group__0 )
            {
             before(grammarAccess.getFeatureAccess().getGroup()); 
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:328:1: ( rule__Feature__Group__0 )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:328:2: rule__Feature__Group__0
            {
            pushFollow(FOLLOW_rule__Feature__Group__0_in_ruleFeature635);
            rule__Feature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getGroup()); 

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
    // $ANTLR end "ruleFeature"


    // $ANTLR start "rule__AbstractElement__Alternatives"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:340:1: rule__AbstractElement__Alternatives : ( ( rulePackageDeclaration ) | ( ruleType ) | ( ruleImport ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:344:1: ( ( rulePackageDeclaration ) | ( ruleType ) | ( ruleImport ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 17:
            case 18:
                {
                alt2=2;
                }
                break;
            case 15:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:345:1: ( rulePackageDeclaration )
                    {
                    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:345:1: ( rulePackageDeclaration )
                    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:346:1: rulePackageDeclaration
                    {
                     before(grammarAccess.getAbstractElementAccess().getPackageDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulePackageDeclaration_in_rule__AbstractElement__Alternatives671);
                    rulePackageDeclaration();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getPackageDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:351:6: ( ruleType )
                    {
                    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:351:6: ( ruleType )
                    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:352:1: ruleType
                    {
                     before(grammarAccess.getAbstractElementAccess().getTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleType_in_rule__AbstractElement__Alternatives688);
                    ruleType();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:357:6: ( ruleImport )
                    {
                    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:357:6: ( ruleImport )
                    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:358:1: ruleImport
                    {
                     before(grammarAccess.getAbstractElementAccess().getImportParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleImport_in_rule__AbstractElement__Alternatives705);
                    ruleImport();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getImportParserRuleCall_2()); 

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
    // $ANTLR end "rule__AbstractElement__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:368:1: rule__Type__Alternatives : ( ( ruleDataType ) | ( ruleEntity ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:372:1: ( ( ruleDataType ) | ( ruleEntity ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            else if ( (LA3_0==18) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:373:1: ( ruleDataType )
                    {
                    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:373:1: ( ruleDataType )
                    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:374:1: ruleDataType
                    {
                     before(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDataType_in_rule__Type__Alternatives737);
                    ruleDataType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:379:6: ( ruleEntity )
                    {
                    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:379:6: ( ruleEntity )
                    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:380:1: ruleEntity
                    {
                     before(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEntity_in_rule__Type__Alternatives754);
                    ruleEntity();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); 

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


    // $ANTLR start "rule__PackageDeclaration__Group__0"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:392:1: rule__PackageDeclaration__Group__0 : rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 ;
    public final void rule__PackageDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:396:1: ( rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:397:2: rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__0__Impl_in_rule__PackageDeclaration__Group__0784);
            rule__PackageDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__1_in_rule__PackageDeclaration__Group__0787);
            rule__PackageDeclaration__Group__1();

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
    // $ANTLR end "rule__PackageDeclaration__Group__0"


    // $ANTLR start "rule__PackageDeclaration__Group__0__Impl"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:404:1: rule__PackageDeclaration__Group__0__Impl : ( 'package' ) ;
    public final void rule__PackageDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:408:1: ( ( 'package' ) )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:409:1: ( 'package' )
            {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:409:1: ( 'package' )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:410:1: 'package'
            {
             before(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__PackageDeclaration__Group__0__Impl815); 
             after(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0()); 

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
    // $ANTLR end "rule__PackageDeclaration__Group__0__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__1"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:423:1: rule__PackageDeclaration__Group__1 : rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 ;
    public final void rule__PackageDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:427:1: ( rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:428:2: rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__1__Impl_in_rule__PackageDeclaration__Group__1846);
            rule__PackageDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__2_in_rule__PackageDeclaration__Group__1849);
            rule__PackageDeclaration__Group__2();

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
    // $ANTLR end "rule__PackageDeclaration__Group__1"


    // $ANTLR start "rule__PackageDeclaration__Group__1__Impl"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:435:1: rule__PackageDeclaration__Group__1__Impl : ( ( rule__PackageDeclaration__NameAssignment_1 ) ) ;
    public final void rule__PackageDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:439:1: ( ( ( rule__PackageDeclaration__NameAssignment_1 ) ) )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:440:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:440:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:441:1: ( rule__PackageDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:442:1: ( rule__PackageDeclaration__NameAssignment_1 )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:442:2: rule__PackageDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__NameAssignment_1_in_rule__PackageDeclaration__Group__1__Impl876);
            rule__PackageDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__PackageDeclaration__Group__1__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__2"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:452:1: rule__PackageDeclaration__Group__2 : rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3 ;
    public final void rule__PackageDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:456:1: ( rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3 )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:457:2: rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__2__Impl_in_rule__PackageDeclaration__Group__2906);
            rule__PackageDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__3_in_rule__PackageDeclaration__Group__2909);
            rule__PackageDeclaration__Group__3();

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
    // $ANTLR end "rule__PackageDeclaration__Group__2"


    // $ANTLR start "rule__PackageDeclaration__Group__2__Impl"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:464:1: rule__PackageDeclaration__Group__2__Impl : ( '{' ) ;
    public final void rule__PackageDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:468:1: ( ( '{' ) )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:469:1: ( '{' )
            {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:469:1: ( '{' )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:470:1: '{'
            {
             before(grammarAccess.getPackageDeclarationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__PackageDeclaration__Group__2__Impl937); 
             after(grammarAccess.getPackageDeclarationAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__PackageDeclaration__Group__2__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__3"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:483:1: rule__PackageDeclaration__Group__3 : rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4 ;
    public final void rule__PackageDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:487:1: ( rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4 )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:488:2: rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__3__Impl_in_rule__PackageDeclaration__Group__3968);
            rule__PackageDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__4_in_rule__PackageDeclaration__Group__3971);
            rule__PackageDeclaration__Group__4();

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
    // $ANTLR end "rule__PackageDeclaration__Group__3"


    // $ANTLR start "rule__PackageDeclaration__Group__3__Impl"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:495:1: rule__PackageDeclaration__Group__3__Impl : ( ( rule__PackageDeclaration__ElementsAssignment_3 )* ) ;
    public final void rule__PackageDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:499:1: ( ( ( rule__PackageDeclaration__ElementsAssignment_3 )* ) )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:500:1: ( ( rule__PackageDeclaration__ElementsAssignment_3 )* )
            {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:500:1: ( ( rule__PackageDeclaration__ElementsAssignment_3 )* )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:501:1: ( rule__PackageDeclaration__ElementsAssignment_3 )*
            {
             before(grammarAccess.getPackageDeclarationAccess().getElementsAssignment_3()); 
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:502:1: ( rule__PackageDeclaration__ElementsAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==11||LA4_0==15||(LA4_0>=17 && LA4_0<=18)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:502:2: rule__PackageDeclaration__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__PackageDeclaration__ElementsAssignment_3_in_rule__PackageDeclaration__Group__3__Impl998);
            	    rule__PackageDeclaration__ElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getPackageDeclarationAccess().getElementsAssignment_3()); 

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
    // $ANTLR end "rule__PackageDeclaration__Group__3__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__4"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:512:1: rule__PackageDeclaration__Group__4 : rule__PackageDeclaration__Group__4__Impl ;
    public final void rule__PackageDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:516:1: ( rule__PackageDeclaration__Group__4__Impl )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:517:2: rule__PackageDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__4__Impl_in_rule__PackageDeclaration__Group__41029);
            rule__PackageDeclaration__Group__4__Impl();

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
    // $ANTLR end "rule__PackageDeclaration__Group__4"


    // $ANTLR start "rule__PackageDeclaration__Group__4__Impl"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:523:1: rule__PackageDeclaration__Group__4__Impl : ( '}' ) ;
    public final void rule__PackageDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:527:1: ( ( '}' ) )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:528:1: ( '}' )
            {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:528:1: ( '}' )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:529:1: '}'
            {
             before(grammarAccess.getPackageDeclarationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__PackageDeclaration__Group__4__Impl1057); 
             after(grammarAccess.getPackageDeclarationAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__PackageDeclaration__Group__4__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:552:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:556:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:557:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__01098);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__01101);
            rule__QualifiedName__Group__1();

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
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:564:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:568:1: ( ( RULE_ID ) )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:569:1: ( RULE_ID )
            {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:569:1: ( RULE_ID )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:570:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl1128); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:581:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:585:1: ( rule__QualifiedName__Group__1__Impl )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:586:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__11157);
            rule__QualifiedName__Group__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:592:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:596:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:597:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:597:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:598:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:599:1: ( rule__QualifiedName__Group_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:599:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1184);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

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
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:613:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:617:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:618:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01219);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01222);
            rule__QualifiedName__Group_1__1();

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
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:625:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:629:1: ( ( '.' ) )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:630:1: ( '.' )
            {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:630:1: ( '.' )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:631:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,14,FOLLOW_14_in_rule__QualifiedName__Group_1__0__Impl1250); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:644:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:648:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:649:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11281);
            rule__QualifiedName__Group_1__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:655:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:659:1: ( ( RULE_ID ) )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:660:1: ( RULE_ID )
            {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:660:1: ( RULE_ID )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:661:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl1308); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:676:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:680:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:681:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01341);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01344);
            rule__Import__Group__1();

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
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:688:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:692:1: ( ( 'import' ) )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:693:1: ( 'import' )
            {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:693:1: ( 'import' )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:694:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Import__Group__0__Impl1372); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

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
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:707:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:711:1: ( rule__Import__Group__1__Impl )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:712:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11403);
            rule__Import__Group__1__Impl();

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
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:718:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNameSpaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:722:1: ( ( ( rule__Import__ImportedNameSpaceAssignment_1 ) ) )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:723:1: ( ( rule__Import__ImportedNameSpaceAssignment_1 ) )
            {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:723:1: ( ( rule__Import__ImportedNameSpaceAssignment_1 ) )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:724:1: ( rule__Import__ImportedNameSpaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNameSpaceAssignment_1()); 
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:725:1: ( rule__Import__ImportedNameSpaceAssignment_1 )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:725:2: rule__Import__ImportedNameSpaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNameSpaceAssignment_1_in_rule__Import__Group__1__Impl1430);
            rule__Import__ImportedNameSpaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportedNameSpaceAssignment_1()); 

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
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__QualifiedNameSpaceWithWildCard__Group__0"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:739:1: rule__QualifiedNameSpaceWithWildCard__Group__0 : rule__QualifiedNameSpaceWithWildCard__Group__0__Impl rule__QualifiedNameSpaceWithWildCard__Group__1 ;
    public final void rule__QualifiedNameSpaceWithWildCard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:743:1: ( rule__QualifiedNameSpaceWithWildCard__Group__0__Impl rule__QualifiedNameSpaceWithWildCard__Group__1 )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:744:2: rule__QualifiedNameSpaceWithWildCard__Group__0__Impl rule__QualifiedNameSpaceWithWildCard__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameSpaceWithWildCard__Group__0__Impl_in_rule__QualifiedNameSpaceWithWildCard__Group__01464);
            rule__QualifiedNameSpaceWithWildCard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedNameSpaceWithWildCard__Group__1_in_rule__QualifiedNameSpaceWithWildCard__Group__01467);
            rule__QualifiedNameSpaceWithWildCard__Group__1();

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
    // $ANTLR end "rule__QualifiedNameSpaceWithWildCard__Group__0"


    // $ANTLR start "rule__QualifiedNameSpaceWithWildCard__Group__0__Impl"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:751:1: rule__QualifiedNameSpaceWithWildCard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameSpaceWithWildCard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:755:1: ( ( ruleQualifiedName ) )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:756:1: ( ruleQualifiedName )
            {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:756:1: ( ruleQualifiedName )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:757:1: ruleQualifiedName
            {
             before(grammarAccess.getQualifiedNameSpaceWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__QualifiedNameSpaceWithWildCard__Group__0__Impl1494);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameSpaceWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 

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
    // $ANTLR end "rule__QualifiedNameSpaceWithWildCard__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameSpaceWithWildCard__Group__1"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:768:1: rule__QualifiedNameSpaceWithWildCard__Group__1 : rule__QualifiedNameSpaceWithWildCard__Group__1__Impl ;
    public final void rule__QualifiedNameSpaceWithWildCard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:772:1: ( rule__QualifiedNameSpaceWithWildCard__Group__1__Impl )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:773:2: rule__QualifiedNameSpaceWithWildCard__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameSpaceWithWildCard__Group__1__Impl_in_rule__QualifiedNameSpaceWithWildCard__Group__11523);
            rule__QualifiedNameSpaceWithWildCard__Group__1__Impl();

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
    // $ANTLR end "rule__QualifiedNameSpaceWithWildCard__Group__1"


    // $ANTLR start "rule__QualifiedNameSpaceWithWildCard__Group__1__Impl"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:779:1: rule__QualifiedNameSpaceWithWildCard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameSpaceWithWildCard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:783:1: ( ( ( '.*' )? ) )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:784:1: ( ( '.*' )? )
            {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:784:1: ( ( '.*' )? )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:785:1: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameSpaceWithWildCardAccess().getFullStopAsteriskKeyword_1()); 
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:786:1: ( '.*' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:787:2: '.*'
                    {
                    match(input,16,FOLLOW_16_in_rule__QualifiedNameSpaceWithWildCard__Group__1__Impl1552); 

                    }
                    break;

            }

             after(grammarAccess.getQualifiedNameSpaceWithWildCardAccess().getFullStopAsteriskKeyword_1()); 

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
    // $ANTLR end "rule__QualifiedNameSpaceWithWildCard__Group__1__Impl"


    // $ANTLR start "rule__DataType__Group__0"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:802:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:806:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:807:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
            {
            pushFollow(FOLLOW_rule__DataType__Group__0__Impl_in_rule__DataType__Group__01589);
            rule__DataType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataType__Group__1_in_rule__DataType__Group__01592);
            rule__DataType__Group__1();

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
    // $ANTLR end "rule__DataType__Group__0"


    // $ANTLR start "rule__DataType__Group__0__Impl"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:814:1: rule__DataType__Group__0__Impl : ( 'datatype' ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:818:1: ( ( 'datatype' ) )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:819:1: ( 'datatype' )
            {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:819:1: ( 'datatype' )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:820:1: 'datatype'
            {
             before(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__DataType__Group__0__Impl1620); 
             after(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 

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
    // $ANTLR end "rule__DataType__Group__0__Impl"


    // $ANTLR start "rule__DataType__Group__1"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:833:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:837:1: ( rule__DataType__Group__1__Impl )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:838:2: rule__DataType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DataType__Group__1__Impl_in_rule__DataType__Group__11651);
            rule__DataType__Group__1__Impl();

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
    // $ANTLR end "rule__DataType__Group__1"


    // $ANTLR start "rule__DataType__Group__1__Impl"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:844:1: rule__DataType__Group__1__Impl : ( ( rule__DataType__NameAssignment_1 ) ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:848:1: ( ( ( rule__DataType__NameAssignment_1 ) ) )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:849:1: ( ( rule__DataType__NameAssignment_1 ) )
            {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:849:1: ( ( rule__DataType__NameAssignment_1 ) )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:850:1: ( rule__DataType__NameAssignment_1 )
            {
             before(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:851:1: ( rule__DataType__NameAssignment_1 )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:851:2: rule__DataType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DataType__NameAssignment_1_in_rule__DataType__Group__1__Impl1678);
            rule__DataType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__DataType__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:865:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:869:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:870:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__01712);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__01715);
            rule__Entity__Group__1();

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
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:877:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:881:1: ( ( 'entity' ) )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:882:1: ( 'entity' )
            {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:882:1: ( 'entity' )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:883:1: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__Entity__Group__0__Impl1743); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

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
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:896:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:900:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:901:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__11774);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__11777);
            rule__Entity__Group__2();

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
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:908:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:912:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:913:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:913:1: ( ( rule__Entity__NameAssignment_1 ) )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:914:1: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:915:1: ( rule__Entity__NameAssignment_1 )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:915:2: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl1804);
            rule__Entity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:925:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:929:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:930:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__21834);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__21837);
            rule__Entity__Group__3();

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
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:937:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:941:1: ( ( ( rule__Entity__Group_2__0 )? ) )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:942:1: ( ( rule__Entity__Group_2__0 )? )
            {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:942:1: ( ( rule__Entity__Group_2__0 )? )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:943:1: ( rule__Entity__Group_2__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:944:1: ( rule__Entity__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:944:2: rule__Entity__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Entity__Group_2__0_in_rule__Entity__Group__2__Impl1864);
                    rule__Entity__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:954:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:958:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:959:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__31895);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__31898);
            rule__Entity__Group__4();

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
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:966:1: rule__Entity__Group__3__Impl : ( '{' ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:970:1: ( ( '{' ) )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:971:1: ( '{' )
            {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:971:1: ( '{' )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:972:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_12_in_rule__Entity__Group__3__Impl1926); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:985:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:989:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:990:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__41957);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__41960);
            rule__Entity__Group__5();

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
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:997:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__FeaturesAssignment_4 )* ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1001:1: ( ( ( rule__Entity__FeaturesAssignment_4 )* ) )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1002:1: ( ( rule__Entity__FeaturesAssignment_4 )* )
            {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1002:1: ( ( rule__Entity__FeaturesAssignment_4 )* )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1003:1: ( rule__Entity__FeaturesAssignment_4 )*
            {
             before(grammarAccess.getEntityAccess().getFeaturesAssignment_4()); 
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1004:1: ( rule__Entity__FeaturesAssignment_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1004:2: rule__Entity__FeaturesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Entity__FeaturesAssignment_4_in_rule__Entity__Group__4__Impl1987);
            	    rule__Entity__FeaturesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getFeaturesAssignment_4()); 

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
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__5"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1014:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1018:1: ( rule__Entity__Group__5__Impl )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1019:2: rule__Entity__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__52018);
            rule__Entity__Group__5__Impl();

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
    // $ANTLR end "rule__Entity__Group__5"


    // $ANTLR start "rule__Entity__Group__5__Impl"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1025:1: rule__Entity__Group__5__Impl : ( '}' ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1029:1: ( ( '}' ) )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1030:1: ( '}' )
            {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1030:1: ( '}' )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1031:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_13_in_rule__Entity__Group__5__Impl2046); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Entity__Group__5__Impl"


    // $ANTLR start "rule__Entity__Group_2__0"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1056:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1060:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1061:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
            {
            pushFollow(FOLLOW_rule__Entity__Group_2__0__Impl_in_rule__Entity__Group_2__02089);
            rule__Entity__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group_2__1_in_rule__Entity__Group_2__02092);
            rule__Entity__Group_2__1();

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
    // $ANTLR end "rule__Entity__Group_2__0"


    // $ANTLR start "rule__Entity__Group_2__0__Impl"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1068:1: rule__Entity__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1072:1: ( ( 'extends' ) )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1073:1: ( 'extends' )
            {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1073:1: ( 'extends' )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1074:1: 'extends'
            {
             before(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 
            match(input,19,FOLLOW_19_in_rule__Entity__Group_2__0__Impl2120); 
             after(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 

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
    // $ANTLR end "rule__Entity__Group_2__0__Impl"


    // $ANTLR start "rule__Entity__Group_2__1"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1087:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1091:1: ( rule__Entity__Group_2__1__Impl )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1092:2: rule__Entity__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group_2__1__Impl_in_rule__Entity__Group_2__12151);
            rule__Entity__Group_2__1__Impl();

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
    // $ANTLR end "rule__Entity__Group_2__1"


    // $ANTLR start "rule__Entity__Group_2__1__Impl"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1098:1: rule__Entity__Group_2__1__Impl : ( ( rule__Entity__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1102:1: ( ( ( rule__Entity__SuperTypeAssignment_2_1 ) ) )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1103:1: ( ( rule__Entity__SuperTypeAssignment_2_1 ) )
            {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1103:1: ( ( rule__Entity__SuperTypeAssignment_2_1 ) )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1104:1: ( rule__Entity__SuperTypeAssignment_2_1 )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeAssignment_2_1()); 
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1105:1: ( rule__Entity__SuperTypeAssignment_2_1 )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1105:2: rule__Entity__SuperTypeAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Entity__SuperTypeAssignment_2_1_in_rule__Entity__Group_2__1__Impl2178);
            rule__Entity__SuperTypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getSuperTypeAssignment_2_1()); 

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
    // $ANTLR end "rule__Entity__Group_2__1__Impl"


    // $ANTLR start "rule__Feature__Group__0"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1119:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1123:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1124:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__02212);
            rule__Feature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__02215);
            rule__Feature__Group__1();

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
    // $ANTLR end "rule__Feature__Group__0"


    // $ANTLR start "rule__Feature__Group__0__Impl"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1131:1: rule__Feature__Group__0__Impl : ( ( rule__Feature__ManyAssignment_0 )? ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1135:1: ( ( ( rule__Feature__ManyAssignment_0 )? ) )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1136:1: ( ( rule__Feature__ManyAssignment_0 )? )
            {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1136:1: ( ( rule__Feature__ManyAssignment_0 )? )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1137:1: ( rule__Feature__ManyAssignment_0 )?
            {
             before(grammarAccess.getFeatureAccess().getManyAssignment_0()); 
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1138:1: ( rule__Feature__ManyAssignment_0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1138:2: rule__Feature__ManyAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Feature__ManyAssignment_0_in_rule__Feature__Group__0__Impl2242);
                    rule__Feature__ManyAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getManyAssignment_0()); 

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
    // $ANTLR end "rule__Feature__Group__0__Impl"


    // $ANTLR start "rule__Feature__Group__1"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1148:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1152:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1153:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__12273);
            rule__Feature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__12276);
            rule__Feature__Group__2();

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
    // $ANTLR end "rule__Feature__Group__1"


    // $ANTLR start "rule__Feature__Group__1__Impl"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1160:1: rule__Feature__Group__1__Impl : ( ( rule__Feature__NameAssignment_1 ) ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1164:1: ( ( ( rule__Feature__NameAssignment_1 ) ) )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1165:1: ( ( rule__Feature__NameAssignment_1 ) )
            {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1165:1: ( ( rule__Feature__NameAssignment_1 ) )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1166:1: ( rule__Feature__NameAssignment_1 )
            {
             before(grammarAccess.getFeatureAccess().getNameAssignment_1()); 
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1167:1: ( rule__Feature__NameAssignment_1 )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1167:2: rule__Feature__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Feature__NameAssignment_1_in_rule__Feature__Group__1__Impl2303);
            rule__Feature__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Feature__Group__1__Impl"


    // $ANTLR start "rule__Feature__Group__2"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1177:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1181:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1182:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
            {
            pushFollow(FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__22333);
            rule__Feature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__3_in_rule__Feature__Group__22336);
            rule__Feature__Group__3();

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
    // $ANTLR end "rule__Feature__Group__2"


    // $ANTLR start "rule__Feature__Group__2__Impl"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1189:1: rule__Feature__Group__2__Impl : ( ':' ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1193:1: ( ( ':' ) )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1194:1: ( ':' )
            {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1194:1: ( ':' )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1195:1: ':'
            {
             before(grammarAccess.getFeatureAccess().getColonKeyword_2()); 
            match(input,20,FOLLOW_20_in_rule__Feature__Group__2__Impl2364); 
             after(grammarAccess.getFeatureAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__Feature__Group__2__Impl"


    // $ANTLR start "rule__Feature__Group__3"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1208:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1212:1: ( rule__Feature__Group__3__Impl )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1213:2: rule__Feature__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Feature__Group__3__Impl_in_rule__Feature__Group__32395);
            rule__Feature__Group__3__Impl();

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
    // $ANTLR end "rule__Feature__Group__3"


    // $ANTLR start "rule__Feature__Group__3__Impl"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1219:1: rule__Feature__Group__3__Impl : ( ( rule__Feature__TypeAssignment_3 ) ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1223:1: ( ( ( rule__Feature__TypeAssignment_3 ) ) )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1224:1: ( ( rule__Feature__TypeAssignment_3 ) )
            {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1224:1: ( ( rule__Feature__TypeAssignment_3 ) )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1225:1: ( rule__Feature__TypeAssignment_3 )
            {
             before(grammarAccess.getFeatureAccess().getTypeAssignment_3()); 
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1226:1: ( rule__Feature__TypeAssignment_3 )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1226:2: rule__Feature__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Feature__TypeAssignment_3_in_rule__Feature__Group__3__Impl2422);
            rule__Feature__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getTypeAssignment_3()); 

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
    // $ANTLR end "rule__Feature__Group__3__Impl"


    // $ANTLR start "rule__MyTuto__ElementsAssignment"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1245:1: rule__MyTuto__ElementsAssignment : ( ruleAbstractElement ) ;
    public final void rule__MyTuto__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1249:1: ( ( ruleAbstractElement ) )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1250:1: ( ruleAbstractElement )
            {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1250:1: ( ruleAbstractElement )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1251:1: ruleAbstractElement
            {
             before(grammarAccess.getMyTutoAccess().getElementsAbstractElementParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_rule__MyTuto__ElementsAssignment2465);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getMyTutoAccess().getElementsAbstractElementParserRuleCall_0()); 

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
    // $ANTLR end "rule__MyTuto__ElementsAssignment"


    // $ANTLR start "rule__PackageDeclaration__NameAssignment_1"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1260:1: rule__PackageDeclaration__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__PackageDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1264:1: ( ( ruleQualifiedName ) )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1265:1: ( ruleQualifiedName )
            {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1265:1: ( ruleQualifiedName )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1266:1: ruleQualifiedName
            {
             before(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__PackageDeclaration__NameAssignment_12496);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__PackageDeclaration__NameAssignment_1"


    // $ANTLR start "rule__PackageDeclaration__ElementsAssignment_3"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1275:1: rule__PackageDeclaration__ElementsAssignment_3 : ( ruleAbstractElement ) ;
    public final void rule__PackageDeclaration__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1279:1: ( ( ruleAbstractElement ) )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1280:1: ( ruleAbstractElement )
            {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1280:1: ( ruleAbstractElement )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1281:1: ruleAbstractElement
            {
             before(grammarAccess.getPackageDeclarationAccess().getElementsAbstractElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_rule__PackageDeclaration__ElementsAssignment_32527);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getPackageDeclarationAccess().getElementsAbstractElementParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__PackageDeclaration__ElementsAssignment_3"


    // $ANTLR start "rule__Import__ImportedNameSpaceAssignment_1"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1290:1: rule__Import__ImportedNameSpaceAssignment_1 : ( ruleQualifiedNameSpaceWithWildCard ) ;
    public final void rule__Import__ImportedNameSpaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1294:1: ( ( ruleQualifiedNameSpaceWithWildCard ) )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1295:1: ( ruleQualifiedNameSpaceWithWildCard )
            {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1295:1: ( ruleQualifiedNameSpaceWithWildCard )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1296:1: ruleQualifiedNameSpaceWithWildCard
            {
             before(grammarAccess.getImportAccess().getImportedNameSpaceQualifiedNameSpaceWithWildCardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedNameSpaceWithWildCard_in_rule__Import__ImportedNameSpaceAssignment_12558);
            ruleQualifiedNameSpaceWithWildCard();

            state._fsp--;

             after(grammarAccess.getImportAccess().getImportedNameSpaceQualifiedNameSpaceWithWildCardParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Import__ImportedNameSpaceAssignment_1"


    // $ANTLR start "rule__DataType__NameAssignment_1"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1305:1: rule__DataType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1309:1: ( ( RULE_ID ) )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1310:1: ( RULE_ID )
            {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1310:1: ( RULE_ID )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1311:1: RULE_ID
            {
             before(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DataType__NameAssignment_12589); 
             after(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__DataType__NameAssignment_1"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1320:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1324:1: ( ( RULE_ID ) )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1325:1: ( RULE_ID )
            {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1325:1: ( RULE_ID )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1326:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_12620); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__SuperTypeAssignment_2_1"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1335:1: rule__Entity__SuperTypeAssignment_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Entity__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1339:1: ( ( ( ruleQualifiedName ) ) )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1340:1: ( ( ruleQualifiedName ) )
            {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1340:1: ( ( ruleQualifiedName ) )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1341:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0()); 
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1342:1: ( ruleQualifiedName )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1343:1: ruleQualifiedName
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityQualifiedNameParserRuleCall_2_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Entity__SuperTypeAssignment_2_12655);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getSuperTypeEntityQualifiedNameParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0()); 

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
    // $ANTLR end "rule__Entity__SuperTypeAssignment_2_1"


    // $ANTLR start "rule__Entity__FeaturesAssignment_4"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1354:1: rule__Entity__FeaturesAssignment_4 : ( ruleFeature ) ;
    public final void rule__Entity__FeaturesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1358:1: ( ( ruleFeature ) )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1359:1: ( ruleFeature )
            {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1359:1: ( ruleFeature )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1360:1: ruleFeature
            {
             before(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_42690);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Entity__FeaturesAssignment_4"


    // $ANTLR start "rule__Feature__ManyAssignment_0"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1369:1: rule__Feature__ManyAssignment_0 : ( ( 'many' ) ) ;
    public final void rule__Feature__ManyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1373:1: ( ( ( 'many' ) ) )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1374:1: ( ( 'many' ) )
            {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1374:1: ( ( 'many' ) )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1375:1: ( 'many' )
            {
             before(grammarAccess.getFeatureAccess().getManyManyKeyword_0_0()); 
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1376:1: ( 'many' )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1377:1: 'many'
            {
             before(grammarAccess.getFeatureAccess().getManyManyKeyword_0_0()); 
            match(input,21,FOLLOW_21_in_rule__Feature__ManyAssignment_02726); 
             after(grammarAccess.getFeatureAccess().getManyManyKeyword_0_0()); 

            }

             after(grammarAccess.getFeatureAccess().getManyManyKeyword_0_0()); 

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
    // $ANTLR end "rule__Feature__ManyAssignment_0"


    // $ANTLR start "rule__Feature__NameAssignment_1"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1392:1: rule__Feature__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Feature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1396:1: ( ( RULE_ID ) )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1397:1: ( RULE_ID )
            {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1397:1: ( RULE_ID )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1398:1: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Feature__NameAssignment_12765); 
             after(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Feature__NameAssignment_1"


    // $ANTLR start "rule__Feature__TypeAssignment_3"
    // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1407:1: rule__Feature__TypeAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Feature__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1411:1: ( ( ( ruleQualifiedName ) ) )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1412:1: ( ( ruleQualifiedName ) )
            {
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1412:1: ( ( ruleQualifiedName ) )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1413:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getFeatureAccess().getTypeTypeCrossReference_3_0()); 
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1414:1: ( ruleQualifiedName )
            // ../fr.imta.tp2.tutorial.ui/src-gen/fr/imta/tp2/tutorial/ui/contentassist/antlr/internal/InternalMyTuto.g:1415:1: ruleQualifiedName
            {
             before(grammarAccess.getFeatureAccess().getTypeTypeQualifiedNameParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Feature__TypeAssignment_32800);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getTypeTypeQualifiedNameParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getFeatureAccess().getTypeTypeCrossReference_3_0()); 

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
    // $ANTLR end "rule__Feature__TypeAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleMyTuto_in_entryRuleMyTuto61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMyTuto68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MyTuto__ElementsAssignment_in_ruleMyTuto94 = new BitSet(new long[]{0x0000000000068802L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractElement__Alternatives_in_ruleAbstractElement155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageDeclaration189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__0_in_rulePackageDeclaration215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameSpaceWithWildCard_in_entryRuleQualifiedNameSpaceWithWildCard362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameSpaceWithWildCard369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameSpaceWithWildCard__Group__0_in_ruleQualifiedNameSpaceWithWildCard395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__0_in_ruleDataType515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__0_in_ruleFeature635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_rule__AbstractElement__Alternatives671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__AbstractElement__Alternatives688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__AbstractElement__Alternatives705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_rule__Type__Alternatives737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Type__Alternatives754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__0__Impl_in_rule__PackageDeclaration__Group__0784 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__1_in_rule__PackageDeclaration__Group__0787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__PackageDeclaration__Group__0__Impl815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__1__Impl_in_rule__PackageDeclaration__Group__1846 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__2_in_rule__PackageDeclaration__Group__1849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__NameAssignment_1_in_rule__PackageDeclaration__Group__1__Impl876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__2__Impl_in_rule__PackageDeclaration__Group__2906 = new BitSet(new long[]{0x000000000006A800L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__3_in_rule__PackageDeclaration__Group__2909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__PackageDeclaration__Group__2__Impl937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__3__Impl_in_rule__PackageDeclaration__Group__3968 = new BitSet(new long[]{0x000000000006A800L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__4_in_rule__PackageDeclaration__Group__3971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__ElementsAssignment_3_in_rule__PackageDeclaration__Group__3__Impl998 = new BitSet(new long[]{0x0000000000068802L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__4__Impl_in_rule__PackageDeclaration__Group__41029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__PackageDeclaration__Group__4__Impl1057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__01098 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__01101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl1128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__11157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1184 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01219 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__QualifiedName__Group_1__0__Impl1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl1308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01341 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Import__Group__0__Impl1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNameSpaceAssignment_1_in_rule__Import__Group__1__Impl1430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameSpaceWithWildCard__Group__0__Impl_in_rule__QualifiedNameSpaceWithWildCard__Group__01464 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__QualifiedNameSpaceWithWildCard__Group__1_in_rule__QualifiedNameSpaceWithWildCard__Group__01467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__QualifiedNameSpaceWithWildCard__Group__0__Impl1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameSpaceWithWildCard__Group__1__Impl_in_rule__QualifiedNameSpaceWithWildCard__Group__11523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__QualifiedNameSpaceWithWildCard__Group__1__Impl1552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__0__Impl_in_rule__DataType__Group__01589 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DataType__Group__1_in_rule__DataType__Group__01592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__DataType__Group__0__Impl1620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__1__Impl_in_rule__DataType__Group__11651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__NameAssignment_1_in_rule__DataType__Group__1__Impl1678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__01712 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__01715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Entity__Group__0__Impl1743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__11774 = new BitSet(new long[]{0x0000000000081000L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__11777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl1804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__21834 = new BitSet(new long[]{0x0000000000081000L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__21837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__0_in_rule__Entity__Group__2__Impl1864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__31895 = new BitSet(new long[]{0x0000000000202010L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__31898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Entity__Group__3__Impl1926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__41957 = new BitSet(new long[]{0x0000000000202010L});
    public static final BitSet FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__41960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__FeaturesAssignment_4_in_rule__Entity__Group__4__Impl1987 = new BitSet(new long[]{0x0000000000200012L});
    public static final BitSet FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__52018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Entity__Group__5__Impl2046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__0__Impl_in_rule__Entity__Group_2__02089 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__1_in_rule__Entity__Group_2__02092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Entity__Group_2__0__Impl2120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__1__Impl_in_rule__Entity__Group_2__12151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__SuperTypeAssignment_2_1_in_rule__Entity__Group_2__1__Impl2178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__02212 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__02215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__ManyAssignment_0_in_rule__Feature__Group__0__Impl2242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__12273 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__12276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__NameAssignment_1_in_rule__Feature__Group__1__Impl2303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__22333 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Feature__Group__3_in_rule__Feature__Group__22336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Feature__Group__2__Impl2364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__3__Impl_in_rule__Feature__Group__32395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__TypeAssignment_3_in_rule__Feature__Group__3__Impl2422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rule__MyTuto__ElementsAssignment2465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__PackageDeclaration__NameAssignment_12496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rule__PackageDeclaration__ElementsAssignment_32527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameSpaceWithWildCard_in_rule__Import__ImportedNameSpaceAssignment_12558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DataType__NameAssignment_12589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_12620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Entity__SuperTypeAssignment_2_12655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_42690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Feature__ManyAssignment_02726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Feature__NameAssignment_12765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Feature__TypeAssignment_32800 = new BitSet(new long[]{0x0000000000000002L});

}