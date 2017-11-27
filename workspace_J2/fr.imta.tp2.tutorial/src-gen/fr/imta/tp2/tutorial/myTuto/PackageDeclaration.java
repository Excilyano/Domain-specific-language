/**
 */
package fr.imta.tp2.tutorial.myTuto;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.imta.tp2.tutorial.myTuto.PackageDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link fr.imta.tp2.tutorial.myTuto.PackageDeclaration#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.imta.tp2.tutorial.myTuto.MyTutoPackage#getPackageDeclaration()
 * @model
 * @generated
 */
public interface PackageDeclaration extends AbstractElement
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
   * @see fr.imta.tp2.tutorial.myTuto.MyTutoPackage#getPackageDeclaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.imta.tp2.tutorial.myTuto.PackageDeclaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link fr.imta.tp2.tutorial.myTuto.AbstractElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see fr.imta.tp2.tutorial.myTuto.MyTutoPackage#getPackageDeclaration_Elements()
   * @model containment="true"
   * @generated
   */
  EList<AbstractElement> getElements();

} // PackageDeclaration
