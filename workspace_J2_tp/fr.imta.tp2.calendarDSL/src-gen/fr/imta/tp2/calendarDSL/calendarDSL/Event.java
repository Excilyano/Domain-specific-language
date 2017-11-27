/**
 */
package fr.imta.tp2.calendarDSL.calendarDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.imta.tp2.calendarDSL.calendarDSL.Event#getName <em>Name</em>}</li>
 *   <li>{@link fr.imta.tp2.calendarDSL.calendarDSL.Event#getOn <em>On</em>}</li>
 *   <li>{@link fr.imta.tp2.calendarDSL.calendarDSL.Event#getFrom <em>From</em>}</li>
 *   <li>{@link fr.imta.tp2.calendarDSL.calendarDSL.Event#getTo <em>To</em>}</li>
 *   <li>{@link fr.imta.tp2.calendarDSL.calendarDSL.Event#getAt <em>At</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.imta.tp2.calendarDSL.calendarDSL.CalendarDSLPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see fr.imta.tp2.calendarDSL.calendarDSL.CalendarDSLPackage#getEvent_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.imta.tp2.calendarDSL.calendarDSL.Event#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>On</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>On</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>On</em>' containment reference.
   * @see #setOn(Date)
   * @see fr.imta.tp2.calendarDSL.calendarDSL.CalendarDSLPackage#getEvent_On()
   * @model containment="true"
   * @generated
   */
  Date getOn();

  /**
   * Sets the value of the '{@link fr.imta.tp2.calendarDSL.calendarDSL.Event#getOn <em>On</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>On</em>' containment reference.
   * @see #getOn()
   * @generated
   */
  void setOn(Date value);

  /**
   * Returns the value of the '<em><b>From</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From</em>' attribute.
   * @see #setFrom(String)
   * @see fr.imta.tp2.calendarDSL.calendarDSL.CalendarDSLPackage#getEvent_From()
   * @model
   * @generated
   */
  String getFrom();

  /**
   * Sets the value of the '{@link fr.imta.tp2.calendarDSL.calendarDSL.Event#getFrom <em>From</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' attribute.
   * @see #getFrom()
   * @generated
   */
  void setFrom(String value);

  /**
   * Returns the value of the '<em><b>To</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To</em>' attribute.
   * @see #setTo(String)
   * @see fr.imta.tp2.calendarDSL.calendarDSL.CalendarDSLPackage#getEvent_To()
   * @model
   * @generated
   */
  String getTo();

  /**
   * Sets the value of the '{@link fr.imta.tp2.calendarDSL.calendarDSL.Event#getTo <em>To</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To</em>' attribute.
   * @see #getTo()
   * @generated
   */
  void setTo(String value);

  /**
   * Returns the value of the '<em><b>At</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>At</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>At</em>' attribute.
   * @see #setAt(String)
   * @see fr.imta.tp2.calendarDSL.calendarDSL.CalendarDSLPackage#getEvent_At()
   * @model
   * @generated
   */
  String getAt();

  /**
   * Sets the value of the '{@link fr.imta.tp2.calendarDSL.calendarDSL.Event#getAt <em>At</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>At</em>' attribute.
   * @see #getAt()
   * @generated
   */
  void setAt(String value);

} // Event
