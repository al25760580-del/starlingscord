package com.facebook.react;

import android.graphics.BlendMode;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerProvider;
import com.facebook.react.runtime.ReactInstance;
import com.facebook.react.uimanager.UIConstantsProviderBinding;
import com.google.android.gms.tasks.Task;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Provider, UIManagerProvider, UIConstantsProviderBinding.DefaultEventTypesProvider, ig.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5143d;

    public /* synthetic */ a(int i7) {
        this.f5143d = i7;
    }

    public static /* bridge */ /* synthetic */ BlendMode b(Object obj) {
        return (BlendMode) obj;
    }

    @Override // com.facebook.react.bridge.UIManagerProvider
    public UIManager createUIManager(ReactApplicationContext reactApplicationContext) {
        return ReactNativeHost.lambda$getUIManagerProvider$0(reactApplicationContext);
    }

    @Override // ig.a
    public Object f(Task task) {
        int i7;
        switch (this.f5143d) {
            case 27:
                i7 = 403;
                break;
            default:
                i7 = -1;
                break;
        }
        return Integer.valueOf(i7);
    }

    @Override // javax.inject.Provider
    public Object get() {
        return DebugCorePackage.viewManagersMap_delegate$lambda$1$lambda$0();
    }

    @Override // com.facebook.react.uimanager.UIConstantsProviderBinding.DefaultEventTypesProvider
    public NativeMap getDefaultEventTypes() {
        return ReactInstance._init_$lambda$0();
    }
}
