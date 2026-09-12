package jl;

import android.content.ClipboardManager;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.reactnativecommunity.clipboard.ClipboardModule;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements ClipboardManager.OnPrimaryClipChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ClipboardModule f13920a;

    public a(ClipboardModule clipboardModule) {
        this.f13920a = clipboardModule;
    }

    @Override // android.content.ClipboardManager.OnPrimaryClipChangedListener
    public final void onPrimaryClipChanged() {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.f13920a.reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(ClipboardModule.CLIPBOARD_TEXT_CHANGED, null);
    }
}
