package com.discord.fastest_list.android.scroll;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.fastest_list.android.FastestListLayoutManager;
import com.discord.fastest_list.android.FastestListVisibleItemsTracker;
import com.discord.recycler_view.scroll.DebouncedScrollListener;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001e\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0018\u001a\u00020\t*\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\n\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010$R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010%R\u0016\u0010&\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\u001f¨\u0006'"}, d2 = {"Lcom/discord/fastest_list/android/scroll/FastestListScrollListener;", "Lcom/discord/recycler_view/scroll/DebouncedScrollListener;", "", "keyboardDismissOnDrag", "", "onScrollEventThrottle", "Lkotlin/Function3;", "Landroidx/recyclerview/widget/RecyclerView;", "", "", "onScrolled", "Lkotlin/Function1;", "onDragStateChanged", "Lcom/discord/fastest_list/android/FastestListLayoutManager;", "layoutManager", "Lcom/discord/fastest_list/android/FastestListVisibleItemsTracker;", "visibleItemsTracker", "<init>", "(ZJLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lcom/discord/fastest_list/android/FastestListLayoutManager;Lcom/discord/fastest_list/android/FastestListVisibleItemsTracker;)V", "dx", "dy", "getIsScrollingForward", "(II)Z", "Landroid/view/View;", "dismissKeyboard", "(Landroid/view/View;)V", "recyclerView", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "newState", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "Z", "getKeyboardDismissOnDrag", "()Z", "setKeyboardDismissOnDrag", "(Z)V", "Lcom/discord/fastest_list/android/FastestListLayoutManager;", "Lcom/discord/fastest_list/android/FastestListVisibleItemsTracker;", "keyboardDismissOnDragDispatched", "fastest_list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FastestListScrollListener extends DebouncedScrollListener {
    private boolean keyboardDismissOnDrag;
    private boolean keyboardDismissOnDragDispatched;

    @NotNull
    private final FastestListLayoutManager layoutManager;

    @NotNull
    private final FastestListVisibleItemsTracker visibleItemsTracker;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FastestListScrollListener(boolean z5, long j, @NotNull Function3 onScrolled, @NotNull Function1<? super Boolean, Unit> onDragStateChanged, @NotNull FastestListLayoutManager layoutManager, @NotNull FastestListVisibleItemsTracker visibleItemsTracker) {
        super(j, onScrolled, null, onDragStateChanged, 4, null);
        Intrinsics.checkNotNullParameter(onScrolled, "onScrolled");
        Intrinsics.checkNotNullParameter(onDragStateChanged, "onDragStateChanged");
        Intrinsics.checkNotNullParameter(layoutManager, "layoutManager");
        Intrinsics.checkNotNullParameter(visibleItemsTracker, "visibleItemsTracker");
        this.keyboardDismissOnDrag = z5;
        this.layoutManager = layoutManager;
        this.visibleItemsTracker = visibleItemsTracker;
    }

    private final void dismissKeyboard(View view) {
        Object systemService = view.getContext().getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    private final boolean getIsScrollingForward(int dx, int dy) {
        if (this.layoutManager.getHorizontal()) {
            return dx > 0;
        }
        return dy > 0;
    }

    public final boolean getKeyboardDismissOnDrag() {
        return this.keyboardDismissOnDrag;
    }

    @Override // com.discord.recycler_view.scroll.DebouncedScrollListener, androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(@NotNull RecyclerView recyclerView, int newState) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onScrollStateChanged(recyclerView, newState);
        boolean z5 = newState == 0;
        if (this.keyboardDismissOnDragDispatched && z5) {
            this.keyboardDismissOnDragDispatched = false;
        }
    }

    @Override // com.discord.recycler_view.scroll.DebouncedScrollListener, androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(@NotNull RecyclerView recyclerView, int dx, int dy) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (this.layoutManager.getHorizontal() && dx == 0) {
            return;
        }
        if (this.layoutManager.getHorizontal() || dy != 0) {
            super.onScrolled(recyclerView, dx, dy);
            this.layoutManager.setScrollingForward(getIsScrollingForward(dx, dy));
            this.visibleItemsTracker.updateVisibleItemPositions();
            if (!this.keyboardDismissOnDrag || this.keyboardDismissOnDragDispatched) {
                return;
            }
            this.keyboardDismissOnDragDispatched = true;
            dismissKeyboard(recyclerView);
        }
    }

    public final void setKeyboardDismissOnDrag(boolean z5) {
        this.keyboardDismissOnDrag = z5;
    }
}
