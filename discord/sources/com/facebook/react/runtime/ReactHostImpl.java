package com.facebook.react.runtime;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.AppCompatDelegate;
import ar.b0;
import ar.k0;
import com.facebook.react.MemoryPressureRouter;
import com.facebook.react.ReactHost;
import com.facebook.react.ReactInstanceEventListener;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.MemoryPressureListener;
import com.facebook.react.bridge.NativeArray;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.queue.ReactQueueConfiguration;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.devsupport.DefaultDevSupportManagerFactory;
import com.facebook.react.devsupport.DevMenuConfiguration;
import com.facebook.react.devsupport.DevServerHelper;
import com.facebook.react.devsupport.DevSupportManagerBase;
import com.facebook.react.devsupport.DevSupportManagerFactory;
import com.facebook.react.devsupport.InspectorFlags;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.devsupport.inspector.FrameTimingSequence;
import com.facebook.react.devsupport.inspector.FrameTimingsObserver;
import com.facebook.react.devsupport.inspector.InspectorNetworkHelper;
import com.facebook.react.devsupport.inspector.InspectorNetworkRequestListener;
import com.facebook.react.devsupport.inspector.TracingState;
import com.facebook.react.devsupport.interfaces.BundleLoadCallback;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.fabric.ComponentFactory;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.interfaces.TaskInterface;
import com.facebook.react.interfaces.fabric.ReactSurface;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.internal.featureflags.ReactNativeNewArchitectureFeatureFlags;
import com.facebook.react.modules.appearance.AppearanceModule;
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.systeminfo.AndroidInfoHelpers;
import com.facebook.react.packagerconnection.PackagerConnectionSettings;
import com.facebook.react.runtime.internal.bolts.Task;
import com.facebook.react.runtime.internal.bolts.TaskCompletionSource;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import com.facebook.react.uimanager.DisplayMetricsHolder;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.BlackHoleEventDispatcher;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.imagehelper.ResourceDrawableIdHelper;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.n0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@xa.a
@Metadata(d1 = {"\u0000º\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 È\u00022\u00020\u0001:\u0004É\u0002È\u0002BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011B1\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0013J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001d\u0010\u001bJ\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001f\u0010\u001bJ#\u0010&\u001a\u00020%2\b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010$\u001a\u0004\u0018\u00010#H\u0017¢\u0006\u0004\b&\u0010'J\u0019\u0010&\u001a\u00020%2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0017¢\u0006\u0004\b&\u0010(J\u0019\u0010)\u001a\u00020%2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0017¢\u0006\u0004\b)\u0010(J\u0019\u0010*\u001a\u00020%2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0017¢\u0006\u0004\b*\u0010(J\u000f\u0010*\u001a\u00020%H\u0017¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020%H\u0017¢\u0006\u0004\b,\u0010+J\u0019\u0010,\u001a\u00020%2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0017¢\u0006\u0004\b,\u0010(J)\u00102\u001a\u0002012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010.\u001a\u00020-2\b\u00100\u001a\u0004\u0018\u00010/H\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u000bH\u0017¢\u0006\u0004\b4\u00105J\u0017\u00108\u001a\u00020%2\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020%2\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b:\u00109J\u0017\u0010=\u001a\u00020%2\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b=\u0010>J\u001d\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010?\u001a\u00020-H\u0016¢\u0006\u0004\b@\u0010AJA\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010?\u001a\u00020-2\u000e\u0010D\u001a\n\u0018\u00010Bj\u0004\u0018\u0001`C2\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020%0EH\u0016¢\u0006\u0004\bG\u0010HJ-\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010?\u001a\u00020-2\u000e\u0010D\u001a\n\u0018\u00010Bj\u0004\u0018\u0001`CH\u0016¢\u0006\u0004\bG\u0010IJ'\u0010P\u001a\u00020\u000b\"\b\b\u0000\u0010K*\u00020J2\f\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00000LH\u0000¢\u0006\u0004\bN\u0010OJ)\u0010S\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010K*\u00020J2\f\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00000LH\u0000¢\u0006\u0004\bQ\u0010RJ\u0019\u0010S\u001a\u0004\u0018\u00010J2\u0006\u0010T\u001a\u00020-H\u0000¢\u0006\u0004\bQ\u0010UJ1\u0010[\u001a\u00020%2\u0006\u0010\"\u001a\u00020!2\u0006\u0010W\u001a\u00020V2\u0006\u0010X\u001a\u00020V2\b\u0010Z\u001a\u0004\u0018\u00010YH\u0017¢\u0006\u0004\b[\u0010\\J\u0017\u0010^\u001a\u00020%2\u0006\u0010]\u001a\u00020\u000bH\u0017¢\u0006\u0004\b^\u0010_J\u0017\u0010a\u001a\u00020%2\u0006\u0010`\u001a\u00020YH\u0017¢\u0006\u0004\ba\u0010bJ\u0017\u0010d\u001a\u00020%2\u0006\u0010c\u001a\u00020-H\u0017¢\u0006\u0004\bd\u0010eJK\u0010d\u001a\u00020%2\u0006\u0010f\u001a\u00020-2\u0006\u0010.\u001a\u00020-2*\u0010h\u001a&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-0g\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-0g0EH\u0017¢\u0006\u0004\bd\u0010iJ\u0017\u0010j\u001a\u00020%2\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\bj\u0010kJ\u001d\u0010q\u001a\b\u0012\u0004\u0012\u00020\u000b0n2\u0006\u0010m\u001a\u00020lH\u0000¢\u0006\u0004\bo\u0010pJ/\u0010x\u001a\b\u0012\u0004\u0012\u00020\u000b0n2\u0006\u0010r\u001a\u00020V2\u0006\u0010s\u001a\u00020-2\b\u0010u\u001a\u0004\u0018\u00010tH\u0000¢\u0006\u0004\bv\u0010wJ\u001b\u0010|\u001a\u00020%2\n\u0010y\u001a\u00060Bj\u0002`CH\u0000¢\u0006\u0004\bz\u0010{J0\u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0n2\u0006\u0010.\u001a\u00020-2\u0006\u0010}\u001a\u00020-2\u0006\u0010\u007f\u001a\u00020~H\u0000¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u001a\u0010\u0085\u0001\u001a\u00020%2\u0006\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\u001a\u0010\u0087\u0001\u001a\u00020%2\u0006\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0006\b\u0086\u0001\u0010\u0084\u0001J\u001a\u0010\u008a\u0001\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u001a\u0010\u008d\u0001\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020-H\u0000¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\"\u0010\u0090\u0001\u001a\u00020%2\u000e\u0010\u008f\u0001\u001a\t\u0012\u0004\u0012\u00020%0\u008e\u0001H\u0016¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J\"\u0010\u0092\u0001\u001a\u00020%2\u000e\u0010\u008f\u0001\u001a\t\u0012\u0004\u0012\u00020%0\u008e\u0001H\u0016¢\u0006\u0006\b\u0092\u0001\u0010\u0091\u0001J\u0015\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0093\u0001H\u0000¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\u001e\u0010\u009b\u0001\u001a\u00020%2\n\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0097\u0001H\u0001¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\u0011\u0010\u009c\u0001\u001a\u00020%H\u0016¢\u0006\u0005\b\u009c\u0001\u0010+J\u001a\u0010\u009e\u0001\u001a\u00020%2\u0007\u0010\u009d\u0001\u001a\u00020\u000bH\u0002¢\u0006\u0005\b\u009e\u0001\u0010_J\u001c\u0010 \u0001\u001a\u00020%2\t\u0010\u009f\u0001\u001a\u0004\u0018\u00010-H\u0003¢\u0006\u0005\b \u0001\u0010eJ$\u0010£\u0001\u001a\u00020%2\u0007\u0010¡\u0001\u001a\u00020-2\u0007\u00107\u001a\u00030¢\u0001H\u0003¢\u0006\u0006\b£\u0001\u0010¤\u0001J\u001a\u0010¦\u0001\u001a\u00020%2\u0007\u0010¥\u0001\u001a\u00020-H\u0003¢\u0006\u0005\b¦\u0001\u0010eJ&\u0010©\u0001\u001a\u0004\u0018\u00010-2\u0007\u0010§\u0001\u001a\u00020-2\u0007\u0010¨\u0001\u001a\u00020VH\u0003¢\u0006\u0006\b©\u0001\u0010ª\u0001J\u001d\u0010¬\u0001\u001a\u00030«\u00012\b\u0010\u0098\u0001\u001a\u00030\u0097\u0001H\u0002¢\u0006\u0006\b¬\u0001\u0010\u00ad\u0001J\u0018\u0010®\u0001\u001a\b\u0012\u0004\u0012\u00020\u00150nH\u0003¢\u0006\u0006\b®\u0001\u0010¯\u0001J\u001e\u0010²\u0001\u001a\u00020%2\n\u0010±\u0001\u001a\u0005\u0018\u00010°\u0001H\u0003¢\u0006\u0006\b²\u0001\u0010³\u0001J2\u0010·\u0001\u001a\u00020%2\u0007\u0010´\u0001\u001a\u00020-2\u0007\u0010\u009f\u0001\u001a\u00020-2\f\b\u0002\u0010¶\u0001\u001a\u0005\u0018\u00010µ\u0001H\u0002¢\u0006\u0006\b·\u0001\u0010¸\u0001JB\u0010»\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0n2\u0007\u0010´\u0001\u001a\u00020-2\t\b\u0002\u0010¹\u0001\u001a\u00020\b2\u0014\u0010º\u0001\u001a\u000f\u0012\u0005\u0012\u00030\u0097\u0001\u0012\u0004\u0012\u00020%0EH\u0002¢\u0006\u0006\b»\u0001\u0010¼\u0001JB\u0010½\u0001\u001a\b\u0012\u0004\u0012\u00020\u00150n2\u0007\u0010´\u0001\u001a\u00020-2\t\b\u0002\u0010¹\u0001\u001a\u00020\b2\u0014\u0010º\u0001\u001a\u000f\u0012\u0005\u0012\u00030\u0097\u0001\u0012\u0004\u0012\u00020%0EH\u0002¢\u0006\u0006\b½\u0001\u0010¼\u0001J\u0019\u0010¾\u0001\u001a\t\u0012\u0005\u0012\u00030\u0097\u00010nH\u0002¢\u0006\u0006\b¾\u0001\u0010¯\u0001J\u0019\u0010¿\u0001\u001a\t\u0012\u0005\u0012\u00030\u0097\u00010nH\u0003¢\u0006\u0006\b¿\u0001\u0010¯\u0001J+\u0010Â\u0001\u001a\t\u0012\u0005\u0012\u00030\u0097\u00010n2\u0007\u0010À\u0001\u001a\u00020V2\u0007\u0010Á\u0001\u001a\u00020VH\u0003¢\u0006\u0006\bÂ\u0001\u0010Ã\u0001J\u0019\u0010Ä\u0001\u001a\t\u0012\u0005\u0012\u00030\u0097\u00010nH\u0003¢\u0006\u0006\bÄ\u0001\u0010¯\u0001J\u0018\u0010Å\u0001\u001a\b\u0012\u0004\u0012\u00020l0nH\u0002¢\u0006\u0006\bÅ\u0001\u0010¯\u0001J%\u0010Ç\u0001\u001a\u00020%2\u0007\u0010Æ\u0001\u001a\u00020-2\b\u0010\u0098\u0001\u001a\u00030\u0097\u0001H\u0002¢\u0006\u0006\bÇ\u0001\u0010È\u0001J%\u0010É\u0001\u001a\u00020%2\u0007\u0010Æ\u0001\u001a\u00020-2\b\u0010\u0098\u0001\u001a\u00030\u0097\u0001H\u0002¢\u0006\u0006\bÉ\u0001\u0010È\u0001JI\u0010Ì\u0001\u001a\u001f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0097\u00010n\u0012\u0004\u0012\u00020-\u0012\u0007\u0012\u0005\u0018\u00010\u0097\u00010Ë\u00012\u0007\u0010Ê\u0001\u001a\u00020-2\u0007\u0010Æ\u0001\u001a\u00020-2\u0006\u0010?\u001a\u00020-H\u0002¢\u0006\u0006\bÌ\u0001\u0010Í\u0001J!\u0010Î\u0001\u001a\t\u0012\u0005\u0012\u00030\u0097\u00010n2\u0006\u0010?\u001a\u00020-H\u0003¢\u0006\u0006\bÎ\u0001\u0010Ï\u0001J0\u0010Ð\u0001\u001a\b\u0012\u0004\u0012\u00020\u00150n2\u0006\u0010?\u001a\u00020-2\u000e\u0010D\u001a\n\u0018\u00010Bj\u0004\u0018\u0001`CH\u0003¢\u0006\u0006\bÐ\u0001\u0010Ñ\u0001J\u0013\u0010Ò\u0001\u001a\u00030\u0093\u0001H\u0002¢\u0006\u0006\bÒ\u0001\u0010\u0095\u0001J\u0011\u0010Ó\u0001\u001a\u00020%H\u0002¢\u0006\u0005\bÓ\u0001\u0010+R\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0003\u0010Ô\u0001R\u0015\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0005\u0010Õ\u0001R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010Ö\u0001R\u0015\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\t\u0010×\u0001R\u0015\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\n\u0010×\u0001R\u0015\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\f\u0010Ø\u0001R\u0015\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\r\u0010Ø\u0001R\u0018\u0010Ú\u0001\u001a\u00030Ù\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÚ\u0001\u0010Û\u0001R \u0010Ý\u0001\u001a\u00030Ü\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÝ\u0001\u0010Þ\u0001\u001a\u0006\bß\u0001\u0010à\u0001R \u0010â\u0001\u001a\u00030á\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bâ\u0001\u0010ã\u0001\u001a\u0006\bä\u0001\u0010å\u0001R\u001e\u0010ç\u0001\u001a\t\u0012\u0004\u0012\u00020\u00180æ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bç\u0001\u0010è\u0001R%\u0010ê\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0097\u00010n0é\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bê\u0001\u0010ë\u0001R\u001c\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0097\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0001\u0010ì\u0001R\u001f\u0010î\u0001\u001a\n\u0012\u0005\u0012\u00030í\u00010é\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bî\u0001\u0010ë\u0001R\u0017\u0010ï\u0001\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bï\u0001\u0010ð\u0001R\u001e\u0010\"\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010!0ñ\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\"\u0010ò\u0001R9\u0010õ\u0001\u001a$\u0012\u001f\u0012\u001d\u0012\u0006\u0012\u0004\u0018\u00010! ô\u0001*\r\u0012\u0006\u0012\u0004\u0018\u00010!\u0018\u00010ó\u00010ó\u00010ñ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bõ\u0001\u0010ò\u0001R\u0018\u0010÷\u0001\u001a\u00030ö\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b÷\u0001\u0010ø\u0001R\u0018\u0010ú\u0001\u001a\u00030ù\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bú\u0001\u0010û\u0001R\u001c\u0010ü\u0001\u001a\u0005\u0018\u00010«\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bü\u0001\u0010ý\u0001R\u001b\u0010þ\u0001\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bþ\u0001\u0010ÿ\u0001R$\u0010\u0081\u0002\u001a\u000f\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u000b0\u0080\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0002\u0010\u0082\u0002R\u001e\u0010\u0084\u0002\u001a\t\u0012\u0004\u0012\u0002060\u0083\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0002\u0010\u0085\u0002R%\u0010\u0086\u0002\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020%0\u008e\u00010\u0083\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0002\u0010\u0085\u0002R,\u0010\u0087\u0002\u001a\u0005\u0018\u00010\u0093\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0087\u0002\u0010\u0088\u0002\u001a\u0006\b\u0089\u0002\u0010\u0095\u0001\"\u0006\b\u008a\u0002\u0010\u008b\u0002R\u001c\u0010\u008d\u0002\u001a\u0005\u0018\u00010\u008c\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0002\u0010\u008e\u0002R\u0019\u0010\u008f\u0002\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0002\u0010Ø\u0001R!\u0010\u0090\u0002\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010n8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0090\u0002\u0010\u0091\u0002R\"\u0010\u0092\u0002\u001a\u000b\u0012\u0005\u0012\u00030\u0097\u0001\u0018\u00010n8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0092\u0002\u0010\u0091\u0002R!\u0010\u0093\u0002\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010n8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0093\u0002\u0010\u0091\u0002R\u0018\u0010\u0097\u0002\u001a\u00030\u0094\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0095\u0002\u0010\u0096\u0002R\u001a\u0010\u009a\u0002\u001a\u0005\u0018\u00010°\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0098\u0002\u0010\u0099\u0002R\u0016\u0010\u009c\u0002\u001a\u00020\u000b8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u009b\u0002\u00105R\u001a\u0010 \u0002\u001a\u0005\u0018\u00010\u009d\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009e\u0002\u0010\u009f\u0002R,\u0010¤\u0002\u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010!8@@BX\u0080\u000e¢\u0006\u000f\u001a\u0006\b¡\u0002\u0010¢\u0002\"\u0005\b£\u0002\u0010(R\u0019\u0010¦\u0002\u001a\u0004\u0018\u00010!8@X\u0080\u0004¢\u0006\b\u001a\u0006\b¥\u0002\u0010¢\u0002R\u0018\u0010ª\u0002\u001a\u00030§\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b¨\u0002\u0010©\u0002R\u001a\u0010®\u0002\u001a\u0005\u0018\u00010«\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b¬\u0002\u0010\u00ad\u0002R\u001e\u0010²\u0002\u001a\t\u0012\u0004\u0012\u00020J0¯\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b°\u0002\u0010±\u0002R\u001a\u0010¶\u0002\u001a\u0005\u0018\u00010³\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b´\u0002\u0010µ\u0002R\u001a\u0010º\u0002\u001a\u0005\u0018\u00010·\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b¸\u0002\u0010¹\u0002R\u001a\u0010¾\u0002\u001a\u0005\u0018\u00010»\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b¼\u0002\u0010½\u0002R\u0017\u0010Á\u0002\u001a\u00020#8@X\u0080\u0004¢\u0006\b\u001a\u0006\b¿\u0002\u0010À\u0002R%\u0010Ä\u0002\u001a\u0010\u0012\u0004\u0012\u00020-\u0012\u0006\u0012\u0004\u0018\u00010-0g8CX\u0082\u0004¢\u0006\b\u001a\u0006\bÂ\u0002\u0010Ã\u0002R\u001d\u0010Æ\u0002\u001a\b\u0012\u0004\u0012\u00020l0n8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÅ\u0002\u0010¯\u0001R\u001d\u0010Ç\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0n8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÇ\u0002\u0010¯\u0001¨\u0006Ê\u0002"}, d2 = {"Lcom/facebook/react/runtime/ReactHostImpl;", "Lcom/facebook/react/ReactHost;", "Landroid/content/Context;", "context", "Lcom/facebook/react/runtime/ReactHostDelegate;", "reactHostDelegate", "Lcom/facebook/react/fabric/ComponentFactory;", "componentFactory", "Ljava/util/concurrent/Executor;", "bgExecutor", "uiExecutor", "", "allowPackagerServerAccess", "useDevSupport", "Lcom/facebook/react/devsupport/DevSupportManagerFactory;", "devSupportManagerFactory", "<init>", "(Landroid/content/Context;Lcom/facebook/react/runtime/ReactHostDelegate;Lcom/facebook/react/fabric/ComponentFactory;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;ZZLcom/facebook/react/devsupport/DevSupportManagerFactory;)V", "delegate", "(Landroid/content/Context;Lcom/facebook/react/runtime/ReactHostDelegate;Lcom/facebook/react/fabric/ComponentFactory;ZZ)V", "Lcom/facebook/react/interfaces/TaskInterface;", "Ljava/lang/Void;", ViewProps.START, "()Lcom/facebook/react/interfaces/TaskInterface;", "Lcom/facebook/react/runtime/ReactSurfaceImpl;", "surface", "prerenderSurface$ReactAndroid_release", "(Lcom/facebook/react/runtime/ReactSurfaceImpl;)Lcom/facebook/react/interfaces/TaskInterface;", "prerenderSurface", "startSurface$ReactAndroid_release", "startSurface", "stopSurface$ReactAndroid_release", "stopSurface", "Landroid/app/Activity;", "activity", "Lcom/facebook/react/modules/core/DefaultHardwareBackBtnHandler;", "defaultBackButtonImpl", "", "onHostResume", "(Landroid/app/Activity;Lcom/facebook/react/modules/core/DefaultHardwareBackBtnHandler;)V", "(Landroid/app/Activity;)V", "onHostLeaveHint", "onHostPause", "()V", "onHostDestroy", "", "moduleName", "Landroid/os/Bundle;", "initialProps", "Lcom/facebook/react/interfaces/fabric/ReactSurface;", "createSurface", "(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Lcom/facebook/react/interfaces/fabric/ReactSurface;", "onBackPressed", "()Z", "Lcom/facebook/react/ReactInstanceEventListener;", "listener", "addReactInstanceEventListener", "(Lcom/facebook/react/ReactInstanceEventListener;)V", "removeReactInstanceEventListener", "Lcom/facebook/react/devsupport/DevMenuConfiguration;", "config", "setDevMenuConfiguration", "(Lcom/facebook/react/devsupport/DevMenuConfiguration;)V", "reason", "reload", "(Ljava/lang/String;)Lcom/facebook/react/interfaces/TaskInterface;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "ex", "Lkotlin/Function1;", "onDestroyFinished", "destroy", "(Ljava/lang/String;Ljava/lang/Exception;Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/interfaces/TaskInterface;", "(Ljava/lang/String;Ljava/lang/Exception;)Lcom/facebook/react/interfaces/TaskInterface;", "Lcom/facebook/react/bridge/NativeModule;", "T", "Ljava/lang/Class;", "nativeModuleInterface", "hasNativeModule$ReactAndroid_release", "(Ljava/lang/Class;)Z", "hasNativeModule", "getNativeModule$ReactAndroid_release", "(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;", "getNativeModule", "nativeModuleName", "(Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(Landroid/app/Activity;IILandroid/content/Intent;)V", "hasFocus", "onWindowFocusChange", "(Z)V", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "filePath", "setBundleSource", "(Ljava/lang/String;)V", "debugServerHost", "", "queryMapper", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "onConfigurationChanged", "(Landroid/content/Context;)V", "Lcom/facebook/react/bridge/JSBundleLoader;", "bundleLoader", "Lcom/facebook/react/runtime/internal/bolts/Task;", "loadBundle$ReactAndroid_release", "(Lcom/facebook/react/bridge/JSBundleLoader;)Lcom/facebook/react/runtime/internal/bolts/Task;", "loadBundle", "segmentId", "path", "Lcom/facebook/react/bridge/Callback;", "callback", "registerSegment$ReactAndroid_release", "(ILjava/lang/String;Lcom/facebook/react/bridge/Callback;)Lcom/facebook/react/runtime/internal/bolts/Task;", "registerSegment", "e", "handleHostException$ReactAndroid_release", "(Ljava/lang/Exception;)V", "handleHostException", "methodName", "Lcom/facebook/react/bridge/NativeArray;", "args", "callFunctionOnModule$ReactAndroid_release", "(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/NativeArray;)Lcom/facebook/react/runtime/internal/bolts/Task;", "callFunctionOnModule", "attachSurface$ReactAndroid_release", "(Lcom/facebook/react/runtime/ReactSurfaceImpl;)V", "attachSurface", "detachSurface$ReactAndroid_release", "detachSurface", "isSurfaceAttached$ReactAndroid_release", "(Lcom/facebook/react/runtime/ReactSurfaceImpl;)Z", "isSurfaceAttached", "isSurfaceWithModuleNameAttached$ReactAndroid_release", "(Ljava/lang/String;)Z", "isSurfaceWithModuleNameAttached", "Lkotlin/Function0;", "onBeforeDestroy", "addBeforeDestroyListener", "(Lkotlin/jvm/functions/Function0;)V", "removeBeforeDestroyListener", "Lcom/facebook/react/runtime/ReactHostInspectorTarget;", "getOrCreateReactHostInspectorTarget$ReactAndroid_release", "()Lcom/facebook/react/runtime/ReactHostInspectorTarget;", "getOrCreateReactHostInspectorTarget", "Lcom/facebook/react/runtime/ReactInstance;", "reactInstance", "unregisterInstanceFromInspector$ReactAndroid_release", "(Lcom/facebook/react/runtime/ReactInstance;)V", "unregisterInstanceFromInspector", "invalidate", ViewProps.ENABLED, "maybeEnableDevSupport", "message", "setPausedInDebuggerMessage", "url", "Lcom/facebook/react/devsupport/inspector/InspectorNetworkRequestListener;", "loadNetworkResource", "(Ljava/lang/String;Lcom/facebook/react/devsupport/inspector/InspectorNetworkRequestListener;)V", "colorScheme", "setEmulatedMedia", "format", "quality", "captureScreenshot", "(Ljava/lang/String;I)Ljava/lang/String;", "Lcom/facebook/react/bridge/MemoryPressureListener;", "createMemoryPressureListener", "(Lcom/facebook/react/runtime/ReactInstance;)Lcom/facebook/react/bridge/MemoryPressureListener;", "getOrCreateStartTask", "()Lcom/facebook/react/runtime/internal/bolts/Task;", "Lcom/facebook/react/bridge/ReactContext;", "currentContext", "moveToHostDestroy", "(Lcom/facebook/react/bridge/ReactContext;)V", "callingMethod", "", "throwable", "raiseSoftException", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "executor", "runnable", "callWithExistingReactInstance", "(Ljava/lang/String;Ljava/util/concurrent/Executor;Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/runtime/internal/bolts/Task;", "callAfterGetOrCreateReactInstance", "getOrCreateReactInstance", "waitThenCallGetOrCreateReactInstanceTask", "tryNum", "maxTries", "waitThenCallGetOrCreateReactInstanceTaskWithRetries", "(II)Lcom/facebook/react/runtime/internal/bolts/Task;", "getOrCreateReactInstanceTask", "loadJSBundleFromMetro", "method", "stopAttachedSurfaces", "(Ljava/lang/String;Lcom/facebook/react/runtime/ReactInstance;)V", "startAttachedSurfaces", "tag", "Lkotlin/Function2;", "createReactInstanceUnwrapper", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lkotlin/jvm/functions/Function2;", "getOrCreateReloadTask", "(Ljava/lang/String;)Lcom/facebook/react/runtime/internal/bolts/Task;", "getOrCreateDestroyTask", "(Ljava/lang/String;Ljava/lang/Exception;)Lcom/facebook/react/runtime/internal/bolts/Task;", "createReactHostInspectorTarget", "destroyReactHostInspectorTarget", "Landroid/content/Context;", "Lcom/facebook/react/runtime/ReactHostDelegate;", "Lcom/facebook/react/fabric/ComponentFactory;", "Ljava/util/concurrent/Executor;", "Z", "Lcom/facebook/react/runtime/ReactHostImplDevHelper;", "reactHostImplDevHelper", "Lcom/facebook/react/runtime/ReactHostImplDevHelper;", "Lcom/facebook/react/devsupport/interfaces/DevSupportManager;", "devSupportManager", "Lcom/facebook/react/devsupport/interfaces/DevSupportManager;", "getDevSupportManager", "()Lcom/facebook/react/devsupport/interfaces/DevSupportManager;", "Lcom/facebook/react/MemoryPressureRouter;", "memoryPressureRouter", "Lcom/facebook/react/MemoryPressureRouter;", "getMemoryPressureRouter", "()Lcom/facebook/react/MemoryPressureRouter;", "", "attachedSurfaces", "Ljava/util/Set;", "Lcom/facebook/react/runtime/BridgelessAtomicRef;", "createReactInstanceTaskRef", "Lcom/facebook/react/runtime/BridgelessAtomicRef;", "Lcom/facebook/react/runtime/ReactInstance;", "Lcom/facebook/react/runtime/BridgelessReactContext;", "bridgelessReactContextRef", StackTraceHelper.ID_KEY, "I", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "lastUsedActivityRef", "Lcom/facebook/react/runtime/ReactHostStateTracker;", "stateTracker", "Lcom/facebook/react/runtime/ReactHostStateTracker;", "Lcom/facebook/react/runtime/ReactLifecycleStateManager;", "reactLifecycleStateManager", "Lcom/facebook/react/runtime/ReactLifecycleStateManager;", "memoryPressureListener", "Lcom/facebook/react/bridge/MemoryPressureListener;", "defaultHardwareBackBtnHandler", "Lcom/facebook/react/modules/core/DefaultHardwareBackBtnHandler;", "", "activeActivities", "Ljava/util/Map;", "", "reactInstanceEventListeners", "Ljava/util/List;", "beforeDestroyListeners", "reactHostInspectorTarget", "Lcom/facebook/react/runtime/ReactHostInspectorTarget;", "getReactHostInspectorTarget$ReactAndroid_release", "setReactHostInspectorTarget$ReactAndroid_release", "(Lcom/facebook/react/runtime/ReactHostInspectorTarget;)V", "Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver;", "frameTimingsObserver", "Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver;", "hostInvalidated", "startTask", "Lcom/facebook/react/runtime/internal/bolts/Task;", "reloadTask", "destroyTask", "Lcom/facebook/react/common/LifecycleState;", "getLifecycleState", "()Lcom/facebook/react/common/LifecycleState;", "lifecycleState", "getCurrentReactContext", "()Lcom/facebook/react/bridge/ReactContext;", "currentReactContext", "isInstanceInitialized$ReactAndroid_release", "isInstanceInitialized", "Lcom/facebook/react/bridge/queue/ReactQueueConfiguration;", "getReactQueueConfiguration", "()Lcom/facebook/react/bridge/queue/ReactQueueConfiguration;", "reactQueueConfiguration", "getCurrentActivity$ReactAndroid_release", "()Landroid/app/Activity;", "setCurrentActivity", "currentActivity", "getLastUsedActivity$ReactAndroid_release", "lastUsedActivity", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "getEventDispatcher$ReactAndroid_release", "()Lcom/facebook/react/uimanager/events/EventDispatcher;", "eventDispatcher", "Lcom/facebook/react/fabric/FabricUIManager;", "getUiManager$ReactAndroid_release", "()Lcom/facebook/react/fabric/FabricUIManager;", "uiManager", "", "getNativeModules$ReactAndroid_release", "()Ljava/util/Collection;", "nativeModules", "Lcom/facebook/react/bridge/RuntimeExecutor;", "getRuntimeExecutor$ReactAndroid_release", "()Lcom/facebook/react/bridge/RuntimeExecutor;", "runtimeExecutor", "Lcom/facebook/react/turbomodule/core/interfaces/CallInvokerHolder;", "getJsCallInvokerHolder$ReactAndroid_release", "()Lcom/facebook/react/turbomodule/core/interfaces/CallInvokerHolder;", "jsCallInvokerHolder", "Lcom/facebook/react/bridge/JavaScriptContextHolder;", "getJavaScriptContextHolder$ReactAndroid_release", "()Lcom/facebook/react/bridge/JavaScriptContextHolder;", "javaScriptContextHolder", "getDefaultBackButtonHandler$ReactAndroid_release", "()Lcom/facebook/react/modules/core/DefaultHardwareBackBtnHandler;", "defaultBackButtonHandler", "getHostMetadata", "()Ljava/util/Map;", "hostMetadata", "getJsBundleLoader", "jsBundleLoader", "isMetroRunning", "Companion", "CreationResult", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReactHostImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactHostImpl.kt\ncom/facebook/react/runtime/ReactHostImpl\n+ 2 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1687:1\n90#2,6:1688\n1869#3,2:1694\n1761#3,3:1697\n1#4:1696\n*S KotlinDebug\n*F\n+ 1 ReactHostImpl.kt\ncom/facebook/react/runtime/ReactHostImpl\n*L\n488#1:1688,6\n757#1:1694,2\n845#1:1697,3\n*E\n"})
public final class ReactHostImpl implements ReactHost {
    private static final int BRIDGELESS_MARKER_INSTANCE_KEY = 1;

    @NotNull
    private static final String TAG = "ReactHost";

    @NotNull
    private final Map<Activity, Boolean> activeActivities;

    @NotNull
    private final AtomicReference<Activity> activity;
    private final boolean allowPackagerServerAccess;

    @NotNull
    private final Set<ReactSurfaceImpl> attachedSurfaces;

    @NotNull
    private final List<Function0<Unit>> beforeDestroyListeners;

    @NotNull
    private final Executor bgExecutor;

    @NotNull
    private final BridgelessAtomicRef<BridgelessReactContext> bridgelessReactContextRef;

    @NotNull
    private final ComponentFactory componentFactory;

    @NotNull
    private final Context context;

    @NotNull
    private final BridgelessAtomicRef<Task<ReactInstance>> createReactInstanceTaskRef;
    private DefaultHardwareBackBtnHandler defaultHardwareBackBtnHandler;
    private Task<Void> destroyTask;

    @NotNull
    private final DevSupportManager devSupportManager;
    private FrameTimingsObserver frameTimingsObserver;
    private volatile boolean hostInvalidated;
    private final int id;

    @NotNull
    private final AtomicReference<WeakReference<Activity>> lastUsedActivityRef;
    private MemoryPressureListener memoryPressureListener;

    @NotNull
    private final MemoryPressureRouter memoryPressureRouter;

    @NotNull
    private final ReactHostDelegate reactHostDelegate;

    @NotNull
    private final ReactHostImplDevHelper reactHostImplDevHelper;
    private ReactHostInspectorTarget reactHostInspectorTarget;
    private ReactInstance reactInstance;

    @NotNull
    private final List<ReactInstanceEventListener> reactInstanceEventListeners;

    @NotNull
    private final ReactLifecycleStateManager reactLifecycleStateManager;
    private Task<ReactInstance> reloadTask;
    private Task<Void> startTask;

    @NotNull
    private final ReactHostStateTracker stateTracker;

    @NotNull
    private final Executor uiExecutor;
    private final boolean useDevSupport;

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final AtomicInteger counter = new AtomicInteger(0);

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/facebook/react/runtime/ReactHostImpl$Companion;", "", "<init>", "()V", "TAG", "", "BRIDGELESS_MARKER_INSTANCE_KEY", "", "counter", "Ljava/util/concurrent/atomic/AtomicInteger;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/facebook/react/runtime/ReactHostImpl$CreationResult;", "", "instance", "Lcom/facebook/react/runtime/ReactInstance;", "context", "Lcom/facebook/react/bridge/ReactContext;", "isReloading", "", "<init>", "(Lcom/facebook/react/runtime/ReactInstance;Lcom/facebook/react/bridge/ReactContext;Z)V", "getInstance", "()Lcom/facebook/react/runtime/ReactInstance;", "getContext", "()Lcom/facebook/react/bridge/ReactContext;", "()Z", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CreationResult {

        @NotNull
        private final ReactContext context;

        @NotNull
        private final ReactInstance instance;
        private final boolean isReloading;

        public CreationResult(@NotNull ReactInstance instance, @NotNull ReactContext context, boolean z5) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(context, "context");
            this.instance = instance;
            this.context = context;
            this.isReloading = z5;
        }

        @NotNull
        public final ReactContext getContext() {
            return this.context;
        }

        @NotNull
        public final ReactInstance getInstance() {
            return this.instance;
        }

        /* JADX INFO: renamed from: isReloading, reason: from getter */
        public final boolean getIsReloading() {
            return this.isReloading;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TracingState.values().length];
            try {
                iArr[TracingState.ENABLED_IN_BACKGROUND_MODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TracingState.ENABLED_IN_CDP_MODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TracingState.DISABLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.runtime.ReactHostImpl$setBundleSource$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.facebook.react.runtime.ReactHostImpl$setBundleSource$1", f = "ReactHostImpl.kt", l = {}, m = "invokeSuspend")
    public static final class C02541 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ String $debugServerHost;
        final /* synthetic */ String $moduleName;
        final /* synthetic */ Function1<Map<String, String>, Map<String, String>> $queryMapper;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C02541(Function1<? super Map<String, String>, ? extends Map<String, String>> function1, String str, String str2, Continuation continuation) {
            super(2, continuation);
            this.$queryMapper = function1;
            this.$debugServerHost = str;
            this.$moduleName = str2;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return ReactHostImpl.this.new C02541(this.$queryMapper, this.$debugServerHost, this.$moduleName, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ib.a.L(obj);
            DevSupportManager devSupportManager = ReactHostImpl.this.getDevSupportManager();
            Intrinsics.checkNotNull(devSupportManager, "null cannot be cast to non-null type com.facebook.react.devsupport.DevSupportManagerBase");
            ((DevSupportManagerBase) devSupportManager).getDevServerHelper().closePackagerConnection();
            PackagerConnectionSettings packagerConnectionSettings = ((DevSupportManagerBase) ReactHostImpl.this.getDevSupportManager()).getDevSettings().getPackagerConnectionSettings();
            packagerConnectionSettings.setPackagerOptionsUpdater(this.$queryMapper);
            packagerConnectionSettings.setDebugServerHost(this.$debugServerHost);
            ((DevSupportManagerBase) ReactHostImpl.this.getDevSupportManager()).setJsAppBundleName(this.$moduleName);
            ReactHostImpl.this.reload("Changed bundle source");
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C02541) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    public ReactHostImpl(@NotNull Context context, @NotNull ReactHostDelegate reactHostDelegate, @NotNull ComponentFactory componentFactory, @NotNull Executor bgExecutor, @NotNull Executor uiExecutor, boolean z5, boolean z6, DevSupportManagerFactory devSupportManagerFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reactHostDelegate, "reactHostDelegate");
        Intrinsics.checkNotNullParameter(componentFactory, "componentFactory");
        Intrinsics.checkNotNullParameter(bgExecutor, "bgExecutor");
        Intrinsics.checkNotNullParameter(uiExecutor, "uiExecutor");
        this.context = context;
        this.reactHostDelegate = reactHostDelegate;
        this.componentFactory = componentFactory;
        this.bgExecutor = bgExecutor;
        this.uiExecutor = uiExecutor;
        this.allowPackagerServerAccess = z5;
        this.useDevSupport = z6;
        ReactHostImplDevHelper reactHostImplDevHelper = new ReactHostImplDevHelper(this);
        this.reactHostImplDevHelper = reactHostImplDevHelper;
        DevSupportManagerFactory defaultDevSupportManagerFactory = devSupportManagerFactory == null ? new DefaultDevSupportManagerFactory() : devSupportManagerFactory;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        DevSupportManager devSupportManagerCreate = defaultDevSupportManagerFactory.create(applicationContext, reactHostImplDevHelper, reactHostDelegate.getJsMainModulePath(), true, null, null, 2, null, null, null, null, z6);
        if (devSupportManagerCreate instanceof DevSupportManagerBase) {
            ((DevSupportManagerBase) devSupportManagerCreate).setTracingStateProvider$ReactAndroid_release(reactHostImplDevHelper);
        }
        this.devSupportManager = devSupportManagerCreate;
        this.memoryPressureRouter = new MemoryPressureRouter(context);
        this.attachedSurfaces = new HashSet();
        DefaultConstructorMarker defaultConstructorMarker = null;
        this.createReactInstanceTaskRef = new BridgelessAtomicRef<>(Task.INSTANCE.forResult(null));
        this.bridgelessReactContextRef = new BridgelessAtomicRef<>(defaultConstructorMarker, 1, defaultConstructorMarker);
        int andIncrement = counter.getAndIncrement();
        this.id = andIncrement;
        this.activity = new AtomicReference<>();
        this.lastUsedActivityRef = new AtomicReference<>(new WeakReference(null));
        ReactHostStateTracker reactHostStateTracker = new ReactHostStateTracker(andIncrement);
        this.stateTracker = reactHostStateTracker;
        this.reactLifecycleStateManager = new ReactLifecycleStateManager(reactHostStateTracker);
        this.activeActivities = new WeakHashMap();
        this.reactInstanceEventListeners = new CopyOnWriteArrayList();
        this.beforeDestroyListeners = new CopyOnWriteArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _get_defaultBackButtonHandler_$lambda$19(ReactHostImpl reactHostImpl) {
        UiThreadUtil.assertOnUiThread();
        DefaultHardwareBackBtnHandler defaultHardwareBackBtnHandler = reactHostImpl.defaultHardwareBackBtnHandler;
        if (defaultHardwareBackBtnHandler != null) {
            defaultHardwareBackBtnHandler.invokeDefaultOnBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _get_isMetroRunning_$lambda$47(ReactHostImpl reactHostImpl, String str, TaskCompletionSource taskCompletionSource, boolean z5) {
        reactHostImpl.stateTracker.enterState(str, "Async result = " + z5);
        taskCompletionSource.setResult(Boolean.valueOf(z5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task _get_jsBundleLoader_$lambda$46(ReactHostImpl reactHostImpl, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        Object result = task.getResult();
        if (result != null) {
            return ((Boolean) result).booleanValue() ? reactHostImpl.loadJSBundleFromMetro() : Task.INSTANCE.forResult(reactHostImpl.reactHostDelegate.getJsBundleLoader());
        }
        throw new IllegalStateException("Required value was null.");
    }

    private final Task<Void> callAfterGetOrCreateReactInstance(String callingMethod, Executor executor, Function1<? super ReactInstance, Unit> runnable) {
        return getOrCreateReactInstance().onSuccess(new m(this, callingMethod, runnable, 1), executor);
    }

    public static /* synthetic */ Task callAfterGetOrCreateReactInstance$default(ReactHostImpl reactHostImpl, String str, Executor executor, Function1 function1, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            executor = Task.IMMEDIATE_EXECUTOR;
        }
        return reactHostImpl.callAfterGetOrCreateReactInstance(str, executor, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void callAfterGetOrCreateReactInstance$lambda$33(ReactHostImpl reactHostImpl, String str, Function1 function1, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        ReactInstance reactInstance = (ReactInstance) task.getResult();
        if (reactInstance == null) {
            raiseSoftException$default(reactHostImpl, s0.g.e("callAfterGetOrCreateReactInstance(", str, ")"), "Execute: reactInstance is null. Dropping work.", null, 4, null);
            return null;
        }
        function1.invoke(reactInstance);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit callFunctionOnModule$lambda$22(String str, String str2, NativeArray nativeArray, ReactInstance reactInstance) {
        Intrinsics.checkNotNullParameter(reactInstance, "reactInstance");
        reactInstance.callFunctionOnModule(str, str2, nativeArray);
        return Unit.f14616a;
    }

    private final Task<Boolean> callWithExistingReactInstance(String callingMethod, Executor executor, Function1<? super ReactInstance, Unit> runnable) {
        return this.createReactInstanceTaskRef.get().onSuccess(new m(this, callingMethod, runnable, 0), executor);
    }

    public static /* synthetic */ Task callWithExistingReactInstance$default(ReactHostImpl reactHostImpl, String str, Executor executor, Function1 function1, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            executor = Task.IMMEDIATE_EXECUTOR;
        }
        return reactHostImpl.callWithExistingReactInstance(str, executor, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean callWithExistingReactInstance$lambda$32(ReactHostImpl reactHostImpl, String str, Function1 function1, Task task) {
        boolean z5;
        Intrinsics.checkNotNullParameter(task, "task");
        ReactInstance reactInstance = (ReactInstance) task.getResult();
        if (reactInstance == null) {
            raiseSoftException$default(reactHostImpl, s0.g.e("callWithExistingReactInstance(", str, ")"), "Execute: reactInstance is null. Dropping work.", null, 4, null);
            z5 = false;
        } else {
            function1.invoke(reactInstance);
            z5 = true;
        }
        return Boolean.valueOf(z5);
    }

    @xa.a
    private final String captureScreenshot(String format, int quality) {
        Window window;
        Bitmap.CompressFormat compressFormat;
        Activity currentActivity$ReactAndroid_release = getCurrentActivity$ReactAndroid_release();
        if (currentActivity$ReactAndroid_release == null || (window = currentActivity$ReactAndroid_release.getWindow()) == null) {
            return null;
        }
        View rootView = window.getDecorView().getRootView();
        int width = rootView.getWidth();
        int height = rootView.getHeight();
        if (width <= 0 || height <= 0) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        rootView.draw(new Canvas(bitmapCreateBitmap));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (Intrinsics.areEqual(format, "jpeg")) {
            compressFormat = Bitmap.CompressFormat.JPEG;
        } else if (Intrinsics.areEqual(format, "webp")) {
            compressFormat = Build.VERSION.SDK_INT >= 30 ? Bitmap.CompressFormat.WEBP_LOSSY : Bitmap.CompressFormat.WEBP;
        } else {
            compressFormat = Bitmap.CompressFormat.PNG;
        }
        if (quality < 0 || quality >= 101) {
            quality = 80;
        }
        bitmapCreateBitmap.compress(compressFormat, quality, byteArrayOutputStream);
        bitmapCreateBitmap.recycle();
        return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
    }

    private final MemoryPressureListener createMemoryPressureListener(ReactInstance reactInstance) {
        final WeakReference weakReference = new WeakReference(reactInstance);
        return new MemoryPressureListener() { // from class: com.facebook.react.runtime.l
            @Override // com.facebook.react.bridge.MemoryPressureListener
            public final void handleMemoryPressure(int i7) {
                ReactHostImpl.createMemoryPressureListener$lambda$14(this.f5312a, weakReference, i7);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createMemoryPressureListener$lambda$14(ReactHostImpl reactHostImpl, WeakReference weakReference, int i7) {
        reactHostImpl.bgExecutor.execute(new a1.l(i7, 2, weakReference));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createMemoryPressureListener$lambda$14$lambda$13(WeakReference weakReference, int i7) {
        ReactInstance reactInstance = (ReactInstance) weakReference.get();
        if (reactInstance != null) {
            reactInstance.handleMemoryPressure(i7);
        }
    }

    private final ReactHostInspectorTarget createReactHostInspectorTarget() {
        ReactHostInspectorTarget reactHostInspectorTarget = new ReactHostInspectorTarget(this);
        reactHostInspectorTarget.registerTracingStateListener(new bc.i(6, this, reactHostInspectorTarget));
        return reactHostInspectorTarget;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createReactHostInspectorTarget$lambda$69(ReactHostImpl reactHostImpl, ReactHostInspectorTarget reactHostInspectorTarget, TracingState state, boolean z5) {
        Intrinsics.checkNotNullParameter(state, "state");
        int i7 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
        if (i7 != 1 && i7 != 2) {
            if (i7 != 3) {
                throw new rn.n();
            }
            FrameTimingsObserver frameTimingsObserver = reactHostImpl.frameTimingsObserver;
            if (frameTimingsObserver != null) {
                frameTimingsObserver.stop();
            }
            reactHostImpl.frameTimingsObserver = null;
            return;
        }
        if (InspectorFlags.getFrameRecordingEnabled()) {
            FrameTimingsObserver frameTimingsObserver2 = new FrameTimingsObserver(z5, new co.s(25, reactHostInspectorTarget));
            Activity currentActivity$ReactAndroid_release = reactHostImpl.getCurrentActivity$ReactAndroid_release();
            frameTimingsObserver2.setCurrentWindow(currentActivity$ReactAndroid_release != null ? currentActivity$ReactAndroid_release.getWindow() : null);
            frameTimingsObserver2.start();
            reactHostImpl.frameTimingsObserver = frameTimingsObserver2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createReactHostInspectorTarget$lambda$69$lambda$68(ReactHostInspectorTarget reactHostInspectorTarget, FrameTimingSequence frameTimingsSequence) {
        Intrinsics.checkNotNullParameter(frameTimingsSequence, "frameTimingsSequence");
        reactHostInspectorTarget.recordFrameTimings(frameTimingsSequence);
        return Unit.f14616a;
    }

    private final Function2<Task<ReactInstance>, String, ReactInstance> createReactInstanceUnwrapper(String tag, String method, String reason) {
        return new com.discord.browser_manager.b(this, tag, reason, method, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReactInstance createReactInstanceUnwrapper$lambda$50(ReactHostImpl reactHostImpl, String str, String str2, String str3, Task task, String stage) {
        Intrinsics.checkNotNullParameter(task, "task");
        Intrinsics.checkNotNullParameter(stage, "stage");
        ReactInstance reactInstance = (ReactInstance) task.getResult();
        ReactInstance reactInstance2 = reactHostImpl.reactInstance;
        String strL = a3.e.l("Stage: ", stage);
        String strK = kk.b.k(str, " reason: ", str2);
        if (task.isFaulted()) {
            Exception error = task.getError();
            if (error == null) {
                throw new IllegalStateException("Required value was null.");
            }
            String strL2 = a3.e.l("Fault reason: ", error.getMessage());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(": ReactInstance task faulted. ");
            sb2.append(strL);
            sb2.append(". ");
            sb2.append(strL2);
            raiseSoftException$default(reactHostImpl, str3, com.discord.chat.presentation.list.a.k(sb2, ". ", strK), null, 4, null);
            return reactInstance2;
        }
        if (task.isCancelled()) {
            raiseSoftException$default(reactHostImpl, str3, str + ": ReactInstance task cancelled. " + strL + ". " + strK, null, 4, null);
            return reactInstance2;
        }
        if (reactInstance == null) {
            raiseSoftException$default(reactHostImpl, str3, str + ": ReactInstance task returned null. " + strL + ". " + strK, null, 4, null);
            return reactInstance2;
        }
        if (reactInstance2 != null && !Intrinsics.areEqual(reactInstance, reactInstance2)) {
            raiseSoftException$default(reactHostImpl, str3, str + ": Detected two different ReactInstances. Returning old. " + strL + ". " + strK, null, 4, null);
        }
        return reactInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void destroy$lambda$10(Function1 function1, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        function1.invoke(Boolean.valueOf(task.isCompleted() && !task.isFaulted()));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task destroy$lambda$12(ReactHostImpl reactHostImpl, String str, Exception exc) {
        Task<ReactInstance> task = reactHostImpl.reloadTask;
        if (task == null) {
            return reactHostImpl.getOrCreateDestroyTask(str, exc);
        }
        reactHostImpl.stateTracker.enterState("destroy()", "Reloading React Native. Waiting for reload to finish before destroying React Native.");
        return task.continueWithTask(new m(reactHostImpl, str, exc, 2), reactHostImpl.bgExecutor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task destroy$lambda$12$lambda$11(ReactHostImpl reactHostImpl, String str, Exception exc, Task it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return reactHostImpl.getOrCreateDestroyTask(str, exc);
    }

    private final void destroyReactHostInspectorTarget() {
        FrameTimingsObserver frameTimingsObserver = this.frameTimingsObserver;
        if (frameTimingsObserver != null) {
            frameTimingsObserver.stop();
        }
        this.frameTimingsObserver = null;
        ReactHostInspectorTarget reactHostInspectorTarget = this.reactHostInspectorTarget;
        if (reactHostInspectorTarget != null) {
            reactHostInspectorTarget.close();
        }
        this.reactHostInspectorTarget = null;
    }

    @xa.a
    private final Map<String, String> getHostMetadata() {
        return AndroidInfoHelpers.getInspectorHostMetadata(this.context);
    }

    private final Task<JSBundleLoader> getJsBundleLoader() {
        ReactHostStateTracker.enterState$default(this.stateTracker, "getJSBundleLoader()", null, 2, null);
        if (getDevSupportManager().getBundleFilePath() != null) {
            try {
                Task.Companion companion = Task.INSTANCE;
                JSBundleLoader.Companion companion2 = JSBundleLoader.INSTANCE;
                String bundleFilePath = getDevSupportManager().getBundleFilePath();
                if (bundleFilePath != null) {
                    return companion.forResult(companion2.createFileLoader(bundleFilePath));
                }
                throw new IllegalStateException("Required value was null.");
            } catch (Exception e10) {
                return Task.INSTANCE.forError(e10);
            }
        }
        if (this.useDevSupport && this.allowPackagerServerAccess) {
            return isMetroRunning().onSuccessTask(new b(this, 0), this.bgExecutor);
        }
        if (ReactBuildConfig.DEBUG) {
            o8.a.b(TAG, "Packager server access is disabled in this environment");
        }
        try {
            return Task.INSTANCE.forResult(this.reactHostDelegate.getJsBundleLoader());
        } catch (Exception e11) {
            return Task.INSTANCE.forError(e11);
        }
    }

    private final Task<Void> getOrCreateDestroyTask(String reason, Exception ex) {
        ReactHostStateTracker.enterState$default(this.stateTracker, "getOrCreateDestroyTask()", null, 2, null);
        Task<Void> task = this.destroyTask;
        if (task != null) {
            return task;
        }
        Function2<Task<ReactInstance>, String, ReactInstance> function2CreateReactInstanceUnwrapper = createReactInstanceUnwrapper("Destroy", "getOrCreateDestroyTask()", reason);
        this.stateTracker.enterState("getOrCreateDestroyTask()", "Resetting createReactInstance task ref");
        Task<Void> taskContinueWith$default = Task.continueWith$default(this.createReactInstanceTaskRef.getAndReset().continueWithTask(new e(this, function2CreateReactInstanceUnwrapper, reason, 1), this.uiExecutor).continueWithTask(new f(function2CreateReactInstanceUnwrapper, this, 4), this.bgExecutor).continueWithTask(new e(function2CreateReactInstanceUnwrapper, this, reason), this.uiExecutor).continueWithTask(new f(function2CreateReactInstanceUnwrapper, this, 5), this.bgExecutor), new g(this, reason, 2), null, 2, null);
        this.destroyTask = taskContinueWith$default;
        return taskContinueWith$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task getOrCreateDestroyTask$lambda$61(ReactHostImpl reactHostImpl, String str, Function2 function2, String str2, Task task) {
        ReactHostImpl reactHostImpl2;
        String str3;
        Intrinsics.checkNotNullParameter(task, "task");
        reactHostImpl.stateTracker.enterState(str, "Starting React Native destruction");
        ReactInstance reactInstance = (ReactInstance) function2.invoke(task, "1: Starting destroy");
        reactHostImpl.unregisterInstanceFromInspector$ReactAndroid_release(reactInstance);
        if (reactHostImpl.hostInvalidated) {
            reactHostImpl.destroyReactHostInspectorTarget();
        }
        if (reactHostImpl.useDevSupport) {
            reactHostImpl.stateTracker.enterState(str, "DevSupportManager cleanup");
            reactHostImpl.getDevSupportManager().stopInspector();
        }
        BridgelessReactContext nullable = reactHostImpl.bridgelessReactContextRef.getNullable();
        if (nullable == null) {
            reactHostImpl2 = reactHostImpl;
            str3 = str;
            raiseSoftException$default(reactHostImpl2, str3, a3.e.l("ReactContext is null. Destroy reason: ", str2), null, 4, null);
        } else {
            reactHostImpl2 = reactHostImpl;
            str3 = str;
        }
        reactHostImpl2.stateTracker.enterState(str3, "Move ReactHost to onHostDestroy()");
        reactHostImpl2.reactLifecycleStateManager.moveToOnHostDestroy(nullable);
        return Task.INSTANCE.forResult(reactInstance);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task getOrCreateDestroyTask$lambda$63(Function2 function2, ReactHostImpl reactHostImpl, String str, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        ReactInstance reactInstance = (ReactInstance) function2.invoke(task, "2: Stopping surfaces");
        if (reactInstance == null) {
            raiseSoftException$default(reactHostImpl, str, "Skipping surface shutdown: ReactInstance null", null, 4, null);
            return task;
        }
        reactHostImpl.stopAttachedSurfaces(str, reactInstance);
        synchronized (reactHostImpl.attachedSurfaces) {
            reactHostImpl.attachedSurfaces.clear();
            Unit unit = Unit.f14616a;
        }
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task getOrCreateDestroyTask$lambda$64(Function2 function2, ReactHostImpl reactHostImpl, String str, String str2, Task task) {
        ReactHostImpl reactHostImpl2;
        String str3;
        Intrinsics.checkNotNullParameter(task, "task");
        function2.invoke(task, "3: Destroying ReactContext");
        Iterator<Function0<Unit>> it = reactHostImpl.beforeDestroyListeners.iterator();
        while (it.hasNext()) {
            it.next().invoke();
        }
        BridgelessReactContext nullable = reactHostImpl.bridgelessReactContextRef.getNullable();
        if (nullable == null) {
            reactHostImpl2 = reactHostImpl;
            str3 = str;
            raiseSoftException$default(reactHostImpl2, str3, a3.e.l("ReactContext is null. Destroy reason: ", str2), null, 4, null);
        } else {
            reactHostImpl2 = reactHostImpl;
            str3 = str;
        }
        reactHostImpl2.stateTracker.enterState(str3, "Destroying MemoryPressureRouter");
        reactHostImpl2.getMemoryPressureRouter().destroy(reactHostImpl2.context);
        if (nullable != null) {
            reactHostImpl2.stateTracker.enterState(str3, "Resetting ReactContext ref");
            reactHostImpl2.bridgelessReactContextRef.reset();
            reactHostImpl2.stateTracker.enterState(str3, "Destroying ReactContext");
            nullable.destroy();
        }
        reactHostImpl2.setCurrentActivity(null);
        ResourceDrawableIdHelper.clear();
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task getOrCreateDestroyTask$lambda$65(Function2 function2, ReactHostImpl reactHostImpl, String str, Task task) {
        ReactHostImpl reactHostImpl2;
        String str2;
        Intrinsics.checkNotNullParameter(task, "task");
        ReactInstance reactInstance = (ReactInstance) function2.invoke(task, "4: Destroying ReactInstance");
        if (reactInstance == null) {
            reactHostImpl2 = reactHostImpl;
            str2 = str;
            raiseSoftException$default(reactHostImpl2, str2, "Skipping ReactInstance.destroy(): ReactInstance null", null, 4, null);
        } else {
            reactHostImpl2 = reactHostImpl;
            str2 = str;
            reactHostImpl2.stateTracker.enterState(str2, "Resetting ReactInstance ptr");
            reactHostImpl2.reactInstance = null;
            reactHostImpl2.stateTracker.enterState(str2, "Destroying ReactInstance");
            reactInstance.destroy();
        }
        reactHostImpl2.stateTracker.enterState(str2, "Resetting start/destroy task ref");
        reactHostImpl2.startTask = null;
        reactHostImpl2.destroyTask = null;
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void getOrCreateDestroyTask$lambda$66(ReactHostImpl reactHostImpl, String str, String str2, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (task.isFaulted()) {
            Exception error = task.getError();
            if (error == null) {
                throw new IllegalStateException("Required value was null.");
            }
            reactHostImpl.raiseSoftException(str, a3.e.m("React destruction failed. ReactInstance task faulted. Fault reason: ", error.getMessage(), ". Destroy reason: ", str2), task.getError());
        }
        if (!task.isCancelled()) {
            return null;
        }
        raiseSoftException$default(reactHostImpl, str, a3.e.l("React destruction failed. ReactInstance task cancelled. Destroy reason: ", str2), null, 4, null);
        return null;
    }

    private final Task<ReactInstance> getOrCreateReactInstance() {
        return Task.INSTANCE.call(new c(this, 0), this.bgExecutor);
    }

    private final Task<ReactInstance> getOrCreateReactInstanceTask() {
        ReactHostStateTracker.enterState$default(this.stateTracker, "getOrCreateReactInstanceTask()", null, 2, null);
        return this.createReactInstanceTaskRef.getOrCreate(new h(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task getOrCreateReactInstanceTask$lambda$45(ReactHostImpl reactHostImpl, String str) {
        reactHostImpl.stateTracker.enterState(str, "Start");
        io.sentry.config.a.e(!reactHostImpl.hostInvalidated, "Cannot start a new ReactInstance on an invalidated ReactHost");
        ReactMarker.logMarker(ReactMarkerConstants.REACT_BRIDGELESS_LOADING_START, 1);
        Task<TContinuationResult> taskOnSuccess = reactHostImpl.getJsBundleLoader().onSuccess(new g(reactHostImpl, str, 3), reactHostImpl.bgExecutor);
        taskOnSuccess.continueWith(new ReactHostImpl$sam$com_facebook_react_runtime_internal_bolts_Continuation$0(new p(1, reactHostImpl, str)), reactHostImpl.uiExecutor);
        return Task.onSuccess$default(taskOnSuccess, new r(0), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreationResult getOrCreateReactInstanceTask$lambda$45$lambda$41(ReactHostImpl reactHostImpl, String str, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        Object result = task.getResult();
        if (result == null) {
            throw new IllegalStateException("Required value was null.");
        }
        BridgelessReactContext orCreate = reactHostImpl.bridgelessReactContextRef.getOrCreate(new bc.i(5, reactHostImpl, str));
        orCreate.setJSExceptionHandler(reactHostImpl.getDevSupportManager());
        reactHostImpl.stateTracker.enterState(str, "Creating ReactInstance");
        ReactInstance reactInstance = new ReactInstance(orCreate, reactHostImpl.reactHostDelegate, reactHostImpl.componentFactory, reactHostImpl.getDevSupportManager(), new h(reactHostImpl), reactHostImpl.useDevSupport, reactHostImpl.getOrCreateReactHostInspectorTarget$ReactAndroid_release());
        reactHostImpl.reactInstance = reactInstance;
        MemoryPressureListener memoryPressureListenerCreateMemoryPressureListener = reactHostImpl.createMemoryPressureListener(reactInstance);
        reactHostImpl.memoryPressureListener = memoryPressureListenerCreateMemoryPressureListener;
        reactHostImpl.getMemoryPressureRouter().addMemoryPressureListener(memoryPressureListenerCreateMemoryPressureListener);
        reactInstance.initializeEagerTurboModules();
        reactHostImpl.stateTracker.enterState(str, "Loading JS Bundle");
        reactInstance.loadJSBundle((JSBundleLoader) result);
        reactHostImpl.stateTracker.enterState(str, "DevSupportManager.onNewReactContextCreated()");
        reactHostImpl.getDevSupportManager().onNewReactContextCreated(orCreate);
        orCreate.runOnJSQueueThread(new bc.a(7));
        return new CreationResult(reactInstance, orCreate, reactHostImpl.reloadTask != null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BridgelessReactContext getOrCreateReactInstanceTask$lambda$45$lambda$41$lambda$38(ReactHostImpl reactHostImpl, String str) {
        reactHostImpl.stateTracker.enterState(str, "Creating BridgelessReactContext");
        return new BridgelessReactContext(reactHostImpl.context, reactHostImpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getOrCreateReactInstanceTask$lambda$45$lambda$41$lambda$39(ReactHostImpl reactHostImpl, Exception e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        reactHostImpl.handleHostException$ReactAndroid_release(e10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getOrCreateReactInstanceTask$lambda$45$lambda$41$lambda$40() {
        ReactMarker.logMarker(ReactMarkerConstants.REACT_BRIDGELESS_LOADING_END, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getOrCreateReactInstanceTask$lambda$45$lambda$43(ReactHostImpl reactHostImpl, String str, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (task.isFaulted()) {
            reactHostImpl.uiExecutor.execute(new a1.k(24, reactHostImpl, task));
            return Unit.f14616a;
        }
        Object result = task.getResult();
        if (result == null) {
            throw new IllegalStateException("Required value was null.");
        }
        CreationResult creationResult = (CreationResult) result;
        ReactContext context = creationResult.getContext();
        boolean isReloading = creationResult.getIsReloading();
        boolean z5 = reactHostImpl.reactLifecycleStateManager.getState() == LifecycleState.RESUMED;
        if (!isReloading || z5) {
            reactHostImpl.reactLifecycleStateManager.resumeReactContextIfHostResumed(context, reactHostImpl.getCurrentActivity$ReactAndroid_release());
        } else {
            reactHostImpl.reactLifecycleStateManager.moveToOnHostResume(context, reactHostImpl.getCurrentActivity$ReactAndroid_release());
        }
        reactHostImpl.stateTracker.enterState(str, "Executing ReactInstanceEventListeners");
        Iterator<ReactInstanceEventListener> it = reactHostImpl.reactInstanceEventListeners.iterator();
        while (it.hasNext()) {
            it.next().onReactContextInitialized(context);
        }
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getOrCreateReactInstanceTask$lambda$45$lambda$43$lambda$42(ReactHostImpl reactHostImpl, Task task) {
        Exception error = task.getError();
        if (error == null) {
            throw new IllegalStateException("Required value was null.");
        }
        reactHostImpl.handleHostException$ReactAndroid_release(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReactInstance getOrCreateReactInstanceTask$lambda$45$lambda$44(Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        Object result = task.getResult();
        if (result != null) {
            return ((CreationResult) result).getInstance();
        }
        throw new IllegalStateException("Required value was null.");
    }

    private final Task<ReactInstance> getOrCreateReloadTask(String reason) {
        ReactHostStateTracker.enterState$default(this.stateTracker, "getOrCreateReloadTask()", null, 2, null);
        Task<ReactInstance> task = this.reloadTask;
        if (task != null) {
            return task;
        }
        Function2<Task<ReactInstance>, String, ReactInstance> function2CreateReactInstanceUnwrapper = createReactInstanceUnwrapper("Reload", "getOrCreateReloadTask()", reason);
        this.stateTracker.enterState("getOrCreateReloadTask()", "Resetting createReactInstance task ref");
        Task<ReactInstance> taskContinueWithTask = this.createReactInstanceTaskRef.getAndReset().continueWithTask(new e(this, function2CreateReactInstanceUnwrapper, reason, 0), this.uiExecutor).continueWithTask(new f(function2CreateReactInstanceUnwrapper, this, 0), this.bgExecutor).continueWithTask(new f(function2CreateReactInstanceUnwrapper, this, 1), this.uiExecutor).continueWithTask(new f(function2CreateReactInstanceUnwrapper, this, 2), this.bgExecutor).continueWithTask(new f(function2CreateReactInstanceUnwrapper, this, 3), this.bgExecutor).continueWithTask(new g(this, reason, 0), this.bgExecutor);
        this.reloadTask = taskContinueWithTask;
        return taskContinueWithTask;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task getOrCreateReloadTask$lambda$52(ReactHostImpl reactHostImpl, String str, Function2 function2, String str2, Task task) {
        ReactHostImpl reactHostImpl2;
        String str3;
        Intrinsics.checkNotNullParameter(task, "task");
        reactHostImpl.stateTracker.enterState(str, "Starting React Native reload");
        ReactInstance reactInstance = (ReactInstance) function2.invoke(task, "1: Starting reload");
        reactHostImpl.unregisterInstanceFromInspector$ReactAndroid_release(reactInstance);
        BridgelessReactContext nullable = reactHostImpl.bridgelessReactContextRef.getNullable();
        if (nullable == null) {
            reactHostImpl2 = reactHostImpl;
            str3 = str;
            raiseSoftException$default(reactHostImpl2, str3, a3.e.l("ReactContext is null. Reload reason: ", str2), null, 4, null);
        } else {
            reactHostImpl2 = reactHostImpl;
            str3 = str;
        }
        if (nullable != null && reactHostImpl2.reactLifecycleStateManager.getState() == LifecycleState.RESUMED) {
            reactHostImpl2.stateTracker.enterState(str3, "Calling ReactContext.onHostPause()");
            nullable.onHostPause();
        }
        return Task.INSTANCE.forResult(reactInstance);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task getOrCreateReloadTask$lambda$53(Function2 function2, ReactHostImpl reactHostImpl, String str, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        ReactInstance reactInstance = (ReactInstance) function2.invoke(task, "2: Surface shutdown");
        if (reactInstance == null) {
            raiseSoftException$default(reactHostImpl, str, "Skipping surface shutdown: ReactInstance null", null, 4, null);
            return task;
        }
        reactHostImpl.stopAttachedSurfaces(str, reactInstance);
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task getOrCreateReloadTask$lambda$55(Function2 function2, ReactHostImpl reactHostImpl, String str, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        function2.invoke(task, "3: Destroying ReactContext");
        Iterator<Function0<Unit>> it = reactHostImpl.beforeDestroyListeners.iterator();
        while (it.hasNext()) {
            it.next().invoke();
        }
        MemoryPressureListener memoryPressureListener = reactHostImpl.memoryPressureListener;
        if (memoryPressureListener != null) {
            reactHostImpl.stateTracker.enterState(str, "Removing memory pressure listener");
            reactHostImpl.getMemoryPressureRouter().removeMemoryPressureListener(memoryPressureListener);
        }
        BridgelessReactContext nullable = reactHostImpl.bridgelessReactContextRef.getNullable();
        if (nullable != null) {
            reactHostImpl.stateTracker.enterState(str, "Resetting ReactContext ref");
            reactHostImpl.bridgelessReactContextRef.reset();
            reactHostImpl.stateTracker.enterState(str, "Destroying ReactContext");
            nullable.destroy();
        }
        if (reactHostImpl.useDevSupport && nullable != null) {
            reactHostImpl.stateTracker.enterState(str, "Calling DevSupportManager.onReactInstanceDestroyed(reactContext)");
            reactHostImpl.getDevSupportManager().onReactInstanceDestroyed(nullable);
        }
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task getOrCreateReloadTask$lambda$56(Function2 function2, ReactHostImpl reactHostImpl, String str, Task task) {
        ReactHostImpl reactHostImpl2;
        String str2;
        Intrinsics.checkNotNullParameter(task, "task");
        ReactInstance reactInstance = (ReactInstance) function2.invoke(task, "4: Destroying ReactInstance");
        if (reactInstance == null) {
            reactHostImpl2 = reactHostImpl;
            str2 = str;
            raiseSoftException$default(reactHostImpl2, str2, "Skipping ReactInstance.destroy(): ReactInstance null", null, 4, null);
        } else {
            reactHostImpl2 = reactHostImpl;
            str2 = str;
            reactHostImpl2.stateTracker.enterState(str2, "Resetting ReactInstance ptr");
            reactHostImpl2.reactInstance = null;
            reactHostImpl2.stateTracker.enterState(str2, "Destroying ReactInstance");
            reactInstance.destroy();
        }
        reactHostImpl2.stateTracker.enterState(str2, "Resetting start task ref");
        reactHostImpl2.startTask = null;
        return reactHostImpl2.getOrCreateReactInstanceTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task getOrCreateReloadTask$lambda$57(Function2 function2, ReactHostImpl reactHostImpl, String str, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        ReactInstance reactInstance = (ReactInstance) function2.invoke(task, "5: Restarting surfaces");
        if (reactInstance == null) {
            raiseSoftException$default(reactHostImpl, str, "Skipping surface restart: ReactInstance null", null, 4, null);
            return task;
        }
        reactHostImpl.startAttachedSurfaces(str, reactInstance);
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task getOrCreateReloadTask$lambda$58(ReactHostImpl reactHostImpl, String str, String str2, Task task) {
        ReactHostImpl reactHostImpl2;
        String str3;
        Intrinsics.checkNotNullParameter(task, "task");
        if (task.isFaulted()) {
            Exception error = task.getError();
            if (error == null) {
                throw new IllegalStateException("Required value was null.");
            }
            reactHostImpl.raiseSoftException(str, a3.e.m("Error during reload. ReactInstance task faulted. Fault reason: ", error.getMessage(), ". Reload reason: ", str2), task.getError());
        }
        if (task.isCancelled()) {
            reactHostImpl2 = reactHostImpl;
            str3 = str;
            raiseSoftException$default(reactHostImpl2, str3, a3.e.l("Error during reload. ReactInstance task cancelled. Reload reason: ", str2), null, 4, null);
        } else {
            reactHostImpl2 = reactHostImpl;
            str3 = str;
        }
        reactHostImpl2.stateTracker.enterState(str3, "Resetting reload task ref");
        reactHostImpl2.reloadTask = null;
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Task<Void> getOrCreateStartTask() {
        Task<Void> task = this.startTask;
        if (task != null) {
            return task;
        }
        this.stateTracker.enterState("getOrCreateStartTask()", "Schedule");
        if (ReactBuildConfig.DEBUG) {
            io.sentry.config.a.e(ReactNativeNewArchitectureFeatureFlags.enableBridgelessArchitecture(), "enableBridgelessArchitecture FeatureFlag must be set to start ReactNative.");
            io.sentry.config.a.e(ReactNativeNewArchitectureFeatureFlags.enableFabricRenderer(), "enableFabricRenderer FeatureFlag must be set to start ReactNative.");
            io.sentry.config.a.e(ReactNativeNewArchitectureFeatureFlags.useTurboModules(), "useTurboModules FeatureFlag must be set to start ReactNative.");
        }
        if (ReactBuildConfig.UNSTABLE_ENABLE_MINIFY_LEGACY_ARCHITECTURE) {
            io.sentry.config.a.e(!ReactNativeNewArchitectureFeatureFlags.useFabricInterop(), "useFabricInterop FeatureFlag must be false when UNSTABLE_ENABLE_MINIFY_LEGACY_ARCHITECTURE == true.");
            io.sentry.config.a.e(!ReactNativeNewArchitectureFeatureFlags.useTurboModuleInterop(), "useTurboModuleInterop FeatureFlag must be false when UNSTABLE_ENABLE_MINIFY_LEGACY_ARCHITECTURE == true.");
        }
        Task taskContinueWithTask = waitThenCallGetOrCreateReactInstanceTask().continueWithTask(new b(this, 2), this.bgExecutor);
        this.startTask = taskContinueWithTask;
        return taskContinueWithTask;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task getOrCreateStartTask$lambda$30(ReactHostImpl reactHostImpl, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (!task.isFaulted()) {
            return task.makeVoid();
        }
        Exception error = task.getError();
        if (error == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (reactHostImpl.useDevSupport) {
            reactHostImpl.getDevSupportManager().handleException(error);
        } else {
            reactHostImpl.reactHostDelegate.handleInstanceException(error);
        }
        return Task.continueWithTask$default(reactHostImpl.getOrCreateDestroyTask(a3.e.l("getOrCreateStartTask() failure: ", error.getMessage()), error), new j(1, error), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task getOrCreateStartTask$lambda$30$lambda$29(Exception exc, Task it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Task.INSTANCE.forError(exc);
    }

    private final Task<Boolean> isMetroRunning() {
        ReactHostStateTracker.enterState$default(this.stateTracker, "isMetroRunning()", null, 2, null);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        getDevSupportManager().isPackagerRunning(new bc.i(7, this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadBundle$lambda$20(ReactHostImpl reactHostImpl, String str, JSBundleLoader jSBundleLoader, ReactInstance reactInstance) {
        Intrinsics.checkNotNullParameter(reactInstance, "reactInstance");
        reactHostImpl.stateTracker.enterState(str, "Execute");
        reactInstance.loadJSBundle(jSBundleLoader);
        return Unit.f14616a;
    }

    private final Task<JSBundleLoader> loadJSBundleFromMetro() {
        final String str = "loadJSBundleFromMetro()";
        ReactHostStateTracker.enterState$default(this.stateTracker, "loadJSBundleFromMetro()", null, 2, null);
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        DevSupportManager devSupportManager = getDevSupportManager();
        Intrinsics.checkNotNull(devSupportManager, "null cannot be cast to non-null type com.facebook.react.devsupport.DevSupportManagerBase");
        final DevSupportManagerBase devSupportManagerBase = (DevSupportManagerBase) devSupportManager;
        DevServerHelper devServerHelper = devSupportManagerBase.getDevServerHelper();
        String jSAppBundleName = devSupportManagerBase.getJsAppBundleName();
        if (jSAppBundleName == null) {
            throw new IllegalStateException("Required value was null.");
        }
        final String devServerBundleURL = devServerHelper.getDevServerBundleURL(jSAppBundleName);
        devSupportManagerBase.reloadJSFromServer(devServerBundleURL, new BundleLoadCallback() { // from class: com.facebook.react.runtime.ReactHostImpl.loadJSBundleFromMetro.1
            @Override // com.facebook.react.devsupport.interfaces.BundleLoadCallback
            public void onError(Exception cause) {
                Intrinsics.checkNotNullParameter(cause, "cause");
                taskCompletionSource.setError(cause);
            }

            @Override // com.facebook.react.devsupport.interfaces.BundleLoadCallback
            public void onSuccess() {
                ReactHostImpl.this.stateTracker.enterState(str, "Creating BundleLoader");
                taskCompletionSource.setResult(JSBundleLoader.INSTANCE.createCachedBundleFromNetworkLoader(devServerBundleURL, devSupportManagerBase.getDownloadedJSBundleFile()));
            }
        });
        return taskCompletionSource.getTask();
    }

    @xa.a
    private final void loadNetworkResource(String url, InspectorNetworkRequestListener listener) {
        InspectorNetworkHelper.loadNetworkResource(url, listener);
    }

    private final void maybeEnableDevSupport(boolean enabled) {
        if (this.useDevSupport) {
            getDevSupportManager().setDevSupportEnabled(enabled);
        }
    }

    private final void moveToHostDestroy(ReactContext currentContext) {
        this.reactLifecycleStateManager.moveToOnHostDestroy(currentContext);
        setCurrentActivity(null);
        FrameTimingsObserver frameTimingsObserver = this.frameTimingsObserver;
        if (frameTimingsObserver != null) {
            frameTimingsObserver.setCurrentWindow(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit prerenderSurface$lambda$2(ReactHostImpl reactHostImpl, String str, ReactSurfaceImpl reactSurfaceImpl, ReactInstance reactInstance) {
        Intrinsics.checkNotNullParameter(reactInstance, "reactInstance");
        reactHostImpl.stateTracker.enterState(str, "Execute");
        reactInstance.prerenderSurface(reactSurfaceImpl);
        return Unit.f14616a;
    }

    private final void raiseSoftException(String callingMethod, String message, Throwable throwable) {
        String strE = s0.g.e("raiseSoftException(", callingMethod, ")");
        this.stateTracker.enterState(strE, message);
        ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException(kk.b.k(strE, ": ", message), throwable));
    }

    public static /* synthetic */ void raiseSoftException$default(ReactHostImpl reactHostImpl, String str, String str2, Throwable th2, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            th2 = null;
        }
        reactHostImpl.raiseSoftException(str, str2, th2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit registerSegment$lambda$21(ReactHostImpl reactHostImpl, String str, int i7, String str2, Callback callback, ReactInstance reactInstance) {
        Intrinsics.checkNotNullParameter(reactInstance, "reactInstance");
        reactHostImpl.stateTracker.enterState(str, "Execute");
        reactInstance.registerSegment(i7, str2);
        if (callback == null) {
            throw new IllegalStateException("Required value was null.");
        }
        callback.invoke(new Object[0]);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:6:0x001b  */
    public static final Task reload$lambda$8(ReactHostImpl reactHostImpl, String str) {
        Task<ReactInstance> orCreateReloadTask;
        Task<Void> task = reactHostImpl.destroyTask;
        if (task != null) {
            reactHostImpl.stateTracker.enterState("reload()", "Waiting for destroy to finish, before reloading React Native.");
            orCreateReloadTask = task.continueWithTask(new g(reactHostImpl, str, 1), reactHostImpl.bgExecutor);
            if (orCreateReloadTask == null) {
                orCreateReloadTask = reactHostImpl.getOrCreateReloadTask(str);
            }
        } else {
            orCreateReloadTask = reactHostImpl.getOrCreateReloadTask(str);
        }
        return orCreateReloadTask.makeVoid().continueWithTask(new b(reactHostImpl, 1), reactHostImpl.bgExecutor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task reload$lambda$8$lambda$6$lambda$5(ReactHostImpl reactHostImpl, String str, Task it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return reactHostImpl.getOrCreateReloadTask(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task reload$lambda$8$lambda$7(ReactHostImpl reactHostImpl, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (!task.isFaulted()) {
            return task;
        }
        Exception error = task.getError();
        if (error == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (reactHostImpl.useDevSupport) {
            reactHostImpl.getDevSupportManager().handleException(error);
        } else {
            reactHostImpl.reactHostDelegate.handleInstanceException(error);
        }
        return reactHostImpl.getOrCreateDestroyTask("Reload failed", error);
    }

    private final void setCurrentActivity(Activity activity) {
        this.activity.set(activity);
        if (activity != null) {
            this.lastUsedActivityRef.set(new WeakReference<>(activity));
        }
    }

    @xa.a
    private final void setEmulatedMedia(String colorScheme) {
        UiThreadUtil.runOnUiThread(new bb.a(colorScheme, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setEmulatedMedia$lambda$9(String str) {
        int i7;
        if (Intrinsics.areEqual(str, "dark")) {
            i7 = 2;
        } else {
            i7 = Intrinsics.areEqual(str, "light") ? 1 : -1;
        }
        AppCompatDelegate.z(i7);
    }

    @xa.a
    private final void setPausedInDebuggerMessage(String message) {
        if (message == null) {
            getDevSupportManager().hidePausedInDebuggerOverlay();
        } else {
            getDevSupportManager().showPausedInDebuggerOverlay(message, new DevSupportManager.PausedInDebuggerOverlayCommandListener() { // from class: com.facebook.react.runtime.ReactHostImpl.setPausedInDebuggerMessage.1
                @Override // com.facebook.react.devsupport.interfaces.DevSupportManager.PausedInDebuggerOverlayCommandListener
                public void onResume() {
                    UiThreadUtil.assertOnUiThread();
                    ReactHostInspectorTarget reactHostInspectorTarget = ReactHostImpl.this.getReactHostInspectorTarget();
                    if (reactHostInspectorTarget != null) {
                        reactHostInspectorTarget.sendDebuggerResumeCommand();
                    }
                }
            });
        }
    }

    private final void startAttachedSurfaces(String method, ReactInstance reactInstance) {
        this.stateTracker.enterState(method, "Restarting previously running React Native Surfaces");
        synchronized (this.attachedSurfaces) {
            try {
                Iterator<ReactSurfaceImpl> it = this.attachedSurfaces.iterator();
                while (it.hasNext()) {
                    reactInstance.startSurface(it.next());
                }
                Unit unit = Unit.f14616a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startSurface$lambda$3(ReactHostImpl reactHostImpl, String str, ReactSurfaceImpl reactSurfaceImpl, ReactInstance reactInstance) {
        Intrinsics.checkNotNullParameter(reactInstance, "reactInstance");
        reactHostImpl.stateTracker.enterState(str, "Execute");
        reactInstance.startSurface(reactSurfaceImpl);
        return Unit.f14616a;
    }

    private final void stopAttachedSurfaces(String method, ReactInstance reactInstance) {
        this.stateTracker.enterState(method, "Stopping all React Native surfaces");
        synchronized (this.attachedSurfaces) {
            try {
                for (ReactSurfaceImpl reactSurfaceImpl : this.attachedSurfaces) {
                    reactInstance.stopSurface(reactSurfaceImpl);
                    reactSurfaceImpl.clear();
                }
                Unit unit = Unit.f14616a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit stopSurface$lambda$4(ReactHostImpl reactHostImpl, String str, ReactSurfaceImpl reactSurfaceImpl, ReactInstance reactInstance) {
        Intrinsics.checkNotNullParameter(reactInstance, "reactInstance");
        reactHostImpl.stateTracker.enterState(str, "Execute");
        reactInstance.stopSurface(reactSurfaceImpl);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Task<ReactInstance> waitThenCallGetOrCreateReactInstanceTask() {
        return waitThenCallGetOrCreateReactInstanceTaskWithRetries(0, 4);
    }

    private final Task<ReactInstance> waitThenCallGetOrCreateReactInstanceTaskWithRetries(final int tryNum, final int maxTries) {
        Task<ReactInstance> task = this.reloadTask;
        if (task != null) {
            this.stateTracker.enterState("waitThenCallGetOrCreateReactInstanceTaskWithRetries", "React Native is reloading. Return reload task.");
            return task;
        }
        Task<Void> task2 = this.destroyTask;
        if (task2 != null) {
            if (tryNum < maxTries) {
                this.stateTracker.enterState("waitThenCallGetOrCreateReactInstanceTaskWithRetries", "React Native is tearing down.Wait for teardown to finish, before trying again (try count = " + tryNum + ").");
                return task2.onSuccessTask(new com.facebook.react.runtime.internal.bolts.Continuation() { // from class: com.facebook.react.runtime.d
                    @Override // com.facebook.react.runtime.internal.bolts.Continuation
                    public final Object then(Task task3) {
                        return ReactHostImpl.waitThenCallGetOrCreateReactInstanceTaskWithRetries$lambda$37$lambda$36(this.f5275d, tryNum, maxTries, task3);
                    }
                }, this.bgExecutor);
            }
            raiseSoftException$default(this, "waitThenCallGetOrCreateReactInstanceTaskWithRetries", "React Native is tearing down. Not wait for teardown to finish: reached max retries.", null, 4, null);
        }
        return getOrCreateReactInstanceTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task waitThenCallGetOrCreateReactInstanceTaskWithRetries$lambda$37$lambda$36(ReactHostImpl reactHostImpl, int i7, int i10, Task it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return reactHostImpl.waitThenCallGetOrCreateReactInstanceTaskWithRetries(i7 + 1, i10);
    }

    @Override // com.facebook.react.ReactHost
    public void addBeforeDestroyListener(@NotNull Function0<Unit> onBeforeDestroy) {
        Intrinsics.checkNotNullParameter(onBeforeDestroy, "onBeforeDestroy");
        this.beforeDestroyListeners.add(onBeforeDestroy);
    }

    @Override // com.facebook.react.ReactHost
    public void addReactInstanceEventListener(@NotNull ReactInstanceEventListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.reactInstanceEventListeners.add(listener);
    }

    public final void attachSurface$ReactAndroid_release(@NotNull ReactSurfaceImpl surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        ReactHostStateTracker.enterState$default(this.stateTracker, s0.g.d(surface.getSurfaceID(), "attachSurface(surfaceId = ", ")"), null, 2, null);
        synchronized (this.attachedSurfaces) {
            this.attachedSurfaces.add(surface);
        }
    }

    @NotNull
    public final Task<Boolean> callFunctionOnModule$ReactAndroid_release(@NotNull String moduleName, @NotNull String methodName, @NotNull NativeArray args) {
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(args, "args");
        return callWithExistingReactInstance$default(this, com.discord.chat.presentation.list.a.l(new StringBuilder("callFunctionOnModule(\""), moduleName, "\", \"", methodName, "\")"), null, new com.discord.age_assurance.a(moduleName, methodName, args, 12), 2, null);
    }

    @Override // com.facebook.react.ReactHost
    @NotNull
    public ReactSurface createSurface(@NotNull Context context, @NotNull String moduleName, Bundle initialProps) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        ReactSurfaceImpl reactSurfaceImpl = new ReactSurfaceImpl(context, moduleName, initialProps);
        ReactSurfaceView reactSurfaceViewCreateReactSurfaceView = this.reactHostDelegate.createReactSurfaceView(context, reactSurfaceImpl);
        reactSurfaceViewCreateReactSurfaceView.setShouldLogContentAppeared(true);
        reactSurfaceImpl.attachView(reactSurfaceViewCreateReactSurfaceView);
        reactSurfaceImpl.attach(this);
        return reactSurfaceImpl;
    }

    @Override // com.facebook.react.ReactHost
    @NotNull
    public TaskInterface<Void> destroy(@NotNull String reason, Exception ex, @NotNull Function1<? super Boolean, Unit> onDestroyFinished) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(onDestroyFinished, "onDestroyFinished");
        TaskInterface<Void> taskInterfaceDestroy = destroy(reason, ex);
        Intrinsics.checkNotNull(taskInterfaceDestroy, "null cannot be cast to non-null type com.facebook.react.runtime.internal.bolts.Task<java.lang.Void>");
        return Task.continueWith$default((Task) taskInterfaceDestroy, new j(0, onDestroyFinished), null, 2, null);
    }

    public final void detachSurface$ReactAndroid_release(@NotNull ReactSurfaceImpl surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        ReactHostStateTracker.enterState$default(this.stateTracker, s0.g.d(surface.getSurfaceID(), "detachSurface(surfaceId = ", ")"), null, 2, null);
        synchronized (this.attachedSurfaces) {
            this.attachedSurfaces.remove(surface);
        }
    }

    public final Activity getCurrentActivity$ReactAndroid_release() {
        return this.activity.get();
    }

    @Override // com.facebook.react.ReactHost
    public ReactContext getCurrentReactContext() {
        return this.bridgelessReactContextRef.getNullable();
    }

    @NotNull
    public final DefaultHardwareBackBtnHandler getDefaultBackButtonHandler$ReactAndroid_release() {
        return new DefaultHardwareBackBtnHandler() { // from class: com.facebook.react.runtime.n
            @Override // com.facebook.react.modules.core.DefaultHardwareBackBtnHandler
            public final void invokeDefaultOnBackPressed() {
                ReactHostImpl._get_defaultBackButtonHandler_$lambda$19(this.f5318d);
            }
        };
    }

    @Override // com.facebook.react.ReactHost
    @NotNull
    public DevSupportManager getDevSupportManager() {
        return this.devSupportManager;
    }

    @NotNull
    public final EventDispatcher getEventDispatcher$ReactAndroid_release() {
        EventDispatcher eventDispatcher;
        ReactInstance reactInstance = this.reactInstance;
        return (reactInstance == null || (eventDispatcher = reactInstance.getEventDispatcher()) == null) ? BlackHoleEventDispatcher.INSTANCE : eventDispatcher;
    }

    public final JavaScriptContextHolder getJavaScriptContextHolder$ReactAndroid_release() {
        ReactInstance reactInstance = this.reactInstance;
        if (reactInstance != null) {
            return reactInstance.getJavaScriptContextHolder();
        }
        return null;
    }

    public final CallInvokerHolder getJsCallInvokerHolder$ReactAndroid_release() {
        ReactInstance reactInstance = this.reactInstance;
        if (reactInstance != null) {
            return reactInstance.getJSCallInvokerHolder();
        }
        raiseSoftException$default(this, "getJSCallInvokerHolder()", "Tried to get JSCallInvokerHolder while instance is not ready", null, 4, null);
        return null;
    }

    public final Activity getLastUsedActivity$ReactAndroid_release() {
        WeakReference<Activity> weakReference = this.lastUsedActivityRef.get();
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // com.facebook.react.ReactHost
    @NotNull
    public LifecycleState getLifecycleState() {
        return this.reactLifecycleStateManager.getState();
    }

    @Override // com.facebook.react.ReactHost
    @NotNull
    public MemoryPressureRouter getMemoryPressureRouter() {
        return this.memoryPressureRouter;
    }

    public final <T extends NativeModule> T getNativeModule$ReactAndroid_release(@NotNull Class<T> nativeModuleInterface) {
        Intrinsics.checkNotNullParameter(nativeModuleInterface, "nativeModuleInterface");
        if (!ReactBuildConfig.UNSTABLE_ENABLE_MINIFY_LEGACY_ARCHITECTURE && Intrinsics.areEqual(nativeModuleInterface, UIManagerModule.class)) {
            ReactSoftExceptionLogger.logSoftExceptionVerbose(TAG, new ReactNoCrashSoftException("getNativeModule(UIManagerModule.class) cannot be called when the bridge is disabled"));
        }
        ReactInstance reactInstance = this.reactInstance;
        if (reactInstance != null) {
            return (T) reactInstance.getNativeModule(nativeModuleInterface);
        }
        return null;
    }

    @NotNull
    public final Collection<NativeModule> getNativeModules$ReactAndroid_release() {
        Collection<NativeModule> nativeModules;
        ReactInstance reactInstance = this.reactInstance;
        return (reactInstance == null || (nativeModules = reactInstance.getNativeModules()) == null) ? n0.f14659d : nativeModules;
    }

    public final ReactHostInspectorTarget getOrCreateReactHostInspectorTarget$ReactAndroid_release() {
        if (this.reactHostInspectorTarget == null && InspectorFlags.getFuseboxEnabled()) {
            this.reactHostInspectorTarget = createReactHostInspectorTarget();
        }
        return this.reactHostInspectorTarget;
    }

    /* JADX INFO: renamed from: getReactHostInspectorTarget$ReactAndroid_release, reason: from getter */
    public final ReactHostInspectorTarget getReactHostInspectorTarget() {
        return this.reactHostInspectorTarget;
    }

    @Override // com.facebook.react.ReactHost
    public ReactQueueConfiguration getReactQueueConfiguration() {
        ReactInstance reactInstance = this.reactInstance;
        if (reactInstance != null) {
            return reactInstance.getReactQueueConfiguration();
        }
        return null;
    }

    public final RuntimeExecutor getRuntimeExecutor$ReactAndroid_release() {
        ReactInstance reactInstance = this.reactInstance;
        if (reactInstance != null) {
            return reactInstance.getBufferedRuntimeExecutor();
        }
        raiseSoftException$default(this, "getRuntimeExecutor()", "Tried to get runtime executor while instance is not ready", null, 4, null);
        return null;
    }

    public final FabricUIManager getUiManager$ReactAndroid_release() {
        ReactInstance reactInstance = this.reactInstance;
        if (reactInstance != null) {
            return reactInstance.getFabricUIManager();
        }
        return null;
    }

    public final void handleHostException$ReactAndroid_release(@NotNull Exception e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        String strE = s0.g.e("handleHostException(message = \"", e10.getMessage(), "\")");
        ReactHostStateTracker.enterState$default(this.stateTracker, strE, null, 2, null);
        if (this.useDevSupport) {
            getDevSupportManager().handleException(e10);
        } else {
            this.reactHostDelegate.handleInstanceException(e10);
        }
        destroy(strE, e10);
    }

    public final <T extends NativeModule> boolean hasNativeModule$ReactAndroid_release(@NotNull Class<T> nativeModuleInterface) {
        Intrinsics.checkNotNullParameter(nativeModuleInterface, "nativeModuleInterface");
        ReactInstance reactInstance = this.reactInstance;
        if (reactInstance != null) {
            return reactInstance.hasNativeModule(nativeModuleInterface);
        }
        return false;
    }

    @Override // com.facebook.react.ReactHost
    public void invalidate() {
        o8.a.b(TAG, "ReactHostImpl.invalidate()");
        this.hostInvalidated = true;
        destroy("ReactHostImpl.invalidate()", null);
    }

    public final boolean isInstanceInitialized$ReactAndroid_release() {
        return this.reactInstance != null;
    }

    public final boolean isSurfaceAttached$ReactAndroid_release(@NotNull ReactSurfaceImpl surface) {
        boolean zContains;
        Intrinsics.checkNotNullParameter(surface, "surface");
        synchronized (this.attachedSurfaces) {
            zContains = this.attachedSurfaces.contains(surface);
        }
        return zContains;
    }

    public final boolean isSurfaceWithModuleNameAttached$ReactAndroid_release(@NotNull String moduleName) {
        boolean z5;
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        synchronized (this.attachedSurfaces) {
            try {
                Set<ReactSurfaceImpl> set = this.attachedSurfaces;
                z5 = false;
                if (!(set instanceof Collection) || !set.isEmpty()) {
                    Iterator<T> it = set.iterator();
                    while (it.hasNext()) {
                        if (Intrinsics.areEqual(((ReactSurfaceImpl) it.next()).getModuleName(), moduleName)) {
                            z5 = true;
                            break;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z5;
    }

    @NotNull
    public final Task<Boolean> loadBundle$ReactAndroid_release(@NotNull JSBundleLoader bundleLoader) {
        Intrinsics.checkNotNullParameter(bundleLoader, "bundleLoader");
        this.stateTracker.enterState("loadBundle()", "Schedule");
        return callWithExistingReactInstance$default(this, "loadBundle()", null, new p(0, this, bundleLoader), 2, null);
    }

    @Override // com.facebook.react.ReactHost
    public void onActivityResult(@NotNull Activity activity, int requestCode, int resultCode, Intent data) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        StringBuilder sb2 = new StringBuilder("onActivityResult(activity = \"");
        sb2.append(activity);
        sb2.append("\", requestCode = \"");
        a3.e.z(sb2, requestCode, "\", resultCode = \"", resultCode, "\", data = \"");
        sb2.append(data);
        sb2.append("\")");
        String string = sb2.toString();
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext != null) {
            currentReactContext.onActivityResult(activity, requestCode, resultCode, data);
        } else {
            raiseSoftException$default(this, string, "Tried to access onActivityResult while context is not ready", null, 4, null);
        }
    }

    @Override // com.facebook.react.ReactHost
    public boolean onBackPressed() {
        DeviceEventManagerModule deviceEventManagerModule;
        UiThreadUtil.assertOnUiThread();
        ReactInstance reactInstance = this.reactInstance;
        if (reactInstance == null || (deviceEventManagerModule = (DeviceEventManagerModule) reactInstance.getNativeModule(DeviceEventManagerModule.class)) == null) {
            return false;
        }
        deviceEventManagerModule.emitHardwareBackPressed();
        return true;
    }

    @Override // com.facebook.react.ReactHost
    public void onConfigurationChanged(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext != null) {
            if (ReactNativeFeatureFlags.enableFontScaleChangesUpdatingLayout()) {
                float pixelFromSP = PixelUtil.toPixelFromSP(1.0d);
                DisplayMetricsHolder.initDisplayMetrics(currentReactContext);
                if (pixelFromSP != PixelUtil.toPixelFromSP(1.0d)) {
                    synchronized (this.attachedSurfaces) {
                        try {
                            Iterator<T> it = this.attachedSurfaces.iterator();
                            while (it.hasNext()) {
                                ReactSurfaceView view = ((ReactSurfaceImpl) it.next()).getView();
                                if (view != null) {
                                    view.requestLayout();
                                }
                            }
                            Unit unit = Unit.f14616a;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
            AppearanceModule appearanceModule = (AppearanceModule) currentReactContext.getNativeModule(AppearanceModule.class);
            if (appearanceModule != null) {
                appearanceModule.onConfigurationChanged(context);
            }
        }
    }

    @Override // com.facebook.react.ReactHost
    public void onHostDestroy() {
        ReactHostStateTracker.enterState$default(this.stateTracker, "onHostDestroy()", null, 2, null);
        maybeEnableDevSupport(false);
        moveToHostDestroy(getCurrentReactContext());
    }

    @Override // com.facebook.react.ReactHost
    public void onHostLeaveHint(Activity activity) {
        ReactHostStateTracker.enterState$default(this.stateTracker, "onUserLeaveHint(activity)", null, 2, null);
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext != null) {
            currentReactContext.onUserLeaveHint(activity);
        }
    }

    @Override // com.facebook.react.ReactHost
    public void onHostPause(Activity activity) {
        ReactHostStateTracker.enterState$default(this.stateTracker, "onHostPause(activity)", null, 2, null);
        if (activity != null) {
            this.activeActivities.remove(activity);
            if (this.activeActivities.size() > 0) {
                return;
            }
        }
        maybeEnableDevSupport(false);
        this.defaultHardwareBackBtnHandler = null;
        this.reactLifecycleStateManager.moveToOnHostPause(getCurrentReactContext(), activity);
    }

    @Override // com.facebook.react.ReactHost
    public void onHostResume(Activity activity, DefaultHardwareBackBtnHandler defaultBackButtonImpl) {
        this.defaultHardwareBackBtnHandler = defaultBackButtonImpl;
        onHostResume(activity);
    }

    @Override // com.facebook.react.ReactHost
    public void onNewIntent(@NotNull Intent intent) {
        DeviceEventManagerModule deviceEventManagerModule;
        Intrinsics.checkNotNullParameter(intent, "intent");
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext == null) {
            raiseSoftException$default(this, "onNewIntent(intent = \"" + intent + "\")", "Tried to access onNewIntent while context is not ready", null, 4, null);
            return;
        }
        String action = intent.getAction();
        Uri data = intent.getData();
        if (data != null && ((Intrinsics.areEqual("android.intent.action.VIEW", action) || Intrinsics.areEqual("android.nfc.action.NDEF_DISCOVERED", action)) && (deviceEventManagerModule = (DeviceEventManagerModule) currentReactContext.getNativeModule(DeviceEventManagerModule.class)) != null)) {
            deviceEventManagerModule.emitNewIntentReceived(data);
        }
        currentReactContext.onNewIntent(getCurrentActivity$ReactAndroid_release(), intent);
    }

    @Override // com.facebook.react.ReactHost
    public void onWindowFocusChange(boolean hasFocus) {
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext != null) {
            currentReactContext.onWindowFocusChange(hasFocus);
            return;
        }
        raiseSoftException$default(this, "onWindowFocusChange(hasFocus = \"" + hasFocus + "\")", "Tried to access onWindowFocusChange while context is not ready", null, 4, null);
    }

    @NotNull
    public final TaskInterface<Void> prerenderSurface$ReactAndroid_release(@NotNull ReactSurfaceImpl surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        String strD = s0.g.d(surface.getSurfaceID(), "prerenderSurface(surfaceId = ", ")");
        this.stateTracker.enterState(strD, "Schedule");
        attachSurface$ReactAndroid_release(surface);
        return callAfterGetOrCreateReactInstance(strD, this.bgExecutor, new k(this, strD, surface, 0));
    }

    @NotNull
    public final Task<Boolean> registerSegment$ReactAndroid_release(final int segmentId, @NotNull final String path, final Callback callback) {
        Intrinsics.checkNotNullParameter(path, "path");
        StringBuilder sb2 = new StringBuilder("registerSegment(segmentId = \"");
        sb2.append(segmentId);
        sb2.append("\", path = \"");
        final String strK = com.discord.chat.presentation.list.a.k(sb2, path, "\")");
        this.stateTracker.enterState(strK, "Schedule");
        return callWithExistingReactInstance$default(this, strK, null, new Function1() { // from class: com.facebook.react.runtime.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReactHostImpl.registerSegment$lambda$21(this.f5289d, strK, segmentId, path, callback, (ReactInstance) obj);
            }
        }, 2, null);
    }

    @Override // com.facebook.react.ReactHost
    @NotNull
    public TaskInterface<Void> reload(@NotNull String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        return Task.INSTANCE.call(new o(0, this, reason), this.bgExecutor);
    }

    @Override // com.facebook.react.ReactHost
    public void removeBeforeDestroyListener(@NotNull Function0<Unit> onBeforeDestroy) {
        Intrinsics.checkNotNullParameter(onBeforeDestroy, "onBeforeDestroy");
        this.beforeDestroyListeners.remove(onBeforeDestroy);
    }

    @Override // com.facebook.react.ReactHost
    public void removeReactInstanceEventListener(@NotNull ReactInstanceEventListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.reactInstanceEventListeners.remove(listener);
    }

    @Override // com.facebook.react.ReactHost
    public void setBundleSource(@NotNull String debugServerHost, @NotNull String moduleName, @NotNull Function1<? super Map<String, String>, ? extends Map<String, String>> queryMapper) {
        Intrinsics.checkNotNullParameter(debugServerHost, "debugServerHost");
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        Intrinsics.checkNotNullParameter(queryMapper, "queryMapper");
        b0.t(b0.b(k0.f2938a), null, new C02541(queryMapper, debugServerHost, moduleName, null), 3);
    }

    @Override // com.facebook.react.ReactHost
    public void setDevMenuConfiguration(@NotNull DevMenuConfiguration config) {
        Intrinsics.checkNotNullParameter(config, "config");
        getDevSupportManager().setDevMenuEnabled(config.getDevMenuEnabled());
        getDevSupportManager().setShakeGestureEnabled(config.getShakeGestureEnabled());
        getDevSupportManager().setKeyboardShortcutsEnabled(config.getKeyboardShortcutsEnabled());
    }

    public final void setReactHostInspectorTarget$ReactAndroid_release(ReactHostInspectorTarget reactHostInspectorTarget) {
        this.reactHostInspectorTarget = reactHostInspectorTarget;
    }

    @Override // com.facebook.react.ReactHost
    @NotNull
    public TaskInterface<Void> start() {
        return Task.INSTANCE.call(new c(this, 1), this.bgExecutor);
    }

    @NotNull
    public final TaskInterface<Void> startSurface$ReactAndroid_release(@NotNull ReactSurfaceImpl surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        String strD = s0.g.d(surface.getSurfaceID(), "startSurface(surfaceId = ", ")");
        this.stateTracker.enterState(strD, "Schedule");
        attachSurface$ReactAndroid_release(surface);
        return callAfterGetOrCreateReactInstance(strD, this.bgExecutor, new k(this, strD, surface, 2));
    }

    @NotNull
    public final TaskInterface<Void> stopSurface$ReactAndroid_release(@NotNull ReactSurfaceImpl surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        String strD = s0.g.d(surface.getSurfaceID(), "stopSurface(surfaceId = ", ")");
        this.stateTracker.enterState(strD, "Schedule");
        detachSurface$ReactAndroid_release(surface);
        return callWithExistingReactInstance(strD, this.bgExecutor, new k(this, strD, surface, 1)).makeVoid();
    }

    public final void unregisterInstanceFromInspector$ReactAndroid_release(ReactInstance reactInstance) {
        if (reactInstance != null) {
            if (InspectorFlags.getFuseboxEnabled()) {
                ReactHostInspectorTarget reactHostInspectorTarget = this.reactHostInspectorTarget;
                boolean z5 = false;
                if (reactHostInspectorTarget != null && reactHostInspectorTarget.isValid()) {
                    z5 = true;
                }
                io.sentry.config.a.e(z5, "Host inspector target destroyed before instance was unregistered");
            }
            reactInstance.unregisterFromInspector();
        }
    }

    @Override // com.facebook.react.ReactHost
    @NotNull
    public TaskInterface<Void> destroy(@NotNull String reason, Exception ex) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        return Task.INSTANCE.call(new q(this, reason, ex, 0), this.bgExecutor);
    }

    @Override // com.facebook.react.ReactHost
    public void onHostResume(Activity activity) {
        ReactHostStateTracker.enterState$default(this.stateTracker, "onHostResume(activity)", null, 2, null);
        if (activity != null) {
            this.activeActivities.put(activity, Boolean.TRUE);
        }
        setCurrentActivity(activity);
        FrameTimingsObserver frameTimingsObserver = this.frameTimingsObserver;
        if (frameTimingsObserver != null) {
            frameTimingsObserver.setCurrentWindow(activity != null ? activity.getWindow() : null);
        }
        maybeEnableDevSupport(true);
        this.reactLifecycleStateManager.moveToOnHostResume(getCurrentReactContext(), activity);
    }

    @Override // com.facebook.react.ReactHost
    public void setBundleSource(@NotNull String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        getDevSupportManager().setBundleFilePath(filePath);
        reload("Change bundle source");
    }

    @Override // com.facebook.react.ReactHost
    public void onHostDestroy(Activity activity) {
        ReactHostStateTracker.enterState$default(this.stateTracker, "onHostDestroy(activity)", null, 2, null);
        if (activity != null) {
            this.activeActivities.remove(activity);
            if (this.activeActivities.size() > 0) {
                return;
            }
        }
        if (getCurrentActivity$ReactAndroid_release() == activity) {
            maybeEnableDevSupport(false);
            moveToHostDestroy(getCurrentReactContext());
        }
    }

    @Override // com.facebook.react.ReactHost
    public void onHostPause() {
        ReactHostStateTracker.enterState$default(this.stateTracker, "onHostPause()", null, 2, null);
        maybeEnableDevSupport(false);
        this.defaultHardwareBackBtnHandler = null;
        this.reactLifecycleStateManager.moveToOnHostPause(getCurrentReactContext(), getCurrentActivity$ReactAndroid_release());
    }

    public final NativeModule getNativeModule$ReactAndroid_release(@NotNull String nativeModuleName) {
        Intrinsics.checkNotNullParameter(nativeModuleName, "nativeModuleName");
        ReactInstance reactInstance = this.reactInstance;
        if (reactInstance != null) {
            return reactInstance.getNativeModule(nativeModuleName);
        }
        return null;
    }

    public /* synthetic */ ReactHostImpl(Context context, ReactHostDelegate reactHostDelegate, ComponentFactory componentFactory, Executor executor, Executor executor2, boolean z5, boolean z6, DevSupportManagerFactory devSupportManagerFactory, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, reactHostDelegate, componentFactory, (i7 & 8) != 0 ? Executors.newSingleThreadExecutor() : executor, (i7 & 16) != 0 ? Task.UI_THREAD_EXECUTOR : executor2, z5, z6, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? null : devSupportManagerFactory);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ReactHostImpl(@NotNull Context context, @NotNull ReactHostDelegate delegate, @NotNull ComponentFactory componentFactory, boolean z5, boolean z6) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(componentFactory, "componentFactory");
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        this(context, delegate, componentFactory, executorServiceNewSingleThreadExecutor, Task.UI_THREAD_EXECUTOR, z5, z6, null, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT, null);
    }
}
