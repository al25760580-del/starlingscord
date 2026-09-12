package okhttp3;

import java.io.File;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okio.BufferedSink;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class RequestBody {

    @NotNull
    public static final Companion Companion = new Companion();

    public static final class Companion {
        public static d a(String str, MediaType mediaType) {
            Intrinsics.checkNotNullParameter(str, "<this>");
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
            byte[] bytes = str.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            return b(mediaType, bytes, 0, bytes.length);
        }

        public static d b(MediaType mediaType, byte[] bArr, int i7, int i10) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            long length = bArr.length;
            long j = i7;
            long j5 = i10;
            byte[] bArr2 = ds.b.f7815a;
            if ((j | j5) < 0 || j > length || length - j < j5) {
                throw new ArrayIndexOutOfBoundsException();
            }
            return new d(mediaType, bArr, i10, i7);
        }

        public static d c(Companion companion, MediaType mediaType, byte[] content, int i7, int i10) {
            if ((i10 & 4) != 0) {
                i7 = 0;
            }
            int length = content.length;
            companion.getClass();
            Intrinsics.checkNotNullParameter(content, "content");
            return b(mediaType, content, i7, length);
        }

        public static /* synthetic */ d d(Companion companion, byte[] bArr, MediaType mediaType, int i7, int i10) {
            if ((i10 & 1) != 0) {
                mediaType = null;
            }
            if ((i10 & 2) != 0) {
                i7 = 0;
            }
            int length = bArr.length;
            companion.getClass();
            return b(mediaType, bArr, i7, length);
        }
    }

    @NotNull
    public static final RequestBody create(@NotNull String str, MediaType mediaType) {
        Companion.getClass();
        return Companion.a(str, mediaType);
    }

    public long contentLength() {
        return -1L;
    }

    public abstract MediaType contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(BufferedSink bufferedSink);

    @NotNull
    @rn.d
    public static final RequestBody create(MediaType mediaType, @NotNull File file) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(file, "<this>");
        return new b(mediaType, file);
    }

    @NotNull
    @rn.d
    public static final RequestBody create(MediaType mediaType, @NotNull byte[] content) {
        Companion companion = Companion;
        companion.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        return Companion.c(companion, mediaType, content, 0, 12);
    }

    @NotNull
    @rn.d
    public static final RequestBody create(MediaType mediaType, @NotNull byte[] content, int i7) {
        Companion companion = Companion;
        companion.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        return Companion.c(companion, mediaType, content, i7, 8);
    }

    @NotNull
    public static final RequestBody create(@NotNull byte[] bArr) {
        Companion companion = Companion;
        companion.getClass();
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return Companion.d(companion, bArr, null, 0, 7);
    }

    @NotNull
    public static final RequestBody create(@NotNull byte[] bArr, MediaType mediaType) {
        Companion companion = Companion;
        companion.getClass();
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return Companion.d(companion, bArr, mediaType, 0, 6);
    }

    @NotNull
    public static final RequestBody create(@NotNull byte[] bArr, MediaType mediaType, int i7) {
        Companion companion = Companion;
        companion.getClass();
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return Companion.d(companion, bArr, mediaType, i7, 4);
    }

    @NotNull
    public static final RequestBody create(@NotNull byte[] bArr, MediaType mediaType, int i7, int i10) {
        Companion.getClass();
        return Companion.b(mediaType, bArr, i7, i10);
    }

    @NotNull
    public static final RequestBody create(@NotNull ByteString byteString, MediaType mediaType) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        return new c(mediaType, byteString);
    }

    @NotNull
    public static final RequestBody create(@NotNull File file, MediaType mediaType) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(file, "<this>");
        return new b(mediaType, file);
    }

    @NotNull
    @rn.d
    public static final RequestBody create(MediaType mediaType, @NotNull String content) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        return Companion.a(content, mediaType);
    }

    @NotNull
    @rn.d
    public static final RequestBody create(MediaType mediaType, @NotNull ByteString content) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(content, "<this>");
        return new c(mediaType, content);
    }

    @NotNull
    @rn.d
    public static final RequestBody create(MediaType mediaType, @NotNull byte[] content, int i7, int i10) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        return Companion.b(mediaType, content, i7, i10);
    }
}
