/**
 */
package fr.imta.tp.sql4csv;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.imta.tp.sql4csv.Query#getColumn <em>Column</em>}</li>
 *   <li>{@link fr.imta.tp.sql4csv.Query#getColumns <em>Columns</em>}</li>
 *   <li>{@link fr.imta.tp.sql4csv.Query#getTable <em>Table</em>}</li>
 *   <li>{@link fr.imta.tp.sql4csv.Query#getTables <em>Tables</em>}</li>
 *   <li>{@link fr.imta.tp.sql4csv.Query#getConditions <em>Conditions</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.imta.tp.sql4csv.Sql4csvPackage#getQuery()
 * @model
 * @generated
 */
public interface Query extends EObject
{
  /**
   * Returns the value of the '<em><b>Column</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Column</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Column</em>' containment reference.
   * @see #setColumn(Column)
   * @see fr.imta.tp.sql4csv.Sql4csvPackage#getQuery_Column()
   * @model containment="true"
   * @generated
   */
  Column getColumn();

  /**
   * Sets the value of the '{@link fr.imta.tp.sql4csv.Query#getColumn <em>Column</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Column</em>' containment reference.
   * @see #getColumn()
   * @generated
   */
  void setColumn(Column value);

  /**
   * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
   * The list contents are of type {@link fr.imta.tp.sql4csv.Column}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Columns</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Columns</em>' containment reference list.
   * @see fr.imta.tp.sql4csv.Sql4csvPackage#getQuery_Columns()
   * @model containment="true"
   * @generated
   */
  EList<Column> getColumns();

  /**
   * Returns the value of the '<em><b>Table</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Table</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Table</em>' containment reference.
   * @see #setTable(Table)
   * @see fr.imta.tp.sql4csv.Sql4csvPackage#getQuery_Table()
   * @model containment="true"
   * @generated
   */
  Table getTable();

  /**
   * Sets the value of the '{@link fr.imta.tp.sql4csv.Query#getTable <em>Table</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Table</em>' containment reference.
   * @see #getTable()
   * @generated
   */
  void setTable(Table value);

  /**
   * Returns the value of the '<em><b>Tables</b></em>' containment reference list.
   * The list contents are of type {@link fr.imta.tp.sql4csv.Table}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tables</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tables</em>' containment reference list.
   * @see fr.imta.tp.sql4csv.Sql4csvPackage#getQuery_Tables()
   * @model containment="true"
   * @generated
   */
  EList<Table> getTables();

  /**
   * Returns the value of the '<em><b>Conditions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Conditions</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conditions</em>' containment reference.
   * @see #setConditions(Condition)
   * @see fr.imta.tp.sql4csv.Sql4csvPackage#getQuery_Conditions()
   * @model containment="true"
   * @generated
   */
  Condition getConditions();

  /**
   * Sets the value of the '{@link fr.imta.tp.sql4csv.Query#getConditions <em>Conditions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Conditions</em>' containment reference.
   * @see #getConditions()
   * @generated
   */
  void setConditions(Condition value);

} // Query
