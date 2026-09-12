package p2;

import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.collections.m0;
import kotlin.collections.o0;
import kotlin.collections.p0;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f17773c = new c(p0.f14661d, w0.d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f17774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f17775b;

    public c(p0 flags, o0 allowedViolations) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(allowedViolations, "allowedViolations");
        this.f17774a = flags;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        allowedViolations.getClass();
        p0.f14661d.getClass();
        m0.f14658d.getClass();
        this.f17775b = linkedHashMap;
    }
}
