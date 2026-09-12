package sh;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a5.o f20169c = new a5.o("AssetPackStorage", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f20170d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f20171e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h1 f20173b;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        f20170d = timeUnit.toMillis(14L);
        f20171e = timeUnit.toMillis(28L);
    }

    public s(Context context, h1 h1Var) {
        this.f20172a = context;
        this.f20173b = h1Var;
    }

    public static long b(File file, boolean z5) {
        if (!file.exists()) {
            return -1L;
        }
        ArrayList arrayList = new ArrayList();
        a5.o oVar = f20169c;
        if (z5 && file.listFiles().length > 1) {
            oVar.e("Multiple pack versions found, using highest version code.", new Object[0]);
        }
        try {
            for (File file2 : file.listFiles()) {
                if (!file2.getName().equals("stale.tmp")) {
                    arrayList.add(Long.valueOf(file2.getName()));
                }
            }
        } catch (NumberFormatException e10) {
            oVar.c(e10, "Corrupt asset pack directories.", new Object[0]);
        }
        if (arrayList.isEmpty()) {
            return -1L;
        }
        Collections.sort(arrayList);
        return ((Long) arrayList.get(arrayList.size() - 1)).longValue();
    }

    public static void f(File file) {
        if (file.listFiles() == null || file.listFiles().length <= 1) {
            return;
        }
        long jB = b(file, false);
        for (File file2 : file.listFiles()) {
            if (!file2.getName().equals(String.valueOf(jB)) && !file2.getName().equals("stale.tmp")) {
                g(file2);
            }
        }
    }

    public static boolean g(File file) {
        File[] fileArrListFiles = file.listFiles();
        boolean zG = true;
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                zG &= g(file2);
            }
        }
        if (file.delete()) {
            return zG;
        }
        return false;
    }

    public final void a(int i7, long j, String str) {
        File file = new File(d(), str);
        if (file.exists()) {
            for (File file2 : file.listFiles()) {
                if (!file2.getName().equals(String.valueOf(i7)) && !file2.getName().equals("stale.tmp")) {
                    g(file2);
                } else if (file2.getName().equals(String.valueOf(i7))) {
                    for (File file3 : file2.listFiles()) {
                        if (!file3.getName().equals(String.valueOf(j))) {
                            g(file3);
                        }
                    }
                }
            }
        }
    }

    public final File c(int i7, long j, String str) {
        return new File(new File(new File(new File(d(), "_tmp"), str), String.valueOf(i7)), String.valueOf(j));
    }

    public final File d() {
        return new File(this.f20172a.getFilesDir(), "assetpacks");
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        try {
            if (d().exists() && d().listFiles() != null) {
                for (File file : d().listFiles()) {
                    if (!file.getCanonicalPath().equals(new File(d(), "_tmp").getCanonicalPath())) {
                        arrayList.add(file);
                    }
                }
            }
            return arrayList;
        } catch (IOException e10) {
            f20169c.b("Could not process directory while scanning installed packs. %s", e10);
            return arrayList;
        }
    }

    public final int h(int i7, long j, String str) throws IOException {
        File file = new File(new File(c(i7, j, str), "_packs"), "merge.tmp");
        if (!file.exists()) {
            return 0;
        }
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            properties.load(fileInputStream);
            fileInputStream.close();
            if (properties.getProperty("numberOfMerges") == null) {
                throw new l0("Merge checkpoint file corrupt.");
            }
            try {
                return Integer.parseInt(properties.getProperty("numberOfMerges"));
            } catch (NumberFormatException e10) {
                throw new l0("Merge checkpoint file corrupt.", e10);
            }
        } catch (Throwable th2) {
            try {
                fileInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final v i(String str) {
        String strM = m(str);
        if (strM == null) {
            return null;
        }
        File file = new File(strM, "assets");
        if (file.isDirectory()) {
            return new v(0, strM, file.getCanonicalPath());
        }
        f20169c.b("Failed to find assets directory: %s", file);
        return null;
    }

    public final File j(int i7, long j, String str) {
        return new File(new File(new File(d(), str), String.valueOf(i7)), String.valueOf(j));
    }

    public final File k(int i7, String str, long j, String str2) {
        return new File(new File(new File(c(i7, j, str), "_slices"), "_unverified"), str2);
    }

    public final File l(int i7, String str, long j, String str2) {
        return new File(new File(new File(c(i7, j, str), "_slices"), "_verified"), str2);
    }

    public final String m(String str) {
        int length;
        File file = new File(d(), str);
        boolean zExists = file.exists();
        a5.o oVar = f20169c;
        if (!zExists) {
            oVar.a("Pack not found with pack name: %s", str);
            return null;
        }
        h1 h1Var = this.f20173b;
        File file2 = new File(file, String.valueOf(h1Var.a()));
        if (!file2.exists()) {
            oVar.a("Pack not found with pack name: %s app version: %s", str, Integer.valueOf(h1Var.a()));
            return null;
        }
        File[] fileArrListFiles = file2.listFiles();
        if (fileArrListFiles == null || (length = fileArrListFiles.length) == 0) {
            oVar.a("No pack version found for pack name: %s app version: %s", str, Integer.valueOf(h1Var.a()));
            return null;
        }
        if (length <= 1) {
            return fileArrListFiles[0].getCanonicalPath();
        }
        oVar.b("Multiple pack versions found for pack name: %s app version: %s", str, Integer.valueOf(h1Var.a()));
        return null;
    }

    public final HashMap n() {
        HashMap map = new HashMap();
        Iterator it = e().iterator();
        while (it.hasNext()) {
            String name = ((File) it.next()).getName();
            int iB = (int) b(new File(d(), name), true);
            long jB = b(new File(new File(d(), name), String.valueOf(iB)), true);
            if (j(iB, jB, name).exists()) {
                map.put(name, Long.valueOf(jB));
            }
        }
        return map;
    }

    public final HashMap o() {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        try {
            for (File file : e()) {
                v vVarI = i(file.getName());
                if (vVarI != null) {
                    map2.put(file.getName(), vVarI);
                }
            }
        } catch (IOException e10) {
            f20169c.b("Could not process directory while scanning installed packs: %s", e10);
        }
        for (String str : map2.keySet()) {
            map.put(str, Long.valueOf(b(new File(new File(d(), str), String.valueOf((int) b(new File(d(), str), true))), true)));
        }
        return map;
    }
}
