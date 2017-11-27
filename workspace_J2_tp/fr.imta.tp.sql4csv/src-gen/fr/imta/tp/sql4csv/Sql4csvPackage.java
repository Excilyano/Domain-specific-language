/**
 */
package fr.imta.tp.sql4csv;

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
 * @see fr.imta.tp.sql4csv.Sql4csvFactory
 * @model kind="package"
 * @generated
 */
public interface Sql4csvPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "sql4csv";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.imta.fr/tp/Sql4csv";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "sql4csv";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  Sql4csvPackage eINSTANCE = fr.imta.tp.sql4csv.impl.Sql4csvPackageImpl.init();

  /**
   * The meta object id for the '{@link fr.imta.tp.sql4csv.impl.SQL4CSVImpl <em>SQL4CSV</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imta.tp.sql4csv.impl.SQL4CSVImpl
   * @see fr.imta.tp.sql4csv.impl.Sql4csvPackageImpl#getSQL4CSV()
   * @generated
   */
  int SQL4CSV = 0;

  /**
   * The feature id for the '<em><b>Program</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SQL4CSV__PROGRAM = 0;

  /**
   * The number of structural features of the '<em>SQL4CSV</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SQL4CSV_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.imta.tp.sql4csv.impl.ProgramImpl <em>Program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imta.tp.sql4csv.impl.ProgramImpl
   * @see fr.imta.tp.sql4csv.impl.Sql4csvPackageImpl#getProgram()
   * @generated
   */
  int PROGRAM = 1;

  /**
   * The feature id for the '<em><b>Queries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__QUERIES = 0;

  /**
   * The number of structural features of the '<em>Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.imta.tp.sql4csv.impl.QueryImpl <em>Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imta.tp.sql4csv.impl.QueryImpl
   * @see fr.imta.tp.sql4csv.impl.Sql4csvPackageImpl#getQuery()
   * @generated
   */
  int QUERY = 2;

  /**
   * The feature id for the '<em><b>Column</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY__COLUMN = 0;

  /**
   * The feature id for the '<em><b>Columns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY__COLUMNS = 1;

  /**
   * The feature id for the '<em><b>Table</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY__TABLE = 2;

  /**
   * The feature id for the '<em><b>Tables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY__TABLES = 3;

  /**
   * The feature id for the '<em><b>Conditions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY__CONDITIONS = 4;

  /**
   * The number of structural features of the '<em>Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link fr.imta.tp.sql4csv.impl.ColumnImpl <em>Column</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imta.tp.sql4csv.impl.ColumnImpl
   * @see fr.imta.tp.sql4csv.impl.Sql4csvPackageImpl#getColumn()
   * @generated
   */
  int COLUMN = 3;

  /**
   * The feature id for the '<em><b>Table</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN__TABLE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN__NAME = 1;

  /**
   * The number of structural features of the '<em>Column</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.imta.tp.sql4csv.impl.TableImpl <em>Table</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imta.tp.sql4csv.impl.TableImpl
   * @see fr.imta.tp.sql4csv.impl.Sql4csvPackageImpl#getTable()
   * @generated
   */
  int TABLE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE__NAME = 0;

  /**
   * The number of structural features of the '<em>Table</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.imta.tp.sql4csv.impl.ConditionImpl <em>Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imta.tp.sql4csv.impl.ConditionImpl
   * @see fr.imta.tp.sql4csv.impl.Sql4csvPackageImpl#getCondition()
   * @generated
   */
  int CONDITION = 5;

  /**
   * The number of structural features of the '<em>Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link fr.imta.tp.sql4csv.impl.EqualityImpl <em>Equality</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imta.tp.sql4csv.impl.EqualityImpl
   * @see fr.imta.tp.sql4csv.impl.Sql4csvPackageImpl#getEquality()
   * @generated
   */
  int EQUALITY = 6;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY__LEFT = CONDITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY__RIGHT = CONDITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Equality</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.imta.tp.sql4csv.impl.BinaryConditionImpl <em>Binary Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imta.tp.sql4csv.impl.BinaryConditionImpl
   * @see fr.imta.tp.sql4csv.impl.Sql4csvPackageImpl#getBinaryCondition()
   * @generated
   */
  int BINARY_CONDITION = 7;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_CONDITION__LEFT = CONDITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_CONDITION__RIGHT = CONDITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Binary Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.imta.tp.sql4csv.impl.ColumnEqualityImpl <em>Column Equality</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imta.tp.sql4csv.impl.ColumnEqualityImpl
   * @see fr.imta.tp.sql4csv.impl.Sql4csvPackageImpl#getColumnEquality()
   * @generated
   */
  int COLUMN_EQUALITY = 8;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_EQUALITY__RIGHT = 0;

  /**
   * The number of structural features of the '<em>Column Equality</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_EQUALITY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.imta.tp.sql4csv.impl.ValueEqualityImpl <em>Value Equality</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imta.tp.sql4csv.impl.ValueEqualityImpl
   * @see fr.imta.tp.sql4csv.impl.Sql4csvPackageImpl#getValueEquality()
   * @generated
   */
  int VALUE_EQUALITY = 9;

  /**
   * The feature id for the '<em><b>Right</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_EQUALITY__RIGHT = 0;

  /**
   * The number of structural features of the '<em>Value Equality</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_EQUALITY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.imta.tp.sql4csv.impl.AndConditionImpl <em>And Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imta.tp.sql4csv.impl.AndConditionImpl
   * @see fr.imta.tp.sql4csv.impl.Sql4csvPackageImpl#getAndCondition()
   * @generated
   */
  int AND_CONDITION = 10;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_CONDITION__LEFT = BINARY_CONDITION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_CONDITION__RIGHT = BINARY_CONDITION__RIGHT;

  /**
   * The number of structural features of the '<em>And Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_CONDITION_FEATURE_COUNT = BINARY_CONDITION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.imta.tp.sql4csv.impl.OrConditionImpl <em>Or Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imta.tp.sql4csv.impl.OrConditionImpl
   * @see fr.imta.tp.sql4csv.impl.Sql4csvPackageImpl#getOrCondition()
   * @generated
   */
  int OR_CONDITION = 11;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_CONDITION__LEFT = BINARY_CONDITION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_CONDITION__RIGHT = BINARY_CONDITION__RIGHT;

  /**
   * The number of structural features of the '<em>Or Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_CONDITION_FEATURE_COUNT = BINARY_CONDITION_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link fr.imta.tp.sql4csv.SQL4CSV <em>SQL4CSV</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SQL4CSV</em>'.
   * @see fr.imta.tp.sql4csv.SQL4CSV
   * @generated
   */
  EClass getSQL4CSV();

  /**
   * Returns the meta object for the containment reference '{@link fr.imta.tp.sql4csv.SQL4CSV#getProgram <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Program</em>'.
   * @see fr.imta.tp.sql4csv.SQL4CSV#getProgram()
   * @see #getSQL4CSV()
   * @generated
   */
  EReference getSQL4CSV_Program();

  /**
   * Returns the meta object for class '{@link fr.imta.tp.sql4csv.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Program</em>'.
   * @see fr.imta.tp.sql4csv.Program
   * @generated
   */
  EClass getProgram();

  /**
   * Returns the meta object for the containment reference list '{@link fr.imta.tp.sql4csv.Program#getQueries <em>Queries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Queries</em>'.
   * @see fr.imta.tp.sql4csv.Program#getQueries()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Queries();

  /**
   * Returns the meta object for class '{@link fr.imta.tp.sql4csv.Query <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Query</em>'.
   * @see fr.imta.tp.sql4csv.Query
   * @generated
   */
  EClass getQuery();

  /**
   * Returns the meta object for the containment reference '{@link fr.imta.tp.sql4csv.Query#getColumn <em>Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Column</em>'.
   * @see fr.imta.tp.sql4csv.Query#getColumn()
   * @see #getQuery()
   * @generated
   */
  EReference getQuery_Column();

  /**
   * Returns the meta object for the containment reference list '{@link fr.imta.tp.sql4csv.Query#getColumns <em>Columns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Columns</em>'.
   * @see fr.imta.tp.sql4csv.Query#getColumns()
   * @see #getQuery()
   * @generated
   */
  EReference getQuery_Columns();

  /**
   * Returns the meta object for the containment reference '{@link fr.imta.tp.sql4csv.Query#getTable <em>Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Table</em>'.
   * @see fr.imta.tp.sql4csv.Query#getTable()
   * @see #getQuery()
   * @generated
   */
  EReference getQuery_Table();

  /**
   * Returns the meta object for the containment reference list '{@link fr.imta.tp.sql4csv.Query#getTables <em>Tables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tables</em>'.
   * @see fr.imta.tp.sql4csv.Query#getTables()
   * @see #getQuery()
   * @generated
   */
  EReference getQuery_Tables();

  /**
   * Returns the meta object for the containment reference '{@link fr.imta.tp.sql4csv.Query#getConditions <em>Conditions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Conditions</em>'.
   * @see fr.imta.tp.sql4csv.Query#getConditions()
   * @see #getQuery()
   * @generated
   */
  EReference getQuery_Conditions();

  /**
   * Returns the meta object for class '{@link fr.imta.tp.sql4csv.Column <em>Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Column</em>'.
   * @see fr.imta.tp.sql4csv.Column
   * @generated
   */
  EClass getColumn();

  /**
   * Returns the meta object for the reference '{@link fr.imta.tp.sql4csv.Column#getTable <em>Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Table</em>'.
   * @see fr.imta.tp.sql4csv.Column#getTable()
   * @see #getColumn()
   * @generated
   */
  EReference getColumn_Table();

  /**
   * Returns the meta object for the attribute '{@link fr.imta.tp.sql4csv.Column#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.imta.tp.sql4csv.Column#getName()
   * @see #getColumn()
   * @generated
   */
  EAttribute getColumn_Name();

  /**
   * Returns the meta object for class '{@link fr.imta.tp.sql4csv.Table <em>Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Table</em>'.
   * @see fr.imta.tp.sql4csv.Table
   * @generated
   */
  EClass getTable();

  /**
   * Returns the meta object for the attribute '{@link fr.imta.tp.sql4csv.Table#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.imta.tp.sql4csv.Table#getName()
   * @see #getTable()
   * @generated
   */
  EAttribute getTable_Name();

  /**
   * Returns the meta object for class '{@link fr.imta.tp.sql4csv.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition</em>'.
   * @see fr.imta.tp.sql4csv.Condition
   * @generated
   */
  EClass getCondition();

  /**
   * Returns the meta object for class '{@link fr.imta.tp.sql4csv.Equality <em>Equality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Equality</em>'.
   * @see fr.imta.tp.sql4csv.Equality
   * @generated
   */
  EClass getEquality();

  /**
   * Returns the meta object for the containment reference '{@link fr.imta.tp.sql4csv.Equality#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see fr.imta.tp.sql4csv.Equality#getLeft()
   * @see #getEquality()
   * @generated
   */
  EReference getEquality_Left();

  /**
   * Returns the meta object for the containment reference '{@link fr.imta.tp.sql4csv.Equality#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see fr.imta.tp.sql4csv.Equality#getRight()
   * @see #getEquality()
   * @generated
   */
  EReference getEquality_Right();

  /**
   * Returns the meta object for class '{@link fr.imta.tp.sql4csv.BinaryCondition <em>Binary Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binary Condition</em>'.
   * @see fr.imta.tp.sql4csv.BinaryCondition
   * @generated
   */
  EClass getBinaryCondition();

  /**
   * Returns the meta object for the containment reference '{@link fr.imta.tp.sql4csv.BinaryCondition#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see fr.imta.tp.sql4csv.BinaryCondition#getLeft()
   * @see #getBinaryCondition()
   * @generated
   */
  EReference getBinaryCondition_Left();

  /**
   * Returns the meta object for the containment reference '{@link fr.imta.tp.sql4csv.BinaryCondition#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see fr.imta.tp.sql4csv.BinaryCondition#getRight()
   * @see #getBinaryCondition()
   * @generated
   */
  EReference getBinaryCondition_Right();

  /**
   * Returns the meta object for class '{@link fr.imta.tp.sql4csv.ColumnEquality <em>Column Equality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Column Equality</em>'.
   * @see fr.imta.tp.sql4csv.ColumnEquality
   * @generated
   */
  EClass getColumnEquality();

  /**
   * Returns the meta object for the containment reference '{@link fr.imta.tp.sql4csv.ColumnEquality#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see fr.imta.tp.sql4csv.ColumnEquality#getRight()
   * @see #getColumnEquality()
   * @generated
   */
  EReference getColumnEquality_Right();

  /**
   * Returns the meta object for class '{@link fr.imta.tp.sql4csv.ValueEquality <em>Value Equality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value Equality</em>'.
   * @see fr.imta.tp.sql4csv.ValueEquality
   * @generated
   */
  EClass getValueEquality();

  /**
   * Returns the meta object for the attribute '{@link fr.imta.tp.sql4csv.ValueEquality#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Right</em>'.
   * @see fr.imta.tp.sql4csv.ValueEquality#getRight()
   * @see #getValueEquality()
   * @generated
   */
  EAttribute getValueEquality_Right();

  /**
   * Returns the meta object for class '{@link fr.imta.tp.sql4csv.AndCondition <em>And Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And Condition</em>'.
   * @see fr.imta.tp.sql4csv.AndCondition
   * @generated
   */
  EClass getAndCondition();

  /**
   * Returns the meta object for class '{@link fr.imta.tp.sql4csv.OrCondition <em>Or Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or Condition</em>'.
   * @see fr.imta.tp.sql4csv.OrCondition
   * @generated
   */
  EClass getOrCondition();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  Sql4csvFactory getSql4csvFactory();

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
     * The meta object literal for the '{@link fr.imta.tp.sql4csv.impl.SQL4CSVImpl <em>SQL4CSV</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imta.tp.sql4csv.impl.SQL4CSVImpl
     * @see fr.imta.tp.sql4csv.impl.Sql4csvPackageImpl#getSQL4CSV()
     * @generated
     */
    EClass SQL4CSV = eINSTANCE.getSQL4CSV();

    /**
     * The meta object literal for the '<em><b>Program</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SQL4CSV__PROGRAM = eINSTANCE.getSQL4CSV_Program();

    /**
     * The meta object literal for the '{@link fr.imta.tp.sql4csv.impl.ProgramImpl <em>Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imta.tp.sql4csv.impl.ProgramImpl
     * @see fr.imta.tp.sql4csv.impl.Sql4csvPackageImpl#getProgram()
     * @generated
     */
    EClass PROGRAM = eINSTANCE.getProgram();

    /**
     * The meta object literal for the '<em><b>Queries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__QUERIES = eINSTANCE.getProgram_Queries();

    /**
     * The meta object literal for the '{@link fr.imta.tp.sql4csv.impl.QueryImpl <em>Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imta.tp.sql4csv.impl.QueryImpl
     * @see fr.imta.tp.sql4csv.impl.Sql4csvPackageImpl#getQuery()
     * @generated
     */
    EClass QUERY = eINSTANCE.getQuery();

    /**
     * The meta object literal for the '<em><b>Column</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUERY__COLUMN = eINSTANCE.getQuery_Column();

    /**
     * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUERY__COLUMNS = eINSTANCE.getQuery_Columns();

    /**
     * The meta object literal for the '<em><b>Table</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUERY__TABLE = eINSTANCE.getQuery_Table();

    /**
     * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUERY__TABLES = eINSTANCE.getQuery_Tables();

    /**
     * The meta object literal for the '<em><b>Conditions</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUERY__CONDITIONS = eINSTANCE.getQuery_Conditions();

    /**
     * The meta object literal for the '{@link fr.imta.tp.sql4csv.impl.ColumnImpl <em>Column</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imta.tp.sql4csv.impl.ColumnImpl
     * @see fr.imta.tp.sql4csv.impl.Sql4csvPackageImpl#getColumn()
     * @generated
     */
    EClass COLUMN = eINSTANCE.getColumn();

    /**
     * The meta object literal for the '<em><b>Table</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLUMN__TABLE = eINSTANCE.getColumn_Table();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLUMN__NAME = eINSTANCE.getColumn_Name();

    /**
     * The meta object literal for the '{@link fr.imta.tp.sql4csv.impl.TableImpl <em>Table</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imta.tp.sql4csv.impl.TableImpl
     * @see fr.imta.tp.sql4csv.impl.Sql4csvPackageImpl#getTable()
     * @generated
     */
    EClass TABLE = eINSTANCE.getTable();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TABLE__NAME = eINSTANCE.getTable_Name();

    /**
     * The meta object literal for the '{@link fr.imta.tp.sql4csv.impl.ConditionImpl <em>Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imta.tp.sql4csv.impl.ConditionImpl
     * @see fr.imta.tp.sql4csv.impl.Sql4csvPackageImpl#getCondition()
     * @generated
     */
    EClass CONDITION = eINSTANCE.getCondition();

    /**
     * The meta object literal for the '{@link fr.imta.tp.sql4csv.impl.EqualityImpl <em>Equality</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imta.tp.sql4csv.impl.EqualityImpl
     * @see fr.imta.tp.sql4csv.impl.Sql4csvPackageImpl#getEquality()
     * @generated
     */
    EClass EQUALITY = eINSTANCE.getEquality();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUALITY__LEFT = eINSTANCE.getEquality_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUALITY__RIGHT = eINSTANCE.getEquality_Right();

    /**
     * The meta object literal for the '{@link fr.imta.tp.sql4csv.impl.BinaryConditionImpl <em>Binary Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imta.tp.sql4csv.impl.BinaryConditionImpl
     * @see fr.imta.tp.sql4csv.impl.Sql4csvPackageImpl#getBinaryCondition()
     * @generated
     */
    EClass BINARY_CONDITION = eINSTANCE.getBinaryCondition();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARY_CONDITION__LEFT = eINSTANCE.getBinaryCondition_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARY_CONDITION__RIGHT = eINSTANCE.getBinaryCondition_Right();

    /**
     * The meta object literal for the '{@link fr.imta.tp.sql4csv.impl.ColumnEqualityImpl <em>Column Equality</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imta.tp.sql4csv.impl.ColumnEqualityImpl
     * @see fr.imta.tp.sql4csv.impl.Sql4csvPackageImpl#getColumnEquality()
     * @generated
     */
    EClass COLUMN_EQUALITY = eINSTANCE.getColumnEquality();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLUMN_EQUALITY__RIGHT = eINSTANCE.getColumnEquality_Right();

    /**
     * The meta object literal for the '{@link fr.imta.tp.sql4csv.impl.ValueEqualityImpl <em>Value Equality</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imta.tp.sql4csv.impl.ValueEqualityImpl
     * @see fr.imta.tp.sql4csv.impl.Sql4csvPackageImpl#getValueEquality()
     * @generated
     */
    EClass VALUE_EQUALITY = eINSTANCE.getValueEquality();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALUE_EQUALITY__RIGHT = eINSTANCE.getValueEquality_Right();

    /**
     * The meta object literal for the '{@link fr.imta.tp.sql4csv.impl.AndConditionImpl <em>And Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imta.tp.sql4csv.impl.AndConditionImpl
     * @see fr.imta.tp.sql4csv.impl.Sql4csvPackageImpl#getAndCondition()
     * @generated
     */
    EClass AND_CONDITION = eINSTANCE.getAndCondition();

    /**
     * The meta object literal for the '{@link fr.imta.tp.sql4csv.impl.OrConditionImpl <em>Or Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imta.tp.sql4csv.impl.OrConditionImpl
     * @see fr.imta.tp.sql4csv.impl.Sql4csvPackageImpl#getOrCondition()
     * @generated
     */
    EClass OR_CONDITION = eINSTANCE.getOrCondition();

  }

} //Sql4csvPackage
