package i1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import androidx.collection.LruCache;
import androidx.collection.SimpleArrayMap;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import mo.c0;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LruCache f11368a = new LruCache(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f11369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f11370c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final SimpleArrayMap f11371d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new j(0));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f11369b = threadPoolExecutor;
        f11370c = new Object();
        f11371d = new SimpleArrayMap(0);
    }

    public static String a(int i7, List list) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < list.size(); i10++) {
            sb2.append(((c) list.get(i10)).f11360g);
            sb2.append("-");
            sb2.append(i7);
            if (i10 < list.size() - 1) {
                sb2.append(";");
            }
        }
        return sb2.toString();
    }

    public static e b(String str, Context context, List list, int i7) {
        int i10;
        Typeface typefaceP;
        LruCache lruCache = f11368a;
        Trace.beginSection(c0.Q("getFontSync"));
        try {
            Typeface typeface = (Typeface) lruCache.a(str);
            if (typeface != null) {
                e eVar = new e(typeface);
                Trace.endSection();
                return eVar;
            }
            try {
                g gVarA = b.a(context, list);
                List list2 = gVarA.f11373b;
                int i11 = gVarA.f11372a;
                if (i11 == 0) {
                    h[] hVarArr = (h[]) list2.get(0);
                    if (hVarArr == null || hVarArr.length == 0) {
                        i10 = 1;
                    } else {
                        int length = hVarArr.length;
                        int i12 = 0;
                        while (true) {
                            if (i12 >= length) {
                                i10 = 0;
                                break;
                            }
                            int i13 = hVarArr[i12].f11379f;
                            if (i13 != 0) {
                                if (i13 >= 0) {
                                    i10 = i13;
                                    break;
                                }
                                i10 = -3;
                                break;
                            }
                            i12++;
                        }
                    }
                } else {
                    if (i11 != 1) {
                        i10 = -3;
                        break;
                    }
                    i10 = -2;
                }
                if (i10 != 0) {
                    e eVar2 = new e(i10);
                    Trace.endSection();
                    return eVar2;
                }
                if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                    h[] hVarArr2 = (h[]) list2.get(0);
                    gn.h hVar = b1.f.f3028a;
                    Trace.beginSection(c0.Q("TypefaceCompat.createFromFontInfo"));
                    try {
                        typefaceP = b1.f.f3028a.p(context, hVarArr2, i7);
                        Trace.endSection();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                } else {
                    gn.h hVar2 = b1.f.f3028a;
                    Trace.beginSection(c0.Q("TypefaceCompat.createFromFontInfoWithFallback"));
                    try {
                        typefaceP = b1.f.f3028a.q(context, list2, i7);
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
                if (typefaceP == null) {
                    e eVar3 = new e(-3);
                    Trace.endSection();
                    return eVar3;
                }
                lruCache.b(str, typefaceP);
                e eVar4 = new e(typefaceP);
                Trace.endSection();
                return eVar4;
            } catch (PackageManager.NameNotFoundException unused) {
                e eVar5 = new e(-1);
                Trace.endSection();
                return eVar5;
            }
        } catch (Throwable th4) {
            Trace.endSection();
            throw th4;
        }
    }
}
