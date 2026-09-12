package com.facebook.imagepipeline.request;

import a5.l0;
import android.net.Uri;
import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.Fn;
import com.facebook.imagepipeline.common.BytesRange;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imagepipeline.core.DownsampleMode;
import com.facebook.imagepipeline.listener.RequestListener;
import i8.b;
import java.io.File;
import java.util.HashMap;
import kotlin.text.x;
import n8.f;
import n8.i;
import v8.a;

/* JADX INFO: loaded from: classes3.dex */
public class ImageRequest {
    public static final Fn REQUEST_TO_URI_FN = new b(4);
    private static boolean sCacheHashcode;
    private static boolean sUseCachedHashcodeInEquals;
    private final BytesRange mBytesRange;
    private final CacheChoice mCacheChoice;
    protected int mCachesDisabled;
    private final Boolean mDecodePrefetches;
    private final int mDelayMs;
    private final String mDiskCacheId;
    private final DownsampleMode mDownsampleOverride;
    private int mHashcode;
    private final ImageDecodeOptions mImageDecodeOptions;
    private final boolean mIsDiskCacheEnabled;
    private final boolean mIsMemoryCacheEnabled;
    private final boolean mLoadThumbnailOnly;
    private final boolean mLocalThumbnailPreviewsEnabled;
    private final RequestLevel mLowestPermittedRequestLevel;
    private final Postprocessor mPostprocessor;
    private final boolean mProgressiveRenderingEnabled;
    private final RequestListener mRequestListener;
    private final Priority mRequestPriority;
    private final ResizeOptions mResizeOptions;
    private final Boolean mResizingAllowedOverride;
    private final RotationOptions mRotationOptions;
    private File mSourceFile;
    private final Uri mSourceUri;
    private final int mSourceUriType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class CacheChoice {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final CacheChoice f5116d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final CacheChoice f5117e;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final CacheChoice f5118i;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final /* synthetic */ CacheChoice[] f5119v;

        static {
            CacheChoice cacheChoice = new CacheChoice("SMALL", 0);
            f5116d = cacheChoice;
            CacheChoice cacheChoice2 = new CacheChoice("DEFAULT", 1);
            f5117e = cacheChoice2;
            CacheChoice cacheChoice3 = new CacheChoice("DYNAMIC", 2);
            f5118i = cacheChoice3;
            f5119v = new CacheChoice[]{cacheChoice, cacheChoice2, cacheChoice3};
        }

        public static CacheChoice valueOf(String str) {
            return (CacheChoice) Enum.valueOf(CacheChoice.class, str);
        }

        public static CacheChoice[] values() {
            return (CacheChoice[]) f5119v.clone();
        }
    }

    public enum RequestLevel {
        FULL_FETCH(1),
        DISK_CACHE(2),
        /* JADX INFO: Fake field, exist only in values array */
        ENCODED_MEMORY_CACHE(3),
        BITMAP_MEMORY_CACHE(4);


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f5124d;

        RequestLevel(int i7) {
            this.f5124d = i7;
        }
    }

