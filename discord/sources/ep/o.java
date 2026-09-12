package ep;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.w0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f8575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f8576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f8577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f8578d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final LinkedHashMap f8579e;

    static {
        a aVar = a.FIELD;
        a aVar2 = a.METHOD_RETURN_TYPE;
        a aVar3 = a.VALUE_PARAMETER;
        List listG = kotlin.collections.d0.g(aVar, aVar2, aVar3, a.TYPE_PARAMETER_BOUNDS, a.TYPE_USE);
        f8575a = listG;
        List listC = kotlin.collections.c0.c(aVar3);
        f8576b = listC;
        up.c cVar = b0.f8506a;
        mp.g gVar = mp.g.f15978i;
        Map mapG = w0.g(new Pair(cVar, new n(new mp.h(gVar, false), listG, false)), new Pair(b0.f8507b, new n(new mp.h(gVar, false), listG, false)), new Pair(b0.f8508c, new n(new mp.h(mp.g.f15976d, false), listG)));
        f8577c = mapG;
        f8579e = w0.i(mapG, w0.g(new Pair(b0.f8513h, new n(new mp.h(gVar, false), listC)), new Pair(b0.f8514i, new n(new mp.h(mp.g.f15977e, false), listC))));
    }
}
