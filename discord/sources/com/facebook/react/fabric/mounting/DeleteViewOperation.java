package com.facebook.react.fabric.mounting;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import s0.g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ.\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\u00112\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006#"}, d2 = {"Lcom/facebook/react/fabric/mounting/DeleteViewOperation;", "Lcom/facebook/react/fabric/mounting/ViewOperation;", "childTag", "", "parentTag", "index", "<init>", "(IILjava/lang/Integer;)V", "reactTag", "(I)V", "getChildTag", "()I", "getParentTag", "getIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "isReadyToExecute", "", "coordinator", "Lcom/facebook/react/fabric/mounting/ViewTransitionCoordinator;", "execute", "", "manager", "Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;", "toString", "", "component1", "component2", "component3", "copy", "(IILjava/lang/Integer;)Lcom/facebook/react/fabric/mounting/DeleteViewOperation;", "equals", "other", "", "hashCode", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class DeleteViewOperation implements ViewOperation {
    private final int childTag;
    private final Integer index;
    private final int parentTag;

    public DeleteViewOperation(int i7, int i10, Integer num) {
        this.childTag = i7;
        this.parentTag = i10;
        this.index = num;
    }

    public static /* synthetic */ DeleteViewOperation copy$default(DeleteViewOperation deleteViewOperation, int i7, int i10, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i7 = deleteViewOperation.childTag;
        }
        if ((i11 & 2) != 0) {
            i10 = deleteViewOperation.parentTag;
        }
        if ((i11 & 4) != 0) {
            num = deleteViewOperation.index;
        }
        return deleteViewOperation.copy(i7, i10, num);
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
    public final Integer getIndex() {
        return this.index;
    }

    @NotNull
    public final DeleteViewOperation copy(int childTag, int parentTag, Integer index) {
        return new DeleteViewOperation(childTag, parentTag, index);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeleteViewOperation)) {
            return false;
        }
        DeleteViewOperation deleteViewOperation = (DeleteViewOperation) other;
        return this.childTag == deleteViewOperation.childTag && this.parentTag == deleteViewOperation.parentTag && Intrinsics.areEqual(this.index, deleteViewOperation.index);
    }

    @Override // com.facebook.react.fabric.mounting.ViewOperation
    public void execute(@NotNull SurfaceMountingManager manager) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        manager.executeDeleteViewOperation$ReactAndroid_release(this);
    }

    @Override // com.facebook.react.fabric.mounting.ViewOperation
    public int getChildTag() {
        return this.childTag;
    }

    @Override // com.facebook.react.fabric.mounting.ViewOperation
    public Integer getIndex() {
        return this.index;
    }

    @Override // com.facebook.react.fabric.mounting.ViewOperation
    public int getParentTag() {
        return this.parentTag;
    }

    public int hashCode() {
        int iU = com.discord.chat.presentation.list.a.u(this.parentTag, Integer.hashCode(this.childTag) * 31, 31);
        Integer num = this.index;
        return iU + (num == null ? 0 : num.hashCode());
    }

    @Override // com.facebook.react.fabric.mounting.ViewOperation
    public boolean isReadyToExecute(@NotNull ViewTransitionCoordinator coordinator) {
        Intrinsics.checkNotNullParameter(coordinator, "coordinator");
        return coordinator.isFirstInLineForChild(getChildTag(), getParentTag());
    }

    @NotNull
    public String toString() {
        return g.d(getChildTag(), "DeleteViewOperation(child=", ")");
    }

    public DeleteViewOperation(int i7) {
        this(i7, ViewOperationsKt.DELETE_VIEW_PARENT_TAG, null);
    }
}
