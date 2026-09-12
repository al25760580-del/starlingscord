package sh;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f20012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v0 f20013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p0 f20014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g1 f20015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final th.f f20016e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final th.f f20017f;

    public d1(s sVar, th.f fVar, v0 v0Var, th.f fVar2, p0 p0Var, g1 g1Var) {
        this.f20012a = sVar;
        this.f20016e = fVar;
        this.f20013b = v0Var;
        this.f20017f = fVar2;
        this.f20014c = p0Var;
        this.f20015d = g1Var;
    }

    public final void a(c1 c1Var) {
        String str = (String) c1Var.f10850b;
        int i7 = c1Var.f10849a;
        int i10 = c1Var.f19995c;
        long j = c1Var.f19996d;
        s sVar = this.f20012a;
        sVar.getClass();
        File file = new File(sVar.c(i10, j, str), "_packs");
        File file2 = new File(new File(sVar.c(i10, j, str), "_slices"), "_metadata");
        if (!file.exists() || !file2.exists()) {
            throw new l0(s0.g.e("Cannot find pack files to move for pack ", str, "."), i7);
        }
        File fileJ = sVar.j(i10, j, str);
        fileJ.mkdirs();
        if (!file.renameTo(fileJ)) {
            throw new l0("Cannot move merged pack files to final location.", i7);
        }
        new File(sVar.j(i10, j, str), "merge.tmp").delete();
        File file3 = new File(sVar.j(i10, j, str), "_metadata");
        file3.mkdirs();
        if (!file2.renameTo(file3)) {
            throw new l0("Cannot move metadata files to final location.", i7);
        }
        try {
            this.f20015d.b(c1Var.f19995c, (String) c1Var.f10850b, c1Var.f19996d, c1Var.f19997e);
            ((Executor) this.f20017f.a()).execute(new hi.o(19, this, c1Var));
            v0 v0Var = this.f20013b;
            v0Var.getClass();
            v0Var.b(new d5.c(v0Var, str, i10, j));
            this.f20014c.b(str);
            ((v1) this.f20016e.a()).c(i7, str);
        } catch (IOException e10) {
            throw new l0(a3.e.m("Could not write asset pack version tag for pack ", str, ": ", e10.getMessage()), i7);
        }
    }
}
