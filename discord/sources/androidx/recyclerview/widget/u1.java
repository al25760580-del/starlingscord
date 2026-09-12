package androidx.recyclerview.widget;

import androidx.core.util.Pools$SimplePool;

/* JADX INFO: loaded from: classes.dex */
public final class u1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pools$SimplePool f2708d = new Pools$SimplePool(20);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView.ItemAnimator.ItemHolderInfo f2710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RecyclerView.ItemAnimator.ItemHolderInfo f2711c;

    public static u1 a() {
        u1 u1Var = (u1) f2708d.acquire();
        return u1Var == null ? new u1() : u1Var;
    }
}
