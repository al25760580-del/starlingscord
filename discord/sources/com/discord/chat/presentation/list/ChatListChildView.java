package com.discord.chat.presentation.list;

import android.view.View;
import android.view.ViewParent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\bH&J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0001H\u0016J\u0018\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0005H\u0016J\u0018\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0005H&R\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u0001X¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u0001X¦\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012¨\u0006\u001c"}, d2 = {"Lcom/discord/chat/presentation/list/ChatListChildView;", "", "getParent", "Landroid/view/ViewParent;", "getMeasuredWidth", "", "getMeasuredHeight", "forceLayout", "", "requestLayout", "post", "", "action", "Ljava/lang/Runnable;", "lastKey", "getLastKey", "()Ljava/lang/Object;", "setLastKey", "(Ljava/lang/Object;)V", "currentKey", "getCurrentKey", "setCurrentKey", "bindKey", "key", "onMeasureConsiderFrozen", "widthMeasureSpec", "heightMeasureSpec", "superOnMeasure", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ChatListChildView {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void bindKey(@NotNull ChatListChildView chatListChildView, @NotNull Object key) {
            Intrinsics.checkNotNullParameter(key, "key");
            chatListChildView.setCurrentKey(key);
        }

        public static void onMeasureConsiderFrozen(@NotNull ChatListChildView chatListChildView, int i7, int i10) {
            ViewParent parent = chatListChildView.getParent();
            Object lastKey = chatListChildView.getLastKey();
            boolean z5 = (parent instanceof ChatListView) && View.MeasureSpec.getMode(i7) == 1073741824 && ((ChatListView) parent).getMeasuredWidth() == 0;
            chatListChildView.setLastKey(chatListChildView.getCurrentKey());
            if (!z5) {
                chatListChildView.superOnMeasure(i7, i10);
                return;
            }
            chatListChildView.superOnMeasure(View.MeasureSpec.makeMeasureSpec(chatListChildView.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(chatListChildView.getMeasuredHeight(), 1073741824));
            if (Intrinsics.areEqual(lastKey, chatListChildView.getCurrentKey())) {
                return;
            }
            chatListChildView.post(new am.c(7, chatListChildView));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void onMeasureConsiderFrozen$lambda$0(ChatListChildView chatListChildView) {
            chatListChildView.forceLayout();
            chatListChildView.requestLayout();
        }
    }

    void bindKey(@NotNull Object key);

    void forceLayout();

    Object getCurrentKey();

    Object getLastKey();

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    void onMeasureConsiderFrozen(int widthMeasureSpec, int heightMeasureSpec);

    boolean post(@NotNull Runnable action);

    void requestLayout();

    void setCurrentKey(Object obj);

    void setLastKey(Object obj);

    void superOnMeasure(int widthMeasureSpec, int heightMeasureSpec);
}
