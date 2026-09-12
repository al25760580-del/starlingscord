package com.discord.chat.presentation.message.decorations;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.presentation.message.view.MessageContentView;
import com.discord.chat.presentation.message.view.ThreadEmbedView;
import com.discord.chat.presentation.spine.SpineParentMessage;
import com.discord.misc.utilities.size.SizeUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/discord/chat/presentation/message/decorations/ThreadSpineItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "context", "Landroid/content/Context;", "contentStartPositionPx", "", "<init>", "(Landroid/content/Context;I)V", "spineDrawer", "Lcom/discord/chat/presentation/message/decorations/SpineDrawer;", "showThreadSpine", "", "getShowThreadSpine", "()Z", "setShowThreadSpine", "(Z)V", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ThreadSpineItemDecoration extends RecyclerView.ItemDecoration {
    private boolean showThreadSpine;

    @NotNull
    private final SpineDrawer spineDrawer;

    public ThreadSpineItemDecoration(@NotNull Context context, int i7) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.spineDrawer = new SpineDrawer(context, i7);
        this.showThreadSpine = true;
    }

    public final boolean getShowThreadSpine() {
        return this.showThreadSpine;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
        View spineOriginView;
        Canvas canvas2;
        RecyclerView recyclerView;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.onDraw(canvas, parent, state);
        if (this.showThreadSpine) {
            ViewParent parent2 = parent.getParent();
            SpineParentMessage spineParentMessage = parent2 instanceof SpineParentMessage ? (SpineParentMessage) parent2 : null;
            if (spineParentMessage == null || (spineOriginView = spineParentMessage.getSpineOriginView()) == null) {
                return;
            }
            int measuredWidth = (spineOriginView.getMeasuredWidth() / 2) + spineOriginView.getLeft();
            int childCount = parent.getChildCount();
            int i7 = 0;
            while (i7 < childCount) {
                View childAt = parent.getChildAt(i7);
                if (childAt == null) {
                    canvas2 = canvas;
                    recyclerView = parent;
                } else if (childAt instanceof ThreadEmbedView) {
                    int i10 = measuredWidth;
                    canvas2 = canvas;
                    recyclerView = parent;
                    this.spineDrawer.drawSpineCurve(canvas2, recyclerView, childAt, childAt, i10);
                    measuredWidth = i10;
                } else {
                    canvas2 = canvas;
                    recyclerView = parent;
                    if (childAt instanceof MessageContentView) {
                        this.spineDrawer.drawSpinePiece(canvas2, recyclerView, childAt, measuredWidth, i7 == 0 ? SizeUtilsKt.getDpToPx(2) + ((MessageContentView) childAt).getLineHeight() : 0);
                    } else {
                        SpineDrawer.drawSpinePiece$default(this.spineDrawer, canvas2, recyclerView, childAt, measuredWidth, 0, 16, null);
                    }
                }
                i7++;
                canvas = canvas2;
                parent = recyclerView;
            }
        }
    }

    public final void setShowThreadSpine(boolean z5) {
        this.showThreadSpine = z5;
    }
}
