package com.discord.fastest_list.android.view_holder;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import co.s;
import com.discord.fastest_list.android.FastestListSections;
import com.discord.fastest_list.android.placeholder.FastestListPlaceholder;
import com.discord.fastest_list.android.placeholder.FastestListPlaceholderConfig;
import com.discord.fastest_list.android.placeholder.FastestListPlaceholderType;
import com.discord.portals.from_js.PortalFromJsContext;
import com.discord.portals.from_js.PortalFromJsContextManager;
import com.discord.portals.utils.ViewRemoveFromParentKt;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u00012\u00020\u0002:\u00015B+\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\b*\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0014\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\"\u0010!J\u000f\u0010#\u001a\u00020\bH\u0016¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0004\u001a\u00020%8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010(R\u0016\u0010)\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010.\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010*R\u0018\u00102\u001a\u000601R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u0010\u0016\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u00104R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010*\u0082\u0001\u00056789:¨\u0006;"}, d2 = {"Lcom/discord/fastest_list/android/view_holder/FastestListViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/discord/portals/from_js/PortalFromJsContext;", "Landroid/view/View;", "view", "Lkotlin/Function2;", "Lcom/discord/fastest_list/android/FastestListSections$Entry;", "", "", "onUnexpectedItemSize", "<init>", "(Landroid/view/View;Lkotlin/jvm/functions/Function2;)V", "Landroid/view/ViewGroup;", "Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholderType;", "placeholderType", "updatePlaceholder", "(Landroid/view/ViewGroup;Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholderType;)V", "itemSize", "", "horizontal", "updateLayoutParams", "(Landroid/view/View;IZ)V", "item", "Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholderConfig;", "placeholderConfig", "onBindViewHolder", "(Lcom/discord/fastest_list/android/FastestListSections$Entry;ZLcom/discord/fastest_list/android/placeholder/FastestListPlaceholderConfig;)V", "portalView", "getPortalViewIndex", "(Landroid/view/View;)I", "", "portalId", "onPortalFromJsAdded", "(Ljava/lang/String;Landroid/view/View;)V", "onPortalFromJsRemoved", "onViewRecycled", "()V", "Lcom/discord/fastest_list/android/view_holder/FastestListViewHolderView;", "Lcom/discord/fastest_list/android/view_holder/FastestListViewHolderView;", "getView", "()Lcom/discord/fastest_list/android/view_holder/FastestListViewHolderView;", "viewTransitioning", "Z", "Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholder;", "viewPlaceholder", "Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholder;", "viewPortalId", "Ljava/lang/String;", "viewPortalBound", "Lcom/discord/fastest_list/android/view_holder/FastestListViewHolder$ViewPortalSizeValidator;", "viewPortalSizeValidator", "Lcom/discord/fastest_list/android/view_holder/FastestListViewHolder$ViewPortalSizeValidator;", "Lcom/discord/fastest_list/android/FastestListSections$Entry;", "ViewPortalSizeValidator", "Lcom/discord/fastest_list/android/view_holder/FastestListViewHolderItem;", "Lcom/discord/fastest_list/android/view_holder/FastestListViewHolderListFooter;", "Lcom/discord/fastest_list/android/view_holder/FastestListViewHolderListHeader;", "Lcom/discord/fastest_list/android/view_holder/FastestListViewHolderSectionFooter;", "Lcom/discord/fastest_list/android/view_holder/FastestListViewHolderSectionHeader;", "fastest_list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFastestListViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastestListViewHolder.kt\ncom/discord/fastest_list/android/view_holder/FastestListViewHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,174:1\n327#2,4:175\n*S KotlinDebug\n*F\n+ 1 FastestListViewHolder.kt\ncom/discord/fastest_list/android/view_holder/FastestListViewHolder\n*L\n130#1:175,4\n*E\n"})
public abstract class FastestListViewHolder extends RecyclerView.ViewHolder implements PortalFromJsContext {
    private boolean horizontal;
    private FastestListSections.Entry item;

    @NotNull
    private final FastestListViewHolderView view;
    private FastestListPlaceholder viewPlaceholder;
    private boolean viewPortalBound;
    private String viewPortalId;

