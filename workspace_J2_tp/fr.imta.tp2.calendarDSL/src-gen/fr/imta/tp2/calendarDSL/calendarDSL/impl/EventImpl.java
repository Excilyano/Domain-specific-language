/**
 */
package fr.imta.tp2.calendarDSL.calendarDSL.impl;

import fr.imta.tp2.calendarDSL.calendarDSL.CalendarDSLPackage;
import fr.imta.tp2.calendarDSL.calendarDSL.Date;
import fr.imta.tp2.calendarDSL.calendarDSL.Event;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.imta.tp2.calendarDSL.calendarDSL.impl.EventImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.imta.tp2.calendarDSL.calendarDSL.impl.EventImpl#getOn <em>On</em>}</li>
 *   <li>{@link fr.imta.tp2.calendarDSL.calendarDSL.impl.EventImpl#getFrom <em>From</em>}</li>
 *   <li>{@link fr.imta.tp2.calendarDSL.calendarDSL.impl.EventImpl#getTo <em>To</em>}</li>
 *   <li>{@link fr.imta.tp2.calendarDSL.calendarDSL.impl.EventImpl#getAt <em>At</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventImpl extends MinimalEObjectImpl.Container implements Event
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getOn() <em>On</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOn()
   * @generated
   * @ordered
   */
  protected Date on;

  /**
   * The default value of the '{@link #getFrom() <em>From</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFrom()
   * @generated
   * @ordered
   */
  protected static final String FROM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFrom() <em>From</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFrom()
   * @generated
   * @ordered
   */
  protected String from = FROM_EDEFAULT;

  /**
   * The default value of the '{@link #getTo() <em>To</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTo()
   * @generated
   * @ordered
   */
  protected static final String TO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTo() <em>To</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTo()
   * @generated
   * @ordered
   */
  protected String to = TO_EDEFAULT;

  /**
   * The default value of the '{@link #getAt() <em>At</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAt()
   * @generated
   * @ordered
   */
  protected static final String AT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAt() <em>At</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAt()
   * @generated
   * @ordered
   */
  protected String at = AT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EventImpl()
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
    return CalendarDSLPackage.Literals.EVENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CalendarDSLPackage.EVENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Date getOn()
  {
    return on;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOn(Date newOn, NotificationChain msgs)
  {
    Date oldOn = on;
    on = newOn;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CalendarDSLPackage.EVENT__ON, oldOn, newOn);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOn(Date newOn)
  {
    if (newOn != on)
    {
      NotificationChain msgs = null;
      if (on != null)
        msgs = ((InternalEObject)on).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CalendarDSLPackage.EVENT__ON, null, msgs);
      if (newOn != null)
        msgs = ((InternalEObject)newOn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CalendarDSLPackage.EVENT__ON, null, msgs);
      msgs = basicSetOn(newOn, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CalendarDSLPackage.EVENT__ON, newOn, newOn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFrom()
  {
    return from;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFrom(String newFrom)
  {
    String oldFrom = from;
    from = newFrom;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CalendarDSLPackage.EVENT__FROM, oldFrom, from));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTo()
  {
    return to;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTo(String newTo)
  {
    String oldTo = to;
    to = newTo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CalendarDSLPackage.EVENT__TO, oldTo, to));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAt()
  {
    return at;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAt(String newAt)
  {
    String oldAt = at;
    at = newAt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CalendarDSLPackage.EVENT__AT, oldAt, at));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case CalendarDSLPackage.EVENT__ON:
        return basicSetOn(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case CalendarDSLPackage.EVENT__NAME:
        return getName();
      case CalendarDSLPackage.EVENT__ON:
        return getOn();
      case CalendarDSLPackage.EVENT__FROM:
        return getFrom();
      case CalendarDSLPackage.EVENT__TO:
        return getTo();
      case CalendarDSLPackage.EVENT__AT:
        return getAt();
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
      case CalendarDSLPackage.EVENT__NAME:
        setName((String)newValue);
        return;
      case CalendarDSLPackage.EVENT__ON:
        setOn((Date)newValue);
        return;
      case CalendarDSLPackage.EVENT__FROM:
        setFrom((String)newValue);
        return;
      case CalendarDSLPackage.EVENT__TO:
        setTo((String)newValue);
        return;
      case CalendarDSLPackage.EVENT__AT:
        setAt((String)newValue);
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
      case CalendarDSLPackage.EVENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case CalendarDSLPackage.EVENT__ON:
        setOn((Date)null);
        return;
      case CalendarDSLPackage.EVENT__FROM:
        setFrom(FROM_EDEFAULT);
        return;
      case CalendarDSLPackage.EVENT__TO:
        setTo(TO_EDEFAULT);
        return;
      case CalendarDSLPackage.EVENT__AT:
        setAt(AT_EDEFAULT);
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
      case CalendarDSLPackage.EVENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case CalendarDSLPackage.EVENT__ON:
        return on != null;
      case CalendarDSLPackage.EVENT__FROM:
        return FROM_EDEFAULT == null ? from != null : !FROM_EDEFAULT.equals(from);
      case CalendarDSLPackage.EVENT__TO:
        return TO_EDEFAULT == null ? to != null : !TO_EDEFAULT.equals(to);
      case CalendarDSLPackage.EVENT__AT:
        return AT_EDEFAULT == null ? at != null : !AT_EDEFAULT.equals(at);
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
    result.append(" (name: ");
    result.append(name);
    result.append(", from: ");
    result.append(from);
    result.append(", to: ");
    result.append(to);
    result.append(", at: ");
    result.append(at);
    result.append(')');
    return result.toString();
  }

} //EventImpl
