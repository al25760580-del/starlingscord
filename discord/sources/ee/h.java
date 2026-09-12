package ee;

import android.text.Layout;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CharSequence f8172c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f8170a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f8171b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8173d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f8174e = -3.4028235E38f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8175f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f8176g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f8177h = -3.4028235E38f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f8178i = Integer.MIN_VALUE;
    public float j = 1.0f;
    public int k = Integer.MIN_VALUE;

    /* JADX WARN: Code duplicated, block: B:20:0x0032  */
    /* JADX WARN: Code duplicated, block: B:21:0x0034  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    public final vd.b a() {
        Layout.Alignment alignment;
        float f2 = this.f8177h;
        float f7 = -3.4028235E38f;
        if (f2 == -3.4028235E38f) {
            int i7 = this.f8173d;
            if (i7 != 4) {
                f2 = i7 != 5 ? 0.5f : 1.0f;
            } else {
                f2 = 0.0f;
            }
        }
        int i10 = this.f8178i;
        if (i10 == Integer.MIN_VALUE) {
            int i11 = this.f8173d;
            if (i11 == 1) {
                i10 = 0;
            } else if (i11 == 3) {
                i10 = 2;
            } else if (i11 == 4) {
                i10 = 0;
            } else if (i11 != 5) {
                i10 = 1;
            } else {
                i10 = 2;
            }
        }
        vd.b bVar = new vd.b();
        int i12 = this.f8173d;
        if (i12 == 1) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i12 == 2) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else if (i12 == 3) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else if (i12 == 4) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i12 != 5) {
            com.discord.chat.presentation.list.a.q(i12, "Unknown textAlignment: ", "WebvttCueParser");
            alignment = null;
        } else {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        bVar.f21620c = alignment;
        float f10 = this.f8174e;
        int i13 = this.f8175f;
        if (f10 != -3.4028235E38f && i13 == 0 && (f10 < 0.0f || f10 > 1.0f)) {
            f7 = 1.0f;
        } else if (f10 != -3.4028235E38f) {
            f7 = f10;
        } else if (i13 == 0) {
            f7 = 1.0f;
        }
        bVar.f21622e = f7;
        bVar.f21623f = i13;
        bVar.f21624g = this.f8176g;
        bVar.f21625h = f2;
        bVar.f21626i = i10;
        float f11 = this.j;
        if (i10 == 0) {
            f2 = 1.0f - f2;
        } else if (i10 == 1) {
            f2 = f2 <= 0.5f ? f2 * 2.0f : (1.0f - f2) * 2.0f;
        } else if (i10 != 2) {
            throw new IllegalStateException(String.valueOf(i10));
        }
        bVar.f21627l = Math.min(f11, f2);
        bVar.f21631p = this.k;
        CharSequence charSequence = this.f8172c;
        if (charSequence != null) {
            bVar.f21618a = charSequence;
        }
        return bVar;
    }
}
