/**
 */
package calendardsl.calendarDSL;

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
 *   <li>{@link calendardsl.calendarDSL.Calendar#getEvents <em>Events</em>}</li>
 * </ul>
 * </p>
 *
 * @see calendardsl.calendarDSL.CalendarDSLPackage#getCalendar()
 * @model
 * @generated
 */
public interface Calendar extends EObject {
	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link calendardsl.calendarDSL.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see calendardsl.calendarDSL.CalendarDSLPackage#getCalendar_Events()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getEvents();

} // Calendar
