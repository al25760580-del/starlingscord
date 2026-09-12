package fk;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.modules.core.DeviceEventManagerModule;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Callback {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n f9269e;

    public /* synthetic */ a(n nVar, int i7) {
        this.f9268d = i7;
        this.f9269e = nVar;
    }

    @Override // com.facebook.react.bridge.Callback
    public final void invoke(Object... objArr) {
        switch (this.f9268d) {
            case 0:
                n nVar = this.f9269e;
                String date = nVar.getDate();
                String pickerId = nVar.getPickerId();
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putString("date", date);
                writableMapCreateMap.putString(StackTraceHelper.ID_KEY, pickerId);
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) com.mkuczera.haptic.d.f7010b.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("onConfirm", writableMapCreateMap);
                break;
            default:
                String pickerId2 = this.f9269e.getPickerId();
                WritableMap writableMapCreateMap2 = Arguments.createMap();
                writableMapCreateMap2.putString(StackTraceHelper.ID_KEY, pickerId2);
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) com.mkuczera.haptic.d.f7010b.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("onCancel", writableMapCreateMap2);
                break;
        }
    }
}
