/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.umundo.core;

public class DiscoveryConfigMDNS extends DiscoveryConfig {
  private long swigCPtr;

  protected DiscoveryConfigMDNS(long cPtr, boolean cMemoryOwn) {
    super(umundoNativeJavaJNI.DiscoveryConfigMDNS_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(DiscoveryConfigMDNS obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        umundoNativeJavaJNI.delete_DiscoveryConfigMDNS(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public DiscoveryConfigMDNS() {
    this(umundoNativeJavaJNI.new_DiscoveryConfigMDNS(), true);
  }

  public void setProtocol(DiscoveryConfigMDNS.Protocol protocol) {
    umundoNativeJavaJNI.DiscoveryConfigMDNS_setProtocol(swigCPtr, this, protocol.swigValue());
  }

  public void setServiceType(String serviceType) {
    umundoNativeJavaJNI.DiscoveryConfigMDNS_setServiceType(swigCPtr, this, serviceType);
  }

  public final static class Protocol {
    public final static DiscoveryConfigMDNS.Protocol TCP = new DiscoveryConfigMDNS.Protocol("TCP");
    public final static DiscoveryConfigMDNS.Protocol UDP = new DiscoveryConfigMDNS.Protocol("UDP");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static Protocol swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + Protocol.class + " with value " + swigValue);
    }

    private Protocol(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private Protocol(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private Protocol(String swigName, Protocol swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static Protocol[] swigValues = { TCP, UDP };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
