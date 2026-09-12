package k8;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import ci.e0;
import ci.v;
import ci.w;
import com.discord.jank_stats.JankRecordStore;
import he.m0;
import he.n;
import ig.c;
import io.sentry.hints.i;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import kq.l;
import na.e;
import na.h;
import pc.o;
import pc.u;
import sb.d;
import sh.s1;
import xb.b;
import yc.f;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements b, i, m0, c, ma.a, e0, qm.a, f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static a f14310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static a f14311e;

    public a(l storageManager, n0 samWithReceiverResolvers) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(samWithReceiverResolvers, "samWithReceiverResolvers");
        String str = l.f14787d;
        new ConcurrentHashMap(3, 1.0f, 2);
    }

    public static void e(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static io.sentry.internal.debugmeta.c f(Context context, String[] strArr, String str) {
        String[] strArrL = l(context);
        int length = strArrL.length;
        int i7 = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i7 >= length) {
                return null;
            }
            String str2 = strArrL[i7];
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                if (i10 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i10 = i11;
                }
            }
            if (zipFile != null) {
                int i12 = 0;
                while (true) {
                    int i13 = i12 + 1;
                    if (i12 < 5) {
                        for (String str3 : strArr) {
                            StringBuilder sb2 = new StringBuilder("lib");
                            char c8 = File.separatorChar;
                            sb2.append(c8);
                            sb2.append(str3);
                            sb2.append(c8);
                            sb2.append(str);
                            String string = sb2.toString();
                            n8.f.Y("Looking for %s in APK %s...", string, str2);
                            ZipEntry entry = zipFile.getEntry(string);
                            if (entry != null) {
                                io.sentry.internal.debugmeta.c cVar = new io.sentry.internal.debugmeta.c(15, false);
                                cVar.f12759e = zipFile;
                                cVar.f12760i = entry;
                                return cVar;
                            }
                        }
                        i12 = i13;
                    } else {
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i7++;
        }
    }

    public static String[] i(Context context, String str) {
        StringBuilder sb2 = new StringBuilder("lib");
        char c8 = File.separatorChar;
        sb2.append(c8);
        sb2.append("([^\\");
        sb2.append(c8);
        sb2.append("]*)");
        sb2.append(c8);
        sb2.append(str);
        Pattern patternCompile = Pattern.compile(sb2.toString());
        HashSet hashSet = new HashSet();
        for (String str2 : l(context)) {
            try {
                Enumeration<? extends ZipEntry> enumerationEntries = new ZipFile(new File(str2), 1).entries();
                while (enumerationEntries.hasMoreElements()) {
                    Matcher matcher = patternCompile.matcher(enumerationEntries.nextElement().getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException unused) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    public static String[] l(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr == null || strArr.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = applicationInfo.sourceDir;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }

    @Override // yc.f
    public long a(pc.l lVar) {
        return -1L;
    }

    @Override // ma.a
    public Drawable b(na.c image) {
        Drawable drawable;
        Drawable.ConstantState constantState;
        Intrinsics.checkNotNullParameter(image, "image");
        e eVar = image instanceof e ? (e) image : null;
        if (eVar == null || (drawable = ((h) eVar).f16531v) == null || (constantState = drawable.getConstantState()) == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    @Override // yc.f
    public u c() {
        return new o(-9223372036854775807L);
    }

    @Override // qm.a
    public String g() {
        return "onWillAppear";
    }

    @Override // javax.inject.Provider
    public Object get() {
        q8.c cVar = new q8.c();
        HashMap map = new HashMap();
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        map.put(d.f19823d, new bc.c(JankRecordStore.FLUSH_INTERVAL_MS, 86400000L, set));
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        map.put(d.f19825i, new bc.c(1000L, 86400000L, set));
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(bc.d.f3095e)));
        if (setUnmodifiableSet == null) {
            throw new NullPointerException("Null flags");
        }
        map.put(d.f19824e, new bc.c(86400000L, 86400000L, setUnmodifiableSet));
        if (map.keySet().size() < d.values().length) {
            throw new IllegalStateException("Not all priorities have been configured");
        }
        new HashMap();
        return new bc.b(cVar, map);
    }

    @Override // qm.a
    public String getEventName() {
        return "topWillAppear";
    }

    @Override // ci.e0
    public Object h(IBinder iBinder) {
        int i7 = v.f3725g;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
        return iInterfaceQueryLocalInterface instanceof w ? (w) iInterfaceQueryLocalInterface : new ci.u(iBinder, "com.google.android.play.core.integrity.protocol.IExpressIntegrityService", 0);
    }

    @Override // he.m0
    public Object j(Uri uri, n nVar) {
        return Long.valueOf(je.e0.L(new BufferedReader(new InputStreamReader(nVar)).readLine()));
    }

    public gc.l k(Context context, mf.c cVar) {
        gc.l lVar = new gc.l();
        lVar.f9744a = 0;
        lVar.f9745b = 0;
        lVar.f9746c = 0;
        int iE = cVar.e(context, true);
        lVar.f9745b = iE;
        if (iE != 0) {
            lVar.f9746c = 1;
            return lVar;
        }
        int iL = cVar.l(context);
        lVar.f9744a = iL;
        if (iL != 0) {
            lVar.f9746c = -1;
        }
        return lVar;
    }

    @Override // ma.a
    public boolean n(na.c image) {
        Intrinsics.checkNotNullParameter(image, "image");
        return image instanceof e;
    }

    @Override // ig.c
    public void onFailure(Exception exc) {
        s1.k.e(String.format("Could not sync active asset packs. %s", exc), new Object[0]);
    }

    @Override // yc.f
    public void d(long j) {
    }
}
