package wd;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f22126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f22127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StringBuilder f22128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22129d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22130e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f22131f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f22132g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f22133h;

    public b(int i7, int i10) {
        ArrayList arrayList = new ArrayList();
        this.f22126a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f22127b = arrayList2;
        StringBuilder sb2 = new StringBuilder();
        this.f22128c = sb2;
        this.f22132g = i7;
        arrayList.clear();
        arrayList2.clear();
        sb2.setLength(0);
        this.f22129d = 15;
        this.f22130e = 0;
        this.f22131f = 0;
        this.f22133h = i10;
    }

    public final void a(char c8) {
        StringBuilder sb2 = this.f22128c;
        if (sb2.length() < 32) {
            sb2.append(c8);
        }
    }

    public final void b() {
        StringBuilder sb2 = this.f22128c;
        int length = sb2.length();
        if (length > 0) {
            sb2.delete(length - 1, length);
            ArrayList arrayList = this.f22126a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                a aVar = (a) arrayList.get(size);
                int i7 = aVar.f22125c;
                if (i7 != length) {
                    return;
                }
                aVar.f22125c = i7 - 1;
            }
        }
    }

    public final vd.c c(int i7) {
        int i10;
        float f2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f22127b;
            if (i11 >= arrayList.size()) {
                break;
            }
            spannableStringBuilder.append((CharSequence) arrayList.get(i11));
            spannableStringBuilder.append('\n');
            i11++;
        }
        spannableStringBuilder.append((CharSequence) d());
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int i12 = this.f22130e + this.f22131f;
        int length = (32 - i12) - spannableStringBuilder.length();
        int i13 = i12 - length;
        if (i7 != Integer.MIN_VALUE) {
            i10 = i7;
        } else if (this.f22132g != 2 || (Math.abs(i13) >= 3 && length >= 0)) {
            i10 = (this.f22132g != 2 || i13 <= 0) ? 0 : 2;
        } else {
            i10 = 1;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                i12 = 32 - length;
            }
            f2 = ((i12 / 32.0f) * 0.8f) + 0.1f;
        } else {
            f2 = 0.5f;
        }
        float f7 = f2;
        int i14 = this.f22129d;
        if (i14 > 7) {
            i14 -= 17;
        } else if (this.f22132g == 1) {
            i14 -= this.f22133h - 1;
        }
        return new vd.c(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, null, null, i14, 1, Integer.MIN_VALUE, f7, i10, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
    }

    public final SpannableString d() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f22128c);
        int length = spannableStringBuilder.length();
        int i7 = -1;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = 0;
        int i14 = 0;
        boolean z5 = false;
        while (true) {
            ArrayList arrayList = this.f22126a;
            if (i13 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i13);
            boolean z6 = aVar.f22124b;
            int i15 = aVar.f22123a;
            if (i15 != 8) {
                boolean z7 = i15 == 7;
                if (i15 != 7) {
                    i12 = c.A[i15];
                }
                z5 = z7;
            }
            int i16 = aVar.f22125c;
            i13++;
            if (i16 != (i13 < arrayList.size() ? ((a) arrayList.get(i13)).f22125c : length)) {
                if (i7 != -1 && !z6) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i7, i16, 33);
                    i7 = -1;
                } else if (i7 == -1 && z6) {
                    i7 = i16;
                }
                if (i10 != -1 && !z5) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i10, i16, 33);
                    i10 = -1;
                } else if (i10 == -1 && z5) {
                    i10 = i16;
                }
                if (i12 != i11) {
                    if (i11 != -1) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(i11), i14, i16, 33);
                    }
                    i11 = i12;
                    i14 = i16;
                }
            }
        }
        if (i7 != -1 && i7 != length) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i7, length, 33);
        }
        if (i10 != -1 && i10 != length) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i10, length, 33);
        }
        if (i14 != length && i11 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i11), i14, length, 33);
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final boolean e() {
        return this.f22126a.isEmpty() && this.f22127b.isEmpty() && this.f22128c.length() == 0;
    }
}
