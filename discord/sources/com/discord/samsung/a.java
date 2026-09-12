package com.discord.samsung;

import java.util.function.Function;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SamsungModule f4577b;

    public /* synthetic */ a(SamsungModule samsungModule, int i7) {
        this.f4576a = i7;
        this.f4577b = samsungModule;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f4576a) {
            case 0:
                return SamsungModule.getAccountUrlAndAuthCode$lambda$1(this.f4577b, (Throwable) obj);
            case 1:
                return SamsungModule.handleAuthResult$lambda$2(this.f4577b, (Throwable) obj);
            default:
                return SamsungModule.showConnectionDisclaimer$lambda$0(this.f4577b, (Throwable) obj);
        }
    }
}
