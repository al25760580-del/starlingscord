package androidx.fragment.app;

import androidx.lifecycle.Lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Fragment f2185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2186c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2187d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2188e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2189f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2190g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Lifecycle.State f2191h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Lifecycle.State f2192i;

    public l1(Fragment fragment, int i7) {
        this.f2184a = i7;
        this.f2185b = fragment;
        Lifecycle.State state = Lifecycle.State.f2299w;
        this.f2191h = state;
        this.f2192i = state;
    }

    public l1(int i7, Fragment fragment, int i10) {
        this.f2184a = i7;
        this.f2185b = fragment;
        Lifecycle.State state = Lifecycle.State.f2299w;
        this.f2191h = state;
        this.f2192i = state;
    }
}
