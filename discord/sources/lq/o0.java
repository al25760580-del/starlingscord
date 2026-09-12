package lq;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class o0 extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o0 f15232b = new o0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o0 f15233c = new o0(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o0 f15234d = new o0(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15235a;

    public /* synthetic */ o0(int i7) {
        this.f15235a = i7;
    }

    @Override // lq.c
    public final pq.e D(p0 state, pq.d type) {
        switch (this.f15235a) {
            case 0:
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(type, "type");
                return state.f15238c.O(type);
            case 1:
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(type, "type");
                throw new UnsupportedOperationException("Should not be called");
            default:
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(type, "type");
                return state.f15238c.x(type);
        }
    }
}
