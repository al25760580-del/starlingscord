package kotlin.collections;

import java.util.Iterator;
import java.util.regex.Matcher;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.MatchGroup;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14653d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f14654e;

    public /* synthetic */ k(int i7, Object obj) {
        this.f14653d = i7;
        this.f14654e = obj;
    }

    @Override // kotlin.collections.b
    public final int a() {
        switch (this.f14653d) {
            case 0:
                return ((l) this.f14654e).c();
            case 1:
                return ((kotlin.text.m) this.f14654e).f14734a.groupCount() + 1;
            default:
                return 0;
        }
    }

    public MatchGroup b(int i7) {
        Matcher matcher = ((kotlin.text.m) this.f14654e).f14734a;
        IntRange intRangeI = lo.j.i(matcher.start(i7), matcher.end(i7));
        if (intRangeI.f14688d < 0) {
            return null;
        }
        String strGroup = matcher.group(i7);
        Intrinsics.checkNotNullExpressionValue(strGroup, "group(...)");
        return new MatchGroup(strGroup, intRangeI);
    }

    @Override // kotlin.collections.b, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        switch (this.f14653d) {
            case 0:
                return ((l) this.f14654e).containsValue(obj);
            case 1:
                if (obj == null ? true : obj instanceof MatchGroup) {
                    return super.contains((MatchGroup) obj);
                }
                return false;
            default:
                return ((w.b) this.f14654e).containsValue(obj);
        }
    }

    @Override // kotlin.collections.b, java.util.Collection
    public boolean isEmpty() {
        switch (this.f14653d) {
            case 1:
                return false;
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f14653d) {
            case 0:
                return new j(((w.c) ((l) this.f14654e).a()).iterator(), 1);
            case 1:
                return new androidx.core.view.c0(xq.r.n(CollectionsKt.C(d0.e(this)), new Function1() { // from class: kotlin.text.l
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return this.f14733d.b(((Integer) obj).intValue());
                    }
                }));
            default:
                w.e eVar = w.e.f21968b;
                w.f[] fVarArr = new w.f[8];
                for (int i7 = 0; i7 < 8; i7++) {
                    fVarArr[i7] = new w.f(2);
                }
                return new w.d(fVarArr);
        }
    }
}
