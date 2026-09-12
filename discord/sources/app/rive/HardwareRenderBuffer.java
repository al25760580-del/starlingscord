package app.rive;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import app.rive.core.CheckableAutoCloseable;
import app.rive.core.CloseOnce;
import app.rive.core.CommandQueue;
import app.rive.core.ImageReaderSurface;
import app.rive.core.RenderingDefaults;
import app.rive.core.RiveSurface;
import dr.v;
import dr.y;
import dr.z;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 Q2\u00020\u0001:\u0001QB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\fJ1\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b!\u0010 R\u0018\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\n0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020\n0&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00101\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0017\u00104\u001a\u0002038\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010B\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010D\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010CR\u0018\u0010F\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010H\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010J\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010IR\u0014\u0010L\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010P\u001a\u00020A8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010O¨\u0006R"}, d2 = {"Lapp/rive/HardwareRenderBuffer;", "Lapp/rive/core/CheckableAutoCloseable;", "", "width", "height", "Lapp/rive/core/CommandQueue;", "Lapp/rive/core/RiveWorker;", "riveWorker", "<init>", "(IILapp/rive/core/CommandQueue;)V", "", "waitForFirstFrame", "()V", "Landroid/media/ImageReader;", "reader", "onImageAvailable", "(Landroid/media/ImageReader;)V", "close", "Lapp/rive/Artboard;", "artboard", "Lapp/rive/StateMachine;", "stateMachine", "Lapp/rive/Fit;", "fit", "clearColor", "render", "(Lapp/rive/Artboard;Lapp/rive/StateMachine;Lapp/rive/Fit;I)V", "Landroid/graphics/Bitmap;", "consumeLatestBitmap", "()Landroid/graphics/Bitmap;", "I", "getWidth", "()I", "getHeight", "Lapp/rive/core/CommandQueue;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "_frameAvailable", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Ldr/v;", "frameAvailable", "Ldr/v;", "getFrameAvailable", "()Ldr/v;", "Landroid/os/HandlerThread;", "imageReaderThread", "Landroid/os/HandlerThread;", "Landroid/os/Handler;", "imageReaderHandler", "Landroid/os/Handler;", "imageReader", "Landroid/media/ImageReader;", "Lapp/rive/core/RiveSurface;", "surface", "Lapp/rive/core/RiveSurface;", "getSurface", "()Lapp/rive/core/RiveSurface;", "Landroid/graphics/ColorSpace;", "srgbColorSpace", "Landroid/graphics/ColorSpace;", "", "bitmapLock", "Ljava/lang/Object;", "Ljava/util/concurrent/CountDownLatch;", "firstFrameLatch", "Ljava/util/concurrent/CountDownLatch;", "", "isClosedFlag", "Z", "firstFramePublished", "", "imageReaderFailure", "Ljava/lang/Throwable;", "currentBitmap", "Landroid/graphics/Bitmap;", "pendingBitmap", "Lapp/rive/core/CloseOnce;", "closer", "Lapp/rive/core/CloseOnce;", "getClosed", "()Z", "closed", "Companion", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ExperimentalHardwareBitmapRendering
@SourceDebugExtension({"SMAP\nHardwareRenderBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HardwareRenderBuffer.kt\napp/rive/HardwareRenderBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Tracing.kt\napp/rive/core/TracingKt\n+ 4 RiveLog.kt\napp/rive/RiveLog\n*L\n1#1,341:1\n1#2:342\n12#3,3:343\n12#3,6:346\n12#3,6:352\n16#3,2:358\n12#3,6:360\n12#3,6:366\n12#3,6:372\n12#3,6:378\n70#4:384\n70#4:385\n*S KotlinDebug\n*F\n+ 1 HardwareRenderBuffer.kt\napp/rive/HardwareRenderBuffer\n*L\n203#1:343,3\n204#1:346,6\n214#1:352,6\n203#1:358,2\n236#1:360,6\n280#1:366,6\n288#1:372,6\n300#1:378,6\n325#1:384\n332#1:385\n*E\n"})
public final class HardwareRenderBuffer implements CheckableAutoCloseable {
    private static final long FIRST_FRAME_TIMEOUT_MILLIS = 250;

    @NotNull
    private static final String TAG = "Rive/RenderBuffer/Hardware";

    @NotNull
    private final MutableSharedFlow _frameAvailable;

    @NotNull
    private final Object bitmapLock;

    @NotNull
    private final CloseOnce closer;
    private Bitmap currentBitmap;

