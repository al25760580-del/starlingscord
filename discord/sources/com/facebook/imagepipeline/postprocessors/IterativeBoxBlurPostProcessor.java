package com.facebook.imagepipeline.postprocessors;

import a3.e;
import android.graphics.Bitmap;
import com.facebook.cache.common.CacheKey;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;
import com.facebook.imagepipeline.request.BasePostprocessor;
import i8.d;

/* JADX INFO: loaded from: classes3.dex */
public final class IterativeBoxBlurPostProcessor extends BasePostprocessor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f4933c;

    public IterativeBoxBlurPostProcessor(int i7) {
        if (!(i7 > 0)) {
            throw new IllegalArgumentException();
        }
        this.f4931a = 2;
        this.f4932b = i7;
    }

    @Override // com.facebook.imagepipeline.request.BasePostprocessor, com.facebook.imagepipeline.request.Postprocessor
    public final CacheKey getPostprocessorCacheKey() {
        if (this.f4933c == null) {
            this.f4933c = new d(e.g(this.f4931a, this.f4932b, "i", "r"));
        }
        return this.f4933c;
    }

    @Override // com.facebook.imagepipeline.request.BasePostprocessor
    public final void process(Bitmap bitmap) {
        NativeBlurFilter.a(this.f4931a, this.f4932b, bitmap);
    }
}
