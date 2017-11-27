/**
 */
package fr.imta.tp.calcDSL.impl;

import fr.imta.tp.calcDSL.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CalcDSLFactoryImpl extends EFactoryImpl implements CalcDSLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CalcDSLFactory init()
  {
    try
    {
      CalcDSLFactory theCalcDSLFactory = (CalcDSLFactory)EPackage.Registry.INSTANCE.getEFactory(CalcDSLPackage.eNS_URI);
      if (theCalcDSLFactory != null)
      {
        return theCalcDSLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new CalcDSLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CalcDSLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case CalcDSLPackage.CALC_DSL: return createCalcDSL();
      case CalcDSLPackage.INSTRUCTION: return createInstruction();
      case CalcDSLPackage.DECLARATION: return createDeclaration();
      case CalcDSLPackage.OPERATION: return createOperation();
      case CalcDSLPackage.CALCULATION: return createCalculation();
      case CalcDSLPackage.OPERAND: return createOperand();
      case CalcDSLPackage.VARIABLE: return createVariable();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CalcDSL createCalcDSL()
  {
    CalcDSLImpl calcDSL = new CalcDSLImpl();
    return calcDSL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instruction createInstruction()
  {
    InstructionImpl instruction = new InstructionImpl();
    return instruction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Declaration createDeclaration()
  {
    DeclarationImpl declaration = new DeclarationImpl();
    return declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation createOperation()
  {
    OperationImpl operation = new OperationImpl();
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Calculation createCalculation()
  {
    CalculationImpl calculation = new CalculationImpl();
    return calculation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operand createOperand()
  {
    OperandImpl operand = new OperandImpl();
    return operand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable createVariable()
  {
    VariableImpl variable = new VariableImpl();
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CalcDSLPackage getCalcDSLPackage()
  {
    return (CalcDSLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static CalcDSLPackage getPackage()
  {
    return CalcDSLPackage.eINSTANCE;
  }

} //CalcDSLFactoryImpl
