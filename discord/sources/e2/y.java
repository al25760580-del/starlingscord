package e2;

import java.io.File;
import java.io.FileOutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class y extends xn.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public z f7938d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public File f7939e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public FileOutputStream f7940i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public FileOutputStream f7941v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f7942w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ z f7943x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f7944y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, xn.c cVar) {
        super(cVar);
        this.f7943x = zVar;
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        this.f7942w = obj;
        this.f7944y |= Integer.MIN_VALUE;
        return this.f7943x.i(null, this);
    }
}
