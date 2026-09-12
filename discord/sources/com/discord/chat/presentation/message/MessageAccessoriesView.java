package com.discord.chat.presentation.message;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.x0;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.R;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.message.decorations.MessageAccessoriesHorizontalSpacingDecoration;
import com.discord.chat.presentation.message.decorations.ThreadSpineItemDecoration;
import com.discord.chat.presentation.message.messagepart.MessageAccessory;
import com.discord.chat.presentation.message.messagepart.MessageMargins;
import com.discord.chat.presentation.message.messagepart.ThreadEmbedMessageAccessory;
import com.discord.chat.presentation.message.view.ThreadEmbedView;
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider;
import com.discord.device.utils.IsMetaQuestKt;
import com.discord.device.views.DiscordRecyclerView;
import com.discord.primitives.GuildId;
import com.discord.reactions.ShortcutsFlexbox;
import com.discord.recycler_view.decorations.VerticalSpacingItemDecoration;
import com.discord.recycler_view.utils.TransitionResilientLinearLayoutManager;
import com.discord.theme.ThemeManagerKt;
import com.facebook.react.modules.dialog.AlertFragment;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0012\u0010\u001e\u001a\u00020\u00112\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0012\u0010!\u001a\u00020\u00112\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010\"\u001a\u00020#H\u0002J\u0010\u0010$\u001a\u00020\u00112\u0006\u0010%\u001a\u00020&H\u0016J\u0010\u0010'\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\u000bH\u0002JW\u0010)\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/2\f\u00100\u001a\b\u0012\u0004\u0012\u000202012\u0006\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u0001062\u0006\u00107\u001a\u00020\u001d¢\u0006\u0004\b8\u00109J\u0012\u0010:\u001a\u00020\u001d2\b\u0010;\u001a\u0004\u0018\u00010<H\u0017J\u0012\u0010=\u001a\u00020\u001d2\b\u0010>\u001a\u0004\u0018\u00010<H\u0016J\u0010\u0010?\u001a\u00020\u00112\b\b\u0002\u0010@\u001a\u00020\u001dR\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006A"}, d2 = {"Lcom/discord/chat/presentation/message/MessageAccessoriesView;", "Lcom/discord/device/views/DiscordRecyclerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "threadSpineDecoration", "Lcom/discord/chat/presentation/message/decorations/ThreadSpineItemDecoration;", "margins", "Lcom/discord/chat/presentation/message/messagepart/MessageMargins;", "accessoriesAdapter", "Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;", "transitionResilientLinearLayoutManager", "Lcom/discord/recycler_view/utils/TransitionResilientLinearLayoutManager;", "setRecycledViewPool", "", "pool", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "messageAccessoriesDecoration", "Lcom/discord/chat/presentation/message/decorations/MessageAccessoriesHorizontalSpacingDecoration;", "forwardBarPaint", "Landroid/graphics/Paint;", "getForwardBarPaint", "()Landroid/graphics/Paint;", "forwardBarPaint$delegate", "Lkotlin/Lazy;", "showingForwardBar", "", "startViewTransition", "view", "Landroid/view/View;", "endViewTransition", "getForwardBarHeight", "", "onDraw", "c", "Landroid/graphics/Canvas;", "updateMargins", "newMargins", "setAccessories", "messageId", "Lcom/discord/primitives/MessageId;", "channelId", "Lcom/discord/primitives/ChannelId;", "guildId", "Lcom/discord/primitives/GuildId;", AlertFragment.ARG_ITEMS, "", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "eventHandler", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "messageComponentProvider", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;", "drawForward", "setAccessories-dvvEyHs", "(Lcom/discord/chat/presentation/message/messagepart/MessageMargins;Ljava/lang/String;JLcom/discord/primitives/GuildId;Ljava/util/List;Lcom/discord/chat/presentation/events/ChatEventHandler;Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;Z)V", "onTouchEvent", "e", "Landroid/view/MotionEvent;", "onGenericMotionEvent", "event", "clear", "removeViews", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMessageAccessoriesView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageAccessoriesView.kt\ncom/discord/chat/presentation/message/MessageAccessoriesView\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,208:1\n1321#2,2:209\n1761#3,3:211\n*S KotlinDebug\n*F\n+ 1 MessageAccessoriesView.kt\ncom/discord/chat/presentation/message/MessageAccessoriesView\n*L\n106#1:209,2\n167#1:211,3\n*E\n"})
public final class MessageAccessoriesView extends DiscordRecyclerView {

    @NotNull
    private final MessageAccessoriesAdapter accessoriesAdapter;

    /* JADX INFO: renamed from: forwardBarPaint$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy forwardBarPaint;

    @NotNull
    private MessageMargins margins;

    @NotNull
    private MessageAccessoriesHorizontalSpacingDecoration messageAccessoriesDecoration;
    private boolean showingForwardBar;

    @NotNull
    private ThreadSpineItemDecoration threadSpineDecoration;

    @NotNull
    private final TransitionResilientLinearLayoutManager transitionResilientLinearLayoutManager;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MessageAccessoriesView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void clear$default(MessageAccessoriesView messageAccessoriesView, boolean z5, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z5 = true;
        }
        messageAccessoriesView.clear(z5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Paint forwardBarPaint_delegate$lambda$1() {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        return paint;
    }

    private final int getForwardBarHeight() {
        x0 x0Var = new x0(this);
        Intrinsics.checkNotNullParameter(x0Var, "<this>");
        ol.c transform = new ol.c(7);
        Intrinsics.checkNotNullParameter(x0Var, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        xq.q block = new xq.q(x0Var, transform, null);
        Intrinsics.checkNotNullParameter(block, "block");
        xq.j jVarA = xq.l.a(block);
        while (jVarA.hasNext()) {
            Pair pair = (Pair) jVarA.next();
            View view = (View) pair.f14612d;
            View view2 = (View) pair.f14613e;
            if ((view2 instanceof ShortcutsFlexbox) || (view2 instanceof ThreadEmbedView)) {
                return view.getBottom();
            }
        }
        return getHeight();
    }

    private final Paint getForwardBarPaint() {
        return (Paint) this.forwardBarPaint.getValue();
    }

    private final void updateMargins(MessageMargins newMargins) {
        if (Intrinsics.areEqual(newMargins, this.messageAccessoriesDecoration.getMargins()) && this.showingForwardBar == this.messageAccessoriesDecoration.getIsForwardedMessage()) {
            return;
        }
        this.margins = newMargins;
        removeItemDecoration(this.messageAccessoriesDecoration);
        MessageAccessoriesHorizontalSpacingDecoration messageAccessoriesHorizontalSpacingDecoration = new MessageAccessoriesHorizontalSpacingDecoration(this.margins, this.showingForwardBar);
        this.messageAccessoriesDecoration = messageAccessoriesHorizontalSpacingDecoration;
        addItemDecoration(messageAccessoriesHorizontalSpacingDecoration);
    }

    public final void clear(boolean removeViews) {
        this.accessoriesAdapter.clear();
        if (removeViews) {
            removeAllViewsInLayout();
        }
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        super.endViewTransition(view);
        suppressLayout(false);
        this.transitionResilientLinearLayoutManager.disableRecycling(false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onDraw(@NotNull Canvas c8) {
        Intrinsics.checkNotNullParameter(c8, "c");
        super.onDraw(c8);
        if (this.showingForwardBar) {
            getForwardBarPaint().setColor(ThemeManagerKt.getTheme().getBorderStrong());
            float leftMarginPx = this.margins.getLeftMarginPx();
            float leftMarginPx2 = this.margins.getLeftMarginPx();
            MessageMargins.Companion companion = MessageMargins.INSTANCE;
            c8.drawRoundRect(leftMarginPx, 0.0f, leftMarginPx2 + companion.getFORWARD_BAR_WIDTH(), getForwardBarHeight(), companion.getFORWARD_BAR_WIDTH() / 2, companion.getFORWARD_BAR_WIDTH() / 2, getForwardBarPaint());
        }
    }

    @Override // com.discord.device.views.DiscordRecyclerView, androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onGenericMotionEvent(MotionEvent event) {
        if (IsMetaQuestKt.isMetaQuest() && event != null && event.getAction() == 8) {
            return false;
        }
        return super.onGenericMotionEvent(event);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent e10) {
        super.onTouchEvent(e10);
        return false;
    }

    /* JADX INFO: renamed from: setAccessories-dvvEyHs, reason: not valid java name */
    public final void m567setAccessoriesdvvEyHs(@NotNull MessageMargins margins, @NotNull String messageId, long channelId, GuildId guildId, @NotNull List<? extends MessageAccessory> items, @NotNull ChatEventHandler eventHandler, ComponentProvider messageComponentProvider, boolean drawForward) {
        Intrinsics.checkNotNullParameter(margins, "margins");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        setItemAnimator(null);
        if (this.showingForwardBar != drawForward) {
            this.showingForwardBar = drawForward;
        }
        updateMargins(margins);
        ThreadSpineItemDecoration threadSpineItemDecoration = this.threadSpineDecoration;
        boolean z5 = false;
        if (items == null || !items.isEmpty()) {
            Iterator<T> it = items.iterator();
            while (it.hasNext()) {
                if (((MessageAccessory) it.next()) instanceof ThreadEmbedMessageAccessory) {
                    z5 = true;
                    break;
                }
            }
        }
        threadSpineItemDecoration.setShowThreadSpine(z5);
        this.accessoriesAdapter.setEventHandler(eventHandler);
        this.accessoriesAdapter.setComponentProvider(messageComponentProvider);
        this.accessoriesAdapter.m540setItemsbo5iIEc(messageId, channelId, guildId, items);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setRecycledViewPool(RecyclerView.RecycledViewPool pool) {
        super.setRecycledViewPool(pool);
        this.accessoriesAdapter.setNestedAccessoriesRecycledViewPool(pool);
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        super.startViewTransition(view);
        suppressLayout(true);
        this.transitionResilientLinearLayoutManager.disableRecycling(true);
    }

    public /* synthetic */ MessageAccessoriesView(Context context, AttributeSet attributeSet, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MessageAccessoriesView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        this.margins = new MessageMargins(resources);
        MessageAccessoriesAdapter messageAccessoriesAdapter = new MessageAccessoriesAdapter(new MessageAccessoriesView$accessoriesAdapter$1(this));
        this.accessoriesAdapter = messageAccessoriesAdapter;
        TransitionResilientLinearLayoutManager transitionResilientLinearLayoutManager = new TransitionResilientLinearLayoutManager(context, 1, false, null, 8, null);
        this.transitionResilientLinearLayoutManager = transitionResilientLinearLayoutManager;
        this.forwardBarPaint = rn.l.b(new com.discord.chat.presentation.list.f(6));
        setItemAnimator(null);
        setNestedScrollingEnabled(false);
        this.threadSpineDecoration = new ThreadSpineItemDecoration(context, this.margins.getLeftMarginPx());
        this.messageAccessoriesDecoration = new MessageAccessoriesHorizontalSpacingDecoration(this.margins, false);
        addItemDecoration(this.threadSpineDecoration);
        addItemDecoration(this.messageAccessoriesDecoration);
        Object[] objArr = 0 == true ? 1 : 0;
        addItemDecoration(new VerticalSpacingItemDecoration(getResources().getDimensionPixelSize(R.dimen.message_accessories_vertical_spacing), objArr, 0, false, 14, null));
        setLayoutManager(transitionResilientLinearLayoutManager);
        setAdapter(messageAccessoriesAdapter);
    }
}
