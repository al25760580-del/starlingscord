package com.margelo.nitro.rive;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@xa.a
@Keep
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0004H\u0097\u0002R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/margelo/nitro/rive/Func_void_UnifiedRiveEvent_java;", "Lcom/margelo/nitro/rive/Func_void_UnifiedRiveEvent;", "function", "Lkotlin/Function1;", "Lcom/margelo/nitro/rive/UnifiedRiveEvent;", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "invoke", "event", "rive-app_react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Func_void_UnifiedRiveEvent_java implements Func_void_UnifiedRiveEvent {

    @NotNull
    private final Function1<UnifiedRiveEvent, Unit> function;

    /* JADX WARN: Multi-variable type inference failed */
    public Func_void_UnifiedRiveEvent_java(@NotNull Function1<? super UnifiedRiveEvent, Unit> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.function = function;
    }

    @Override // com.margelo.nitro.rive.Func_void_UnifiedRiveEvent, kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((UnifiedRiveEvent) obj);
        return Unit.f14616a;
    }

    @Override // com.margelo.nitro.rive.Func_void_UnifiedRiveEvent
    @xa.a
    @Keep
    public void invoke(@NotNull UnifiedRiveEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.function.invoke(event);
    }
}
