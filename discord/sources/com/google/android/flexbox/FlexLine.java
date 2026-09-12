package com.google.android.flexbox;

import android.view.View;
import java.util.ArrayList;
import ne.b;

/* JADX INFO: loaded from: classes3.dex */
public final class FlexLine {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5857e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5858f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5859g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5860h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f5861i;
    public float j;
    public float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5862l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f5863m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f5865o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f5866p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f5867q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f5868r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5853a = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5854b = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5855c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5856d = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f5864n = new ArrayList();

    public final int a() {
        return this.f5860h - this.f5861i;
    }

    public final void b(View view, int i7, int i10, int i11, int i12) {
        b bVar = (b) view.getLayoutParams();
        this.f5853a = Math.min(this.f5853a, (view.getLeft() - bVar.k()) - i7);
        this.f5854b = Math.min(this.f5854b, (view.getTop() - bVar.l()) - i10);
        this.f5855c = Math.max(this.f5855c, bVar.p() + view.getRight() + i11);
        this.f5856d = Math.max(this.f5856d, bVar.j() + view.getBottom() + i12);
    }
}
