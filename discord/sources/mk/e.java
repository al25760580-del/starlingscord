package mk;

import android.graphics.Paint;
import e4.p;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f15868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Calendar f15869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f15870c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ik.e f15871d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SimpleDateFormat f15872e;

    public e(ik.e eVar, p pVar) {
        this.f15868a = pVar;
        this.f15871d = eVar;
        this.f15872e = new SimpleDateFormat(a(), pVar.f());
        eVar.setTextAlign(d());
        eVar.setWrapSelectorWheel(i());
    }

    public abstract String a();

    public final int b(Calendar calendar) {
        this.f15872e.setTimeZone(this.f15868a.l());
        return this.f15870c.indexOf(this.f15872e.format(calendar.getTime()));
    }

    public final String c(Calendar calendar) {
        return new SimpleDateFormat(a(), this.f15868a.f()).format(calendar.getTime());
    }

    public abstract Paint.Align d();

    public final String e() {
        if (!h()) {
            return this.f15872e.format(this.f15869b.getTime());
        }
        return (String) this.f15870c.get(this.f15871d.getValue());
    }

    public abstract ArrayList f();

    public abstract boolean h();

    public abstract boolean i();

    public String g(String str) {
        return str;
    }
}
