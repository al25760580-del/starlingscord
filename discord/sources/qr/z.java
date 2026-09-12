package qr;

import a5.i0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.modules.SerializersModule;
import or.e1;
import or.i1;

/* JADX INFO: loaded from: classes3.dex */
public final class z implements Encoder, CompositeEncoder {
    public String E;
    public String F;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i0 f19061d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Json f19062e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d0 f19063i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final z[] f19064v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final SerializersModule f19065w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final androidx.appcompat.widget.v f19066x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f19067y;

    public z(i0 composer, Json json, d0 mode, z[] zVarArr) {
        Intrinsics.checkNotNullParameter(composer, "composer");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f19061d = composer;
        this.f19062e = json;
        this.f19063i = mode;
        this.f19064v = zVarArr;
        this.f19065w = json.f14762b;
        this.f19066x = json.f14761a;
        int iOrdinal = mode.ordinal();
        if (zVarArr != null) {
            z zVar = zVarArr[iOrdinal];
            if (zVar == null && zVar == this) {
                return;
            }
            zVarArr[iOrdinal] = this;
        }
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void A(SerialDescriptor descriptor, int i7, double d6) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        b(descriptor, i7);
        e(d6);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void B(long j) {
        if (this.f19067y) {
            D(String.valueOf(j));
        } else {
            this.f19061d.t(j);
        }
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void C(SerialDescriptor descriptor, int i7, long j) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        b(descriptor, i7);
        B(j);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void D(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f19061d.w(value);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void a() {
        this.f19061d.u("null");
    }

    public final void b(SerialDescriptor descriptor, int i7) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int iOrdinal = this.f19063i.ordinal();
        i0 i0Var = this.f19061d;
        boolean z5 = true;
        if (iOrdinal == 1) {
            if (!i0Var.f214e) {
                i0Var.r(',');
            }
            i0Var.o();
            return;
        }
        if (iOrdinal == 2) {
            if (i0Var.f214e) {
                this.f19067y = true;
                i0Var.o();
                return;
            }
            if (i7 % 2 == 0) {
                i0Var.r(',');
                i0Var.o();
            } else {
                i0Var.r(':');
                i0Var.x();
                z5 = false;
            }
            this.f19067y = z5;
            return;
        }
        if (iOrdinal == 3) {
            if (i7 == 0) {
                this.f19067y = true;
            }
            if (i7 == 1) {
                i0Var.r(',');
                i0Var.x();
                this.f19067y = false;
                return;
            }
            return;
        }
        if (!i0Var.f214e) {
            i0Var.r(',');
        }
        i0Var.o();
        Intrinsics.checkNotNullParameter(descriptor, "<this>");
        Json json = this.f19062e;
        Intrinsics.checkNotNullParameter(json, "json");
        p.p(descriptor, json);
        D(descriptor.h(i7));
        i0Var.r(':');
        i0Var.x();
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final CompositeEncoder beginStructure(SerialDescriptor descriptor) {
        z zVar;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Json json = this.f19062e;
        d0 d0VarR = p.r(descriptor, json);
        char c8 = d0VarR.f19008d;
        i0 i0Var = this.f19061d;
        i0Var.r(c8);
        i0Var.f214e = true;
        String str = this.E;
        if (str != null) {
            String strD = this.F;
            if (strD == null) {
                strD = descriptor.d();
            }
            i0Var.o();
            D(str);
            i0Var.r(':');
            D(strD);
            this.E = null;
            this.F = null;
        }
        if (this.f19063i == d0VarR) {
            return this;
        }
        z[] zVarArr = this.f19064v;
        return (zVarArr == null || (zVar = zVarArr[d0VarR.ordinal()]) == null) ? new z(i0Var, json, d0VarR, zVarArr) : zVar;
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void d(i1 descriptor, int i7, byte b10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        b(descriptor, i7);
        h(b10);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void e(double d6) {
        boolean z5 = this.f19067y;
        i0 i0Var = this.f19061d;
        if (z5) {
            D(String.valueOf(d6));
        } else {
            ((a5.b0) i0Var.f215i).H(String.valueOf(d6));
        }
        if (Double.isInfinite(d6) || Double.isNaN(d6)) {
            throw p.b(Double.valueOf(d6), ((a5.b0) i0Var.f215i).toString());
        }
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void endStructure(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        i0 i0Var = this.f19061d;
        i0Var.getClass();
        i0Var.f214e = false;
        i0Var.r(this.f19063i.f19009e);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void f(short s2) {
        if (this.f19067y) {
            D(String.valueOf((int) s2));
        } else {
            this.f19061d.v(s2);
        }
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void g(SerialDescriptor descriptor, int i7, KSerializer serializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        b(descriptor, i7);
        y(serializer, obj);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final SerializersModule getSerializersModule() {
        return this.f19065w;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void h(byte b10) {
        if (this.f19067y) {
            D(String.valueOf((int) b10));
        } else {
            this.f19061d.q(b10);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void i(boolean z5) {
        if (this.f19067y) {
            D(String.valueOf(z5));
        } else {
            ((a5.b0) this.f19061d.f215i).H(String.valueOf(z5));
        }
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void j(SerialDescriptor descriptor, int i7, float f2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        b(descriptor, i7);
        m(f2);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void k(i1 descriptor, int i7, char c8) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        b(descriptor, i7);
        n(c8);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void l(int i7, int i10, SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        b(descriptor, i7);
        v(i10);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void m(float f2) {
        boolean z5 = this.f19067y;
        i0 i0Var = this.f19061d;
        if (z5) {
            D(String.valueOf(f2));
        } else {
            ((a5.b0) i0Var.f215i).H(String.valueOf(f2));
        }
        if (Float.isInfinite(f2) || Float.isNaN(f2)) {
            throw p.b(Float.valueOf(f2), ((a5.b0) i0Var.f215i).toString());
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void n(char c8) {
        D(String.valueOf(c8));
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void p(SerialDescriptor descriptor, int i7, boolean z5) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        b(descriptor, i7);
        i(z5);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void q(SerialDescriptor descriptor, int i7, String value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(value, "value");
        b(descriptor, i7);
        D(value);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void r(SerialDescriptor descriptor, int i7, KSerializer serializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (obj != null || this.f19066x.f1138e) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(serializer, "serializer");
            b(descriptor, i7);
            e4.f.x(this, serializer, obj);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final CompositeEncoder s(SerialDescriptor descriptor, int i7) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return beginStructure(descriptor);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void t(SerialDescriptor enumDescriptor, int i7) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        D(enumDescriptor.h(i7));
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final boolean u(SerialDescriptor descriptor, int i7) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return false;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void v(int i7) {
        if (this.f19067y) {
            D(String.valueOf(i7));
        } else {
            this.f19061d.s(i7);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final Encoder w(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        boolean zA = a0.a(descriptor);
        d0 d0Var = this.f19063i;
        Json json = this.f19062e;
        i0 jVar = this.f19061d;
        if (zA) {
            if (!(jVar instanceof k)) {
                jVar = new k((a5.b0) jVar.f215i, this.f19067y);
            }
            return new z(jVar, json, d0Var, null);
        }
        Intrinsics.checkNotNullParameter(descriptor, "<this>");
        if (descriptor.isInline() && Intrinsics.areEqual(descriptor, pr.h.f18526a)) {
            if (!(jVar instanceof j)) {
                jVar = new j((a5.b0) jVar.f215i, this.f19067y);
            }
            return new z(jVar, json, d0Var, null);
        }
        if (this.E != null) {
            this.F = descriptor.d();
            return this;
        }
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final Encoder x(i1 descriptor, int i7) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        b(descriptor, i7);
        return w(descriptor.j(i7));
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0041  */
    @Override // kotlinx.serialization.encoding.Encoder
    public final void y(KSerializer serializer, Object obj) {
        String strI;
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Json json = this.f19062e;
        pr.a aVar = (pr.a) json.f14761a.f1136c;
        boolean z5 = serializer instanceof or.b;
        if (!z5) {
            int iOrdinal = aVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    ls.d dVarC = serializer.getDescriptor().c();
                    strI = (Intrinsics.areEqual(dVarC, mr.j.f16077b) || Intrinsics.areEqual(dVarC, mr.j.f16080e)) ? p.i(serializer.getDescriptor(), json) : null;
                } else if (iOrdinal != 2) {
                    throw new rn.n();
                }
            }
        } else if (aVar != pr.a.f18518d) {
        }
        if (z5) {
            or.b bVar = (or.b) serializer;
            if (obj == null) {
                throw new IllegalArgumentException(("Value for serializer " + bVar.getDescriptor() + " should always be non-null. Please report issue to the kotlinx.serialization tracker.").toString());
            }
            KSerializer kSerializerZ = m3.m.z(bVar, this, obj);
            if (strI != null && (serializer instanceof SealedClassSerializer)) {
                SerialDescriptor descriptor = kSerializerZ.getDescriptor();
                Intrinsics.checkNotNullParameter(descriptor, "<this>");
                if (e1.b(descriptor).contains(strI)) {
                    StringBuilder sbU = a3.e.u("Sealed class '", kSerializerZ.getDescriptor().d(), "' cannot be serialized as base class '", ((SealedClassSerializer) serializer).getDescriptor().d(), "' because it has property name that conflicts with JSON class discriminator '");
                    sbU.append(strI);
                    sbU.append("'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
                    throw new IllegalStateException(sbU.toString().toString());
                }
            }
            ls.d kind = kSerializerZ.getDescriptor().c();
            Intrinsics.checkNotNullParameter(kind, "kind");
            if (kind instanceof mr.i) {
                throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
            }
            if (kind instanceof mr.f) {
                throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
            }
            if (kind instanceof mr.d) {
                throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself");
            }
            Intrinsics.checkNotNull(kSerializerZ, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.encodePolymorphically>");
            serializer = kSerializerZ;
        }
        if (strI != null) {
            String strD = serializer.getDescriptor().d();
            this.E = strI;
            this.F = strD;
        }
        serializer.serialize(this, obj);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void z(i1 descriptor, int i7, short s2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        b(descriptor, i7);
        f(s2);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void o() {
    }
}
