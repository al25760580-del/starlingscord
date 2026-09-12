package ur;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import zr.h;
import zr.k;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f21305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f21306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f21307c;

    static {
        zr.c cVar = new zr.c();
        f21305a = Collections.singleton(h.f24100d);
        f21306b = Collections.singletonList(new k());
        f21307c = Collections.unmodifiableList(Arrays.asList(cVar, new wr.a()));
    }
}
