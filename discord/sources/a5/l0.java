package a5;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.UserManager;
import android.util.Base64;
import androidx.work.impl.WorkDatabase;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.gms.tasks.Task;
import gc.h1;
import io.sentry.Hint;
import io.sentry.android.core.r0;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.v0;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import lq.b1;
import po.a2;
import vo.s0;
import vo.u0;
import yo.q0;

/* JADX INFO: loaded from: classes.dex */
public abstract class l0 {
    public static final ArrayList A(lq.d0 type) {
        Intrinsics.checkNotNullParameter(type, "type");
        ArrayList arrayListB = B(lq.c.b(type));
        if (arrayListB == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(kotlin.collections.e0.l(arrayListB, 10));
        Iterator it = arrayListB.iterator();
        while (it.hasNext()) {
            arrayList.add("unbox-impl-" + ((String) it.next()));
        }
        vo.i iVarG = type.r0().g();
        Intrinsics.checkNotNull(iVarG, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        Class clsK = a2.k((vo.f) iVarG);
        Intrinsics.checkNotNull(clsK);
        ArrayList arrayList2 = new ArrayList(kotlin.collections.e0.l(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(clsK.getDeclaredMethod((String) it2.next(), null));
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    public static final ArrayList B(lq.d0 d0Var) {
        ?? C;
        if (!xp.g.h(d0Var)) {
            return null;
        }
        vo.i iVarG = d0Var.r0().g();
        Intrinsics.checkNotNull(iVarG, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        vo.f fVar = (vo.f) iVarG;
        int i7 = bq.e.f3383a;
        s0 s0VarJ0 = fVar != null ? fVar.j0() : null;
        vo.a0 a0Var = s0VarJ0 instanceof vo.a0 ? (vo.a0) s0VarJ0 : null;
        Intrinsics.checkNotNull(a0Var);
        ArrayList<Pair> arrayList = a0Var.f21786a;
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            up.e eVar = (up.e) pair.f14612d;
            ArrayList arrayListB = B((lq.d0) pair.f14613e);
            if (arrayListB != null) {
                C = new ArrayList(kotlin.collections.e0.l(arrayListB, 10));
                Iterator it = arrayListB.iterator();
                while (it.hasNext()) {
                    C.add(eVar.c() + '-' + ((String) it.next()));
                }
            } else {
                C = kotlin.collections.c0.c(eVar.c());
            }
            kotlin.collections.i0.o(arrayList2, C);
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0099  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ce  */
    public static Matrix C(RectF rectF, RectF rectF2, String str, int i7) {
        double d6;
        double d7;
        double d8;
        double d9;
        double d10;
        double d11 = rectF.left;
        double d12 = rectF.top;
        double dWidth = rectF.width();
        double dHeight = rectF.height();
        double d13 = rectF2.left;
        double d14 = rectF2.top;
        double dWidth2 = rectF2.width();
        double dHeight2 = rectF2.height();
        double dMax = dWidth2 / dWidth;
        double d15 = dHeight2 / dHeight;
        double d16 = d13 - (d11 * dMax);
        double d17 = d14 - (d12 * d15);
        if (i7 == 2) {
            dMax = Math.min(dMax, d15);
            if (dMax > 1.0d) {
                d8 = d16 - (((dWidth2 / dMax) - dWidth) / 2.0d);
                d10 = (dHeight2 / dMax) - dHeight;
            } else {
                d8 = d16 - ((dWidth2 - (dWidth * dMax)) / 2.0d);
                d10 = dHeight2 - (dHeight * dMax);
            }
            d9 = d17 - (d10 / 2.0d);
            d15 = dMax;
        } else {
            if (!str.equals(ViewProps.NONE) && i7 == 0) {
                dMax = Math.min(dMax, d15);
            } else if (str.equals(ViewProps.NONE) || i7 != 1) {
                d6 = d13 - (d11 * dMax);
                d7 = d14 - (d12 * d15);
                if (str.contains("xMid")) {
                    d6 += (dWidth2 - (dWidth * dMax)) / 2.0d;
                }
                if (str.contains("xMax")) {
                    d8 = (dWidth2 - (dWidth * dMax)) + d6;
                } else {
                    d8 = d6;
                }
                if (str.contains("YMid")) {
                    d9 = ((dHeight2 - (dHeight * d15)) / 2.0d) + d7;
                } else {
                    d9 = d7;
                }
                if (str.contains("YMax")) {
                    d9 = (dHeight2 - (dHeight * d15)) + d9;
                }
            } else {
                dMax = Math.max(dMax, d15);
            }
            d15 = dMax;
            d6 = d13 - (d11 * dMax);
            d7 = d14 - (d12 * d15);
            if (str.contains("xMid")) {
                d6 += (dWidth2 - (dWidth * dMax)) / 2.0d;
            }
            if (str.contains("xMax")) {
                d8 = (dWidth2 - (dWidth * dMax)) + d6;
            } else {
                d8 = d6;
            }
            if (str.contains("YMid")) {
                d9 = ((dHeight2 - (dHeight * d15)) / 2.0d) + d7;
            } else {
                d9 = d7;
            }
            if (str.contains("YMax")) {
                d9 = (dHeight2 - (dHeight * d15)) + d9;
            }
        }
        double d18 = d8;
        double d19 = d9;
        Matrix matrix = new Matrix();
        matrix.postTranslate((float) d18, (float) d19);
        matrix.preScale((float) dMax, (float) d15);
        return matrix;
    }

    public static h3.c D(ga.l refHolder, SQLiteDatabase sqLiteDatabase) {
        Intrinsics.checkNotNullParameter(refHolder, "refHolder");
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        h3.c cVar = (h3.c) refHolder.f9547e;
        if (cVar != null) {
            Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
            if (Intrinsics.areEqual(cVar.f10297d, sqLiteDatabase)) {
                return cVar;
            }
        }
        h3.c cVar2 = new h3.c(sqLiteDatabase);
        refHolder.f9547e = cVar2;
        return cVar2;
    }

    public static boolean E(Hint hint, Class cls) {
        return cls.isInstance(hint.b("sentry:typeCheckHint"));
    }

    public static final v3.a F(int i7) {
        if (i7 == 0) {
            return v3.a.f21376d;
        }
        if (i7 == 1) {
            return v3.a.f21377e;
        }
        throw new IllegalArgumentException(s0.g.d(i7, "Could not convert ", " to BackoffPolicy"));
    }

    public static final v3.r G(int i7) {
        if (i7 == 0) {
            return v3.r.f21420d;
        }
        if (i7 == 1) {
            return v3.r.f21421e;
        }
        if (i7 == 2) {
            return v3.r.f21422i;
        }
        if (i7 == 3) {
            return v3.r.f21423v;
        }
        if (i7 == 4) {
            return v3.r.f21424w;
        }
        if (Build.VERSION.SDK_INT < 30 || i7 != 5) {
            throw new IllegalArgumentException(s0.g.d(i7, "Could not convert ", " to NetworkType"));
        }
        return v3.r.f21425x;
    }

    public static final v3.y H(int i7) {
        if (i7 == 0) {
            return v3.y.f21432d;
        }
        if (i7 == 1) {
            return v3.y.f21433e;
        }
        throw new IllegalArgumentException(s0.g.d(i7, "Could not convert ", " to OutOfQuotaPolicy"));
    }

    public static final v3.z I(int i7) {
        if (i7 == 0) {
            return v3.z.f21435d;
        }
        if (i7 == 1) {
            return v3.z.f21436e;
        }
        if (i7 == 2) {
            return v3.z.f21437i;
        }
        if (i7 == 3) {
            return v3.z.f21438v;
        }
        if (i7 == 4) {
            return v3.z.f21439w;
        }
        if (i7 == 5) {
            return v3.z.f21440x;
        }
        throw new IllegalArgumentException(s0.g.d(i7, "Could not convert ", " to State"));
    }

    public static boolean J(Hint hint) {
        return Boolean.TRUE.equals(hint.c(Boolean.class, "sentry:isFromHybridSdk"));
    }

    public static boolean K(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }

    public static Metadata L(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            String str = (String) list.get(i7);
            int i10 = je.e0.f13788a;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                je.b.N("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(fd.b.a(new je.w(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e10) {
                    je.b.O("VorbisUtil", "Failed to parse vorbis picture", e10);
                }
            } else {
                arrayList.add(new kd.a(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    public static final Cursor M(WorkDatabase db, a3.o sqLiteQuery) {
        Intrinsics.checkNotNullParameter(db, "db");
        Intrinsics.checkNotNullParameter(sqLiteQuery, "sqLiteQuery");
        return db.m(sqLiteQuery);
    }

    public static u4.c N(je.w wVar, boolean z5, boolean z6) throws h1 {
        if (z5) {
            S(3, wVar, false);
        }
        wVar.s((int) wVar.l(), di.d.f7631c);
        long jL = wVar.l();
        String[] strArr = new String[(int) jL];
        for (int i7 = 0; i7 < jL; i7++) {
            strArr[i7] = wVar.s((int) wVar.l(), di.d.f7631c);
        }
        if (z6 && (wVar.u() & 1) == 0) {
            throw h1.a("framing bit expected to be set", null);
        }
        return new u4.c(strArr);
    }

    public static boolean O(Hint hint) {
        return !(io.sentry.hints.d.class.isInstance(hint.b("sentry:typeCheckHint")) || io.sentry.hints.b.class.isInstance(hint.b("sentry:typeCheckHint"))) || r0.class.isInstance(hint.b("sentry:typeCheckHint"));
    }

    public static final int P(v3.z state) {
        Intrinsics.checkNotNullParameter(state, "state");
        int iOrdinal = state.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i7 = 1;
        if (iOrdinal != 1) {
            i7 = 2;
            if (iOrdinal != 2) {
                i7 = 3;
                if (iOrdinal != 3) {
                    i7 = 4;
                    if (iOrdinal != 4) {
                        if (iOrdinal == 5) {
                            return 5;
                        }
                        throw new rn.n();
                    }
                }
            }
        }
        return i7;
    }

    public static final Class Q(lq.z zVar) {
        lq.d0 d0VarI;
        Class clsR = R(zVar.r0().g());
        if (clsR == null) {
            return null;
        }
        if (b1.e(zVar) && ((d0VarI = xp.g.i(zVar)) == null || b1.e(d0VarI) || so.i.G(d0VarI))) {
            return null;
        }
        return clsR;
    }

    public static final Class R(vo.l lVar) {
        if (!(lVar instanceof vo.f) || !xp.g.b(lVar)) {
            return null;
        }
        vo.f fVar = (vo.f) lVar;
        Class clsK = a2.k(fVar);
        if (clsK != null) {
            return clsK;
        }
        throw new ar.a0("Class object for the class " + fVar.getName() + " cannot be found (classId=" + bq.e.f((vo.i) lVar) + ')');
    }

    public static boolean S(int i7, je.w wVar, boolean z5) throws h1 {
        if (wVar.a() < 7) {
            if (z5) {
                return false;
            }
            throw h1.a("too short header: " + wVar.a(), null);
        }
        if (wVar.u() != i7) {
            if (z5) {
                return false;
            }
            throw h1.a("expected header type " + Integer.toHexString(i7), null);
        }
        if (wVar.u() == 118 && wVar.u() == 111 && wVar.u() == 114 && wVar.u() == 98 && wVar.u() == 105 && wVar.u() == 115) {
            return true;
        }
        if (z5) {
            return false;
        }
        throw h1.a("expected characters 'vorbis'", null);
    }

    public static Object T(Task task) throws ExecutionException {
        if (task.m()) {
            return task.i();
        }
        if (task.k()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.h());
    }

    public static /* synthetic */ String U(int i7, String str) {
        return str + i7;
    }

    public static void V(int i7, Object[] objArr) {
        for (int i10 = 0; i10 < i7; i10++) {
            if (objArr[i10] == null) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 9);
                sb2.append("at index ");
                sb2.append(i10);
                throw new NullPointerException(sb2.toString());
            }
        }
    }

    public static final up.b a(String str) {
        up.c cVar = up.h.f21280a;
        up.c cVar2 = up.h.f21280a;
        up.e eVarE = up.e.e(str);
        Intrinsics.checkNotNullExpressionValue(eVarE, "identifier(...)");
        return new up.b(cVar2, eVarE);
    }

    public static final up.b b(String str) {
        up.c cVar = up.h.f21280a;
        up.c cVar2 = up.h.f21282c;
        up.e eVarE = up.e.e(str);
        Intrinsics.checkNotNullExpressionValue(eVarE, "identifier(...)");
        return new up.b(cVar2, eVarE);
    }

    public static final void c(LinkedHashMap linkedHashMap) {
        Set<Map.Entry> setEntrySet = linkedHashMap.entrySet();
        int iA = v0.a(kotlin.collections.e0.l(setEntrySet, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iA);
        for (Map.Entry entry : setEntrySet) {
            linkedHashMap2.put(entry.getValue(), entry.getKey());
        }
    }

    public static final up.b d(up.e eVar) {
        up.c cVar = up.h.f21280a;
        up.b bVar = up.h.k;
        up.c cVar2 = bVar.f21258a;
        up.e eVarE = up.e.e(eVar.c().concat(bVar.f().c()));
        Intrinsics.checkNotNullExpressionValue(eVarE, "identifier(...)");
        return new up.b(cVar2, eVarE);
    }

    public static final void e(String str) {
        up.c cVar = up.h.f21280a;
        up.c packageFqName = up.h.f21283d;
        up.e topLevelName = up.e.e(str);
        Intrinsics.checkNotNullExpressionValue(topLevelName, "identifier(...)");
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(topLevelName, "topLevelName");
        up.c cVar2 = up.c.f21261c;
        up.c relativeClassName = zs.a.Y(topLevelName);
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(relativeClassName, "relativeClassName");
        relativeClassName.f21262a.c();
    }

    public static final up.b f(String str) {
        up.c cVar = up.h.f21280a;
        up.c cVar2 = up.h.f21281b;
        up.e eVarE = up.e.e(str);
        Intrinsics.checkNotNullExpressionValue(eVarE, "identifier(...)");
        return new up.b(cVar2, eVarE);
    }

    public static final up.b g(up.b bVar) {
        up.c cVar = up.h.f21280a;
        up.c cVar2 = up.h.f21280a;
        up.e eVarE = up.e.e("U".concat(bVar.f().c()));
        Intrinsics.checkNotNullExpressionValue(eVarE, "identifier(...)");
        return new up.b(cVar2, eVarE);
    }

    public static Object h(Task task) throws InterruptedException {
        af.w.f("Must not be called on the main application thread");
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
            throw new IllegalStateException("Must not be called on GoogleApiHandler thread.");
        }
        af.w.h(task, "Task must not be null");
        if (task.l()) {
            return T(task);
        }
        u4.b bVar = new u4.b(15);
        Executor executor = ig.h.f11765b;
        task.e(executor, bVar);
        task.c(executor, bVar);
        task.a(executor, bVar);
        ((CountDownLatch) bVar.f20945e).await();
        return T(task);
    }

    public static Object i(Task task, long j) throws TimeoutException {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        af.w.f("Must not be called on the main application thread");
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
            throw new IllegalStateException("Must not be called on GoogleApiHandler thread.");
        }
        af.w.h(task, "Task must not be null");
        af.w.h(timeUnit, "TimeUnit must not be null");
        if (task.l()) {
            return T(task);
        }
        u4.b bVar = new u4.b(15);
        Executor executor = ig.h.f11765b;
        task.e(executor, bVar);
        task.c(executor, bVar);
        task.a(executor, bVar);
        if (((CountDownLatch) bVar.f20945e).await(j, timeUnit)) {
            return T(task);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static final LinkedHashSet j(byte[] bytes) throws IOException {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bytes.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i7 = objectInputStream.readInt();
                    for (int i10 = 0; i10 < i7; i10++) {
                        Uri uri = Uri.parse(objectInputStream.readUTF());
                        boolean z5 = objectInputStream.readBoolean();
                        Intrinsics.checkNotNullExpressionValue(uri, "uri");
                        linkedHashSet.add(new v3.d(z5, uri));
                    }
                    Unit unit = Unit.f14616a;
                    objectInputStream.close();
                    Unit unit2 = Unit.f14616a;
                    byteArrayInputStream.close();
                    return linkedHashSet;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        ls.d.k(objectInputStream, th2);
                        throw th3;
                    }
                }
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                ls.d.k(byteArrayInputStream, th4);
                throw th5;
            }
        }
    }

    public static ig.l k(Callable callable, Executor executor) {
        af.w.h(executor, "Executor must not be null");
        ig.l lVar = new ig.l();
        executor.execute(new hi.o(14, lVar, callable));
        return lVar;
    }

    public static void l(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static final Object m(Object obj, vo.d descriptor) {
        lq.z zVarY;
        Class clsQ;
        Method methodZ;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return (((descriptor instanceof vo.l0) && xp.g.e((u0) descriptor)) || (zVarY = y(descriptor)) == null || (clsQ = Q(zVarY)) == null || (methodZ = z(clsQ, descriptor)) == null) ? obj : methodZ.invoke(obj, null);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00e9  */
    public static ap.b n(Class klass) {
        gs.o oVar;
        np.l bVar;
        op.a aVar;
        Intrinsics.checkNotNullParameter(klass, "klass");
        op.e visitor = new op.e();
        visitor.f17493d = null;
        visitor.f17494e = null;
        visitor.f17495i = 0;
        visitor.f17496v = null;
        visitor.f17497w = null;
        visitor.f17498x = null;
        visitor.f17499y = null;
        visitor.E = null;
        Intrinsics.checkNotNullParameter(klass, "klass");
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        Iterator it = ArrayIteratorKt.iterator(klass.getDeclaredAnnotations());
        while (it.hasNext()) {
            Annotation annotation = (Annotation) it.next();
            Intrinsics.checkNotNull(annotation);
            Class clsB = gn.h.B(gn.h.z(annotation));
            up.b bVarA = bp.c.a(clsB);
            Intrinsics.checkNotNullParameter(annotation, "annotation");
            up.c cVarA = bVarA.a();
            if (cVarA.equals(ep.a0.f8488a)) {
                bVar = new op.c(0, visitor);
            } else if (cVarA.equals(ep.a0.f8500o)) {
                bVar = new ga.l(27, visitor);
            } else if (op.e.F || visitor.f17499y != null || (aVar = (op.a) op.e.G.get(bVarA)) == null) {
                bVar = null;
            } else {
                visitor.f17499y = aVar;
                bVar = new u4.b(29, visitor);
            }
            if (bVar != null) {
                zs.a.P(bVar, annotation, clsB);
            }
        }
        rp.e eVar = rp.e.f19536g;
        if (visitor.f17499y == null || visitor.f17493d == null) {
            oVar = null;
        } else {
            rp.e eVar2 = new rp.e(visitor.f17493d, (visitor.f17495i & 8) != 0);
            if (eVar2.b(eVar)) {
                op.a aVar2 = visitor.f17499y;
                if ((aVar2 == op.a.CLASS || aVar2 == op.a.FILE_FACADE || aVar2 == op.a.MULTIFILE_CLASS_PART) && visitor.f17496v == null) {
                    oVar = null;
                }
            } else {
                visitor.f17498x = visitor.f17496v;
                visitor.f17496v = null;
            }
            String[] strArr = visitor.E;
            if (strArr != null) {
                tp.a.a(strArr);
            }
            oVar = new gs.o(visitor.f17499y, eVar2, visitor.f17496v, visitor.f17498x, visitor.f17497w, visitor.f17494e, visitor.f17495i);
        }
        if (oVar == null) {
            return null;
        }
        return new ap.b(klass, oVar);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0054  */
    /* JADX WARN: Code duplicated, block: B:23:0x005e  */
    /* JADX WARN: Code duplicated, block: B:28:0x007b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0082  */
    /* JADX WARN: Code duplicated, block: B:40:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:? A[LOOP:0: B:21:0x0058->B:41:?, LOOP_END, SYNTHETIC] */
    public static final qo.g o(qo.g gVar, vo.d descriptor, boolean z5) {
        List listL;
        Iterator it;
        lq.z type;
        lq.z returnType;
        lq.z zVarY;
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!xp.g.a(descriptor)) {
            List listZ = descriptor.Z();
            Intrinsics.checkNotNullExpressionValue(listZ, "getContextReceiverParameters(...)");
            if (listZ != null && listZ.isEmpty()) {
                listL = descriptor.L();
                Intrinsics.checkNotNullExpressionValue(listL, "getValueParameters(...)");
                if (listL == null) {
                    it = listL.iterator();
                    while (it.hasNext()) {
                        type = ((q0) it.next()).getType();
                        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                        if (xp.g.g(type)) {
                        }
                    }
                    returnType = descriptor.getReturnType();
                    if (returnType != null) {
                    }
                }
                it = listL.iterator();
                while (it.hasNext()) {
                    type = ((q0) it.next()).getType();
                    Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                    if (xp.g.g(type)) {
                    }
                }
                returnType = descriptor.getReturnType();
                if (returnType != null) {
                }
            }
            Iterator it2 = listZ.iterator();
            while (it2.hasNext()) {
                lq.z type2 = ((yo.t) it2.next()).getType();
                Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                if (xp.g.g(type2)) {
                }
            }
            listL = descriptor.L();
            Intrinsics.checkNotNullExpressionValue(listL, "getValueParameters(...)");
            if (listL == null && listL.isEmpty()) {
                returnType = descriptor.getReturnType();
                return returnType != null ? gVar : gVar;
            }
            it = listL.iterator();
            while (it.hasNext()) {
                type = ((q0) it.next()).getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                if (xp.g.g(type)) {
                }
            }
            returnType = descriptor.getReturnType();
            if ((returnType != null || !xp.g.c(returnType)) && ((zVarY = y(descriptor)) == null || !xp.g.g(zVarY))) {
            }
        }
        return new qo.c0(gVar, descriptor, z5);
    }

    public static Hint p(Object obj) {
        Hint hint = new Hint();
        hint.d(obj, "sentry:typeCheckHint");
        return hint;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00c0  */
    public static final int q(RotationOptions rotationOptions, ResizeOptions resizeOptions, EncodedImage encodedImage, int i7) {
        float f2;
        int rotationAngle;
        Intrinsics.checkNotNullParameter(rotationOptions, "rotationOptions");
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        int i10 = 1;
        if (!EncodedImage.isMetaDataAvailable(encodedImage)) {
            return 1;
        }
        Intrinsics.checkNotNullParameter(rotationOptions, "rotationOptions");
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        if (!EncodedImage.isMetaDataAvailable(encodedImage)) {
            throw new IllegalStateException("Check failed.");
        }
        int i11 = 2;
        if (resizeOptions != null) {
            int i12 = resizeOptions.f4817a;
            int i13 = resizeOptions.f4818b;
            if (i13 <= 0 || i12 <= 0 || encodedImage.getWidth() == 0 || encodedImage.getHeight() == 0) {
                f2 = 1.0f;
            } else {
                if (rotationOptions.a()) {
                    rotationAngle = encodedImage.getRotationAngle();
                    if (rotationAngle != 0 && rotationAngle != 90 && rotationAngle != 180 && rotationAngle != 270) {
                        throw new IllegalStateException("Check failed.");
                    }
                } else {
                    rotationAngle = 0;
                }
                boolean z5 = rotationAngle == 90 || rotationAngle == 270;
                int height = z5 ? encodedImage.getHeight() : encodedImage.getWidth();
                int width = z5 ? encodedImage.getWidth() : encodedImage.getHeight();
                float f7 = i12 / height;
                float f10 = i13 / width;
                f2 = f7 < f10 ? f10 : f7;
                Object[] objArr = {Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(height), Integer.valueOf(width), Float.valueOf(f7), Float.valueOf(f10), Float.valueOf(f2)};
                if (o8.a.f17171a.isLoggable(2)) {
                    o8.a.f17171a.v("DownsampleUtil", String.format(null, "Downsample - Specified size: %dx%d, image size: %dx%d ratio: %.1f x %.1f, ratio: %.3f", objArr));
                }
            }
        } else {
            f2 = 1.0f;
        }
        double d6 = 1.0d;
        if (encodedImage.getImageFormat() == z9.b.f23618a) {
            if (f2 <= 0.6666667f) {
                i10 = 2;
                while (true) {
                    int i14 = i10 * 2;
                    double d7 = 1.0d / ((double) i14);
                    if ((((double) 0.33333334f) * d7) + d7 <= f2) {
                        break;
                    }
                    i10 = i14;
                }
            }
        } else if (f2 <= 0.6666667f) {
            while (true) {
                double d8 = i11;
                int i15 = i10;
                if (((d6 / (Math.pow(d8, 2.0d) - d8)) * ((double) 0.33333334f)) + (d6 / d8) <= f2) {
                    break;
                }
                i11++;
                i10 = i15;
                d6 = 1.0d;
            }
            i10 = i11 - 1;
        }
        int iMax = Math.max(encodedImage.getHeight(), encodedImage.getWidth());
        float f11 = resizeOptions != null ? 2048.0f : i7;
        while (iMax / i10 > f11) {
            i10 = encodedImage.getImageFormat() == z9.b.f23618a ? i10 * 2 : i10 + 1;
        }
        return i10;
    }

    public static float r(float f2, float f7, float f10) {
        float f11 = f2 / (f10 / 2.0f);
        float f12 = f7 / 2.0f;
        if (f11 < 1.0f) {
            return (f12 * f11 * f11 * f11) + 0.0f;
        }
        float f13 = f11 - 2.0f;
        return (((f13 * f13 * f13) + 2.0f) * f12) + 0.0f;
    }

    public static final int s(int i7, Object obj) {
        return (i7 * 31) + (obj != null ? obj.hashCode() : 0);
    }

    public static final ap.b t(ue.i iVar, up.b classId, rp.e metadataVersion) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        fj.c cVarI = iVar.i(classId, metadataVersion);
        if (cVarI != null) {
            return (ap.b) cVarI.f9267e;
        }
        return null;
    }

    public static ig.l u(Exception exc) {
        ig.l lVar = new ig.l();
        lVar.p(exc);
        return lVar;
    }

    public static ig.l v(Object obj) {
        ig.l lVar = new ig.l();
        lVar.q(obj);
        return lVar;
    }

    public static cs.t w(String protocol) throws IOException {
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        if (Intrinsics.areEqual(protocol, "http/1.0")) {
            return cs.t.HTTP_1_0;
        }
        if (Intrinsics.areEqual(protocol, "http/1.1")) {
            return cs.t.HTTP_1_1;
        }
        if (Intrinsics.areEqual(protocol, "h2_prior_knowledge")) {
            return cs.t.H2_PRIOR_KNOWLEDGE;
        }
        if (Intrinsics.areEqual(protocol, "h2")) {
            return cs.t.HTTP_2;
        }
        if (Intrinsics.areEqual(protocol, "spdy/3.1")) {
            return cs.t.SPDY_3;
        }
        if (Intrinsics.areEqual(protocol, "quic")) {
            return cs.t.QUIC;
        }
        throw new IOException(Intrinsics.stringPlus("Unexpected protocol: ", protocol));
    }

    public static Set x() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static final lq.z y(vo.d dVar) {
        yo.t tVarV = dVar.V();
        yo.t tVarS = dVar.S();
        if (tVarV != null) {
            return tVarV.getType();
        }
        if (tVarS != null) {
            if (dVar instanceof vo.k) {
                return tVarS.getType();
            }
            vo.l lVarG = dVar.g();
            vo.f fVar = lVarG instanceof vo.f ? (vo.f) lVarG : null;
            if (fVar != null) {
                return fVar.j();
            }
        }
        return null;
    }

    public static final Method z(Class cls, vo.d descriptor) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        try {
            Method declaredMethod = cls.getDeclaredMethod("unbox-impl", null);
            Intrinsics.checkNotNull(declaredMethod);
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new ar.a0("No unbox method found in inline class: " + cls + " (calling " + descriptor + ')');
        }
    }
}
