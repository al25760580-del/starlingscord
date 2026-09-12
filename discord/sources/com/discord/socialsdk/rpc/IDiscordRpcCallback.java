package com.discord.socialsdk.rpc;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public interface IDiscordRpcCallback extends IInterface {
    public static final String DESCRIPTOR = "com.discord.socialsdk.rpc.IDiscordRpcCallback";

    public static class Default implements IDiscordRpcCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.discord.socialsdk.rpc.IDiscordRpcCallback
        public void onClose(int i7, String str) {
        }

        @Override // com.discord.socialsdk.rpc.IDiscordRpcCallback
        public void onFrame(String str) {
        }
    }

    public static abstract class Stub extends Binder implements IDiscordRpcCallback {
        static final int TRANSACTION_onClose = 2;
        static final int TRANSACTION_onFrame = 1;

        public static class Proxy implements IDiscordRpcCallback {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IDiscordRpcCallback.DESCRIPTOR;
            }

            @Override // com.discord.socialsdk.rpc.IDiscordRpcCallback
            public void onClose(int i7, String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDiscordRpcCallback.DESCRIPTOR);
                    parcelObtain.writeInt(i7);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.discord.socialsdk.rpc.IDiscordRpcCallback
            public void onFrame(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDiscordRpcCallback.DESCRIPTOR);
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
            attachInterface(this, IDiscordRpcCallback.DESCRIPTOR);
        }

        public static IDiscordRpcCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IDiscordRpcCallback.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IDiscordRpcCallback)) ? new Proxy(iBinder) : (IDiscordRpcCallback) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i10) {
            if (i7 >= 1 && i7 <= 16777215) {
                parcel.enforceInterface(IDiscordRpcCallback.DESCRIPTOR);
            }
            if (i7 == 1598968902) {
                parcel2.writeString(IDiscordRpcCallback.DESCRIPTOR);
                return true;
            }
            if (i7 == 1) {
                onFrame(parcel.readString());
                parcel2.writeNoException();
            } else {
                if (i7 != 2) {
                    return super.onTransact(i7, parcel, parcel2, i10);
                }
                onClose(parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
            }
            return true;
        }
    }

    void onClose(int i7, String str);

    void onFrame(String str);
}