    @NotNull
    private final ViewPortalSizeValidator viewPortalSizeValidator;
    private boolean viewTransitioning;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0082\u0004\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJW\u0010\u0013\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R&\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/discord/fastest_list/android/view_holder/FastestListViewHolder$ViewPortalSizeValidator;", "Landroid/view/View$OnLayoutChangeListener;", "Lkotlin/Function2;", "Lcom/discord/fastest_list/android/FastestListSections$Entry;", "", "", "onUnexpectedItemSize", "<init>", "(Lcom/discord/fastest_list/android/view_holder/FastestListViewHolder;Lkotlin/jvm/functions/Function2;)V", "Landroid/view/View;", "v", ViewProps.LEFT, ViewProps.TOP, ViewProps.RIGHT, ViewProps.BOTTOM, "oldLeft", "oldTop", "oldRight", "oldBottom", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "Lkotlin/jvm/functions/Function2;", "fastest_list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class ViewPortalSizeValidator implements View.OnLayoutChangeListener {

        @NotNull
        private final Function2<FastestListSections.Entry, Integer, Unit> onUnexpectedItemSize;
        final /* synthetic */ FastestListViewHolder this$0;

        /* JADX WARN: Multi-variable type inference failed */
        public ViewPortalSizeValidator(@NotNull FastestListViewHolder fastestListViewHolder, Function2<? super FastestListSections.Entry, ? super Integer, Unit> onUnexpectedItemSize) {
            Intrinsics.checkNotNullParameter(onUnexpectedItemSize, "onUnexpectedItemSize");
            this.this$0 = fastestListViewHolder;
            this.onUnexpectedItemSize = onUnexpectedItemSize;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(@NotNull View v6, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
            Intrinsics.checkNotNullParameter(v6, "v");
            v6.removeOnLayoutChangeListener(this);
            int i7 = this.this$0.horizontal ? right - left : bottom - top;
            FastestListSections.Entry entry = this.this$0.item;
            FastestListSections.Entry entry2 = null;
            if (entry == null) {
                Intrinsics.throwUninitializedPropertyAccessException("item");
                entry = null;
            }
            if (i7 < entry.getSize() - 1) {
                FastestListSections.Entry entry3 = this.this$0.item;
                if (entry3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("item");
                    entry3 = null;
                }
                if (i7 <= entry3.getSize() + 1) {
                    return;
                }
                Function2<FastestListSections.Entry, Integer, Unit> function2 = this.onUnexpectedItemSize;
                FastestListSections.Entry entry4 = this.this$0.item;
                if (entry4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("item");
                } else {
                    entry2 = entry4;
                }
                function2.invoke(entry2, Integer.valueOf(i7));
            }
        }
    }

    public /* synthetic */ FastestListViewHolder(View view, Function2 function2, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(FastestListViewHolder fastestListViewHolder, boolean z5) {
        fastestListViewHolder.viewTransitioning = z5;
        updatePlaceholder$default(fastestListViewHolder, fastestListViewHolder.view, null, 1, null);
        return Unit.f14616a;
    }

    private final void updateLayoutParams(View view, int i7, boolean z5) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        }
        RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
        ((ViewGroup.MarginLayoutParams) layoutParams2).width = z5 ? i7 : -1;
        if (z5) {
            i7 = -1;
        }
        ((ViewGroup.MarginLayoutParams) layoutParams2).height = i7;
        view.setLayoutParams(layoutParams2);
    }

    private final void updatePlaceholder(ViewGroup viewGroup, FastestListPlaceholderType fastestListPlaceholderType) {
        FastestListPlaceholder fastestListPlaceholder;
        if (this.viewTransitioning) {
            return;
        }
        if (fastestListPlaceholderType != null) {
            FastestListPlaceholder fastestListPlaceholder2 = this.viewPlaceholder;
            FastestListPlaceholder.Companion companion = FastestListPlaceholder.INSTANCE;
            if (!Intrinsics.areEqual(fastestListPlaceholder2, companion.get(fastestListPlaceholderType))) {
                FastestListPlaceholder fastestListPlaceholder3 = this.viewPlaceholder;
                if (fastestListPlaceholder3 != null) {
                    fastestListPlaceholder3.onPlaceholderShouldUnbind(viewGroup);
                }
                this.viewPlaceholder = companion.get(fastestListPlaceholderType);
            }
        }
        if (this.viewPortalBound) {
            FastestListPlaceholder fastestListPlaceholder4 = this.viewPlaceholder;
            if (fastestListPlaceholder4 != null) {
                fastestListPlaceholder4.onPlaceholderShouldUnbind(this.view);
                return;
            }
            return;
        }
        FastestListSections.Entry entry = this.item;
        if (entry == null || (fastestListPlaceholder = this.viewPlaceholder) == null) {
            return;
        }
        FastestListViewHolderView fastestListViewHolderView = this.view;
        if (entry == null) {
            Intrinsics.throwUninitializedPropertyAccessException("item");
            entry = null;
        }
        fastestListPlaceholder.onPlaceholderShouldBind(fastestListViewHolderView, entry);
    }

