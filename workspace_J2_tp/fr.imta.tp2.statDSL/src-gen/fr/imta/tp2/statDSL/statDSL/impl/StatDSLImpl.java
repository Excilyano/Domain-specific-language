/**
 */
package fr.imta.tp2.statDSL.statDSL.impl;

import fr.imta.tp2.statDSL.statDSL.Program;
import fr.imta.tp2.statDSL.statDSL.StatDSL;
import fr.imta.tp2.statDSL.statDSL.StatDSLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stat DSL</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.imta.tp2.statDSL.statDSL.impl.StatDSLImpl#getProgram <em>Program</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StatDSLImpl extends MinimalEObjectImpl.Container implements StatDSL
{
  /**
   * The cached value of the '{@link #getProgram() <em>Program</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProgram()
   * @generated
   * @ordered
   */
  protected Program program;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StatDSLImpl()
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
    return StatDSLPackage.Literals.STAT_DSL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Program getProgram()
  {
    return program;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProgram(Program newProgram, NotificationChain msgs)
  {
    Program oldProgram = program;
    program = newProgram;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatDSLPackage.STAT_DSL__PROGRAM, oldProgram, newProgram);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProgram(Program newProgram)
  {
    if (newProgram != program)
    {
      NotificationChain msgs = null;
      if (program != null)
        msgs = ((InternalEObject)program).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatDSLPackage.STAT_DSL__PROGRAM, null, msgs);
      if (newProgram != null)
        msgs = ((InternalEObject)newProgram).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatDSLPackage.STAT_DSL__PROGRAM, null, msgs);
      msgs = basicSetProgram(newProgram, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StatDSLPackage.STAT_DSL__PROGRAM, newProgram, newProgram));
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
      case StatDSLPackage.STAT_DSL__PROGRAM:
        return basicSetProgram(null, msgs);
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
      case StatDSLPackage.STAT_DSL__PROGRAM:
        return getProgram();
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
      case StatDSLPackage.STAT_DSL__PROGRAM:
        setProgram((Program)newValue);
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
      case StatDSLPackage.STAT_DSL__PROGRAM:
        setProgram((Program)null);
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
      case StatDSLPackage.STAT_DSL__PROGRAM:
        return program != null;
    }
    return super.eIsSet(featureID);
  }

} //StatDSLImpl
