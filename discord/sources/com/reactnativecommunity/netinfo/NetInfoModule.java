package com.reactnativecommunity.netinfo;

import a5.k0;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Handler;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import kl.a;
import kl.b;
import kl.c;

/* JADX INFO: loaded from: classes3.dex */
@ReactModule(name = NetInfoModule.NAME)
public class NetInfoModule extends ReactContextBaseJavaModule {
    public static final String NAME = "RNCNetInfo";
    private final a mAmazonConnectivityChecker;
    private final b mConnectivityReceiver;
    private int numberOfListeners;

    public NetInfoModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.numberOfListeners = 0;
        this.mConnectivityReceiver = new c(reactApplicationContext);
        this.mAmazonConnectivityChecker = new a(reactApplicationContext, this);
    }

    @ReactMethod
    public void addListener(String str) {
        this.numberOfListeners++;
        this.mConnectivityReceiver.f14576e = true;
    }

    @ReactMethod
    public void getCurrentState(String str, Promise promise) {
        promise.resolve(this.mConnectivityReceiver.a(str));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        c cVar = (c) this.mConnectivityReceiver;
        ConnectivityManager connectivityManager = cVar.f14572a;
        try {
            cVar.k = connectivityManager.getActiveNetwork();
            cVar.d(0);
            connectivityManager.registerDefaultNetworkCallback(cVar.j);
        } catch (SecurityException unused) {
        }
        a aVar = this.mAmazonConnectivityChecker;
        aVar.getClass();
        if (a.a()) {
            k0 k0Var = aVar.f14566a;
            if (!k0Var.f223b) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("com.amazon.tv.networkmonitor.INTERNET_DOWN");
                intentFilter.addAction("com.amazon.tv.networkmonitor.INTERNET_UP");
                hf.a.b(aVar.f14567b, k0Var, intentFilter);
                k0Var.f223b = true;
            }
            if (aVar.f14571f) {
                return;
            }
            Handler handler = new Handler();
            aVar.f14570e = handler;
            aVar.f14571f = true;
            handler.post(aVar.f14569d);
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        a aVar = this.mAmazonConnectivityChecker;
        aVar.getClass();
        if (a.a()) {
            if (aVar.f14571f) {
                aVar.f14571f = false;
                aVar.f14570e.removeCallbacksAndMessages(null);
                aVar.f14570e = null;
            }
            k0 k0Var = aVar.f14566a;
            if (k0Var.f223b) {
                aVar.f14567b.unregisterReceiver(k0Var);
                k0Var.f223b = false;
            }
        }
        c cVar = (c) this.mConnectivityReceiver;
        cVar.getClass();
        try {
            cVar.f14572a.unregisterNetworkCallback(cVar.j);
        } catch (IllegalArgumentException | SecurityException unused) {
        }
        this.mConnectivityReceiver.f14576e = false;
    }

    public void onAmazonFireDeviceConnectivityChanged(boolean z5) {
        b bVar = this.mConnectivityReceiver;
        bVar.f14580i = Boolean.valueOf(z5);
        bVar.c(bVar.f14577f, bVar.f14578g, bVar.f14579h);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        invalidate();
    }

    @ReactMethod
    public void removeListeners(Integer num) {
        int iIntValue = this.numberOfListeners - num.intValue();
        this.numberOfListeners = iIntValue;
        if (iIntValue == 0) {
            this.mConnectivityReceiver.f14576e = false;
        }
    }
}
