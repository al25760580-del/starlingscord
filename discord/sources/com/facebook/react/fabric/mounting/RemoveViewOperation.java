package com.facebook.react.fabric.mounting;

import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J1\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010 \u001a\u00020\u00122\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006$"}, d2 = {"Lcom/facebook/react/fabric/mounting/RemoveViewOperation;", "Lcom/facebook/react/fabric/mounting/ViewOperation;", "childTag", "", "parentTag", "index", "parentView", "Landroid/view/ViewGroup;", "<init>", "(IIILandroid/view/ViewGroup;)V", "getChildTag", "()I", "getParentTag", "getIndex", "()Ljava/lang/Integer;", "getParentView", "()Landroid/view/ViewGroup;", "isReadyToExecute", "", "coordinator", "Lcom/facebook/react/fabric/mounting/ViewTransitionCoordinator;", "execute", "", "manager", "Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;", "toString", "", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class RemoveViewOperation implements ViewOperation {
    private final int childTag;
    private final int index;
    private final int parentTag;

    @NotNull
    private final ViewGroup parentView;

    public RemoveViewOperation(int i7, int i10, int i11, @NotNull ViewGroup parentView) {
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        this.childTag = i7;
        this.parentTag = i10;
        this.index = i11;
        this.parentView = parentView;
    }

    public static /* synthetic */ RemoveViewOperation copy$default(RemoveViewOperation removeViewOperation, int i7, int i10, int i11, ViewGroup viewGroup, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i7 = removeViewOperation.childTag;
        }
        if ((i12 & 2) != 0) {
            i10 = removeViewOperation.parentTag;
        }
        if ((i12 & 4) != 0) {
            i11 = removeViewOperation.index;
        }
        if ((i12 & 8) != 0) {
            viewGroup = removeViewOperation.parentView;
        }
        return removeViewOperation.copy(i7, i10, i11, viewGroup);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getChildTag() {
        return this.childTag;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getParentTag() {
        return this.parentTag;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ViewGroup getParentView() {
        return this.parentView;
    }

    @NotNull
    public final RemoveViewOperation copy(int childTag, int parentTag, int index, @NotNull ViewGroup parentView) {
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        return new RemoveViewOperation(childTag, parentTag, index, parentView);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemoveViewOperation)) {
            return false;
        }
        RemoveViewOperation removeViewOperation = (RemoveViewOperation) other;
        return this.childTag == removeViewOperation.childTag && this.parentTag == removeViewOperation.parentTag && this.index == removeViewOperation.index && Intrinsics.areEqual(this.parentView, removeViewOperation.parentView);
    }

    @Override // com.facebook.react.fabric.mounting.ViewOperation
    public void execute(@NotNull SurfaceMountingManager manager) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        manager.executeRemoveViewOperation$ReactAndroid_release(this);
    }

    @Override // com.facebook.react.fabric.mounting.ViewOperation
    public int getChildTag() {
        return this.childTag;
    }

    @Override // com.facebook.react.fabric.mounting.ViewOperation
    @NotNull
    public Integer getIndex() {
        return Integer.valueOf(this.index);
    }

    @Override // com.facebook.react.fabric.mounting.ViewOperation
    public int getParentTag() {
        return this.parentTag;
    }

    @NotNull
    public final ViewGroup getParentView() {
        return this.parentView;
    }

    public int hashCode() {
        return this.parentView.hashCode() + com.discord.chat.presentation.list.a.u(this.index, com.discord.chat.presentation.list.a.u(this.parentTag, Integer.hashCode(this.childTag) * 31, 31), 31);
    }

    @Override // com.facebook.react.fabric.mounting.ViewOperation
    public boolean isReadyToExecute(@NotNull ViewTransitionCoordinator coordinator) {
        Intrinsics.checkNotNullParameter(coordinator, "coordinator");
        return coordinator.isFirstInLineForChild(getChildTag(), getParentTag());
    }

    @NotNull
    public String toString() {
        int parentTag = getParentTag();
        int childTag = getChildTag();
        Integer index = getIndex();
        StringBuilder sbR = a3.e.r(parentTag, "RemoveViewOperation(parent=", childTag, ", child=", ", index=");
        sbR.append(index);
        sbR.append(")");
        return sbR.toString();
    }
}
