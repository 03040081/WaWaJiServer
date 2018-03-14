/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: D:\\Users\\Administrator\\AndroidStudioProjects\\WaWaJiServer\\app\\src\\main\\aidl\\im\\zego\\wawajiservice\\apiex\\CBUpdateTime.aidl
 */
package im.zego.wawajiservice.apiex;
/**
 * 使用网络时间更新系统时间回调
 */
public interface CBUpdateTime extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements im.zego.wawajiservice.apiex.CBUpdateTime
{
private static final java.lang.String DESCRIPTOR = "im.zego.wawajiservice.apiex.CBUpdateTime";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an im.zego.wawajiservice.apiex.CBUpdateTime interface,
 * generating a proxy if needed.
 */
public static im.zego.wawajiservice.apiex.CBUpdateTime asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof im.zego.wawajiservice.apiex.CBUpdateTime))) {
return ((im.zego.wawajiservice.apiex.CBUpdateTime)iin);
}
return new im.zego.wawajiservice.apiex.CBUpdateTime.Stub.Proxy(obj);
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
case TRANSACTION_onSysTimeUpdated:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.onSysTimeUpdated(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements im.zego.wawajiservice.apiex.CBUpdateTime
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
     * 更新系统时间后，通知调用方更新结果
     * @param success true : 更新成功; false: 更新失败
     */
@Override public void onSysTimeUpdated(boolean success) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((success)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_onSysTimeUpdated, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_onSysTimeUpdated = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
/**
     * 更新系统时间后，通知调用方更新结果
     * @param success true : 更新成功; false: 更新失败
     */
public void onSysTimeUpdated(boolean success) throws android.os.RemoteException;
}
