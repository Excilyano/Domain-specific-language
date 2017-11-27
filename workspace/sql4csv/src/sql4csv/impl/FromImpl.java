/**
 */
package sql4csv.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import sql4csv.Condition;
import sql4csv.From;
import sql4csv.Sql4csvPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>From</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sql4csv.impl.FromImpl#getTables <em>Tables</em>}</li>
 *   <li>{@link sql4csv.impl.FromImpl#getFiltre <em>Filtre</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FromImpl extends MinimalEObjectImpl.Container implements From {
	/**
	 * The cached value of the '{@link #getTables() <em>Tables</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTables()
	 * @generated
	 * @ordered
	 */
	protected EList<String> tables;

	/**
	 * The cached value of the '{@link #getFiltre() <em>Filtre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiltre()
	 * @generated
	 * @ordered
	 */
	protected Condition filtre;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FromImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Sql4csvPackage.Literals.FROM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getTables() {
		if (tables == null) {
			tables = new EDataTypeUniqueEList<String>(String.class, this, Sql4csvPackage.FROM__TABLES);
		}
		return tables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getFiltre() {
		return filtre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFiltre(Condition newFiltre, NotificationChain msgs) {
		Condition oldFiltre = filtre;
		filtre = newFiltre;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Sql4csvPackage.FROM__FILTRE, oldFiltre, newFiltre);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFiltre(Condition newFiltre) {
		if (newFiltre != filtre) {
			NotificationChain msgs = null;
			if (filtre != null)
				msgs = ((InternalEObject)filtre).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Sql4csvPackage.FROM__FILTRE, null, msgs);
			if (newFiltre != null)
				msgs = ((InternalEObject)newFiltre).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Sql4csvPackage.FROM__FILTRE, null, msgs);
			msgs = basicSetFiltre(newFiltre, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sql4csvPackage.FROM__FILTRE, newFiltre, newFiltre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Sql4csvPackage.FROM__FILTRE:
				return basicSetFiltre(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Sql4csvPackage.FROM__TABLES:
				return getTables();
			case Sql4csvPackage.FROM__FILTRE:
				return getFiltre();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Sql4csvPackage.FROM__TABLES:
				getTables().clear();
				getTables().addAll((Collection<? extends String>)newValue);
				return;
			case Sql4csvPackage.FROM__FILTRE:
				setFiltre((Condition)newValue);
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
			case Sql4csvPackage.FROM__TABLES:
				getTables().clear();
				return;
			case Sql4csvPackage.FROM__FILTRE:
				setFiltre((Condition)null);
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
			case Sql4csvPackage.FROM__TABLES:
				return tables != null && !tables.isEmpty();
			case Sql4csvPackage.FROM__FILTRE:
				return filtre != null;
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
		result.append(" (tables: ");
		result.append(tables);
		result.append(')');
		return result.toString();
	}

} //FromImpl
