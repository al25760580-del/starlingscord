package com.facebook.react.views.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.Toast;
import c9.a;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.references.CloseableReference;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.drawee.drawable.ScalingUtils$ScaleType;
import com.facebook.drawee.drawable.m;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imagepipeline.core.DownsampleMode;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.imagepipeline.image.ImageInfo;
import com.facebook.imagepipeline.postprocessors.IterativeBoxBlurPostProcessor;
import com.facebook.imagepipeline.request.BasePostprocessor;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.imagepipeline.request.Postprocessor;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.internal.featureflags.ReactNativeNewArchitectureFeatureFlags;
import com.facebook.react.modules.fresco.ImageCacheControl;
import com.facebook.react.modules.fresco.ReactNetworkImageRequest;
import com.facebook.react.uimanager.BackgroundStyleApplicator;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.LengthPercentageType;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.style.BorderRadiusProp;
import com.facebook.react.uimanager.style.LogicalEdge;
import com.facebook.react.util.RNLog;
import com.facebook.react.views.imagehelper.ImageSource;
import com.facebook.react.views.imagehelper.MultiSourceHelper;
import com.facebook.react.views.imagehelper.ResourceDrawableIdHelper;
import f9.g;
import gc.o;
import ia.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k9.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import n8.i;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u0097\u00012\u00020\u0001:\u0004\u0098\u0001\u0097\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0012J\u0015\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u0019¢\u0006\u0004\b\u001e\u0010\u001cJ\u0015\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u0019¢\u0006\u0004\b \u0010\u001cJ\u0015\u0010\"\u001a\u00020\f2\u0006\u0010!\u001a\u00020\u0015¢\u0006\u0004\b\"\u0010\u0018J\u0015\u0010$\u001a\u00020\f2\u0006\u0010#\u001a\u00020\u0015¢\u0006\u0004\b$\u0010\u0018J\u001d\u0010$\u001a\u00020\f2\u0006\u0010#\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u0019¢\u0006\u0004\b$\u0010&J\u0015\u0010)\u001a\u00020\f2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u0015\u0010-\u001a\u00020\f2\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\u0015\u00101\u001a\u00020\f2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\u0015\u00104\u001a\u00020\f2\u0006\u00103\u001a\u00020\u0015¢\u0006\u0004\b4\u0010\u0018J\u0017\u00107\u001a\u00020\f2\b\u00106\u001a\u0004\u0018\u000105¢\u0006\u0004\b7\u00108J\u0017\u0010;\u001a\u00020\f2\b\u0010:\u001a\u0004\u0018\u000109¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\f2\b\u0010:\u001a\u0004\u0018\u000109¢\u0006\u0004\b=\u0010<J\u0015\u0010?\u001a\u00020\f2\u0006\u0010>\u001a\u00020\u000f¢\u0006\u0004\b?\u0010\u0012J\u0015\u0010A\u001a\u00020\f2\u0006\u0010@\u001a\u00020\u0019¢\u0006\u0004\bA\u0010\u001cJ\u0017\u0010C\u001a\u00020\f2\b\u0010B\u001a\u0004\u0018\u000109¢\u0006\u0004\bC\u0010<J\u000f\u0010D\u001a\u00020\u000fH\u0016¢\u0006\u0004\bD\u0010EJ\u0017\u0010H\u001a\u00020\f2\u0006\u0010G\u001a\u00020FH\u0016¢\u0006\u0004\bH\u0010IJ\r\u0010J\u001a\u00020\f¢\u0006\u0004\bJ\u0010KJ\u001f\u0010O\u001a\u00020\f2\u000e\u0010N\u001a\n\u0012\u0004\u0012\u00020M\u0018\u00010LH\u0007¢\u0006\u0004\bO\u0010PJ/\u0010U\u001a\u00020\f2\u0006\u0010Q\u001a\u00020\u00192\u0006\u0010R\u001a\u00020\u00192\u0006\u0010S\u001a\u00020\u00192\u0006\u0010T\u001a\u00020\u0019H\u0014¢\u0006\u0004\bU\u0010VJ\u0019\u0010Z\u001a\u00020Y2\b\u0010X\u001a\u0004\u0018\u00010WH\u0002¢\u0006\u0004\bZ\u0010[J\u0017\u0010]\u001a\u00020\\2\u0006\u0010X\u001a\u00020YH\u0002¢\u0006\u0004\b]\u0010^J\u0017\u0010`\u001a\u00020\f2\u0006\u0010_\u001a\u00020\u000fH\u0002¢\u0006\u0004\b`\u0010\u0012J\u000f\u0010a\u001a\u00020\u000fH\u0002¢\u0006\u0004\ba\u0010EJ!\u0010d\u001a\u00020c2\u0006\u0010:\u001a\u0002092\b\b\u0002\u0010b\u001a\u00020\u000fH\u0002¢\u0006\u0004\bd\u0010eJ\u000f\u0010f\u001a\u00020\fH\u0002¢\u0006\u0004\bf\u0010KJ\u0017\u0010h\u001a\u00020\u000f2\u0006\u0010g\u001a\u00020cH\u0002¢\u0006\u0004\bh\u0010iJ\u0019\u0010k\u001a\u00020\f2\b\u0010j\u001a\u0004\u0018\u00010WH\u0002¢\u0006\u0004\bk\u0010lR$\u0010\u0005\u001a\u0012\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010mR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010nR\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010oR\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020c0p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010qR$\u0010g\u001a\u0004\u0018\u00010c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bg\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\u0018\u0010w\u001a\u0004\u0018\u00010c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010rR\u0018\u0010y\u001a\u0004\u0018\u00010x8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010zR\u0018\u0010{\u001a\u0004\u0018\u00010x8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010zR\u0016\u0010\u001f\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010|R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010}R\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010~R\u0017\u0010\u007f\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u0017\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0010\u0010\u0080\u0001R \u0010\u0082\u0001\u001a\t\u0018\u00010\u0081\u0001R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001c\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0084\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\"\u0010\u0088\u0001\u001a\u000b\u0012\u0004\u0012\u00020M\u0018\u00010\u0087\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R!\u0010\u008a\u0001\u001a\n\u0012\u0004\u0012\u00020M\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0018\u0010\u008c\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008c\u0001\u0010|R\u0019\u0010\u008d\u0001\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u0080\u0001R\u0019\u0010B\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bB\u0010\u008e\u0001R\u0019\u0010\u008f\u0001\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0017\u00100\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b0\u0010\u0091\u0001R\u0016\u0010\u0092\u0001\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0092\u0001\u0010ER\u001a\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0093\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001¨\u0006\u0099\u0001"}, d2 = {"Lcom/facebook/react/views/image/ReactImageView;", "Lk9/b;", "Landroid/content/Context;", "context", "Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;", "draweeControllerBuilder", "Lcom/facebook/react/views/image/GlobalImageLoadListener;", "globalImageLoadListener", "", "callerContext", "<init>", "(Landroid/content/Context;Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;Lcom/facebook/react/views/image/GlobalImageLoadListener;Ljava/lang/Object;)V", "", "updateCallerContext", "(Ljava/lang/Object;)V", "", "useSmallCache", "setUseSmallCache", "(Z)V", "shouldNotify", "setShouldNotifyLoadEvents", "", "blurRadius", "setBlurRadius", "(F)V", "", ViewProps.BACKGROUND_COLOR, "setBackgroundColor", "(I)V", ViewProps.BORDER_COLOR, "setBorderColor", "overlayColor", "setOverlayColor", ViewProps.BORDER_WIDTH, "setBorderWidth", "borderRadius", "setBorderRadius", ViewProps.POSITION, "(FI)V", "Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;", "scaleType", "setScaleType", "(Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;)V", "Landroid/graphics/Shader$TileMode;", "tileMode", "setTileMode", "(Landroid/graphics/Shader$TileMode;)V", "Lcom/facebook/react/views/image/ImageResizeMethod;", ViewProps.RESIZE_METHOD, "setResizeMethod", "(Lcom/facebook/react/views/image/ImageResizeMethod;)V", "multiplier", "setResizeMultiplier", "Lcom/facebook/react/bridge/ReadableArray;", "sources", "setSource", "(Lcom/facebook/react/bridge/ReadableArray;)V", "Lcom/facebook/react/bridge/ReadableMap;", "source", "setDefaultSource", "(Lcom/facebook/react/bridge/ReadableMap;)V", "setLoadingIndicatorSource", ViewProps.ENABLED, "setProgressiveRenderingEnabled", "durationMs", "setFadeDuration", "headers", "setHeaders", "hasOverlappingRendering", "()Z", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "maybeUpdateView", "()V", "Lcom/facebook/drawee/controller/ControllerListener;", "Lcom/facebook/imagepipeline/image/ImageInfo;", "controllerListener", "setControllerListener", "(Lcom/facebook/drawee/controller/ControllerListener;)V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "", "cacheControl", "Lcom/facebook/react/modules/fresco/ImageCacheControl;", "computeCacheControl", "(Ljava/lang/String;)Lcom/facebook/react/modules/fresco/ImageCacheControl;", "Lcom/facebook/imagepipeline/request/ImageRequest$RequestLevel;", "computeRequestLevel", "(Lcom/facebook/react/modules/fresco/ImageCacheControl;)Lcom/facebook/imagepipeline/request/ImageRequest$RequestLevel;", "doResize", "maybeUpdateViewFromRequest", "hasMultipleSources", "includeSize", "Lcom/facebook/react/views/imagehelper/ImageSource;", "readableMapToImageSource", "(Lcom/facebook/react/bridge/ReadableMap;Z)Lcom/facebook/react/views/imagehelper/ImageSource;", "setSourceImage", "imageSource", "shouldResize", "(Lcom/facebook/react/views/imagehelper/ImageSource;)Z", "uri", "warnImageSource", "(Ljava/lang/String;)V", "Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;", "Lcom/facebook/react/views/image/GlobalImageLoadListener;", "Ljava/lang/Object;", "", "Ljava/util/List;", "Lcom/facebook/react/views/imagehelper/ImageSource;", "getImageSource$ReactAndroid_release", "()Lcom/facebook/react/views/imagehelper/ImageSource;", "setImageSource$ReactAndroid_release", "(Lcom/facebook/react/views/imagehelper/ImageSource;)V", "cachedImageSource", "Landroid/graphics/drawable/Drawable;", "defaultImageDrawable", "Landroid/graphics/drawable/Drawable;", "loadingImageDrawable", "I", "Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;", "Landroid/graphics/Shader$TileMode;", "isDirty", "Z", "Lcom/facebook/react/views/image/ReactImageView$TilePostprocessor;", "tilePostprocessor", "Lcom/facebook/react/views/image/ReactImageView$TilePostprocessor;", "Lcom/facebook/imagepipeline/postprocessors/IterativeBoxBlurPostProcessor;", "iterativeBoxBlurPostProcessor", "Lcom/facebook/imagepipeline/postprocessors/IterativeBoxBlurPostProcessor;", "Lcom/facebook/react/views/image/ReactImageDownloadListener;", "downloadListener", "Lcom/facebook/react/views/image/ReactImageDownloadListener;", "controllerForTesting", "Lcom/facebook/drawee/controller/ControllerListener;", "fadeDurationMs", "progressiveRenderingEnabled", "Lcom/facebook/react/bridge/ReadableMap;", "resizeMultiplier", "F", "Lcom/facebook/react/views/image/ImageResizeMethod;", "isTiled", "Lcom/facebook/imagepipeline/common/ResizeOptions;", "getResizeOptions", "()Lcom/facebook/imagepipeline/common/ResizeOptions;", "resizeOptions", "Companion", "TilePostprocessor", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReactImageView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactImageView.kt\ncom/facebook/react/views/image/ReactImageView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,706:1\n1#2:707\n*E\n"})
public final class ReactImageView extends b {
    public static final int REMOTE_IMAGE_FADE_DURATION_MS = 300;
    private ImageSource cachedImageSource;
    private Object callerContext;
    private ControllerListener controllerForTesting;
    private Drawable defaultImageDrawable;
    private ReactImageDownloadListener<ImageInfo> downloadListener;

