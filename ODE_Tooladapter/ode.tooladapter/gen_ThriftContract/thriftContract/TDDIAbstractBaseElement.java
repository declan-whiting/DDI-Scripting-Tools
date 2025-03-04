/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thriftContract;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2019-01-14")
public class TDDIAbstractBaseElement implements org.apache.thrift.TBase<TDDIAbstractBaseElement, TDDIAbstractBaseElement._Fields>, java.io.Serializable, Cloneable, Comparable<TDDIAbstractBaseElement> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDDIAbstractBaseElement");

  private static final org.apache.thrift.protocol.TField USED_BASE_ELEMENT_FIELD_DESC = new org.apache.thrift.protocol.TField("UsedBaseElement", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField USED_BASE_ELEMENT_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("UsedBaseElementType", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TDDIAbstractBaseElementStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TDDIAbstractBaseElementTupleSchemeFactory();

  public TDDIBaseElementUnion UsedBaseElement; // required
  /**
   * 
   * @see TDDIBaseElementUnionType
   */
  public TDDIBaseElementUnionType UsedBaseElementType; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USED_BASE_ELEMENT((short)1, "UsedBaseElement"),
    /**
     * 
     * @see TDDIBaseElementUnionType
     */
    USED_BASE_ELEMENT_TYPE((short)2, "UsedBaseElementType");

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
        case 1: // USED_BASE_ELEMENT
          return USED_BASE_ELEMENT;
        case 2: // USED_BASE_ELEMENT_TYPE
          return USED_BASE_ELEMENT_TYPE;
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
    tmpMap.put(_Fields.USED_BASE_ELEMENT, new org.apache.thrift.meta_data.FieldMetaData("UsedBaseElement", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TDDIBaseElementUnion.class)));
    tmpMap.put(_Fields.USED_BASE_ELEMENT_TYPE, new org.apache.thrift.meta_data.FieldMetaData("UsedBaseElementType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TDDIBaseElementUnionType.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDDIAbstractBaseElement.class, metaDataMap);
  }

  public TDDIAbstractBaseElement() {
  }

  public TDDIAbstractBaseElement(
    TDDIBaseElementUnion UsedBaseElement,
    TDDIBaseElementUnionType UsedBaseElementType)
  {
    this();
    this.UsedBaseElement = UsedBaseElement;
    this.UsedBaseElementType = UsedBaseElementType;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TDDIAbstractBaseElement(TDDIAbstractBaseElement other) {
    if (other.isSetUsedBaseElement()) {
      this.UsedBaseElement = new TDDIBaseElementUnion(other.UsedBaseElement);
    }
    if (other.isSetUsedBaseElementType()) {
      this.UsedBaseElementType = other.UsedBaseElementType;
    }
  }

  public TDDIAbstractBaseElement deepCopy() {
    return new TDDIAbstractBaseElement(this);
  }

  @Override
  public void clear() {
    this.UsedBaseElement = null;
    this.UsedBaseElementType = null;
  }

  public TDDIBaseElementUnion getUsedBaseElement() {
    return this.UsedBaseElement;
  }

  public TDDIAbstractBaseElement setUsedBaseElement(TDDIBaseElementUnion UsedBaseElement) {
    this.UsedBaseElement = UsedBaseElement;
    return this;
  }

  public void unsetUsedBaseElement() {
    this.UsedBaseElement = null;
  }

  /** Returns true if field UsedBaseElement is set (has been assigned a value) and false otherwise */
  public boolean isSetUsedBaseElement() {
    return this.UsedBaseElement != null;
  }

  public void setUsedBaseElementIsSet(boolean value) {
    if (!value) {
      this.UsedBaseElement = null;
    }
  }

  /**
   * 
   * @see TDDIBaseElementUnionType
   */
  public TDDIBaseElementUnionType getUsedBaseElementType() {
    return this.UsedBaseElementType;
  }

  /**
   * 
   * @see TDDIBaseElementUnionType
   */
  public TDDIAbstractBaseElement setUsedBaseElementType(TDDIBaseElementUnionType UsedBaseElementType) {
    this.UsedBaseElementType = UsedBaseElementType;
    return this;
  }

  public void unsetUsedBaseElementType() {
    this.UsedBaseElementType = null;
  }

  /** Returns true if field UsedBaseElementType is set (has been assigned a value) and false otherwise */
  public boolean isSetUsedBaseElementType() {
    return this.UsedBaseElementType != null;
  }

  public void setUsedBaseElementTypeIsSet(boolean value) {
    if (!value) {
      this.UsedBaseElementType = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case USED_BASE_ELEMENT:
      if (value == null) {
        unsetUsedBaseElement();
      } else {
        setUsedBaseElement((TDDIBaseElementUnion)value);
      }
      break;

    case USED_BASE_ELEMENT_TYPE:
      if (value == null) {
        unsetUsedBaseElementType();
      } else {
        setUsedBaseElementType((TDDIBaseElementUnionType)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case USED_BASE_ELEMENT:
      return getUsedBaseElement();

    case USED_BASE_ELEMENT_TYPE:
      return getUsedBaseElementType();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case USED_BASE_ELEMENT:
      return isSetUsedBaseElement();
    case USED_BASE_ELEMENT_TYPE:
      return isSetUsedBaseElementType();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TDDIAbstractBaseElement)
      return this.equals((TDDIAbstractBaseElement)that);
    return false;
  }

  public boolean equals(TDDIAbstractBaseElement that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_UsedBaseElement = true && this.isSetUsedBaseElement();
    boolean that_present_UsedBaseElement = true && that.isSetUsedBaseElement();
    if (this_present_UsedBaseElement || that_present_UsedBaseElement) {
      if (!(this_present_UsedBaseElement && that_present_UsedBaseElement))
        return false;
      if (!this.UsedBaseElement.equals(that.UsedBaseElement))
        return false;
    }

    boolean this_present_UsedBaseElementType = true && this.isSetUsedBaseElementType();
    boolean that_present_UsedBaseElementType = true && that.isSetUsedBaseElementType();
    if (this_present_UsedBaseElementType || that_present_UsedBaseElementType) {
      if (!(this_present_UsedBaseElementType && that_present_UsedBaseElementType))
        return false;
      if (!this.UsedBaseElementType.equals(that.UsedBaseElementType))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetUsedBaseElement()) ? 131071 : 524287);
    if (isSetUsedBaseElement())
      hashCode = hashCode * 8191 + UsedBaseElement.hashCode();

    hashCode = hashCode * 8191 + ((isSetUsedBaseElementType()) ? 131071 : 524287);
    if (isSetUsedBaseElementType())
      hashCode = hashCode * 8191 + UsedBaseElementType.getValue();

    return hashCode;
  }

  @Override
  public int compareTo(TDDIAbstractBaseElement other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetUsedBaseElement()).compareTo(other.isSetUsedBaseElement());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsedBaseElement()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.UsedBaseElement, other.UsedBaseElement);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetUsedBaseElementType()).compareTo(other.isSetUsedBaseElementType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsedBaseElementType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.UsedBaseElementType, other.UsedBaseElementType);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TDDIAbstractBaseElement(");
    boolean first = true;

    sb.append("UsedBaseElement:");
    if (this.UsedBaseElement == null) {
      sb.append("null");
    } else {
      sb.append(this.UsedBaseElement);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("UsedBaseElementType:");
    if (this.UsedBaseElementType == null) {
      sb.append("null");
    } else {
      sb.append(this.UsedBaseElementType);
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

  private static class TDDIAbstractBaseElementStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDDIAbstractBaseElementStandardScheme getScheme() {
      return new TDDIAbstractBaseElementStandardScheme();
    }
  }

  private static class TDDIAbstractBaseElementStandardScheme extends org.apache.thrift.scheme.StandardScheme<TDDIAbstractBaseElement> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TDDIAbstractBaseElement struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // USED_BASE_ELEMENT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.UsedBaseElement = new TDDIBaseElementUnion();
              struct.UsedBaseElement.read(iprot);
              struct.setUsedBaseElementIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // USED_BASE_ELEMENT_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.UsedBaseElementType = thriftContract.TDDIBaseElementUnionType.findByValue(iprot.readI32());
              struct.setUsedBaseElementTypeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TDDIAbstractBaseElement struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.UsedBaseElement != null) {
        oprot.writeFieldBegin(USED_BASE_ELEMENT_FIELD_DESC);
        struct.UsedBaseElement.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.UsedBaseElementType != null) {
        oprot.writeFieldBegin(USED_BASE_ELEMENT_TYPE_FIELD_DESC);
        oprot.writeI32(struct.UsedBaseElementType.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TDDIAbstractBaseElementTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDDIAbstractBaseElementTupleScheme getScheme() {
      return new TDDIAbstractBaseElementTupleScheme();
    }
  }

  private static class TDDIAbstractBaseElementTupleScheme extends org.apache.thrift.scheme.TupleScheme<TDDIAbstractBaseElement> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TDDIAbstractBaseElement struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetUsedBaseElement()) {
        optionals.set(0);
      }
      if (struct.isSetUsedBaseElementType()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetUsedBaseElement()) {
        struct.UsedBaseElement.write(oprot);
      }
      if (struct.isSetUsedBaseElementType()) {
        oprot.writeI32(struct.UsedBaseElementType.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TDDIAbstractBaseElement struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.UsedBaseElement = new TDDIBaseElementUnion();
        struct.UsedBaseElement.read(iprot);
        struct.setUsedBaseElementIsSet(true);
      }
      if (incoming.get(1)) {
        struct.UsedBaseElementType = thriftContract.TDDIBaseElementUnionType.findByValue(iprot.readI32());
        struct.setUsedBaseElementTypeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

