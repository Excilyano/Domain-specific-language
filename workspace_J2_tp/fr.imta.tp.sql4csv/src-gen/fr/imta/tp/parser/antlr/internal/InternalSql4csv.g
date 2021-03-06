/*
* generated by Xtext
*/
grammar InternalSql4csv;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package fr.imta.tp.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleSQL4CSV
entryRuleSQL4CSV returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSQL4CSVRule()); }
	 iv_ruleSQL4CSV=ruleSQL4CSV 
	 { $current=$iv_ruleSQL4CSV.current; } 
	 EOF 
;

// Rule SQL4CSV
ruleSQL4CSV returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getSQL4CSVAccess().getProgramProgramParserRuleCall_0()); 
	    }
		lv_program_0_0=ruleProgram		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSQL4CSVRule());
	        }
       		set(
       			$current, 
       			"program",
        		lv_program_0_0, 
        		"Program");
	        afterParserOrEnumRuleCall();
	    }

)
)
;





// Entry rule entryRuleProgram
entryRuleProgram returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getProgramRule()); }
	 iv_ruleProgram=ruleProgram 
	 { $current=$iv_ruleProgram.current; } 
	 EOF 
;

// Rule Program
ruleProgram returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getProgramAccess().getQueriesQueryParserRuleCall_0()); 
	    }
		lv_queries_0_0=ruleQuery		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getProgramRule());
	        }
       		add(
       			$current, 
       			"queries",
        		lv_queries_0_0, 
        		"Query");
	        afterParserOrEnumRuleCall();
	    }

)
)*
;





// Entry rule entryRuleQuery
entryRuleQuery returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getQueryRule()); }
	 iv_ruleQuery=ruleQuery 
	 { $current=$iv_ruleQuery.current; } 
	 EOF 
;

// Rule Query
ruleQuery returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='select' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getQueryAccess().getSelectKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getQueryAccess().getColumnColumnParserRuleCall_1_0()); 
	    }
		lv_column_1_0=ruleColumn		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getQueryRule());
	        }
       		set(
       			$current, 
       			"column",
        		lv_column_1_0, 
        		"Column");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_2=',' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getQueryAccess().getCommaKeyword_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getQueryAccess().getColumnsColumnParserRuleCall_2_1_0()); 
	    }
		lv_columns_3_0=ruleColumn		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getQueryRule());
	        }
       		add(
       			$current, 
       			"columns",
        		lv_columns_3_0, 
        		"Column");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_4='from' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getQueryAccess().getFromKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getQueryAccess().getTableTableParserRuleCall_4_0()); 
	    }
		lv_table_5_0=ruleTable		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getQueryRule());
	        }
       		set(
       			$current, 
       			"table",
        		lv_table_5_0, 
        		"Table");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_6=',' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getQueryAccess().getCommaKeyword_5_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getQueryAccess().getTablesTableParserRuleCall_5_1_0()); 
	    }
		lv_tables_7_0=ruleTable		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getQueryRule());
	        }
       		add(
       			$current, 
       			"tables",
        		lv_tables_7_0, 
        		"Table");
	        afterParserOrEnumRuleCall();
	    }

)
))*(	otherlv_8='where' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getQueryAccess().getWhereKeyword_6_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getQueryAccess().getConditionsConditionParserRuleCall_6_1_0()); 
	    }
		lv_conditions_9_0=ruleCondition		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getQueryRule());
	        }
       		set(
       			$current, 
       			"conditions",
        		lv_conditions_9_0, 
        		"Condition");
	        afterParserOrEnumRuleCall();
	    }

)
))?)
;





// Entry rule entryRuleColumn
entryRuleColumn returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getColumnRule()); }
	 iv_ruleColumn=ruleColumn 
	 { $current=$iv_ruleColumn.current; } 
	 EOF 
;

// Rule Column
ruleColumn returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(((
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getColumnRule());
	        }
        }
	otherlv_0=RULE_ID
	{
		newLeafNode(otherlv_0, grammarAccess.getColumnAccess().getTableTableCrossReference_0_0_0()); 
	}

)
)	otherlv_1='.' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getColumnAccess().getFullStopKeyword_0_1());
    }
)?(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getColumnAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getColumnRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"ID");
	    }

)
))
;





// Entry rule entryRuleTable
entryRuleTable returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTableRule()); }
	 iv_ruleTable=ruleTable 
	 { $current=$iv_ruleTable.current; } 
	 EOF 
;

// Rule Table
ruleTable returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_name_0_0=RULE_ID
		{
			newLeafNode(lv_name_0_0, grammarAccess.getTableAccess().getNameIDTerminalRuleCall_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTableRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"ID");
	    }

)
)
;





// Entry rule entryRuleCondition
entryRuleCondition returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getConditionRule()); }
	 iv_ruleCondition=ruleCondition 
	 { $current=$iv_ruleCondition.current; } 
	 EOF 
;

// Rule Condition
ruleCondition returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getConditionAccess().getBinaryConditionParserRuleCall_0()); 
    }
    this_BinaryCondition_0=ruleBinaryCondition
    { 
        $current = $this_BinaryCondition_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getConditionAccess().getEqualityParserRuleCall_1()); 
    }
    this_Equality_1=ruleEquality
    { 
        $current = $this_Equality_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleEquality
entryRuleEquality returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEqualityRule()); }
	 iv_ruleEquality=ruleEquality 
	 { $current=$iv_ruleEquality.current; } 
	 EOF 
