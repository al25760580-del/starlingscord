package qr;

import java.util.ArrayList;
import java.util.Arrays;
import kotlin.collections.CollectionsKt;
import kotlin.collections.i0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractDecoder;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.modules.SerializersModule;

/* JADX INFO: loaded from: classes3.dex */
public final class y extends AbstractDecoder implements pr.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Json f19053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f19054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pc.f f19055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SerializersModule f19056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f19057e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a5.n f19058f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final androidx.appcompat.widget.v f19059g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n f19060h;

    public y(Json json, d0 mode, pc.f lexer, SerialDescriptor descriptor, a5.n nVar) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f19053a = json;
        this.f19054b = mode;
        this.f19055c = lexer;
        this.f19056d = json.f14762b;
        this.f19057e = -1;
        this.f19058f = nVar;
        androidx.appcompat.widget.v vVar = json.f14761a;
        this.f19059g = vVar;
        this.f19060h = vVar.f1138e ? null : new n(descriptor);
    }

    @Override // pr.g
    public final JsonElement a() {
        return new a5.b0(this.f19053a.f14761a, this.f19055c).x();
    }

    @Override // pr.g
    public final Json b() {
        return this.f19053a;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final CompositeDecoder beginStructure(SerialDescriptor sd2) {
        Intrinsics.checkNotNullParameter(sd2, "descriptor");
        Json json = this.f19053a;
        d0 d0VarR = p.r(sd2, json);
        pc.f fVar = this.f19055c;
        a1.d dVar = (a1.d) fVar.f17883c;
        Intrinsics.checkNotNullParameter(sd2, "sd");
        int i7 = dVar.f17e + 1;
        dVar.f17e = i7;
        Object[] objArr = (Object[]) dVar.f18i;
        if (i7 == objArr.length) {
            int i10 = i7 * 2;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, i10);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            dVar.f18i = objArrCopyOf;
            int[] iArrCopyOf = Arrays.copyOf((int[]) dVar.f19v, i10);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            dVar.f19v = iArrCopyOf;
        }
        ((Object[]) dVar.f18i)[i7] = sd2;
        fVar.h(d0VarR.f19008d);
        if (fVar.y() == 4) {
            pc.f.q(fVar, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        int iOrdinal = d0VarR.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
            return new y(json, d0VarR, fVar, sd2, this.f19058f);
        }
        return (this.f19054b == d0VarR && json.f14761a.f1138e) ? this : new y(json, d0VarR, fVar, sd2, this.f19058f);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final boolean decodeBoolean() {
        boolean z5;
        boolean z6;
        pc.f fVar = this.f19055c;
        int iD = fVar.D();
        if (iD == fVar.u().length()) {
            pc.f.q(fVar, "EOF", 0, null, 6);
            throw null;
        }
        if (fVar.u().charAt(iD) == '\"') {
            iD++;
            z5 = true;
        } else {
            z5 = false;
        }
        int iA = fVar.A(iD);
        if (iA >= fVar.u().length() || iA == -1) {
            pc.f.q(fVar, "EOF", 0, null, 6);
            throw null;
        }
        int i7 = iA + 1;
        int iCharAt = fVar.u().charAt(iA) | ' ';
        if (iCharAt == 102) {
            fVar.d(i7, "alse");
            z6 = false;
        } else {
            if (iCharAt != 116) {
                pc.f.q(fVar, "Expected valid boolean literal prefix, but had '" + fVar.l() + '\'', 0, null, 6);
                throw null;
            }
            fVar.d(i7, "rue");
            z6 = true;
        }
        if (!z5) {
            return z6;
        }
        if (fVar.f17882b == fVar.u().length()) {
            pc.f.q(fVar, "EOF", 0, null, 6);
            throw null;
        }
        if (fVar.u().charAt(fVar.f17882b) == '\"') {
            fVar.f17882b++;
            return z6;
        }
        pc.f.q(fVar, "Expected closing quotation mark", 0, null, 6);
        throw null;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final byte decodeByte() {
        pc.f fVar = this.f19055c;
        long jI = fVar.i();
        byte b10 = (byte) jI;
        if (jI == b10) {
            return b10;
        }
        pc.f.q(fVar, "Failed to parse byte for input '" + jI + '\'', 0, null, 6);
        throw null;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final char decodeChar() {
        pc.f fVar = this.f19055c;
        String strL = fVar.l();
        if (strL.length() == 1) {
            return strL.charAt(0);
        }
        pc.f.q(fVar, kk.b.g('\'', "Expected single char, but got '", strL), 0, null, 6);
        throw null;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final double decodeDouble() {
        pc.f fVar = this.f19055c;
        String strL = fVar.l();
        try {
            double d6 = Double.parseDouble(strL);
            if (!Double.isInfinite(d6) && !Double.isNaN(d6)) {
                return d6;
            }
            p.s(fVar, Double.valueOf(d6));
            throw null;
        } catch (IllegalArgumentException unused) {
            pc.f.q(fVar, kk.b.g('\'', "Failed to parse type 'double' for input '", strL), 0, null, 6);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:119:0x0210 A[EDGE_INSN: B:119:0x0210->B:120:0x0211 BREAK  A[LOOP:0: B:48:0x0096->B:99:0x019b]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final int decodeElementIndex(SerialDescriptor descriptor) {
        pc.f fVar = this.f19055c;
        a1.d dVar = (a1.d) fVar.f17883c;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        d0 d0Var = this.f19054b;
        int iOrdinal = d0Var.ordinal();
        char c8 = ':';
        int i7 = 0;
        zF = false;
        boolean zF = false;
        int i10 = -1;
        if (iOrdinal == 0) {
            boolean zF2 = fVar.F();
            while (true) {
                boolean zC = fVar.c();
                n nVar = this.f19060h;
                if (zC) {
                    String key = fVar.e();
                    fVar.h(c8);
                    int iL = p.l(descriptor, this.f19053a, key);
                    if (iL != -3) {
                        if (nVar != null) {
                            or.y yVar = nVar.f19025a;
                            if (iL < 64) {
                                yVar.f17632c |= 1 << iL;
                            } else {
                                int i11 = (iL >>> 6) - 1;
                                long[] jArr = yVar.f17633d;
                                jArr[i11] = jArr[i11] | (1 << (iL & 63));
                            }
                        }
                        i10 = iL;
                        break;
                    }
                    if (!this.f19059g.f1137d) {
                        a5.n nVar2 = this.f19058f;
                        if (nVar2 == null || !Intrinsics.areEqual(nVar2.f232a, key)) {
                            Intrinsics.checkNotNullParameter(key, "key");
                            fVar.p(StringsKt.M(0, 6, fVar.E(0, fVar.f17882b), key), kk.b.g('\'', "Encountered an unknown key '", key), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
                            throw null;
                        }
                        nVar2.f232a = null;
                    }
                    ArrayList arrayList = new ArrayList();
                    byte bY = fVar.y();
                    if (bY == 8 || bY == 6) {
                        while (true) {
                            byte bY2 = fVar.y();
                            if (bY2 == 1) {
                                fVar.e();
                            } else {
                                if (bY2 == 8 || bY2 == 6) {
                                    arrayList.add(Byte.valueOf(bY2));
                                } else if (bY2 == 9) {
                                    if (((Number) CollectionsKt.Q(arrayList)).byteValue() != 8) {
                                        throw p.d(fVar.f17882b, fVar.u(), "found ] instead of } at path: " + dVar);
                                    }
                                    i0.u(arrayList);
                                } else if (bY2 == 7) {
                                    if (((Number) CollectionsKt.Q(arrayList)).byteValue() != 6) {
                                        throw p.d(fVar.f17882b, fVar.u(), "found } instead of ] at path: " + dVar);
                                    }
                                    i0.u(arrayList);
                                } else if (bY2 == 10) {
                                    pc.f.q(fVar, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6);
                                    throw null;
                                }
                                fVar.f();
                                if (arrayList.size() == 0) {
                                    break;
                                }
                            }
                        }
                    } else {
                        fVar.l();
                    }
                    zF2 = fVar.F();
                    c8 = ':';
                } else if (!zF2) {
                    if (nVar == null) {
                        i10 = -1;
                        break;
                    }
                    or.y yVar2 = nVar.f19025a;
                    mq.t tVar = yVar2.f17631b;
                    SerialDescriptor serialDescriptor = yVar2.f17630a;
                    int iG = serialDescriptor.g();
                    while (true) {
                        long j = yVar2.f17632c;
                        long j5 = -1;
                        if (j == -1) {
                            if (iG <= 64) {
                                i10 = -1;
                                break;
                            }
                            long[] jArr2 = yVar2.f17633d;
                            int length = jArr2.length;
                            loop3: while (true) {
                                if (i7 >= length) {
                                    i10 = -1;
                                    break;
                                }
                                int i12 = i7 + 1;
                                int i13 = i12 * 64;
                                long j7 = jArr2[i7];
                                while (true) {
                                    if (j7 != j5) {
                                        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j7);
                                        j7 |= 1 << iNumberOfTrailingZeros;
                                        int i14 = iNumberOfTrailingZeros + i13;
                                        if (((Boolean) tVar.invoke(serialDescriptor, Integer.valueOf(i14))).booleanValue()) {
                                            jArr2[i7] = j7;
                                            i10 = i14;
                                            break;
                                        }
                                        j5 = -1;
                                    } else {
                                        jArr2[i7] = j7;
                                        i7 = i12;
                                        j5 = -1;
                                    }
                                }
                            }
                        } else {
                            int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j);
                            yVar2.f17632c |= 1 << iNumberOfTrailingZeros2;
                            if (((Boolean) tVar.invoke(serialDescriptor, Integer.valueOf(iNumberOfTrailingZeros2))).booleanValue()) {
                                i10 = iNumberOfTrailingZeros2;
                                break;
                            }
                        }
                    }
                } else {
                    p.n(fVar, "object");
                    throw null;
                }
            }
        } else if (iOrdinal != 2) {
            boolean zF3 = fVar.F();
            if (fVar.c()) {
                int i15 = this.f19057e;
                if (i15 != -1 && !zF3) {
                    pc.f.q(fVar, "Expected end of the array or comma", 0, null, 6);
                    throw null;
                }
                i10 = i15 + 1;
                this.f19057e = i10;
            } else if (zF3) {
                p.n(fVar, "array");
                throw null;
            }
        } else {
            int i16 = this.f19057e;
            Object[] objArr = i16 % 2 != 0;
            if (objArr != true) {
                fVar.h(':');
            } else if (i16 != -1) {
                zF = fVar.F();
            }
            if (fVar.c()) {
                if (objArr != false) {
                    if (this.f19057e == -1) {
                        int i17 = fVar.f17882b;
                        if (zF) {
                            pc.f.q(fVar, "Unexpected leading comma", i17, null, 4);
                            throw null;
                        }
                    } else {
                        int i18 = fVar.f17882b;
                        if (!zF) {
                            pc.f.q(fVar, "Expected comma after the key-value pair", i18, null, 4);
                            throw null;
                        }
                    }
                }
                i10 = this.f19057e + 1;
                this.f19057e = i10;
            } else if (zF) {
                p.n(fVar, "object");
                throw null;
            }
        }
        if (d0Var != d0.MAP) {
            ((int[]) dVar.f19v)[dVar.f17e] = i10;
        }
        return i10;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final int decodeEnum(SerialDescriptor enumDescriptor) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        pc.f fVar = this.f19055c;
        return p.m(enumDescriptor, this.f19053a, fVar.j(), " at path " + ((a1.d) fVar.f17883c).i());
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final float decodeFloat() {
        pc.f fVar = this.f19055c;
        String strL = fVar.l();
        try {
            float f2 = Float.parseFloat(strL);
            if (!Float.isInfinite(f2) && !Float.isNaN(f2)) {
                return f2;
            }
            p.s(fVar, Float.valueOf(f2));
            throw null;
        } catch (IllegalArgumentException unused) {
            pc.f.q(fVar, kk.b.g('\'', "Failed to parse type 'float' for input '", strL), 0, null, 6);
            throw null;
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final Decoder decodeInline(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return a0.a(descriptor) ? new l(this.f19055c, this.f19053a) : super.decodeInline(descriptor);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final int decodeInt() {
        pc.f fVar = this.f19055c;
        long jI = fVar.i();
        int i7 = (int) jI;
        if (jI == i7) {
            return i7;
        }
        pc.f.q(fVar, "Failed to parse int for input '" + jI + '\'', 0, null, 6);
        throw null;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final long decodeLong() {
        return this.f19055c.i();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final boolean decodeNotNullMark() {
        n nVar = this.f19060h;
        if (!(nVar != null ? nVar.f19026b : false)) {
            pc.f fVar = this.f19055c;
            int iA = fVar.A(fVar.D());
            int length = fVar.u().length() - iA;
            boolean z5 = false;
            if (length >= 4 && iA != -1) {
                for (int i7 = 0; i7 < 4; i7++) {
                    if ("null".charAt(i7) == fVar.u().charAt(iA + i7)) {
                    }
                }
                if (length <= 4 || p.h(fVar.u().charAt(iA + 4)) != 0) {
                    z5 = true;
                    fVar.f17882b = iA + 4;
                }
            }
            if (!z5) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final Void decodeNull() {
        return null;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.CompositeDecoder
    public final Object decodeSerializableElement(SerialDescriptor descriptor, int i7, DeserializationStrategy deserializer, Object obj) {
        a1.d dVar = (a1.d) this.f19055c.f17883c;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        boolean z5 = this.f19054b == d0.MAP && (i7 & 1) == 0;
        if (z5) {
            int[] iArr = (int[]) dVar.f19v;
            int i10 = dVar.f17e;
            if (iArr[i10] == -2) {
                ((Object[]) dVar.f18i)[i10] = q.f19028a;
            }
        }
        Object objDecodeSerializableElement = super.decodeSerializableElement(descriptor, i7, deserializer, obj);
        if (z5) {
            int[] iArr2 = (int[]) dVar.f19v;
            int i11 = dVar.f17e;
            if (iArr2[i11] != -2) {
                int i12 = i11 + 1;
                dVar.f17e = i12;
                Object[] objArr = (Object[]) dVar.f18i;
                if (i12 == objArr.length) {
                    int i13 = i12 * 2;
                    Object[] objArrCopyOf = Arrays.copyOf(objArr, i13);
                    Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                    dVar.f18i = objArrCopyOf;
                    int[] iArrCopyOf = Arrays.copyOf((int[]) dVar.f19v, i13);
                    Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
                    dVar.f19v = iArrCopyOf;
                }
            }
            Object[] objArr2 = (Object[]) dVar.f18i;
            int i14 = dVar.f17e;
            objArr2[i14] = objDecodeSerializableElement;
            ((int[]) dVar.f19v)[i14] = -2;
        }
        return objDecodeSerializableElement;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0116  */
    /* JADX WARN: Code duplicated, block: B:34:0x0117  */
    /* JADX WARN: Instruction removed from duplicated block: B:34:0x0117, please report this as an issue */
    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final Object decodeSerializableValue(DeserializationStrategy deserializer) {
        String message;
        Json json = this.f19053a;
        pc.f fVar = this.f19055c;
        a1.d dVar = (a1.d) fVar.f17883c;
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        try {
            if (!(deserializer instanceof or.b)) {
                return deserializer.deserialize(this);
            }
            String strI = p.i(((or.b) deserializer).getDescriptor(), json);
            String strX = fVar.x(strI);
            if (strX != null) {
                try {
                    DeserializationStrategy deserializationStrategyY = m3.m.y((or.b) deserializer, this, strX);
                    Intrinsics.checkNotNull(deserializationStrategyY, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.StreamingJsonDecoder.decodeSerializableValue>");
                    a5.n nVar = new a5.n();
                    nVar.f232a = strI;
                    this.f19058f = nVar;
                    return deserializationStrategyY.deserialize(this);
                } catch (kr.g e10) {
                    String message2 = e10.getMessage();
                    Intrinsics.checkNotNull(message2);
                    String strO = StringsKt.O(StringsKt.X(message2, '\n'), ".");
                    String message3 = e10.getMessage();
                    Intrinsics.checkNotNull(message3);
                    pc.f.q(fVar, strO, 0, StringsKt.U('\n', message3, ""), 2);
                    throw null;
                }
            }
            String strI2 = p.i(((or.b) deserializer).getDescriptor(), json);
            JsonElement jsonElementA = a();
            String strD = ((or.b) deserializer).getDescriptor().d();
            if (jsonElementA instanceof JsonObject) {
                JsonObject jsonObject = (JsonObject) jsonElementA;
                JsonElement jsonElement = (JsonElement) jsonObject.get(strI2);
                try {
                    DeserializationStrategy deserializationStrategyY2 = m3.m.y((or.b) deserializer, this, jsonElement != null ? pr.h.f(pr.h.k(jsonElement)) : null);
                    Intrinsics.checkNotNull(deserializationStrategyY2, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.decodeSerializableValuePolymorphic>");
                    return p.q(json, strI2, jsonObject, deserializationStrategyY2);
                } catch (kr.g e11) {
                    String message4 = e11.getMessage();
                    Intrinsics.checkNotNull(message4);
                    throw p.d(-1, jsonObject.toString(), message4);
                }
            }
            throw p.d(-1, jsonElementA.toString(), "Expected " + Reflection.getOrCreateKotlinClass(JsonObject.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementA.getClass()).getSimpleName() + " as the serialized body of " + strD + " at element: " + dVar.i());
            message = e.getMessage();
            Intrinsics.checkNotNull(message);
            if (StringsKt.D(message, "at path", false)) {
                throw e;
            }
            throw new kr.b(e.f14797d, e.getMessage() + " at path: " + dVar.i(), e);
        } catch (kr.b e12) {
            message = e12.getMessage();
            Intrinsics.checkNotNull(message);
            if (StringsKt.D(message, "at path", false)) {
                throw e12;
            }
            throw new kr.b(e12.f14797d, e12.getMessage() + " at path: " + dVar.i(), e12);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final short decodeShort() {
        pc.f fVar = this.f19055c;
        long jI = fVar.i();
        short s2 = (short) jI;
        if (jI == s2) {
            return s2;
        }
        pc.f.q(fVar, "Failed to parse short for input '" + jI + '\'', 0, null, 6);
        throw null;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final String decodeString() {
        return this.f19055c.j();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.CompositeDecoder
    public final void endStructure(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (this.f19053a.f14761a.f1137d && descriptor.g() == 0) {
            while (decodeElementIndex(descriptor) != -1) {
            }
        }
        pc.f fVar = this.f19055c;
        if (fVar.F()) {
            p.n(fVar, "");
            throw null;
        }
        fVar.h(this.f19054b.f19009e);
        a1.d dVar = (a1.d) fVar.f17883c;
        int i7 = dVar.f17e;
        int[] iArr = (int[]) dVar.f19v;
        if (iArr[i7] == -2) {
            iArr[i7] = -1;
            dVar.f17e = i7 - 1;
        }
        int i10 = dVar.f17e;
        if (i10 != -1) {
            dVar.f17e = i10 - 1;
        }
    }

    @Override // kotlinx.serialization.encoding.Decoder, kotlinx.serialization.encoding.CompositeDecoder
    public final SerializersModule getSerializersModule() {
        return this.f19056d;
    }
}
