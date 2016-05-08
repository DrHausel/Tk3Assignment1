/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.umundo.core;

public class EndPointResultSet {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected EndPointResultSet(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(EndPointResultSet obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        umundoNativeJavaJNI.delete_EndPointResultSet(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void add(EndPoint entity) {
    umundoNativeJavaJNI.EndPointResultSet_add__SWIG_0(swigCPtr, this, EndPoint.getCPtr(entity), entity);
  }

  public void add(EndPoint entity, String via) {
    umundoNativeJavaJNI.EndPointResultSet_add__SWIG_1(swigCPtr, this, EndPoint.getCPtr(entity), entity, via);
  }

  public void remove(EndPoint entity) {
    umundoNativeJavaJNI.EndPointResultSet_remove__SWIG_0(swigCPtr, this, EndPoint.getCPtr(entity), entity);
  }

  public void remove(EndPoint entity, String via) {
    umundoNativeJavaJNI.EndPointResultSet_remove__SWIG_1(swigCPtr, this, EndPoint.getCPtr(entity), entity, via);
  }

  public void change(EndPoint entity, java.math.BigInteger what) {
    umundoNativeJavaJNI.EndPointResultSet_change__SWIG_0(swigCPtr, this, EndPoint.getCPtr(entity), entity, what);
  }

  public void change(EndPoint entity) {
    umundoNativeJavaJNI.EndPointResultSet_change__SWIG_1(swigCPtr, this, EndPoint.getCPtr(entity), entity);
  }

  public void change(EndPoint entity, String via, java.math.BigInteger what) {
    umundoNativeJavaJNI.EndPointResultSet_change__SWIG_2(swigCPtr, this, EndPoint.getCPtr(entity), entity, via, what);
  }

  public void change(EndPoint entity, String via) {
    umundoNativeJavaJNI.EndPointResultSet_change__SWIG_3(swigCPtr, this, EndPoint.getCPtr(entity), entity, via);
  }

}