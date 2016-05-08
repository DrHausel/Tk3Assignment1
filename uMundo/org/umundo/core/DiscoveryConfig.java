/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.umundo.core;

public class DiscoveryConfig extends Options {
  private long swigCPtr;

  protected DiscoveryConfig(long cPtr, boolean cMemoryOwn) {
    super(umundoNativeJavaJNI.DiscoveryConfig_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(DiscoveryConfig obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        umundoNativeJavaJNI.delete_DiscoveryConfig(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setDomain(String domain) {
    umundoNativeJavaJNI.DiscoveryConfig_setDomain(swigCPtr, this, domain);
  }

}
