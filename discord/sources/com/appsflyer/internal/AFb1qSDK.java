package com.appsflyer.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import com.appsflyer.AFLogger;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class AFb1qSDK {

    public static final class AFa1tSDK implements ServiceConnection {
        final LinkedBlockingQueue<IBinder> getRevenue = new LinkedBlockingQueue<>(1);
        boolean getMediationNetwork = false;

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.getRevenue.put(iBinder);
            } catch (InterruptedException e10) {
                AFLogger.afErrorLogForExcManagerOnly("onServiceConnected Interrupted", e10);
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public static final class AFa1uSDK {
        private final boolean AFAdRevenueData;
        public final String getCurrencyIso4217Code;

        public AFa1uSDK(String str, boolean z5) {
            this.getCurrencyIso4217Code = str;
            this.AFAdRevenueData = z5;
        }

        public final boolean getRevenue() {
            return this.AFAdRevenueData;
        }
    }

    public static final class AFa1zSDK implements IInterface {
        private final IBinder getMediationNetwork;

        public AFa1zSDK(IBinder iBinder) {
            this.getMediationNetwork = iBinder;
        }

        public final boolean AFAdRevenueData() {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                parcelObtain.writeInt(1);
                this.getMediationNetwork.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readInt() != 0;
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.getMediationNetwork;
        }

        public final String getMonetizationNetwork() {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.getMediationNetwork.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }
    }

    public static AFa1uSDK AFAdRevenueData(Context context) throws PackageManager.NameNotFoundException, IOException {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        context.getPackageManager().getPackageInfo("com.android.vending", 0);
        AFa1tSDK aFa1tSDK = new AFa1tSDK();
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        try {
            if (!context.bindService(intent, aFa1tSDK, 1)) {
                context.unbindService(aFa1tSDK);
                throw new IOException("Google Play connection failed");
            }
            if (aFa1tSDK.getMediationNetwork) {
                throw new IllegalStateException("Cannot call get on this connection more than once");
            }
            aFa1tSDK.getMediationNetwork = true;
            IBinder iBinderPoll = aFa1tSDK.getRevenue.poll(10L, TimeUnit.SECONDS);
            if (iBinderPoll == null) {
                throw new TimeoutException("Timed out waiting for the service connection");
            }
            AFa1zSDK aFa1zSDK = new AFa1zSDK(iBinderPoll);
            AFa1uSDK aFa1uSDK = new AFa1uSDK(aFa1zSDK.getMonetizationNetwork(), aFa1zSDK.AFAdRevenueData());
            context.unbindService(aFa1tSDK);
            return aFa1uSDK;
        } catch (Throwable th2) {
            context.unbindService(aFa1tSDK);
            throw th2;
        }
    }
}
