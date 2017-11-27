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
import fr.imta.tp.services.Sql4csvGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSql4csvParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'select'", "','", "'from'", "'where'", "'.'", "'='", "'and'", "'('", "')'", "'or'"
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
    public String getGrammarFileName() { return "../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g"; }



     	private Sql4csvGrammarAccess grammarAccess;
     	
        public InternalSql4csvParser(TokenStream input, Sql4csvGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "SQL4CSV";	
       	}
       	
       	@Override
       	protected Sql4csvGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSQL4CSV"
    // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:67:1: entryRuleSQL4CSV returns [EObject current=null] : iv_ruleSQL4CSV= ruleSQL4CSV EOF ;
    public final EObject entryRuleSQL4CSV() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSQL4CSV = null;


        try {
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:68:2: (iv_ruleSQL4CSV= ruleSQL4CSV EOF )
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:69:2: iv_ruleSQL4CSV= ruleSQL4CSV EOF
            {
             newCompositeNode(grammarAccess.getSQL4CSVRule()); 
            pushFollow(FOLLOW_ruleSQL4CSV_in_entryRuleSQL4CSV75);
            iv_ruleSQL4CSV=ruleSQL4CSV();

            state._fsp--;

             current =iv_ruleSQL4CSV; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSQL4CSV85); 

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
    // $ANTLR end "entryRuleSQL4CSV"


    // $ANTLR start "ruleSQL4CSV"
    // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:76:1: ruleSQL4CSV returns [EObject current=null] : ( (lv_program_0_0= ruleProgram ) ) ;
    public final EObject ruleSQL4CSV() throws RecognitionException {
        EObject current = null;

        EObject lv_program_0_0 = null;


         enterRule(); 
            
        try {
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:79:28: ( ( (lv_program_0_0= ruleProgram ) ) )
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:80:1: ( (lv_program_0_0= ruleProgram ) )
            {
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:80:1: ( (lv_program_0_0= ruleProgram ) )
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:81:1: (lv_program_0_0= ruleProgram )
            {
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:81:1: (lv_program_0_0= ruleProgram )
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:82:3: lv_program_0_0= ruleProgram
            {
             
            	        newCompositeNode(grammarAccess.getSQL4CSVAccess().getProgramProgramParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleProgram_in_ruleSQL4CSV130);
            lv_program_0_0=ruleProgram();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSQL4CSVRule());
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
    // $ANTLR end "ruleSQL4CSV"


    // $ANTLR start "entryRuleProgram"
    // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:106:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:107:2: (iv_ruleProgram= ruleProgram EOF )
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:108:2: iv_ruleProgram= ruleProgram EOF
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
    // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:115:1: ruleProgram returns [EObject current=null] : ( (lv_queries_0_0= ruleQuery ) )* ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_queries_0_0 = null;


         enterRule(); 
            
        try {
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:118:28: ( ( (lv_queries_0_0= ruleQuery ) )* )
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:119:1: ( (lv_queries_0_0= ruleQuery ) )*
            {
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:119:1: ( (lv_queries_0_0= ruleQuery ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:120:1: (lv_queries_0_0= ruleQuery )
            	    {
            	    // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:120:1: (lv_queries_0_0= ruleQuery )
            	    // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:121:3: lv_queries_0_0= ruleQuery
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProgramAccess().getQueriesQueryParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQuery_in_ruleProgram220);
            	    lv_queries_0_0=ruleQuery();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"queries",
            	            		lv_queries_0_0, 
            	            		"Query");
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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleQuery"
    // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:145:1: entryRuleQuery returns [EObject current=null] : iv_ruleQuery= ruleQuery EOF ;
    public final EObject entryRuleQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuery = null;


        try {
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:146:2: (iv_ruleQuery= ruleQuery EOF )
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:147:2: iv_ruleQuery= ruleQuery EOF
            {
             newCompositeNode(grammarAccess.getQueryRule()); 
            pushFollow(FOLLOW_ruleQuery_in_entryRuleQuery256);
            iv_ruleQuery=ruleQuery();

            state._fsp--;

             current =iv_ruleQuery; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuery266); 

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
    // $ANTLR end "entryRuleQuery"


    // $ANTLR start "ruleQuery"
    // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:154:1: ruleQuery returns [EObject current=null] : (otherlv_0= 'select' ( (lv_column_1_0= ruleColumn ) ) (otherlv_2= ',' ( (lv_columns_3_0= ruleColumn ) ) )* otherlv_4= 'from' ( (lv_table_5_0= ruleTable ) ) (otherlv_6= ',' ( (lv_tables_7_0= ruleTable ) ) )* (otherlv_8= 'where' ( (lv_conditions_9_0= ruleCondition ) ) )? ) ;
    public final EObject ruleQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_column_1_0 = null;

        EObject lv_columns_3_0 = null;

        EObject lv_table_5_0 = null;

        EObject lv_tables_7_0 = null;

        EObject lv_conditions_9_0 = null;


         enterRule(); 
            
        try {
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:157:28: ( (otherlv_0= 'select' ( (lv_column_1_0= ruleColumn ) ) (otherlv_2= ',' ( (lv_columns_3_0= ruleColumn ) ) )* otherlv_4= 'from' ( (lv_table_5_0= ruleTable ) ) (otherlv_6= ',' ( (lv_tables_7_0= ruleTable ) ) )* (otherlv_8= 'where' ( (lv_conditions_9_0= ruleCondition ) ) )? ) )
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:158:1: (otherlv_0= 'select' ( (lv_column_1_0= ruleColumn ) ) (otherlv_2= ',' ( (lv_columns_3_0= ruleColumn ) ) )* otherlv_4= 'from' ( (lv_table_5_0= ruleTable ) ) (otherlv_6= ',' ( (lv_tables_7_0= ruleTable ) ) )* (otherlv_8= 'where' ( (lv_conditions_9_0= ruleCondition ) ) )? )
            {
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:158:1: (otherlv_0= 'select' ( (lv_column_1_0= ruleColumn ) ) (otherlv_2= ',' ( (lv_columns_3_0= ruleColumn ) ) )* otherlv_4= 'from' ( (lv_table_5_0= ruleTable ) ) (otherlv_6= ',' ( (lv_tables_7_0= ruleTable ) ) )* (otherlv_8= 'where' ( (lv_conditions_9_0= ruleCondition ) ) )? )
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:158:3: otherlv_0= 'select' ( (lv_column_1_0= ruleColumn ) ) (otherlv_2= ',' ( (lv_columns_3_0= ruleColumn ) ) )* otherlv_4= 'from' ( (lv_table_5_0= ruleTable ) ) (otherlv_6= ',' ( (lv_tables_7_0= ruleTable ) ) )* (otherlv_8= 'where' ( (lv_conditions_9_0= ruleCondition ) ) )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleQuery303); 

                	newLeafNode(otherlv_0, grammarAccess.getQueryAccess().getSelectKeyword_0());
                
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:162:1: ( (lv_column_1_0= ruleColumn ) )
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:163:1: (lv_column_1_0= ruleColumn )
            {
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:163:1: (lv_column_1_0= ruleColumn )
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:164:3: lv_column_1_0= ruleColumn
            {
             
            	        newCompositeNode(grammarAccess.getQueryAccess().getColumnColumnParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleColumn_in_ruleQuery324);
            lv_column_1_0=ruleColumn();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQueryRule());
            	        }
                   		set(
                   			current, 
                   			"column",
                    		lv_column_1_0, 
                    		"Column");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:180:2: (otherlv_2= ',' ( (lv_columns_3_0= ruleColumn ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:180:4: otherlv_2= ',' ( (lv_columns_3_0= ruleColumn ) )
            	    {
            	    otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleQuery337); 

            	        	newLeafNode(otherlv_2, grammarAccess.getQueryAccess().getCommaKeyword_2_0());
            	        
            	    // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:184:1: ( (lv_columns_3_0= ruleColumn ) )
            	    // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:185:1: (lv_columns_3_0= ruleColumn )
            	    {
            	    // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:185:1: (lv_columns_3_0= ruleColumn )
            	    // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:186:3: lv_columns_3_0= ruleColumn
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQueryAccess().getColumnsColumnParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleColumn_in_ruleQuery358);
            	    lv_columns_3_0=ruleColumn();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQueryRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"columns",
            	            		lv_columns_3_0, 
            	            		"Column");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleQuery372); 

                	newLeafNode(otherlv_4, grammarAccess.getQueryAccess().getFromKeyword_3());
                
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:206:1: ( (lv_table_5_0= ruleTable ) )
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:207:1: (lv_table_5_0= ruleTable )
            {
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:207:1: (lv_table_5_0= ruleTable )
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:208:3: lv_table_5_0= ruleTable
            {
             
            	        newCompositeNode(grammarAccess.getQueryAccess().getTableTableParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleTable_in_ruleQuery393);
            lv_table_5_0=ruleTable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQueryRule());
            	        }
                   		set(
                   			current, 
                   			"table",
                    		lv_table_5_0, 
                    		"Table");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:224:2: (otherlv_6= ',' ( (lv_tables_7_0= ruleTable ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:224:4: otherlv_6= ',' ( (lv_tables_7_0= ruleTable ) )
            	    {
            	    otherlv_6=(Token)match(input,12,FOLLOW_12_in_ruleQuery406); 

            	        	newLeafNode(otherlv_6, grammarAccess.getQueryAccess().getCommaKeyword_5_0());
            	        
            	    // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:228:1: ( (lv_tables_7_0= ruleTable ) )
            	    // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:229:1: (lv_tables_7_0= ruleTable )
            	    {
            	    // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:229:1: (lv_tables_7_0= ruleTable )
            	    // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:230:3: lv_tables_7_0= ruleTable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQueryAccess().getTablesTableParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTable_in_ruleQuery427);
            	    lv_tables_7_0=ruleTable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQueryRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"tables",
            	            		lv_tables_7_0, 
            	            		"Table");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:246:4: (otherlv_8= 'where' ( (lv_conditions_9_0= ruleCondition ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:246:6: otherlv_8= 'where' ( (lv_conditions_9_0= ruleCondition ) )
                    {
                    otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleQuery442); 

                        	newLeafNode(otherlv_8, grammarAccess.getQueryAccess().getWhereKeyword_6_0());
                        
                    // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:250:1: ( (lv_conditions_9_0= ruleCondition ) )
                    // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:251:1: (lv_conditions_9_0= ruleCondition )
                    {
                    // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:251:1: (lv_conditions_9_0= ruleCondition )
                    // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:252:3: lv_conditions_9_0= ruleCondition
                    {
                     
                    	        newCompositeNode(grammarAccess.getQueryAccess().getConditionsConditionParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCondition_in_ruleQuery463);
                    lv_conditions_9_0=ruleCondition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getQueryRule());
                    	        }
                           		set(
                           			current, 
                           			"conditions",
                            		lv_conditions_9_0, 
                            		"Condition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleQuery"


    // $ANTLR start "entryRuleColumn"
    // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:276:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:277:2: (iv_ruleColumn= ruleColumn EOF )
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:278:2: iv_ruleColumn= ruleColumn EOF
            {
             newCompositeNode(grammarAccess.getColumnRule()); 
            pushFollow(FOLLOW_ruleColumn_in_entryRuleColumn501);
            iv_ruleColumn=ruleColumn();

            state._fsp--;

             current =iv_ruleColumn; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColumn511); 

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
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:285:1: ruleColumn returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' )? ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:288:28: ( ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' )? ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:289:1: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' )? ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:289:1: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' )? ( (lv_name_2_0= RULE_ID ) ) )
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:289:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' )? ( (lv_name_2_0= RULE_ID ) )
            {
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:289:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==15) ) {
                    alt5=1;
                }
            }
            switch (alt5) {
                case 1 :
                    // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:289:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.'
                    {
                    // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:289:3: ( (otherlv_0= RULE_ID ) )
                    // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:290:1: (otherlv_0= RULE_ID )
                    {
                    // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:290:1: (otherlv_0= RULE_ID )
                    // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:291:3: otherlv_0= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getColumnRule());
                    	        }
                            
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleColumn557); 

                    		newLeafNode(otherlv_0, grammarAccess.getColumnAccess().getTableTableCrossReference_0_0_0()); 
                    	

                    }


                    }

                    otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleColumn569); 

                        	newLeafNode(otherlv_1, grammarAccess.getColumnAccess().getFullStopKeyword_0_1());
                        

                    }
                    break;

            }

            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:306:3: ( (lv_name_2_0= RULE_ID ) )
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:307:1: (lv_name_2_0= RULE_ID )
            {
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:307:1: (lv_name_2_0= RULE_ID )
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:308:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleColumn588); 

            			newLeafNode(lv_name_2_0, grammarAccess.getColumnAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getColumnRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleColumn"


    // $ANTLR start "entryRuleTable"
    // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:332:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:333:2: (iv_ruleTable= ruleTable EOF )
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:334:2: iv_ruleTable= ruleTable EOF
            {
             newCompositeNode(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_ruleTable_in_entryRuleTable629);
            iv_ruleTable=ruleTable();

            state._fsp--;

             current =iv_ruleTable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTable639); 

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
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:341:1: ruleTable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:344:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:345:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:345:1: ( (lv_name_0_0= RULE_ID ) )
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:346:1: (lv_name_0_0= RULE_ID )
            {
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:346:1: (lv_name_0_0= RULE_ID )
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:347:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTable680); 

            			newLeafNode(lv_name_0_0, grammarAccess.getTableAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTableRule());
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
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleCondition"
    // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:371:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:372:2: (iv_ruleCondition= ruleCondition EOF )
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:373:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition720);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondition730); 

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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:380:1: ruleCondition returns [EObject current=null] : (this_BinaryCondition_0= ruleBinaryCondition | this_Equality_1= ruleEquality ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject this_BinaryCondition_0 = null;

        EObject this_Equality_1 = null;


         enterRule(); 
            
        try {
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:383:28: ( (this_BinaryCondition_0= ruleBinaryCondition | this_Equality_1= ruleEquality ) )
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:384:1: (this_BinaryCondition_0= ruleBinaryCondition | this_Equality_1= ruleEquality )
            {
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:384:1: (this_BinaryCondition_0= ruleBinaryCondition | this_Equality_1= ruleEquality )
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:385:5: this_BinaryCondition_0= ruleBinaryCondition
                    {
                     
                            newCompositeNode(grammarAccess.getConditionAccess().getBinaryConditionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBinaryCondition_in_ruleCondition777);
                    this_BinaryCondition_0=ruleBinaryCondition();

                    state._fsp--;

                     
                            current = this_BinaryCondition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:395:5: this_Equality_1= ruleEquality
                    {
                     
                            newCompositeNode(grammarAccess.getConditionAccess().getEqualityParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleEquality_in_ruleCondition804);
                    this_Equality_1=ruleEquality();

                    state._fsp--;

                     
                            current = this_Equality_1; 
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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleEquality"
    // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:411:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:412:2: (iv_ruleEquality= ruleEquality EOF )
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:413:2: iv_ruleEquality= ruleEquality EOF
            {
             newCompositeNode(grammarAccess.getEqualityRule()); 
            pushFollow(FOLLOW_ruleEquality_in_entryRuleEquality839);
            iv_ruleEquality=ruleEquality();

            state._fsp--;

             current =iv_ruleEquality; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEquality849); 

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
    // $ANTLR end "entryRuleEquality"


    // $ANTLR start "ruleEquality"
    // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:420:1: ruleEquality returns [EObject current=null] : ( ( (lv_left_0_0= ruleColumn ) ) otherlv_1= '=' ( ( (lv_right_2_1= ruleColumnEquality | lv_right_2_2= ruleValueEquality ) ) ) ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_1 = null;

        EObject lv_right_2_2 = null;


         enterRule(); 
            
        try {
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:423:28: ( ( ( (lv_left_0_0= ruleColumn ) ) otherlv_1= '=' ( ( (lv_right_2_1= ruleColumnEquality | lv_right_2_2= ruleValueEquality ) ) ) ) )
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:424:1: ( ( (lv_left_0_0= ruleColumn ) ) otherlv_1= '=' ( ( (lv_right_2_1= ruleColumnEquality | lv_right_2_2= ruleValueEquality ) ) ) )
            {
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:424:1: ( ( (lv_left_0_0= ruleColumn ) ) otherlv_1= '=' ( ( (lv_right_2_1= ruleColumnEquality | lv_right_2_2= ruleValueEquality ) ) ) )
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:424:2: ( (lv_left_0_0= ruleColumn ) ) otherlv_1= '=' ( ( (lv_right_2_1= ruleColumnEquality | lv_right_2_2= ruleValueEquality ) ) )
            {
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:424:2: ( (lv_left_0_0= ruleColumn ) )
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:425:1: (lv_left_0_0= ruleColumn )
            {
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:425:1: (lv_left_0_0= ruleColumn )
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:426:3: lv_left_0_0= ruleColumn
            {
             
            	        newCompositeNode(grammarAccess.getEqualityAccess().getLeftColumnParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleColumn_in_ruleEquality895);
            lv_left_0_0=ruleColumn();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEqualityRule());
            	        }
                   		set(
                   			current, 
                   			"left",
                    		lv_left_0_0, 
                    		"Column");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleEquality907); 

                	newLeafNode(otherlv_1, grammarAccess.getEqualityAccess().getEqualsSignKeyword_1());
                
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:446:1: ( ( (lv_right_2_1= ruleColumnEquality | lv_right_2_2= ruleValueEquality ) ) )
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:447:1: ( (lv_right_2_1= ruleColumnEquality | lv_right_2_2= ruleValueEquality ) )
            {
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:447:1: ( (lv_right_2_1= ruleColumnEquality | lv_right_2_2= ruleValueEquality ) )
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:448:1: (lv_right_2_1= ruleColumnEquality | lv_right_2_2= ruleValueEquality )
            {
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:448:1: (lv_right_2_1= ruleColumnEquality | lv_right_2_2= ruleValueEquality )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_STRING) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:449:3: lv_right_2_1= ruleColumnEquality
                    {
                     
                    	        newCompositeNode(grammarAccess.getEqualityAccess().getRightColumnEqualityParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleColumnEquality_in_ruleEquality930);
                    lv_right_2_1=ruleColumnEquality();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEqualityRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_2_1, 
                            		"ColumnEquality");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:464:8: lv_right_2_2= ruleValueEquality
                    {
                     
                    	        newCompositeNode(grammarAccess.getEqualityAccess().getRightValueEqualityParserRuleCall_2_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleValueEquality_in_ruleEquality949);
                    lv_right_2_2=ruleValueEquality();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEqualityRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_2_2, 
                            		"ValueEquality");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


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
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleBinaryCondition"
    // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:490:1: entryRuleBinaryCondition returns [EObject current=null] : iv_ruleBinaryCondition= ruleBinaryCondition EOF ;
    public final EObject entryRuleBinaryCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryCondition = null;


        try {
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:491:2: (iv_ruleBinaryCondition= ruleBinaryCondition EOF )
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:492:2: iv_ruleBinaryCondition= ruleBinaryCondition EOF
            {
             newCompositeNode(grammarAccess.getBinaryConditionRule()); 
            pushFollow(FOLLOW_ruleBinaryCondition_in_entryRuleBinaryCondition988);
            iv_ruleBinaryCondition=ruleBinaryCondition();

            state._fsp--;

             current =iv_ruleBinaryCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinaryCondition998); 

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
    // $ANTLR end "entryRuleBinaryCondition"


    // $ANTLR start "ruleBinaryCondition"
    // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:499:1: ruleBinaryCondition returns [EObject current=null] : (this_AndCondition_0= ruleAndCondition | this_OrCondition_1= ruleOrCondition ) ;
    public final EObject ruleBinaryCondition() throws RecognitionException {
        EObject current = null;

        EObject this_AndCondition_0 = null;

        EObject this_OrCondition_1 = null;


         enterRule(); 
            
        try {
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:502:28: ( (this_AndCondition_0= ruleAndCondition | this_OrCondition_1= ruleOrCondition ) )
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:503:1: (this_AndCondition_0= ruleAndCondition | this_OrCondition_1= ruleOrCondition )
            {
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:503:1: (this_AndCondition_0= ruleAndCondition | this_OrCondition_1= ruleOrCondition )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:504:5: this_AndCondition_0= ruleAndCondition
                    {
                     
                            newCompositeNode(grammarAccess.getBinaryConditionAccess().getAndConditionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAndCondition_in_ruleBinaryCondition1045);
                    this_AndCondition_0=ruleAndCondition();

                    state._fsp--;

                     
                            current = this_AndCondition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:514:5: this_OrCondition_1= ruleOrCondition
                    {
                     
                            newCompositeNode(grammarAccess.getBinaryConditionAccess().getOrConditionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleOrCondition_in_ruleBinaryCondition1072);
                    this_OrCondition_1=ruleOrCondition();

                    state._fsp--;

                     
                            current = this_OrCondition_1; 
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
    // $ANTLR end "ruleBinaryCondition"


    // $ANTLR start "entryRuleColumnEquality"
    // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:530:1: entryRuleColumnEquality returns [EObject current=null] : iv_ruleColumnEquality= ruleColumnEquality EOF ;
    public final EObject entryRuleColumnEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnEquality = null;


        try {
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:531:2: (iv_ruleColumnEquality= ruleColumnEquality EOF )
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:532:2: iv_ruleColumnEquality= ruleColumnEquality EOF
            {
             newCompositeNode(grammarAccess.getColumnEqualityRule()); 
            pushFollow(FOLLOW_ruleColumnEquality_in_entryRuleColumnEquality1107);
            iv_ruleColumnEquality=ruleColumnEquality();

            state._fsp--;

             current =iv_ruleColumnEquality; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColumnEquality1117); 

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
    // $ANTLR end "entryRuleColumnEquality"


    // $ANTLR start "ruleColumnEquality"
    // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:539:1: ruleColumnEquality returns [EObject current=null] : ( (lv_right_0_0= ruleColumn ) ) ;
    public final EObject ruleColumnEquality() throws RecognitionException {
        EObject current = null;

        EObject lv_right_0_0 = null;


         enterRule(); 
            
        try {
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:542:28: ( ( (lv_right_0_0= ruleColumn ) ) )
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:543:1: ( (lv_right_0_0= ruleColumn ) )
            {
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:543:1: ( (lv_right_0_0= ruleColumn ) )
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:544:1: (lv_right_0_0= ruleColumn )
            {
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:544:1: (lv_right_0_0= ruleColumn )
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:545:3: lv_right_0_0= ruleColumn
            {
             
            	        newCompositeNode(grammarAccess.getColumnEqualityAccess().getRightColumnParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleColumn_in_ruleColumnEquality1162);
            lv_right_0_0=ruleColumn();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getColumnEqualityRule());
            	        }
                   		set(
                   			current, 
                   			"right",
                    		lv_right_0_0, 
                    		"Column");
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
    // $ANTLR end "ruleColumnEquality"


    // $ANTLR start "entryRuleValueEquality"
    // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:569:1: entryRuleValueEquality returns [EObject current=null] : iv_ruleValueEquality= ruleValueEquality EOF ;
    public final EObject entryRuleValueEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueEquality = null;


        try {
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:570:2: (iv_ruleValueEquality= ruleValueEquality EOF )
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:571:2: iv_ruleValueEquality= ruleValueEquality EOF
            {
             newCompositeNode(grammarAccess.getValueEqualityRule()); 
            pushFollow(FOLLOW_ruleValueEquality_in_entryRuleValueEquality1197);
            iv_ruleValueEquality=ruleValueEquality();

            state._fsp--;

             current =iv_ruleValueEquality; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueEquality1207); 

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
    // $ANTLR end "entryRuleValueEquality"


    // $ANTLR start "ruleValueEquality"
    // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:578:1: ruleValueEquality returns [EObject current=null] : ( (lv_right_0_0= RULE_STRING ) ) ;
    public final EObject ruleValueEquality() throws RecognitionException {
        EObject current = null;

        Token lv_right_0_0=null;

         enterRule(); 
            
        try {
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:581:28: ( ( (lv_right_0_0= RULE_STRING ) ) )
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:582:1: ( (lv_right_0_0= RULE_STRING ) )
            {
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:582:1: ( (lv_right_0_0= RULE_STRING ) )
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:583:1: (lv_right_0_0= RULE_STRING )
            {
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:583:1: (lv_right_0_0= RULE_STRING )
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:584:3: lv_right_0_0= RULE_STRING
            {
            lv_right_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleValueEquality1248); 

            			newLeafNode(lv_right_0_0, grammarAccess.getValueEqualityAccess().getRightSTRINGTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getValueEqualityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"right",
                    		lv_right_0_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleValueEquality"


    // $ANTLR start "entryRuleAndCondition"
    // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:608:1: entryRuleAndCondition returns [EObject current=null] : iv_ruleAndCondition= ruleAndCondition EOF ;
    public final EObject entryRuleAndCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndCondition = null;


        try {
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:609:2: (iv_ruleAndCondition= ruleAndCondition EOF )
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:610:2: iv_ruleAndCondition= ruleAndCondition EOF
            {
             newCompositeNode(grammarAccess.getAndConditionRule()); 
            pushFollow(FOLLOW_ruleAndCondition_in_entryRuleAndCondition1288);
            iv_ruleAndCondition=ruleAndCondition();

            state._fsp--;

             current =iv_ruleAndCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndCondition1298); 

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
    // $ANTLR end "entryRuleAndCondition"


    // $ANTLR start "ruleAndCondition"
    // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:617:1: ruleAndCondition returns [EObject current=null] : ( ( (lv_left_0_0= ruleEquality ) ) otherlv_1= 'and' otherlv_2= '(' ( (lv_right_3_0= ruleCondition ) ) otherlv_4= ')' ) ;
    public final EObject ruleAndCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:620:28: ( ( ( (lv_left_0_0= ruleEquality ) ) otherlv_1= 'and' otherlv_2= '(' ( (lv_right_3_0= ruleCondition ) ) otherlv_4= ')' ) )
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:621:1: ( ( (lv_left_0_0= ruleEquality ) ) otherlv_1= 'and' otherlv_2= '(' ( (lv_right_3_0= ruleCondition ) ) otherlv_4= ')' )
            {
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:621:1: ( ( (lv_left_0_0= ruleEquality ) ) otherlv_1= 'and' otherlv_2= '(' ( (lv_right_3_0= ruleCondition ) ) otherlv_4= ')' )
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:621:2: ( (lv_left_0_0= ruleEquality ) ) otherlv_1= 'and' otherlv_2= '(' ( (lv_right_3_0= ruleCondition ) ) otherlv_4= ')'
            {
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:621:2: ( (lv_left_0_0= ruleEquality ) )
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:622:1: (lv_left_0_0= ruleEquality )
            {
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:622:1: (lv_left_0_0= ruleEquality )
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:623:3: lv_left_0_0= ruleEquality
            {
             
            	        newCompositeNode(grammarAccess.getAndConditionAccess().getLeftEqualityParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleEquality_in_ruleAndCondition1344);
            lv_left_0_0=ruleEquality();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAndConditionRule());
            	        }
                   		set(
                   			current, 
                   			"left",
                    		lv_left_0_0, 
                    		"Equality");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleAndCondition1356); 

                	newLeafNode(otherlv_1, grammarAccess.getAndConditionAccess().getAndKeyword_1());
                
            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleAndCondition1368); 

                	newLeafNode(otherlv_2, grammarAccess.getAndConditionAccess().getLeftParenthesisKeyword_2());
                
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:647:1: ( (lv_right_3_0= ruleCondition ) )
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:648:1: (lv_right_3_0= ruleCondition )
            {
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:648:1: (lv_right_3_0= ruleCondition )
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:649:3: lv_right_3_0= ruleCondition
            {
             
            	        newCompositeNode(grammarAccess.getAndConditionAccess().getRightConditionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleCondition_in_ruleAndCondition1389);
            lv_right_3_0=ruleCondition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAndConditionRule());
            	        }
                   		set(
                   			current, 
                   			"right",
                    		lv_right_3_0, 
                    		"Condition");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleAndCondition1401); 

                	newLeafNode(otherlv_4, grammarAccess.getAndConditionAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleAndCondition"


    // $ANTLR start "entryRuleOrCondition"
    // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:677:1: entryRuleOrCondition returns [EObject current=null] : iv_ruleOrCondition= ruleOrCondition EOF ;
    public final EObject entryRuleOrCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrCondition = null;


        try {
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:678:2: (iv_ruleOrCondition= ruleOrCondition EOF )
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:679:2: iv_ruleOrCondition= ruleOrCondition EOF
            {
             newCompositeNode(grammarAccess.getOrConditionRule()); 
            pushFollow(FOLLOW_ruleOrCondition_in_entryRuleOrCondition1437);
            iv_ruleOrCondition=ruleOrCondition();

            state._fsp--;

             current =iv_ruleOrCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrCondition1447); 

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
    // $ANTLR end "entryRuleOrCondition"


    // $ANTLR start "ruleOrCondition"
    // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:686:1: ruleOrCondition returns [EObject current=null] : ( ( (lv_left_0_0= ruleEquality ) ) otherlv_1= 'or' otherlv_2= '(' ( (lv_right_3_0= ruleCondition ) ) otherlv_4= ')' ) ;
    public final EObject ruleOrCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:689:28: ( ( ( (lv_left_0_0= ruleEquality ) ) otherlv_1= 'or' otherlv_2= '(' ( (lv_right_3_0= ruleCondition ) ) otherlv_4= ')' ) )
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:690:1: ( ( (lv_left_0_0= ruleEquality ) ) otherlv_1= 'or' otherlv_2= '(' ( (lv_right_3_0= ruleCondition ) ) otherlv_4= ')' )
            {
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:690:1: ( ( (lv_left_0_0= ruleEquality ) ) otherlv_1= 'or' otherlv_2= '(' ( (lv_right_3_0= ruleCondition ) ) otherlv_4= ')' )
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:690:2: ( (lv_left_0_0= ruleEquality ) ) otherlv_1= 'or' otherlv_2= '(' ( (lv_right_3_0= ruleCondition ) ) otherlv_4= ')'
            {
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:690:2: ( (lv_left_0_0= ruleEquality ) )
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:691:1: (lv_left_0_0= ruleEquality )
            {
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:691:1: (lv_left_0_0= ruleEquality )
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:692:3: lv_left_0_0= ruleEquality
            {
             
            	        newCompositeNode(grammarAccess.getOrConditionAccess().getLeftEqualityParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleEquality_in_ruleOrCondition1493);
            lv_left_0_0=ruleEquality();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOrConditionRule());
            	        }
                   		set(
                   			current, 
                   			"left",
                    		lv_left_0_0, 
                    		"Equality");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleOrCondition1505); 

                	newLeafNode(otherlv_1, grammarAccess.getOrConditionAccess().getOrKeyword_1());
                
            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleOrCondition1517); 

                	newLeafNode(otherlv_2, grammarAccess.getOrConditionAccess().getLeftParenthesisKeyword_2());
                
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:716:1: ( (lv_right_3_0= ruleCondition ) )
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:717:1: (lv_right_3_0= ruleCondition )
            {
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:717:1: (lv_right_3_0= ruleCondition )
            // ../fr.imta.tp.sql4csv/src-gen/fr/imta/tp/parser/antlr/internal/InternalSql4csv.g:718:3: lv_right_3_0= ruleCondition
            {
             
            	        newCompositeNode(grammarAccess.getOrConditionAccess().getRightConditionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleCondition_in_ruleOrCondition1538);
            lv_right_3_0=ruleCondition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOrConditionRule());
            	        }
                   		set(
                   			current, 
                   			"right",
                    		lv_right_3_0, 
                    		"Condition");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleOrCondition1550); 

                	newLeafNode(otherlv_4, grammarAccess.getOrConditionAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleOrCondition"

    // Delegated rules


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA6_eotS =
        "\13\uffff";
    static final String DFA6_eofS =
        "\4\uffff\2\7\4\uffff\1\7";
    static final String DFA6_minS =
        "\1\4\1\17\2\4\2\13\1\20\1\uffff\1\4\1\uffff\1\13";
    static final String DFA6_maxS =
        "\1\4\1\20\1\5\1\4\2\24\1\20\1\uffff\1\4\1\uffff\1\24";
    static final String DFA6_acceptS =
        "\7\uffff\1\2\1\uffff\1\1\1\uffff";
    static final String DFA6_specialS =
        "\13\uffff}>";
    static final String[] DFA6_transitionS = {
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

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "384:1: (this_BinaryCondition_0= ruleBinaryCondition | this_Equality_1= ruleEquality )";
        }
    }
    static final String DFA8_eotS =
        "\13\uffff";
    static final String DFA8_eofS =
        "\13\uffff";
    static final String DFA8_minS =
        "\1\4\1\17\2\4\1\17\1\21\1\20\1\4\2\uffff\1\21";
    static final String DFA8_maxS =
        "\1\4\1\20\1\5\1\4\2\24\1\20\1\4\2\uffff\1\24";
    static final String DFA8_acceptS =
        "\10\uffff\1\1\1\2\1\uffff";
    static final String DFA8_specialS =
        "\13\uffff}>";
    static final String[] DFA8_transitionS = {
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

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "503:1: (this_AndCondition_0= ruleAndCondition | this_OrCondition_1= ruleOrCondition )";
        }
    }
 

    public static final BitSet FOLLOW_ruleSQL4CSV_in_entryRuleSQL4CSV75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSQL4CSV85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProgram_in_ruleSQL4CSV130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuery_in_ruleProgram220 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleQuery_in_entryRuleQuery256 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuery266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleQuery303 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleColumn_in_ruleQuery324 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_12_in_ruleQuery337 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleColumn_in_ruleQuery358 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_13_in_ruleQuery372 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTable_in_ruleQuery393 = new BitSet(new long[]{0x0000000000005002L});
    public static final BitSet FOLLOW_12_in_ruleQuery406 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTable_in_ruleQuery427 = new BitSet(new long[]{0x0000000000005002L});
    public static final BitSet FOLLOW_14_in_ruleQuery442 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleQuery463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumn_in_entryRuleColumn501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColumn511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleColumn557 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleColumn569 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleColumn588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTable_in_entryRuleTable629 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTable639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTable680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondition730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryCondition_in_ruleCondition777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquality_in_ruleCondition804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquality_in_entryRuleEquality839 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEquality849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumn_in_ruleEquality895 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleEquality907 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleColumnEquality_in_ruleEquality930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueEquality_in_ruleEquality949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryCondition_in_entryRuleBinaryCondition988 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinaryCondition998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndCondition_in_ruleBinaryCondition1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrCondition_in_ruleBinaryCondition1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumnEquality_in_entryRuleColumnEquality1107 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColumnEquality1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumn_in_ruleColumnEquality1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueEquality_in_entryRuleValueEquality1197 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueEquality1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleValueEquality1248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndCondition_in_entryRuleAndCondition1288 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndCondition1298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquality_in_ruleAndCondition1344 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAndCondition1356 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAndCondition1368 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleAndCondition1389 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleAndCondition1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrCondition_in_entryRuleOrCondition1437 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrCondition1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquality_in_ruleOrCondition1493 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleOrCondition1505 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleOrCondition1517 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleOrCondition1538 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleOrCondition1550 = new BitSet(new long[]{0x0000000000000002L});

}