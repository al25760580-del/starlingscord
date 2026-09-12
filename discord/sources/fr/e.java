package fr;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f9368a;

    static {
        try {
            Iterator it = Arrays.asList(new br.b()).iterator();
            Intrinsics.checkNotNullParameter(it, "<this>");
            co.q qVar = new co.q(5, it);
            Intrinsics.checkNotNullParameter(qVar, "<this>");
            f9368a = xq.r.q(new xq.a(qVar));
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }
}
