package com.discord.fastest_list.android;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.recycler_view.utils.TransitionResilientLinearLayoutManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\b\u0000\u0018\u0000  2\u00020\u0001:\u0002 !B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u001fH\u0014R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0017\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\""}, d2 = {"Lcom/discord/fastest_list/android/FastestListLayoutManager;", "Lcom/discord/recycler_view/utils/TransitionResilientLinearLayoutManager;", "renderAhead", "Lcom/discord/fastest_list/android/FastestListVisibleItemsTracker$RenderAhead;", "context", "Landroid/content/Context;", "horizontal", "", "reverseLayout", "<init>", "(Lcom/discord/fastest_list/android/FastestListVisibleItemsTracker$RenderAhead;Landroid/content/Context;ZZ)V", "getRenderAhead", "()Lcom/discord/fastest_list/android/FastestListVisibleItemsTracker$RenderAhead;", "setRenderAhead", "(Lcom/discord/fastest_list/android/FastestListVisibleItemsTracker$RenderAhead;)V", "scrollingForward", "getScrollingForward", "()Z", "setScrollingForward", "(Z)V", "value", "getHorizontal", "setHorizontal", "extraLayoutSpace", "", "getExtraLayoutSpace", "()I", "calculateExtraLayoutSpace", "", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "", "Companion", "FastestListLayoutManagerException", "fastest_list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FastestListLayoutManager extends TransitionResilientLinearLayoutManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int EXTRA_LAYOUT_SPACE_END = 1;
    private static final int EXTRA_LAYOUT_SPACE_START = 0;
    private boolean horizontal;

    @NotNull
    private FastestListVisibleItemsTracker.RenderAhead renderAhead;
    private boolean scrollingForward;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/discord/fastest_list/android/FastestListLayoutManager$Companion;", "", "<init>", "()V", "EXTRA_LAYOUT_SPACE_START", "", "EXTRA_LAYOUT_SPACE_END", "getOrientation", "horizontal", "", "fastest_list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int getOrientation(boolean horizontal) {
            return !horizontal ? 1 : 0;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/discord/fastest_list/android/FastestListLayoutManager$FastestListLayoutManagerException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "(Ljava/lang/Exception;)V", "fastest_list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FastestListLayoutManagerException extends IllegalStateException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FastestListLayoutManagerException(@NotNull Exception e10) {
            super(e10);
            Intrinsics.checkNotNullParameter(e10, "e");
        }
    }

    public /* synthetic */ FastestListLayoutManager(FastestListVisibleItemsTracker.RenderAhead renderAhead, Context context, boolean z5, boolean z6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(renderAhead, context, z5, (i7 & 8) != 0 ? false : z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Exception _init_$lambda$0(Exception e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        return new FastestListLayoutManagerException(e10);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void calculateExtraLayoutSpace(@NotNull RecyclerView.State state, @NotNull int[] extraLayoutSpace) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(extraLayoutSpace, "extraLayoutSpace");
        if (this.scrollingForward) {
            extraLayoutSpace[1] = getExtraLayoutSpace();
        } else {
            extraLayoutSpace[0] = getExtraLayoutSpace();
        }
    }

    public final int getExtraLayoutSpace() {
        float height;
        float extraLayoutPercent;
        if (this.horizontal) {
            height = getWidth();
            extraLayoutPercent = this.renderAhead.getExtraLayoutPercent();
        } else {
            height = getHeight();
            extraLayoutPercent = this.renderAhead.getExtraLayoutPercent();
        }
        return (int) (extraLayoutPercent * height);
    }

    public final boolean getHorizontal() {
        return this.horizontal;
    }

    @NotNull
    public final FastestListVisibleItemsTracker.RenderAhead getRenderAhead() {
        return this.renderAhead;
    }

    public final boolean getScrollingForward() {
        return this.scrollingForward;
    }

    public final void setHorizontal(boolean z5) {
        this.horizontal = z5;
        setOrientation(INSTANCE.getOrientation(z5));
    }

    public final void setRenderAhead(@NotNull FastestListVisibleItemsTracker.RenderAhead renderAhead) {
        Intrinsics.checkNotNullParameter(renderAhead, "<set-?>");
        this.renderAhead = renderAhead;
    }

    public final void setScrollingForward(boolean z5) {
        this.scrollingForward = z5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FastestListLayoutManager(@NotNull FastestListVisibleItemsTracker.RenderAhead renderAhead, @NotNull Context context, boolean z5, boolean z6) {
        super(context, INSTANCE.getOrientation(z5), z6, new com.discord.emoji.a(6));
        Intrinsics.checkNotNullParameter(renderAhead, "renderAhead");
        Intrinsics.checkNotNullParameter(context, "context");
        this.renderAhead = renderAhead;
        this.scrollingForward = true;
        this.horizontal = z5;
    }
}
