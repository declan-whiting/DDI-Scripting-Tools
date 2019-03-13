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
  public partial class TDDIFailureModelUnion : TBase
  {
    private TDDIFailureModel _FailureModel;
    private TDDIFMEA _FMEA;
    private TDDIMarkovChain _MarkovChain;
    private TDDIFaultTree _FaultTree;

    public TDDIFailureModel FailureModel
    {
      get
      {
        return _FailureModel;
      }
      set
      {
        __isset.FailureModel = true;
        this._FailureModel = value;
      }
    }

    public TDDIFMEA FMEA
    {
      get
      {
        return _FMEA;
      }
      set
      {
        __isset.FMEA = true;
        this._FMEA = value;
      }
    }

    public TDDIMarkovChain MarkovChain
    {
      get
      {
        return _MarkovChain;
      }
      set
      {
        __isset.MarkovChain = true;
        this._MarkovChain = value;
      }
    }

    public TDDIFaultTree FaultTree
    {
      get
      {
        return _FaultTree;
      }
      set
      {
        __isset.FaultTree = true;
        this._FaultTree = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool FailureModel;
      public bool FMEA;
      public bool MarkovChain;
      public bool FaultTree;
    }

    public TDDIFailureModelUnion() {
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
                FailureModel = new TDDIFailureModel();
                FailureModel.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 2:
              if (field.Type == TType.Struct) {
                FMEA = new TDDIFMEA();
                FMEA.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 3:
              if (field.Type == TType.Struct) {
                MarkovChain = new TDDIMarkovChain();
                MarkovChain.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 4:
              if (field.Type == TType.Struct) {
                FaultTree = new TDDIFaultTree();
                FaultTree.Read(iprot);
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
        TStruct struc = new TStruct("TDDIFailureModelUnion");
        oprot.WriteStructBegin(struc);
        TField field = new TField();
        if (FailureModel != null && __isset.FailureModel) {
          field.Name = "FailureModel";
          field.Type = TType.Struct;
          field.ID = 1;
          oprot.WriteFieldBegin(field);
          FailureModel.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (FMEA != null && __isset.FMEA) {
          field.Name = "FMEA";
          field.Type = TType.Struct;
          field.ID = 2;
          oprot.WriteFieldBegin(field);
          FMEA.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (MarkovChain != null && __isset.MarkovChain) {
          field.Name = "MarkovChain";
          field.Type = TType.Struct;
          field.ID = 3;
          oprot.WriteFieldBegin(field);
          MarkovChain.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (FaultTree != null && __isset.FaultTree) {
          field.Name = "FaultTree";
          field.Type = TType.Struct;
          field.ID = 4;
          oprot.WriteFieldBegin(field);
          FaultTree.Write(oprot);
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
      StringBuilder __sb = new StringBuilder("TDDIFailureModelUnion(");
      bool __first = true;
      if (FailureModel != null && __isset.FailureModel) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("FailureModel: ");
        __sb.Append(FailureModel== null ? "<null>" : FailureModel.ToString());
      }
      if (FMEA != null && __isset.FMEA) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("FMEA: ");
        __sb.Append(FMEA);
      }
      if (MarkovChain != null && __isset.MarkovChain) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("MarkovChain: ");
        __sb.Append(MarkovChain);
      }
      if (FaultTree != null && __isset.FaultTree) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("FaultTree: ");
        __sb.Append(FaultTree);
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }

}