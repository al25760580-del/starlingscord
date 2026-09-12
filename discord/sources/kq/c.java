package kq;

import a5.i0;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends i {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f14771v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(l lVar, Function0 function0, Object obj) {
        super(lVar, function0);
        this.f14771v = obj;
    }

    @Override // kq.h
    public final i0 c(boolean z5) {
        return new i0(this.f14771v, false, 8);
    }
}