    @NotNull
    private final AbstractDraweeControllerBuilder draweeControllerBuilder;
    private int fadeDurationMs;
    private final GlobalImageLoadListener globalImageLoadListener;
    private ReadableMap headers;
    private ImageSource imageSource;
    private boolean isDirty;
    private IterativeBoxBlurPostProcessor iterativeBoxBlurPostProcessor;
    private Drawable loadingImageDrawable;
    private int overlayColor;
    private boolean progressiveRenderingEnabled;

    @NotNull
    private ImageResizeMethod resizeMethod;
    private float resizeMultiplier;

    @NotNull
    private ScalingUtils$ScaleType scaleType;

    @NotNull
    private final List<ImageSource> sources;

    @NotNull
    private Shader.TileMode tileMode;
    private TilePostprocessor tilePostprocessor;
    private boolean useSmallCache;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Matrix tileMatrix = new Matrix();

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/facebook/react/views/image/ReactImageView$Companion;", "", "<init>", "()V", "REMOTE_IMAGE_FADE_DURATION_MS", "", "tileMatrix", "Landroid/graphics/Matrix;", "buildHierarchy", "Lcom/facebook/drawee/generic/GenericDraweeHierarchy;", "context", "Landroid/content/Context;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nReactImageView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactImageView.kt\ncom/facebook/react/views/image/ReactImageView$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,706:1\n1#2:707\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final GenericDraweeHierarchy buildHierarchy(Context context) {
            GenericDraweeHierarchyBuilder genericDraweeHierarchyBuilder = new GenericDraweeHierarchyBuilder(context.getResources());
            i9.b bVar = new i9.b();
            float[] fArr = new float[8];
            bVar.f11404c = fArr;
            Arrays.fill(fArr, 0.0f);
            bVar.f11409h = true;
            genericDraweeHierarchyBuilder.f4719q = bVar;
            GenericDraweeHierarchy genericDraweeHierarchyA = genericDraweeHierarchyBuilder.a();
            Intrinsics.checkNotNullExpressionValue(genericDraweeHierarchyA, "build(...)");
            return genericDraweeHierarchyA;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/facebook/react/views/image/ReactImageView$TilePostprocessor;", "Lcom/facebook/imagepipeline/request/BasePostprocessor;", "<init>", "(Lcom/facebook/react/views/image/ReactImageView;)V", "process", "Lcom/facebook/common/references/CloseableReference;", "Landroid/graphics/Bitmap;", "source", "bitmapFactory", "Lcom/facebook/imagepipeline/bitmaps/PlatformBitmapFactory;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class TilePostprocessor extends BasePostprocessor {
        public TilePostprocessor() {
        }

        @Override // com.facebook.imagepipeline.request.BasePostprocessor, com.facebook.imagepipeline.request.Postprocessor
        @NotNull
        public CloseableReference process(@NotNull Bitmap source, @NotNull PlatformBitmapFactory bitmapFactory) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(bitmapFactory, "bitmapFactory");
            Rect rect = new Rect(0, 0, ReactImageView.this.getWidth(), ReactImageView.this.getHeight());
            ReactImageView.this.scaleType.getTransform(ReactImageView.tileMatrix, rect, source.getWidth(), source.getHeight(), 0.0f, 0.0f);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            BitmapShader bitmapShader = new BitmapShader(source, ReactImageView.this.tileMode, ReactImageView.this.tileMode);
            bitmapShader.setLocalMatrix(ReactImageView.tileMatrix);
            paint.setShader(bitmapShader);
            int width = ReactImageView.this.getWidth();
            int height = ReactImageView.this.getHeight();
            bitmapFactory.getClass();
            CloseableReference closeableReferenceA = bitmapFactory.a(width, height, Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(closeableReferenceA, "createBitmap(...)");
            try {
                new Canvas((Bitmap) closeableReferenceA.q()).drawRect(rect, paint);
                CloseableReference closeableReferenceClone = closeableReferenceA.clone();
                Intrinsics.checkNotNullExpressionValue(closeableReferenceClone, "clone(...)");
                closeableReferenceA.close();
                return closeableReferenceClone;
            } catch (Throwable th2) {
                CloseableReference.l(closeableReferenceA);
                throw th2;
            }
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ImageCacheControl.values().length];
            try {
                iArr[ImageCacheControl.ONLY_IF_CACHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ImageResizeMethod.values().length];
            try {
                iArr2[ImageResizeMethod.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[ImageResizeMethod.RESIZE.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactImageView(@NotNull Context context, @NotNull AbstractDraweeControllerBuilder draweeControllerBuilder, GlobalImageLoadListener globalImageLoadListener, Object obj) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(draweeControllerBuilder, "draweeControllerBuilder");
        GenericDraweeHierarchy genericDraweeHierarchyBuildHierarchy = INSTANCE.buildHierarchy(context);
        setHierarchy(genericDraweeHierarchyBuildHierarchy);
        this.draweeControllerBuilder = draweeControllerBuilder;
        this.globalImageLoadListener = globalImageLoadListener;
        this.callerContext = obj;
        this.sources = new ArrayList();
        this.scaleType = ImageResizeMode.defaultValue();
        this.tileMode = ImageResizeMode.defaultTileMode();
        this.fadeDurationMs = -1;
        this.resizeMultiplier = 1.0f;
        this.resizeMethod = ImageResizeMethod.AUTO;
        setLegacyVisibilityHandlingEnabled(true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0010, code lost:
    
        if (r2.equals("default") == false) goto L21;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.react.modules.fresco.ImageCacheControl computeCacheControl(java.lang.String r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L39
            int r0 = r2.hashCode()
            switch(r0) {
                case -1564134880: goto L2b;
                case -934641255: goto L1f;
                case 706834161: goto L13;
                case 1544803905: goto La;
                default: goto L9;
            }
        L9:
            goto L33
        La:
            java.lang.String r0 = "default"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L39
            goto L33
        L13:
            java.lang.String r0 = "only-if-cached"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L1c
            goto L33
        L1c:
            com.facebook.react.modules.fresco.ImageCacheControl r2 = com.facebook.react.modules.fresco.ImageCacheControl.ONLY_IF_CACHED
            return r2
        L1f:
            java.lang.String r0 = "reload"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L28
            goto L33
        L28:
            com.facebook.react.modules.fresco.ImageCacheControl r2 = com.facebook.react.modules.fresco.ImageCacheControl.RELOAD
            return r2
        L2b:
            java.lang.String r0 = "force-cache"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L36
        L33:
            com.facebook.react.modules.fresco.ImageCacheControl r2 = com.facebook.react.modules.fresco.ImageCacheControl.DEFAULT
            return r2
        L36:
            com.facebook.react.modules.fresco.ImageCacheControl r2 = com.facebook.react.modules.fresco.ImageCacheControl.FORCE_CACHE
            return r2
        L39:
            com.facebook.react.modules.fresco.ImageCacheControl r2 = com.facebook.react.modules.fresco.ImageCacheControl.DEFAULT
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.image.ReactImageView.computeCacheControl(java.lang.String):com.facebook.react.modules.fresco.ImageCacheControl");
    }

    private final ImageRequest.RequestLevel computeRequestLevel(ImageCacheControl cacheControl) {
        return WhenMappings.$EnumSwitchMapping$0[cacheControl.ordinal()] == 1 ? ImageRequest.RequestLevel.DISK_CACHE : ImageRequest.RequestLevel.FULL_FETCH;
    }

    private final ResizeOptions getResizeOptions() {
        int iRound = Math.round(getWidth() * this.resizeMultiplier);
        int iRound2 = Math.round(getHeight() * this.resizeMultiplier);
        if (iRound <= 0 || iRound2 <= 0) {
            return null;
        }
        return new ResizeOptions(iRound, iRound2);
    }

    private final boolean hasMultipleSources() {
        return this.sources.size() > 1;
    }

    private final boolean isTiled() {
        return this.tileMode != Shader.TileMode.CLAMP;
    }

    private final void maybeUpdateViewFromRequest(boolean doResize) {
        ImageSource imageSource = this.imageSource;
        if (imageSource == null) {
            return;
        }
        Uri uri = imageSource.getUri();
        ImageCacheControl cacheControl = imageSource.getCacheControl();
        ImageRequest.RequestLevel requestLevelComputeRequestLevel = computeRequestLevel(cacheControl);
        ArrayList arrayList = new ArrayList();
        IterativeBoxBlurPostProcessor iterativeBoxBlurPostProcessor = this.iterativeBoxBlurPostProcessor;
        if (iterativeBoxBlurPostProcessor != null) {
            arrayList.add(iterativeBoxBlurPostProcessor);
        }
        TilePostprocessor tilePostprocessor = this.tilePostprocessor;
        if (tilePostprocessor != null) {
            arrayList.add(tilePostprocessor);
        }
        Postprocessor postprocessorFrom = MultiPostprocessor.INSTANCE.from(arrayList);
        ResizeOptions resizeOptions = doResize ? getResizeOptions() : null;
        if (cacheControl == ImageCacheControl.RELOAD) {
            ImagePipeline imagePipelineS = a.s();
            imagePipelineS.getClass();
            Intrinsics.checkNotNullParameter(uri, "uri");
            Intrinsics.checkNotNullParameter(uri, "uri");
            o oVar = new o(9, uri);
            imagePipelineS.f4838f.k(oVar);
            imagePipelineS.f4839g.k(oVar);
            ImageRequest imageRequestFromUri = ImageRequest.fromUri(uri);
            if (imageRequestFromUri == null) {
                throw new IllegalStateException("Required value was null.");
            }
            CacheKey encodedCacheKey = imagePipelineS.f4840h.getEncodedCacheKey(imageRequestFromUri, null);
            Object obj = imagePipelineS.f4835c.get();
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            c cVar = (c) obj;
            ga.b bVarB = cVar.b();
            Intrinsics.checkNotNull(encodedCacheKey);
            bVarB.d(encodedCacheKey);
            cVar.c().d(encodedCacheKey);
            Iterator it = cVar.a().entrySet().iterator();
            while (it.hasNext()) {
                ((ga.b) ((Map.Entry) it.next()).getValue()).d(encodedCacheKey);
            }
        }
        ImageRequestBuilder imageRequestBuilderD = ImageRequestBuilder.d(uri);
        imageRequestBuilderD.f5135l = postprocessorFrom;
        imageRequestBuilderD.f5129d = resizeOptions;
        RotationOptions rotationOptions = RotationOptions.f4819c;
        imageRequestBuilderD.f5130e = rotationOptions;
        imageRequestBuilderD.f5133h = this.progressiveRenderingEnabled;
        imageRequestBuilderD.f5127b = requestLevelComputeRequestLevel;
        ImageResizeMethod imageResizeMethod = this.resizeMethod;
        ImageResizeMethod imageResizeMethod2 = ImageResizeMethod.NONE;
        if (imageResizeMethod == imageResizeMethod2) {
            imageRequestBuilderD.f5140q = DownsampleMode.f4830i;
        }
        boolean z5 = this.useSmallCache;
        ImageRequest.CacheChoice cacheChoice = ImageRequest.CacheChoice.f5117e;
        ImageRequest.CacheChoice cacheChoice2 = ImageRequest.CacheChoice.f5116d;
        if (z5) {
            imageRequestBuilderD.f5132g = cacheChoice2;
        } else {
            imageRequestBuilderD.f5132g = cacheChoice;
        }
        ReactImageRequestBuilderHook reactImageRequestBuilderHook = ReactImageRequestBuilderHook.INSTANCE;
        Intrinsics.checkNotNull(imageRequestBuilderD);
        reactImageRequestBuilderHook.apply$ReactAndroid_release(uri, imageRequestBuilderD);
        ReactNetworkImageRequest reactNetworkImageRequestFromBuilderWithHeaders = ReactNetworkImageRequest.INSTANCE.fromBuilderWithHeaders(imageRequestBuilderD, this.headers, cacheControl);
        GlobalImageLoadListener globalImageLoadListener = this.globalImageLoadListener;
        if (globalImageLoadListener != null) {
            globalImageLoadListener.onLoadAttempt(uri);
        }
        AbstractDraweeControllerBuilder abstractDraweeControllerBuilder = this.draweeControllerBuilder;
        Intrinsics.checkNotNull(abstractDraweeControllerBuilder, "null cannot be cast to non-null type com.facebook.drawee.controller.AbstractDraweeControllerBuilder<*, com.facebook.imagepipeline.request.ImageRequest, com.facebook.common.references.CloseableReference<com.facebook.imagepipeline.image.CloseableImage>, com.facebook.imagepipeline.image.ImageInfo>");
        abstractDraweeControllerBuilder.c();
        abstractDraweeControllerBuilder.f4633b = reactNetworkImageRequestFromBuilderWithHeaders;
        abstractDraweeControllerBuilder.f4636e = true;
        abstractDraweeControllerBuilder.f4638g = getController();
        Object obj2 = this.callerContext;
        if (obj2 != null) {
            abstractDraweeControllerBuilder.f4632a = obj2;
            Intrinsics.checkNotNullExpressionValue(abstractDraweeControllerBuilder, "setCallerContext(...)");
        }
        ImageSource imageSource2 = this.cachedImageSource;
        if (imageSource2 != null) {
            ImageRequestBuilder imageRequestBuilderD2 = ImageRequestBuilder.d(imageSource2.getUri());
            imageRequestBuilderD2.f5135l = postprocessorFrom;
            imageRequestBuilderD2.f5129d = resizeOptions;
            imageRequestBuilderD2.f5130e = rotationOptions;
            imageRequestBuilderD2.f5133h = this.progressiveRenderingEnabled;
            if (this.resizeMethod == imageResizeMethod2) {
                imageRequestBuilderD2.f5140q = DownsampleMode.f4830i;
            }
            if (this.useSmallCache) {
                imageRequestBuilderD2.f5132g = cacheChoice2;
            } else {
                imageRequestBuilderD2.f5132g = cacheChoice;
            }
            Uri uri2 = imageSource2.getUri();
            Intrinsics.checkNotNull(imageRequestBuilderD2);
            reactImageRequestBuilderHook.apply$ReactAndroid_release(uri2, imageRequestBuilderD2);
            abstractDraweeControllerBuilder.f4634c = imageRequestBuilderD2.a();
            Intrinsics.checkNotNullExpressionValue(abstractDraweeControllerBuilder, "setLowResImageRequest(...)");
        }
        ReactImageDownloadListener<ImageInfo> reactImageDownloadListener = this.downloadListener;
        if (reactImageDownloadListener == null || this.controllerForTesting == null) {
            ControllerListener controllerListener = this.controllerForTesting;
            if (controllerListener != null) {
                abstractDraweeControllerBuilder.f4635d = controllerListener;
            } else if (reactImageDownloadListener != null) {
                abstractDraweeControllerBuilder.f4635d = reactImageDownloadListener;
            }
        } else {
            g gVar = new g();
            gVar.a(this.downloadListener);
            gVar.a(this.controllerForTesting);
            abstractDraweeControllerBuilder.f4635d = gVar;
        }
        if (this.downloadListener != null) {
            ((GenericDraweeHierarchy) getHierarchy()).k(this.downloadListener, 3);
        }
        setController(abstractDraweeControllerBuilder.a());
        abstractDraweeControllerBuilder.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onDraw$lambda$1(ReactImageView reactImageView, Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e10) {
            if (reactImageView.downloadListener != null) {
                Context context = reactImageView.getContext();
                Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
                EventDispatcher eventDispatcher = UIManagerHelper.getEventDispatcher((ReactContext) context);
                if (eventDispatcher != null) {
                    eventDispatcher.dispatchEvent(ImageLoadEvent.INSTANCE.createErrorEvent(UIManagerHelper.getSurfaceId(reactImageView), reactImageView.getId(), e10));
                }
            }
        }
        return Unit.f14616a;
    }

    private final ImageSource readableMapToImageSource(ReadableMap source, boolean includeSize) {
        ImageSource imageSource;
        ImageCacheControl imageCacheControlComputeCacheControl = computeCacheControl(source.getString("cache"));
        String string = source.getString("uri");
        if (includeSize) {
            double d6 = source.hasKey("width") ? source.getDouble("width") : 0.0d;
            double d7 = source.hasKey("height") ? source.getDouble("height") : 0.0d;
            boolean z5 = source.hasKey("isForceCached") ? source.getBoolean("isForceCached") : false;
            double d8 = d6;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            imageSource = new ImageSource(context, string, d8, d7, imageCacheControlComputeCacheControl, z5);
        } else {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            imageSource = new ImageSource(context2, string, 0.0d, 0.0d, imageCacheControlComputeCacheControl, false, 44, null);
        }
        if (!Intrinsics.areEqual(Uri.EMPTY, imageSource.getUri())) {
            return imageSource;
        }
        warnImageSource(string);
        ImageSource.Companion companion = ImageSource.INSTANCE;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        return companion.getTransparentBitmapImageSource(context3);
    }

    public static /* synthetic */ ImageSource readableMapToImageSource$default(ReactImageView reactImageView, ReadableMap readableMap, boolean z5, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z5 = false;
        }
        return reactImageView.readableMapToImageSource(readableMap, z5);
    }

    private final void setSourceImage() {
        this.imageSource = null;
        if (this.sources.isEmpty()) {
            List<ImageSource> list = this.sources;
            ImageSource.Companion companion = ImageSource.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            list.add(companion.getTransparentBitmapImageSource(context));
        } else if (hasMultipleSources()) {
            MultiSourceHelper.MultiSourceResult bestSourceForSize = MultiSourceHelper.getBestSourceForSize(getWidth(), getHeight(), this.sources);
            this.imageSource = bestSourceForSize.bestResult;
            this.cachedImageSource = bestSourceForSize.bestResultInCache;
            return;
        }
        this.imageSource = this.sources.get(0);
    }

    private final boolean shouldResize(ImageSource imageSource) {
        int i7 = WhenMappings.$EnumSwitchMapping$1[this.resizeMethod.ordinal()];
        if (i7 != 1) {
            if (i7 != 2) {
                return false;
            }
        } else if (!"content".equals(v8.a.b(imageSource.getUri())) && !"file".equals(v8.a.b(imageSource.getUri()))) {
            return false;
        }
        return true;
    }

    private final void warnImageSource(String uri) {
        if (!ReactBuildConfig.DEBUG || ReactNativeNewArchitectureFeatureFlags.enableBridgelessArchitecture()) {
            return;
        }
        Context context = getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        RNLog.w((ReactContext) context, "ReactImageView: Image source \"" + uri + "\" doesn't exist");
        Toast.makeText(getContext(), "Warning: Image source \"" + uri + "\" doesn't exist", 0).show();
    }

    /* JADX INFO: renamed from: getImageSource$ReactAndroid_release, reason: from getter */
    public final ImageSource getImageSource() {
        return this.imageSource;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    public final void maybeUpdateView() {
        if (this.isDirty) {
            if (!hasMultipleSources() || (getWidth() > 0 && getHeight() > 0)) {
                setSourceImage();
                ImageSource imageSource = this.imageSource;
                if (imageSource == null) {
                    return;
                }
                boolean zShouldResize = shouldResize(imageSource);
                if (!zShouldResize || (getWidth() > 0 && getHeight() > 0)) {
                    if (!isTiled() || (getWidth() > 0 && getHeight() > 0)) {
                        GenericDraweeHierarchy genericDraweeHierarchy = (GenericDraweeHierarchy) getHierarchy();
                        genericDraweeHierarchy.j(this.scaleType);
                        Drawable drawable = this.defaultImageDrawable;
                        if (drawable != null) {
                            ScalingUtils$ScaleType scaleType = this.scaleType;
                            genericDraweeHierarchy.k(drawable, 1);
                            m mVarH = genericDraweeHierarchy.h(1);
                            Intrinsics.checkNotNullParameter(scaleType, "scaleType");
                            if (!i.f(mVarH.f4683d, scaleType)) {
                                mVarH.f4683d = scaleType;
                                mVarH.h();
                                mVarH.invalidateSelf();
                            }
                        }
                        Drawable drawable2 = this.loadingImageDrawable;
                        if (drawable2 != null) {
                            com.facebook.drawee.drawable.o scaleType2 = com.facebook.drawee.drawable.o.f4688b;
                            genericDraweeHierarchy.k(drawable2, 1);
                            m mVarH2 = genericDraweeHierarchy.h(1);
                            Intrinsics.checkNotNullParameter(scaleType2, "scaleType");
                            if (!i.f(mVarH2.f4683d, scaleType2)) {
                                mVarH2.f4683d = scaleType2;
                                mVarH2.h();
                                mVarH2.invalidateSelf();
                            }
                        }
                        i9.b bVar = genericDraweeHierarchy.f4699c;
                        if (bVar != null) {
                            int i7 = this.overlayColor;
                            if (i7 != 0) {
                                bVar.f11405d = i7;
                                bVar.f11402a = 1;
                            } else {
                                bVar.f11402a = 2;
                            }
                            genericDraweeHierarchy.p(bVar);
                        }
                        int i10 = this.fadeDurationMs;
                        if (i10 < 0) {
                            i10 = imageSource.get_isResource() ? 0 : REMOTE_IMAGE_FADE_DURATION_MS;
                        }
                        genericDraweeHierarchy.l(i10);
                        maybeUpdateViewFromRequest(zShouldResize);
                        this.isDirty = false;
                    }
                }
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        BackgroundStyleApplicator.clipToPaddingBoxWithAntiAliasing(this, canvas, new c6.a(17, this, canvas));
    }

    @Override // android.view.View
    public void onSizeChanged(int w5, int h6, int oldw, int oldh) {
        super.onSizeChanged(w5, h6, oldw, oldh);
        if (w5 <= 0 || h6 <= 0) {
            return;
        }
        this.isDirty = this.isDirty || hasMultipleSources() || isTiled();
        maybeUpdateView();
    }

    @Override // android.view.View
    public void setBackgroundColor(int backgroundColor) {
        BackgroundStyleApplicator.setBackgroundColor(this, Integer.valueOf(backgroundColor));
    }

    public final void setBlurRadius(float blurRadius) {
        int iDpToPx = ((int) PixelUtil.INSTANCE.dpToPx(blurRadius)) / 2;
        this.iterativeBoxBlurPostProcessor = iDpToPx == 0 ? null : new IterativeBoxBlurPostProcessor(iDpToPx);
        this.isDirty = true;
    }

    public final void setBorderColor(int borderColor) {
        BackgroundStyleApplicator.setBorderColor(this, LogicalEdge.ALL, Integer.valueOf(borderColor));
    }

    public final void setBorderRadius(float borderRadius) {
        BackgroundStyleApplicator.setBorderRadius(this, BorderRadiusProp.BORDER_RADIUS, Float.isNaN(borderRadius) ? null : new LengthPercentage(PixelUtil.INSTANCE.pxToDp(borderRadius), LengthPercentageType.POINT));
    }

    public final void setBorderWidth(float borderWidth) {
        BackgroundStyleApplicator.setBorderWidth(this, LogicalEdge.ALL, Float.valueOf(borderWidth));
    }

    @VisibleForTesting
    public final void setControllerListener(ControllerListener controllerListener) {
        this.controllerForTesting = controllerListener;
        this.isDirty = true;
        maybeUpdateView();
    }

    public final void setDefaultSource(ReadableMap source) {
        Drawable resourceDrawable;
        if (source != null) {
            ImageSource imageSource = readableMapToImageSource(source, false);
            SoftAssertions.assertCondition(!imageSource.get_isResource(), "ReactImageView: Only local resources can be used as default image. Uri: " + imageSource.getUri());
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            resourceDrawable = ResourceDrawableIdHelper.getResourceDrawable(context, imageSource.getSource());
        } else {
            resourceDrawable = null;
        }
        if (Intrinsics.areEqual(this.defaultImageDrawable, resourceDrawable)) {
            return;
        }
        this.defaultImageDrawable = resourceDrawable;
        this.isDirty = true;
    }

    public final void setFadeDuration(int durationMs) {
        this.fadeDurationMs = durationMs;
    }

    public final void setHeaders(ReadableMap headers) {
        this.headers = headers;
    }

    public final void setImageSource$ReactAndroid_release(ImageSource imageSource) {
        this.imageSource = imageSource;
    }

    public final void setLoadingIndicatorSource(ReadableMap source) {
        Drawable resourceDrawable;
        if (source != null) {
            ImageSource imageSource = readableMapToImageSource(source, false);
            SoftAssertions.assertCondition(!imageSource.get_isResource(), "ReactImageView: Only local resources can be used as default image. Uri: " + imageSource.getUri());
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            resourceDrawable = ResourceDrawableIdHelper.getResourceDrawable(context, imageSource.getSource());
        } else {
            resourceDrawable = null;
        }
        com.facebook.drawee.drawable.b bVar = resourceDrawable != null ? new com.facebook.drawee.drawable.b(resourceDrawable, 1000) : null;
        if (Intrinsics.areEqual(this.loadingImageDrawable, bVar)) {
            return;
        }
        this.loadingImageDrawable = bVar;
        this.isDirty = true;
    }

    public final void setOverlayColor(int overlayColor) {
        if (this.overlayColor != overlayColor) {
            this.overlayColor = overlayColor;
            this.isDirty = true;
        }
    }

    public final void setProgressiveRenderingEnabled(boolean enabled) {
        this.progressiveRenderingEnabled = enabled;
    }

    public final void setResizeMethod(@NotNull ImageResizeMethod resizeMethod) {
        Intrinsics.checkNotNullParameter(resizeMethod, "resizeMethod");
        if (this.resizeMethod != resizeMethod) {
            this.resizeMethod = resizeMethod;
            this.isDirty = true;
        }
    }

    public final void setResizeMultiplier(float multiplier) {
        if (Math.abs(this.resizeMultiplier - multiplier) > 9.999999747378752E-5d) {
            this.resizeMultiplier = multiplier;
            this.isDirty = true;
        }
    }

    public final void setScaleType(@NotNull ScalingUtils$ScaleType scaleType) {
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        if (this.scaleType != scaleType) {
            this.scaleType = scaleType;
            this.isDirty = true;
        }
    }

    public final void setShouldNotifyLoadEvents(boolean shouldNotify) {
        if (shouldNotify == (this.downloadListener != null)) {
            return;
        }
        if (shouldNotify) {
            Context context = getContext();
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            final EventDispatcher eventDispatcher = UIManagerHelper.getEventDispatcher((ReactContext) context);
            this.downloadListener = new ReactImageDownloadListener<ImageInfo>() { // from class: com.facebook.react.views.image.ReactImageView.setShouldNotifyLoadEvents.1
                @Override // com.facebook.react.views.image.ReactImageDownloadListener, com.facebook.drawee.controller.ControllerListener
                public void onFailure(String id2, Throwable throwable) {
                    Intrinsics.checkNotNullParameter(id2, "id");
                    Intrinsics.checkNotNullParameter(throwable, "throwable");
                    EventDispatcher eventDispatcher2 = eventDispatcher;
                    if (eventDispatcher2 == null) {
                        return;
                    }
                    eventDispatcher2.dispatchEvent(ImageLoadEvent.INSTANCE.createErrorEvent(UIManagerHelper.getSurfaceId(this), this.getId(), throwable));
                }

                @Override // com.facebook.react.views.image.ReactImageDownloadListener
                public void onProgressChange(int loaded, int total) {
                    if (eventDispatcher == null || this.getImageSource() == null) {
                        return;
                    }
                    EventDispatcher eventDispatcher2 = eventDispatcher;
                    ImageLoadEvent.Companion companion = ImageLoadEvent.INSTANCE;
                    int surfaceId = UIManagerHelper.getSurfaceId(this);
                    int id2 = this.getId();
                    ImageSource imageSource = this.getImageSource();
                    eventDispatcher2.dispatchEvent(companion.createProgressEvent(surfaceId, id2, imageSource != null ? imageSource.getSource() : null, loaded, total));
                }

                @Override // com.facebook.react.views.image.ReactImageDownloadListener, com.facebook.drawee.controller.ControllerListener
                public void onSubmit(String id2, Object callerContext) {
                    Intrinsics.checkNotNullParameter(id2, "id");
                    EventDispatcher eventDispatcher2 = eventDispatcher;
                    if (eventDispatcher2 == null) {
                        return;
                    }
                    eventDispatcher2.dispatchEvent(ImageLoadEvent.INSTANCE.createLoadStartEvent(UIManagerHelper.getSurfaceId(this), this.getId()));
                }

                @Override // com.facebook.react.views.image.ReactImageDownloadListener, com.facebook.drawee.controller.ControllerListener
                public void onFinalImageSet(String id2, ImageInfo imageInfo, Animatable animatable) {
                    EventDispatcher eventDispatcher2;
                    Intrinsics.checkNotNullParameter(id2, "id");
                    if (imageInfo == null || this.getImageSource() == null || (eventDispatcher2 = eventDispatcher) == null) {
                        return;
                    }
                    ImageLoadEvent.Companion companion = ImageLoadEvent.INSTANCE;
                    int surfaceId = UIManagerHelper.getSurfaceId(this);
                    int id3 = this.getId();
                    ImageSource imageSource = this.getImageSource();
                    eventDispatcher2.dispatchEvent(companion.createLoadEvent(surfaceId, id3, imageSource != null ? imageSource.getSource() : null, imageInfo.getWidth(), imageInfo.getHeight()));
                    eventDispatcher.dispatchEvent(companion.createLoadEndEvent(UIManagerHelper.getSurfaceId(this), this.getId()));
                }
            };
        } else {
            this.downloadListener = null;
        }
        this.isDirty = true;
    }

    public final void setSource(ReadableArray sources) {
        ArrayList arrayList = new ArrayList();
        if (sources == null || sources.size() == 0) {
            ImageSource.Companion companion = ImageSource.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            arrayList.add(companion.getTransparentBitmapImageSource(context));
        } else {
            if (sources.size() == 1) {
                ReadableMap map = sources.getMap(0);
                if (map == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                arrayList.add(readableMapToImageSource(map, false));
            } else {
                int size = sources.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ReadableMap map2 = sources.getMap(i7);
                    if (map2 != null) {
                        arrayList.add(readableMapToImageSource(map2, true));
                    }
                }
            }
        }
        if (Intrinsics.areEqual(this.sources, arrayList)) {
            return;
        }
        this.sources.clear();
        this.sources.addAll(arrayList);
        this.isDirty = true;
    }

    public final void setTileMode(@NotNull Shader.TileMode tileMode) {
        Intrinsics.checkNotNullParameter(tileMode, "tileMode");
        if (this.tileMode != tileMode) {
            this.tileMode = tileMode;
            this.tilePostprocessor = isTiled() ? new TilePostprocessor() : null;
            this.isDirty = true;
        }
    }

    public final void setUseSmallCache(boolean useSmallCache) {
        if (this.useSmallCache != useSmallCache) {
            this.useSmallCache = useSmallCache;
            this.isDirty = true;
        }
    }

    public final void updateCallerContext(Object callerContext) {
        if (Intrinsics.areEqual(this.callerContext, callerContext)) {
            return;
        }
        this.callerContext = callerContext;
        this.isDirty = true;
    }

    public final void setBorderRadius(float borderRadius, int position) {
        BackgroundStyleApplicator.setBorderRadius(this, BorderRadiusProp.values()[position], Float.isNaN(borderRadius) ? null : new LengthPercentage(PixelUtil.INSTANCE.pxToDp(borderRadius), LengthPercentageType.POINT));
    }
}
