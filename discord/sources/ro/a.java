package ro;

import ep.z;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import np.l;
import np.n;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f19503d;

    public a(Ref.BooleanRef booleanRef) {
        this.f19503d = booleanRef;
    }

    @Override // np.n
    public final l e(up.b classId, ap.a source) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        Intrinsics.checkNotNullParameter(source, "source");
        if (!Intrinsics.areEqual(classId, z.f8607b)) {
            return null;
        }
        this.f19503d.element = true;
        return null;
    }
}
