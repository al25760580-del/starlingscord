package gc;

import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class u0 {
    public Integer A;
    public Integer B;
    public CharSequence C;
    public CharSequence D;
    public CharSequence E;
    public Integer F;
    public Bundle G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f9862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CharSequence f9863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CharSequence f9864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CharSequence f9865d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f9866e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f9867f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public CharSequence f9868g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public o1 f9869h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public o1 f9870i;
    public byte[] j;
    public Integer k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Uri f9871l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Integer f9872m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Integer f9873n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Integer f9874o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Boolean f9875p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Boolean f9876q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Integer f9877r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Integer f9878s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Integer f9879t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Integer f9880u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Integer f9881v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Integer f9882w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public CharSequence f9883x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public CharSequence f9884y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public CharSequence f9885z;

    public final void a(byte[] bArr, int i7) {
        if (this.j != null) {
            Integer numValueOf = Integer.valueOf(i7);
            int i10 = je.e0.f13788a;
            if (!numValueOf.equals(3) && je.e0.a(this.k, 3)) {
                return;
            }
        }
        this.j = (byte[]) bArr.clone();
        this.k = Integer.valueOf(i7);
    }
}
