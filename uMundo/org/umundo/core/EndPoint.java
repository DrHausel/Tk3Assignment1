/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.umundo.core;

public class EndPoint {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected EndPoint(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(EndPoint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        umundoNativeJavaJNI.delete_EndPoint(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public EndPoint(String address) {
    this(umundoNativeJavaJNI.new_EndPoint(address), true);
  }

  public boolean isValid() {
    return umundoNativeJavaJNI.EndPoint_isValid(swigCPtr, this);
  }

  public boolean equals(EndPoint other) {
    return umundoNativeJavaJNI.EndPoint_equals(swigCPtr, this, EndPoint.getCPtr(other), other);
  }

  public String getAddress() {
    return umundoNativeJavaJNI.EndPoint_getAddress(swigCPtr, this);
  }

  public String getIP() {
    return umundoNativeJavaJNI.EndPoint_getIP(swigCPtr, this);
  }

  public String getTransport() {
    return umundoNativeJavaJNI.EndPoint_getTransport(swigCPtr, this);
  }

  public int getPort() {
    return umundoNativeJavaJNI.EndPoint_getPort(swigCPtr, this);
  }

  public boolean isRemote() {
    return umundoNativeJavaJNI.EndPoint_isRemote(swigCPtr, this);
  }

  public boolean isInProcess() {
    return umundoNativeJavaJNI.EndPoint_isInProcess(swigCPtr, this);
  }

  public String getHost() {
    return umundoNativeJavaJNI.EndPoint_getHost(swigCPtr, this);
  }

  public String getDomain() {
    return umundoNativeJavaJNI.EndPoint_getDomain(swigCPtr, this);
  }

  public java.math.BigInteger getLastSeen() {
    return umundoNativeJavaJNI.EndPoint_getLastSeen(swigCPtr, this);
  }

  public String getUUID() {
    return umundoNativeJavaJNI.EndPoint_getUUID(swigCPtr, this);
  }

  public void updateLastSeen() {
    umundoNativeJavaJNI.EndPoint_updateLastSeen(swigCPtr, this);
  }

}
