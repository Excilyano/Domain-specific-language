/**
 */
package fr.imta.tp2.tutorial.myTuto;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>My Tuto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.imta.tp2.tutorial.myTuto.MyTuto#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.imta.tp2.tutorial.myTuto.MyTutoPackage#getMyTuto()
 * @model
 * @generated
 */
public interface MyTuto extends EObject
{
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
   * @see fr.imta.tp2.tutorial.myTuto.MyTutoPackage#getMyTuto_Elements()
   * @model containment="true"
   * @generated
   */
  EList<AbstractElement> getElements();

} // MyTuto
