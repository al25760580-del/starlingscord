package com.discord.timers;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4596d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ TimersModule f4597e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ double f4598i;

    public /* synthetic */ a(TimersModule timersModule, double d6, int i7) {
        this.f4596d = i7;
        this.f4597e = timersModule;
        this.f4598i = d6;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f4596d) {
            case 0:
                return TimersModule.setInterval$lambda$1(this.f4597e, this.f4598i);
            default:
                return TimersModule.setTimeout$lambda$0(this.f4597e, this.f4598i);
        }
    }
}
