package com.airbnb.android.react.lottie;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import androidx.core.view.u0;
import com.airbnb.android.react.lottie.LottieAnimationViewManager;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.viewmanagers.LottieAnimationViewManagerDelegate;
import com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import java.util.Map;
import java.util.WeakHashMap;
import k4.b;
import k4.c;
import k4.d;
import k4.i;
import k4.k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import l4.f0;
import l4.h;
import l4.y;
import nm.e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@ReactModule(name = "LottieAnimationView")
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\rJ\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010#\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b%\u0010\u0019J\u0017\u0010&\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b&\u0010\u0019J\u0017\u0010'\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b'\u0010\u0019J!\u0010)\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010(\u001a\u0004\u0018\u00010\nH\u0017¢\u0006\u0004\b)\u0010*J!\u0010,\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010+\u001a\u0004\u0018\u00010\nH\u0017¢\u0006\u0004\b,\u0010*J!\u0010.\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010-\u001a\u0004\u0018\u00010\nH\u0017¢\u0006\u0004\b.\u0010*J!\u0010/\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010-\u001a\u0004\u0018\u00010\nH\u0017¢\u0006\u0004\b/\u0010*J\u001f\u00102\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u00101\u001a\u000200H\u0017¢\u0006\u0004\b2\u00103J!\u00105\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00022\b\u00104\u001a\u0004\u0018\u00010\nH\u0017¢\u0006\u0004\b5\u0010*J!\u00107\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00022\b\u00106\u001a\u0004\u0018\u00010\nH\u0017¢\u0006\u0004\b7\u0010*J\u001f\u0010:\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u00109\u001a\u000208H\u0017¢\u0006\u0004\b:\u0010;J\u001f\u0010>\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010=\u001a\u00020<H\u0017¢\u0006\u0004\b>\u0010?J\u001f\u0010A\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010@\u001a\u000200H\u0017¢\u0006\u0004\bA\u00103J\u001f\u0010C\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010B\u001a\u000200H\u0017¢\u0006\u0004\bC\u00103J!\u0010E\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010D\u001a\u0004\u0018\u00010\nH\u0017¢\u0006\u0004\bE\u0010*J\u001f\u0010G\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010F\u001a\u000200H\u0017¢\u0006\u0004\bG\u00103J\u001f\u0010I\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010H\u001a\u000200H\u0017¢\u0006\u0004\bI\u00103J\u001f\u0010K\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010J\u001a\u000200H\u0017¢\u0006\u0004\bK\u00103J!\u0010M\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010L\u001a\u0004\u0018\u00010\u001cH\u0017¢\u0006\u0004\bM\u0010NJ!\u0010P\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010O\u001a\u0004\u0018\u00010\u001cH\u0017¢\u0006\u0004\bP\u0010NJ#\u0010R\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u00022\b\u0010Q\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\bR\u0010NJ!\u0010T\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010Q\u001a\u0004\u0018\u00010SH\u0016¢\u0006\u0004\bT\u0010UJ\u0017\u0010W\u001a\u00020V2\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\bW\u0010XR \u0010Z\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020V0Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]¨\u0006^"}, d2 = {"Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Ll4/h;", "Lcom/facebook/react/viewmanagers/LottieAnimationViewManagerInterface;", "<init>", "()V", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "getDelegate", "()Lcom/facebook/react/uimanager/ViewManagerDelegate;", "", "", "", "getExportedViewConstants", "()Ljava/util/Map;", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/ThemedReactContext;", "context", "createViewInstance", "(Lcom/facebook/react/uimanager/ThemedReactContext;)Ll4/h;", "", "getExportedCustomDirectEventTypeConstants", "view", "", "onAfterUpdateTransaction", "(Ll4/h;)V", "root", "commandId", "Lcom/facebook/react/bridge/ReadableArray;", "args", "receiveCommand", "(Ll4/h;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V", "", "startFrame", "endFrame", "play", "(Ll4/h;II)V", "reset", "pause", "resume", StackTraceHelper.NAME_KEY, "setSourceName", "(Ll4/h;Ljava/lang/String;)V", "json", "setSourceJson", "urlString", "setSourceURL", "setSourceDotLottieURI", "", "cacheComposition", "setCacheComposition", "(Ll4/h;Z)V", ViewProps.RESIZE_MODE, "setResizeMode", "renderMode", "setRenderMode", "", ReactProgressBarViewManager.PROP_PROGRESS, "setProgress", "(Ll4/h;F)V", "", "speed", "setSpeed", "(Ll4/h;D)V", "loop", "setLoop", "autoPlay", "setAutoPlay", "imageAssetsFolder", "setImageAssetsFolder", "enableMergePaths", "setEnableMergePathsAndroidForKitKatAndAbove", "enableSafeMode", "setEnableSafeModeAndroid", "hardwareAccelerationAndroid", "setHardwareAccelerationAndroid", "colorFilters", "setColorFilters", "(Ll4/h;Lcom/facebook/react/bridge/ReadableArray;)V", "textFilters", "setTextFiltersAndroid", "value", "setTextFiltersIOS", "Lcom/facebook/react/bridge/ReadableMap;", "setDummy", "(Ll4/h;Lcom/facebook/react/bridge/ReadableMap;)V", "Lk4/i;", "getOrCreatePropertyManager", "(Ll4/h;)Lk4/i;", "Ljava/util/WeakHashMap;", "propManagersMap", "Ljava/util/WeakHashMap;", "delegate", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "lottie-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LottieAnimationViewManager extends SimpleViewManager<h> implements LottieAnimationViewManagerInterface<h> {

    @NotNull
    private final WeakHashMap<h, i> propManagersMap = new WeakHashMap<>();

    @NotNull
    private final ViewManagerDelegate<h> delegate = new LottieAnimationViewManagerDelegate(this);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createViewInstance$lambda$0(h view, Throwable error) {
        Intrinsics.checkNotNull(error);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(error, "error");
        Context context = view.getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        ThemedReactContext themedReactContext = (ThemedReactContext) context;
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(themedReactContext, view.getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new e(themedReactContext.getSurfaceId(), view.getId(), error));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createViewInstance$lambda$1(h view, l4.i iVar) {
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        ThemedReactContext themedReactContext = (ThemedReactContext) context;
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(themedReactContext, view.getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new k(themedReactContext.getSurfaceId(), view.getId(), 0));
        }
    }

    private final i getOrCreatePropertyManager(h view) {
        i iVar = this.propManagersMap.get(view);
        if (iVar != null) {
            return iVar;
        }
        i iVar2 = new i(view);
        this.propManagersMap.put(view, iVar2);
        return iVar2;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public h createViewInstance(@NotNull ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        final h hVar = new h(context);
        hVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        hVar.setFailureListener(new y() { // from class: k4.a
            @Override // l4.y
            public final void onResult(Object obj) {
                LottieAnimationViewManager.createViewInstance$lambda$0(hVar, (Throwable) obj);
            }
        });
        b bVar = new b(hVar);
        l4.i composition = hVar.getComposition();
        if (composition != null) {
            createViewInstance$lambda$1(hVar, composition);
        }
        hVar.I.add(bVar);
        hVar.f14857w.f14919e.addListener(new c(hVar));
        return hVar;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ViewManagerDelegate<h> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return MapBuilder.of("topAnimationFinish", MapBuilder.of("registrationName", "onAnimationFinish"), "topAnimationFailure", MapBuilder.of("registrationName", "onAnimationFailure"), "topAnimationLoaded", MapBuilder.of("registrationName", "onAnimationLoaded"));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public Map<String, Object> getExportedViewConstants() {
        return MapBuilder.builder().put("VERSION", 1).build();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "LottieAnimationView";
    }

    @Override // com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface
    public void pause(@NotNull h view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        new Handler(Looper.getMainLooper()).post(new d(view, 2));
    }

    @Override // com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface
    public void play(@NotNull final h view, final int startFrame, final int endFrame) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        final boolean z5 = (startFrame == -1 || endFrame == -1) ? false : true;
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: k4.e
            @Override // java.lang.Runnable
            public final void run() {
                boolean z6 = z5;
                l4.h hVar = view;
                if (z6) {
                    int i7 = startFrame;
                    int i10 = endFrame;
                    if (i7 > i10) {
                        hVar.f14857w.r(i10, i7);
                        if (hVar.getSpeed() > 0.0f) {
                            x4.e eVar = hVar.f14857w.f14919e;
                            eVar.f22630v = -eVar.f22630v;
                        }
                    } else {
                        hVar.f14857w.r(i7, i10);
                        if (hVar.getSpeed() < 0.0f) {
                            x4.e eVar2 = hVar.f14857w.f14919e;
                            eVar2.f22630v = -eVar2.f22630v;
                        }
                    }
                } else {
                    l4.i composition = hVar.getComposition();
                    Integer numValueOf = composition != null ? Integer.valueOf((int) composition.f14872l) : null;
                    l4.i composition2 = hVar.getComposition();
                    Integer numValueOf2 = composition2 != null ? Integer.valueOf((int) composition2.f14873m) : null;
                    int minFrame = (int) hVar.getMinFrame();
                    int maxFrame = (int) hVar.getMaxFrame();
                    if (numValueOf != null && numValueOf2 != null && (minFrame != numValueOf.intValue() || maxFrame != numValueOf2.intValue())) {
                        hVar.f14857w.r(numValueOf.intValue(), numValueOf2.intValue());
                    }
                }
                WeakHashMap weakHashMap = u0.f1729a;
                if (!hVar.isAttachedToWindow()) {
                    hVar.addOnAttachStateChangeListener(new f(hVar, z6));
                } else if (z6) {
                    hVar.playAnimation();
                } else {
                    hVar.H.add(l4.f.f14845x);
                    hVar.f14857w.n();
                }
            }
        });
    }

    @Override // com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface
    public void reset(@NotNull h view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        new Handler(Looper.getMainLooper()).post(new d(view, 0));
    }

    @Override // com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface
    public void resume(@NotNull h view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        new Handler(Looper.getMainLooper()).post(new d(view, 1));
    }

    @Override // com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface
    @ReactProp(name = "cacheComposition")
    public void setCacheComposition(@NotNull h view, boolean cacheComposition) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        view.setCacheComposition(cacheComposition);
    }

    @Override // com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface
    public void setDummy(@NotNull h view, ReadableMap value) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(@NotNull h view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onAfterUpdateTransaction(view);
        getOrCreatePropertyManager(view).a();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(@NotNull h root, @NotNull String commandId, ReadableArray args) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(commandId, "commandId");
        this.delegate.kotlinCompat$receiveCommandNullableArgs(root, commandId, args);
    }

    @Override // com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface
    @ReactProp(name = "autoPlay")
    public void setAutoPlay(@NotNull h view, boolean autoPlay) {
        Intrinsics.checkNotNullParameter(view, "view");
        i viewManager = getOrCreatePropertyManager(view);
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.f14304q = Boolean.valueOf(autoPlay);
    }

    @Override // com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface
    @ReactProp(name = "colorFilters")
    public void setColorFilters(@NotNull h view, ReadableArray colorFilters) {
        Intrinsics.checkNotNullParameter(view, "view");
        i viewManager = getOrCreatePropertyManager(view);
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.f14297h = colorFilters;
    }

    @Override // com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface
    @ReactProp(name = "enableMergePathsAndroidForKitKatAndAbove")
    public void setEnableMergePathsAndroidForKitKatAndAbove(@NotNull h view, boolean enableMergePaths) {
        Intrinsics.checkNotNullParameter(view, "view");
        i viewManager = getOrCreatePropertyManager(view);
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.f14295f = Boolean.valueOf(enableMergePaths);
    }

    @Override // com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface
    @ReactProp(name = "enableSafeModeAndroid")
    public void setEnableSafeModeAndroid(@NotNull h view, boolean enableSafeMode) {
        Intrinsics.checkNotNullParameter(view, "view");
        i viewManager = getOrCreatePropertyManager(view);
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.f14296g = Boolean.valueOf(enableSafeMode);
    }

    @Override // com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface
    @ReactProp(name = "hardwareAccelerationAndroid")
    public void setHardwareAccelerationAndroid(@NotNull h view, boolean hardwareAccelerationAndroid) {
        Intrinsics.checkNotNullParameter(view, "view");
        i viewManager = getOrCreatePropertyManager(view);
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.k = hardwareAccelerationAndroid ? 2 : 1;
    }

    @Override // com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface
    @ReactProp(name = "imageAssetsFolder")
    public void setImageAssetsFolder(@NotNull h view, String imageAssetsFolder) {
        Intrinsics.checkNotNullParameter(view, "view");
        i viewManager = getOrCreatePropertyManager(view);
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.f14294e = imageAssetsFolder;
    }

    @Override // com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface
    @ReactProp(name = "loop")
    public void setLoop(@NotNull h view, boolean loop) {
        Intrinsics.checkNotNullParameter(view, "view");
        i viewManager = getOrCreatePropertyManager(view);
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.f14303p = Boolean.valueOf(loop);
    }

    @Override // com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface
    @ReactProp(name = ReactProgressBarViewManager.PROP_PROGRESS)
    public void setProgress(@NotNull h view, float progress) {
        Intrinsics.checkNotNullParameter(view, "view");
        i viewManager = getOrCreatePropertyManager(view);
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.f14302o = Float.valueOf(progress);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    @Override // com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface
    @ReactProp(name = "renderMode")
    public void setRenderMode(@NotNull h view, String renderMode) {
        f0 f0Var;
        Intrinsics.checkNotNullParameter(view, "view");
        i viewManager = getOrCreatePropertyManager(view);
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        if (renderMode == null) {
            f0Var = null;
        } else {
            int iHashCode = renderMode.hashCode();
            if (iHashCode != 165298699) {
                if (iHashCode != 899536360) {
                    if (iHashCode == 2101957031 && renderMode.equals("SOFTWARE")) {
                        f0Var = f0.f14849i;
                    } else {
                        f0Var = null;
                    }
                } else if (renderMode.equals("HARDWARE")) {
                    f0Var = f0.f14848e;
                } else {
                    f0Var = null;
                }
            } else if (renderMode.equals("AUTOMATIC")) {
                f0Var = f0.f14847d;
            } else {
                f0Var = null;
            }
        }
        viewManager.j = f0Var;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    @Override // com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface
    @ReactProp(name = ViewProps.RESIZE_MODE)
    public void setResizeMode(@NotNull h view, String resizeMode) {
        ImageView.ScaleType scaleType;
        Intrinsics.checkNotNullParameter(view, "view");
        i viewManager = getOrCreatePropertyManager(view);
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        if (resizeMode == null) {
            scaleType = null;
        } else {
            int iHashCode = resizeMode.hashCode();
            if (iHashCode != -1364013995) {
                if (iHashCode != 94852023) {
                    if (iHashCode == 951526612 && resizeMode.equals("contain")) {
                        scaleType = ImageView.ScaleType.FIT_CENTER;
                    } else {
                        scaleType = null;
                    }
                } else if (resizeMode.equals("cover")) {
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                } else {
                    scaleType = null;
                }
            } else if (resizeMode.equals("center")) {
                scaleType = ImageView.ScaleType.CENTER_INSIDE;
            } else {
                scaleType = null;
            }
        }
        viewManager.f14293d = scaleType;
    }

    @Override // com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface
    @ReactProp(name = "sourceDotLottieURI")
    public void setSourceDotLottieURI(@NotNull h view, String urlString) {
        Intrinsics.checkNotNullParameter(view, "view");
        i viewManager = getOrCreatePropertyManager(view);
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.f14301n = urlString;
        viewManager.a();
    }

    @Override // com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface
    @ReactProp(name = "sourceJson")
    public void setSourceJson(@NotNull h view, String json) {
        Intrinsics.checkNotNullParameter(view, "view");
        i viewManager = getOrCreatePropertyManager(view);
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.f14299l = json;
        viewManager.a();
    }

    @Override // com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface
    @ReactProp(name = "sourceName")
    public void setSourceName(@NotNull h view, String name) {
        Intrinsics.checkNotNullParameter(view, "view");
        i viewManager = getOrCreatePropertyManager(view);
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        if (name != null && !StringsKt.D(name, ".", false)) {
            name = name.concat(".json");
        }
        viewManager.f14292c = name;
        viewManager.f14291b = true;
        viewManager.a();
    }

    @Override // com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface
    @ReactProp(name = "sourceURL")
    public void setSourceURL(@NotNull h view, String urlString) {
        Intrinsics.checkNotNullParameter(view, "view");
        i viewManager = getOrCreatePropertyManager(view);
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.f14300m = urlString;
        viewManager.a();
    }

    @Override // com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface
    @ReactProp(name = "speed")
    public void setSpeed(@NotNull h view, double speed) {
        Intrinsics.checkNotNullParameter(view, "view");
        i viewManager = getOrCreatePropertyManager(view);
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.f14305r = Float.valueOf((float) speed);
    }

    @Override // com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface
    @ReactProp(name = "textFiltersAndroid")
    public void setTextFiltersAndroid(@NotNull h view, ReadableArray textFilters) {
        Intrinsics.checkNotNullParameter(view, "view");
        i viewManager = getOrCreatePropertyManager(view);
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.f14298i = textFilters;
    }

    @Override // com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface
    public void setTextFiltersIOS(h view, ReadableArray value) {
    }
}
