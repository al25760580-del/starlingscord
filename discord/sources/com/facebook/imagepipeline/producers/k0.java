package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import android.provider.MediaStore;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imageutils.JfifUtil;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class k0 extends o0 implements l1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f5018d = {"_id", "_data"};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f5019e = {"_data"};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Rect f5020f = new Rect(0, 0, IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING, 384);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Rect f5021g = new Rect(0, 0, 96, 96);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ContentResolver f5022c;

    public k0(Executor executor, e4.e eVar, ContentResolver contentResolver) {
        super(executor, eVar);
        this.f5022c = contentResolver;
    }

    @Override // com.facebook.imagepipeline.producers.l1
    public final boolean a(ResizeOptions resizeOptions) {
        Rect rect = f5020f;
        return sa.a.t(rect.width(), rect.height(), resizeOptions);
    }

    @Override // com.facebook.imagepipeline.producers.o0
    public final EncodedImage d(ImageRequest imageRequest) {
        ResizeOptions resizeOptions;
        Cursor cursorQuery;
        EncodedImage encodedImageF;
        int autoRotateAngleFromOrientation;
        Uri sourceUri = imageRequest.getSourceUri();
        Uri uri = v8.a.f21502a;
        String string = sourceUri.toString();
        if ((!string.startsWith(MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString()) && !string.startsWith(MediaStore.Images.Media.INTERNAL_CONTENT_URI.toString())) || (resizeOptions = imageRequest.getResizeOptions()) == null || (cursorQuery = this.f5022c.query(sourceUri, f5018d, null, null, null)) == null) {
            return null;
        }
        try {
            if (!cursorQuery.moveToFirst() || (encodedImageF = f(resizeOptions, cursorQuery.getLong(cursorQuery.getColumnIndex("_id")))) == null) {
                cursorQuery.close();
                return null;
            }
            int columnIndex = cursorQuery.getColumnIndex("_data");
            if (columnIndex >= 0) {
                String string2 = cursorQuery.getString(columnIndex);
                if (string2 != null) {
                    try {
                        autoRotateAngleFromOrientation = JfifUtil.getAutoRotateAngleFromOrientation(new ExifInterface(string2).getAttributeInt("Orientation", 1));
                    } catch (IOException e10) {
                        if (o8.a.f17171a.isLoggable(6)) {
                            o8.a.f17171a.e(k0.class.getSimpleName(), "Unable to retrieve thumbnail rotation for ".concat(string2), e10);
                        }
                        autoRotateAngleFromOrientation = 0;
                    }
                    encodedImageF.setRotationAngle(autoRotateAngleFromOrientation);
                } else {
                    autoRotateAngleFromOrientation = 0;
                    encodedImageF.setRotationAngle(autoRotateAngleFromOrientation);
                }
            }
            cursorQuery.close();
            return encodedImageF;
        } catch (Throwable th2) {
            cursorQuery.close();
            throw th2;
        }
    }

    @Override // com.facebook.imagepipeline.producers.o0
    public final String e() {
        return "LocalContentUriThumbnailFetchProducer";
    }

    public final EncodedImage f(ResizeOptions resizeOptions, long j) {
        int i7;
        Cursor cursorQueryMiniThumbnail;
        int columnIndex;
        Rect rect = f5021g;
        if (sa.a.t(rect.width(), rect.height(), resizeOptions)) {
            i7 = 3;
        } else {
            Rect rect2 = f5020f;
            i7 = sa.a.t(rect2.width(), rect2.height(), resizeOptions) ? 1 : 0;
        }
        if (i7 == 0 || (cursorQueryMiniThumbnail = MediaStore.Images.Thumbnails.queryMiniThumbnail(this.f5022c, j, i7, f5019e)) == null) {
            return null;
        }
        try {
            if (cursorQueryMiniThumbnail.moveToFirst() && (columnIndex = cursorQueryMiniThumbnail.getColumnIndex("_data")) >= 0) {
                String string = cursorQueryMiniThumbnail.getString(columnIndex);
                string.getClass();
                if (new File(string).exists()) {
                    return c(new FileInputStream(string), (int) new File(string).length());
                }
            }
            return null;
        } finally {
            cursorQueryMiniThumbnail.close();
        }
    }
}
