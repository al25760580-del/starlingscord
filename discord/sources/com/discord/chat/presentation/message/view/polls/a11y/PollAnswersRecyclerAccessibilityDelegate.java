package com.discord.chat.presentation.message.view.polls.a11y;

import android.content.Context;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.b;
import com.discord.chat.bridge.polls.PollChatAnswerInteractionType;
import com.discord.chat.presentation.message.messagepart.PollMessageAccessory;
import com.discord.react_strings.I18nMessage;
import com.discord.react_strings.I18nUtilsKt;
import com.facebook.react.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/discord/chat/presentation/message/view/polls/a11y/PollAnswersRecyclerAccessibilityDelegate;", "Landroidx/core/view/b;", "Lcom/discord/chat/presentation/message/messagepart/PollMessageAccessory;", "accessory", "<init>", "(Lcom/discord/chat/presentation/message/messagepart/PollMessageAccessory;)V", "Landroid/view/View;", "host", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "info", "", "onInitializeAccessibilityNodeInfo", "(Landroid/view/View;Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;)V", "Lcom/discord/chat/presentation/message/messagepart/PollMessageAccessory;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PollAnswersRecyclerAccessibilityDelegate extends b {

    @NotNull
    private final PollMessageAccessory accessory;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PollChatAnswerInteractionType.values().length];
            try {
                iArr[PollChatAnswerInteractionType.RADIO_BUTTONS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PollAnswersRecyclerAccessibilityDelegate(@NotNull PollMessageAccessory accessory) {
        Intrinsics.checkNotNullParameter(accessory, "accessory");
        this.accessory = accessory;
    }

    @Override // androidx.core.view.b
    public void onInitializeAccessibilityNodeInfo(@NotNull View host, @NotNull AccessibilityNodeInfoCompat info) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        info.o("android.view.ViewGroup");
        info.w(WhenMappings.$EnumSwitchMapping$0[this.accessory.getData().getAnswersInteraction().ordinal()] == 1 ? host.getContext().getString(R.string.radiogroup_description) : null);
        Context context = host.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        info.A(I18nUtilsKt.i18nFormat$default(context, I18nMessage.POLL_OPTIONS_ARIA, null, 2, null));
    }
}
