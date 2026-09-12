package com.discord.chat.input.views;

import android.content.Context;
import co.s;
import com.discord.misc.utilities.measure.HeadlessViewMeasurer;
import com.discord.misc.utilities.measure.HeadlessViewMeasurerExtensionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\u0005*\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/discord/chat/input/views/ChatInputRootViewMeasurer;", "", "Lcom/discord/chat/input/views/ChatInputRootView;", "chatInputRootView", "Lkotlin/Function1;", "", "", "onHeightChanged", "<init>", "(Lcom/discord/chat/input/views/ChatInputRootView;Lkotlin/jvm/functions/Function1;)V", "emitMeasuredHeight", "()V", "measureHeight", "(Lcom/discord/chat/input/views/ChatInputRootView;)I", "", "measureWhenInitialized", "measure", "(Z)V", "Lcom/discord/chat/input/views/ChatInputRootView;", "Lkotlin/jvm/functions/Function1;", "initialized", "Z", "lineCount", "I", "chat_input_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nChatInputRootViewMeasurer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatInputRootViewMeasurer.kt\ncom/discord/chat/input/views/ChatInputRootViewMeasurer\n+ 2 HeadlessViewMeasurerExtensions.kt\ncom/discord/misc/utilities/measure/HeadlessViewMeasurerExtensionsKt\n*L\n1#1,48:1\n18#2,5:49\n*S KotlinDebug\n*F\n+ 1 ChatInputRootViewMeasurer.kt\ncom/discord/chat/input/views/ChatInputRootViewMeasurer\n*L\n41#1:49,5\n*E\n"})
public final class ChatInputRootViewMeasurer {

    @NotNull
    private final ChatInputRootView chatInputRootView;
    private boolean initialized;
    private int lineCount;

    @NotNull
    private final Function1<Integer, Unit> onHeightChanged;

    /* JADX WARN: Multi-variable type inference failed */
    public ChatInputRootViewMeasurer(@NotNull ChatInputRootView chatInputRootView, @NotNull Function1<? super Integer, Unit> onHeightChanged) {
        Intrinsics.checkNotNullParameter(chatInputRootView, "chatInputRootView");
        Intrinsics.checkNotNullParameter(onHeightChanged, "onHeightChanged");
        this.chatInputRootView = chatInputRootView;
        this.onHeightChanged = onHeightChanged;
        this.lineCount = 1;
    }

    private final void emitMeasuredHeight() {
        this.onHeightChanged.invoke(Integer.valueOf(measureHeight(this.chatInputRootView)));
    }

    private final int measureHeight(ChatInputRootView chatInputRootView) {
        Context context = chatInputRootView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return HeadlessViewMeasurerExtensionsKt.measureHeadlessView(context, ChatInputRootView.class, new s(3, this), new HeadlessViewMeasurer.MeasureBounds(Integer.valueOf(this.chatInputRootView.getWidth()), null, 2, null)).getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit measureHeight$lambda$0(ChatInputRootViewMeasurer chatInputRootViewMeasurer, ChatInputRootView it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.setMeasurementText$chat_input_release(chatInputRootViewMeasurer.chatInputRootView.textWithIconSpansForMeasurement$chat_input_release());
        return Unit.f14616a;
    }

    public final void measure(boolean measureWhenInitialized) {
        if (!this.initialized) {
            if (measureWhenInitialized) {
                this.initialized = true;
                emitMeasuredHeight();
                return;
            }
            return;
        }
        Integer lineCount = this.chatInputRootView.getLineCount();
        if (lineCount == null) {
            this.lineCount = 1;
            emitMeasuredHeight();
        } else if (this.lineCount != lineCount.intValue()) {
            this.lineCount = lineCount.intValue();
            emitMeasuredHeight();
        }
    }
}
