package sh;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class k1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a5.o f20086c = new a5.o("PatchSliceTaskHandler", 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f20087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final th.f f20088b;

    public k1(s sVar, th.f fVar) {
        this.f20087a = sVar;
        this.f20088b = fVar;
    }

    public final void a(j1 j1Var) {
        a5.o oVar = f20086c;
        String str = (String) j1Var.f10850b;
        int i7 = j1Var.f10849a;
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = j1Var.j;
        int i10 = j1Var.f20073c;
        long j = j1Var.f20074d;
        s sVar = this.f20087a;
        File fileJ = sVar.j(i10, j, str);
        File file = new File(sVar.j(i10, j, str), "_metadata");
        String str2 = j1Var.f20078h;
        File file2 = new File(file, str2);
        try {
            InputStream gZIPInputStream = j1Var.f20077g != 2 ? autoCloseInputStream : new GZIPInputStream(autoCloseInputStream, 8192);
            try {
                u uVar = new u(fileJ, file2);
                File fileK = this.f20087a.k(j1Var.f20075e, (String) j1Var.f10850b, j1Var.f20076f, j1Var.f20078h);
                if (!fileK.exists()) {
                    fileK.mkdirs();
                }
                n1 n1Var = new n1(this.f20087a, (String) j1Var.f10850b, j1Var.f20075e, j1Var.f20076f, j1Var.f20078h);
                com.facebook.imagepipeline.nativecode.c.b(uVar, gZIPInputStream, new o0(fileK, n1Var), j1Var.f20079i);
                n1Var.h(0);
                gZIPInputStream.close();
                oVar.d("Patching and extraction finished for slice %s of pack %s.", str2, str);
                ((v1) this.f20088b.a()).d(i7, 0, str, str2);
                try {
                    autoCloseInputStream.close();
                } catch (IOException unused) {
                    oVar.e("Could not close file for slice %s of pack %s.", str2, str);
                }
            } catch (Throwable th2) {
                try {
                    gZIPInputStream.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
        } catch (IOException e10) {
            oVar.b("IOException during patching %s.", e10.getMessage());
            throw new l0(s0.g.f("Error patching slice ", str2, " of pack ", str, "."), e10, i7);
        }
    }
}
