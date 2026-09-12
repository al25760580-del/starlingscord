package qr;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.util.zip.GZIPInputStream;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GZIPInputStream f19016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharsetDecoder f19017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ByteBuffer f19018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f19019d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public char f19020e;

    public i(GZIPInputStream inputStream, Charset charset) {
        byte[] bArr;
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        Intrinsics.checkNotNullParameter(charset, "charset");
        this.f19016a = inputStream;
        CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        this.f19017b = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        d dVar = d.f19002c;
        synchronized (dVar) {
            ArrayDeque arrayDeque = dVar.f19010a;
            bArr = null;
            byte[] bArr2 = (byte[]) (arrayDeque.isEmpty() ? null : arrayDeque.removeLast());
            if (bArr2 != null) {
                dVar.f19011b -= bArr2.length / 2;
                bArr = bArr2;
            }
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr == null ? new byte[8196] : bArr);
        this.f19018c = byteBufferWrap;
        byteBufferWrap.flip();
    }

    public final int a(char[] array, int i7, int i10) throws CharacterCodingException {
        int i11;
        CharsetDecoder charsetDecoder;
        char c8;
        char c10;
        char c11;
        char c12;
        Intrinsics.checkNotNullParameter(array, "array");
        if (i10 == 0) {
            return 0;
        }
        if (i7 < 0 || i7 >= array.length || i10 < 0 || i7 + i10 > array.length) {
            StringBuilder sbR = a3.e.r(i7, "Unexpected arguments: ", i10, ", ", ", ");
            sbR.append(array.length);
            throw new IllegalArgumentException(sbR.toString().toString());
        }
        boolean z5 = true;
        if (this.f19019d) {
            array[i7] = this.f19020e;
            i7++;
            i10--;
            this.f19019d = false;
            if (i10 == 0) {
                return 1;
            }
            i11 = 1;
        } else {
            i11 = 0;
        }
        if (i10 == 1) {
            if (this.f19019d) {
                this.f19019d = false;
                c12 = this.f19020e;
            } else {
                char[] cArr = new char[2];
                int iA = a(cArr, 0, 2);
                if (iA == -1) {
                    c8 = 65535;
                } else if (iA == 1) {
                    c10 = cArr[0];
                } else {
                    if (iA != 2) {
                        throw new IllegalStateException(("Unreachable state: " + iA).toString());
                    }
                    this.f19020e = cArr[1];
                    this.f19019d = true;
                    c11 = cArr[0];
                }
            }
            if (c8 != 65535) {
                c8 = c10;
                c8 = c11;
                c8 = c12;
                array[i7] = c8;
                return i11 + 1;
            }
            if (i11 == 0) {
                return -1;
            }
            return i11;
        }
        CharBuffer charBufferWrap = CharBuffer.wrap(array, i7, i10);
        if (charBufferWrap.position() != 0) {
            charBufferWrap = charBufferWrap.slice();
        }
        CharBuffer charBuffer = charBufferWrap;
        boolean z6 = false;
        while (true) {
            charsetDecoder = this.f19017b;
            ByteBuffer byteBuffer = this.f19018c;
            CoderResult coderResultDecode = charsetDecoder.decode(byteBuffer, charBuffer, z6);
            if (coderResultDecode.isUnderflow()) {
                if (z6 || !charBuffer.hasRemaining()) {
                    z5 = z6;
                    break;
                }
                byteBuffer.compact();
                try {
                    int iLimit = byteBuffer.limit();
                    int iPosition = byteBuffer.position();
                    int iRemaining = this.f19016a.read(byteBuffer.array(), byteBuffer.arrayOffset() + iPosition, iPosition <= iLimit ? iLimit - iPosition : 0);
                    if (iRemaining < 0) {
                        byteBuffer.flip();
                    } else {
                        Intrinsics.checkNotNull(byteBuffer, "null cannot be cast to non-null type java.nio.Buffer");
                        byteBuffer.position(iPosition + iRemaining);
                        byteBuffer.flip();
                        iRemaining = byteBuffer.remaining();
                    }
                    if (iRemaining < 0) {
                        if (charBuffer.position() == 0 && !byteBuffer.hasRemaining()) {
                            break;
                        }
                        charsetDecoder.reset();
                        z6 = true;
                    } else {
                        continue;
                    }
                } catch (Throwable th2) {
                    byteBuffer.flip();
                    throw th2;
                }
            } else {
                if (coderResultDecode.isOverflow()) {
                    charBuffer.position();
                    z5 = z6;
                    break;
                }
                coderResultDecode.throwException();
            }
        }
        if (z5) {
            charsetDecoder.reset();
        }
        return (charBuffer.position() != 0 ? charBuffer.position() : -1) + i11;
    }
}
