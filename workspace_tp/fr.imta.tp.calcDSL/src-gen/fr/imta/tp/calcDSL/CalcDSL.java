/**
 */
package fr.imta.tp.calcDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calc DSL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.imta.tp.calcDSL.CalcDSL#getInstructions <em>Instructions</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.imta.tp.calcDSL.CalcDSLPackage#getCalcDSL()
 * @model
 * @generated
 */
public interface CalcDSL extends EObject
{
  /**
   * Returns the value of the '<em><b>Instructions</b></em>' containment reference list.
   * The list contents are of type {@link fr.imta.tp.calcDSL.Instruction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instructions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instructions</em>' containment reference list.
   * @see fr.imta.tp.calcDSL.CalcDSLPackage#getCalcDSL_Instructions()
   * @model containment="true"
   * @generated
   */
  EList<Instruction> getInstructions();

} // CalcDSL
