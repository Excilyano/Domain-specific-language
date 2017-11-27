/**
 */
package fr.imta.tp2.calendarDSL.calendarDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.imta.tp2.calendarDSL.calendarDSL.Date#getYear <em>Year</em>}</li>
 *   <li>{@link fr.imta.tp2.calendarDSL.calendarDSL.Date#getMonth <em>Month</em>}</li>
 *   <li>{@link fr.imta.tp2.calendarDSL.calendarDSL.Date#getDay <em>Day</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.imta.tp2.calendarDSL.calendarDSL.CalendarDSLPackage#getDate()
 * @model
 * @generated
 */
public interface Date extends EObject
{
  /**
   * Returns the value of the '<em><b>Year</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Year</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Year</em>' attribute.
   * @see #setYear(String)
   * @see fr.imta.tp2.calendarDSL.calendarDSL.CalendarDSLPackage#getDate_Year()
   * @model
   * @generated
   */
  String getYear();

  /**
   * Sets the value of the '{@link fr.imta.tp2.calendarDSL.calendarDSL.Date#getYear <em>Year</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Year</em>' attribute.
   * @see #getYear()
   * @generated
   */
  void setYear(String value);

  /**
   * Returns the value of the '<em><b>Month</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Month</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Month</em>' attribute.
   * @see #setMonth(String)
   * @see fr.imta.tp2.calendarDSL.calendarDSL.CalendarDSLPackage#getDate_Month()
   * @model
   * @generated
   */
  String getMonth();

  /**
   * Sets the value of the '{@link fr.imta.tp2.calendarDSL.calendarDSL.Date#getMonth <em>Month</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Month</em>' attribute.
   * @see #getMonth()
   * @generated
   */
  void setMonth(String value);

  /**
   * Returns the value of the '<em><b>Day</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Day</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Day</em>' attribute.
   * @see #setDay(String)
   * @see fr.imta.tp2.calendarDSL.calendarDSL.CalendarDSLPackage#getDate_Day()
   * @model
   * @generated
   */
  String getDay();

  /**
   * Sets the value of the '{@link fr.imta.tp2.calendarDSL.calendarDSL.Date#getDay <em>Day</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Day</em>' attribute.
   * @see #getDay()
   * @generated
   */
  void setDay(String value);

} // Date
