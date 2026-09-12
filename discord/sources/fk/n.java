package fk;

import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.discord.R;
import com.henninghall.date_picker.pickers.AndroidNative;
import e4.p;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends RelativeLayout {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e4.m f9284d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p f9285e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList f9286i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final a3.h f9287v;

    public n(LinearLayout.LayoutParams layoutParams) {
        super(com.mkuczera.haptic.d.f7010b);
        p pVar = new p();
        this.f9285e = pVar;
        this.f9286i = new ArrayList();
        this.f9287v = new a3.h(13, this);
        LinearLayout linearLayout = new LinearLayout(getContext());
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        ((ga.l) pVar.f8030n).getClass();
        layoutInflaterFrom.inflate(R.layout.native_picker, linearLayout);
        addView(linearLayout, layoutParams);
        this.f9284d = new e4.m(pVar, this);
    }

    public final boolean a(String... strArr) {
        for (String str : strArr) {
            if (this.f9286i.contains(str)) {
                return true;
            }
        }
        return false;
    }

    public final void b() {
        boolean zA = a("textColor");
        e4.m mVar = this.f9284d;
        if (zA) {
            kk.c cVar = (kk.c) mVar.f7994i;
            String str = (String) ((jk.a) ((p) mVar.f7993e).f8023e).f13919a;
            Iterator it = cVar.a().iterator();
            while (it.hasNext()) {
                ((mk.e) it.next()).f15871d.setTextColor(str);
            }
        }
        if (a("mode", "is24hourSource")) {
            for (mk.e eVar : ((kk.c) mVar.f7994i).a()) {
                eVar.f15871d.setVisibility(eVar.h() ? 0 : 8);
            }
        }
        if (a("mode", "locale", "is24hourSource")) {
            kk.c cVar2 = (kk.c) mVar.f7994i;
            fj.c cVar3 = cVar2.j;
            ((LinearLayout) cVar3.f9267e).removeAllViews();
            Iterator it2 = ((ga.l) cVar2.f14557a.f8030n).l().iterator();
            while (it2.hasNext()) {
                ((LinearLayout) cVar3.f9267e).addView(((mk.e) cVar2.k.get((hk.c) it2.next())).f15871d.getView());
            }
        }
        if (a("date", "locale", "maximumDate", "minimumDate", "minuteInterval", "mode", "timezoneOffsetInMinutes")) {
            for (mk.e eVar2 : ((kk.c) mVar.f7994i).a()) {
                eVar2.getClass();
                eVar2.f15872e = new SimpleDateFormat(eVar2.a(), eVar2.f15868a.f());
                if (eVar2.h()) {
                    ik.e eVar3 = eVar2.f15871d;
                    eVar3.setMinValue(0);
                    eVar3.setMaxValue(0);
                    ArrayList arrayListF = eVar2.f();
                    eVar2.f15870c = arrayListF;
                    ArrayList arrayList = new ArrayList();
                    Iterator it3 = arrayListF.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(eVar2.g((String) it3.next()));
                    }
                    eVar3.setDisplayedValues((String[]) arrayList.toArray(new String[0]));
                    eVar3.setMaxValue(eVar2.f15870c.size() - 1);
                }
            }
        }
        boolean zA2 = a("locale");
        p pVar = this.f9285e;
        if (zA2) {
            pVar.f();
            int i7 = kk.a.f14556a;
        }
        if (a("dividerColor")) {
            String str2 = (String) ((jk.a) pVar.f8028l).f13919a;
            Iterator it4 = ((kk.c) mVar.f7994i).a().iterator();
            while (it4.hasNext()) {
                ((mk.e) it4.next()).f15871d.setDividerColor(str2);
            }
        }
        kk.c cVar4 = (kk.c) mVar.f7994i;
        Calendar calendarH = ((p) mVar.f7993e).h();
        for (mk.e eVar4 : cVar4.a()) {
            ik.e eVar5 = eVar4.f15871d;
            eVar4.f15872e.setTimeZone(eVar4.f15868a.l());
            eVar4.f15869b = calendarH;
            int iB = eVar4.b(calendarH);
            if (iB > -1) {
                if (eVar5.getValue() == 0) {
                    eVar5.setValue(iB);
                } else {
                    ((AndroidNative) eVar5).t(iB);
                }
            }
        }
        this.f9286i = new ArrayList();
    }

    public String getDate() {
        p pVar = (p) ((ga.l) this.f9285e.f8030n).f9547e;
        Calendar calendar = (Calendar) pVar.f8019a;
        String str = (String) ((jk.a) pVar.f8020b).f13919a;
        if (calendar == null) {
            return str;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(calendar.getTime());
    }

    public String getPickerId() {
        return (String) ((jk.a) this.f9285e.k).f13919a;
    }

    @Override // android.widget.RelativeLayout, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        super.requestLayout();
        post(this.f9287v);
    }
}
