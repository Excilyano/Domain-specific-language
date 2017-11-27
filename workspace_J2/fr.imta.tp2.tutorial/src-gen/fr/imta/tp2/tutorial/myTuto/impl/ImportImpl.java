/**
 */
package fr.imta.tp2.tutorial.myTuto.impl;

import fr.imta.tp2.tutorial.myTuto.Import;
import fr.imta.tp2.tutorial.myTuto.MyTutoPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.imta.tp2.tutorial.myTuto.impl.ImportImpl#getImportedNameSpace <em>Imported Name Space</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImportImpl extends AbstractElementImpl implements Import
{
  /**
   * The default value of the '{@link #getImportedNameSpace() <em>Imported Name Space</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportedNameSpace()
   * @generated
   * @ordered
   */
  protected static final String IMPORTED_NAME_SPACE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getImportedNameSpace() <em>Imported Name Space</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportedNameSpace()
   * @generated
   * @ordered
   */
  protected String importedNameSpace = IMPORTED_NAME_SPACE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ImportImpl()
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
    return MyTutoPackage.Literals.IMPORT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getImportedNameSpace()
  {
    return importedNameSpace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImportedNameSpace(String newImportedNameSpace)
  {
    String oldImportedNameSpace = importedNameSpace;
    importedNameSpace = newImportedNameSpace;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyTutoPackage.IMPORT__IMPORTED_NAME_SPACE, oldImportedNameSpace, importedNameSpace));
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
      case MyTutoPackage.IMPORT__IMPORTED_NAME_SPACE:
        return getImportedNameSpace();
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
      case MyTutoPackage.IMPORT__IMPORTED_NAME_SPACE:
        setImportedNameSpace((String)newValue);
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
      case MyTutoPackage.IMPORT__IMPORTED_NAME_SPACE:
        setImportedNameSpace(IMPORTED_NAME_SPACE_EDEFAULT);
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
      case MyTutoPackage.IMPORT__IMPORTED_NAME_SPACE:
        return IMPORTED_NAME_SPACE_EDEFAULT == null ? importedNameSpace != null : !IMPORTED_NAME_SPACE_EDEFAULT.equals(importedNameSpace);
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
    result.append(" (importedNameSpace: ");
    result.append(importedNameSpace);
    result.append(')');
    return result.toString();
  }

} //ImportImpl
