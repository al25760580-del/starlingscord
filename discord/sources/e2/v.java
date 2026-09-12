package e2;

import java.io.FileInputStream;

/* JADX INFO: loaded from: classes.dex */
public final class v extends xn.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public z f7922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public FileInputStream f7923e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f7924i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ z f7925v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f7926w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(z zVar, xn.c cVar) {
        super(cVar);
        this.f7925v = zVar;
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        this.f7924i = obj;
        this.f7926w |= Integer.MIN_VALUE;
        return this.f7925v.f(this);
    }
}
