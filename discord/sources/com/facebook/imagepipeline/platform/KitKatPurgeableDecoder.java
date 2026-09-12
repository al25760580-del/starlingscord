package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import n8.c;
import pa.m;
import pa.q;

/* JADX INFO: loaded from: classes3.dex */
@c
@TargetApi(19)
public class KitKatPurgeableDecoder extends DalvikPurgeableDecoder {
    @c
    public KitKatPurgeableDecoder(m mVar) {
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    public final Bitmap c(CloseableReference closeableReference, BitmapFactory.Options options) {
        ((q) closeableReference.q()).n();
        throw null;
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    public final Bitmap d(CloseableReference closeableReference, int i7, BitmapFactory.Options options) {
        DalvikPurgeableDecoder.e(i7, closeableReference);
        if (i7 <= ((q) closeableReference.q()).n()) {
            throw null;
        }
        throw new IllegalArgumentException();
    }
}
