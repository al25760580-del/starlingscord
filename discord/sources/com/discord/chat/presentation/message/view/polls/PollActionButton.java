package com.discord.chat.presentation.message.view.polls;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.discord.chat.bridge.polls.PollAction;
import com.discord.chat.bridge.polls.PollActionPresentation;
import com.discord.chat.databinding.PollActionButtonBinding;
import com.discord.chat.presentation.message.view.polls.a11y.PollsActionAccessibilityDelegate;
import com.discord.core.DCDButton;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.primitives.ChannelId;
import com.discord.primitives.MessageId;
import com.discord.theme.R;
import com.discord.theme.ThemeManager;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import rn.n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007JG\u0010\u0014\u001a\u00020\u00102\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u001e\u0010\u0011\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/discord/chat/presentation/message/view/polls/PollActionButton;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/discord/chat/bridge/polls/PollAction;", "action", "Lcom/discord/primitives/ChannelId;", "channelId", "Lcom/discord/primitives/MessageId;", "messageId", "Lkotlin/Function3;", "", "", "onTapPollAction", "bind-urJ__Hs", "(Lcom/discord/chat/bridge/polls/PollAction;JLjava/lang/String;Lkotlin/jvm/functions/Function3;)V", "bind", "", "hasAccessibilityFocus", "()Z", "Lcom/discord/chat/databinding/PollActionButtonBinding;", "binding", "Lcom/discord/chat/databinding/PollActionButtonBinding;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPollActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PollActionButton.kt\ncom/discord/chat/presentation/message/view/polls/PollActionButton\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,135:1\n257#2,2:136\n257#2,2:138\n257#2,2:140\n257#2,2:142\n257#2,2:144\n257#2,2:146\n257#2,2:148\n*S KotlinDebug\n*F\n+ 1 PollActionButton.kt\ncom/discord/chat/presentation/message/view/polls/PollActionButton\n*L\n35#1:136,2\n42#1:138,2\n44#1:140,2\n63#1:142,2\n83#1:144,2\n100#1:146,2\n122#1:148,2\n*E\n"})
public final class PollActionButton extends FrameLayout {

