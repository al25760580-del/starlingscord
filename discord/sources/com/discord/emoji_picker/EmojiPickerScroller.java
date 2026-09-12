package com.discord.emoji_picker;

import android.view.View;
import androidx.lifecycle.r0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.presentation.message.i;
import com.discord.misc.utilities.measure.ViewMeasureExtensionsKt;
import com.discord.recycler_view.scroll.DebouncedScrollListener;
import com.discord.recycler_view.scroll.DebouncedVelocityTrackingScrollListener;
import com.discord.recycler_view.scroller.Scroller;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000m\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006*\u00016\b\u0000\u0018\u0000 @2\u00020\u0001:\u0002A@B}\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000e\u0012\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f0\u0010\u0012\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f0\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001c\u001a\u00020\f2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f0\nH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u000b*\u00020\u0002H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\fH\u0007¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\fH\u0007¢\u0006\u0004\b$\u0010#J'\u0010(\u001a\u00020\f2\u0006\u0010%\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\bH\u0007¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010,R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010-R\u0014\u0010.\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u00109\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010;\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010:R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010?\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010-¨\u0006B"}, d2 = {"Lcom/discord/emoji_picker/EmojiPickerScroller;", "", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Lcom/discord/emoji_picker/EmojiPickerViewAdapter;", "emojiPickerViewAdapter", "Landroidx/recyclerview/widget/GridLayoutManager;", "emojiPickerLayoutManager", "", "scrollFastVelocity", "Lkotlin/Function1;", "Lcom/discord/emoji_picker/EmojiPickerScroller$ScrollEvent;", "", "onScrolled", "Lkotlin/Function0;", "onScrollStateChanged", "Lkotlin/Function2;", "", "onDragStateChanged", "Landroid/view/View;", "onStickyHeaderRender", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/discord/emoji_picker/EmojiPickerViewAdapter;Landroidx/recyclerview/widget/GridLayoutManager;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "", "velocity", "onScrollVelocityChanged", "(F)V", "onUpdate", "findFirstHeaderIndex", "(Lkotlin/jvm/functions/Function1;)V", "computeScrollEvent", "(Landroidx/recyclerview/widget/RecyclerView;)Lcom/discord/emoji_picker/EmojiPickerScroller$ScrollEvent;", "setScrollFastVelocity", "(I)V", "bind", "()V", "unbind", "index", "animated", "itemType", "scrollToItemAtIndex", "(IZI)V", "Landroidx/recyclerview/widget/RecyclerView;", "Lcom/discord/emoji_picker/EmojiPickerViewAdapter;", "Landroidx/recyclerview/widget/GridLayoutManager;", "I", "scrollEvent", "Lcom/discord/emoji_picker/EmojiPickerScroller$ScrollEvent;", "Lcom/discord/recycler_view/scroller/Scroller;", "scroller", "Lcom/discord/recycler_view/scroller/Scroller;", "Lcom/discord/recycler_view/scroll/DebouncedVelocityTrackingScrollListener;", "scrollListenerVelocityTracker", "Lcom/discord/recycler_view/scroll/DebouncedVelocityTrackingScrollListener;", "com/discord/emoji_picker/EmojiPickerScroller$scrollListenerDebounced$1", "scrollListenerDebounced", "Lcom/discord/emoji_picker/EmojiPickerScroller$scrollListenerDebounced$1;", "scrollVelocityTrackingPaused", "Z", "scrollJumpingToPosition", "Landroid/view/View$OnLayoutChangeListener;", "scrollViewLayoutChanged", "Landroid/view/View$OnLayoutChangeListener;", "firstHeaderPosition", "Companion", "ScrollEvent", "emoji_picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEmojiPickerScroller.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmojiPickerScroller.kt\ncom/discord/emoji_picker/EmojiPickerScroller\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,204:1\n1#2:205\n*E\n"})
public final class EmojiPickerScroller {
    private static final long SCROLL_DEBOUNCE_TIME = 300;
    private static final long SCROLL_VELOCITY_DEBOUNCE_TIME = 600;

