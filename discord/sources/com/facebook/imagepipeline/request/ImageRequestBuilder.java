package com.facebook.imagepipeline.request;

import android.net.Uri;
import androidx.datastore.preferences.protobuf.d1;
import com.facebook.imagepipeline.common.BytesRange;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imagepipeline.core.DownsampleMode;
import com.facebook.imagepipeline.listener.RequestListener;
import java.util.HashSet;
import java.util.Iterator;
import v8.a;

/* JADX INFO: loaded from: classes3.dex */
public final class ImageRequestBuilder {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final HashSet f5125t = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Uri f5126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageRequest.RequestLevel f5127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ResizeOptions f5129d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RotationOptions f5130e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ImageDecodeOptions f5131f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ImageRequest.CacheChoice f5132g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f5133h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f5134i;
    public boolean j;
    public Priority k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Postprocessor f5135l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Boolean f5136m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public RequestListener f5137n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public BytesRange f5138o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Boolean f5139p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public DownsampleMode f5140q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f5141r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f5142s;

    public static ImageRequestBuilder b(ImageRequest imageRequest) {
        ImageRequestBuilder imageRequestBuilderD = d(imageRequest.getSourceUri());
        imageRequestBuilderD.f5131f = imageRequest.getImageDecodeOptions();
        imageRequestBuilderD.f5138o = imageRequest.getBytesRange();
        imageRequestBuilderD.f5132g = imageRequest.getCacheChoice();
        imageRequestBuilderD.f5134i = imageRequest.getLocalThumbnailPreviewsEnabled();
        imageRequestBuilderD.j = imageRequest.getLoadThumbnailOnlyForAndroidSdkAboveQ();
        imageRequestBuilderD.f5127b = imageRequest.getLowestPermittedRequestLevel();
        imageRequestBuilderD.f5128c = imageRequest.getCachesDisabled();
        if (imageRequestBuilderD.f5132g != ImageRequest.CacheChoice.f5118i) {
            imageRequestBuilderD.f5142s = null;
        }
        imageRequestBuilderD.f5135l = imageRequest.getPostprocessor();
        imageRequestBuilderD.f5133h = imageRequest.getProgressiveRenderingEnabled();
        imageRequestBuilderD.k = imageRequest.getPriority();
        imageRequestBuilderD.f5129d = imageRequest.getResizeOptions();
        imageRequestBuilderD.f5137n = imageRequest.getRequestListener();
        imageRequestBuilderD.f5130e = imageRequest.getRotationOptions();
        imageRequestBuilderD.f5136m = imageRequest.shouldDecodePrefetches();
        imageRequestBuilderD.f5141r = imageRequest.getDelayMs();
        imageRequestBuilderD.f5142s = imageRequest.getDiskCacheId();
        imageRequestBuilderD.f5140q = imageRequest.getDownsampleOverride();
        imageRequestBuilderD.f5139p = imageRequest.getResizingAllowedOverride();
        return imageRequestBuilderD;
    }

    public static boolean c(Uri uri) {
        HashSet hashSet = f5125t;
        if (hashSet == null || uri == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equals(uri.getScheme())) {
                return true;
            }
        }
        return false;
    }

    public static ImageRequestBuilder d(Uri uri) {
        ImageRequestBuilder imageRequestBuilder = new ImageRequestBuilder();
        imageRequestBuilder.f5126a = null;
        imageRequestBuilder.f5127b = ImageRequest.RequestLevel.FULL_FETCH;
        imageRequestBuilder.f5128c = 0;
        imageRequestBuilder.f5129d = null;
        imageRequestBuilder.f5130e = null;
        imageRequestBuilder.f5131f = ImageDecodeOptions.f4809c;
        imageRequestBuilder.f5132g = ImageRequest.CacheChoice.f5117e;
        imageRequestBuilder.f5133h = false;
        imageRequestBuilder.f5134i = false;
        imageRequestBuilder.j = false;
        imageRequestBuilder.k = Priority.f4815v;
        imageRequestBuilder.f5135l = null;
        imageRequestBuilder.f5136m = null;
        imageRequestBuilder.f5138o = null;
        imageRequestBuilder.f5139p = null;
        imageRequestBuilder.f5140q = null;
        imageRequestBuilder.f5142s = null;
        uri.getClass();
        imageRequestBuilder.f5126a = uri;
        return imageRequestBuilder;
    }

    public final ImageRequest a() {
        Uri uri = this.f5126a;
        if (uri == null) {
            throw new d1("Source must be set!");
        }
        if ("res".equals(a.b(uri))) {
            if (!this.f5126a.isAbsolute()) {
                throw new d1("Resource URI path must be absolute.");
            }
            if (this.f5126a.getPath().isEmpty()) {
                throw new d1("Resource URI must not be empty");
            }
            try {
                Integer.parseInt(this.f5126a.getPath().substring(1));
            } catch (NumberFormatException unused) {
                throw new d1("Resource URI path must be a resource id.");
            }
        }
        if (!"asset".equals(a.b(this.f5126a)) || this.f5126a.isAbsolute()) {
            return new ImageRequest(this);
        }
        throw new d1("Asset URI path must be absolute.");
    }
}
