package com.discord.chat.presentation.message.view.polls.a11y;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.a;
import androidx.core.view.b;
import com.discord.chat.bridge.polls.PollChatAnswerInteractionType;
import com.discord.chat.presentation.message.messagepart.polls.PollAnswerAccessory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rn.n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/discord/chat/presentation/message/view/polls/a11y/PollsAnswerAccessibilityDelegate;", "Landroidx/core/view/b;", "Lcom/discord/chat/presentation/message/messagepart/polls/PollAnswerAccessory;", "accessory", "<init>", "(Lcom/discord/chat/presentation/message/messagepart/polls/PollAnswerAccessory;)V", "Landroid/view/View;", "host", "Landroid/view/accessibility/AccessibilityEvent;", "event", "", "onInitializeAccessibilityEvent", "(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "info", "onInitializeAccessibilityNodeInfo", "(Landroid/view/View;Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;)V", "Lcom/discord/chat/presentation/message/messagepart/polls/PollAnswerAccessory;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PollsAnswerAccessibilityDelegate extends b {

    @NotNull
    private final PollAnswerAccessory accessory;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PollChatAnswerInteractionType.values().length];
            try {
                iArr[PollChatAnswerInteractionType.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PollChatAnswerInteractionType.RADIO_BUTTONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PollChatAnswerInteractionType.CHECKBOXES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PollsAnswerAccessibilityDelegate(@NotNull PollAnswerAccessory accessory) {
        Intrinsics.checkNotNullParameter(accessory, "accessory");
        this.accessory = accessory;
    }

    @Override // androidx.core.view.b
    public void onInitializeAccessibilityEvent(@NotNull View host, @NotNull AccessibilityEvent event) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(event, "event");
        super.onInitializeAccessibilityEvent(host, event);
        boolean zAreEqual = Intrinsics.areEqual(this.accessory.getAnswer().isSelected(), Boolean.TRUE);
        int i7 = WhenMappings.$EnumSwitchMapping$0[this.accessory.getInteractionType().ordinal()];
        if (i7 == 1 || i7 == 2) {
            return;
        }
        if (i7 != 3) {
            throw new n();
        }
        event.setChecked(zAreEqual);
    }

    @Override // androidx.core.view.b
    public void onInitializeAccessibilityNodeInfo(@NotNull View host, @NotNull AccessibilityNodeInfoCompat info) {
        String str;
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        info.n(this.accessory.getInteractionType() == PollChatAnswerInteractionType.CHECKBOXES);
        AccessibilityNodeInfo accessibilityNodeInfo = info.f1613a;
        boolean zAreEqual = Intrinsics.areEqual(this.accessory.getAnswer().isSelected(), Boolean.TRUE);
        PollChatAnswerInteractionType interactionType = this.accessory.getInteractionType();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i7 = iArr[interactionType.ordinal()];
        if (i7 != 1) {
            if (i7 == 2) {
                accessibilityNodeInfo.setSelected(zAreEqual);
            } else {
                if (i7 != 3) {
                    throw new n();
                }
                accessibilityNodeInfo.setChecked(zAreEqual);
            }
        }
        int i10 = iArr[this.accessory.getInteractionType().ordinal()];
        if (i10 == 1) {
            str = "android.view.ViewGroup";
        } else if (i10 == 2) {
            str = "android.widget.RadioButton";
        } else {
            if (i10 != 3) {
                throw new n();
            }
            str = "android.widget.CheckBox";
        }
        info.o(str);
        if (this.accessory.getTapAccessibilityLabel() != null) {
            info.b(new a(16, this.accessory.getTapAccessibilityLabel()));
        }
    }
}
