package com.linecorp.apng.decoder;

import android.graphics.Bitmap;
import com.facebook.react.devsupport.StackTraceHelper;
import java.io.InputStream;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0087 ¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0087 ¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0087 ¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0015\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/linecorp/apng/decoder/ApngDecoderJni;", "", "Ljava/io/InputStream;", "inputStream", "Lcom/linecorp/apng/decoder/Apng$DecodeResult;", "result", "", "decode", "(Ljava/io/InputStream;Lcom/linecorp/apng/decoder/Apng$DecodeResult;)I", "", "isApng", "(Ljava/io/InputStream;)Z", StackTraceHelper.ID_KEY, "recycle", "(I)I", "index", "Landroid/graphics/Bitmap;", "bitmap", "", "draw", "(IILandroid/graphics/Bitmap;)V", "copy", "(ILcom/linecorp/apng/decoder/Apng$DecodeResult;)I", "apng-drawable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ApngDecoderJni {

    @NotNull
    public static final ApngDecoderJni INSTANCE = new ApngDecoderJni();

    static {
        System.loadLibrary("apng-drawable");
    }

    public static final native int copy(int id2, @NotNull Apng.DecodeResult result);

    public static final native int decode(@NotNull InputStream inputStream, @NotNull Apng.DecodeResult result);

    public static final native void draw(int id2, int index, @NotNull Bitmap bitmap);

    public static final native boolean isApng(@NotNull InputStream inputStream);

    public static final native int recycle(int id2);
}
