/**
 */
package fr.imta.tp2.calendarDSL.calendarDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calendar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.imta.tp2.calendarDSL.calendarDSL.Calendar#getEvents <em>Events</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.imta.tp2.calendarDSL.calendarDSL.CalendarDSLPackage#getCalendar()
 * @model
 * @generated
 */
public interface Calendar extends EObject
{
  /**
   * Returns the value of the '<em><b>Events</b></em>' containment reference list.
   * The list contents are of type {@link fr.imta.tp2.calendarDSL.calendarDSL.Event}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Events</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Events</em>' containment reference list.
   * @see fr.imta.tp2.calendarDSL.calendarDSL.CalendarDSLPackage#getCalendar_Events()
   * @model containment="true"
   * @generated
   */
  EList<Event> getEvents();

} // Calendar
