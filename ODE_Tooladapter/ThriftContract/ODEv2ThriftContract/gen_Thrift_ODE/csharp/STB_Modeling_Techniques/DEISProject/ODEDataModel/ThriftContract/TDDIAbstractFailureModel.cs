/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
using System;
using System.Collections;
using System.Collections.Generic;
using System.Text;
using System.IO;
using Thrift;
using Thrift.Collections;
using System.Runtime.Serialization;
using Thrift.Protocol;
using Thrift.Transport;

namespace STB_Modeling_Techniques.DEISProject.ODEDataModel.ThriftContract
{

  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class TDDIAbstractFailureModel : TBase
  {
    private TDDIFailureModelUnion _UsedFailureModel;
    private TDDIFailureModelUnionType _UsedFailureModelType;

    public TDDIFailureModelUnion UsedFailureModel
    {
      get
      {
        return _UsedFailureModel;
      }
      set
      {
        __isset.UsedFailureModel = true;
        this._UsedFailureModel = value;
      }
    }

    /// <summary>
    /// 
    /// <seealso cref="TDDIFailureModelUnionType"/>
    /// </summary>
    public TDDIFailureModelUnionType UsedFailureModelType
    {
      get
      {
        return _UsedFailureModelType;
      }
      set
      {
        __isset.UsedFailureModelType = true;
        this._UsedFailureModelType = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool UsedFailureModel;
      public bool UsedFailureModelType;
    }

    public TDDIAbstractFailureModel() {
    }

    public void Read (TProtocol iprot)
    {
      iprot.IncrementRecursionDepth();
      try
      {
        TField field;
        iprot.ReadStructBegin();
        while (true)
        {
          field = iprot.ReadFieldBegin();
          if (field.Type == TType.Stop) { 
            break;
          }
          switch (field.ID)
          {
            case 1:
              if (field.Type == TType.Struct) {
                UsedFailureModel = new TDDIFailureModelUnion();
                UsedFailureModel.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 2:
              if (field.Type == TType.I32) {
                UsedFailureModelType = (TDDIFailureModelUnionType)iprot.ReadI32();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            default: 
              TProtocolUtil.Skip(iprot, field.Type);
              break;
          }
          iprot.ReadFieldEnd();
        }
        iprot.ReadStructEnd();
      }
      finally
      {
        iprot.DecrementRecursionDepth();
      }
    }

    public void Write(TProtocol oprot) {
      oprot.IncrementRecursionDepth();
      try
      {
        TStruct struc = new TStruct("TDDIAbstractFailureModel");
        oprot.WriteStructBegin(struc);
        TField field = new TField();
        if (UsedFailureModel != null && __isset.UsedFailureModel) {
          field.Name = "UsedFailureModel";
          field.Type = TType.Struct;
          field.ID = 1;
          oprot.WriteFieldBegin(field);
          UsedFailureModel.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (__isset.UsedFailureModelType) {
          field.Name = "UsedFailureModelType";
          field.Type = TType.I32;
          field.ID = 2;
          oprot.WriteFieldBegin(field);
          oprot.WriteI32((int)UsedFailureModelType);
          oprot.WriteFieldEnd();
        }
        oprot.WriteFieldStop();
        oprot.WriteStructEnd();
      }
      finally
      {
        oprot.DecrementRecursionDepth();
      }
    }

    public override string ToString() {
      StringBuilder __sb = new StringBuilder("TDDIAbstractFailureModel(");
      bool __first = true;
      if (UsedFailureModel != null && __isset.UsedFailureModel) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("UsedFailureModel: ");
        __sb.Append(UsedFailureModel== null ? "<null>" : UsedFailureModel.ToString());
      }
      if (__isset.UsedFailureModelType) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("UsedFailureModelType: ");
        __sb.Append(UsedFailureModelType);
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }

}