    @NotNull
    private final GridLayoutManager emojiPickerLayoutManager;

    @NotNull
    private final EmojiPickerViewAdapter emojiPickerViewAdapter;
    private int firstHeaderPosition;

    @NotNull
    private final RecyclerView recyclerView;

    @NotNull
    private final ScrollEvent scrollEvent;
    private int scrollFastVelocity;
    private boolean scrollJumpingToPosition;

    @NotNull
    private final EmojiPickerScroller$scrollListenerDebounced$1 scrollListenerDebounced;

    @NotNull
    private final DebouncedVelocityTrackingScrollListener scrollListenerVelocityTracker;
    private boolean scrollVelocityTrackingPaused;

    @NotNull
    private final View.OnLayoutChangeListener scrollViewLayoutChanged;

    @NotNull
    private final Scroller scroller;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003JE\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000e¨\u0006&"}, d2 = {"Lcom/discord/emoji_picker/EmojiPickerScroller$ScrollEvent;", "", "x", "", "y", "width", "height", "contentWidth", "contentHeight", "<init>", "(IIIIII)V", "getX", "()I", "setX", "(I)V", "getY", "setY", "getWidth", "setWidth", "getHeight", "setHeight", "getContentWidth", "setContentWidth", "getContentHeight", "setContentHeight", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "", "emoji_picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ScrollEvent {
        private int contentHeight;
        private int contentWidth;
        private int height;
        private int width;
        private int x;
        private int y;

        public ScrollEvent() {
            this(0, 0, 0, 0, 0, 0, 63, null);
        }

        public static /* synthetic */ ScrollEvent copy$default(ScrollEvent scrollEvent, int i7, int i10, int i11, int i12, int i13, int i14, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                i7 = scrollEvent.x;
            }
            if ((i15 & 2) != 0) {
                i10 = scrollEvent.y;
            }
            if ((i15 & 4) != 0) {
                i11 = scrollEvent.width;
            }
            if ((i15 & 8) != 0) {
                i12 = scrollEvent.height;
            }
            if ((i15 & 16) != 0) {
                i13 = scrollEvent.contentWidth;
            }
            if ((i15 & 32) != 0) {
                i14 = scrollEvent.contentHeight;
            }
            int i16 = i13;
            int i17 = i14;
            return scrollEvent.copy(i7, i10, i11, i12, i16, i17);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getX() {
            return this.x;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getY() {
            return this.y;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getWidth() {
            return this.width;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final int getHeight() {
            return this.height;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final int getContentWidth() {
            return this.contentWidth;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final int getContentHeight() {
            return this.contentHeight;
        }

        @NotNull
        public final ScrollEvent copy(int x5, int y5, int width, int height, int contentWidth, int contentHeight) {
            return new ScrollEvent(x5, y5, width, height, contentWidth, contentHeight);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ScrollEvent)) {
                return false;
            }
            ScrollEvent scrollEvent = (ScrollEvent) other;
            return this.x == scrollEvent.x && this.y == scrollEvent.y && this.width == scrollEvent.width && this.height == scrollEvent.height && this.contentWidth == scrollEvent.contentWidth && this.contentHeight == scrollEvent.contentHeight;
        }

        public final int getContentHeight() {
            return this.contentHeight;
        }

        public final int getContentWidth() {
            return this.contentWidth;
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getWidth() {
            return this.width;
        }

        public final int getX() {
            return this.x;
        }

        public final int getY() {
            return this.y;
        }

        public int hashCode() {
            return Integer.hashCode(this.contentHeight) + com.discord.chat.presentation.list.a.u(this.contentWidth, com.discord.chat.presentation.list.a.u(this.height, com.discord.chat.presentation.list.a.u(this.width, com.discord.chat.presentation.list.a.u(this.y, Integer.hashCode(this.x) * 31, 31), 31), 31), 31);
        }

        public final void setContentHeight(int i7) {
            this.contentHeight = i7;
        }

        public final void setContentWidth(int i7) {
            this.contentWidth = i7;
        }

        public final void setHeight(int i7) {
            this.height = i7;
        }

        public final void setWidth(int i7) {
            this.width = i7;
        }

        public final void setX(int i7) {
            this.x = i7;
        }

        public final void setY(int i7) {
            this.y = i7;
        }

        @NotNull
        public String toString() {
            int i7 = this.x;
            int i10 = this.y;
            int i11 = this.width;
            int i12 = this.height;
            int i13 = this.contentWidth;
            int i14 = this.contentHeight;
            StringBuilder sbR = a3.e.r(i7, "ScrollEvent(x=", i10, ", y=", ", width=");
            a3.e.z(sbR, i11, ", height=", i12, ", contentWidth=");
            sbR.append(i13);
            sbR.append(", contentHeight=");
            sbR.append(i14);
            sbR.append(")");
            return sbR.toString();
        }

        public ScrollEvent(int i7, int i10, int i11, int i12, int i13, int i14) {
            this.x = i7;
            this.y = i10;
            this.width = i11;
            this.height = i12;
            this.contentWidth = i13;
            this.contentHeight = i14;
        }

        public /* synthetic */ ScrollEvent(int i7, int i10, int i11, int i12, int i13, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
            this((i15 & 1) != 0 ? 0 : i7, (i15 & 2) != 0 ? 0 : i10, (i15 & 4) != 0 ? 0 : i11, (i15 & 8) != 0 ? 0 : i12, (i15 & 16) != 0 ? 0 : i13, (i15 & 32) != 0 ? 0 : i14);
        }
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [com.discord.emoji_picker.EmojiPickerScroller$scrollListenerDebounced$1] */
    public EmojiPickerScroller(@NotNull RecyclerView recyclerView, @NotNull EmojiPickerViewAdapter emojiPickerViewAdapter, @NotNull GridLayoutManager emojiPickerLayoutManager, int i7, @NotNull final Function1<? super ScrollEvent, Unit> onScrolled, @NotNull Function0<Unit> onScrollStateChanged, @NotNull Function2<? super ScrollEvent, ? super Boolean, Unit> onDragStateChanged, @NotNull final Function2<? super View, ? super Integer, Unit> onStickyHeaderRender) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(emojiPickerViewAdapter, "emojiPickerViewAdapter");
        Intrinsics.checkNotNullParameter(emojiPickerLayoutManager, "emojiPickerLayoutManager");
        Intrinsics.checkNotNullParameter(onScrolled, "onScrolled");
        Intrinsics.checkNotNullParameter(onScrollStateChanged, "onScrollStateChanged");
        Intrinsics.checkNotNullParameter(onDragStateChanged, "onDragStateChanged");
        Intrinsics.checkNotNullParameter(onStickyHeaderRender, "onStickyHeaderRender");
        this.recyclerView = recyclerView;
        this.emojiPickerViewAdapter = emojiPickerViewAdapter;
        this.emojiPickerLayoutManager = emojiPickerLayoutManager;
        this.scrollFastVelocity = i7;
        this.scrollEvent = new ScrollEvent(0, 0, 0, 0, 0, 0, 63, null);
        this.scroller = new Scroller(recyclerView);
        this.scrollListenerVelocityTracker = new DebouncedVelocityTrackingScrollListener(recyclerView, false, 0, new i(2, this, onScrollStateChanged), SCROLL_VELOCITY_DEBOUNCE_TIME, 6, null);
        final Function3 function3 = new Function3() { // from class: com.discord.emoji_picker.b
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int iIntValue = ((Integer) obj2).intValue();
                int iIntValue2 = ((Integer) obj3).intValue();
                return EmojiPickerScroller.scrollListenerDebounced$lambda$2(onScrolled, this, onStickyHeaderRender, (RecyclerView) obj, iIntValue, iIntValue2);
            }
        };
        final a aVar = new a(onDragStateChanged, this, 1);
        this.scrollListenerDebounced = new DebouncedScrollListener(function3, aVar) { // from class: com.discord.emoji_picker.EmojiPickerScroller$scrollListenerDebounced$1
            {
                int i10 = 4;
                DefaultConstructorMarker defaultConstructorMarker = null;
                long j = 300;
                Function2 function2 = null;
            }

            @Override // com.discord.recycler_view.scroll.DebouncedScrollListener, androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView2, int dx, int dy) {
                Intrinsics.checkNotNullParameter(recyclerView2, "recyclerView");
                if (dx == 0 && dy == 0) {
                    return;
                }
                super.onScrolled(recyclerView2, dx, dy);
            }
        };
        this.scrollViewLayoutChanged = new com.discord.chat.presentation.root.a(1, this, onStickyHeaderRender);
        this.firstHeaderPosition = -1;
    }

    private final ScrollEvent computeScrollEvent(RecyclerView recyclerView) {
        ScrollEvent scrollEvent = this.scrollEvent;
        scrollEvent.setX(0);
        scrollEvent.setY(recyclerView.computeVerticalScrollOffset());
        scrollEvent.setWidth(recyclerView.getWidth());
        scrollEvent.setHeight(recyclerView.getHeight());
        scrollEvent.setContentWidth(recyclerView.getWidth());
        scrollEvent.setContentHeight(recyclerView.computeVerticalScrollRange());
        return scrollEvent;
    }

    private final void findFirstHeaderIndex(Function1<? super Integer, Unit> onUpdate) {
        int iFindFirstItemPositionAboveOrBelowPosition = this.emojiPickerViewAdapter.findFirstItemPositionAboveOrBelowPosition(this.emojiPickerLayoutManager.findFirstVisibleItemPosition(), EmojiPickerItem.ItemType.CATEGORY.ordinal());
        if (this.firstHeaderPosition == iFindFirstItemPositionAboveOrBelowPosition || iFindFirstItemPositionAboveOrBelowPosition == -1) {
            return;
        }
        this.firstHeaderPosition = iFindFirstItemPositionAboveOrBelowPosition;
        Integer itemIndex = this.emojiPickerViewAdapter.getItemIndex(iFindFirstItemPositionAboveOrBelowPosition);
        if (itemIndex != null) {
            onUpdate.invoke(itemIndex);
        }
    }

    private final void onScrollVelocityChanged(float velocity) {
        boolean z5 = !(velocity == 0.0f);
        boolean z6 = Math.abs(velocity) > ((float) this.scrollFastVelocity);
        if (this.emojiPickerViewAdapter.getScrolling() != z5) {
            this.emojiPickerViewAdapter.setScrolling(z5);
        }
        if (this.scrollVelocityTrackingPaused) {
            return;
        }
        if (z6) {
            this.emojiPickerViewAdapter.setScrollingFast(true);
        }
        if (!z6 && !this.scrollJumpingToPosition) {
            this.emojiPickerViewAdapter.setScrollingFast(false);
        }
        if (velocity == 0.0f) {
            this.emojiPickerViewAdapter.setScrollingFast(false);
            this.scrollJumpingToPosition = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit scrollListenerDebounced$lambda$2(Function1 function1, EmojiPickerScroller emojiPickerScroller, Function2 function2, RecyclerView recyclerView, int i7, int i10) {
        Intrinsics.checkNotNullParameter(recyclerView, "<unused var>");
        function1.invoke(emojiPickerScroller.computeScrollEvent(emojiPickerScroller.recyclerView));
        emojiPickerScroller.findFirstHeaderIndex(new a(function2, emojiPickerScroller, 0));
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit scrollListenerDebounced$lambda$2$lambda$1(Function2 function2, EmojiPickerScroller emojiPickerScroller, int i7) {
        function2.invoke(emojiPickerScroller.recyclerView, Integer.valueOf(i7));
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit scrollListenerDebounced$lambda$3(Function2 function2, EmojiPickerScroller emojiPickerScroller, boolean z5) {
        function2.invoke(emojiPickerScroller.computeScrollEvent(emojiPickerScroller.recyclerView), Boolean.valueOf(z5));
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit scrollListenerVelocityTracker$lambda$0(EmojiPickerScroller emojiPickerScroller, Function0 function0, RecyclerView recyclerView, float f2) {
        Intrinsics.checkNotNullParameter(recyclerView, "<unused var>");
        emojiPickerScroller.onScrollVelocityChanged(f2);
        function0.invoke();
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit scrollToItemAtIndex$lambda$8(EmojiPickerScroller emojiPickerScroller) {
        emojiPickerScroller.scrollVelocityTrackingPaused = false;
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scrollViewLayoutChanged$lambda$5(EmojiPickerScroller emojiPickerScroller, Function2 function2, View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        emojiPickerScroller.findFirstHeaderIndex(new a(function2, emojiPickerScroller, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit scrollViewLayoutChanged$lambda$5$lambda$4(Function2 function2, EmojiPickerScroller emojiPickerScroller, int i7) {
        function2.invoke(emojiPickerScroller.recyclerView, Integer.valueOf(i7));
        return Unit.f14616a;
    }

    public final void bind() {
        this.recyclerView.addOnLayoutChangeListener(this.scrollViewLayoutChanged);
        this.recyclerView.addOnScrollListener(this.scrollListenerDebounced);
        this.recyclerView.addOnScrollListener(this.scrollListenerVelocityTracker);
    }

    public final void scrollToItemAtIndex(int index, boolean animated, int itemType) {
        int iFindFirstVisibleItemPosition = this.emojiPickerLayoutManager.findFirstVisibleItemPosition();
        int itemPositionAtIndex = this.emojiPickerViewAdapter.getItemPositionAtIndex(index, itemType);
        if (itemPositionAtIndex == -1 || this.firstHeaderPosition == -1 || itemPositionAtIndex == iFindFirstVisibleItemPosition) {
            return;
        }
        int iAbs = Math.abs(this.emojiPickerViewAdapter.getEstimatedDistance(iFindFirstVisibleItemPosition, itemPositionAtIndex));
        int height = itemPositionAtIndex < iFindFirstVisibleItemPosition ? -this.recyclerView.getHeight() : this.recyclerView.getHeight();
        if (iAbs >= Math.abs(height)) {
            this.scrollVelocityTrackingPaused = true;
            this.emojiPickerViewAdapter.setScrollingFast(true);
            this.emojiPickerLayoutManager.scrollToPositionWithOffset(itemPositionAtIndex, height);
            Unit unit = Unit.f14616a;
            ViewMeasureExtensionsKt.measureAndLayout(this.recyclerView);
        }
        this.scrollJumpingToPosition = true;
        Scroller.scrollToPosition$default(this.scroller, itemPositionAtIndex, new Scroller.TargetAlignment.Top(0), animated, new r0(21, this), null, null, 48, null);
    }

    public final void setScrollFastVelocity(int scrollFastVelocity) {
        if (this.scrollFastVelocity != scrollFastVelocity) {
            this.scrollFastVelocity = scrollFastVelocity;
        }
    }

    public final void unbind() {
        this.recyclerView.removeOnLayoutChangeListener(this.scrollViewLayoutChanged);
        RecyclerView recyclerView = this.recyclerView;
        EmojiPickerScroller$scrollListenerDebounced$1 emojiPickerScroller$scrollListenerDebounced$1 = this.scrollListenerDebounced;
        emojiPickerScroller$scrollListenerDebounced$1.cancel();
        recyclerView.removeOnScrollListener(emojiPickerScroller$scrollListenerDebounced$1);
        this.recyclerView.removeOnScrollListener(this.scrollListenerVelocityTracker);
        this.recyclerView.setOnFlingListener(null);
    }
}
