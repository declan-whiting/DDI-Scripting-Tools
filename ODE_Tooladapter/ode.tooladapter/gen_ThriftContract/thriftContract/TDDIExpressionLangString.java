/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thriftContract;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2019-02-18")
public class TDDIExpressionLangString implements org.apache.thrift.TBase<TDDIExpressionLangString, TDDIExpressionLangString._Fields>, java.io.Serializable, Cloneable, Comparable<TDDIExpressionLangString> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDDIExpressionLangString");

  private static final org.apache.thrift.protocol.TField LANG_FIELD_DESC = new org.apache.thrift.protocol.TField("Lang", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField CONTENT_FIELD_DESC = new org.apache.thrift.protocol.TField("Content", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField EXPRESSION_FIELD_DESC = new org.apache.thrift.protocol.TField("Expression", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TDDIExpressionLangStringStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TDDIExpressionLangStringTupleSchemeFactory();

  public java.lang.String Lang; // required
  public java.lang.String Content; // required
  public TDDIAbstractArtifactElement Expression; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    LANG((short)1, "Lang"),
    CONTENT((short)2, "Content"),
    EXPRESSION((short)3, "Expression");

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
        case 1: // LANG
          return LANG;
        case 2: // CONTENT
          return CONTENT;
        case 3: // EXPRESSION
          return EXPRESSION;
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
    tmpMap.put(_Fields.LANG, new org.apache.thrift.meta_data.FieldMetaData("Lang", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CONTENT, new org.apache.thrift.meta_data.FieldMetaData("Content", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.EXPRESSION, new org.apache.thrift.meta_data.FieldMetaData("Expression", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT        , "TDDIAbstractArtifactElement")));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDDIExpressionLangString.class, metaDataMap);
  }

  public TDDIExpressionLangString() {
    this.Lang = "";

    this.Content = "";

  }

  public TDDIExpressionLangString(
    java.lang.String Lang,
    java.lang.String Content,
    TDDIAbstractArtifactElement Expression)
  {
    this();
    this.Lang = Lang;
    this.Content = Content;
    this.Expression = Expression;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TDDIExpressionLangString(TDDIExpressionLangString other) {
    if (other.isSetLang()) {
      this.Lang = other.Lang;
    }
    if (other.isSetContent()) {
      this.Content = other.Content;
    }
    if (other.isSetExpression()) {
      this.Expression = new TDDIAbstractArtifactElement(other.Expression);
    }
  }

  public TDDIExpressionLangString deepCopy() {
    return new TDDIExpressionLangString(this);
  }

  @Override
  public void clear() {
    this.Lang = "";

    this.Content = "";

    this.Expression = null;
  }

  public java.lang.String getLang() {
    return this.Lang;
  }

  public TDDIExpressionLangString setLang(java.lang.String Lang) {
    this.Lang = Lang;
    return this;
  }

  public void unsetLang() {
    this.Lang = null;
  }

  /** Returns true if field Lang is set (has been assigned a value) and false otherwise */
  public boolean isSetLang() {
    return this.Lang != null;
  }

  public void setLangIsSet(boolean value) {
    if (!value) {
      this.Lang = null;
    }
  }

  public java.lang.String getContent() {
    return this.Content;
  }

  public TDDIExpressionLangString setContent(java.lang.String Content) {
    this.Content = Content;
    return this;
  }

  public void unsetContent() {
    this.Content = null;
  }

  /** Returns true if field Content is set (has been assigned a value) and false otherwise */
  public boolean isSetContent() {
    return this.Content != null;
  }

  public void setContentIsSet(boolean value) {
    if (!value) {
      this.Content = null;
    }
  }

  public TDDIAbstractArtifactElement getExpression() {
    return this.Expression;
  }

  public TDDIExpressionLangString setExpression(TDDIAbstractArtifactElement Expression) {
    this.Expression = Expression;
    return this;
  }

  public void unsetExpression() {
    this.Expression = null;
  }

  /** Returns true if field Expression is set (has been assigned a value) and false otherwise */
  public boolean isSetExpression() {
    return this.Expression != null;
  }

  public void setExpressionIsSet(boolean value) {
    if (!value) {
      this.Expression = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case LANG:
      if (value == null) {
        unsetLang();
      } else {
        setLang((java.lang.String)value);
      }
      break;

    case CONTENT:
      if (value == null) {
        unsetContent();
      } else {
        setContent((java.lang.String)value);
      }
      break;

    case EXPRESSION:
      if (value == null) {
        unsetExpression();
      } else {
        setExpression((TDDIAbstractArtifactElement)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case LANG:
      return getLang();

    case CONTENT:
      return getContent();

    case EXPRESSION:
      return getExpression();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case LANG:
      return isSetLang();
    case CONTENT:
      return isSetContent();
    case EXPRESSION:
      return isSetExpression();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TDDIExpressionLangString)
      return this.equals((TDDIExpressionLangString)that);
    return false;
  }

  public boolean equals(TDDIExpressionLangString that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_Lang = true && this.isSetLang();
    boolean that_present_Lang = true && that.isSetLang();
    if (this_present_Lang || that_present_Lang) {
      if (!(this_present_Lang && that_present_Lang))
        return false;
      if (!this.Lang.equals(that.Lang))
        return false;
    }

    boolean this_present_Content = true && this.isSetContent();
    boolean that_present_Content = true && that.isSetContent();
    if (this_present_Content || that_present_Content) {
      if (!(this_present_Content && that_present_Content))
        return false;
      if (!this.Content.equals(that.Content))
        return false;
    }

    boolean this_present_Expression = true && this.isSetExpression();
    boolean that_present_Expression = true && that.isSetExpression();
    if (this_present_Expression || that_present_Expression) {
      if (!(this_present_Expression && that_present_Expression))
        return false;
      if (!this.Expression.equals(that.Expression))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetLang()) ? 131071 : 524287);
    if (isSetLang())
      hashCode = hashCode * 8191 + Lang.hashCode();

    hashCode = hashCode * 8191 + ((isSetContent()) ? 131071 : 524287);
    if (isSetContent())
      hashCode = hashCode * 8191 + Content.hashCode();

    hashCode = hashCode * 8191 + ((isSetExpression()) ? 131071 : 524287);
    if (isSetExpression())
      hashCode = hashCode * 8191 + Expression.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TDDIExpressionLangString other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetLang()).compareTo(other.isSetLang());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLang()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Lang, other.Lang);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetContent()).compareTo(other.isSetContent());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetContent()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Content, other.Content);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetExpression()).compareTo(other.isSetExpression());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExpression()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Expression, other.Expression);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TDDIExpressionLangString(");
    boolean first = true;

    sb.append("Lang:");
    if (this.Lang == null) {
      sb.append("null");
    } else {
      sb.append(this.Lang);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("Content:");
    if (this.Content == null) {
      sb.append("null");
    } else {
      sb.append(this.Content);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("Expression:");
    if (this.Expression == null) {
      sb.append("null");
    } else {
      sb.append(this.Expression);
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

  private static class TDDIExpressionLangStringStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDDIExpressionLangStringStandardScheme getScheme() {
      return new TDDIExpressionLangStringStandardScheme();
    }
  }

  private static class TDDIExpressionLangStringStandardScheme extends org.apache.thrift.scheme.StandardScheme<TDDIExpressionLangString> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TDDIExpressionLangString struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // LANG
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.Lang = iprot.readString();
              struct.setLangIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CONTENT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.Content = iprot.readString();
              struct.setContentIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // EXPRESSION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.Expression = new TDDIAbstractArtifactElement();
              struct.Expression.read(iprot);
              struct.setExpressionIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TDDIExpressionLangString struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.Lang != null) {
        oprot.writeFieldBegin(LANG_FIELD_DESC);
        oprot.writeString(struct.Lang);
        oprot.writeFieldEnd();
      }
      if (struct.Content != null) {
        oprot.writeFieldBegin(CONTENT_FIELD_DESC);
        oprot.writeString(struct.Content);
        oprot.writeFieldEnd();
      }
      if (struct.Expression != null) {
        oprot.writeFieldBegin(EXPRESSION_FIELD_DESC);
        struct.Expression.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TDDIExpressionLangStringTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDDIExpressionLangStringTupleScheme getScheme() {
      return new TDDIExpressionLangStringTupleScheme();
    }
  }

  private static class TDDIExpressionLangStringTupleScheme extends org.apache.thrift.scheme.TupleScheme<TDDIExpressionLangString> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TDDIExpressionLangString struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetLang()) {
        optionals.set(0);
      }
      if (struct.isSetContent()) {
        optionals.set(1);
      }
      if (struct.isSetExpression()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetLang()) {
        oprot.writeString(struct.Lang);
      }
      if (struct.isSetContent()) {
        oprot.writeString(struct.Content);
      }
      if (struct.isSetExpression()) {
        struct.Expression.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TDDIExpressionLangString struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.Lang = iprot.readString();
        struct.setLangIsSet(true);
      }
      if (incoming.get(1)) {
        struct.Content = iprot.readString();
        struct.setContentIsSet(true);
      }
      if (incoming.get(2)) {
        struct.Expression = new TDDIAbstractArtifactElement();
        struct.Expression.read(iprot);
        struct.setExpressionIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

