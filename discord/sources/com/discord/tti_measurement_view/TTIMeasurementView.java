package com.discord.tti_measurement_view;

import am.c;
import android.annotation.SuppressLint;
import android.view.View;
import com.facebook.react.uimanager.ThemedReactContext;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\r\u001a\u00020\u00062\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\tj\u0002`\u000b¢\u0006\u0004\b\r\u0010\u000eR<\u0010\u000f\u001a\u001c\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\tj\u0004\u0018\u0001`\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u000eR\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/discord/tti_measurement_view/TTIMeasurementView;", "Landroid/view/View;", "Lcom/facebook/react/uimanager/ThemedReactContext;", "context", "<init>", "(Lcom/facebook/react/uimanager/ThemedReactContext;)V", "", "registerDrawListener", "()V", "Lkotlin/Function2;", "", "Lcom/discord/tti_measurement_view/OnMeasurementListener;", "listener", "setOnMeasurementListener", "(Lkotlin/jvm/functions/Function2;)V", "measurementListener", "Lkotlin/jvm/functions/Function2;", "getMeasurementListener", "()Lkotlin/jvm/functions/Function2;", "setMeasurementListener", "", "measurementSent", "Z", "getMeasurementSent", "()Z", "setMeasurementSent", "(Z)V", "tti_measurement_view_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
public final class TTIMeasurementView extends View {
    private Function2<? super TTIMeasurementView, ? super Double, Unit> measurementListener;
    private boolean measurementSent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TTIMeasurementView(@NotNull ThemedReactContext context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void registerDrawListener() {
        FirstDrawDoneListener.registerForNextDraw(this, new c(12, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerDrawListener$lambda$0(TTIMeasurementView tTIMeasurementView) {
        if (tTIMeasurementView.measurementSent) {
            return;
        }
        tTIMeasurementView.measurementSent = true;
        Function2<? super TTIMeasurementView, ? super Double, Unit> function2 = tTIMeasurementView.measurementListener;
        if (function2 != null) {
            function2.invoke(tTIMeasurementView, Double.valueOf(System.currentTimeMillis()));
        }
    }

    public final Function2<TTIMeasurementView, Double, Unit> getMeasurementListener() {
        return this.measurementListener;
    }

    public final boolean getMeasurementSent() {
        return this.measurementSent;
    }

    public final void setMeasurementListener(Function2<? super TTIMeasurementView, ? super Double, Unit> function2) {
        this.measurementListener = function2;
    }

    public final void setMeasurementSent(boolean z5) {
        this.measurementSent = z5;
    }

    public final void setOnMeasurementListener(@NotNull Function2<? super TTIMeasurementView, ? super Double, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.measurementListener = listener;
        registerDrawListener();
    }
}
