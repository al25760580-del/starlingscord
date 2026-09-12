package com.facebook.react.fabric.mounting;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.SystemClock;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.SparseArrayCompat;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.common.annotations.UnstableReactNativeAPI;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.common.mapbuffer.MapBuffer;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import com.facebook.react.fabric.mounting.mountitems.MountItem;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.touch.JSResponderHandler;
import com.facebook.react.uimanager.IViewGroupManager;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.ReactOverflowViewWithInset;
import com.facebook.react.uimanager.ReactRoot;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.RootView;
import com.facebook.react.uimanager.RootViewManager;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.ViewManagerRegistry;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import s.h;
import s.q;
import s0.g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u0000 ¦\u00012\u00020\u0001:\u0006¤\u0001¥\u0001¦\u0001B9\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u00103\u001a\u0002042\u0006\u00105\u001a\u00020%2\u0006\u00106\u001a\u00020\rH\u0007J\u000e\u00107\u001a\u00020\u00132\u0006\u00108\u001a\u00020\u0003J\u0015\u00109\u001a\u0002042\u0006\u0010:\u001a\u00020#H\u0001¢\u0006\u0002\b;J\b\u0010<\u001a\u000204H\u0003J\b\u0010=\u001a\u000204H\u0007J\u0018\u0010>\u001a\u0002042\u0006\u00108\u001a\u00020\u00032\u0006\u0010?\u001a\u00020\u0013H\u0007J \u0010@\u001a\u0002042\u0006\u0010A\u001a\u00020\u00032\u0006\u00108\u001a\u00020\u00032\u0006\u0010B\u001a\u00020\u0003H\u0007J \u0010C\u001a\u0002042\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020%2\u0006\u0010G\u001a\u00020\u0003H\u0003J\u0015\u0010H\u001a\u0002042\u0006\u0010I\u001a\u00020JH\u0000¢\u0006\u0002\bKJ \u0010L\u001a\u0002042\u0006\u00108\u001a\u00020\u00032\u0006\u0010A\u001a\u00020\u00032\u0006\u0010B\u001a\u00020\u0003H\u0007J(\u0010M\u001a\u0002042\u0006\u0010A\u001a\u00020\u00032\u0006\u0010D\u001a\u00020E2\u0006\u00108\u001a\u00020\u00032\u0006\u0010B\u001a\u00020\u0003H\u0003J\u0015\u0010N\u001a\u0002042\u0006\u0010I\u001a\u00020OH\u0000¢\u0006\u0002\bPJA\u0010Q\u001a\u0002042\u0006\u0010R\u001a\u0002022\u0006\u0010S\u001a\u00020\u00032\u0006\u0010T\u001a\u00020U2\b\u0010V\u001a\u0004\u0018\u00010W2\b\u0010X\u001a\u0004\u0018\u00010Y2\u0006\u0010Z\u001a\u00020\u0013H\u0001¢\u0006\u0002\b[J<\u0010\\\u001a\u0002042\u0006\u0010R\u001a\u0002022\u0006\u0010S\u001a\u00020\u00032\u0006\u0010T\u001a\u00020U2\b\u0010V\u001a\u0004\u0018\u00010W2\b\u0010X\u001a\u0004\u0018\u00010Y2\u0006\u0010Z\u001a\u00020\u0013H\u0003J\u0016\u0010]\u001a\u0002042\u0006\u0010S\u001a\u00020\u00032\u0006\u0010T\u001a\u00020UJ\u0016\u0010^\u001a\u0002042\u0006\u0010S\u001a\u00020\u00032\u0006\u0010T\u001a\u00020UJ\u0016\u0010_\u001a\u0002042\u0006\u0010S\u001a\u00020\u00032\u0006\u0010T\u001a\u00020UJ \u0010_\u001a\u0002042\u0006\u0010S\u001a\u00020\u00032\u0006\u0010T\u001a\u00020U2\u0006\u0010`\u001a\u00020\u0013H\u0003J\"\u0010a\u001a\u0002042\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010R\u001a\u0002022\b\u0010b\u001a\u0004\u0018\u00010cH\u0007J\"\u0010d\u001a\u0002042\u0006\u0010S\u001a\u00020\u00032\u0006\u0010e\u001a\u00020\u00032\b\u0010f\u001a\u0004\u0018\u00010gH\u0007J \u0010d\u001a\u0002042\u0006\u0010S\u001a\u00020\u00032\u0006\u0010e\u001a\u0002022\b\u0010f\u001a\u0004\u0018\u00010gJ\u0016\u0010h\u001a\u0002042\u0006\u0010S\u001a\u00020\u00032\u0006\u0010i\u001a\u00020\u0003JH\u0010j\u001a\u0002042\u0006\u0010S\u001a\u00020\u00032\u0006\u0010A\u001a\u00020\u00032\u0006\u0010k\u001a\u00020\u00032\u0006\u0010l\u001a\u00020\u00032\u0006\u0010m\u001a\u00020\u00032\u0006\u0010n\u001a\u00020\u00032\u0006\u0010o\u001a\u00020\u00032\u0006\u0010p\u001a\u00020\u0003H\u0007J0\u0010q\u001a\u0002042\u0006\u0010S\u001a\u00020\u00032\u0006\u0010r\u001a\u00020\u00032\u0006\u0010s\u001a\u00020\u00032\u0006\u0010t\u001a\u00020\u00032\u0006\u0010u\u001a\u00020\u0003H\u0007J0\u0010v\u001a\u0002042\u0006\u0010S\u001a\u00020\u00032\u0006\u0010w\u001a\u00020\u00032\u0006\u0010x\u001a\u00020\u00032\u0006\u0010y\u001a\u00020\u00032\u0006\u0010z\u001a\u00020\u0003H\u0007J\u001a\u0010{\u001a\u0002042\u0006\u0010S\u001a\u00020\u00032\b\u0010V\u001a\u0004\u0018\u00010WH\u0007J\u001d\u0010|\u001a\u0002042\u0006\u0010S\u001a\u00020\u00032\u0006\u0010}\u001a\u00020YH\u0001¢\u0006\u0002\b~J\"\u0010\u007f\u001a\u0002042\u0006\u0010S\u001a\u00020\u00032\u0007\u0010\u0080\u0001\u001a\u00020\u00032\u0007\u0010\u0081\u0001\u001a\u00020\u0013H\u0007J\u0012\u0010\u0082\u0001\u001a\u0002042\u0007\u0010\u0083\u0001\u001a\u00020\u001cH\u0003J\u0011\u0010\u0084\u0001\u001a\u0002042\u0006\u0010S\u001a\u00020\u0003H\u0007J\u0011\u0010\u0085\u0001\u001a\u0002042\u0006\u0010S\u001a\u00020\u0003H\u0003J\u0018\u0010\u0086\u0001\u001a\u0002042\u0007\u0010I\u001a\u00030\u0087\u0001H\u0000¢\u0006\u0003\b\u0088\u0001J3\u0010\u0089\u0001\u001a\u0002042\u0006\u0010R\u001a\u0002022\u0006\u0010S\u001a\u00020\u00032\u0006\u0010T\u001a\u00020U2\b\u0010V\u001a\u0004\u0018\u00010W2\u0006\u0010Z\u001a\u00020\u0013H\u0007J\u0019\u0010\u008a\u0001\u001a\u0004\u0018\u00010Y2\u0006\u0010S\u001a\u00020\u0003H\u0001¢\u0006\u0003\b\u008b\u0001J\u0011\u0010\u008c\u0001\u001a\u00020%2\u0006\u0010S\u001a\u00020\u0003H\u0007J\u0011\u0010\u008d\u0001\u001a\u00020\u001c2\u0006\u0010S\u001a\u00020\u0003H\u0002J\u0013\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u001c2\u0006\u0010S\u001a\u00020\u0003H\u0002J\u0013\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u001c2\u0006\u00108\u001a\u00020\u0003H\u0002J\u001a\u0010\u0090\u0001\u001a\u0002042\u0006\u00108\u001a\u00020\u00032\u0007\u0010\u0091\u0001\u001a\u00020\u001cH\u0002J\u0011\u0010\u0092\u0001\u001a\u0002042\u0006\u00108\u001a\u00020\u0003H\u0002J\u0011\u0010\u0093\u0001\u001a\u00020\u00132\u0006\u00108\u001a\u00020\u0003H\u0002J \u0010\u0094\u0001\u001a\u0002042\u0014\u0010\u0095\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u0002040\u0096\u0001H\u0082\bJ\u001b\u0010\u0097\u0001\u001a\u0002042\u0006\u00108\u001a\u00020\u00032\b\u0010\u0098\u0001\u001a\u00030\u0099\u0001H\u0007J\u0007\u0010\u009a\u0001\u001a\u000204J7\u0010\u009b\u0001\u001a\u0002042\u0006\u0010S\u001a\u00020\u00032\u0007\u0010\u009c\u0001\u001a\u0002022\u0007\u0010\u009d\u0001\u001a\u00020\u00132\t\u0010b\u001a\u0005\u0018\u00010\u009e\u00012\u0007\u0010\u009f\u0001\u001a\u00020\u0003H\u0007JA\u0010\u009b\u0001\u001a\u0002042\u0006\u0010S\u001a\u00020\u00032\u0007\u0010\u009c\u0001\u001a\u0002022\u0007\u0010\u009d\u0001\u001a\u00020\u00132\t\u0010b\u001a\u0005\u0018\u00010\u009e\u00012\u0007\u0010\u009f\u0001\u001a\u00020\u00032\b\u0010 \u0001\u001a\u00030¡\u0001H\u0007J\u000f\u0010¢\u0001\u001a\u0002042\u0006\u0010S\u001a\u00020\u0003J\u000f\u0010£\u0001\u001a\u0002042\u0006\u0010S\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0013@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0013@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\"\u0010\u0017\u001a\u0004\u0018\u00010\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\r@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0002\b\u0003\u0018\u00010$X\u0082\u000e¢\u0006\b\n\u0000\u0012\u0004\b&\u0010'R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00030)8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u00020+8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00030)8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00030)8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0016\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010/X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u00100\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u0001010/8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000¨\u0006§\u0001"}, d2 = {"Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;", "", "surfaceId", "", "jsResponderHandler", "Lcom/facebook/react/touch/JSResponderHandler;", "viewManagerRegistry", "Lcom/facebook/react/uimanager/ViewManagerRegistry;", "rootViewManager", "Lcom/facebook/react/uimanager/RootViewManager;", "mountItemExecutor", "Lcom/facebook/react/fabric/mounting/MountingManager$MountItemExecutor;", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "<init>", "(ILcom/facebook/react/touch/JSResponderHandler;Lcom/facebook/react/uimanager/ViewManagerRegistry;Lcom/facebook/react/uimanager/RootViewManager;Lcom/facebook/react/fabric/mounting/MountingManager$MountItemExecutor;Lcom/facebook/react/uimanager/ThemedReactContext;)V", "getSurfaceId", "()I", "value", "", "isStopped", "()Z", "isRootViewAttached", "context", "getContext", "()Lcom/facebook/react/uimanager/ThemedReactContext;", "tagToViewState", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/facebook/react/fabric/mounting/SurfaceMountingManager$ViewState;", "optimizedTagToViewState", "Landroidx/collection/MutableIntObjectMap;", "registryLock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "onViewAttachMountItems", "Ljava/util/Queue;", "Lcom/facebook/react/fabric/mounting/mountitems/MountItem;", "Lcom/facebook/react/uimanager/ViewManager;", "Landroid/view/View;", "getRootViewManager$annotations", "()V", "erroneouslyReaddedReactTags", "", "viewTransitionCoordinator", "Lcom/facebook/react/fabric/mounting/ViewTransitionCoordinator;", "viewsWithActiveTouches", "viewsToDeleteAfterTouchFinishes", "tagSetForStoppedSurface", "Landroidx/collection/SparseArrayCompat;", "tagToSynchronousMountProps", "", "", "attachRootView", "", "rootView", "themedReactContext", "getViewExists", "tag", "scheduleMountItemOnViewAttach", "item", "scheduleMountItemOnViewAttach$ReactAndroid_release", "executeMountItemsOnViewAttach", "stopSurface", "markViewInTransition", "isTransitioning", "addViewAt", "parentTag", "index", "addViewAtInternal", "parentView", "Landroid/view/ViewGroup;", "child", "atIndex", "executeAddViewOperation", "operation", "Lcom/facebook/react/fabric/mounting/AddViewOperation;", "executeAddViewOperation$ReactAndroid_release", "removeViewAt", "removeViewAtInternal", "executeRemoveViewOperation", "Lcom/facebook/react/fabric/mounting/RemoveViewOperation;", "executeRemoveViewOperation$ReactAndroid_release", "createView", "componentName", "reactTag", "props", "Lcom/facebook/react/bridge/ReadableMap;", "stateWrapper", "Lcom/facebook/react/uimanager/StateWrapper;", "eventEmitterWrapper", "Lcom/facebook/react/fabric/events/EventEmitterWrapper;", "isLayoutable", "createView$ReactAndroid_release", "createViewUnsafe", "storeSynchronousMountPropsOverride", "updatePropsSynchronously", "updateProps", "shouldSkipSynchronousMountPropsOverride", "experimental_prefetchResources", "params", "Lcom/facebook/react/common/mapbuffer/MapBuffer;", "receiveCommand", "commandId", "commandArgs", "Lcom/facebook/react/bridge/ReadableArray;", "sendAccessibilityEvent", "eventType", "updateLayout", "x", "y", "width", "height", "displayType", ViewProps.LAYOUT_DIRECTION, "updatePadding", ViewProps.LEFT, ViewProps.TOP, ViewProps.RIGHT, ViewProps.BOTTOM, "updateOverflowInset", "overflowInsetLeft", "overflowInsetTop", "overflowInsetRight", "overflowInsetBottom", "updateState", "updateEventEmitter", "eventEmitter", "updateEventEmitter$ReactAndroid_release", "setJSResponder", "initialReactTag", "blockNativeResponder", "onViewStateDeleted", "viewState", "deleteView", "deleteViewInternal", "executeDeleteViewOperation", "Lcom/facebook/react/fabric/mounting/DeleteViewOperation;", "executeDeleteViewOperation$ReactAndroid_release", "preallocateView", "getEventEmitter", "getEventEmitter$ReactAndroid_release", "getView", "getViewState", "getNullableViewState", "registryGet", "registryPut", "state", "registryRemove", "registryContains", "registryForEachValue", "action", "Lkotlin/Function1;", "applyViewSnapshot", "bitmap", "Landroid/graphics/Bitmap;", "printSurfaceState", "enqueuePendingEvent", "eventName", "canCoalesceEvent", "Lcom/facebook/react/bridge/WritableMap;", "eventCategory", "eventTimestamp", "", "markActiveTouchForTag", "sweepActiveTouchForTag", "ViewState", "PendingViewEvent", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSurfaceMountingManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SurfaceMountingManager.kt\ncom/facebook/react/fabric/mounting/SurfaceMountingManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 IntObjectMap.kt\nandroidx/collection/IntObjectMap\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 IntObjectMap.kt\nandroidx/collection/MutableIntObjectMap\n+ 7 BitmapDrawable.kt\nandroidx/core/graphics/drawable/BitmapDrawableKt\n*L\n1#1,1529:1\n1271#1,2:1530\n1274#1:1558\n1276#1:1561\n1271#1,2:1594\n1274#1:1622\n1276#1:1625\n1#2:1532\n1#2:1562\n1#2:1564\n1#2:1565\n1#2:1596\n1#2:1626\n408#3,3:1533\n354#3,6:1536\n364#3,3:1543\n367#3,2:1547\n412#3,2:1549\n370#3,6:1551\n414#3:1557\n408#3,3:1566\n354#3,6:1569\n364#3,3:1576\n367#3,2:1580\n412#3,2:1582\n370#3,6:1584\n414#3:1590\n408#3,3:1597\n354#3,6:1600\n364#3,3:1607\n367#3,2:1611\n412#3,2:1613\n370#3,6:1615\n414#3:1621\n382#3,4:1627\n354#3,6:1631\n364#3,3:1638\n367#3,2:1642\n387#3,2:1644\n370#3,6:1646\n389#3:1652\n1826#4:1542\n1688#4:1546\n1826#4:1575\n1688#4:1579\n1826#4:1606\n1688#4:1610\n1826#4:1637\n1688#4:1641\n1869#5,2:1559\n1869#5,2:1591\n1869#5,2:1623\n728#6:1563\n28#7:1593\n*S KotlinDebug\n*F\n+ 1 SurfaceMountingManager.kt\ncom/facebook/react/fabric/mounting/SurfaceMountingManager\n*L\n262#1:1530,2\n262#1:1558\n262#1:1561\n1287#1:1594,2\n1287#1:1622\n1287#1:1625\n262#1:1532\n1047#1:1564\n1287#1:1596\n262#1:1533,3\n262#1:1536,6\n262#1:1543,3\n262#1:1547,2\n262#1:1549,2\n262#1:1551,6\n262#1:1557\n1272#1:1566,3\n1272#1:1569,6\n1272#1:1576,3\n1272#1:1580,2\n1272#1:1582,2\n1272#1:1584,6\n1272#1:1590\n1287#1:1597,3\n1287#1:1600,6\n1287#1:1607,3\n1287#1:1611,2\n1287#1:1613,2\n1287#1:1615,6\n1287#1:1621\n281#1:1627,4\n281#1:1631,6\n281#1:1638,3\n281#1:1642,2\n281#1:1644,2\n281#1:1646,6\n281#1:1652\n262#1:1542\n262#1:1546\n1272#1:1575\n1272#1:1579\n1287#1:1606\n1287#1:1610\n281#1:1637\n281#1:1641\n262#1:1559,2\n1274#1:1591,2\n1287#1:1623,2\n1047#1:1563\n1282#1:1593\n*E\n"})
public final class SurfaceMountingManager {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final String PROP_OPACITY = "opacity";

