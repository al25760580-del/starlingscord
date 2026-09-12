package ls;

import af.w;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.datastore.preferences.protobuf.d1;
import bp.o;
import com.google.android.gms.common.api.Status;
import cr.r;
import ep.p;
import ep.q;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import je.e0;
import jq.v;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.n0;
import kotlin.collections.y;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.coroutines.channels.Channel;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.modules.SerializersModule;
import lq.z;
import mo.c0;
import or.e1;
import or.h0;
import or.l1;
import or.m1;
import or.u0;
import or.y0;
import po.n1;
import pp.f1;
import pp.g0;
import vo.q0;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    public static String A(int i7) {
        Object[] objArr = {Integer.valueOf(Color.red(i7)), Integer.valueOf(Color.green(i7)), Integer.valueOf(Color.blue(i7)), Double.valueOf(((double) Color.alpha(i7)) / 255.0d)};
        int i10 = e0.f13788a;
        return String.format(Locale.US, "rgba(%d,%d,%d,%.3f)", objArr);
    }

    public static final p B(y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        if (y0Var == null) {
            q.a(4);
            throw null;
        }
        p pVarF = (p) q.f8585d.get(y0Var);
        if (pVarF == null) {
            pVarF = vo.p.f(y0Var);
        }
        Intrinsics.checkNotNullExpressionValue(pVarF, "toDescriptorVisibility(...)");
        return pVarF;
    }

    public static final Object C(Function1 function1, xn.h frame) {
        u.j jVar = (u.j) frame.getContext().l(u.i.f20887e);
        if (jVar == null) {
            throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        }
        j0.f fVar = (j0.f) jVar;
        j0.d dVar = fVar.f13593e;
        ar.k kVar = new ar.k(1, wn.f.b(frame));
        kVar.t();
        j0.e callback = new j0.e(kVar, fVar, function1);
        if (Intrinsics.areEqual(dVar.f13585i, fVar.f13592d)) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            synchronized (dVar.f13587w) {
                try {
                    dVar.f13589y.add(callback);
                    if (!dVar.G) {
                        dVar.G = true;
                        dVar.f13585i.postFrameCallback(dVar.H);
                    }
                    Unit unit = Unit.f14616a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            kVar.v(new es.c(2, dVar, callback));
        } else {
            fVar.f13592d.postFrameCallback(callback);
            kVar.v(new es.c(3, fVar, callback));
        }
        Object objR = kVar.r();
        if (objR == wn.a.f22354d) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objR;
    }

    public static cr.h a(int i7, int i10, cr.a aVar) {
        if ((i10 & 2) != 0) {
            aVar = cr.a.f7342d;
        }
        if (i7 == -2) {
            if (aVar != cr.a.f7342d) {
                return new r(1, aVar);
            }
            Channel.f14753l.getClass();
            return new cr.h(cr.k.f7383b);
        }
        if (i7 == -1) {
            if (aVar == cr.a.f7342d) {
                return new r(1, cr.a.f7343e);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i7 == 0) {
            return aVar == cr.a.f7342d ? new cr.h(0) : new r(1, aVar);
        }
        if (i7 != Integer.MAX_VALUE) {
            return aVar == cr.a.f7342d ? new cr.h(i7) : new r(i7, aVar);
        }
        return new cr.h(Integer.MAX_VALUE);
    }

    public static final void b(int i7, String str) {
        String message = "TabsScreen [" + i7 + "] emits event: " + str;
        Intrinsics.checkNotNullParameter("TabsScreenEventEmitter", "tag");
        Intrinsics.checkNotNullParameter(message, "message");
    }

    public static String c(int i7, int i10, String str) {
        if (i7 < 0) {
            return mf.f.A("%s (%s) must not be negative", str, Integer.valueOf(i7));
        }
        if (i10 >= 0) {
            return mf.f.A("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i7), Integer.valueOf(i10));
        }
        StringBuilder sb2 = new StringBuilder(26);
        sb2.append("negative size: ");
        sb2.append(i10);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static void d(boolean z5, String str, long j) {
        if (!z5) {
            throw new IllegalArgumentException(mf.f.A(str, Long.valueOf(j)));
        }
    }

    public static void e(int i7, int i10) {
        String strA;
        if (i7 < 0 || i7 >= i10) {
            if (i7 < 0) {
                strA = mf.f.A("%s (%s) must not be negative", "index", Integer.valueOf(i7));
            } else {
                if (i10 < 0) {
                    StringBuilder sb2 = new StringBuilder(26);
                    sb2.append("negative size: ");
                    sb2.append(i10);
                    throw new IllegalArgumentException(sb2.toString());
                }
                strA = mf.f.A("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i7), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(strA);
        }
    }

    public static void f(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void g(int i7, int i10) {
        if (i7 < 0 || i7 > i10) {
            throw new IndexOutOfBoundsException(c(i7, i10, "index"));
        }
    }

    public static void h(int i7, int i10, int i11) {
        String strC;
        if (i7 < 0 || i10 < i7 || i10 > i11) {
            if (i7 < 0 || i7 > i11) {
                strC = c(i7, i11, "start index");
            } else {
                strC = (i10 < 0 || i10 > i11) ? c(i10, i11, "end index") : mf.f.A("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i7));
            }
            throw new IndexOutOfBoundsException(strC);
        }
    }

    public static e4.i i(e4.i iVar, vo.h containingDeclaration, o oVar, int i7) {
        if ((i7 & 2) != 0) {
            oVar = null;
        }
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        return new e4.i((hp.a) iVar.f7980e, oVar != null ? new hp.e(iVar, containingDeclaration, oVar, 0) : (hp.f) iVar.f7981i, rn.l.a(rn.m.f19487i, new fp.b(1, iVar, containingDeclaration)));
    }

    public static final void k(vo.f fVar, LinkedHashSet linkedHashSet, eq.o oVar, boolean z5) {
        for (vo.l lVar : sa.a.m(oVar, eq.f.f8625o, 2)) {
            if (lVar instanceof vo.f) {
                vo.f fVarB0 = (vo.f) lVar;
                if (fVarB0.y()) {
                    up.e name = fVarB0.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    vo.i iVarG = oVar.g(name, dp.c.f7696v);
                    fVarB0 = iVarG instanceof vo.f ? (vo.f) iVarG : iVarG instanceof q0 ? ((v) ((q0) iVarG)).B0() : null;
                }
                if (fVarB0 != null) {
                    int i7 = xp.e.f22999a;
                    Iterator it = fVarB0.n().h().iterator();
                    while (it.hasNext()) {
                        if (xp.e.p((z) it.next(), fVar.a())) {
                            linkedHashSet.add(fVarB0);
                            break;
                        }
                    }
                    if (z5) {
                        eq.o oVarH0 = fVarB0.h0();
                        Intrinsics.checkNotNullExpressionValue(oVarH0, "getUnsubstitutedInnerClassesScope(...)");
                        k(fVar, linkedHashSet, oVarH0, z5);
                    }
                }
            }
        }
    }

    public static final e4.i l(e4.i iVar, wo.h additionalAnnotations) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(additionalAnnotations, "additionalAnnotations");
        return additionalAnnotations.isEmpty() ? iVar : new e4.i((hp.a) iVar.f7980e, (hp.f) iVar.f7981i, rn.l.a(rn.m.f19487i, new fp.b(2, iVar, additionalAnnotations)));
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0060 A[Catch: all -> 0x007a, TryCatch #1 {all -> 0x007a, blocks: (B:3:0x001a, B:5:0x002d, B:7:0x0031, B:14:0x003e, B:16:0x0057, B:17:0x005a, B:19:0x0060, B:21:0x0064, B:22:0x0074, B:24:0x0076, B:25:0x0079, B:10:0x0036, B:12:0x003a), top: B:41:0x001a, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0064 A[Catch: all -> 0x007a, TryCatch #1 {all -> 0x007a, blocks: (B:3:0x001a, B:5:0x002d, B:7:0x0031, B:14:0x003e, B:16:0x0057, B:17:0x005a, B:19:0x0060, B:21:0x0064, B:22:0x0074, B:24:0x0076, B:25:0x0079, B:10:0x0036, B:12:0x003a), top: B:41:0x001a, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x007d  */
    public static iq.c m(up.c fqName, kq.l storageManager, vo.z module, InputStream inputStream) throws IOException {
        g0 g0Var;
        vp.a aVar;
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        try {
            qp.a aVar2 = qp.a.f18978f;
            qp.a aVarS = android.support.v4.media.session.b.s(inputStream);
            qp.a ourVersion = qp.a.f18978f;
            int i7 = aVarS.f19508c;
            Intrinsics.checkNotNullParameter(ourVersion, "ourVersion");
            int i10 = aVarS.f19507b;
            if (i10 == 0) {
                if (ourVersion.f19507b == 0 && i7 == ourVersion.f19508c) {
                    vp.g gVar = new vp.g();
                    qp.b.a(gVar);
                    pp.a aVar3 = g0.H;
                    aVar3.getClass();
                    vp.e eVar = new vp.e(inputStream);
                    aVar = (vp.a) aVar3.a(eVar, gVar);
                    try {
                        eVar.a(0);
                        if (aVar.b()) {
                            vp.q qVar = new vp.q(new d1().getMessage());
                            qVar.f21916d = aVar;
                            throw qVar;
                        }
                        g0Var = (g0) aVar;
                    } catch (vp.q e10) {
                        e10.f21916d = aVar;
                        throw e10;
                    }
                } else {
                    g0Var = null;
                }
            } else if (i10 != ourVersion.f19507b || i7 > ourVersion.f19508c) {
                g0Var = null;
            } else {
                vp.g gVar2 = new vp.g();
                qp.b.a(gVar2);
                pp.a aVar4 = g0.H;
                aVar4.getClass();
                vp.e eVar2 = new vp.e(inputStream);
                aVar = (vp.a) aVar4.a(eVar2, gVar2);
                eVar2.a(0);
                if (aVar.b()) {
                    vp.q qVar2 = new vp.q(new d1().getMessage());
                    qVar2.f21916d = aVar;
                    throw qVar2;
                }
                g0Var = (g0) aVar;
            }
            g0 g0Var2 = g0Var;
            inputStream.close();
            if (g0Var2 != null) {
                return new iq.c(fqName, storageManager, module, g0Var2, aVarS);
            }
            throw new UnsupportedOperationException("Kotlin built-in definition format version is not supported: expected " + ourVersion + ", actual " + aVarS + ". Please update Kotlin");
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                d.k(inputStream, th2);
                throw th3;
            }
        }
    }

    public static rp.g n(f1 table) {
        Intrinsics.checkNotNullParameter(table, "table");
        if (table.f18286e.size() == 0) {
            return rp.g.f19539b;
        }
        List list = table.f18286e;
        Intrinsics.checkNotNullExpressionValue(list, "getRequirementList(...)");
        return new rp.g(list);
    }

    public static n1.c o(String type, Bundle data) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            int iHashCode = type.hashCode();
            if (iHashCode != -1678407252) {
                if (iHashCode != -543568185) {
                    if (iHashCode == -95037569 && type.equals("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                        Intrinsics.checkNotNullParameter(data, "data");
                        try {
                            String string = data.getString("androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON");
                            Intrinsics.checkNotNull(string);
                            return new n1.f(string, data);
                        } catch (Exception unused) {
                            throw new r1.a();
                        }
                    }
                } else if (type.equals("android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                    Intrinsics.checkNotNullParameter(data, "data");
                    return new n1.d("android.credentials.TYPE_PASSWORD_CREDENTIAL", data);
                }
            } else if (type.equals("androidx.credentials.TYPE_DIGITAL_CREDENTIAL")) {
                Intrinsics.checkNotNullParameter(data, "data");
                try {
                    String string2 = data.getString("androidx.credentials.BUNDLE_KEY_RESPONSE_JSON");
                    Intrinsics.checkNotNull(string2);
                    return new n1.d(string2);
                } catch (Exception unused2) {
                    throw new r1.a();
                }
            }
            throw new r1.a();
        } catch (r1.a unused3) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(data, "data");
            n1.d dVar = new n1.d(type, data);
            if (type.length() > 0) {
                return dVar;
            }
            throw new IllegalArgumentException("type should not be empty");
        }
    }

    public static bf.b p(byte[] bArr, Parcelable.Creator creator) {
        w.g(creator);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        bf.b bVar = (bf.b) creator.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return bVar;
    }

    public static final void q(Reader reader, Function1 action) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        BufferedReader bufferedReader = reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, 8192);
        try {
            Iterator it = t(bufferedReader).iterator();
            while (it.hasNext()) {
                action.invoke(it.next());
            }
            Unit unit = Unit.f14616a;
            bufferedReader.close();
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                d.k(bufferedReader, th2);
                throw th3;
            }
        }
    }

    public static String r() {
        byte[] bArr = new byte[16];
        io.sentry.util.j.a().b(bArr);
        byte b10 = (byte) (bArr[6] & 15);
        bArr[6] = b10;
        bArr[6] = (byte) (b10 | 64);
        byte b11 = (byte) (bArr[8] & 63);
        bArr[8] = b11;
        bArr[8] = (byte) (b11 | ByteCompanionObject.MIN_VALUE);
        long j = 0;
        long j5 = 0;
        for (int i7 = 0; i7 < 8; i7++) {
            j5 = (j5 << 8) | ((long) (bArr[i7] & 255));
        }
        for (int i10 = 8; i10 < 16; i10++) {
            j = (j << 8) | ((long) (bArr[i10] & 255));
        }
        UUID uuid = new UUID(j5, j);
        char[] cArr = io.sentry.util.m.f13235a;
        long mostSignificantBits = uuid.getMostSignificantBits();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        char[] cArr2 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, cArr[(int) (((-1152921504606846976L) & leastSignificantBits) >>> 60)], cArr[(int) ((1080863910568919040L & leastSignificantBits) >>> 56)], cArr[(int) ((67553994410557440L & leastSignificantBits) >>> 52)], cArr[(int) ((4222124650659840L & leastSignificantBits) >>> 48)], cArr[(int) ((263882790666240L & leastSignificantBits) >>> 44)], cArr[(int) ((16492674416640L & leastSignificantBits) >>> 40)], cArr[(int) ((1030792151040L & leastSignificantBits) >>> 36)], cArr[(int) ((64424509440L & leastSignificantBits) >>> 32)], cArr[(int) ((4026531840L & leastSignificantBits) >>> 28)], cArr[(int) ((251658240 & leastSignificantBits) >>> 24)], cArr[(int) ((15728640 & leastSignificantBits) >>> 20)], cArr[(int) ((983040 & leastSignificantBits) >>> 16)], cArr[(int) ((61440 & leastSignificantBits) >>> 12)], cArr[(int) ((3840 & leastSignificantBits) >>> 8)], cArr[(int) ((240 & leastSignificantBits) >>> 4)], cArr[(int) (15 & leastSignificantBits)]};
        io.sentry.util.m.a(cArr2, mostSignificantBits);
        char[] cArr3 = io.sentry.util.m.f13235a;
        return new String(cArr2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean s(n1 n1Var) {
        Intrinsics.checkNotNullParameter(n1Var, "<this>");
        if (n1Var instanceof mo.k) {
            Field fieldT = c0.t(n1Var);
            if (!(fieldT != null ? fieldT.isAccessible() : true)) {
                return false;
            }
            Intrinsics.checkNotNullParameter(n1Var, "<this>");
            Method methodU = c0.u(n1Var.getGetter());
            if (!(methodU != null ? methodU.isAccessible() : true)) {
                return false;
            }
            mo.k kVar = (mo.k) n1Var;
            Intrinsics.checkNotNullParameter(kVar, "<this>");
            Method methodU2 = c0.u(kVar.getSetter());
            if (!(methodU2 != null ? methodU2.isAccessible() : true)) {
                return false;
            }
        } else {
            Field fieldT2 = c0.t(n1Var);
            if (!(fieldT2 != null ? fieldT2.isAccessible() : true)) {
                return false;
            }
            Intrinsics.checkNotNullParameter(n1Var, "<this>");
            Method methodU3 = c0.u(n1Var.getGetter());
            if (!(methodU3 != null ? methodU3.isAccessible() : true)) {
                return false;
            }
        }
        return true;
    }

    public static final xq.a t(BufferedReader bufferedReader) {
        Intrinsics.checkNotNullParameter(bufferedReader, "<this>");
        co.q qVar = new co.q(bufferedReader);
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        return new xq.a(qVar);
    }

    public static final Class v(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            Intrinsics.checkNotNullExpressionValue(rawType, "getRawType(...)");
            return v(rawType);
        }
        if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
            Object objS = y.s(upperBounds);
            Intrinsics.checkNotNullExpressionValue(objS, "first(...)");
            return v((Type) objS);
        }
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            Intrinsics.checkNotNullExpressionValue(genericComponentType, "getGenericComponentType(...)");
            return v(genericComponentType);
        }
        throw new IllegalArgumentException("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument " + type + " has type " + Reflection.getOrCreateKotlinClass(type.getClass()));
    }

    public static final String w(Reader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "<this>");
        StringWriter out = new StringWriter();
        Intrinsics.checkNotNullParameter(reader, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        char[] cArr = new char[8192];
        int i7 = reader.read(cArr);
        while (i7 >= 0) {
            out.write(cArr, 0, i7);
            i7 = reader.read(cArr);
        }
        String string = out.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static final KSerializer x(SerializersModule serializersModule, Class cls, List list) {
        KSerializer[] kSerializerArr = (KSerializer[]) list.toArray(new KSerializer[0]);
        KSerializer kSerializerD = e1.d(cls, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
        if (kSerializerD != null) {
            return kSerializerD;
        }
        Intrinsics.checkNotNullParameter(cls, "<this>");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(cls);
        sn.i iVar = l1.f17571a;
        Intrinsics.checkNotNullParameter(orCreateKotlinClass, "<this>");
        KSerializer kSerializer = (KSerializer) l1.f17571a.get(orCreateKotlinClass);
        if (kSerializer != null) {
            return kSerializer;
        }
        serializersModule.b(orCreateKotlinClass, list);
        if (!cls.isInterface()) {
            return null;
        }
        Intrinsics.checkNotNullParameter(cls, "<this>");
        return new kr.d(Reflection.getOrCreateKotlinClass(cls));
    }

    public static final KSerializer y(SerializersModule serializersModule, Type type, boolean z5) {
        ArrayList<KSerializer> arrayList;
        KSerializer elementSerializer;
        KSerializer elementSerializer2;
        KClass kClass;
        if (type instanceof GenericArrayType) {
            Type type2 = ((GenericArrayType) type).getGenericComponentType();
            if (type2 instanceof WildcardType) {
                Type[] upperBounds = ((WildcardType) type2).getUpperBounds();
                Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
                type2 = (Type) y.s(upperBounds);
            }
            Intrinsics.checkNotNull(type2);
            if (z5) {
                elementSerializer2 = d.E(serializersModule, type2);
            } else {
                Intrinsics.checkNotNullParameter(serializersModule, "<this>");
                Intrinsics.checkNotNullParameter(type2, "type");
                elementSerializer2 = y(serializersModule, type2, false);
                if (elementSerializer2 == null) {
                    return null;
                }
            }
            if (type2 instanceof ParameterizedType) {
                Type rawType = ((ParameterizedType) type2).getRawType();
                Intrinsics.checkNotNull(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
                kClass = gn.h.E((Class) rawType);
            } else {
                if (!(type2 instanceof KClass)) {
                    throw new IllegalStateException("unsupported type in GenericArray: " + Reflection.getOrCreateKotlinClass(type2.getClass()));
                }
                kClass = (KClass) type2;
            }
            Intrinsics.checkNotNull(kClass, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            Intrinsics.checkNotNullParameter(kClass, "kClass");
            Intrinsics.checkNotNullParameter(elementSerializer2, "elementSerializer");
            m1 m1Var = new m1(kClass, elementSerializer2);
            Intrinsics.checkNotNull(m1Var, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return m1Var;
        }
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (!cls.isArray() || cls.getComponentType().isPrimitive()) {
                Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
                return x(serializersModule, cls, n0.f14659d);
            }
            Class<?> type3 = cls.getComponentType();
            Intrinsics.checkNotNullExpressionValue(type3, "getComponentType(...)");
            if (z5) {
                elementSerializer = d.E(serializersModule, type3);
            } else {
                Intrinsics.checkNotNullParameter(serializersModule, "<this>");
                Intrinsics.checkNotNullParameter(type3, "type");
                elementSerializer = y(serializersModule, type3, false);
                if (elementSerializer == null) {
                    return null;
                }
            }
            KClass kClass2 = gn.h.E(type3);
            Intrinsics.checkNotNull(kClass2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            Intrinsics.checkNotNullParameter(kClass2, "kClass");
            Intrinsics.checkNotNullParameter(elementSerializer, "elementSerializer");
            m1 m1Var2 = new m1(kClass2, elementSerializer);
            Intrinsics.checkNotNull(m1Var2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return m1Var2;
        }
        if (!(type instanceof ParameterizedType)) {
            if (type instanceof WildcardType) {
                Type[] upperBounds2 = ((WildcardType) type).getUpperBounds();
                Intrinsics.checkNotNullExpressionValue(upperBounds2, "getUpperBounds(...)");
                Object objS = y.s(upperBounds2);
                Intrinsics.checkNotNullExpressionValue(objS, "first(...)");
                return y(serializersModule, (Type) objS, true);
            }
            throw new IllegalArgumentException("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument " + type + " has type " + Reflection.getOrCreateKotlinClass(type.getClass()));
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type rawType2 = parameterizedType.getRawType();
        Intrinsics.checkNotNull(rawType2, "null cannot be cast to non-null type java.lang.Class<*>");
        Class cls2 = (Class) rawType2;
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Intrinsics.checkNotNull(actualTypeArguments);
        if (z5) {
            arrayList = new ArrayList(actualTypeArguments.length);
            for (Type type4 : actualTypeArguments) {
                Intrinsics.checkNotNull(type4);
                arrayList.add(d.E(serializersModule, type4));
            }
        } else {
            arrayList = new ArrayList(actualTypeArguments.length);
            for (Type type5 : actualTypeArguments) {
                Intrinsics.checkNotNull(type5);
                Intrinsics.checkNotNullParameter(serializersModule, "<this>");
                Intrinsics.checkNotNullParameter(type5, "type");
                KSerializer kSerializerY = y(serializersModule, type5, false);
                if (kSerializerY == null) {
                    return null;
                }
                arrayList.add(kSerializerY);
            }
        }
        if (Set.class.isAssignableFrom(cls2)) {
            KSerializer elementSerializer3 = (KSerializer) arrayList.get(0);
            Intrinsics.checkNotNullParameter(elementSerializer3, "elementSerializer");
            or.d dVar = new or.d(elementSerializer3, 2);
            Intrinsics.checkNotNull(dVar, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return dVar;
        }
        if (List.class.isAssignableFrom(cls2) || Collection.class.isAssignableFrom(cls2)) {
            or.d dVarA = com.facebook.imagepipeline.nativecode.b.a((KSerializer) arrayList.get(0));
            Intrinsics.checkNotNull(dVarA, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return dVarA;
        }
        if (Map.class.isAssignableFrom(cls2)) {
            h0 h0VarB = com.facebook.imagepipeline.nativecode.b.b((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
            Intrinsics.checkNotNull(h0VarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return h0VarB;
        }
        if (Map.Entry.class.isAssignableFrom(cls2)) {
            KSerializer keySerializer = (KSerializer) arrayList.get(0);
            KSerializer valueSerializer = (KSerializer) arrayList.get(1);
            Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
            Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
            u0 u0Var = new u0(keySerializer, valueSerializer, 0);
            Intrinsics.checkNotNull(u0Var, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return u0Var;
        }
        if (Pair.class.isAssignableFrom(cls2)) {
            KSerializer keySerializer2 = (KSerializer) arrayList.get(0);
            KSerializer valueSerializer2 = (KSerializer) arrayList.get(1);
            Intrinsics.checkNotNullParameter(keySerializer2, "keySerializer");
            Intrinsics.checkNotNullParameter(valueSerializer2, "valueSerializer");
            u0 u0Var2 = new u0(keySerializer2, valueSerializer2, 1);
            Intrinsics.checkNotNull(u0Var2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return u0Var2;
        }
        if (!rn.v.class.isAssignableFrom(cls2)) {
            ArrayList arrayList2 = new ArrayList(kotlin.collections.e0.l(arrayList, 10));
            for (KSerializer kSerializer : arrayList) {
                Intrinsics.checkNotNull(kSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any?>");
                arrayList2.add(kSerializer);
            }
            return x(serializersModule, cls2, arrayList2);
        }
        KSerializer aSerializer = (KSerializer) arrayList.get(0);
        KSerializer bSerializer = (KSerializer) arrayList.get(1);
        KSerializer cSerializer = (KSerializer) arrayList.get(2);
        Intrinsics.checkNotNullParameter(aSerializer, "aSerializer");
        Intrinsics.checkNotNullParameter(bSerializer, "bSerializer");
        Intrinsics.checkNotNullParameter(cSerializer, "cSerializer");
        kr.a aVar = new kr.a(aSerializer, bSerializer, cSerializer);
        Intrinsics.checkNotNull(aVar, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
        return aVar;
    }

    public static void z(Status status, Object obj, ig.g gVar) {
        if (status.f5936d <= 0) {
            gVar.b(obj);
        } else {
            gVar.a(status.f5938i != null ? new ph.a(status) : new ye.e(status));
        }
    }

    public abstract List j(String str, List list);

    public abstract Rect u();
}
