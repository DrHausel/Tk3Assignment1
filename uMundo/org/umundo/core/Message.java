/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.umundo.core;

import java.util.HashMap;

public class Message {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected Message(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Message obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        umundoNativeJavaJNI.delete_Message(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

public HashMap<String, String> getMeta() {
	HashMap<String, String> metas = new HashMap<String, String>();
	StringMap metaMap = getMetaNative();
	StringArray metaKeys = getMetaKeys();
	for (int i = 0; i < metaKeys.size(); i++) {
	  String key = metaKeys.get(i);
		metas.put(key, metaMap.get(key));
	}
	return metas;
}


  public Message() {
    this(umundoNativeJavaJNI.new_Message__SWIG_0(), true);
  }

  public Message(byte[] data) {
    this(umundoNativeJavaJNI.new_Message__SWIG_1(data), true);
  }

  public Message(Message other) {
    this(umundoNativeJavaJNI.new_Message__SWIG_2(Message.getCPtr(other), other), true);
  }

  public byte[] getData() {
  return umundoNativeJavaJNI.Message_getData(swigCPtr, this);
}

  public long getSize() {
    return umundoNativeJavaJNI.Message_getSize(swigCPtr, this);
  }

  public long getFlags() {
    return umundoNativeJavaJNI.Message_getFlags(swigCPtr, this);
  }

  public void compress() {
    umundoNativeJavaJNI.Message_compress(swigCPtr, this);
  }

  public void uncompress() {
    umundoNativeJavaJNI.Message_uncompress(swigCPtr, this);
  }

  public boolean isCompressed() {
    return umundoNativeJavaJNI.Message_isCompressed(swigCPtr, this);
  }

  public void setData(byte[] data) {
    umundoNativeJavaJNI.Message_setData(swigCPtr, this, data);
  }

  public void putMeta(String key, String value) {
    umundoNativeJavaJNI.Message_putMeta(swigCPtr, this, key, value);
  }

  private StringMap getMetaNative() {
    return new StringMap(umundoNativeJavaJNI.Message_getMetaNative(swigCPtr, this), false);
  }

  public String getMeta(String key) {
    return umundoNativeJavaJNI.Message_getMeta(swigCPtr, this, key);
  }

  public void setReceiver(String uuid) {
    umundoNativeJavaJNI.Message_setReceiver(swigCPtr, this, uuid);
  }

  public static Message toSubscriber(String uuid) {
    long cPtr = umundoNativeJavaJNI.Message_toSubscriber(uuid);
    return (cPtr == 0) ? null : new Message(cPtr, false);
  }

  public StringArray getMetaKeys() {
    return new StringArray(umundoNativeJavaJNI.Message_getMetaKeys(swigCPtr, this), true);
  }

  public final static class Type {
    public final static Message.Type UM_VERSION = new Message.Type("UM_VERSION", 0xF005);
    public final static Message.Type UM_CONNECT_REQ = new Message.Type("UM_CONNECT_REQ", 0x0001);
    public final static Message.Type UM_CONNECT_REP = new Message.Type("UM_CONNECT_REP", 0x0002);
    public final static Message.Type UM_NODE_INFO = new Message.Type("UM_NODE_INFO", 0x0003);
    public final static Message.Type UM_PUB_ADDED = new Message.Type("UM_PUB_ADDED", 0x0004);
    public final static Message.Type UM_PUB_REMOVED = new Message.Type("UM_PUB_REMOVED", 0x0005);
    public final static Message.Type UM_SUBSCRIBE = new Message.Type("UM_SUBSCRIBE", 0x0006);
    public final static Message.Type UM_UNSUBSCRIBE = new Message.Type("UM_UNSUBSCRIBE", 0x0007);
    public final static Message.Type UM_DEBUG = new Message.Type("UM_DEBUG", 0x0009);
    public final static Message.Type UM_SHUTDOWN = new Message.Type("UM_SHUTDOWN", 0x000C);

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static Type swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + Type.class + " with value " + swigValue);
    }

    private Type(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private Type(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private Type(String swigName, Type swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static Type[] swigValues = { UM_VERSION, UM_CONNECT_REQ, UM_CONNECT_REP, UM_NODE_INFO, UM_PUB_ADDED, UM_PUB_REMOVED, UM_SUBSCRIBE, UM_UNSUBSCRIBE, UM_DEBUG, UM_SHUTDOWN };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

  public final static class Flags {
    public final static Message.Flags NONE = new Message.Flags("NONE", 0x0000);
    public final static Message.Flags ADOPT_DATA = new Message.Flags("ADOPT_DATA", 0x0001);
    public final static Message.Flags WRAP_DATA = new Message.Flags("WRAP_DATA", 0x0002);

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static Flags swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + Flags.class + " with value " + swigValue);
    }

    private Flags(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private Flags(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private Flags(String swigName, Flags swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static Flags[] swigValues = { NONE, ADOPT_DATA, WRAP_DATA };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
