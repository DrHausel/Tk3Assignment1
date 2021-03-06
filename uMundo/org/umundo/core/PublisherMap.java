/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.umundo.core;

public class PublisherMap {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected PublisherMap(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PublisherMap obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        umundoNativeJavaJNI.delete_PublisherMap(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public PublisherMap() {
    this(umundoNativeJavaJNI.new_PublisherMap__SWIG_0(), true);
  }

  public PublisherMap(PublisherMap arg0) {
    this(umundoNativeJavaJNI.new_PublisherMap__SWIG_1(PublisherMap.getCPtr(arg0), arg0), true);
  }

  public long size() {
    return umundoNativeJavaJNI.PublisherMap_size(swigCPtr, this);
  }

  public boolean empty() {
    return umundoNativeJavaJNI.PublisherMap_empty(swigCPtr, this);
  }

  public void clear() {
    umundoNativeJavaJNI.PublisherMap_clear(swigCPtr, this);
  }

  public Publisher get(String key) {
    return new Publisher(umundoNativeJavaJNI.PublisherMap_get(swigCPtr, this, key), false);
  }

  public void set(String key, Publisher x) {
    umundoNativeJavaJNI.PublisherMap_set(swigCPtr, this, key, Publisher.getCPtr(x), x);
  }

  public void del(String key) {
    umundoNativeJavaJNI.PublisherMap_del(swigCPtr, this, key);
  }

  public boolean has_key(String key) {
    return umundoNativeJavaJNI.PublisherMap_has_key(swigCPtr, this, key);
  }

}