    public static /* synthetic */ void updatePlaceholder$default(FastestListViewHolder fastestListViewHolder, ViewGroup viewGroup, FastestListPlaceholderType fastestListPlaceholderType, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updatePlaceholder");
        }
        if ((i7 & 1) != 0) {
            fastestListPlaceholderType = null;
        }
        fastestListViewHolder.updatePlaceholder(viewGroup, fastestListPlaceholderType);
    }

    @Override // com.discord.portals.from_js.PortalFromJsContext
    public int getPortalViewIndex(@NotNull View portalView) {
        Intrinsics.checkNotNullParameter(portalView, "portalView");
        return this.view.indexOfChild(portalView);
    }

    @NotNull
    public final FastestListViewHolderView getView() {
        return this.view;
    }

    public void onBindViewHolder(@NotNull FastestListSections.Entry item, boolean horizontal, @NotNull FastestListPlaceholderConfig placeholderConfig) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(placeholderConfig, "placeholderConfig");
        String str = this.viewPortalId;
        if (str != null && !Intrinsics.areEqual(str, item.getKey())) {
            PortalFromJsContextManager.INSTANCE.removeContext(str, this);
        }
        this.item = item;
        this.horizontal = horizontal;
        this.viewPortalId = item.getKey();
        updateLayoutParams(this.view, item.getSize(), horizontal);
        updatePlaceholder(this.view, placeholderConfig.getForEntry(item));
        PortalFromJsContextManager.INSTANCE.addContext(item.getKey(), this);
    }

    @Override // com.discord.portals.from_js.PortalFromJsContext
    public void onPortalFromJsAdded(@NotNull String portalId, @NotNull View portalView) {
        Intrinsics.checkNotNullParameter(portalId, "portalId");
        Intrinsics.checkNotNullParameter(portalView, "portalView");
        if (Intrinsics.areEqual(this.viewPortalId, portalId)) {
            this.viewPortalBound = true;
            updatePlaceholder$default(this, this.view, null, 1, null);
            if (portalView.getParent() != null) {
                ViewRemoveFromParentKt.removeFromParent(portalView);
            }
            FastestListViewHolderView fastestListViewHolderView = this.view;
            portalView.addOnLayoutChangeListener(this.viewPortalSizeValidator);
            fastestListViewHolderView.addView(portalView);
        }
    }

    @Override // com.discord.portals.from_js.PortalFromJsContext
    public void onPortalFromJsRemoved(@NotNull String portalId, @NotNull View portalView) {
        Intrinsics.checkNotNullParameter(portalId, "portalId");
        Intrinsics.checkNotNullParameter(portalView, "portalView");
        if (Intrinsics.areEqual(this.viewPortalId, portalId)) {
            this.viewPortalBound = false;
        }
        updatePlaceholder$default(this, this.view, null, 1, null);
        FastestListViewHolderView fastestListViewHolderView = this.view;
        portalView.removeOnLayoutChangeListener(this.viewPortalSizeValidator);
        fastestListViewHolderView.removeView(portalView);
    }

    public void onViewRecycled() {
        String str = this.viewPortalId;
        if (str != null) {
            PortalFromJsContextManager.INSTANCE.removeContext(str, this);
        }
        this.viewPortalId = null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private FastestListViewHolder(View view, Function2<? super FastestListSections.Entry, ? super Integer, Unit> function2) {
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        super(new FastestListViewHolderView(context));
        View view2 = this.itemView;
        Intrinsics.checkNotNull(view2, "null cannot be cast to non-null type com.discord.fastest_list.android.view_holder.FastestListViewHolderView");
        FastestListViewHolderView fastestListViewHolderView = (FastestListViewHolderView) view2;
        this.view = fastestListViewHolderView;
        this.viewPortalSizeValidator = new ViewPortalSizeValidator(this, function2);
        this.itemView.setLayoutParams(new RecyclerView.LayoutParams(-2, -2));
        fastestListViewHolderView.setOnViewTransitioning(new s(12, this));
    }
}
