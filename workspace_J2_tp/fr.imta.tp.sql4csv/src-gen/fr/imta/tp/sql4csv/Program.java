/**
 */
package fr.imta.tp.sql4csv;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.imta.tp.sql4csv.Program#getQueries <em>Queries</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.imta.tp.sql4csv.Sql4csvPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject
{
  /**
   * Returns the value of the '<em><b>Queries</b></em>' containment reference list.
   * The list contents are of type {@link fr.imta.tp.sql4csv.Query}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Queries</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Queries</em>' containment reference list.
   * @see fr.imta.tp.sql4csv.Sql4csvPackage#getProgram_Queries()
   * @model containment="true"
   * @generated
   */
  EList<Query> getQueries();

} // Program
