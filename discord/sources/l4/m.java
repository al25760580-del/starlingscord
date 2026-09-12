package l4;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f14888a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashSet f14889b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f14890c = {80, 75, 3, 4};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f14891d = {31, -117, 8};

    public static c0 a(final String str, Callable callable, Runnable runnable) {
        i iVarA = str == null ? null : q4.g.f18624b.a(str);
        c0 c0Var = iVarA != null ? new c0(iVarA) : null;
        HashMap map = f14888a;
        if (str != null && map.containsKey(str)) {
            c0Var = (c0) map.get(str);
        }
        if (c0Var != null) {
            if (runnable != null) {
                runnable.run();
            }
            return c0Var;
        }
        c0 c0Var2 = new c0(callable, false);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final int i7 = 0;
            c0Var2.b(new y() { // from class: l4.k
                @Override // l4.y
                public final void onResult(Object obj) {
                    switch (i7) {
                        case 0:
                            HashMap map2 = m.f14888a;
                            map2.remove(str);
                            atomicBoolean.set(true);
                            if (map2.size() == 0) {
                                m.i();
                            }
                            break;
                        default:
                            HashMap map3 = m.f14888a;
                            map3.remove(str);
                            atomicBoolean.set(true);
                            if (map3.size() == 0) {
                                m.i();
                            }
                            break;
                    }
                }
            });
            final int i10 = 1;
            c0Var2.a(new y() { // from class: l4.k
                @Override // l4.y
                public final void onResult(Object obj) {
                    switch (i10) {
                        case 0:
                            HashMap map2 = m.f14888a;
                            map2.remove(str);
                            atomicBoolean.set(true);
                            if (map2.size() == 0) {
                                m.i();
                            }
                            break;
                        default:
                            HashMap map3 = m.f14888a;
                            map3.remove(str);
                            atomicBoolean.set(true);
                            if (map3.size() == 0) {
                                m.i();
                            }
                            break;
                    }
                }
            });
            if (!atomicBoolean.get()) {
                map.put(str, c0Var2);
                if (map.size() == 1) {
                    i();
                }
            }
        }
        return c0Var2;
    }

    public static a0 b(Context context, String str, String str2) {
        i iVarA = str2 == null ? null : q4.g.f18624b.a(str2);
        if (iVarA != null) {
            return new a0(iVarA);
        }
        try {
            rs.p pVarD = rs.v.d(rs.v.m(context.getAssets().open(str)));
            if (h(pVarD, f14890c).booleanValue()) {
                return f(context, new ZipInputStream(new rs.e(pVarD, 1)), str2);
            }
            if (h(pVarD, f14891d).booleanValue()) {
                return c(new GZIPInputStream(new rs.e(pVarD, 1)), str2);
            }
            String[] strArr = w4.a.f22063w;
            return d(new w4.b(pVarD), str2, true);
        } catch (IOException e10) {
            return new a0(e10);
        }
    }

    public static a0 c(InputStream inputStream, String str) {
        rs.p pVarD = rs.v.d(rs.v.m(inputStream));
        String[] strArr = w4.a.f22063w;
        return d(new w4.b(pVarD), str, true);
    }

    public static a0 d(w4.b bVar, String str, boolean z5) {
        try {
            i iVarA = str == null ? null : q4.g.f18624b.a(str);
            if (iVarA != null) {
                return new a0(iVarA);
            }
            i iVarA2 = v4.r.a(bVar);
            if (str != null) {
                q4.g.f18624b.f18625a.b(str, iVarA2);
            }
            return new a0(iVarA2);
        } catch (Exception e10) {
            return new a0(e10);
        } finally {
            if (z5) {
                x4.h.b(bVar);
            }
        }
    }

    public static a0 e(Context context, String str, int i7) {
        i iVarA = str == null ? null : q4.g.f18624b.a(str);
        if (iVarA != null) {
            return new a0(iVarA);
        }
        try {
            rs.p pVarD = rs.v.d(rs.v.m(context.getResources().openRawResource(i7)));
            if (h(pVarD, f14890c).booleanValue()) {
                return f(context, new ZipInputStream(new rs.e(pVarD, 1)), str);
            }
            if (!h(pVarD, f14891d).booleanValue()) {
                String[] strArr = w4.a.f22063w;
                return d(new w4.b(pVarD), str, true);
            }
            try {
                return c(new GZIPInputStream(new rs.e(pVarD, 1)), str);
            } catch (IOException e10) {
                return new a0(e10);
            }
        } catch (Resources.NotFoundException e11) {
            return new a0(e11);
        }
    }

    public static a0 f(Context context, ZipInputStream zipInputStream, String str) {
        try {
            return g(context, zipInputStream, str);
        } finally {
            x4.h.b(zipInputStream);
        }
    }

    public static a0 g(Context context, ZipInputStream zipInputStream, String str) {
        i iVarA;
        x xVar;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        if (str == null) {
            iVarA = null;
        } else {
            try {
                iVarA = q4.g.f18624b.a(str);
            } catch (IOException e10) {
                return new a0(e10);
            }
        }
        if (iVarA != null) {
            return new a0(iVarA);
        }
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        i iVar = null;
        while (nextEntry != null) {
            String name = nextEntry.getName();
            if (name.contains("__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().contains(".json")) {
                rs.p pVarD = rs.v.d(rs.v.m(zipInputStream));
                String[] strArr = w4.a.f22063w;
                iVar = d(new w4.b(pVarD), null, false).f14820a;
            } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(".jpeg")) {
                String[] strArrSplit = name.split("/");
                map.put(strArrSplit[strArrSplit.length - 1], BitmapFactory.decodeStream(zipInputStream));
            } else if (name.contains(".ttf") || name.contains(".otf")) {
                String[] strArrSplit2 = name.split("/");
                String str2 = strArrSplit2[strArrSplit2.length - 1];
                String str3 = str2.split("\\.")[0];
                if (context == null) {
                    return new a0(new IllegalStateException("Unable to extract font " + str3 + " please pass a non-null Context parameter"));
                }
                File file = new File(context.getCacheDir(), str2);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                        try {
                            byte[] bArr = new byte[RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT];
                            while (true) {
                                int i7 = zipInputStream.read(bArr);
                                if (i7 == -1) {
                                    break;
                                }
                                fileOutputStream2.write(bArr, 0, i7);
                            }
                            fileOutputStream2.flush();
                            fileOutputStream2.close();
                            fileOutputStream.close();
                        } catch (Throwable th2) {
                            try {
                                fileOutputStream2.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                } catch (Throwable th6) {
                    x4.c.c("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th6);
                }
                Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                if (!file.delete()) {
                    x4.c.b("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                }
                map2.put(str3, typefaceCreateFromFile);
            } else {
                zipInputStream.closeEntry();
            }
            nextEntry = zipInputStream.getNextEntry();
        }
        if (iVar == null) {
            return new a0(new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : map.entrySet()) {
            String str4 = (String) entry.getKey();
            Iterator it = ((HashMap) iVar.c()).values().iterator();
            do {
                if (!it.hasNext()) {
                    xVar = null;
                    break;
                }
                xVar = (x) it.next();
            } while (!xVar.f14940d.equals(str4));
            if (xVar != null) {
                xVar.f14942f = x4.h.d(xVar.f14937a, xVar.f14938b, (Bitmap) entry.getValue());
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            boolean z5 = false;
            for (q4.c cVar : iVar.f14868f.values()) {
                if (cVar.f18612a.equals(entry2.getKey())) {
                    cVar.f18615d = (Typeface) entry2.getValue();
                    z5 = true;
                }
            }
            if (!z5) {
                x4.c.b("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
            }
        }
        if (map.isEmpty()) {
            Iterator it2 = ((HashMap) iVar.c()).entrySet().iterator();
            while (it2.hasNext()) {
                x xVar2 = (x) ((Map.Entry) it2.next()).getValue();
                if (xVar2 == null) {
                    return null;
                }
                String str5 = xVar2.f14940d;
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                if (str5.startsWith("data:") && str5.indexOf("base64,") > 0) {
                    try {
                        byte[] bArrDecode = Base64.decode(str5.substring(str5.indexOf(44) + 1), 0);
                        xVar2.f14942f = x4.h.d(xVar2.f14937a, xVar2.f14938b, BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options));
                    } catch (IllegalArgumentException e11) {
                        x4.c.c("data URL did not have correct base64 format.", e11);
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            q4.g.f18624b.f18625a.b(str, iVar);
        }
        return new a0(iVar);
    }

    public static Boolean h(rs.p pVar, byte[] bArr) {
        try {
            rs.p pVarD = rs.v.d(new rs.n(pVar));
            for (byte b10 : bArr) {
                if (pVarD.readByte() != b10) {
                    return Boolean.FALSE;
                }
            }
            pVarD.close();
            return Boolean.TRUE;
        } catch (Exception unused) {
            x4.c.f22625a.getClass();
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused2) {
            return Boolean.FALSE;
        }
    }

    public static void i() {
        ArrayList arrayList = new ArrayList(f14889b);
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    public static String j(Context context, int i7) {
        StringBuilder sb2 = new StringBuilder("rawRes");
        sb2.append((context.getResources().getConfiguration().uiMode & 48) == 32 ? "_night_" : "_day_");
        sb2.append(i7);
        return sb2.toString();
    }
}
