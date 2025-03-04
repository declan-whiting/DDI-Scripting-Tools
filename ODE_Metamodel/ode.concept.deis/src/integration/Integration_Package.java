/**
 */
package integration;

import odeBase.OdeBasePackage;

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
 * @see integration.Integration_Factory
 * @model kind="package"
 * @generated
 */
public interface Integration_Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "integration";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.deis-project.eu/ode/integration";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "integration";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Integration_Package eINSTANCE = integration.impl.Integration_PackageImpl.init();

	/**
	 * The meta object id for the '{@link integration.impl.DDIPackageImpl <em>DDI Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see integration.impl.DDIPackageImpl
	 * @see integration.impl.Integration_PackageImpl#getDDIPackage()
	 * @generated
	 */
	int DDI_PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDI_PACKAGE__KEY_VALUE_MAPS = OdeBasePackage.BASE_ELEMENT__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDI_PACKAGE__ID = OdeBasePackage.BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDI_PACKAGE__NAME = OdeBasePackage.BASE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDI_PACKAGE__DESCRIPTION = OdeBasePackage.BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Ode Product Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDI_PACKAGE__ODE_PRODUCT_PACKAGES = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assurance Case Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDI_PACKAGE__ASSURANCE_CASE_PACKAGES = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>DDI Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDI_PACKAGE_FEATURE_COUNT = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>DDI Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDI_PACKAGE_OPERATION_COUNT = OdeBasePackage.BASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link integration.impl.ODEProductPackageImpl <em>ODE Product Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see integration.impl.ODEProductPackageImpl
	 * @see integration.impl.Integration_PackageImpl#getODEProductPackage()
	 * @generated
	 */
	int ODE_PRODUCT_PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODE_PRODUCT_PACKAGE__KEY_VALUE_MAPS = OdeBasePackage.BASE_ELEMENT__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODE_PRODUCT_PACKAGE__ID = OdeBasePackage.BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODE_PRODUCT_PACKAGE__NAME = OdeBasePackage.BASE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODE_PRODUCT_PACKAGE__DESCRIPTION = OdeBasePackage.BASE_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>ODE Product Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODE_PRODUCT_PACKAGE_FEATURE_COUNT = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ODE Product Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODE_PRODUCT_PACKAGE_OPERATION_COUNT = OdeBasePackage.BASE_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link integration.DDIPackage <em>DDI Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DDI Package</em>'.
	 * @see integration.DDIPackage
	 * @generated
	 */
	EClass getDDIPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link integration.DDIPackage#getOdeProductPackages <em>Ode Product Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ode Product Packages</em>'.
	 * @see integration.DDIPackage#getOdeProductPackages()
	 * @see #getDDIPackage()
	 * @generated
	 */
	EReference getDDIPackage_OdeProductPackages();

	/**
	 * Returns the meta object for the containment reference list '{@link integration.DDIPackage#getAssuranceCasePackages <em>Assurance Case Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assurance Case Packages</em>'.
	 * @see integration.DDIPackage#getAssuranceCasePackages()
	 * @see #getDDIPackage()
	 * @generated
	 */
	EReference getDDIPackage_AssuranceCasePackages();

	/**
	 * Returns the meta object for class '{@link integration.ODEProductPackage <em>ODE Product Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ODE Product Package</em>'.
	 * @see integration.ODEProductPackage
	 * @generated
	 */
	EClass getODEProductPackage();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Integration_Factory getIntegration_Factory();

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
		 * The meta object literal for the '{@link integration.impl.DDIPackageImpl <em>DDI Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see integration.impl.DDIPackageImpl
		 * @see integration.impl.Integration_PackageImpl#getDDIPackage()
		 * @generated
		 */
		EClass DDI_PACKAGE = eINSTANCE.getDDIPackage();

		/**
		 * The meta object literal for the '<em><b>Ode Product Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDI_PACKAGE__ODE_PRODUCT_PACKAGES = eINSTANCE.getDDIPackage_OdeProductPackages();

		/**
		 * The meta object literal for the '<em><b>Assurance Case Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDI_PACKAGE__ASSURANCE_CASE_PACKAGES = eINSTANCE.getDDIPackage_AssuranceCasePackages();

		/**
		 * The meta object literal for the '{@link integration.impl.ODEProductPackageImpl <em>ODE Product Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see integration.impl.ODEProductPackageImpl
		 * @see integration.impl.Integration_PackageImpl#getODEProductPackage()
		 * @generated
		 */
		EClass ODE_PRODUCT_PACKAGE = eINSTANCE.getODEProductPackage();

	}

} //Integration_Package
