package fr.imta.tp2.calendarDSL.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import fr.imta.tp2.calendarDSL.calendarDSL.Calendar;
import fr.imta.tp2.calendarDSL.calendarDSL.CalendarDSLPackage;
import fr.imta.tp2.calendarDSL.calendarDSL.Date;
import fr.imta.tp2.calendarDSL.calendarDSL.Event;
import fr.imta.tp2.calendarDSL.services.CalendarDSLGrammarAccess;
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
public class CalendarDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private CalendarDSLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == CalendarDSLPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case CalendarDSLPackage.CALENDAR:
				if(context == grammarAccess.getCalendarRule()) {
					sequence_Calendar(context, (Calendar) semanticObject); 
					return; 
				}
				else break;
			case CalendarDSLPackage.DATE:
				if(context == grammarAccess.getDateRule()) {
					sequence_Date(context, (Date) semanticObject); 
					return; 
				}
				else break;
			case CalendarDSLPackage.EVENT:
				if(context == grammarAccess.getEventRule()) {
					sequence_Event(context, (Event) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (events+=Event*)
	 */
	protected void sequence_Calendar(EObject context, Calendar semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (year=YEAR month=MONTH day=DAY)
	 */
	protected void sequence_Date(EObject context, Date semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CalendarDSLPackage.Literals.DATE__YEAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CalendarDSLPackage.Literals.DATE__YEAR));
			if(transientValues.isValueTransient(semanticObject, CalendarDSLPackage.Literals.DATE__MONTH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CalendarDSLPackage.Literals.DATE__MONTH));
			if(transientValues.isValueTransient(semanticObject, CalendarDSLPackage.Literals.DATE__DAY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CalendarDSLPackage.Literals.DATE__DAY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDateAccess().getYearYEARTerminalRuleCall_0_0(), semanticObject.getYear());
		feeder.accept(grammarAccess.getDateAccess().getMonthMONTHTerminalRuleCall_2_0(), semanticObject.getMonth());
		feeder.accept(grammarAccess.getDateAccess().getDayDAYTerminalRuleCall_4_0(), semanticObject.getDay());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING on=Date from=TIME? to=TIME? at=STRING?)
	 */
	protected void sequence_Event(EObject context, Event semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
