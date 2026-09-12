package com.discord.fastest_list.android;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.presentation.message.i;
import com.discord.chat.presentation.message.viewholder.f;
import com.discord.device.views.DiscordRecyclerView;
import com.discord.fastest_list.R;
import com.discord.fastest_list.android.placeholder.FastestListPlaceholderConfig;
import com.discord.fastest_list.android.scroll.FastestListScrollListener;
import com.discord.fastest_list.android.scroll.FastestListScrollOffset;
import com.discord.misc.utilities.measure.ViewMeasureExtensionsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.recycler_view.scroll.RecyclerViewScrollLimiter;
import com.discord.recycler_view.scroller.Scroller;
import com.discord.recycler_view.utils.RecyclerViewExtensionsKt;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.NativeGestureUtil;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 v2\u00020\u0001:\u0001vB«\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012*\u0010\f\u001a&\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000b0\u000f\u0012\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000b0\u000f\u0012\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000b0\u000f\u0012\u001e\u0010\u0016\u001a\u001a\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\u0014\u00120\u0010\u0019\u001a,\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010 \u001a\u00020\u0004\u0012\u0006\u0010!\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010#J\u001f\u0010'\u001a\u00020\u000b2\u000e\b\u0002\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$H\u0003¢\u0006\u0004\b'\u0010(J'\u0010,\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0006H\u0002¢\u0006\u0004\b,\u0010-J/\u00102\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0006H\u0016¢\u0006\u0004\b2\u00103J\u001f\u00106\u001a\u00020\u00042\u0006\u00104\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u0006H\u0016¢\u0006\u0004\b6\u00107J\u0017\u0010:\u001a\u00020\u00042\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;J\u001f\u0010,\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020\u00062\u0006\u0010=\u001a\u00020\u0006H\u0016¢\u0006\u0004\b,\u0010>J\u0019\u0010A\u001a\u00020\u000b2\b\u0010@\u001a\u0004\u0018\u00010?H\u0016¢\u0006\u0004\bA\u0010BJ\u0019\u0010C\u001a\u00020\u000b2\b\u0010@\u001a\u0004\u0018\u00010?H\u0016¢\u0006\u0004\bC\u0010BJ\u0015\u0010D\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\bD\u0010EJ\u0015\u0010F\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\bF\u0010EJ\u0015\u0010G\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\bG\u0010HJ\u0015\u0010I\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\bI\u0010HJ\u0015\u0010J\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\bJ\u0010KJ\u0015\u0010L\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\bL\u0010MJ\u0015\u0010O\u001a\u00020\u000b2\u0006\u0010N\u001a\u00020\r¢\u0006\u0004\bO\u0010PJ\u0015\u0010Q\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\bQ\u0010RJ\u0015\u0010S\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u0004¢\u0006\u0004\bS\u0010HJ\u0015\u0010T\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u0004¢\u0006\u0004\bT\u0010HJ-\u0010,\u001a\u00020\u000b2\u0006\u0010U\u001a\u00020\u00062\u0006\u0010V\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0006¢\u0006\u0004\b,\u0010WJ\u0015\u0010X\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020\u0004¢\u0006\u0004\bX\u0010HJ\r\u0010Y\u001a\u00020\u000b¢\u0006\u0004\bY\u0010ZR\u0014\u0010\\\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010_\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010b\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010e\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010h\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010k\u001a\u00020j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010n\u001a\u00020m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010q\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010t\u001a\u00020s8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010u¨\u0006w"}, d2 = {"Lcom/discord/fastest_list/android/FastestListView;", "Lcom/discord/device/views/DiscordRecyclerView;", "Landroid/content/Context;", "context", "", "horizontal", "", "insetEnd", "insetStart", "keyboardDismissOnDrag", "Lkotlin/Function5;", "", "onLayout", "", "onScrollEventThrottle", "Lkotlin/Function2;", "Lcom/discord/fastest_list/android/scroll/FastestListScrollOffset$Data;", "onScroll", "onScrollBeginDrag", "onScrollEndDrag", "Lkotlin/Function3;", "Lcom/discord/fastest_list/android/FastestListSections$Entry;", "onUnexpectedItemSize", "Lkotlin/Function6;", "", "onVisibleItemsChanged", "Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholderConfig;", "placeholderConfig", "Lcom/discord/fastest_list/android/FastestListVisibleItemsTracker$RenderAhead;", "renderAhead", "Lcom/discord/fastest_list/android/FastestListSections$Versioned;", "sectionsVersioned", "showsHorizontalScrollIndicator", "showsVerticalScrollIndicator", "<init>", "(Landroid/content/Context;ZIIZLkotlin/jvm/functions/Function5;JLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function6;Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholderConfig;Lcom/discord/fastest_list/android/FastestListVisibleItemsTracker$RenderAhead;Lcom/discord/fastest_list/android/FastestListSections$Versioned;ZZ)V", "", "Lcom/discord/fastest_list/android/FastestListViewAdapter$DataChanged;", "positions", "onItemDataChanged", "(Ljava/util/List;)V", ViewProps.POSITION, "animated", ViewProps.PADDING_START, "scrollTo", "(IZI)V", ViewProps.LEFT, ViewProps.TOP, ViewProps.RIGHT, ViewProps.BOTTOM, "setPadding", "(IIII)V", "velocityX", "velocityY", "fling", "(II)Z", "Landroid/view/MotionEvent;", "e", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "x", "y", "(II)V", "Landroid/view/View;", "view", "startViewTransition", "(Landroid/view/View;)V", "endViewTransition", "setInsetEnd", "(I)V", "setInsetStart", "setHorizontal", "(Z)V", "setKeyboardDismissOnDrag", "setPlaceholderConfig", "(Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholderConfig;)V", "setRenderAhead", "(Lcom/discord/fastest_list/android/FastestListVisibleItemsTracker$RenderAhead;)V", "scrollEventThrottle", "setScrollEventThrottle", "(J)V", "setSectionsVersioned", "(Lcom/discord/fastest_list/android/FastestListSections$Versioned;)V", "setShowsHorizontalScrollIndicator", "setShowsVerticalScrollIndicator", "section", "item", "(IIZI)V", "scrollToTop", "onDrop", "()V", "Lcom/discord/fastest_list/android/FastestListInsetDecorator;", "insetDecorator", "Lcom/discord/fastest_list/android/FastestListInsetDecorator;", "Lcom/discord/fastest_list/android/FastestListSections;", "sections", "Lcom/discord/fastest_list/android/FastestListSections;", "Lcom/discord/fastest_list/android/FastestListLayoutManager;", "typedLayoutManager", "Lcom/discord/fastest_list/android/FastestListLayoutManager;", "Lcom/discord/fastest_list/android/FastestListVisibleItemsTracker;", "typedVisibleItemsTracker", "Lcom/discord/fastest_list/android/FastestListVisibleItemsTracker;", "Lcom/discord/fastest_list/android/FastestListViewAdapter;", "typedAdapter", "Lcom/discord/fastest_list/android/FastestListViewAdapter;", "Lcom/discord/recycler_view/scroller/Scroller;", "scroller", "Lcom/discord/recycler_view/scroller/Scroller;", "Lcom/discord/fastest_list/android/scroll/FastestListScrollOffset;", "scrollOffset", "Lcom/discord/fastest_list/android/scroll/FastestListScrollOffset;", "Lcom/discord/fastest_list/android/scroll/FastestListScrollListener;", "onScrollListener", "Lcom/discord/fastest_list/android/scroll/FastestListScrollListener;", "Landroid/view/View$OnLayoutChangeListener;", "onLayoutChangeListener", "Landroid/view/View$OnLayoutChangeListener;", "Companion", "fastest_list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
@SourceDebugExtension({"SMAP\nFastestListView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastestListView.kt\ncom/discord/fastest_list/android/FastestListView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,337:1\n1#2:338\n1869#3,2:339\n*S KotlinDebug\n*F\n+ 1 FastestListView.kt\ncom/discord/fastest_list/android/FastestListView\n*L\n294#1:339,2\n*E\n"})
public final class FastestListView extends DiscordRecyclerView {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final FastestListInsetDecorator insetDecorator;

