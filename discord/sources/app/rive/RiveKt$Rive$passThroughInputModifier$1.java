package app.rive;

import android.os.Trace;
import app.rive.core.CommandQueue;
import f0.b;
import f0.c;
import f0.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u.k;
import u.l;
import z.f;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"app/rive/RiveKt$Rive$passThroughInputModifier$1", "Lf0/d;", "Lf0/c;", "pointerInputFilter", "Lf0/c;", "getPointerInputFilter", "()Lf0/c;", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RiveKt$Rive$passThroughInputModifier$1 implements d {

    @NotNull
    private final c pointerInputFilter;

    public RiveKt$Rive$passThroughInputModifier$1(final RivePointerInputMode rivePointerInputMode, final CommandQueue commandQueue, final l lVar, final long j, final Fit fit, final k kVar, final k kVar2) {
        this.pointerInputFilter = new c(commandQueue, lVar, j, fit, kVar, kVar2) { // from class: app.rive.RiveKt$Rive$passThroughInputModifier$1$pointerInputFilter$1
            final /* synthetic */ Fit $fit;
            final /* synthetic */ l $isSettled$delegate;
            final /* synthetic */ CommandQueue $riveWorker;
            final /* synthetic */ long $stateMachineHandle;
            final /* synthetic */ k $surfaceHeight$delegate;
            final /* synthetic */ k $surfaceWidth$delegate;
            private final boolean shareWithSiblings;

            {
                this.$riveWorker = commandQueue;
                this.$isSettled$delegate = lVar;
                this.$stateMachineHandle = j;
                this.$fit = fit;
                this.$surfaceWidth$delegate = kVar;
                this.$surfaceHeight$delegate = kVar2;
                this.shareWithSiblings = this.$pointerInputMode == RivePointerInputMode.PassThrough;
            }

            public boolean getShareWithSiblings() {
                return this.shareWithSiblings;
            }

            @Override // f0.c
            public void onCancel() {
            }

            /* JADX INFO: renamed from: onPointerEvent-H0pRuoY, reason: not valid java name */
            public void m43onPointerEventH0pRuoY(@NotNull f0.a pointerEvent, @NotNull b pass, long bounds) {
                Intrinsics.checkNotNullParameter(pointerEvent, "pointerEvent");
                Intrinsics.checkNotNullParameter(pass, "pass");
                l lVar2 = this.$isSettled$delegate;
                Trace.beginSection("Rive/PointerInput");
                try {
                    if (pass == b.f8781d) {
                        RiveKt.Rive$lambda$2(lVar2, false);
                        throw null;
                    }
                    Unit unit = Unit.f14616a;
                    Trace.endSection();
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            }
        };
    }

    @Override // z.d, z.f
    public /* bridge */ /* synthetic */ boolean all(@NotNull Function1 function1) {
        return super.all(function1);
    }

    public boolean any(@NotNull Function1 predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return ((Boolean) predicate.invoke(this)).booleanValue();
    }

    @Override // z.d, z.f
    public /* bridge */ /* synthetic */ Object foldIn(Object obj, @NotNull Function2 function2) {
        return super.foldIn(obj, function2);
    }

    public Object foldOut(Object obj, @NotNull Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(this, obj);
    }

    @Override // f0.d
    @NotNull
    public c getPointerInputFilter() {
        return this.pointerInputFilter;
    }

    @Override // z.f
    @NotNull
    public /* bridge */ /* synthetic */ f then(@NotNull f fVar) {
        return super.then(fVar);
    }
}
