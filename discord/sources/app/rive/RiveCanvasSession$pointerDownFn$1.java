package app.rive;

import app.rive.core.CommandQueue;
import app.rive.core.StateMachineHandle;
import go.n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public /* synthetic */ class RiveCanvasSession$pointerDownFn$1 extends FunctionReferenceImpl implements n {
    public RiveCanvasSession$pointerDownFn$1(Object obj) {
        super(7, obj, CommandQueue.class, "pointerDown", "pointerDown-iHGrxBs(JLapp/rive/Fit;FFIFF)V", 0);
    }

    @Override // go.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        m26invokeiHGrxBs(((StateMachineHandle) obj).m225unboximpl(), (Fit) obj2, ((Number) obj3).floatValue(), ((Number) obj4).floatValue(), ((Number) obj5).intValue(), ((Number) obj6).floatValue(), ((Number) obj7).floatValue());
        return Unit.f14616a;
    }

    /* JADX INFO: renamed from: invoke-iHGrxBs, reason: not valid java name */
    public final void m26invokeiHGrxBs(long j, @NotNull Fit p3, float f2, float f7, int i7, float f10, float f11) {
        Intrinsics.checkNotNullParameter(p3, "p1");
        ((CommandQueue) this.receiver).m159pointerDowniHGrxBs(j, p3, f2, f7, i7, f10, f11);
    }
}