    @NotNull
    private final View.OnLayoutChangeListener onLayoutChangeListener;

    @NotNull
    private final FastestListScrollListener onScrollListener;

    @NotNull
    private final FastestListScrollOffset scrollOffset;

    @NotNull
    private final Scroller scroller;

    @NotNull
    private final FastestListSections sections;

    @NotNull
    private final FastestListViewAdapter typedAdapter;

    @NotNull
    private final FastestListLayoutManager typedLayoutManager;

    @NotNull
    private final FastestListVisibleItemsTracker typedVisibleItemsTracker;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002¨\u0006\t"}, d2 = {"Lcom/discord/fastest_list/android/FastestListView$Companion;", "", "<init>", "()V", "withThemeWrapper", "Landroidx/appcompat/view/ContextThemeWrapper;", "Landroid/content/Context;", "horizontal", "", "fastest_list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ContextThemeWrapper withThemeWrapper(Context context, boolean z5) {
            return new ContextThemeWrapper(context, z5 ? R.style.fastest_list_horizontal : R.style.fastest_list);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FastestListView(@NotNull Context context, boolean z5, int i7, int i10, boolean z6, @NotNull Function5 onLayout, long j, @NotNull Function2<? super FastestListView, ? super FastestListScrollOffset.Data, Unit> onScroll, @NotNull Function2<? super FastestListView, ? super FastestListScrollOffset.Data, Unit> onScrollBeginDrag, @NotNull Function2<? super FastestListView, ? super FastestListScrollOffset.Data, Unit> onScrollEndDrag, @NotNull Function3 onUnexpectedItemSize, @NotNull final Function6 onVisibleItemsChanged, @NotNull FastestListPlaceholderConfig placeholderConfig, @NotNull FastestListVisibleItemsTracker.RenderAhead renderAhead, @NotNull FastestListSections.Versioned sectionsVersioned, boolean z7, boolean z10) {
        super(INSTANCE.withThemeWrapper(context, z5));
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onLayout, "onLayout");
        Intrinsics.checkNotNullParameter(onScroll, "onScroll");
        Intrinsics.checkNotNullParameter(onScrollBeginDrag, "onScrollBeginDrag");
        Intrinsics.checkNotNullParameter(onScrollEndDrag, "onScrollEndDrag");
        Intrinsics.checkNotNullParameter(onUnexpectedItemSize, "onUnexpectedItemSize");
        Intrinsics.checkNotNullParameter(onVisibleItemsChanged, "onVisibleItemsChanged");
        Intrinsics.checkNotNullParameter(placeholderConfig, "placeholderConfig");
        Intrinsics.checkNotNullParameter(renderAhead, "renderAhead");
        Intrinsics.checkNotNullParameter(sectionsVersioned, "sectionsVersioned");
        FastestListInsetDecorator fastestListInsetDecorator = new FastestListInsetDecorator(z5, i7, i10);
        this.insetDecorator = fastestListInsetDecorator;
        FastestListSections fastestListSections = new FastestListSections(sectionsVersioned);
        this.sections = fastestListSections;
        FastestListLayoutManager fastestListLayoutManager = new FastestListLayoutManager(renderAhead, context, z5, false, 8, null);
        this.typedLayoutManager = fastestListLayoutManager;
        FastestListVisibleItemsTracker fastestListVisibleItemsTracker = new FastestListVisibleItemsTracker(fastestListLayoutManager, fastestListSections, new Function5() { // from class: com.discord.fastest_list.android.a
            @Override // kotlin.jvm.functions.Function5
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                int iIntValue = ((Integer) obj2).intValue();
                int iIntValue2 = ((Integer) obj3).intValue();
                int iIntValue3 = ((Integer) obj4).intValue();
                int iIntValue4 = ((Integer) obj5).intValue();
                return FastestListView.typedVisibleItemsTracker$lambda$0(onVisibleItemsChanged, this, (String) obj, iIntValue, iIntValue2, iIntValue3, iIntValue4);
            }
        });
        this.typedVisibleItemsTracker = fastestListVisibleItemsTracker;
        FastestListViewAdapter fastestListViewAdapter = new FastestListViewAdapter(fastestListLayoutManager, placeholderConfig, fastestListSections, new i(3, onUnexpectedItemSize, this));
        this.typedAdapter = fastestListViewAdapter;
        this.scroller = new Scroller(this);
        this.scrollOffset = new FastestListScrollOffset(fastestListLayoutManager, fastestListSections);
        FastestListScrollListener fastestListScrollListener = new FastestListScrollListener(z6, j, new f(1, this, onScroll), new com.discord.age_assurance.a(this, onScrollBeginDrag, onScrollEndDrag, 7), fastestListLayoutManager, fastestListVisibleItemsTracker);
        this.onScrollListener = fastestListScrollListener;
        View.OnLayoutChangeListener aVar = new com.discord.chat.presentation.root.a(2, this, onLayout);
        this.onLayoutChangeListener = aVar;
        setHasFixedSize(true);
        RecyclerViewExtensionsKt.setReactNativeClipToPadding(this);
        setItemAnimator(null);
        setLayoutManager(fastestListLayoutManager);
        setAdapter(fastestListViewAdapter);
        setHorizontalScrollBarEnabled(z7);
        setVerticalScrollBarEnabled(z10);
        setScrollBarStyle(33554432);
        getRecycledViewPool().setMaxRecycledViews(0, 50);
        addItemDecoration(fastestListInsetDecorator);
        addOnScrollListener(fastestListScrollListener);
        addOnLayoutChangeListener(aVar);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    private final void onItemDataChanged(List<FastestListViewAdapter.DataChanged> positions) {
        if (positions.isEmpty()) {
            this.typedAdapter.notifyDataSetChanged();
        } else {
            for (FastestListViewAdapter.DataChanged dataChanged : positions) {
                int iComponent1 = dataChanged.getPosition();
                int iComponent2 = dataChanged.getCount();
                if (iComponent2 == 1) {
                    this.typedAdapter.notifyItemChanged(iComponent1);
                } else {
                    this.typedAdapter.notifyItemRangeChanged(iComponent1, iComponent2);
                }
            }
        }
        ViewMeasureExtensionsKt.measureAndLayout(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void onItemDataChanged$default(FastestListView fastestListView, List list, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            list = n0.f14659d;
        }
        fastestListView.onItemDataChanged(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onLayoutChangeListener$lambda$4(FastestListView fastestListView, Function5 function5, View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        int i17 = i11 - i7;
        int i18 = i12 - i10;
        if (fastestListView.typedLayoutManager.getHorizontal() && i17 == 0) {
            return;
        }
        if (fastestListView.typedLayoutManager.getHorizontal() || i18 != 0) {
            function5.invoke(fastestListView, Integer.valueOf(i7), Integer.valueOf(i10), Integer.valueOf(i17), Integer.valueOf(i18));
            fastestListView.typedVisibleItemsTracker.updateVisibleItemPositions();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onScrollListener$lambda$2(FastestListView fastestListView, Function2 function2, RecyclerView recyclerView, int i7, int i10) {
        Intrinsics.checkNotNullParameter(recyclerView, "<unused var>");
        FastestListScrollOffset.Data dataCompute = fastestListView.scrollOffset.compute();
        if (dataCompute != null) {
            function2.invoke(fastestListView, dataCompute);
        }
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onScrollListener$lambda$3(FastestListView fastestListView, Function2 function2, Function2 function3, boolean z5) {
        FastestListScrollOffset.Data dataCompute = fastestListView.scrollOffset.compute();
        if (dataCompute != null) {
            if (z5) {
                function2.invoke(fastestListView, dataCompute);
            } else {
                function3.invoke(fastestListView, dataCompute);
            }
        }
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit typedAdapter$lambda$1(Function3 function3, FastestListView fastestListView, FastestListSections.Entry entry, int i7) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        function3.invoke(fastestListView, entry, Integer.valueOf(i7));
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit typedVisibleItemsTracker$lambda$0(Function6 function6, FastestListView fastestListView, String sectionsId, int i7, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(sectionsId, "sectionsId");
        function6.invoke(fastestListView, sectionsId, Integer.valueOf(i7), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
        return Unit.f14616a;
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        super.endViewTransition(view);
        suppressLayout(false);
        this.typedLayoutManager.disableRecycling(false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean fling(int velocityX, int velocityY) {
        RecyclerViewScrollLimiter recyclerViewScrollLimiter = RecyclerViewScrollLimiter.INSTANCE;
        return super.fling(recyclerViewScrollLimiter.getClampedVelocity(velocityX), recyclerViewScrollLimiter.getClampedVelocity(velocityY));
    }

    public final void onDrop() {
        removeItemDecoration(this.insetDecorator);
        removeOnScrollListener(this.onScrollListener);
        removeOnLayoutChangeListener(this.onLayoutChangeListener);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        boolean zOnInterceptTouchEvent = super.onInterceptTouchEvent(e10);
        if (zOnInterceptTouchEvent) {
            NativeGestureUtil.notifyNativeGestureStarted(this, e10);
        }
        return zOnInterceptTouchEvent;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void scrollTo(int x5, int y5) {
        FastestListSections fastestListSections = this.sections;
        if (!this.typedLayoutManager.getHorizontal()) {
            x5 = y5;
        }
        scrollToPosition(fastestListSections.getItemPosition(x5));
        ViewMeasureExtensionsKt.measureAndLayout(this);
    }

    public final void scrollToTop(boolean animated) {
        scrollTo(0, animated, 0);
    }

    public final void setHorizontal(boolean horizontal) {
        if (this.typedLayoutManager.getHorizontal() != horizontal) {
            this.typedLayoutManager.setHorizontal(horizontal);
            this.insetDecorator.setHorizontal(horizontal);
            onItemDataChanged$default(this, null, 1, null);
        }
    }

    public final void setInsetEnd(int insetEnd) {
        if (this.insetDecorator.getInsetEnd() != insetEnd) {
            this.insetDecorator.setInsetEnd(insetEnd);
            onItemDataChanged$default(this, null, 1, null);
        }
    }

    public final void setInsetStart(int insetStart) {
        if (this.insetDecorator.getInsetStart() != insetStart) {
            this.insetDecorator.setInsetStart(insetStart);
            onItemDataChanged$default(this, null, 1, null);
        }
    }

    public final void setKeyboardDismissOnDrag(boolean keyboardDismissOnDrag) {
        this.onScrollListener.setKeyboardDismissOnDrag(keyboardDismissOnDrag);
    }

    @Override // android.view.View
    public void setPadding(int left, int top, int right, int bottom) {
        Integer numValueOf = Integer.valueOf(top);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        super.setPadding(left, numValueOf != null ? numValueOf.intValue() : -1, right, bottom);
    }

    public final void setPlaceholderConfig(@NotNull FastestListPlaceholderConfig placeholderConfig) {
        Intrinsics.checkNotNullParameter(placeholderConfig, "placeholderConfig");
        if (this.typedAdapter.setPlaceholderConfig(placeholderConfig)) {
            onItemDataChanged$default(this, null, 1, null);
        }
    }

    public final void setRenderAhead(@NotNull FastestListVisibleItemsTracker.RenderAhead renderAhead) {
        Intrinsics.checkNotNullParameter(renderAhead, "renderAhead");
        if (this.typedLayoutManager.getRenderAhead() != renderAhead) {
            this.typedLayoutManager.setRenderAhead(renderAhead);
            onItemDataChanged$default(this, null, 1, null);
        }
    }

    public final void setScrollEventThrottle(long scrollEventThrottle) {
        if (this.onScrollListener.getTimeoutMillis() != scrollEventThrottle) {
            this.onScrollListener.setTimeoutMillis(scrollEventThrottle);
        }
    }

    public final void setSectionsVersioned(@NotNull FastestListSections.Versioned sectionsVersioned) {
        Intrinsics.checkNotNullParameter(sectionsVersioned, "sectionsVersioned");
        if (this.sections.setSectionsVersioned(sectionsVersioned)) {
            onItemDataChanged$default(this, null, 1, null);
        }
    }

    public final void setShowsHorizontalScrollIndicator(boolean showsHorizontalScrollIndicator) {
        if (isHorizontalScrollBarEnabled() != showsHorizontalScrollIndicator) {
            setHorizontalScrollBarEnabled(showsHorizontalScrollIndicator);
        }
    }

    public final void setShowsVerticalScrollIndicator(boolean showsVerticalScrollIndicator) {
        if (isVerticalScrollBarEnabled() != showsVerticalScrollIndicator) {
            setVerticalScrollBarEnabled(showsVerticalScrollIndicator);
        }
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        this.typedLayoutManager.disableRecycling(true);
        suppressLayout(true);
        super.startViewTransition(view);
    }

    public final void scrollTo(int section, int item, boolean animated, int paddingStart) {
        Integer numM945getItemPositionjEcWkE0 = this.sections.m945getItemPositionjEcWkE0(FastestListSections.Section.m972constructorimpl(section), FastestListSections.Item.m965constructorimpl(item));
        if (numM945getItemPositionjEcWkE0 != null) {
            scrollTo(numM945getItemPositionjEcWkE0.intValue(), animated, paddingStart);
        }
    }

    private final void scrollTo(int position, boolean animated, int paddingStart) {
        Scroller.scrollToPosition$default(this.scroller, position, new Scroller.TargetAlignment.Top(SizeUtilsKt.getDpToPx(paddingStart)), animated, null, null, null, 56, null);
        ViewMeasureExtensionsKt.measureAndLayout(this);
    }
}
