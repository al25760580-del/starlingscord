package com.discord.chat.presentation.loading;

import a6.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.ProgressBar;
import com.discord.chat.R;
import com.discord.chat.bridge.row.LoadMoreButton;
import com.discord.chat.databinding.ChatLoadingViewBinding;
import com.discord.chat.presentation.list.ChatListConstraintLayout;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\n\u001a\u00020\u000bJ$\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0012R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/discord/chat/presentation/loading/ChatLoadingView;", "Lcom/discord/chat/presentation/list/ChatListConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/discord/chat/databinding/ChatLoadingViewBinding;", "showProgress", "", "showButton", "button", "Lcom/discord/chat/bridge/row/LoadMoreButton;", ViewProps.COLOR, "", ViewProps.ON_CLICK, "Lkotlin/Function0;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nChatLoadingView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatLoadingView.kt\ncom/discord/chat/presentation/loading/ChatLoadingView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,49:1\n146#2,8:50\n257#2,2:58\n257#2,2:60\n257#2,2:62\n257#2,2:64\n*S KotlinDebug\n*F\n+ 1 ChatLoadingView.kt\ncom/discord/chat/presentation/loading/ChatLoadingView\n*L\n27#1:50,8\n32#1:58,2\n33#1:60,2\n38#1:62,2\n39#1:64,2\n*E\n"})
public final class ChatLoadingView extends ChatListConstraintLayout {

    @NotNull
    private final ChatLoadingViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChatLoadingView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void showButton(@NotNull LoadMoreButton button, int color, @NotNull Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        ProgressBar progressSpinner = this.binding.progressSpinner;
        Intrinsics.checkNotNullExpressionValue(progressSpinner, "progressSpinner");
        progressSpinner.setVisibility(8);
        Button button2 = this.binding.button;
        Intrinsics.checkNotNullExpressionValue(button2, "button");
        button2.setVisibility(0);
        this.binding.button.setText(button.getText());
        Button button3 = this.binding.button;
        Intrinsics.checkNotNullExpressionValue(button3, "button");
        DiscordFontUtilsKt.setDiscordFont(button3, DiscordFont.PrimaryMedium);
        this.binding.button.setClickable(true);
        this.binding.button.setBackgroundTintList(ColorStateList.valueOf(button.getBackgroundColor()));
        this.binding.button.setTextColor(color);
        Button button4 = this.binding.button;
        Intrinsics.checkNotNullExpressionValue(button4, "button");
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(button4, false, new a(0, onClick), 1, null);
    }

    public final void showProgress() {
        ProgressBar progressSpinner = this.binding.progressSpinner;
        Intrinsics.checkNotNullExpressionValue(progressSpinner, "progressSpinner");
        progressSpinner.setVisibility(0);
        Button button = this.binding.button;
        Intrinsics.checkNotNullExpressionValue(button, "button");
        button.setVisibility(8);
        Button button2 = this.binding.button;
        Intrinsics.checkNotNullExpressionValue(button2, "button");
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(button2, false, null, 1, null);
    }

    public /* synthetic */ ChatLoadingView(Context context, AttributeSet attributeSet, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatLoadingView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        ChatLoadingViewBinding chatLoadingViewBindingInflate = ChatLoadingViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(chatLoadingViewBindingInflate, "inflate(...)");
        this.binding = chatLoadingViewBindingInflate;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.message_horizontal_spacing);
        setPaddingRelative(dimensionPixelSize, getPaddingTop(), dimensionPixelSize, getPaddingBottom());
        chatLoadingViewBindingInflate.progressSpinner.setIndeterminateTintList(ColorStateList.valueOf(ThemeManagerKt.getTheme().getTextMuted()));
    }
}
