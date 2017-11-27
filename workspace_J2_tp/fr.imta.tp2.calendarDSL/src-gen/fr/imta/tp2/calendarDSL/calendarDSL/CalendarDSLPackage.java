/**
 */
package fr.imta.tp2.calendarDSL.calendarDSL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.imta.tp2.calendarDSL.calendarDSL.CalendarDSLFactory
 * @model kind="package"
 * @generated
 */
public interface CalendarDSLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "calendarDSL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.imta.fr/tp2/calendarDSL/CalendarDSL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "calendarDSL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CalendarDSLPackage eINSTANCE = fr.imta.tp2.calendarDSL.calendarDSL.impl.CalendarDSLPackageImpl.init();

  /**
   * The meta object id for the '{@link fr.imta.tp2.calendarDSL.calendarDSL.impl.CalendarImpl <em>Calendar</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imta.tp2.calendarDSL.calendarDSL.impl.CalendarImpl
   * @see fr.imta.tp2.calendarDSL.calendarDSL.impl.CalendarDSLPackageImpl#getCalendar()
   * @generated
   */
  int CALENDAR = 0;

  /**
   * The feature id for the '<em><b>Events</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALENDAR__EVENTS = 0;

  /**
   * The number of structural features of the '<em>Calendar</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALENDAR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.imta.tp2.calendarDSL.calendarDSL.impl.EventImpl <em>Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imta.tp2.calendarDSL.calendarDSL.impl.EventImpl
   * @see fr.imta.tp2.calendarDSL.calendarDSL.impl.CalendarDSLPackageImpl#getEvent()
   * @generated
   */
  int EVENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__NAME = 0;

  /**
   * The feature id for the '<em><b>On</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__ON = 1;

  /**
   * The feature id for the '<em><b>From</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__FROM = 2;

  /**
   * The feature id for the '<em><b>To</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__TO = 3;

  /**
   * The feature id for the '<em><b>At</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__AT = 4;

  /**
   * The number of structural features of the '<em>Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link fr.imta.tp2.calendarDSL.calendarDSL.impl.DateImpl <em>Date</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imta.tp2.calendarDSL.calendarDSL.impl.DateImpl
   * @see fr.imta.tp2.calendarDSL.calendarDSL.impl.CalendarDSLPackageImpl#getDate()
   * @generated
   */
  int DATE = 2;

  /**
   * The feature id for the '<em><b>Year</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE__YEAR = 0;

  /**
   * The feature id for the '<em><b>Month</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE__MONTH = 1;

  /**
   * The feature id for the '<em><b>Day</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE__DAY = 2;

  /**
   * The number of structural features of the '<em>Date</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link fr.imta.tp2.calendarDSL.calendarDSL.Calendar <em>Calendar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Calendar</em>'.
   * @see fr.imta.tp2.calendarDSL.calendarDSL.Calendar
   * @generated
   */
  EClass getCalendar();

  /**
   * Returns the meta object for the containment reference list '{@link fr.imta.tp2.calendarDSL.calendarDSL.Calendar#getEvents <em>Events</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Events</em>'.
   * @see fr.imta.tp2.calendarDSL.calendarDSL.Calendar#getEvents()
   * @see #getCalendar()
   * @generated
   */
  EReference getCalendar_Events();

  /**
   * Returns the meta object for class '{@link fr.imta.tp2.calendarDSL.calendarDSL.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event</em>'.
   * @see fr.imta.tp2.calendarDSL.calendarDSL.Event
   * @generated
   */
  EClass getEvent();

  /**
   * Returns the meta object for the attribute '{@link fr.imta.tp2.calendarDSL.calendarDSL.Event#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.imta.tp2.calendarDSL.calendarDSL.Event#getName()
   * @see #getEvent()
   * @generated
   */
  EAttribute getEvent_Name();

  /**
   * Returns the meta object for the containment reference '{@link fr.imta.tp2.calendarDSL.calendarDSL.Event#getOn <em>On</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>On</em>'.
   * @see fr.imta.tp2.calendarDSL.calendarDSL.Event#getOn()
   * @see #getEvent()
   * @generated
   */
  EReference getEvent_On();

  /**
   * Returns the meta object for the attribute '{@link fr.imta.tp2.calendarDSL.calendarDSL.Event#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>From</em>'.
   * @see fr.imta.tp2.calendarDSL.calendarDSL.Event#getFrom()
   * @see #getEvent()
   * @generated
   */
  EAttribute getEvent_From();

  /**
   * Returns the meta object for the attribute '{@link fr.imta.tp2.calendarDSL.calendarDSL.Event#getTo <em>To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>To</em>'.
   * @see fr.imta.tp2.calendarDSL.calendarDSL.Event#getTo()
   * @see #getEvent()
   * @generated
   */
  EAttribute getEvent_To();

  /**
   * Returns the meta object for the attribute '{@link fr.imta.tp2.calendarDSL.calendarDSL.Event#getAt <em>At</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>At</em>'.
   * @see fr.imta.tp2.calendarDSL.calendarDSL.Event#getAt()
   * @see #getEvent()
   * @generated
   */
  EAttribute getEvent_At();

  /**
   * Returns the meta object for class '{@link fr.imta.tp2.calendarDSL.calendarDSL.Date <em>Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Date</em>'.
   * @see fr.imta.tp2.calendarDSL.calendarDSL.Date
   * @generated
   */
  EClass getDate();

  /**
   * Returns the meta object for the attribute '{@link fr.imta.tp2.calendarDSL.calendarDSL.Date#getYear <em>Year</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Year</em>'.
   * @see fr.imta.tp2.calendarDSL.calendarDSL.Date#getYear()
   * @see #getDate()
   * @generated
   */
  EAttribute getDate_Year();

  /**
   * Returns the meta object for the attribute '{@link fr.imta.tp2.calendarDSL.calendarDSL.Date#getMonth <em>Month</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Month</em>'.
   * @see fr.imta.tp2.calendarDSL.calendarDSL.Date#getMonth()
   * @see #getDate()
   * @generated
   */
  EAttribute getDate_Month();

  /**
   * Returns the meta object for the attribute '{@link fr.imta.tp2.calendarDSL.calendarDSL.Date#getDay <em>Day</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Day</em>'.
   * @see fr.imta.tp2.calendarDSL.calendarDSL.Date#getDay()
   * @see #getDate()
   * @generated
   */
  EAttribute getDate_Day();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  CalendarDSLFactory getCalendarDSLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link fr.imta.tp2.calendarDSL.calendarDSL.impl.CalendarImpl <em>Calendar</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imta.tp2.calendarDSL.calendarDSL.impl.CalendarImpl
     * @see fr.imta.tp2.calendarDSL.calendarDSL.impl.CalendarDSLPackageImpl#getCalendar()
     * @generated
     */
    EClass CALENDAR = eINSTANCE.getCalendar();

    /**
     * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CALENDAR__EVENTS = eINSTANCE.getCalendar_Events();

    /**
     * The meta object literal for the '{@link fr.imta.tp2.calendarDSL.calendarDSL.impl.EventImpl <em>Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imta.tp2.calendarDSL.calendarDSL.impl.EventImpl
     * @see fr.imta.tp2.calendarDSL.calendarDSL.impl.CalendarDSLPackageImpl#getEvent()
     * @generated
     */
    EClass EVENT = eINSTANCE.getEvent();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT__NAME = eINSTANCE.getEvent_Name();

    /**
     * The meta object literal for the '<em><b>On</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT__ON = eINSTANCE.getEvent_On();

    /**
     * The meta object literal for the '<em><b>From</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT__FROM = eINSTANCE.getEvent_From();

    /**
     * The meta object literal for the '<em><b>To</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT__TO = eINSTANCE.getEvent_To();

    /**
     * The meta object literal for the '<em><b>At</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT__AT = eINSTANCE.getEvent_At();

    /**
     * The meta object literal for the '{@link fr.imta.tp2.calendarDSL.calendarDSL.impl.DateImpl <em>Date</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imta.tp2.calendarDSL.calendarDSL.impl.DateImpl
     * @see fr.imta.tp2.calendarDSL.calendarDSL.impl.CalendarDSLPackageImpl#getDate()
     * @generated
     */
    EClass DATE = eINSTANCE.getDate();

    /**
     * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATE__YEAR = eINSTANCE.getDate_Year();

    /**
     * The meta object literal for the '<em><b>Month</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATE__MONTH = eINSTANCE.getDate_Month();

    /**
     * The meta object literal for the '<em><b>Day</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATE__DAY = eINSTANCE.getDate_Day();

  }

} //CalendarDSLPackage
