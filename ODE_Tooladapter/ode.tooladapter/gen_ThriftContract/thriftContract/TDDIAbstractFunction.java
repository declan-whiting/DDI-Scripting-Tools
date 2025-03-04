/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thriftContract;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2019-01-14")
public class TDDIAbstractFunction implements org.apache.thrift.TBase<TDDIAbstractFunction, TDDIAbstractFunction._Fields>, java.io.Serializable, Cloneable, Comparable<TDDIAbstractFunction> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDDIAbstractFunction");

  private static final org.apache.thrift.protocol.TField USED_FUNCTION_FIELD_DESC = new org.apache.thrift.protocol.TField("UsedFunction", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField USED_FUNCTION_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("UsedFunctionType", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TDDIAbstractFunctionStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TDDIAbstractFunctionTupleSchemeFactory();

  public TDDIFunctionUnion UsedFunction; // required
  /**
   * 
   * @see TDDIFunctionUnionType
   */
  public TDDIFunctionUnionType UsedFunctionType; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USED_FUNCTION((short)1, "UsedFunction"),
    /**
     * 
     * @see TDDIFunctionUnionType
     */
    USED_FUNCTION_TYPE((short)2, "UsedFunctionType");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // USED_FUNCTION
          return USED_FUNCTION;
        case 2: // USED_FUNCTION_TYPE
          return USED_FUNCTION_TYPE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.USED_FUNCTION, new org.apache.thrift.meta_data.FieldMetaData("UsedFunction", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TDDIFunctionUnion.class)));
    tmpMap.put(_Fields.USED_FUNCTION_TYPE, new org.apache.thrift.meta_data.FieldMetaData("UsedFunctionType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TDDIFunctionUnionType.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDDIAbstractFunction.class, metaDataMap);
  }

  public TDDIAbstractFunction() {
  }

  public TDDIAbstractFunction(
    TDDIFunctionUnion UsedFunction,
    TDDIFunctionUnionType UsedFunctionType)
  {
    this();
    this.UsedFunction = UsedFunction;
    this.UsedFunctionType = UsedFunctionType;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TDDIAbstractFunction(TDDIAbstractFunction other) {
    if (other.isSetUsedFunction()) {
      this.UsedFunction = new TDDIFunctionUnion(other.UsedFunction);
    }
    if (other.isSetUsedFunctionType()) {
      this.UsedFunctionType = other.UsedFunctionType;
    }
  }

  public TDDIAbstractFunction deepCopy() {
    return new TDDIAbstractFunction(this);
  }

  @Override
  public void clear() {
    this.UsedFunction = null;
    this.UsedFunctionType = null;
  }

  public TDDIFunctionUnion getUsedFunction() {
    return this.UsedFunction;
  }

  public TDDIAbstractFunction setUsedFunction(TDDIFunctionUnion UsedFunction) {
    this.UsedFunction = UsedFunction;
    return this;
  }

  public void unsetUsedFunction() {
    this.UsedFunction = null;
  }

  /** Returns true if field UsedFunction is set (has been assigned a value) and false otherwise */
  public boolean isSetUsedFunction() {
    return this.UsedFunction != null;
  }

  public void setUsedFunctionIsSet(boolean value) {
    if (!value) {
      this.UsedFunction = null;
    }
  }

  /**
   * 
   * @see TDDIFunctionUnionType
   */
  public TDDIFunctionUnionType getUsedFunctionType() {
    return this.UsedFunctionType;
  }

  /**
   * 
   * @see TDDIFunctionUnionType
   */
  public TDDIAbstractFunction setUsedFunctionType(TDDIFunctionUnionType UsedFunctionType) {
    this.UsedFunctionType = UsedFunctionType;
    return this;
  }

  public void unsetUsedFunctionType() {
    this.UsedFunctionType = null;
  }

  /** Returns true if field UsedFunctionType is set (has been assigned a value) and false otherwise */
  public boolean isSetUsedFunctionType() {
    return this.UsedFunctionType != null;
  }

  public void setUsedFunctionTypeIsSet(boolean value) {
    if (!value) {
      this.UsedFunctionType = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case USED_FUNCTION:
      if (value == null) {
        unsetUsedFunction();
      } else {
        setUsedFunction((TDDIFunctionUnion)value);
      }
      break;

    case USED_FUNCTION_TYPE:
      if (value == null) {
        unsetUsedFunctionType();
      } else {
        setUsedFunctionType((TDDIFunctionUnionType)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case USED_FUNCTION:
      return getUsedFunction();

    case USED_FUNCTION_TYPE:
      return getUsedFunctionType();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case USED_FUNCTION:
      return isSetUsedFunction();
    case USED_FUNCTION_TYPE:
      return isSetUsedFunctionType();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TDDIAbstractFunction)
      return this.equals((TDDIAbstractFunction)that);
    return false;
  }

  public boolean equals(TDDIAbstractFunction that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_UsedFunction = true && this.isSetUsedFunction();
    boolean that_present_UsedFunction = true && that.isSetUsedFunction();
    if (this_present_UsedFunction || that_present_UsedFunction) {
      if (!(this_present_UsedFunction && that_present_UsedFunction))
        return false;
      if (!this.UsedFunction.equals(that.UsedFunction))
        return false;
    }

    boolean this_present_UsedFunctionType = true && this.isSetUsedFunctionType();
    boolean that_present_UsedFunctionType = true && that.isSetUsedFunctionType();
    if (this_present_UsedFunctionType || that_present_UsedFunctionType) {
      if (!(this_present_UsedFunctionType && that_present_UsedFunctionType))
        return false;
      if (!this.UsedFunctionType.equals(that.UsedFunctionType))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetUsedFunction()) ? 131071 : 524287);
    if (isSetUsedFunction())
      hashCode = hashCode * 8191 + UsedFunction.hashCode();

    hashCode = hashCode * 8191 + ((isSetUsedFunctionType()) ? 131071 : 524287);
    if (isSetUsedFunctionType())
      hashCode = hashCode * 8191 + UsedFunctionType.getValue();

    return hashCode;
  }

  @Override
  public int compareTo(TDDIAbstractFunction other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetUsedFunction()).compareTo(other.isSetUsedFunction());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsedFunction()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.UsedFunction, other.UsedFunction);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetUsedFunctionType()).compareTo(other.isSetUsedFunctionType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsedFunctionType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.UsedFunctionType, other.UsedFunctionType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TDDIAbstractFunction(");
    boolean first = true;

    sb.append("UsedFunction:");
    if (this.UsedFunction == null) {
      sb.append("null");
    } else {
      sb.append(this.UsedFunction);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("UsedFunctionType:");
    if (this.UsedFunctionType == null) {
      sb.append("null");
    } else {
      sb.append(this.UsedFunctionType);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TDDIAbstractFunctionStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDDIAbstractFunctionStandardScheme getScheme() {
      return new TDDIAbstractFunctionStandardScheme();
    }
  }

  private static class TDDIAbstractFunctionStandardScheme extends org.apache.thrift.scheme.StandardScheme<TDDIAbstractFunction> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TDDIAbstractFunction struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // USED_FUNCTION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.UsedFunction = new TDDIFunctionUnion();
              struct.UsedFunction.read(iprot);
              struct.setUsedFunctionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // USED_FUNCTION_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.UsedFunctionType = thriftContract.TDDIFunctionUnionType.findByValue(iprot.readI32());
              struct.setUsedFunctionTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TDDIAbstractFunction struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.UsedFunction != null) {
        oprot.writeFieldBegin(USED_FUNCTION_FIELD_DESC);
        struct.UsedFunction.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.UsedFunctionType != null) {
        oprot.writeFieldBegin(USED_FUNCTION_TYPE_FIELD_DESC);
        oprot.writeI32(struct.UsedFunctionType.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TDDIAbstractFunctionTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDDIAbstractFunctionTupleScheme getScheme() {
      return new TDDIAbstractFunctionTupleScheme();
    }
  }

  private static class TDDIAbstractFunctionTupleScheme extends org.apache.thrift.scheme.TupleScheme<TDDIAbstractFunction> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TDDIAbstractFunction struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetUsedFunction()) {
        optionals.set(0);
      }
      if (struct.isSetUsedFunctionType()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetUsedFunction()) {
        struct.UsedFunction.write(oprot);
      }
      if (struct.isSetUsedFunctionType()) {
        oprot.writeI32(struct.UsedFunctionType.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TDDIAbstractFunction struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.UsedFunction = new TDDIFunctionUnion();
        struct.UsedFunction.read(iprot);
        struct.setUsedFunctionIsSet(true);
      }
      if (incoming.get(1)) {
        struct.UsedFunctionType = thriftContract.TDDIFunctionUnionType.findByValue(iprot.readI32());
        struct.setUsedFunctionTypeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

