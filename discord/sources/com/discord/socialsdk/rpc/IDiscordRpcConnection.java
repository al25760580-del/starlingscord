package com.discord.socialsdk.rpc;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public interface IDiscordRpcConnection extends IInterface {
    public static final String DESCRIPTOR = "com.discord.socialsdk.rpc.IDiscordRpcConnection";

    public static class Default implements IDiscordRpcConnection {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.discord.socialsdk.rpc.IDiscordRpcConnection
        public void disconnect() {
        }

        @Override // com.discord.socialsdk.rpc.IDiscordRpcConnection
        public void sendFrame(String str) {
        }
    }

    public static abstract class Stub extends Binder implements IDiscordRpcConnection {
        static final int TRANSACTION_disconnect = 2;
        static final int TRANSACTION_sendFrame = 1;

        public static class Proxy implements IDiscordRpcConnection {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.discord.socialsdk.rpc.IDiscordRpcConnection
            public void disconnect() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDiscordRpcConnection.DESCRIPTOR);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IDiscordRpcConnection.DESCRIPTOR;
            }

            @Override // com.discord.socialsdk.rpc.IDiscordRpcConnection
            public void sendFrame(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDiscordRpcConnection.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IDiscordRpcConnection.DESCRIPTOR);
        }

        public static IDiscordRpcConnection asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IDiscordRpcConnection.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IDiscordRpcConnection)) ? new Proxy(iBinder) : (IDiscordRpcConnection) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i10) {
            if (i7 >= 1 && i7 <= 16777215) {
                parcel.enforceInterface(IDiscordRpcConnection.DESCRIPTOR);
            }
            if (i7 == 1598968902) {
                parcel2.writeString(IDiscordRpcConnection.DESCRIPTOR);
                return true;
            }
            if (i7 == 1) {
                sendFrame(parcel.readString());
                parcel2.writeNoException();
            } else {
                if (i7 != 2) {
                    return super.onTransact(i7, parcel, parcel2, i10);
                }
                disconnect();
                parcel2.writeNoException();
            }
            return true;
        }
    }

    void disconnect();

    void sendFrame(String str);
}
