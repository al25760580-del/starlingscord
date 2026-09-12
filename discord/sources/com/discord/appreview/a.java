package com.discord.appreview;

import com.discord.permissions.NativePermissionManagerModule;
import com.facebook.react.bridge.Promise;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Promise f3957e;

    public /* synthetic */ a(Promise promise, int i7) {
        this.f3956d = i7;
        this.f3957e = promise;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f3956d) {
            case 0:
                return AppRatingRequestModule.requestRating$lambda$0(this.f3957e);
            default:
                return NativePermissionManagerModule.requestForegroundServicePermissionVoiceCall$lambda$3$lambda$2(this.f3957e);
        }
    }
}
