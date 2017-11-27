/**
 */
package fr.imta.tp.calcDSL.impl;

import fr.imta.tp.calcDSL.CalcDSLPackage;
import fr.imta.tp.calcDSL.Calculation;
import fr.imta.tp.calcDSL.Operation;
import fr.imta.tp.calcDSL.Variable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.imta.tp.calcDSL.impl.OperationImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link fr.imta.tp.calcDSL.impl.OperationImpl#getCalculation <em>Calculation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationImpl extends InstructionImpl implements Operation
{
  /**
   * The cached value of the '{@link #getVariable() <em>Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable()
   * @generated
   * @ordered
   */
  protected Variable variable;

  /**
   * The cached value of the '{@link #getCalculation() <em>Calculation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCalculation()
   * @generated
   * @ordered
   */
  protected Calculation calculation;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OperationImpl()
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
    return CalcDSLPackage.Literals.OPERATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable getVariable()
  {
    if (variable != null && variable.eIsProxy())
    {
      InternalEObject oldVariable = (InternalEObject)variable;
      variable = (Variable)eResolveProxy(oldVariable);
      if (variable != oldVariable)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CalcDSLPackage.OPERATION__VARIABLE, oldVariable, variable));
      }
    }
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable basicGetVariable()
  {
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariable(Variable newVariable)
  {
    Variable oldVariable = variable;
    variable = newVariable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CalcDSLPackage.OPERATION__VARIABLE, oldVariable, variable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Calculation getCalculation()
  {
    return calculation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCalculation(Calculation newCalculation, NotificationChain msgs)
  {
    Calculation oldCalculation = calculation;
    calculation = newCalculation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CalcDSLPackage.OPERATION__CALCULATION, oldCalculation, newCalculation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCalculation(Calculation newCalculation)
  {
    if (newCalculation != calculation)
    {
      NotificationChain msgs = null;
      if (calculation != null)
        msgs = ((InternalEObject)calculation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CalcDSLPackage.OPERATION__CALCULATION, null, msgs);
      if (newCalculation != null)
        msgs = ((InternalEObject)newCalculation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CalcDSLPackage.OPERATION__CALCULATION, null, msgs);
      msgs = basicSetCalculation(newCalculation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CalcDSLPackage.OPERATION__CALCULATION, newCalculation, newCalculation));
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
      case CalcDSLPackage.OPERATION__CALCULATION:
        return basicSetCalculation(null, msgs);
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
      case CalcDSLPackage.OPERATION__VARIABLE:
        if (resolve) return getVariable();
        return basicGetVariable();
      case CalcDSLPackage.OPERATION__CALCULATION:
        return getCalculation();
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
      case CalcDSLPackage.OPERATION__VARIABLE:
        setVariable((Variable)newValue);
        return;
      case CalcDSLPackage.OPERATION__CALCULATION:
        setCalculation((Calculation)newValue);
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
      case CalcDSLPackage.OPERATION__VARIABLE:
        setVariable((Variable)null);
        return;
      case CalcDSLPackage.OPERATION__CALCULATION:
        setCalculation((Calculation)null);
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
      case CalcDSLPackage.OPERATION__VARIABLE:
        return variable != null;
      case CalcDSLPackage.OPERATION__CALCULATION:
        return calculation != null;
    }
    return super.eIsSet(featureID);
  }

} //OperationImpl
