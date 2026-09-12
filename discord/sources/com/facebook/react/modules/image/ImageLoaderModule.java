package com.facebook.react.modules.image;

import android.net.Uri;
import android.util.SparseArray;
import c9.a;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.DataSource;
import com.facebook.datasource.DataSubscriber;
import com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapBuilder;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.fresco.ReactNetworkImageRequest;
import com.facebook.react.views.image.ReactCallerContextFactory;
import com.facebook.react.views.imagehelper.ImageSource;
import gc.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import x8.b;

/* JADX INFO: loaded from: classes3.dex */
@ReactModule(name = "ImageLoader")
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u0000 E2\u00020\u00012\u00020\u0002:\u0001EB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\tB!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0005\u0010\u000eJ#\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u00162\u000e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0018\u00010\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010\"\u001a\u00020\u001b2\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\"\u0010#J+\u0010&\u001a\u00020\u001b2\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b&\u0010'J)\u0010*\u001a\u00020\u001b2\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010)\u001a\u00020(2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020(H\u0016¢\u0006\u0004\b,\u0010-J\u001f\u00100\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020.2\u0006\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u001bH\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u001bH\u0016¢\u0006\u0004\b4\u00103J\u000f\u00105\u001a\u00020\u001bH\u0016¢\u0006\u0004\b5\u00103R\u0018\u00106\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00108\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\"\u0010;\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00180:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010=R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078BX\u0082\u0004¢\u0006\f\n\u0004\b\b\u00109\u001a\u0004\b>\u0010?R$\u0010\u000b\u001a\u00020\n2\u0006\u0010@\u001a\u00020\n8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bA\u0010B\"\u0004\bC\u0010D¨\u0006F"}, d2 = {"Lcom/facebook/react/modules/image/ImageLoaderModule;", "Lcom/facebook/fbreact/specs/NativeImageLoaderAndroidSpec;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "callerContext", "(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/Object;)V", "Lcom/facebook/imagepipeline/core/ImagePipeline;", "imagePipeline", "Lcom/facebook/react/views/image/ReactCallerContextFactory;", "callerContextFactory", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/facebook/imagepipeline/core/ImagePipeline;Lcom/facebook/react/views/image/ReactCallerContextFactory;)V", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/datasource/DataSubscriber;", "Lcom/facebook/common/references/CloseableReference;", "Lpa/q;", "createSizeSubscriber", "(Lcom/facebook/react/bridge/Promise;)Lcom/facebook/datasource/DataSubscriber;", "", "requestId", "Lcom/facebook/datasource/DataSource;", "Ljava/lang/Void;", "request", "", "registerRequest", "(ILcom/facebook/datasource/DataSource;)V", "removeRequest", "(I)Lcom/facebook/datasource/DataSource;", "", "uriString", "getSize", "(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "Lcom/facebook/react/bridge/ReadableMap;", "headers", "getSizeWithHeaders", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "", "requestIdAsDouble", "prefetchImage", "(Ljava/lang/String;DLcom/facebook/react/bridge/Promise;)V", "abortRequest", "(D)V", "Lcom/facebook/react/bridge/ReadableArray;", "uris", "queryCache", "(Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/Promise;)V", "onHostResume", "()V", "onHostPause", "onHostDestroy", "_imagePipeline", "Lcom/facebook/imagepipeline/core/ImagePipeline;", "enqueuedRequestMonitor", "Ljava/lang/Object;", "Landroid/util/SparseArray;", "enqueuedRequests", "Landroid/util/SparseArray;", "Lcom/facebook/react/views/image/ReactCallerContextFactory;", "getCallerContext", "()Ljava/lang/Object;", "value", "getImagePipeline", "()Lcom/facebook/imagepipeline/core/ImagePipeline;", "setImagePipeline", "(Lcom/facebook/imagepipeline/core/ImagePipeline;)V", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nImageLoaderModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageLoaderModule.kt\ncom/facebook/react/modules/image/ImageLoaderModule\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,286:1\n1#2:287\n*E\n"})
public final class ImageLoaderModule extends NativeImageLoaderAndroidSpec implements LifecycleEventListener {

