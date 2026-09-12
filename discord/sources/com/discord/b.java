package com.discord;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3967d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MainApplication f3968e;

    public /* synthetic */ b(MainApplication mainApplication, int i7) {
        this.f3967d = i7;
        this.f3968e = mainApplication;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f3967d) {
            case 0:
                return MainApplication.initialize$lambda$4(this.f3968e);
            case 1:
                return MainApplication.reactHost_delegate$lambda$7(this.f3968e);
            case 2:
                return MainApplication.performInitialization$lambda$8(this.f3968e);
            case 3:
                return MainApplication.performInitialization$lambda$12(this.f3968e);
            default:
                return MainApplication.onCreate$lambda$1(this.f3968e);
        }
    }
}
