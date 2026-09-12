package com.discord.chat.presentation.message.system;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.lifecycle.r0;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.bridge.Message;
import com.discord.chat.databinding.DecoratedMessageViewBinding;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.list.delegate.AutomodSystemMessageDelegate;
import com.discord.chat.presentation.list.item.MessageItem;
import com.discord.chat.presentation.message.MessageView;
import com.discord.chat.presentation.message.decorations.BackgroundHighlightDrawer;
import com.discord.chat.presentation.message.decorations.HighlightedMessageDrawer;
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider;
import com.discord.chat.presentation.root.MessageContext;
import com.discord.react.utilities.ReactSelfMeasurer;
import com.discord.react.utilities.ReactSelfMeasuringView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0014J\u0010\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001bH\u0014J\u001e\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006#"}, d2 = {"Lcom/discord/chat/presentation/message/system/AutomodSystemMessageWrapperView;", "Landroid/widget/FrameLayout;", "Lcom/discord/react/utilities/ReactSelfMeasuringView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/discord/chat/databinding/DecoratedMessageViewBinding;", "highlightDrawer", "Lcom/discord/chat/presentation/message/decorations/BackgroundHighlightDrawer;", "drawHighlight", "", "reactSelfMeasurer", "Lcom/discord/react/utilities/ReactSelfMeasurer;", "getReactSelfMeasurer", "()Lcom/discord/react/utilities/ReactSelfMeasurer;", "requestLayout", "", "onMeasure", "widthMeasureSpec", "", "heightMeasureSpec", "onDraw", "canvas", "Landroid/graphics/Canvas;", "setMessage", "message", "Lcom/discord/chat/bridge/Message;", "messageContext", "Lcom/discord/chat/presentation/root/MessageContext;", "eventHandler", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AutomodSystemMessageWrapperView extends FrameLayout implements ReactSelfMeasuringView {

    @NotNull
    private final DecoratedMessageViewBinding binding;
    private boolean drawHighlight;

    @NotNull
    private final BackgroundHighlightDrawer highlightDrawer;

    @NotNull
    private final ReactSelfMeasurer reactSelfMeasurer;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AutomodSystemMessageWrapperView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChatEventHandler setMessage$lambda$0(ChatEventHandler chatEventHandler) {
        return chatEventHandler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ComponentProvider setMessage$lambda$1(ComponentProvider componentProvider) {
        return componentProvider;
    }

    @Override // com.discord.react.utilities.ReactSelfMeasuringView
    @NotNull
    public ReactSelfMeasurer getReactSelfMeasurer() {
        return this.reactSelfMeasurer;
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (this.drawHighlight) {
            HighlightedMessageDrawer.drawHighlight$default(this.highlightDrawer, canvas, this, 0, 0, 12, null);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, getReactSelfMeasurer().measureHeightSpec(heightMeasureSpec));
        getReactSelfMeasurer().publishHeight(getMeasuredHeight());
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        ReactSelfMeasurer reactSelfMeasurer = getReactSelfMeasurer();
        if (reactSelfMeasurer != null) {
            reactSelfMeasurer.onRequestLayout();
        }
    }

    public final void setMessage(@NotNull Message message, @NotNull MessageContext messageContext, @NotNull ChatEventHandler eventHandler) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(messageContext, "messageContext");
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        MessageView.setMessage$default(this.binding.messageView, message, messageContext, eventHandler, null, null, false, false, 120, null);
        a aVar = new a(eventHandler, 0);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ComponentProvider componentProvider = new ComponentProvider(context, true);
        removeAllViews();
        addView(new AutomodSystemMessageDelegate(aVar, new r0(7, componentProvider), new RecyclerView.RecycledViewPool()).createAndBindStandaloneView(this, message, messageContext), -1, -2);
        this.drawHighlight = ((Boolean) this.highlightDrawer.getShouldRenderHighlight().invoke(new MessageItem(message, messageContext, false, null, null, false, 60, null))).booleanValue();
    }

    public /* synthetic */ AutomodSystemMessageWrapperView(Context context, AttributeSet attributeSet, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutomodSystemMessageWrapperView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        DecoratedMessageViewBinding decoratedMessageViewBindingInflate = DecoratedMessageViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(decoratedMessageViewBindingInflate, "inflate(...)");
        this.binding = decoratedMessageViewBindingInflate;
        this.highlightDrawer = new BackgroundHighlightDrawer(context);
        setWillNotDraw(false);
        this.reactSelfMeasurer = new ReactSelfMeasurer(this);
    }
}
