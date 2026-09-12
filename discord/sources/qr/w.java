package qr;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class w extends xn.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public rn.b f19042d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a5.b0 f19043e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LinkedHashMap f19044i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f19045v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f19046w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ a5.b0 f19047x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f19048y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(a5.b0 b0Var, xn.a aVar) {
        super(aVar);
        this.f19047x = b0Var;
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        this.f19046w = obj;
        this.f19048y |= Integer.MIN_VALUE;
        return a5.b0.g(this.f19047x, null, this);
    }
}
