package com.discord.portals.from_native;

import android.app.Activity;
import ar.b0;
import com.discord.codegen.NativePortalFromNativeModuleSpec;
import com.discord.misc.utilities.coroutines.CoroutineViewUtilsKt;
import com.discord.reactevents.ReactEvent;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.viewmanagers.DCDPortalViewManagerDelegate;
import com.facebook.react.viewmanagers.DCDPortalViewManagerInterface;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kr.f;
import or.e1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\f"}, d2 = {"Lcom/discord/portals/from_native/PortalFromNativeModule;", "Lcom/discord/codegen/NativePortalFromNativeModuleSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "unregisterView", "", "portal", "", "OnPortalViewLoadedEvent", "ViewManager", "portals_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PortalFromNativeModule extends NativePortalFromNativeModuleSpec {

    @f
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001e\u001fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\nJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J%\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0001¢\u0006\u0002\b\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006 "}, d2 = {"Lcom/discord/portals/from_native/PortalFromNativeModule$OnPortalViewLoadedEvent;", "Lcom/discord/reactevents/ReactEvent;", "portal", "", "<init>", "(D)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IDLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getPortal", "()D", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$portals_release", "$serializer", "Companion", "portals_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnPortalViewLoadedEvent implements ReactEvent {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private final double portal;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/portals/from_native/PortalFromNativeModule$OnPortalViewLoadedEvent$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/portals/from_native/PortalFromNativeModule$OnPortalViewLoadedEvent;", "portals_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return PortalFromNativeModule$OnPortalViewLoadedEvent$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ OnPortalViewLoadedEvent(int i7, double d6, SerializationConstructorMarker serializationConstructorMarker) {
            if (1 == (i7 & 1)) {
                this.portal = d6;
            } else {
                e1.l(i7, 1, PortalFromNativeModule$OnPortalViewLoadedEvent$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public static /* synthetic */ OnPortalViewLoadedEvent copy$default(OnPortalViewLoadedEvent onPortalViewLoadedEvent, double d6, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                d6 = onPortalViewLoadedEvent.portal;
            }
            return onPortalViewLoadedEvent.copy(d6);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final double getPortal() {
            return this.portal;
        }

        @NotNull
        public final OnPortalViewLoadedEvent copy(double portal) {
            return new OnPortalViewLoadedEvent(portal);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnPortalViewLoadedEvent) && Double.compare(this.portal, ((OnPortalViewLoadedEvent) other).portal) == 0;
        }

        public final double getPortal() {
            return this.portal;
        }

        public int hashCode() {
            return Double.hashCode(this.portal);
        }

        @Override // com.discord.reactevents.ReactEvent
        @NotNull
        /* JADX INFO: renamed from: serialize */
        public WritableMap getData() {
            return ReactEvent.DefaultImpls.serialize(this);
        }

        @NotNull
        public String toString() {
            return "OnPortalViewLoadedEvent(portal=" + this.portal + ")";
        }

        public OnPortalViewLoadedEvent(double d6) {
            this.portal = d6;
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0016B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\t\u001a\u001e\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00000\u00000\u0007H\u0014J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0014J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R*\u0010\u0006\u001a\u001e\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00000\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/discord/portals/from_native/PortalFromNativeModule$ViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/discord/portals/from_native/PortalHolderViewGroup;", "Lcom/facebook/react/viewmanagers/DCDPortalViewManagerInterface;", "<init>", "()V", "delegate", "Lcom/facebook/react/viewmanagers/DCDPortalViewManagerDelegate;", "kotlin.jvm.PlatformType", "getDelegate", "getName", "", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "setPortal", "", "portalView", "portal", "", "Companion", "portals_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @ReactModule(name = ViewManager.NAME)
    public static final class ViewManager extends ViewGroupManager<PortalHolderViewGroup> implements DCDPortalViewManagerInterface<PortalHolderViewGroup> {

        @NotNull
        public static final String NAME = "DCDPortalView";

        @NotNull
        private final DCDPortalViewManagerDelegate<PortalHolderViewGroup, ViewManager> delegate;

        @NotNull
        private final ReactEvents reactEvents;

        public ViewManager() {
            super(null, 1, null);
            this.delegate = new DCDPortalViewManagerDelegate<>(this);
            this.reactEvents = new ReactEvents(new Pair("onPortalViewLoaded", Reflection.getOrCreateKotlinClass(OnPortalViewLoadedEvent.class)));
        }

        @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
        @NotNull
        public String getName() {
            return NAME;
        }

        @Override // com.facebook.react.uimanager.ViewManager
        @NotNull
        public PortalHolderViewGroup createViewInstance(@NotNull ThemedReactContext reactContext) {
            Intrinsics.checkNotNullParameter(reactContext, "reactContext");
            return new PortalHolderViewGroup(reactContext);
        }

        @Override // com.facebook.react.uimanager.ViewManager
        @NotNull
        public DCDPortalViewManagerDelegate<PortalHolderViewGroup, ViewManager> getDelegate() {
            return this.delegate;
        }

        @Override // com.facebook.react.viewmanagers.DCDPortalViewManagerInterface
        public void setPortal(@NotNull PortalHolderViewGroup portalView, double portal) {
            Intrinsics.checkNotNullParameter(portalView, "portalView");
            b0.t(CoroutineViewUtilsKt.getAttachedScope(portalView), null, new PortalFromNativeModule$ViewManager$setPortal$1(portal, portalView, this, null), 3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PortalFromNativeModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void unregisterView$lambda$0(double d6) {
        PortalFromNativeContextManager.INSTANCE.unregisterView(d6);
    }

    @Override // com.discord.codegen.NativePortalFromNativeModuleSpec
    public void unregisterView(final double portal) {
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.runOnUiThread(new Runnable() { // from class: com.discord.portals.from_native.a
                @Override // java.lang.Runnable
                public final void run() {
                    PortalFromNativeModule.unregisterView$lambda$0(portal);
                }
            });
        }
    }
}