    @NotNull
    private static final String PROP_TRANSFORM = "transform";
    private static final boolean SHOW_CHANGED_VIEW_HIERARCHIES;

    @NotNull
    private static final String TAG;
    private ThemedReactContext context;

    @NotNull
    private final Set<Integer> erroneouslyReaddedReactTags;
    private volatile boolean isRootViewAttached;
    private volatile boolean isStopped;
    private JSResponderHandler jsResponderHandler;
    private MountingManager.MountItemExecutor mountItemExecutor;

    @NotNull
    private final Queue<MountItem> onViewAttachMountItems;
    private final MutableIntObjectMap optimizedTagToViewState;

    @NotNull
    private final ReentrantReadWriteLock registryLock;
    private ViewManager<View, ?> rootViewManager;
    private final int surfaceId;
    private SparseArrayCompat tagSetForStoppedSurface;

    @NotNull
    private final SparseArrayCompat tagToSynchronousMountProps;
    private final ConcurrentHashMap<Integer, ViewState> tagToViewState;
    private final ViewManagerRegistry viewManagerRegistry;

    @NotNull
    private final ViewTransitionCoordinator viewTransitionCoordinator;

    @NotNull
    private final Set<Integer> viewsToDeleteAfterTouchFinishes;

    @NotNull
    private final Set<Integer> viewsWithActiveTouches;

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0007H\u0002J$\u0010\u000f\u001a\u00020\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u001c\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J$\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00172\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0015H\u0002J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/facebook/react/fabric/mounting/SurfaceMountingManager$Companion;", "", "<init>", "()V", "TAG", "", "SHOW_CHANGED_VIEW_HIERARCHIES", "", "PROP_TRANSFORM", "PROP_OPACITY", "logViewHierarchy", "", "parent", "Landroid/view/ViewGroup;", "recurse", "overridePropsReadableMap", "patchMap", "", "outputReadableMap", "Lcom/facebook/react/bridge/WritableMap;", "getAnimatedPropsMap", "", "readableMap", "Lcom/facebook/react/bridge/ReadableMap;", "clearAnimatedNullPropsMapKeys", "outputMap", "getViewGroupManager", "Lcom/facebook/react/uimanager/IViewGroupManager;", "Landroid/view/View;", "viewState", "Lcom/facebook/react/fabric/mounting/SurfaceMountingManager$ViewState;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSurfaceMountingManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SurfaceMountingManager.kt\ncom/facebook/react/fabric/mounting/SurfaceMountingManager$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1529:1\n1#2:1530\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void clearAnimatedNullPropsMapKeys(ReadableMap readableMap, Map<String, Object> outputMap) {
            if (readableMap.hasKey("transform") && readableMap.getType("transform") == ReadableType.Null) {
                outputMap.remove("transform");
            }
            if (readableMap.hasKey("opacity") && readableMap.getType("opacity") == ReadableType.Null) {
                outputMap.remove("opacity");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Map<String, Object> getAnimatedPropsMap(ReadableMap readableMap) {
            ReadableArray array;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (readableMap.hasKey("transform") && readableMap.getType("transform") == ReadableType.Array && (array = readableMap.getArray("transform")) != null) {
                ArrayList arrayList = new ArrayList(array.size());
                int size = array.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ReadableMap map = array.getMap(i7);
                    if (map != null) {
                        arrayList.add(map.toHashMap());
                    }
                }
                linkedHashMap.put("transform", arrayList);
            }
            if (readableMap.hasKey("opacity") && readableMap.getType("opacity") == ReadableType.Number) {
                linkedHashMap.put("opacity", Double.valueOf(readableMap.getDouble("opacity")));
            }
            return linkedHashMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final IViewGroupManager<View> getViewGroupManager(ViewState viewState) {
            NativeModule viewManager = viewState.getViewManager();
            if (viewManager != null) {
                Intrinsics.checkNotNull(viewManager, "null cannot be cast to non-null type com.facebook.react.uimanager.IViewGroupManager<android.view.View>");
                return (IViewGroupManager) viewManager;
            }
            throw new IllegalStateException(("Unable to find ViewManager for view: " + viewState).toString());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void logViewHierarchy(ViewGroup parent, boolean recurse) {
            int id2 = parent.getId();
            o8.a.g(SurfaceMountingManager.TAG, "  <ViewGroup tag=" + id2 + " class=" + parent.getClass() + ">");
            int childCount = parent.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                String str = SurfaceMountingManager.TAG;
                int id3 = parent.getChildAt(i7).getId();
                Class<?> cls = parent.getChildAt(i7).getClass();
                StringBuilder sbR = a3.e.r(i7, "     <View idx=", id3, " tag=", " class=");
                sbR.append(cls);
                sbR.append(">");
                o8.a.g(str, sbR.toString());
            }
            o8.a.g(SurfaceMountingManager.TAG, "  </ViewGroup tag=" + id2 + ">");
            if (recurse) {
                o8.a.g(SurfaceMountingManager.TAG, "Displaying Ancestors:");
                for (ViewParent parent2 = parent.getParent(); parent2 != null; parent2 = parent2.getParent()) {
                    ViewGroup viewGroup = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
                    int id4 = viewGroup != null ? viewGroup.getId() : -1;
                    o8.a.g(SurfaceMountingManager.TAG, "<ViewParent tag=" + id4 + " class=" + parent2.getClass() + ">");
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void overridePropsReadableMap(Map<String, ? extends Object> patchMap, WritableMap outputReadableMap) {
            for (Map.Entry<String, ? extends Object> entry : patchMap.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (outputReadableMap.hasKey(key)) {
                    if (Intrinsics.areEqual(key, "transform")) {
                        ReadableType type = outputReadableMap.getType(key);
                        if (type == ReadableType.Array || type == ReadableType.Null) {
                            boolean z5 = value instanceof List;
                        }
                        WritableNativeArray writableNativeArray = new WritableNativeArray();
                        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.collections.List<*>");
                        for (Object obj : (List) value) {
                            if (obj instanceof Map) {
                                WritableNativeMap writableNativeMap = new WritableNativeMap();
                                for (Map.Entry entry2 : ((Map) obj).entrySet()) {
                                    String str = (String) entry2.getKey();
                                    Object value2 = entry2.getValue();
                                    if (value2 instanceof String) {
                                        writableNativeMap.putString(str, (String) value2);
                                    } else if (value2 instanceof Number) {
                                        writableNativeMap.putDouble(str, ((Number) value2).doubleValue());
                                    }
                                }
                                writableNativeArray.pushMap(writableNativeMap);
                            }
                        }
                        outputReadableMap.putArray(key, writableNativeArray);
                    } else if (Intrinsics.areEqual(key, "opacity")) {
                        ReadableType type2 = outputReadableMap.getType(key);
                        if (type2 == ReadableType.Number || type2 == ReadableType.Null) {
                            boolean z6 = value instanceof Number;
                        }
                        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Number");
                        outputReadableMap.putDouble(key, ((Number) value).doubleValue());
                    }
                }
            }
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/facebook/react/fabric/mounting/SurfaceMountingManager$PendingViewEvent;", "", "eventName", "", "params", "Lcom/facebook/react/bridge/WritableMap;", "eventCategory", "", "canCoalesceEvent", "", "eventTimestamp", "", "<init>", "(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;IZJ)V", "dispatch", "", "eventEmitter", "Lcom/facebook/react/fabric/events/EventEmitterWrapper;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PendingViewEvent {
        private final boolean canCoalesceEvent;
        private final int eventCategory;

        @NotNull
        private final String eventName;
        private final long eventTimestamp;
        private final WritableMap params;

        public PendingViewEvent(@NotNull String eventName, WritableMap writableMap, int i7, boolean z5, long j) {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            this.eventName = eventName;
            this.params = writableMap;
            this.eventCategory = i7;
            this.canCoalesceEvent = z5;
            this.eventTimestamp = j;
        }

        public final void dispatch(@NotNull EventEmitterWrapper eventEmitter) {
            Intrinsics.checkNotNullParameter(eventEmitter, "eventEmitter");
            if (this.canCoalesceEvent) {
                eventEmitter.dispatchUnique(this.eventName, this.params, this.eventTimestamp);
            } else {
                eventEmitter.dispatch(this.eventName, this.params, this.eventCategory, this.eventTimestamp);
            }
        }
    }

    static {
        Intrinsics.checkNotNullExpressionValue("SurfaceMountingManager", "getSimpleName(...)");
        TAG = "SurfaceMountingManager";
        ReactBuildConfig reactBuildConfig = ReactBuildConfig.INSTANCE;
        SHOW_CHANGED_VIEW_HIERARCHIES = false;
    }

    public SurfaceMountingManager(int i7, @NotNull JSResponderHandler jsResponderHandler, @NotNull ViewManagerRegistry viewManagerRegistry, @NotNull RootViewManager rootViewManager, @NotNull MountingManager.MountItemExecutor mountItemExecutor, @NotNull ThemedReactContext reactContext) {
        Intrinsics.checkNotNullParameter(jsResponderHandler, "jsResponderHandler");
        Intrinsics.checkNotNullParameter(viewManagerRegistry, "viewManagerRegistry");
        Intrinsics.checkNotNullParameter(rootViewManager, "rootViewManager");
        Intrinsics.checkNotNullParameter(mountItemExecutor, "mountItemExecutor");
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.surfaceId = i7;
        this.context = reactContext;
        this.registryLock = new ReentrantReadWriteLock();
        if (ReactNativeFeatureFlags.useOptimizedViewRegistryOnAndroid()) {
            this.tagToViewState = null;
            MutableIntObjectMap mutableIntObjectMap = new MutableIntObjectMap();
            mutableIntObjectMap.f19627a = q.f19647a;
            mutableIntObjectMap.f19628b = h.f19632a;
            mutableIntObjectMap.f19629c = t.a.f20568c;
            mutableIntObjectMap.d(q.c(6));
            this.optimizedTagToViewState = mutableIntObjectMap;
        } else {
            this.tagToViewState = new ConcurrentHashMap<>();
            this.optimizedTagToViewState = null;
        }
        this.onViewAttachMountItems = new ArrayDeque();
        this.jsResponderHandler = jsResponderHandler;
        this.viewManagerRegistry = viewManagerRegistry;
        this.rootViewManager = rootViewManager;
        this.mountItemExecutor = mountItemExecutor;
        this.erroneouslyReaddedReactTags = new HashSet();
        this.viewTransitionCoordinator = new ViewTransitionCoordinator();
        this.viewsWithActiveTouches = new HashSet();
        this.viewsToDeleteAfterTouchFinishes = new HashSet();
        this.tagToSynchronousMountProps = new SparseArrayCompat(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addViewAt$lambda$8(SurfaceMountingManager surfaceMountingManager, int i7) {
        surfaceMountingManager.viewTransitionCoordinator.drainOperationsForChild(i7, surfaceMountingManager);
    }

    private final void addViewAtInternal(ViewGroup parentView, View child, int atIndex) {
        UiThreadUtil.assertOnUiThread();
        if (this.isStopped) {
            return;
        }
        ViewParent parent = child.getParent();
        if (parent != null) {
            boolean z5 = parent instanceof ViewGroup;
            int id2 = z5 ? ((ViewGroup) parent).getId() : -1;
            String str = TAG;
            int id3 = child.getId();
            int id4 = parentView.getId();
            String simpleName = parent.getClass().getSimpleName();
            String simpleName2 = child.getClass().getSimpleName();
            StringBuilder sbR = a3.e.r(id3, "addViewAtInternal: cannot insert view [", id4, "] into parent [", "]: View already has a parent: [");
            sbR.append(id2);
            sbR.append("]  Parent: ");
            sbR.append(simpleName);
            sbR.append(" View: ");
            sbR.append(simpleName2);
            ReactSoftExceptionLogger.logSoftException(str, new IllegalStateException(sbR.toString()));
            if (z5) {
                ((ViewGroup) parent).removeView(child);
            }
            this.erroneouslyReaddedReactTags.add(Integer.valueOf(child.getId()));
        }
        boolean z6 = SHOW_CHANGED_VIEW_HIERARCHIES;
        if (z6) {
            String str2 = TAG;
            StringBuilder sbR2 = a3.e.r(child.getId(), "addViewAt: [", parentView.getId(), "] -> [", "] idx: ");
            sbR2.append(atIndex);
            sbR2.append(" BEFORE");
            o8.a.g(str2, sbR2.toString());
            Companion.logViewHierarchy(parentView, false);
        }
        try {
            Companion.getViewGroupManager(getViewState(parentView.getId())).addView(parentView, child, atIndex);
            if (z6) {
                UiThreadUtil.runOnUiThread(new ab.a(child, parentView, atIndex, 3));
            }
        } catch (IllegalStateException e10) {
            StringBuilder sbR3 = a3.e.r(child.getId(), "addViewAt: failed to insert view [", parentView.getId(), "] into parent [", "] at index ");
            sbR3.append(atIndex);
            throw new IllegalStateException(sbR3.toString(), e10);
        } catch (IndexOutOfBoundsException e11) {
            StringBuilder sbR4 = a3.e.r(child.getId(), "addViewAt: failed to insert view [", parentView.getId(), "] into parent [", "] at index ");
            sbR4.append(atIndex);
            throw new IllegalStateException(sbR4.toString(), e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addViewAtInternal$lambda$9(View view, ViewGroup viewGroup, int i7) {
        String str = TAG;
        StringBuilder sbR = a3.e.r(view.getId(), "addViewAt: [", viewGroup.getId(), "] -> [", "] idx: ");
        sbR.append(i7);
        sbR.append(" AFTER");
        o8.a.g(str, sbR.toString());
        Companion.logViewHierarchy(viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void createViewUnsafe(String componentName, int reactTag, ReadableMap props, StateWrapper stateWrapper, EventEmitterWrapper eventEmitterWrapper, boolean isLayoutable) {
        w3.q.g("SurfaceMountingManager::createViewUnsafe(" + componentName + ")");
        try {
            ReactStylesDiffMap reactStylesDiffMap = new ReactStylesDiffMap(props);
            ViewState viewState = new ViewState(reactTag, null, null, false, 14, null);
            viewState.setCurrentProps(reactStylesDiffMap);
            viewState.setStateWrapper(stateWrapper);
            viewState.setEventEmitter(eventEmitterWrapper);
            registryPut(reactTag, viewState);
            if (isLayoutable) {
                ViewManagerRegistry viewManagerRegistry = this.viewManagerRegistry;
                ViewManager<?, ?> viewManager = viewManagerRegistry != null ? viewManagerRegistry.get(componentName) : null;
                Intrinsics.checkNotNull(viewManager, "null cannot be cast to non-null type com.facebook.react.uimanager.ViewManager<android.view.View, *>");
                ThemedReactContext themedReactContext = this.context;
                if (themedReactContext == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                viewState.setView(viewManager.createView(reactTag, themedReactContext, reactStylesDiffMap, stateWrapper, this.jsResponderHandler));
                viewState.setViewManager(viewManager);
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    private final void deleteViewInternal(int reactTag) {
        if (ReactNativeFeatureFlags.overrideBySynchronousMountPropsAtMountingAndroid() && this.tagToSynchronousMountProps.b(reactTag)) {
            this.tagToSynchronousMountProps.f(reactTag);
        }
        ViewState nullableViewState = getNullableViewState(reactTag);
        if (nullableViewState == null) {
            ReactSoftExceptionLogger.logSoftException(ReactSoftExceptionLogger.Categories.SURFACE_MOUNTING_MANAGER_MISSING_VIEWSTATE, new ReactNoCrashSoftException(g.d(reactTag, "Unable to find viewState for tag ", " for deleteView")));
        } else if (this.viewsWithActiveTouches.contains(Integer.valueOf(reactTag))) {
            this.viewsToDeleteAfterTouchFinishes.add(Integer.valueOf(reactTag));
        } else {
            registryRemove(reactTag);
            onViewStateDeleted(nullableViewState);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enqueuePendingEvent$lambda$25(ViewState viewState, PendingViewEvent pendingViewEvent) {
        EventEmitterWrapper eventEmitter = viewState.getEventEmitter();
        if (eventEmitter != null) {
            pendingViewEvent.dispatch(eventEmitter);
            return;
        }
        Queue<PendingViewEvent> pendingEventQueue = viewState.getPendingEventQueue();
        if (pendingEventQueue == null) {
            pendingEventQueue = new LinkedList<>();
            viewState.setPendingEventQueue(pendingEventQueue);
        }
        pendingEventQueue.add(pendingViewEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void executeMountItemsOnViewAttach() {
        MountingManager.MountItemExecutor mountItemExecutor = this.mountItemExecutor;
        if (mountItemExecutor == null) {
            throw new IllegalStateException("Required value was null.");
        }
        mountItemExecutor.executeItems(this.onViewAttachMountItems);
    }

    private final ViewState getNullableViewState(int reactTag) {
        return registryGet(reactTag);
    }

    private static /* synthetic */ void getRootViewManager$annotations() {
    }

    private final ViewState getViewState(int reactTag) {
        ViewState viewStateRegistryGet = registryGet(reactTag);
        if (viewStateRegistryGet != null) {
            return viewStateRegistryGet;
        }
        throw new RetryableMountingLayerException("Unable to find viewState for tag " + reactTag + ". Surface stopped: " + this.isStopped);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void markViewInTransition$lambda$6(SurfaceMountingManager surfaceMountingManager, int i7) {
        surfaceMountingManager.viewTransitionCoordinator.drainOperationsForChild(i7, surfaceMountingManager);
    }

    private final void onViewStateDeleted(ViewState viewState) {
        StateWrapper stateWrapper = viewState.getStateWrapper();
        if (stateWrapper != null) {
            stateWrapper.destroyState();
        }
        viewState.setStateWrapper(null);
        EventEmitterWrapper eventEmitter = viewState.getEventEmitter();
        if (eventEmitter != null) {
            eventEmitter.destroy();
        }
        viewState.setEventEmitter(null);
        ViewManager<View, ?> viewManager = viewState.getViewManager();
        if (viewState.getIsRoot() || viewManager == null) {
            return;
        }
        View view = viewState.getView();
        if (view == null) {
            throw new IllegalStateException("Required value was null.");
        }
        viewManager.onDropViewInstance(view);
    }

    private final boolean registryContains(int tag) {
        if (this.optimizedTagToViewState == null) {
            ConcurrentHashMap<Integer, ViewState> concurrentHashMap = this.tagToViewState;
            Intrinsics.checkNotNull(concurrentHashMap);
            return concurrentHashMap.containsKey(Integer.valueOf(tag));
        }
        ReentrantReadWriteLock.ReadLock lock = this.registryLock.readLock();
        lock.lock();
        try {
            return this.optimizedTagToViewState.a(tag);
        } finally {
            lock.unlock();
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0055 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0057 A[Catch: all -> 0x004d, LOOP:0: B:8:0x001f->B:20:0x0057, LOOP_END, TryCatch #0 {all -> 0x004d, blocks: (B:5:0x0012, B:8:0x001f, B:10:0x002f, B:12:0x003b, B:14:0x0044, B:17:0x004f, B:20:0x0057, B:21:0x005a), top: B:31:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x005a A[EDGE_INSN: B:34:0x005a->B:21:0x005a BREAK  A[LOOP:0: B:8:0x001f->B:20:0x0057], SYNTHETIC] */
    private final void registryForEachValue(Function1<? super ViewState, Unit> action) {
        if (this.optimizedTagToViewState == null) {
            ConcurrentHashMap<Integer, ViewState> concurrentHashMap = this.tagToViewState;
            Intrinsics.checkNotNull(concurrentHashMap);
            Collection<ViewState> collectionValues = concurrentHashMap.values();
            Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
            Iterator<T> it = collectionValues.iterator();
            while (it.hasNext()) {
                action.invoke(it.next());
            }
            return;
        }
        ReentrantReadWriteLock.ReadLock lock = this.registryLock.readLock();
        lock.lock();
        try {
            MutableIntObjectMap mutableIntObjectMap = this.optimizedTagToViewState;
            Object[] objArr = mutableIntObjectMap.f19629c;
            long[] jArr = mutableIntObjectMap.f19627a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i7 = 0;
                while (true) {
                    long j = jArr[i7];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i7 != length) {
                            break;
                            break;
                        }
                        i7++;
                    } else {
                        int i10 = 8 - ((~(i7 - length)) >>> 31);
                        for (int i11 = 0; i11 < i10; i11++) {
                            if ((255 & j) < 128) {
                                action.invoke(objArr[(i7 << 3) + i11]);
                            }
                            j >>= 8;
                        }
                        if (i10 != 8) {
                            break;
                        } else if (i7 != length) {
                            break;
                        } else {
                            i7++;
                        }
                    }
                }
            }
            Unit unit = Unit.f14616a;
        } finally {
            InlineMarker.finallyStart(1);
            lock.unlock();
            InlineMarker.finallyEnd(1);
        }
    }

    private final ViewState registryGet(int tag) {
        if (this.optimizedTagToViewState == null) {
            ConcurrentHashMap<Integer, ViewState> concurrentHashMap = this.tagToViewState;
            Intrinsics.checkNotNull(concurrentHashMap);
            return concurrentHashMap.get(Integer.valueOf(tag));
        }
        ReentrantReadWriteLock.ReadLock lock = this.registryLock.readLock();
        lock.lock();
        try {
            return (ViewState) this.optimizedTagToViewState.b(tag);
        } finally {
            lock.unlock();
        }
    }

    private final void registryPut(int tag, ViewState state) {
        if (this.optimizedTagToViewState == null) {
            Integer numValueOf = Integer.valueOf(tag);
            ConcurrentHashMap<Integer, ViewState> concurrentHashMap = this.tagToViewState;
            Intrinsics.checkNotNull(concurrentHashMap);
            concurrentHashMap.put(numValueOf, state);
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = this.registryLock;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i7 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i10 = 0; i10 < readHoldCount; i10++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            this.optimizedTagToViewState.f(tag, state);
            Unit unit = Unit.f14616a;
            while (i7 < readHoldCount) {
                lock.lock();
                i7++;
            }
        } finally {
            while (i7 < readHoldCount) {
                lock.lock();
                i7++;
            }
            writeLock.unlock();
        }
    }

    private final void registryRemove(int tag) {
        if (this.optimizedTagToViewState == null) {
            ConcurrentHashMap<Integer, ViewState> concurrentHashMap = this.tagToViewState;
            Intrinsics.checkNotNull(concurrentHashMap);
            concurrentHashMap.remove(Integer.valueOf(tag));
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = this.registryLock;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i7 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i10 = 0; i10 < readHoldCount; i10++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            while (i7 < readHoldCount) {
                lock.lock();
                i7++;
            }
        } finally {
            while (i7 < readHoldCount) {
                lock.lock();
                i7++;
            }
            writeLock.unlock();
        }
    }

    private final void removeViewAtInternal(int parentTag, ViewGroup parentView, int tag, int index) {
        int i7 = 0;
        if (SHOW_CHANGED_VIEW_HIERARCHIES) {
            String str = TAG;
            StringBuilder sbR = a3.e.r(tag, "removeViewAt: [", parentTag, "] -> [", "] idx: ");
            sbR.append(index);
            sbR.append(" BEFORE");
            o8.a.g(str, sbR.toString());
            Companion.logViewHierarchy(parentView, false);
        }
        IViewGroupManager viewGroupManager = Companion.getViewGroupManager(getViewState(parentTag));
        View childAt = viewGroupManager.getChildAt(parentView, index);
        int id2 = childAt != null ? childAt.getId() : -1;
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = index;
        if (id2 != tag) {
            int childCount = parentView.getChildCount();
            while (true) {
                if (i7 >= childCount) {
                    i7 = -1;
                    break;
                } else if (parentView.getChildAt(i7).getId() == tag) {
                    break;
                } else {
                    i7++;
                }
            }
            if (i7 == -1) {
                String str2 = TAG;
                StringBuilder sbR2 = a3.e.r(tag, "removeViewAt: [", parentTag, "] -> [", "] @");
                sbR2.append(index);
                sbR2.append(": view already removed from parent! Children in parent: ");
                sbR2.append(childCount);
                o8.a.g(str2, sbR2.toString());
                return;
            }
            Companion.logViewHierarchy(parentView, true);
            String str3 = TAG;
            StringBuilder sbR3 = a3.e.r(tag, "Tried to remove view [", parentTag, "] of parent [", "] at index ");
            a3.e.z(sbR3, index, ", but got view tag ", id2, " - actual index of view: ");
            sbR3.append(i7);
            ReactSoftExceptionLogger.logSoftException(str3, new IllegalStateException(sbR3.toString()));
            intRef.element = i7;
        }
        try {
            viewGroupManager.removeViewAt(parentView, intRef.element);
            if (SHOW_CHANGED_VIEW_HIERARCHIES) {
                UiThreadUtil.runOnUiThread(new c(tag, parentTag, intRef, parentView));
            }
        } catch (RuntimeException e10) {
            int childCount2 = viewGroupManager.getChildCount(parentView);
            Companion.logViewHierarchy(parentView, true);
            throw new IllegalStateException(kk.b.l(a3.e.r(intRef.element, "Cannot remove child at index ", parentView.getId(), " from parent ViewGroup [", "], only "), childCount2, " children in parent. Warning: childCount may be incorrect!"), e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeViewAtInternal$lambda$10(int i7, int i10, Ref.IntRef intRef, ViewGroup viewGroup) {
        String str = TAG;
        int i11 = intRef.element;
        StringBuilder sbR = a3.e.r(i7, "removeViewAt: [", i10, "] -> [", "] idx: ");
        sbR.append(i11);
        sbR.append(" AFTER");
        o8.a.g(str, sbR.toString());
        Companion.logViewHierarchy(viewGroup, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void stopSurface$lambda$5(SurfaceMountingManager surfaceMountingManager) throws Throwable {
        ReentrantReadWriteLock.WriteLock writeLock;
        long j;
        long j5;
        ViewManagerRegistry viewManagerRegistry;
        if (ReactNativeFeatureFlags.enableViewRecycling() && (viewManagerRegistry = surfaceMountingManager.viewManagerRegistry) != null) {
            viewManagerRegistry.onSurfaceStopped(surfaceMountingManager.surfaceId);
        }
        if (surfaceMountingManager.optimizedTagToViewState != null) {
            ReentrantReadWriteLock reentrantReadWriteLock = surfaceMountingManager.registryLock;
            ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i7 = 0; i7 < readHoldCount; i7++) {
                lock.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock2 = reentrantReadWriteLock.writeLock();
            writeLock2.lock();
            try {
                SparseArrayCompat sparseArrayCompat = new SparseArrayCompat(0);
                surfaceMountingManager.tagSetForStoppedSurface = sparseArrayCompat;
                ArrayList arrayList = new ArrayList(surfaceMountingManager.optimizedTagToViewState.f19631e);
                MutableIntObjectMap mutableIntObjectMap = surfaceMountingManager.optimizedTagToViewState;
                int[] iArr = mutableIntObjectMap.f19628b;
                Object[] objArr = mutableIntObjectMap.f19629c;
                long[] jArr = mutableIntObjectMap.f19627a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    j = 255;
                    j5 = -9187201950435737472L;
                    while (true) {
                        long j7 = jArr[i10];
                        if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i11 = 8;
                            int i12 = 8 - ((~(i10 - length)) >>> 31);
                            int i13 = 0;
                            while (i13 < i12) {
                                if ((j7 & 255) < 128) {
                                    int i14 = (i10 << 3) + i13;
                                    int i15 = iArr[i14];
                                    writeLock = writeLock2;
                                    try {
                                        ViewState viewState = (ViewState) objArr[i14];
                                        SurfaceMountingManagerKt.set(sparseArrayCompat, i15, surfaceMountingManager);
                                        arrayList.add(viewState);
                                    } catch (Throwable th2) {
                                        th = th2;
                                        for (int i16 = 0; i16 < readHoldCount; i16++) {
                                            lock.lock();
                                        }
                                        writeLock.unlock();
                                        throw th;
                                    }
                                } else {
                                    writeLock = writeLock2;
                                }
                                j7 >>= i11;
                                i13++;
                                i11 = i11;
                                writeLock2 = writeLock;
                            }
                            writeLock = writeLock2;
                            if (i12 != i11) {
                                break;
                            }
                        } else {
                            writeLock = writeLock2;
                        }
                        if (i10 == length) {
                            break;
                        }
                        i10++;
                        writeLock2 = writeLock;
                    }
                } else {
                    writeLock = writeLock2;
                    j = 255;
                    j5 = -9187201950435737472L;
                }
                MutableIntObjectMap mutableIntObjectMap2 = surfaceMountingManager.optimizedTagToViewState;
                mutableIntObjectMap2.f19631e = 0;
                long[] jArr2 = mutableIntObjectMap2.f19627a;
                if (jArr2 != q.f19647a) {
                    w.l(jArr2, j5);
                    long[] jArr3 = mutableIntObjectMap2.f19627a;
                    int i17 = mutableIntObjectMap2.f19630d;
                    int i18 = i17 >> 3;
                    long j10 = j << ((i17 & 7) << 3);
                    jArr3[i18] = (jArr3[i18] & (~j10)) | j10;
                }
                w.k(mutableIntObjectMap2.f19629c, null, 0, mutableIntObjectMap2.f19630d);
                mutableIntObjectMap2.f1219f = q.a(mutableIntObjectMap2.f19630d) - mutableIntObjectMap2.f19631e;
                Unit unit = Unit.f14616a;
                for (int i19 = 0; i19 < readHoldCount; i19++) {
                    lock.lock();
                }
                writeLock.unlock();
                Iterator it = arrayList.iterator();
                Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
                while (it.hasNext()) {
                    Object next = it.next();
                    Intrinsics.checkNotNullExpressionValue(next, "next(...)");
                    surfaceMountingManager.onViewStateDeleted((ViewState) next);
                }
            } catch (Throwable th3) {
                th = th3;
                writeLock = writeLock2;
            }
        } else {
            SparseArrayCompat sparseArrayCompat2 = new SparseArrayCompat(0);
            surfaceMountingManager.tagSetForStoppedSurface = sparseArrayCompat2;
            ConcurrentHashMap<Integer, ViewState> concurrentHashMap = surfaceMountingManager.tagToViewState;
            Intrinsics.checkNotNull(concurrentHashMap);
            for (Map.Entry<Integer, ViewState> entry : concurrentHashMap.entrySet()) {
                int iIntValue = entry.getKey().intValue();
                ViewState value = entry.getValue();
                SurfaceMountingManagerKt.set(sparseArrayCompat2, iIntValue, surfaceMountingManager);
                surfaceMountingManager.onViewStateDeleted(value);
            }
            ConcurrentHashMap<Integer, ViewState> concurrentHashMap2 = surfaceMountingManager.tagToViewState;
            Intrinsics.checkNotNull(concurrentHashMap2);
            concurrentHashMap2.clear();
        }
        surfaceMountingManager.jsResponderHandler = null;
        surfaceMountingManager.rootViewManager = null;
        surfaceMountingManager.mountItemExecutor = null;
        surfaceMountingManager.context = null;
        surfaceMountingManager.onViewAttachMountItems.clear();
        SparseArrayCompat sparseArrayCompat3 = surfaceMountingManager.tagToSynchronousMountProps;
        int i20 = sparseArrayCompat3.f1226v;
        Object[] objArr2 = sparseArrayCompat3.f1225i;
        for (int i21 = 0; i21 < i20; i21++) {
            objArr2[i21] = null;
        }
        sparseArrayCompat3.f1226v = 0;
        sparseArrayCompat3.f1223d = false;
        o8.a.g(TAG, "Surface [" + surfaceMountingManager.surfaceId + "] was stopped on SurfaceMountingManager.");
    }

    public final void addViewAt(int parentTag, int tag, int index) {
        UiThreadUtil.assertOnUiThread();
        if (this.isStopped) {
            return;
        }
        ViewState nullableViewState = getNullableViewState(parentTag);
        if (nullableViewState == null) {
            ReactSoftExceptionLogger.logSoftException(ReactSoftExceptionLogger.Categories.SURFACE_MOUNTING_MANAGER_MISSING_VIEWSTATE, new ReactNoCrashSoftException(g.d(parentTag, "Unable to find viewState for tag: [", "] for addViewAt")));
            return;
        }
        if (!(nullableViewState.getView() instanceof ViewGroup)) {
            StringBuilder sbR = a3.e.r(parentTag, "Unable to add a view into a view that is not a ViewGroup. ParentTag: ", tag, " - Tag: ", " - Index: ");
            sbR.append(index);
            String string = sbR.toString();
            o8.a.g(TAG, string);
            throw new IllegalStateException(string);
        }
        View view = nullableViewState.getView();
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) view;
        ViewState nullableViewState2 = getNullableViewState(tag);
        if (nullableViewState2 == null) {
            ReactSoftExceptionLogger.logSoftException(ReactSoftExceptionLogger.Categories.SURFACE_MOUNTING_MANAGER_MISSING_VIEWSTATE, new ReactNoCrashSoftException(g.d(tag, "Unable to find viewState for tag: [", "] for addViewAt")));
            return;
        }
        View view2 = nullableViewState2.getView();
        if (view2 == null) {
            throw new IllegalStateException(("Unable to find view for viewState " + nullableViewState2 + " and tag " + tag).toString());
        }
        ViewParent parent = view2.getParent();
        boolean zShouldEnqueueOperation$default = ViewTransitionCoordinator.shouldEnqueueOperation$default(this.viewTransitionCoordinator, tag, parentTag, false, 4, null);
        if (!zShouldEnqueueOperation$default && parent == null) {
            addViewAtInternal(viewGroup, view2, index);
            return;
        }
        if (!zShouldEnqueueOperation$default) {
            this.viewTransitionCoordinator.markViewInTransition(tag, true, view2, new d(this, tag, 1));
            String str = TAG;
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            o8.a.v(str, "addViewAt: View with tag [" + tag + "] already has a parent [" + (viewGroup2 != null ? Integer.valueOf(viewGroup2.getId()) : null) + "], enqueuing add operation into ViewTransitionCoordinator");
        }
        this.viewTransitionCoordinator.enqueueOperation(new AddViewOperation(tag, parentTag, index, viewGroup, view2));
    }

    public final void applyViewSnapshot(int tag, @NotNull Bitmap bitmap) {
        View view;
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        ViewState nullableViewState = getNullableViewState(tag);
        if (nullableViewState == null || (view = nullableViewState.getView()) == null) {
            return;
        }
        Resources resources = view.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        view.setBackground(new BitmapDrawable(resources, bitmap));
    }

    public final void attachRootView(@NotNull final View rootView, @NotNull ThemedReactContext themedReactContext) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(themedReactContext, "themedReactContext");
        this.context = themedReactContext;
        if (this.isStopped) {
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException("Trying to attach root view to a stopped surface"));
            return;
        }
        int i7 = this.surfaceId;
        registryPut(i7, new ViewState(i7, rootView, this.rootViewManager, true));
        final ThemedReactContext themedReactContext2 = this.context;
        if (themedReactContext2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        GuardedRunnable guardedRunnable = new GuardedRunnable(themedReactContext2) { // from class: com.facebook.react.fabric.mounting.SurfaceMountingManager$attachRootView$runnable$1
            @Override // com.facebook.react.bridge.GuardedRunnable
            public void runGuarded() {
                if (this.this$0.getIsStopped()) {
                    return;
                }
                if (rootView.getId() == this.this$0.getSurfaceId()) {
                    ReactSoftExceptionLogger.logSoftException(SurfaceMountingManager.TAG, new IllegalViewOperationException(g.d(this.this$0.getSurfaceId(), "Race condition in addRootView detected. Trying to set an id of [", "] on the RootView, but that id has already been set. ")));
                } else if (rootView.getId() != -1) {
                    o8.a.g(SurfaceMountingManager.TAG, g.c(rootView.getId(), "Trying to add RootTag to RootView that already has a tag: existing tag: [", this.this$0.getSurfaceId(), "] new tag: [", "]"));
                    ReactSoftExceptionLogger.logSoftException(SurfaceMountingManager.TAG, new IllegalViewOperationException("Trying to add a root view with an explicit id already set. React Native uses the id field to track react tags and will overwrite this field. If that is fine, explicitly overwrite the id field to View.NO_ID before calling addRootView."));
                }
                rootView.setId(this.this$0.getSurfaceId());
                KeyEvent.Callback callback = rootView;
                if (callback instanceof ReactRoot) {
                    ((ReactRoot) callback).setRootViewTag(this.this$0.getSurfaceId());
                }
                this.this$0.executeMountItemsOnViewAttach();
                this.this$0.isRootViewAttached = true;
            }
        };
        if (UiThreadUtil.isOnUiThread()) {
            guardedRunnable.run();
        } else {
            UiThreadUtil.runOnUiThread(guardedRunnable);
        }
    }

    public final void createView$ReactAndroid_release(@NotNull String componentName, int reactTag, @NotNull ReadableMap props, StateWrapper stateWrapper, EventEmitterWrapper eventEmitterWrapper, boolean isLayoutable) {
        Intrinsics.checkNotNullParameter(componentName, "componentName");
        Intrinsics.checkNotNullParameter(props, "props");
        if (this.isStopped) {
            return;
        }
        this.viewTransitionCoordinator.notifyViewCreated(reactTag);
        ViewState nullableViewState = getNullableViewState(reactTag);
        if ((nullableViewState != null ? nullableViewState.getView() : null) != null) {
            return;
        }
        createViewUnsafe(componentName, reactTag, props, stateWrapper, eventEmitterWrapper, isLayoutable);
    }

    public final void deleteView(int reactTag) {
        UiThreadUtil.assertOnUiThread();
        if (this.isStopped) {
            return;
        }
        if (ViewTransitionCoordinator.shouldEnqueueOperation$default(this.viewTransitionCoordinator, reactTag, ViewOperationsKt.DELETE_VIEW_PARENT_TAG, false, 4, null)) {
            this.viewTransitionCoordinator.enqueueOperation(new DeleteViewOperation(reactTag));
        } else {
            deleteViewInternal(reactTag);
        }
    }

    public final void enqueuePendingEvent(int reactTag, @NotNull String eventName, boolean canCoalesceEvent, WritableMap params, int eventCategory) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        enqueuePendingEvent(reactTag, eventName, canCoalesceEvent, params, eventCategory, SystemClock.uptimeMillis());
    }

    public final void executeAddViewOperation$ReactAndroid_release(@NotNull AddViewOperation operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        addViewAtInternal(operation.getParent(), operation.getChild(), operation.getIndex().intValue());
    }

    public final void executeDeleteViewOperation$ReactAndroid_release(@NotNull DeleteViewOperation operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        deleteViewInternal(operation.getChildTag());
    }

    public final void executeRemoveViewOperation$ReactAndroid_release(@NotNull RemoveViewOperation operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        removeViewAtInternal(operation.getParentTag(), operation.getParentView(), operation.getChildTag(), operation.getIndex().intValue());
    }

    @SuppressLint({"FunctionName"})
    @UnstableReactNativeAPI
    public final void experimental_prefetchResources(int surfaceId, @NotNull String componentName, MapBuffer params) {
        ViewManagerRegistry viewManagerRegistry;
        ViewManager<?, ?> viewManager;
        Intrinsics.checkNotNullParameter(componentName, "componentName");
        if (this.isStopped || (viewManagerRegistry = this.viewManagerRegistry) == null || (viewManager = viewManagerRegistry.get(componentName)) == null) {
            return;
        }
        ThemedReactContext themedReactContext = this.context;
        if (themedReactContext == null) {
            throw new IllegalStateException("Required value was null.");
        }
        viewManager.experimental_prefetchResources(surfaceId, themedReactContext, params);
    }

    public final ThemedReactContext getContext() {
        return this.context;
    }

    public final EventEmitterWrapper getEventEmitter$ReactAndroid_release(int reactTag) {
        ViewState nullableViewState = getNullableViewState(reactTag);
        if (nullableViewState != null) {
            return nullableViewState.getEventEmitter();
        }
        return null;
    }

    public final int getSurfaceId() {
        return this.surfaceId;
    }

    @NotNull
    public final View getView(int reactTag) {
        View view;
        ViewState nullableViewState = getNullableViewState(reactTag);
        if (nullableViewState != null && (view = nullableViewState.getView()) != null) {
            return view;
        }
        int i7 = this.surfaceId;
        boolean z5 = this.isStopped;
        boolean z6 = this.isRootViewAttached;
        StringBuilder sbR = a3.e.r(reactTag, "Unable to find view for tag ", i7, ". Surface ", " stopped: ");
        sbR.append(z5);
        sbR.append(", rootViewAttached: ");
        sbR.append(z6);
        throw new IllegalViewOperationException(sbR.toString());
    }

    public final boolean getViewExists(int tag) {
        SparseArrayCompat sparseArrayCompat = this.tagSetForStoppedSurface;
        if (sparseArrayCompat == null || !sparseArrayCompat.b(tag)) {
            return registryContains(tag);
        }
        return true;
    }

    /* JADX INFO: renamed from: isRootViewAttached, reason: from getter */
    public final boolean getIsRootViewAttached() {
        return this.isRootViewAttached;
    }

    /* JADX INFO: renamed from: isStopped, reason: from getter */
    public final boolean getIsStopped() {
        return this.isStopped;
    }

    public final void markActiveTouchForTag(int reactTag) {
        this.viewsWithActiveTouches.add(Integer.valueOf(reactTag));
    }

    public final void markViewInTransition(int tag, boolean isTransitioning) {
        UiThreadUtil.assertOnUiThread();
        ViewState nullableViewState = getNullableViewState(tag);
        if (nullableViewState == null) {
            return;
        }
        this.viewTransitionCoordinator.markViewInTransition(tag, isTransitioning, nullableViewState.getView(), new d(this, tag, 0));
    }

    public final void preallocateView(@NotNull String componentName, int reactTag, @NotNull ReadableMap props, StateWrapper stateWrapper, boolean isLayoutable) {
        Intrinsics.checkNotNullParameter(componentName, "componentName");
        Intrinsics.checkNotNullParameter(props, "props");
        UiThreadUtil.assertOnUiThread();
        if (!this.isStopped && getNullableViewState(reactTag) == null) {
            createViewUnsafe(componentName, reactTag, props, stateWrapper, null, isLayoutable);
        }
    }

    public final void printSurfaceState() throws Throwable {
        ReentrantReadWriteLock.ReadLock readLock;
        long[] jArr;
        Object[] objArr;
        o8.a.g(TAG, "Views created for surface " + this.surfaceId + ":");
        if (this.optimizedTagToViewState == null) {
            ConcurrentHashMap<Integer, ViewState> concurrentHashMap = this.tagToViewState;
            Intrinsics.checkNotNull(concurrentHashMap);
            Collection<ViewState> collectionValues = concurrentHashMap.values();
            Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
            for (ViewState viewState : collectionValues) {
                ViewManager<View, ?> viewManager = viewState.getViewManager();
                String name = viewManager != null ? viewManager.getName() : null;
                View view = viewState.getView();
                View view2 = view != null ? (View) view.getParent() : null;
                Integer numValueOf = view2 != null ? Integer.valueOf(view2.getId()) : null;
                String str = TAG;
                int reactTag = viewState.getReactTag();
                boolean isRoot = viewState.getIsRoot();
                StringBuilder sbT = a3.e.t("<", name, " id=", reactTag, " parentTag=");
                sbT.append(numValueOf);
                sbT.append(" isRoot=");
                sbT.append(isRoot);
                sbT.append(" />");
                o8.a.g(str, sbT.toString());
            }
            return;
        }
        ReentrantReadWriteLock.ReadLock lock = this.registryLock.readLock();
        lock.lock();
        try {
            MutableIntObjectMap mutableIntObjectMap = this.optimizedTagToViewState;
            Object[] objArr2 = mutableIntObjectMap.f19629c;
            long[] jArr2 = mutableIntObjectMap.f19627a;
            int length = jArr2.length - 2;
            if (length >= 0) {
                int i7 = 0;
                while (true) {
                    long j = jArr2[i7];
                    readLock = lock;
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i10 = 8;
                        int i11 = 8 - ((~(i7 - length)) >>> 31);
                        int i12 = 0;
                        while (i12 < i11) {
                            if ((j & 255) < 128) {
                                try {
                                    ViewState viewState2 = (ViewState) objArr2[(i7 << 3) + i12];
                                    ViewManager<View, ?> viewManager2 = viewState2.getViewManager();
                                    String name2 = viewManager2 != null ? viewManager2.getName() : null;
                                    View view3 = viewState2.getView();
                                    View view4 = view3 != null ? (View) view3.getParent() : null;
                                    Integer numValueOf2 = view4 != null ? Integer.valueOf(view4.getId()) : null;
                                    o8.a.g(TAG, "<" + name2 + " id=" + viewState2.getReactTag() + " parentTag=" + numValueOf2 + " isRoot=" + viewState2.getIsRoot() + " />");
                                } catch (Throwable th2) {
                                    th = th2;
                                    readLock.unlock();
                                    throw th;
                                }
                            } else {
                                i10 = i10;
                            }
                            j >>= i10;
                            i12++;
                            i10 = i10;
                            jArr2 = jArr2;
                            objArr2 = objArr2;
                        }
                        jArr = jArr2;
                        objArr = objArr2;
                        if (i11 != i10) {
                            break;
                        }
                    } else {
                        jArr = jArr2;
                        objArr = objArr2;
                    }
                    if (i7 == length) {
                        break;
                    }
                    i7++;
                    lock = readLock;
                    jArr2 = jArr;
                    objArr2 = objArr;
                }
            } else {
                readLock = lock;
            }
            Unit unit = Unit.f14616a;
            readLock.unlock();
        } catch (Throwable th3) {
            th = th3;
            readLock = lock;
        }
    }

    @rn.d
    public final void receiveCommand(int reactTag, int commandId, ReadableArray commandArgs) {
        if (this.isStopped) {
            return;
        }
        ViewState nullableViewState = getNullableViewState(reactTag);
        if (nullableViewState == null) {
            throw new RetryableMountingLayerException(a3.e.g(reactTag, commandId, "Unable to find viewState for tag ", " for commandId "));
        }
        ViewManager<View, ?> viewManager = nullableViewState.getViewManager();
        if (viewManager == null) {
            throw new RetryableMountingLayerException(kk.b.h(reactTag, "Unable to find viewManager for tag "));
        }
        View view = nullableViewState.getView();
        if (view == null) {
            throw new RetryableMountingLayerException(kk.b.h(reactTag, "Unable to find viewState view for tag "));
        }
        viewManager.receiveCommand(view, commandId, commandArgs);
    }

    public final void removeViewAt(int tag, int parentTag, int index) {
        if (this.isStopped) {
            return;
        }
        if (this.erroneouslyReaddedReactTags.contains(Integer.valueOf(tag))) {
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalViewOperationException(g.d(tag, "removeViewAt tried to remove a React View that was actually reused. This indicates a bug in the Differ (specifically instruction ordering). [", "]")));
            return;
        }
        UiThreadUtil.assertOnUiThread();
        ViewState nullableViewState = getNullableViewState(parentTag);
        if (nullableViewState == null) {
            ReactSoftExceptionLogger.logSoftException(ReactSoftExceptionLogger.Categories.SURFACE_MOUNTING_MANAGER_MISSING_VIEWSTATE, new IllegalStateException(g.d(parentTag, "Unable to find viewState for tag: [", "] for removeViewAt")));
            return;
        }
        View view = nullableViewState.getView();
        if (view instanceof ViewGroup) {
            if (this.viewTransitionCoordinator.shouldEnqueueOperation(tag, parentTag, false)) {
                this.viewTransitionCoordinator.enqueueOperation(new RemoveViewOperation(tag, parentTag, index, (ViewGroup) view));
                return;
            } else {
                removeViewAtInternal(parentTag, (ViewGroup) view, tag, index);
                return;
            }
        }
        StringBuilder sbR = a3.e.r(parentTag, "Unable to remove a view from a view that is not a ViewGroup. ParentTag: ", tag, " - Tag: ", " - Index: ");
        sbR.append(index);
        String string = sbR.toString();
        o8.a.g(TAG, string);
        throw new IllegalStateException(string);
    }

    public final void scheduleMountItemOnViewAttach$ReactAndroid_release(@NotNull MountItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.onViewAttachMountItems.add(item);
    }

    public final void sendAccessibilityEvent(int reactTag, int eventType) {
        if (this.isStopped) {
            return;
        }
        View view = getViewState(reactTag).getView();
        if (view == null) {
            throw new RetryableMountingLayerException(kk.b.h(reactTag, "Unable to find viewState view for tag "));
        }
        view.sendAccessibilityEvent(eventType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void setJSResponder(int reactTag, int initialReactTag, boolean blockNativeResponder) {
        UiThreadUtil.assertOnUiThread();
        if (this.isStopped) {
            return;
        }
        JSResponderHandler jSResponderHandler = this.jsResponderHandler;
        if (jSResponderHandler == null) {
            return;
        }
        if (!blockNativeResponder) {
            jSResponderHandler.setJSResponder(initialReactTag, null);
            return;
        }
        ViewState viewState = getViewState(reactTag);
        View view = viewState.getView();
        if (initialReactTag != reactTag && (view instanceof ViewParent)) {
            jSResponderHandler.setJSResponder(initialReactTag, (ViewParent) view);
            return;
        }
        if (view == 0) {
            SoftAssertions.assertUnreachable("Cannot find view for tag [" + reactTag + "].");
            return;
        }
        if (viewState.getIsRoot()) {
            SoftAssertions.assertUnreachable("Cannot block native responder on [" + reactTag + "] that is a root view");
        }
        jSResponderHandler.setJSResponder(initialReactTag, view.getParent());
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0093 A[Catch: all -> 0x007a, LOOP:0: B:11:0x0044->B:29:0x0093, LOOP_END, TryCatch #0 {all -> 0x007a, blocks: (B:8:0x0037, B:11:0x0044, B:13:0x0054, B:15:0x0060, B:17:0x0069, B:19:0x0076, B:22:0x007c, B:24:0x0085, B:25:0x0088, B:26:0x008b, B:29:0x0093, B:30:0x0096), top: B:50:0x0037 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0096 A[EDGE_INSN: B:53:0x0096->B:30:0x0096 BREAK  A[LOOP:0: B:11:0x0044->B:29:0x0093], SYNTHETIC] */
    public final void stopSurface() {
        o8.a.g(TAG, "Stopping surface [" + this.surfaceId + "]");
        if (this.isStopped) {
            return;
        }
        this.isStopped = true;
        this.viewTransitionCoordinator.clearAllPending();
        if (this.optimizedTagToViewState != null) {
            ReentrantReadWriteLock.ReadLock lock = this.registryLock.readLock();
            lock.lock();
            try {
                MutableIntObjectMap mutableIntObjectMap = this.optimizedTagToViewState;
                Object[] objArr = mutableIntObjectMap.f19629c;
                long[] jArr = mutableIntObjectMap.f19627a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i7 = 0;
                    while (true) {
                        long j = jArr[i7];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i7 != length) {
                                break;
                                break;
                            }
                            i7++;
                        } else {
                            int i10 = 8 - ((~(i7 - length)) >>> 31);
                            for (int i11 = 0; i11 < i10; i11++) {
                                if ((255 & j) < 128) {
                                    ViewState viewState = (ViewState) objArr[(i7 << 3) + i11];
                                    StateWrapper stateWrapper = viewState.getStateWrapper();
                                    if (stateWrapper != null) {
                                        stateWrapper.destroyState();
                                    }
                                    viewState.setStateWrapper(null);
                                    EventEmitterWrapper eventEmitter = viewState.getEventEmitter();
                                    if (eventEmitter != null) {
                                        eventEmitter.destroy();
                                    }
                                    viewState.setEventEmitter(null);
                                }
                                j >>= 8;
                            }
                            if (i10 != 8) {
                                break;
                            } else if (i7 != length) {
                                break;
                            } else {
                                i7++;
                            }
                        }
                    }
                }
                Unit unit = Unit.f14616a;
                lock.unlock();
            } catch (Throwable th2) {
                lock.unlock();
                throw th2;
            }
        } else {
            ConcurrentHashMap<Integer, ViewState> concurrentHashMap = this.tagToViewState;
            Intrinsics.checkNotNull(concurrentHashMap);
            Collection<ViewState> collectionValues = concurrentHashMap.values();
            Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
            for (ViewState viewState2 : collectionValues) {
                StateWrapper stateWrapper2 = viewState2.getStateWrapper();
                if (stateWrapper2 != null) {
                    stateWrapper2.destroyState();
                }
                viewState2.setStateWrapper(null);
                EventEmitterWrapper eventEmitter2 = viewState2.getEventEmitter();
                if (eventEmitter2 != null) {
                    eventEmitter2.destroy();
                }
                viewState2.setEventEmitter(null);
            }
        }
        am.c cVar = new am.c(17, this);
        if (UiThreadUtil.isOnUiThread()) {
            cVar.run();
        } else {
            UiThreadUtil.runOnUiThread(cVar);
        }
    }

    public final void storeSynchronousMountPropsOverride(int reactTag, @NotNull ReadableMap props) {
        Intrinsics.checkNotNullParameter(props, "props");
        if (ReactNativeFeatureFlags.overrideBySynchronousMountPropsAtMountingAndroid()) {
            Companion companion = Companion;
            Map animatedPropsMap = companion.getAnimatedPropsMap(props);
            Map linkedHashMap = (Map) this.tagToSynchronousMountProps.c(reactTag);
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
            }
            companion.clearAnimatedNullPropsMapKeys(props, linkedHashMap);
            linkedHashMap.putAll(animatedPropsMap);
            if (linkedHashMap.isEmpty()) {
                this.tagToSynchronousMountProps.f(reactTag);
            } else {
                SurfaceMountingManagerKt.set(this.tagToSynchronousMountProps, reactTag, linkedHashMap);
            }
        }
    }

    public final void sweepActiveTouchForTag(int reactTag) {
        this.viewsWithActiveTouches.remove(Integer.valueOf(reactTag));
        if (this.viewsToDeleteAfterTouchFinishes.contains(Integer.valueOf(reactTag))) {
            this.viewsToDeleteAfterTouchFinishes.remove(Integer.valueOf(reactTag));
            deleteView(reactTag);
        }
    }

    public final void updateEventEmitter$ReactAndroid_release(int reactTag, @NotNull EventEmitterWrapper eventEmitter) {
        ViewState viewState;
        Intrinsics.checkNotNullParameter(eventEmitter, "eventEmitter");
        UiThreadUtil.assertOnUiThread();
        if (this.isStopped) {
            return;
        }
        if (this.optimizedTagToViewState != null) {
            ReentrantReadWriteLock reentrantReadWriteLock = this.registryLock;
            ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
            int i7 = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i10 = 0; i10 < readHoldCount; i10++) {
                lock.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                MutableIntObjectMap mutableIntObjectMap = this.optimizedTagToViewState;
                Object objB = mutableIntObjectMap.b(reactTag);
                if (objB == null) {
                    objB = new ViewState(reactTag, null, null, false, 14, null);
                    mutableIntObjectMap.f(reactTag, objB);
                }
                viewState = (ViewState) objB;
                while (i7 < readHoldCount) {
                    lock.lock();
                    i7++;
                }
                writeLock.unlock();
            } catch (Throwable th2) {
                while (i7 < readHoldCount) {
                    lock.lock();
                    i7++;
                }
                writeLock.unlock();
                throw th2;
            }
        } else {
            ConcurrentHashMap<Integer, ViewState> concurrentHashMap = this.tagToViewState;
            Intrinsics.checkNotNull(concurrentHashMap);
            viewState = concurrentHashMap.get(Integer.valueOf(reactTag));
            if (viewState == null) {
                viewState = new ViewState(reactTag, null, null, false, 14, null);
                Integer numValueOf = Integer.valueOf(reactTag);
                ConcurrentHashMap<Integer, ViewState> concurrentHashMap2 = this.tagToViewState;
                Intrinsics.checkNotNull(concurrentHashMap2);
                concurrentHashMap2.put(numValueOf, viewState);
            }
        }
        EventEmitterWrapper eventEmitter2 = viewState.getEventEmitter();
        viewState.setEventEmitter(eventEmitter);
        if (!Intrinsics.areEqual(eventEmitter2, eventEmitter) && eventEmitter2 != null) {
            eventEmitter2.destroy();
        }
        Queue<PendingViewEvent> pendingEventQueue = viewState.getPendingEventQueue();
        if (pendingEventQueue != null) {
            Iterator<PendingViewEvent> it = pendingEventQueue.iterator();
            while (it.hasNext()) {
                it.next().dispatch(eventEmitter);
            }
            viewState.setPendingEventQueue(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0081  */
    /* JADX WARN: Code duplicated, block: B:36:0x0088  */
    /* JADX WARN: Code duplicated, block: B:39:0x008f  */
    /* JADX WARN: Code duplicated, block: B:41:? A[RETURN, SYNTHETIC] */
    public final void updateLayout(int reactTag, int parentTag, int x5, int y5, int width, int height, int displayType, int layoutDirection) {
        View view;
        IViewGroupManager iViewGroupManager;
        int i7;
        if (this.isStopped) {
            return;
        }
        ViewState nullableViewState = getNullableViewState(reactTag);
        if (nullableViewState == null) {
            ReactSoftExceptionLogger.logSoftException(ReactSoftExceptionLogger.Categories.SURFACE_MOUNTING_MANAGER_MISSING_VIEWSTATE, new ReactNoCrashSoftException(g.d(reactTag, "Unable to find viewState for tag ", " for updateLayout")));
            return;
        }
        if (nullableViewState.getIsRoot() || (view = nullableViewState.getView()) == null) {
            return;
        }
        int i10 = 1;
        if (layoutDirection == 1) {
            i10 = 0;
        } else if (layoutDirection != 2) {
            i10 = 2;
        }
        view.setLayoutDirection(i10);
        view.measure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), View.MeasureSpec.makeMeasureSpec(height, 1073741824));
        ViewParent parent = view.getParent();
        if (parent instanceof RootView) {
            parent.requestLayout();
        }
        ViewState nullableViewState2 = getNullableViewState(parentTag);
        if (nullableViewState2 != null) {
            if (nullableViewState2.getViewManager() != null) {
                NativeModule viewManager = nullableViewState2.getViewManager();
                Intrinsics.checkNotNull(viewManager, "null cannot be cast to non-null type com.facebook.react.uimanager.IViewGroupManager<*>");
                iViewGroupManager = (IViewGroupManager) viewManager;
            }
            if (iViewGroupManager != null || !iViewGroupManager.needsCustomLayoutForChildren()) {
                view.layout(x5, y5, width + x5, height + y5);
            }
            i7 = displayType == 0 ? 4 : 0;
            if (view.getVisibility() != i7) {
                view.setVisibility(i7);
            }
        }
        ReactSoftExceptionLogger.logSoftException(ReactSoftExceptionLogger.Categories.SURFACE_MOUNTING_MANAGER_MISSING_VIEWSTATE, new ReactNoCrashSoftException(g.d(parentTag, "Unable to find viewState for tag ", " for updateLayout")));
        iViewGroupManager = null;
        if (iViewGroupManager != null) {
            view.layout(x5, y5, width + x5, height + y5);
        } else {
            view.layout(x5, y5, width + x5, height + y5);
        }
        if (displayType == 0) {
        }
        if (view.getVisibility() != i7) {
            view.setVisibility(i7);
        }
    }

    public final void updateOverflowInset(int reactTag, int overflowInsetLeft, int overflowInsetTop, int overflowInsetRight, int overflowInsetBottom) {
        if (this.isStopped) {
            return;
        }
        ViewState viewState = getViewState(reactTag);
        if (viewState.getIsRoot()) {
            return;
        }
        KeyEvent.Callback view = viewState.getView();
        if (view == null) {
            throw new IllegalStateException(kk.b.h(reactTag, "Unable to find View for tag: ").toString());
        }
        if (view instanceof ReactOverflowViewWithInset) {
            ((ReactOverflowViewWithInset) view).setOverflowInset(overflowInsetLeft, overflowInsetTop, overflowInsetRight, overflowInsetBottom);
        }
    }

    public final void updatePadding(int reactTag, int left, int top, int right, int bottom) {
        UiThreadUtil.assertOnUiThread();
        if (this.isStopped) {
            return;
        }
        ViewState viewState = getViewState(reactTag);
        if (viewState.getIsRoot()) {
            return;
        }
        View view = viewState.getView();
        if (view == null) {
            throw new IllegalStateException(kk.b.h(reactTag, "Unable to find View for tag: ").toString());
        }
        ViewManager<View, ?> viewManager = viewState.getViewManager();
        if (viewManager != null) {
            viewManager.setPadding(view, left, top, right, bottom);
        } else {
            throw new IllegalStateException(("Unable to find ViewManager for view: " + viewState).toString());
        }
    }

    public final void updateProps(int reactTag, @NotNull ReadableMap props) {
        Intrinsics.checkNotNullParameter(props, "props");
        updateProps(reactTag, props, false);
    }

    public final void updatePropsSynchronously(int reactTag, @NotNull ReadableMap props) {
        Intrinsics.checkNotNullParameter(props, "props");
        updateProps(reactTag, props, true);
    }

    public final void updateState(int reactTag, StateWrapper stateWrapper) {
        UiThreadUtil.assertOnUiThread();
        if (this.isStopped) {
            return;
        }
        ViewState viewState = getViewState(reactTag);
        StateWrapper stateWrapper2 = viewState.getStateWrapper();
        viewState.setStateWrapper(stateWrapper);
        ViewManager<View, ?> viewManager = viewState.getViewManager();
        if (viewManager == null) {
            throw new IllegalStateException(kk.b.h(reactTag, "Unable to find ViewManager for tag: ").toString());
        }
        View view = viewState.getView();
        if (view == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Object objUpdateState = viewManager.updateState(view, viewState.getCurrentProps(), stateWrapper);
        if (objUpdateState != null) {
            viewManager.updateExtraData(view, objUpdateState);
        }
        if (stateWrapper2 != null) {
            stateWrapper2.destroyState();
        }
    }

    private final void updateProps(int reactTag, ReadableMap props, boolean shouldSkipSynchronousMountPropsOverride) {
        if (this.isStopped) {
            return;
        }
        ViewState nullableViewState = getNullableViewState(reactTag);
        if (nullableViewState == null) {
            ReactSoftExceptionLogger.logSoftException(ReactSoftExceptionLogger.Categories.SURFACE_MOUNTING_MANAGER_MISSING_VIEWSTATE, new ReactNoCrashSoftException(g.d(reactTag, "Unable to find viewState for tag ", " for updateProps")));
            return;
        }
        if (ReactNativeFeatureFlags.overrideBySynchronousMountPropsAtMountingAndroid() && !shouldSkipSynchronousMountPropsOverride && this.tagToSynchronousMountProps.b(reactTag)) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.merge(props);
            Object objC = this.tagToSynchronousMountProps.c(reactTag);
            if (objC == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Companion.overridePropsReadableMap((Map) objC, writableNativeMap);
            nullableViewState.setCurrentProps(new ReactStylesDiffMap(writableNativeMap));
        } else {
            nullableViewState.setCurrentProps(new ReactStylesDiffMap(props));
        }
        View view = nullableViewState.getView();
        if (view == null) {
            return;
        }
        ViewManager<View, ?> viewManager = nullableViewState.getViewManager();
        if (viewManager == null) {
            throw new IllegalStateException("Required value was null.");
        }
        viewManager.updateProperties(view, nullableViewState.getCurrentProps());
    }

    public final void enqueuePendingEvent(int reactTag, @NotNull String eventName, boolean canCoalesceEvent, WritableMap params, int eventCategory, long eventTimestamp) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        final ViewState viewStateRegistryGet = registryGet(reactTag);
        if (viewStateRegistryGet == null) {
            return;
        }
        final PendingViewEvent pendingViewEvent = new PendingViewEvent(eventName, params, eventCategory, canCoalesceEvent, eventTimestamp);
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.fabric.mounting.e
            @Override // java.lang.Runnable
            public final void run() {
                SurfaceMountingManager.enqueuePendingEvent$lambda$25(viewStateRegistryGet, pendingViewEvent);
            }
        });
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u00100\u001a\u000201H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010#\u001a\u0004\u0018\u00010$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R&\u0010)\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010*8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00062"}, d2 = {"Lcom/facebook/react/fabric/mounting/SurfaceMountingManager$ViewState;", "", "reactTag", "", "view", "Landroid/view/View;", "viewManager", "Lcom/facebook/react/uimanager/ViewManager;", "isRoot", "", "<init>", "(ILandroid/view/View;Lcom/facebook/react/uimanager/ViewManager;Z)V", "getReactTag", "()I", "getView", "()Landroid/view/View;", "setView", "(Landroid/view/View;)V", "getViewManager", "()Lcom/facebook/react/uimanager/ViewManager;", "setViewManager", "(Lcom/facebook/react/uimanager/ViewManager;)V", "()Z", "currentProps", "Lcom/facebook/react/uimanager/ReactStylesDiffMap;", "getCurrentProps", "()Lcom/facebook/react/uimanager/ReactStylesDiffMap;", "setCurrentProps", "(Lcom/facebook/react/uimanager/ReactStylesDiffMap;)V", "stateWrapper", "Lcom/facebook/react/uimanager/StateWrapper;", "getStateWrapper", "()Lcom/facebook/react/uimanager/StateWrapper;", "setStateWrapper", "(Lcom/facebook/react/uimanager/StateWrapper;)V", "eventEmitter", "Lcom/facebook/react/fabric/events/EventEmitterWrapper;", "getEventEmitter", "()Lcom/facebook/react/fabric/events/EventEmitterWrapper;", "setEventEmitter", "(Lcom/facebook/react/fabric/events/EventEmitterWrapper;)V", "pendingEventQueue", "Ljava/util/Queue;", "Lcom/facebook/react/fabric/mounting/SurfaceMountingManager$PendingViewEvent;", "getPendingEventQueue", "()Ljava/util/Queue;", "setPendingEventQueue", "(Ljava/util/Queue;)V", "toString", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ViewState {
        private ReactStylesDiffMap currentProps;
        private EventEmitterWrapper eventEmitter;
        private final boolean isRoot;
        private Queue<PendingViewEvent> pendingEventQueue;
        private final int reactTag;
        private StateWrapper stateWrapper;
        private View view;
        private ViewManager<View, ?> viewManager;

        public ViewState(int i7, View view, ViewManager<View, ?> viewManager, boolean z5) {
            this.reactTag = i7;
            this.view = view;
            this.viewManager = viewManager;
            this.isRoot = z5;
        }

        public final ReactStylesDiffMap getCurrentProps() {
            return this.currentProps;
        }

        public final EventEmitterWrapper getEventEmitter() {
            return this.eventEmitter;
        }

        public final Queue<PendingViewEvent> getPendingEventQueue() {
            return this.pendingEventQueue;
        }

        public final int getReactTag() {
            return this.reactTag;
        }

        public final StateWrapper getStateWrapper() {
            return this.stateWrapper;
        }

        public final View getView() {
            return this.view;
        }

        public final ViewManager<View, ?> getViewManager() {
            return this.viewManager;
        }

        /* JADX INFO: renamed from: isRoot, reason: from getter */
        public final boolean getIsRoot() {
            return this.isRoot;
        }

        public final void setCurrentProps(ReactStylesDiffMap reactStylesDiffMap) {
            this.currentProps = reactStylesDiffMap;
        }

        public final void setEventEmitter(EventEmitterWrapper eventEmitterWrapper) {
            this.eventEmitter = eventEmitterWrapper;
        }

        public final void setPendingEventQueue(Queue<PendingViewEvent> queue) {
            this.pendingEventQueue = queue;
        }

        public final void setStateWrapper(StateWrapper stateWrapper) {
            this.stateWrapper = stateWrapper;
        }

        public final void setView(View view) {
            this.view = view;
        }

        public final void setViewManager(ViewManager<View, ?> viewManager) {
            this.viewManager = viewManager;
        }

        @NotNull
        public String toString() {
            ViewManager<View, ?> viewManager = this.viewManager;
            boolean z5 = viewManager == null;
            return "ViewState [" + this.reactTag + "] - isRoot: " + this.isRoot + " - props: " + this.currentProps + " - viewManager: " + viewManager + " - isLayoutOnly: " + z5;
        }

        public /* synthetic */ ViewState(int i7, View view, ViewManager viewManager, boolean z5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(i7, (i10 & 2) != 0 ? null : view, (i10 & 4) != 0 ? null : viewManager, (i10 & 8) != 0 ? false : z5);
        }
    }

    public final void receiveCommand(int reactTag, @NotNull String commandId, ReadableArray commandArgs) {
        Intrinsics.checkNotNullParameter(commandId, "commandId");
        if (this.isStopped) {
            return;
        }
        ViewState nullableViewState = getNullableViewState(reactTag);
        if (nullableViewState != null) {
            ViewManager<View, ?> viewManager = nullableViewState.getViewManager();
            if (viewManager != null) {
                View view = nullableViewState.getView();
                if (view != null) {
                    viewManager.receiveCommand(view, commandId, commandArgs);
                    return;
                }
                throw new RetryableMountingLayerException(kk.b.h(reactTag, "Unable to find viewState view for tag "));
            }
            throw new RetryableMountingLayerException(kk.b.h(reactTag, "Unable to find viewState manager for tag "));
        }
        throw new RetryableMountingLayerException("Unable to find viewState for tag " + reactTag + " for commandId " + commandId);
    }
}
