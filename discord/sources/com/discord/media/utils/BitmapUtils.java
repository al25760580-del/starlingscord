package com.discord.media.utils;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0005J\u001c\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000b\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/discord/media/utils/BitmapUtils;", "", "<init>", "()V", "DEFAULT_QUALITY", "", "toByteArray", "", "Landroid/graphics/Bitmap;", "format", "Landroid/graphics/Bitmap$CompressFormat;", "quality", "mimeType", "", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BitmapUtils {
    private static final int DEFAULT_QUALITY = 80;

    @NotNull
    public static final BitmapUtils INSTANCE = new BitmapUtils();

    private BitmapUtils() {
    }

    public static /* synthetic */ byte[] toByteArray$default(BitmapUtils bitmapUtils, Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i7, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i7 = DEFAULT_QUALITY;
        }
        return bitmapUtils.toByteArray(bitmap, compressFormat, i7);
    }

    @NotNull
    public final byte[] toByteArray(@NotNull Bitmap bitmap, @NotNull Bitmap.CompressFormat format, int i7) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(format, i7, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public static /* synthetic */ byte[] toByteArray$default(BitmapUtils bitmapUtils, Bitmap bitmap, String str, int i7, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i7 = DEFAULT_QUALITY;
        }
        return bitmapUtils.toByteArray(bitmap, str, i7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        if (r4.equals(com.reactnativecommunity.clipboard.ClipboardModule.MIMETYPE_JPG) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        if (r4.equals(com.reactnativecommunity.clipboard.ClipboardModule.MIMETYPE_JPEG) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        return toByteArray(r3, android.graphics.Bitmap.CompressFormat.JPEG, r5);
     */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] toByteArray(@org.jetbrains.annotations.NotNull android.graphics.Bitmap r3, @org.jetbrains.annotations.NotNull java.lang.String r4, int r5) {
        /*
            r2 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "mimeType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int r0 = r4.hashCode()
            r1 = -1487394660(0xffffffffa758289c, float:-2.9998036E-15)
            if (r0 == r1) goto L37
            r1 = -879264467(0xffffffffcb977d2d, float:-1.9855962E7)
            if (r0 == r1) goto L2e
            r1 = -879258763(0xffffffffcb979375, float:-1.986737E7)
            if (r0 == r1) goto L1e
            goto L3f
        L1e:
            java.lang.String r0 = "image/png"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L27
            goto L3f
        L27:
            android.graphics.Bitmap$CompressFormat r4 = android.graphics.Bitmap.CompressFormat.PNG
            byte[] r3 = r2.toByteArray(r3, r4, r5)
            return r3
        L2e:
            java.lang.String r0 = "image/jpg"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L3f
            goto L46
        L37:
            java.lang.String r0 = "image/jpeg"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L46
        L3f:
            android.graphics.Bitmap$CompressFormat r4 = android.graphics.Bitmap.CompressFormat.PNG
            byte[] r3 = r2.toByteArray(r3, r4, r5)
            return r3
        L46:
            android.graphics.Bitmap$CompressFormat r4 = android.graphics.Bitmap.CompressFormat.JPEG
            byte[] r3 = r2.toByteArray(r3, r4, r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.media.utils.BitmapUtils.toByteArray(android.graphics.Bitmap, java.lang.String, int):byte[]");
    }
}
