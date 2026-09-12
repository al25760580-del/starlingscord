package com.discord.security_key;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public /* synthetic */ class SecurityKeyManagerModule$webauthn$2 extends FunctionReferenceImpl implements Function3 {
    public SecurityKeyManagerModule$webauthn$2(Object obj) {
        super(3, obj, SecurityKeyManagerModule.class, "reject", "reject(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((String) obj, (String) obj2, (Throwable) obj3);
        return Unit.f14616a;
    }

    public final void invoke(String p3, String str, Throwable th2) {
        Intrinsics.checkNotNullParameter(p3, "p0");
        ((SecurityKeyManagerModule) this.receiver).reject(p3, str, th2);
    }
}
