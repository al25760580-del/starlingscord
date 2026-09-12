package j0;

import android.view.Choreographer;
import ar.k;
import kotlin.Result;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import rn.q;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f13590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Lambda f13591e;

    /* JADX WARN: Multi-variable type inference failed */
    public e(k kVar, f fVar, Function1 function1) {
        this.f13590d = kVar;
        this.f13591e = (Lambda) function1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object objO;
        ?? r5 = this.f13591e;
        try {
            q qVar = Result.f14614e;
            objO = r5.invoke(Long.valueOf(j));
        } catch (Throwable th2) {
            q qVar2 = Result.f14614e;
            objO = ib.a.o(th2);
        }
        this.f13590d.resumeWith(objO);
    }
}
