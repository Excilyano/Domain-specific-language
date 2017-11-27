/**
 */
package sql4csv;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sql4csv.Select#getAttributs <em>Attributs</em>}</li>
 *   <li>{@link sql4csv.Select#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see sql4csv.Sql4csvPackage#getSelect()
 * @model
 * @generated
 */
public interface Select extends EObject {
	/**
	 * Returns the value of the '<em><b>Attributs</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributs</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributs</em>' attribute list.
	 * @see sql4csv.Sql4csvPackage#getSelect_Attributs()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getAttributs();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(From)
	 * @see sql4csv.Sql4csvPackage#getSelect_Source()
	 * @model containment="true" required="true"
	 * @generated
	 */
	From getSource();

	/**
	 * Sets the value of the '{@link sql4csv.Select#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(From value);

} // Select
