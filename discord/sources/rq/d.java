package rq;

import kotlin.jvm.internal.Intrinsics;
import lq.z;
import vo.r0;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0 f19544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f19545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f19546c;

    public d(r0 typeParameter, z inProjection, z outProjection) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        Intrinsics.checkNotNullParameter(inProjection, "inProjection");
        Intrinsics.checkNotNullParameter(outProjection, "outProjection");
        this.f19544a = typeParameter;
        this.f19545b = inProjection;
        this.f19546c = outProjection;
    }
}
