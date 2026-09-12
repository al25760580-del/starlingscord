package wd;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class e {
    public static final int[] A;
    public static final boolean[] B;
    public static final int[] C;
    public static final int[] D;
    public static final int[] E;
    public static final int[] F;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f22155w = c(2, 2, 2, 0);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f22156x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f22157y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f22158z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f22159a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SpannableStringBuilder f22160b = new SpannableStringBuilder();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f22161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f22162d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22163e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f22164f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f22165g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f22166h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f22167i;
    public int j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f22168l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f22169m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f22170n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f22171o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f22172p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f22173q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f22174r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f22175s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f22176t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f22177u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f22178v;

    static {
        int iC = c(0, 0, 0, 0);
        f22156x = iC;
        int iC2 = c(0, 0, 0, 3);
        f22157y = new int[]{0, 0, 0, 0, 0, 2, 0};
        f22158z = new int[]{0, 0, 0, 0, 0, 0, 2};
        A = new int[]{3, 3, 3, 3, 3, 3, 1};
        B = new boolean[]{false, false, false, true, true, true, false};
        C = new int[]{iC, iC2, iC, iC, iC2, iC, iC};
        D = new int[]{0, 1, 2, 3, 4, 3, 4};
        E = new int[]{0, 0, 0, 0, 0, 3, 3};
        F = new int[]{iC, iC, iC, iC, iC, iC2, iC2};
    }

    public e() {
        d();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    public static int c(int i7, int i10, int i11, int i12) {
        int i13;
        je.b.j(i7, 4);
        je.b.j(i10, 4);
        je.b.j(i11, 4);
        je.b.j(i12, 4);
        if (i12 == 0 || i12 == 1) {
            i13 = 255;
        } else if (i12 == 2) {
            i13 = 127;
        } else if (i12 != 3) {
            i13 = 255;
        } else {
            i13 = 0;
        }
        return Color.argb(i13, i7 > 1 ? 255 : 0, i10 > 1 ? 255 : 0, i11 <= 1 ? 0 : 255);
    }

    public final void a(char c8) {
        SpannableStringBuilder spannableStringBuilder = this.f22160b;
        if (c8 != '\n') {
            spannableStringBuilder.append(c8);
            return;
        }
        SpannableString spannableStringB = b();
        ArrayList arrayList = this.f22159a;
        arrayList.add(spannableStringB);
        spannableStringBuilder.clear();
        if (this.f22172p != -1) {
            this.f22172p = 0;
        }
        if (this.f22173q != -1) {
            this.f22173q = 0;
        }
        if (this.f22174r != -1) {
            this.f22174r = 0;
        }
        if (this.f22176t != -1) {
            this.f22176t = 0;
        }
        while (true) {
            if ((!this.k || arrayList.size() < this.j) && arrayList.size() < 15) {
                return;
            } else {
                arrayList.remove(0);
            }
        }
    }

    public final SpannableString b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f22160b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f22172p != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f22172p, length, 33);
            }
            if (this.f22173q != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f22173q, length, 33);
            }
            if (this.f22174r != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f22175s), this.f22174r, length, 33);
            }
            if (this.f22176t != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f22177u), this.f22176t, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void d() {
        this.f22159a.clear();
        this.f22160b.clear();
        this.f22172p = -1;
        this.f22173q = -1;
        this.f22174r = -1;
        this.f22176t = -1;
        this.f22178v = 0;
        this.f22161c = false;
        this.f22162d = false;
        this.f22163e = 4;
        this.f22164f = false;
        this.f22165g = 0;
        this.f22166h = 0;
        this.f22167i = 0;
        this.j = 15;
        this.k = true;
        this.f22168l = 0;
        this.f22169m = 0;
        this.f22170n = 0;
        int i7 = f22156x;
        this.f22171o = i7;
        this.f22175s = f22155w;
        this.f22177u = i7;
    }

    public final void e(boolean z5, boolean z6) {
        int i7 = this.f22172p;
        SpannableStringBuilder spannableStringBuilder = this.f22160b;
        if (i7 != -1) {
            if (!z5) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f22172p, spannableStringBuilder.length(), 33);
                this.f22172p = -1;
            }
        } else if (z5) {
            this.f22172p = spannableStringBuilder.length();
        }
        if (this.f22173q == -1) {
            if (z6) {
                this.f22173q = spannableStringBuilder.length();
            }
        } else {
            if (z6) {
                return;
            }
            spannableStringBuilder.setSpan(new UnderlineSpan(), this.f22173q, spannableStringBuilder.length(), 33);
            this.f22173q = -1;
        }
    }

    public final void f(int i7, int i10) {
        int i11 = this.f22174r;
        SpannableStringBuilder spannableStringBuilder = this.f22160b;
        if (i11 != -1 && this.f22175s != i7) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f22175s), this.f22174r, spannableStringBuilder.length(), 33);
        }
        if (i7 != f22155w) {
            this.f22174r = spannableStringBuilder.length();
            this.f22175s = i7;
        }
        if (this.f22176t != -1 && this.f22177u != i10) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f22177u), this.f22176t, spannableStringBuilder.length(), 33);
        }
        if (i10 != f22156x) {
            this.f22176t = spannableStringBuilder.length();
            this.f22177u = i10;
        }
    }
}
