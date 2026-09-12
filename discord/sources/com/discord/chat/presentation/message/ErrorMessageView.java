package com.discord.chat.presentation.message;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.discord.chat.bridge.ErrorMessage;
import com.discord.chat.databinding.ErrorMessageViewBinding;
import com.discord.chat.presentation.list.ChatListLinearLayout;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.theme.ThemeManagerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\b0\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/discord/chat/presentation/message/ErrorMessageView;", "Lcom/discord/chat/presentation/list/ChatListLinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "hideHeader", "()V", "", "label", "setErrorLabel", "(Ljava/lang/CharSequence;)V", "Lcom/discord/chat/bridge/ErrorMessage;", "message", "setErrorMessage", "(Lcom/discord/chat/bridge/ErrorMessage;)V", "", "isExpanded", "Lkotlin/Function1;", "onExpandChange", "setExpandInfo", "(ZLkotlin/jvm/functions/Function1;)V", "Lcom/discord/chat/databinding/ErrorMessageViewBinding;", "binding", "Lcom/discord/chat/databinding/ErrorMessageViewBinding;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"SetTextI18n"})
public final class ErrorMessageView extends ChatListLinearLayout {

    @NotNull
    private final ErrorMessageViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ErrorMessageView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setExpandInfo$lambda$0(Function1 function1, boolean z5, View view) {
        function1.invoke(Boolean.valueOf(!z5));
    }

    public final void hideHeader() {
        this.binding.header.setVisibility(4);
    }

    public final void setErrorLabel(@NotNull CharSequence label) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.binding.errorLabel.setText(label);
    }

    public final void setErrorMessage(@NotNull ErrorMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.binding.errorLabel.setText(message.getStackTrace());
    }

    public final void setExpandInfo(final boolean isExpanded, @NotNull final Function1<? super Boolean, Unit> onExpandChange) {
        Intrinsics.checkNotNullParameter(onExpandChange, "onExpandChange");
        if (isExpanded) {
            this.binding.seeMoreButton.setText("Show less");
            this.binding.errorLabel.setSingleLine(false);
            this.binding.errorLabel.setMaxLines(Integer.MAX_VALUE);
            this.binding.errorLabel.setGravity(0);
        } else {
            this.binding.seeMoreButton.setText("Show more");
            this.binding.errorLabel.setSingleLine(true);
            this.binding.errorLabel.setMaxLines(1);
            this.binding.errorLabel.setGravity(1);
        }
        TextView seeMoreButton = this.binding.seeMoreButton;
        Intrinsics.checkNotNullExpressionValue(seeMoreButton, "seeMoreButton");
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(seeMoreButton, false, new View.OnClickListener() { // from class: com.discord.chat.presentation.message.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ErrorMessageView.setExpandInfo$lambda$0(onExpandChange, isExpanded, view);
            }
        }, 1, null);
    }

    public /* synthetic */ ErrorMessageView(Context context, AttributeSet attributeSet, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ErrorMessageView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        ErrorMessageViewBinding errorMessageViewBindingInflate = ErrorMessageViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(errorMessageViewBindingInflate, "inflate(...)");
        this.binding = errorMessageViewBindingInflate;
        setOrientation(1);
        int backgroundBaseLow = ThemeManagerKt.getTheme().getBackgroundBaseLow();
        int backgroundFeedbackCritical = ThemeManagerKt.getTheme().getBackgroundFeedbackCritical();
        ViewBackgroundUtilsKt.setBackgroundRectangle(this, backgroundBaseLow, SizeUtilsKt.getDpToPx(8), Integer.valueOf(backgroundFeedbackCritical), SizeUtilsKt.getDpToPx(1));
        errorMessageViewBindingInflate.header.setText("Something went wrong here.");
        errorMessageViewBindingInflate.header.setTextColor(ThemeManagerKt.getTheme().getTextDefault());
        TextView header = errorMessageViewBindingInflate.header;
        Intrinsics.checkNotNullExpressionValue(header, "header");
        DiscordFont discordFont = DiscordFont.PrimarySemibold;
        DiscordFontUtilsKt.setDiscordFont(header, discordFont);
        errorMessageViewBindingInflate.errorLabel.setTextColor(ThemeManagerKt.getTheme().getTextDefault());
        TextView errorLabel = errorMessageViewBindingInflate.errorLabel;
        Intrinsics.checkNotNullExpressionValue(errorLabel, "errorLabel");
        DiscordFontUtilsKt.setDiscordFont(errorLabel, DiscordFont.PrimaryMedium);
        errorMessageViewBindingInflate.seeMoreButton.setTextColor(ThemeManagerKt.getTheme().getTextLink());
        TextView seeMoreButton = errorMessageViewBindingInflate.seeMoreButton;
        Intrinsics.checkNotNullExpressionValue(seeMoreButton, "seeMoreButton");
        DiscordFontUtilsKt.setDiscordFont(seeMoreButton, discordFont);
    }
}
