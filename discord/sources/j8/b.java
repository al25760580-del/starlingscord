package j8;

import a5.i0;
import android.os.Environment;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import w3.q;
import xr.m;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f13670f = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f13671g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f13672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f13673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f13674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i8.b f13675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u8.c f13676e;

    public b(File file, int i7, i8.b bVar) {
        this.f13672a = file;
        boolean zContains = false;
        try {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (externalStorageDirectory != null) {
                try {
                    zContains = file.getCanonicalPath().contains(externalStorageDirectory.toString());
                } catch (IOException unused) {
                    bVar.getClass();
                }
            }
        } catch (Exception unused2) {
            bVar.getClass();
        }
        this.f13673b = zContains;
        File file2 = new File(this.f13672a, kk.b.h(i7, "v2.ols100."));
        this.f13674c = file2;
        this.f13675d = bVar;
        File file3 = this.f13672a;
        if (!file3.exists()) {
            m.E(file2);
        } else if (!file2.exists()) {
            q.o(file3);
            try {
                m.E(file2);
            } catch (m8.b unused3) {
                i8.b bVar2 = this.f13675d;
                Objects.toString(file2);
                bVar2.getClass();
            }
        }
        this.f13676e = u8.c.f20951a;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000d  */
    public static j h(b bVar, File file) {
        j jVar;
        String name = file.getName();
        int iLastIndexOf = name.lastIndexOf(46);
        if (iLastIndexOf <= 0) {
            jVar = null;
        } else {
            String strSubstring = name.substring(iLastIndexOf);
            String str = ".cnt";
            if (!".cnt".equals(strSubstring)) {
                str = ".tmp".equals(strSubstring) ? ".tmp" : null;
            }
            if (str == null) {
                jVar = null;
            } else {
                String strSubstring2 = name.substring(0, iLastIndexOf);
                if (str.equals(".tmp")) {
                    int iLastIndexOf2 = strSubstring2.lastIndexOf(46);
                    if (iLastIndexOf2 <= 0) {
                        jVar = null;
                    } else {
                        strSubstring2 = strSubstring2.substring(0, iLastIndexOf2);
                    }
                }
                jVar = new j(str, strSubstring2);
            }
        }
        if (jVar != null && new File(bVar.j((String) jVar.f13708i)).equals(file.getParentFile())) {
            return jVar;
        }
        return null;
    }

    @Override // j8.e
    public final h8.a a(Object obj, String str) {
        File fileI = i(str);
        if (!fileI.exists()) {
            return null;
        }
        this.f13676e.getClass();
        fileI.setLastModified(System.currentTimeMillis());
        return new h8.a(fileI);
    }

    @Override // j8.e
    public final void b() {
        q.D(this.f13672a, new i0(5, this));
    }

    @Override // j8.e
    public final Collection c() {
        j jVar = new j(this);
        q.D(this.f13674c, jVar);
        return Collections.unmodifiableList((ArrayList) jVar.f13707e);
    }

    @Override // j8.e
    public final long d(a aVar) {
        File file = aVar.f13667b.f10388a;
        if (!file.exists()) {
            return 0L;
        }
        long length = file.length();
        if (file.delete()) {
            return length;
        }
        return -1L;
    }

    @Override // j8.e
    public final void e() {
        File[] fileArrListFiles = this.f13672a.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                q.o(file);
            }
        }
    }

    @Override // j8.e
    public final e4.m f(Object obj, String str) throws IOException {
        File file = new File(j(str));
        boolean zExists = file.exists();
        i8.b bVar = this.f13675d;
        if (!zExists) {
            try {
                m.E(file);
            } catch (m8.b e10) {
                bVar.getClass();
                throw e10;
            }
        }
        try {
            return new e4.m(23, this, File.createTempFile(str.concat("."), ".tmp", file), str);
        } catch (IOException e11) {
            bVar.getClass();
            throw e11;
        }
    }

    @Override // j8.e
    public final boolean g(Object obj, String str) {
        return i(str).exists();
    }

    public final File i(String str) {
        return new File(a3.e.o(kk.b.n(j(str)), File.separator, str, ".cnt"));
    }

    @Override // j8.e
    public final boolean isExternal() {
        return this.f13673b;
    }

    public final String j(String str) {
        String strValueOf = String.valueOf(Math.abs(str.hashCode() % 100));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f13674c);
        return com.discord.chat.presentation.list.a.k(sb2, File.separator, strValueOf);
    }

    @Override // j8.e
    public final long remove(String str) {
        File fileI = i(str);
        if (!fileI.exists()) {
            return 0L;
        }
        long length = fileI.length();
        if (fileI.delete()) {
            return length;
        }
        return -1L;
    }
}
