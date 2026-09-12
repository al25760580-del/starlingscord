package sh;

import java.io.File;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f20105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v0 f20106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p0 f20107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final th.f f20108d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final th.f f20109e;

    public m1(s sVar, th.f fVar, v0 v0Var, th.f fVar2, p0 p0Var) {
        this.f20105a = sVar;
        this.f20108d = fVar;
        this.f20106b = v0Var;
        this.f20109e = fVar2;
        this.f20107c = p0Var;
    }

    public final void a(l1 l1Var) {
        String str = (String) l1Var.f10850b;
        int i7 = l1Var.f20092d;
        int i10 = l1Var.f10849a;
        int i11 = l1Var.f20091c;
        long j = l1Var.f20093e;
        s sVar = this.f20105a;
        File fileJ = sVar.j(i11, j, str);
        if (!fileJ.exists()) {
            throw new l0(a3.e.m("Cannot find pack files to promote for pack ", str, " at ", fileJ.getAbsolutePath()), i10);
        }
        File fileJ2 = sVar.j(i7, j, str);
        fileJ2.mkdirs();
        if (!fileJ.renameTo(fileJ2)) {
            String absolutePath = fileJ.getAbsolutePath();
            String absolutePath2 = fileJ2.getAbsolutePath();
            StringBuilder sbU = a3.e.u("Cannot promote pack ", str, " from ", absolutePath, " to ");
            sbU.append(absolutePath2);
            throw new l0(sbU.toString(), i10);
        }
        ((Executor) this.f20109e.a()).execute(new com.google.android.gms.internal.play_billing.u0(20, this, l1Var));
        v0 v0Var = this.f20106b;
        v0Var.getClass();
        v0Var.b(new d5.c(v0Var, str, i7, j));
        this.f20107c.b(str);
        ((v1) this.f20108d.a()).c(i10, str);
    }
}
