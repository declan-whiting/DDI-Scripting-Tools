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
  public partial class TDDINonHuman : TBase
  {
    private long _Id;
    private string _Name;
    private string _Description;
    private List<TDDIKeyValueMap> _KeyValueMaps;
    private string _SkillLevel;
    private string _Motivation;
    private string _AnonymityDesire;
    private List<TDDIAttackerGoal> _AttackerGoals;
    private List<TDDIPayloadRef> _Payloads;

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

    public string SkillLevel
    {
      get
      {
        return _SkillLevel;
      }
      set
      {
        __isset.SkillLevel = true;
        this._SkillLevel = value;
      }
    }

    public string Motivation
    {
      get
      {
        return _Motivation;
      }
      set
      {
        __isset.Motivation = true;
        this._Motivation = value;
      }
    }

    public string AnonymityDesire
    {
      get
      {
        return _AnonymityDesire;
      }
      set
      {
        __isset.AnonymityDesire = true;
        this._AnonymityDesire = value;
      }
    }

    public List<TDDIAttackerGoal> AttackerGoals
    {
      get
      {
        return _AttackerGoals;
      }
      set
      {
        __isset.AttackerGoals = true;
        this._AttackerGoals = value;
      }
    }

    public List<TDDIPayloadRef> Payloads
    {
      get
      {
        return _Payloads;
      }
      set
      {
        __isset.Payloads = true;
        this._Payloads = value;
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
      public bool SkillLevel;
      public bool Motivation;
      public bool AnonymityDesire;
      public bool AttackerGoals;
      public bool Payloads;
    }

    public TDDINonHuman() {
      this._Name = "";
      this.__isset.Name = true;
      this._Description = "";
      this.__isset.Description = true;
      this._KeyValueMaps = new List<TDDIKeyValueMap>();
      this.__isset.KeyValueMaps = true;
      this._SkillLevel = "";
      this.__isset.SkillLevel = true;
      this._Motivation = "";
      this.__isset.Motivation = true;
      this._AnonymityDesire = "";
      this.__isset.AnonymityDesire = true;
      this._AttackerGoals = new List<TDDIAttackerGoal>();
      this.__isset.AttackerGoals = true;
      this._Payloads = new List<TDDIPayloadRef>();
      this.__isset.Payloads = true;
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
                  TList _list1504 = iprot.ReadListBegin();
                  for( int _i1505 = 0; _i1505 < _list1504.Count; ++_i1505)
                  {
                    TDDIKeyValueMap _elem1506;
                    _elem1506 = new TDDIKeyValueMap();
                    _elem1506.Read(iprot);
                    KeyValueMaps.Add(_elem1506);
                  }
                  iprot.ReadListEnd();
                }
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 5:
              if (field.Type == TType.String) {
                SkillLevel = iprot.ReadString();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 6:
              if (field.Type == TType.String) {
                Motivation = iprot.ReadString();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 7:
              if (field.Type == TType.String) {
                AnonymityDesire = iprot.ReadString();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 8:
              if (field.Type == TType.List) {
                {
                  AttackerGoals = new List<TDDIAttackerGoal>();
                  TList _list1507 = iprot.ReadListBegin();
                  for( int _i1508 = 0; _i1508 < _list1507.Count; ++_i1508)
                  {
                    TDDIAttackerGoal _elem1509;
                    _elem1509 = new TDDIAttackerGoal();
                    _elem1509.Read(iprot);
                    AttackerGoals.Add(_elem1509);
                  }
                  iprot.ReadListEnd();
                }
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 9:
              if (field.Type == TType.List) {
                {
                  Payloads = new List<TDDIPayloadRef>();
                  TList _list1510 = iprot.ReadListBegin();
                  for( int _i1511 = 0; _i1511 < _list1510.Count; ++_i1511)
                  {
                    TDDIPayloadRef _elem1512;
                    _elem1512 = new TDDIPayloadRef();
                    _elem1512.Read(iprot);
                    Payloads.Add(_elem1512);
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
        TStruct struc = new TStruct("TDDINonHuman");
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
            foreach (TDDIKeyValueMap _iter1513 in KeyValueMaps)
            {
              _iter1513.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        if (SkillLevel != null && __isset.SkillLevel) {
          field.Name = "SkillLevel";
          field.Type = TType.String;
          field.ID = 5;
          oprot.WriteFieldBegin(field);
          oprot.WriteString(SkillLevel);
          oprot.WriteFieldEnd();
        }
        if (Motivation != null && __isset.Motivation) {
          field.Name = "Motivation";
          field.Type = TType.String;
          field.ID = 6;
          oprot.WriteFieldBegin(field);
          oprot.WriteString(Motivation);
          oprot.WriteFieldEnd();
        }
        if (AnonymityDesire != null && __isset.AnonymityDesire) {
          field.Name = "AnonymityDesire";
          field.Type = TType.String;
          field.ID = 7;
          oprot.WriteFieldBegin(field);
          oprot.WriteString(AnonymityDesire);
          oprot.WriteFieldEnd();
        }
        if (AttackerGoals != null && __isset.AttackerGoals) {
          field.Name = "AttackerGoals";
          field.Type = TType.List;
          field.ID = 8;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, AttackerGoals.Count));
            foreach (TDDIAttackerGoal _iter1514 in AttackerGoals)
            {
              _iter1514.Write(oprot);
            }
            oprot.WriteListEnd();
          }
          oprot.WriteFieldEnd();
        }
        if (Payloads != null && __isset.Payloads) {
          field.Name = "Payloads";
          field.Type = TType.List;
          field.ID = 9;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteListBegin(new TList(TType.Struct, Payloads.Count));
            foreach (TDDIPayloadRef _iter1515 in Payloads)
            {
              _iter1515.Write(oprot);
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
      StringBuilder __sb = new StringBuilder("TDDINonHuman(");
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
      if (SkillLevel != null && __isset.SkillLevel) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("SkillLevel: ");
        __sb.Append(SkillLevel);
      }
      if (Motivation != null && __isset.Motivation) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Motivation: ");
        __sb.Append(Motivation);
      }
      if (AnonymityDesire != null && __isset.AnonymityDesire) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("AnonymityDesire: ");
        __sb.Append(AnonymityDesire);
      }
      if (AttackerGoals != null && __isset.AttackerGoals) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("AttackerGoals: ");
        __sb.Append(AttackerGoals);
      }
      if (Payloads != null && __isset.Payloads) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Payloads: ");
        __sb.Append(Payloads);
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }

}
