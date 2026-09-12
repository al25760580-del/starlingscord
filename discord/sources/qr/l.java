package qr;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractDecoder;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.modules.SerializersModule;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends AbstractDecoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pc.f f19023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SerializersModule f19024b;

    public l(pc.f lexer, Json json) {
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        Intrinsics.checkNotNullParameter(json, "json");
        this.f19023a = lexer;
        this.f19024b = json.f14762b;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final byte decodeByte() {
        pc.f fVar = this.f19023a;
        String strL = fVar.l();
        try {
            return kotlin.text.c0.b(strL);
        } catch (IllegalArgumentException unused) {
            pc.f.q(fVar, kk.b.g('\'', "Failed to parse type 'UByte' for input '", strL), 0, null, 6);
            throw null;
        }
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final int decodeElementIndex(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        throw new IllegalStateException("unsupported");
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final int decodeInt() {
        pc.f fVar = this.f19023a;
        String strL = fVar.l();
        try {
            return kotlin.text.c0.c(strL);
        } catch (IllegalArgumentException unused) {
            pc.f.q(fVar, kk.b.g('\'', "Failed to parse type 'UInt' for input '", strL), 0, null, 6);
            throw null;
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final long decodeLong() {
        pc.f fVar = this.f19023a;
        String strL = fVar.l();
        try {
            return kotlin.text.c0.e(strL);
        } catch (IllegalArgumentException unused) {
            pc.f.q(fVar, kk.b.g('\'', "Failed to parse type 'ULong' for input '", strL), 0, null, 6);
            throw null;
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final short decodeShort() {
        pc.f fVar = this.f19023a;
        String strL = fVar.l();
        try {
            return kotlin.text.c0.g(strL);
        } catch (IllegalArgumentException unused) {
            pc.f.q(fVar, kk.b.g('\'', "Failed to parse type 'UShort' for input '", strL), 0, null, 6);
            throw null;
        }
    }

    @Override // kotlinx.serialization.encoding.Decoder, kotlinx.serialization.encoding.CompositeDecoder
    public final SerializersModule getSerializersModule() {
        return this.f19024b;
    }
}
