package w3;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.work.impl.WorkDatabase;
import com.discord.R;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import e.v;
import java.io.File;
import java.io.IOException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.collections.CollectionsKt;
import kotlin.collections.n0;
import kotlin.collections.w0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt;
import kotlin.text.x;
import lq.q0;
import lq.z;
import mo.c0;
import okio.ByteString;
import rn.d0;
import rn.e0;
import v3.s;
import vo.r0;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {
    public static int A(int[] iArr) {
        int i7 = 0;
        for (int i10 : iArr) {
            i7 += i10;
        }
        return i7;
    }

    public static h5.m B(String str, int i7, Function0 block, int i10) {
        boolean z5 = (i10 & 2) == 0;
        if ((i10 & 8) != 0) {
            str = null;
        }
        if ((i10 & 16) != 0) {
            i7 = -1;
        }
        Intrinsics.checkNotNullParameter(block, "block");
        h5.m mVar = new h5.m(3, block);
        if (z5) {
            mVar.setDaemon(true);
        }
        if (i7 > 0) {
            mVar.setPriority(i7);
        }
        if (str != null) {
            mVar.setName(str);
        }
        mVar.start();
        return mVar;
    }

    public static byte[] C(com.google.firebase.messaging.d dVar) throws IOException {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int iMin = Math.min(8192, Math.max(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT, Integer.highestOneBit(0) * 2));
        int i7 = 0;
        while (i7 < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i7);
            byte[] bArr = new byte[iMin2];
            arrayDeque.add(bArr);
            int i10 = 0;
            while (i10 < iMin2) {
                int i11 = dVar.read(bArr, i10, iMin2 - i10);
                if (i11 == -1) {
                    return k(arrayDeque, i7);
                }
                i10 += i11;
                i7 += i11;
            }
            long j = ((long) iMin) * ((long) (iMin < 4096 ? 4 : 2));
            if (j > 2147483647L) {
                iMin = Integer.MAX_VALUE;
            } else {
                iMin = j < -2147483648L ? Integer.MIN_VALUE : (int) j;
            }
        }
        if (dVar.read() == -1) {
            return k(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static void D(File file, m8.a aVar) {
        aVar.c(file);
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    D(file2, aVar);
                } else {
                    aVar.a(file2);
                }
            }
        }
        aVar.e(file);
    }

    public static final long a(float f2, float f7, float f10, float f11, d0.c colorSpace) {
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        float fB = colorSpace.b(0);
        if (f2 <= colorSpace.a(0) && fB <= f2) {
            float fB2 = colorSpace.b(1);
            if (f7 <= colorSpace.a(1) && fB2 <= f7) {
                float fB3 = colorSpace.b(2);
                if (f10 <= colorSpace.a(2) && fB3 <= f10 && 0.0f <= f11 && f11 <= 1.0f) {
                    if (colorSpace.c()) {
                        long j = (((int) ((f2 * 255.0f) + 0.5f)) << 16) | (((int) ((f11 * 255.0f) + 0.5f)) << 24) | (((int) ((f7 * 255.0f) + 0.5f)) << 8) | ((int) ((f10 * 255.0f) + 0.5f));
                        d0 d0Var = e0.f19470e;
                        long j5 = (j & 4294967295L) << 32;
                        int i7 = c0.a.f3406d;
                        return j5;
                    }
                    long j7 = colorSpace.f7524b;
                    int i10 = d0.b.f7522e;
                    if (((int) (j7 >> 32)) != 3) {
                        throw new IllegalArgumentException("Color only works with ColorSpaces with 3 components");
                    }
                    int i11 = colorSpace.f7525c;
                    if (i11 == -1) {
                        throw new IllegalArgumentException("Unknown color space, please use a color space in ColorSpaces");
                    }
                    short sA = c0.b.a(f2);
                    short sA2 = c0.b.a(f7);
                    short sA3 = c0.b.a(f10);
                    int iMax = (int) ((Math.max(0.0f, Math.min(f11, 1.0f)) * 1023.0f) + 0.5f);
                    long j10 = sA;
                    d0 d0Var2 = e0.f19470e;
                    long j11 = ((((long) sA2) & 65535) << 32) | ((j10 & 65535) << 48) | ((((long) sA3) & 65535) << 16) | ((((long) iMax) & 1023) << 6) | (((long) i11) & 63);
                    int i12 = c0.a.f3406d;
                    return j11;
                }
            }
        }
        throw new IllegalArgumentException(("red = " + f2 + ", green = " + f7 + ", blue = " + f10 + ", alpha = " + f11 + " outside the range for " + colorSpace).toString());
    }

    public static final long b(long j) {
        d0 d0Var = e0.f19470e;
        long j5 = (j & 4294967295L) << 32;
        int i7 = c0.a.f3406d;
        return j5;
    }

    public static final int c(int i7, int i10, int i11) {
        return Math.min(Math.max(0, i11 - i7), i10);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:29:0x004d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x004f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0051 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x0059  */
    /* JADX WARN: Code duplicated, block: B:36:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    public static boolean e(int i7, Rect rect, Rect rect2, Rect rect3) {
        int iS;
        int i10;
        int i11;
        boolean zF = f(i7, rect, rect2);
        if (f(i7, rect, rect3) || !zF) {
            return false;
        }
        if (i7 != 17) {
            if (i7 != 33) {
                if (i7 != 66) {
                    if (i7 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    if (rect.bottom <= rect3.top) {
                        if (i7 != 17 && i7 != 66) {
                            iS = s(i7, rect, rect2);
                            if (i7 != 17) {
                                i10 = rect.left;
                                i11 = rect3.left;
                            } else if (i7 != 33) {
                                i10 = rect.top;
                                i11 = rect3.top;
                            } else if (i7 != 66) {
                                i10 = rect3.right;
                                i11 = rect.right;
                            } else {
                                if (i7 == 130) {
                                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                }
                                i10 = rect3.bottom;
                                i11 = rect.bottom;
                            }
                            if (iS < Math.max(1, i10 - i11)) {
                                return false;
                            }
                        }
                    }
                } else if (rect.right <= rect3.left) {
                    if (i7 != 17) {
                        iS = s(i7, rect, rect2);
                        if (i7 != 17) {
                            i10 = rect.left;
                            i11 = rect3.left;
                        } else if (i7 != 33) {
                            i10 = rect.top;
                            i11 = rect3.top;
                        } else if (i7 != 66) {
                            i10 = rect3.right;
                            i11 = rect.right;
                        } else {
                            if (i7 == 130) {
                                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            }
                            i10 = rect3.bottom;
                            i11 = rect.bottom;
                        }
                        if (iS < Math.max(1, i10 - i11)) {
                            return false;
                        }
                    }
                }
            } else if (rect.top >= rect3.bottom) {
                if (i7 != 17) {
                    iS = s(i7, rect, rect2);
                    if (i7 != 17) {
                        i10 = rect.left;
                        i11 = rect3.left;
                    } else if (i7 != 33) {
                        i10 = rect.top;
                        i11 = rect3.top;
                    } else if (i7 != 66) {
                        i10 = rect3.right;
                        i11 = rect.right;
                    } else {
                        if (i7 == 130) {
                            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        }
                        i10 = rect3.bottom;
                        i11 = rect.bottom;
                    }
                    if (iS < Math.max(1, i10 - i11)) {
                        return false;
                    }
                }
            }
        } else if (rect.left >= rect3.right) {
            if (i7 != 17) {
                iS = s(i7, rect, rect2);
                if (i7 != 17) {
                    i10 = rect.left;
                    i11 = rect3.left;
                } else if (i7 != 33) {
                    i10 = rect.top;
                    i11 = rect3.top;
                } else if (i7 != 66) {
                    i10 = rect3.right;
                    i11 = rect.right;
                } else {
                    if (i7 == 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    i10 = rect3.bottom;
                    i11 = rect.bottom;
                }
                if (iS < Math.max(1, i10 - i11)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean f(int i7, Rect rect, Rect rect2) {
        if (i7 != 17) {
            if (i7 != 33) {
                if (i7 != 66) {
                    if (i7 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static final void g(String sectionName) {
        Intrinsics.checkNotNullParameter(sectionName, "sectionName");
        c0.d(sectionName);
    }

    public static final n8.f h(lq.d0 d0Var, vo.j jVar, int i7) {
        if (jVar == null || nq.l.f(jVar)) {
            return null;
        }
        int size = jVar.l().size() + i7;
        if (jVar.z()) {
            List listSubList = d0Var.l0().subList(i7, size);
            vo.l lVarG = jVar.g();
            return new n8.f(jVar, listSubList, h(d0Var, lVarG instanceof vo.j ? (vo.j) lVarG : null, size));
        }
        if (size != d0Var.l0().size()) {
            xp.e.o(jVar);
        }
        return new n8.f(jVar, d0Var.l0().subList(i7, d0Var.l0().size()), (n8.f) null);
    }

    public static final void i(int i7, int i10, int i11, int i12, int i13) {
        n8.i.c(i12 >= 0, "count (%d) ! >= 0", Integer.valueOf(i12));
        n8.i.c(i7 >= 0, "offset (%d) ! >= 0", Integer.valueOf(i7));
        n8.i.c(i11 >= 0, "otherOffset (%d) ! >= 0", Integer.valueOf(i11));
        n8.i.c(i7 + i12 <= i13, "offset (%d) + count (%d) ! <= %d", Integer.valueOf(i7), Integer.valueOf(i12), Integer.valueOf(i13));
        n8.i.c(i11 + i12 <= i10, "otherOffset (%d) + count (%d) ! <= %d", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i10));
    }

    public static ClassLoader j(ClassLoader classLoader) {
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        return contextClassLoader != null ? contextClassLoader : ClassLoader.getSystemClassLoader();
    }

    public static byte[] k(ArrayDeque arrayDeque, int i7) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i7) {
            return bArr;
        }
        int length = i7 - bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i7);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int iMin = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i7 - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    public static final List l(vo.j jVar) {
        List parameters;
        Object next;
        q0 q0VarN;
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        List listL = jVar.l();
        Intrinsics.checkNotNullExpressionValue(listL, "getDeclaredTypeParameters(...)");
        if (!jVar.z() && !(jVar.g() instanceof vo.b)) {
            return listL;
        }
        int i7 = bq.e.f3383a;
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        bq.b bVar = bq.b.f3378e;
        Sequence sequenceF = xq.r.f(xq.n.c(bVar, jVar), 1);
        vo.r predicate = vo.r.f21840v;
        Intrinsics.checkNotNullParameter(sequenceF, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        List listQ = xq.r.q(xq.r.k(xq.r.h(new xq.e(sequenceF, predicate, 1), vo.r.f21841w), vo.r.f21842x));
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Iterator it = xq.r.f(xq.n.c(bVar, jVar), 1).iterator();
        do {
            parameters = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(next instanceof vo.f));
        vo.f fVar = (vo.f) next;
        if (fVar != null && (q0VarN = fVar.n()) != null) {
            parameters = q0VarN.getParameters();
        }
        if (parameters == null) {
            parameters = n0.f14659d;
        }
        if (listQ.isEmpty() && parameters.isEmpty()) {
            List listL2 = jVar.l();
            Intrinsics.checkNotNullExpressionValue(listL2, "getDeclaredTypeParameters(...)");
            return listL2;
        }
        ArrayList<r0> arrayListV = CollectionsKt.V(listQ, parameters);
        ArrayList arrayList = new ArrayList(kotlin.collections.e0.l(arrayListV, 10));
        for (r0 r0Var : arrayListV) {
            Intrinsics.checkNotNull(r0Var);
            arrayList.add(new vo.e(r0Var, jVar, listL.size()));
        }
        return CollectionsKt.V(listL, arrayList);
    }

    public static eq.o m(String debugName, Collection types) {
        eq.o aVar;
        Intrinsics.checkNotNullParameter(debugName, "message");
        Intrinsics.checkNotNullParameter(types, "types");
        Collection collection = types;
        ArrayList arrayList = new ArrayList(kotlin.collections.e0.l(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((z) it.next()).J());
        }
        vq.g scopes = android.support.v4.media.session.b.p(arrayList);
        Intrinsics.checkNotNullParameter(debugName, "debugName");
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        int i7 = scopes.f21944d;
        if (i7 != 0) {
            aVar = i7 != 1 ? new eq.a(debugName, (eq.o[]) scopes.toArray(new eq.o[0])) : (eq.o) scopes.get(0);
        } else {
            aVar = eq.n.f8648b;
        }
        return scopes.f21944d <= 1 ? aVar : new eq.k(aVar);
    }

    /* JADX WARN: Code duplicated, block: B:120:0x0425  */
    /* JADX WARN: Code duplicated, block: B:121:0x0427  */
    /* JADX WARN: Code duplicated, block: B:123:0x042a A[LOOP:6: B:107:0x03ee->B:123:0x042a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:154:0x02f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x0436 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x02ec A[LOOP:1: B:62:0x02b2->B:75:0x02ec, LOOP_END] */
    public static final o n(Context context, v3.b configuration) {
        a3.l lVar;
        a3.m mVar;
        Iterator it;
        boolean z5;
        boolean zContainsKey;
        int i7;
        int i10;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        h4.b workTaskExecutor = new h4.b(configuration.f21380b);
        Context context2 = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context.applicationContext");
        f4.l executor = workTaskExecutor.f10327a;
        Intrinsics.checkNotNullExpressionValue(executor, "workTaskExecutor.serialTaskExecutor");
        s clock = configuration.f21381c;
        boolean z6 = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(executor, "queryExecutor");
        Intrinsics.checkNotNullParameter(clock, "clock");
        if (z6) {
            Intrinsics.checkNotNullParameter(context2, "context");
            Intrinsics.checkNotNullParameter(WorkDatabase.class, "klass");
            lVar = new a3.l(context2, null);
            lVar.f95i = true;
        } else {
            Intrinsics.checkNotNullParameter(context2, "context");
            Intrinsics.checkNotNullParameter(WorkDatabase.class, "klass");
            if (StringsKt.K("androidx.work.workdb")) {
                throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
            }
            a3.l lVar2 = new a3.l(context2, "androidx.work.workdb");
            lVar2.f94h = new com.discord.chat.input.views.d(context2, 9);
            lVar = lVar2;
        }
        Intrinsics.checkNotNullParameter(executor, "executor");
        lVar.f92f = executor;
        b callback = new b(clock);
        Intrinsics.checkNotNullParameter(callback, "callback");
        ArrayList arrayList = lVar.f89c;
        arrayList.add(callback);
        lVar.a(d.f22010h);
        lVar.a(new f(context2, 2, 3));
        lVar.a(d.f22011i);
        lVar.a(d.j);
        lVar.a(new f(context2, 5, 6));
        lVar.a(d.k);
        lVar.a(d.f22012l);
        lVar.a(d.f22013m);
        lVar.a(new f(context2));
        lVar.a(new f(context2, 10, 11));
        lVar.a(d.f22006d);
        lVar.a(d.f22007e);
        lVar.a(d.f22008f);
        lVar.a(d.f22009g);
        lVar.k = false;
        lVar.f96l = true;
        Executor executor2 = lVar.f92f;
        if (executor2 == null && lVar.f93g == null) {
            com.discord.misc.utilities.threading.a aVar = o.a.f17069d;
            lVar.f93g = aVar;
            lVar.f92f = aVar;
        } else if (executor2 != null && lVar.f93g == null) {
            lVar.f93g = executor2;
        } else if (executor2 == null) {
            lVar.f92f = lVar.f93g;
        }
        HashSet hashSet = lVar.f100p;
        LinkedHashSet linkedHashSet = lVar.f99o;
        if (hashSet != null) {
            Intrinsics.checkNotNull(hashSet);
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                int iIntValue = ((Number) it2.next()).intValue();
                if (linkedHashSet.contains(Integer.valueOf(iIntValue))) {
                    throw new IllegalArgumentException(kk.b.h(iIntValue, "Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: ").toString());
                }
            }
        }
        g3.c cVar = lVar.f94h;
        if (cVar == null) {
            cVar = new q8.c();
        }
        g3.c cVar2 = cVar;
        if (lVar.f97m > 0) {
            if (lVar.f88b != null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
        }
        boolean z7 = lVar.f95i;
        a3.m mVar2 = lVar.j;
        mVar2.getClass();
        Context context3 = lVar.f87a;
        Intrinsics.checkNotNullParameter(context3, "context");
        a3.m mVar3 = a3.m.f101d;
        a3.m mVar4 = a3.m.f103i;
        if (mVar2 != mVar3) {
            mVar = mVar2;
        } else {
            Object systemService = context3.getSystemService("activity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            ActivityManager activityManager = (ActivityManager) systemService;
            Intrinsics.checkNotNullParameter(activityManager, "activityManager");
            if (activityManager.isLowRamDevice()) {
                mVar2 = a3.m.f102e;
                mVar = mVar2;
            } else {
                mVar = mVar4;
            }
        }
        Executor executor3 = lVar.f92f;
        if (executor3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Executor executor4 = lVar.f93g;
        if (executor4 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        boolean z10 = lVar.k;
        boolean z11 = lVar.f96l;
        String str = lVar.f88b;
        fj.c cVar3 = lVar.f98n;
        ArrayList arrayList2 = lVar.f90d;
        ArrayList arrayList3 = lVar.f91e;
        a3.b configuration2 = new a3.b(context3, str, cVar2, cVar3, arrayList, z7, mVar, executor3, executor4, z10, z11, linkedHashSet, arrayList2, arrayList3);
        Intrinsics.checkNotNullParameter(WorkDatabase.class, "klass");
        Intrinsics.checkNotNullParameter("_Impl", "suffix");
        Package r11 = WorkDatabase.class.getPackage();
        Intrinsics.checkNotNull(r11);
        String fullPackage = r11.getName();
        String canonicalName = WorkDatabase.class.getCanonicalName();
        Intrinsics.checkNotNull(canonicalName);
        Intrinsics.checkNotNullExpressionValue(fullPackage, "fullPackage");
        if (fullPackage.length() != 0) {
            canonicalName = canonicalName.substring(fullPackage.length() + 1);
            Intrinsics.checkNotNullExpressionValue(canonicalName, "this as java.lang.String).substring(startIndex)");
        }
        String str2 = x.m(canonicalName, '.', '_') + "_Impl";
        try {
            Class<?> cls = Class.forName(fullPackage.length() == 0 ? str2 : fullPackage + '.' + str2, true, WorkDatabase.class.getClassLoader());
            Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
            WorkDatabase workDatabase = (WorkDatabase) cls.newInstance();
            a3.i iVar = workDatabase.f2821d;
            LinkedHashMap linkedHashMap = workDatabase.f2824g;
            Intrinsics.checkNotNullParameter(configuration2, "configuration");
            workDatabase.f2820c = workDatabase.e(configuration2);
            Set setI = workDatabase.i();
            BitSet bitSet = new BitSet();
            Iterator it3 = setI.iterator();
            while (true) {
                int i11 = -1;
                if (it3.hasNext()) {
                    Class cls2 = (Class) it3.next();
                    int size = arrayList3.size() - 1;
                    if (size >= 0) {
                        while (true) {
                            int i12 = size;
                            size = i12 - 1;
                            i7 = i11;
                            if (cls2.isAssignableFrom(arrayList3.get(i12).getClass())) {
                                bitSet.set(i12);
                                i10 = i12;
                                break;
                            }
                            if (size >= 0) {
                                i11 = i7;
                            }
                        }
                        if (i10 >= 0) {
                            throw new IllegalArgumentException(("A required auto migration spec (" + cls2.getCanonicalName() + ") is missing in the database configuration.").toString());
                        }
                        linkedHashMap.put(cls2, arrayList3.get(i10));
                    } else {
                        i7 = -1;
                    }
                    i10 = i7;
                    if (i10 >= 0) {
                        throw new IllegalArgumentException(("A required auto migration spec (" + cls2.getCanonicalName() + ") is missing in the database configuration.").toString());
                    }
                    linkedHashMap.put(cls2, arrayList3.get(i10));
                } else {
                    int size2 = arrayList3.size() - 1;
                    if (size2 >= 0) {
                        while (true) {
                            int i13 = size2 - 1;
                            if (!bitSet.get(size2)) {
                                throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                            }
                            if (i13 < 0) {
                                break;
                            }
                            size2 = i13;
                        }
                    }
                    for (b3.a aVar2 : workDatabase.g(linkedHashMap)) {
                        int i14 = aVar2.f3055a;
                        int i15 = aVar2.f3056b;
                        fj.c cVar4 = configuration2.f57d;
                        LinkedHashMap linkedHashMap2 = (LinkedHashMap) cVar4.f9267e;
                        if (linkedHashMap2.containsKey(Integer.valueOf(i14))) {
                            Map mapD = (Map) linkedHashMap2.get(Integer.valueOf(i14));
                            if (mapD == null) {
                                mapD = w0.d();
                            }
                            zContainsKey = mapD.containsKey(Integer.valueOf(i15));
                        } else {
                            zContainsKey = false;
                        }
                        if (!zContainsKey) {
                            cVar4.q(aVar2);
                        }
                    }
                    workDatabase.h().setWriteAheadLoggingEnabled(configuration2.f60g == mVar4);
                    workDatabase.f2823f = configuration2.f58e;
                    workDatabase.f2819b = configuration2.f61h;
                    Intrinsics.checkNotNullParameter(configuration2.f62i, "executor");
                    new ArrayDeque();
                    workDatabase.f2822e = configuration2.f59f;
                    Map mapJ = workDatabase.j();
                    BitSet bitSet2 = new BitSet();
                    Iterator it4 = mapJ.entrySet().iterator();
                    while (true) {
                        boolean zHasNext = it4.hasNext();
                        List list = configuration2.f64m;
                        if (!zHasNext) {
                            int size3 = list.size() - 1;
                            if (size3 >= 0) {
                                while (true) {
                                    int i16 = size3 - 1;
                                    if (!bitSet2.get(size3)) {
                                        throw new IllegalArgumentException("Unexpected type converter " + list.get(size3) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                                    }
                                    if (i16 >= 0) {
                                        size3 = i16;
                                    }
                                }
                            }
                            Context applicationContext = context.getApplicationContext();
                            Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
                            c4.l trackers = new c4.l(applicationContext, workTaskExecutor);
                            e processor = new e(context.getApplicationContext(), configuration, workTaskExecutor, workDatabase);
                            p schedulersCreator = p.f22055d;
                            Intrinsics.checkNotNullParameter(context, "context");
                            Intrinsics.checkNotNullParameter(configuration, "configuration");
                            Intrinsics.checkNotNullParameter(workTaskExecutor, "workTaskExecutor");
                            Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
                            Intrinsics.checkNotNullParameter(trackers, "trackers");
                            Intrinsics.checkNotNullParameter(processor, "processor");
                            Intrinsics.checkNotNullParameter(schedulersCreator, "schedulersCreator");
                            return new o(context.getApplicationContext(), configuration, workTaskExecutor, workDatabase, (List) schedulersCreator.invoke(context, configuration, workTaskExecutor, workDatabase, trackers, processor), processor, trackers);
                        }
                        Map.Entry entry = (Map.Entry) it4.next();
                        Class cls3 = (Class) entry.getKey();
                        for (Class cls4 : (List) entry.getValue()) {
                            int size4 = list.size() - 1;
                            if (size4 >= 0) {
                                while (true) {
                                    int i17 = size4 - 1;
                                    it = it4;
                                    if (cls4.isAssignableFrom(list.get(size4).getClass())) {
                                        bitSet2.set(size4);
                                        break;
                                    }
                                    if (i17 >= 0) {
                                        size4 = i17;
                                        it4 = it;
                                    }
                                }
                                if (size4 >= 0) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (z5) {
                                    throw new IllegalArgumentException(("A required type converter (" + cls4 + ") for " + cls3.getCanonicalName() + " is missing in the database configuration.").toString());
                                }
                                workDatabase.j.put(cls4, list.get(size4));
                                it4 = it;
                            } else {
                                it = it4;
                            }
                            size4 = -1;
                            if (size4 >= 0) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (z5) {
                                throw new IllegalArgumentException(("A required type converter (" + cls4 + ") for " + cls3.getCanonicalName() + " is missing in the database configuration.").toString());
                            }
                            workDatabase.j.put(cls4, list.get(size4));
                            it4 = it;
                        }
                    }
                }
            }
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Cannot find implementation for " + WorkDatabase.class.getCanonicalName() + ". " + str2 + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor " + WorkDatabase.class + ".canonicalName");
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + WorkDatabase.class + ".canonicalName");
        }
    }

    public static boolean o(File file) {
        File[] fileArrListFiles;
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                o(file2);
            }
        }
        return file.delete();
    }

    public static boolean p(int i7, Rect rect, Rect rect2) {
        if (i7 == 17) {
            int i10 = rect.right;
            int i11 = rect2.right;
            return (i10 > i11 || rect.left >= i11) && rect.left > rect2.left;
        }
        if (i7 == 33) {
            int i12 = rect.bottom;
            int i13 = rect2.bottom;
            return (i12 > i13 || rect.top >= i13) && rect.top > rect2.top;
        }
        if (i7 == 66) {
            int i14 = rect.left;
            int i15 = rect2.left;
            return (i14 < i15 || rect.right <= i15) && rect.right < rect2.right;
        }
        if (i7 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i16 = rect.top;
        int i17 = rect2.top;
        return (i16 < i17 || rect.bottom <= i17) && rect.bottom < rect2.bottom;
    }

    public static boolean q(String str) {
        HashSet<r3.c> hashSet = new HashSet();
        for (r3.c cVar : r3.c.values()) {
            hashSet.add(cVar);
        }
        HashSet<r3.c> hashSet2 = new HashSet();
        for (r3.c cVar2 : hashSet) {
            if (cVar2.f19193d.equals(str)) {
                hashSet2.add(cVar2);
            }
        }
        if (hashSet2.isEmpty()) {
            throw new RuntimeException("Unknown feature ".concat(str));
        }
        for (r3.c cVar3 : hashSet2) {
            int i7 = cVar3.f19195i;
            if ((i7 != -1 && Build.VERSION.SDK_INT >= i7) || cVar3.a()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean r(vo.f classDescriptor) {
        Intrinsics.checkNotNullParameter(so.d.f20333a, "<this>");
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        if (!xp.e.l(classDescriptor)) {
            return false;
        }
        LinkedHashSet linkedHashSet = so.d.f20334b;
        up.b bVarF = bq.e.f(classDescriptor);
        return CollectionsKt.E(linkedHashSet, bVarF != null ? bVarF.e() : null);
    }

    public static int s(int i7, Rect rect, Rect rect2) {
        int i10;
        int i11;
        if (i7 == 17) {
            i10 = rect.left;
            i11 = rect2.right;
        } else if (i7 == 33) {
            i10 = rect.top;
            i11 = rect2.bottom;
        } else if (i7 == 66) {
            i10 = rect2.left;
            i11 = rect.right;
        } else {
            if (i7 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i10 = rect2.top;
            i11 = rect.bottom;
        }
        return Math.max(0, i10 - i11);
    }

    public static int t(int i7, Rect rect, Rect rect2) {
        if (i7 != 17) {
            if (i7 != 33) {
                if (i7 != 66) {
                    if (i7 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static final int u(jo.c cVar, IntRange range) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        boolean zIsEmpty = range.isEmpty();
        int i7 = range.f14688d;
        if (zIsEmpty) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + range);
        }
        int i10 = range.f14689e;
        if (i10 < Integer.MAX_VALUE) {
            cVar.getClass();
            return jo.d.f13989e.c(i7, i10 + 1);
        }
        if (i7 <= Integer.MIN_VALUE) {
            cVar.getClass();
            return jo.d.f13989e.b();
        }
        cVar.getClass();
        return jo.d.f13989e.c(i7 - 1, i10) + 1;
    }

    public static gl.c v(Function1 builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        gl.b bVar = new gl.b();
        bVar.f10110a = Float.NaN;
        bVar.f10118i = true;
        builder.invoke(bVar);
        return new gl.c(bVar.f10110a, bVar.f10111b, bVar.f10112c, bVar.f10113d, bVar.f10114e, bVar.f10115f, bVar.f10116g, bVar.f10117h, bVar.f10118i);
    }

    public static final boolean w(String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return (Intrinsics.areEqual(method, "GET") || Intrinsics.areEqual(method, "HEAD")) ? false : true;
    }

    public static String x(X509Certificate certificate) {
        Intrinsics.checkNotNullParameter(certificate, "certificate");
        if (certificate == null) {
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
        }
        Intrinsics.checkNotNullParameter(certificate, "<this>");
        ByteString byteString = ByteString.f17414v;
        byte[] encoded = certificate.getPublicKey().getEncoded();
        Intrinsics.checkNotNullExpressionValue(encoded, "publicKey.encoded");
        return Intrinsics.stringPlus("sha256/", io.sentry.hints.j.E(encoded).b("SHA-256").a());
    }

    public static int y(float f2) {
        return (int) (f2 + (f2 < 0.0f ? -0.5f : 0.5f));
    }

    public void d(Window window) {
        Intrinsics.checkNotNullParameter(window, "window");
    }

    public abstract void z(v vVar, v vVar2, Window window, View view, boolean z5, boolean z6);
}
