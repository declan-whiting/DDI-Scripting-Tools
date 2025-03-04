/**
 */
package base;

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
 * @see base.Base_Factory
 * @model kind="package"
 * @generated
 */
public interface Base_Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "base";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://omg.sacm/2.0/base";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "base_";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Base_Package eINSTANCE = base.impl.Base_PackageImpl.init();

	/**
	 * The meta object id for the '{@link base.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see base.impl.ElementImpl
	 * @see base.impl.Base_PackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link base.impl.LangStringImpl <em>Lang String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see base.impl.LangStringImpl
	 * @see base.impl.Base_PackageImpl#getLangString()
	 * @generated
	 */
	int LANG_STRING = 1;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANG_STRING__LANG = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANG_STRING__CONTENT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Lang String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANG_STRING_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Lang String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANG_STRING_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link base.impl.ExpressionLangStringImpl <em>Expression Lang String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see base.impl.ExpressionLangStringImpl
	 * @see base.impl.Base_PackageImpl#getExpressionLangString()
	 * @generated
	 */
	int EXPRESSION_LANG_STRING = 2;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_LANG_STRING__LANG = LANG_STRING__LANG;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_LANG_STRING__CONTENT = LANG_STRING__CONTENT;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_LANG_STRING__EXPRESSION = LANG_STRING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression Lang String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_LANG_STRING_FEATURE_COUNT = LANG_STRING_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Expression Lang String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_LANG_STRING_OPERATION_COUNT = LANG_STRING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link base.impl.MultiLangStringImpl <em>Multi Lang String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see base.impl.MultiLangStringImpl
	 * @see base.impl.Base_PackageImpl#getMultiLangString()
	 * @generated
	 */
	int MULTI_LANG_STRING = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LANG_STRING__VALUE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multi Lang String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LANG_STRING_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Multi Lang String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LANG_STRING_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link base.impl.SACMElementImpl <em>SACM Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see base.impl.SACMElementImpl
	 * @see base.impl.Base_PackageImpl#getSACMElement()
	 * @generated
	 */
	int SACM_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SACM_ELEMENT__GID = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SACM_ELEMENT__IS_CITATION = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SACM_ELEMENT__IS_ABSTRACT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SACM_ELEMENT__CITED_ELEMENT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SACM_ELEMENT__ABSTRACT_FORM = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>SACM Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SACM_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>SACM Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SACM_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link base.impl.UtilityElementImpl <em>Utility Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see base.impl.UtilityElementImpl
	 * @see base.impl.Base_PackageImpl#getUtilityElement()
	 * @generated
	 */
	int UTILITY_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILITY_ELEMENT__GID = SACM_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILITY_ELEMENT__IS_CITATION = SACM_ELEMENT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILITY_ELEMENT__IS_ABSTRACT = SACM_ELEMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILITY_ELEMENT__CITED_ELEMENT = SACM_ELEMENT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILITY_ELEMENT__ABSTRACT_FORM = SACM_ELEMENT__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILITY_ELEMENT__CONTENT = SACM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Utility Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILITY_ELEMENT_FEATURE_COUNT = SACM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Utility Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILITY_ELEMENT_OPERATION_COUNT = SACM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link base.impl.DescriptionImpl <em>Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see base.impl.DescriptionImpl
	 * @see base.impl.Base_PackageImpl#getDescription()
	 * @generated
	 */
	int DESCRIPTION = 6;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__GID = UTILITY_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__IS_CITATION = UTILITY_ELEMENT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__IS_ABSTRACT = UTILITY_ELEMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__CITED_ELEMENT = UTILITY_ELEMENT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__ABSTRACT_FORM = UTILITY_ELEMENT__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__CONTENT = UTILITY_ELEMENT__CONTENT;

	/**
	 * The number of structural features of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_FEATURE_COUNT = UTILITY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_OPERATION_COUNT = UTILITY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link base.impl.ImplementationConstraintImpl <em>Implementation Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see base.impl.ImplementationConstraintImpl
	 * @see base.impl.Base_PackageImpl#getImplementationConstraint()
	 * @generated
	 */
	int IMPLEMENTATION_CONSTRAINT = 7;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_CONSTRAINT__GID = UTILITY_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_CONSTRAINT__IS_CITATION = UTILITY_ELEMENT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_CONSTRAINT__IS_ABSTRACT = UTILITY_ELEMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_CONSTRAINT__CITED_ELEMENT = UTILITY_ELEMENT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_CONSTRAINT__ABSTRACT_FORM = UTILITY_ELEMENT__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_CONSTRAINT__CONTENT = UTILITY_ELEMENT__CONTENT;

	/**
	 * The number of structural features of the '<em>Implementation Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_CONSTRAINT_FEATURE_COUNT = UTILITY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Implementation Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_CONSTRAINT_OPERATION_COUNT = UTILITY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link base.impl.NoteImpl <em>Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see base.impl.NoteImpl
	 * @see base.impl.Base_PackageImpl#getNote()
	 * @generated
	 */
	int NOTE = 8;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__GID = UTILITY_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__IS_CITATION = UTILITY_ELEMENT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__IS_ABSTRACT = UTILITY_ELEMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__CITED_ELEMENT = UTILITY_ELEMENT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__ABSTRACT_FORM = UTILITY_ELEMENT__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__CONTENT = UTILITY_ELEMENT__CONTENT;

	/**
	 * The number of structural features of the '<em>Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_FEATURE_COUNT = UTILITY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_OPERATION_COUNT = UTILITY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link base.impl.TaggedValueImpl <em>Tagged Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see base.impl.TaggedValueImpl
	 * @see base.impl.Base_PackageImpl#getTaggedValue()
	 * @generated
	 */
	int TAGGED_VALUE = 9;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_VALUE__GID = UTILITY_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_VALUE__IS_CITATION = UTILITY_ELEMENT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_VALUE__IS_ABSTRACT = UTILITY_ELEMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_VALUE__CITED_ELEMENT = UTILITY_ELEMENT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_VALUE__ABSTRACT_FORM = UTILITY_ELEMENT__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_VALUE__CONTENT = UTILITY_ELEMENT__CONTENT;

	/**
	 * The feature id for the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_VALUE__KEY = UTILITY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tagged Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_VALUE_FEATURE_COUNT = UTILITY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Tagged Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_VALUE_OPERATION_COUNT = UTILITY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link base.impl.ModelElementImpl <em>Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see base.impl.ModelElementImpl
	 * @see base.impl.Base_PackageImpl#getModelElement()
	 * @generated
	 */
	int MODEL_ELEMENT = 10;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__GID = SACM_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__IS_CITATION = SACM_ELEMENT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__IS_ABSTRACT = SACM_ELEMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__CITED_ELEMENT = SACM_ELEMENT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__ABSTRACT_FORM = SACM_ELEMENT__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__NAME = SACM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__DESCRIPTION = SACM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__IMPLEMENTATION_CONSTRAINT = SACM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__NOTE = SACM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__TAGGED_VALUE = SACM_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_FEATURE_COUNT = SACM_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_OPERATION_COUNT = SACM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link base.impl.ArtifactElementImpl <em>Artifact Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see base.impl.ArtifactElementImpl
	 * @see base.impl.Base_PackageImpl#getArtifactElement()
	 * @generated
	 */
	int ARTIFACT_ELEMENT = 11;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_ELEMENT__GID = MODEL_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_ELEMENT__IS_CITATION = MODEL_ELEMENT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_ELEMENT__IS_ABSTRACT = MODEL_ELEMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_ELEMENT__CITED_ELEMENT = MODEL_ELEMENT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_ELEMENT__ABSTRACT_FORM = MODEL_ELEMENT__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_ELEMENT__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_ELEMENT__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_ELEMENT__IMPLEMENTATION_CONSTRAINT = MODEL_ELEMENT__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_ELEMENT__NOTE = MODEL_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_ELEMENT__TAGGED_VALUE = MODEL_ELEMENT__TAGGED_VALUE;

	/**
	 * The number of structural features of the '<em>Artifact Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_ELEMENT_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 0;


	/**
	 * The number of operations of the '<em>Artifact Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_ELEMENT_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link base.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see base.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for class '{@link base.LangString <em>Lang String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lang String</em>'.
	 * @see base.LangString
	 * @generated
	 */
	EClass getLangString();

	/**
	 * Returns the meta object for the attribute '{@link base.LangString#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see base.LangString#getLang()
	 * @see #getLangString()
	 * @generated
	 */
	EAttribute getLangString_Lang();

	/**
	 * Returns the meta object for the attribute '{@link base.LangString#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see base.LangString#getContent()
	 * @see #getLangString()
	 * @generated
	 */
	EAttribute getLangString_Content();

	/**
	 * Returns the meta object for class '{@link base.ExpressionLangString <em>Expression Lang String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Lang String</em>'.
	 * @see base.ExpressionLangString
	 * @generated
	 */
	EClass getExpressionLangString();

	/**
	 * Returns the meta object for the containment reference '{@link base.ExpressionLangString#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see base.ExpressionLangString#getExpression()
	 * @see #getExpressionLangString()
	 * @generated
	 */
	EReference getExpressionLangString_Expression();

	/**
	 * Returns the meta object for class '{@link base.MultiLangString <em>Multi Lang String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Lang String</em>'.
	 * @see base.MultiLangString
	 * @generated
	 */
	EClass getMultiLangString();

	/**
	 * Returns the meta object for the containment reference list '{@link base.MultiLangString#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see base.MultiLangString#getValue()
	 * @see #getMultiLangString()
	 * @generated
	 */
	EReference getMultiLangString_Value();

	/**
	 * Returns the meta object for class '{@link base.SACMElement <em>SACM Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SACM Element</em>'.
	 * @see base.SACMElement
	 * @generated
	 */
	EClass getSACMElement();

	/**
	 * Returns the meta object for the attribute '{@link base.SACMElement#getGid <em>Gid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gid</em>'.
	 * @see base.SACMElement#getGid()
	 * @see #getSACMElement()
	 * @generated
	 */
	EAttribute getSACMElement_Gid();

	/**
	 * Returns the meta object for the attribute '{@link base.SACMElement#isIsCitation <em>Is Citation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Citation</em>'.
	 * @see base.SACMElement#isIsCitation()
	 * @see #getSACMElement()
	 * @generated
	 */
	EAttribute getSACMElement_IsCitation();

	/**
	 * Returns the meta object for the attribute '{@link base.SACMElement#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see base.SACMElement#isIsAbstract()
	 * @see #getSACMElement()
	 * @generated
	 */
	EAttribute getSACMElement_IsAbstract();

	/**
	 * Returns the meta object for the reference '{@link base.SACMElement#getCitedElement <em>Cited Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cited Element</em>'.
	 * @see base.SACMElement#getCitedElement()
	 * @see #getSACMElement()
	 * @generated
	 */
	EReference getSACMElement_CitedElement();

	/**
	 * Returns the meta object for the reference '{@link base.SACMElement#getAbstractForm <em>Abstract Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Abstract Form</em>'.
	 * @see base.SACMElement#getAbstractForm()
	 * @see #getSACMElement()
	 * @generated
	 */
	EReference getSACMElement_AbstractForm();

	/**
	 * Returns the meta object for class '{@link base.UtilityElement <em>Utility Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Utility Element</em>'.
	 * @see base.UtilityElement
	 * @generated
	 */
	EClass getUtilityElement();

	/**
	 * Returns the meta object for the containment reference '{@link base.UtilityElement#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see base.UtilityElement#getContent()
	 * @see #getUtilityElement()
	 * @generated
	 */
	EReference getUtilityElement_Content();

	/**
	 * Returns the meta object for class '{@link base.Description <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description</em>'.
	 * @see base.Description
	 * @generated
	 */
	EClass getDescription();

	/**
	 * Returns the meta object for class '{@link base.ImplementationConstraint <em>Implementation Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implementation Constraint</em>'.
	 * @see base.ImplementationConstraint
	 * @generated
	 */
	EClass getImplementationConstraint();

	/**
	 * Returns the meta object for class '{@link base.Note <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Note</em>'.
	 * @see base.Note
	 * @generated
	 */
	EClass getNote();

	/**
	 * Returns the meta object for class '{@link base.TaggedValue <em>Tagged Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tagged Value</em>'.
	 * @see base.TaggedValue
	 * @generated
	 */
	EClass getTaggedValue();

	/**
	 * Returns the meta object for the containment reference '{@link base.TaggedValue#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key</em>'.
	 * @see base.TaggedValue#getKey()
	 * @see #getTaggedValue()
	 * @generated
	 */
	EReference getTaggedValue_Key();

	/**
	 * Returns the meta object for class '{@link base.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element</em>'.
	 * @see base.ModelElement
	 * @generated
	 */
	EClass getModelElement();

	/**
	 * Returns the meta object for the containment reference '{@link base.ModelElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see base.ModelElement#getName()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_Name();

	/**
	 * Returns the meta object for the containment reference '{@link base.ModelElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see base.ModelElement#getDescription()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link base.ModelElement#getImplementationConstraint <em>Implementation Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Implementation Constraint</em>'.
	 * @see base.ModelElement#getImplementationConstraint()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_ImplementationConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link base.ModelElement#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Note</em>'.
	 * @see base.ModelElement#getNote()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_Note();

	/**
	 * Returns the meta object for the containment reference list '{@link base.ModelElement#getTaggedValue <em>Tagged Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tagged Value</em>'.
	 * @see base.ModelElement#getTaggedValue()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_TaggedValue();

	/**
	 * Returns the meta object for class '{@link base.ArtifactElement <em>Artifact Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact Element</em>'.
	 * @see base.ArtifactElement
	 * @generated
	 */
	EClass getArtifactElement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Base_Factory getBase_Factory();

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
	interface Literals {
		/**
		 * The meta object literal for the '{@link base.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see base.impl.ElementImpl
		 * @see base.impl.Base_PackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '{@link base.impl.LangStringImpl <em>Lang String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see base.impl.LangStringImpl
		 * @see base.impl.Base_PackageImpl#getLangString()
		 * @generated
		 */
		EClass LANG_STRING = eINSTANCE.getLangString();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANG_STRING__LANG = eINSTANCE.getLangString_Lang();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANG_STRING__CONTENT = eINSTANCE.getLangString_Content();

		/**
		 * The meta object literal for the '{@link base.impl.ExpressionLangStringImpl <em>Expression Lang String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see base.impl.ExpressionLangStringImpl
		 * @see base.impl.Base_PackageImpl#getExpressionLangString()
		 * @generated
		 */
		EClass EXPRESSION_LANG_STRING = eINSTANCE.getExpressionLangString();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_LANG_STRING__EXPRESSION = eINSTANCE.getExpressionLangString_Expression();

		/**
		 * The meta object literal for the '{@link base.impl.MultiLangStringImpl <em>Multi Lang String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see base.impl.MultiLangStringImpl
		 * @see base.impl.Base_PackageImpl#getMultiLangString()
		 * @generated
		 */
		EClass MULTI_LANG_STRING = eINSTANCE.getMultiLangString();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_LANG_STRING__VALUE = eINSTANCE.getMultiLangString_Value();

		/**
		 * The meta object literal for the '{@link base.impl.SACMElementImpl <em>SACM Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see base.impl.SACMElementImpl
		 * @see base.impl.Base_PackageImpl#getSACMElement()
		 * @generated
		 */
		EClass SACM_ELEMENT = eINSTANCE.getSACMElement();

		/**
		 * The meta object literal for the '<em><b>Gid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SACM_ELEMENT__GID = eINSTANCE.getSACMElement_Gid();

		/**
		 * The meta object literal for the '<em><b>Is Citation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SACM_ELEMENT__IS_CITATION = eINSTANCE.getSACMElement_IsCitation();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SACM_ELEMENT__IS_ABSTRACT = eINSTANCE.getSACMElement_IsAbstract();

		/**
		 * The meta object literal for the '<em><b>Cited Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SACM_ELEMENT__CITED_ELEMENT = eINSTANCE.getSACMElement_CitedElement();

		/**
		 * The meta object literal for the '<em><b>Abstract Form</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SACM_ELEMENT__ABSTRACT_FORM = eINSTANCE.getSACMElement_AbstractForm();

		/**
		 * The meta object literal for the '{@link base.impl.UtilityElementImpl <em>Utility Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see base.impl.UtilityElementImpl
		 * @see base.impl.Base_PackageImpl#getUtilityElement()
		 * @generated
		 */
		EClass UTILITY_ELEMENT = eINSTANCE.getUtilityElement();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UTILITY_ELEMENT__CONTENT = eINSTANCE.getUtilityElement_Content();

		/**
		 * The meta object literal for the '{@link base.impl.DescriptionImpl <em>Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see base.impl.DescriptionImpl
		 * @see base.impl.Base_PackageImpl#getDescription()
		 * @generated
		 */
		EClass DESCRIPTION = eINSTANCE.getDescription();

		/**
		 * The meta object literal for the '{@link base.impl.ImplementationConstraintImpl <em>Implementation Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see base.impl.ImplementationConstraintImpl
		 * @see base.impl.Base_PackageImpl#getImplementationConstraint()
		 * @generated
		 */
		EClass IMPLEMENTATION_CONSTRAINT = eINSTANCE.getImplementationConstraint();

		/**
		 * The meta object literal for the '{@link base.impl.NoteImpl <em>Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see base.impl.NoteImpl
		 * @see base.impl.Base_PackageImpl#getNote()
		 * @generated
		 */
		EClass NOTE = eINSTANCE.getNote();

		/**
		 * The meta object literal for the '{@link base.impl.TaggedValueImpl <em>Tagged Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see base.impl.TaggedValueImpl
		 * @see base.impl.Base_PackageImpl#getTaggedValue()
		 * @generated
		 */
		EClass TAGGED_VALUE = eINSTANCE.getTaggedValue();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAGGED_VALUE__KEY = eINSTANCE.getTaggedValue_Key();

		/**
		 * The meta object literal for the '{@link base.impl.ModelElementImpl <em>Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see base.impl.ModelElementImpl
		 * @see base.impl.Base_PackageImpl#getModelElement()
		 * @generated
		 */
		EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT__NAME = eINSTANCE.getModelElement_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT__DESCRIPTION = eINSTANCE.getModelElement_Description();

		/**
		 * The meta object literal for the '<em><b>Implementation Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT__IMPLEMENTATION_CONSTRAINT = eINSTANCE.getModelElement_ImplementationConstraint();

		/**
		 * The meta object literal for the '<em><b>Note</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT__NOTE = eINSTANCE.getModelElement_Note();

		/**
		 * The meta object literal for the '<em><b>Tagged Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT__TAGGED_VALUE = eINSTANCE.getModelElement_TaggedValue();

		/**
		 * The meta object literal for the '{@link base.impl.ArtifactElementImpl <em>Artifact Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see base.impl.ArtifactElementImpl
		 * @see base.impl.Base_PackageImpl#getArtifactElement()
		 * @generated
		 */
		EClass ARTIFACT_ELEMENT = eINSTANCE.getArtifactElement();

	}

} //Base_Package
