package com.discord.react_strings;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import ar.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import n6.e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\u001a/\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a/\u0010\t\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\t\u0010\b\u001a/\u0010\u0007\u001a\u00020\u0005*\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\u000b\u001a/\u0010\u000e\u001a\u00020\r*\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroid/widget/TextView;", "Lcom/discord/react_strings/I18nMessage;", "i18nMessage", "Lkotlin/Function1;", "Lcom/discord/react_strings/RenderContext;", "", "initializer", "i18nContentDescription", "(Landroid/widget/TextView;Lcom/discord/react_strings/I18nMessage;Lkotlin/jvm/functions/Function1;)V", "i18nSetText", "Landroid/widget/ImageView;", "(Landroid/widget/ImageView;Lcom/discord/react_strings/I18nMessage;Lkotlin/jvm/functions/Function1;)V", "Landroid/content/Context;", "", "i18nFormat", "(Landroid/content/Context;Lcom/discord/react_strings/I18nMessage;Lkotlin/jvm/functions/Function1;)Ljava/lang/CharSequence;", "react_strings_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nI18nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 I18nUtils.kt\ncom/discord/react_strings/I18nUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,89:1\n1#2:90\n*E\n"})
public final class I18nUtilsKt {
    public static final void i18nContentDescription(@NotNull TextView textView, @NotNull I18nMessage i18nMessage, @NotNull Function1<? super RenderContext, Unit> initializer) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(i18nMessage, "i18nMessage");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        textView.setContentDescription(i18nFormat(context, i18nMessage, initializer));
    }

    public static /* synthetic */ void i18nContentDescription$default(TextView textView, I18nMessage i18nMessage, Function1 function1, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            function1 = new e(11);
        }
        i18nContentDescription(textView, i18nMessage, (Function1<? super RenderContext, Unit>) function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i18nContentDescription$lambda$0(RenderContext renderContext) {
        Intrinsics.checkNotNullParameter(renderContext, "<this>");
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i18nContentDescription$lambda$2(RenderContext renderContext) {
        Intrinsics.checkNotNullParameter(renderContext, "<this>");
        return Unit.f14616a;
    }

    @NotNull
    public static final CharSequence i18nFormat(@NotNull Context context, @NotNull I18nMessage i18nMessage, @NotNull Function1<? super RenderContext, Unit> initializer) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(i18nMessage, "i18nMessage");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        RenderContext renderContext = new RenderContext();
        initializer.invoke(renderContext);
        return RenderContext.Argument.INSTANCE.replace(i18nMessage.format$react_strings_release(context), new j(5, renderContext));
    }

    public static /* synthetic */ CharSequence i18nFormat$default(Context context, I18nMessage i18nMessage, Function1 function1, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            function1 = new e(9);
        }
        return i18nFormat(context, i18nMessage, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i18nFormat$lambda$3(RenderContext renderContext) {
        Intrinsics.checkNotNullParameter(renderContext, "<this>");
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence i18nFormat$lambda$5(RenderContext renderContext, String argName, String str, boolean z5) {
        Intrinsics.checkNotNullParameter(argName, "argName");
        String str2 = renderContext.getArgs().get(argName);
        return str2 != null ? str2 : argName;
    }

    public static final void i18nSetText(@NotNull TextView textView, @NotNull I18nMessage i18nMessage, @NotNull Function1<? super RenderContext, Unit> initializer) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(i18nMessage, "i18nMessage");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        textView.setText(i18nFormat(context, i18nMessage, initializer));
    }

    public static /* synthetic */ void i18nSetText$default(TextView textView, I18nMessage i18nMessage, Function1 function1, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            function1 = new e(12);
        }
        i18nSetText(textView, i18nMessage, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i18nSetText$lambda$1(RenderContext renderContext) {
        Intrinsics.checkNotNullParameter(renderContext, "<this>");
        return Unit.f14616a;
    }

    public static final void i18nContentDescription(@NotNull ImageView imageView, @NotNull I18nMessage i18nMessage, @NotNull Function1<? super RenderContext, Unit> initializer) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Intrinsics.checkNotNullParameter(i18nMessage, "i18nMessage");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        imageView.setContentDescription(i18nFormat(context, i18nMessage, initializer));
    }

    public static /* synthetic */ void i18nContentDescription$default(ImageView imageView, I18nMessage i18nMessage, Function1 function1, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            function1 = new e(10);
        }
        i18nContentDescription(imageView, i18nMessage, (Function1<? super RenderContext, Unit>) function1);
    }
}
