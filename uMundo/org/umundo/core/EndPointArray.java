/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.umundo.core;

public class EndPointArray {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected EndPointArray(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(EndPointArray obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        umundoNativeJavaJNI.delete_EndPointArray(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public EndPointArray() {
    this(umundoNativeJavaJNI.new_EndPointArray__SWIG_0(), true);
  }

  public EndPointArray(long n) {
    this(umundoNativeJavaJNI.new_EndPointArray__SWIG_1(n), true);
  }

  public long size() {
    return umundoNativeJavaJNI.EndPointArray_size(swigCPtr, this);
  }

  public long capacity() {
    return umundoNativeJavaJNI.EndPointArray_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    umundoNativeJavaJNI.EndPointArray_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return umundoNativeJavaJNI.EndPointArray_isEmpty(swigCPtr, this);
  }

  public void clear() {
    umundoNativeJavaJNI.EndPointArray_clear(swigCPtr, this);
  }

  public void add(EndPoint x) {
    umundoNativeJavaJNI.EndPointArray_add(swigCPtr, this, EndPoint.getCPtr(x), x);
  }

  public EndPoint get(int i) {
    return new EndPoint(umundoNativeJavaJNI.EndPointArray_get(swigCPtr, this, i), false);
  }

  public void set(int i, EndPoint val) {
    umundoNativeJavaJNI.EndPointArray_set(swigCPtr, this, i, EndPoint.getCPtr(val), val);
  }

}