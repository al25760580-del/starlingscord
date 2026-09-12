package com.discord.chat.input;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.Window;
import ar.u;
import com.discord.chat.input.bridge.ChatInputNode;
import com.discord.chat.input.events.OnContentSizeChangeEvent;
import com.discord.chat.input.events.OnEndBlurEvent;
import com.discord.chat.input.events.OnFocusEvent;
import com.discord.chat.input.events.OnPasteCommandEvent;
import com.discord.chat.input.events.OnPasteImageEvent;
import com.discord.chat.input.events.OnRequestSendEvent;
import com.discord.chat.input.events.OnSelectionOrTextChangeEvent;
import com.discord.chat.input.events.OnTextFlushedEvent;
import com.discord.chat.input.views.ChatInputRootView;
import com.discord.keyboard.KeyboardManager;
import com.discord.misc.utilities.keyboard.KeyboardExtensionsKt;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.viewmanagers.DCDChatInputManagerDelegate;
import com.facebook.react.viewmanagers.DCDChatInputManagerInterface;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import ls.d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 Q2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001QB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u001e\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00000\u00000\tH\u0014J\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0014J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0002H\u0016J\u0018\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001aH\u0016J\u001a\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\rH\u0016J\u001f\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0002\u0010\"J!\u0010#\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00022\b\u0010$\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0002\u0010&J\u001a\u0010'\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00022\b\u0010(\u001a\u0004\u0018\u00010\rH\u0016J\u001f\u0010)\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00022\b\u0010*\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0002\u0010\"J\u001f\u0010+\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0002\u0010,J\u0018\u0010-\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010.\u001a\u00020!H\u0016J\u001f\u0010/\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00022\b\u00100\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0002\u0010\"J\u001a\u00101\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00022\b\u00102\u001a\u0004\u0018\u00010\rH\u0016J\u001f\u00103\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0002\u0010&J\"\u00104\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u00105\u001a\u00020\r2\b\u00106\u001a\u0004\u0018\u000107H\u0016J\u001a\u00108\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00022\b\u00109\u001a\u0004\u0018\u00010\rH\u0016J\u0018\u0010:\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010;\u001a\u00020\rH\u0016J\u0010\u0010<\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0002H\u0016J\u0010\u0010=\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0002H\u0016J\u0010\u0010>\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0002H\u0016J\u0010\u0010?\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0002H\u0016J\u0010\u0010@\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0002H\u0016J\u0010\u0010A\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0002H\u0016J \u0010B\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010C\u001a\u00020!2\u0006\u0010D\u001a\u00020!H\u0016J\"\u0010E\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010F\u001a\u00020\r2\b\u0010G\u001a\u0004\u0018\u00010\rH\u0016JB\u0010H\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010C\u001a\u00020!2\u0006\u0010D\u001a\u00020!2\u0006\u00109\u001a\u00020\r2\u0006\u0010I\u001a\u00020\r2\u0006\u0010J\u001a\u00020\u001a2\b\u0010G\u001a\u0004\u0018\u00010\rH\u0016J\u0014\u0010K\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020M0LH\u0016J\u0016\u0010N\u001a\b\u0012\u0004\u0012\u00020P0O2\u0006\u0010F\u001a\u00020\rH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\b\u001a\u001e\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00000\u00000\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006R"}, d2 = {"Lcom/discord/chat/input/ChatInputViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/discord/chat/input/views/ChatInputRootView;", "Lcom/facebook/react/viewmanagers/DCDChatInputManagerInterface;", "<init>", "()V", "json", "Lkotlinx/serialization/json/Json;", "delegate", "Lcom/facebook/react/viewmanagers/DCDChatInputManagerDelegate;", "kotlin.jvm.PlatformType", "getDelegate", "getName", "", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "getReactEvents$chat_input_release", "()Lcom/discord/reactevents/ReactEvents;", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "onDropViewInstance", "", "view", "setEditable", "editable", "", "setShouldShowCursor", "shouldShowCursor", "setPlaceholder", "placeholder", "setPlaceholderColor", "placeholderColor", "", "(Lcom/discord/chat/input/views/ChatInputRootView;Ljava/lang/Integer;)V", "setMaxHeight", "value", "", "(Lcom/discord/chat/input/views/ChatInputRootView;Ljava/lang/Float;)V", "setMarkAsSpoilerTitle", "spoilerTitle", "setTextColor", "textColor", "setSetNoExtractUI", "(Lcom/discord/chat/input/views/ChatInputRootView;Ljava/lang/Boolean;)V", "setKeyboardAppearance", "keyboardAppearance", "setSelectionColor", "selectionColor", "setKeyboardType", "keyboardType", "setVerticalInset", "receiveCommand", "commandId", "args", "Lcom/facebook/react/bridge/ReadableArray;", ChatInputViewManager.COMMAND_SET_TEXT, "text", ChatInputViewManager.COMMAND_FLUSH_TEXT, "requestId", ChatInputViewManager.COMMAND_FOCUS, ChatInputViewManager.COMMAND_BLUR, ChatInputViewManager.COMMAND_OPEN_CUSTOM_KEYBOARD, ChatInputViewManager.COMMAND_CLOSE_CUSTOM_KEYBOARD, ChatInputViewManager.COMMAND_OPEN_SYSTEM_KEYBOARD, ChatInputViewManager.COMMAND_BACKSPACE, ChatInputViewManager.COMMAND_SET_SELECTED_RANGE, "location", "length", ChatInputViewManager.COMMAND_UPDATE_TEXT_BLOCKS, "blocks", "editId", ChatInputViewManager.COMMAND_REPLACE_RANGE, "styleBlocks", "keepCursorPosition", "getExportedCustomDirectEventTypeConstants", "", "", "decodeStyleBlocks", "", "Lcom/discord/chat/input/bridge/ChatInputNode;", "Companion", "chat_input_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@ReactModule(name = ChatInputViewManager.NAME)
@SourceDebugExtension({"SMAP\nChatInputViewManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatInputViewManager.kt\ncom/discord/chat/input/ChatInputViewManager\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,339:1\n147#2:340\n*S KotlinDebug\n*F\n+ 1 ChatInputViewManager.kt\ncom/discord/chat/input/ChatInputViewManager\n*L\n337#1:340\n*E\n"})
public final class ChatInputViewManager extends ViewGroupManager<ChatInputRootView> implements DCDChatInputManagerInterface<ChatInputRootView> {

    @NotNull
    private static final String COMMAND_BACKSPACE = "backspace";

    @NotNull
    private static final String COMMAND_BLUR = "blur";

    @NotNull
    private static final String COMMAND_CLOSE_CUSTOM_KEYBOARD = "closeCustomKeyboard";

    @NotNull
    private static final String COMMAND_FLUSH_TEXT = "flushText";

    @NotNull
    private static final String COMMAND_FOCUS = "focus";

    @NotNull
    private static final String COMMAND_OPEN_CUSTOM_KEYBOARD = "openCustomKeyboard";

    @NotNull
    private static final String COMMAND_OPEN_SYSTEM_KEYBOARD = "openSystemKeyboard";

    @NotNull
    private static final String COMMAND_REPLACE_RANGE = "replaceRange";

    @NotNull
    private static final String COMMAND_SET_SELECTED_RANGE = "setSelectedRange";

    @NotNull
    private static final String COMMAND_SET_TEXT = "setText";

    @NotNull
    private static final String COMMAND_UPDATE_TEXT_BLOCKS = "updateTextBlocks";

    @NotNull
    public static final String NAME = "DCDChatInput";

    @NotNull
    private final DCDChatInputManagerDelegate<ChatInputRootView, ChatInputViewManager> delegate;

    @NotNull
    private final Json json;

    @NotNull
    private final ReactEvents reactEvents;

    /* JADX WARN: Multi-variable type inference failed */
    public ChatInputViewManager() {
        super(null, 1, 0 == true ? 1 : 0);
        this.json = d.e(new u(25));
        this.delegate = new DCDChatInputManagerDelegate<>(this);
        this.reactEvents = new ReactEvents(new Pair("onChangeContentSize", Reflection.getOrCreateKotlinClass(OnContentSizeChangeEvent.class)), new Pair("onEndBlur", Reflection.getOrCreateKotlinClass(OnEndBlurEvent.class)), new Pair("onBeginFocus", Reflection.getOrCreateKotlinClass(OnFocusEvent.class)), new Pair("onSelectionOrTextChange", Reflection.getOrCreateKotlinClass(OnSelectionOrTextChangeEvent.class)), new Pair("onPasteImage", Reflection.getOrCreateKotlinClass(OnPasteImageEvent.class)), new Pair("onRequestSend", Reflection.getOrCreateKotlinClass(OnRequestSendEvent.class)), new Pair("onPasteCommand", Reflection.getOrCreateKotlinClass(OnPasteCommandEvent.class)), new Pair("onTextFlushed", Reflection.getOrCreateKotlinClass(OnTextFlushedEvent.class)));
    }

    private final List<ChatInputNode> decodeStyleBlocks(String blocks) {
        Json json = this.json;
        json.getClass();
        return (List) json.b(new or.d(ChatInputNode.INSTANCE.serializer(), 0), blocks);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit json$lambda$0(JsonBuilder Json) {
        Intrinsics.checkNotNullParameter(Json, "$this$Json");
        Json.f14765b = true;
        return Unit.f14616a;
    }

    @Override // com.facebook.react.viewmanagers.DCDChatInputManagerInterface
    public void closeCustomKeyboard(@NotNull ChatInputRootView view) {
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

    @NotNull
    /* JADX INFO: renamed from: getReactEvents$chat_input_release, reason: from getter */
    public final ReactEvents getReactEvents() {
        return this.reactEvents;
    }

    @Override // com.facebook.react.viewmanagers.DCDChatInputManagerInterface
    public void setKeyboardAppearance(@NotNull ChatInputRootView view, int keyboardAppearance) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.facebook.react.viewmanagers.DCDChatInputManagerInterface
    public void setKeyboardType(@NotNull ChatInputRootView view, String keyboardType) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.facebook.react.viewmanagers.DCDChatInputManagerInterface
    public void setMarkAsSpoilerTitle(@NotNull ChatInputRootView view, String spoilerTitle) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.facebook.react.viewmanagers.DCDChatInputManagerInterface
    public void setSelectionColor(@NotNull ChatInputRootView view, Integer selectionColor) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.facebook.react.viewmanagers.DCDChatInputManagerInterface
    public void setVerticalInset(@NotNull ChatInputRootView view, Float value) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.facebook.react.viewmanagers.DCDChatInputManagerInterface
    public void backspace(@NotNull ChatInputRootView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.backspace();
    }

    @Override // com.facebook.react.viewmanagers.DCDChatInputManagerInterface
    public void blur(@NotNull ChatInputRootView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.clearInputFocus();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ChatInputRootView createViewInstance(@NotNull final ThemedReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        final ChatInputRootView chatInputRootView = new ChatInputRootView(reactContext, null, 0, 6, null);
        chatInputRootView.setListener(new ChatInputRootView.ChatInputListener() { // from class: com.discord.chat.input.ChatInputViewManager$createViewInstance$1$1
            @Override // com.discord.chat.input.views.ChatInputRootView.ChatInputListener
            public void onCommandInserted(String data) {
                Intrinsics.checkNotNullParameter(data, "data");
                this.this$0.getReactEvents().emitEvent(reactContext, chatInputRootView, new OnPasteCommandEvent(data));
            }

            @Override // com.discord.chat.input.views.ChatInputRootView.ChatInputListener
            public void onContentSizeChange(int width, int height) {
                this.this$0.getReactEvents().emitEvent(reactContext, chatInputRootView, new OnContentSizeChangeEvent(width, height));
            }

            @Override // com.discord.chat.input.views.ChatInputRootView.ChatInputListener
            public void onEndBlur(String text) {
                Intrinsics.checkNotNullParameter(text, "text");
                this.this$0.getReactEvents().emitEvent(reactContext, chatInputRootView, new OnEndBlurEvent(text));
            }

            @Override // com.discord.chat.input.views.ChatInputRootView.ChatInputListener
            public void onFocus(int start, int end) {
                this.this$0.getReactEvents().emitEvent(reactContext, chatInputRootView, new OnFocusEvent(start, end, 0, 4, (DefaultConstructorMarker) null));
            }

            @Override // com.discord.chat.input.views.ChatInputRootView.ChatInputListener
            public void onImageInserted(Uri uri) {
                Intrinsics.checkNotNullParameter(uri, "uri");
                ReactEvents reactEvents = this.this$0.getReactEvents();
                ThemedReactContext themedReactContext = reactContext;
                ChatInputRootView chatInputRootView2 = chatInputRootView;
                String string = uri.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                reactEvents.emitEvent(themedReactContext, chatInputRootView2, new OnPasteImageEvent(string, reactContext.getContentResolver().getType(uri)));
            }

            @Override // com.discord.chat.input.views.ChatInputRootView.ChatInputListener
            public void onRequestSend() {
                this.this$0.getReactEvents().emitEvent(reactContext, chatInputRootView, new OnRequestSendEvent());
            }

            @Override // com.discord.chat.input.views.ChatInputRootView.ChatInputListener
            public void onTextOrSelectionChanged(int start, int end, String text, String editId) {
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(editId, "editId");
                this.this$0.getReactEvents().emitEvent(reactContext, chatInputRootView, new OnSelectionOrTextChangeEvent(start, end, text, editId));
            }
        });
        KeyboardManager.INSTANCE.addKeyboardListener(chatInputRootView);
        return chatInputRootView;
    }

    @Override // com.facebook.react.viewmanagers.DCDChatInputManagerInterface
    public void flushText(@NotNull ChatInputRootView view, @NotNull String requestId) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        this.reactEvents.emitEvent(view, new OnTextFlushedEvent(view.getText(), requestId));
    }

    @Override // com.facebook.react.viewmanagers.DCDChatInputManagerInterface
    public void focus(@NotNull ChatInputRootView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.requestInputFocus();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public DCDChatInputManagerDelegate<ChatInputRootView, ChatInputViewManager> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(@NotNull ChatInputRootView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        KeyboardManager.INSTANCE.removeKeyboardListener(view);
    }

    @Override // com.facebook.react.viewmanagers.DCDChatInputManagerInterface
    public void openCustomKeyboard(@NotNull ChatInputRootView view) {
        Window window;
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        Activity currentActivity = ((ReactContext) context).getCurrentActivity();
        if (currentActivity == null || (window = currentActivity.getWindow()) == null) {
            return;
        }
        KeyboardExtensionsKt.hideKeyboard(view, window);
    }

    @Override // com.facebook.react.viewmanagers.DCDChatInputManagerInterface
    public void openSystemKeyboard(@NotNull ChatInputRootView view) {
        Window window;
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        Activity currentActivity = ((ReactContext) context).getCurrentActivity();
        if (currentActivity == null || (window = currentActivity.getWindow()) == null) {
            return;
        }
        view.showKeyboard(window);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(@NotNull ChatInputRootView view, @NotNull String commandId, ReadableArray args) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(commandId, "commandId");
        switch (commandId.hashCode()) {
            case -1505238496:
                if (commandId.equals(COMMAND_SET_SELECTED_RANGE) && args != null) {
                    setSelectedRange(view, args.getInt(0), args.getInt(1));
                }
                break;
            case -1482107872:
                if (commandId.equals(COMMAND_OPEN_SYSTEM_KEYBOARD)) {
                    openSystemKeyboard(view);
                    break;
                }
                break;
            case -577056175:
                if (commandId.equals(COMMAND_FLUSH_TEXT) && args != null) {
                    String string = args.getString(0);
                    Intrinsics.checkNotNull(string);
                    flushText(view, string);
                }
                break;
            case 3027047:
                if (commandId.equals(COMMAND_BLUR)) {
                    blur(view);
                    break;
                }
                break;
            case 73995964:
                if (commandId.equals(COMMAND_UPDATE_TEXT_BLOCKS) && args != null) {
                    String string2 = args.getString(0);
                    Intrinsics.checkNotNull(string2);
                    updateTextBlocks(view, string2, args.getString(1));
                }
                break;
            case 97604824:
                if (commandId.equals(COMMAND_FOCUS)) {
                    focus(view);
                    break;
                }
                break;
            case 448538345:
                if (commandId.equals(COMMAND_REPLACE_RANGE) && args != null) {
                    int i7 = args.getInt(0);
                    int i10 = args.getInt(1);
                    String string3 = args.getString(2);
                    Intrinsics.checkNotNull(string3);
                    String string4 = args.getString(3);
                    Intrinsics.checkNotNull(string4);
                    replaceRange(view, i7, i10, string3, string4, args.getBoolean(4), args.getString(5));
                }
                break;
            case 1353507967:
                if (commandId.equals(COMMAND_BACKSPACE)) {
                    backspace(view);
                }
                break;
            case 1520339810:
                if (commandId.equals(COMMAND_OPEN_CUSTOM_KEYBOARD)) {
                    openCustomKeyboard(view);
                }
                break;
            case 1919302288:
                if (commandId.equals(COMMAND_CLOSE_CUSTOM_KEYBOARD)) {
                    closeCustomKeyboard(view);
                }
                break;
            case 1984984239:
                if (commandId.equals(COMMAND_SET_TEXT) && args != null) {
                    setText(view, args.getString(0));
                }
                break;
        }
    }

    @Override // com.facebook.react.viewmanagers.DCDChatInputManagerInterface
    public void replaceRange(@NotNull ChatInputRootView view, int location, int length, @NotNull String text, @NotNull String styleBlocks, boolean keepCursorPosition, String editId) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(styleBlocks, "styleBlocks");
        view.replaceRange(location, length, text, decodeStyleBlocks(styleBlocks), keepCursorPosition, editId);
    }

    @Override // com.facebook.react.viewmanagers.DCDChatInputManagerInterface
    public void setEditable(@NotNull ChatInputRootView view, boolean editable) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setEditTextEnabled(editable);
    }

    @Override // com.facebook.react.viewmanagers.DCDChatInputManagerInterface
    public void setMaxHeight(ChatInputRootView view, Float value) {
        if (view != null) {
            view.setContentMaxHeight(value != null ? value.floatValue() : 0.0f);
        }
    }

    @Override // com.facebook.react.viewmanagers.DCDChatInputManagerInterface
    public void setPlaceholder(@NotNull ChatInputRootView view, String placeholder) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setHint(placeholder);
    }

    @Override // com.facebook.react.viewmanagers.DCDChatInputManagerInterface
    public void setPlaceholderColor(@NotNull ChatInputRootView view, Integer placeholderColor) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (placeholderColor != null) {
            view.setHintTextColor(placeholderColor.intValue());
        }
    }

    @Override // com.facebook.react.viewmanagers.DCDChatInputManagerInterface
    public void setSelectedRange(@NotNull ChatInputRootView view, int location, int length) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setSelection(location, length + location);
    }

    @Override // com.facebook.react.viewmanagers.DCDChatInputManagerInterface
    public void setSetNoExtractUI(@NotNull ChatInputRootView view, Boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setNoExtractUI(Intrinsics.areEqual(value, Boolean.TRUE));
    }

    @Override // com.facebook.react.viewmanagers.DCDChatInputManagerInterface
    public void setShouldShowCursor(@NotNull ChatInputRootView view, boolean shouldShowCursor) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setCursorVisible(shouldShowCursor);
    }

    @Override // com.facebook.react.viewmanagers.DCDChatInputManagerInterface
    public void setText(@NotNull ChatInputRootView view, String text) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (text != null) {
            view.setText(text);
            ChatInputRootView.setSelection$default(view, text.length(), 0, 2, null);
        }
    }

    @Override // com.facebook.react.viewmanagers.DCDChatInputManagerInterface
    public void setTextColor(@NotNull ChatInputRootView view, Integer textColor) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (textColor != null) {
            view.setTextColor(textColor.intValue());
        }
    }

    @Override // com.facebook.react.viewmanagers.DCDChatInputManagerInterface
    public void updateTextBlocks(@NotNull ChatInputRootView view, @NotNull String blocks, String editId) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        if (editId == null) {
            editId = "";
        }
        view.clearAndApplyChatNodes(editId, decodeStyleBlocks(blocks));
    }
}
