package fr.imta.tp.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import fr.imta.tp.services.Sql4csvGrammarAccess;
import fr.imta.tp.sql4csv.AndCondition;
import fr.imta.tp.sql4csv.Column;
import fr.imta.tp.sql4csv.ColumnEquality;
import fr.imta.tp.sql4csv.Equality;
import fr.imta.tp.sql4csv.OrCondition;
import fr.imta.tp.sql4csv.Program;
import fr.imta.tp.sql4csv.Query;
import fr.imta.tp.sql4csv.SQL4CSV;
import fr.imta.tp.sql4csv.Sql4csvPackage;
import fr.imta.tp.sql4csv.Table;
import fr.imta.tp.sql4csv.ValueEquality;
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
public class Sql4csvSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private Sql4csvGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == Sql4csvPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case Sql4csvPackage.AND_CONDITION:
				if(context == grammarAccess.getAndConditionRule() ||
				   context == grammarAccess.getBinaryConditionRule() ||
				   context == grammarAccess.getConditionRule()) {
					sequence_AndCondition(context, (AndCondition) semanticObject); 
					return; 
				}
				else break;
			case Sql4csvPackage.COLUMN:
				if(context == grammarAccess.getColumnRule()) {
					sequence_Column(context, (Column) semanticObject); 
					return; 
				}
				else break;
			case Sql4csvPackage.COLUMN_EQUALITY:
				if(context == grammarAccess.getColumnEqualityRule()) {
					sequence_ColumnEquality(context, (ColumnEquality) semanticObject); 
					return; 
				}
				else break;
			case Sql4csvPackage.EQUALITY:
				if(context == grammarAccess.getConditionRule() ||
				   context == grammarAccess.getEqualityRule()) {
					sequence_Equality(context, (Equality) semanticObject); 
					return; 
				}
				else break;
			case Sql4csvPackage.OR_CONDITION:
				if(context == grammarAccess.getBinaryConditionRule() ||
				   context == grammarAccess.getConditionRule() ||
				   context == grammarAccess.getOrConditionRule()) {
					sequence_OrCondition(context, (OrCondition) semanticObject); 
					return; 
				}
				else break;
			case Sql4csvPackage.PROGRAM:
				if(context == grammarAccess.getProgramRule()) {
					sequence_Program(context, (Program) semanticObject); 
					return; 
				}
				else break;
			case Sql4csvPackage.QUERY:
				if(context == grammarAccess.getQueryRule()) {
					sequence_Query(context, (Query) semanticObject); 
					return; 
				}
				else break;
			case Sql4csvPackage.SQL4CSV:
				if(context == grammarAccess.getSQL4CSVRule()) {
					sequence_SQL4CSV(context, (SQL4CSV) semanticObject); 
					return; 
				}
				else break;
			case Sql4csvPackage.TABLE:
				if(context == grammarAccess.getTableRule()) {
					sequence_Table(context, (Table) semanticObject); 
					return; 
				}
				else break;
			case Sql4csvPackage.VALUE_EQUALITY:
				if(context == grammarAccess.getValueEqualityRule()) {
					sequence_ValueEquality(context, (ValueEquality) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (left=Equality right=Condition)
	 */
	protected void sequence_AndCondition(EObject context, AndCondition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Sql4csvPackage.Literals.BINARY_CONDITION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Sql4csvPackage.Literals.BINARY_CONDITION__LEFT));
			if(transientValues.isValueTransient(semanticObject, Sql4csvPackage.Literals.BINARY_CONDITION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Sql4csvPackage.Literals.BINARY_CONDITION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAndConditionAccess().getLeftEqualityParserRuleCall_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAndConditionAccess().getRightConditionParserRuleCall_3_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     right=Column
	 */
	protected void sequence_ColumnEquality(EObject context, ColumnEquality semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Sql4csvPackage.Literals.COLUMN_EQUALITY__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Sql4csvPackage.Literals.COLUMN_EQUALITY__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getColumnEqualityAccess().getRightColumnParserRuleCall_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (table=[Table|ID]? name=ID)
	 */
	protected void sequence_Column(EObject context, Column semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Column (right=ColumnEquality | right=ValueEquality))
	 */
	protected void sequence_Equality(EObject context, Equality semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Equality right=Condition)
	 */
	protected void sequence_OrCondition(EObject context, OrCondition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Sql4csvPackage.Literals.BINARY_CONDITION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Sql4csvPackage.Literals.BINARY_CONDITION__LEFT));
			if(transientValues.isValueTransient(semanticObject, Sql4csvPackage.Literals.BINARY_CONDITION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Sql4csvPackage.Literals.BINARY_CONDITION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOrConditionAccess().getLeftEqualityParserRuleCall_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getOrConditionAccess().getRightConditionParserRuleCall_3_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     queries+=Query*
	 */
	protected void sequence_Program(EObject context, Program semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (column=Column columns+=Column* table=Table tables+=Table* conditions=Condition?)
	 */
	protected void sequence_Query(EObject context, Query semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     program=Program
	 */
	protected void sequence_SQL4CSV(EObject context, SQL4CSV semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Sql4csvPackage.Literals.SQL4CSV__PROGRAM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Sql4csvPackage.Literals.SQL4CSV__PROGRAM));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSQL4CSVAccess().getProgramProgramParserRuleCall_0(), semanticObject.getProgram());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Table(EObject context, Table semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Sql4csvPackage.Literals.TABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Sql4csvPackage.Literals.TABLE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTableAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     right=STRING
	 */
	protected void sequence_ValueEquality(EObject context, ValueEquality semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Sql4csvPackage.Literals.VALUE_EQUALITY__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Sql4csvPackage.Literals.VALUE_EQUALITY__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getValueEqualityAccess().getRightSTRINGTerminalRuleCall_0(), semanticObject.getRight());
		feeder.finish();
	}
}
