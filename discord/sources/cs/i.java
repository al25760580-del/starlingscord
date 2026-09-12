package cs;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class i extends Lambda implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7426d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f7427e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f7428i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f7429v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(j jVar, Object obj, Object obj2, int i7) {
        super(0);
        this.f7426d = i7;
        this.f7427e = jVar;
        this.f7428i = obj;
        this.f7429v = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f7426d) {
            case 0:
                List list = (List) this.f7428i;
                ls.l lVar = this.f7427e.f7432b;
                List listJ = lVar == null ? null : lVar.j((String) this.f7429v, list);
                if (listJ != null) {
                    list = listJ;
                }
                ArrayList arrayList = new ArrayList(e0.l(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((X509Certificate) ((Certificate) it.next()));
                }
                return arrayList;
            default:
                ls.l lVar2 = this.f7427e.f7432b;
                Intrinsics.checkNotNull(lVar2);
                return lVar2.j(((a) this.f7429v).f7404h.f17323d, ((q) this.f7428i).a());
        }
    }
}
