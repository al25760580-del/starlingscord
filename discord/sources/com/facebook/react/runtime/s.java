package com.facebook.react.runtime;

import com.facebook.react.bridge.NativeMap;
import com.facebook.react.uimanager.UIConstantsProviderBinding;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s implements UIConstantsProviderBinding.ConstantsForViewManagerProvider, UIConstantsProviderBinding.ConstantsProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ReactInstance f5330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HashMap f5331b;

    public /* synthetic */ s(ReactInstance reactInstance, HashMap map) {
        this.f5330a = reactInstance;
        this.f5331b = map;
    }

    @Override // com.facebook.react.uimanager.UIConstantsProviderBinding.ConstantsProvider
    public NativeMap getConstants() {
        return ReactInstance._init_$lambda$3(this.f5330a, this.f5331b);
    }

    @Override // com.facebook.react.uimanager.UIConstantsProviderBinding.ConstantsForViewManagerProvider
    public NativeMap getConstantsForViewManager(String str) {
        return ReactInstance._init_$lambda$1(this.f5330a, this.f5331b, str);
    }
}