    public ImageRequest(ImageRequestBuilder imageRequestBuilder) {
        this.mCacheChoice = imageRequestBuilder.f5132g;
        Uri uri = imageRequestBuilder.f5126a;
        this.mSourceUri = uri;
        int i7 = -1;
        if (uri != null) {
            if (a.c(uri)) {
                i7 = 0;
            } else if (uri.getPath() != null && "file".equals(a.b(uri))) {
                String strA = p8.a.a(uri.getPath());
                i7 = strA != null ? x.o(strA, "video/", false) : false ? 2 : 3;
            } else if ("content".equals(a.b(uri))) {
                i7 = 4;
            } else if ("asset".equals(a.b(uri))) {
                i7 = 5;
            } else if ("res".equals(a.b(uri))) {
                i7 = 6;
            } else if ("data".equals(uri.getScheme())) {
                i7 = 7;
            } else if ("android.resource".equals(a.b(uri))) {
                i7 = 8;
            }
        }
        this.mSourceUriType = i7;
        this.mProgressiveRenderingEnabled = imageRequestBuilder.f5133h;
        this.mLocalThumbnailPreviewsEnabled = imageRequestBuilder.f5134i;
        this.mLoadThumbnailOnly = imageRequestBuilder.j;
        this.mImageDecodeOptions = imageRequestBuilder.f5131f;
        this.mResizeOptions = imageRequestBuilder.f5129d;
        RotationOptions rotationOptions = imageRequestBuilder.f5130e;
        this.mRotationOptions = rotationOptions == null ? RotationOptions.f4819c : rotationOptions;
        this.mBytesRange = imageRequestBuilder.f5138o;
        this.mRequestPriority = imageRequestBuilder.k;
        this.mLowestPermittedRequestLevel = imageRequestBuilder.f5127b;
        boolean z5 = (imageRequestBuilder.f5128c & 48) == 0 && (a.c(imageRequestBuilder.f5126a) || ImageRequestBuilder.c(imageRequestBuilder.f5126a));
        this.mIsDiskCacheEnabled = z5;
        int i10 = imageRequestBuilder.f5128c;
        this.mCachesDisabled = !z5 ? i10 | 48 : i10;
        this.mIsMemoryCacheEnabled = (i10 & 15) == 0;
        this.mDecodePrefetches = imageRequestBuilder.f5136m;
        this.mPostprocessor = imageRequestBuilder.f5135l;
        this.mRequestListener = imageRequestBuilder.f5137n;
        this.mResizingAllowedOverride = imageRequestBuilder.f5139p;
        this.mDownsampleOverride = imageRequestBuilder.f5140q;
        this.mDelayMs = imageRequestBuilder.f5141r;
        this.mDiskCacheId = imageRequestBuilder.f5142s;
    }

