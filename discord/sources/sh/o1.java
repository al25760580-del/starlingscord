package sh;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f20142a = Pattern.compile("[0-9]+-(NAM|LFH)\\.dat");

    public static ArrayList a(File file, File file2) throws IOException {
        File[] fileArr;
        ArrayList arrayList = new ArrayList();
        File[] fileArrListFiles = file2.listFiles(new com.facebook.soloader.e0(1));
        if (fileArrListFiles != null) {
            File[] fileArr2 = new File[fileArrListFiles.length];
            int i7 = 0;
            while (true) {
                int length = fileArrListFiles.length;
                if (i7 >= length) {
                    fileArr = fileArr2;
                    break;
                }
                File file3 = fileArrListFiles[i7];
                int i10 = Integer.parseInt(file3.getName().split("-")[0]);
                if (i10 > length || fileArr2[i10] != null) {
                    throw new l0("Metadata folder ordering corrupt.");
                }
                fileArr2[i10] = file3;
                i7++;
            }
        } else {
            fileArr = new File[0];
        }
        for (File file4 : fileArr) {
            arrayList.add(file4);
            if (file4.getName().contains("LFH")) {
                FileInputStream fileInputStream = new FileInputStream(file4);
                try {
                    String str = new b0(fileInputStream).c().f20245a;
                    if (str == null) {
                        throw new l0("Metadata files corrupt. Could not read local file header.");
                    }
                    File file5 = new File(file, str);
                    if (!file5.exists()) {
                        throw new l0("Missing asset file " + file5.getCanonicalPath() + " during slice reconstruction.");
                    }
                    arrayList.add(file5);
                    fileInputStream.close();
                } catch (Throwable th2) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
        return arrayList;
    }
}
