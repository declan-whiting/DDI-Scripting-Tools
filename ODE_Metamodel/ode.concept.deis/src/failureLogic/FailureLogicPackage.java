/**
 */
package failureLogic;

import integration.ODEProductPackage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Failure Logic Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link failureLogic.FailureLogicPackage#getFailureModels <em>Failure Models</em>}</li>
 * </ul>
 *
 * @see failureLogic.FailureLogic_Package#getFailureLogicPackage()
 * @model
 * @generated
 */
public interface FailureLogicPackage extends ODEProductPackage {
	/**
	 * Returns the value of the '<em><b>Failure Models</b></em>' containment reference list.
	 * The list contents are of type {@link failureLogic.FailureModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failure Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure Models</em>' containment reference list.
	 * @see failureLogic.FailureLogic_Package#getFailureLogicPackage_FailureModels()
	 * @model containment="true"
	 * @generated
	 */
	EList<FailureModel> getFailureModels();

} // FailureLogicPackage
