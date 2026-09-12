package com.discord.tti_measurement_view;

import com.discord.reactevents.ReactEvents;
import com.discord.tti_measurement_view.events.OnMeasurementEvent;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.viewmanagers.DCDTTIMeasurementViewManagerDelegate;
import com.facebook.react.viewmanagers.DCDTTIMeasurementViewManagerInterface;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@ReactModule(name = TTIMeasurementViewManager.NAME)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0019B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\b\u001a\u001e\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00000\u00000\tH\u0014J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000fH\u0014J\u0014\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0002H\u0014J\u0018\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/discord/tti_measurement_view/TTIMeasurementViewManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/discord/tti_measurement_view/TTIMeasurementView;", "Lcom/facebook/react/viewmanagers/DCDTTIMeasurementViewManagerInterface;", "<init>", "()V", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "getDelegate", "Lcom/facebook/react/viewmanagers/DCDTTIMeasurementViewManagerDelegate;", "kotlin.jvm.PlatformType", "getName", "", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getExportedCustomDirectEventTypeConstants", "", "", "addEventEmitters", "", "view", "onMeasurement", "timestamp", "", "Companion", "tti_measurement_view_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TTIMeasurementViewManager extends SimpleViewManager<TTIMeasurementView> implements DCDTTIMeasurementViewManagerInterface<TTIMeasurementView> {

    @NotNull
    public static final String NAME = "DCDTTIMeasurementView";

    @NotNull
    private final ReactEvents reactEvents = new ReactEvents(new Pair("onMeasurement", Reflection.getOrCreateKotlinClass(OnMeasurementEvent.class)));

    /* JADX INFO: renamed from: com.discord.tti_measurement_view.TTIMeasurementViewManager$addEventEmitters$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function2<TTIMeasurementView, Double, Unit> {
        public AnonymousClass1(Object obj) {
            super(2, obj, TTIMeasurementViewManager.class, "onMeasurement", "onMeasurement(Lcom/discord/tti_measurement_view/TTIMeasurementView;D)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((TTIMeasurementView) obj, ((Number) obj2).doubleValue());
            return Unit.f14616a;
        }

        public final void invoke(TTIMeasurementView p3, double d6) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            ((TTIMeasurementViewManager) this.receiver).onMeasurement(p3, d6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onMeasurement(TTIMeasurementView view, double timestamp) {
        this.reactEvents.emitEvent(view, new OnMeasurementEvent(timestamp));
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return this.reactEvents.exportEventConstants();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(@NotNull ThemedReactContext reactContext, @NotNull TTIMeasurementView view) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(view, "view");
        super.addEventEmitters(reactContext, view);
        view.setOnMeasurementListener(new AnonymousClass1(this));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public TTIMeasurementView createViewInstance(@NotNull ThemedReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return new TTIMeasurementView(reactContext);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public DCDTTIMeasurementViewManagerDelegate<TTIMeasurementView, TTIMeasurementViewManager> getDelegate() {
        return new DCDTTIMeasurementViewManagerDelegate<>(this);
    }
}
