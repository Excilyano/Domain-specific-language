/**
 */
package fr.imta.tp.calcDSL;

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
 * @see fr.imta.tp.calcDSL.CalcDSLFactory
 * @model kind="package"
 * @generated
 */
public interface CalcDSLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "calcDSL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.imta.fr/tp/CalcDSL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "calcDSL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CalcDSLPackage eINSTANCE = fr.imta.tp.calcDSL.impl.CalcDSLPackageImpl.init();

  /**
   * The meta object id for the '{@link fr.imta.tp.calcDSL.impl.CalcDSLImpl <em>Calc DSL</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imta.tp.calcDSL.impl.CalcDSLImpl
   * @see fr.imta.tp.calcDSL.impl.CalcDSLPackageImpl#getCalcDSL()
   * @generated
   */
  int CALC_DSL = 0;

  /**
   * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALC_DSL__INSTRUCTIONS = 0;

  /**
   * The number of structural features of the '<em>Calc DSL</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALC_DSL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.imta.tp.calcDSL.impl.InstructionImpl <em>Instruction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imta.tp.calcDSL.impl.InstructionImpl
   * @see fr.imta.tp.calcDSL.impl.CalcDSLPackageImpl#getInstruction()
   * @generated
   */
  int INSTRUCTION = 1;

  /**
   * The number of structural features of the '<em>Instruction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link fr.imta.tp.calcDSL.impl.DeclarationImpl <em>Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imta.tp.calcDSL.impl.DeclarationImpl
   * @see fr.imta.tp.calcDSL.impl.CalcDSLPackageImpl#getDeclaration()
   * @generated
   */
  int DECLARATION = 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__TYPE = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__VARIABLE = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.imta.tp.calcDSL.impl.OperationImpl <em>Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imta.tp.calcDSL.impl.OperationImpl
   * @see fr.imta.tp.calcDSL.impl.CalcDSLPackageImpl#getOperation()
   * @generated
   */
  int OPERATION = 3;

  /**
   * The feature id for the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__VARIABLE = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Calculation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__CALCULATION = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.imta.tp.calcDSL.impl.CalculationImpl <em>Calculation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imta.tp.calcDSL.impl.CalculationImpl
   * @see fr.imta.tp.calcDSL.impl.CalcDSLPackageImpl#getCalculation()
   * @generated
   */
  int CALCULATION = 4;

  /**
   * The feature id for the '<em><b>Init</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALCULATION__INIT = 0;

  /**
   * The feature id for the '<em><b>Vectors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALCULATION__VECTORS = 1;

  /**
   * The number of structural features of the '<em>Calculation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALCULATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.imta.tp.calcDSL.impl.OperandImpl <em>Operand</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imta.tp.calcDSL.impl.OperandImpl
   * @see fr.imta.tp.calcDSL.impl.CalcDSLPackageImpl#getOperand()
   * @generated
   */
  int OPERAND = 5;

  /**
   * The number of structural features of the '<em>Operand</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERAND_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link fr.imta.tp.calcDSL.impl.VariableImpl <em>Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imta.tp.calcDSL.impl.VariableImpl
   * @see fr.imta.tp.calcDSL.impl.CalcDSLPackageImpl#getVariable()
   * @generated
   */
  int VARIABLE = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__NAME = OPERAND_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE_COUNT = OPERAND_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link fr.imta.tp.calcDSL.CalcDSL <em>Calc DSL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Calc DSL</em>'.
   * @see fr.imta.tp.calcDSL.CalcDSL
   * @generated
   */
  EClass getCalcDSL();

  /**
   * Returns the meta object for the containment reference list '{@link fr.imta.tp.calcDSL.CalcDSL#getInstructions <em>Instructions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Instructions</em>'.
   * @see fr.imta.tp.calcDSL.CalcDSL#getInstructions()
   * @see #getCalcDSL()
   * @generated
   */
  EReference getCalcDSL_Instructions();

  /**
   * Returns the meta object for class '{@link fr.imta.tp.calcDSL.Instruction <em>Instruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction</em>'.
   * @see fr.imta.tp.calcDSL.Instruction
   * @generated
   */
  EClass getInstruction();

  /**
   * Returns the meta object for class '{@link fr.imta.tp.calcDSL.Declaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Declaration</em>'.
   * @see fr.imta.tp.calcDSL.Declaration
   * @generated
   */
  EClass getDeclaration();

  /**
   * Returns the meta object for the attribute '{@link fr.imta.tp.calcDSL.Declaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see fr.imta.tp.calcDSL.Declaration#getType()
   * @see #getDeclaration()
   * @generated
   */
  EAttribute getDeclaration_Type();

  /**
   * Returns the meta object for the containment reference '{@link fr.imta.tp.calcDSL.Declaration#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable</em>'.
   * @see fr.imta.tp.calcDSL.Declaration#getVariable()
   * @see #getDeclaration()
   * @generated
   */
  EReference getDeclaration_Variable();

  /**
   * Returns the meta object for class '{@link fr.imta.tp.calcDSL.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation</em>'.
   * @see fr.imta.tp.calcDSL.Operation
   * @generated
   */
  EClass getOperation();

  /**
   * Returns the meta object for the reference '{@link fr.imta.tp.calcDSL.Operation#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Variable</em>'.
   * @see fr.imta.tp.calcDSL.Operation#getVariable()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_Variable();

  /**
   * Returns the meta object for the containment reference '{@link fr.imta.tp.calcDSL.Operation#getCalculation <em>Calculation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Calculation</em>'.
   * @see fr.imta.tp.calcDSL.Operation#getCalculation()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_Calculation();

  /**
   * Returns the meta object for class '{@link fr.imta.tp.calcDSL.Calculation <em>Calculation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Calculation</em>'.
   * @see fr.imta.tp.calcDSL.Calculation
   * @generated
   */
  EClass getCalculation();

  /**
   * Returns the meta object for the containment reference '{@link fr.imta.tp.calcDSL.Calculation#getInit <em>Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Init</em>'.
   * @see fr.imta.tp.calcDSL.Calculation#getInit()
   * @see #getCalculation()
   * @generated
   */
  EReference getCalculation_Init();

  /**
   * Returns the meta object for the containment reference list '{@link fr.imta.tp.calcDSL.Calculation#getVectors <em>Vectors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Vectors</em>'.
   * @see fr.imta.tp.calcDSL.Calculation#getVectors()
   * @see #getCalculation()
   * @generated
   */
  EReference getCalculation_Vectors();

  /**
   * Returns the meta object for class '{@link fr.imta.tp.calcDSL.Operand <em>Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operand</em>'.
   * @see fr.imta.tp.calcDSL.Operand
   * @generated
   */
  EClass getOperand();

  /**
   * Returns the meta object for class '{@link fr.imta.tp.calcDSL.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable</em>'.
   * @see fr.imta.tp.calcDSL.Variable
   * @generated
   */
  EClass getVariable();

  /**
   * Returns the meta object for the attribute '{@link fr.imta.tp.calcDSL.Variable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.imta.tp.calcDSL.Variable#getName()
   * @see #getVariable()
   * @generated
   */
  EAttribute getVariable_Name();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  CalcDSLFactory getCalcDSLFactory();

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
     * The meta object literal for the '{@link fr.imta.tp.calcDSL.impl.CalcDSLImpl <em>Calc DSL</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imta.tp.calcDSL.impl.CalcDSLImpl
     * @see fr.imta.tp.calcDSL.impl.CalcDSLPackageImpl#getCalcDSL()
     * @generated
     */
    EClass CALC_DSL = eINSTANCE.getCalcDSL();

    /**
     * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CALC_DSL__INSTRUCTIONS = eINSTANCE.getCalcDSL_Instructions();

    /**
     * The meta object literal for the '{@link fr.imta.tp.calcDSL.impl.InstructionImpl <em>Instruction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imta.tp.calcDSL.impl.InstructionImpl
     * @see fr.imta.tp.calcDSL.impl.CalcDSLPackageImpl#getInstruction()
     * @generated
     */
    EClass INSTRUCTION = eINSTANCE.getInstruction();

    /**
     * The meta object literal for the '{@link fr.imta.tp.calcDSL.impl.DeclarationImpl <em>Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imta.tp.calcDSL.impl.DeclarationImpl
     * @see fr.imta.tp.calcDSL.impl.CalcDSLPackageImpl#getDeclaration()
     * @generated
     */
    EClass DECLARATION = eINSTANCE.getDeclaration();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECLARATION__TYPE = eINSTANCE.getDeclaration_Type();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECLARATION__VARIABLE = eINSTANCE.getDeclaration_Variable();

    /**
     * The meta object literal for the '{@link fr.imta.tp.calcDSL.impl.OperationImpl <em>Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imta.tp.calcDSL.impl.OperationImpl
     * @see fr.imta.tp.calcDSL.impl.CalcDSLPackageImpl#getOperation()
     * @generated
     */
    EClass OPERATION = eINSTANCE.getOperation();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__VARIABLE = eINSTANCE.getOperation_Variable();

    /**
     * The meta object literal for the '<em><b>Calculation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__CALCULATION = eINSTANCE.getOperation_Calculation();

    /**
     * The meta object literal for the '{@link fr.imta.tp.calcDSL.impl.CalculationImpl <em>Calculation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imta.tp.calcDSL.impl.CalculationImpl
     * @see fr.imta.tp.calcDSL.impl.CalcDSLPackageImpl#getCalculation()
     * @generated
     */
    EClass CALCULATION = eINSTANCE.getCalculation();

    /**
     * The meta object literal for the '<em><b>Init</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CALCULATION__INIT = eINSTANCE.getCalculation_Init();

    /**
     * The meta object literal for the '<em><b>Vectors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CALCULATION__VECTORS = eINSTANCE.getCalculation_Vectors();

    /**
     * The meta object literal for the '{@link fr.imta.tp.calcDSL.impl.OperandImpl <em>Operand</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imta.tp.calcDSL.impl.OperandImpl
     * @see fr.imta.tp.calcDSL.impl.CalcDSLPackageImpl#getOperand()
     * @generated
     */
    EClass OPERAND = eINSTANCE.getOperand();

    /**
     * The meta object literal for the '{@link fr.imta.tp.calcDSL.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imta.tp.calcDSL.impl.VariableImpl
     * @see fr.imta.tp.calcDSL.impl.CalcDSLPackageImpl#getVariable()
     * @generated
     */
    EClass VARIABLE = eINSTANCE.getVariable();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

  }

} //CalcDSLPackage
