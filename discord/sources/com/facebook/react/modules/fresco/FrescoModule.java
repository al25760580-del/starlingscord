package com.facebook.react.modules.fresco;

import android.content.Context;
import com.facebook.imagepipeline.backends.okhttp3.OkHttpNetworkFetcher;
import com.facebook.imagepipeline.core.DownsampleMode;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import com.facebook.imagepipeline.core.a;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.common.ModuleDataCleaner;
import com.facebook.react.modules.network.CookieJarContainer;
import com.facebook.react.modules.network.ForwardingCookieHandler;
import com.facebook.react.modules.network.OkHttpClientProvider;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import ga.b;
import ga.l;
import ia.c;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.CookieJar;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import pa.s;

/* JADX INFO: loaded from: classes3.dex */
@ReactModule(name = FrescoModule.NAME, needsEagerInit = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0017\u0018\u0000 \u001e2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u001eB)\b\u0007\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fB1\b\u0017\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\u0010J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0014H\u0016J\b\u0010\u0018\u001a\u00020\u0014H\u0016J\b\u0010\u0019\u001a\u00020\u0014H\u0016J\b\u0010\u001a\u001a\u00020\u0014H\u0016J\b\u0010\u001d\u001a\u00020\u0014H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\u0004\u0018\u00010\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/facebook/react/modules/fresco/FrescoModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/modules/common/ModuleDataCleaner$Cleanable;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "Lcom/facebook/react/turbomodule/core/interfaces/TurboModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "clearOnDestroy", "", "imagePipelineConfig", "Lcom/facebook/imagepipeline/core/ImagePipelineConfig;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;ZLcom/facebook/imagepipeline/core/ImagePipelineConfig;)V", "imagePipeline", "Lcom/facebook/imagepipeline/core/ImagePipeline;", "hasBeenInitializedExternally", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/facebook/imagepipeline/core/ImagePipeline;ZZ)V", "config", "pipeline", "initialize", "", "getName", "", "clearSensitiveData", "onHostResume", "onHostPause", "onHostDestroy", "getImagePipeline", "()Lcom/facebook/imagepipeline/core/ImagePipeline;", "invalidate", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class FrescoModule extends ReactContextBaseJavaModule implements ModuleDataCleaner.Cleanable, LifecycleEventListener, TurboModule {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String NAME = "FrescoModule";
    private static boolean hasBeenInitialized;
    private final boolean clearOnDestroy;
    private ImagePipelineConfig config;
    private ImagePipeline pipeline;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/facebook/react/modules/fresco/FrescoModule$Companion;", "", "<init>", "()V", "NAME", "", "hasBeenInitialized", "", "getDefaultConfig", "Lcom/facebook/imagepipeline/core/ImagePipelineConfig;", "context", "Landroid/content/Context;", "getDefaultConfigBuilder", "Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ImagePipelineConfig getDefaultConfig(Context context) {
            ImagePipelineConfig.Builder defaultConfigBuilder = getDefaultConfigBuilder(context);
            defaultConfigBuilder.getClass();
            return new ImagePipelineConfig(defaultConfigBuilder);
        }

        @NotNull
        public final ImagePipelineConfig.Builder getDefaultConfigBuilder(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            HashSet hashSet = new HashSet();
            hashSet.add(new SystraceRequestListener());
            OkHttpClient okHttpClient = OkHttpClientProvider.createClient();
            CookieJar cookieJar = okHttpClient.G;
            Intrinsics.checkNotNull(cookieJar, "null cannot be cast to non-null type com.facebook.react.modules.network.CookieJarContainer");
            ((CookieJarContainer) cookieJar).setCookieJar(new l(new ForwardingCookieHandler()));
            Context context2 = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getApplicationContext(...)");
            Intrinsics.checkNotNullParameter(context2, "context");
            Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
            Intrinsics.checkNotNullParameter(context2, "context");
            ImagePipelineConfig.Builder builder = new ImagePipelineConfig.Builder(context2);
            builder.f4870g = new OkHttpNetworkFetcher(okHttpClient);
            builder.f4870g = new ReactOkHttpNetworkFetcher(okHttpClient);
            DownsampleMode downsampleMode = DownsampleMode.f4829e;
            Intrinsics.checkNotNullParameter(downsampleMode, "downsampleMode");
            builder.f4867d = downsampleMode;
            builder.f4872i = hashSet;
            a this$0 = builder.f4874m;
            this$0.getClass();
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.f4884h = true;
            Unit unit = Unit.f14616a;
            return builder;
        }

        public final boolean hasBeenInitialized() {
            return FrescoModule.hasBeenInitialized;
        }

        private Companion() {
        }
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, false, null, 6, null);
    }

    @NotNull
    public static final ImagePipelineConfig.Builder getDefaultConfigBuilder(@NotNull Context context) {
        return INSTANCE.getDefaultConfigBuilder(context);
    }

    private final ImagePipeline getImagePipeline() {
        if (this.pipeline == null) {
            this.pipeline = c9.a.s();
        }
        return this.pipeline;
    }

    public static final boolean hasBeenInitialized() {
        return INSTANCE.hasBeenInitialized();
    }

    @Override // com.facebook.react.modules.common.ModuleDataCleaner.Cleanable
    public void clearSensitiveData() {
        ImagePipeline imagePipeline = getImagePipeline();
        if (imagePipeline != null) {
            hm.a aVar = new hm.a(8);
            imagePipeline.f4838f.k(aVar);
            imagePipeline.f4839g.k(aVar);
            Object obj = imagePipeline.f4835c.get();
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            c cVar = (c) obj;
            cVar.b().a();
            cVar.c().a();
            Iterator it = cVar.a().entrySet().iterator();
            while (it.hasNext()) {
                ((b) ((Map.Entry) it.next()).getValue()).a();
            }
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        reactApplicationContext.addLifecycleEventListener(this);
        Companion companion = INSTANCE;
        if (!companion.hasBeenInitialized()) {
            ImagePipelineConfig defaultConfig = this.config;
            if (defaultConfig == null) {
                defaultConfig = companion.getDefaultConfig(reactApplicationContext);
            }
            Intrinsics.checkNotNullExpressionValue(new s(), "newBuilder(...)");
            Context applicationContext = reactApplicationContext.getApplicationContext();
            u4.c cVar = new u4.c();
            cVar.f20946d = new j8.c(1, Boolean.FALSE);
            c9.a.z(applicationContext, defaultConfig, cVar);
            hasBeenInitialized = true;
        } else if (this.config != null) {
            o8.a.v(ReactConstants.TAG, "Fresco has already been initialized with a different config. The new Fresco configuration will be ignored!");
        }
        this.config = null;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        getReactApplicationContext().removeLifecycleEventListener(this);
        super.invalidate();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        ImagePipeline imagePipeline;
        if (INSTANCE.hasBeenInitialized() && this.clearOnDestroy && (imagePipeline = getImagePipeline()) != null) {
            hm.a aVar = new hm.a(8);
            imagePipeline.f4838f.k(aVar);
            imagePipeline.f4839g.k(aVar);
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext, ImagePipeline imagePipeline) {
        this(reactApplicationContext, imagePipeline, false, false, 12, null);
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext, ImagePipeline imagePipeline, boolean z5) {
        this(reactApplicationContext, imagePipeline, z5, false, 8, null);
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext, boolean z5) {
        this(reactApplicationContext, z5, null, 4, null);
    }

    public /* synthetic */ FrescoModule(ReactApplicationContext reactApplicationContext, boolean z5, ImagePipelineConfig imagePipelineConfig, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(reactApplicationContext, (i7 & 2) != 0 ? true : z5, (i7 & 4) != 0 ? null : imagePipelineConfig);
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext, boolean z5, ImagePipelineConfig imagePipelineConfig) {
        super(reactApplicationContext);
        this.clearOnDestroy = z5;
        this.config = imagePipelineConfig;
    }

    public /* synthetic */ FrescoModule(ReactApplicationContext reactApplicationContext, ImagePipeline imagePipeline, boolean z5, boolean z6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(reactApplicationContext, imagePipeline, (i7 & 4) != 0 ? true : z5, (i7 & 8) != 0 ? false : z6);
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext, ImagePipeline imagePipeline, boolean z5, boolean z6) {
        this(reactApplicationContext, z5, null, 4, null);
        this.pipeline = imagePipeline;
        if (z6) {
            hasBeenInitialized = true;
        }
    }
}
