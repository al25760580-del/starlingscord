package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.fabric.mounting.MountingManager;
import com.facebook.react.fabric.mounting.SurfaceMountingManager;
import com.facebook.react.uimanager.StateWrapper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o8.a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0010\u001a\u00020\u0003H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/facebook/react/fabric/mounting/mountitems/PreAllocateViewMountItem;", "Lcom/facebook/react/fabric/mounting/mountitems/MountItem;", "surfaceId", "", "reactTag", "component", "", "props", "Lcom/facebook/react/bridge/ReadableMap;", "stateWrapper", "Lcom/facebook/react/uimanager/StateWrapper;", "isLayoutable", "", "<init>", "(IILjava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/uimanager/StateWrapper;Z)V", "fabricComponentName", "getSurfaceId", "execute", "", "mountingManager", "Lcom/facebook/react/fabric/mounting/MountingManager;", "toString", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PreAllocateViewMountItem implements MountItem {

    @NotNull
    private final String fabricComponentName;
    private final boolean isLayoutable;

    @NotNull
    private final ReadableMap props;
    private final int reactTag;
    private final StateWrapper stateWrapper;
    private final int surfaceId;

    public PreAllocateViewMountItem(int i7, int i10, @NotNull String component, @NotNull ReadableMap props, StateWrapper stateWrapper, boolean z5) {
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(props, "props");
        this.surfaceId = i7;
        this.reactTag = i10;
        this.props = props;
        this.stateWrapper = stateWrapper;
        this.isLayoutable = z5;
        this.fabricComponentName = FabricNameComponentMapping.getFabricComponentName(component);
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public void execute(@NotNull MountingManager mountingManager) {
        Intrinsics.checkNotNullParameter(mountingManager, "mountingManager");
        SurfaceMountingManager surfaceManager = mountingManager.getSurfaceManager(this.surfaceId);
        if (surfaceManager != null) {
            surfaceManager.preallocateView(this.fabricComponentName, this.reactTag, this.props, this.stateWrapper, this.isLayoutable);
            return;
        }
        a.g(FabricUIManager.TAG, "Skipping View PreAllocation; no SurfaceMountingManager found for [" + this.surfaceId + "]");
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public int getSurfaceId() {
        return this.surfaceId;
    }

    @NotNull
    public String toString() {
        String string;
        StringBuilder sb2 = new StringBuilder("PreAllocateViewMountItem [");
        sb2.append(this.reactTag);
        sb2.append("] - component: ");
        sb2.append(this.fabricComponentName);
        sb2.append(" surfaceId: ");
        sb2.append(this.surfaceId);
        sb2.append(" isLayoutable: ");
        sb2.append(this.isLayoutable);
        if (FabricUIManager.IS_DEVELOPMENT_ENVIRONMENT) {
            sb2.append(" props: ");
            String string2 = this.props.toString();
            String str = "<null>";
            if (string2 == null) {
                string2 = "<null>";
            }
            sb2.append(string2);
            sb2.append(" state: ");
            StateWrapper stateWrapper = this.stateWrapper;
            if (stateWrapper != null && (string = stateWrapper.toString()) != null) {
                str = string;
            }
            sb2.append(str);
        }
        String string3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        return string3;
    }
}
