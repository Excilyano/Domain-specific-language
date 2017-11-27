/**
 */
package fr.imta.tp2.calendarDSL.calendarDSL.impl;

import fr.imta.tp2.calendarDSL.calendarDSL.CalendarDSLPackage;
import fr.imta.tp2.calendarDSL.calendarDSL.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Date</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.imta.tp2.calendarDSL.calendarDSL.impl.DateImpl#getYear <em>Year</em>}</li>
 *   <li>{@link fr.imta.tp2.calendarDSL.calendarDSL.impl.DateImpl#getMonth <em>Month</em>}</li>
 *   <li>{@link fr.imta.tp2.calendarDSL.calendarDSL.impl.DateImpl#getDay <em>Day</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DateImpl extends MinimalEObjectImpl.Container implements Date
{
  /**
   * The default value of the '{@link #getYear() <em>Year</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYear()
   * @generated
   * @ordered
   */
  protected static final String YEAR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getYear() <em>Year</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYear()
   * @generated
   * @ordered
   */
  protected String year = YEAR_EDEFAULT;

  /**
   * The default value of the '{@link #getMonth() <em>Month</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMonth()
   * @generated
   * @ordered
   */
  protected static final String MONTH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMonth() <em>Month</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMonth()
   * @generated
   * @ordered
   */
  protected String month = MONTH_EDEFAULT;

  /**
   * The default value of the '{@link #getDay() <em>Day</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDay()
   * @generated
   * @ordered
   */
  protected static final String DAY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDay() <em>Day</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDay()
   * @generated
   * @ordered
   */
  protected String day = DAY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DateImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return CalendarDSLPackage.Literals.DATE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getYear()
  {
    return year;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setYear(String newYear)
  {
    String oldYear = year;
    year = newYear;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CalendarDSLPackage.DATE__YEAR, oldYear, year));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMonth()
  {
    return month;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMonth(String newMonth)
  {
    String oldMonth = month;
    month = newMonth;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CalendarDSLPackage.DATE__MONTH, oldMonth, month));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDay()
  {
    return day;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDay(String newDay)
  {
    String oldDay = day;
    day = newDay;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CalendarDSLPackage.DATE__DAY, oldDay, day));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case CalendarDSLPackage.DATE__YEAR:
        return getYear();
      case CalendarDSLPackage.DATE__MONTH:
        return getMonth();
      case CalendarDSLPackage.DATE__DAY:
        return getDay();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CalendarDSLPackage.DATE__YEAR:
        setYear((String)newValue);
        return;
      case CalendarDSLPackage.DATE__MONTH:
        setMonth((String)newValue);
        return;
      case CalendarDSLPackage.DATE__DAY:
        setDay((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case CalendarDSLPackage.DATE__YEAR:
        setYear(YEAR_EDEFAULT);
        return;
      case CalendarDSLPackage.DATE__MONTH:
        setMonth(MONTH_EDEFAULT);
        return;
      case CalendarDSLPackage.DATE__DAY:
        setDay(DAY_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case CalendarDSLPackage.DATE__YEAR:
        return YEAR_EDEFAULT == null ? year != null : !YEAR_EDEFAULT.equals(year);
      case CalendarDSLPackage.DATE__MONTH:
        return MONTH_EDEFAULT == null ? month != null : !MONTH_EDEFAULT.equals(month);
      case CalendarDSLPackage.DATE__DAY:
        return DAY_EDEFAULT == null ? day != null : !DAY_EDEFAULT.equals(day);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (year: ");
    result.append(year);
    result.append(", month: ");
    result.append(month);
    result.append(", day: ");
    result.append(day);
    result.append(')');
    return result.toString();
  }

} //DateImpl
