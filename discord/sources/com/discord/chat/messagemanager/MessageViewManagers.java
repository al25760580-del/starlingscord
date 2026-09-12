package com.discord.chat.messagemanager;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.discord.chat.bridge.Message;
import com.discord.chat.bridge.MessageBase;
import com.discord.chat.bridge.row.MessageRow;
import com.discord.chat.bridge.row.Row;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.events.CreateChatReactEventsKt;
import com.discord.chat.presentation.message.DecoratedMessageView;
import com.discord.chat.presentation.message.system.AutomodSystemMessageWrapperView;
import com.discord.chat.presentation.message.system.SystemMessageWrapperView;
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider;
import com.discord.chat.presentation.root.MessageContext;
import com.discord.chat.presentation.root.MessageContextKt;
import com.discord.chat.reactevents.ChatViewEventHandler;
import com.discord.react.utilities.SelfMeasuringViewGroupManager;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.viewmanagers.DCDAutoModerationSystemMessageViewManagerDelegate;
import com.facebook.react.viewmanagers.DCDAutoModerationSystemMessageViewManagerInterface;
import com.facebook.react.viewmanagers.DCDMessageViewManagerDelegate;
import com.facebook.react.viewmanagers.DCDMessageViewManagerInterface;
import com.facebook.react.viewmanagers.DCDSystemMessageViewManagerDelegate;
import com.facebook.react.viewmanagers.DCDSystemMessageViewManagerInterface;
import i6.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import ls.d;
import n6.e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0010\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\b\u001a\u00020\t*\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/discord/chat/messagemanager/MessageViewManagers;", "", "<init>", "()V", "json", "Lkotlinx/serialization/json/Json;", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "getEventHandler", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "Lcom/discord/chat/bridge/row/MessageRow;", "context", "Landroid/content/Context;", "convertRowJsonToMessageRow", "rowJson", "", "MessageViewManager", "SystemMessageViewManager", "AutoModerationSystemMessageViewManager", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMessageViewManagers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageViewManagers.kt\ncom/discord/chat/messagemanager/MessageViewManagers\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,166:1\n147#2:167\n*S KotlinDebug\n*F\n+ 1 MessageViewManagers.kt\ncom/discord/chat/messagemanager/MessageViewManagers\n*L\n164#1:167\n*E\n"})
public final class MessageViewManagers {

    @NotNull
    public static final MessageViewManagers INSTANCE = new MessageViewManagers();

    @NotNull
    private static final Json json = d.e(new e(17));

    @NotNull
    private static final ReactEvents reactEvents;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0018B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\t\u001a\u001e\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00000\u00000\u0007H\u0014J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0014J$\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u001a\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u000bH\u0016R*\u0010\u0006\u001a\u001e\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00000\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/discord/chat/messagemanager/MessageViewManagers$AutoModerationSystemMessageViewManager;", "Lcom/discord/react/utilities/SelfMeasuringViewGroupManager;", "Lcom/discord/chat/presentation/message/system/AutomodSystemMessageWrapperView;", "Lcom/facebook/react/viewmanagers/DCDAutoModerationSystemMessageViewManagerInterface;", "<init>", "()V", "delegate", "Lcom/facebook/react/viewmanagers/DCDAutoModerationSystemMessageViewManagerDelegate;", "kotlin.jvm.PlatformType", "getDelegate", "getName", "", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "updateState", "", "view", "props", "Lcom/facebook/react/uimanager/ReactStylesDiffMap;", "stateWrapper", "Lcom/facebook/react/uimanager/StateWrapper;", "setRow", "value", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @ReactModule(name = AutoModerationSystemMessageViewManager.NAME)
    public static final class AutoModerationSystemMessageViewManager extends SelfMeasuringViewGroupManager<AutomodSystemMessageWrapperView> implements DCDAutoModerationSystemMessageViewManagerInterface<AutomodSystemMessageWrapperView> {

        @NotNull
        public static final String NAME = "DCDAutoModerationSystemMessageView";

        @NotNull
        private final DCDAutoModerationSystemMessageViewManagerDelegate<AutomodSystemMessageWrapperView, AutoModerationSystemMessageViewManager> delegate = new DCDAutoModerationSystemMessageViewManagerDelegate<>(this);

        @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
        @NotNull
        public String getName() {
            return NAME;
        }

        @Override // com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ Object updateState(View view, ReactStylesDiffMap reactStylesDiffMap, StateWrapper stateWrapper) {
            updateState((AutomodSystemMessageWrapperView) view, reactStylesDiffMap, stateWrapper);
            return Unit.f14616a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.uimanager.ViewManager
        @NotNull
        public AutomodSystemMessageWrapperView createViewInstance(@NotNull ThemedReactContext reactContext) {
            Intrinsics.checkNotNullParameter(reactContext, "reactContext");
            return new AutomodSystemMessageWrapperView(reactContext, null, 2, 0 == true ? 1 : 0);
        }

