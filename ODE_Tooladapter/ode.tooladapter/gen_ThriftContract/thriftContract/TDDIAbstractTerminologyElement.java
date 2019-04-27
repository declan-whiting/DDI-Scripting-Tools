/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thriftContract;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2019-01-14")
public class TDDIAbstractTerminologyElement implements org.apache.thrift.TBase<TDDIAbstractTerminologyElement, TDDIAbstractTerminologyElement._Fields>, java.io.Serializable, Cloneable, Comparable<TDDIAbstractTerminologyElement> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDDIAbstractTerminologyElement");

  private static final org.apache.thrift.protocol.TField USED_TERMINOLOGY_ELEMENT_FIELD_DESC = new org.apache.thrift.protocol.TField("UsedTerminologyElement", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField USED_TERMINOLOGY_ELEMENT_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("UsedTerminologyElementType", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TDDIAbstractTerminologyElementStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TDDIAbstractTerminologyElementTupleSchemeFactory();

  public TDDITerminologyElementUnion UsedTerminologyElement; // required
  /**
   * 
   * @see TDDITerminologyElementUnionType
   */
  public TDDITerminologyElementUnionType UsedTerminologyElementType; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USED_TERMINOLOGY_ELEMENT((short)1, "UsedTerminologyElement"),
    /**
     * 
     * @see TDDITerminologyElementUnionType
     */
    USED_TERMINOLOGY_ELEMENT_TYPE((short)2, "UsedTerminologyElementType");

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
        case 1: // USED_TERMINOLOGY_ELEMENT
          return USED_TERMINOLOGY_ELEMENT;
        case 2: // USED_TERMINOLOGY_ELEMENT_TYPE
          return USED_TERMINOLOGY_ELEMENT_TYPE;
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
    tmpMap.put(_Fields.USED_TERMINOLOGY_ELEMENT, new org.apache.thrift.meta_data.FieldMetaData("UsedTerminologyElement", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TDDITerminologyElementUnion.class)));
    tmpMap.put(_Fields.USED_TERMINOLOGY_ELEMENT_TYPE, new org.apache.thrift.meta_data.FieldMetaData("UsedTerminologyElementType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TDDITerminologyElementUnionType.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDDIAbstractTerminologyElement.class, metaDataMap);
  }

  public TDDIAbstractTerminologyElement() {
  }

  public TDDIAbstractTerminologyElement(
    TDDITerminologyElementUnion UsedTerminologyElement,
    TDDITerminologyElementUnionType UsedTerminologyElementType)
  {
    this();
    this.UsedTerminologyElement = UsedTerminologyElement;
    this.UsedTerminologyElementType = UsedTerminologyElementType;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TDDIAbstractTerminologyElement(TDDIAbstractTerminologyElement other) {
    if (other.isSetUsedTerminologyElement()) {
      this.UsedTerminologyElement = new TDDITerminologyElementUnion(other.UsedTerminologyElement);
    }
    if (other.isSetUsedTerminologyElementType()) {
      this.UsedTerminologyElementType = other.UsedTerminologyElementType;
    }
  }

  public TDDIAbstractTerminologyElement deepCopy() {
    return new TDDIAbstractTerminologyElement(this);
  }

  @Override
  public void clear() {
    this.UsedTerminologyElement = null;
    this.UsedTerminologyElementType = null;
  }

  public TDDITerminologyElementUnion getUsedTerminologyElement() {
    return this.UsedTerminologyElement;
  }

  public TDDIAbstractTerminologyElement setUsedTerminologyElement(TDDITerminologyElementUnion UsedTerminologyElement) {
    this.UsedTerminologyElement = UsedTerminologyElement;
    return this;
  }

  public void unsetUsedTerminologyElement() {
    this.UsedTerminologyElement = null;
  }

  /** Returns true if field UsedTerminologyElement is set (has been assigned a value) and false otherwise */
  public boolean isSetUsedTerminologyElement() {
    return this.UsedTerminologyElement != null;
  }

  public void setUsedTerminologyElementIsSet(boolean value) {
    if (!value) {
      this.UsedTerminologyElement = null;
    }
  }

  /**
   * 
   * @see TDDITerminologyElementUnionType
   */
  public TDDITerminologyElementUnionType getUsedTerminologyElementType() {
    return this.UsedTerminologyElementType;
  }

  /**
   * 
   * @see TDDITerminologyElementUnionType
   */
  public TDDIAbstractTerminologyElement setUsedTerminologyElementType(TDDITerminologyElementUnionType UsedTerminologyElementType) {
    this.UsedTerminologyElementType = UsedTerminologyElementType;
    return this;
  }

  public void unsetUsedTerminologyElementType() {
    this.UsedTerminologyElementType = null;
  }

  /** Returns true if field UsedTerminologyElementType is set (has been assigned a value) and false otherwise */
  public boolean isSetUsedTerminologyElementType() {
    return this.UsedTerminologyElementType != null;
  }

  public void setUsedTerminologyElementTypeIsSet(boolean value) {
    if (!value) {
      this.UsedTerminologyElementType = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case USED_TERMINOLOGY_ELEMENT:
      if (value == null) {
        unsetUsedTerminologyElement();
      } else {
        setUsedTerminologyElement((TDDITerminologyElementUnion)value);
      }
      break;

    case USED_TERMINOLOGY_ELEMENT_TYPE:
      if (value == null) {
        unsetUsedTerminologyElementType();
      } else {
        setUsedTerminologyElementType((TDDITerminologyElementUnionType)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case USED_TERMINOLOGY_ELEMENT:
      return getUsedTerminologyElement();

    case USED_TERMINOLOGY_ELEMENT_TYPE:
      return getUsedTerminologyElementType();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case USED_TERMINOLOGY_ELEMENT:
      return isSetUsedTerminologyElement();
    case USED_TERMINOLOGY_ELEMENT_TYPE:
      return isSetUsedTerminologyElementType();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TDDIAbstractTerminologyElement)
      return this.equals((TDDIAbstractTerminologyElement)that);
    return false;
  }

  public boolean equals(TDDIAbstractTerminologyElement that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_UsedTerminologyElement = true && this.isSetUsedTerminologyElement();
    boolean that_present_UsedTerminologyElement = true && that.isSetUsedTerminologyElement();
    if (this_present_UsedTerminologyElement || that_present_UsedTerminologyElement) {
      if (!(this_present_UsedTerminologyElement && that_present_UsedTerminologyElement))
        return false;
      if (!this.UsedTerminologyElement.equals(that.UsedTerminologyElement))
        return false;
    }

    boolean this_present_UsedTerminologyElementType = true && this.isSetUsedTerminologyElementType();
    boolean that_present_UsedTerminologyElementType = true && that.isSetUsedTerminologyElementType();
    if (this_present_UsedTerminologyElementType || that_present_UsedTerminologyElementType) {
      if (!(this_present_UsedTerminologyElementType && that_present_UsedTerminologyElementType))
        return false;
      if (!this.UsedTerminologyElementType.equals(that.UsedTerminologyElementType))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetUsedTerminologyElement()) ? 131071 : 524287);
    if (isSetUsedTerminologyElement())
      hashCode = hashCode * 8191 + UsedTerminologyElement.hashCode();

    hashCode = hashCode * 8191 + ((isSetUsedTerminologyElementType()) ? 131071 : 524287);
    if (isSetUsedTerminologyElementType())
      hashCode = hashCode * 8191 + UsedTerminologyElementType.getValue();

    return hashCode;
  }

  @Override
  public int compareTo(TDDIAbstractTerminologyElement other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetUsedTerminologyElement()).compareTo(other.isSetUsedTerminologyElement());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsedTerminologyElement()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.UsedTerminologyElement, other.UsedTerminologyElement);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetUsedTerminologyElementType()).compareTo(other.isSetUsedTerminologyElementType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsedTerminologyElementType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.UsedTerminologyElementType, other.UsedTerminologyElementType);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TDDIAbstractTerminologyElement(");
    boolean first = true;

    sb.append("UsedTerminologyElement:");
    if (this.UsedTerminologyElement == null) {
      sb.append("null");
    } else {
      sb.append(this.UsedTerminologyElement);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("UsedTerminologyElementType:");
    if (this.UsedTerminologyElementType == null) {
      sb.append("null");
    } else {
      sb.append(this.UsedTerminologyElementType);
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

  private static class TDDIAbstractTerminologyElementStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDDIAbstractTerminologyElementStandardScheme getScheme() {
      return new TDDIAbstractTerminologyElementStandardScheme();
    }
  }

  private static class TDDIAbstractTerminologyElementStandardScheme extends org.apache.thrift.scheme.StandardScheme<TDDIAbstractTerminologyElement> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TDDIAbstractTerminologyElement struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // USED_TERMINOLOGY_ELEMENT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.UsedTerminologyElement = new TDDITerminologyElementUnion();
              struct.UsedTerminologyElement.read(iprot);
              struct.setUsedTerminologyElementIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // USED_TERMINOLOGY_ELEMENT_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.UsedTerminologyElementType = thriftContract.TDDITerminologyElementUnionType.findByValue(iprot.readI32());
              struct.setUsedTerminologyElementTypeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TDDIAbstractTerminologyElement struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.UsedTerminologyElement != null) {
        oprot.writeFieldBegin(USED_TERMINOLOGY_ELEMENT_FIELD_DESC);
        struct.UsedTerminologyElement.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.UsedTerminologyElementType != null) {
        oprot.writeFieldBegin(USED_TERMINOLOGY_ELEMENT_TYPE_FIELD_DESC);
        oprot.writeI32(struct.UsedTerminologyElementType.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TDDIAbstractTerminologyElementTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDDIAbstractTerminologyElementTupleScheme getScheme() {
      return new TDDIAbstractTerminologyElementTupleScheme();
    }
  }

  private static class TDDIAbstractTerminologyElementTupleScheme extends org.apache.thrift.scheme.TupleScheme<TDDIAbstractTerminologyElement> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TDDIAbstractTerminologyElement struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetUsedTerminologyElement()) {
        optionals.set(0);
      }
      if (struct.isSetUsedTerminologyElementType()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetUsedTerminologyElement()) {
        struct.UsedTerminologyElement.write(oprot);
      }
      if (struct.isSetUsedTerminologyElementType()) {
        oprot.writeI32(struct.UsedTerminologyElementType.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TDDIAbstractTerminologyElement struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.UsedTerminologyElement = new TDDITerminologyElementUnion();
        struct.UsedTerminologyElement.read(iprot);
        struct.setUsedTerminologyElementIsSet(true);
      }
      if (incoming.get(1)) {
        struct.UsedTerminologyElementType = thriftContract.TDDITerminologyElementUnionType.findByValue(iprot.readI32());
        struct.setUsedTerminologyElementTypeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
