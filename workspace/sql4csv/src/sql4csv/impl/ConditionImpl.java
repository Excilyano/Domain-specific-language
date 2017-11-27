/**
 */
package sql4csv.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import sql4csv.Condition;
import sql4csv.Sql4csvPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sql4csv.impl.ConditionImpl#getAtt1 <em>Att1</em>}</li>
 *   <li>{@link sql4csv.impl.ConditionImpl#getAtt2 <em>Att2</em>}</li>
 *   <li>{@link sql4csv.impl.ConditionImpl#getComparateur <em>Comparateur</em>}</li>
 *   <li>{@link sql4csv.impl.ConditionImpl#getConditions <em>Conditions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionImpl extends MinimalEObjectImpl.Container implements Condition {
	/**
	 * The default value of the '{@link #getAtt1() <em>Att1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtt1()
	 * @generated
	 * @ordered
	 */
	protected static final String ATT1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAtt1() <em>Att1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtt1()
	 * @generated
	 * @ordered
	 */
	protected String att1 = ATT1_EDEFAULT;

	/**
	 * The default value of the '{@link #getAtt2() <em>Att2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtt2()
	 * @generated
	 * @ordered
	 */
	protected static final String ATT2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAtt2() <em>Att2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtt2()
	 * @generated
	 * @ordered
	 */
	protected String att2 = ATT2_EDEFAULT;

	/**
	 * The default value of the '{@link #getComparateur() <em>Comparateur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparateur()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPARATEUR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComparateur() <em>Comparateur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparateur()
	 * @generated
	 * @ordered
	 */
	protected String comparateur = COMPARATEUR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConditions() <em>Conditions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions()
	 * @generated
	 * @ordered
	 */
	protected Condition conditions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Sql4csvPackage.Literals.CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAtt1() {
		return att1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAtt1(String newAtt1) {
		String oldAtt1 = att1;
		att1 = newAtt1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sql4csvPackage.CONDITION__ATT1, oldAtt1, att1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAtt2() {
		return att2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAtt2(String newAtt2) {
		String oldAtt2 = att2;
		att2 = newAtt2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sql4csvPackage.CONDITION__ATT2, oldAtt2, att2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComparateur() {
		return comparateur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComparateur(String newComparateur) {
		String oldComparateur = comparateur;
		comparateur = newComparateur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sql4csvPackage.CONDITION__COMPARATEUR, oldComparateur, comparateur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getConditions() {
		if (conditions != null && conditions.eIsProxy()) {
			InternalEObject oldConditions = (InternalEObject)conditions;
			conditions = (Condition)eResolveProxy(oldConditions);
			if (conditions != oldConditions) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Sql4csvPackage.CONDITION__CONDITIONS, oldConditions, conditions));
			}
		}
		return conditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition basicGetConditions() {
		return conditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditions(Condition newConditions) {
		Condition oldConditions = conditions;
		conditions = newConditions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sql4csvPackage.CONDITION__CONDITIONS, oldConditions, conditions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Sql4csvPackage.CONDITION__ATT1:
				return getAtt1();
			case Sql4csvPackage.CONDITION__ATT2:
				return getAtt2();
			case Sql4csvPackage.CONDITION__COMPARATEUR:
				return getComparateur();
			case Sql4csvPackage.CONDITION__CONDITIONS:
				if (resolve) return getConditions();
				return basicGetConditions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Sql4csvPackage.CONDITION__ATT1:
				setAtt1((String)newValue);
				return;
			case Sql4csvPackage.CONDITION__ATT2:
				setAtt2((String)newValue);
				return;
			case Sql4csvPackage.CONDITION__COMPARATEUR:
				setComparateur((String)newValue);
				return;
			case Sql4csvPackage.CONDITION__CONDITIONS:
				setConditions((Condition)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Sql4csvPackage.CONDITION__ATT1:
				setAtt1(ATT1_EDEFAULT);
				return;
			case Sql4csvPackage.CONDITION__ATT2:
				setAtt2(ATT2_EDEFAULT);
				return;
			case Sql4csvPackage.CONDITION__COMPARATEUR:
				setComparateur(COMPARATEUR_EDEFAULT);
				return;
			case Sql4csvPackage.CONDITION__CONDITIONS:
				setConditions((Condition)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Sql4csvPackage.CONDITION__ATT1:
				return ATT1_EDEFAULT == null ? att1 != null : !ATT1_EDEFAULT.equals(att1);
			case Sql4csvPackage.CONDITION__ATT2:
				return ATT2_EDEFAULT == null ? att2 != null : !ATT2_EDEFAULT.equals(att2);
			case Sql4csvPackage.CONDITION__COMPARATEUR:
				return COMPARATEUR_EDEFAULT == null ? comparateur != null : !COMPARATEUR_EDEFAULT.equals(comparateur);
			case Sql4csvPackage.CONDITION__CONDITIONS:
				return conditions != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (att1: ");
		result.append(att1);
		result.append(", att2: ");
		result.append(att2);
		result.append(", comparateur: ");
		result.append(comparateur);
		result.append(')');
		return result.toString();
	}

} //ConditionImpl
