/**
 */
package fr.imta.tp.sql4csv;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SQL4CSV</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.imta.tp.sql4csv.SQL4CSV#getProgram <em>Program</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.imta.tp.sql4csv.Sql4csvPackage#getSQL4CSV()
 * @model
 * @generated
 */
public interface SQL4CSV extends EObject
{
  /**
   * Returns the value of the '<em><b>Program</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Program</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Program</em>' containment reference.
   * @see #setProgram(Program)
   * @see fr.imta.tp.sql4csv.Sql4csvPackage#getSQL4CSV_Program()
   * @model containment="true"
   * @generated
   */
  Program getProgram();

  /**
   * Sets the value of the '{@link fr.imta.tp.sql4csv.SQL4CSV#getProgram <em>Program</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Program</em>' containment reference.
   * @see #getProgram()
   * @generated
   */
  void setProgram(Program value);

} // SQL4CSV
