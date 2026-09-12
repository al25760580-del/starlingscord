package qr;

import a5.i0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends i0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f19021v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(a5.b0 writer, boolean z5) {
        super(writer);
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.f19021v = z5;
    }

    @Override // a5.i0
    public final void w(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.f19021v) {
            super.w(value);
        } else {
            u(value);
        }
    }
}
