package com.discord.emoji_picker;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\f\u001a\u00020\u000b*\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0011\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\"\u0010\u0014\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0015¨\u0006\u001e"}, d2 = {"Lcom/discord/emoji_picker/EmojiPickerVisibilityTracker;", "", "Lkotlin/Function1;", "", "", "onShowNitroUpsell", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/discord/emoji_picker/EmojiPickerView;", "parent", "", "getWidth", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Lcom/discord/emoji_picker/EmojiPickerView;)I", "Landroid/view/View;", "child", ViewProps.VISIBLE, "trackViewVisibilityChanged", "(Lcom/discord/emoji_picker/EmojiPickerView;Landroid/view/View;Z)V", "Lkotlin/jvm/functions/Function1;", "trackingEnabled", "Z", "getTrackingEnabled", "()Z", "setTrackingEnabled", "(Z)V", "totalNitroSectionsVisible", "I", "previouslyVisible", "Companion", "emoji_picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EmojiPickerVisibilityTracker {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int ROWS_VISIBLE_THRESHOLD = 6;

    @NotNull
    private final Function1<Boolean, Unit> onShowNitroUpsell;
    private boolean previouslyVisible;
    private int totalNitroSectionsVisible;
    private boolean trackingEnabled;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\u0006\u001a\u00020\u0007*\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/discord/emoji_picker/EmojiPickerVisibilityTracker$Companion;", "", "<init>", "()V", "ROWS_VISIBLE_THRESHOLD", "", "isNitroSectionLocked", "", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "emoji_picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nEmojiPickerVisibilityTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmojiPickerVisibilityTracker.kt\ncom/discord/emoji_picker/EmojiPickerVisibilityTracker$Companion\n+ 2 CastUtils.kt\ncom/discord/misc/utilities/kotlin/CastUtilsKt\n*L\n1#1,52:1\n8#2:53\n*S KotlinDebug\n*F\n+ 1 EmojiPickerVisibilityTracker.kt\ncom/discord/emoji_picker/EmojiPickerVisibilityTracker$Companion\n*L\n49#1:53\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isNitroSectionLocked(@NotNull RecyclerView.ViewHolder viewHolder) {
            Intrinsics.checkNotNullParameter(viewHolder, "<this>");
            if (!(viewHolder instanceof EmojiPickerViewHolder)) {
                viewHolder = null;
            }
            EmojiPickerViewHolder emojiPickerViewHolder = (EmojiPickerViewHolder) viewHolder;
            return emojiPickerViewHolder != null && EmojiPickerViewHolder.INSTANCE.isNitroLocked(emojiPickerViewHolder);
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EmojiPickerVisibilityTracker(@NotNull Function1<? super Boolean, Unit> onShowNitroUpsell) {
        Intrinsics.checkNotNullParameter(onShowNitroUpsell, "onShowNitroUpsell");
        this.onShowNitroUpsell = onShowNitroUpsell;
    }

    private final int getWidth(RecyclerView.ViewHolder viewHolder, EmojiPickerView emojiPickerView) {
        return viewHolder instanceof EmojiPickerViewHolder.Emoji ? ((EmojiPickerViewHolder.Emoji) viewHolder).getWidth() : emojiPickerView.getWidth();
    }

    public final boolean getTrackingEnabled() {
        return this.trackingEnabled;
    }

    public final void setTrackingEnabled(boolean z5) {
        this.trackingEnabled = z5;
    }

    public final void trackViewVisibilityChanged(@NotNull EmojiPickerView parent, @NotNull View child, boolean visible) {
        int width;
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        if (this.trackingEnabled) {
            RecyclerView.ViewHolder childViewHolder = parent.getChildViewHolder(child);
            Companion companion = INSTANCE;
            Intrinsics.checkNotNull(childViewHolder);
            boolean zIsNitroSectionLocked = companion.isNitroSectionLocked(childViewHolder);
            if (zIsNitroSectionLocked && visible) {
                width = getWidth(childViewHolder, parent);
            } else {
                width = (!zIsNitroSectionLocked || visible) ? 0 : -getWidth(childViewHolder, parent);
            }
            int iMax = Math.max(0, this.totalNitroSectionsVisible + width);
            this.totalNitroSectionsVisible = iMax;
            boolean z5 = iMax >= parent.getWidth() * 6;
            if (this.previouslyVisible != z5) {
                this.onShowNitroUpsell.invoke(Boolean.valueOf(z5));
                this.previouslyVisible = z5;
            }
        }
    }
}
