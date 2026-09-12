package e4;

import a5.g0;
import a5.i0;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.work.impl.WorkDatabase_Impl;
import com.android.billingclient.api.BillingResult;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import com.facebook.imagepipeline.image.EncodedImage;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.internal.play_billing.a4;
import com.google.android.gms.internal.play_billing.b4;
import com.google.android.gms.internal.play_billing.c4;
import com.google.android.gms.internal.play_billing.d4;
import com.google.android.gms.internal.play_billing.g4;
import com.google.android.gms.internal.play_billing.i4;
import com.google.android.gms.internal.play_billing.j4;
import com.google.android.gms.internal.play_billing.k4;
import com.google.android.gms.internal.play_billing.o4;
import com.google.android.gms.internal.play_billing.q4;
import com.google.android.gms.internal.play_billing.r4;
import com.google.android.gms.internal.play_billing.s3;
import com.google.android.gms.internal.play_billing.t3;
import com.google.android.gms.internal.play_billing.v3;
import com.google.android.gms.internal.play_billing.w3;
import com.google.android.gms.internal.play_billing.x3;
import com.google.android.gms.internal.play_billing.y3;
import com.google.android.gms.internal.play_billing.z3;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.android.play.core.review.ReviewManager;
import ep.d0;
import hq.u;
import io.sentry.SentryLevel;
import io.sentry.d5;
import io.sentry.l4;
import io.sentry.p4;
import io.sentry.q6;
import io.sentry.w4;
import io.sentry.w5;
import io.sentry.z4;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import je.w;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import lq.l0;
import lq.z;
import mp.s;
import or.c1;
import or.d1;
import pc.x;
import pp.a0;
import pp.a1;
import pp.v;
import pp.x0;
import sh.k1;
import sh.r0;
import sh.s0;
import sh.u0;
import sh.v0;

