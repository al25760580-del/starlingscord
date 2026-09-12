package com.discord.emoji_picker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.core.view.x0;
import androidx.lifecycle.r0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h1;
import co.s;
import com.discord.chat.presentation.message.j;
import com.discord.crash_reporting.CrashReporting;
import com.discord.device.views.DiscordRecyclerView;
import com.discord.misc.utilities.measure.ViewMeasureExtensionsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.recycler_view.scroll.RecyclerViewScrollLimiter;
import com.discord.recycler_view.utils.RecyclerViewExtensionsKt;
import com.facebook.react.uimanager.ViewProps;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.w0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rn.l;
import rn.n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001mBý\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012 \u0010\u000f\u001a\u001c\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\n\u0012\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000e0\u0010\u0012\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000e0\u0010\u0012\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000e0\u0010\u0012 \u0010\u0015\u001a\u001c\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\n\u0012\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\u0010\u0012\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000e0\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b!\u0010 J\u001f\u0010$\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0005H\u0016¢\u0006\u0004\b$\u0010%J\u0019\u0010'\u001a\u00020\u000e2\b\u0010&\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b'\u0010 J\u0019\u0010(\u001a\u00020\u000e2\b\u0010&\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b(\u0010 J\u0015\u0010)\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b)\u0010*J\u0015\u0010+\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b+\u0010,J\u0015\u0010-\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b-\u0010,J\u0015\u0010.\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b.\u0010/J\u0015\u00102\u001a\u00020\u000e2\u0006\u00101\u001a\u000200¢\u0006\u0004\b2\u00103J\u0015\u00105\u001a\u00020\u000e2\u0006\u00104\u001a\u000200¢\u0006\u0004\b5\u00103J\u0015\u00106\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0017¢\u0006\u0004\b6\u00107J%\u0010<\u001a\u00020\u000e2\u0006\u00108\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u00172\u0006\u0010;\u001a\u00020:¢\u0006\u0004\b<\u0010=J\u0015\u0010?\u001a\u00020\u000e2\u0006\u0010>\u001a\u00020\u0017¢\u0006\u0004\b?\u00107J\u000f\u0010@\u001a\u00020\u000eH\u0007¢\u0006\u0004\b@\u0010AJ+\u0010F\u001a\u00020\u000e2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020C0B2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020C0BH\u0017¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\u0003H\u0016¢\u0006\u0004\bH\u0010IJ#\u0010L\u001a\u00020\u000e2\b\u0010J\u001a\u0004\u0018\u00010\u00052\b\u0010K\u001a\u0004\u0018\u00010\u0005H\u0003¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u00020\u000eH\u0002¢\u0006\u0004\bN\u0010AJ\u000f\u0010O\u001a\u00020\u000eH\u0002¢\u0006\u0004\bO\u0010AJ\u0017\u0010P\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u000bH\u0002¢\u0006\u0004\bP\u0010 J\u0017\u0010R\u001a\u00020\u000e2\u0006\u0010Q\u001a\u00020\u0017H\u0002¢\u0006\u0004\bR\u00107J\u0013\u0010S\u001a\u00020\u0005*\u00020CH\u0002¢\u0006\u0004\bS\u0010TR\u001b\u0010Z\u001a\u00020U8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\u001b\u0010_\u001a\u00020[8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\\\u0010W\u001a\u0004\b]\u0010^R\u0014\u0010a\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010c\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010h\u001a\u00020e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bf\u0010gR\u0014\u0010l\u001a\u00020i8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bj\u0010k¨\u0006n"}, d2 = {"Lcom/discord/emoji_picker/EmojiPickerView;", "Lcom/discord/device/views/DiscordRecyclerView;", "Lcom/discord/emoji_picker/EmojiPickerCache$Listener;", "Landroid/content/Context;", "context", "", "emojiSizeDp", "emojiMarginDp", "Lcom/discord/emoji_picker/EmojiPickerItemData$CoreData;", "coreData", "Lkotlin/Function3;", "Landroid/view/View;", "", "", "", "onPressEmoji", "Lkotlin/Function2;", "Lcom/discord/emoji_picker/EmojiPickerScroller$ScrollEvent;", "onScroll", "onScrollBeginDrag", "onScrollEndDrag", "onLongPressEmoji", "onStickyHeaderRender", "", "onShowNitroUpsell", "useTier0UpsellContent", "Lcom/discord/emoji_picker/EmojiPickerView$Config;", "config", "<init>", "(Landroid/content/Context;IILcom/discord/emoji_picker/EmojiPickerItemData$CoreData;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLcom/discord/emoji_picker/EmojiPickerView$Config;)V", "child", "onChildAttachedToWindow", "(Landroid/view/View;)V", "onChildDetachedFromWindow", "velocityX", "velocityY", "fling", "(II)Z", "view", "startViewTransition", "endViewTransition", "setConfig", "(Lcom/discord/emoji_picker/EmojiPickerView$Config;)V", "setEmojiSize", "(I)V", "setEmojiMargin", "setCoreData", "(Lcom/discord/emoji_picker/EmojiPickerItemData$CoreData;)V", "", "contentPaddingTopDp", "setContentPaddingTop", "(F)V", "contentPaddingBottomDp", "setContentPaddingBottom", "setUseTier0UpsellContent", "(Z)V", "index", "animated", "Lcom/discord/emoji_picker/EmojiPickerItem$ItemType;", "itemType", "scrollToItemAtIndex", "(IZLcom/discord/emoji_picker/EmojiPickerItem$ItemType;)V", ViewProps.ENABLED, "scrollingEnabled", "onDestroy", "()V", "", "Lcom/discord/emoji_picker/EmojiPickerItem;", "emojis", "emojisUnicode", "onEmojisUpdated", "(Ljava/util/List;Ljava/util/List;)V", "onContext", "()Landroid/content/Context;", ViewProps.POSITION, "count", "onItemsChanged", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "configureRecycledViewPool", "configureMountedChildren", "configureMountedChild", "hasPremiumInlineRoadblock", "configurePremiumUpsellGradientDecorator", "getSpanSize", "(Lcom/discord/emoji_picker/EmojiPickerItem;)I", "Lcom/discord/emoji_picker/EmojiPickerVisibilityTracker;", "visibilityTracker$delegate", "Lkotlin/Lazy;", "getVisibilityTracker", "()Lcom/discord/emoji_picker/EmojiPickerVisibilityTracker;", "visibilityTracker", "Lcom/discord/emoji_picker/EmojiPickerScroller;", "scroller$delegate", "getScroller", "()Lcom/discord/emoji_picker/EmojiPickerScroller;", "scroller", "Lcom/discord/emoji_picker/EmojiPickerPremiumUpsellGradientBackground;", "premiumUpsellGradientDecoration", "Lcom/discord/emoji_picker/EmojiPickerPremiumUpsellGradientBackground;", "isInViewTransition", "Z", "Lcom/discord/emoji_picker/EmojiPickerViewAdapter;", "getTypedAdapter", "()Lcom/discord/emoji_picker/EmojiPickerViewAdapter;", "typedAdapter", "Lcom/discord/emoji_picker/EmojiPickerLayoutManager;", "getTypedLayoutManager", "()Lcom/discord/emoji_picker/EmojiPickerLayoutManager;", "typedLayoutManager", "Config", "emoji_picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
public final class EmojiPickerView extends DiscordRecyclerView implements EmojiPickerCache.Listener {
    private boolean isInViewTransition;

