package v0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class d extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f21325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f21326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f21328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f21329e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f21330f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f21331g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f21332h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f21333i;
    public int j;
    public View k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f21334l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f21335m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f21336n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f21337o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Rect f21338p;

    public d(int i7, int i10) {
        super(i7, i10);
        this.f21326b = false;
        this.f21327c = 0;
        this.f21328d = 0;
        this.f21329e = -1;
        this.f21330f = -1;
        this.f21331g = 0;
        this.f21332h = 0;
        this.f21338p = new Rect();
    }

    public final boolean a(int i7) {
        if (i7 == 0) {
            return this.f21335m;
        }
        if (i7 != 1) {
            return false;
        }
        return this.f21336n;
    }

    public final void b(b bVar) {
        b bVar2 = this.f21325a;
        if (bVar2 != bVar) {
            if (bVar2 != null) {
                bVar2.f();
            }
            this.f21325a = bVar;
            this.f21326b = true;
            if (bVar != null) {
                bVar.c(this);
            }
        }
    }

    public d(Context context, AttributeSet attributeSet) {
        b bVar;
        super(context, attributeSet);
        this.f21326b = false;
        this.f21327c = 0;
        this.f21328d = 0;
        this.f21329e = -1;
        this.f21330f = -1;
        this.f21331g = 0;
        this.f21332h = 0;
        this.f21338p = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u0.a.f20908b);
        this.f21327c = typedArrayObtainStyledAttributes.getInteger(0, 0);
        this.f21330f = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        this.f21328d = typedArrayObtainStyledAttributes.getInteger(2, 0);
        this.f21329e = typedArrayObtainStyledAttributes.getInteger(6, -1);
        this.f21331g = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.f21332h = typedArrayObtainStyledAttributes.getInt(4, 0);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
        this.f21326b = zHasValue;
        if (zHasValue) {
            String string = typedArrayObtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.P;
            if (TextUtils.isEmpty(string)) {
                bVar = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.P;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.R;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.Q);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    bVar = (b) constructor.newInstance(context, attributeSet);
                } catch (Exception e10) {
                    throw new RuntimeException(a3.e.l("Could not inflate Behavior subclass ", string), e10);
                }
            }
            this.f21325a = bVar;
        }
        typedArrayObtainStyledAttributes.recycle();
        b bVar2 = this.f21325a;
        if (bVar2 != null) {
            bVar2.c(this);
        }
    }

    public d(d dVar) {
        super((ViewGroup.MarginLayoutParams) dVar);
        this.f21326b = false;
        this.f21327c = 0;
        this.f21328d = 0;
        this.f21329e = -1;
        this.f21330f = -1;
        this.f21331g = 0;
        this.f21332h = 0;
        this.f21338p = new Rect();
    }

    public d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f21326b = false;
        this.f21327c = 0;
        this.f21328d = 0;
        this.f21329e = -1;
        this.f21330f = -1;
        this.f21331g = 0;
        this.f21332h = 0;
        this.f21338p = new Rect();
    }

    public d(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f21326b = false;
        this.f21327c = 0;
        this.f21328d = 0;
        this.f21329e = -1;
        this.f21330f = -1;
        this.f21331g = 0;
        this.f21332h = 0;
        this.f21338p = new Rect();
    }
}
