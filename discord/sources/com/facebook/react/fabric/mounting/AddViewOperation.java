package com.facebook.react.fabric.mounting;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J;\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010%\u001a\u00020\u00162\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006)"}, d2 = {"Lcom/facebook/react/fabric/mounting/AddViewOperation;", "Lcom/facebook/react/fabric/mounting/ViewOperation;", "childTag", "", "parentTag", "index", "parent", "Landroid/view/ViewGroup;", "child", "Landroid/view/View;", "<init>", "(IIILandroid/view/ViewGroup;Landroid/view/View;)V", "getChildTag", "()I", "getParentTag", "getIndex", "()Ljava/lang/Integer;", "getParent", "()Landroid/view/ViewGroup;", "getChild", "()Landroid/view/View;", "isReadyToExecute", "", "coordinator", "Lcom/facebook/react/fabric/mounting/ViewTransitionCoordinator;", "execute", "", "manager", "Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;", "toString", "", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AddViewOperation implements ViewOperation {

    @NotNull
    private final View child;
    private final int childTag;
    private final int index;

    @NotNull
    private final ViewGroup parent;
    private final int parentTag;

    public AddViewOperation(int i7, int i10, int i11, @NotNull ViewGroup parent, @NotNull View child) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        this.childTag = i7;
        this.parentTag = i10;
        this.index = i11;
        this.parent = parent;
        this.child = child;
    }

    public static /* synthetic */ AddViewOperation copy$default(AddViewOperation addViewOperation, int i7, int i10, int i11, ViewGroup viewGroup, View view, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i7 = addViewOperation.childTag;
        }
        if ((i12 & 2) != 0) {
            i10 = addViewOperation.parentTag;
        }
        if ((i12 & 4) != 0) {
            i11 = addViewOperation.index;
        }
        if ((i12 & 8) != 0) {
            viewGroup = addViewOperation.parent;
        }
        if ((i12 & 16) != 0) {
            view = addViewOperation.child;
        }
        View view2 = view;
        int i13 = i11;
        return addViewOperation.copy(i7, i10, i13, viewGroup, view2);
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
    public final ViewGroup getParent() {
        return this.parent;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final View getChild() {
        return this.child;
    }

    @NotNull
    public final AddViewOperation copy(int childTag, int parentTag, int index, @NotNull ViewGroup parent, @NotNull View child) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        return new AddViewOperation(childTag, parentTag, index, parent, child);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddViewOperation)) {
            return false;
        }
        AddViewOperation addViewOperation = (AddViewOperation) other;
        return this.childTag == addViewOperation.childTag && this.parentTag == addViewOperation.parentTag && this.index == addViewOperation.index && Intrinsics.areEqual(this.parent, addViewOperation.parent) && Intrinsics.areEqual(this.child, addViewOperation.child);
    }

    @Override // com.facebook.react.fabric.mounting.ViewOperation
    public void execute(@NotNull SurfaceMountingManager manager) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        manager.executeAddViewOperation$ReactAndroid_release(this);
    }

    @NotNull
    public final View getChild() {
        return this.child;
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

    @NotNull
    public final ViewGroup getParent() {
        return this.parent;
    }

    @Override // com.facebook.react.fabric.mounting.ViewOperation
    public int getParentTag() {
        return this.parentTag;
    }

    public int hashCode() {
        return this.child.hashCode() + ((this.parent.hashCode() + com.discord.chat.presentation.list.a.u(this.index, com.discord.chat.presentation.list.a.u(this.parentTag, Integer.hashCode(this.childTag) * 31, 31), 31)) * 31);
    }

    @Override // com.facebook.react.fabric.mounting.ViewOperation
    public boolean isReadyToExecute(@NotNull ViewTransitionCoordinator coordinator) {
        Intrinsics.checkNotNullParameter(coordinator, "coordinator");
        if (this.child.getParent() != null) {
            return false;
        }
        return coordinator.isFirstInLineForChild(getChildTag(), getParentTag());
    }

    @NotNull
    public String toString() {
        int parentTag = getParentTag();
        int childTag = getChildTag();
        Integer index = getIndex();
        StringBuilder sbR = a3.e.r(parentTag, "AddViewOperation(parent=", childTag, ", child=", ", index=");
        sbR.append(index);
        sbR.append(")");
        return sbR.toString();
    }
}
