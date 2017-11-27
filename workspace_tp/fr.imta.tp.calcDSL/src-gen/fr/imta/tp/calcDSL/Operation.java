/**
 */
package fr.imta.tp.calcDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.imta.tp.calcDSL.Operation#getVariable <em>Variable</em>}</li>
 *   <li>{@link fr.imta.tp.calcDSL.Operation#getCalculation <em>Calculation</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.imta.tp.calcDSL.CalcDSLPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends Instruction
{
  /**
   * Returns the value of the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' reference.
   * @see #setVariable(Variable)
   * @see fr.imta.tp.calcDSL.CalcDSLPackage#getOperation_Variable()
   * @model
   * @generated
   */
  Variable getVariable();

  /**
   * Sets the value of the '{@link fr.imta.tp.calcDSL.Operation#getVariable <em>Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(Variable value);

  /**
   * Returns the value of the '<em><b>Calculation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Calculation</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Calculation</em>' containment reference.
   * @see #setCalculation(Calculation)
   * @see fr.imta.tp.calcDSL.CalcDSLPackage#getOperation_Calculation()
   * @model containment="true"
   * @generated
   */
  Calculation getCalculation();

  /**
   * Sets the value of the '{@link fr.imta.tp.calcDSL.Operation#getCalculation <em>Calculation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Calculation</em>' containment reference.
   * @see #getCalculation()
   * @generated
   */
  void setCalculation(Calculation value);

} // Operation