    @NotNull
    private final CountDownLatch firstFrameLatch;
    private volatile boolean firstFramePublished;

    @NotNull
    private final v frameAvailable;
    private final int height;

    @NotNull
    private final ImageReader imageReader;
    private volatile Throwable imageReaderFailure;

    @NotNull
    private final Handler imageReaderHandler;

    @NotNull
    private final HandlerThread imageReaderThread;
    private volatile boolean isClosedFlag;
    private Bitmap pendingBitmap;

    @NotNull
    private final CommandQueue riveWorker;

    @NotNull
    private final ColorSpace srgbColorSpace;

    @NotNull
    private final RiveSurface surface;
    private final int width;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lapp/rive/HardwareRenderBuffer$Companion;", "", "()V", "FIRST_FRAME_TIMEOUT_MILLIS", "", "TAG", "", "isSupported", "", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isSupported() {
            return Build.VERSION.SDK_INT >= 29;
        }

        private Companion() {
        }
    }

    public HardwareRenderBuffer(int i7, int i10, @NotNull CommandQueue riveWorker) {
        Intrinsics.checkNotNullParameter(riveWorker, "riveWorker");
        this.width = i7;
        this.height = i10;
        this.riveWorker = riveWorker;
        if (i7 <= 0 || i10 <= 0) {
            throw new IllegalArgumentException("HardwareRenderBuffer width/height must be > 0");
        }
        if (!INSTANCE.isSupported()) {
            throw new IllegalStateException("Hardware bitmap rendering requires API 29+");
        }
        y yVarA = z.a(0, 1, cr.a.f7343e);
        this._frameAvailable = yVarA;
        this.frameAvailable = yVarA;
        HandlerThread handlerThread = new HandlerThread("Rive/ImageReader");
        handlerThread.start();
        this.imageReaderThread = handlerThread;
        Handler handler = new Handler(handlerThread.getLooper());
        this.imageReaderHandler = handler;
        ImageReader imageReaderNewInstance = ImageReader.newInstance(i7, i10, 1, 2, 768L);
        Intrinsics.checkNotNullExpressionValue(imageReaderNewInstance, "newInstance(...)");
        this.imageReader = imageReaderNewInstance;
        this.surface = riveWorker.createRiveSurface(new ImageReaderSurface(imageReaderNewInstance));
        ColorSpace colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        Intrinsics.checkNotNullExpressionValue(colorSpace, "get(...)");
        this.srgbColorSpace = colorSpace;
        this.bitmapLock = new Object();
        this.firstFrameLatch = new CountDownLatch(1);
        this.closer = new CloseOnce("HardwareRenderBuffer", new Function0<Unit>() { // from class: app.rive.HardwareRenderBuffer$closer$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m18invoke();
                return Unit.f14616a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m18invoke() {
                this.this$0.isClosedFlag = true;
                this.this$0.firstFrameLatch.countDown();
                this.this$0.imageReader.setOnImageAvailableListener(null, null);
                this.this$0.imageReaderThread.quitSafely();
                try {
                    this.this$0.imageReaderThread.join(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
                Object obj = this.this$0.bitmapLock;
                HardwareRenderBuffer hardwareRenderBuffer = this.this$0;
                synchronized (obj) {
                    try {
                        Bitmap bitmap = hardwareRenderBuffer.pendingBitmap;
                        if (bitmap != null && !bitmap.isRecycled()) {
                            bitmap.recycle();
                        }
                        Bitmap bitmap2 = hardwareRenderBuffer.currentBitmap;
                        if (bitmap2 != null && !bitmap2.isRecycled()) {
                            bitmap2.recycle();
                        }
                        hardwareRenderBuffer.pendingBitmap = null;
                        hardwareRenderBuffer.currentBitmap = null;
                        Unit unit = Unit.f14616a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                this.this$0.getSurface().close();
            }
        });
        imageReaderNewInstance.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: app.rive.a
            @Override // android.media.ImageReader.OnImageAvailableListener
            public final void onImageAvailable(ImageReader imageReader) throws Throwable {
                HardwareRenderBuffer._init_$lambda$3(this.f2864a, imageReader);
            }
        }, handler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(HardwareRenderBuffer this$0, ImageReader imageReader) throws Throwable {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(imageReader);
        this$0.onImageAvailable(imageReader);
    }

    /* JADX WARN: Code duplicated, block: B:65:0x00a8 A[Catch: Error -> 0x0079, Exception -> 0x007b, TRY_ENTER, TryCatch #9 {Error -> 0x0079, Exception -> 0x007b, blocks: (B:5:0x0006, B:7:0x000f, B:18:0x0031, B:38:0x0075, B:48:0x0081, B:49:0x0084, B:65:0x00a8, B:66:0x00ab, B:67:0x00ae, B:69:0x00b0, B:70:0x00b3), top: B:91:0x0006 }] */
    private final void onImageAvailable(ImageReader reader) throws Throwable {
        Throwable th2;
        if (this.isClosedFlag) {
            return;
        }
        try {
            Trace.beginSection("Rive/RenderBuffer/Hardware/Callback/AcquireLatestImage");
            try {
                Image imageAcquireLatestImage = reader.acquireLatestImage();
                Trace.endSection();
                if (imageAcquireLatestImage == null) {
                    return;
                }
                HardwareBuffer hardwareBuffer = null;
                try {
                    try {
                        Trace.beginSection("Rive/RenderBuffer/Hardware/Callback/WrapHardwareBuffer");
                        try {
                            HardwareBuffer hardwareBuffer2 = imageAcquireLatestImage.getHardwareBuffer();
                            if (hardwareBuffer2 == null) {
                                throw new RiveRenderException("Image did not provide a HardwareBuffer", null, 2, null);
                            }
                            Intrinsics.checkNotNull(hardwareBuffer2);
                            try {
                                Bitmap bitmapWrapHardwareBuffer = Bitmap.wrapHardwareBuffer(hardwareBuffer2, this.srgbColorSpace);
                                if (bitmapWrapHardwareBuffer == null) {
                                    throw new RiveRenderException("Failed to wrap HardwareBuffer as Bitmap", null, 2, null);
                                }
                                Trace.endSection();
                                hardwareBuffer2.close();
                                imageAcquireLatestImage.close();
                                Intrinsics.checkNotNull(bitmapWrapHardwareBuffer);
                                Trace.beginSection("Rive/RenderBuffer/Hardware/Callback/PublishBitmap");
                                try {
                                    synchronized (this.bitmapLock) {
                                        try {
                                            if (!this.isClosedFlag) {
                                                Bitmap bitmap = this.pendingBitmap;
                                                this.pendingBitmap = bitmapWrapHardwareBuffer;
                                                if (bitmap != null && bitmap != bitmapWrapHardwareBuffer && !bitmap.isRecycled()) {
                                                    bitmap.recycle();
                                                }
                                                this.firstFramePublished = true;
                                                this.firstFrameLatch.countDown();
                                            } else if (!bitmapWrapHardwareBuffer.isRecycled()) {
                                                bitmapWrapHardwareBuffer.recycle();
                                            }
                                            Unit unit = Unit.f14616a;
                                        } catch (Throwable th3) {
                                            throw th3;
                                        }
                                    }
                                    this._frameAvailable.d(Unit.f14616a);
                                    Trace.endSection();
                                } catch (Throwable th4) {
                                    Trace.endSection();
                                    throw th4;
                                }
                            } catch (Throwable th5) {
                                th2 = th5;
                                Trace.endSection();
                                throw th2;
                            }
                        } catch (Throwable th6) {
                            th2 = th6;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        if (0 != 0) {
                            hardwareBuffer.close();
                        }
                        imageAcquireLatestImage.close();
                        throw th;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    if (0 != 0) {
                        hardwareBuffer.close();
                    }
                    imageAcquireLatestImage.close();
                    throw th;
                }
            } catch (Throwable th9) {
                Trace.endSection();
                throw th9;
            }
        } catch (Error e10) {
            if (this.isClosedFlag) {
                throw e10;
            }
            RiveLog.INSTANCE.getLogger().e(TAG, e10, new Function0<String>() { // from class: app.rive.HardwareRenderBuffer.onImageAvailable.3
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "Fatal error in ImageReader callback while publishing hardware frame";
                }
            });
            this.imageReaderFailure = e10;
            this.firstFrameLatch.countDown();
            throw e10;
        } catch (Exception e11) {
            if (this.isClosedFlag) {
                return;
            }
            RiveLog.INSTANCE.getLogger().e(TAG, e11, new Function0<String>() { // from class: app.rive.HardwareRenderBuffer.onImageAvailable.2
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "ImageReader callback failed while publishing hardware frame";
                }
            });
            this.imageReaderFailure = e11;
            this.firstFrameLatch.countDown();
        }
    }

    public static /* synthetic */ void render$default(HardwareRenderBuffer hardwareRenderBuffer, Artboard artboard, StateMachine stateMachine, Fit fit, int i7, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            fit = RenderingDefaults.INSTANCE.defaultFit();
        }
        if ((i10 & 8) != 0) {
            i7 = 0;
        }
        hardwareRenderBuffer.render(artboard, stateMachine, fit, i7);
    }

    private final void waitForFirstFrame() throws InterruptedException, RiveRenderException {
        if (this.firstFramePublished) {
            return;
        }
        boolean zAwait = this.firstFrameLatch.await(FIRST_FRAME_TIMEOUT_MILLIS, TimeUnit.MILLISECONDS);
        Throwable th2 = this.imageReaderFailure;
        if (th2 != null) {
            throw new RiveRenderException("Hardware ImageReader failed while acquiring a frame; recreate HardwareRenderBuffer", th2);
        }
        if (!zAwait || !this.firstFramePublished) {
            throw new RiveRenderException("No hardware image available after render (timed out waiting for ImageReader frame)", null, 2, null);
        }
    }

    @Override // app.rive.core.CheckableAutoCloseable, java.lang.AutoCloseable
    public void close() {
        this.closer.close();
    }

    public final Bitmap consumeLatestBitmap() throws RiveRenderException {
        Bitmap bitmap;
        if (getClosed()) {
            throw new IllegalStateException("HardwareRenderBuffer is closed");
        }
        Throwable th2 = this.imageReaderFailure;
        if (th2 != null) {
            throw new RiveRenderException("Hardware ImageReader failed while acquiring a frame; recreate HardwareRenderBuffer", th2);
        }
        Trace.beginSection("Rive/RenderBuffer/ToBitmap");
        try {
            synchronized (this.bitmapLock) {
                try {
                    Bitmap bitmap2 = this.pendingBitmap;
                    if (bitmap2 != null) {
                        this.pendingBitmap = null;
                        Bitmap bitmap3 = this.currentBitmap;
                        this.currentBitmap = bitmap2;
                        if (bitmap3 != null && bitmap3 != bitmap2 && !bitmap3.isRecycled()) {
                            bitmap3.recycle();
                        }
                    }
                    bitmap = this.currentBitmap;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            Trace.endSection();
            return bitmap;
        } catch (Throwable th4) {
            Trace.endSection();
            throw th4;
        }
    }

    @Override // app.rive.core.CheckableAutoCloseable
    public boolean getClosed() {
        return this.closer.getClosed();
    }

    @NotNull
    public final v getFrameAvailable() {
        return this.frameAvailable;
    }

    public final int getHeight() {
        return this.height;
    }

    @NotNull
    public final RiveSurface getSurface() {
        return this.surface;
    }

    public final int getWidth() {
        return this.width;
    }

    public final void render(@NotNull Artboard artboard, @NotNull StateMachine stateMachine, @NotNull Fit fit, int clearColor) {
        Intrinsics.checkNotNullParameter(artboard, "artboard");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        Intrinsics.checkNotNullParameter(fit, "fit");
        if (getClosed()) {
            throw new IllegalStateException("HardwareRenderBuffer is closed");
        }
        if (!artboard.isOwnedBy$kotlin_release(this.riveWorker)) {
            throw new IllegalArgumentException("HardwareRenderBuffer and Artboard must use the same RiveWorker");
        }
        if (!stateMachine.isOwnedBy$kotlin_release(this.riveWorker)) {
            throw new IllegalArgumentException("HardwareRenderBuffer and StateMachine must use the same RiveWorker");
        }
        if (!stateMachine.isFromArtboard$kotlin_release(artboard)) {
            throw new IllegalArgumentException("HardwareRenderBuffer StateMachine must be created from the supplied Artboard");
        }
        Trace.beginSection("Rive/RenderBuffer/Render");
        try {
            Trace.beginSection("Rive/RenderBuffer/Hardware/Draw");
            try {
                this.riveWorker.m141drawOcc3x_Y(artboard.getArtboardHandle(), stateMachine.getStateMachineHandle(), this.surface, fit, clearColor);
                Unit unit = Unit.f14616a;
                Trace.endSection();
                if (!this.firstFramePublished) {
                    Trace.beginSection("Rive/RenderBuffer/Hardware/WaitFirstFrame");
                    try {
                        waitForFirstFrame();
                        Trace.endSection();
                    } finally {
                        Trace.endSection();
                    }
                }
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }
}
