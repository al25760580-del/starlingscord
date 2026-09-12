package sh;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/* JADX INFO: loaded from: classes3.dex */
public final class b1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a5.o f19989b = new a5.o("MergeSliceTaskHandler", 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f19990a;

    public b1(s sVar) {
        this.f19990a = sVar;
    }

    public static void b(File file, File file2) {
        if (!file.isDirectory()) {
            if (file2.exists()) {
                throw new l0("File clashing with existing file from other slice: ".concat(file2.toString()));
            }
            if (!file.renameTo(file2)) {
                throw new l0("Unable to move file: ".concat(String.valueOf(file)));
            }
            return;
        }
        file2.mkdirs();
        for (File file3 : file.listFiles()) {
            b(file3, new File(file2, file3.getName()));
        }
        if (!file.delete()) {
            throw new l0("Unable to delete directory: ".concat(String.valueOf(file)));
        }
    }

    public final void a(a1 a1Var) {
        String str = (String) a1Var.f10850b;
        int i7 = a1Var.f10849a;
        long j = a1Var.f19978d;
        int i10 = a1Var.f19977c;
        String str2 = a1Var.f19979e;
        s sVar = this.f19990a;
        File fileL = sVar.l(i10, str, j, str2);
        if (!fileL.exists()) {
            throw new l0(s0.g.e("Cannot find verified files for slice ", a1Var.f19979e, "."), i7);
        }
        sVar.getClass();
        File file = new File(sVar.c(i10, j, str), "_packs");
        if (!file.exists()) {
            file.mkdirs();
        }
        b(fileL, file);
        try {
            int iH = sVar.h(i10, j, str) + 1;
            File file2 = new File(new File(sVar.c(i10, j, str), "_packs"), "merge.tmp");
            Properties properties = new Properties();
            properties.put("numberOfMerges", String.valueOf(iH));
            file2.getParentFile().mkdirs();
            file2.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (IOException e10) {
            f19989b.b("Writing merge checkpoint failed with %s.", e10.getMessage());
            throw new l0("Writing merge checkpoint failed.", e10, i7);
        }
    }
}
