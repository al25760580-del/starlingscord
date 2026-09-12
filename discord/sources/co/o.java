package co;

import ag.a1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.io.FileWalkDirection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class o extends n {
    public static void f(File file, File target) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        if (!file.exists()) {
            throw new r(file, null, "The source file doesn't exist.", 2, null);
        }
        if (target.exists() && !target.delete()) {
            Intrinsics.checkNotNullParameter(file, "file");
            throw new c("Tried to overwrite the destination, but failed to delete it.", file, target);
        }
        if (file.isDirectory()) {
            if (!target.mkdirs()) {
                throw new a1("Failed to create target directory.", file, target);
            }
            return;
        }
        File parentFile = target.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(target);
            try {
                m3.m.k(fileInputStream, fileOutputStream, 8192);
                fileOutputStream.close();
                fileInputStream.close();
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    ls.d.k(fileOutputStream, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                ls.d.k(fileInputStream, th4);
                throw th5;
            }
        }
    }

    public static boolean g(File start) {
        Intrinsics.checkNotNullParameter(start, "<this>");
        Intrinsics.checkNotNullParameter(start, "<this>");
        FileWalkDirection direction = FileWalkDirection.f14683e;
        Intrinsics.checkNotNullParameter(start, "<this>");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(direction, "direction");
        i iVar = new i(new k(start, direction, null, null, null, 0, 32, null));
        while (true) {
            boolean z5 = true;
            while (iVar.hasNext()) {
                File file = (File) iVar.next();
                if (file.delete() || !file.exists()) {
                    if (z5) {
                    }
                }
                z5 = false;
            }
            return z5;
        }
    }

    public static final d h(d dVar) {
        File file = dVar.f3751a;
        List<File> list = dVar.f3752b;
        ArrayList arrayList = new ArrayList(list.size());
        for (File file2 : list) {
            String name = file2.getName();
            if (!Intrinsics.areEqual(name, ".")) {
                if (!Intrinsics.areEqual(name, "..")) {
                    arrayList.add(file2);
                } else if (arrayList.isEmpty() || Intrinsics.areEqual(((File) CollectionsKt.Q(arrayList)).getName(), "..")) {
                    arrayList.add(file2);
                } else {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
        }
        return new d(file, arrayList);
    }
}