    public static int a(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static ImageRequest fromFile(File file) {
        if (file == null) {
            return null;
        }
        Uri uri = a.f21502a;
        return fromUri(Uri.fromFile(file));
    }

    public static ImageRequest fromUri(Uri uri) {
        if (uri == null) {
            return null;
        }
        return ImageRequestBuilder.d(uri).a();
    }

    public static void setCacheHashcode(boolean z5) {
        sCacheHashcode = z5;
    }

    public static void setUseCachedHashcodeInEquals(boolean z5) {
        sUseCachedHashcodeInEquals = z5;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ImageRequest)) {
            return false;
        }
        ImageRequest imageRequest = (ImageRequest) obj;
        if (sUseCachedHashcodeInEquals) {
            int i7 = this.mHashcode;
            int i10 = imageRequest.mHashcode;
            if (i7 != 0 && i10 != 0 && i7 != i10) {
                return false;
            }
        }
        if (this.mLocalThumbnailPreviewsEnabled != imageRequest.mLocalThumbnailPreviewsEnabled || this.mIsDiskCacheEnabled != imageRequest.mIsDiskCacheEnabled || this.mIsMemoryCacheEnabled != imageRequest.mIsMemoryCacheEnabled || !i.f(this.mSourceUri, imageRequest.mSourceUri) || !i.f(this.mCacheChoice, imageRequest.mCacheChoice) || !i.f(this.mDiskCacheId, imageRequest.mDiskCacheId) || !i.f(this.mSourceFile, imageRequest.mSourceFile) || !i.f(this.mBytesRange, imageRequest.mBytesRange) || !i.f(this.mImageDecodeOptions, imageRequest.mImageDecodeOptions) || !i.f(this.mResizeOptions, imageRequest.mResizeOptions) || !i.f(this.mRequestPriority, imageRequest.mRequestPriority) || !i.f(this.mLowestPermittedRequestLevel, imageRequest.mLowestPermittedRequestLevel) || !i.f(Integer.valueOf(this.mCachesDisabled), Integer.valueOf(imageRequest.mCachesDisabled)) || !i.f(this.mDecodePrefetches, imageRequest.mDecodePrefetches) || !i.f(this.mResizingAllowedOverride, imageRequest.mResizingAllowedOverride) || !i.f(this.mDownsampleOverride, imageRequest.mDownsampleOverride) || !i.f(this.mRotationOptions, imageRequest.mRotationOptions) || this.mLoadThumbnailOnly != imageRequest.mLoadThumbnailOnly) {
            return false;
        }
        Postprocessor postprocessor = this.mPostprocessor;
        CacheKey postprocessorCacheKey = postprocessor != null ? postprocessor.getPostprocessorCacheKey() : null;
        Postprocessor postprocessor2 = imageRequest.mPostprocessor;
        return i.f(postprocessorCacheKey, postprocessor2 != null ? postprocessor2.getPostprocessorCacheKey() : null) && this.mDelayMs == imageRequest.mDelayMs;
    }

    @Deprecated
    public boolean getAutoRotateEnabled() {
        return this.mRotationOptions.a();
    }

    public BytesRange getBytesRange() {
        return this.mBytesRange;
    }

    public CacheChoice getCacheChoice() {
        return this.mCacheChoice;
    }

    public int getCachesDisabled() {
        return this.mCachesDisabled;
    }

    public int getDelayMs() {
        return this.mDelayMs;
    }

    public String getDiskCacheId() {
        return this.mDiskCacheId;
    }

    public DownsampleMode getDownsampleOverride() {
        return this.mDownsampleOverride;
    }

    public ImageDecodeOptions getImageDecodeOptions() {
        return this.mImageDecodeOptions;
    }

    public boolean getLoadThumbnailOnlyForAndroidSdkAboveQ() {
        return Build.VERSION.SDK_INT >= 29 && this.mLoadThumbnailOnly;
    }

    public boolean getLocalThumbnailPreviewsEnabled() {
        return this.mLocalThumbnailPreviewsEnabled;
    }

    public RequestLevel getLowestPermittedRequestLevel() {
        return this.mLowestPermittedRequestLevel;
    }

    public Postprocessor getPostprocessor() {
        return this.mPostprocessor;
    }

    public int getPreferredHeight() {
        ResizeOptions resizeOptions = this.mResizeOptions;
        return resizeOptions != null ? resizeOptions.f4818b : RecyclerView.ItemAnimator.FLAG_MOVED;
    }

    public int getPreferredWidth() {
        ResizeOptions resizeOptions = this.mResizeOptions;
        return resizeOptions != null ? resizeOptions.f4817a : RecyclerView.ItemAnimator.FLAG_MOVED;
    }

    public Priority getPriority() {
        return this.mRequestPriority;
    }

    public boolean getProgressiveRenderingEnabled() {
        return this.mProgressiveRenderingEnabled;
    }

    public RequestListener getRequestListener() {
        return this.mRequestListener;
    }

    public ResizeOptions getResizeOptions() {
        return this.mResizeOptions;
    }

    public Boolean getResizingAllowedOverride() {
        return this.mResizingAllowedOverride;
    }

    public RotationOptions getRotationOptions() {
        return this.mRotationOptions;
    }

    public synchronized File getSourceFile() {
        try {
            if (this.mSourceFile == null) {
                this.mSourceUri.getPath().getClass();
                this.mSourceFile = new File(this.mSourceUri.getPath());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.mSourceFile;
    }

    public Uri getSourceUri() {
        return this.mSourceUri;
    }

    public int getSourceUriType() {
        return this.mSourceUriType;
    }

    public int hashCode() {
        boolean z5 = sCacheHashcode;
        int i7 = z5 ? this.mHashcode : 0;
        if (i7 != 0) {
            return i7;
        }
        Postprocessor postprocessor = this.mPostprocessor;
        int iS = l0.s(l0.s(l0.s(l0.s(l0.s(l0.s(l0.s(l0.s(l0.s(l0.s(l0.s(l0.s(l0.s(l0.s(l0.s(l0.s(l0.s(l0.s(0, this.mCacheChoice), this.mSourceUri), Boolean.valueOf(this.mLocalThumbnailPreviewsEnabled)), this.mBytesRange), this.mRequestPriority), this.mLowestPermittedRequestLevel), Integer.valueOf(this.mCachesDisabled)), Boolean.valueOf(this.mIsDiskCacheEnabled)), Boolean.valueOf(this.mIsMemoryCacheEnabled)), this.mImageDecodeOptions), this.mDecodePrefetches), this.mResizeOptions), this.mRotationOptions), postprocessor != null ? postprocessor.getPostprocessorCacheKey() : null), this.mResizingAllowedOverride), this.mDownsampleOverride), Integer.valueOf(this.mDelayMs)), Boolean.valueOf(this.mLoadThumbnailOnly));
        if (z5) {
            this.mHashcode = iS;
        }
        return iS;
    }

    public boolean isCacheEnabled(int i7) {
        return (i7 & getCachesDisabled()) == 0;
    }

    public boolean isDiskCacheEnabled() {
        return this.mIsDiskCacheEnabled;
    }

    public boolean isMemoryCacheEnabled() {
        return this.mIsMemoryCacheEnabled;
    }

    public void recordHashCode(HashMap<String, Integer> map) {
        Postprocessor postprocessor = this.mPostprocessor;
        CacheKey postprocessorCacheKey = postprocessor != null ? postprocessor.getPostprocessorCacheKey() : null;
        map.put("ImageRequest", Integer.valueOf(hashCode()));
        map.put("ImageRequest.mSourceUri", Integer.valueOf(a(this.mSourceUri)));
        map.put("ImageRequest.mLocalThumbnailPreviewsEnabled", Integer.valueOf(Boolean.valueOf(this.mLocalThumbnailPreviewsEnabled).hashCode()));
        map.put("ImageRequest.mBytesRange", Integer.valueOf(a(this.mBytesRange)));
        map.put("ImageRequest.mRequestPriority", Integer.valueOf(a(this.mRequestPriority)));
        map.put("ImageRequest.mLowestPermittedRequestLevel", Integer.valueOf(a(this.mLowestPermittedRequestLevel)));
        map.put("ImageRequest.mCachesDisabled", Integer.valueOf(Integer.valueOf(this.mCachesDisabled).hashCode()));
        map.put("ImageRequest.mIsDiskCacheEnabled", Integer.valueOf(Boolean.valueOf(this.mIsDiskCacheEnabled).hashCode()));
        map.put("ImageRequest.mIsMemoryCacheEnabled", Integer.valueOf(Boolean.valueOf(this.mIsMemoryCacheEnabled).hashCode()));
        map.put("ImageRequest.mImageDecodeOptions", Integer.valueOf(a(this.mImageDecodeOptions)));
        map.put("ImageRequest.mDecodePrefetches", Integer.valueOf(a(this.mDecodePrefetches)));
        map.put("ImageRequest.mSoumResizeOptionsrceUri", Integer.valueOf(a(this.mResizeOptions)));
        map.put("ImageRequest.mRotationOptions", Integer.valueOf(a(this.mRotationOptions)));
        map.put("ImageRequest.postprocessorCacheKey", Integer.valueOf(a(postprocessorCacheKey)));
        map.put("ImageRequest.mResizingAllowedOverride", Integer.valueOf(a(this.mResizingAllowedOverride)));
        map.put("ImageRequest.mDownsampleOverride", Integer.valueOf(a(this.mDownsampleOverride)));
        map.put("ImageRequest.mDelayMs", Integer.valueOf(Integer.valueOf(this.mDelayMs).hashCode()));
        map.put("ImageRequest.mLoadThumbnailOnly", Integer.valueOf(Boolean.valueOf(this.mLoadThumbnailOnly).hashCode()));
    }

    public Boolean shouldDecodePrefetches() {
        return this.mDecodePrefetches;
    }

    public String toString() {
        f fVarJ = i.j(this);
        fVarJ.H(this.mSourceUri, "uri");
        fVarJ.H(this.mCacheChoice, "cacheChoice");
        fVarJ.H(this.mImageDecodeOptions, "decodeOptions");
        fVarJ.H(this.mPostprocessor, "postprocessor");
        fVarJ.H(this.mRequestPriority, "priority");
        fVarJ.H(this.mResizeOptions, "resizeOptions");
        fVarJ.H(this.mRotationOptions, "rotationOptions");
        fVarJ.H(this.mBytesRange, "bytesRange");
        fVarJ.H(this.mResizingAllowedOverride, "resizingAllowedOverride");
        fVarJ.H(this.mDownsampleOverride, "downsampleOverride");
        fVarJ.G("progressiveRenderingEnabled", this.mProgressiveRenderingEnabled);
        fVarJ.G("localThumbnailPreviewsEnabled", this.mLocalThumbnailPreviewsEnabled);
        fVarJ.G("loadThumbnailOnly", this.mLoadThumbnailOnly);
        fVarJ.H(this.mLowestPermittedRequestLevel, "lowestPermittedRequestLevel");
        fVarJ.F(this.mCachesDisabled, "cachesDisabled");
        fVarJ.G("isDiskCacheEnabled", this.mIsDiskCacheEnabled);
        fVarJ.G("isMemoryCacheEnabled", this.mIsMemoryCacheEnabled);
        fVarJ.H(this.mDecodePrefetches, "decodePrefetches");
        fVarJ.F(this.mDelayMs, "delayMs");
        return fVarJ.toString();
    }

    public static ImageRequest fromUri(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return fromUri(Uri.parse(str));
    }
}
