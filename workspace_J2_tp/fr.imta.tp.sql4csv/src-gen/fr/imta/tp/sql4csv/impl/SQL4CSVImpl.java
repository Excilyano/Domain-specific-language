/**
 */
package fr.imta.tp.sql4csv.impl;

import fr.imta.tp.sql4csv.Program;
import fr.imta.tp.sql4csv.SQL4CSV;
import fr.imta.tp.sql4csv.Sql4csvPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SQL4CSV</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.imta.tp.sql4csv.impl.SQL4CSVImpl#getProgram <em>Program</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SQL4CSVImpl extends MinimalEObjectImpl.Container implements SQL4CSV
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
  protected SQL4CSVImpl()
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
    return Sql4csvPackage.Literals.SQL4CSV;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Sql4csvPackage.SQL4CSV__PROGRAM, oldProgram, newProgram);
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
        msgs = ((InternalEObject)program).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Sql4csvPackage.SQL4CSV__PROGRAM, null, msgs);
      if (newProgram != null)
        msgs = ((InternalEObject)newProgram).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Sql4csvPackage.SQL4CSV__PROGRAM, null, msgs);
      msgs = basicSetProgram(newProgram, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Sql4csvPackage.SQL4CSV__PROGRAM, newProgram, newProgram));
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
      case Sql4csvPackage.SQL4CSV__PROGRAM:
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
      case Sql4csvPackage.SQL4CSV__PROGRAM:
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
      case Sql4csvPackage.SQL4CSV__PROGRAM:
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
      case Sql4csvPackage.SQL4CSV__PROGRAM:
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
      case Sql4csvPackage.SQL4CSV__PROGRAM:
        return program != null;
    }
    return super.eIsSet(featureID);
  }

} //SQL4CSVImpl
