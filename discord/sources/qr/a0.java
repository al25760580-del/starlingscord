package qr;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import or.b2;
import or.e2;
import or.v1;
import or.y1;
import rn.e0;
import rn.i0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f18995a;

    static {
        Intrinsics.checkNotNullParameter(rn.b0.f19461e, "<this>");
        Intrinsics.checkNotNullParameter(e0.f19470e, "<this>");
        Intrinsics.checkNotNullParameter(rn.y.f19500e, "<this>");
        Intrinsics.checkNotNullParameter(i0.f19474e, "<this>");
        SerialDescriptor[] elements = {y1.f17638b, b2.f17512b, v1.f17620b, e2.f17531b};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f18995a = kotlin.collections.y.J(elements);
    }

    public static final boolean a(SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        return serialDescriptor.isInline() && f18995a.contains(serialDescriptor);
    }
}
