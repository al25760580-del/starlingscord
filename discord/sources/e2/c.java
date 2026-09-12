package e2;

import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class c extends xn.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Serializable f7857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Iterator f7858e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f7859i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f7860v;

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        this.f7859i = obj;
        this.f7860v |= Integer.MIN_VALUE;
        return zs.a.b(null, null, this);
    }
}
