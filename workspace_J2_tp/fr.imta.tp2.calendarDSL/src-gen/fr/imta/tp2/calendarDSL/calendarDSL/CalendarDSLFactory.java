/**
 */
package fr.imta.tp2.calendarDSL.calendarDSL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.imta.tp2.calendarDSL.calendarDSL.CalendarDSLPackage
 * @generated
 */
public interface CalendarDSLFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CalendarDSLFactory eINSTANCE = fr.imta.tp2.calendarDSL.calendarDSL.impl.CalendarDSLFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Calendar</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Calendar</em>'.
   * @generated
   */
  Calendar createCalendar();

  /**
   * Returns a new object of class '<em>Event</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Event</em>'.
   * @generated
   */
  Event createEvent();

  /**
   * Returns a new object of class '<em>Date</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Date</em>'.
   * @generated
   */
  Date createDate();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  CalendarDSLPackage getCalendarDSLPackage();

} //CalendarDSLFactory
