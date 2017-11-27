package fr.imta.tp.serializer;

import com.google.inject.Inject;
import fr.imta.tp.services.CalcDSLGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class CalcDSLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected CalcDSLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Operand_DOUBLETerminalRuleCall_1_or_INTTerminalRuleCall_2;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (CalcDSLGrammarAccess) access;
		match_Operand_DOUBLETerminalRuleCall_1_or_INTTerminalRuleCall_2 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getOperandAccess().getDOUBLETerminalRuleCall_1()), new TokenAlias(false, false, grammarAccess.getOperandAccess().getINTTerminalRuleCall_2()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getDOUBLERule())
			return getDOUBLEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getINTRule())
			return getINTToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getOperatorRule())
			return getOperatorToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal DOUBLE :
	 * 	'-'? ('0'..'9')+ '.' ('0'..'9')+ (('e'|'E') ('-')? ('0'..'9')+)?
	 * ;
	 */
	protected String getDOUBLEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ".";
	}
	
	/**
	 * terminal INT returns ecore::EInt: ('0'..'9')+;
	 */
	protected String getINTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * Operator:
	 * 	'+' | '-' | '/' | '*' | '%'
	 * ;
	 */
	protected String getOperatorToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "+";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Operand_DOUBLETerminalRuleCall_1_or_INTTerminalRuleCall_2.equals(syntax))
				emit_Operand_DOUBLETerminalRuleCall_1_or_INTTerminalRuleCall_2(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     DOUBLE | INT
	 */
	protected void emit_Operand_DOUBLETerminalRuleCall_1_or_INTTerminalRuleCall_2(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
