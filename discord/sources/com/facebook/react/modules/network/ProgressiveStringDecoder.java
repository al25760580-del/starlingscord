package com.facebook.react.modules.network;

import com.facebook.react.common.ReactConstants;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/facebook/react/modules/network/ProgressiveStringDecoder;", "", "charset", "Ljava/nio/charset/Charset;", "<init>", "(Ljava/nio/charset/Charset;)V", "decoder", "Ljava/nio/charset/CharsetDecoder;", "remainder", "", "decodeNext", "", "data", "initialLength", "", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nProgressiveStringDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProgressiveStringDecoder.kt\ncom/facebook/react/modules/network/ProgressiveStringDecoder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,86:1\n1#2:87\n*E\n"})
public final class ProgressiveStringDecoder {

    @NotNull
    private static final String EMPTY_STRING = "";

    @NotNull
    private final CharsetDecoder decoder;
    private byte[] remainder;

    public ProgressiveStringDecoder(@NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
        Intrinsics.checkNotNullExpressionValue(charsetDecoderNewDecoder, "newDecoder(...)");
        this.decoder = charsetDecoderNewDecoder;
    }

    @NotNull
    public final String decodeNext(@NotNull byte[] data, int initialLength) {
        Intrinsics.checkNotNullParameter(data, "data");
        byte[] bArr = this.remainder;
        if (bArr != null) {
            byte[] bArr2 = new byte[bArr.length + initialLength];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            System.arraycopy(data, 0, bArr2, bArr.length, initialLength);
            initialLength += bArr.length;
            data = bArr2;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(data, 0, initialLength);
        byte[] bArr3 = null;
        boolean z5 = false;
        int i7 = 0;
        CharBuffer charBufferDecode = null;
        while (!z5 && i7 < 4) {
            try {
                charBufferDecode = this.decoder.decode(byteBufferWrap);
                z5 = true;
            } catch (CharacterCodingException unused) {
                i7++;
                byteBufferWrap = ByteBuffer.wrap(data, 0, initialLength - i7);
            }
        }
        if (z5 && i7 > 0) {
            bArr3 = new byte[i7];
            System.arraycopy(data, initialLength - i7, bArr3, 0, i7);
        }
        this.remainder = bArr3;
        if (!z5) {
            o8.a.v(ReactConstants.TAG, "failed to decode string from byte array");
            return "";
        }
        if (charBufferDecode == null) {
            return "";
        }
        char[] cArrArray = charBufferDecode.array();
        Intrinsics.checkNotNullExpressionValue(cArrArray, "array(...)");
        return new String(cArrArray, 0, charBufferDecode.length());
    }
}
