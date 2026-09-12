package com.discord.chat.presentation.separator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.R;
import com.discord.chat.databinding.SeparatorViewBinding;
import com.discord.chat.presentation.list.ChatListConstraintLayout;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\rJ\u000e\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/discord/chat/presentation/separator/SeparatorView;", "Lcom/discord/chat/presentation/list/ChatListConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/discord/chat/databinding/SeparatorViewBinding;", "setTextColor", "", ViewProps.COLOR, "", "setBarColor", "setText", "text", "", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSeparatorView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SeparatorView.kt\ncom/discord/chat/presentation/separator/SeparatorView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,44:1\n146#2,8:45\n*S KotlinDebug\n*F\n+ 1 SeparatorView.kt\ncom/discord/chat/presentation/separator/SeparatorView\n*L\n26#1:45,8\n*E\n"})
public final class SeparatorView extends ChatListConstraintLayout {

    @NotNull
    private final SeparatorViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SeparatorView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setBarColor(int color) {
        this.binding.leftBar.setBackgroundColor(color);
        this.binding.rightBar.setBackgroundColor(color);
    }

    public final void setText(@NotNull CharSequence text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.binding.middleText.setText(text);
    }

    public final void setTextColor(int color) {
        this.binding.middleText.setTextColor(color);
    }

    public /* synthetic */ SeparatorView(Context context, AttributeSet attributeSet, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeparatorView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        SeparatorViewBinding separatorViewBindingInflate = SeparatorViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(separatorViewBindingInflate, "inflate(...)");
        this.binding = separatorViewBindingInflate;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.message_horizontal_spacing);
        View root = separatorViewBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        root.setPaddingRelative(dimensionPixelSize, root.getPaddingTop(), dimensionPixelSize, root.getPaddingBottom());
        TextView middleText = separatorViewBindingInflate.middleText;
        Intrinsics.checkNotNullExpressionValue(middleText, "middleText");
        DiscordFontUtilsKt.setDiscordFont(middleText, DiscordFont.PrimarySemibold);
        TextView middleText2 = separatorViewBindingInflate.middleText;
        Intrinsics.checkNotNullExpressionValue(middleText2, "middleText");
        SetTextSizeSpKt.setTextSizeSp(middleText2, 12.0f);
    }
}