    @NotNull
    private final EmojiPickerPremiumUpsellGradientBackground premiumUpsellGradientDecoration;

    /* JADX INFO: renamed from: scroller$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy scroller;

    /* JADX INFO: renamed from: visibilityTracker$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy visibilityTracker;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/discord/emoji_picker/EmojiPickerView$Config;", "", "animateEmoji", "", "scrollFastOptimizationEnabled", "scrollFastVelocity", "", "disableAnimationsOnScroll", "<init>", "(ZZIZ)V", "getAnimateEmoji", "()Z", "getScrollFastOptimizationEnabled", "getScrollFastVelocity", "()I", "getDisableAnimationsOnScroll", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "Companion", "emoji_picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Config {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private final boolean animateEmoji;
        private final boolean disableAnimationsOnScroll;
        private final boolean scrollFastOptimizationEnabled;
        private final int scrollFastVelocity;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/discord/emoji_picker/EmojiPickerView$Config$Companion;", "", "<init>", "()V", "emoji_picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        public Config(boolean z5, boolean z6, int i7, boolean z7) {
            this.animateEmoji = z5;
            this.scrollFastOptimizationEnabled = z6;
            this.scrollFastVelocity = i7;
            this.disableAnimationsOnScroll = z7;
        }

        public static /* synthetic */ Config copy$default(Config config, boolean z5, boolean z6, int i7, boolean z7, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z5 = config.animateEmoji;
            }
            if ((i10 & 2) != 0) {
                z6 = config.scrollFastOptimizationEnabled;
            }
            if ((i10 & 4) != 0) {
                i7 = config.scrollFastVelocity;
            }
            if ((i10 & 8) != 0) {
                z7 = config.disableAnimationsOnScroll;
            }
            return config.copy(z5, z6, i7, z7);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getAnimateEmoji() {
            return this.animateEmoji;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getScrollFastOptimizationEnabled() {
            return this.scrollFastOptimizationEnabled;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getScrollFastVelocity() {
            return this.scrollFastVelocity;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getDisableAnimationsOnScroll() {
            return this.disableAnimationsOnScroll;
        }

        @NotNull
        public final Config copy(boolean animateEmoji, boolean scrollFastOptimizationEnabled, int scrollFastVelocity, boolean disableAnimationsOnScroll) {
            return new Config(animateEmoji, scrollFastOptimizationEnabled, scrollFastVelocity, disableAnimationsOnScroll);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Config)) {
                return false;
            }
            Config config = (Config) other;
            return this.animateEmoji == config.animateEmoji && this.scrollFastOptimizationEnabled == config.scrollFastOptimizationEnabled && this.scrollFastVelocity == config.scrollFastVelocity && this.disableAnimationsOnScroll == config.disableAnimationsOnScroll;
        }

        public final boolean getAnimateEmoji() {
            return this.animateEmoji;
        }

        public final boolean getDisableAnimationsOnScroll() {
            return this.disableAnimationsOnScroll;
        }

        public final boolean getScrollFastOptimizationEnabled() {
            return this.scrollFastOptimizationEnabled;
        }

        public final int getScrollFastVelocity() {
            return this.scrollFastVelocity;
        }

        public int hashCode() {
            return Boolean.hashCode(this.disableAnimationsOnScroll) + com.discord.chat.presentation.list.a.u(this.scrollFastVelocity, com.discord.chat.presentation.list.a.g(Boolean.hashCode(this.animateEmoji) * 31, 31, this.scrollFastOptimizationEnabled), 31);
        }

        @NotNull
        public String toString() {
            return "Config(animateEmoji=" + this.animateEmoji + ", scrollFastOptimizationEnabled=" + this.scrollFastOptimizationEnabled + ", scrollFastVelocity=" + this.scrollFastVelocity + ", disableAnimationsOnScroll=" + this.disableAnimationsOnScroll + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmojiPickerView(@NotNull Context context, int i7, int i10, @NotNull EmojiPickerItemData.CoreData coreData, @NotNull final Function3 onPressEmoji, @NotNull final Function2<? super EmojiPickerView, ? super EmojiPickerScroller.ScrollEvent, Unit> onScroll, @NotNull final Function2<? super EmojiPickerView, ? super EmojiPickerScroller.ScrollEvent, Unit> onScrollBeginDrag, @NotNull final Function2<? super EmojiPickerView, ? super EmojiPickerScroller.ScrollEvent, Unit> onScrollEndDrag, @NotNull final Function3 onLongPressEmoji, @NotNull final Function2<? super View, ? super Integer, Unit> onStickyHeaderRender, @NotNull Function2<? super View, ? super Boolean, Unit> onShowNitroUpsell, boolean z5, @NotNull final Config config) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coreData, "coreData");
        Intrinsics.checkNotNullParameter(onPressEmoji, "onPressEmoji");
        Intrinsics.checkNotNullParameter(onScroll, "onScroll");
        Intrinsics.checkNotNullParameter(onScrollBeginDrag, "onScrollBeginDrag");
        Intrinsics.checkNotNullParameter(onScrollEndDrag, "onScrollEndDrag");
        Intrinsics.checkNotNullParameter(onLongPressEmoji, "onLongPressEmoji");
        Intrinsics.checkNotNullParameter(onStickyHeaderRender, "onStickyHeaderRender");
        Intrinsics.checkNotNullParameter(onShowNitroUpsell, "onShowNitroUpsell");
        Intrinsics.checkNotNullParameter(config, "config");
        this.visibilityTracker = l.b(new c6.a(12, onShowNitroUpsell, this));
        this.scroller = l.b(new Function0() { // from class: com.discord.emoji_picker.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EmojiPickerView.scroller_delegate$lambda$5(this.f4368d, config, onStickyHeaderRender, onScroll, onScrollBeginDrag, onScrollEndDrag);
            }
        });
        this.premiumUpsellGradientDecoration = new EmojiPickerPremiumUpsellGradientBackground(context, z5);
        setHasFixedSize(true);
        RecyclerViewExtensionsKt.setReactNativeClipToPadding(this);
        setItemAnimator(null);
        setLayoutManager(new EmojiPickerLayoutManager(context, coreData.getRowSize(), new s(10, this)));
        int dpToPx = SizeUtilsKt.getDpToPx(i7);
        int dpToPx2 = SizeUtilsKt.getDpToPx(i10);
        com.discord.chat.input.views.a aVar = new com.discord.chat.input.views.a(3, this);
        final int i11 = 0;
        Function2 function2 = new Function2() { // from class: com.discord.emoji_picker.e
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Long l6 = (Long) obj;
                String str = (String) obj2;
                switch (i11) {
                    case 0:
                        return EmojiPickerView._init_$lambda$8(onPressEmoji, this, l6, str);
                    default:
                        return EmojiPickerView._init_$lambda$9(onPressEmoji, this, l6, str);
                }
            }
        };
        final int i12 = 1;
        setAdapter(new EmojiPickerViewAdapter(coreData, dpToPx, dpToPx2, aVar, function2, new Function2() { // from class: com.discord.emoji_picker.e
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Long l6 = (Long) obj;
                String str = (String) obj2;
                switch (i12) {
                    case 0:
                        return EmojiPickerView._init_$lambda$8(onLongPressEmoji, this, l6, str);
                    default:
                        return EmojiPickerView._init_$lambda$9(onLongPressEmoji, this, l6, str);
                }
            }
        }, z5, config));
        addOnItemTouchListener(new h1(context) { // from class: com.discord.emoji_picker.EmojiPickerView.5
            private boolean hasCancelledTouch;
            private float initialY;
            private final int touchSlop;

            {
                this.touchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
            public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e10) {
                Intrinsics.checkNotNullParameter(rv, "rv");
                Intrinsics.checkNotNullParameter(e10, "e");
                int actionMasked = e10.getActionMasked();
                if (actionMasked == 0) {
                    this.initialY = e10.getY();
                    this.hasCancelledTouch = false;
                } else if (actionMasked == 2 && !this.hasCancelledTouch && Math.abs(e10.getY() - this.initialY) > this.touchSlop) {
                    this.hasCancelledTouch = true;
                    ViewParent parent = rv.getParent();
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                    MotionEvent motionEventObtain = MotionEvent.obtain(e10);
                    motionEventObtain.setAction(3);
                    Iterator it = new x0(rv).iterator();
                    while (it.hasNext()) {
                        ((View) it.next()).dispatchTouchEvent(motionEventObtain);
                    }
                    motionEventObtain.recycle();
                }
                return false;
            }
        });
        getScroller().bind();
        configurePremiumUpsellGradientDecorator(coreData.getHasPremiumInlineRoadblock());
        configureRecycledViewPool();
        getVisibilityTracker().setTrackingEnabled(coreData.getHasPremiumInlineRoadblock());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int _init_$lambda$6(EmojiPickerView emojiPickerView, int i7) {
        return emojiPickerView.getSpanSize(emojiPickerView.getTypedAdapter().getItem(i7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$7(EmojiPickerView emojiPickerView, Integer num, Integer num2) throws Exception {
        emojiPickerView.onItemsChanged(num, num2);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$8(Function3 function3, EmojiPickerView emojiPickerView, Long l6, String emojiName) {
        Intrinsics.checkNotNullParameter(emojiName, "emojiName");
        function3.invoke(emojiPickerView, l6, emojiName);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$9(Function3 function3, EmojiPickerView emojiPickerView, Long l6, String emojiName) {
        Intrinsics.checkNotNullParameter(emojiName, "emojiName");
        function3.invoke(emojiPickerView, l6, emojiName);
        return Unit.f14616a;
    }

    private final void configureMountedChild(View view) {
        RecyclerView.ViewHolder childViewHolder = getChildViewHolder(view);
        if (childViewHolder instanceof EmojiPickerViewHolder.Emoji) {
            ((EmojiPickerViewHolder.Emoji) childViewHolder).updateImage(getTypedAdapter().getScrolling(), getTypedAdapter().getScrollingFast());
        }
    }

    private final void configureMountedChildren() {
        Iterator it = new x0(this).iterator();
        while (it.hasNext()) {
            configureMountedChild((View) it.next());
        }
    }

    private final void configurePremiumUpsellGradientDecorator(boolean hasPremiumInlineRoadblock) {
        this.premiumUpsellGradientDecoration.setEnabled(hasPremiumInlineRoadblock, this);
    }

    private final void configureRecycledViewPool() {
        int spanCount = getTypedLayoutManager().getSpanCount() * 20;
        int spanCount2 = getTypedLayoutManager().getSpanCount();
        setItemViewCacheSize(spanCount / 4);
        getRecycledViewPool().setMaxRecycledViews(EmojiPickerItem.ItemType.EMOJI.ordinal(), spanCount);
        getRecycledViewPool().setMaxRecycledViews(EmojiPickerItem.ItemType.CATEGORY.ordinal(), spanCount2);
        getRecycledViewPool().setMaxRecycledViews(EmojiPickerItem.ItemType.FOOTER_UPSELL.ordinal(), 1);
    }

    private final EmojiPickerScroller getScroller() {
        return (EmojiPickerScroller) this.scroller.getValue();
    }

    private final int getSpanSize(EmojiPickerItem emojiPickerItem) {
        if ((emojiPickerItem instanceof EmojiPickerItem.EmojiPlaceholder) || (emojiPickerItem instanceof EmojiPickerItem.Emoji)) {
            return 1;
        }
        if ((emojiPickerItem instanceof EmojiPickerItem.Category) || (emojiPickerItem instanceof EmojiPickerItem.Spacer) || (emojiPickerItem instanceof EmojiPickerItem.FooterUpsell) || (emojiPickerItem instanceof EmojiPickerItem.PremiumInlineRoadblockHeader) || (emojiPickerItem instanceof EmojiPickerItem.PremiumInlineRoadblockFooter)) {
            return getTypedLayoutManager().getSpanCount();
        }
        throw new n();
    }

    private final EmojiPickerViewAdapter getTypedAdapter() {
        RecyclerView.Adapter adapter = getAdapter();
        Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.discord.emoji_picker.EmojiPickerViewAdapter");
        return (EmojiPickerViewAdapter) adapter;
    }

    private final EmojiPickerLayoutManager getTypedLayoutManager() {
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type com.discord.emoji_picker.EmojiPickerLayoutManager");
        return (EmojiPickerLayoutManager) layoutManager;
    }

    private final EmojiPickerVisibilityTracker getVisibilityTracker() {
        return (EmojiPickerVisibilityTracker) this.visibilityTracker.getValue();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    private final void onItemsChanged(Integer position, Integer count) throws Exception {
        String str;
        String string;
        String string2;
        boolean zIsComputingLayout = isComputingLayout();
        if (position == null) {
            getTypedAdapter().notifyDataSetChanged();
            str = "setChanged";
        } else if (count != null) {
            getTypedAdapter().notifyItemRangeChanged(position.intValue(), count.intValue());
            str = "rangeChanged";
        } else {
            getTypedAdapter().notifyItemChanged(position.intValue());
            str = "itemChanged";
        }
        String str2 = str;
        boolean zIsComputingLayout2 = isComputingLayout();
        try {
            ViewMeasureExtensionsKt.measureAndLayout(this);
        } catch (Exception e10) {
            CrashReporting crashReporting = CrashReporting.INSTANCE;
            Pair pair = new Pair("isInViewTransition", String.valueOf(this.isInViewTransition));
            Pair pair2 = new Pair("isAttached", String.valueOf(isAttachedToWindow()));
            Pair pair3 = new Pair("wasComputingLayoutBeforeAdapter", String.valueOf(zIsComputingLayout));
            Pair pair4 = new Pair("isComputingLayoutAfterAdapter", String.valueOf(zIsComputingLayout2));
            Pair pair5 = new Pair("isComputingLayoutNow", String.valueOf(isComputingLayout()));
            Pair pair6 = new Pair("adapterTypeChange", str2);
            String str3 = "null";
            if (position == null || (string = position.toString()) == null) {
                string = "null";
            }
            Pair pair7 = new Pair(ViewProps.POSITION, string);
            if (count != null && (string2 = count.toString()) != null) {
                str3 = string2;
            }
            CrashReporting.addBreadcrumb$default(crashReporting, "About to crash from EmojiPickerView.", w0.g(pair, pair2, pair3, pair4, pair5, pair6, pair7, new Pair("count", str3)), null, null, false, 28, null);
            throw e10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EmojiPickerScroller scroller_delegate$lambda$5(EmojiPickerView emojiPickerView, Config config, Function2 function2, Function2 function3, Function2 function4, Function2 function5) {
        return new EmojiPickerScroller(emojiPickerView, emojiPickerView.getTypedAdapter(), emojiPickerView.getTypedLayoutManager(), config.getScrollFastVelocity(), new c(function3, emojiPickerView, 1), new r0(22, emojiPickerView), new j(function4, emojiPickerView, function5, 1), function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit scroller_delegate$lambda$5$lambda$2(Function2 function2, EmojiPickerView emojiPickerView, EmojiPickerScroller.ScrollEvent scrollEvent) {
        Intrinsics.checkNotNullParameter(scrollEvent, "scrollEvent");
        function2.invoke(emojiPickerView, scrollEvent);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit scroller_delegate$lambda$5$lambda$3(EmojiPickerView emojiPickerView) {
        emojiPickerView.configureMountedChildren();
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit scroller_delegate$lambda$5$lambda$4(Function2 function2, EmojiPickerView emojiPickerView, Function2 function3, EmojiPickerScroller.ScrollEvent scrollEvent, boolean z5) {
        Intrinsics.checkNotNullParameter(scrollEvent, "scrollEvent");
        if (z5) {
            function2.invoke(emojiPickerView, scrollEvent);
        } else {
            function3.invoke(emojiPickerView, scrollEvent);
        }
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EmojiPickerVisibilityTracker visibilityTracker_delegate$lambda$1(Function2 function2, EmojiPickerView emojiPickerView) {
        return new EmojiPickerVisibilityTracker(new c(function2, emojiPickerView, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit visibilityTracker_delegate$lambda$1$lambda$0(Function2 function2, EmojiPickerView emojiPickerView, boolean z5) {
        function2.invoke(emojiPickerView, Boolean.valueOf(z5));
        return Unit.f14616a;
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        super.endViewTransition(view);
        suppressLayout(false);
        getTypedLayoutManager().disableRecycling(false);
        this.isInViewTransition = false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean fling(int velocityX, int velocityY) {
        RecyclerViewScrollLimiter recyclerViewScrollLimiter = RecyclerViewScrollLimiter.INSTANCE;
        return super.fling(recyclerViewScrollLimiter.getClampedVelocity(velocityX), recyclerViewScrollLimiter.getClampedVelocity(velocityY));
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onChildAttachedToWindow(@NotNull View child) {
        Intrinsics.checkNotNullParameter(child, "child");
        super.onChildAttachedToWindow(child);
        getVisibilityTracker().trackViewVisibilityChanged(this, child, true);
        configureMountedChild(child);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onChildDetachedFromWindow(@NotNull View child) {
        Intrinsics.checkNotNullParameter(child, "child");
        super.onChildDetachedFromWindow(child);
        getVisibilityTracker().trackViewVisibilityChanged(this, child, false);
    }

    @Override // com.discord.emoji_picker.EmojiPickerCache.Listener
    @NotNull
    public Context onContext() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return context;
    }

    public final void onDestroy() {
        getScroller().unbind();
    }

    @Override // com.discord.emoji_picker.EmojiPickerCache.Listener
    public void onEmojisUpdated(@NotNull List<? extends EmojiPickerItem> emojis, @NotNull List<? extends EmojiPickerItem> emojisUnicode) {
        Intrinsics.checkNotNullParameter(emojis, "emojis");
        Intrinsics.checkNotNullParameter(emojisUnicode, "emojisUnicode");
        getTypedAdapter().setEmojis(emojis, emojisUnicode);
    }

    public final void scrollToItemAtIndex(int index, boolean animated, @NotNull EmojiPickerItem.ItemType itemType) {
        Intrinsics.checkNotNullParameter(itemType, "itemType");
        getScroller().scrollToItemAtIndex(index, animated, itemType.ordinal());
    }

    public final void scrollingEnabled(boolean enabled) {
        getTypedLayoutManager().setScrollingEnabled(enabled);
    }

    public final void setConfig(@NotNull Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        getTypedAdapter().setConfig(config);
        getScroller().setScrollFastVelocity(config.getScrollFastVelocity());
    }

    public final void setContentPaddingBottom(float contentPaddingBottomDp) {
        getTypedAdapter().setSpacerBottomHeight(SizeUtilsKt.getDpToPx(contentPaddingBottomDp));
    }

    public final void setContentPaddingTop(float contentPaddingTopDp) {
        getTypedAdapter().setSpacerTopHeight(SizeUtilsKt.getDpToPx(contentPaddingTopDp));
    }

    public final void setCoreData(@NotNull EmojiPickerItemData.CoreData coreData) {
        Intrinsics.checkNotNullParameter(coreData, "coreData");
        getTypedAdapter().setCoreData(coreData);
        getTypedLayoutManager().setSpanCount(coreData.getRowSize());
        getVisibilityTracker().setTrackingEnabled(coreData.getHasPremiumInlineRoadblock());
        configurePremiumUpsellGradientDecorator(coreData.getHasPremiumInlineRoadblock());
        configureRecycledViewPool();
    }

    public final void setEmojiMargin(int emojiMarginDp) {
        getTypedAdapter().setEmojiMargin(SizeUtilsKt.getDpToPx(emojiMarginDp));
    }

    public final void setEmojiSize(int emojiSizeDp) {
        getTypedAdapter().setEmojiSize(SizeUtilsKt.getDpToPx(emojiSizeDp));
    }

    public final void setUseTier0UpsellContent(boolean useTier0UpsellContent) {
        getTypedAdapter().setUseTier0UpsellContent(useTier0UpsellContent);
        EmojiPickerPremiumUpsellGradientBackground emojiPickerPremiumUpsellGradientBackground = this.premiumUpsellGradientDecoration;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        emojiPickerPremiumUpsellGradientBackground.setUseTier0UpsellContent(context, useTier0UpsellContent);
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        this.isInViewTransition = true;
        getTypedLayoutManager().disableRecycling(true);
        suppressLayout(true);
        super.startViewTransition(view);
    }
}
