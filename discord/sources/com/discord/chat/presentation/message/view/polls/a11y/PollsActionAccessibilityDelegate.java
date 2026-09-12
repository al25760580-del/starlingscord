package com.discord.chat.presentation.message.view.polls.a11y;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.discord.chat.bridge.polls.PollAction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/discord/chat/presentation/message/view/polls/a11y/PollsActionAccessibilityDelegate;", "Landroid/view/View$AccessibilityDelegate;", "action", "Lcom/discord/chat/bridge/polls/PollAction;", "<init>", "(Lcom/discord/chat/bridge/polls/PollAction;)V", "onInitializeAccessibilityNodeInfo", "", "host", "Landroid/view/View;", "info", "Landroid/view/accessibility/AccessibilityNodeInfo;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PollsActionAccessibilityDelegate extends View.AccessibilityDelegate {

    @NotNull
    private final PollAction action;

    public PollsActionAccessibilityDelegate(@NotNull PollAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.action = action;
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityNodeInfo(@NotNull View host, @NotNull AccessibilityNodeInfo info) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        info.setClassName("android.widget.Button");
        if (this.action.getAccessibilityHint() != null) {
            info.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, this.action.getAccessibilityHint()));
        }
    }
}
