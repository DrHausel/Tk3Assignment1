/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.umundo.core;

public class SubscriberConfigMCast extends SubscriberConfigRTP {
  private long swigCPtr;

  protected SubscriberConfigMCast(long cPtr, boolean cMemoryOwn) {
    super(umundoNativeJavaJNI.SubscriberConfigMCast_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SubscriberConfigMCast obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        umundoNativeJavaJNI.delete_SubscriberConfigMCast(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public SubscriberConfigMCast(String channel) {
    this(umundoNativeJavaJNI.new_SubscriberConfigMCast(channel), true);
  }

}
