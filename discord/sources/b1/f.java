package b1;

import a5.t;
import a5.z;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.LruCache;
import androidx.collection.SimpleArrayMap;
import hi.o;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import mo.c0;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gn.h f3028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LruCache f3029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Paint f3030c;

    static {
        Trace.beginSection(c0.Q("TypefaceCompat static init"));
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 31) {
            f3028a = new l();
        } else if (i7 >= 29) {
            f3028a = new k();
        } else if (i7 >= 28) {
            f3028a = new j();
        } else if (i7 >= 26) {
            f3028a = new i();
        } else {
            Method method = h.f3038d;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                f3028a = new h();
            } else {
                f3028a = new g();
            }
        }
        f3029b = new LruCache(16);
        f3030c = null;
        Trace.endSection();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Typeface a(Context context, a1.e eVar, Resources resources, int i7, String str, int i10, int i11, a1.b bVar, boolean z5) {
        Typeface typefaceO;
        Typeface typefaceBuild;
        FontFamily fontFamilyBuild;
        int i12 = -3;
        int i13 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (eVar instanceof a1.h) {
            a1.h hVar = (a1.h) eVar;
            String str2 = hVar.f30d;
            typefaceO = null;
            int i14 = 1;
            if (TextUtils.isEmpty(str2) || (typefaceBuild = c(str2)) == null) {
                ArrayList arrayList = hVar.f27a;
                if (arrayList.size() != 1) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        int i15 = 0;
                        while (true) {
                            if (i15 >= arrayList.size()) {
                                int i16 = 0;
                                Typeface.CustomFallbackBuilder customFallbackBuilder = null;
                                while (true) {
                                    if (i16 < arrayList.size()) {
                                        i1.c cVar = (i1.c) arrayList.get(i16);
                                        if (i16 == arrayList.size() - 1 && TextUtils.isEmpty(cVar.f11359f)) {
                                            customFallbackBuilder.setSystemFallback(cVar.f11358e);
                                        } else {
                                            String str3 = cVar.f11358e;
                                            String str4 = cVar.f11359f;
                                            Font fontD = d(c(str3));
                                            if (fontD == null) {
                                                Log.w("TypefaceCompat", "Unable identify the primary font for " + cVar.f11358e + ". Falling back to provider font.");
                                            } else {
                                                if (TextUtils.isEmpty(str4)) {
                                                    try {
                                                        fontFamilyBuild = new FontFamily.Builder(androidx.core.view.c.a(fontD).setFontVariationSettings(str4).build()).build();
                                                    } catch (IOException unused) {
                                                        Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                                                    }
                                                } else {
                                                    fontFamilyBuild = new FontFamily.Builder(fontD).build();
                                                }
                                                if (customFallbackBuilder == null) {
                                                    customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyBuild);
                                                } else {
                                                    customFallbackBuilder.addCustomFallback(fontFamilyBuild);
                                                }
                                                i16++;
                                            }
                                        }
                                    }
                                    typefaceBuild = customFallbackBuilder.build();
                                    break;
                                }
                            }
                            if (c(((i1.c) arrayList.get(i15)).f11358e) != null) {
                                i15++;
                            }
                            typefaceBuild = null;
                            break;
                        }
                    }
                    typefaceBuild = null;
                    break;
                }
                typefaceBuild = c(((i1.c) arrayList.get(0)).f11358e);
            }
            if (typefaceBuild != null) {
                if (bVar != null) {
                    new Handler(Looper.getMainLooper()).post(new a1.k(i13, bVar, typefaceBuild));
                }
                f3029b.b(b(resources, i7, str, i10, i11), typefaceBuild);
                return typefaceBuild;
            }
            Object[] objArr3 = !z5 ? bVar != null : hVar.f29c != 0;
            int i17 = z5 ? hVar.f28b : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            fj.c cVar2 = new fj.c(5, (boolean) (objArr2 == true ? 1 : 0));
            cVar2.f9267e = bVar;
            ArrayList arrayList2 = hVar.f27a;
            c5.f fVar = new c5.f(handler, 1);
            e4.e eVar2 = new e4.e(9, cVar2, fVar);
            int i18 = 10;
            if (objArr3 != true) {
                String strA = i1.f.a(i11, arrayList2);
                Typeface typeface = (Typeface) i1.f.f11368a.a(strA);
                if (typeface != null) {
                    fVar.execute(new o(i18, cVar2, typeface));
                    typefaceO = typeface;
                } else {
                    z zVar = new z(i14, eVar2);
                    synchronized (i1.f.f11370c) {
                        try {
                            SimpleArrayMap simpleArrayMap = i1.f.f11371d;
                            ArrayList arrayList3 = (ArrayList) simpleArrayMap.get(strA);
                            if (arrayList3 != null) {
                                arrayList3.add(zVar);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(zVar);
                                simpleArrayMap.put(strA, arrayList4);
                                i1.d dVar = new i1.d(strA, context, arrayList2, i11, 1);
                                ThreadPoolExecutor threadPoolExecutor = i1.f.f11369b;
                                z zVar2 = new z(2, strA);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                t tVar = new t();
                                tVar.f261e = dVar;
                                tVar.f262i = zVar2;
                                tVar.f263v = handler2;
                                threadPoolExecutor.execute(tVar);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            } else {
                if (arrayList2.size() > 1) {
                    throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
                }
                i1.c cVar3 = (i1.c) arrayList2.get(0);
                LruCache lruCache = i1.f.f11368a;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj = new Object[]{cVar3}[0];
                Objects.requireNonNull(obj);
                arrayList5.add(obj);
                String strA2 = i1.f.a(i11, Collections.unmodifiableList(arrayList5));
                Typeface typeface2 = (Typeface) i1.f.f11368a.a(strA2);
                if (typeface2 != null) {
                    fVar.execute(new o(i18, cVar2, typeface2));
                    typefaceO = typeface2;
                } else if (i17 == -1) {
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj2 = new Object[]{cVar3}[0];
                    Objects.requireNonNull(obj2);
                    arrayList6.add(obj2);
                    i1.e eVarB = i1.f.b(strA2, context, Collections.unmodifiableList(arrayList6), i11);
                    eVar2.M(eVarB);
                    typefaceO = eVarB.f11366a;
                } else {
                    try {
                        try {
                            try {
                                try {
                                    i1.e eVar3 = (i1.e) i1.f.f11369b.submit(new i1.d(strA2, context, cVar3, i11, 0)).get(i17, TimeUnit.MILLISECONDS);
                                    eVar2.M(eVar3);
                                    typefaceO = eVar3.f11366a;
                                } catch (ExecutionException e10) {
                                    throw new RuntimeException(e10);
                                }
                            } catch (TimeoutException unused2) {
                                throw new InterruptedException("timeout");
                            }
                        } catch (InterruptedException e11) {
                            throw e11;
                        }
                    } catch (InterruptedException unused3) {
                        ((c5.f) eVar2.f7972i).execute(new com.google.android.material.datepicker.g(i12, 3, (fj.c) eVar2.f7971e));
                    }
                }
            }
        } else {
            typefaceO = f3028a.o(context, (a1.f) eVar, resources, i11);
            if (bVar != null) {
                if (typefaceO != null) {
                    new Handler(Looper.getMainLooper()).post(new a1.k(objArr == true ? 1 : 0, bVar, typefaceO));
                } else {
                    bVar.a(-3);
                }
            }
        }
        if (typefaceO != null) {
            f3029b.b(b(resources, i7, str, i10, i11), typefaceO);
        }
        return typefaceO;
    }

    public static String b(Resources resources, int i7, String str, int i10, int i11) {
        return resources.getResourcePackageName(i7) + '-' + str + '-' + i10 + '-' + i7 + '-' + i11;
    }

    public static Typeface c(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                return typefaceCreate;
            }
        }
        return null;
    }

    public static Font d(Typeface typeface) {
        if (f3030c == null) {
            f3030c = new Paint();
        }
        f3030c.setTextSize(10.0f);
        f3030c.setTypeface(typeface);
        PositionedGlyphs positionedGlyphsShapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, f3030c);
        if (positionedGlyphsShapeTextRun.glyphCount() == 0) {
            return null;
        }
        return positionedGlyphsShapeTextRun.getFont(0);
    }
}
