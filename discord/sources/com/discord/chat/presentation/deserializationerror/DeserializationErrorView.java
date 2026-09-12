package com.discord.chat.presentation.deserializationerror;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.databinding.DeserializationErrorViewBinding;
import com.discord.chat.presentation.list.ChatListLinearLayout;
import com.discord.chat.presentation.message.t;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.theme.ThemeManagerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/discord/chat/presentation/deserializationerror/DeserializationErrorView;", "Lcom/discord/chat/presentation/list/ChatListLinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/discord/chat/databinding/DeserializationErrorViewBinding;", "configure", "", "json", "", "causeMessage", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DeserializationErrorView extends ChatListLinearLayout {

    @NotNull
    private final DeserializationErrorViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DeserializationErrorView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configure$lambda$0(DeserializationErrorView deserializationErrorView, String str, View view) {
        Object systemService = deserializationErrorView.getContext().getSystemService((Class<Object>) ClipboardManager.class);
        Intrinsics.checkNotNull(systemService);
        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("Error JSON", str));
        Toast.makeText(deserializationErrorView.getContext(), "Copied error json to clipboard", 0).show();
    }

    public final void configure(@NotNull String json, @NotNull String causeMessage) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(causeMessage, "causeMessage");
        this.binding.json.setText(json);
        this.binding.exception.setText(causeMessage);
        Button copyButton = this.binding.copyButton;
        Intrinsics.checkNotNullExpressionValue(copyButton, "copyButton");
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(copyButton, false, new t(17, this, json), 1, null);
    }

    public /* synthetic */ DeserializationErrorView(Context context, AttributeSet attributeSet, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializationErrorView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        DeserializationErrorViewBinding deserializationErrorViewBindingInflate = DeserializationErrorViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(deserializationErrorViewBindingInflate, "inflate(...)");
        this.binding = deserializationErrorViewBindingInflate;
        deserializationErrorViewBindingInflate.json.setTextColor(ThemeManagerKt.getTheme().getTextDefault());
        TextView json = deserializationErrorViewBindingInflate.json;
        Intrinsics.checkNotNullExpressionValue(json, "json");
        DiscordFont discordFont = DiscordFont.PrimaryMedium;
        DiscordFontUtilsKt.setDiscordFont(json, discordFont);
        deserializationErrorViewBindingInflate.exception.setTextColor(ThemeManagerKt.getTheme().getTextDefault());
        TextView exception = deserializationErrorViewBindingInflate.exception;
        Intrinsics.checkNotNullExpressionValue(exception, "exception");
        DiscordFontUtilsKt.setDiscordFont(exception, discordFont);
        deserializationErrorViewBindingInflate.causeHeader.setTextColor(ThemeManagerKt.getTheme().getInteractiveTextActive());
        TextView causeHeader = deserializationErrorViewBindingInflate.causeHeader;
        Intrinsics.checkNotNullExpressionValue(causeHeader, "causeHeader");
        SetTextSizeSpKt.setTextSizeSp(causeHeader, 24.0f);
        TextView causeHeader2 = deserializationErrorViewBindingInflate.causeHeader;
        Intrinsics.checkNotNullExpressionValue(causeHeader2, "causeHeader");
        DiscordFont discordFont2 = DiscordFont.PrimarySemibold;
        DiscordFontUtilsKt.setDiscordFont(causeHeader2, discordFont2);
        deserializationErrorViewBindingInflate.jsonHeader.setTextColor(ThemeManagerKt.getTheme().getInteractiveTextActive());
        TextView jsonHeader = deserializationErrorViewBindingInflate.jsonHeader;
        Intrinsics.checkNotNullExpressionValue(jsonHeader, "jsonHeader");
        SetTextSizeSpKt.setTextSizeSp(jsonHeader, 24.0f);
        TextView jsonHeader2 = deserializationErrorViewBindingInflate.jsonHeader;
        Intrinsics.checkNotNullExpressionValue(jsonHeader2, "jsonHeader");
        DiscordFontUtilsKt.setDiscordFont(jsonHeader2, discordFont2);
        TextView header = deserializationErrorViewBindingInflate.header;
        Intrinsics.checkNotNullExpressionValue(header, "header");
        DiscordFontUtilsKt.setDiscordFont(header, discordFont);
        TextView header2 = deserializationErrorViewBindingInflate.header;
        Intrinsics.checkNotNullExpressionValue(header2, "header");
        SetTextSizeSpKt.setTextSizeSp(header2, 24.0f);
        Button copyButton = deserializationErrorViewBindingInflate.copyButton;
        Intrinsics.checkNotNullExpressionValue(copyButton, "copyButton");
        DiscordFontUtilsKt.setDiscordFont(copyButton, discordFont);
        setOrientation(1);
    }
}
