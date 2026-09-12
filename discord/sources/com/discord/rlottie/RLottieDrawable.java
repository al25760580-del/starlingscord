package com.discord.rlottie;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.imageutils.JfifUtil;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.ViewProps;
import com.rnlineargradient.LinearGradientManager;
import java.io.File;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b$\b\u0016\u0018\u0000 \u0080\u00012\u00020\u00012\u00020\u0002:\u0004\u0080\u0001\u0081\u0001BC\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fBO\b\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\u0006\u0010\u0016\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\u0017\u001a\u00020\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u0018J\u0010\u0010U\u001a\u00020V2\b\u0010W\u001a\u0004\u0018\u00010'J\u0006\u0010X\u001a\u00020VJ\b\u0010Y\u001a\u00020VH\u0002J\u0006\u0010Z\u001a\u00020VJ\b\u0010[\u001a\u00020VH\u0002J\u0010\u0010\\\u001a\u00020V2\u0006\u0010]\u001a\u00020^H\u0016J\b\u0010_\u001a\u00020\u0006H\u0016J\b\u0010`\u001a\u00020\u0006H\u0016J\b\u0010a\u001a\u00020\u0006H\u0016J\b\u0010b\u001a\u00020\u0006H\u0016J\b\u0010c\u001a\u00020\u0006H\u0016J\u0006\u0010d\u001a\u00020\tJ\b\u0010e\u001a\u00020\tH\u0002J\b\u0010f\u001a\u00020VH\u0002J\b\u00101\u001a\u00020\tH\u0016J\u0010\u0010g\u001a\u00020V2\u0006\u0010h\u001a\u00020,H\u0014J\u0006\u0010i\u001a\u00020VJ\u0010\u0010i\u001a\u00020V2\b\b\u0002\u0010j\u001a\u00020\tJ\b\u0010k\u001a\u00020VH\u0002J\u0010\u0010l\u001a\u00020V2\b\u0010W\u001a\u0004\u0018\u00010'J\u001b\u0010m\u001a\u00020V2\u000e\u0010n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010;¢\u0006\u0002\u0010oJ\b\u0010p\u001a\u00020VH\u0002J\u0006\u0010q\u001a\u00020\tJ\b\u0010r\u001a\u00020\tH\u0002J\u000e\u0010s\u001a\u00020V2\u0006\u0010t\u001a\u00020\tJ\u0010\u0010u\u001a\u00020V2\b\u0010W\u001a\u0004\u0018\u00010'J\u0016\u0010v\u001a\u00020V2\u0006\u0010w\u001a\u00020\u00142\u0006\u0010x\u001a\u00020\u0006J\u000e\u0010y\u001a\u00020V2\u0006\u0010t\u001a\u00020FJ\u000e\u0010z\u001a\u00020V2\u0006\u0010{\u001a\u00020\fJ\u001c\u0010|\u001a\u00020V2\u0014\u0010}\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u000109J\b\u0010~\u001a\u00020VH\u0016J\b\u0010\u007f\u001a\u00020VH\u0016R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010!\u001a\u0004\u0018\u00010\u001a2\b\u0010 \u001a\u0004\u0018\u00010\u001a@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010.\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u000e\u00100\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u000203X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u00105\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u000203X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000609X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010;X\u0082\u000e¢\u0006\u0004\n\u0002\u0010<R\u000e\u0010=\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010>\u001a\u0004\u0018\u00010\u001a2\b\u0010 \u001a\u0004\u0018\u00010\u001a@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b?\u0010\u001cR\u001c\u0010@\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010'0B0AX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000609X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010D\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010;X\u0082\u000e¢\u0006\u0004\n\u0002\u0010<R\u000e\u0010E\u001a\u00020FX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010G\u001a\u0004\u0018\u00010\u001a2\b\u0010 \u001a\u0004\u0018\u00010\u001a@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\bH\u0010\u001cR\u000e\u0010I\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010T\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u000109X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0082\u0001"}, d2 = {"Lcom/discord/rlottie/RLottieDrawable;", "Landroid/graphics/drawable/BitmapDrawable;", "Landroid/graphics/drawable/Animatable;", "file", "Ljava/io/File;", "w", "", "h", "precache", "", "limitFps", "screenRefreshRate", "", "colorReplacement", "", "(Ljava/io/File;IIZZF[I)V", "context", "Landroid/content/Context;", "rawRes", StackTraceHelper.NAME_KEY, "", "width", "height", "startDecode", "(Landroid/content/Context;ILjava/lang/String;IIFZ[I)V", "animatedBitmap", "Landroid/graphics/Bitmap;", "getAnimatedBitmap", "()Landroid/graphics/Bitmap;", "applyTransformation", "applyingLayerColors", "autoRepeatPlayCount", "<set-?>", "backgroundBitmap", "getBackgroundBitmap", "cacheGenerateTask", "Ljava/lang/Runnable;", "currentFrame", "currentParentView", "Landroid/view/View;", "customEndFrame", "decodeSingleFrame", "destroyWhenDone", "dstRect", "Landroid/graphics/Rect;", "forceFrameRedraw", "isCurrentParentViewMaster", "()Z", "isRecycled", "isRunning", "lastFrameTime", "", "loadFrameRunnable", "loadFrameTask", "metaData", "nativePtr", "newColorUpdates", "Ljava/util/HashMap;", "newReplaceColors", "", "[Ljava/lang/Integer;", "nextFrameIsLast", "nextRenderingBitmap", "getNextRenderingBitmap", "parentViews", "Ljava/util/ArrayList;", "Ljava/lang/ref/WeakReference;", "pendingColorUpdates", "pendingReplaceColors", "playbackMode", "Lcom/discord/rlottie/RLottieDrawable$PlaybackMode;", "renderingBitmap", "getRenderingBitmap", ViewProps.SCALE_X, ViewProps.SCALE_Y, "shouldLimitFps", "singleFrameDecoded", "timeBetweenFrames", "uiRunnable", "uiRunnableCacheFinished", "uiRunnableGenerateCache", "uiRunnableGenerateCacheQueue", "uiRunnableLastFrame", "uiRunnableNoFrame", "vibrationPattern", "addParentView", "", "view", "beginApplyLayerColors", "checkRunningTasks", "commitApplyLayerColors", "decodeFrameFinishedInternal", "draw", "canvas", "Landroid/graphics/Canvas;", "getIntrinsicHeight", "getIntrinsicWidth", "getMinimumHeight", "getMinimumWidth", "getOpacity", "hasBitmap", "hasParentView", "invalidateInternal", "onBoundsChange", "bounds", "recycle", "calledByUs", "recycleResources", "removeParentView", "replaceColors", LinearGradientManager.PROP_COLORS, "([Ljava/lang/Integer;)V", "requestRedrawColors", "restart", "scheduleNextGetFrame", "setAllowDecodeSingleFrame", "value", "setCurrentParentView", "setLayerColor", "layerName", ViewProps.COLOR, "setPlaybackMode", "setProgress", "oldProgress", "setVibrationPattern", "pattern", ViewProps.START, "stop", "Companion", "PlaybackMode", "rlottie_release"}, k = 1, mv = {1, 1, 16})
public class RLottieDrawable extends BitmapDrawable implements Animatable {
    private static ThreadPoolExecutor lottieCacheGenerateQueue;
    private boolean applyTransformation;
    private boolean applyingLayerColors;
    private int autoRepeatPlayCount;
    private volatile Bitmap backgroundBitmap;
    private Runnable cacheGenerateTask;
    private int currentFrame;
    private View currentParentView;
    private int customEndFrame;
    private boolean decodeSingleFrame;
    private volatile boolean destroyWhenDone;
    private final Rect dstRect;
    private boolean forceFrameRedraw;
    private int height;
    private volatile boolean isRecycled;
    private volatile boolean isRunning;
    private long lastFrameTime;
    private final Runnable loadFrameRunnable;
    private Runnable loadFrameTask;
    private final int[] metaData;
    private volatile long nativePtr;
    private final HashMap<String, Integer> newColorUpdates;
    private Integer[] newReplaceColors;
    private volatile boolean nextFrameIsLast;
    private volatile Bitmap nextRenderingBitmap;
    private final ArrayList<WeakReference<View>> parentViews;
    private volatile HashMap<String, Integer> pendingColorUpdates;
    private Integer[] pendingReplaceColors;
    private PlaybackMode playbackMode;
    private volatile Bitmap renderingBitmap;
    private float scaleX;
    private float scaleY;
    private float screenRefreshRate;
    private boolean shouldLimitFps;
    private boolean singleFrameDecoded;
    private int timeBetweenFrames;
    private final Runnable uiRunnable;
    private final Runnable uiRunnableCacheFinished;
    private final Runnable uiRunnableGenerateCache;
    private final Runnable uiRunnableGenerateCacheQueue;
    private final Runnable uiRunnableLastFrame;
    private final Runnable uiRunnableNoFrame;
    private HashMap<Integer, Integer> vibrationPattern;
    private int width;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Handler uiHandler = new Handler(Looper.getMainLooper());
    private static byte[] readBuffer = new byte[65536];
    private static final byte[] buffer = new byte[RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT];
    private static final ExecutorService loadFrameRunnableQueue = Executors.newCachedThreadPool();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JC\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0019\u001a\u00020\u0017H\u0082 J!\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0082 J+\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0015H\u0082 J\u0011\u0010 \u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000eH\u0082 JA\u0010!\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020$2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u0017H\u0082 J\u0019\u0010'\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0015H\u0082 J!\u0010(\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u00102\u0006\u0010*\u001a\u00020\u0012H\u0082 R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/discord/rlottie/RLottieDrawable$Companion;", "", "()V", "buffer", "", "loadFrameRunnableQueue", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "lottieCacheGenerateQueue", "Ljava/util/concurrent/ThreadPoolExecutor;", "readBuffer", "uiHandler", "Landroid/os/Handler;", "create", "", "src", "", "w", "", "h", "params", "", "precache", "", "colorReplacement", "limitFps", "createCache", "", "ptr", "createWithJson", "json", StackTraceHelper.NAME_KEY, "destroy", "getFrame", "frame", "bitmap", "Landroid/graphics/Bitmap;", "stride", "clear", "replaceColors", "setLayerColor", "layer", ViewProps.COLOR, "rlottie_release"}, k = 1, mv = {1, 1, 16})
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final native long create(String src, int w5, int h6, int[] params, boolean precache, int[] colorReplacement, boolean limitFps);

        /* JADX INFO: Access modifiers changed from: private */
        public final native void createCache(long ptr, int w5, int h6);

        /* JADX INFO: Access modifiers changed from: private */
        public final native long createWithJson(String json, String name, int[] params, int[] colorReplacement);

        /* JADX INFO: Access modifiers changed from: private */
        public final native void destroy(long ptr);

        /* JADX INFO: Access modifiers changed from: private */
        public final native int getFrame(long ptr, int frame, Bitmap bitmap, int w5, int h6, int stride, boolean clear);

        /* JADX INFO: Access modifiers changed from: private */
        public final native void replaceColors(long ptr, int[] colorReplacement);

        /* JADX INFO: Access modifiers changed from: private */
        public final native void setLayerColor(long ptr, String layer, int color);

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/discord/rlottie/RLottieDrawable$PlaybackMode;", "", "(Ljava/lang/String;I)V", "LOOP", "ONCE", "FREEZE", "rlottie_release"}, k = 1, mv = {1, 1, 16})
    public enum PlaybackMode {
        LOOP,
        ONCE,
        FREEZE
    }

    public RLottieDrawable(@NotNull Context context, int i7, @NotNull String str, int i10, int i11, float f2) {
        this(context, i7, str, i10, i11, f2, false, null, JfifUtil.MARKER_SOFn, null);
    }

    private final void checkRunningTasks() {
        if (this.cacheGenerateTask != null) {
            ThreadPoolExecutor threadPoolExecutor = lottieCacheGenerateQueue;
            if (threadPoolExecutor == null) {
                Intrinsics.throwNpe();
            }
            if (threadPoolExecutor.remove(this.cacheGenerateTask)) {
                this.cacheGenerateTask = null;
            }
        }
        if (hasParentView() || this.nextRenderingBitmap == null || this.loadFrameTask == null) {
            return;
        }
        this.loadFrameTask = null;
        Bitmap bitmap = this.nextRenderingBitmap;
        if (bitmap == null) {
            Intrinsics.throwNpe();
        }
        bitmap.recycle();
        this.nextRenderingBitmap = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void decodeFrameFinishedInternal() {
        if (this.destroyWhenDone) {
            checkRunningTasks();
            recycle(true);
        }
        if (this.nativePtr == 0) {
            recycleResources();
            return;
        }
        if (!hasParentView()) {
            stop();
        }
        scheduleNextGetFrame();
    }

    private final boolean hasParentView() {
        if (getCallback() != null) {
            return true;
        }
        for (int size = this.parentViews.size(); size > 0; size--) {
            if (this.parentViews.get(0).get() != null) {
                return true;
            }
            this.parentViews.remove(0);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invalidateInternal() {
        int size = this.parentViews.size();
        int i7 = 0;
        while (i7 < size) {
            View view = this.parentViews.get(i7).get();
            if (view != null) {
                view.invalidate();
            } else {
                this.parentViews.remove(i7);
                size--;
                i7--;
            }
            i7++;
        }
        if (getCallback() != null) {
            invalidateSelf();
        }
    }

    private final boolean isCurrentParentViewMaster() {
        if (getCallback() != null) {
            return true;
        }
        for (int size = this.parentViews.size(); size > 0; size--) {
            if (this.parentViews.get(0).get() != null) {
                return this.parentViews.get(0).get() == this.currentParentView;
            }
            this.parentViews.remove(0);
        }
        return true;
    }

    public static /* synthetic */ void recycle$default(RLottieDrawable rLottieDrawable, boolean z5, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: recycle");
        }
        if ((i7 & 1) != 0) {
            z5 = false;
        }
        rLottieDrawable.recycle(z5);
    }

    private final void recycleResources() {
        if (this.renderingBitmap != null) {
            Bitmap bitmap = this.renderingBitmap;
            if (bitmap == null) {
                Intrinsics.throwNpe();
            }
            bitmap.recycle();
            this.renderingBitmap = null;
        }
        if (this.backgroundBitmap != null) {
            Bitmap bitmap2 = this.backgroundBitmap;
            if (bitmap2 == null) {
                Intrinsics.throwNpe();
            }
            bitmap2.recycle();
            this.backgroundBitmap = null;
        }
        if (this.nextRenderingBitmap != null) {
            Bitmap bitmap3 = this.nextRenderingBitmap;
            if (bitmap3 == null) {
                Intrinsics.throwNpe();
            }
            bitmap3.recycle();
            this.nextRenderingBitmap = null;
        }
        this.pendingColorUpdates.clear();
        this.newColorUpdates.clear();
        this.pendingReplaceColors = null;
        this.newReplaceColors = null;
    }

    private final void requestRedrawColors() {
        if (!this.applyingLayerColors && !this.isRunning && this.decodeSingleFrame) {
            if (this.currentFrame <= 2) {
                this.currentFrame = 0;
            }
            this.nextFrameIsLast = false;
            this.singleFrameDecoded = false;
            if (!scheduleNextGetFrame()) {
                this.forceFrameRedraw = true;
            }
        }
        invalidateInternal();
    }

    private final boolean scheduleNextGetFrame() {
        if (this.loadFrameTask != null || this.nextRenderingBitmap != null || this.nativePtr == 0 || this.destroyWhenDone) {
            return false;
        }
        if (!this.isRunning) {
            boolean z5 = this.decodeSingleFrame;
            if (!z5) {
                return false;
            }
            if (z5 && this.singleFrameDecoded) {
                return false;
            }
        }
        if (!this.newColorUpdates.isEmpty()) {
            this.pendingColorUpdates.putAll(this.newColorUpdates);
            this.newColorUpdates.clear();
        }
        Integer[] numArr = this.newReplaceColors;
        if (numArr != null) {
            this.pendingReplaceColors = numArr;
            this.newReplaceColors = null;
        }
        ExecutorService executorService = loadFrameRunnableQueue;
        Runnable runnable = this.loadFrameRunnable;
        this.loadFrameTask = runnable;
        executorService.execute(runnable);
        return true;
    }

    public final void addParentView(View view) {
        if (view == null) {
            return;
        }
        int size = this.parentViews.size();
        int i7 = 0;
        while (i7 < size) {
            if (this.parentViews.get(i7).get() == view) {
                return;
            }
            if (this.parentViews.get(i7).get() == null) {
                this.parentViews.remove(i7);
                size--;
                i7--;
            }
            i7++;
        }
        this.parentViews.add(0, new WeakReference<>(view));
    }

    public final void beginApplyLayerColors() {
        this.applyingLayerColors = true;
    }

    public final void commitApplyLayerColors() {
        if (this.applyingLayerColors) {
            this.applyingLayerColors = false;
            if (!this.isRunning && this.decodeSingleFrame) {
                if (this.currentFrame <= 2) {
                    this.currentFrame = 0;
                }
                this.nextFrameIsLast = false;
                this.singleFrameDecoded = false;
                if (!scheduleNextGetFrame()) {
                    this.forceFrameRedraw = true;
                }
            }
            invalidateInternal();
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        View view;
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        if (this.nativePtr == 0 || this.destroyWhenDone) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jAbs = Math.abs(jElapsedRealtime - this.lastFrameTime);
        float f2 = 60;
        int i7 = this.screenRefreshRate <= f2 ? this.timeBetweenFrames - 6 : this.timeBetweenFrames;
        if (this.isRunning) {
            if (this.renderingBitmap == null && this.nextRenderingBitmap == null) {
                scheduleNextGetFrame();
            } else if (this.nextRenderingBitmap != null && ((this.renderingBitmap == null || jAbs >= i7) && isCurrentParentViewMaster())) {
                HashMap<Integer, Integer> map = this.vibrationPattern;
                if (map != null && this.currentParentView != null) {
                    if (map == null) {
                        Intrinsics.throwNpe();
                    }
                    Integer num = map.get(Integer.valueOf(this.currentFrame - 1));
                    if (num != null && (view = this.currentParentView) != null) {
                        view.performHapticFeedback(num.intValue() == 1 ? 0 : 3, 2);
                    }
                }
                this.backgroundBitmap = this.renderingBitmap;
                this.renderingBitmap = this.nextRenderingBitmap;
                if (this.nextFrameIsLast) {
                    stop();
                }
                this.loadFrameTask = null;
                this.singleFrameDecoded = true;
                this.nextRenderingBitmap = null;
                if (this.screenRefreshRate > f2) {
                    jElapsedRealtime -= Math.min(16L, jAbs - ((long) i7));
                }
                this.lastFrameTime = jElapsedRealtime;
                scheduleNextGetFrame();
            }
        } else if ((this.forceFrameRedraw || (this.decodeSingleFrame && jAbs >= i7)) && this.nextRenderingBitmap != null) {
            this.backgroundBitmap = this.renderingBitmap;
            this.renderingBitmap = this.nextRenderingBitmap;
            this.loadFrameTask = null;
            this.singleFrameDecoded = true;
            this.nextRenderingBitmap = null;
            if (this.screenRefreshRate > f2) {
                jElapsedRealtime -= Math.min(16L, jAbs - ((long) i7));
            }
            this.lastFrameTime = jElapsedRealtime;
            if (this.forceFrameRedraw) {
                this.singleFrameDecoded = false;
                this.forceFrameRedraw = false;
            }
            scheduleNextGetFrame();
        }
        if (this.renderingBitmap != null) {
            if (this.applyTransformation) {
                this.dstRect.set(getBounds());
                this.scaleX = this.dstRect.width() / this.width;
                this.scaleY = this.dstRect.height() / this.height;
                this.applyTransformation = false;
            }
            canvas.save();
            Rect rect = this.dstRect;
            canvas.translate(rect.left, rect.top);
            canvas.scale(this.scaleX, this.scaleY);
            Bitmap bitmap = this.renderingBitmap;
            if (bitmap == null) {
                Intrinsics.throwNpe();
            }
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, getPaint());
            if (this.isRunning) {
                invalidateInternal();
            }
            canvas.restore();
        }
    }

    public final Bitmap getAnimatedBitmap() {
        if (this.renderingBitmap != null) {
            return this.renderingBitmap;
        }
        if (this.nextRenderingBitmap != null) {
            return this.nextRenderingBitmap;
        }
        return null;
    }

    public final Bitmap getBackgroundBitmap() {
        return this.backgroundBitmap;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.height;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.width;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.height;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.width;
    }

    public final Bitmap getNextRenderingBitmap() {
        return this.nextRenderingBitmap;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    public final Bitmap getRenderingBitmap() {
        return this.renderingBitmap;
    }

    public final boolean hasBitmap() {
        if (this.nativePtr != 0) {
            return (this.renderingBitmap == null && this.nextRenderingBitmap == null) ? false : true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.isRunning;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void onBoundsChange(@NotNull Rect bounds) {
        Intrinsics.checkParameterIsNotNull(bounds, "bounds");
        super.onBoundsChange(bounds);
        this.applyTransformation = true;
    }

    public final void recycle() {
        recycle(false);
    }

    public final void removeParentView(View view) {
        if (view == null) {
            return;
        }
        int size = this.parentViews.size();
        int i7 = 0;
        while (i7 < size) {
            View view2 = this.parentViews.get(i7).get();
            if (view2 == view || view2 == null) {
                this.parentViews.remove(i7);
                size--;
                i7--;
            }
            i7++;
        }
    }

    public final void replaceColors(Integer[] colors) {
        this.newReplaceColors = colors;
        requestRedrawColors();
    }

    public final boolean restart() {
        PlaybackMode playbackMode = this.playbackMode;
        PlaybackMode playbackMode2 = PlaybackMode.ONCE;
        if (playbackMode.compareTo(playbackMode2) < 0 || this.autoRepeatPlayCount == 0) {
            return false;
        }
        this.autoRepeatPlayCount = 0;
        this.playbackMode = playbackMode2;
        start();
        return true;
    }

    public final void setAllowDecodeSingleFrame(boolean value) {
        this.decodeSingleFrame = value;
        if (value) {
            scheduleNextGetFrame();
        }
    }

    public final void setCurrentParentView(View view) {
        this.currentParentView = view;
    }

    public final void setLayerColor(@NotNull String layerName, int color) {
        Intrinsics.checkParameterIsNotNull(layerName, "layerName");
        this.newColorUpdates.put(layerName, Integer.valueOf(color));
        requestRedrawColors();
    }

    public final void setPlaybackMode(@NotNull PlaybackMode value) {
        Intrinsics.checkParameterIsNotNull(value, "value");
        if (this.playbackMode == PlaybackMode.ONCE && value == PlaybackMode.FREEZE && this.currentFrame != 0) {
            return;
        }
        this.playbackMode = value;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0005 A[PHI: r0
      0x0005: PHI (r0v6 float) = (r0v0 float), (r0v1 float) binds: [B:3:0x0003, B:6:0x000b] A[DONT_GENERATE, DONT_INLINE]] */
    public final void setProgress(float oldProgress) {
        float f2 = 0.0f;
        if (oldProgress < 0.0f) {
            oldProgress = f2;
        } else {
            f2 = 1.0f;
            if (oldProgress > 1.0f) {
                oldProgress = f2;
            }
        }
        this.currentFrame = (int) (this.metaData[0] * oldProgress);
        this.nextFrameIsLast = false;
        this.singleFrameDecoded = false;
        if (!scheduleNextGetFrame()) {
            this.forceFrameRedraw = true;
        }
        invalidateSelf();
    }

    public final void setVibrationPattern(HashMap<Integer, Integer> pattern) {
        this.vibrationPattern = pattern;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (this.isRunning) {
            return;
        }
        if (this.playbackMode.compareTo(PlaybackMode.ONCE) < 0 || this.autoRepeatPlayCount == 0) {
            this.isRunning = true;
            scheduleNextGetFrame();
            invalidateInternal();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.isRunning = false;
    }

    public RLottieDrawable(@NotNull Context context, int i7, @NotNull String str, int i10, int i11, float f2, boolean z5) {
        this(context, i7, str, i10, i11, f2, z5, null, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT, null);
    }

    public final void recycle(boolean calledByUs) {
        ThreadPoolExecutor threadPoolExecutor;
        this.destroyWhenDone = true;
        this.isRunning = false;
        this.isRecycled = true;
        checkRunningTasks();
        Runnable runnable = this.loadFrameTask;
        if (runnable == null && this.cacheGenerateTask == null) {
            if (this.nativePtr != 0) {
                INSTANCE.destroy(this.nativePtr);
                this.nativePtr = 0L;
            }
            recycleResources();
            return;
        }
        if (runnable != null && !calledByUs) {
            loadFrameRunnableQueue.execute(new Runnable() { // from class: com.discord.rlottie.RLottieDrawable.recycle.1
                @Override // java.lang.Runnable
                public final void run() {
                    RLottieDrawable.uiHandler.post(new Runnable() { // from class: com.discord.rlottie.RLottieDrawable.recycle.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            RLottieDrawable.this.loadFrameTask = null;
                            RLottieDrawable.this.recycle(true);
                        }
                    });
                }
            });
        }
        if (this.cacheGenerateTask == null || calledByUs || (threadPoolExecutor = lottieCacheGenerateQueue) == null) {
            return;
        }
        threadPoolExecutor.execute(new Runnable() { // from class: com.discord.rlottie.RLottieDrawable.recycle.2
            @Override // java.lang.Runnable
            public final void run() {
                RLottieDrawable.uiHandler.post(new Runnable() { // from class: com.discord.rlottie.RLottieDrawable.recycle.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        RLottieDrawable.this.cacheGenerateTask = null;
                        RLottieDrawable.this.recycle(true);
                    }
                });
            }
        });
    }

    public RLottieDrawable(@NotNull File file, int i7, int i10, boolean z5, boolean z6, float f2) {
        this(file, i7, i10, z5, z6, f2, null, 64, null);
    }

    public /* synthetic */ RLottieDrawable(File file, int i7, int i10, boolean z5, boolean z6, float f2, int[] iArr, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, i7, i10, z5, z6, f2, (i11 & 64) != 0 ? null : iArr);
    }

    public RLottieDrawable(@NotNull File file, int i7, int i10, boolean z5, boolean z6, float f2, int[] iArr) {
        Intrinsics.checkParameterIsNotNull(file, "file");
        int[] iArr2 = new int[3];
        this.metaData = iArr2;
        this.customEndFrame = -1;
        this.newColorUpdates = new HashMap<>();
        this.pendingColorUpdates = new HashMap<>();
        this.playbackMode = PlaybackMode.LOOP;
        this.screenRefreshRate = 60.0f;
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.dstRect = new Rect();
        this.parentViews = new ArrayList<>();
        this.uiRunnableNoFrame = new Runnable() { // from class: com.discord.rlottie.RLottieDrawable$uiRunnableNoFrame$1
            @Override // java.lang.Runnable
            public final void run() {
                this.this$0.loadFrameTask = null;
                this.this$0.decodeFrameFinishedInternal();
            }
        };
        this.uiRunnableCacheFinished = new Runnable() { // from class: com.discord.rlottie.RLottieDrawable$uiRunnableCacheFinished$1
            @Override // java.lang.Runnable
            public final void run() {
                this.this$0.cacheGenerateTask = null;
                this.this$0.decodeFrameFinishedInternal();
            }
        };
        this.uiRunnable = new Runnable() { // from class: com.discord.rlottie.RLottieDrawable$uiRunnable$1
            @Override // java.lang.Runnable
            public final void run() {
                this.this$0.singleFrameDecoded = true;
                this.this$0.invalidateInternal();
                this.this$0.decodeFrameFinishedInternal();
            }
        };
        this.uiRunnableLastFrame = new Runnable() { // from class: com.discord.rlottie.RLottieDrawable$uiRunnableLastFrame$1
            @Override // java.lang.Runnable
            public final void run() {
                this.this$0.singleFrameDecoded = true;
                this.this$0.isRunning = false;
                this.this$0.invalidateInternal();
                this.this$0.decodeFrameFinishedInternal();
            }
        };
        this.uiRunnableGenerateCacheQueue = new Runnable() { // from class: com.discord.rlottie.RLottieDrawable$uiRunnableGenerateCacheQueue$1
            @Override // java.lang.Runnable
            public final void run() {
                if (this.this$0.destroyWhenDone || this.this$0.cacheGenerateTask == null) {
                    return;
                }
                RLottieDrawable.INSTANCE.createCache(this.this$0.nativePtr, this.this$0.width, this.this$0.height);
                RLottieDrawable.uiHandler.post(this.this$0.uiRunnableCacheFinished);
            }
        };
        this.uiRunnableGenerateCache = new Runnable() { // from class: com.discord.rlottie.RLottieDrawable$uiRunnableGenerateCache$1
            @Override // java.lang.Runnable
            public final void run() {
                ThreadPoolExecutor threadPoolExecutor;
                if (!this.this$0.isRecycled && !this.this$0.destroyWhenDone && this.this$0.nativePtr != 0 && (threadPoolExecutor = RLottieDrawable.lottieCacheGenerateQueue) != null) {
                    Runnable runnable = this.this$0.uiRunnableGenerateCacheQueue;
                    this.this$0.cacheGenerateTask = runnable;
                    threadPoolExecutor.execute(runnable);
                }
                this.this$0.decodeFrameFinishedInternal();
            }
        };
        this.loadFrameRunnable = new Runnable() { // from class: com.discord.rlottie.RLottieDrawable$loadFrameRunnable$1
            @Override // java.lang.Runnable
            public final void run() {
                if (this.this$0.isRecycled) {
                    return;
                }
                if (this.this$0.nativePtr == 0) {
                    RLottieDrawable.uiHandler.post(this.this$0.uiRunnableNoFrame);
                    return;
                }
                if (this.this$0.getBackgroundBitmap() == null) {
                    try {
                        RLottieDrawable rLottieDrawable = this.this$0;
                        rLottieDrawable.backgroundBitmap = Bitmap.createBitmap(rLottieDrawable.width, this.this$0.height, Bitmap.Config.ARGB_8888);
                    } catch (Throwable th2) {
                        Log.e("RLottieDrawable", "Error Loading Frame in Runnable", th2);
                    }
                }
                if (this.this$0.getBackgroundBitmap() != null) {
                    try {
                        if (!this.this$0.pendingColorUpdates.isEmpty()) {
                            for (Map.Entry entry : this.this$0.pendingColorUpdates.entrySet()) {
                                RLottieDrawable.INSTANCE.setLayerColor(this.this$0.nativePtr, (String) entry.getKey(), ((Number) entry.getValue()).intValue());
                            }
                            this.this$0.pendingColorUpdates.clear();
                        }
                    } catch (Exception unused) {
                    }
                    Integer[] numArr = this.this$0.pendingReplaceColors;
                    if (numArr != null) {
                        RLottieDrawable.Companion companion = RLottieDrawable.INSTANCE;
                        long j = this.this$0.nativePtr;
                        Intrinsics.checkNotNullParameter(numArr, "<this>");
                        int length = numArr.length;
                        int[] iArr3 = new int[length];
                        for (int i11 = 0; i11 < length; i11++) {
                            iArr3[i11] = numArr[i11].intValue();
                        }
                        companion.replaceColors(j, iArr3);
                    }
                    this.this$0.pendingReplaceColors = null;
                    try {
                        RLottieDrawable.Companion companion2 = RLottieDrawable.INSTANCE;
                        long j5 = this.this$0.nativePtr;
                        int i12 = this.this$0.currentFrame;
                        Bitmap backgroundBitmap = this.this$0.getBackgroundBitmap();
                        if (backgroundBitmap == null) {
                            Intrinsics.throwNpe();
                        }
                        int i13 = this.this$0.width;
                        int i14 = this.this$0.height;
                        Bitmap backgroundBitmap2 = this.this$0.getBackgroundBitmap();
                        if (backgroundBitmap2 == null) {
                            Intrinsics.throwNpe();
                        }
                        if (companion2.getFrame(j5, i12, backgroundBitmap, i13, i14, backgroundBitmap2.getRowBytes(), true) == -1) {
                            RLottieDrawable.uiHandler.post(this.this$0.uiRunnableNoFrame);
                            return;
                        }
                        int i15 = 2;
                        if (this.this$0.metaData[2] != 0) {
                            RLottieDrawable.uiHandler.post(this.this$0.uiRunnableGenerateCache);
                            this.this$0.metaData[2] = 0;
                        }
                        RLottieDrawable rLottieDrawable2 = this.this$0;
                        rLottieDrawable2.nextRenderingBitmap = rLottieDrawable2.getBackgroundBitmap();
                        if (!this.this$0.shouldLimitFps) {
                            i15 = 1;
                        }
                        if (this.this$0.currentFrame + i15 < this.this$0.metaData[0]) {
                            if (this.this$0.playbackMode == RLottieDrawable.PlaybackMode.FREEZE) {
                                this.this$0.nextFrameIsLast = true;
                                this.this$0.autoRepeatPlayCount++;
                            } else {
                                this.this$0.currentFrame += i15;
                                this.this$0.nextFrameIsLast = false;
                            }
                        } else if (this.this$0.playbackMode == RLottieDrawable.PlaybackMode.LOOP) {
                            this.this$0.currentFrame = 0;
                            this.this$0.nextFrameIsLast = false;
                        } else if (this.this$0.playbackMode == RLottieDrawable.PlaybackMode.ONCE) {
                            this.this$0.currentFrame = 0;
                            this.this$0.nextFrameIsLast = true;
                            this.this$0.autoRepeatPlayCount++;
                        } else {
                            this.this$0.nextFrameIsLast = true;
                        }
                    } catch (Exception e10) {
                        Log.e("RLottieDrawable", "Error loading frame", e10);
                    }
                }
                RLottieDrawable.uiHandler.post(this.this$0.uiRunnable);
            }
        };
        this.width = i7;
        this.height = i10;
        this.shouldLimitFps = z6;
        this.screenRefreshRate = f2;
        Paint paint = getPaint();
        Intrinsics.checkExpressionValueIsNotNull(paint, "paint");
        paint.setFlags(2);
        Companion companion = INSTANCE;
        String absolutePath = file.getAbsolutePath();
        Intrinsics.checkExpressionValueIsNotNull(absolutePath, "file.absolutePath");
        this.nativePtr = companion.create(absolutePath, i7, i10, iArr2, z5, iArr, this.shouldLimitFps);
        if (z5 && lottieCacheGenerateQueue == null) {
            lottieCacheGenerateQueue = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
        }
        if (this.nativePtr == 0) {
            file.delete();
        }
        if (this.shouldLimitFps && iArr2[1] < 60) {
            this.shouldLimitFps = false;
        }
        this.timeBetweenFrames = Math.max(this.shouldLimitFps ? 33 : 16, (int) (1000.0f / iArr2[1]));
    }

    public /* synthetic */ RLottieDrawable(Context context, int i7, String str, int i10, int i11, float f2, boolean z5, int[] iArr, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, i7, str, i10, i11, f2, (i12 & 64) != 0 ? true : z5, (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? null : iArr);
    }

    public RLottieDrawable(@NotNull Context context, int i7, @NotNull String name, int i10, int i11, float f2, boolean z5, int[] iArr) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(name, "name");
        this.metaData = new int[3];
        this.customEndFrame = -1;
        this.newColorUpdates = new HashMap<>();
        this.pendingColorUpdates = new HashMap<>();
        this.playbackMode = PlaybackMode.LOOP;
        this.screenRefreshRate = 60.0f;
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.dstRect = new Rect();
        this.parentViews = new ArrayList<>();
        this.uiRunnableNoFrame = new Runnable() { // from class: com.discord.rlottie.RLottieDrawable$uiRunnableNoFrame$1
            @Override // java.lang.Runnable
            public final void run() {
                this.this$0.loadFrameTask = null;
                this.this$0.decodeFrameFinishedInternal();
            }
        };
        this.uiRunnableCacheFinished = new Runnable() { // from class: com.discord.rlottie.RLottieDrawable$uiRunnableCacheFinished$1
            @Override // java.lang.Runnable
            public final void run() {
                this.this$0.cacheGenerateTask = null;
                this.this$0.decodeFrameFinishedInternal();
            }
        };
        this.uiRunnable = new Runnable() { // from class: com.discord.rlottie.RLottieDrawable$uiRunnable$1
            @Override // java.lang.Runnable
            public final void run() {
                this.this$0.singleFrameDecoded = true;
                this.this$0.invalidateInternal();
                this.this$0.decodeFrameFinishedInternal();
            }
        };
        this.uiRunnableLastFrame = new Runnable() { // from class: com.discord.rlottie.RLottieDrawable$uiRunnableLastFrame$1
            @Override // java.lang.Runnable
            public final void run() {
                this.this$0.singleFrameDecoded = true;
                this.this$0.isRunning = false;
                this.this$0.invalidateInternal();
                this.this$0.decodeFrameFinishedInternal();
            }
        };
        this.uiRunnableGenerateCacheQueue = new Runnable() { // from class: com.discord.rlottie.RLottieDrawable$uiRunnableGenerateCacheQueue$1
            @Override // java.lang.Runnable
            public final void run() {
                if (this.this$0.destroyWhenDone || this.this$0.cacheGenerateTask == null) {
                    return;
                }
                RLottieDrawable.INSTANCE.createCache(this.this$0.nativePtr, this.this$0.width, this.this$0.height);
                RLottieDrawable.uiHandler.post(this.this$0.uiRunnableCacheFinished);
            }
        };
        this.uiRunnableGenerateCache = new Runnable() { // from class: com.discord.rlottie.RLottieDrawable$uiRunnableGenerateCache$1
            @Override // java.lang.Runnable
            public final void run() {
                ThreadPoolExecutor threadPoolExecutor;
                if (!this.this$0.isRecycled && !this.this$0.destroyWhenDone && this.this$0.nativePtr != 0 && (threadPoolExecutor = RLottieDrawable.lottieCacheGenerateQueue) != null) {
                    Runnable runnable = this.this$0.uiRunnableGenerateCacheQueue;
                    this.this$0.cacheGenerateTask = runnable;
                    threadPoolExecutor.execute(runnable);
                }
                this.this$0.decodeFrameFinishedInternal();
            }
        };
        this.loadFrameRunnable = new Runnable() { // from class: com.discord.rlottie.RLottieDrawable$loadFrameRunnable$1
            @Override // java.lang.Runnable
            public final void run() {
                if (this.this$0.isRecycled) {
                    return;
                }
                if (this.this$0.nativePtr == 0) {
                    RLottieDrawable.uiHandler.post(this.this$0.uiRunnableNoFrame);
                    return;
                }
                if (this.this$0.getBackgroundBitmap() == null) {
                    try {
                        RLottieDrawable rLottieDrawable = this.this$0;
                        rLottieDrawable.backgroundBitmap = Bitmap.createBitmap(rLottieDrawable.width, this.this$0.height, Bitmap.Config.ARGB_8888);
                    } catch (Throwable th2) {
                        Log.e("RLottieDrawable", "Error Loading Frame in Runnable", th2);
                    }
                }
                if (this.this$0.getBackgroundBitmap() != null) {
                    try {
                        if (!this.this$0.pendingColorUpdates.isEmpty()) {
                            for (Map.Entry entry : this.this$0.pendingColorUpdates.entrySet()) {
                                RLottieDrawable.INSTANCE.setLayerColor(this.this$0.nativePtr, (String) entry.getKey(), ((Number) entry.getValue()).intValue());
                            }
                            this.this$0.pendingColorUpdates.clear();
                        }
                    } catch (Exception unused) {
                    }
                    Integer[] numArr = this.this$0.pendingReplaceColors;
                    if (numArr != null) {
                        RLottieDrawable.Companion companion = RLottieDrawable.INSTANCE;
                        long j = this.this$0.nativePtr;
                        Intrinsics.checkNotNullParameter(numArr, "<this>");
                        int length = numArr.length;
                        int[] iArr3 = new int[length];
                        for (int i12 = 0; i12 < length; i12++) {
                            iArr3[i12] = numArr[i12].intValue();
                        }
                        companion.replaceColors(j, iArr3);
                    }
                    this.this$0.pendingReplaceColors = null;
                    try {
                        RLottieDrawable.Companion companion2 = RLottieDrawable.INSTANCE;
                        long j5 = this.this$0.nativePtr;
                        int i13 = this.this$0.currentFrame;
                        Bitmap backgroundBitmap = this.this$0.getBackgroundBitmap();
                        if (backgroundBitmap == null) {
                            Intrinsics.throwNpe();
                        }
                        int i14 = this.this$0.width;
                        int i15 = this.this$0.height;
                        Bitmap backgroundBitmap2 = this.this$0.getBackgroundBitmap();
                        if (backgroundBitmap2 == null) {
                            Intrinsics.throwNpe();
                        }
                        if (companion2.getFrame(j5, i13, backgroundBitmap, i14, i15, backgroundBitmap2.getRowBytes(), true) == -1) {
                            RLottieDrawable.uiHandler.post(this.this$0.uiRunnableNoFrame);
                            return;
                        }
                        int i16 = 2;
                        if (this.this$0.metaData[2] != 0) {
                            RLottieDrawable.uiHandler.post(this.this$0.uiRunnableGenerateCache);
                            this.this$0.metaData[2] = 0;
                        }
                        RLottieDrawable rLottieDrawable2 = this.this$0;
                        rLottieDrawable2.nextRenderingBitmap = rLottieDrawable2.getBackgroundBitmap();
                        if (!this.this$0.shouldLimitFps) {
                            i16 = 1;
                        }
                        if (this.this$0.currentFrame + i16 < this.this$0.metaData[0]) {
                            if (this.this$0.playbackMode == RLottieDrawable.PlaybackMode.FREEZE) {
                                this.this$0.nextFrameIsLast = true;
                                this.this$0.autoRepeatPlayCount++;
                            } else {
                                this.this$0.currentFrame += i16;
                                this.this$0.nextFrameIsLast = false;
                            }
                        } else if (this.this$0.playbackMode == RLottieDrawable.PlaybackMode.LOOP) {
                            this.this$0.currentFrame = 0;
                            this.this$0.nextFrameIsLast = false;
                        } else if (this.this$0.playbackMode == RLottieDrawable.PlaybackMode.ONCE) {
                            this.this$0.currentFrame = 0;
                            this.this$0.nextFrameIsLast = true;
                            this.this$0.autoRepeatPlayCount++;
                        } else {
                            this.this$0.nextFrameIsLast = true;
                        }
                    } catch (Exception e10) {
                        Log.e("RLottieDrawable", "Error loading frame", e10);
                    }
                }
                RLottieDrawable.uiHandler.post(this.this$0.uiRunnable);
            }
        };
        try {
            InputStream inputStreamOpenRawResource = context.getResources().openRawResource(i7);
            Intrinsics.checkExpressionValueIsNotNull(inputStreamOpenRawResource, "context.resources.openRawResource(rawRes)");
            Ref.IntRef intRef = new Ref.IntRef();
            int i12 = 0;
            while (true) {
                byte[] bArr = buffer;
                int i13 = inputStreamOpenRawResource.read(bArr, 0, bArr.length);
                intRef.element = i13;
                if (i13 <= 0) {
                    break;
                }
                byte[] bArr2 = readBuffer;
                if (bArr2.length < i13 + i12) {
                    byte[] bArr3 = new byte[bArr2.length * 2];
                    System.arraycopy(bArr2, 0, bArr3, 0, i12);
                    readBuffer = bArr3;
                }
                System.arraycopy(bArr, 0, readBuffer, i12, intRef.element);
                i12 += intRef.element;
            }
            String str = new String(readBuffer, 0, i12, Charsets.UTF_8);
            inputStreamOpenRawResource.close();
            this.width = i10;
            this.height = i11;
            this.screenRefreshRate = f2;
            Paint paint = getPaint();
            Intrinsics.checkExpressionValueIsNotNull(paint, "paint");
            paint.setFlags(2);
            this.nativePtr = INSTANCE.createWithJson(str, name, this.metaData, iArr);
            this.timeBetweenFrames = Math.max(16, (int) (1000.0f / this.metaData[1]));
            this.playbackMode = PlaybackMode.LOOP;
            if (z5) {
                setAllowDecodeSingleFrame(true);
            }
        } catch (Throwable th2) {
            Log.e("RLottieDrawable", "Error Constructing", th2);
        }
    }
}
