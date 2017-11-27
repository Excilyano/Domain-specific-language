/*
* generated by Xtext
*/
grammar InternalCalcDSL;

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
import fr.imta.tp.services.CalcDSLGrammarAccess;

}

@parser::members {

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
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleCalcDSL
entryRuleCalcDSL returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getCalcDSLRule()); }
	 iv_ruleCalcDSL=ruleCalcDSL 
	 { $current=$iv_ruleCalcDSL.current; } 
	 EOF 
;

// Rule CalcDSL
ruleCalcDSL returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getCalcDSLAccess().getInstructionsInstructionParserRuleCall_0()); 
	    }
		lv_instructions_0_0=ruleInstruction		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCalcDSLRule());
	        }
       		add(
       			$current, 
       			"instructions",
        		lv_instructions_0_0, 
        		"Instruction");
	        afterParserOrEnumRuleCall();
	    }

)
)*
;





// Entry rule entryRuleInstruction
entryRuleInstruction returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getInstructionRule()); }
	 iv_ruleInstruction=ruleInstruction 
	 { $current=$iv_ruleInstruction.current; } 
	 EOF 
;

// Rule Instruction
ruleInstruction returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getInstructionAccess().getDeclarationParserRuleCall_0()); 
    }
    this_Declaration_0=ruleDeclaration
    { 
        $current = $this_Declaration_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getInstructionAccess().getOperationParserRuleCall_1()); 
    }
    this_Operation_1=ruleOperation
    { 
        $current = $this_Operation_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleDeclaration
entryRuleDeclaration returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDeclarationRule()); }
	 iv_ruleDeclaration=ruleDeclaration 
	 { $current=$iv_ruleDeclaration.current; } 
	 EOF 
;

// Rule Declaration
ruleDeclaration returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getDeclarationAccess().getTypeTypeParserRuleCall_0_0()); 
	    }
		lv_type_0_0=ruleType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDeclarationRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_0_0, 
        		"Type");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getDeclarationAccess().getVariableVariableParserRuleCall_1_0()); 
	    }
		lv_variable_1_0=ruleVariable		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDeclarationRule());
	        }
       		set(
       			$current, 
       			"variable",
        		lv_variable_1_0, 
        		"Variable");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2=';' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getDeclarationAccess().getSemicolonKeyword_2());
    }
)
;





// Entry rule entryRuleType
entryRuleType returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getTypeRule()); } 
	 iv_ruleType=ruleType 
	 { $current=$iv_ruleType.current.getText(); }  
	 EOF 
;

// Rule Type
ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='int' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getTypeAccess().getIntKeyword_0()); 
    }

    |
	kw='float' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getTypeAccess().getFloatKeyword_1()); 
    }

    |
	kw='double' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getTypeAccess().getDoubleKeyword_2()); 
    }
)
    ;





// Entry rule entryRuleOperation
entryRuleOperation returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getOperationRule()); }
	 iv_ruleOperation=ruleOperation 
	 { $current=$iv_ruleOperation.current; } 
	 EOF 
;

// Rule Operation
ruleOperation returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getOperationRule());
	        }
        }
	otherlv_0=RULE_ID
	{
		newLeafNode(otherlv_0, grammarAccess.getOperationAccess().getVariableVariableCrossReference_0_0()); 
	}

)
)	otherlv_1='=' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getOperationAccess().getEqualsSignKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getOperationAccess().getCalculationCalculationParserRuleCall_2_0()); 
	    }
		lv_calculation_2_0=ruleCalculation		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getOperationRule());
	        }
       		set(
       			$current, 
       			"calculation",
        		lv_calculation_2_0, 
        		"Calculation");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleCalculation
entryRuleCalculation returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getCalculationRule()); }
	 iv_ruleCalculation=ruleCalculation 
	 { $current=$iv_ruleCalculation.current; } 
	 EOF 
;

// Rule Calculation
ruleCalculation returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getCalculationAccess().getInitOperandParserRuleCall_0_0()); 
	    }
		lv_init_0_0=ruleOperand		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCalculationRule());
	        }
       		set(
       			$current, 
       			"init",
        		lv_init_0_0, 
        		"Operand");
	        afterParserOrEnumRuleCall();
	    }

)
)(
    { 
        newCompositeNode(grammarAccess.getCalculationAccess().getOperatorParserRuleCall_1_0()); 
    }
ruleOperator
    { 
        afterParserOrEnumRuleCall();
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getCalculationAccess().getVectorsOperandParserRuleCall_1_1_0()); 
	    }
		lv_vectors_2_0=ruleOperand		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCalculationRule());
	        }
       		add(
       			$current, 
       			"vectors",
        		lv_vectors_2_0, 
        		"Operand");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_3=';' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getCalculationAccess().getSemicolonKeyword_2());
    }
)
;





// Entry rule entryRuleOperand
entryRuleOperand returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getOperandRule()); }
	 iv_ruleOperand=ruleOperand 
	 { $current=$iv_ruleOperand.current; } 
	 EOF 
;

// Rule Operand
ruleOperand returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getOperandAccess().getVariableParserRuleCall_0()); 
    }
    this_Variable_0=ruleVariable
    { 
        $current = $this_Variable_0.current; 
        afterParserOrEnumRuleCall();
    }

    |this_DOUBLE_1=RULE_DOUBLE
    { 
    newLeafNode(this_DOUBLE_1, grammarAccess.getOperandAccess().getDOUBLETerminalRuleCall_1()); 
    }

    |this_INT_2=RULE_INT
    { 
    newLeafNode(this_INT_2, grammarAccess.getOperandAccess().getINTTerminalRuleCall_2()); 
    }
)
;





// Entry rule entryRuleOperator
entryRuleOperator returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getOperatorRule()); } 
	 iv_ruleOperator=ruleOperator 
	 { $current=$iv_ruleOperator.current.getText(); }  
	 EOF 
;

// Rule Operator
ruleOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='+' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getOperatorAccess().getPlusSignKeyword_0()); 
    }

    |
	kw='-' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getOperatorAccess().getHyphenMinusKeyword_1()); 
    }

    |
	kw='/' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getOperatorAccess().getSolidusKeyword_2()); 
    }

    |
	kw='*' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getOperatorAccess().getAsteriskKeyword_3()); 
    }

    |
	kw='%' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getOperatorAccess().getPercentSignKeyword_4()); 
    }
)
    ;





// Entry rule entryRuleVariable
entryRuleVariable returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getVariableRule()); }
	 iv_ruleVariable=ruleVariable 
	 { $current=$iv_ruleVariable.current; } 
	 EOF 
;

// Rule Variable
ruleVariable returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_name_0_0=RULE_ID
		{
			newLeafNode(lv_name_0_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getVariableRule());
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





RULE_DOUBLE : '-'? ('0'..'9')+ '.' ('0'..'9')+ (('e'|'E') '-'? ('0'..'9')+)?;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


