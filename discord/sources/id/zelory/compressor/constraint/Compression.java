package id.zelory.compressor.constraint;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import qn.a;

/* JADX INFO: loaded from: classes3.dex */
public final class Compression {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f11713a = new ArrayList();

    public final void a(a constraint) {
        Intrinsics.checkParameterIsNotNull(constraint, "constraint");
        this.f11713a.add(constraint);
    }
}
