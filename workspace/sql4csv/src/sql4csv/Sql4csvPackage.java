/**
 */
package sql4csv;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see sql4csv.Sql4csvFactory
 * @model kind="package"
 * @generated
 */
public interface Sql4csvPackage extends EPackage {
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
	String eNS_URI = "http://sql4csv/1.0";

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
	Sql4csvPackage eINSTANCE = sql4csv.impl.Sql4csvPackageImpl.init();

	/**
	 * The meta object id for the '{@link sql4csv.impl.SelectImpl <em>Select</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sql4csv.impl.SelectImpl
	 * @see sql4csv.impl.Sql4csvPackageImpl#getSelect()
	 * @generated
	 */
	int SELECT = 0;

	/**
	 * The feature id for the '<em><b>Attributs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__ATTRIBUTS = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__SOURCE = 1;

	/**
	 * The number of structural features of the '<em>Select</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Select</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sql4csv.impl.FromImpl <em>From</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sql4csv.impl.FromImpl
	 * @see sql4csv.impl.Sql4csvPackageImpl#getFrom()
	 * @generated
	 */
	int FROM = 1;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM__TABLES = 0;

	/**
	 * The feature id for the '<em><b>Filtre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM__FILTRE = 1;

	/**
	 * The number of structural features of the '<em>From</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>From</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sql4csv.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sql4csv.impl.ConditionImpl
	 * @see sql4csv.impl.Sql4csvPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 2;

	/**
	 * The feature id for the '<em><b>Att1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__ATT1 = 0;

	/**
	 * The feature id for the '<em><b>Att2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__ATT2 = 1;

	/**
	 * The feature id for the '<em><b>Comparateur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__COMPARATEUR = 2;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__CONDITIONS = 3;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link sql4csv.Select <em>Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Select</em>'.
	 * @see sql4csv.Select
	 * @generated
	 */
	EClass getSelect();

	/**
	 * Returns the meta object for the attribute list '{@link sql4csv.Select#getAttributs <em>Attributs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Attributs</em>'.
	 * @see sql4csv.Select#getAttributs()
	 * @see #getSelect()
	 * @generated
	 */
	EAttribute getSelect_Attributs();

	/**
	 * Returns the meta object for the containment reference '{@link sql4csv.Select#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see sql4csv.Select#getSource()
	 * @see #getSelect()
	 * @generated
	 */
	EReference getSelect_Source();

	/**
	 * Returns the meta object for class '{@link sql4csv.From <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>From</em>'.
	 * @see sql4csv.From
	 * @generated
	 */
	EClass getFrom();

	/**
	 * Returns the meta object for the attribute list '{@link sql4csv.From#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Tables</em>'.
	 * @see sql4csv.From#getTables()
	 * @see #getFrom()
	 * @generated
	 */
	EAttribute getFrom_Tables();

	/**
	 * Returns the meta object for the containment reference '{@link sql4csv.From#getFiltre <em>Filtre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filtre</em>'.
	 * @see sql4csv.From#getFiltre()
	 * @see #getFrom()
	 * @generated
	 */
	EReference getFrom_Filtre();

	/**
	 * Returns the meta object for class '{@link sql4csv.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see sql4csv.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the attribute '{@link sql4csv.Condition#getAtt1 <em>Att1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Att1</em>'.
	 * @see sql4csv.Condition#getAtt1()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Att1();

	/**
	 * Returns the meta object for the attribute '{@link sql4csv.Condition#getAtt2 <em>Att2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Att2</em>'.
	 * @see sql4csv.Condition#getAtt2()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Att2();

	/**
	 * Returns the meta object for the attribute '{@link sql4csv.Condition#getComparateur <em>Comparateur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comparateur</em>'.
	 * @see sql4csv.Condition#getComparateur()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Comparateur();

	/**
	 * Returns the meta object for the reference '{@link sql4csv.Condition#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conditions</em>'.
	 * @see sql4csv.Condition#getConditions()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Conditions();

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
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link sql4csv.impl.SelectImpl <em>Select</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sql4csv.impl.SelectImpl
		 * @see sql4csv.impl.Sql4csvPackageImpl#getSelect()
		 * @generated
		 */
		EClass SELECT = eINSTANCE.getSelect();

		/**
		 * The meta object literal for the '<em><b>Attributs</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECT__ATTRIBUTS = eINSTANCE.getSelect_Attributs();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT__SOURCE = eINSTANCE.getSelect_Source();

		/**
		 * The meta object literal for the '{@link sql4csv.impl.FromImpl <em>From</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sql4csv.impl.FromImpl
		 * @see sql4csv.impl.Sql4csvPackageImpl#getFrom()
		 * @generated
		 */
		EClass FROM = eINSTANCE.getFrom();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FROM__TABLES = eINSTANCE.getFrom_Tables();

		/**
		 * The meta object literal for the '<em><b>Filtre</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FROM__FILTRE = eINSTANCE.getFrom_Filtre();

		/**
		 * The meta object literal for the '{@link sql4csv.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sql4csv.impl.ConditionImpl
		 * @see sql4csv.impl.Sql4csvPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Att1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__ATT1 = eINSTANCE.getCondition_Att1();

		/**
		 * The meta object literal for the '<em><b>Att2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__ATT2 = eINSTANCE.getCondition_Att2();

		/**
		 * The meta object literal for the '<em><b>Comparateur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__COMPARATEUR = eINSTANCE.getCondition_Comparateur();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__CONDITIONS = eINSTANCE.getCondition_Conditions();

	}

} //Sql4csvPackage