        @Override // com.facebook.react.uimanager.ViewManager
        @NotNull
        public DCDAutoModerationSystemMessageViewManagerDelegate<AutomodSystemMessageWrapperView, AutoModerationSystemMessageViewManager> getDelegate() {
            return this.delegate;
        }

        @Override // com.facebook.react.viewmanagers.DCDAutoModerationSystemMessageViewManagerInterface
        public void setRow(@NotNull AutomodSystemMessageWrapperView view, String value) {
            Intrinsics.checkNotNullParameter(view, "view");
            if (value != null) {
                MessageViewManagers messageViewManagers = MessageViewManagers.INSTANCE;
                MessageRow messageRowConvertRowJsonToMessageRow = messageViewManagers.convertRowJsonToMessageRow(value);
                MessageBase message = messageRowConvertRowJsonToMessageRow.getMessage();
                Intrinsics.checkNotNull(message, "null cannot be cast to non-null type com.discord.chat.bridge.Message");
                MessageContext messageContext = MessageContextKt.getMessageContext(messageRowConvertRowJsonToMessageRow);
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                view.setMessage((Message) message, messageContext, messageViewManagers.getEventHandler(messageRowConvertRowJsonToMessageRow, context));
            }
        }

        public void updateState(@NotNull AutomodSystemMessageWrapperView view, ReactStylesDiffMap props, StateWrapper stateWrapper) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.getReactSelfMeasurer().applyState(stateWrapper);
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u001aB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u001e\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00000\u00000\u0007H\u0014J\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0014J$\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\rH\u0016R*\u0010\u0006\u001a\u001e\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00000\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/discord/chat/messagemanager/MessageViewManagers$MessageViewManager;", "Lcom/discord/react/utilities/SelfMeasuringViewGroupManager;", "Lcom/discord/chat/presentation/message/DecoratedMessageView;", "Lcom/facebook/react/viewmanagers/DCDMessageViewManagerInterface;", "<init>", "()V", "delegate", "Lcom/facebook/react/viewmanagers/DCDMessageViewManagerDelegate;", "kotlin.jvm.PlatformType", "componentProvider", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;", "getDelegate", "getName", "", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "updateState", "", "view", "props", "Lcom/facebook/react/uimanager/ReactStylesDiffMap;", "stateWrapper", "Lcom/facebook/react/uimanager/StateWrapper;", "setRow", "value", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @ReactModule(name = MessageViewManager.NAME)
    public static final class MessageViewManager extends SelfMeasuringViewGroupManager<DecoratedMessageView> implements DCDMessageViewManagerInterface<DecoratedMessageView> {

        @NotNull
        public static final String NAME = "DCDMessageView";
        private ComponentProvider componentProvider;

        @NotNull
        private final DCDMessageViewManagerDelegate<DecoratedMessageView, MessageViewManager> delegate = new DCDMessageViewManagerDelegate<>(this);

        @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
        @NotNull
        public String getName() {
            return NAME;
        }

        @Override // com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ Object updateState(View view, ReactStylesDiffMap reactStylesDiffMap, StateWrapper stateWrapper) {
            updateState((DecoratedMessageView) view, reactStylesDiffMap, stateWrapper);
            return Unit.f14616a;
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0018  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.uimanager.ViewManager
        @NotNull
        public DecoratedMessageView createViewInstance(@NotNull ThemedReactContext reactContext) {
            Intrinsics.checkNotNullParameter(reactContext, "reactContext");
            ComponentProvider componentProvider = this.componentProvider;
            AttributeSet attributeSet = null;
            Object[] objArr = 0;
            if (componentProvider == null) {
                this.componentProvider = new ComponentProvider(reactContext, false);
            } else {
                if (!Intrinsics.areEqual(componentProvider != null ? componentProvider.getContext() : null, reactContext)) {
                    this.componentProvider = new ComponentProvider(reactContext, false);
                }
            }
            return new DecoratedMessageView(reactContext, attributeSet, 2, objArr == true ? 1 : 0);
        }

        @Override // com.facebook.react.uimanager.ViewManager
        @NotNull
        public DCDMessageViewManagerDelegate<DecoratedMessageView, MessageViewManager> getDelegate() {
            return this.delegate;
        }

        @Override // com.facebook.react.viewmanagers.DCDMessageViewManagerInterface
        public void setRow(@NotNull DecoratedMessageView view, String value) {
            Intrinsics.checkNotNullParameter(view, "view");
            if (value != null) {
                MessageViewManagers messageViewManagers = MessageViewManagers.INSTANCE;
                MessageRow messageRowConvertRowJsonToMessageRow = messageViewManagers.convertRowJsonToMessageRow(value);
                MessageBase message = messageRowConvertRowJsonToMessageRow.getMessage();
                Intrinsics.checkNotNull(message, "null cannot be cast to non-null type com.discord.chat.bridge.Message");
                Message message2 = (Message) message;
                MessageContext messageContext = MessageContextKt.getMessageContext(messageRowConvertRowJsonToMessageRow);
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                DecoratedMessageView.setMessage$default(view, message2, messageContext, messageViewManagers.getEventHandler(messageRowConvertRowJsonToMessageRow, context), this.componentProvider, null, false, false, 112, null);
            }
        }

