package com.msc.sa.aidl;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import e4.f;

/* JADX INFO: loaded from: classes3.dex */
public interface ISACallback extends IInterface {
    public static final String DESCRIPTOR = "com.msc.sa.aidl.ISACallback";

    public static abstract class Stub extends Binder implements ISACallback {
        static final int TRANSACTION_onReceiveAccessToken = 1;
        static final int TRANSACTION_onReceiveAuthCode = 4;
        static final int TRANSACTION_onReceiveChecklistValidation = 2;
        static final int TRANSACTION_onReceiveDisclaimerAgreement = 3;
        static final int TRANSACTION_onReceivePasswordConfirmation = 6;
        static final int TRANSACTION_onReceiveRLControlFMM = 7;
        static final int TRANSACTION_onReceiveRubinRequest = 8;
        static final int TRANSACTION_onReceiveSCloudAccessToken = 5;

        public static class Proxy implements ISACallback {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return ISACallback.DESCRIPTOR;
            }

            @Override // com.msc.sa.aidl.ISACallback
            public void onReceiveAccessToken(int i7, boolean z5, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ISACallback.DESCRIPTOR);
                    parcelObtain.writeInt(i7);
                    parcelObtain.writeInt(z5 ? 1 : 0);
                    f.b(parcelObtain, bundle);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.msc.sa.aidl.ISACallback
            public void onReceiveAuthCode(int i7, boolean z5, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ISACallback.DESCRIPTOR);
                    parcelObtain.writeInt(i7);
                    parcelObtain.writeInt(z5 ? 1 : 0);
                    f.b(parcelObtain, bundle);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.msc.sa.aidl.ISACallback
            public void onReceiveChecklistValidation(int i7, boolean z5, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ISACallback.DESCRIPTOR);
                    parcelObtain.writeInt(i7);
                    parcelObtain.writeInt(z5 ? 1 : 0);
                    f.b(parcelObtain, bundle);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.msc.sa.aidl.ISACallback
            public void onReceiveDisclaimerAgreement(int i7, boolean z5, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ISACallback.DESCRIPTOR);
                    parcelObtain.writeInt(i7);
                    parcelObtain.writeInt(z5 ? 1 : 0);
                    f.b(parcelObtain, bundle);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.msc.sa.aidl.ISACallback
            public void onReceivePasswordConfirmation(int i7, boolean z5, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ISACallback.DESCRIPTOR);
                    parcelObtain.writeInt(i7);
                    parcelObtain.writeInt(z5 ? 1 : 0);
                    f.b(parcelObtain, bundle);
                    this.mRemote.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.msc.sa.aidl.ISACallback
            public void onReceiveRLControlFMM(int i7, boolean z5, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ISACallback.DESCRIPTOR);
                    parcelObtain.writeInt(i7);
                    parcelObtain.writeInt(z5 ? 1 : 0);
                    f.b(parcelObtain, bundle);
                    this.mRemote.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.msc.sa.aidl.ISACallback
            public void onReceiveRubinRequest(int i7, boolean z5, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ISACallback.DESCRIPTOR);
                    parcelObtain.writeInt(i7);
                    parcelObtain.writeInt(z5 ? 1 : 0);
                    f.b(parcelObtain, bundle);
                    this.mRemote.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.msc.sa.aidl.ISACallback
            public void onReceiveSCloudAccessToken(int i7, boolean z5, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ISACallback.DESCRIPTOR);
                    parcelObtain.writeInt(i7);
                    parcelObtain.writeInt(z5 ? 1 : 0);
                    f.b(parcelObtain, bundle);
                    this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, ISACallback.DESCRIPTOR);
        }

        public static ISACallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ISACallback.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ISACallback)) ? new Proxy(iBinder) : (ISACallback) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i10) {
            boolean z5;
            if (i7 >= 1 && i7 <= 16777215) {
                parcel.enforceInterface(ISACallback.DESCRIPTOR);
            }
            if (i7 == 1598968902) {
                parcel2.writeString(ISACallback.DESCRIPTOR);
                return true;
            }
            switch (i7) {
                case 1:
                    int i11 = parcel.readInt();
                    z5 = parcel.readInt() != 0;
                    Parcelable.Creator creator = Bundle.CREATOR;
                    onReceiveAccessToken(i11, z5, (Bundle) f.a(parcel));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    int i12 = parcel.readInt();
                    z5 = parcel.readInt() != 0;
                    Parcelable.Creator creator2 = Bundle.CREATOR;
                    onReceiveChecklistValidation(i12, z5, (Bundle) f.a(parcel));
                    parcel2.writeNoException();
                    return true;
                case 3:
                    int i13 = parcel.readInt();
                    z5 = parcel.readInt() != 0;
                    Parcelable.Creator creator3 = Bundle.CREATOR;
                    onReceiveDisclaimerAgreement(i13, z5, (Bundle) f.a(parcel));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    int i14 = parcel.readInt();
                    z5 = parcel.readInt() != 0;
                    Parcelable.Creator creator4 = Bundle.CREATOR;
                    onReceiveAuthCode(i14, z5, (Bundle) f.a(parcel));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    int i15 = parcel.readInt();
                    z5 = parcel.readInt() != 0;
                    Parcelable.Creator creator5 = Bundle.CREATOR;
                    onReceiveSCloudAccessToken(i15, z5, (Bundle) f.a(parcel));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    int i16 = parcel.readInt();
                    z5 = parcel.readInt() != 0;
                    Parcelable.Creator creator6 = Bundle.CREATOR;
                    onReceivePasswordConfirmation(i16, z5, (Bundle) f.a(parcel));
                    parcel2.writeNoException();
                    return true;
                case 7:
                    int i17 = parcel.readInt();
                    z5 = parcel.readInt() != 0;
                    Parcelable.Creator creator7 = Bundle.CREATOR;
                    onReceiveRLControlFMM(i17, z5, (Bundle) f.a(parcel));
                    parcel2.writeNoException();
                    return true;
                case 8:
                    int i18 = parcel.readInt();
                    z5 = parcel.readInt() != 0;
                    Parcelable.Creator creator8 = Bundle.CREATOR;
                    onReceiveRubinRequest(i18, z5, (Bundle) f.a(parcel));
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i7, parcel, parcel2, i10);
            }
        }
    }

    void onReceiveAccessToken(int i7, boolean z5, Bundle bundle);

    void onReceiveAuthCode(int i7, boolean z5, Bundle bundle);

    void onReceiveChecklistValidation(int i7, boolean z5, Bundle bundle);

    void onReceiveDisclaimerAgreement(int i7, boolean z5, Bundle bundle);

    void onReceivePasswordConfirmation(int i7, boolean z5, Bundle bundle);

    void onReceiveRLControlFMM(int i7, boolean z5, Bundle bundle);

    void onReceiveRubinRequest(int i7, boolean z5, Bundle bundle);

    void onReceiveSCloudAccessToken(int i7, boolean z5, Bundle bundle);
}
