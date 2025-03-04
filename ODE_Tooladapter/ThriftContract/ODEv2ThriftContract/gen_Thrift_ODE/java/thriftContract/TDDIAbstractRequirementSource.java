/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thriftContract;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2019-03-13")
public class TDDIAbstractRequirementSource implements org.apache.thrift.TBase<TDDIAbstractRequirementSource, TDDIAbstractRequirementSource._Fields>, java.io.Serializable, Cloneable, Comparable<TDDIAbstractRequirementSource> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDDIAbstractRequirementSource");

  private static final org.apache.thrift.protocol.TField USED_REQUIREMENT_SOURCE_FIELD_DESC = new org.apache.thrift.protocol.TField("UsedRequirementSource", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField USED_REQUIREMENT_SOURCE_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("UsedRequirementSourceType", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TDDIAbstractRequirementSourceStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TDDIAbstractRequirementSourceTupleSchemeFactory();

  public TDDIRequirementSourceUnion UsedRequirementSource; // required
  /**
   * 
   * @see TDDIRequirementSourceUnionType
   */
  public TDDIRequirementSourceUnionType UsedRequirementSourceType; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USED_REQUIREMENT_SOURCE((short)1, "UsedRequirementSource"),
    /**
     * 
     * @see TDDIRequirementSourceUnionType
     */
    USED_REQUIREMENT_SOURCE_TYPE((short)2, "UsedRequirementSourceType");

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
        case 1: // USED_REQUIREMENT_SOURCE
          return USED_REQUIREMENT_SOURCE;
        case 2: // USED_REQUIREMENT_SOURCE_TYPE
          return USED_REQUIREMENT_SOURCE_TYPE;
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
    tmpMap.put(_Fields.USED_REQUIREMENT_SOURCE, new org.apache.thrift.meta_data.FieldMetaData("UsedRequirementSource", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TDDIRequirementSourceUnion.class)));
    tmpMap.put(_Fields.USED_REQUIREMENT_SOURCE_TYPE, new org.apache.thrift.meta_data.FieldMetaData("UsedRequirementSourceType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TDDIRequirementSourceUnionType.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDDIAbstractRequirementSource.class, metaDataMap);
  }

  public TDDIAbstractRequirementSource() {
  }

  public TDDIAbstractRequirementSource(
    TDDIRequirementSourceUnion UsedRequirementSource,
    TDDIRequirementSourceUnionType UsedRequirementSourceType)
  {
    this();
    this.UsedRequirementSource = UsedRequirementSource;
    this.UsedRequirementSourceType = UsedRequirementSourceType;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TDDIAbstractRequirementSource(TDDIAbstractRequirementSource other) {
    if (other.isSetUsedRequirementSource()) {
      this.UsedRequirementSource = new TDDIRequirementSourceUnion(other.UsedRequirementSource);
    }
    if (other.isSetUsedRequirementSourceType()) {
      this.UsedRequirementSourceType = other.UsedRequirementSourceType;
    }
  }

  public TDDIAbstractRequirementSource deepCopy() {
    return new TDDIAbstractRequirementSource(this);
  }

  @Override
  public void clear() {
    this.UsedRequirementSource = null;
    this.UsedRequirementSourceType = null;
  }

  public TDDIRequirementSourceUnion getUsedRequirementSource() {
    return this.UsedRequirementSource;
  }

  public TDDIAbstractRequirementSource setUsedRequirementSource(TDDIRequirementSourceUnion UsedRequirementSource) {
    this.UsedRequirementSource = UsedRequirementSource;
    return this;
  }

  public void unsetUsedRequirementSource() {
    this.UsedRequirementSource = null;
  }

  /** Returns true if field UsedRequirementSource is set (has been assigned a value) and false otherwise */
  public boolean isSetUsedRequirementSource() {
    return this.UsedRequirementSource != null;
  }

  public void setUsedRequirementSourceIsSet(boolean value) {
    if (!value) {
      this.UsedRequirementSource = null;
    }
  }

  /**
   * 
   * @see TDDIRequirementSourceUnionType
   */
  public TDDIRequirementSourceUnionType getUsedRequirementSourceType() {
    return this.UsedRequirementSourceType;
  }

  /**
   * 
   * @see TDDIRequirementSourceUnionType
   */
  public TDDIAbstractRequirementSource setUsedRequirementSourceType(TDDIRequirementSourceUnionType UsedRequirementSourceType) {
    this.UsedRequirementSourceType = UsedRequirementSourceType;
    return this;
  }

  public void unsetUsedRequirementSourceType() {
    this.UsedRequirementSourceType = null;
  }

  /** Returns true if field UsedRequirementSourceType is set (has been assigned a value) and false otherwise */
  public boolean isSetUsedRequirementSourceType() {
    return this.UsedRequirementSourceType != null;
  }

  public void setUsedRequirementSourceTypeIsSet(boolean value) {
    if (!value) {
      this.UsedRequirementSourceType = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case USED_REQUIREMENT_SOURCE:
      if (value == null) {
        unsetUsedRequirementSource();
      } else {
        setUsedRequirementSource((TDDIRequirementSourceUnion)value);
      }
      break;

    case USED_REQUIREMENT_SOURCE_TYPE:
      if (value == null) {
        unsetUsedRequirementSourceType();
      } else {
        setUsedRequirementSourceType((TDDIRequirementSourceUnionType)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case USED_REQUIREMENT_SOURCE:
      return getUsedRequirementSource();

    case USED_REQUIREMENT_SOURCE_TYPE:
      return getUsedRequirementSourceType();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case USED_REQUIREMENT_SOURCE:
      return isSetUsedRequirementSource();
    case USED_REQUIREMENT_SOURCE_TYPE:
      return isSetUsedRequirementSourceType();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TDDIAbstractRequirementSource)
      return this.equals((TDDIAbstractRequirementSource)that);
    return false;
  }

  public boolean equals(TDDIAbstractRequirementSource that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_UsedRequirementSource = true && this.isSetUsedRequirementSource();
    boolean that_present_UsedRequirementSource = true && that.isSetUsedRequirementSource();
    if (this_present_UsedRequirementSource || that_present_UsedRequirementSource) {
      if (!(this_present_UsedRequirementSource && that_present_UsedRequirementSource))
        return false;
      if (!this.UsedRequirementSource.equals(that.UsedRequirementSource))
        return false;
    }

    boolean this_present_UsedRequirementSourceType = true && this.isSetUsedRequirementSourceType();
    boolean that_present_UsedRequirementSourceType = true && that.isSetUsedRequirementSourceType();
    if (this_present_UsedRequirementSourceType || that_present_UsedRequirementSourceType) {
      if (!(this_present_UsedRequirementSourceType && that_present_UsedRequirementSourceType))
        return false;
      if (!this.UsedRequirementSourceType.equals(that.UsedRequirementSourceType))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetUsedRequirementSource()) ? 131071 : 524287);
    if (isSetUsedRequirementSource())
      hashCode = hashCode * 8191 + UsedRequirementSource.hashCode();

    hashCode = hashCode * 8191 + ((isSetUsedRequirementSourceType()) ? 131071 : 524287);
    if (isSetUsedRequirementSourceType())
      hashCode = hashCode * 8191 + UsedRequirementSourceType.getValue();

    return hashCode;
  }

  @Override
  public int compareTo(TDDIAbstractRequirementSource other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetUsedRequirementSource()).compareTo(other.isSetUsedRequirementSource());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsedRequirementSource()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.UsedRequirementSource, other.UsedRequirementSource);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetUsedRequirementSourceType()).compareTo(other.isSetUsedRequirementSourceType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsedRequirementSourceType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.UsedRequirementSourceType, other.UsedRequirementSourceType);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TDDIAbstractRequirementSource(");
    boolean first = true;

    sb.append("UsedRequirementSource:");
    if (this.UsedRequirementSource == null) {
      sb.append("null");
    } else {
      sb.append(this.UsedRequirementSource);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("UsedRequirementSourceType:");
    if (this.UsedRequirementSourceType == null) {
      sb.append("null");
    } else {
      sb.append(this.UsedRequirementSourceType);
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

  private static class TDDIAbstractRequirementSourceStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDDIAbstractRequirementSourceStandardScheme getScheme() {
      return new TDDIAbstractRequirementSourceStandardScheme();
    }
  }

  private static class TDDIAbstractRequirementSourceStandardScheme extends org.apache.thrift.scheme.StandardScheme<TDDIAbstractRequirementSource> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TDDIAbstractRequirementSource struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // USED_REQUIREMENT_SOURCE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.UsedRequirementSource = new TDDIRequirementSourceUnion();
              struct.UsedRequirementSource.read(iprot);
              struct.setUsedRequirementSourceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // USED_REQUIREMENT_SOURCE_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.UsedRequirementSourceType = thriftContract.TDDIRequirementSourceUnionType.findByValue(iprot.readI32());
              struct.setUsedRequirementSourceTypeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TDDIAbstractRequirementSource struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.UsedRequirementSource != null) {
        oprot.writeFieldBegin(USED_REQUIREMENT_SOURCE_FIELD_DESC);
        struct.UsedRequirementSource.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.UsedRequirementSourceType != null) {
        oprot.writeFieldBegin(USED_REQUIREMENT_SOURCE_TYPE_FIELD_DESC);
        oprot.writeI32(struct.UsedRequirementSourceType.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TDDIAbstractRequirementSourceTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDDIAbstractRequirementSourceTupleScheme getScheme() {
      return new TDDIAbstractRequirementSourceTupleScheme();
    }
  }

  private static class TDDIAbstractRequirementSourceTupleScheme extends org.apache.thrift.scheme.TupleScheme<TDDIAbstractRequirementSource> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TDDIAbstractRequirementSource struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetUsedRequirementSource()) {
        optionals.set(0);
      }
      if (struct.isSetUsedRequirementSourceType()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetUsedRequirementSource()) {
        struct.UsedRequirementSource.write(oprot);
      }
      if (struct.isSetUsedRequirementSourceType()) {
        oprot.writeI32(struct.UsedRequirementSourceType.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TDDIAbstractRequirementSource struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.UsedRequirementSource = new TDDIRequirementSourceUnion();
        struct.UsedRequirementSource.read(iprot);
        struct.setUsedRequirementSourceIsSet(true);
      }
      if (incoming.get(1)) {
        struct.UsedRequirementSourceType = thriftContract.TDDIRequirementSourceUnionType.findByValue(iprot.readI32());
        struct.setUsedRequirementSourceTypeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

