package tn;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements Comparator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final c f20851d = new c();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable a10 = (Comparable) obj;
        Comparable b10 = (Comparable) obj2;
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return b10.compareTo(a10);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return b.f20850d;
    }
}
