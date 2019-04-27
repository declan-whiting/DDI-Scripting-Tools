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
  public partial class TDDITARAPackage : TBase
  {
    private long _Id;
    private string _Name;
    private string _Description;
    private List<TDDIKeyValueMap> _KeyValueMaps;
    private List<TDDISecurityRisk> _IdentifiedRisks;
    private List<TDDISecurityControl> _Controls;
    private List<TDDIAbstractAsset> _ConsideredAssets;
    private List<TDDIAbstractThreatAgent> _ConsideredThreatAgents;

    public long Id
    {
      get
      {
        return _Id;
      }
      set
      {
        __isset.Id = true;
        this._Id = value;
      }
    }

    public string Name
    {
      get
      {
        return _Name;
      }
      set
      {
        __isset.Name = true;
        this._Name = value;
      }
    }

    public string Description
    {
      get
      {
        return _Description;
      }
      set
      {
        __isset.Description = true;
        this._Description = value;
      }
    }

    public List<TDDIKeyValueMap> KeyValueMaps
    {
      get
      {
        return _KeyValueMaps;
      }
      set
      {
        __isset.KeyValueMaps = true;
        this._KeyValueMaps = value;
      }
    }

    public List<TDDISecurityRisk> IdentifiedRisks
    {
      get
      {
        return _IdentifiedRisks;
      }
      set
      {
        __isset.IdentifiedRisks = true;
        this._IdentifiedRisks = value;
      }
    }

    public List<TDDISecurityControl> Controls
    {
      get
      {
        return _Controls;
      }
      set
      {
        __isset.Controls = true;
        this._Controls = value;
      }
    }

    public List<TDDIAbstractAsset> ConsideredAssets
    {
      get
      {
        return _ConsideredAssets;
      }
      set
      {
        __isset.ConsideredAssets = true;
        this._ConsideredAssets = value;
      }
    }

    public List<TDDIAbstractThreatAgent> ConsideredThreatAgents
    {
      get
      {
        return _ConsideredThreatAgents;
      }
      set
      {
        __isset.ConsideredThreatAgents = true;
        this._ConsideredThreatAgents = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool Id;
      public bool Name;
      public bool Description;
      public bool KeyValueMaps;
      public bool IdentifiedRisks;
      public bool Controls;
      public bool ConsideredAssets;
      public bool ConsideredThreatAgents;
    }

    public TDDITARAPackage() {
      this._Name = "";
      this.__isset.Name = true;
      this._Description = "";
      this.__isset.Description = true;
      this._KeyValueMaps = new List<TDDIKeyValueMap>();
      this.__isset.KeyValueMaps = true;
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
              if (field.Type == TType.I64) {
                Id = iprot.ReadI64();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 2:
              if (field.Type == TType.String) {
                Name = iprot.ReadString();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 3:
              if (field.Type == TType.String) {
                Description = iprot.ReadString();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 4:
              if (field.Type == TType.List) {
                {
                  KeyValueMaps = new List<TDDIKeyValueMap>();
                  TList _list1516 = iprot.ReadListBegin();
                  for( int _i1517 = 0; _i1517 < _list1516.Count; ++_i1517)
                  {
                    TDDIKeyValueMap _elem1518;
                    _elem1518 = new TDDIKeyValueMap();
                    _elem1518.Read(iprot);
                    KeyValueMaps.Add(_elem1518);
                  }
                  iprot.ReadListEnd();
                }
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 5:
              if (field.Type == TType.List) {
                {
                  IdentifiedRisks = new List<TDDISecurityRisk>();
                  TList _list1519 = iprot.ReadListBegin();
                  for( int _i1520 = 0; _i1520 < _list1519.Count; ++_i1520)
                  {
                    TDDISecurityRisk _elem1521;
                    _elem1521 = new TDDISecurityRisk();
                    _elem1521.Read(iprot);
                    IdentifiedRisks.Add(_elem1521);
                  }
                  iprot.ReadListEnd();
                }
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 6:
              if (field.Type == TType.List) {
                {
                  Controls = new List<TDDISecurityControl>();
                  TList _list1522 = iprot.ReadListBegin();
                  for( int _i1523 = 0; _i1523 < _list1522.Count; ++_i1523)
                  {
                    TDDISecurityControl _elem1524;
                    _elem1524 = new TDDISecurityControl();
                    _elem1524.Read(iprot);
                    Controls.Add(_elem1524);
                  }
                  iprot.ReadListEnd();
                }
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 7:
              if (field.Type == TType.List) {
                {
                  ConsideredAssets = new List<TDDIAbstractAsset>();
                  TList _list1525 = iprot.ReadListBegin();
                  for( int _i1526 = 0; _i1526 < _list1525.Count; ++_i1526)
                  {
                    TDDIAbstractAsset _elem1527;
                    _elem1527 = new TDDIAbstractAsset();
                    _elem1527.Read(iprot);
                    ConsideredAssets.Add(_elem1527);
                  }
                  iprot.ReadListEnd();
                }
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 8:
              if (field.Type == TType.List) {
                {
                  ConsideredThreatAgents = new List<TDDIAbstractThreatAgent>();
                  TList _list1528 = iprot.ReadListBegin();
                  for( int _i1529 = 0; _i1529 < _list1528.Count; ++_i1529)
                  {
                    TDDIAbstractThreatAgent _elem1530;
                    _elem1530 = new TDDIAbstractThreatAgent();
                    _elem1530.Read(iprot);
                    ConsideredThreatAgents.Add(_elem1530);
                  }
                  iprot.ReadListEnd();
                }
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
        TStruct struc = new TStruct("TDDITARAPackage");
        oprot.WriteStructBegin(struc);
        TField field = new TField();
        if (__isset.Id) {
          field.Name = "Id";
          field.Type = TType.I64;
          field.ID = 1;
          oprot.WriteFieldBegin(field);
          oprot.WriteI64(Id);
          oprot.WriteFieldEnd();
        }
        if (Name != null && __isset.Name) {
          field.Name = "Name";
          field.Type = TType.String;
          field.ID = 2;
          oprot.WriteFieldBegin(field);
          oprot.WriteString(Name);
          oprot.WriteFieldEnd();
        }
        if (Description != null && __isset.Description) {
          field.Name = "Description";
          field.Type = TType.String;
          field.ID = 3;
          oprot.WriteFieldBegin(field);
          oprot.WriteString(Description);
          oprot.WriteFieldEnd();
        }
        if (KeyValueMaps != null && __isset.KeyValueMaps) {
          field.Name = "KeyValueMaps";
          field.Type = TType.List;
          field.ID = 4;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, KeyValueMaps.Count));
            foreach (TDDIKeyValueMap _iter1531 in KeyValueMaps)
            {
              _iter1531.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        if (IdentifiedRisks != null && __isset.IdentifiedRisks) {
          field.Name = "IdentifiedRisks";
          field.Type = TType.List;
          field.ID = 5;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, IdentifiedRisks.Count));
            foreach (TDDISecurityRisk _iter1532 in IdentifiedRisks)
            {
              _iter1532.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        if (Controls != null && __isset.Controls) {
          field.Name = "Controls";
          field.Type = TType.List;
          field.ID = 6;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, Controls.Count));
            foreach (TDDISecurityControl _iter1533 in Controls)
            {
              _iter1533.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        if (ConsideredAssets != null && __isset.ConsideredAssets) {
          field.Name = "ConsideredAssets";
          field.Type = TType.List;
          field.ID = 7;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, ConsideredAssets.Count));
            foreach (TDDIAbstractAsset _iter1534 in ConsideredAssets)
            {
              _iter1534.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        if (ConsideredThreatAgents != null && __isset.ConsideredThreatAgents) {
          field.Name = "ConsideredThreatAgents";
          field.Type = TType.List;
          field.ID = 8;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, ConsideredThreatAgents.Count));
            foreach (TDDIAbstractThreatAgent _iter1535 in ConsideredThreatAgents)
            {
              _iter1535.Write(oprot);
            }
            oprot.WriteListEnd();
          }
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
      StringBuilder __sb = new StringBuilder("TDDITARAPackage(");
      bool __first = true;
      if (__isset.Id) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Id: ");
        __sb.Append(Id);
      }
      if (Name != null && __isset.Name) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Name: ");
        __sb.Append(Name);
      }
      if (Description != null && __isset.Description) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Description: ");
        __sb.Append(Description);
      }
      if (KeyValueMaps != null && __isset.KeyValueMaps) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("KeyValueMaps: ");
        __sb.Append(KeyValueMaps);
      }
      if (IdentifiedRisks != null && __isset.IdentifiedRisks) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("IdentifiedRisks: ");
        __sb.Append(IdentifiedRisks);
      }
      if (Controls != null && __isset.Controls) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Controls: ");
        __sb.Append(Controls);
      }
      if (ConsideredAssets != null && __isset.ConsideredAssets) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("ConsideredAssets: ");
        __sb.Append(ConsideredAssets);
      }
      if (ConsideredThreatAgents != null && __isset.ConsideredThreatAgents) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("ConsideredThreatAgents: ");
        __sb.Append(ConsideredThreatAgents);
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }

}