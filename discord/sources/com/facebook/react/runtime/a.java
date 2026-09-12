package com.facebook.react.runtime;

import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.facebook.react.shell.MainReactPackage;
import com.swmansion.reanimated.ReanimatedPackage;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements ReactModuleInfoProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HashMap f5270b;

    public /* synthetic */ a(HashMap map, int i7) {
        this.f5269a = i7;
        this.f5270b = map;
    }

    @Override // com.facebook.react.module.model.ReactModuleInfoProvider
    public final Map getReactModuleInfos() {
        switch (this.f5269a) {
            case 0:
                return CoreReactPackage.fallbackForMissingClass$lambda$0(this.f5270b);
            case 1:
                return ReanimatedPackage.lambda$getReactModuleInfoProvider$0(this.f5270b);
            case 2:
                return this.f5270b;
            default:
                return MainReactPackage.fallbackForMissingClass$lambda$17((LinkedHashMap) this.f5270b);
        }
    }
}
