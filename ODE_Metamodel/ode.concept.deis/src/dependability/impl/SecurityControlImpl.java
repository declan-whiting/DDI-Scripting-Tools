/**
 */
package dependability.impl;

import dependability.Dependability_Package;
import dependability.SecurityApplicationType;
import dependability.SecurityControl;
import dependability.Vulnerability;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dependability.impl.SecurityControlImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link dependability.impl.SecurityControlImpl#getType <em>Type</em>}</li>
 *   <li>{@link dependability.impl.SecurityControlImpl#getVulnerabilities <em>Vulnerabilities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityControlImpl extends MeasureImpl implements SecurityControl {
	/**
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected String category = CATEGORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final SecurityApplicationType TYPE_EDEFAULT = SecurityApplicationType.PREVENTIVE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected SecurityApplicationType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVulnerabilities() <em>Vulnerabilities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVulnerabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<Vulnerability> vulnerabilities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityControlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dependability_Package.Literals.SECURITY_CONTROL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(String newCategory) {
		String oldCategory = category;
		category = newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dependability_Package.SECURITY_CONTROL__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityApplicationType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(SecurityApplicationType newType) {
		SecurityApplicationType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dependability_Package.SECURITY_CONTROL__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Vulnerability> getVulnerabilities() {
		if (vulnerabilities == null) {
			vulnerabilities = new EObjectResolvingEList<Vulnerability>(Vulnerability.class, this, Dependability_Package.SECURITY_CONTROL__VULNERABILITIES);
		}
		return vulnerabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Dependability_Package.SECURITY_CONTROL__CATEGORY:
				return getCategory();
			case Dependability_Package.SECURITY_CONTROL__TYPE:
				return getType();
			case Dependability_Package.SECURITY_CONTROL__VULNERABILITIES:
				return getVulnerabilities();
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
			case Dependability_Package.SECURITY_CONTROL__CATEGORY:
				setCategory((String)newValue);
				return;
			case Dependability_Package.SECURITY_CONTROL__TYPE:
				setType((SecurityApplicationType)newValue);
				return;
			case Dependability_Package.SECURITY_CONTROL__VULNERABILITIES:
				getVulnerabilities().clear();
				getVulnerabilities().addAll((Collection<? extends Vulnerability>)newValue);
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
			case Dependability_Package.SECURITY_CONTROL__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
				return;
			case Dependability_Package.SECURITY_CONTROL__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case Dependability_Package.SECURITY_CONTROL__VULNERABILITIES:
				getVulnerabilities().clear();
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
			case Dependability_Package.SECURITY_CONTROL__CATEGORY:
				return CATEGORY_EDEFAULT == null ? category != null : !CATEGORY_EDEFAULT.equals(category);
			case Dependability_Package.SECURITY_CONTROL__TYPE:
				return type != TYPE_EDEFAULT;
			case Dependability_Package.SECURITY_CONTROL__VULNERABILITIES:
				return vulnerabilities != null && !vulnerabilities.isEmpty();
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
		result.append(" (category: ");
		result.append(category);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //SecurityControlImpl
