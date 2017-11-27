/**
 */
package fr.imta.tp.sql4csv;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.imta.tp.sql4csv.Column#getTable <em>Table</em>}</li>
 *   <li>{@link fr.imta.tp.sql4csv.Column#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.imta.tp.sql4csv.Sql4csvPackage#getColumn()
 * @model
 * @generated
 */
public interface Column extends EObject
{
  /**
   * Returns the value of the '<em><b>Table</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Table</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Table</em>' reference.
   * @see #setTable(Table)
   * @see fr.imta.tp.sql4csv.Sql4csvPackage#getColumn_Table()
   * @model
   * @generated
   */
  Table getTable();

  /**
   * Sets the value of the '{@link fr.imta.tp.sql4csv.Column#getTable <em>Table</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Table</em>' reference.
   * @see #getTable()
   * @generated
   */
  void setTable(Table value);

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
   * @see fr.imta.tp.sql4csv.Sql4csvPackage#getColumn_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.imta.tp.sql4csv.Column#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Column
