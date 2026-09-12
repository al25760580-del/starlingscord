package com.discord.socialsdk.rpc;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public interface IDiscordRpcService extends IInterface {
    public static final String DESCRIPTOR = "com.discord.socialsdk.rpc.IDiscordRpcService";

    public static class Default implements IDiscordRpcService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.discord.socialsdk.rpc.IDiscordRpcService
        public IDiscordRpcConnection connect(long j, String str, IDiscordRpcCallback iDiscordRpcCallback) {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IDiscordRpcService {
        static final int TRANSACTION_connect = 1;

        public static class Proxy implements IDiscordRpcService {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.discord.socialsdk.rpc.IDiscordRpcService
            public IDiscordRpcConnection connect(long j, String str, IDiscordRpcCallback iDiscordRpcCallback) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.discord.socialsdk.rpc.IDiscordRpcService");
                    parcelObtain.writeLong(j);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(iDiscordRpcCallback);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return IDiscordRpcConnection.Stub.asInterface(parcelObtain2.readStrongBinder());
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return "com.discord.socialsdk.rpc.IDiscordRpcService";
            }
        }

        public Stub() {
            attachInterface(this, "com.discord.socialsdk.rpc.IDiscordRpcService");
        }

        public static IDiscordRpcService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.discord.socialsdk.rpc.IDiscordRpcService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IDiscordRpcService)) ? new Proxy(iBinder) : (IDiscordRpcService) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i10) {
            if (i7 >= 1 && i7 <= 16777215) {
                parcel.enforceInterface("com.discord.socialsdk.rpc.IDiscordRpcService");
            }
            if (i7 == 1598968902) {
                parcel2.writeString("com.discord.socialsdk.rpc.IDiscordRpcService");
                return true;
            }
            if (i7 != 1) {
                return super.onTransact(i7, parcel, parcel2, i10);
            }
            IDiscordRpcConnection iDiscordRpcConnectionConnect = connect(parcel.readLong(), parcel.readString(), IDiscordRpcCallback.Stub.asInterface(parcel.readStrongBinder()));
            parcel2.writeNoException();
            parcel2.writeStrongInterface(iDiscordRpcConnectionConnect);
            return true;
        }
    }

    IDiscordRpcConnection connect(long j, String str, IDiscordRpcCallback iDiscordRpcCallback);
}
