package fr.imta.tp2.tutorial.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import fr.imta.tp2.tutorial.myTuto.DataType;
import fr.imta.tp2.tutorial.myTuto.Entity;
import fr.imta.tp2.tutorial.myTuto.Feature;
import fr.imta.tp2.tutorial.myTuto.Import;
import fr.imta.tp2.tutorial.myTuto.MyTuto;
import fr.imta.tp2.tutorial.myTuto.MyTutoPackage;
import fr.imta.tp2.tutorial.myTuto.PackageDeclaration;
import fr.imta.tp2.tutorial.services.MyTutoGrammarAccess;
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
public class MyTutoSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyTutoGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == MyTutoPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case MyTutoPackage.DATA_TYPE:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getDataTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_DataType(context, (DataType) semanticObject); 
					return; 
				}
				else break;
			case MyTutoPackage.ENTITY:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getEntityRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_Entity(context, (Entity) semanticObject); 
					return; 
				}
				else break;
			case MyTutoPackage.FEATURE:
				if(context == grammarAccess.getFeatureRule()) {
					sequence_Feature(context, (Feature) semanticObject); 
					return; 
				}
				else break;
			case MyTutoPackage.IMPORT:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getImportRule()) {
					sequence_Import(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case MyTutoPackage.MY_TUTO:
				if(context == grammarAccess.getMyTutoRule()) {
					sequence_MyTuto(context, (MyTuto) semanticObject); 
					return; 
				}
				else break;
			case MyTutoPackage.PACKAGE_DECLARATION:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getPackageDeclarationRule()) {
					sequence_PackageDeclaration(context, (PackageDeclaration) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_DataType(EObject context, DataType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyTutoPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyTutoPackage.Literals.TYPE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID superType=[Entity|QualifiedName]? features+=Feature*)
	 */
	protected void sequence_Entity(EObject context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (many?='many'? name=ID type=[Type|QualifiedName])
	 */
	protected void sequence_Feature(EObject context, Feature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     importedNameSpace=QualifiedNameSpaceWithWildCard
	 */
	protected void sequence_Import(EObject context, Import semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyTutoPackage.Literals.IMPORT__IMPORTED_NAME_SPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyTutoPackage.Literals.IMPORT__IMPORTED_NAME_SPACE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportAccess().getImportedNameSpaceQualifiedNameSpaceWithWildCardParserRuleCall_1_0(), semanticObject.getImportedNameSpace());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     elements+=AbstractElement*
	 */
	protected void sequence_MyTuto(EObject context, MyTuto semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=QualifiedName elements+=AbstractElement*)
	 */
	protected void sequence_PackageDeclaration(EObject context, PackageDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
