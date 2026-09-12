package com.discord.chat.presentation.root;

import android.content.Context;
import androidx.lifecycle.r0;
import com.discord.chat.presentation.events.CreateChatReactEventsKt;
import com.discord.chat.presentation.list.ChatListView;
import com.discord.chat.reactevents.ChatViewEventHandler;
import com.discord.reactevents.ReactEvents;
import com.discord.recycler_view.scroller.Scroller;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.viewmanagers.DCDChatManagerDelegate;
import com.facebook.react.viewmanagers.DCDChatManagerInterface;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@ReactModule(name = ChatViewManager.NAME)
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000 92\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u00019B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u001e\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00000\u00000\u0007H\u0014J\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0014J\u0014\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00130\u0012H\u0016J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u001f\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0002\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0002\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0002\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0002\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\rH\u0016J\u001f\u0010 \u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0002\u0010\"J\u001a\u0010#\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\rH\u0016J\"\u0010$\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\r2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J0\u0010(\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010)\u001a\u00020!2\u0006\u0010*\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u00182\u0006\u0010,\u001a\u00020!H\u0016J\u0018\u0010-\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u0018H\u0016J(\u0010.\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010)\u001a\u00020!2\u0006\u0010*\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u0018H\u0016JL\u0010/\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\b\u00100\u001a\u0004\u0018\u00010\r2\u0006\u00101\u001a\u00020\u00182\b\u00102\u001a\u0004\u0018\u00010\r2\u0006\u00103\u001a\u00020!2\u0006\u00104\u001a\u00020\u00182\u0006\u00105\u001a\u00020\u00182\u0006\u00106\u001a\u00020\u0018H\u0016J\u0018\u00107\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u00103\u001a\u00020!H\u0016J\u0010\u00108\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0002H\u0016R*\u0010\u0006\u001a\u001e\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00000\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lcom/discord/chat/presentation/root/ChatViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/discord/chat/presentation/root/ChatView;", "Lcom/facebook/react/viewmanagers/DCDChatManagerInterface;", "<init>", "()V", "delegate", "Lcom/facebook/react/viewmanagers/DCDChatManagerDelegate;", "kotlin.jvm.PlatformType", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "getDelegate", "getName", "", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getExportedCustomDirectEventTypeConstants", "", "", "setInverted", "", "view", "inverted", "", "setAnimateEmoji", "value", "(Lcom/discord/chat/presentation/root/ChatView;Ljava/lang/Boolean;)V", "setHACK_fixModalInteraction", "setAdjustContentOffsetWithBounds", "setAlwaysRespectKeyboard", "setRoleStyle", "setKeyboardBackgroundColor", "", "(Lcom/discord/chat/presentation/root/ChatView;Ljava/lang/Integer;)V", "setChannelId", "receiveCommand", "commandId", "args", "Lcom/facebook/react/bridge/ReadableArray;", ChatViewManager.COMMAND_SCROLL_TO, "index", "animated", "highlight", ViewProps.POSITION, ChatViewManager.COMMAND_SCROLL_TO_BOTTOM, ChatViewManager.COMMAND_SCROLL_INTO_VIEW, "updateRows", "rowsJSON", "isLoadingAtTop", "scrollDataJSON", "changesetUpdateId", "HACK_iOSForceAnimations", "forceReload", "isAnimated", "clearRows", "fadeIn", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ChatViewManager extends ViewGroupManager<ChatView> implements DCDChatManagerInterface<ChatView> {

    @NotNull
    private static final String COMMAND_SCROLL_INTO_VIEW = "scrollIntoView";

    @NotNull
    private static final String COMMAND_SCROLL_TO = "scrollTo";

    @NotNull
    private static final String COMMAND_SCROLL_TO_BOTTOM = "scrollToBottom";

    @NotNull
    public static final String NAME = "DCDChat";

    @NotNull
    private final DCDChatManagerDelegate<ChatView, ChatViewManager> delegate;

    @NotNull
    private final ReactEvents reactEvents;

    /* JADX WARN: Multi-variable type inference failed */
    public ChatViewManager() {
        super(null, 1, 0 == true ? 1 : 0);
        this.delegate = new DCDChatManagerDelegate<>(this);
        this.reactEvents = CreateChatReactEventsKt.createChatReactEvents();
    }

    @Override // com.facebook.react.viewmanagers.DCDChatManagerInterface
    public void clearRows(@NotNull ChatView view, int changesetUpdateId) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.facebook.react.viewmanagers.DCDChatManagerInterface
    public void fadeIn(@NotNull ChatView view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return this.reactEvents.exportEventConstants();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.viewmanagers.DCDChatManagerInterface
    public void setAdjustContentOffsetWithBounds(@NotNull ChatView view, Boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.facebook.react.viewmanagers.DCDChatManagerInterface
    public void setAlwaysRespectKeyboard(@NotNull ChatView view, Boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.facebook.react.viewmanagers.DCDChatManagerInterface
    public void setAnimateEmoji(@NotNull ChatView view, Boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.facebook.react.viewmanagers.DCDChatManagerInterface
    public void setChannelId(@NotNull ChatView view, String value) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.facebook.react.viewmanagers.DCDChatManagerInterface
    public void setHACK_fixModalInteraction(@NotNull ChatView view, Boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.facebook.react.viewmanagers.DCDChatManagerInterface
    public void setKeyboardBackgroundColor(@NotNull ChatView view, Integer value) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.facebook.react.viewmanagers.DCDChatManagerInterface
    public void setRoleStyle(@NotNull ChatView view, String value) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.facebook.react.viewmanagers.DCDChatManagerInterface
    public void updateRows(@NotNull ChatView view, String rowsJSON, boolean isLoadingAtTop, String scrollDataJSON, int changesetUpdateId, boolean HACK_iOSForceAnimations, boolean forceReload, boolean isAnimated) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ChatView createViewInstance(@NotNull ThemedReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        ChatView chatView = new ChatView(reactContext);
        Context context = chatView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        chatView.setEventHandler(new ChatViewEventHandler(context, this.reactEvents, new r0(18, chatView)));
        return chatView;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public DCDChatManagerDelegate<ChatView, ChatViewManager> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(@NotNull ChatView view, @NotNull String commandId, ReadableArray args) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(commandId, "commandId");
        int iHashCode = commandId.hashCode();
        if (iHashCode == -938100109) {
            if (commandId.equals(COMMAND_SCROLL_TO_BOTTOM) && args != null) {
                scrollToBottom(view, args.getBoolean(0));
                return;
            }
            return;
        }
        if (iHashCode != -402165208) {
            if (iHashCode == 1908871954 && commandId.equals(COMMAND_SCROLL_INTO_VIEW) && args != null) {
                scrollIntoView(view, args.getInt(0), args.getBoolean(1), args.getBoolean(2));
            }
        } else if (commandId.equals(COMMAND_SCROLL_TO) && args != null) {
            scrollTo(view, args.getInt(0), args.getBoolean(1), args.getBoolean(2), args.getInt(3));
        }
    }

    @Override // com.facebook.react.viewmanagers.DCDChatManagerInterface
    public void scrollIntoView(@NotNull ChatView view, int index, boolean animated, boolean highlight) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.scrollTo(index, Scroller.TargetAlignment.Anywhere.INSTANCE, animated, highlight);
    }

    @Override // com.facebook.react.viewmanagers.DCDChatManagerInterface
    public void scrollTo(@NotNull ChatView view, int index, boolean animated, boolean highlight, int position) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.scrollTo(index, new Scroller.TargetAlignment.Top(ChatListView.INSTANCE.getMESSAGE_TOP_SCROLL_OFFSET_PX()), animated, highlight);
    }

    @Override // com.facebook.react.viewmanagers.DCDChatManagerInterface
    public void scrollToBottom(@NotNull ChatView view, boolean animated) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.scrollTo(0, Scroller.TargetAlignment.Anywhere.INSTANCE, animated, false);
    }

    @Override // com.facebook.react.viewmanagers.DCDChatManagerInterface
    public void setInverted(@NotNull ChatView view, boolean inverted) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setInverted(inverted);
    }
}
