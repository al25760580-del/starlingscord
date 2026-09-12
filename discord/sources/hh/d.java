package hh;

import a1.n;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import e4.f;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorStateList f10753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10756d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10757e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f10758f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f10759g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f10760h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f10761i;
    public final float j;
    public final ColorStateList k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f10762l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f10763m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f10764n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f10765o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Typeface f10766p;

    public d(Context context, int i7) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i7, h.a.f10274x);
        this.f10762l = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        this.k = com.facebook.imagepipeline.nativecode.c.t(context, typedArrayObtainStyledAttributes, 3);
        com.facebook.imagepipeline.nativecode.c.t(context, typedArrayObtainStyledAttributes, 4);
        com.facebook.imagepipeline.nativecode.c.t(context, typedArrayObtainStyledAttributes, 5);
        this.f10756d = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.f10757e = typedArrayObtainStyledAttributes.getInt(1, 1);
        int i10 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f10763m = typedArrayObtainStyledAttributes.getResourceId(i10, 0);
        this.f10754b = typedArrayObtainStyledAttributes.getString(i10);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.f10753a = com.facebook.imagepipeline.nativecode.c.t(context, typedArrayObtainStyledAttributes, 6);
        this.f10758f = typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
        this.f10759g = typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
        this.f10760h = typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i7, kg.a.A);
        this.f10761i = typedArrayObtainStyledAttributes2.hasValue(0);
        this.j = typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
        if (Build.VERSION.SDK_INT >= 26) {
            this.f10755c = typedArrayObtainStyledAttributes2.getString(typedArrayObtainStyledAttributes2.hasValue(3) ? 3 : 1);
        }
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f10766p;
        int i7 = this.f10756d;
        if (typeface == null && (str = this.f10754b) != null) {
            this.f10766p = Typeface.create(str, i7);
        }
        if (this.f10766p == null) {
            int i10 = this.f10757e;
            if (i10 == 1) {
                this.f10766p = Typeface.SANS_SERIF;
            } else if (i10 == 2) {
                this.f10766p = Typeface.SERIF;
            } else if (i10 != 3) {
                this.f10766p = Typeface.DEFAULT;
            } else {
                this.f10766p = Typeface.MONOSPACE;
            }
            this.f10766p = Typeface.create(this.f10766p, i7);
        }
    }

    public final void b(Context context, f fVar) {
        if (!c(context)) {
            a();
        }
        int i7 = this.f10763m;
        if (i7 == 0) {
            this.f10764n = true;
        }
        if (this.f10764n) {
            fVar.n0(this.f10766p, true);
            return;
        }
        try {
            b bVar = new b(this, fVar);
            ThreadLocal threadLocal = n.f42a;
            if (context.isRestricted()) {
                bVar.a(-4);
            } else {
                n.a(context, i7, new TypedValue(), 0, bVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f10764n = true;
            fVar.m0(1);
        } catch (Exception e10) {
            Log.d("TextAppearance", "Error loading font " + this.f10754b, e10);
            this.f10764n = true;
            fVar.m0(-3);
        }
    }

    public final boolean c(Context context) {
        Context context2;
        Typeface typefaceA;
        String string;
        Typeface typefaceCreate;
        if (this.f10764n) {
            return true;
        }
        int i7 = this.f10763m;
        if (i7 != 0) {
            ThreadLocal threadLocal = n.f42a;
            Typeface typefaceCreate2 = null;
            if (context.isRestricted()) {
                context2 = context;
                typefaceA = null;
            } else {
                context2 = context;
                typefaceA = n.a(context2, i7, new TypedValue(), 0, null, false, true);
            }
            if (typefaceA != null) {
                this.f10766p = typefaceA;
                this.f10764n = true;
                return true;
            }
            if (!this.f10765o) {
                this.f10765o = true;
                Resources resources = context2.getResources();
                int i10 = this.f10763m;
                if (i10 == 0 || !resources.getResourceTypeName(i10).equals("font")) {
                    string = null;
                    break;
                }
                try {
                    XmlResourceParser xml = resources.getXml(i10);
                    while (true) {
                        if (xml.getEventType() == 1) {
                            string = null;
                            break;
                        }
                        if (xml.getEventType() == 2 && xml.getName().equals("font-family")) {
                            TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), w0.a.f21975b);
                            string = typedArrayObtainAttributes.getString(7);
                            typedArrayObtainAttributes.recycle();
                            break;
                        }
                        xml.next();
                        string = null;
                        break;
                    }
                } catch (Throwable unused) {
                }
                if (string != null && (typefaceCreate = Typeface.create(string, 0)) != Typeface.DEFAULT) {
                    typefaceCreate2 = Typeface.create(typefaceCreate, this.f10756d);
                }
            }
            if (typefaceCreate2 != null) {
                this.f10766p = typefaceCreate2;
                this.f10764n = true;
                return true;
            }
        }
        return false;
    }

    public final void d(Context context, TextPaint textPaint, f fVar) {
        e(context, textPaint, fVar);
        ColorStateList colorStateList = this.k;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f10753a;
        textPaint.setShadowLayer(this.f10760h, this.f10758f, this.f10759g, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void e(Context context, TextPaint textPaint, f fVar) {
        Typeface typeface;
        if (c(context) && this.f10764n && (typeface = this.f10766p) != null) {
            f(context, textPaint, typeface);
            return;
        }
        a();
        f(context, textPaint, this.f10766p);
        b(context, new c(this, context, textPaint, fVar));
    }

    public final void f(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceA = e.a(context.getResources().getConfiguration(), typeface);
        if (typefaceA != null) {
            typeface = typefaceA;
        }
        textPaint.setTypeface(typeface);
        int i7 = (~typeface.getStyle()) & this.f10756d;
        textPaint.setFakeBoldText((i7 & 1) != 0);
        textPaint.setTextSkewX((i7 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f10762l);
        if (Build.VERSION.SDK_INT >= 26) {
            textPaint.setFontVariationSettings(this.f10755c);
        }
        if (this.f10761i) {
            textPaint.setLetterSpacing(this.j);
        }
    }
}
