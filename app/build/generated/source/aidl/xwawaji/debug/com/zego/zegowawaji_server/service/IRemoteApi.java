/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: D:\\Users\\Administrator\\AndroidStudioProjects\\WaWaJiServer\\app\\src\\main\\aidl\\com\\zego\\zegowawaji_server\\service\\IRemoteApi.aidl
 */
package com.zego.zegowawaji_server.service;
// Declare any non-default types here with import statements

public interface IRemoteApi extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.zego.zegowawaji_server.service.IRemoteApi
{
private static final java.lang.String DESCRIPTOR = "com.zego.zegowawaji_server.service.IRemoteApi";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.zego.zegowawaji_server.service.IRemoteApi interface,
 * generating a proxy if needed.
 */
public static com.zego.zegowawaji_server.service.IRemoteApi asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.zego.zegowawaji_server.service.IRemoteApi))) {
return ((com.zego.zegowawaji_server.service.IRemoteApi)iin);
}
return new com.zego.zegowawaji_server.service.IRemoteApi.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_join:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
this.join(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_leave:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
this.leave(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_sendHeartbeat:
{
data.enforceInterface(DESCRIPTOR);
this.sendHeartbeat();
reply.writeNoException();
return true;
}
case TRANSACTION_updateBuglyInfo:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
this.updateBuglyInfo(_arg0, _arg1);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.zego.zegowawaji_server.service.IRemoteApi
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
@Override public void join(android.os.IBinder token) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
mRemote.transact(Stub.TRANSACTION_join, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void leave(android.os.IBinder token) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
mRemote.transact(Stub.TRANSACTION_leave, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void sendHeartbeat() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_sendHeartbeat, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void updateBuglyInfo(java.lang.String sdkVersion, java.lang.String veVersion) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(sdkVersion);
_data.writeString(veVersion);
mRemote.transact(Stub.TRANSACTION_updateBuglyInfo, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_join = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_leave = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_sendHeartbeat = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_updateBuglyInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
}
public void join(android.os.IBinder token) throws android.os.RemoteException;
public void leave(android.os.IBinder token) throws android.os.RemoteException;
public void sendHeartbeat() throws android.os.RemoteException;
public void updateBuglyInfo(java.lang.String sdkVersion, java.lang.String veVersion) throws android.os.RemoteException;
}
