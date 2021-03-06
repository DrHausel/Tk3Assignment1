/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.umundo.core;

import java.util.HashMap;

public class Publisher extends PublisherStub {
  private long swigCPtr;

  protected Publisher(long cPtr, boolean cMemoryOwn) {
    super(umundoNativeJavaJNI.Publisher_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Publisher obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        umundoNativeJavaJNI.delete_Publisher(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  // keep receiver as a reference to prevent premature GC
  private Greeter _greeter;

  public void setGreeter(Greeter greeter) {
    // it is important to keep the reference, otherwise the Java GC will eat it!
    _greeter = greeter;
    setGreeterNative(greeter);
  }

	public HashMap<String, SubscriberStub> getSubscribers() {
		HashMap<String, SubscriberStub> subs = new HashMap<String, SubscriberStub>();
		SubscriberStubMap subMap = getSubscribersNative();
		StringArray subKeys = getSubKeys();
		for (int i = 0; i < subKeys.size(); i++) {
			subs.put(subKeys.get(i), subMap.get(subKeys.get(i)));
		}
		return subs;
	}

  public Publisher(String channelName) {
    this(umundoNativeJavaJNI.new_Publisher__SWIG_0(channelName), true);
  }

  public Publisher(PublisherConfig config) {
    this(umundoNativeJavaJNI.new_Publisher__SWIG_1(PublisherConfig.getCPtr(config), config), true);
  }

  public boolean isValid() {
    return umundoNativeJavaJNI.Publisher_isValid(swigCPtr, this);
  }

  public boolean equals(Publisher other) {
    return umundoNativeJavaJNI.Publisher_equals(swigCPtr, this, Publisher.getCPtr(other), other);
  }

  public void send(Message msg) {
    umundoNativeJavaJNI.Publisher_send__SWIG_0(swigCPtr, this, Message.getCPtr(msg), msg);
  }

  public void send(byte[] data) {
    umundoNativeJavaJNI.Publisher_send__SWIG_1(swigCPtr, this, data);
  }

  public int waitForSubscribers(int count, int timeoutMs) {
    return umundoNativeJavaJNI.Publisher_waitForSubscribers__SWIG_0(swigCPtr, this, count, timeoutMs);
  }

  public int waitForSubscribers(int count) {
    return umundoNativeJavaJNI.Publisher_waitForSubscribers__SWIG_1(swigCPtr, this, count);
  }

  private void setGreeterNative(Greeter greeter) {
    umundoNativeJavaJNI.Publisher_setGreeterNative(swigCPtr, this, Greeter.getCPtr(greeter), greeter);
  }

  public Greeter getGreeter() {
    long cPtr = umundoNativeJavaJNI.Publisher_getGreeter(swigCPtr, this);
    return (cPtr == 0) ? null : new Greeter(cPtr, false);
  }

  public void putMeta(String key, String value) {
    umundoNativeJavaJNI.Publisher_putMeta(swigCPtr, this, key, value);
  }

  public void clearMeta(String key) {
    umundoNativeJavaJNI.Publisher_clearMeta(swigCPtr, this, key);
  }

  public boolean isPublishingTo(String subUUID) {
    return umundoNativeJavaJNI.Publisher_isPublishingTo(swigCPtr, this, subUUID);
  }

  private SubscriberStubMap getSubscribersNative() {
    return new SubscriberStubMap(umundoNativeJavaJNI.Publisher_getSubscribersNative(swigCPtr, this), true);
  }

  public void suspend() {
    umundoNativeJavaJNI.Publisher_suspend(swigCPtr, this);
  }

  public void resume() {
    umundoNativeJavaJNI.Publisher_resume(swigCPtr, this);
  }

  public void added(SubscriberStub sub, NodeStub node) {
    umundoNativeJavaJNI.Publisher_added(swigCPtr, this, SubscriberStub.getCPtr(sub), sub, NodeStub.getCPtr(node), node);
  }

  public void removed(SubscriberStub sub, NodeStub node) {
    umundoNativeJavaJNI.Publisher_removed(swigCPtr, this, SubscriberStub.getCPtr(sub), sub, NodeStub.getCPtr(node), node);
  }

  public StringArray getSubKeys() {
    return new StringArray(umundoNativeJavaJNI.Publisher_getSubKeys(swigCPtr, this), true);
  }

}