        public void updateState(@NotNull DecoratedMessageView view, ReactStylesDiffMap props, StateWrapper stateWrapper) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.getReactSelfMeasurer().applyState(stateWrapper);
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0018B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\t\u001a\u001e\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00000\u00000\u0007H\u0014J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0014J$\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u001a\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u000bH\u0016R*\u0010\u0006\u001a\u001e\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00000\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/discord/chat/messagemanager/MessageViewManagers$SystemMessageViewManager;", "Lcom/discord/react/utilities/SelfMeasuringViewGroupManager;", "Lcom/discord/chat/presentation/message/system/SystemMessageWrapperView;", "Lcom/facebook/react/viewmanagers/DCDSystemMessageViewManagerInterface;", "<init>", "()V", "delegate", "Lcom/facebook/react/viewmanagers/DCDSystemMessageViewManagerDelegate;", "kotlin.jvm.PlatformType", "getDelegate", "getName", "", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "updateState", "", "view", "props", "Lcom/facebook/react/uimanager/ReactStylesDiffMap;", "stateWrapper", "Lcom/facebook/react/uimanager/StateWrapper;", "setRow", "value", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @ReactModule(name = SystemMessageViewManager.NAME)
    public static final class SystemMessageViewManager extends SelfMeasuringViewGroupManager<SystemMessageWrapperView> implements DCDSystemMessageViewManagerInterface<SystemMessageWrapperView> {

        @NotNull
        public static final String NAME = "DCDSystemMessageView";

        @NotNull
        private final DCDSystemMessageViewManagerDelegate<SystemMessageWrapperView, SystemMessageViewManager> delegate = new DCDSystemMessageViewManagerDelegate<>(this);

        @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
        @NotNull
        public String getName() {
            return NAME;
        }

        @Override // com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ Object updateState(View view, ReactStylesDiffMap reactStylesDiffMap, StateWrapper stateWrapper) {
            updateState((SystemMessageWrapperView) view, reactStylesDiffMap, stateWrapper);
            return Unit.f14616a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.uimanager.ViewManager
        @NotNull
        public SystemMessageWrapperView createViewInstance(@NotNull ThemedReactContext reactContext) {
            Intrinsics.checkNotNullParameter(reactContext, "reactContext");
            return new SystemMessageWrapperView(reactContext, null, 2, 0 == true ? 1 : 0);
        }

        @Override // com.facebook.react.uimanager.ViewManager
        @NotNull
        public DCDSystemMessageViewManagerDelegate<SystemMessageWrapperView, SystemMessageViewManager> getDelegate() {
            return this.delegate;
        }

        @Override // com.facebook.react.viewmanagers.DCDSystemMessageViewManagerInterface
        public void setRow(@NotNull SystemMessageWrapperView view, String value) {
            Intrinsics.checkNotNullParameter(view, "view");
            if (value != null) {
                MessageViewManagers messageViewManagers = MessageViewManagers.INSTANCE;
                MessageRow messageRowConvertRowJsonToMessageRow = messageViewManagers.convertRowJsonToMessageRow(value);
                MessageBase message = messageRowConvertRowJsonToMessageRow.getMessage();
                Intrinsics.checkNotNull(message, "null cannot be cast to non-null type com.discord.chat.bridge.Message");
                MessageContext messageContext = MessageContextKt.getMessageContext(messageRowConvertRowJsonToMessageRow);
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                view.setMessage((Message) message, messageContext, messageViewManagers.getEventHandler(messageRowConvertRowJsonToMessageRow, context));
            }
        }

        public void updateState(@NotNull SystemMessageWrapperView view, ReactStylesDiffMap props, StateWrapper stateWrapper) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.getReactSelfMeasurer().applyState(stateWrapper);
        }
    }

    static {
        ReactEvents reactEventsCreateChatReactEvents = CreateChatReactEventsKt.createChatReactEvents();
        reactEventsCreateChatReactEvents.exportEventConstants();
        reactEvents = reactEventsCreateChatReactEvents;
    }

    private MessageViewManagers() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MessageRow convertRowJsonToMessageRow(String rowJson) {
        Json json2 = json;
        json2.getClass();
        Object objB = json2.b(Row.INSTANCE.serializer(), rowJson);
        Intrinsics.checkNotNull(objB, "null cannot be cast to non-null type com.discord.chat.bridge.row.MessageRow");
        return (MessageRow) objB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChatEventHandler getEventHandler(MessageRow messageRow, Context context) {
        return messageRow.getReactTag() != null ? new ChatViewEventHandler(context, reactEvents, new a(12, messageRow)) : ChatEventHandler.Empty.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getEventHandler$lambda$2(MessageRow messageRow) {
        return messageRow.getReactTag().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit json$lambda$0(JsonBuilder Json) {
        Intrinsics.checkNotNullParameter(Json, "$this$Json");
        Json.f14765b = true;
        return Unit.f14616a;
    }
}
