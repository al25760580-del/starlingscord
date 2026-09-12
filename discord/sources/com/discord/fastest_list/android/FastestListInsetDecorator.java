package com.discord.fastest_list.android;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/discord/fastest_list/android/FastestListInsetDecorator;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "horizontal", "", "insetEnd", "", "insetStart", "<init>", "(ZII)V", "getHorizontal", "()Z", "setHorizontal", "(Z)V", "getInsetEnd", "()I", "setInsetEnd", "(I)V", "getInsetStart", "setInsetStart", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "fastest_list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FastestListInsetDecorator extends RecyclerView.ItemDecoration {
    private boolean horizontal;
    private int insetEnd;
    private int insetStart;

    public FastestListInsetDecorator(boolean z5, int i7, int i10) {
        this.horizontal = z5;
        this.insetEnd = i7;
        this.insetStart = i10;
    }

    public final boolean getHorizontal() {
        return this.horizontal;
    }

    public final int getInsetEnd() {
        return this.insetEnd;
    }

    public final int getInsetStart() {
        return this.insetStart;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        if (childAdapterPosition == 0) {
            if (this.horizontal) {
                outRect.left = this.insetStart;
            } else {
                outRect.top = this.insetStart;
            }
        }
        if (childAdapterPosition == state.b() - 1) {
            if (this.horizontal) {
                outRect.right = this.insetEnd;
            } else {
                outRect.bottom = this.insetEnd;
            }
        }
    }

    public final void setHorizontal(boolean z5) {
        this.horizontal = z5;
    }

    public final void setInsetEnd(int i7) {
        this.insetEnd = i7;
    }

    public final void setInsetStart(int i7) {
        this.insetStart = i7;
    }
}
