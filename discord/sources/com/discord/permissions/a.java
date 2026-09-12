package com.discord.permissions;

import com.facebook.react.bridge.Promise;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ NativePermissionManagerModule f4540e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Promise f4541i;

    public /* synthetic */ a(NativePermissionManagerModule nativePermissionManagerModule, Promise promise, int i7) {
        this.f4539d = i7;
        this.f4540e = nativePermissionManagerModule;
        this.f4541i = promise;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f4539d) {
            case 0:
                return NativePermissionManagerModule.requestForegroundServicePermissionScreenShareWithMic$lambda$4(this.f4540e, this.f4541i, (Promise) obj);
            case 1:
                return NativePermissionManagerModule.requestForegroundServicePermissionVoiceCall$lambda$3(this.f4540e, this.f4541i, (Promise) obj);
            default:
                return NativePermissionManagerModule.requestForegroundServicePermissionVoiceCall$lambda$3$lambda$1$lambda$0(this.f4540e, this.f4541i, (Promise) obj);
        }
    }
}
