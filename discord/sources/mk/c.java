package mk;

import android.graphics.Paint;
import android.text.format.DateUtils;
import e4.p;
import fk.k;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import net.time4j.g1;
import net.time4j.k1;
import net.time4j.n1;
import yr.h;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f15865f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public HashMap f15866g;

    @Override // mk.e
    public final String a() {
        return ((SimpleDateFormat) DateFormat.getDateInstance(0, this.f15868a.f())).toLocalizedPattern().replaceAll(",", "").replaceAll("([a-zA-Z]+)", " $1").trim().replace("EEEE", "EEE").replace("MMMM", "MMM");
    }

    @Override // mk.e
    public final Paint.Align d() {
        return Paint.Align.RIGHT;
    }

    @Override // mk.e
    public final ArrayList f() {
        Calendar calendarH;
        Calendar calendarH2;
        Calendar calendar;
        ArrayList arrayList = new ArrayList();
        this.f15866g = new HashMap();
        p pVar = this.f15868a;
        Calendar calendarA = pVar.a((jk.a) pVar.f8026h);
        Calendar calendarA2 = pVar.a((jk.a) pVar.f8025g);
        if (calendarA2 != null) {
            calendarH = (Calendar) calendarA2.clone();
        } else if (calendarA != null) {
            calendarH = (Calendar) calendarA.clone();
            calendarH.add(5, (-calendarH.getActualMaximum(6)) / 2);
        } else {
            calendarH = pVar.h();
            calendarH.add(5, -75);
        }
        Calendar calendarA3 = pVar.a((jk.a) pVar.f8026h);
        Calendar calendarA4 = pVar.a((jk.a) pVar.f8025g);
        if (calendarA3 != null) {
            calendarH2 = (Calendar) calendarA3.clone();
        } else if (calendarA4 != null) {
            calendarH2 = (Calendar) calendarA4.clone();
            calendarH2.add(5, calendarH2.getActualMaximum(6) / 2);
        } else {
            calendarH2 = pVar.h();
            calendarH2.add(5, 75);
        }
        do {
            String str = this.f15872e.format(calendarH.getTime());
            arrayList.add(str);
            this.f15866g.put(str, new SimpleDateFormat(e4.f.z(((jk.b) pVar.f8022d).f13918b, k.f9278d), pVar.f()).format(calendarH.getTime()));
            if (DateUtils.isToday(calendarH.getTimeInMillis())) {
                this.f15865f = str;
            }
            calendarH.add(5, 1);
            calendar = (Calendar) calendarH.clone();
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
        } while (!calendar.after(calendarH2));
        return arrayList;
    }

    @Override // mk.e
    public final String g(String str) {
        if (!str.equals(this.f15865f)) {
            return (String) this.f15866g.get(str);
        }
        Locale localeF = this.f15868a.f();
        ConcurrentHashMap concurrentHashMap = g1.f16640c;
        g1 g1Var = (g1) concurrentHashMap.get(localeF);
        if (g1Var == null) {
            k1 k1Var = k1.f16657c;
            h hVar = g1.f16639b;
            hVar.c(localeF);
            hVar.a(localeF);
            g1Var = new g1(localeF, k1Var);
            g1 g1Var2 = (g1) concurrentHashMap.putIfAbsent(localeF, g1Var);
            if (g1Var2 != null) {
                g1Var = g1Var2;
            }
        }
        Locale locale = g1Var.f16641a;
        if (locale == null) {
            ConcurrentHashMap concurrentHashMap2 = n1.f16678b;
            throw new NullPointerException("Missing language.");
        }
        ConcurrentHashMap concurrentHashMap3 = n1.f16678b;
        n1 n1Var = (n1) concurrentHashMap3.get(locale);
        if (n1Var == null) {
            n1Var = new n1(locale);
            n1 n1Var2 = (n1) concurrentHashMap3.putIfAbsent(locale, n1Var);
            if (n1Var2 != null) {
                n1Var = n1Var2;
            }
        }
        String str2 = n1Var.f16682a;
        if (!Character.isUpperCase(str.charAt(0))) {
            return str2;
        }
        return str2.substring(0, 1).toUpperCase() + str2.substring(1);
    }

    @Override // mk.e
    public final boolean h() {
        return this.f15868a.g() == hk.b.f10924i;
    }

    @Override // mk.e
    public final boolean i() {
        return false;
    }
}
