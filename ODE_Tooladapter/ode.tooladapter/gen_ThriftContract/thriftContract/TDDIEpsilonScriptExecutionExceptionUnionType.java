/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thriftContract;


public enum TDDIEpsilonScriptExecutionExceptionUnionType implements org.apache.thrift.TEnum {
  ESEEUTEpsilonScriptExecutionException(0),
  ESEEUTValidationFailedException(1);

  private final int value;

  private TDDIEpsilonScriptExecutionExceptionUnionType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static TDDIEpsilonScriptExecutionExceptionUnionType findByValue(int value) { 
    switch (value) {
      case 0:
        return ESEEUTEpsilonScriptExecutionException;
      case 1:
        return ESEEUTValidationFailedException;
      default:
        return null;
    }
  }
}