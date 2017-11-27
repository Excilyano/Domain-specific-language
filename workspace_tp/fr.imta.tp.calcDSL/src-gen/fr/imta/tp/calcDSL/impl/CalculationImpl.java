/**
 */
package fr.imta.tp.calcDSL.impl;

import fr.imta.tp.calcDSL.CalcDSLPackage;
import fr.imta.tp.calcDSL.Calculation;
import fr.imta.tp.calcDSL.Operand;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Calculation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.imta.tp.calcDSL.impl.CalculationImpl#getInit <em>Init</em>}</li>
 *   <li>{@link fr.imta.tp.calcDSL.impl.CalculationImpl#getVectors <em>Vectors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CalculationImpl extends MinimalEObjectImpl.Container implements Calculation
{
  /**
   * The cached value of the '{@link #getInit() <em>Init</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInit()
   * @generated
   * @ordered
   */
  protected Operand init;

  /**
   * The cached value of the '{@link #getVectors() <em>Vectors</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVectors()
   * @generated
   * @ordered
   */
  protected EList<Operand> vectors;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CalculationImpl()
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
    return CalcDSLPackage.Literals.CALCULATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operand getInit()
  {
    return init;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInit(Operand newInit, NotificationChain msgs)
  {
    Operand oldInit = init;
    init = newInit;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CalcDSLPackage.CALCULATION__INIT, oldInit, newInit);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInit(Operand newInit)
  {
    if (newInit != init)
    {
      NotificationChain msgs = null;
      if (init != null)
        msgs = ((InternalEObject)init).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CalcDSLPackage.CALCULATION__INIT, null, msgs);
      if (newInit != null)
        msgs = ((InternalEObject)newInit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CalcDSLPackage.CALCULATION__INIT, null, msgs);
      msgs = basicSetInit(newInit, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CalcDSLPackage.CALCULATION__INIT, newInit, newInit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Operand> getVectors()
  {
    if (vectors == null)
    {
      vectors = new EObjectContainmentEList<Operand>(Operand.class, this, CalcDSLPackage.CALCULATION__VECTORS);
    }
    return vectors;
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
      case CalcDSLPackage.CALCULATION__INIT:
        return basicSetInit(null, msgs);
      case CalcDSLPackage.CALCULATION__VECTORS:
        return ((InternalEList<?>)getVectors()).basicRemove(otherEnd, msgs);
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
      case CalcDSLPackage.CALCULATION__INIT:
        return getInit();
      case CalcDSLPackage.CALCULATION__VECTORS:
        return getVectors();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CalcDSLPackage.CALCULATION__INIT:
        setInit((Operand)newValue);
        return;
      case CalcDSLPackage.CALCULATION__VECTORS:
        getVectors().clear();
        getVectors().addAll((Collection<? extends Operand>)newValue);
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
      case CalcDSLPackage.CALCULATION__INIT:
        setInit((Operand)null);
        return;
      case CalcDSLPackage.CALCULATION__VECTORS:
        getVectors().clear();
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
      case CalcDSLPackage.CALCULATION__INIT:
        return init != null;
      case CalcDSLPackage.CALCULATION__VECTORS:
        return vectors != null && !vectors.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //CalculationImpl
