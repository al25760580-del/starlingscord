package com.facebook.react.fabric.mounting.mountitems;

import a3.e;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.fabric.mounting.MountingManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0003H\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/facebook/react/fabric/mounting/mountitems/DispatchIntCommandMountItem;", "Lcom/facebook/react/fabric/mounting/mountitems/DispatchCommandMountItem;", "surfaceId", "", "reactTag", "commandId", "commandArgs", "Lcom/facebook/react/bridge/ReadableArray;", "<init>", "(IIILcom/facebook/react/bridge/ReadableArray;)V", "getSurfaceId", "execute", "", "mountingManager", "Lcom/facebook/react/fabric/mounting/MountingManager;", "toString", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DispatchIntCommandMountItem extends DispatchCommandMountItem {

    @NotNull
    private final ReadableArray commandArgs;
    private final int commandId;
    private final int reactTag;
    private final int surfaceId;

    public DispatchIntCommandMountItem(int i7, int i10, int i11, @NotNull ReadableArray commandArgs) {
        Intrinsics.checkNotNullParameter(commandArgs, "commandArgs");
        this.surfaceId = i7;
        this.reactTag = i10;
        this.commandId = i11;
        this.commandArgs = commandArgs;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public void execute(@NotNull MountingManager mountingManager) {
        Intrinsics.checkNotNullParameter(mountingManager, "mountingManager");
        mountingManager.receiveCommand(this.surfaceId, this.reactTag, this.commandId, this.commandArgs);
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public int getSurfaceId() {
        return this.surfaceId;
    }

    @NotNull
    public String toString() {
        return e.g(this.reactTag, this.commandId, "DispatchIntCommandMountItem [", "] ");
    }
}
