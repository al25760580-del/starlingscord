package j$.time.format;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f13516f = new a(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n f13517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f13518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f13519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f13520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13521e;

    static {
        HashMap map = new HashMap();
        map.put('G', j$.time.temporal.a.ERA);
        map.put('y', j$.time.temporal.a.YEAR_OF_ERA);
        map.put('u', j$.time.temporal.a.YEAR);
        j$.time.temporal.g gVar = j$.time.temporal.i.f13554a;
        map.put('Q', gVar);
        map.put('q', gVar);
        j$.time.temporal.a aVar = j$.time.temporal.a.MONTH_OF_YEAR;
        map.put('M', aVar);
        map.put('L', aVar);
        map.put('D', j$.time.temporal.a.DAY_OF_YEAR);
        map.put('d', j$.time.temporal.a.DAY_OF_MONTH);
        map.put('F', j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        j$.time.temporal.a aVar2 = j$.time.temporal.a.DAY_OF_WEEK;
        map.put('E', aVar2);
        map.put('c', aVar2);
        map.put('e', aVar2);
        map.put('a', j$.time.temporal.a.AMPM_OF_DAY);
        map.put('H', j$.time.temporal.a.HOUR_OF_DAY);
        map.put('k', j$.time.temporal.a.CLOCK_HOUR_OF_DAY);
        map.put('K', j$.time.temporal.a.HOUR_OF_AMPM);
        map.put('h', j$.time.temporal.a.CLOCK_HOUR_OF_AMPM);
        map.put('m', j$.time.temporal.a.MINUTE_OF_HOUR);
        map.put('s', j$.time.temporal.a.SECOND_OF_MINUTE);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.NANO_OF_SECOND;
        map.put('S', aVar3);
        map.put('A', j$.time.temporal.a.MILLI_OF_DAY);
        map.put('n', aVar3);
        map.put('N', j$.time.temporal.a.NANO_OF_DAY);
    }

    public n() {
        this.f13517a = this;
        this.f13519c = new ArrayList();
        this.f13521e = -1;
        this.f13518b = null;
        this.f13520d = false;
    }

    public n(n nVar) {
        this.f13517a = this;
        this.f13519c = new ArrayList();
        this.f13521e = -1;
        this.f13518b = nVar;
        this.f13520d = true;
    }

    public final void g(j$.time.temporal.j jVar, int i7) {
        Objects.requireNonNull(jVar, "field");
        if (i7 < 1 || i7 > 19) {
            throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i7);
        }
        f(new i(jVar, i7, i7, u.NOT_NEGATIVE));
    }

    public final void h(j$.time.temporal.j jVar, int i7, int i10, u uVar) {
        if (i7 == i10 && uVar == u.NOT_NEGATIVE) {
            g(jVar, i10);
            return;
        }
        Objects.requireNonNull(jVar, "field");
        Objects.requireNonNull(uVar, "signStyle");
        if (i7 < 1 || i7 > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i7);
        }
        if (i10 < 1 || i10 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i10);
        }
        if (i10 < i7) {
            throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i10 + " < " + i7);
        }
        f(new i(jVar, i7, i10, uVar));
    }

    public final void f(i iVar) {
        u uVar;
        n nVar = this.f13517a;
        int i7 = nVar.f13521e;
        if (i7 >= 0) {
            i iVar2 = (i) ((ArrayList) nVar.f13519c).get(i7);
            int i10 = iVar.f13502b;
            int i11 = iVar.f13503c;
            if (i10 != i11 || (uVar = iVar.f13504d) != u.NOT_NEGATIVE) {
                if (iVar2.f13505e != -1) {
                    iVar2 = new i(iVar2.f13501a, iVar2.f13502b, iVar2.f13503c, iVar2.f13504d, -1);
                }
                this.f13517a.f13521e = b(iVar);
            } else {
                iVar2 = new i(iVar2.f13501a, iVar2.f13502b, iVar2.f13503c, iVar2.f13504d, iVar2.f13505e + i11);
                if (iVar.f13505e != -1) {
                    iVar = new i(iVar.f13501a, i10, i11, uVar, -1);
                }
                b(iVar);
                this.f13517a.f13521e = i7;
            }
            ((ArrayList) this.f13517a.f13519c).set(i7, iVar2);
            return;
        }
        nVar.f13521e = b(iVar);
    }

    public final void e(j$.time.temporal.a aVar, Map map) {
        Objects.requireNonNull(aVar, "field");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        v vVar = v.FULL;
        b(new m(aVar, vVar, new b(new r(Collections.singletonMap(vVar, linkedHashMap)))));
    }

    public final void c(char c8) {
        b(new d(c8));
    }

    public final void d(String str) {
        if (str.length() > 0) {
            if (str.length() == 1) {
                b(new d(str.charAt(0)));
            } else {
                b(new l(str));
            }
        }
    }

    public final void j() {
        n nVar = this.f13517a;
        nVar.f13521e = -1;
        this.f13517a = new n(nVar);
    }

    public final void i() {
        n nVar = this.f13517a;
        if (nVar.f13518b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (((ArrayList) nVar.f13519c).size() > 0) {
            n nVar2 = this.f13517a;
            e eVar = new e(nVar2.f13519c, nVar2.f13520d);
            this.f13517a = this.f13517a.f13518b;
            b(eVar);
            return;
        }
        this.f13517a = this.f13517a.f13518b;
    }

    public final int b(f fVar) {
        Objects.requireNonNull(fVar, "pp");
        n nVar = this.f13517a;
        nVar.getClass();
        ((ArrayList) nVar.f13519c).add(fVar);
        n nVar2 = this.f13517a;
        nVar2.f13521e = -1;
        return ((ArrayList) nVar2.f13519c).size() - 1;
    }

    public final void a(DateTimeFormatter dateTimeFormatter) {
        e eVar = dateTimeFormatter.f13485a;
        if (eVar.f13495b) {
            eVar = new e(eVar.f13494a, false);
        }
        b(eVar);
    }

    public final DateTimeFormatter k(t tVar, j$.time.chrono.e eVar) {
        Locale locale = Locale.getDefault();
        Objects.requireNonNull(locale, "locale");
        while (this.f13517a.f13518b != null) {
            i();
        }
        e eVar2 = new e(this.f13519c, false);
        s sVar = s.f13530a;
        return new DateTimeFormatter(eVar2, locale, tVar, eVar);
    }
}
