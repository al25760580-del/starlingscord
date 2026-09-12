package ks;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f14809a = new a();

    public final void a(File file) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        if (!file.delete() && file.exists()) {
            throw new IOException(Intrinsics.stringPlus("failed to delete ", file));
        }
    }

    public final void b(File directory) throws IOException {
        Intrinsics.checkNotNullParameter(directory, "directory");
        File[] fileArrListFiles = directory.listFiles();
        if (fileArrListFiles == null) {
            throw new IOException(Intrinsics.stringPlus("not a readable directory: ", directory));
        }
        int length = fileArrListFiles.length;
        int i7 = 0;
        while (i7 < length) {
            File file = fileArrListFiles[i7];
            i7++;
            if (file.isDirectory()) {
                Intrinsics.checkNotNullExpressionValue(file, "file");
                b(file);
            }
            if (!file.delete()) {
                throw new IOException(Intrinsics.stringPlus("failed to delete ", file));
            }
        }
    }

    public final boolean c(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return file.exists();
    }

    public final void d(File from, File to2) throws IOException {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to2, "to");
        a(to2);
        if (from.renameTo(to2)) {
            return;
        }
        throw new IOException("failed to rename " + from + " to " + to2);
    }

    public final String toString() {
        return "FileSystem.SYSTEM";
    }
}
