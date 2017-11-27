/**
 */
package fr.imta.tp.calcDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calculation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.imta.tp.calcDSL.Calculation#getInit <em>Init</em>}</li>
 *   <li>{@link fr.imta.tp.calcDSL.Calculation#getVectors <em>Vectors</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.imta.tp.calcDSL.CalcDSLPackage#getCalculation()
 * @model
 * @generated
 */
public interface Calculation extends EObject
{
  /**
   * Returns the value of the '<em><b>Init</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Init</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Init</em>' containment reference.
   * @see #setInit(Operand)
   * @see fr.imta.tp.calcDSL.CalcDSLPackage#getCalculation_Init()
   * @model containment="true"
   * @generated
   */
  Operand getInit();

  /**
   * Sets the value of the '{@link fr.imta.tp.calcDSL.Calculation#getInit <em>Init</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Init</em>' containment reference.
   * @see #getInit()
   * @generated
   */
  void setInit(Operand value);

  /**
   * Returns the value of the '<em><b>Vectors</b></em>' containment reference list.
   * The list contents are of type {@link fr.imta.tp.calcDSL.Operand}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vectors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vectors</em>' containment reference list.
   * @see fr.imta.tp.calcDSL.CalcDSLPackage#getCalculation_Vectors()
   * @model containment="true"
   * @generated
   */
  EList<Operand> getVectors();

} // Calculation
