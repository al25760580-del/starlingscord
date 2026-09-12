package app.rive;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.TextureView;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.b1;
import androidx.lifecycle.j0;
import app.rive.core.ArtboardHandle;
import app.rive.core.CommandQueue;
import app.rive.core.RiveSurface;
import app.rive.core.StateMachineHandle;
import app.rive.core.SurfaceTextureSurface;
import ar.b0;
import com.discord.misc.utilities.chat_view_types.ChatViewRecyclerTypes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import rn.o;
import xn.d;
import xn.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0014J\b\u0010 \u001a\u00020\u001fH\u0014J&\u0010!\u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u000e@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006&"}, d2 = {"Lapp/rive/RiveView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "artboardHandle", "Lapp/rive/core/ArtboardHandle;", "riveFile", "Lapp/rive/RiveFile;", "value", "Lapp/rive/core/RiveSurface;", "riveSurface", "setRiveSurface", "(Lapp/rive/core/RiveSurface;)V", "stateMachineHandle", "Lapp/rive/core/StateMachineHandle;", "surfaceHeight", "surfaceTexture", "Landroid/graphics/SurfaceTexture;", "surfaceWidth", "textureView", "Landroid/view/TextureView;", "getTextureView", "()Landroid/view/TextureView;", "createRiveSurface", "file", "onAttachedToWindow", "", "onDetachedFromWindow", "setRiveFile", "artboard", "Lapp/rive/Artboard;", "stateMachineName", "", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RiveView extends FrameLayout {
    public static final int $stable = 8;
    private ArtboardHandle artboardHandle;
    private RiveFile riveFile;
    private RiveSurface riveSurface;
    private StateMachineHandle stateMachineHandle;
    private int surfaceHeight;
    private SurfaceTexture surfaceTexture;
    private int surfaceWidth;

    @NotNull
    private final TextureView textureView;

    /* JADX INFO: renamed from: app.rive.RiveView$onAttachedToWindow$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @d(c = "app.rive.RiveView$onAttachedToWindow$1", f = "RiveView.kt", l = {ChatViewRecyclerTypes.SHARED_CUSTOM_THEME_EMBED}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ LifecycleOwner $owner;
        int label;
        final /* synthetic */ RiveView this$0;

        /* JADX INFO: renamed from: app.rive.RiveView$onAttachedToWindow$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @d(c = "app.rive.RiveView$onAttachedToWindow$1$1", f = "RiveView.kt", l = {ChatViewRecyclerTypes.GIFT_INTENT}, m = "invokeSuspend")
        @SourceDebugExtension({"SMAP\nRiveView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RiveView.kt\napp/rive/RiveView$onAttachedToWindow$1$1\n+ 2 Tracing.kt\napp/rive/core/TracingKt\n*L\n1#1,165:1\n12#2,3:166\n12#2,6:169\n12#2,6:175\n16#2,2:181\n*S KotlinDebug\n*F\n+ 1 RiveView.kt\napp/rive/RiveView$onAttachedToWindow$1$1\n*L\n67#1:166,3\n86#1:169,6\n90#1:175,6\n67#1:181,2\n*E\n"})
        public static final class C00091 extends h implements Function2<CoroutineScope, Continuation, Object> {
            private /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            int label;
            final /* synthetic */ RiveView this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00091(RiveView riveView, Continuation continuation) {
                super(2, continuation);
                this.this$0 = riveView;
            }

            @Override // xn.a
            @NotNull
            public final Continuation create(Object obj, @NotNull Continuation continuation) {
                C00091 c00091 = new C00091(this.this$0, continuation);
                c00091.L$0 = obj;
                return c00091;
            }

            /* JADX WARN: Code duplicated, block: B:11:0x0043  */
            /* JADX WARN: Code duplicated, block: B:13:0x005b A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:17:0x006d A[ADDED_TO_REGION, Catch: all -> 0x0070, REMOVE, TryCatch #0 {all -> 0x0070, blocks: (B:15:0x0067, B:17:0x006d, B:40:0x00c9, B:20:0x0072, B:22:0x0078, B:24:0x0082, B:26:0x008c, B:27:0x008f, B:29:0x009d, B:31:0x00b6, B:33:0x00bb, B:34:0x00be, B:36:0x00c0, B:37:0x00c3, B:38:0x00c4, B:39:0x00c7, B:30:0x00a5, B:28:0x0098), top: B:48:0x0067, inners: #1, #2 }] */
            /* JADX WARN: Code duplicated, block: B:20:0x0072 A[Catch: all -> 0x0070, TryCatch #0 {all -> 0x0070, blocks: (B:15:0x0067, B:17:0x006d, B:40:0x00c9, B:20:0x0072, B:22:0x0078, B:24:0x0082, B:26:0x008c, B:27:0x008f, B:29:0x009d, B:31:0x00b6, B:33:0x00bb, B:34:0x00be, B:36:0x00c0, B:37:0x00c3, B:38:0x00c4, B:39:0x00c7, B:30:0x00a5, B:28:0x0098), top: B:48:0x0067, inners: #1, #2 }] */
            /* JADX WARN: Code duplicated, block: B:24:0x0082 A[Catch: all -> 0x0070, TryCatch #0 {all -> 0x0070, blocks: (B:15:0x0067, B:17:0x006d, B:40:0x00c9, B:20:0x0072, B:22:0x0078, B:24:0x0082, B:26:0x008c, B:27:0x008f, B:29:0x009d, B:31:0x00b6, B:33:0x00bb, B:34:0x00be, B:36:0x00c0, B:37:0x00c3, B:38:0x00c4, B:39:0x00c7, B:30:0x00a5, B:28:0x0098), top: B:48:0x0067, inners: #1, #2 }] */
            /* JADX WARN: Code duplicated, block: B:26:0x008c A[Catch: all -> 0x0070, TryCatch #0 {all -> 0x0070, blocks: (B:15:0x0067, B:17:0x006d, B:40:0x00c9, B:20:0x0072, B:22:0x0078, B:24:0x0082, B:26:0x008c, B:27:0x008f, B:29:0x009d, B:31:0x00b6, B:33:0x00bb, B:34:0x00be, B:36:0x00c0, B:37:0x00c3, B:38:0x00c4, B:39:0x00c7, B:30:0x00a5, B:28:0x0098), top: B:48:0x0067, inners: #1, #2 }] */
            /* JADX WARN: Code duplicated, block: B:27:0x008f A[Catch: all -> 0x0070, TRY_LEAVE, TryCatch #0 {all -> 0x0070, blocks: (B:15:0x0067, B:17:0x006d, B:40:0x00c9, B:20:0x0072, B:22:0x0078, B:24:0x0082, B:26:0x008c, B:27:0x008f, B:29:0x009d, B:31:0x00b6, B:33:0x00bb, B:34:0x00be, B:36:0x00c0, B:37:0x00c3, B:38:0x00c4, B:39:0x00c7, B:30:0x00a5, B:28:0x0098), top: B:48:0x0067, inners: #1, #2 }] */
            /* JADX WARN: Code duplicated, block: B:38:0x00c4 A[Catch: all -> 0x0070, TryCatch #0 {all -> 0x0070, blocks: (B:15:0x0067, B:17:0x006d, B:40:0x00c9, B:20:0x0072, B:22:0x0078, B:24:0x0082, B:26:0x008c, B:27:0x008f, B:29:0x009d, B:31:0x00b6, B:33:0x00bb, B:34:0x00be, B:36:0x00c0, B:37:0x00c3, B:38:0x00c4, B:39:0x00c7, B:30:0x00a5, B:28:0x0098), top: B:48:0x0067, inners: #1, #2 }] */
            /* JADX WARN: Code duplicated, block: B:9:0x003d A[PHI: r4 r5
              0x003d: PHI (r4v1 kotlin.jvm.internal.Ref$LongRef) = (r4v0 kotlin.jvm.internal.Ref$LongRef), (r4v2 kotlin.jvm.internal.Ref$LongRef) binds: [B:8:0x0025, B:42:0x00d0] A[DONT_GENERATE, DONT_INLINE]
              0x003d: PHI (r5v4 kotlinx.coroutines.CoroutineScope) = (r5v3 kotlinx.coroutines.CoroutineScope), (r5v5 kotlinx.coroutines.CoroutineScope) binds: [B:8:0x0025, B:42:0x00d0] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0059 -> B:14:0x005c). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // xn.a
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r22) {
                /*
                    Method dump skipped, instruction units count: 218
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: app.rive.RiveView.AnonymousClass1.C00091.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation continuation) {
                return ((C00091) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LifecycleOwner lifecycleOwner, RiveView riveView, Continuation continuation) {
            super(2, continuation);
            this.$owner = lifecycleOwner;
            this.this$0 = riveView;
        }

        @Override // xn.a
        @NotNull
        public final Continuation create(Object obj, @NotNull Continuation continuation) {
            return new AnonymousClass1(this.$owner, this.this$0, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(@NotNull Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                Lifecycle lifecycle = this.$owner.getLifecycle();
                Lifecycle.State state = Lifecycle.State.f2299w;
                C00091 c00091 = new C00091(this.this$0, null);
                this.label = 1;
                if (j0.a(lifecycle, state, c00091, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RiveView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RiveSurface createRiveSurface(RiveFile file, SurfaceTexture surfaceTexture) {
        return file.getRiveWorker().createRiveSurface(new SurfaceTextureSurface(surfaceTexture));
    }

    public static /* synthetic */ void setRiveFile$default(RiveView riveView, RiveFile riveFile, Artboard artboard, String str, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            artboard = null;
        }
        if ((i7 & 4) != 0) {
            str = null;
        }
        riveView.setRiveFile(riveFile, artboard, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRiveSurface(RiveSurface riveSurface) {
        RiveSurface riveSurface2 = this.riveSurface;
        if (riveSurface2 != null && riveSurface2 != null) {
            riveSurface2.close();
        }
        this.riveSurface = riveSurface;
    }

    @NotNull
    public final TextureView getTextureView() {
        return this.textureView;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        CommandQueue riveWorker;
        super.onAttachedToWindow();
        LifecycleOwner lifecycleOwnerB = b1.b(this);
        if (lifecycleOwnerB == null) {
            throw new IllegalStateException("RiveView must be hosted under a LifecycleOwner.");
        }
        RiveFile riveFile = this.riveFile;
        if (riveFile != null && (riveWorker = riveFile.getRiveWorker()) != null) {
            riveWorker.acquire("RiveView");
        }
        b0.t(b1.c(lifecycleOwnerB), null, new AnonymousClass1(lifecycleOwnerB, this, null), 3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        CommandQueue riveWorker;
        super.onDetachedFromWindow();
        RiveFile riveFile = this.riveFile;
        if (riveFile == null || (riveWorker = riveFile.getRiveWorker()) == null) {
            return;
        }
        riveWorker.release("RiveView", "Detached from window");
    }

    public final void setRiveFile(@NotNull RiveFile file, Artboard artboard, String stateMachineName) {
        StateMachineHandle stateMachineHandleM219boximpl;
        Intrinsics.checkNotNullParameter(file, "file");
        this.riveFile = file;
        this.artboardHandle = ArtboardHandle.m103boximpl(artboard != null ? artboard.getArtboardHandle() : file.getRiveWorker().m127createDefaultArtboard6NrLy0M(file.getFileHandle()));
        if (stateMachineName != null) {
            CommandQueue riveWorker = file.getRiveWorker();
            ArtboardHandle artboardHandle = this.artboardHandle;
            Intrinsics.checkNotNull(artboardHandle);
            stateMachineHandleM219boximpl = StateMachineHandle.m219boximpl(riveWorker.m129createStateMachineByNameItmKBmM(artboardHandle.m109unboximpl(), stateMachineName));
        } else {
            CommandQueue riveWorker2 = file.getRiveWorker();
            ArtboardHandle artboardHandle2 = this.artboardHandle;
            Intrinsics.checkNotNull(artboardHandle2);
            stateMachineHandleM219boximpl = StateMachineHandle.m219boximpl(riveWorker2.m128createDefaultStateMachinexY8vNfM(artboardHandle2.m109unboximpl()));
        }
        this.stateMachineHandle = stateMachineHandleM219boximpl;
        SurfaceTexture surfaceTexture = this.surfaceTexture;
        if (surfaceTexture == null || this.riveSurface != null) {
            return;
        }
        Intrinsics.checkNotNull(surfaceTexture);
        setRiveSurface(createRiveSurface(file, surfaceTexture));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RiveView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ RiveView(Context context, AttributeSet attributeSet, int i7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? 0 : i7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveView(@NotNull Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        TextureView textureView = new TextureView(context);
        textureView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        textureView.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() { // from class: app.rive.RiveView$textureView$1$1
            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureAvailable(@NotNull SurfaceTexture newSurfaceTexture, int width, int height) {
                Intrinsics.checkNotNullParameter(newSurfaceTexture, "newSurfaceTexture");
                this.this$0.surfaceTexture = newSurfaceTexture;
                this.this$0.surfaceWidth = width;
                this.this$0.surfaceHeight = height;
                RiveFile riveFile = this.this$0.riveFile;
                if (riveFile != null) {
                    RiveView riveView = this.this$0;
                    riveView.setRiveSurface(riveView.createRiveSurface(riveFile, newSurfaceTexture));
                }
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public boolean onSurfaceTextureDestroyed(@NotNull SurfaceTexture destroyedSurfaceTexture) {
                Intrinsics.checkNotNullParameter(destroyedSurfaceTexture, "destroyedSurfaceTexture");
                this.this$0.setRiveSurface(null);
                return false;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureSizeChanged(@NotNull SurfaceTexture surfaceTexture, int width, int height) {
                Intrinsics.checkNotNullParameter(surfaceTexture, "surfaceTexture");
                throw new o("An operation is not implemented: Not yet implemented");
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureUpdated(@NotNull SurfaceTexture surfaceTexture) {
                Intrinsics.checkNotNullParameter(surfaceTexture, "surfaceTexture");
            }
        });
        this.textureView = textureView;
        addView(textureView, new FrameLayout.LayoutParams(-1, -1));
    }
}
