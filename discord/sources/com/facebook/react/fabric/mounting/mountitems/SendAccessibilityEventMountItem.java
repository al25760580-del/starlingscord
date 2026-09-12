package com.facebook.react.fabric.mounting.mountitems;

import a3.e;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.fabric.mounting.MountingManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/facebook/react/fabric/mounting/mountitems/SendAccessibilityEventMountItem;", "Lcom/facebook/react/fabric/mounting/mountitems/MountItem;", "surfaceId", "", "reactTag", "eventType", "<init>", "(III)V", "execute", "", "mountingManager", "Lcom/facebook/react/fabric/mounting/MountingManager;", "getSurfaceId", "toString", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SendAccessibilityEventMountItem implements MountItem {
    private final int eventType;
    private final int reactTag;
    private final int surfaceId;

    public SendAccessibilityEventMountItem(int i7, int i10, int i11) {
        this.surfaceId = i7;
        this.reactTag = i10;
        this.eventType = i11;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public void execute(@NotNull MountingManager mountingManager) {
        Intrinsics.checkNotNullParameter(mountingManager, "mountingManager");
        try {
            mountingManager.sendAccessibilityEvent(this.surfaceId, this.reactTag, this.eventType);
        } catch (RetryableMountingLayerException e10) {
            ReactSoftExceptionLogger.logSoftException("SendAccessibilityEventMountItem", new ReactNoCrashSoftException(e10));
        }
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public int getSurfaceId() {
        return this.surfaceId;
    }

    @NotNull
    public String toString() {
        return e.g(this.reactTag, this.eventType, "SendAccessibilityEventMountItem [", "] ");
    }
}
