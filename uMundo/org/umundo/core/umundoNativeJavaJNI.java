/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.umundo.core;

import java.net.URL;
import java.util.zip.ZipFile;
import java.util.zip.ZipEntry;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.InputStream;

class umundoNativeJavaJNI {
  public final static native void imaxdiv_t_quot_set(long jarg1, imaxdiv_t jarg1_, long jarg2);
  public final static native long imaxdiv_t_quot_get(long jarg1, imaxdiv_t jarg1_);
  public final static native void imaxdiv_t_rem_set(long jarg1, imaxdiv_t jarg1_, long jarg2);
  public final static native long imaxdiv_t_rem_get(long jarg1, imaxdiv_t jarg1_);
  public final static native long new_imaxdiv_t();
  public final static native void delete_imaxdiv_t(long jarg1);
  public final static native long imaxabs(long jarg1);
  public final static native long imaxdiv(long jarg1, long jarg2);
  public final static native long strtoimax(String jarg1, long jarg2, int jarg3);
  public final static native java.math.BigInteger strtoumax(String jarg1, long jarg2, int jarg3);


	static {
		String fullLibName = "";
		String osPrefix = "";
		String debugPrefix = "";
		String libName = "umundoNativeJava";
		String bitWidth = "";

		System.err.println("os.arch: " + System.getProperty("os.arch"));
		System.err.println("os.name: " + System.getProperty("os.name"));

		// is this a 64bit host?
		if (System.getProperty("os.arch").indexOf("64") > 0) {
			bitWidth = "64";
		}
		// do we want the debug build?
		if (System.getProperty("umundo.debug") != null) {
			debugPrefix = "_d";
			// just do not load any JNI code - we dropped it in 0.4.4
		} else {

			// dispatch os.type for filename
			String osSuffix = "";
			String os = System.getProperty("os.name").toLowerCase();
			if (os.indexOf("win") >= 0) {
				osSuffix = ".dll";
			} else if (os.indexOf("mac") >= 0) {
				osSuffix = ".jnilib";				
				osPrefix = "lib";				
			} else if(os.indexOf("nix") >= 0 || os.indexOf("nux") >= 0) {
				osSuffix = ".so";				
				osPrefix = "lib";				
			} else if(os.indexOf("sunos") >= 0) {
				throw new RuntimeException("Solaris not supported yet - ask me about it.");
			} else {
				throw new RuntimeException("Unknown platform " + os);
			}
			try {
				// get the class object for this class, and get the location of it
				final Class c = umundoNativeJavaJNI.class;
				final URL location = c.getProtectionDomain().getCodeSource().getLocation();

				// jars are just zip files, get the input stream for the lib
				ZipFile zf = new ZipFile(new File(location.toURI()));
				InputStream in = null;
				
				while(in == null) {
					fullLibName = osPrefix + libName + bitWidth + debugPrefix + osSuffix;
					System.out.println("Trying to load " + fullLibName);
					ZipEntry entry = zf.getEntry(fullLibName);
					if (entry == null) {
						System.out.println("File " + fullLibName + " not contained in " + location.toURI());
	  				if (debugPrefix.length() == 0) {
							debugPrefix = "_d";
							continue;
						} else {
							throw new FileNotFoundException(fullLibName);
						}
					}
					in = zf.getInputStream(entry);
				}

				// create a temp file and an input stream for it
				File f = File.createTempFile("JARLIB-", "-" + fullLibName);
				FileOutputStream out = new FileOutputStream(f);

				// copy the lib to the temp file
				byte[] buf = new byte[1024];
				int len;
				while ((len = in.read(buf)) > 0)
					out.write(buf, 0, len);
				in.close();
				out.close();

				// load the lib specified by its absolute path and delete it
				System.load(f.getAbsolutePath());
				f.delete();

			} catch (FileNotFoundException e) {
				System.err.println(e);
			} catch (Exception e) {
				System.err.println(e);
				System.err.println("Warning: failed to load native library " + fullLibName + " use System.load() yourself.");
			}
		}
	}

