/**
 */
package architecture;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Safety Related System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link architecture.SafetyRelatedSystem#getSafeState <em>Safe State</em>}</li>
 * </ul>
 *
 * @see architecture.Architecture_Package#getSafetyRelatedSystem()
 * @model
 * @generated
 */
public interface SafetyRelatedSystem extends architecture.System {
	/**
	 * Returns the value of the '<em><b>Safe State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Safe State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Safe State</em>' attribute.
	 * @see #setSafeState(String)
	 * @see architecture.Architecture_Package#getSafetyRelatedSystem_SafeState()
	 * @model
	 * @generated
	 */
	String getSafeState();

	/**
	 * Sets the value of the '{@link architecture.SafetyRelatedSystem#getSafeState <em>Safe State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Safe State</em>' attribute.
	 * @see #getSafeState()
	 * @generated
	 */
	void setSafeState(String value);

} // SafetyRelatedSystem
