package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import n.l;
import n.m;
import n.q;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public CharSequence A;
    public CharSequence B;
    public final /* synthetic */ e E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Menu f15304a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f15311h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f15312i;
    public int j;
    public CharSequence k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CharSequence f15313l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f15314m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public char f15315n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f15316o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public char f15317p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f15318q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f15319r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f15320s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f15321t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f15322u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f15323v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f15324w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f15325x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f15326y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public m f15327z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15305b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15306c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15307d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15308e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15309f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f15310g = true;

    public d(e eVar, Menu menu) {
        this.E = eVar;
        this.f15304a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.f15332c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e10) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        e eVar = this.E;
        Context context = eVar.f15332c;
        boolean z5 = false;
        menuItem.setChecked(this.f15320s).setVisible(this.f15321t).setEnabled(this.f15322u).setCheckable(this.f15319r >= 1).setTitleCondensed(this.f15313l).setIcon(this.f15314m);
        int i7 = this.f15323v;
        if (i7 >= 0) {
            menuItem.setShowAsAction(i7);
        }
        if (this.f15326y != null) {
            if (context.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (eVar.f15333d == null) {
                eVar.f15333d = e.a(context);
            }
            Object obj = eVar.f15333d;
            String str = this.f15326y;
            c cVar = new c();
            cVar.f15302a = obj;
            Class<?> cls = obj.getClass();
            try {
                cVar.f15303b = cls.getMethod(str, c.f15301c);
                menuItem.setOnMenuItemClickListener(cVar);
            } catch (Exception e10) {
                StringBuilder sbN = com.discord.chat.presentation.list.a.n("Couldn't resolve menu item onClick handler ", str, " in class ");
                sbN.append(cls.getName());
                InflateException inflateException = new InflateException(sbN.toString());
                inflateException.initCause(e10);
                throw inflateException;
            }
        }
        if (this.f15319r >= 2) {
            if (menuItem instanceof l) {
                l lVar = (l) menuItem;
                lVar.f16188x = (lVar.f16188x & (-5)) | 4;
            } else if (menuItem instanceof q) {
                q qVar = (q) menuItem;
                d1.a aVar = qVar.f16198c;
                try {
                    if (qVar.f16199d == null) {
                        qVar.f16199d = aVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    qVar.f16199d.invoke(aVar, Boolean.TRUE);
                } catch (Exception e11) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e11);
                }
            }
        }
        String str2 = this.f15325x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, e.f15328e, eVar.f15330a));
            z5 = true;
        }
        int i10 = this.f15324w;
        if (i10 > 0) {
            if (z5) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i10);
            }
        }
        m mVar = this.f15327z;
        if (mVar != null) {
            if (menuItem instanceof d1.a) {
                ((d1.a) menuItem).b(mVar);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.A;
        boolean z6 = menuItem instanceof d1.a;
        if (z6) {
            ((d1.a) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            hf.a.k(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z6) {
            ((d1.a) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            hf.a.p(menuItem, charSequence2);
        }
        char c8 = this.f15315n;
        int i11 = this.f15316o;
        if (z6) {
            ((d1.a) menuItem).setAlphabeticShortcut(c8, i11);
        } else if (Build.VERSION.SDK_INT >= 26) {
            hf.a.j(menuItem, c8, i11);
        }
        char c10 = this.f15317p;
        int i12 = this.f15318q;
        if (z6) {
            ((d1.a) menuItem).setNumericShortcut(c10, i12);
        } else if (Build.VERSION.SDK_INT >= 26) {
            hf.a.o(menuItem, c10, i12);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z6) {
                ((d1.a) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                hf.a.n(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z6) {
                ((d1.a) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                hf.a.m(menuItem, colorStateList);
            }
        }
    }
}
