package com.discord.permissions;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public /* synthetic */ class NativePermissionManagerModule$requestWithDeduplication$1$wrapperPromise$1 extends FunctionReferenceImpl implements Function1<Object, String> {
    public NativePermissionManagerModule$requestWithDeduplication$1$wrapperPromise$1(Object obj) {
        super(1, obj, NativePermissionStatus.Companion.class, "fromAndroidPermissionStatus", "fromAndroidPermissionStatus(Ljava/lang/Object;)Ljava/lang/String;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(Object obj) {
        return ((NativePermissionStatus.Companion) this.receiver).fromAndroidPermissionStatus(obj);
    }
}
