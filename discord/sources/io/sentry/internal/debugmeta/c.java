package io.sentry.internal.debugmeta;

import android.content.ComponentName;
import android.content.Context;
import android.os.Looper;
import android.util.Log;
import android.view.Choreographer;
import android.view.MotionEvent;
import ci.b0;
import ci.o;
import ci.p;
import com.facebook.react.bridge.Promise;
import com.facebook.react.modules.core.PermissionListener;
import com.facebook.react.uimanager.JSPointerDispatcher;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.r;
import e4.f;
import ij.m;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import lq.d0;
import lq.d1;
import lq.e1;
import lq.i0;
import lq.p0;
import lq.q0;
import lq.s;
import lq.t0;
import lq.w0;
import lq.y0;
import lq.z;
import mj.e;
import mo.c0;
import nq.l;
import okio.Buffer;
import okio.ByteString;
import pq.h;
import rp.d;
import rs.v;
import sh.s0;
import sh.s1;
import sh.u0;
import sh.u1;
import sh.v0;
import sn.n;
import th.g;
import vo.n0;
import vo.r0;
import w3.q;
import zp.i;
import zp.j;
import zp.k;
import zp.t;
import zp.u;
import zp.w;
import zp.x;
import zp.y;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements a, PermissionListener, u0, g, p, mq.b, OnCompleteListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12758d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f12759e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f12760i;

    public /* synthetic */ c(int i7, Object obj, Object obj2) {
        this.f12758d = i7;
        this.f12759e = obj2;
        this.f12760i = obj;
    }

    public static void A0(HashMap map, m mVar) {
        Integer num = (Integer) map.get(mVar);
        map.put(mVar, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003a A[Catch: IOException -> 0x006f, TryCatch #0 {IOException -> 0x006f, blocks: (B:2:0x0000, B:3:0x000a, B:5:0x000d, B:7:0x001e, B:9:0x0026, B:21:0x0042, B:19:0x003a, B:20:0x003d, B:23:0x0047, B:24:0x004a, B:25:0x005b), top: B:30:0x0000 }] */
    public static c D0(String... strArr) {
        String str;
        try {
            ByteString[] byteStringArr = new ByteString[strArr.length];
            Buffer buffer = new Buffer();
            boolean z5 = false;
            for (int i7 = 0; i7 < strArr.length; i7++) {
                String str2 = strArr[i7];
                String[] strArr2 = w4.a.f22063w;
                buffer.U(34);
                int length = str2.length();
                int i10 = 0;
                for (int i11 = 0; i11 < length; i11++) {
                    char cCharAt = str2.charAt(i11);
                    if (cCharAt < 128) {
                        str = strArr2[cCharAt];
                        if (str != null) {
                            if (i10 < i11) {
                                buffer.j0(i10, i11, str2);
                            }
                            buffer.l0(str);
                            i10 = i11 + 1;
                        }
                    } else {
                        if (cCharAt == 8232) {
                            str = "\\u2028";
                        } else if (cCharAt == 8233) {
                            str = "\\u2029";
                        }
                        if (i10 < i11) {
                            buffer.j0(i10, i11, str2);
                        }
                        buffer.l0(str);
                        i10 = i11 + 1;
                    }
                }
                if (i10 < length) {
                    buffer.j0(i10, length, str2);
                }
                buffer.U(34);
                buffer.readByte();
                byteStringArr[i7] = buffer.m(buffer.f17413e);
            }
            String[] strArr3 = (String[]) strArr.clone();
            int i12 = rs.m.f19581v;
            return new c(strArr3, v.h(byteStringArr), 23, z5);
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public static mj.b G0(mj.b bVar, m mVar, m mVar2, m mVar3, m mVar4, int i7, int i10) {
        float f2 = i7 - 0.5f;
        float f7 = i10 - 0.5f;
        return android.support.v4.media.session.b.t(bVar, i7, i10, e.a(0.5f, 0.5f, f2, 0.5f, f2, f7, 0.5f, f7, mVar.f11823a, mVar.f11824b, mVar4.f11823a, mVar4.f11824b, mVar3.f11823a, mVar3.f11824b, mVar2.f11823a, mVar2.f11824b));
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static c r0(Context context) {
        FileChannel channel;
        FileLock fileLockLock;
        try {
            channel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                fileLockLock = channel.lock();
                try {
                    return new c(channel, fileLockLock, 26, false);
                } catch (IOException e10) {
                    e = e10;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        try {
                            fileLockLock.release();
                        } catch (IOException unused) {
                        }
                    }
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (IOException unused2) {
                        }
                    }
                    return null;
                } catch (Error e11) {
                    e = e11;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        fileLockLock.release();
                    }
                    if (channel != null) {
                        channel.close();
                    }
                    return null;
                } catch (OverlappingFileLockException e12) {
                    e = e12;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        fileLockLock.release();
                    }
                    if (channel != null) {
                        channel.close();
                    }
                    return null;
                }
            } catch (IOException | Error | OverlappingFileLockException e13) {
                e = e13;
                fileLockLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException e14) {
            e = e14;
            channel = null;
            fileLockLock = null;
        }
    }

    public static int t0(m mVar, m mVar2) {
        return q.y(m.a(mVar, mVar2));
    }

    @Override // mq.b
    public boolean A(h hVar) {
        return f.Q(hVar);
    }

    @Override // mq.b
    public boolean B(pq.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        return f.j(eVar) != null;
    }

    public boolean B0(m mVar) {
        float f2 = mVar.f11823a;
        if (f2 < 0.0f) {
            return false;
        }
        mj.b bVar = (mj.b) this.f12759e;
        if (f2 >= bVar.f15839d) {
            return false;
        }
        float f7 = mVar.f11824b;
        return f7 > 0.0f && f7 < ((float) bVar.f15840e);
    }

    @Override // mq.b
    public d1 C(t0 t0Var) {
        return f.F(this, t0Var);
    }

    public p0 C0() {
        Intrinsics.checkNotNullParameter(this, "typeSystemContext");
        mq.e kotlinTypePreparator = mq.e.f16017a;
        Intrinsics.checkNotNullParameter(kotlinTypePreparator, "kotlinTypePreparator");
        mq.f kotlinTypeRefiner = mq.f.f16018a;
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new p0(true, true, this, kotlinTypePreparator, kotlinTypeRefiner);
    }

    @Override // mq.b
    public q0 D(pq.e eVar) {
        return f.v0(eVar);
    }

    @Override // mq.b
    public void E(pq.e eVar, h constructor) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
    }

    public void E0() {
        try {
            ((FileLock) this.f12760i).release();
            ((FileChannel) this.f12759e).close();
        } catch (IOException e10) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e10);
        }
    }

    @Override // mq.b
    public boolean F(t0 t0Var) {
        return f.b0(t0Var);
    }

    public zp.g F0(z type, pp.e value, rp.f nameResolver) {
        Intrinsics.checkNotNullParameter(type, "expectedType");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        boolean zT = com.discord.chat.presentation.list.a.t(d.N, value.J, "get(...)");
        pp.d dVar = value.f18254i;
        switch (dVar == null ? -1 : hq.c.f11000a[dVar.ordinal()]) {
            case 1:
                byte b10 = (byte) value.f18255v;
                return zT ? new zp.z(b10) : new zp.d(b10);
            case 2:
                return new zp.e(Character.valueOf((char) value.f18255v));
            case 3:
                short s2 = (short) value.f18255v;
                return zT ? new zp.z(s2) : new w(s2);
            case 4:
                int i7 = (int) value.f18255v;
                return zT ? new zp.z(i7) : new k(i7);
            case 5:
                long j = value.f18255v;
                return zT ? new zp.z(j) : new u(j);
            case 6:
                return new zp.c(value.f18256w);
            case 7:
                return new zp.c(value.f18257x);
            case 8:
                return new zp.c(Boolean.valueOf(value.f18255v != 0));
            case 9:
                return new x(nameResolver.getString(value.f18258y));
            case 10:
                return new t(c0.s(nameResolver, value.E), value.I);
            case 11:
                return new i(c0.s(nameResolver, value.E), c0.w(nameResolver, value.F));
            case 12:
                pp.h hVar = value.G;
                Intrinsics.checkNotNullExpressionValue(hVar, "getAnnotation(...)");
                wo.c value2 = s0(hVar, nameResolver);
                Intrinsics.checkNotNullParameter(value2, "value");
                return new zp.a((Object) value2);
            case 13:
                List<pp.e> list = value.H;
                Intrinsics.checkNotNullExpressionValue(list, "getArrayElementList(...)");
                ArrayList value3 = new ArrayList(e0.l(list, 10));
                for (pp.e eVar : list) {
                    d0 d0VarE = ((vo.z) this.f12759e).f().e();
                    Intrinsics.checkNotNullExpressionValue(d0VarE, "getAnyType(...)");
                    Intrinsics.checkNotNull(eVar);
                    value3.add(F0(d0VarE, eVar, nameResolver));
                }
                Intrinsics.checkNotNullParameter(value3, "value");
                Intrinsics.checkNotNullParameter(type, "type");
                return new y(value3, type);
            default:
                throw new IllegalStateException(("Unsupported annotation argument type: " + value.f18254i + " (expected " + type + ')').toString());
        }
    }

    @Override // mq.b
    public boolean G(h hVar) {
        return f.P(hVar);
    }

    @Override // mq.b
    public boolean H(pq.e eVar, pq.e eVar2) {
        return f.L(eVar, eVar2);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:47:0x0131  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ba  */
    public n H0(y0 substitutor, List list, jp.a aVar) {
        d1 d1VarQ;
        n nVar = new n();
        Iterator it = list.iterator();
        if (it.hasNext()) {
            z zVar = (z) it.next();
            vo.i iVarG = zVar.r0().g();
            if (iVarG instanceof vo.f) {
                Set set = aVar.f13994e;
                Intrinsics.checkNotNullParameter(zVar, "<this>");
                Intrinsics.checkNotNullParameter(substitutor, "substitutor");
                d1 d1VarW0 = zVar.w0();
                if (d1VarW0 instanceof s) {
                    s sVar = (s) d1VarW0;
                    d0 d0VarQ = sVar.f15248e;
                    if (!d0VarQ.r0().getParameters().isEmpty() && d0VarQ.r0().g() != null) {
                        List<r0> parameters = d0VarQ.r0().getParameters();
                        Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
                        ArrayList arrayList = new ArrayList(e0.l(parameters, 10));
                        for (r0 r0Var : parameters) {
                            t0 i0Var = (t0) CollectionsKt.M(r0Var.getIndex(), zVar.l0());
                            boolean z5 = set != null && set.contains(r0Var);
                            if (i0Var == null || z5) {
                                i0Var = new i0(r0Var);
                            } else {
                                w0 w0VarG = substitutor.g();
                                z zVarB = i0Var.b();
                                Intrinsics.checkNotNullExpressionValue(zVarB, "getType(...)");
                                if (w0VarG.e(zVarB) == null) {
                                    i0Var = new i0(r0Var);
                                }
                            }
                            arrayList.add(i0Var);
                        }
                        d0VarQ = lq.c.q(d0VarQ, arrayList, null, 2);
                    }
                    d0 d0VarQ2 = sVar.f15249i;
                    if (!d0VarQ2.r0().getParameters().isEmpty() && d0VarQ2.r0().g() != null) {
                        List<r0> parameters2 = d0VarQ2.r0().getParameters();
                        Intrinsics.checkNotNullExpressionValue(parameters2, "getParameters(...)");
                        ArrayList arrayList2 = new ArrayList(e0.l(parameters2, 10));
                        for (r0 r0Var2 : parameters2) {
                            t0 i0Var2 = (t0) CollectionsKt.M(r0Var2.getIndex(), zVar.l0());
                            boolean z6 = set != null && set.contains(r0Var2);
                            if (i0Var2 == null || z6) {
                                i0Var2 = new i0(r0Var2);
                            } else {
                                w0 w0VarG2 = substitutor.g();
                                z zVarB2 = i0Var2.b();
                                Intrinsics.checkNotNullExpressionValue(zVarB2, "getType(...)");
                                if (w0VarG2.e(zVarB2) == null) {
                                    i0Var2 = new i0(r0Var2);
                                }
                            }
                            arrayList2.add(i0Var2);
                        }
                        d0VarQ2 = lq.c.q(d0VarQ2, arrayList2, null, 2);
                    }
                    d1VarQ = lq.c.e(d0VarQ, d0VarQ2);
                } else {
                    if (!(d1VarW0 instanceof d0)) {
                        throw new rn.n();
                    }
                    d0 d0Var = (d0) d1VarW0;
                    if (d0Var.r0().getParameters().isEmpty() || d0Var.r0().g() == null) {
                        d1VarQ = d0Var;
                    } else {
                        List<r0> parameters3 = d0Var.r0().getParameters();
                        Intrinsics.checkNotNullExpressionValue(parameters3, "getParameters(...)");
                        ArrayList arrayList3 = new ArrayList(e0.l(parameters3, 10));
                        for (r0 r0Var3 : parameters3) {
                            t0 i0Var3 = (t0) CollectionsKt.M(r0Var3.getIndex(), zVar.l0());
                            boolean z7 = set != null && set.contains(r0Var3);
                            if (i0Var3 == null || z7) {
                                i0Var3 = new i0(r0Var3);
                            } else {
                                w0 w0VarG3 = substitutor.g();
                                z zVarB3 = i0Var3.b();
                                Intrinsics.checkNotNullExpressionValue(zVarB3, "getType(...)");
                                if (w0VarG3.e(zVarB3) == null) {
                                    i0Var3 = new i0(r0Var3);
                                }
                            }
                            arrayList3.add(i0Var3);
                        }
                        d1VarQ = lq.c.q(d0Var, arrayList3, null, 2);
                    }
                }
                z zVarH = substitutor.h(lq.c.h(d1VarQ, d1VarW0), e1.OUT_VARIANCE);
                Intrinsics.checkNotNullExpressionValue(zVarH, "safeSubstitute(...)");
                nVar.add(zVarH);
            } else if (iVarG instanceof r0) {
                Set set2 = aVar.f13994e;
                if (set2 == null || !set2.contains(iVarG)) {
                    List upperBounds = ((r0) iVarG).getUpperBounds();
                    Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
                    nVar.addAll(H0(substitutor, upperBounds, aVar));
                } else {
                    nVar.add(x0(aVar));
                }
            }
        }
        return kotlin.collections.d1.a(nVar);
    }

    @Override // mq.b
    public Collection I(pq.e eVar) {
        return f.q0(this, eVar);
    }

    public rj.a I0(m mVar, m mVar2) {
        mj.b bVar = (mj.b) this.f12759e;
        int i7 = (int) mVar.f11823a;
        int i10 = (int) mVar.f11824b;
        int i11 = (int) mVar2.f11823a;
        int i12 = (int) mVar2.f11824b;
        boolean z5 = Math.abs(i12 - i10) > Math.abs(i11 - i7);
        if (z5) {
            i10 = i7;
            i7 = i10;
            i12 = i11;
            i11 = i12;
        }
        int iAbs = Math.abs(i11 - i7);
        int iAbs2 = Math.abs(i12 - i10);
        int i13 = (-iAbs) / 2;
        int i14 = i10 < i12 ? 1 : -1;
        int i15 = i7 >= i11 ? -1 : 1;
        boolean zB = bVar.b(z5 ? i10 : i7, z5 ? i7 : i10);
        int i16 = 0;
        while (i7 != i11) {
            boolean zB2 = bVar.b(z5 ? i10 : i7, z5 ? i7 : i10);
            if (zB2 != zB) {
                i16++;
                zB = zB2;
            }
            i13 += iAbs2;
            if (i13 > 0) {
                if (i10 == i12) {
                    break;
                }
                i10 += i14;
                i13 -= iAbs;
            }
            i7 += i15;
        }
        return new rj.a(mVar, mVar2, i16);
    }

    @Override // mq.b
    public d0 J(z zVar) {
        return f.m(zVar);
    }

    @Override // mq.b
    public mq.a K(pq.e eVar) {
        return f.t0(this, eVar);
    }

    @Override // mq.b
    public t0 L(pq.e eVar, int i7) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        if (i7 < 0 || i7 >= f.g(eVar)) {
            return null;
        }
        return f.y(eVar, i7);
    }

    @Override // mq.b
    public boolean M(h hVar) {
        return f.O(hVar);
    }

    @Override // mq.b
    public i0 N(pq.d dVar) {
        return f.n(dVar);
    }

    @Override // mq.b
    public d0 O(pq.d dVar) {
        d0 d0VarH0;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        s sVarL = f.l(dVar);
        if (sVarL != null && (d0VarH0 = f.h0(sVarL)) != null) {
            return d0VarH0;
        }
        d0 d0VarM = f.m(dVar);
        Intrinsics.checkNotNull(d0VarM);
        return d0VarM;
    }

    @Override // mq.b
    public boolean P(pq.d receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        return receiver instanceof mp.f;
    }

    @Override // mq.b
    public q0 Q(pq.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        d0 d0VarM = f.m(dVar);
        if (d0VarM == null) {
            d0VarM = O(dVar);
        }
        return f.v0(d0VarM);
    }

    @Override // mq.b
    public pq.i R(t0 t0Var) {
        return f.H(t0Var);
    }

    @Override // mq.b
    public void S(pq.e eVar) {
        f.c0(eVar);
    }

    @Override // mq.b
    public d1 T(ArrayList types) {
        d0 d0Var;
        Intrinsics.checkNotNullParameter(types, "types");
        Intrinsics.checkNotNullParameter(types, "types");
        int size = types.size();
        if (size == 0) {
            throw new IllegalStateException("Expected some types");
        }
        if (size == 1) {
            return (d1) CollectionsKt.Y(types);
        }
        ArrayList arrayList = new ArrayList(e0.l(types, 10));
        Iterator it = types.iterator();
        boolean z5 = false;
        boolean z6 = false;
        while (it.hasNext()) {
            d1 d1Var = (d1) it.next();
            z5 = z5 || lq.c.j(d1Var);
            if (d1Var instanceof d0) {
                d0Var = (d0) d1Var;
            } else {
                if (!(d1Var instanceof s)) {
                    throw new rn.n();
                }
                Intrinsics.checkNotNullParameter(d1Var, "<this>");
                d0Var = ((s) d1Var).f15248e;
                z6 = true;
            }
            arrayList.add(d0Var);
        }
        if (z5) {
            return l.c(nq.k.INTERSECTION_OF_ERROR_TYPES, types.toString());
        }
        mq.u uVar = mq.u.f16044a;
        if (!z6) {
            return uVar.b(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(e0.l(types, 10));
        Iterator it2 = types.iterator();
        while (it2.hasNext()) {
            arrayList2.add(lq.c.E((d1) it2.next()));
        }
        return lq.c.e(uVar.b(arrayList), uVar.b(arrayList2));
    }

    @Override // io.sentry.internal.debugmeta.a
    public List U() {
        ILogger iLogger = (ILogger) this.f12759e;
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<URL> resources = ((ClassLoader) this.f12760i).getResources("sentry-debug-meta.properties");
            while (resources.hasMoreElements()) {
                URL urlNextElement = resources.nextElement();
                try {
                    InputStream inputStreamOpenStream = urlNextElement.openStream();
                    try {
                        Properties properties = new Properties();
                        properties.load(inputStreamOpenStream);
                        arrayList.add(properties);
                        iLogger.q(SentryLevel.INFO, "Debug Meta Data Properties loaded from %s", urlNextElement);
                        if (inputStreamOpenStream != null) {
                            inputStreamOpenStream.close();
                        }
                    } catch (Throwable th2) {
                        if (inputStreamOpenStream != null) {
                            try {
                                inputStreamOpenStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                } catch (RuntimeException e10) {
                    iLogger.e(SentryLevel.ERROR, e10, "%s file is malformed.", urlNextElement);
                }
            }
        } catch (IOException e11) {
            iLogger.e(SentryLevel.ERROR, e11, "Failed to load %s", "sentry-debug-meta.properties");
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        iLogger.q(SentryLevel.INFO, "No %s file was found.", "sentry-debug-meta.properties");
        return null;
    }

    @Override // mq.b
    public d0 V(pq.e eVar) {
        return f.y0(eVar, true);
    }

    @Override // mq.b
    public r0 W(h hVar, int i7) {
        return f.D(hVar, i7);
    }

    @Override // mq.b
    public d0 X(pq.e eVar) {
        return f.y0(eVar, false);
    }

    @Override // mq.b
    public boolean Y(pq.d dVar) {
        return f.W(dVar);
    }

    @Override // mq.b
    public void Z(pq.e eVar) {
        f.d0(eVar);
    }

    @Override // sh.u0
    public Object a() {
        switch (this.f12758d) {
            case 20:
                v0 v0Var = (v0) this.f12759e;
                List list = (List) this.f12760i;
                HashMap map = new HashMap();
                for (s0 s0Var : v0Var.f20210c.values()) {
                    String str = s0Var.f20176c.f20161a;
                    if (list.contains(str)) {
                        s0 s0Var2 = (s0) map.get(str);
                        if ((s0Var2 == null ? -1 : s0Var2.f20174a) < s0Var.f20174a) {
                            map.put(str, s0Var);
                        }
                    }
                }
                return map;
            case 21:
                Object objA = ((th.f) this.f12759e).a();
                Context context = ((u1) ((pf.b) this.f12760i).f18027e).f20202a;
                s1 s1Var = (s1) objA;
                c9.a.b(context.getPackageManager(), new ComponentName(context.getPackageName(), "com.google.android.play.core.assetpacks.AssetPackExtractionService"));
                c9.a.b(context.getPackageManager(), new ComponentName(context.getPackageName(), "com.google.android.play.core.assetpacks.ExtractionForegroundService"));
                f.d(s1Var);
                return s1Var;
            default:
                return new wh.g(((ci.q) this.f12759e).f3721d, (b0) ((o) this.f12760i).a(), new kh.f(19));
        }
    }

    @Override // mq.b
    public boolean a0(h hVar) {
        return f.V(hVar);
    }

    @Override // mq.b
    public d0 b(s sVar) {
        return f.h0(sVar);
    }

    @Override // mq.b
    public pq.d b0(pq.d dVar) {
        return f.z0(this, dVar);
    }

    @Override // mq.b
    public boolean c(pq.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        return f.U(f.v0(eVar));
    }

    @Override // mq.b
    public pq.c c0(d0 d0Var) {
        return f.i(this, d0Var);
    }

    @Override // mq.b
    public boolean d(pq.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        d0 d0VarM = f.m(dVar);
        return (d0VarM != null ? f.j(d0VarM) : null) != null;
    }

    @Override // mq.b
    public d1 d0(pq.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return f.j0(dVar);
    }

    @Override // mq.b
    public d0 e(pq.d dVar) {
        return f.m(dVar);
    }

    @Override // mq.b
    public d1 e0(pq.c cVar) {
        return f.i0(cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mq.b
    public t0 f(pq.g gVar, int i7) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        if (gVar instanceof pq.f) {
            return f.y((pq.d) gVar, i7);
        }
        if (gVar instanceof pq.a) {
            E e10 = ((pq.a) gVar).get(i7);
            Intrinsics.checkNotNullExpressionValue(e10, "get(...)");
            return (t0) e10;
        }
        throw new IllegalStateException(("unknown type argument list type: " + gVar + ", " + Reflection.getOrCreateKotlinClass(gVar.getClass())).toString());
    }

    @Override // mq.b
    public pq.g f0(pq.e eVar) {
        return f.h(eVar);
    }

    @Override // mq.b
    public mq.i g(pq.c cVar) {
        return f.w0(cVar);
    }

    @Override // mq.b
    public pq.c g0(pq.e eVar) {
        pq.f fVarO0;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        lq.o oVarJ = f.j(eVar);
        if (oVarJ == null || (fVarO0 = f.o0(oVarJ)) == null) {
            fVarO0 = (pq.f) eVar;
        }
        return f.i(this, fVarO0);
    }

    @Override // mq.b
    public int h(h hVar) {
        return f.p0(hVar);
    }

    @Override // mq.b
    public int h0(pq.d dVar) {
        return f.g(dVar);
    }

    @Override // mq.b
    public boolean i(pq.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return !Intrinsics.areEqual(f.v0(O(dVar)), f.v0(x(dVar)));
    }

    @Override // mq.b
    public d0 i0(pq.e eVar) {
        pq.b bVar = pq.b.f18511d;
        return f.q(eVar);
    }

    @Override // mq.b
    public t0 j(yp.b bVar) {
        return f.r0(bVar);
    }

    @Override // mq.b
    public boolean j0(h c8, h c10) {
        Intrinsics.checkNotNullParameter(c8, "c1");
        Intrinsics.checkNotNullParameter(c10, "c2");
        if (!(c8 instanceof q0)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (!(c10 instanceof q0)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (f.f(c8, c10)) {
            return true;
        }
        q0 q0Var = (q0) c8;
        q0 q0Var2 = (q0) c10;
        Map map = (Map) this.f12759e;
        if (((mq.c) this.f12760i).a(q0Var, q0Var2)) {
            return true;
        }
        if (map == null) {
            return false;
        }
        q0 q0Var3 = (q0) map.get(q0Var);
        q0 q0Var4 = (q0) map.get(q0Var2);
        if (q0Var3 == null || !Intrinsics.areEqual(q0Var3, q0Var2)) {
            return q0Var4 != null && Intrinsics.areEqual(q0Var4, q0Var);
        }
        return true;
    }

    @Override // mq.b
    public boolean k(h hVar) {
        return f.X(hVar);
    }

    @Override // mq.b
    public boolean k0(h hVar) {
        return f.R(hVar);
    }

    @Override // mq.b
    public boolean l(h hVar) {
        return f.U(hVar);
    }

    @Override // mq.b
    public Collection l0(h hVar) {
        return f.u0(hVar);
    }

    @Override // mq.b
    public pq.i m(r0 r0Var) {
        return f.I(r0Var);
    }

    @Override // mq.b
    public d0 m0(s sVar) {
        return f.x0(sVar);
    }

    @Override // mq.b
    public boolean n(pq.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        return f.X(Q(eVar)) && !f.Y(eVar);
    }

    @Override // mq.b
    public boolean n0(r0 r0Var, h hVar) {
        return f.K(r0Var, hVar);
    }

    @Override // mq.b
    public boolean o(pq.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        d0 d0VarM = f.m(eVar);
        return (d0VarM != null ? g0(d0VarM) : null) != null;
    }

    @Override // mq.b
    public s o0(pq.d dVar) {
        return f.l(dVar);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((Map) ((e4.c) this.f12760i).f7967i).remove((ig.g) this.f12759e);
    }

    @Override // com.facebook.react.modules.core.PermissionListener
    public boolean onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        Promise promise = (Promise) this.f12759e;
        if (i7 == 1) {
            for (int i10 = 0; i10 < strArr.length; i10++) {
                String str = strArr[i10];
                if (iArr[i10] == -1) {
                    if (str.equals("android.permission.CAMERA")) {
                        promise.reject("E_NO_CAMERA_PERMISSION", "User did not grant camera permission.");
                    } else if (str.equals("android.permission.WRITE_EXTERNAL_STORAGE")) {
                        promise.reject("E_NO_LIBRARY_PERMISSION", "User did not grant library permission.");
                    } else {
                        promise.reject("E_NO_LIBRARY_PERMISSION", "Required permission missing");
                    }
                    return true;
                }
            }
            try {
                ((Callable) this.f12760i).call();
            } catch (Exception e10) {
                promise.reject("E_CALLBACK_ERROR", "Unknown error", e10);
            }
        }
        return true;
    }

    @Override // mq.b
    public boolean p(pq.e eVar) {
        return f.S(eVar);
    }

    @Override // mq.b
    public pq.b p0(pq.c cVar) {
        return f.r(cVar);
    }

    @Override // mq.b
    public t0 q(pq.d dVar, int i7) {
        return f.y(dVar, i7);
    }

    @Override // mq.b
    public d1 q0(pq.f fVar, pq.f fVar2) {
        return f.u(this, fVar, fVar2);
    }

    @Override // mq.b
    public boolean r(pq.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        return f.P(f.v0(eVar));
    }

    @Override // mq.b
    public int s(pq.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        if (gVar instanceof pq.e) {
            return f.g((pq.d) gVar);
        }
        if (gVar instanceof pq.a) {
            return ((pq.a) gVar).size();
        }
        throw new IllegalStateException(("unknown type argument list type: " + gVar + ", " + Reflection.getOrCreateKotlinClass(gVar.getClass())).toString());
    }

    public wo.c s0(pp.h proto, rp.f nameResolver) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        vo.f fVarQ = c0.q((vo.z) this.f12759e, c0.s(nameResolver, proto.f18304i), (r) this.f12760i);
        Map mapD = kotlin.collections.w0.d();
        if (proto.f18305v.size() != 0 && !l.f(fVarQ)) {
            int i7 = xp.e.f22999a;
            if (xp.e.n(fVarQ, vo.g.f21812w)) {
                Collection collectionP = fVarQ.p();
                Intrinsics.checkNotNullExpressionValue(collectionP, "getConstructors(...)");
                yo.h hVar = (yo.h) CollectionsKt.a0(collectionP);
                if (hVar != null) {
                    List listL = hVar.L();
                    Intrinsics.checkNotNullExpressionValue(listL, "getValueParameters(...)");
                    int iA = kotlin.collections.v0.a(e0.l(listL, 10));
                    if (iA < 16) {
                        iA = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                    for (Object obj : listL) {
                        linkedHashMap.put(((yo.q0) obj).getName(), obj);
                    }
                    List<pp.f> list = proto.f18305v;
                    Intrinsics.checkNotNullExpressionValue(list, "getArgumentList(...)");
                    ArrayList arrayList = new ArrayList();
                    for (pp.f fVar : list) {
                        Intrinsics.checkNotNull(fVar);
                        yo.q0 q0Var = (yo.q0) linkedHashMap.get(c0.w(nameResolver, fVar.f18275i));
                        Object pair = null;
                        if (q0Var != null) {
                            up.e eVarW = c0.w(nameResolver, fVar.f18275i);
                            z type = q0Var.getType();
                            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                            pp.e eVar = fVar.f18276v;
                            Intrinsics.checkNotNullExpressionValue(eVar, "getValue(...)");
                            zp.g gVarF0 = F0(type, eVar, nameResolver);
                            pair = u0(gVarF0, type, eVar) ? gVarF0 : null;
                            if (pair == null) {
                                String message = "Unexpected argument value: actual type " + eVar.f18254i + " != expected type " + type;
                                Intrinsics.checkNotNullParameter(message, "message");
                                pair = new j(message);
                            }
                            pair = new Pair(eVarW, pair);
                        }
                        if (pair != null) {
                            arrayList.add(pair);
                        }
                    }
                    mapD = kotlin.collections.w0.l(arrayList);
                }
            }
        }
        return new wo.c(fVarQ.j(), mapD, n0.C);
    }

    @Override // mq.b
    public boolean t(d1 d1Var) {
        Intrinsics.checkNotNullParameter(d1Var, "<this>");
        return f.W(O(d1Var)) != f.W(x(d1Var));
    }

    public String toString() {
        switch (this.f12758d) {
            case 16:
                String string = "[ ";
                if (((p0.e) this.f12759e) != null) {
                    for (int i7 = 0; i7 < 9; i7++) {
                        StringBuilder sbN = kk.b.n(string);
                        sbN.append(((p0.e) this.f12759e).E[i7]);
                        sbN.append(" ");
                        string = sbN.toString();
                    }
                }
                StringBuilder sbO = kk.b.o(string, "] ");
                sbO.append((p0.e) this.f12759e);
                return sbO.toString();
            case 17:
            default:
                return super.toString();
            case 18:
                return ((String) this.f12759e) + ", " + ((String) this.f12760i);
        }
    }

    @Override // mq.b
    public boolean u(pq.c receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        return receiver instanceof yp.a;
    }

    public boolean u0(zp.g gVar, z zVar, pp.e eVar) {
        vo.z zVar2 = (vo.z) this.f12759e;
        pp.d dVar = eVar.f18254i;
        int i7 = dVar == null ? -1 : hq.c.f11000a[dVar.ordinal()];
        if (i7 == 10) {
            vo.i iVarG = zVar.r0().g();
            vo.f fVar = iVarG instanceof vo.f ? (vo.f) iVarG : null;
            if (fVar == null) {
                return true;
            }
            up.e eVar2 = so.i.f20342e;
            return so.i.b(fVar, so.o.Q);
        }
        if (i7 != 13) {
            return Intrinsics.areEqual(gVar.a(zVar2), zVar);
        }
        if (gVar instanceof zp.b) {
            Object obj = ((zp.b) gVar).f24066a;
            if (((List) obj).size() == eVar.H.size()) {
                z zVarG = zVar2.f().g(zVar);
                if (zVarG == null) {
                    return false;
                }
                Iterable iterableE = kotlin.collections.d0.e((Collection) obj);
                if ((iterableE instanceof Collection) && ((Collection) iterableE).isEmpty()) {
                    return true;
                }
                Iterator it = iterableE.iterator();
                while (((lo.b) it).f15156i) {
                    int iNextInt = ((kotlin.collections.s0) it).nextInt();
                    zp.g gVar2 = (zp.g) ((List) obj).get(iNextInt);
                    pp.e eVar3 = (pp.e) eVar.H.get(iNextInt);
                    Intrinsics.checkNotNullExpressionValue(eVar3, "getArrayElement(...)");
                    if (!u0(gVar2, zVarG, eVar3)) {
                        return false;
                    }
                }
                return true;
            }
        }
        throw new IllegalStateException(("Deserialized ArrayValue should have the same number of elements as the original array value: " + gVar).toString());
    }

    @Override // mq.b
    public void v(pq.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        s sVarL = f.l(dVar);
        if (sVarL != null) {
            f.k(sVarL);
        }
    }

    public File v0() {
        if (((File) this.f12759e) == null) {
            this.f12759e = new File(((Context) this.f12760i).getCacheDir(), "volley");
        }
        return (File) this.f12759e;
    }

    @Override // mq.b
    public d0 w(s sVar) {
        return f.h0(sVar);
    }

    public Object w0(Class key) {
        Intrinsics.checkNotNullParameter(key, "key");
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f12760i;
        Object obj = concurrentHashMap.get(key);
        if (obj != null) {
            return obj;
        }
        Object objInvoke = ((Function1) this.f12759e).invoke(key);
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(key, objInvoke);
        return objPutIfAbsent == null ? objInvoke : objPutIfAbsent;
    }

    @Override // mq.b
    public d0 x(pq.d dVar) {
        d0 d0VarX0;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        s sVarL = f.l(dVar);
        if (sVarL != null && (d0VarX0 = f.x0(sVarL)) != null) {
            return d0VarX0;
        }
        d0 d0VarM = f.m(dVar);
        Intrinsics.checkNotNull(d0VarM);
        return d0VarM;
    }

    public d1 x0(jp.a aVar) {
        d1 d1VarG;
        d0 d0Var = aVar.f13995f;
        return (d0Var == null || (d1VarG = c9.a.G(d0Var)) == null) ? (nq.i) ((rn.u) this.f12759e).getValue() : d1VarG;
    }

    @Override // mq.b
    public d0 y(s sVar) {
        return f.x0(sVar);
    }

    public z y0(r0 typeParameter, jp.a typeAttr) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        Intrinsics.checkNotNullParameter(typeAttr, "typeAttr");
        Object objInvoke = ((kq.e) this.f12760i).invoke(new lq.s0(typeParameter, typeAttr));
        Intrinsics.checkNotNullExpressionValue(objInvoke, "invoke(...)");
        return (z) objInvoke;
    }

    @Override // mq.b
    public boolean z(pq.c cVar) {
        return f.a0(cVar);
    }

    public void z0(MotionEvent motionEvent, EventDispatcher eventDispatcher, boolean z5) throws IllegalAccessException, InvocationTargetException {
        JSPointerDispatcher jSPointerDispatcher = (JSPointerDispatcher) this.f12759e;
        Method method = (Method) ((rn.u) this.f12760i).getValue();
        if (method != null) {
            if (method.getParameterTypes().length == 3) {
                method.invoke(jSPointerDispatcher, motionEvent, eventDispatcher, Boolean.valueOf(z5));
            } else {
                method.invoke(jSPointerDispatcher, motionEvent, eventDispatcher);
            }
        }
    }

    public /* synthetic */ c(int i7, boolean z5) {
        this.f12758d = i7;
    }

    public c(ci.q qVar, o oVar, i8.c cVar) {
        this.f12758d = 24;
        this.f12759e = qVar;
        this.f12760i = oVar;
    }

    public /* synthetic */ c(Object obj, Object obj2, int i7, boolean z5) {
        this.f12758d = i7;
        this.f12759e = obj;
        this.f12760i = obj2;
    }

    public c(HashMap map, mq.c equalityAxioms) {
        this.f12758d = 25;
        Intrinsics.checkNotNullParameter(equalityAxioms, "equalityAxioms");
        mq.f kotlinTypeRefiner = mq.f.f16018a;
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        mq.e kotlinTypePreparator = mq.e.f16017a;
        Intrinsics.checkNotNullParameter(kotlinTypePreparator, "kotlinTypePreparator");
        this.f12759e = map;
        this.f12760i = equalityAxioms;
    }

    public c(cm.c viewGroup) {
        this.f12758d = 4;
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        this.f12759e = new JSPointerDispatcher(viewGroup);
        this.f12760i = rn.l.b(new a7.a(3));
    }

    public c(jp.e projectionComputer) {
        this.f12758d = 13;
        lq.f options = new lq.f();
        Intrinsics.checkNotNullParameter(projectionComputer, "projectionComputer");
        Intrinsics.checkNotNullParameter(options, "options");
        kq.l lVar = new kq.l("Type parameter upper bound erasure results");
        int i7 = 13;
        this.f12759e = rn.l.b(new ep.x(i7, this));
        kq.e eVarC = lVar.c(new bp.i(i7, this));
        Intrinsics.checkNotNullExpressionValue(eVarC, "createMemoizedFunction(...)");
        this.f12760i = eVarC;
    }

    public c(Object obj) {
        this.f12758d = 12;
        this.f12759e = obj;
        this.f12760i = Thread.currentThread();
    }

    public c(Function1 compute) {
        this.f12758d = 17;
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.f12759e = compute;
        this.f12760i = new ConcurrentHashMap();
    }

    public c(ILogger iLogger) {
        this.f12758d = 0;
        ClassLoader classLoader = c.class.getClassLoader();
        this.f12759e = iLogger;
        this.f12760i = q.j(classLoader);
    }

    public c(vo.z module, r notFoundClasses) {
        this.f12758d = 8;
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        this.f12759e = module;
        this.f12760i = notFoundClasses;
    }

    public c(p0.d dVar) {
        this.f12758d = 16;
        this.f12760i = dVar;
    }

    public c(mj.b bVar) {
        this.f12758d = 19;
        this.f12759e = bVar;
        this.f12760i = new ic.n0(bVar);
    }

    public c(String userId, String str) {
        this.f12758d = 14;
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.f12759e = userId;
        this.f12760i = str;
        if (userId.length() <= 0) {
            throw new IllegalArgumentException("userId should not be empty");
        }
    }

    public c(Context context) {
        this.f12758d = 5;
        this.f12760i = context;
        this.f12759e = null;
    }

    public c(int i7) {
        this.f12758d = i7;
        switch (i7) {
            case 22:
                List list = Collections.EMPTY_LIST;
                this.f12759e = list;
                this.f12760i = list;
                break;
            default:
                this.f12759e = Choreographer.getInstance();
                this.f12760i = Looper.myLooper();
                break;
        }
    }
}