    @NotNull
    private static final String ERROR_GET_SIZE_FAILURE = "E_GET_SIZE_FAILURE";

    @NotNull
    private static final String ERROR_INVALID_URI = "E_INVALID_URI";

    @NotNull
    private static final String ERROR_PREFETCH_FAILURE = "E_PREFETCH_FAILURE";

    @NotNull
    public static final String NAME = "ImageLoader";
    private ImagePipeline _imagePipeline;
    private final Object callerContext;
    private ReactCallerContextFactory callerContextFactory;

    @NotNull
    private final Object enqueuedRequestMonitor;

    @NotNull
    private final SparseArray<DataSource> enqueuedRequests;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageLoaderModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.enqueuedRequestMonitor = new Object();
        this.enqueuedRequests = new SparseArray<>();
        this.callerContext = this;
    }

    private final DataSubscriber createSizeSubscriber(final Promise promise) {
        return new b() { // from class: com.facebook.react.modules.image.ImageLoaderModule.createSizeSubscriber.1
            @Override // x8.b
            public void onFailureImpl(DataSource dataSource) {
                Intrinsics.checkNotNullParameter(dataSource, "dataSource");
                promise.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE, dataSource.b());
            }

            @Override // x8.b
            public void onNewResultImpl(DataSource dataSource) throws Throwable {
                Intrinsics.checkNotNullParameter(dataSource, "dataSource");
                if (!dataSource.isFinished()) {
                    return;
                }
                CloseableReference closeableReference = (CloseableReference) dataSource.getResult();
                if (closeableReference == null) {
                    promise.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE, "Failed to get the size of the image");
                    return;
                }
                EncodedImage encodedImage = null;
                try {
                    try {
                        EncodedImage encodedImage2 = new EncodedImage(closeableReference);
                        try {
                            boolean z5 = encodedImage2.getRotationAngle() == 90 || encodedImage2.getRotationAngle() == 270 || encodedImage2.getExifOrientation() == 5 || encodedImage2.getExifOrientation() == 7;
                            int height = z5 ? encodedImage2.getHeight() : encodedImage2.getWidth();
                            int width = z5 ? encodedImage2.getWidth() : encodedImage2.getHeight();
                            if (height >= 0 && width >= 0) {
                                WritableMap writableMapCreateMap = Arguments.createMap();
                                ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
                                readableMapBuilder.put("width", height);
                                readableMapBuilder.put("height", width);
                                promise.resolve(writableMapCreateMap);
                                encodedImage2.close();
                                closeableReference.close();
                                return;
                            }
                            promise.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE, "Failed to get the size of the image");
                            encodedImage2.close();
                            closeableReference.close();
                        } catch (Exception e10) {
                            e = e10;
                            encodedImage = encodedImage2;
                            promise.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE, e);
                            if (encodedImage != null) {
                                encodedImage.close();
                            }
                            closeableReference.close();
                        } catch (Throwable th2) {
                            th = th2;
                            encodedImage = encodedImage2;
                            if (encodedImage != null) {
                                encodedImage.close();
                            }
                            closeableReference.close();
                            throw th;
                        }
                    } catch (Exception e11) {
                        e = e11;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        };
    }

    private final Object getCallerContext() {
        Object orCreateCallerContext;
        ReactCallerContextFactory reactCallerContextFactory = this.callerContextFactory;
        return (reactCallerContextFactory == null || (orCreateCallerContext = reactCallerContextFactory.getOrCreateCallerContext("", "")) == null) ? this.callerContext : orCreateCallerContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImagePipeline getImagePipeline() {
        ImagePipeline imagePipeline = this._imagePipeline;
        if (imagePipeline != null) {
            return imagePipeline;
        }
        ImagePipeline imagePipelineS = a.s();
        Intrinsics.checkNotNullExpressionValue(imagePipelineS, "getImagePipeline(...)");
        return imagePipelineS;
    }

    private final void registerRequest(int requestId, DataSource request) {
        synchronized (this.enqueuedRequestMonitor) {
            this.enqueuedRequests.put(requestId, request);
            Unit unit = Unit.f14616a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DataSource removeRequest(int requestId) {
        DataSource dataSource;
        synchronized (this.enqueuedRequestMonitor) {
            dataSource = this.enqueuedRequests.get(requestId);
            this.enqueuedRequests.remove(requestId);
        }
        return dataSource;
    }

    private final void setImagePipeline(ImagePipeline imagePipeline) {
        this._imagePipeline = imagePipeline;
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    public void abortRequest(double requestId) {
        DataSource dataSourceRemoveRequest = removeRequest((int) requestId);
        if (dataSourceRemoveRequest != null) {
            dataSourceRemoveRequest.close();
        }
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    @ReactMethod
    public void getSize(String uriString, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        if (uriString == null || uriString.length() == 0) {
            promise.reject(ERROR_INVALID_URI, "Cannot get the size of an image for an empty URI");
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        ImageRequestBuilder imageRequestBuilderD = ImageRequestBuilder.d(new ImageSource(reactApplicationContext, uriString, 0.0d, 0.0d, null, false, 60, null).getUri());
        imageRequestBuilderD.f5130e = RotationOptions.f4820d;
        ImageRequest imageRequestA = imageRequestBuilderD.a();
        Intrinsics.checkNotNullExpressionValue(imageRequestA, "build(...)");
        getImagePipeline().b(imageRequestA, getCallerContext()).d(createSizeSubscriber(promise), l8.a.f14971d);
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    @ReactMethod
    public void getSizeWithHeaders(String uriString, ReadableMap headers, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        if (uriString == null || uriString.length() == 0) {
            promise.reject(ERROR_INVALID_URI, "Cannot get the size of an image for an empty URI");
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        ImageRequestBuilder imageRequestBuilderD = ImageRequestBuilder.d(new ImageSource(reactApplicationContext, uriString, 0.0d, 0.0d, null, false, 60, null).getUri());
        imageRequestBuilderD.f5130e = RotationOptions.f4820d;
        Intrinsics.checkNotNullExpressionValue(imageRequestBuilderD, "setRotationOptions(...)");
        getImagePipeline().b(ReactNetworkImageRequest.Companion.fromBuilderWithHeaders$default(ReactNetworkImageRequest.INSTANCE, imageRequestBuilderD, headers, null, 4, null), getCallerContext()).d(createSizeSubscriber(promise), l8.a.f14971d);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        synchronized (this.enqueuedRequestMonitor) {
            try {
                int size = this.enqueuedRequests.size();
                for (int i7 = 0; i7 < size; i7++) {
                    DataSource dataSourceValueAt = this.enqueuedRequests.valueAt(i7);
                    Intrinsics.checkNotNullExpressionValue(dataSourceValueAt, "valueAt(...)");
                    dataSourceValueAt.close();
                }
                this.enqueuedRequests.clear();
                Unit unit = Unit.f14616a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    public void prefetchImage(String uriString, double requestIdAsDouble, @NotNull final Promise promise) {
        x8.a aVarW;
        Intrinsics.checkNotNullParameter(promise, "promise");
        final int i7 = (int) requestIdAsDouble;
        if (uriString == null || uriString.length() == 0) {
            promise.reject(ERROR_INVALID_URI, "Cannot prefetch an image for an empty URI");
            return;
        }
        ImageRequest imageRequestA = ImageRequestBuilder.d(Uri.parse(uriString)).a();
        Intrinsics.checkNotNullExpressionValue(imageRequestA, "build(...)");
        ImagePipeline imagePipeline = getImagePipeline();
        Object callerContext = getCallerContext();
        imagePipeline.getClass();
        Priority priority = Priority.f4814i;
        Intrinsics.checkNotNullParameter(priority, "priority");
        if (((Boolean) imagePipeline.f4834b.get()).booleanValue()) {
            try {
                aVarW = imagePipeline.g(imagePipeline.f4833a.b(imageRequestA), imageRequestA, callerContext);
            } catch (Exception e10) {
                aVarW = ib.a.w(e10);
            }
        } else {
            aVarW = ib.a.w(ImagePipeline.k);
            Intrinsics.checkNotNullExpressionValue(aVarW, "immediateFailedDataSource(...)");
        }
        b bVar = new b() { // from class: com.facebook.react.modules.image.ImageLoaderModule$prefetchImage$prefetchSubscriber$1
            @Override // x8.b
            public void onFailureImpl(DataSource dataSource) {
                Intrinsics.checkNotNullParameter(dataSource, "dataSource");
                try {
                    this.this$0.removeRequest(i7);
                    promise.reject("E_PREFETCH_FAILURE", dataSource.b());
                } finally {
                    dataSource.close();
                }
            }

            @Override // x8.b
            public void onNewResultImpl(DataSource dataSource) {
                Intrinsics.checkNotNullParameter(dataSource, "dataSource");
                if (dataSource.isFinished()) {
                    try {
                        this.this$0.removeRequest(i7);
                        promise.resolve(Boolean.TRUE);
                    } catch (Exception e11) {
                        promise.reject("E_PREFETCH_FAILURE", e11);
                    } finally {
                        dataSource.close();
                    }
                }
            }
        };
        registerRequest(i7, aVarW);
        aVarW.d(bVar, l8.a.f14971d);
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    @ReactMethod
    public void queryCache(@NotNull ReadableArray uris, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(uris, "uris");
        Intrinsics.checkNotNullParameter(promise, "promise");
        new GuardedAsyncTask<Void, Void>(this, uris, getReactApplicationContext()) { // from class: com.facebook.react.modules.image.ImageLoaderModule.queryCache.1
            final /* synthetic */ ReadableArray $uris;
            final /* synthetic */ ImageLoaderModule this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(reactApplicationContext);
                Intrinsics.checkNotNull(reactApplicationContext);
            }

            @Override // com.facebook.react.bridge.GuardedAsyncTask
            public void doInBackgroundGuarded(Void... params) {
                Intrinsics.checkNotNullParameter(params, "params");
                ImageLoaderModule imageLoaderModule = this.this$0;
                ReadableArray readableArray = this.$uris;
                WritableMap writableMapCreateMap = Arguments.createMap();
                ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
                ImagePipeline imagePipeline = imageLoaderModule.getImagePipeline();
                int size = readableArray.size();
                for (int i7 = 0; i7 < size; i7++) {
                    String string = readableArray.getString(i7);
                    if (string != null && string.length() != 0) {
                        Uri uri = Uri.parse(string);
                        imagePipeline.getClass();
                        if (uri == null ? false : imagePipeline.f4838f.b(new o(9, uri))) {
                            readableMapBuilder.put(string, "memory");
                        } else if (imagePipeline.d(uri, ImageRequest.CacheChoice.f5116d) || imagePipeline.d(uri, ImageRequest.CacheChoice.f5117e) || imagePipeline.d(uri, ImageRequest.CacheChoice.f5118i)) {
                            readableMapBuilder.put(string, "disk");
                        }
                    }
                }
                this.$promise.resolve(writableMapCreateMap);
            }
        }.executeOnExecutor(GuardedAsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageLoaderModule(@NotNull ReactApplicationContext reactContext, Object obj) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.enqueuedRequestMonitor = new Object();
        this.enqueuedRequests = new SparseArray<>();
        this.callerContext = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageLoaderModule(@NotNull ReactApplicationContext reactContext, @NotNull ImagePipeline imagePipeline, @NotNull ReactCallerContextFactory callerContextFactory) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(imagePipeline, "imagePipeline");
        Intrinsics.checkNotNullParameter(callerContextFactory, "callerContextFactory");
        this.enqueuedRequestMonitor = new Object();
        this.enqueuedRequests = new SparseArray<>();
        this.callerContextFactory = callerContextFactory;
        setImagePipeline(imagePipeline);
        this.callerContext = null;
    }
}
