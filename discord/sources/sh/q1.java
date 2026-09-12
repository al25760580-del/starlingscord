package sh;

import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes3.dex */
public final class q1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a5.o f20156b = new a5.o("VerifySliceTaskHandler", 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f20157a;

    public q1(s sVar) {
        this.f20157a = sVar;
    }

    public final void a(p1 p1Var) {
        String str = (String) p1Var.f10850b;
        String str2 = (String) p1Var.f10850b;
        String str3 = p1Var.f20153e;
        int i7 = p1Var.f10849a;
        File fileK = this.f20157a.k(p1Var.f20151c, str2, p1Var.f20152d, str3);
        if (!fileK.exists()) {
            throw new l0(s0.g.e("Cannot find unverified files for slice ", str3, "."), i7);
        }
        try {
            s sVar = this.f20157a;
            String str4 = p1Var.f20153e;
            int i10 = p1Var.f20151c;
            long j = p1Var.f20152d;
            sVar.getClass();
            File file = new File(new File(new File(sVar.c(i10, j, str), "_slices"), "_metadata"), str4);
            if (!file.exists()) {
                throw new l0("Cannot find metadata files for slice " + str4 + ".", i7);
            }
            try {
                if (!a.a(o1.a(fileK, file)).equals(p1Var.f20154f)) {
                    throw new l0(s0.g.e("Verification failed for slice ", str4, "."), i7);
                }
                f20156b.d("Verification of slice %s of pack %s successful.", str4, str);
                File fileL = this.f20157a.l(p1Var.f20151c, (String) p1Var.f10850b, p1Var.f20152d, p1Var.f20153e);
                if (!fileL.exists()) {
                    fileL.mkdirs();
                }
                if (!fileK.renameTo(fileL)) {
                    throw new l0(s0.g.e("Failed to move slice ", str3, " after verification."), i7);
                }
            } catch (IOException e10) {
                throw new l0(s0.g.e("Could not digest file during verification for slice ", str3, "."), e10, i7);
            } catch (NoSuchAlgorithmException e11) {
                throw new l0("SHA256 algorithm not supported.", e11, i7);
            }
        } catch (IOException e12) {
            throw new l0(s0.g.e("Could not reconstruct slice archive during verification for slice ", str3, "."), e12, i7);
        }
    }
}
