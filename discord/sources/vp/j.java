package vp;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j extends i implements u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h f21897e = h.f21886c;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f21898i;

    public final void f(k kVar) {
        y yVar;
        if (!this.f21898i) {
            this.f21897e = this.f21897e.clone();
            this.f21898i = true;
        }
        h hVar = this.f21897e;
        h hVar2 = kVar.f21906d;
        hVar.getClass();
        int i7 = 0;
        while (true) {
            yVar = hVar2.f21887a;
            if (i7 >= yVar.f21932e.size()) {
                break;
            }
            hVar.g((Map.Entry) yVar.f21932e.get(i7));
            i7++;
        }
        Iterator it = yVar.c().iterator();
        while (it.hasNext()) {
            hVar.g((Map.Entry) it.next());
        }
    }
}
