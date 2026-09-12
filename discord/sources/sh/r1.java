package sh;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r1 implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f20167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s1 f20168e;

    public /* synthetic */ r1(s1 s1Var, int i7) {
        this.f20167d = i7;
        this.f20168e = s1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20167d) {
            case 0:
                s1 s1Var = this.f20168e;
                v1 v1Var = (v1) s1Var.f20185i.a();
                s sVar = s1Var.f20177a;
                ig.l lVarG = v1Var.g(sVar.o());
                th.f fVar = s1Var.j;
                lVarG.e((Executor) fVar.a(), new po.d(3, sVar));
                lVarG.c((Executor) fVar.a(), new k8.a());
                break;
            default:
                s sVar2 = this.f20168e.f20177a;
                Iterator it = sVar2.e().iterator();
                while (true) {
                    int i7 = 0;
                    if (!it.hasNext()) {
                        for (File file : sVar2.e()) {
                            if (file.listFiles() != null) {
                                s.f(file);
                                long jB = s.b(file, false);
                                if (sVar2.f20173b.a() != jB) {
                                    try {
                                        new File(new File(file, String.valueOf(jB)), "stale.tmp").createNewFile();
                                    } catch (IOException unused) {
                                        s.f20169c.b("Could not write staleness marker.", new Object[0]);
                                    }
                                }
                                for (File file2 : file.listFiles()) {
                                    s.f(file2);
                                }
                                break;
                            }
                        }
                        if (new File(sVar2.d(), "_tmp").exists()) {
                            File[] fileArrListFiles = new File(sVar2.d(), "_tmp").listFiles();
                            int length = fileArrListFiles.length;
                            while (i7 < length) {
                                File file3 = fileArrListFiles[i7];
                                if (System.currentTimeMillis() - file3.lastModified() > s.f20170d) {
                                    s.g(file3);
                                } else {
                                    s.f(file3);
                                }
                                i7++;
                            }
                            break;
                        }
                    } else {
                        File file4 = (File) it.next();
                        if (file4.listFiles() != null) {
                            File[] fileArrListFiles2 = file4.listFiles();
                            int length2 = fileArrListFiles2.length;
                            while (i7 < length2) {
                                File file5 = fileArrListFiles2[i7];
                                File file6 = new File(file5, "stale.tmp");
                                if (file6.exists() && System.currentTimeMillis() - file6.lastModified() > s.f20171e) {
                                    s.g(file5);
                                }
                                i7++;
                            }
                        }
                    }
                }
                break;
        }
    }
}
