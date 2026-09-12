package com.discord.emoji_picker;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import com.discord.recycler_view.utils.TransitionResilientGridLayoutManager;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/discord/emoji_picker/EmojiPickerLayoutManager;", "Lcom/discord/recycler_view/utils/TransitionResilientGridLayoutManager;", "Landroid/content/Context;", "context", "", "rowSize", "Lkotlin/Function1;", "onGetSpanSize", "<init>", "(Landroid/content/Context;ILkotlin/jvm/functions/Function1;)V", "", "canScrollVertically", "()Z", ViewProps.ENABLED, "", "setScrollingEnabled", "(Z)V", "Lkotlin/jvm/functions/Function1;", "isScrollEnabled", "Z", "emoji_picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EmojiPickerLayoutManager extends TransitionResilientGridLayoutManager {
    private boolean isScrollEnabled;

    @NotNull
    private final Function1<Integer, Integer> onGetSpanSize;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EmojiPickerLayoutManager(@NotNull Context context, int i7, @NotNull Function1<? super Integer, Integer> onGetSpanSize) {
        super(context, i7, null, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onGetSpanSize, "onGetSpanSize");
        this.onGetSpanSize = onGetSpanSize;
        this.isScrollEnabled = true;
        setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() { // from class: com.discord.emoji_picker.EmojiPickerLayoutManager.1
            @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
            public int getSpanSize(int position) {
                return ((Number) EmojiPickerLayoutManager.this.onGetSpanSize.invoke(Integer.valueOf(position))).intValue();
            }
        });
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return this.isScrollEnabled && super.canScrollVertically();
    }

    public final void setScrollingEnabled(boolean enabled) {
        this.isScrollEnabled = enabled;
    }
}
