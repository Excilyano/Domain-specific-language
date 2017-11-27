/**
 */
package sql4csv;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>From</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sql4csv.From#getTables <em>Tables</em>}</li>
 *   <li>{@link sql4csv.From#getFiltre <em>Filtre</em>}</li>
 * </ul>
 * </p>
 *
 * @see sql4csv.Sql4csvPackage#getFrom()
 * @model
 * @generated
 */
public interface From extends EObject {
	/**
	 * Returns the value of the '<em><b>Tables</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tables</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tables</em>' attribute list.
	 * @see sql4csv.Sql4csvPackage#getFrom_Tables()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getTables();

	/**
	 * Returns the value of the '<em><b>Filtre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filtre</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filtre</em>' containment reference.
	 * @see #setFiltre(Condition)
	 * @see sql4csv.Sql4csvPackage#getFrom_Filtre()
	 * @model containment="true"
	 * @generated
	 */
	Condition getFiltre();

	/**
	 * Sets the value of the '{@link sql4csv.From#getFiltre <em>Filtre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filtre</em>' containment reference.
	 * @see #getFiltre()
	 * @generated
	 */
	void setFiltre(Condition value);

} // From
