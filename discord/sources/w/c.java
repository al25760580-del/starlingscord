package w;

import java.util.Iterator;
import java.util.Map;
import kotlin.collections.j;
import kotlin.collections.l;
import kotlin.collections.q;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c extends q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f21963e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l f21964i;

    public /* synthetic */ c(l lVar, int i7) {
        this.f21963e = i7;
        this.f21964i = lVar;
    }

    @Override // kotlin.collections.b
    public final int a() {
        switch (this.f21963e) {
            case 0:
                return 0;
            case 1:
                return 0;
            default:
                return this.f21964i.c();
        }
    }

    @Override // kotlin.collections.b, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        switch (this.f21963e) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    b bVar = (b) this.f21964i;
                    Object obj2 = bVar.get(entry.getKey());
                    if (obj2 != null) {
                        return Intrinsics.areEqual(obj2, entry.getValue());
                    }
                    if (entry.getValue() == null && bVar.containsKey(entry.getKey())) {
                        return true;
                    }
                }
                return false;
            case 1:
                return ((b) this.f21964i).containsKey(obj);
            default:
                return this.f21964i.containsKey(obj);
        }
    }

    @Override // kotlin.collections.q, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f21963e) {
            case 0:
                e eVar = e.f21968b;
                f[] fVarArr = new f[8];
                for (int i7 = 0; i7 < 8; i7++) {
                    fVarArr[i7] = new f(0);
                }
                return new d(fVarArr);
            case 1:
                e eVar2 = e.f21968b;
                f[] fVarArr2 = new f[8];
                for (int i10 = 0; i10 < 8; i10++) {
                    fVarArr2[i10] = new f(1);
                }
                return new d(fVarArr2);
            default:
                return new j(((c) this.f21964i.a()).iterator(), 0);
        }
    }
}
