package kq;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f14769d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f14770e = new a();

    public RuntimeException a(Throwable e10) throws Throwable {
        Intrinsics.checkNotNullParameter(e10, "e");
        throw e10;
    }

    @Override // kq.n
    public void lock() {
    }

    @Override // kq.n
    public void unlock() {
    }
}
