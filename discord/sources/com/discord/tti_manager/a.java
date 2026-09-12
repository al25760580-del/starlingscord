package com.discord.tti_manager;

import com.facebook.react.bridge.Promise;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ TTIManagerModule f4602e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Promise f4603i;

    public /* synthetic */ a(TTIManagerModule tTIManagerModule, Promise promise, int i7) {
        this.f4601d = i7;
        this.f4602e = tTIManagerModule;
        this.f4603i = promise;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Long l6 = (Long) obj;
        switch (this.f4601d) {
            case 0:
                return TTIManagerModule.getAppStartType$lambda$0(this.f4602e, this.f4603i, l6.longValue());
            default:
                return TTIManagerModule.getAppFirstVisibleTimestamp$lambda$2(this.f4602e, this.f4603i, l6.longValue());
        }
    }
}
