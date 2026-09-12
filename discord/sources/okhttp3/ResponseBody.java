package okhttp3;

import cs.v;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class ResponseBody implements Closeable {

    @NotNull
    public static final Companion Companion = new Companion();
    private Reader reader;

    public static final class Companion {
        public static e a(String string, MediaType mediaType) {
            Intrinsics.checkNotNullParameter(string, "<this>");
            Charset charset = Charsets.UTF_8;
            if (mediaType != null) {
                Pattern pattern = MediaType.f17329d;
                Charset charsetA = mediaType.a(null);
                if (charsetA == null) {
                    mediaType = a.a.u(mediaType + "; charset=utf-8");
                } else {
                    charset = charsetA;
                }
            }
            Buffer buffer = new Buffer();
            Intrinsics.checkNotNullParameter(string, "string");
            Intrinsics.checkNotNullParameter(charset, "charset");
            int length = string.length();
            Intrinsics.checkNotNullParameter(string, "string");
            Intrinsics.checkNotNullParameter(charset, "charset");
            if (length < 0) {
                throw new IllegalArgumentException(a3.e.g(length, 0, "endIndex < beginIndex: ", " < ").toString());
            }
            if (length > string.length()) {
                StringBuilder sbS = a3.e.s(length, "endIndex > string.length: ", " > ");
                sbS.append(string.length());
                throw new IllegalArgumentException(sbS.toString().toString());
            }
            if (Intrinsics.areEqual(charset, Charsets.UTF_8)) {
                buffer.j0(0, length, string);
            } else {
                String strSubstring = string.substring(0, length);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                byte[] bytes = strSubstring.getBytes(charset);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                buffer.m1269write(bytes, 0, bytes.length);
            }
            return b(mediaType, buffer.f17413e, buffer);
        }

        public static e b(MediaType mediaType, long j, BufferedSource bufferedSource) {
            Intrinsics.checkNotNullParameter(bufferedSource, "<this>");
            return new e(mediaType, j, bufferedSource);
        }

        public static e c(byte[] bArr, MediaType mediaType) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            Buffer buffer = new Buffer();
            buffer.m1268write(bArr);
            return b(mediaType, bArr.length, buffer);
        }
    }

    @NotNull
    public static final ResponseBody create(@NotNull String str, MediaType mediaType) {
        Companion.getClass();
        return Companion.a(str, mediaType);
    }

    @NotNull
    public final InputStream byteStream() {
        return source().k0();
    }

    @NotNull
    public final ByteString byteString() throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > 2147483647L) {
            throw new IOException(Intrinsics.stringPlus("Cannot buffer entire body for content length: ", Long.valueOf(jContentLength)));
        }
        BufferedSource bufferedSourceSource = source();
        try {
            ByteString byteStringL = bufferedSourceSource.L();
            bufferedSourceSource.close();
            int iC = byteStringL.c();
            if (jContentLength == -1 || jContentLength == iC) {
                return byteStringL;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + iC + ") disagree");
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ls.d.k(bufferedSourceSource, th2);
                throw th3;
            }
        }
    }

    @NotNull
    public final byte[] bytes() throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > 2147483647L) {
            throw new IOException(Intrinsics.stringPlus("Cannot buffer entire body for content length: ", Long.valueOf(jContentLength)));
        }
        BufferedSource bufferedSourceSource = source();
        try {
            byte[] bArrT = bufferedSourceSource.t();
            bufferedSourceSource.close();
            int length = bArrT.length;
            if (jContentLength == -1 || jContentLength == length) {
                return bArrT;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + length + ") disagree");
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ls.d.k(bufferedSourceSource, th2);
                throw th3;
            }
        }
    }

    @NotNull
    public final Reader charStream() {
        Reader vVar = this.reader;
        if (vVar == null) {
            BufferedSource bufferedSourceSource = source();
            MediaType mediaTypeContentType = contentType();
            Charset charsetA = mediaTypeContentType == null ? null : mediaTypeContentType.a(Charsets.UTF_8);
            if (charsetA == null) {
                charsetA = Charsets.UTF_8;
            }
            vVar = new v(bufferedSourceSource, charsetA);
            this.reader = vVar;
        }
        return vVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ds.b.c(source());
    }

    public abstract long contentLength();

    public abstract MediaType contentType();

    public abstract BufferedSource source();

    @NotNull
    public final String string() throws IOException {
        BufferedSource bufferedSourceSource = source();
        try {
            MediaType mediaTypeContentType = contentType();
            Charset charsetA = mediaTypeContentType == null ? null : mediaTypeContentType.a(Charsets.UTF_8);
            if (charsetA == null) {
                charsetA = Charsets.UTF_8;
            }
            String strE = bufferedSourceSource.E(ds.b.r(bufferedSourceSource, charsetA));
            bufferedSourceSource.close();
            return strE;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ls.d.k(bufferedSourceSource, th2);
                throw th3;
            }
        }
    }

    @NotNull
    @rn.d
    public static final ResponseBody create(MediaType mediaType, @NotNull String content) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        return Companion.a(content, mediaType);
    }

    @NotNull
    @rn.d
    public static final ResponseBody create(MediaType mediaType, @NotNull ByteString content) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(content, "<this>");
        Buffer buffer = new Buffer();
        buffer.T(content);
        return Companion.b(mediaType, content.c(), buffer);
    }

    @NotNull
    @rn.d
    public static final ResponseBody create(MediaType mediaType, @NotNull byte[] content) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        return Companion.c(content, mediaType);
    }

    @NotNull
    public static final ResponseBody create(@NotNull BufferedSource bufferedSource, MediaType mediaType, long j) {
        Companion.getClass();
        return Companion.b(mediaType, j, bufferedSource);
    }

    @NotNull
    public static final ResponseBody create(@NotNull byte[] bArr, MediaType mediaType) {
        Companion.getClass();
        return Companion.c(bArr, mediaType);
    }

    @NotNull
    public static final ResponseBody create(@NotNull ByteString byteString, MediaType mediaType) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        Buffer buffer = new Buffer();
        buffer.T(byteString);
        return Companion.b(mediaType, byteString.c(), buffer);
    }

    @NotNull
    @rn.d
    public static final ResponseBody create(MediaType mediaType, long j, @NotNull BufferedSource content) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        return Companion.b(mediaType, j, content);
    }
}
