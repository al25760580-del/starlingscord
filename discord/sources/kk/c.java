package kk;

import com.discord.R;
import com.henninghall.date_picker.pickers.AndroidNative;
import e4.p;
import fk.i;
import fk.n;
import ga.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import mk.d;
import mk.e;
import mk.f;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f14557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f14558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mk.c f14559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mk.a f14560d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final mk.a f14561e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final mk.b f14562f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final mk.a f14563g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f f14564h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final n f14565i;
    public final fj.c j;
    public final i k;

    public c(p pVar, n nVar) {
        this.f14557a = pVar;
        this.f14565i = nVar;
        this.j = new fj.c(nVar);
        f fVar = new f(d(R.id.year), pVar);
        fVar.f15873f = 1900;
        fVar.f15874g = 2100;
        this.f14564h = fVar;
        mk.a aVar = new mk.a(d(R.id.month), pVar, 2);
        this.f14563g = aVar;
        mk.b bVar = new mk.b(d(R.id.date), pVar);
        this.f14562f = bVar;
        mk.c cVar = new mk.c(d(R.id.day), pVar);
        this.f14559c = cVar;
        mk.a aVar2 = new mk.a(d(R.id.minutes), pVar, 1);
        this.f14560d = aVar2;
        mk.a aVar3 = new mk.a(d(R.id.ampm), pVar, 0);
        this.f14561e = aVar3;
        d dVar = new d(d(R.id.hour), pVar);
        this.f14558b = dVar;
        i iVar = new i();
        iVar.put(hk.c.f10926d, cVar);
        iVar.put(hk.c.f10929v, fVar);
        iVar.put(hk.c.f10928i, aVar);
        iVar.put(hk.c.f10927e, bVar);
        iVar.put(hk.c.f10930w, dVar);
        iVar.put(hk.c.f10931x, aVar2);
        iVar.put(hk.c.f10932y, aVar3);
        this.k = iVar;
        dVar.f15871d.setOnValueChangeListenerInScrolling(new l(20, this));
    }

    public final ArrayList a() {
        return new ArrayList(Arrays.asList(this.f14564h, this.f14563g, this.f14562f, this.f14559c, this.f14558b, this.f14560d, this.f14561e));
    }

    public final String b(int i7) {
        String strE;
        String str;
        StringBuilder sb2 = new StringBuilder();
        if (this.f14557a.g() == hk.b.f10922d) {
            ArrayList arrayListC = c();
            StringBuilder sb3 = new StringBuilder();
            for (int i10 = 0; i10 < 3; i10++) {
                if (i10 != 0) {
                    sb3.append(" ");
                }
                e eVar = (e) arrayListC.get(i10);
                if (eVar instanceof mk.b) {
                    if (eVar.h()) {
                        int size = eVar.f15870c.size();
                        str = (String) eVar.f15870c.get(((eVar.f15871d.getValue() + size) - i7) % size);
                    } else {
                        str = eVar.f15872e.format(eVar.f15869b.getTime());
                    }
                    sb3.append(str);
                } else {
                    sb3.append(eVar.e());
                }
            }
            strE = sb3.toString();
        } else {
            strE = this.f14559c.e();
        }
        sb2.append(strE);
        sb2.append(" ");
        sb2.append(this.f14558b.e() + " " + this.f14560d.e() + this.f14561e.e());
        return sb2.toString();
    }

    public final ArrayList c() {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((l) this.f14557a.f8030n).l().iterator();
        while (it.hasNext()) {
            arrayList.add((e) this.k.get((hk.c) it.next()));
        }
        return arrayList;
    }

    public final ik.e d(int i7) {
        return (ik.e) this.f14565i.findViewById(i7);
    }

    public final boolean e() {
        Iterator it = a().iterator();
        while (it.hasNext()) {
            AndroidNative androidNative = (AndroidNative) ((e) it.next()).f15871d;
            if (androidNative.L0 || androidNative.J0) {
                return true;
            }
        }
        return false;
    }
}
