package com.facebook.react.uimanager;

import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KType;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5335d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArrayList f5336e;

    public /* synthetic */ a(int i7, ArrayList arrayList) {
        this.f5335d = i7;
        this.f5336e = arrayList;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f5335d) {
            case 0:
                return ViewManagerRegistry.invalidate$lambda$9(this.f5336e);
            case 1:
                return ViewManagerRegistry.onTrimMemory$lambda$12(this.f5336e);
            default:
                return ((KType) this.f5336e.get(0)).getClassifier();
        }
    }
}
