package com.discord.permissions;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.WritableNativeMap;
import il.e;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Callback {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4545d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4546e;

    public /* synthetic */ c(int i7, Object obj) {
        this.f4545d = i7;
        this.f4546e = obj;
    }

    @Override // com.facebook.react.bridge.Callback
    public final void invoke(Object[] objArr) {
        switch (this.f4545d) {
            case 0:
                NativePermissionPromise.generate$lambda$1((Function0) this.f4546e, objArr);
                break;
            default:
                e eVar = (e) this.f4546e;
                eVar.getClass();
                WritableNativeMap writableNativeMap = (WritableNativeMap) objArr[0];
                eVar.f11849c0.c(writableNativeMap.getString("code"), writableNativeMap.getString("message"));
                break;
        }
    }
}
