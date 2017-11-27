/**
 */
package sql4csv;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sql4csv.Condition#getAtt1 <em>Att1</em>}</li>
 *   <li>{@link sql4csv.Condition#getAtt2 <em>Att2</em>}</li>
 *   <li>{@link sql4csv.Condition#getComparateur <em>Comparateur</em>}</li>
 *   <li>{@link sql4csv.Condition#getConditions <em>Conditions</em>}</li>
 * </ul>
 * </p>
 *
 * @see sql4csv.Sql4csvPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends EObject {
	/**
	 * Returns the value of the '<em><b>Att1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Att1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Att1</em>' attribute.
	 * @see #setAtt1(String)
	 * @see sql4csv.Sql4csvPackage#getCondition_Att1()
	 * @model
	 * @generated
	 */
	String getAtt1();

	/**
	 * Sets the value of the '{@link sql4csv.Condition#getAtt1 <em>Att1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Att1</em>' attribute.
	 * @see #getAtt1()
	 * @generated
	 */
	void setAtt1(String value);

	/**
	 * Returns the value of the '<em><b>Att2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Att2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Att2</em>' attribute.
	 * @see #setAtt2(String)
	 * @see sql4csv.Sql4csvPackage#getCondition_Att2()
	 * @model
	 * @generated
	 */
	String getAtt2();

	/**
	 * Sets the value of the '{@link sql4csv.Condition#getAtt2 <em>Att2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Att2</em>' attribute.
	 * @see #getAtt2()
	 * @generated
	 */
	void setAtt2(String value);

	/**
	 * Returns the value of the '<em><b>Comparateur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comparateur</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparateur</em>' attribute.
	 * @see #setComparateur(String)
	 * @see sql4csv.Sql4csvPackage#getCondition_Comparateur()
	 * @model
	 * @generated
	 */
	String getComparateur();

	/**
	 * Sets the value of the '{@link sql4csv.Condition#getComparateur <em>Comparateur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparateur</em>' attribute.
	 * @see #getComparateur()
	 * @generated
	 */
	void setComparateur(String value);

	/**
	 * Returns the value of the '<em><b>Conditions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditions</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions</em>' reference.
	 * @see #setConditions(Condition)
	 * @see sql4csv.Sql4csvPackage#getCondition_Conditions()
	 * @model
	 * @generated
	 */
	Condition getConditions();

	/**
	 * Sets the value of the '{@link sql4csv.Condition#getConditions <em>Conditions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditions</em>' reference.
	 * @see #getConditions()
	 * @generated
	 */
	void setConditions(Condition value);

} // Condition
