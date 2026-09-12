package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.databinding.EmbedFieldViewBinding;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.image.fresco.SimpleDraweeSpanTextViewUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.span.utilities.BackgroundSpanDrawer;
import com.discord.span.utilities.SpannableExtensionsKt;
import com.discord.theme.R;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.span.DraweeSpanStringBuilder;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.react.devsupport.StackTraceHelper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ,\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000f0\u0015J,\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000f0\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/discord/chat/presentation/message/view/EmbedFieldView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/discord/chat/databinding/EmbedFieldViewBinding;", "getBinding", "()Lcom/discord/chat/databinding/EmbedFieldViewBinding;", "setName", "", "rawName", "", StackTraceHelper.NAME_KEY, "Lcom/facebook/drawee/span/DraweeSpanStringBuilder;", "onTapCopyText", "Lkotlin/Function1;", "", "setValue", "rawValue", "value", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEmbedFieldView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmbedFieldView.kt\ncom/discord/chat/presentation/message/view/EmbedFieldView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,83:1\n1#2:84\n*E\n"})
public final class EmbedFieldView extends LinearLayout {

    @NotNull
    private final EmbedFieldViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmbedFieldView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setName$lambda$5$lambda$4$lambda$3(Function1 function1, String str, View view) {
        function1.invoke(str);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setValue$lambda$9$lambda$8$lambda$7(Function1 function1, String str, View view) {
        function1.invoke(str);
        return true;
    }

    @NotNull
    public final EmbedFieldViewBinding getBinding() {
        return this.binding;
    }

    public final void setName(@NotNull String rawName, DraweeSpanStringBuilder name, @NotNull Function1<? super CharSequence, Unit> onTapCopyText) {
        DraweeSpanStringBuilder draweeSpanStringBuilder;
        Intrinsics.checkNotNullParameter(rawName, "rawName");
        Intrinsics.checkNotNullParameter(onTapCopyText, "onTapCopyText");
        SimpleDraweeSpanTextView simpleDraweeSpanTextView = this.binding.name;
        Intrinsics.checkNotNull(simpleDraweeSpanTextView);
        if (name != null) {
            SpannableExtensionsKt.coverWithSpan(name, new BackgroundSpanDrawer(simpleDraweeSpanTextView));
            draweeSpanStringBuilder = name;
        } else {
            draweeSpanStringBuilder = null;
        }
        SimpleDraweeSpanTextViewUtilsKt.setOptionalText(simpleDraweeSpanTextView, draweeSpanStringBuilder);
        NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(simpleDraweeSpanTextView, false, name != null ? new i(1, rawName, onTapCopyText) : null, 1, null);
    }

    public final void setValue(@NotNull String rawValue, DraweeSpanStringBuilder value, @NotNull Function1<? super CharSequence, Unit> onTapCopyText) {
        DraweeSpanStringBuilder draweeSpanStringBuilder;
        Intrinsics.checkNotNullParameter(rawValue, "rawValue");
        Intrinsics.checkNotNullParameter(onTapCopyText, "onTapCopyText");
        SimpleDraweeSpanTextView simpleDraweeSpanTextView = this.binding.value;
        Intrinsics.checkNotNull(simpleDraweeSpanTextView);
        if (value != null) {
            SpannableExtensionsKt.coverWithSpan(value, new BackgroundSpanDrawer(simpleDraweeSpanTextView));
            draweeSpanStringBuilder = value;
        } else {
            draweeSpanStringBuilder = null;
        }
        SimpleDraweeSpanTextViewUtilsKt.setOptionalText(simpleDraweeSpanTextView, draweeSpanStringBuilder);
        NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(simpleDraweeSpanTextView, false, value != null ? new i(0, rawValue, onTapCopyText) : null, 1, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmbedFieldView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ EmbedFieldView(Context context, AttributeSet attributeSet, int i7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? 0 : i7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmbedFieldView(@NotNull Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        EmbedFieldViewBinding embedFieldViewBindingInflate = EmbedFieldViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(embedFieldViewBindingInflate, "inflate(...)");
        this.binding = embedFieldViewBindingInflate;
        setOrientation(1);
        SimpleDraweeSpanTextView simpleDraweeSpanTextView = embedFieldViewBindingInflate.name;
        simpleDraweeSpanTextView.setTextColor(ColorUtilsKt.getThemeColor(context, R.color.primary_500, R.color.primary_100));
        Intrinsics.checkNotNull(simpleDraweeSpanTextView);
        DiscordFontUtilsKt.setDiscordFont(simpleDraweeSpanTextView, DiscordFont.PrimarySemibold);
        SimpleDraweeSpanTextView simpleDraweeSpanTextView2 = embedFieldViewBindingInflate.value;
        Intrinsics.checkNotNull(simpleDraweeSpanTextView2);
        SetTextSizeSpKt.setTextSizeSp(simpleDraweeSpanTextView2, 14.0f);
        DiscordFontUtilsKt.setDiscordFont(simpleDraweeSpanTextView2, DiscordFont.PrimaryMedium);
        simpleDraweeSpanTextView2.setTextColor(ThemeManagerKt.getTheme().getTextDefault());
    }
}
