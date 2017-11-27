package fr.imta.tp2.statDSL.serializer;

import com.google.inject.Inject;
import fr.imta.tp2.statDSL.services.StatDSLGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class StatDSLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected StatDSLGrammarAccess grammarAccess;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (StatDSLGrammarAccess) access;
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getInstructionsRule())
			return getInstructionsToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getKeywordRule())
			return getKeywordToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * Instructions:
	 * 	(
	 * 		(Mod) &
	 * 		(Eff)
	 * 	)
	 * ;
	 */
	protected String getInstructionsToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * Keyword:
	 * 	'moyenne' | 'variance' | 'ecart-type' | 'mode'
	 * ;
	 */
	protected String getKeywordToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "moyenne";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

}