    @NotNull
    private final PollActionButtonBinding binding;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PollActionPresentation.values().length];
            try {
                iArr[PollActionPresentation.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PollActionPresentation.TEXT_BUTTON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PollActionPresentation.BUTTON.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PollActionPresentation.SECONDARY_BUTTON.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PollActionButton(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind_urJ__Hs$lambda$1$lambda$0(PollAction pollAction, Function3 function3, long j, String str, View view) {
        if (pollAction.getType() != null) {
            function3.invoke(ChannelId.m1130boximpl(j), MessageId.m1156boximpl(str), pollAction.getType());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind_urJ__Hs$lambda$3$lambda$2(PollAction pollAction, Function3 function3, long j, String str, View view) {
        if (pollAction.getType() != null) {
            function3.invoke(ChannelId.m1130boximpl(j), MessageId.m1156boximpl(str), pollAction.getType());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind_urJ__Hs$lambda$5$lambda$4(PollAction pollAction, Function3 function3, long j, String str, View view) {
        if (pollAction.getType() != null) {
            function3.invoke(ChannelId.m1130boximpl(j), MessageId.m1156boximpl(str), pollAction.getType());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind_urJ__Hs$lambda$7$lambda$6(PollAction pollAction, Function3 function3, long j, String str, View view) {
        if (pollAction.getType() != null) {
            function3.invoke(ChannelId.m1130boximpl(j), MessageId.m1156boximpl(str), pollAction.getType());
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:53:0x01da  */
    /* JADX INFO: renamed from: bind-urJ__Hs, reason: not valid java name */
    public final void m758bindurJ__Hs(final PollAction action, final long channelId, @NotNull final String messageId, @NotNull final Function3 onTapPollAction) {
        TextView textView;
        final PollAction pollAction;
        View view;
        float f2;
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(onTapPollAction, "onTapPollAction");
        View root = this.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        root.setVisibility(action != null ? 0 : 8);
        if (action == null) {
            return;
        }
        int i7 = WhenMappings.$EnumSwitchMapping$0[action.getPresentation().ordinal()];
        if (i7 != 1) {
            if (i7 == 2) {
                DCDButton actionButton = this.binding.actionButton;
                Intrinsics.checkNotNullExpressionValue(actionButton, "actionButton");
                actionButton.setVisibility(8);
                textView = this.binding.actionText;
                textView.setTextColor(ThemeManagerKt.getTheme().getTextBrand());
                Intrinsics.checkNotNull(textView);
                DiscordFontUtilsKt.setDiscordFont(textView, DiscordFont.PrimarySemibold);
                textView.setText(action.getLabel());
                textView.setClickable(true);
                final int i10 = 1;
                textView.setOnClickListener(new View.OnClickListener() { // from class: com.discord.chat.presentation.message.view.polls.b
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i10) {
                            case 0:
                                PollActionButton.bind_urJ__Hs$lambda$1$lambda$0(action, onTapPollAction, channelId, messageId, view2);
                                break;
                            case 1:
                                PollActionButton.bind_urJ__Hs$lambda$3$lambda$2(action, onTapPollAction, channelId, messageId, view2);
                                break;
                            case 2:
                                PollActionButton.bind_urJ__Hs$lambda$5$lambda$4(action, onTapPollAction, channelId, messageId, view2);
                                break;
                            default:
                                PollActionButton.bind_urJ__Hs$lambda$7$lambda$6(action, onTapPollAction, channelId, messageId, view2);
                                break;
                        }
                    }
                });
                textView.setAccessibilityDelegate(action.getType() != null ? new PollsActionAccessibilityDelegate(action) : null);
                Intrinsics.checkNotNull(textView);
                pollAction = action;
            } else if (i7 == 3) {
                TextView actionText = this.binding.actionText;
                Intrinsics.checkNotNullExpressionValue(actionText, "actionText");
                actionText.setVisibility(8);
                DCDButton dCDButton = this.binding.actionButton;
                DCDButton.setBackgroundRectangle$default(dCDButton, ThemeManagerKt.getTheme().getControlPrimaryBackgroundDefault(), ThemeManager.INSTANCE.isVisualRefreshEnabled() ? SizeUtilsKt.getDpToPx(8) : SizeUtilsKt.getDpToPx(20), null, 0, 12, null);
                Intrinsics.checkNotNull(dCDButton);
                dCDButton.setTextColor(Integer.valueOf(ColorUtilsKt.getColorCompat(dCDButton, R.color.white)));
                dCDButton.setText(action.getLabel());
                final int i11 = 2;
                pollAction = action;
                dCDButton.setOnClickButtonListener(new View.OnClickListener() { // from class: com.discord.chat.presentation.message.view.polls.b
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i11) {
                            case 0:
                                PollActionButton.bind_urJ__Hs$lambda$1$lambda$0(pollAction, onTapPollAction, channelId, messageId, view2);
                                break;
                            case 1:
                                PollActionButton.bind_urJ__Hs$lambda$3$lambda$2(pollAction, onTapPollAction, channelId, messageId, view2);
                                break;
                            case 2:
                                PollActionButton.bind_urJ__Hs$lambda$5$lambda$4(pollAction, onTapPollAction, channelId, messageId, view2);
                                break;
                            default:
                                PollActionButton.bind_urJ__Hs$lambda$7$lambda$6(pollAction, onTapPollAction, channelId, messageId, view2);
                                break;
                        }
                    }
                });
                Intrinsics.checkNotNull(dCDButton);
                view = dCDButton;
            } else {
                if (i7 != 4) {
                    throw new n();
                }
                TextView actionText2 = this.binding.actionText;
                Intrinsics.checkNotNullExpressionValue(actionText2, "actionText");
                actionText2.setVisibility(8);
                DCDButton dCDButton2 = this.binding.actionButton;
                DCDButton.setBackgroundRectangle$default(dCDButton2, ThemeManagerKt.getTheme().getControlSecondaryBackgroundDefault(), ThemeManager.INSTANCE.isVisualRefreshEnabled() ? SizeUtilsKt.getDpToPx(8) : SizeUtilsKt.getDpToPx(20), null, 0, 12, null);
                dCDButton2.setTextColor(Integer.valueOf(ThemeManagerKt.getTheme().getControlSecondaryTextDefault()));
                dCDButton2.setText(action.getLabel());
                final int i12 = 3;
                pollAction = action;
                dCDButton2.setOnClickButtonListener(new View.OnClickListener() { // from class: com.discord.chat.presentation.message.view.polls.b
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i12) {
                            case 0:
                                PollActionButton.bind_urJ__Hs$lambda$1$lambda$0(pollAction, onTapPollAction, channelId, messageId, view2);
                                break;
                            case 1:
                                PollActionButton.bind_urJ__Hs$lambda$3$lambda$2(pollAction, onTapPollAction, channelId, messageId, view2);
                                break;
                            case 2:
                                PollActionButton.bind_urJ__Hs$lambda$5$lambda$4(pollAction, onTapPollAction, channelId, messageId, view2);
                                break;
                            default:
                                PollActionButton.bind_urJ__Hs$lambda$7$lambda$6(pollAction, onTapPollAction, channelId, messageId, view2);
                                break;
                        }
                    }
                });
                Intrinsics.checkNotNull(dCDButton2);
                view = dCDButton2;
            }
            view.setEnabled(pollAction.getEnabled());
            if (!pollAction.getEnabled()) {
                view.setPressed(false);
            }
            view.setVisibility(0);
            if (!pollAction.getEnabled() || pollAction.getPresentation() == PollActionPresentation.TEXT) {
                f2 = 1.0f;
            } else {
                f2 = 0.5f;
            }
            view.setAlpha(f2);
        }
        DCDButton actionButton2 = this.binding.actionButton;
        Intrinsics.checkNotNullExpressionValue(actionButton2, "actionButton");
        actionButton2.setVisibility(8);
        textView = this.binding.actionText;
        Intrinsics.checkNotNull(textView);
        textView.setVisibility(0);
        textView.setTextColor(ThemeManagerKt.getTheme().getTextSubtle());
        DiscordFontUtilsKt.setDiscordFont(textView, DiscordFont.PrimaryMedium);
        textView.setText(action.getFullTextLabel());
        textView.setClickable(action.getType() != null);
        final int i13 = 0;
        pollAction = action;
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.discord.chat.presentation.message.view.polls.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        PollActionButton.bind_urJ__Hs$lambda$1$lambda$0(pollAction, onTapPollAction, channelId, messageId, view2);
                        break;
                    case 1:
                        PollActionButton.bind_urJ__Hs$lambda$3$lambda$2(pollAction, onTapPollAction, channelId, messageId, view2);
                        break;
                    case 2:
                        PollActionButton.bind_urJ__Hs$lambda$5$lambda$4(pollAction, onTapPollAction, channelId, messageId, view2);
                        break;
                    default:
                        PollActionButton.bind_urJ__Hs$lambda$7$lambda$6(pollAction, onTapPollAction, channelId, messageId, view2);
                        break;
                }
            }
        });
        textView.setAccessibilityDelegate(pollAction.getType() != null ? new PollsActionAccessibilityDelegate(pollAction) : null);
        Intrinsics.checkNotNull(textView);
        view = textView;
        view.setEnabled(pollAction.getEnabled());
        if (!pollAction.getEnabled()) {
            view.setPressed(false);
        }
        view.setVisibility(0);
        if (pollAction.getEnabled()) {
            f2 = 1.0f;
        } else {
            f2 = 1.0f;
        }
        view.setAlpha(f2);
    }

    public final boolean hasAccessibilityFocus() {
        return this.binding.actionButton.isAccessibilityFocused() || this.binding.actionText.isAccessibilityFocused();
    }

    public /* synthetic */ PollActionButton(Context context, AttributeSet attributeSet, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PollActionButton(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        PollActionButtonBinding pollActionButtonBindingInflate = PollActionButtonBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(pollActionButtonBindingInflate, "inflate(...)");
        this.binding = pollActionButtonBindingInflate;
    }
}
