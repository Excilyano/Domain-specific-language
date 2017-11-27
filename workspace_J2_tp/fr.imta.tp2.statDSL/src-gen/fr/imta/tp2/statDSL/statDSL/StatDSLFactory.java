/**
 */
package fr.imta.tp2.statDSL.statDSL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.imta.tp2.statDSL.statDSL.StatDSLPackage
 * @generated
 */
public interface StatDSLFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  StatDSLFactory eINSTANCE = fr.imta.tp2.statDSL.statDSL.impl.StatDSLFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Stat DSL</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Stat DSL</em>'.
   * @generated
   */
  StatDSL createStatDSL();

  /**
   * Returns a new object of class '<em>Program</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Program</em>'.
   * @generated
   */
  Program createProgram();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  StatDSLPackage getStatDSLPackage();

} //StatDSLFactory
