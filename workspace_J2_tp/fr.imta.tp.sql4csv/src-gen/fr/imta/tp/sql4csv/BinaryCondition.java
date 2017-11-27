/**
 */
package fr.imta.tp.sql4csv;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.imta.tp.sql4csv.BinaryCondition#getLeft <em>Left</em>}</li>
 *   <li>{@link fr.imta.tp.sql4csv.BinaryCondition#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.imta.tp.sql4csv.Sql4csvPackage#getBinaryCondition()
 * @model
 * @generated
 */
public interface BinaryCondition extends Condition
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
   * @see #setLeft(Equality)
   * @see fr.imta.tp.sql4csv.Sql4csvPackage#getBinaryCondition_Left()
   * @model containment="true"
   * @generated
   */
  Equality getLeft();

  /**
   * Sets the value of the '{@link fr.imta.tp.sql4csv.BinaryCondition#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Equality value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Condition)
   * @see fr.imta.tp.sql4csv.Sql4csvPackage#getBinaryCondition_Right()
   * @model containment="true"
   * @generated
   */
  Condition getRight();

  /**
   * Sets the value of the '{@link fr.imta.tp.sql4csv.BinaryCondition#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Condition value);

} // BinaryCondition
