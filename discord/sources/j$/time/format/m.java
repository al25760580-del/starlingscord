package j$.time.format;

import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class m implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j$.time.temporal.j f13512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f13513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f13514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile i f13515d;

    public m(j$.time.temporal.j jVar, v vVar, b bVar) {
        this.f13512a = jVar;
        this.f13513b = vVar;
        this.f13514c = bVar;
    }

    @Override // j$.time.format.f
    public final boolean a(p pVar, StringBuilder sb2) {
        j$.time.chrono.e eVar;
        Map map;
        Long lA = pVar.a(this.f13512a);
        if (lA == null) {
            return false;
        }
        j$.time.chrono.d dVar = (j$.time.chrono.d) pVar.f13526a.c(j$.time.temporal.k.f13558b);
        String str = null;
        if (dVar == null || dVar == (eVar = j$.time.chrono.e.f13475a)) {
            b bVar = this.f13514c;
            v vVar = this.f13513b;
            Locale locale = pVar.f13527b.f13486b;
            Map map2 = (Map) bVar.f13491a.f13529a.get(vVar);
            if (map2 != null) {
                str = (String) map2.get(lA);
            }
        } else {
            b bVar2 = this.f13514c;
            j$.time.temporal.j jVar = this.f13512a;
            v vVar2 = this.f13513b;
            Locale locale2 = pVar.f13527b.f13486b;
            if ((dVar == eVar || !(jVar instanceof j$.time.temporal.a)) && (map = (Map) bVar2.f13491a.f13529a.get(vVar2)) != null) {
                str = (String) map.get(lA);
            }
        }
        if (str != null) {
            sb2.append(str);
            return true;
        }
        if (this.f13515d == null) {
            this.f13515d = new i(this.f13512a, 1, 19, u.NORMAL);
        }
        return this.f13515d.a(pVar, sb2);
    }

    public final String toString() {
        v vVar = v.FULL;
        j$.time.temporal.j jVar = this.f13512a;
        v vVar2 = this.f13513b;
        if (vVar2 == vVar) {
            return "Text(" + jVar + ")";
        }
        return "Text(" + jVar + "," + vVar2 + ")";
    }
}
