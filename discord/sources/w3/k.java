package w3;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import v3.t;
import v3.x;

/* JADX INFO: loaded from: classes.dex */
public final class k extends e4.f {
    public static final String j = v3.q.f("WorkContinuationImpl");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f22033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f22035d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f22036e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f22037f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f22038g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f22039h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public e4.e f22040i;

    public k(o oVar, String str, int i7, List list) {
        this.f22033b = oVar;
        this.f22034c = str;
        this.f22035d = i7;
        this.f22036e = list;
        this.f22037f = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (i7 == 1 && ((t) list.get(i10)).f21429b.f8016u != LongCompanionObject.MAX_VALUE) {
                throw new IllegalArgumentException("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
            }
            String string = ((t) list.get(i10)).f21428a.toString();
            Intrinsics.checkNotNullExpressionValue(string, "id.toString()");
            this.f22037f.add(string);
            this.f22038g.add(string);
        }
    }

    public static HashSet B0(k kVar) {
        HashSet hashSet = new HashSet();
        kVar.getClass();
        return hashSet;
    }

    public final x A0() {
        if (this.f22039h) {
            v3.q.d().g(j, "Already enqueued work ids (" + TextUtils.join(", ", this.f22037f) + ")");
        } else {
            f4.c cVar = new f4.c(this);
            this.f22033b.f22049d.a(cVar);
            this.f22040i = cVar.f8823e;
        }
        return this.f22040i;
    }
}
