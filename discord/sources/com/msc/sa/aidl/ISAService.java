package com.msc.sa.aidl;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import gn.h;

/* JADX INFO: loaded from: classes3.dex */
public interface ISAService extends IInterface {
    public static final String DESCRIPTOR = "com.msc.sa.aidl.ISAService";

    public static abstract class Stub extends Binder implements ISAService {
        static final int TRANSACTION_registerCallback = 1;
        static final int TRANSACTION_requestAccessToken = 3;
        static final int TRANSACTION_requestAuthCode = 6;
        static final int TRANSACTION_requestChecklistValidation = 4;
        static final int TRANSACTION_requestDisclaimerAgreement = 5;
        static final int TRANSACTION_requestPasswordConfirmation = 8;
        static final int TRANSACTION_requestRLControlFMM = 9;
        static final int TRANSACTION_requestRubinRequest = 10;
        static final int TRANSACTION_requestSCloudAccessToken = 7;
        static final int TRANSACTION_unregisterCallback = 2;

        public static class Proxy implements ISAService {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return ISAService.DESCRIPTOR;
            }

            @Override // com.msc.sa.aidl.ISAService
            public String registerCallback(String str, String str2, String str3, ISACallback iSACallback) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ISAService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    parcelObtain.writeStrongInterface(iSACallback);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.msc.sa.aidl.ISAService
            public boolean requestAccessToken(int i7, String str, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ISAService.DESCRIPTOR);
                    parcelObtain.writeInt(i7);
                    parcelObtain.writeString(str);
                    h.c(parcelObtain, bundle);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.msc.sa.aidl.ISAService
            public boolean requestAuthCode(int i7, String str, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ISAService.DESCRIPTOR);
                    parcelObtain.writeInt(i7);
                    parcelObtain.writeString(str);
                    h.c(parcelObtain, bundle);
                    this.mRemote.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.msc.sa.aidl.ISAService
            public boolean requestChecklistValidation(int i7, String str, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ISAService.DESCRIPTOR);
                    parcelObtain.writeInt(i7);
                    parcelObtain.writeString(str);
                    h.c(parcelObtain, bundle);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.msc.sa.aidl.ISAService
            public boolean requestDisclaimerAgreement(int i7, String str, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ISAService.DESCRIPTOR);
                    parcelObtain.writeInt(i7);
                    parcelObtain.writeString(str);
                    h.c(parcelObtain, bundle);
                    this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.msc.sa.aidl.ISAService
            public boolean requestPasswordConfirmation(int i7, String str, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ISAService.DESCRIPTOR);
                    parcelObtain.writeInt(i7);
                    parcelObtain.writeString(str);
                    h.c(parcelObtain, bundle);
                    this.mRemote.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.msc.sa.aidl.ISAService
            public boolean requestRLControlFMM(int i7, String str, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ISAService.DESCRIPTOR);
                    parcelObtain.writeInt(i7);
                    parcelObtain.writeString(str);
                    h.c(parcelObtain, bundle);
                    this.mRemote.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.msc.sa.aidl.ISAService
            public boolean requestRubinRequest(int i7, String str, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ISAService.DESCRIPTOR);
                    parcelObtain.writeInt(i7);
                    parcelObtain.writeString(str);
                    h.c(parcelObtain, bundle);
                    this.mRemote.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.msc.sa.aidl.ISAService
            public boolean requestSCloudAccessToken(int i7, String str, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ISAService.DESCRIPTOR);
                    parcelObtain.writeInt(i7);
                    parcelObtain.writeString(str);
                    h.c(parcelObtain, bundle);
                    this.mRemote.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.msc.sa.aidl.ISAService
            public boolean unregisterCallback(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ISAService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, ISAService.DESCRIPTOR);
        }

