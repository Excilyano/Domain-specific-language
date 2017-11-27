/**
 */
package fr.imta.tp.sql4csv;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.imta.tp.sql4csv.Equality#getLeft <em>Left</em>}</li>
 *   <li>{@link fr.imta.tp.sql4csv.Equality#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.imta.tp.sql4csv.Sql4csvPackage#getEquality()
 * @model
 * @generated
 */
public interface Equality extends Condition
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Column)
   * @see fr.imta.tp.sql4csv.Sql4csvPackage#getEquality_Left()
   * @model containment="true"
   * @generated
   */
  Column getLeft();

  /**
   * Sets the value of the '{@link fr.imta.tp.sql4csv.Equality#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Column value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(EObject)
   * @see fr.imta.tp.sql4csv.Sql4csvPackage#getEquality_Right()
   * @model containment="true"
   * @generated
   */
  EObject getRight();

  /**
   * Sets the value of the '{@link fr.imta.tp.sql4csv.Equality#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(EObject value);

} // Equality
