package oj;

import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import e4.e;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f17261h = new a(4201, RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT, 1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f17262i = new a(1033, IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET, 1);
    public static final a j;
    public static final a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f17263l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f17264m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f17265n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f17266o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f17267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f17268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f17269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f17270d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f17271e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f17272f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f17273g;

    static {
        a aVar = new a(67, 64, 1);
        j = aVar;
        k = new a(19, 16, 1);
        f17263l = new a(285, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, 0);
        a aVar2 = new a(301, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, 1);
        f17264m = aVar2;
        f17265n = aVar2;
        f17266o = aVar;
    }

    public a(int i7, int i10, int i11) {
        this.f17272f = i7;
        this.f17271e = i10;
        this.f17273g = i11;
        this.f17267a = new int[i10];
        this.f17268b = new int[i10];
        int i12 = 1;
        for (int i13 = 0; i13 < i10; i13++) {
            this.f17267a[i13] = i12;
            i12 <<= 1;
            if (i12 >= i10) {
                i12 = (i12 ^ i7) & (i10 - 1);
            }
        }
        for (int i14 = 0; i14 < i10 - 1; i14++) {
            this.f17268b[this.f17267a[i14]] = i14;
        }
        this.f17269c = new e(this, new int[]{0});
        this.f17270d = new e(this, new int[]{1});
    }

    public final int a(int i7) {
        if (i7 == 0) {
            throw new ArithmeticException();
        }
        return this.f17267a[(this.f17271e - this.f17268b[i7]) - 1];
    }

    public final int b(int i7, int i10) {
        if (i7 == 0 || i10 == 0) {
            return 0;
        }
        int[] iArr = this.f17268b;
        return this.f17267a[(iArr[i7] + iArr[i10]) % (this.f17271e - 1)];
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GF(0x");
        sb2.append(Integer.toHexString(this.f17272f));
        sb2.append(',');
        return com.discord.chat.presentation.list.a.j(sb2, this.f17271e, ')');
    }
}