        public static ISAService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ISAService.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ISAService)) ? new Proxy(iBinder) : (ISAService) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i10) {
            if (i7 >= 1 && i7 <= 16777215) {
                parcel.enforceInterface(ISAService.DESCRIPTOR);
            }
            if (i7 == 1598968902) {
                parcel2.writeString(ISAService.DESCRIPTOR);
                return true;
            }
            switch (i7) {
                case 1:
                    String strRegisterCallback = registerCallback(parcel.readString(), parcel.readString(), parcel.readString(), ISACallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeString(strRegisterCallback);
                    return true;
                case 2:
                    boolean zUnregisterCallback = unregisterCallback(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(zUnregisterCallback ? 1 : 0);
                    return true;
                case 3:
                    int i11 = parcel.readInt();
                    String string = parcel.readString();
                    Parcelable.Creator creator = Bundle.CREATOR;
                    boolean zRequestAccessToken = requestAccessToken(i11, string, (Bundle) h.b(parcel));
                    parcel2.writeNoException();
                    parcel2.writeInt(zRequestAccessToken ? 1 : 0);
                    return true;
                case 4:
                    int i12 = parcel.readInt();
                    String string2 = parcel.readString();
                    Parcelable.Creator creator2 = Bundle.CREATOR;
                    boolean zRequestChecklistValidation = requestChecklistValidation(i12, string2, (Bundle) h.b(parcel));
                    parcel2.writeNoException();
                    parcel2.writeInt(zRequestChecklistValidation ? 1 : 0);
                    return true;
                case 5:
                    int i13 = parcel.readInt();
                    String string3 = parcel.readString();
                    Parcelable.Creator creator3 = Bundle.CREATOR;
                    boolean zRequestDisclaimerAgreement = requestDisclaimerAgreement(i13, string3, (Bundle) h.b(parcel));
                    parcel2.writeNoException();
                    parcel2.writeInt(zRequestDisclaimerAgreement ? 1 : 0);
                    return true;
                case 6:
                    int i14 = parcel.readInt();
                    String string4 = parcel.readString();
                    Parcelable.Creator creator4 = Bundle.CREATOR;
                    boolean zRequestAuthCode = requestAuthCode(i14, string4, (Bundle) h.b(parcel));
                    parcel2.writeNoException();
                    parcel2.writeInt(zRequestAuthCode ? 1 : 0);
                    return true;
                case 7:
                    int i15 = parcel.readInt();
                    String string5 = parcel.readString();
                    Parcelable.Creator creator5 = Bundle.CREATOR;
                    boolean zRequestSCloudAccessToken = requestSCloudAccessToken(i15, string5, (Bundle) h.b(parcel));
                    parcel2.writeNoException();
                    parcel2.writeInt(zRequestSCloudAccessToken ? 1 : 0);
                    return true;
                case 8:
                    int i16 = parcel.readInt();
                    String string6 = parcel.readString();
                    Parcelable.Creator creator6 = Bundle.CREATOR;
                    boolean zRequestPasswordConfirmation = requestPasswordConfirmation(i16, string6, (Bundle) h.b(parcel));
                    parcel2.writeNoException();
                    parcel2.writeInt(zRequestPasswordConfirmation ? 1 : 0);
                    return true;
                case 9:
                    int i17 = parcel.readInt();
                    String string7 = parcel.readString();
                    Parcelable.Creator creator7 = Bundle.CREATOR;
                    boolean zRequestRLControlFMM = requestRLControlFMM(i17, string7, (Bundle) h.b(parcel));
                    parcel2.writeNoException();
                    parcel2.writeInt(zRequestRLControlFMM ? 1 : 0);
                    return true;
                case 10:
                    int i18 = parcel.readInt();
                    String string8 = parcel.readString();
                    Parcelable.Creator creator8 = Bundle.CREATOR;
                    boolean zRequestRubinRequest = requestRubinRequest(i18, string8, (Bundle) h.b(parcel));
                    parcel2.writeNoException();
                    parcel2.writeInt(zRequestRubinRequest ? 1 : 0);
                    return true;
                default:
                    return super.onTransact(i7, parcel, parcel2, i10);
            }
        }
    }

    String registerCallback(String str, String str2, String str3, ISACallback iSACallback);

    boolean requestAccessToken(int i7, String str, Bundle bundle);

    boolean requestAuthCode(int i7, String str, Bundle bundle);

    boolean requestChecklistValidation(int i7, String str, Bundle bundle);

    boolean requestDisclaimerAgreement(int i7, String str, Bundle bundle);

    boolean requestPasswordConfirmation(int i7, String str, Bundle bundle);

    boolean requestRLControlFMM(int i7, String str, Bundle bundle);

    boolean requestRubinRequest(int i7, String str, Bundle bundle);

    boolean requestSCloudAccessToken(int i7, String str, Bundle bundle);

    boolean unregisterCallback(String str);
}
