package com.discord.chat.presentation.root;

import a3.e;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.ChatModule;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.list.ChatListView;
import com.discord.crash_reporting.CrashReporting;
import com.discord.misc.utilities.threading.ThreadUtilsKt;
import com.discord.recycler_view.scroller.Scroller;
import com.discord.recycler_view.utils.RecyclerViewExtensionsKt;
import com.facebook.react.views.view.ReactViewGroup;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0007J(\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000bH\u0007J\u0010\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u000fH\u0003R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/discord/chat/presentation/root/ChatView;", "Lcom/facebook/react/views/view/ReactViewGroup;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "chatList", "Lcom/discord/chat/presentation/list/ChatListView;", "eventHandler", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "inverted", "", "addView", "", "child", "Landroid/view/View;", "index", "", "params", "Landroid/view/ViewGroup$LayoutParams;", "setInverted", "setEventHandler", "scrollTo", "targetScreenLocation", "Lcom/discord/recycler_view/scroller/Scroller$TargetAlignment;", "animated", "highlight", "attachPortalViewToChatList", "portalView", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nChatView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatView.kt\ncom/discord/chat/presentation/root/ChatView\n+ 2 ThreadUtils.kt\ncom/discord/misc/utilities/threading/ThreadUtilsKt\n*L\n1#1,154:1\n17#2,5:155\n17#2,5:160\n17#2,5:165\n*S KotlinDebug\n*F\n+ 1 ChatView.kt\ncom/discord/chat/presentation/root/ChatView\n*L\n50#1:155,5\n55#1:160,5\n65#1:165,5\n*E\n"})
public final class ChatView extends ReactViewGroup {
    private static final int INDEX_CHAT_LIST = 0;
    private static final int INDEX_PORTAL_VIEW = 2;
    private ChatListView chatList;
    private ChatEventHandler eventHandler;
    private boolean inverted;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void attachPortalViewToChatList(View portalView) {
        portalView.addOnLayoutChangeListener(new a(0, portalView, this));
        portalView.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void attachPortalViewToChatList$lambda$5(View view, ChatView chatView, View view2, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        boolean z5 = view.getMeasuredHeight() > 0 && view.getMeasuredWidth() > 0;
        if (z5) {
            ChatListView chatListView = chatView.chatList;
            if (chatListView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("chatList");
                chatListView = null;
            }
            if (!chatListView.isComputingLayout()) {
                boolean z6 = (view.getMeasuredWidth() == view.getLayoutParams().width && view.getMeasuredHeight() == view.getLayoutParams().height) ? false : true;
                Pair pair = z6 ? new Pair(Integer.valueOf(view.getMeasuredWidth()), Integer.valueOf(view.getMeasuredHeight())) : null;
                CrashReporting crashReporting = CrashReporting.INSTANCE;
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                ViewParent parent = view.getParent();
                String simpleName = parent != null ? parent.getClass().getSimpleName() : null;
                StringBuilder sbR = e.r(measuredWidth, "PortalView will detach from ChatView and portal into ChatListView; measured=", measuredHeight, "x", ", hasDimChanged=");
                sbR.append(z6);
                sbR.append(", parent=");
                sbR.append(simpleName);
                CrashReporting.addBreadcrumb$default(crashReporting, sbR.toString(), null, null, null, false, 30, null);
                chatView.post(new ac.a(view, chatView, pair, 7));
                return;
            }
        }
        CrashReporting crashReporting2 = CrashReporting.INSTANCE;
        ChatListView chatListView2 = chatView.chatList;
        if (chatListView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chatList");
            chatListView2 = null;
        }
        CrashReporting.addBreadcrumb$default(crashReporting2, "PortalView layout change skipped; valid=" + z5 + ", computingLayout=" + chatListView2.isComputingLayout() + ", measured=" + view.getMeasuredWidth() + "x" + view.getMeasuredHeight(), null, null, null, false, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void attachPortalViewToChatList$lambda$5$lambda$4(View view, ChatView chatView, Pair pair) {
        ChatListView chatListView = null;
        try {
            if (view.getParent() instanceof ChatView) {
                ViewParent parent = view.getParent();
                Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) parent).removeView(view);
            }
            ChatListView chatListView2 = chatView.chatList;
            if (chatListView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("chatList");
                chatListView2 = null;
            }
            chatListView2.setPortalView(view, pair);
            CrashReporting.addBreadcrumb$default(CrashReporting.INSTANCE, "PortalView portaled into ChatListView; measuredDims=" + pair, null, null, null, false, 30, null);
        } catch (Exception unused) {
            CrashReporting crashReporting = CrashReporting.INSTANCE;
            Pair pair2 = new Pair("portalView", view.toString());
            Pair pair3 = new Pair("parent", view.getParent().toString());
            ChatListView chatListView3 = chatView.chatList;
            if (chatListView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("chatList");
            } else {
                chatListView = chatListView3;
            }
            CrashReporting.addBreadcrumb$default(crashReporting, "ChatList exception: failed to reparent portalView to ChatListView", w0.g(pair2, pair3, new Pair("chatListView", chatListView.toString())), null, null, false, 28, null);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(@NotNull View child, int index, ViewGroup.LayoutParams params) {
        Intrinsics.checkNotNullParameter(child, "child");
        super.addView(child, index, params);
        if (index != 0) {
            if (index != 2) {
                return;
            }
            attachPortalViewToChatList(child);
        } else {
            if (!(child instanceof ChatListView)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            RecyclerViewExtensionsKt.setReactNativeClipToPadding((RecyclerView) child);
            ChatListView chatListView = (ChatListView) child;
            ChatEventHandler chatEventHandler = this.eventHandler;
            if (chatEventHandler == null) {
                Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
                chatEventHandler = null;
            }
            chatListView.setEventHandler(chatEventHandler);
            chatListView.setInverted(this.inverted);
            chatListView.setDataSource(new ChatListView.DataSource() { // from class: com.discord.chat.presentation.root.ChatView.addView.2
                @Override // com.discord.chat.presentation.list.ChatListView.DataSource
                public Flow getUpdatesFlow() {
                    return ChatModule.INSTANCE.getChatListManager(ChatView.this.getId()).observeUpdates();
                }
            });
            this.chatList = chatListView;
        }
    }

    public final void scrollTo(int index, @NotNull Scroller.TargetAlignment targetScreenLocation, boolean animated, boolean highlight) {
        Intrinsics.checkNotNullParameter(targetScreenLocation, "targetScreenLocation");
        if (!ThreadUtilsKt.isOnMainThread()) {
            throw new IllegalStateException(com.discord.chat.presentation.list.a.i("Expected to be on android main thread. Current: ", Thread.currentThread()).toString());
        }
        ChatListView chatListView = this.chatList;
        if (chatListView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chatList");
            chatListView = null;
        }
        chatListView.scrollToPosition(index, targetScreenLocation, animated, highlight);
    }

    public final void setEventHandler(@NotNull ChatEventHandler eventHandler) {
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        if (!ThreadUtilsKt.isOnMainThread()) {
            throw new IllegalStateException(com.discord.chat.presentation.list.a.i("Expected to be on android main thread. Current: ", Thread.currentThread()).toString());
        }
        this.eventHandler = eventHandler;
    }

    public final void setInverted(boolean inverted) {
        if (!ThreadUtilsKt.isOnMainThread()) {
            throw new IllegalStateException(com.discord.chat.presentation.list.a.i("Expected to be on android main thread. Current: ", Thread.currentThread()).toString());
        }
        this.inverted = inverted;
    }
}
