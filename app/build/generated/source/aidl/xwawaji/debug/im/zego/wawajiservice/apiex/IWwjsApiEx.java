/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: D:\\Users\\Administrator\\AndroidStudioProjects\\WaWaJiServer\\app\\src\\main\\aidl\\im\\zego\\wawajiservice\\apiex\\IWwjsApiEx.aidl
 */
package im.zego.wawajiservice.apiex;
/**
 * 对外 API 定义
 */
public interface IWwjsApiEx extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements im.zego.wawajiservice.apiex.IWwjsApiEx
{
private static final java.lang.String DESCRIPTOR = "im.zego.wawajiservice.apiex.IWwjsApiEx";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an im.zego.wawajiservice.apiex.IWwjsApiEx interface,
 * generating a proxy if needed.
 */
public static im.zego.wawajiservice.apiex.IWwjsApiEx asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof im.zego.wawajiservice.apiex.IWwjsApiEx))) {
return ((im.zego.wawajiservice.apiex.IWwjsApiEx)iin);
}
return new im.zego.wawajiservice.apiex.IWwjsApiEx.Stub.Proxy(obj);
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
case TRANSACTION_requestUpdateSysTime:
{
data.enforceInterface(DESCRIPTOR);
im.zego.wawajiservice.apiex.CBUpdateTime _arg0;
_arg0 = im.zego.wawajiservice.apiex.CBUpdateTime.Stub.asInterface(data.readStrongBinder());
this.requestUpdateSysTime(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements im.zego.wawajiservice.apiex.IWwjsApiEx
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
/**
     * 请求更新系统时间。请确保此时 Android 板已经连接至公网
     * @param callback 时间更新后的回调，通知是否更新成功
     */
@Override public void requestUpdateSysTime(im.zego.wawajiservice.apiex.CBUpdateTime callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_requestUpdateSysTime, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_requestUpdateSysTime = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
/**
     * 请求更新系统时间。请确保此时 Android 板已经连接至公网
     * @param callback 时间更新后的回调，通知是否更新成功
     */
public void requestUpdateSysTime(im.zego.wawajiservice.apiex.CBUpdateTime callback) throws android.os.RemoteException;
}
