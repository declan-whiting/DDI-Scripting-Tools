/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thriftContract;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2019-01-14")
public class TDDIAbstractDependabilityRequirement implements org.apache.thrift.TBase<TDDIAbstractDependabilityRequirement, TDDIAbstractDependabilityRequirement._Fields>, java.io.Serializable, Cloneable, Comparable<TDDIAbstractDependabilityRequirement> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDDIAbstractDependabilityRequirement");

  private static final org.apache.thrift.protocol.TField USED_DEPENDABILITY_REQUIREMENT_FIELD_DESC = new org.apache.thrift.protocol.TField("UsedDependabilityRequirement", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField USED_DEPENDABILITY_REQUIREMENT_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("UsedDependabilityRequirementType", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TDDIAbstractDependabilityRequirementStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TDDIAbstractDependabilityRequirementTupleSchemeFactory();

  public TDDIDependabilityRequirementUnion UsedDependabilityRequirement; // required
  /**
   * 
   * @see TDDIDependabilityRequirementUnionType
   */
  public TDDIDependabilityRequirementUnionType UsedDependabilityRequirementType; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USED_DEPENDABILITY_REQUIREMENT((short)1, "UsedDependabilityRequirement"),
    /**
     * 
     * @see TDDIDependabilityRequirementUnionType
     */
    USED_DEPENDABILITY_REQUIREMENT_TYPE((short)2, "UsedDependabilityRequirementType");

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
        case 1: // USED_DEPENDABILITY_REQUIREMENT
          return USED_DEPENDABILITY_REQUIREMENT;
        case 2: // USED_DEPENDABILITY_REQUIREMENT_TYPE
          return USED_DEPENDABILITY_REQUIREMENT_TYPE;
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
    tmpMap.put(_Fields.USED_DEPENDABILITY_REQUIREMENT, new org.apache.thrift.meta_data.FieldMetaData("UsedDependabilityRequirement", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TDDIDependabilityRequirementUnion.class)));
    tmpMap.put(_Fields.USED_DEPENDABILITY_REQUIREMENT_TYPE, new org.apache.thrift.meta_data.FieldMetaData("UsedDependabilityRequirementType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TDDIDependabilityRequirementUnionType.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDDIAbstractDependabilityRequirement.class, metaDataMap);
  }

  public TDDIAbstractDependabilityRequirement() {
  }

  public TDDIAbstractDependabilityRequirement(
    TDDIDependabilityRequirementUnion UsedDependabilityRequirement,
    TDDIDependabilityRequirementUnionType UsedDependabilityRequirementType)
  {
    this();
    this.UsedDependabilityRequirement = UsedDependabilityRequirement;
    this.UsedDependabilityRequirementType = UsedDependabilityRequirementType;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TDDIAbstractDependabilityRequirement(TDDIAbstractDependabilityRequirement other) {
    if (other.isSetUsedDependabilityRequirement()) {
      this.UsedDependabilityRequirement = new TDDIDependabilityRequirementUnion(other.UsedDependabilityRequirement);
    }
    if (other.isSetUsedDependabilityRequirementType()) {
      this.UsedDependabilityRequirementType = other.UsedDependabilityRequirementType;
    }
  }

  public TDDIAbstractDependabilityRequirement deepCopy() {
    return new TDDIAbstractDependabilityRequirement(this);
  }

  @Override
  public void clear() {
    this.UsedDependabilityRequirement = null;
    this.UsedDependabilityRequirementType = null;
  }

  public TDDIDependabilityRequirementUnion getUsedDependabilityRequirement() {
    return this.UsedDependabilityRequirement;
  }

  public TDDIAbstractDependabilityRequirement setUsedDependabilityRequirement(TDDIDependabilityRequirementUnion UsedDependabilityRequirement) {
    this.UsedDependabilityRequirement = UsedDependabilityRequirement;
    return this;
  }

  public void unsetUsedDependabilityRequirement() {
    this.UsedDependabilityRequirement = null;
  }

  /** Returns true if field UsedDependabilityRequirement is set (has been assigned a value) and false otherwise */
  public boolean isSetUsedDependabilityRequirement() {
    return this.UsedDependabilityRequirement != null;
  }

  public void setUsedDependabilityRequirementIsSet(boolean value) {
    if (!value) {
      this.UsedDependabilityRequirement = null;
    }
  }

  /**
   * 
   * @see TDDIDependabilityRequirementUnionType
   */
  public TDDIDependabilityRequirementUnionType getUsedDependabilityRequirementType() {
    return this.UsedDependabilityRequirementType;
  }

  /**
   * 
   * @see TDDIDependabilityRequirementUnionType
   */
  public TDDIAbstractDependabilityRequirement setUsedDependabilityRequirementType(TDDIDependabilityRequirementUnionType UsedDependabilityRequirementType) {
    this.UsedDependabilityRequirementType = UsedDependabilityRequirementType;
    return this;
  }

  public void unsetUsedDependabilityRequirementType() {
    this.UsedDependabilityRequirementType = null;
  }

  /** Returns true if field UsedDependabilityRequirementType is set (has been assigned a value) and false otherwise */
  public boolean isSetUsedDependabilityRequirementType() {
    return this.UsedDependabilityRequirementType != null;
  }

  public void setUsedDependabilityRequirementTypeIsSet(boolean value) {
    if (!value) {
      this.UsedDependabilityRequirementType = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case USED_DEPENDABILITY_REQUIREMENT:
      if (value == null) {
        unsetUsedDependabilityRequirement();
      } else {
        setUsedDependabilityRequirement((TDDIDependabilityRequirementUnion)value);
      }
      break;

    case USED_DEPENDABILITY_REQUIREMENT_TYPE:
      if (value == null) {
        unsetUsedDependabilityRequirementType();
      } else {
        setUsedDependabilityRequirementType((TDDIDependabilityRequirementUnionType)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case USED_DEPENDABILITY_REQUIREMENT:
      return getUsedDependabilityRequirement();

    case USED_DEPENDABILITY_REQUIREMENT_TYPE:
      return getUsedDependabilityRequirementType();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case USED_DEPENDABILITY_REQUIREMENT:
      return isSetUsedDependabilityRequirement();
    case USED_DEPENDABILITY_REQUIREMENT_TYPE:
      return isSetUsedDependabilityRequirementType();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TDDIAbstractDependabilityRequirement)
      return this.equals((TDDIAbstractDependabilityRequirement)that);
    return false;
  }

  public boolean equals(TDDIAbstractDependabilityRequirement that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_UsedDependabilityRequirement = true && this.isSetUsedDependabilityRequirement();
    boolean that_present_UsedDependabilityRequirement = true && that.isSetUsedDependabilityRequirement();
    if (this_present_UsedDependabilityRequirement || that_present_UsedDependabilityRequirement) {
      if (!(this_present_UsedDependabilityRequirement && that_present_UsedDependabilityRequirement))
        return false;
      if (!this.UsedDependabilityRequirement.equals(that.UsedDependabilityRequirement))
        return false;
    }

    boolean this_present_UsedDependabilityRequirementType = true && this.isSetUsedDependabilityRequirementType();
    boolean that_present_UsedDependabilityRequirementType = true && that.isSetUsedDependabilityRequirementType();
    if (this_present_UsedDependabilityRequirementType || that_present_UsedDependabilityRequirementType) {
      if (!(this_present_UsedDependabilityRequirementType && that_present_UsedDependabilityRequirementType))
        return false;
      if (!this.UsedDependabilityRequirementType.equals(that.UsedDependabilityRequirementType))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetUsedDependabilityRequirement()) ? 131071 : 524287);
    if (isSetUsedDependabilityRequirement())
      hashCode = hashCode * 8191 + UsedDependabilityRequirement.hashCode();

    hashCode = hashCode * 8191 + ((isSetUsedDependabilityRequirementType()) ? 131071 : 524287);
    if (isSetUsedDependabilityRequirementType())
      hashCode = hashCode * 8191 + UsedDependabilityRequirementType.getValue();

    return hashCode;
  }

  @Override
  public int compareTo(TDDIAbstractDependabilityRequirement other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetUsedDependabilityRequirement()).compareTo(other.isSetUsedDependabilityRequirement());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsedDependabilityRequirement()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.UsedDependabilityRequirement, other.UsedDependabilityRequirement);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetUsedDependabilityRequirementType()).compareTo(other.isSetUsedDependabilityRequirementType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsedDependabilityRequirementType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.UsedDependabilityRequirementType, other.UsedDependabilityRequirementType);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TDDIAbstractDependabilityRequirement(");
    boolean first = true;

    sb.append("UsedDependabilityRequirement:");
    if (this.UsedDependabilityRequirement == null) {
      sb.append("null");
    } else {
      sb.append(this.UsedDependabilityRequirement);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("UsedDependabilityRequirementType:");
    if (this.UsedDependabilityRequirementType == null) {
      sb.append("null");
    } else {
      sb.append(this.UsedDependabilityRequirementType);
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

  private static class TDDIAbstractDependabilityRequirementStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDDIAbstractDependabilityRequirementStandardScheme getScheme() {
      return new TDDIAbstractDependabilityRequirementStandardScheme();
    }
  }

  private static class TDDIAbstractDependabilityRequirementStandardScheme extends org.apache.thrift.scheme.StandardScheme<TDDIAbstractDependabilityRequirement> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TDDIAbstractDependabilityRequirement struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // USED_DEPENDABILITY_REQUIREMENT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.UsedDependabilityRequirement = new TDDIDependabilityRequirementUnion();
              struct.UsedDependabilityRequirement.read(iprot);
              struct.setUsedDependabilityRequirementIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // USED_DEPENDABILITY_REQUIREMENT_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.UsedDependabilityRequirementType = thriftContract.TDDIDependabilityRequirementUnionType.findByValue(iprot.readI32());
              struct.setUsedDependabilityRequirementTypeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TDDIAbstractDependabilityRequirement struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.UsedDependabilityRequirement != null) {
        oprot.writeFieldBegin(USED_DEPENDABILITY_REQUIREMENT_FIELD_DESC);
        struct.UsedDependabilityRequirement.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.UsedDependabilityRequirementType != null) {
        oprot.writeFieldBegin(USED_DEPENDABILITY_REQUIREMENT_TYPE_FIELD_DESC);
        oprot.writeI32(struct.UsedDependabilityRequirementType.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TDDIAbstractDependabilityRequirementTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDDIAbstractDependabilityRequirementTupleScheme getScheme() {
      return new TDDIAbstractDependabilityRequirementTupleScheme();
    }
  }

  private static class TDDIAbstractDependabilityRequirementTupleScheme extends org.apache.thrift.scheme.TupleScheme<TDDIAbstractDependabilityRequirement> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TDDIAbstractDependabilityRequirement struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetUsedDependabilityRequirement()) {
        optionals.set(0);
      }
      if (struct.isSetUsedDependabilityRequirementType()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetUsedDependabilityRequirement()) {
        struct.UsedDependabilityRequirement.write(oprot);
      }
      if (struct.isSetUsedDependabilityRequirementType()) {
        oprot.writeI32(struct.UsedDependabilityRequirementType.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TDDIAbstractDependabilityRequirement struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.UsedDependabilityRequirement = new TDDIDependabilityRequirementUnion();
        struct.UsedDependabilityRequirement.read(iprot);
        struct.setUsedDependabilityRequirementIsSet(true);
      }
      if (incoming.get(1)) {
        struct.UsedDependabilityRequirementType = thriftContract.TDDIDependabilityRequirementUnionType.findByValue(iprot.readI32());
        struct.setUsedDependabilityRequirementTypeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

