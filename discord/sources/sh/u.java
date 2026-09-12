package sh;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public final class u extends th.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TreeMap f20201d = new TreeMap();

    public u(File file, File file2) throws IOException {
        ArrayList<File> arrayListA = o1.a(file, file2);
        if (arrayListA.isEmpty()) {
            throw new l0(String.format("Virtualized slice archive empty for %s, %s", file, file2));
        }
        long length = 0;
        for (File file3 : arrayListA) {
            this.f20201d.put(Long.valueOf(length), file3);
            length += file3.length();
        }
    }

    public final long c() {
        Map.Entry entryLastEntry = this.f20201d.lastEntry();
        return ((File) entryLastEntry.getValue()).length() + ((Long) entryLastEntry.getKey()).longValue();
    }

    public final FileInputStream f(long j, Long l6) {
        FileInputStream fileInputStream = new FileInputStream((File) this.f20201d.get(l6));
        if (fileInputStream.skip(j - l6.longValue()) == j - l6.longValue()) {
            return fileInputStream;
        }
        throw new l0("Virtualized slice archive corrupt, could not skip in file with key " + l6);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