/* JADX INFO: loaded from: classes.dex */
public class r implements g0, ReviewManager, OnCompleteListener, d0, hq.b, hq.d, io.sentry.clientreport.f, hq.f, d1, u0, th.g, la.b, ig.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f8034e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f8035i;

    public /* synthetic */ r(int i7, Object obj) {
        this.f8033d = i7;
        this.f8034e = obj;
    }

    public static l0 A(List attributes) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        return attributes.isEmpty() ? l0.f15226i : new l0(attributes);
    }

    public static io.sentry.l x(w4 w4Var) {
        if (w4.Event.equals(w4Var)) {
            return io.sentry.l.Error;
        }
        if (w4.Session.equals(w4Var)) {
            return io.sentry.l.Session;
        }
        if (w4.Transaction.equals(w4Var)) {
            return io.sentry.l.Transaction;
        }
        if (w4.UserFeedback.equals(w4Var)) {
            return io.sentry.l.UserReport;
        }
        if (w4.Feedback.equals(w4Var)) {
            return io.sentry.l.Feedback;
        }
        if (w4.Profile.equals(w4Var)) {
            return io.sentry.l.Profile;
        }
        if (w4.ProfileChunk.equals(w4Var)) {
            return io.sentry.l.ProfileChunkUi;
        }
        if (w4.Attachment.equals(w4Var)) {
            return io.sentry.l.Attachment;
        }
        if (w4.CheckIn.equals(w4Var)) {
            return io.sentry.l.Monitor;
        }
        if (w4.ReplayVideo.equals(w4Var)) {
            return io.sentry.l.Replay;
        }
        if (w4.Log.equals(w4Var)) {
            return io.sentry.l.LogItem;
        }
        if (w4.Span.equals(w4Var)) {
            return io.sentry.l.Span;
        }
        return w4.TraceMetric.equals(w4Var) ? io.sentry.l.TraceMetric : io.sentry.l.Default;
    }

    public void B(pc.m mVar, zc.d0 d0Var) {
        x[] xVarArr = (x[]) this.f8035i;
        for (int i7 = 0; i7 < xVarArr.length; i7++) {
            d0Var.a();
            d0Var.b();
            x xVarX = mVar.x(d0Var.f23691d, 3);
            Format format = (Format) ((List) this.f8034e).get(i7);
            String str = format.I;
            je.b.f("Invalid closed caption MIME type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            gc.g0 g0Var = new gc.g0();
            d0Var.b();
            g0Var.f9635a = d0Var.f23692e;
            g0Var.k = str;
            g0Var.f9638d = format.f5529v;
            g0Var.f9637c = format.f5528i;
            g0Var.C = format.a0;
            g0Var.f9645m = format.K;
            xVarX.e(new Format(g0Var));
            xVarArr[i7] = xVarX;
        }
    }

    public void C() {
        ((w5) this.f8035i).getOnDiscard();
    }

    public void D(String name, String str, Function1 block) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(block, "block");
        LinkedHashMap linkedHashMap = ((mp.q) this.f8035i).f16005a;
        mp.p pVar = new mp.p(this, name, str);
        block.invoke(pVar);
        String internalName = (String) this.f8034e;
        ArrayList arrayList = pVar.f16003b;
        ArrayList parameters = new ArrayList(e0.l(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            parameters.add((String) ((Pair) it.next()).f14612d);
        }
        String ret = (String) pVar.f16004c.f14612d;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(ret, "ret");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(name);
        sb2.append('(');
        sb2.append(CollectionsKt.O(parameters, "", null, null, np.q.f17018d, 30));
        sb2.append(')');
        if (ret.length() > 1) {
            ret = kk.b.g(';', "L", ret);
        }
        sb2.append(ret);
        String jvmDescriptor = sb2.toString();
        Intrinsics.checkNotNullParameter(internalName, "internalName");
        Intrinsics.checkNotNullParameter(jvmDescriptor, "jvmDescriptor");
        String str2 = internalName + '.' + jvmDescriptor;
        s sVar = (s) pVar.f16004c.f14613e;
        ArrayList arrayList2 = new ArrayList(e0.l(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add((s) ((Pair) it2.next()).f14613e);
        }
        linkedHashMap.put(str2, new mp.m(sVar, arrayList2, pVar.f16002a));
    }

    public mj.b E() {
        if (((mj.b) this.f8035i) == null) {
            mj.d dVar = (mj.d) this.f8034e;
            int[] iArr = dVar.f15851c;
            mj.b bVar = dVar.f15852d;
            if (bVar == null) {
                ij.f fVar = dVar.f15849a;
                int i7 = fVar.f11804b;
                int i10 = fVar.f11805c;
                boolean z5 = true;
                int i11 = 0;
                if (i7 < 40 || i10 < 40) {
                    mj.b bVar2 = new mj.b(i7, i10);
                    if (dVar.f15850b.length < i7) {
                        dVar.f15850b = new byte[i7];
                    }
                    for (int i12 = 0; i12 < 32; i12++) {
                        iArr[i12] = 0;
                    }
                    for (int i13 = 1; i13 < 5; i13++) {
                        byte[] bArrD = fVar.d(dVar.f15850b, (i10 * i13) / 5);
                        int i14 = (i7 << 2) / 5;
                        for (int i15 = i7 / 5; i15 < i14; i15++) {
                            int i16 = (bArrD[i15] & 255) >> 3;
                            iArr[i16] = iArr[i16] + 1;
                        }
                    }
                    int iA = mj.d.a(iArr);
                    byte[] bArrC = fVar.c();
                    for (int i17 = 0; i17 < i10; i17++) {
                        int i18 = i17 * i7;
                        for (int i19 = 0; i19 < i7; i19++) {
                            if ((bArrC[i18 + i19] & 255) < iA) {
                                bVar2.f(i19, i17);
                            }
                        }
                    }
                    dVar.f15852d = bVar2;
                } else {
                    byte[] bArrC2 = fVar.c();
                    int i20 = i7 >> 3;
                    if ((i7 & 7) != 0) {
                        i20++;
                    }
                    int i21 = i10 >> 3;
                    if ((i10 & 7) != 0) {
                        i21++;
                    }
                    int i22 = i10 - 8;
                    int i23 = i7 - 8;
                    int i24 = 2;
                    int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i21, i20);
                    int i25 = 0;
                    while (true) {
                        int i26 = 8;
                        if (i25 >= i21) {
                            break;
                        }
                        boolean z6 = z5;
                        int i27 = i25 << 3;
                        if (i27 > i22) {
                            i27 = i22;
                        }
                        int i28 = i11;
                        while (i11 < i20) {
                            int i29 = i24;
                            int i30 = i11 << 3;
                            if (i30 > i23) {
                                i30 = i23;
                            }
                            int i31 = (i27 * i7) + i30;
                            int i32 = i28;
                            int i33 = i32;
                            int i34 = i33;
                            int i35 = 255;
                            while (i32 < i26) {
                                byte[] bArr = bArrC2;
                                int i36 = i27;
                                int i37 = i28;
                                int i38 = i34;
                                int i39 = i35;
                                while (i37 < i26) {
                                    int i40 = i37;
                                    int i41 = bArr[i31 + i37] & 255;
                                    i33 += i41;
                                    if (i41 < i39) {
                                        i39 = i41;
                                    }
                                    if (i41 > i38) {
                                        i38 = i41;
                                    }
                                    i37 = i40 + 1;
                                    i26 = 8;
                                }
                                if (i38 - i39 > 24) {
                                    while (true) {
                                        i32++;
                                        i31 += i7;
                                        if (i32 < 8) {
                                            int i42 = i28;
                                            for (int i43 = 8; i42 < i43; i43 = 8) {
                                                i33 += bArr[i31 + i42] & 255;
                                                i42++;
                                                i39 = i39;
                                            }
                                        }
                                    }
                                }
                                i32++;
                                i31 += i7;
                                i35 = i39;
                                bArrC2 = bArr;
                                i27 = i36;
                                i26 = 8;
                                i34 = i38;
                            }
                            byte[] bArr2 = bArrC2;
                            int i44 = i27;
                            int i45 = i33 >> 6;
                            int i46 = i35;
                            if (i34 - i46 <= 24) {
                                i45 = i46 / 2;
                                if (i25 > 0 && i11 > 0) {
                                    int[] iArr3 = iArr2[i25 - 1];
                                    int i47 = i11 - 1;
                                    int i48 = (((iArr2[i25][i47] * 2) + iArr3[i11]) + iArr3[i47]) / 4;
                                    if (i46 < i48) {
                                        i45 = i48;
                                    }
                                }
                            }
                            iArr2[i25][i11] = i45;
                            i11++;
                            i24 = i29;
                            bArrC2 = bArr2;
                            i27 = i44;
                            i26 = 8;
                        }
                        i25++;
                        z5 = z6;
                        i11 = i28;
                    }
                    byte[] bArr3 = bArrC2;
                    int i49 = i11;
                    int i50 = i24;
                    mj.b bVar3 = new mj.b(i7, i10);
                    int i51 = i49;
                    while (i51 < i21) {
                        int i52 = i51 << 3;
                        if (i52 > i22) {
                            i52 = i22;
                        }
                        int i53 = i21 - 3;
                        if (i51 < i50) {
                            i53 = 2;
                        } else if (i51 <= i53) {
                            i53 = i51;
                        }
                        int i54 = i49;
                        while (i54 < i20) {
                            int i55 = i54 << 3;
                            if (i55 > i23) {
                                i55 = i23;
                            }
                            int i56 = i20 - 3;
                            if (i54 < 2) {
                                i56 = 2;
                            } else if (i54 <= i56) {
                                i56 = i54;
                            }
                            int i57 = i20;
                            int i58 = -2;
                            int i59 = i49;
                            for (int i60 = 2; i58 <= i60; i60 = 2) {
                                int[] iArr4 = iArr2[i53 + i58];
                                i59 = iArr4[i56 - 2] + iArr4[i56 - 1] + iArr4[i56] + iArr4[i56 + 1] + iArr4[i56 + 2] + i59;
                                i58++;
                            }
                            int i61 = i59 / 25;
                            int i62 = (i52 * i7) + i55;
                            int i63 = i51;
                            int i64 = i49;
                            while (true) {
                                if (i64 < 8) {
                                    int i65 = i52;
                                    int i66 = i49;
                                    for (int i67 = 8; i66 < i67; i67 = 8) {
                                        int i68 = i66;
                                        if ((bArr3[i62 + i66] & 255) <= i61) {
                                            bVar3.f(i55 + i68, i65 + i64);
                                        }
                                        i66 = i68 + 1;
                                    }
                                    i64++;
                                    i62 += i7;
                                    i52 = i65;
                                }
                            }
                            i54++;
                            i51 = i63;
                            i20 = i57;
                        }
                        i50 = 2;
                        i51++;
                    }
                    dVar.f15852d = bVar3;
                }
                bVar = dVar.f15852d;
            }
            this.f8035i = bVar;
        }
        return (mj.b) this.f8035i;
    }

    public mj.a F(mj.a aVar, int i7) {
        mj.d dVar = (mj.d) this.f8034e;
        int[] iArr = dVar.f15851c;
        ij.f fVar = dVar.f15849a;
        int i10 = fVar.f11804b;
        if (aVar.f15838e < i10) {
            aVar = new mj.a(i10);
        } else {
            int length = aVar.f15837d.length;
            for (int i11 = 0; i11 < length; i11++) {
                aVar.f15837d[i11] = 0;
            }
        }
        if (dVar.f15850b.length < i10) {
            dVar.f15850b = new byte[i10];
        }
        for (int i12 = 0; i12 < 32; i12++) {
            iArr[i12] = 0;
        }
        byte[] bArrD = fVar.d(dVar.f15850b, i7);
        for (int i13 = 0; i13 < i10; i13++) {
            int i14 = (bArrD[i13] & 255) >> 3;
            iArr[i14] = iArr[i14] + 1;
        }
        int iA = mj.d.a(iArr);
        if (i10 < 3) {
            for (int i15 = 0; i15 < i10; i15++) {
                if ((bArrD[i15] & 255) < iA) {
                    aVar.f(i15);
                }
            }
        } else {
            int i16 = bArrD[0] & 255;
            int i17 = bArrD[1] & 255;
            int i18 = 1;
            while (i18 < i10 - 1) {
                int i19 = i18 + 1;
                int i20 = bArrD[i19] & 255;
                if ((((i17 << 2) - i16) - i20) / 2 < iA) {
                    aVar.f(i18);
                }
                i16 = i17;
                i18 = i19;
                i17 = i20;
            }
        }
        return aVar;
    }

    public ae.b G(int i7) {
        ae.b bVar;
        ae.b bVar2;
        ae.b[] bVarArr = (ae.b[]) this.f8035i;
        ae.b bVar3 = bVarArr[K(i7)];
        if (bVar3 != null) {
            return bVar3;
        }
        for (int i10 = 1; i10 < 5; i10++) {
            int iK = K(i7) - i10;
            if (iK >= 0 && (bVar2 = bVarArr[iK]) != null) {
                return bVar2;
            }
            int iK2 = K(i7) + i10;
            if (iK2 < bVarArr.length && (bVar = bVarArr[iK2]) != null) {
                return bVar;
            }
        }
        return null;
    }

    public int H(String key) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(key, "keyQualifiedName");
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f8034e;
        bp.i compute = new bp.i(17, this);
        Intrinsics.checkNotNullParameter(concurrentHashMap, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(compute, "compute");
        Integer num = (Integer) concurrentHashMap.get(key);
        if (num != null) {
            return num.intValue();
        }
        synchronized (concurrentHashMap) {
            try {
                Integer num2 = (Integer) concurrentHashMap.get(key);
                if (num2 != null) {
                    iIntValue = num2.intValue();
                } else {
                    Object objInvoke = compute.invoke(key);
                    concurrentHashMap.putIfAbsent(key, Integer.valueOf(((Number) objInvoke).intValue()));
                    iIntValue = ((Number) objInvoke).intValue();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iIntValue;
    }

    public ArrayList I(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f8034e;
        a3.o oVarG = a3.o.g(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        if (str == null) {
            oVarG.R(1);
        } else {
            oVarG.o(1, str);
        }
        workDatabase_Impl.b();
        Cursor cursorM = a5.l0.M(workDatabase_Impl, oVarG);
        try {
            ArrayList arrayList = new ArrayList(cursorM.getCount());
            while (cursorM.moveToNext()) {
                arrayList.add(cursorM.isNull(0) ? null : cursorM.getString(0));
            }
            return arrayList;
        } finally {
            cursorM.close();
            oVarG.i();
        }
    }

    public int J(String str) {
        Integer intOrNull;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f8035i;
        Object obj = concurrentHashMap.get(str);
        if (obj == null) {
            Uri uri = Uri.parse(str);
            Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
            if (!"res".equals(v8.a.b(uri)) && !"android.resource".equals(v8.a.b(uri))) {
                throw new IllegalStateException(("Unsupported uri " + uri).toString());
            }
            List<String> pathSegments = uri.getPathSegments();
            Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
            String str2 = (String) CollectionsKt.S(pathSegments);
            if (str2 == null || (intOrNull = StringsKt.toIntOrNull(str2)) == null) {
                throw new IllegalStateException(("Unable to read resource ID from " + uri.getPath()).toString());
            }
            concurrentHashMap.put(str, intOrNull);
            obj = intOrNull;
        }
        return ((Number) obj).intValue();
    }

    public int K(int i7) {
        return i7 - ((zj.b) this.f8034e).f24025h;
    }

    public wo.c L(pp.h proto, rp.f nameResolver) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        return ((io.sentry.internal.debugmeta.c) this.f8035i).s0(proto, nameResolver);
    }

    public void M(Long l6, String str, String str2) {
        AtomicLong atomicLong = (AtomicLong) ((Map) ((io.sentry.util.e) ((ue.i) this.f8034e).f21117d).a()).get(new io.sentry.clientreport.c(str, str2));
        if (atomicLong != null) {
            atomicLong.addAndGet(l6.longValue());
        }
    }

    public void N(io.sentry.clientreport.b bVar) {
        if (bVar == null) {
            return;
        }
        for (io.sentry.clientreport.e eVar : bVar.f12566e) {
            M(eVar.f12572i, eVar.f12570d, eVar.f12571e);
        }
    }

    public void O(w3.j workSpecId, int i7) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        ((h4.b) this.f8035i).a(new f4.m((w3.e) this.f8034e, workSpecId, false, i7));
    }

    public void P(VideoSize videoSize) {
        Handler handler = (Handler) this.f8034e;
        if (handler != null) {
            handler.post(new io.sentry.react.d(3, this, videoSize));
        }
    }

    public void Q(t3 t3Var) {
        try {
            a0(t3Var, (d4) this.f8034e);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.r.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void R(t3 t3Var, int i7) {
        try {
            c4 c4Var = (c4) ((d4) this.f8034e).l();
            c4Var.c();
            d4.E((d4) c4Var.f5994e, i7);
            this.f8034e = (d4) c4Var.a();
            Q(t3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.r.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void S(t3 t3Var, int i7, long j) {
        try {
            c4 c4Var = (c4) ((d4) this.f8034e).l();
            c4Var.c();
            d4.E((d4) c4Var.f5994e, i7);
            d4 d4Var = (d4) c4Var.a();
            this.f8034e = d4Var;
            if (j != 0) {
                c4 c4Var2 = (c4) d4Var.l();
                c4Var2.g(j);
                d4Var = (d4) c4Var2.a();
            }
            a0(t3Var, d4Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.r.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void T(t3 t3Var, long j, boolean z5) {
        d4 d4Var;
        try {
            s3 s3Var = (s3) t3Var.l();
            g4 g4Var = (g4) t3Var.w().l();
            g4Var.c();
            i4.s((i4) g4Var.f5994e, z5);
            s3Var.c();
            t3.r((t3) s3Var.f5994e, (i4) g4Var.a());
            t3 t3Var2 = (t3) s3Var.a();
            if (j == 0) {
                d4Var = (d4) this.f8034e;
            } else {
                c4 c4Var = (c4) ((d4) this.f8034e).l();
                c4Var.g(j);
                d4Var = (d4) c4Var.a();
            }
            a0(t3Var2, d4Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.r.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void U(t3 t3Var, int i7, long j, boolean z5) {
        d4 d4Var;
        try {
            c4 c4Var = (c4) ((d4) this.f8034e).l();
            c4Var.c();
            d4.E((d4) c4Var.f5994e, i7);
            this.f8034e = (d4) c4Var.a();
            s3 s3Var = (s3) t3Var.l();
            g4 g4Var = (g4) t3Var.w().l();
            g4Var.c();
            i4.s((i4) g4Var.f5994e, z5);
            s3Var.c();
            t3.r((t3) s3Var.f5994e, (i4) g4Var.a());
            t3 t3Var2 = (t3) s3Var.a();
            if (j == 0) {
                d4Var = (d4) this.f8034e;
            } else {
                c4 c4Var2 = (c4) ((d4) this.f8034e).l();
                c4Var2.g(j);
                d4Var = (d4) c4Var2.a();
            }
            a0(t3Var2, d4Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.r.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void V(y3 y3Var) {
        try {
            j4 j4VarT = k4.t();
            j4VarT.e((d4) this.f8034e);
            j4VarT.c();
            k4.w((k4) j4VarT.f5994e, y3Var);
            ((i0) this.f8035i).z((k4) j4VarT.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.r.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void W(BillingResult billingResult, long j) {
        d4 d4Var;
        try {
            a4 a4VarR = b4.r();
            a4VarR.c();
            b4.w((b4) a4VarR.f5994e, 4);
            z3 z3Var = z3.IN_APP_BILLING_RESULT_UPDATE_ACTION;
            a4VarR.c();
            b4.s((b4) a4VarR.f5994e, z3Var);
            if (billingResult != null) {
                w3 w3VarS = x3.s();
                int i7 = billingResult.f3788a;
                w3VarS.c();
                x3.r((x3) w3VarS.f5994e, i7);
                String str = billingResult.f3790c;
                w3VarS.c();
                x3.u((x3) w3VarS.f5994e, str);
                a4VarR.c();
                b4.t((b4) a4VarR.f5994e, (x3) w3VarS.a());
            }
            j4 j4VarT = k4.t();
            if (j == 0) {
                d4Var = (d4) this.f8034e;
            } else {
                c4 c4Var = (c4) ((d4) this.f8034e).l();
                c4Var.g(j);
                d4Var = (d4) c4Var.a();
            }
            j4VarT.e(d4Var);
            j4VarT.c();
            k4.x((k4) j4VarT.f5994e, (b4) a4VarR.a());
            ((i0) this.f8035i).z((k4) j4VarT.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.r.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void X(o4 o4Var) {
        try {
            j4 j4VarT = k4.t();
            j4VarT.e((d4) this.f8034e);
            a4 a4VarR = b4.r();
            a4VarR.c();
            b4.u((b4) a4VarR.f5994e);
            a4VarR.c();
            b4.w((b4) a4VarR.f5994e, 2);
            a4VarR.c();
            b4.v((b4) a4VarR.f5994e, o4Var);
            j4VarT.c();
            k4.x((k4) j4VarT.f5994e, (b4) a4VarR.a());
            ((i0) this.f8035i).z((k4) j4VarT.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.r.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void Y(q4 q4Var) {
        try {
            i0 i0Var = (i0) this.f8035i;
            j4 j4VarT = k4.t();
            j4VarT.e((d4) this.f8034e);
            j4VarT.c();
            k4.r((k4) j4VarT.f5994e, q4Var);
            i0Var.z((k4) j4VarT.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.r.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void Z(r4 r4Var) {
        if (r4Var == null) {
            return;
        }
        try {
            j4 j4VarT = k4.t();
            j4VarT.e((d4) this.f8034e);
            j4VarT.c();
            k4.s((k4) j4VarT.f5994e, r4Var);
            ((i0) this.f8035i).z((k4) j4VarT.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.r.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // sh.u0
    public Object a() {
        switch (this.f8033d) {
            case 20:
                v0 v0Var = (v0) this.f8034e;
                List<String> list = (List) this.f8035i;
                v0Var.getClass();
                Map map = (Map) v0Var.b(new io.sentry.internal.debugmeta.c(v0Var, list, 20, false));
                HashMap map2 = new HashMap();
                for (String str : list) {
                    s0 s0Var = (s0) map.get(str);
                    if (s0Var == null) {
                        map2.put(str, 8);
                    } else {
                        r0 r0Var = s0Var.f20176c;
                        int i7 = r0Var.f20164d;
                        if (i7 == 1 || i7 == 7 || i7 == 2 || i7 == 9 || i7 == 3) {
                            try {
                                r0Var.f20164d = 6;
                                ((Executor) v0Var.f20213f.a()).execute(new hi.o(18, v0Var, s0Var));
                                v0Var.f20209b.b(str);
                            } catch (sh.l0 unused) {
                                v0.f20207g.d("Session %d with pack %s does not exist, no need to cancel.", Integer.valueOf(s0Var.f20174a), str);
                            }
                        }
                        map2.put(str, Integer.valueOf(r0Var.f20164d));
                    }
                    break;
                }
                return map2;
            default:
                int i10 = 8;
                return new k1((sh.s) ((th.f) this.f8034e).a(), new th.f(new pf.b(i10, (po.d) this.f8035i)));
        }
    }

    public void a0(t3 t3Var, d4 d4Var) {
        if (t3Var == null) {
            return;
        }
        try {
            j4 j4VarT = k4.t();
            j4VarT.e(d4Var);
            j4VarT.c();
            k4.u((k4) j4VarT.f5994e, t3Var);
            ((i0) this.f8035i).z((k4) j4VarT.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.r.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // io.sentry.clientreport.f
    public void b(io.sentry.clientreport.d dVar, io.sentry.l lVar) {
        m(dVar, lVar, 1L);
    }

    public void b0(v3 v3Var, d4 d4Var) {
        if (v3Var == null) {
            return;
        }
        try {
            j4 j4VarT = k4.t();
            j4VarT.e(d4Var);
            j4VarT.c();
            k4.v((k4) j4VarT.f5994e, v3Var);
            ((i0) this.f8035i).z((k4) j4VarT.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.r.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // hq.d
    public ArrayList c(pp.s0 proto, rp.f nameResolver) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Iterable iterable = (List) proto.k(((gq.a) this.f8034e).k);
        if (iterable == null) {
            iterable = n0.f14659d;
        }
        ArrayList arrayList = new ArrayList(e0.l(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(L((pp.h) it.next(), nameResolver));
        }
        return arrayList;
    }

    @Override // hq.d
    public List d(a3.r container, vp.a callableProto, hq.a kind, int i7, a1 proto) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(callableProto, "callableProto");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Iterable iterable = (List) proto.k(((gq.a) this.f8034e).j);
        if (iterable == null) {
            iterable = n0.f14659d;
        }
        ArrayList arrayList = new ArrayList(e0.l(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(L((pp.h) it.next(), (rp.f) container.f117b));
        }
        return arrayList;
    }

    @Override // hq.d
    public List e(a3.r container, vp.a proto, hq.a kind) {
        List list;
        gq.a aVar = (gq.a) this.f8034e;
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(kind, "kind");
        if (proto instanceof pp.n) {
            list = (List) ((pp.n) proto).k(aVar.f10173b);
        } else if (proto instanceof a0) {
            list = (List) ((a0) proto).k(aVar.f10175d);
        } else {
            if (!(proto instanceof pp.i0)) {
                throw new IllegalStateException(("Unknown message: " + proto).toString());
            }
            int iOrdinal = kind.ordinal();
            if (iOrdinal == 1) {
                list = (List) ((pp.i0) proto).k(aVar.f10176e);
            } else if (iOrdinal == 2) {
                list = (List) ((pp.i0) proto).k(aVar.f10177f);
            } else {
                if (iOrdinal != 3) {
                    throw new IllegalStateException("Unsupported callable kind with property proto");
                }
                list = (List) ((pp.i0) proto).k(aVar.f10178g);
            }
        }
        if (list == null) {
            list = n0.f14659d;
        }
        ArrayList arrayList = new ArrayList(e0.l(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(L((pp.h) it.next(), (rp.f) container.f117b));
        }
        return arrayList;
    }

    @Override // ig.a
    public Object f(Task task) {
        Bundle bundle;
        Rpc rpc = (Rpc) this.f8034e;
        Bundle bundle2 = (Bundle) this.f8035i;
        rpc.getClass();
        return (task.m() && (bundle = (Bundle) task.i()) != null && bundle.containsKey("google.messenger")) ? rpc.a(bundle2).n(we.g.f22202i, we.c.f22197v) : task;
    }

    @Override // la.b
    public na.c g(EncodedImage encodedImage, int i7, na.k qualityInfo, ImageDecodeOptions options) {
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        Intrinsics.checkNotNullParameter(qualityInfo, "qualityInfo");
        Intrinsics.checkNotNullParameter(options, "options");
        try {
            String source = encodedImage.getSource();
            if (source == null) {
                throw new IllegalStateException("No source in encoded image");
            }
            int iJ = J(source);
            Resources resources = (Resources) this.f8034e;
            ThreadLocal threadLocal = a1.n.f42a;
            Drawable drawable = resources.getDrawable(iJ, null);
            if (drawable == null) {
                return null;
            }
            na.h hVar = new na.h();
            hVar.f16531v = drawable;
            return hVar;
        } catch (Throwable th2) {
            o8.a.h("XmlFormatDecoder", "Cannot decode xml", th2);
            return null;
        }
    }

    @Override // hq.d
    public List h(a3.r container, vp.a proto, hq.a kind) {
        gq.a aVar = (gq.a) this.f8034e;
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(kind, "kind");
        if (proto instanceof a0) {
            aVar.getClass();
        } else {
            if (!(proto instanceof pp.i0)) {
                throw new IllegalStateException(("Unknown message: " + proto).toString());
            }
            int iOrdinal = kind.ordinal();
            if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                throw new IllegalStateException(("Unsupported callable kind with property proto for receiver annotations: " + kind).toString());
            }
            aVar.getClass();
        }
        n0 n0Var = n0.f14659d;
        ArrayList arrayList = new ArrayList(e0.l(n0Var, 10));
        Iterator<E> it = n0Var.iterator();
        while (it.hasNext()) {
            arrayList.add(L((pp.h) it.next(), (rp.f) container.f117b));
        }
        return arrayList;
    }

    @Override // or.d1
    public Object i(KClass key, ArrayList types) {
        Object objO;
        Object objPutIfAbsent;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(types, "types");
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f8035i;
        Class clsB = gn.h.B(key);
        Object c1Var = concurrentHashMap.get(clsB);
        if (c1Var == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(clsB, (c1Var = new c1()))) != null) {
            c1Var = objPutIfAbsent;
        }
        c1 c1Var2 = (c1) c1Var;
        ArrayList arrayList = new ArrayList(e0.l(types, 10));
        Iterator it = types.iterator();
        while (it.hasNext()) {
            arrayList.add(new or.n0((KType) it.next()));
        }
        ConcurrentHashMap concurrentHashMap2 = c1Var2.f17516a;
        Object obj = concurrentHashMap2.get(arrayList);
        if (obj == null) {
            try {
                rn.q qVar = Result.f14614e;
                objO = (KSerializer) ((Function2) this.f8034e).invoke(key, types);
            } catch (Throwable th2) {
                rn.q qVar2 = Result.f14614e;
                objO = ib.a.o(th2);
            }
            Result result = new Result(objO);
            Object objPutIfAbsent2 = concurrentHashMap2.putIfAbsent(arrayList, result);
            obj = objPutIfAbsent2 == null ? result : objPutIfAbsent2;
        }
        Intrinsics.checkNotNullExpressionValue(obj, "getOrPut(...)");
        return ((Result) obj).f14615d;
    }

    @Override // hq.f
    public hq.e j(up.b classId) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        ue.i iVar = (ue.i) this.f8034e;
        np.e eVar = (np.e) this.f8035i;
        eVar.c().f11021c.getClass();
        ap.b bVarT = a5.l0.t(iVar, classId, rp.e.f19536g);
        if (bVarT == null) {
            return null;
        }
        Intrinsics.areEqual(bp.c.a(bVarT.f2856a), classId);
        return eVar.g(bVarT);
    }

    @Override // io.sentry.clientreport.f
    public void k(io.sentry.clientreport.d dVar, c cVar) {
        if (cVar == null) {
            return;
        }
        try {
            Iterator it = ((Iterable) cVar.f7967i).iterator();
            while (it.hasNext()) {
                r(dVar, (p4) it.next());
            }
        } catch (Throwable th2) {
            ((w5) this.f8035i).getLogger().e(SentryLevel.ERROR, th2, "Unable to record lost envelope.", new Object[0]);
        }
    }

    @Override // hq.d
    public ArrayList l(x0 proto, rp.f nameResolver) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Iterable iterable = (List) proto.k(((gq.a) this.f8034e).f10181l);
        if (iterable == null) {
            iterable = n0.f14659d;
        }
        ArrayList arrayList = new ArrayList(e0.l(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(L((pp.h) it.next(), nameResolver));
        }
        return arrayList;
    }

    @Override // io.sentry.clientreport.f
    public void m(io.sentry.clientreport.d dVar, io.sentry.l lVar, long j) {
        try {
            M(Long.valueOf(j), dVar.getReason(), lVar.getCategory());
            C();
        } catch (Throwable th2) {
            ((w5) this.f8035i).getLogger().e(SentryLevel.ERROR, th2, "Unable to record lost event.", new Object[0]);
        }
    }

    @Override // hq.b
    public Object n(a3.r container, pp.i0 proto, z expectedType) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(expectedType, "expectedType");
        pp.e eVar = (pp.e) m3.m.B(proto, ((gq.a) this.f8034e).f10180i);
        if (eVar == null) {
            return null;
        }
        return ((io.sentry.internal.debugmeta.c) this.f8035i).F0(expectedType, eVar, (rp.f) container.f117b);
    }

    @Override // com.google.android.play.core.review.ReviewManager
    public ig.l o(Activity activity, yh.b bVar) {
        switch (this.f8033d) {
            case 3:
                return bVar != ((yh.c) this.f8035i) ? a5.l0.u(new yh.a(-2)) : a5.l0.v(null);
            default:
                yh.c cVar = (yh.c) bVar;
                if (cVar.f23340e) {
                    return a5.l0.v(null);
                }
                Intent intent = new Intent(activity, (Class<?>) PlayCoreDialogWrapperActivity.class);
                intent.putExtra("confirmation_intent", cVar.f23339d);
                intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
                ig.g gVar = new ig.g();
                intent.putExtra("result_receiver", new ph.d((Handler) this.f8035i, gVar));
                activity.startActivity(intent);
                return gVar.f11763a;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ci.d dVar = (ci.d) this.f8034e;
        ig.g gVar = (ig.g) this.f8035i;
        synchronized (dVar.f3690f) {
            dVar.f3689e.remove(gVar);
        }
    }

    @Override // com.google.android.play.core.review.ReviewManager
    public ig.l p() {
        switch (this.f8033d) {
            case 3:
                yh.c cVar = new yh.c(PendingIntent.getBroadcast((Context) this.f8034e, 0, new Intent(), 67108864), false);
                this.f8035i = cVar;
                return a5.l0.v(cVar);
            default:
                yh.f fVar = (yh.f) this.f8034e;
                a5.n nVar = yh.f.f23347c;
                nVar.a("requestInAppReview (%s)", fVar.f23349b);
                if (fVar.f23348a == null) {
                    Object[] objArr = new Object[0];
                    if (Log.isLoggable("PlayCore", 6)) {
                        Log.e("PlayCore", a5.n.b(nVar.f232a, "Play Store app is either not installed or not the official version", objArr));
                    }
                    return a5.l0.u(new yh.a(-1));
                }
                ig.g gVar = new ig.g();
                zh.g gVar2 = fVar.f23348a;
                yh.d dVar = new yh.d(fVar, gVar, gVar, 0);
                synchronized (gVar2.f24000f) {
                    gVar2.f23999e.add(gVar);
                    gVar.f11763a.addOnCompleteListener(new e(28, gVar2, gVar));
                    break;
                }
                synchronized (gVar2.f24000f) {
                    try {
                        if (gVar2.k.getAndIncrement() > 0) {
                            a5.n nVar2 = gVar2.f23996b;
                            Object[] objArr2 = new Object[0];
                            nVar2.getClass();
                            if (Log.isLoggable("PlayCore", 3)) {
                                Log.d("PlayCore", a5.n.b(nVar2.f232a, "Already connected to the service.", objArr2));
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                gVar2.a().post(new yh.d(gVar2, gVar, dVar, 1));
                return gVar.f11763a;
        }
    }

    @Override // hq.b
    public Object q(a3.r container, pp.i0 proto, z expectedType) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(expectedType, "expectedType");
        return null;
    }

    @Override // io.sentry.clientreport.f
    public void r(io.sentry.clientreport.d dVar, p4 p4Var) {
        w5 w5Var = (w5) this.f8035i;
        if (p4Var == null) {
            return;
        }
        try {
            w4 w4Var = p4Var.f12887a.f13085w;
            if (w4.ClientReport.equals(w4Var)) {
                try {
                    N(p4Var.e(w5Var.getSerializer()));
                    return;
                } catch (Exception unused) {
                    w5Var.getLogger().q(SentryLevel.ERROR, "Unable to restore counts from previous client report.", new Object[0]);
                    return;
                }
            }
            io.sentry.l lVarX = x(w4Var);
            if (lVarX.equals(io.sentry.l.Transaction)) {
                io.sentry.protocol.d0 d0VarJ = p4Var.j(w5Var.getSerializer());
                if (d0VarJ != null) {
                    ArrayList arrayList = d0VarJ.P;
                    M(Long.valueOf(((long) arrayList.size()) + 1), dVar.getReason(), io.sentry.l.Span.getCategory());
                    arrayList.size();
                    C();
                }
                M(1L, dVar.getReason(), lVarX.getCategory());
                C();
                return;
            }
            if (lVarX.equals(io.sentry.l.LogItem)) {
                z4 z4VarH = p4Var.h(w5Var.getSerializer());
                if (z4VarH == null) {
                    w5Var.getLogger().q(SentryLevel.ERROR, "Unable to parse lost logs envelope item.", new Object[0]);
                    return;
                }
                M(Long.valueOf(z4VarH.f13306d.size()), dVar.getReason(), lVarX.getCategory());
                M(Long.valueOf(p4Var.f().length), dVar.getReason(), io.sentry.l.LogByte.getCategory());
                C();
                return;
            }
            if (!lVarX.equals(io.sentry.l.TraceMetric)) {
                M(1L, dVar.getReason(), lVarX.getCategory());
                C();
                return;
            }
            d5 d5VarI = p4Var.i(w5Var.getSerializer());
            if (d5VarI == null) {
                w5Var.getLogger().q(SentryLevel.ERROR, "Unable to parse lost metrics envelope item.", new Object[0]);
                return;
            }
            M(Long.valueOf(d5VarI.f12626d.size()), dVar.getReason(), lVarX.getCategory());
            C();
        } catch (Throwable th2) {
            w5Var.getLogger().e(SentryLevel.ERROR, th2, "Unable to record lost envelope item.", new Object[0]);
        }
    }

    @Override // hq.d
    public List s(a3.r container, pp.i0 proto) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        ((gq.a) this.f8034e).getClass();
        n0 n0Var = n0.f14659d;
        ArrayList arrayList = new ArrayList(e0.l(n0Var, 10));
        Iterator<E> it = n0Var.iterator();
        while (it.hasNext()) {
            arrayList.add(L((pp.h) it.next(), (rp.f) container.f117b));
        }
        return arrayList;
    }

    @Override // hq.d
    public List t(a3.r container, pp.i0 proto) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        ((gq.a) this.f8034e).getClass();
        n0 n0Var = n0.f14659d;
        ArrayList arrayList = new ArrayList(e0.l(n0Var, 10));
        Iterator<E> it = n0Var.iterator();
        while (it.hasNext()) {
            arrayList.add(L((pp.h) it.next(), (rp.f) container.f117b));
        }
        return arrayList;
    }

    public String toString() {
        switch (this.f8033d) {
            case 9:
                try {
                    return E().toString();
                } catch (ij.h unused) {
                    return "";
                }
            case 28:
                Formatter formatter = new Formatter();
                try {
                    int i7 = 0;
                    for (ae.b bVar : (ae.b[]) this.f8035i) {
                        if (bVar == null) {
                            formatter.format("%3d:    |   %n", Integer.valueOf(i7));
                            i7++;
                        } else {
                            formatter.format("%3d: %3d|%3d%n", Integer.valueOf(i7), Integer.valueOf(bVar.f365f), Integer.valueOf(bVar.f364e));
                            i7++;
                        }
                    }
                    String string = formatter.toString();
                    formatter.close();
                    return string;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        try {
                            formatter.close();
                            break;
                        } catch (Throwable th4) {
                            th2.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
            default:
                return super.toString();
        }
    }

    @Override // io.sentry.clientreport.f
    public c u(c cVar) {
        w5 w5Var = (w5) this.f8035i;
        Date dateY = io.sentry.config.a.y();
        ue.i iVar = (ue.i) this.f8034e;
        iVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((Map) ((io.sentry.util.e) iVar.f21117d).a()).entrySet()) {
            long andSet = ((AtomicLong) entry.getValue()).getAndSet(0L);
            Long lValueOf = Long.valueOf(andSet);
            if (andSet > 0) {
                arrayList.add(new io.sentry.clientreport.e(lValueOf, ((io.sentry.clientreport.c) entry.getKey()).f12568a, ((io.sentry.clientreport.c) entry.getKey()).f12569b));
            }
        }
        io.sentry.clientreport.b bVar = arrayList.isEmpty() ? null : new io.sentry.clientreport.b(dateY, arrayList);
        if (bVar == null) {
            return cVar;
        }
        try {
            w5Var.getLogger().q(SentryLevel.DEBUG, "Attaching client report to envelope.", new Object[0]);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = ((Iterable) cVar.f7967i).iterator();
            while (it.hasNext()) {
                arrayList2.add((p4) it.next());
            }
            arrayList2.add(p4.b(w5Var.getSerializer(), bVar));
            return new c((l4) cVar.f7966e, arrayList2);
        } catch (Throwable th2) {
            w5Var.getLogger().e(SentryLevel.ERROR, th2, "Unable to attach client report to envelope.", new Object[0]);
            return cVar;
        }
    }

    @Override // hq.d
    public ArrayList v(u container) {
        Intrinsics.checkNotNullParameter(container, "container");
        Iterable iterable = (List) container.f11070e.k(((gq.a) this.f8034e).f10174c);
        if (iterable == null) {
            iterable = n0.f14659d;
        }
        ArrayList arrayList = new ArrayList(e0.l(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(L((pp.h) it.next(), (rp.f) container.f117b));
        }
        return arrayList;
    }

    @Override // hq.d
    public List w(a3.r container, v proto) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Iterable iterable = (List) proto.k(((gq.a) this.f8034e).f10179h);
        if (iterable == null) {
            iterable = n0.f14659d;
        }
        ArrayList arrayList = new ArrayList(e0.l(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(L((pp.h) it.next(), (rp.f) container.f117b));
        }
        return arrayList;
    }

    public void y() {
        this.f8034e = null;
        this.f8035i = null;
    }

    public void z(long j, w wVar) {
        if (wVar.a() < 9) {
            return;
        }
        int iG = wVar.g();
        int iG2 = wVar.g();
        int iU = wVar.u();
        if (iG == 434 && iG2 == 1195456820 && iU == 3) {
            xr.m.g(j, wVar, (x[]) this.f8035i);
        }
    }

    public /* synthetic */ r(int i7, Object obj, Object obj2) {
        this.f8033d = i7;
        this.f8034e = obj;
        this.f8035i = obj2;
    }

    public r(Context context, d4 d4Var) {
        this.f8033d = 1;
        i0 i0Var = new i0(0, (byte) 0);
        try {
            vb.p.b(context);
            i0Var.f215i = vb.p.a().c(tb.a.f20673e).a("PLAY_BILLING_LIBRARY", new sb.c("proto"), new i8.c(1));
        } catch (Throwable unused) {
            i0Var.f214e = true;
        }
        this.f8035i = i0Var;
        this.f8034e = d4Var;
    }

    public r(yh.f fVar) {
        this.f8033d = 26;
        this.f8035i = new Handler(Looper.getMainLooper());
        this.f8034e = fVar;
    }

    public r(int i7) {
        this.f8033d = i7;
        switch (i7) {
            case 7:
                break;
            case 13:
                this.f8034e = new ConcurrentHashMap();
                this.f8035i = new AtomicInteger(0);
                break;
            case 25:
                this.f8035i = new HashMap();
                break;
            default:
                xe.e eVar = xe.e.f22922d;
                this.f8034e = new SparseIntArray();
                this.f8035i = eVar;
                break;
        }
    }

    public r(Resources resources) {
        this.f8033d = 22;
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.f8034e = resources;
        this.f8035i = new ConcurrentHashMap();
    }

    public r(np.e deserializedDescriptorResolver, ue.i kotlinClassFinder) {
        this.f8033d = 15;
        Intrinsics.checkNotNullParameter(kotlinClassFinder, "kotlinClassFinder");
        Intrinsics.checkNotNullParameter(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        this.f8034e = kotlinClassFinder;
        this.f8035i = deserializedDescriptorResolver;
    }

    public r(WorkDatabase_Impl database) {
        this.f8033d = 0;
        this.f8034e = database;
        Intrinsics.checkNotNullParameter(database, "database");
        this.f8035i = new b(database, false, 6);
        new h(database, 20);
    }

    public r(w5 w5Var) {
        this.f8033d = 11;
        this.f8035i = w5Var;
        this.f8034e = new ue.i(19, false);
    }

    public r(zj.b bVar) {
        this.f8033d = 28;
        this.f8034e = new zj.b(bVar);
        this.f8035i = new ae.b[(bVar.f24026i - bVar.f24025h) + 1];
    }

    public r(vo.z module, com.google.firebase.messaging.r notFoundClasses, gq.a protocol) {
        this.f8033d = 8;
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        this.f8034e = protocol;
        this.f8035i = new io.sentry.internal.debugmeta.c(module, notFoundClasses);
    }

    public r(q6 q6Var, Double d6) {
        this.f8033d = 10;
        this.f8034e = q6Var;
        this.f8035i = d6;
        Map map = Collections.EMPTY_MAP;
    }

    public r(List list) {
        this.f8033d = 27;
        this.f8034e = list;
        this.f8035i = new x[list.size()];
    }

    public r(CloseableReference closeableReference, q9.f type) {
        this.f8033d = 18;
        Intrinsics.checkNotNullParameter(type, "type");
        this.f8034e = closeableReference;
        this.f8035i = type;
    }

    public r(w3.e processor, h4.b workTaskExecutor) {
        this.f8033d = 23;
        Intrinsics.checkNotNullParameter(processor, "processor");
        Intrinsics.checkNotNullParameter(workTaskExecutor, "workTaskExecutor");
        this.f8034e = processor;
        this.f8035i = workTaskExecutor;
    }

    public r(Map states) {
        this.f8033d = 6;
        Intrinsics.checkNotNullParameter(states, "states");
        this.f8034e = states;
        kq.j jVarD = new kq.l("Java nullability annotation states").d(new bp.i(2, this));
        Intrinsics.checkNotNullExpressionValue(jVarD, "createMemoizedFunctionWithNullableValues(...)");
        this.f8035i = jVarD;
    }

    public r(Function2 compute) {
        this.f8033d = 16;
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.f8034e = compute;
        this.f8035i = new ConcurrentHashMap();
    }

    public r(mp.q qVar, String className) {
        this.f8033d = 14;
        Intrinsics.checkNotNullParameter(className, "className");
        this.f8035i = qVar;
        this.f8034e = className;
    }
}
