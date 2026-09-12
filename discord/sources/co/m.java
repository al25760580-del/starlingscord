package co;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.collections.w;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes3.dex */
public class m extends l {
    public static byte[] b(File file) throws IOException {
        Intrinsics.checkNotNullParameter(file, "<this>");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i7 = (int) length;
            byte[] bArrCopyOf = new byte[i7];
            int i10 = i7;
            int i11 = 0;
            while (i10 > 0) {
                int i12 = fileInputStream.read(bArrCopyOf, i11, i10);
                if (i12 < 0) {
                    break;
                }
                i10 -= i12;
                i11 += i12;
            }
            if (i10 > 0) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i11);
                Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
            } else {
                int i13 = fileInputStream.read();
                if (i13 != -1) {
                    b bVar = new b(8193);
                    bVar.write(i13);
                    m3.m.k(fileInputStream, bVar, 8192);
                    int size = bVar.size() + i7;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] bArrF = bVar.f();
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, size);
                    Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
                    w.c(i7, 0, bVar.size(), bArrF, bArrCopyOf);
                }
            }
            fileInputStream.close();
            return bArrCopyOf;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ls.d.k(fileInputStream, th2);
                throw th3;
            }
        }
    }

    public static String c(File file) throws IOException {
        Charset charset = Charsets.UTF_8;
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String strW = ls.l.w(inputStreamReader);
            inputStreamReader.close();
            return strW;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ls.d.k(inputStreamReader, th2);
                throw th3;
            }
        }
    }

    public static void d(File file, String text) throws IOException {
        Charset charset = Charsets.UTF_8;
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(charset, "charset");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            e(fileOutputStream, text, charset);
            Unit unit = Unit.f14616a;
            fileOutputStream.close();
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ls.d.k(fileOutputStream, th2);
                throw th3;
            }
        }
    }

    public static final void e(FileOutputStream fileOutputStream, String text, Charset charset) throws IOException {
        Intrinsics.checkNotNullParameter(fileOutputStream, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (text.length() < 16384) {
            byte[] bytes = text.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            fileOutputStream.write(bytes);
            return;
        }
        Intrinsics.checkNotNullParameter(charset, "<this>");
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder encoder = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        Intrinsics.checkNotNull(encoder);
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8192 * ((int) Math.ceil(encoder.maxBytesPerChar())));
        Intrinsics.checkNotNullExpressionValue(byteBufferAllocate, "allocate(...)");
        int i7 = 0;
        int i10 = 0;
        while (i7 < text.length()) {
            int iMin = Math.min(8192 - i10, text.length() - i7);
            int i11 = i7 + iMin;
            char[] cArrArray = charBufferAllocate.array();
            Intrinsics.checkNotNullExpressionValue(cArrArray, "array(...)");
            text.getChars(i7, i11, cArrArray, i10);
            charBufferAllocate.limit(iMin + i10);
            i10 = 1;
            if (!encoder.encode(charBufferAllocate, byteBufferAllocate, i11 == text.length()).isUnderflow()) {
                throw new IllegalStateException("Check failed.");
            }
            fileOutputStream.write(byteBufferAllocate.array(), 0, byteBufferAllocate.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i10 = 0;
            }
            charBufferAllocate.clear();
            byteBufferAllocate.clear();
            i7 = i11;
        }
    }
}
