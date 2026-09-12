package com.discord.chat.presentation.message;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.discord.chat.bridge.Message;
import com.discord.chat.bridge.referencedmessage.LoadedReferencedMessage;
import com.discord.chat.bridge.referencedmessage.ReferencedMessage;
import com.discord.notifications.renderer.NotificationRenderer;
import com.discord.react_strings.I18nMessage;
import com.discord.react_strings.I18nUtilsKt;
import com.discord.react_strings.RenderContext;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!¨\u0006\""}, d2 = {"Lcom/discord/chat/presentation/message/MessageViewAccessibilityDelegate;", "Landroidx/core/view/b;", "Lcom/discord/chat/bridge/Message;", "message", "Landroid/view/View$OnClickListener;", ViewProps.ON_CLICK, "Landroid/view/View$OnLongClickListener;", "onLongClick", "<init>", "(Lcom/discord/chat/bridge/Message;Landroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;)V", "Landroid/content/Context;", "context", "Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;", "referencedMessage", "", "getReferencedMessageLabel", "(Landroid/content/Context;Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;)Ljava/lang/CharSequence;", "Landroid/view/View;", "host", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "info", "", "onInitializeAccessibilityNodeInfo", "(Landroid/view/View;Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;)V", "", "action", "Landroid/os/Bundle;", "args", "", "performAccessibilityAction", "(Landroid/view/View;ILandroid/os/Bundle;)Z", "Lcom/discord/chat/bridge/Message;", "Landroid/view/View$OnClickListener;", "Landroid/view/View$OnLongClickListener;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MessageViewAccessibilityDelegate extends androidx.core.view.b {

    @NotNull
    private final Message message;
    private final View.OnClickListener onClick;
    private final View.OnLongClickListener onLongClick;

    public MessageViewAccessibilityDelegate(@NotNull Message message, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.message = message;
        this.onClick = onClickListener;
        this.onLongClick = onLongClickListener;
    }

    private final CharSequence getReferencedMessageLabel(Context context, ReferencedMessage referencedMessage) {
        if (!(referencedMessage instanceof LoadedReferencedMessage)) {
            return null;
        }
        return I18nUtilsKt.i18nFormat(context, I18nMessage.MOBILE_REPLYING_TO_A11Y_LABEL, new com.discord.chat.bridge.spoiler.a(((LoadedReferencedMessage) referencedMessage).getMessage().getUsername(), 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getReferencedMessageLabel$lambda$0(String str, RenderContext i18nFormat) {
        Intrinsics.checkNotNullParameter(i18nFormat, "$this$i18nFormat");
        i18nFormat.getArgs().put(NotificationRenderer.USERNAME, str);
        return Unit.f14616a;
    }

    @Override // androidx.core.view.b
    public void onInitializeAccessibilityNodeInfo(@NotNull View host, @NotNull AccessibilityNodeInfoCompat info) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        ArrayList arrayList = new ArrayList();
        if (this.message.getUsername() != null) {
            arrayList.add(this.message.getUsername());
        }
        String tagAccessibilityLabel = this.message.getTagAccessibilityLabel();
        if (tagAccessibilityLabel == null) {
            tagAccessibilityLabel = this.message.getTagText();
        }
        if (tagAccessibilityLabel != null) {
            arrayList.add(tagAccessibilityLabel);
        }
        if (this.message.getTimestamp() != null) {
            arrayList.add(this.message.getTimestamp());
        }
        if (this.message.getStateAccessibilityLabel() != null) {
            arrayList.add(this.message.getStateAccessibilityLabel());
        }
        Context context = host.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        CharSequence referencedMessageLabel = getReferencedMessageLabel(context, this.message.getReferencedMessage());
        if (referencedMessageLabel != null) {
            arrayList.add(referencedMessageLabel);
        }
        info.A(CollectionsKt.O(arrayList, ", ", null, null, null, 62));
        AccessibilityNodeInfo accessibilityNodeInfo = info.f1613a;
        accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) androidx.core.view.accessibility.a.f1618g.f1627a);
        accessibilityNodeInfo.setMovementGranularities(15);
    }

    @Override // androidx.core.view.b
    public boolean performAccessibilityAction(@NotNull View host, int action, Bundle args) {
        View.OnLongClickListener onLongClickListener;
        Intrinsics.checkNotNullParameter(host, "host");
        if (action == 16) {
            View.OnClickListener onClickListener = this.onClick;
            if (onClickListener != null) {
                onClickListener.onClick(host);
            }
        } else if (action == 32 && (onLongClickListener = this.onLongClick) != null) {
            onLongClickListener.onLongClick(host);
        }
        return super.performAccessibilityAction(host, action, args);
    }
}
