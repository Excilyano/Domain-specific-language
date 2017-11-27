package fr.imta.tp.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import fr.imta.tp.calcDSL.CalcDSL;
import fr.imta.tp.calcDSL.CalcDSLPackage;
import fr.imta.tp.calcDSL.Calculation;
import fr.imta.tp.calcDSL.Declaration;
import fr.imta.tp.calcDSL.Operation;
import fr.imta.tp.calcDSL.Variable;
import fr.imta.tp.services.CalcDSLGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class CalcDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private CalcDSLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == CalcDSLPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case CalcDSLPackage.CALC_DSL:
				if(context == grammarAccess.getCalcDSLRule()) {
					sequence_CalcDSL(context, (CalcDSL) semanticObject); 
					return; 
				}
				else break;
			case CalcDSLPackage.CALCULATION:
				if(context == grammarAccess.getCalculationRule()) {
					sequence_Calculation(context, (Calculation) semanticObject); 
					return; 
				}
				else break;
			case CalcDSLPackage.DECLARATION:
				if(context == grammarAccess.getDeclarationRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_Declaration(context, (Declaration) semanticObject); 
					return; 
				}
				else break;
			case CalcDSLPackage.OPERATION:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getOperationRule()) {
					sequence_Operation(context, (Operation) semanticObject); 
					return; 
				}
				else break;
			case CalcDSLPackage.VARIABLE:
				if(context == grammarAccess.getOperandRule() ||
				   context == grammarAccess.getVariableRule()) {
					sequence_Variable(context, (Variable) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     instructions+=Instruction*
	 */
	protected void sequence_CalcDSL(EObject context, CalcDSL semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (init=Operand vectors+=Operand*)
	 */
	protected void sequence_Calculation(EObject context, Calculation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=Type variable=Variable)
	 */
	protected void sequence_Declaration(EObject context, Declaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CalcDSLPackage.Literals.DECLARATION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CalcDSLPackage.Literals.DECLARATION__TYPE));
			if(transientValues.isValueTransient(semanticObject, CalcDSLPackage.Literals.DECLARATION__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CalcDSLPackage.Literals.DECLARATION__VARIABLE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDeclarationAccess().getTypeTypeParserRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getDeclarationAccess().getVariableVariableParserRuleCall_1_0(), semanticObject.getVariable());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (variable=[Variable|ID] calculation=Calculation)
	 */
	protected void sequence_Operation(EObject context, Operation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CalcDSLPackage.Literals.OPERATION__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CalcDSLPackage.Literals.OPERATION__VARIABLE));
			if(transientValues.isValueTransient(semanticObject, CalcDSLPackage.Literals.OPERATION__CALCULATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CalcDSLPackage.Literals.OPERATION__CALCULATION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOperationAccess().getVariableVariableIDTerminalRuleCall_0_0_1(), semanticObject.getVariable());
		feeder.accept(grammarAccess.getOperationAccess().getCalculationCalculationParserRuleCall_2_0(), semanticObject.getCalculation());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Variable(EObject context, Variable semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CalcDSLPackage.Literals.VARIABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CalcDSLPackage.Literals.VARIABLE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
}