;

// Rule Equality
ruleEquality returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getEqualityAccess().getLeftColumnParserRuleCall_0_0()); 
	    }
		lv_left_0_0=ruleColumn		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEqualityRule());
	        }
       		set(
       			$current, 
       			"left",
        		lv_left_0_0, 
        		"Column");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_1='=' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getEqualityAccess().getEqualsSignKeyword_1());
    }
(
(
(
		{ 
	        newCompositeNode(grammarAccess.getEqualityAccess().getRightColumnEqualityParserRuleCall_2_0_0()); 
	    }
		lv_right_2_1=ruleColumnEquality		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEqualityRule());
	        }
       		set(
       			$current, 
       			"right",
        		lv_right_2_1, 
        		"ColumnEquality");
	        afterParserOrEnumRuleCall();
	    }

    |		{ 
	        newCompositeNode(grammarAccess.getEqualityAccess().getRightValueEqualityParserRuleCall_2_0_1()); 
	    }
		lv_right_2_2=ruleValueEquality		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEqualityRule());
	        }
       		set(
       			$current, 
       			"right",
        		lv_right_2_2, 
        		"ValueEquality");
	        afterParserOrEnumRuleCall();
	    }

)

)
))
;





// Entry rule entryRuleBinaryCondition
entryRuleBinaryCondition returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getBinaryConditionRule()); }
	 iv_ruleBinaryCondition=ruleBinaryCondition 
	 { $current=$iv_ruleBinaryCondition.current; } 
	 EOF 
;

// Rule BinaryCondition
ruleBinaryCondition returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getBinaryConditionAccess().getAndConditionParserRuleCall_0()); 
    }
    this_AndCondition_0=ruleAndCondition
    { 
        $current = $this_AndCondition_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getBinaryConditionAccess().getOrConditionParserRuleCall_1()); 
    }
    this_OrCondition_1=ruleOrCondition
    { 
        $current = $this_OrCondition_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleColumnEquality
entryRuleColumnEquality returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getColumnEqualityRule()); }
	 iv_ruleColumnEquality=ruleColumnEquality 
	 { $current=$iv_ruleColumnEquality.current; } 
	 EOF 
;

// Rule ColumnEquality
ruleColumnEquality returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getColumnEqualityAccess().getRightColumnParserRuleCall_0()); 
	    }
		lv_right_0_0=ruleColumn		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getColumnEqualityRule());
	        }
       		set(
       			$current, 
       			"right",
        		lv_right_0_0, 
        		"Column");
	        afterParserOrEnumRuleCall();
	    }

)
)
;





// Entry rule entryRuleValueEquality
entryRuleValueEquality returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getValueEqualityRule()); }
	 iv_ruleValueEquality=ruleValueEquality 
	 { $current=$iv_ruleValueEquality.current; } 
	 EOF 
;

// Rule ValueEquality
ruleValueEquality returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_right_0_0=RULE_STRING
		{
			newLeafNode(lv_right_0_0, grammarAccess.getValueEqualityAccess().getRightSTRINGTerminalRuleCall_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getValueEqualityRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"right",
        		lv_right_0_0, 
        		"STRING");
	    }

)
)
;





// Entry rule entryRuleAndCondition
entryRuleAndCondition returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAndConditionRule()); }
	 iv_ruleAndCondition=ruleAndCondition 
	 { $current=$iv_ruleAndCondition.current; } 
	 EOF 
;

// Rule AndCondition
ruleAndCondition returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getAndConditionAccess().getLeftEqualityParserRuleCall_0_0()); 
	    }
		lv_left_0_0=ruleEquality		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAndConditionRule());
	        }
       		set(
       			$current, 
       			"left",
        		lv_left_0_0, 
        		"Equality");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_1='and' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getAndConditionAccess().getAndKeyword_1());
    }
	otherlv_2='(' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getAndConditionAccess().getLeftParenthesisKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAndConditionAccess().getRightConditionParserRuleCall_3_0()); 
	    }
		lv_right_3_0=ruleCondition		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAndConditionRule());
	        }
       		set(
       			$current, 
       			"right",
        		lv_right_3_0, 
        		"Condition");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_4=')' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getAndConditionAccess().getRightParenthesisKeyword_4());
    }
)
;





// Entry rule entryRuleOrCondition
entryRuleOrCondition returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getOrConditionRule()); }
	 iv_ruleOrCondition=ruleOrCondition 
	 { $current=$iv_ruleOrCondition.current; } 
	 EOF 
;

// Rule OrCondition
ruleOrCondition returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getOrConditionAccess().getLeftEqualityParserRuleCall_0_0()); 
	    }
		lv_left_0_0=ruleEquality		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getOrConditionRule());
	        }
       		set(
       			$current, 
       			"left",
        		lv_left_0_0, 
        		"Equality");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_1='or' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getOrConditionAccess().getOrKeyword_1());
    }
	otherlv_2='(' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getOrConditionAccess().getLeftParenthesisKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getOrConditionAccess().getRightConditionParserRuleCall_3_0()); 
	    }
		lv_right_3_0=ruleCondition		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getOrConditionRule());
	        }
       		set(
       			$current, 
       			"right",
        		lv_right_3_0, 
        		"Condition");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_4=')' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getOrConditionAccess().getRightParenthesisKeyword_4());
    }
)
;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