  public final static native long new_StringArray__SWIG_0();
  public final static native long new_StringArray__SWIG_1(long jarg1);
  public final static native long StringArray_size(long jarg1, StringArray jarg1_);
  public final static native long StringArray_capacity(long jarg1, StringArray jarg1_);
  public final static native void StringArray_reserve(long jarg1, StringArray jarg1_, long jarg2);
  public final static native boolean StringArray_isEmpty(long jarg1, StringArray jarg1_);
  public final static native void StringArray_clear(long jarg1, StringArray jarg1_);
  public final static native void StringArray_add(long jarg1, StringArray jarg1_, String jarg2);
  public final static native String StringArray_get(long jarg1, StringArray jarg1_, int jarg2);
  public final static native void StringArray_set(long jarg1, StringArray jarg1_, int jarg2, String jarg3);
  public final static native void delete_StringArray(long jarg1);
  public final static native long new_StringMap__SWIG_0();
  public final static native long new_StringMap__SWIG_1(long jarg1, StringMap jarg1_);
  public final static native long StringMap_size(long jarg1, StringMap jarg1_);
  public final static native boolean StringMap_empty(long jarg1, StringMap jarg1_);
  public final static native void StringMap_clear(long jarg1, StringMap jarg1_);
  public final static native String StringMap_get(long jarg1, StringMap jarg1_, String jarg2);
  public final static native void StringMap_set(long jarg1, StringMap jarg1_, String jarg2, String jarg3);
  public final static native void StringMap_del(long jarg1, StringMap jarg1_, String jarg2);
  public final static native boolean StringMap_has_key(long jarg1, StringMap jarg1_, String jarg2);
  public final static native void delete_StringMap(long jarg1);
  public final static native long new_PublisherMap__SWIG_0();
  public final static native long new_PublisherMap__SWIG_1(long jarg1, PublisherMap jarg1_);
  public final static native long PublisherMap_size(long jarg1, PublisherMap jarg1_);
  public final static native boolean PublisherMap_empty(long jarg1, PublisherMap jarg1_);
  public final static native void PublisherMap_clear(long jarg1, PublisherMap jarg1_);
  public final static native long PublisherMap_get(long jarg1, PublisherMap jarg1_, String jarg2);
  public final static native void PublisherMap_set(long jarg1, PublisherMap jarg1_, String jarg2, long jarg3, Publisher jarg3_);
  public final static native void PublisherMap_del(long jarg1, PublisherMap jarg1_, String jarg2);
  public final static native boolean PublisherMap_has_key(long jarg1, PublisherMap jarg1_, String jarg2);
  public final static native void delete_PublisherMap(long jarg1);
  public final static native long new_SubscriberMap__SWIG_0();
  public final static native long new_SubscriberMap__SWIG_1(long jarg1, SubscriberMap jarg1_);
  public final static native long SubscriberMap_size(long jarg1, SubscriberMap jarg1_);
  public final static native boolean SubscriberMap_empty(long jarg1, SubscriberMap jarg1_);
  public final static native void SubscriberMap_clear(long jarg1, SubscriberMap jarg1_);
  public final static native long SubscriberMap_get(long jarg1, SubscriberMap jarg1_, String jarg2);
  public final static native void SubscriberMap_set(long jarg1, SubscriberMap jarg1_, String jarg2, long jarg3, Subscriber jarg3_);
  public final static native void SubscriberMap_del(long jarg1, SubscriberMap jarg1_, String jarg2);
  public final static native boolean SubscriberMap_has_key(long jarg1, SubscriberMap jarg1_, String jarg2);
  public final static native void delete_SubscriberMap(long jarg1);
  public final static native long new_PublisherStubMap__SWIG_0();
  public final static native long new_PublisherStubMap__SWIG_1(long jarg1, PublisherStubMap jarg1_);
  public final static native long PublisherStubMap_size(long jarg1, PublisherStubMap jarg1_);
  public final static native boolean PublisherStubMap_empty(long jarg1, PublisherStubMap jarg1_);
  public final static native void PublisherStubMap_clear(long jarg1, PublisherStubMap jarg1_);
  public final static native long PublisherStubMap_get(long jarg1, PublisherStubMap jarg1_, String jarg2);
  public final static native void PublisherStubMap_set(long jarg1, PublisherStubMap jarg1_, String jarg2, long jarg3, PublisherStub jarg3_);
  public final static native void PublisherStubMap_del(long jarg1, PublisherStubMap jarg1_, String jarg2);
  public final static native boolean PublisherStubMap_has_key(long jarg1, PublisherStubMap jarg1_, String jarg2);
  public final static native void delete_PublisherStubMap(long jarg1);
  public final static native long new_SubscriberStubMap__SWIG_0();
  public final static native long new_SubscriberStubMap__SWIG_1(long jarg1, SubscriberStubMap jarg1_);
  public final static native long SubscriberStubMap_size(long jarg1, SubscriberStubMap jarg1_);
  public final static native boolean SubscriberStubMap_empty(long jarg1, SubscriberStubMap jarg1_);
  public final static native void SubscriberStubMap_clear(long jarg1, SubscriberStubMap jarg1_);
  public final static native long SubscriberStubMap_get(long jarg1, SubscriberStubMap jarg1_, String jarg2);
  public final static native void SubscriberStubMap_set(long jarg1, SubscriberStubMap jarg1_, String jarg2, long jarg3, SubscriberStub jarg3_);
  public final static native void SubscriberStubMap_del(long jarg1, SubscriberStubMap jarg1_, String jarg2);
  public final static native boolean SubscriberStubMap_has_key(long jarg1, SubscriberStubMap jarg1_, String jarg2);
  public final static native void delete_SubscriberStubMap(long jarg1);
  public final static native long new_NodeStubMap__SWIG_0();
  public final static native long new_NodeStubMap__SWIG_1(long jarg1, NodeStubMap jarg1_);
  public final static native long NodeStubMap_size(long jarg1, NodeStubMap jarg1_);
  public final static native boolean NodeStubMap_empty(long jarg1, NodeStubMap jarg1_);
  public final static native void NodeStubMap_clear(long jarg1, NodeStubMap jarg1_);
  public final static native long NodeStubMap_get(long jarg1, NodeStubMap jarg1_, String jarg2);
  public final static native void NodeStubMap_set(long jarg1, NodeStubMap jarg1_, String jarg2, long jarg3, NodeStub jarg3_);
  public final static native void NodeStubMap_del(long jarg1, NodeStubMap jarg1_, String jarg2);
  public final static native boolean NodeStubMap_has_key(long jarg1, NodeStubMap jarg1_, String jarg2);
  public final static native void delete_NodeStubMap(long jarg1);
  public final static native void delete_EndPointResultSet(long jarg1);
  public final static native void EndPointResultSet_add__SWIG_0(long jarg1, EndPointResultSet jarg1_, long jarg2, EndPoint jarg2_);
  public final static native void EndPointResultSet_add__SWIG_1(long jarg1, EndPointResultSet jarg1_, long jarg2, EndPoint jarg2_, String jarg3);
  public final static native void EndPointResultSet_remove__SWIG_0(long jarg1, EndPointResultSet jarg1_, long jarg2, EndPoint jarg2_);
  public final static native void EndPointResultSet_remove__SWIG_1(long jarg1, EndPointResultSet jarg1_, long jarg2, EndPoint jarg2_, String jarg3);
  public final static native void EndPointResultSet_change__SWIG_0(long jarg1, EndPointResultSet jarg1_, long jarg2, EndPoint jarg2_, java.math.BigInteger jarg3);
  public final static native void EndPointResultSet_change__SWIG_1(long jarg1, EndPointResultSet jarg1_, long jarg2, EndPoint jarg2_);
  public final static native void EndPointResultSet_change__SWIG_2(long jarg1, EndPointResultSet jarg1_, long jarg2, EndPoint jarg2_, String jarg3, java.math.BigInteger jarg4);
  public final static native void EndPointResultSet_change__SWIG_3(long jarg1, EndPointResultSet jarg1_, long jarg2, EndPoint jarg2_, String jarg3);
  public final static native long new_EndPointArray__SWIG_0();
  public final static native long new_EndPointArray__SWIG_1(long jarg1);
  public final static native long EndPointArray_size(long jarg1, EndPointArray jarg1_);
  public final static native long EndPointArray_capacity(long jarg1, EndPointArray jarg1_);
  public final static native void EndPointArray_reserve(long jarg1, EndPointArray jarg1_, long jarg2);
  public final static native boolean EndPointArray_isEmpty(long jarg1, EndPointArray jarg1_);
  public final static native void EndPointArray_clear(long jarg1, EndPointArray jarg1_);
  public final static native void EndPointArray_add(long jarg1, EndPointArray jarg1_, long jarg2, EndPoint jarg2_);
  public final static native long EndPointArray_get(long jarg1, EndPointArray jarg1_, int jarg2);
  public final static native void EndPointArray_set(long jarg1, EndPointArray jarg1_, int jarg2, long jarg3, EndPoint jarg3_);
  public final static native void delete_EndPointArray(long jarg1);
  public final static native long new_InterfaceArray__SWIG_0();
  public final static native long new_InterfaceArray__SWIG_1(long jarg1);
  public final static native long InterfaceArray_size(long jarg1, InterfaceArray jarg1_);
  public final static native long InterfaceArray_capacity(long jarg1, InterfaceArray jarg1_);
  public final static native void InterfaceArray_reserve(long jarg1, InterfaceArray jarg1_, long jarg2);
  public final static native boolean InterfaceArray_isEmpty(long jarg1, InterfaceArray jarg1_);
  public final static native void InterfaceArray_clear(long jarg1, InterfaceArray jarg1_);
  public final static native void InterfaceArray_add(long jarg1, InterfaceArray jarg1_, long jarg2, Interface jarg2_);
  public final static native long InterfaceArray_get(long jarg1, InterfaceArray jarg1_, int jarg2);
  public final static native void InterfaceArray_set(long jarg1, InterfaceArray jarg1_, int jarg2, long jarg3, Interface jarg3_);
  public final static native void delete_InterfaceArray(long jarg1);
  public final static native void Interface_ipv4_set(long jarg1, Interface jarg1_, long jarg2, StringArray jarg2_);
  public final static native long Interface_ipv4_get(long jarg1, Interface jarg1_);
  public final static native void Interface_ipv6_set(long jarg1, Interface jarg1_, long jarg2, StringArray jarg2_);
  public final static native long Interface_ipv6_get(long jarg1, Interface jarg1_);
  public final static native void Interface_mac_set(long jarg1, Interface jarg1_, String jarg2);
  public final static native String Interface_mac_get(long jarg1, Interface jarg1_);
  public final static native void Interface_name_set(long jarg1, Interface jarg1_, String jarg2);
  public final static native String Interface_name_get(long jarg1, Interface jarg1_);
  public final static native long new_Interface();
  public final static native void delete_Interface(long jarg1);
  public final static native String Host_getHostname();
  public final static native long Host_getInterfaces();
  public final static native String Host_getHostId();
  public final static native long new_Host();
  public final static native void delete_Host(long jarg1);
  public final static native long new_Message__SWIG_0();
  public final static native long new_Message__SWIG_1(byte[] jarg1);
  public final static native long new_Message__SWIG_2(long jarg1, Message jarg1_);
  public final static native void delete_Message(long jarg1);
  public final static native byte[] Message_getData(long jarg1, Message jarg1_);
  public final static native long Message_getSize(long jarg1, Message jarg1_);
  public final static native long Message_getFlags(long jarg1, Message jarg1_);
  public final static native void Message_compress(long jarg1, Message jarg1_);
  public final static native void Message_uncompress(long jarg1, Message jarg1_);
  public final static native boolean Message_isCompressed(long jarg1, Message jarg1_);
  public final static native void Message_setData(long jarg1, Message jarg1_, byte[] jarg2);
  public final static native void Message_putMeta(long jarg1, Message jarg1_, String jarg2, String jarg3);
  public final static native long Message_getMetaNative(long jarg1, Message jarg1_);
  public final static native String Message_getMeta(long jarg1, Message jarg1_, String jarg2);
  public final static native void Message_setReceiver(long jarg1, Message jarg1_, String jarg2);
  public final static native long Message_toSubscriber(String jarg1);
  public final static native long Message_getMetaKeys(long jarg1, Message jarg1_);
  public final static native void delete_Options(long jarg1);
  public final static native String Options_getType(long jarg1, Options jarg1_);
  public final static native long new_Options();
  public final static native long new_EndPointConfig__SWIG_0(int jarg1);
  public final static native long new_EndPointConfig__SWIG_1();
  public final static native long new_EndPointConfig__SWIG_2(String jarg1);
  public final static native String EndPointConfig_getType(long jarg1, EndPointConfig jarg1_);
  public final static native void EndPointConfig_setPort(long jarg1, EndPointConfig jarg1_, int jarg2);
  public final static native void EndPointConfig_setIP(long jarg1, EndPointConfig jarg1_, String jarg2);
  public final static native void delete_EndPointConfig(long jarg1);
  public final static native long new_EndPoint(String jarg1);
  public final static native void delete_EndPoint(long jarg1);
  public final static native boolean EndPoint_isValid(long jarg1, EndPoint jarg1_);
  public final static native boolean EndPoint_equals(long jarg1, EndPoint jarg1_, long jarg2, EndPoint jarg2_);
  public final static native String EndPoint_getAddress(long jarg1, EndPoint jarg1_);
  public final static native String EndPoint_getIP(long jarg1, EndPoint jarg1_);
  public final static native String EndPoint_getTransport(long jarg1, EndPoint jarg1_);
  public final static native int EndPoint_getPort(long jarg1, EndPoint jarg1_);
  public final static native boolean EndPoint_isRemote(long jarg1, EndPoint jarg1_);
  public final static native boolean EndPoint_isInProcess(long jarg1, EndPoint jarg1_);
  public final static native String EndPoint_getHost(long jarg1, EndPoint jarg1_);
  public final static native String EndPoint_getDomain(long jarg1, EndPoint jarg1_);
  public final static native java.math.BigInteger EndPoint_getLastSeen(long jarg1, EndPoint jarg1_);
  public final static native String EndPoint_getUUID(long jarg1, EndPoint jarg1_);
  public final static native void EndPoint_updateLastSeen(long jarg1, EndPoint jarg1_);
  public final static native long new_PublisherStub();
  public final static native boolean PublisherStub_isValid(long jarg1, PublisherStub jarg1_);
  public final static native boolean PublisherStub_equals(long jarg1, PublisherStub jarg1_, long jarg2, PublisherStub jarg2_);
  public final static native String PublisherStub_getChannelName(long jarg1, PublisherStub jarg1_);
  public final static native boolean PublisherStub_isRTP(long jarg1, PublisherStub jarg1_);
  public final static native void delete_PublisherStub(long jarg1);
  public final static native void delete_SubscriberStub(long jarg1);
  public final static native long new_SubscriberStub();
  public final static native boolean SubscriberStub_isValid(long jarg1, SubscriberStub jarg1_);
  public final static native boolean SubscriberStub_equals(long jarg1, SubscriberStub jarg1_, long jarg2, SubscriberStub jarg2_);
  public final static native String SubscriberStub_getChannelName(long jarg1, SubscriberStub jarg1_);
  public final static native boolean SubscriberStub_isRTP(long jarg1, SubscriberStub jarg1_);
  public final static native boolean SubscriberStub_isMulticast(long jarg1, SubscriberStub jarg1_);
  public final static native long new_NodeStub();
  public final static native void delete_NodeStub(long jarg1);
  public final static native boolean NodeStub_isValid(long jarg1, NodeStub jarg1_);
  public final static native boolean NodeStub_equals(long jarg1, NodeStub jarg1_, long jarg2, NodeStub jarg2_);
  public final static native void NodeStub_addPublisher(long jarg1, NodeStub jarg1_, long jarg2, PublisherStub jarg2_);
  public final static native void NodeStub_removePublisher(long jarg1, NodeStub jarg1_, long jarg2, PublisherStub jarg2_);
  public final static native void NodeStub_addSubscriber(long jarg1, NodeStub jarg1_, long jarg2, SubscriberStub jarg2_);
  public final static native void NodeStub_removeSubscriber(long jarg1, NodeStub jarg1_, long jarg2, SubscriberStub jarg2_);
  public final static native long NodeStub_getSubscriber(long jarg1, NodeStub jarg1_, String jarg2);
  public final static native long NodeStub_getPublisher(long jarg1, NodeStub jarg1_, String jarg2);
  public final static native long NodeStub_getSubscribersNative(long jarg1, NodeStub jarg1_);
  public final static native long NodeStub_getPublishersNative(long jarg1, NodeStub jarg1_);
  public final static native long NodeStub_getPubKeys(long jarg1, NodeStub jarg1_);
  public final static native long NodeStub_getSubKeys(long jarg1, NodeStub jarg1_);
  public final static native void delete_Greeter(long jarg1);
  public final static native void Greeter_welcome(long jarg1, Greeter jarg1_, long jarg2, Publisher jarg2_, long jarg3, SubscriberStub jarg3_);
  public final static native void Greeter_farewell(long jarg1, Greeter jarg1_, long jarg2, Publisher jarg2_, long jarg3, SubscriberStub jarg3_);
  public final static native long new_Greeter();
  public final static native void Greeter_director_connect(Greeter obj, long cptr, boolean mem_own, boolean weak_global);
  public final static native void Greeter_change_ownership(Greeter obj, long cptr, boolean take_or_release);
  public final static native long new_Publisher__SWIG_0(String jarg1);
  public final static native long new_Publisher__SWIG_1(long jarg1, PublisherConfig jarg1_);
  public final static native void delete_Publisher(long jarg1);
  public final static native boolean Publisher_isValid(long jarg1, Publisher jarg1_);
  public final static native boolean Publisher_equals(long jarg1, Publisher jarg1_, long jarg2, Publisher jarg2_);
  public final static native void Publisher_send__SWIG_0(long jarg1, Publisher jarg1_, long jarg2, Message jarg2_);
  public final static native void Publisher_send__SWIG_1(long jarg1, Publisher jarg1_, byte[] jarg2);
  public final static native int Publisher_waitForSubscribers__SWIG_0(long jarg1, Publisher jarg1_, int jarg2, int jarg3);
  public final static native int Publisher_waitForSubscribers__SWIG_1(long jarg1, Publisher jarg1_, int jarg2);
  public final static native void Publisher_setGreeterNative(long jarg1, Publisher jarg1_, long jarg2, Greeter jarg2_);
  public final static native long Publisher_getGreeter(long jarg1, Publisher jarg1_);
  public final static native void Publisher_putMeta(long jarg1, Publisher jarg1_, String jarg2, String jarg3);
  public final static native void Publisher_clearMeta(long jarg1, Publisher jarg1_, String jarg2);
  public final static native boolean Publisher_isPublishingTo(long jarg1, Publisher jarg1_, String jarg2);
  public final static native long Publisher_getSubscribersNative(long jarg1, Publisher jarg1_);
  public final static native void Publisher_suspend(long jarg1, Publisher jarg1_);
  public final static native void Publisher_resume(long jarg1, Publisher jarg1_);
  public final static native void Publisher_added(long jarg1, Publisher jarg1_, long jarg2, SubscriberStub jarg2_, long jarg3, NodeStub jarg3_);
  public final static native void Publisher_removed(long jarg1, Publisher jarg1_, long jarg2, SubscriberStub jarg2_, long jarg3, NodeStub jarg3_);
  public final static native long Publisher_getSubKeys(long jarg1, Publisher jarg1_);
  public final static native void delete_PublisherConfig(long jarg1);
  public final static native long new_PublisherConfigTCP(String jarg1);
  public final static native void PublisherConfigTCP_enableCompression(long jarg1, PublisherConfigTCP jarg1_);
  public final static native void delete_PublisherConfigTCP(long jarg1);
  public final static native long new_PublisherConfigRTP(String jarg1);
  public final static native void PublisherConfigRTP_setTimestampIncrement(long jarg1, PublisherConfigRTP jarg1_, long jarg2);
  public final static native void PublisherConfigRTP_setPortbase(long jarg1, PublisherConfigRTP jarg1_, int jarg2);
  public final static native void PublisherConfigRTP_setPayloadType(long jarg1, PublisherConfigRTP jarg1_, short jarg2);
  public final static native void delete_PublisherConfigRTP(long jarg1);
  public final static native long new_PublisherConfigMCast(String jarg1);
  public final static native void delete_PublisherConfigMCast(long jarg1);
  public final static native void delete_Receiver(long jarg1);
  public final static native void Receiver_receive(long jarg1, Receiver jarg1_, long jarg2, Message jarg2_);
  public final static native long new_Receiver();
  public final static native void Receiver_director_connect(Receiver obj, long cptr, boolean mem_own, boolean weak_global);
  public final static native void Receiver_change_ownership(Receiver obj, long cptr, boolean take_or_release);
  public final static native long new_Subscriber__SWIG_0(String jarg1);
  public final static native long new_Subscriber__SWIG_1(long jarg1, SubscriberConfig jarg1_);
  public final static native long new_Subscriber__SWIG_2(long jarg1, SubscriberStub jarg1_);
  public final static native void delete_Subscriber(long jarg1);
  public final static native boolean Subscriber_isValid(long jarg1, Subscriber jarg1_);
  public final static native boolean Subscriber_equals(long jarg1, Subscriber jarg1_, long jarg2, Subscriber jarg2_);
  public final static native void Subscriber_setReceiverNative(long jarg1, Subscriber jarg1_, long jarg2, Receiver jarg2_);
  public final static native long Subscriber_getReceiver(long jarg1, Subscriber jarg1_);
  public final static native void Subscriber_setChannelName(long jarg1, Subscriber jarg1_, String jarg2);
  public final static native long Subscriber_getNextMsg(long jarg1, Subscriber jarg1_);
  public final static native boolean Subscriber_hasNextMsg(long jarg1, Subscriber jarg1_);
  public final static native long Subscriber_getPublishersNative(long jarg1, Subscriber jarg1_);
  public final static native boolean Subscriber_isSubscribedTo(long jarg1, Subscriber jarg1_, String jarg2);
  public final static native boolean Subscriber_matches(long jarg1, Subscriber jarg1_, long jarg2, PublisherStub jarg2_);
  public final static native void Subscriber_added(long jarg1, Subscriber jarg1_, long jarg2, PublisherStub jarg2_, long jarg3, NodeStub jarg3_);
  public final static native void Subscriber_removed(long jarg1, Subscriber jarg1_, long jarg2, PublisherStub jarg2_, long jarg3, NodeStub jarg3_);
  public final static native void Subscriber_suspend(long jarg1, Subscriber jarg1_);
  public final static native void Subscriber_resume(long jarg1, Subscriber jarg1_);
  public final static native long Subscriber_getPubKeys(long jarg1, Subscriber jarg1_);
  public final static native void delete_SubscriberConfig(long jarg1);
  public final static native long new_SubscriberConfigTCP(String jarg1);
  public final static native void delete_SubscriberConfigTCP(long jarg1);
  public final static native long new_SubscriberConfigRTP(String jarg1);
  public final static native void SubscriberConfigRTP_setPortbase(long jarg1, SubscriberConfigRTP jarg1_, int jarg2);
  public final static native void SubscriberConfigRTP_setMulticastIP(long jarg1, SubscriberConfigRTP jarg1_, String jarg2);
  public final static native void SubscriberConfigRTP_setMulticastPortbase(long jarg1, SubscriberConfigRTP jarg1_, int jarg2);
  public final static native void delete_SubscriberConfigRTP(long jarg1);
  public final static native long new_SubscriberConfigMCast(String jarg1);
  public final static native void delete_SubscriberConfigMCast(long jarg1);
  public final static native long new_NodeConfig__SWIG_0(int jarg1, int jarg2);
  public final static native long new_NodeConfig__SWIG_1();
  public final static native long new_NodeConfig__SWIG_2(String jarg1);
  public final static native String NodeConfig_getType(long jarg1, NodeConfig jarg1_);
  public final static native void NodeConfig_setPubPort(long jarg1, NodeConfig jarg1_, int jarg2);
  public final static native void NodeConfig_allowLocalConnections(long jarg1, NodeConfig jarg1_, boolean jarg2);
  public final static native void delete_NodeConfig(long jarg1);
  public final static native long new_Node__SWIG_0();
  public final static native long new_Node__SWIG_1(long jarg1, NodeConfig jarg1_);
  public final static native long new_Node__SWIG_2(int jarg1, int jarg2);
  public final static native void delete_Node(long jarg1);
  public final static native boolean Node_isValid(long jarg1, Node jarg1_);
  public final static native boolean Node_equals(long jarg1, Node jarg1_, long jarg2, Node jarg2_);
  public final static native void Node_addSubscriber(long jarg1, Node jarg1_, long jarg2, Subscriber jarg2_);
  public final static native void Node_removeSubscriber(long jarg1, Node jarg1_, long jarg2, Subscriber jarg2_);
  public final static native void Node_addPublisher(long jarg1, Node jarg1_, long jarg2, Publisher jarg2_);
  public final static native void Node_removePublisher(long jarg1, Node jarg1_, long jarg2, Publisher jarg2_);
  public final static native long Node_connectedTo(long jarg1, Node jarg1_);
  public final static native long Node_connectedFrom(long jarg1, Node jarg1_);
  public final static native long Node_getSubscriber(long jarg1, Node jarg1_, String jarg2);
  public final static native long Node_getPublisher(long jarg1, Node jarg1_, String jarg2);
  public final static native void Node_connect(long jarg1, Node jarg1_, long jarg2, Connectable jarg2_);
  public final static native void Node_disconnect(long jarg1, Node jarg1_, long jarg2, Connectable jarg2_);
  public final static native void Node_suspend(long jarg1, Node jarg1_);
  public final static native void Node_resume(long jarg1, Node jarg1_);
  public final static native long Node_getSubscribersNative(long jarg1, Node jarg1_);
  public final static native long Node_getPublishersNative(long jarg1, Node jarg1_);
  public final static native void Node_add__SWIG_0(long jarg1, Node jarg1_, long jarg2, EndPoint jarg2_);
  public final static native void Node_add__SWIG_1(long jarg1, Node jarg1_, long jarg2, EndPoint jarg2_, String jarg3);
  public final static native void Node_remove__SWIG_0(long jarg1, Node jarg1_, long jarg2, EndPoint jarg2_);
  public final static native void Node_remove__SWIG_1(long jarg1, Node jarg1_, long jarg2, EndPoint jarg2_, String jarg3);
  public final static native void Node_change__SWIG_0(long jarg1, Node jarg1_, long jarg2, EndPoint jarg2_, java.math.BigInteger jarg3);
  public final static native void Node_change__SWIG_1(long jarg1, Node jarg1_, long jarg2, EndPoint jarg2_);
  public final static native void Node_change__SWIG_2(long jarg1, Node jarg1_, long jarg2, EndPoint jarg2_, String jarg3, java.math.BigInteger jarg4);
  public final static native void Node_change__SWIG_3(long jarg1, Node jarg1_, long jarg2, EndPoint jarg2_, String jarg3);
  public final static native long Node_getPubKeys(long jarg1, Node jarg1_);
  public final static native long Node_getSubKeys(long jarg1, Node jarg1_);
  public final static native void delete_Connectable(long jarg1);
  public final static native long Connectable_getPublishers(long jarg1, Connectable jarg1_);
  public final static native long Connectable_getPublishersSwigExplicitConnectable(long jarg1, Connectable jarg1_);
  public final static native long Connectable_getSubscribers(long jarg1, Connectable jarg1_);
  public final static native long Connectable_getSubscribersSwigExplicitConnectable(long jarg1, Connectable jarg1_);
  public final static native void Connectable_addedToNode(long jarg1, Connectable jarg1_, long jarg2, Node jarg2_);
  public final static native void Connectable_addedToNodeSwigExplicitConnectable(long jarg1, Connectable jarg1_, long jarg2, Node jarg2_);
  public final static native void Connectable_removedFromNode(long jarg1, Connectable jarg1_, long jarg2, Node jarg2_);
  public final static native void Connectable_removedFromNodeSwigExplicitConnectable(long jarg1, Connectable jarg1_, long jarg2, Node jarg2_);
  public final static native long new_Connectable();
  public final static native void Connectable_director_connect(Connectable obj, long cptr, boolean mem_own, boolean weak_global);
  public final static native void Connectable_change_ownership(Connectable obj, long cptr, boolean take_or_release);
  public final static native long new_Discovery__SWIG_0(long jarg1, DiscoveryConfig jarg1_);
  public final static native long new_Discovery__SWIG_1(int jarg1, String jarg2);
  public final static native long new_Discovery__SWIG_2(int jarg1);
  public final static native void delete_Discovery(long jarg1);
  public final static native boolean Discovery_isValid(long jarg1, Discovery jarg1_);
  public final static native boolean Discovery_equals(long jarg1, Discovery jarg1_, long jarg2, Discovery jarg2_);
  public final static native void Discovery_advertise(long jarg1, Discovery jarg1_, long jarg2, EndPoint jarg2_);
  public final static native void Discovery_add(long jarg1, Discovery jarg1_, long jarg2, Node jarg2_);
  public final static native void Discovery_unadvertise(long jarg1, Discovery jarg1_, long jarg2, EndPoint jarg2_);
  public final static native void Discovery_remove(long jarg1, Discovery jarg1_, long jarg2, Node jarg2_);
  public final static native void Discovery_browse(long jarg1, Discovery jarg1_, long jarg2);
  public final static native void Discovery_unbrowse(long jarg1, Discovery jarg1_, long jarg2);
  public final static native long Discovery_list(long jarg1, Discovery jarg1_);
  public final static native void DiscoveryConfig_setDomain(long jarg1, DiscoveryConfig jarg1_, String jarg2);
  public final static native void delete_DiscoveryConfig(long jarg1);
  public final static native long new_DiscoveryConfigMDNS();
  public final static native void DiscoveryConfigMDNS_setProtocol(long jarg1, DiscoveryConfigMDNS jarg1_, int jarg2);
  public final static native void DiscoveryConfigMDNS_setServiceType(long jarg1, DiscoveryConfigMDNS jarg1_, String jarg2);
  public final static native void delete_DiscoveryConfigMDNS(long jarg1);
  public final static native long new_DiscoveryConfigBCast();
  public final static native void delete_DiscoveryConfigBCast(long jarg1);
  public final static native long EndPointConfig_SWIGUpcast(long jarg1);
  public final static native long PublisherStub_SWIGUpcast(long jarg1);
  public final static native long SubscriberStub_SWIGUpcast(long jarg1);
  public final static native long NodeStub_SWIGUpcast(long jarg1);
  public final static native long Publisher_SWIGUpcast(long jarg1);
  public final static native long PublisherConfig_SWIGUpcast(long jarg1);
  public final static native long PublisherConfigTCP_SWIGUpcast(long jarg1);
  public final static native long PublisherConfigRTP_SWIGUpcast(long jarg1);
  public final static native long PublisherConfigMCast_SWIGUpcast(long jarg1);
  public final static native long Subscriber_SWIGUpcast(long jarg1);
  public final static native long SubscriberConfig_SWIGUpcast(long jarg1);
  public final static native long SubscriberConfigTCP_SWIGUpcast(long jarg1);
  public final static native long SubscriberConfigRTP_SWIGUpcast(long jarg1);
  public final static native long SubscriberConfigMCast_SWIGUpcast(long jarg1);
  public final static native long NodeConfig_SWIGUpcast(long jarg1);
  public final static native long Node_SWIGUpcast(long jarg1);
  public final static native long DiscoveryConfig_SWIGUpcast(long jarg1);
  public final static native long DiscoveryConfigMDNS_SWIGUpcast(long jarg1);
  public final static native long DiscoveryConfigBCast_SWIGUpcast(long jarg1);

  public static void SwigDirector_Greeter_welcome(Greeter self, long arg0, long arg1) {
    self.welcome(new Publisher(arg0, false), new SubscriberStub(arg1, false));
  }
  public static void SwigDirector_Greeter_farewell(Greeter self, long arg0, long arg1) {
    self.farewell(new Publisher(arg0, false), new SubscriberStub(arg1, false));
  }
  public static void SwigDirector_Receiver_receive(Receiver self, long msg) {
    self.receive((msg == 0) ? null : new Message(new Message(msg, false)));
  }
  public static long SwigDirector_Connectable_getPublishers(Connectable self) {
    return PublisherMap.getCPtr(self.getPublishers());
  }
  public static long SwigDirector_Connectable_getSubscribers(Connectable self) {
    return SubscriberMap.getCPtr(self.getSubscribers());
  }
  public static void SwigDirector_Connectable_addedToNode(Connectable self, long node) {
    self.addedToNode(new Node(node, false));
  }
  public static void SwigDirector_Connectable_removedFromNode(Connectable self, long node) {
    self.removedFromNode(new Node(node, false));
  }

  private final static native void swig_module_init();
  static {
    swig_module_init();
  }
}
