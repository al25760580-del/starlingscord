package h2;

import androidx.datastore.preferences.protobuf.i;
import androidx.datastore.preferences.protobuf.s;
import androidx.datastore.preferences.protobuf.t;
import androidx.datastore.preferences.protobuf.w;
import e2.k;
import g2.g;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;
import rn.n;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f10292a = new f();

    public final b a(FileInputStream input) throws e2.a {
        Intrinsics.checkNotNullParameter(input, "input");
        try {
            g2.c cVarL = g2.c.l(input);
            Intrinsics.checkNotNullExpressionValue(cVarL, "{\n                PreferencesProto.PreferenceMap.parseFrom(input)\n            }");
            d[] pairs = new d[0];
            Intrinsics.checkNotNullParameter(pairs, "pairs");
            b bVar = new b(false);
            d[] pairs2 = (d[]) Arrays.copyOf(pairs, 0);
            Intrinsics.checkNotNullParameter(pairs2, "pairs");
            if (bVar.f10289b.get()) {
                throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
            }
            if (pairs2.length > 0) {
                d dVar = pairs2[0];
                throw null;
            }
            Map mapJ = cVarL.j();
            Intrinsics.checkNotNullExpressionValue(mapJ, "preferencesProto.preferencesMap");
            for (Map.Entry entry : mapJ.entrySet()) {
                String name = (String) entry.getKey();
                g value = (g) entry.getValue();
                Intrinsics.checkNotNullExpressionValue(name, "name");
                Intrinsics.checkNotNullExpressionValue(value, "value");
                int iX = value.x();
                switch (iX == 0 ? -1 : e.f10291a[f0.e.b(iX)]) {
                    case -1:
                        throw new e2.a("Value case is null.", 0);
                    case 0:
                    default:
                        throw new n();
                    case 1:
                        Intrinsics.checkNotNullParameter(name, "name");
                        c key = new c(name);
                        Boolean boolValueOf = Boolean.valueOf(value.p());
                        Intrinsics.checkNotNullParameter(key, "key");
                        bVar.a(key, boolValueOf);
                        break;
                    case 2:
                        Intrinsics.checkNotNullParameter(name, "name");
                        c key2 = new c(name);
                        Float fValueOf = Float.valueOf(value.s());
                        Intrinsics.checkNotNullParameter(key2, "key");
                        bVar.a(key2, fValueOf);
                        break;
                    case 3:
                        Intrinsics.checkNotNullParameter(name, "name");
                        c key3 = new c(name);
                        Double dValueOf = Double.valueOf(value.r());
                        Intrinsics.checkNotNullParameter(key3, "key");
                        bVar.a(key3, dValueOf);
                        break;
                    case 4:
                        Intrinsics.checkNotNullParameter(name, "name");
                        c key4 = new c(name);
                        Integer numValueOf = Integer.valueOf(value.t());
                        Intrinsics.checkNotNullParameter(key4, "key");
                        bVar.a(key4, numValueOf);
                        break;
                    case 5:
                        Intrinsics.checkNotNullParameter(name, "name");
                        c key5 = new c(name);
                        Long lValueOf = Long.valueOf(value.u());
                        Intrinsics.checkNotNullParameter(key5, "key");
                        bVar.a(key5, lValueOf);
                        break;
                    case 6:
                        Intrinsics.checkNotNullParameter(name, "name");
                        c key6 = new c(name);
                        String strV = value.v();
                        Intrinsics.checkNotNullExpressionValue(strV, "value.string");
                        Intrinsics.checkNotNullParameter(key6, "key");
                        bVar.a(key6, strV);
                        break;
                    case 7:
                        Intrinsics.checkNotNullParameter(name, "name");
                        c key7 = new c(name);
                        t tVarK = value.w().k();
                        Intrinsics.checkNotNullExpressionValue(tVarK, "value.stringSet.stringsList");
                        Set setL0 = CollectionsKt.l0(tVarK);
                        Intrinsics.checkNotNullParameter(key7, "key");
                        bVar.a(key7, setL0);
                        break;
                    case 8:
                        throw new e2.a("Value not set.", 0);
                }
            }
            Map mapUnmodifiableMap = Collections.unmodifiableMap(bVar.f10288a);
            Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(preferencesMap)");
            return new b(w0.n(mapUnmodifiableMap), true);
        } catch (w e10) {
            Intrinsics.checkNotNullParameter("Unable to parse preferences proto.", "message");
            throw new e2.a("Unable to parse preferences proto.", e10);
        }
    }

    public final Unit b(Object obj, k kVar) {
        s sVarA;
        Map mapUnmodifiableMap = Collections.unmodifiableMap(((b) obj).f10288a);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(preferencesMap)");
        g2.a aVarK = g2.c.k();
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            c cVar = (c) entry.getKey();
            Object value = entry.getValue();
            String str = cVar.f10290a;
            if (value instanceof Boolean) {
                g2.f fVarY = g.y();
                boolean zBooleanValue = ((Boolean) value).booleanValue();
                fVarY.c();
                g.m((g) fVarY.f1927e, zBooleanValue);
                sVarA = fVarY.a();
                Intrinsics.checkNotNullExpressionValue(sVarA, "newBuilder().setBoolean(value).build()");
            } else if (value instanceof Float) {
                g2.f fVarY2 = g.y();
                float fFloatValue = ((Number) value).floatValue();
                fVarY2.c();
                g.n((g) fVarY2.f1927e, fFloatValue);
                sVarA = fVarY2.a();
                Intrinsics.checkNotNullExpressionValue(sVarA, "newBuilder().setFloat(value).build()");
            } else if (value instanceof Double) {
                g2.f fVarY3 = g.y();
                double dDoubleValue = ((Number) value).doubleValue();
                fVarY3.c();
                g.l((g) fVarY3.f1927e, dDoubleValue);
                sVarA = fVarY3.a();
                Intrinsics.checkNotNullExpressionValue(sVarA, "newBuilder().setDouble(value).build()");
            } else if (value instanceof Integer) {
                g2.f fVarY4 = g.y();
                int iIntValue = ((Number) value).intValue();
                fVarY4.c();
                g.o((g) fVarY4.f1927e, iIntValue);
                sVarA = fVarY4.a();
                Intrinsics.checkNotNullExpressionValue(sVarA, "newBuilder().setInteger(value).build()");
            } else if (value instanceof Long) {
                g2.f fVarY5 = g.y();
                long jLongValue = ((Number) value).longValue();
                fVarY5.c();
                g.i((g) fVarY5.f1927e, jLongValue);
                sVarA = fVarY5.a();
                Intrinsics.checkNotNullExpressionValue(sVarA, "newBuilder().setLong(value).build()");
            } else if (value instanceof String) {
                g2.f fVarY6 = g.y();
                fVarY6.c();
                g.j((g) fVarY6.f1927e, (String) value);
                sVarA = fVarY6.a();
                Intrinsics.checkNotNullExpressionValue(sVarA, "newBuilder().setString(value).build()");
            } else {
                if (!(value instanceof Set)) {
                    throw new IllegalStateException(Intrinsics.stringPlus("PreferencesSerializer does not support type: ", value.getClass().getName()));
                }
                g2.f fVarY7 = g.y();
                g2.d dVarL = g2.e.l();
                dVarL.c();
                g2.e.i((g2.e) dVarL.f1927e, (Set) value);
                fVarY7.c();
                g.k((g) fVarY7.f1927e, dVarL);
                sVarA = fVarY7.a();
                Intrinsics.checkNotNullExpressionValue(sVarA, "newBuilder().setStringSet(\n                    StringSet.newBuilder().addAllStrings(value as Set<String>)\n                ).build()");
            }
            aVarK.getClass();
            str.getClass();
            aVarK.c();
            g2.c.i((g2.c) aVarK.f1927e).put(str, (g) sVarA);
        }
        g2.c cVar2 = (g2.c) aVarK.a();
        int iA = cVar2.a();
        Logger logger = i.f1869h;
        if (iA > 4096) {
            iA = 4096;
        }
        i iVar = new i(kVar, iA);
        cVar2.c(iVar);
        if (iVar.f1874f > 0) {
            iVar.B();
        }
        return Unit.f14616a;
    }
}
