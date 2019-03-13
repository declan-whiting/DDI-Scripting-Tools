/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thriftContract;


public enum TDDITimeUnit implements org.apache.thrift.TEnum {
  TUMillisecond(0),
  TUSecond(1),
  TUMinute(2),
  TUHour(3),
  TUDay(4),
  TUWeek(5),
  TUMonth(6),
  TUYear(7);

  private final int value;

  private TDDITimeUnit(int value) {
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
  public static TDDITimeUnit findByValue(int value) { 
    switch (value) {
      case 0:
        return TUMillisecond;
      case 1:
        return TUSecond;
      case 2:
        return TUMinute;
      case 3:
        return TUHour;
      case 4:
        return TUDay;
      case 5:
        return TUWeek;
      case 6:
        return TUMonth;
      case 7:
        return TUYear;
      default:
        return null;
    }
  }
}