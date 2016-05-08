/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.umundo.core;

public class PublisherConfigRTP extends PublisherConfig {
  private long swigCPtr;

  protected PublisherConfigRTP(long cPtr, boolean cMemoryOwn) {
    super(umundoNativeJavaJNI.PublisherConfigRTP_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PublisherConfigRTP obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        umundoNativeJavaJNI.delete_PublisherConfigRTP(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public PublisherConfigRTP(String channel) {
    this(umundoNativeJavaJNI.new_PublisherConfigRTP(channel), true);
  }

  public void setTimestampIncrement(long increment) {
    umundoNativeJavaJNI.PublisherConfigRTP_setTimestampIncrement(swigCPtr, this, increment);
  }

  public void setPortbase(int port) {
    umundoNativeJavaJNI.PublisherConfigRTP_setPortbase(swigCPtr, this, port);
  }

  public void setPayloadType(short type) {
    umundoNativeJavaJNI.PublisherConfigRTP_setPayloadType(swigCPtr, this, type);
  }

}
