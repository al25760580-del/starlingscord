package com.discord.emoji_picker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
import androidx.core.view.x0;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.rnlineargradient.LinearGradientManager;
import kotlin.Metadata;
import kotlin.collections.d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005J \u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0018\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0015H\u0002J\u0014\u0010\u001e\u001a\u00020\u0005*\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u000bH\u0002J\f\u0010 \u001a\u00020\u0005*\u00020!H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/discord/emoji_picker/EmojiPickerPremiumUpsellGradientBackground;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "context", "Landroid/content/Context;", "useTier0UpsellContent", "", "<init>", "(Landroid/content/Context;Z)V", "linearGradientColors", "", "linearGradientWidth", "", "linearGradient", "Landroid/graphics/LinearGradient;", "linearGradientPaint", "Landroid/graphics/Paint;", "attached", "setEnabled", "", ViewProps.ENABLED, "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "setUseTier0UpsellContent", "onDraw", "c", "Landroid/graphics/Canvas;", "parent", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "drawGradient", "isLastChildIndex", "index", "isInsidePremiumRoadblock", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Companion", "emoji_picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEmojiPickerPremiumUpsellGradientBackground.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmojiPickerPremiumUpsellGradientBackground.kt\ncom/discord/emoji_picker/EmojiPickerPremiumUpsellGradientBackground\n+ 2 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 4 CastUtils.kt\ncom/discord/misc/utilities/kotlin/CastUtilsKt\n*L\n1#1,129:1\n48#2:130\n1332#3,3:131\n8#4:134\n*S KotlinDebug\n*F\n+ 1 EmojiPickerPremiumUpsellGradientBackground.kt\ncom/discord/emoji_picker/EmojiPickerPremiumUpsellGradientBackground\n*L\n58#1:130\n69#1:131,3\n100#1:134\n*E\n"})
public final class EmojiPickerPremiumUpsellGradientBackground extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private boolean attached;
    private LinearGradient linearGradient;

    @NotNull
    private int[] linearGradientColors;

    @NotNull
    private final Paint linearGradientPaint;
    private int linearGradientWidth;
    private boolean useTier0UpsellContent;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\"\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0002¨\u0006\u000f"}, d2 = {"Lcom/discord/emoji_picker/EmojiPickerPremiumUpsellGradientBackground$Companion;", "", "<init>", "()V", "getColors", "", "Landroid/content/Context;", "useTier0UpsellContent", "", "createLinearGradient", "Landroid/graphics/LinearGradient;", LinearGradientManager.PROP_COLORS, "width", "", "height", "emoji_picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final LinearGradient createLinearGradient(int[] colors, int width, int height) {
            return new LinearGradient(0.0f, 0.0f, width, height, colors, (float[]) null, Shader.TileMode.CLAMP);
        }

        public static /* synthetic */ LinearGradient createLinearGradient$default(Companion companion, int[] iArr, int i7, int i10, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                i10 = 0;
            }
            return companion.createLinearGradient(iArr, i7, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int[] getColors(Context context, boolean z5) {
            return z5 ? new int[]{context.getColor(com.discord.theme.R.color.premium_tier_0_purple_for_gradients), context.getColor(com.discord.theme.R.color.premium_tier_0_blue_for_gradients)} : new int[]{context.getColor(com.discord.theme.R.color.premium_tier_2_purple_for_gradients), context.getColor(com.discord.theme.R.color.premium_tier_2_purple_for_gradients_2), context.getColor(com.discord.theme.R.color.premium_tier_2_pink_for_gradients)};
        }

        private Companion() {
        }
    }

    public EmojiPickerPremiumUpsellGradientBackground(@NotNull Context context, boolean z5) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.useTier0UpsellContent = z5;
        this.linearGradientColors = INSTANCE.getColors(context, z5);
        Paint paint = new Paint();
        paint.setAlpha(25);
        this.linearGradientPaint = paint;
    }

    private final void drawGradient(Canvas c8, RecyclerView parent) {
        int i7 = 0;
        float top = -1.0f;
        float height = -1.0f;
        for (Object obj : new x0(parent)) {
            int i10 = i7 + 1;
            if (i7 < 0) {
                d0.k();
                throw null;
            }
            View view = (View) obj;
            RecyclerView.ViewHolder childViewHolder = parent.getChildViewHolder(view);
            if (top == -1.0f) {
                Intrinsics.checkNotNull(childViewHolder);
                if (isInsidePremiumRoadblock(childViewHolder)) {
                    top = view.getTop() >= 0 ? view.getTop() : 0.0f;
                }
            } else if (height == -1.0f) {
                Intrinsics.checkNotNull(childViewHolder);
                if (!isInsidePremiumRoadblock(childViewHolder)) {
                    height = view.getTop();
                } else if (isLastChildIndex(parent, i7)) {
                    height = view.getHeight() + view.getTop();
                }
            }
            i7 = i10;
        }
        if (top < 0.0f || height < 0.0f) {
            return;
        }
        c8.drawRect(0.0f, top, parent.getWidth(), height, this.linearGradientPaint);
    }

    private final boolean isInsidePremiumRoadblock(RecyclerView.ViewHolder viewHolder) {
        if (!(viewHolder instanceof EmojiPickerViewHolder)) {
            viewHolder = null;
        }
        EmojiPickerViewHolder emojiPickerViewHolder = (EmojiPickerViewHolder) viewHolder;
        return emojiPickerViewHolder != null && EmojiPickerViewHolder.INSTANCE.isNitroLocked(emojiPickerViewHolder);
    }

    private final boolean isLastChildIndex(RecyclerView recyclerView, int i7) {
        return recyclerView.getChildCount() - 1 == i7;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(@NotNull Canvas c8, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(c8, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.onDraw(c8, parent, state);
        if (this.linearGradientWidth != parent.getWidth()) {
            int width = parent.getWidth();
            this.linearGradientWidth = width;
            LinearGradient linearGradientCreateLinearGradient$default = Companion.createLinearGradient$default(INSTANCE, this.linearGradientColors, width, 0, 4, null);
            this.linearGradient = linearGradientCreateLinearGradient$default;
            this.linearGradientPaint.setShader(linearGradientCreateLinearGradient$default);
        }
        if (parent.getChildCount() == 0) {
            return;
        }
        drawGradient(c8, parent);
    }

    public final void setEnabled(boolean enabled, @NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (!enabled) {
            recyclerView.removeItemDecoration(this);
        } else if (!this.attached) {
            recyclerView.addItemDecoration(this);
        }
        this.attached = enabled;
    }

    public final void setUseTier0UpsellContent(@NotNull Context context, boolean useTier0UpsellContent) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.useTier0UpsellContent != useTier0UpsellContent) {
            this.useTier0UpsellContent = useTier0UpsellContent;
            Companion companion = INSTANCE;
            int[] colors = companion.getColors(context, useTier0UpsellContent);
            this.linearGradientColors = colors;
            LinearGradient linearGradientCreateLinearGradient$default = Companion.createLinearGradient$default(companion, colors, this.linearGradientWidth, 0, 4, null);
            this.linearGradient = linearGradientCreateLinearGradient$default;
            this.linearGradientPaint.setShader(linearGradientCreateLinearGradient$default);
        }
    }
}
