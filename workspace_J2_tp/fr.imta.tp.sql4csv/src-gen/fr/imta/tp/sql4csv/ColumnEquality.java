/**
 */
package fr.imta.tp.sql4csv;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column Equality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.imta.tp.sql4csv.ColumnEquality#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.imta.tp.sql4csv.Sql4csvPackage#getColumnEquality()
 * @model
 * @generated
 */
public interface ColumnEquality extends EObject
{
  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Column)
   * @see fr.imta.tp.sql4csv.Sql4csvPackage#getColumnEquality_Right()
   * @model containment="true"
   * @generated
   */
  Column getRight();

  /**
   * Sets the value of the '{@link fr.imta.tp.sql4csv.ColumnEquality#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Column value);

} // ColumnEquality
