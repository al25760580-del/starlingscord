package or;

import kotlin.Unit;
import kotlin.jvm.internal.BooleanCompanionObject;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.CharCompanionObject;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ShortCompanionObject;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KClass;
import kotlin.time.Duration;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sn.i f17571a;

    static {
        sn.i builder = new sn.i();
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(String.class);
        com.facebook.imagepipeline.nativecode.b.z(StringCompanionObject.INSTANCE);
        builder.put(orCreateKotlinClass, s1.f17602a);
        KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(Character.TYPE);
        Intrinsics.checkNotNullParameter(CharCompanionObject.INSTANCE, "<this>");
        builder.put(orCreateKotlinClass2, p.f17585a);
        builder.put(Reflection.getOrCreateKotlinClass(char[].class), o.f17583c);
        KClass orCreateKotlinClass3 = Reflection.getOrCreateKotlinClass(Double.TYPE);
        Intrinsics.checkNotNullParameter(DoubleCompanionObject.INSTANCE, "<this>");
        builder.put(orCreateKotlinClass3, w.f17621a);
        builder.put(Reflection.getOrCreateKotlinClass(double[].class), v.f17616c);
        KClass orCreateKotlinClass4 = Reflection.getOrCreateKotlinClass(Float.TYPE);
        Intrinsics.checkNotNullParameter(FloatCompanionObject.INSTANCE, "<this>");
        builder.put(orCreateKotlinClass4, e0.f17525a);
        builder.put(Reflection.getOrCreateKotlinClass(float[].class), d0.f17521c);
        KClass orCreateKotlinClass5 = Reflection.getOrCreateKotlinClass(Long.TYPE);
        Intrinsics.checkNotNullParameter(LongCompanionObject.INSTANCE, "<this>");
        builder.put(orCreateKotlinClass5, r0.f17595a);
        builder.put(Reflection.getOrCreateKotlinClass(long[].class), q0.f17593c);
        KClass orCreateKotlinClass6 = Reflection.getOrCreateKotlinClass(rn.e0.class);
        Intrinsics.checkNotNullParameter(rn.e0.f19470e, "<this>");
        builder.put(orCreateKotlinClass6, b2.f17511a);
        KClass orCreateKotlinClass7 = Reflection.getOrCreateKotlinClass(Integer.TYPE);
        Intrinsics.checkNotNullParameter(IntCompanionObject.INSTANCE, "<this>");
        builder.put(orCreateKotlinClass7, m0.f17573a);
        builder.put(Reflection.getOrCreateKotlinClass(int[].class), l0.f17570c);
        KClass orCreateKotlinClass8 = Reflection.getOrCreateKotlinClass(rn.b0.class);
        Intrinsics.checkNotNullParameter(rn.b0.f19461e, "<this>");
        builder.put(orCreateKotlinClass8, y1.f17637a);
        KClass orCreateKotlinClass9 = Reflection.getOrCreateKotlinClass(Short.TYPE);
        Intrinsics.checkNotNullParameter(ShortCompanionObject.INSTANCE, "<this>");
        builder.put(orCreateKotlinClass9, r1.f17597a);
        builder.put(Reflection.getOrCreateKotlinClass(short[].class), q1.f17594c);
        KClass orCreateKotlinClass10 = Reflection.getOrCreateKotlinClass(rn.i0.class);
        Intrinsics.checkNotNullParameter(rn.i0.f19474e, "<this>");
        builder.put(orCreateKotlinClass10, e2.f17530a);
        KClass orCreateKotlinClass11 = Reflection.getOrCreateKotlinClass(Byte.TYPE);
        Intrinsics.checkNotNullParameter(ByteCompanionObject.INSTANCE, "<this>");
        builder.put(orCreateKotlinClass11, j.f17561a);
        builder.put(Reflection.getOrCreateKotlinClass(byte[].class), i.f17558c);
        KClass orCreateKotlinClass12 = Reflection.getOrCreateKotlinClass(rn.y.class);
        Intrinsics.checkNotNullParameter(rn.y.f19500e, "<this>");
        builder.put(orCreateKotlinClass12, v1.f17619a);
        KClass orCreateKotlinClass13 = Reflection.getOrCreateKotlinClass(Boolean.TYPE);
        Intrinsics.checkNotNullParameter(BooleanCompanionObject.INSTANCE, "<this>");
        builder.put(orCreateKotlinClass13, g.f17537a);
        builder.put(Reflection.getOrCreateKotlinClass(boolean[].class), f.f17532c);
        KClass orCreateKotlinClass14 = Reflection.getOrCreateKotlinClass(Unit.class);
        Intrinsics.checkNotNullParameter(Unit.f14616a, "<this>");
        builder.put(orCreateKotlinClass14, f2.f17535b);
        builder.put(Reflection.getOrCreateKotlinClass(Void.class), a1.f17502a);
        try {
            KClass orCreateKotlinClass15 = Reflection.getOrCreateKotlinClass(Duration.class);
            Intrinsics.checkNotNullParameter(Duration.f14747e, "<this>");
            builder.put(orCreateKotlinClass15, x.f17626a);
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        try {
            builder.put(Reflection.getOrCreateKotlinClass(rn.f0.class), a2.f17504c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused2) {
        }
        try {
            builder.put(Reflection.getOrCreateKotlinClass(rn.c0.class), x1.f17628c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused3) {
        }
        try {
            builder.put(Reflection.getOrCreateKotlinClass(rn.j0.class), d2.f17522c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused4) {
        }
        try {
            builder.put(Reflection.getOrCreateKotlinClass(rn.z.class), u1.f17615c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused5) {
        }
        try {
            KClass orCreateKotlinClass16 = Reflection.getOrCreateKotlinClass(zq.a.class);
            Intrinsics.checkNotNullParameter(zq.a.f24078i, "<this>");
            builder.put(orCreateKotlinClass16, g2.f17552a);
        } catch (ClassNotFoundException | NoClassDefFoundError unused6) {
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        f17571a = builder.b();
    }
}
