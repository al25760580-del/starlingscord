package app.rive.core;

import app.rive.RiveLog;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0011\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0005H\u0082 J\b\u0010\"\u001a\u00020\u001fH\u0015R\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0012\u0010\u001b\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, d2 = {"Lapp/rive/core/RiveSurface;", "Lapp/rive/core/CheckableAutoCloseable;", "owningCommandQueue", "Lapp/rive/core/CommandQueue;", "renderTargetPointer", "", "drawKey", "Lapp/rive/core/DrawKey;", "width", "", "height", "(Lapp/rive/core/CommandQueue;JJIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "closed", "", "getClosed", "()Z", "closer", "Lapp/rive/core/CloseOnce;", "commandQueue", "getDrawKey-DhFih_o", "()J", "J", "getHeight", "()I", "Lapp/rive/core/UniquePointer;", "getRenderTargetPointer", "()Lapp/rive/core/UniquePointer;", "surfaceNativePointer", "getSurfaceNativePointer", "getWidth", "close", "", "cppDeleteRenderTarget", "pointer", "dispose", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class RiveSurface implements CheckableAutoCloseable {
    public static final int $stable = 8;

    @NotNull
    private final CloseOnce closer;

    @NotNull
    private final CommandQueue commandQueue;
    private final long drawKey;
    private final int height;

    @NotNull
    private final UniquePointer renderTargetPointer;
    private final int width;

    public /* synthetic */ RiveSurface(CommandQueue commandQueue, long j, long j5, int i7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(commandQueue, j, j5, i7, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final native void cppDeleteRenderTarget(long pointer);

    @Override // app.rive.core.CheckableAutoCloseable, java.lang.AutoCloseable
    public void close() {
        this.closer.close();
    }

    public void dispose() {
        this.renderTargetPointer.close();
    }

    @Override // app.rive.core.CheckableAutoCloseable
    public boolean getClosed() {
        return this.closer.getClosed();
    }

    /* JADX INFO: renamed from: getDrawKey-DhFih_o, reason: not valid java name and from getter */
    public final long getDrawKey() {
        return this.drawKey;
    }

    public final int getHeight() {
        return this.height;
    }

    @NotNull
    public final UniquePointer getRenderTargetPointer() {
        return this.renderTargetPointer;
    }

    public abstract long getSurfaceNativePointer();

    public final int getWidth() {
        return this.width;
    }

    private RiveSurface(CommandQueue owningCommandQueue, long j, long j5, int i7, int i10) {
        Intrinsics.checkNotNullParameter(owningCommandQueue, "owningCommandQueue");
        this.drawKey = j5;
        this.width = i7;
        this.height = i10;
        owningCommandQueue.acquire("RiveSurface");
        this.commandQueue = owningCommandQueue;
        this.closer = new CloseOnce("RiveSurface", new Function0<Unit>() { // from class: app.rive.core.RiveSurface$closer$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m217invoke();
                return Unit.f14616a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m217invoke() {
                this.this$0.commandQueue.m125cancelDrawRUTHeiE$kotlin_release(this.this$0.getDrawKey());
                CommandQueue commandQueue = this.this$0.commandQueue;
                final RiveSurface riveSurface = this.this$0;
                commandQueue.runOnCommandServer$kotlin_release(new Function0<Unit>() { // from class: app.rive.core.RiveSurface$closer$1.1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m218invoke();
                        return Unit.f14616a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m218invoke() {
                        riveSurface.dispose();
                    }
                });
                this.this$0.commandQueue.release("RiveSurface", "Surface closed");
            }
        });
        this.renderTargetPointer = new UniquePointer(j, "Rive/RenderTarget", new Function1<Long, Unit>() { // from class: app.rive.core.RiveSurface$renderTargetPointer$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).longValue());
                return Unit.f14616a;
            }

            public final void invoke(long j7) {
                RiveLog.INSTANCE.getLogger().d("Rive/RenderTarget", new Function0<String>() { // from class: app.rive.core.RiveSurface$renderTargetPointer$1.1
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final String invoke() {
                        return "Deleting Rive render target";
                    }
                });
                this.this$0.cppDeleteRenderTarget(j7);
            }
        });
    }
}
