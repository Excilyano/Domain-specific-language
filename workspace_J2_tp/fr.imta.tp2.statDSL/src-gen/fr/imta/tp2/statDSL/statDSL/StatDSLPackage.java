/**
 */
package fr.imta.tp2.statDSL.statDSL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.imta.tp2.statDSL.statDSL.StatDSLFactory
 * @model kind="package"
 * @generated
 */
public interface StatDSLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "statDSL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.imta.fr/tp2/statDSL/StatDSL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "statDSL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  StatDSLPackage eINSTANCE = fr.imta.tp2.statDSL.statDSL.impl.StatDSLPackageImpl.init();

  /**
   * The meta object id for the '{@link fr.imta.tp2.statDSL.statDSL.impl.StatDSLImpl <em>Stat DSL</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imta.tp2.statDSL.statDSL.impl.StatDSLImpl
   * @see fr.imta.tp2.statDSL.statDSL.impl.StatDSLPackageImpl#getStatDSL()
   * @generated
   */
  int STAT_DSL = 0;

  /**
   * The feature id for the '<em><b>Program</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAT_DSL__PROGRAM = 0;

  /**
   * The number of structural features of the '<em>Stat DSL</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAT_DSL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.imta.tp2.statDSL.statDSL.impl.ProgramImpl <em>Program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imta.tp2.statDSL.statDSL.impl.ProgramImpl
   * @see fr.imta.tp2.statDSL.statDSL.impl.StatDSLPackageImpl#getProgram()
   * @generated
   */
  int PROGRAM = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__NAME = 0;

  /**
   * The number of structural features of the '<em>Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link fr.imta.tp2.statDSL.statDSL.StatDSL <em>Stat DSL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stat DSL</em>'.
   * @see fr.imta.tp2.statDSL.statDSL.StatDSL
   * @generated
   */
  EClass getStatDSL();

  /**
   * Returns the meta object for the containment reference '{@link fr.imta.tp2.statDSL.statDSL.StatDSL#getProgram <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Program</em>'.
   * @see fr.imta.tp2.statDSL.statDSL.StatDSL#getProgram()
   * @see #getStatDSL()
   * @generated
   */
  EReference getStatDSL_Program();

  /**
   * Returns the meta object for class '{@link fr.imta.tp2.statDSL.statDSL.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Program</em>'.
   * @see fr.imta.tp2.statDSL.statDSL.Program
   * @generated
   */
  EClass getProgram();

  /**
   * Returns the meta object for the attribute '{@link fr.imta.tp2.statDSL.statDSL.Program#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.imta.tp2.statDSL.statDSL.Program#getName()
   * @see #getProgram()
   * @generated
   */
  EAttribute getProgram_Name();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  StatDSLFactory getStatDSLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link fr.imta.tp2.statDSL.statDSL.impl.StatDSLImpl <em>Stat DSL</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imta.tp2.statDSL.statDSL.impl.StatDSLImpl
     * @see fr.imta.tp2.statDSL.statDSL.impl.StatDSLPackageImpl#getStatDSL()
     * @generated
     */
    EClass STAT_DSL = eINSTANCE.getStatDSL();

    /**
     * The meta object literal for the '<em><b>Program</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STAT_DSL__PROGRAM = eINSTANCE.getStatDSL_Program();

    /**
     * The meta object literal for the '{@link fr.imta.tp2.statDSL.statDSL.impl.ProgramImpl <em>Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imta.tp2.statDSL.statDSL.impl.ProgramImpl
     * @see fr.imta.tp2.statDSL.statDSL.impl.StatDSLPackageImpl#getProgram()
     * @generated
     */
    EClass PROGRAM = eINSTANCE.getProgram();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROGRAM__NAME = eINSTANCE.getProgram_Name();

  }

} //StatDSLPackage
