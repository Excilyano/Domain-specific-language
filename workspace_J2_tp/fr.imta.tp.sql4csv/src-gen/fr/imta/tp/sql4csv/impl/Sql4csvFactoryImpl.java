/**
 */
package fr.imta.tp.sql4csv.impl;

import fr.imta.tp.sql4csv.*;

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
public class Sql4csvFactoryImpl extends EFactoryImpl implements Sql4csvFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Sql4csvFactory init()
  {
    try
    {
      Sql4csvFactory theSql4csvFactory = (Sql4csvFactory)EPackage.Registry.INSTANCE.getEFactory(Sql4csvPackage.eNS_URI);
      if (theSql4csvFactory != null)
      {
        return theSql4csvFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new Sql4csvFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sql4csvFactoryImpl()
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
      case Sql4csvPackage.SQL4CSV: return createSQL4CSV();
      case Sql4csvPackage.PROGRAM: return createProgram();
      case Sql4csvPackage.QUERY: return createQuery();
      case Sql4csvPackage.COLUMN: return createColumn();
      case Sql4csvPackage.TABLE: return createTable();
      case Sql4csvPackage.CONDITION: return createCondition();
      case Sql4csvPackage.EQUALITY: return createEquality();
      case Sql4csvPackage.BINARY_CONDITION: return createBinaryCondition();
      case Sql4csvPackage.COLUMN_EQUALITY: return createColumnEquality();
      case Sql4csvPackage.VALUE_EQUALITY: return createValueEquality();
      case Sql4csvPackage.AND_CONDITION: return createAndCondition();
      case Sql4csvPackage.OR_CONDITION: return createOrCondition();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SQL4CSV createSQL4CSV()
  {
    SQL4CSVImpl sql4CSV = new SQL4CSVImpl();
    return sql4CSV;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Program createProgram()
  {
    ProgramImpl program = new ProgramImpl();
    return program;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Query createQuery()
  {
    QueryImpl query = new QueryImpl();
    return query;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Column createColumn()
  {
    ColumnImpl column = new ColumnImpl();
    return column;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Table createTable()
  {
    TableImpl table = new TableImpl();
    return table;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Condition createCondition()
  {
    ConditionImpl condition = new ConditionImpl();
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Equality createEquality()
  {
    EqualityImpl equality = new EqualityImpl();
    return equality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinaryCondition createBinaryCondition()
  {
    BinaryConditionImpl binaryCondition = new BinaryConditionImpl();
    return binaryCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColumnEquality createColumnEquality()
  {
    ColumnEqualityImpl columnEquality = new ColumnEqualityImpl();
    return columnEquality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueEquality createValueEquality()
  {
    ValueEqualityImpl valueEquality = new ValueEqualityImpl();
    return valueEquality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndCondition createAndCondition()
  {
    AndConditionImpl andCondition = new AndConditionImpl();
    return andCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrCondition createOrCondition()
  {
    OrConditionImpl orCondition = new OrConditionImpl();
    return orCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sql4csvPackage getSql4csvPackage()
  {
    return (Sql4csvPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static Sql4csvPackage getPackage()
  {
    return Sql4csvPackage.eINSTANCE;
  }

} //Sql4csvFactoryImpl
