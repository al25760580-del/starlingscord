package com.discord.span.utilities;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.StrikethroughSpan;
import android.text.style.UnderlineSpan;
import app.rive.runtime.kotlin.fonts.Fonts;
import ar.u;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.y;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a%\u0010\b\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\b\u0010\t\u001aC\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\u0016\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\n\"\u0004\u0018\u00010\u00012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\fH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001aM\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\u0016\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\n\"\u0004\u0018\u00010\u00012\b\b\u0001\u0010\u0011\u001a\u00020\u00102\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\fH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u0012\u001a3\u0010\u0015\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\fH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a3\u0010\u0017\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\fH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0016\u001a+\u0010\u0018\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\fH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a+\u0010\u001a\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\fH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0019\u001a\u0011\u0010\u001c\u001a\u00020\u001b*\u00020\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001e"}, d2 = {"Landroid/text/SpannableStringBuilder;", "", "span", "", "ensureNewline", "(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;)V", "originalSpan", "newSpan", "replaceSpan", "(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;Ljava/lang/Object;)V", "", "spans", "Lkotlin/Function1;", "action", "wrapIn", "(Landroid/text/SpannableStringBuilder;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Landroid/text/SpannableStringBuilder;", "", "priority", "(Landroid/text/SpannableStringBuilder;[Ljava/lang/Object;ILkotlin/jvm/functions/Function1;)Landroid/text/SpannableStringBuilder;", "Landroid/content/Context;", "context", "bold", "(Landroid/text/SpannableStringBuilder;Landroid/content/Context;Lkotlin/jvm/functions/Function1;)Landroid/text/SpannableStringBuilder;", Fonts.Font.STYLE_ITALIC, "underline", "(Landroid/text/SpannableStringBuilder;Lkotlin/jvm/functions/Function1;)Landroid/text/SpannableStringBuilder;", "strikeThrough", "", "debugSpans", "(Landroid/text/SpannableStringBuilder;)Ljava/lang/String;", "span_utilities_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSpannableStringBuilderExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpannableStringBuilderExtensions.kt\ncom/discord/span/utilities/SpannableStringBuilderExtensionsKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,162:1\n43#1,4:163\n47#1:170\n43#1,4:176\n47#1:183\n43#1,4:184\n47#1:191\n43#1,4:192\n47#1:199\n43#1,4:200\n47#1:207\n13472#2:167\n13473#2:169\n13472#2:171\n13473#2:173\n13472#2,2:174\n13472#2:180\n13473#2:182\n13472#2:188\n13473#2:190\n13472#2:196\n13473#2:198\n13472#2:204\n13473#2:206\n1#3:168\n1#3:172\n1#3:181\n1#3:189\n1#3:197\n1#3:205\n*S KotlinDebug\n*F\n+ 1 SpannableStringBuilderExtensions.kt\ncom/discord/span/utilities/SpannableStringBuilderExtensionsKt\n*L\n20#1:163,4\n20#1:170\n70#1:176,4\n70#1:183\n78#1:184,4\n78#1:191\n85#1:192,4\n85#1:199\n92#1:200,4\n92#1:207\n20#1:167\n20#1:169\n46#1:171\n46#1:173\n61#1:174,2\n70#1:180\n70#1:182\n78#1:188\n78#1:190\n85#1:196\n85#1:198\n92#1:204\n92#1:206\n20#1:168\n70#1:181\n78#1:189\n85#1:197\n92#1:205\n*E\n"})
public final class SpannableStringBuilderExtensionsKt {
    @NotNull
    public static final SpannableStringBuilder bold(@NotNull SpannableStringBuilder spannableStringBuilder, @NotNull Context context, @NotNull Function1<? super SpannableStringBuilder, Unit> action) {
        Intrinsics.checkNotNullParameter(spannableStringBuilder, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(action, "action");
        Object[] objArr = {new GGSansBoldSpan(context)};
        int length = spannableStringBuilder.length();
        action.invoke(spannableStringBuilder);
        Object obj = objArr[0];
        if (obj != null) {
            spannableStringBuilder.setSpan(obj, length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    @NotNull
    public static final String debugSpans(@NotNull SpannableStringBuilder spannableStringBuilder) {
        Intrinsics.checkNotNullParameter(spannableStringBuilder, "<this>");
        Object[] spans = spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), Object.class);
        Intrinsics.checkNotNullExpressionValue(spans, "getSpans(...)");
        return y.A(spans, null, null, null, new u(5), 31);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence debugSpans$lambda$7(Object obj) {
        String simpleName = obj.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    public static final void ensureNewline(@NotNull SpannableStringBuilder spannableStringBuilder, Object obj) throws IOException {
        Intrinsics.checkNotNullParameter(spannableStringBuilder, "<this>");
        if (spannableStringBuilder.length() > 0) {
            Intrinsics.checkNotNullParameter(spannableStringBuilder, "<this>");
            Character chValueOf = spannableStringBuilder.length() == 0 ? null : Character.valueOf(spannableStringBuilder.charAt(spannableStringBuilder.length() - 1));
            if (chValueOf != null && chValueOf.charValue() == '\n') {
                return;
            }
            if (obj == null) {
                spannableStringBuilder.append('\n');
                return;
            }
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append('\n');
            Object obj2 = new Object[]{obj}[0];
            if (obj2 != null) {
                spannableStringBuilder.setSpan(obj2, length, spannableStringBuilder.length(), 33);
            }
        }
    }

    public static /* synthetic */ void ensureNewline$default(SpannableStringBuilder spannableStringBuilder, Object obj, int i7, Object obj2) throws IOException {
        if ((i7 & 1) != 0) {
            obj = null;
        }
        ensureNewline(spannableStringBuilder, obj);
    }

    @NotNull
    public static final SpannableStringBuilder italic(@NotNull SpannableStringBuilder spannableStringBuilder, @NotNull Context context, @NotNull Function1<? super SpannableStringBuilder, Unit> action) {
        Intrinsics.checkNotNullParameter(spannableStringBuilder, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(action, "action");
        Object[] objArr = {new GGSansItalicSpan(context)};
        int length = spannableStringBuilder.length();
        action.invoke(spannableStringBuilder);
        Object obj = objArr[0];
        if (obj != null) {
            spannableStringBuilder.setSpan(obj, length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    public static final void replaceSpan(@NotNull SpannableStringBuilder spannableStringBuilder, Object obj, Object obj2) {
        int spanEnd;
        Intrinsics.checkNotNullParameter(spannableStringBuilder, "<this>");
        int spanStart = spannableStringBuilder.getSpanStart(obj);
        if (spanStart == -1 || (spanEnd = spannableStringBuilder.getSpanEnd(obj)) == -1) {
            return;
        }
        int spanFlags = spannableStringBuilder.getSpanFlags(obj);
        spannableStringBuilder.removeSpan(obj);
        spannableStringBuilder.setSpan(obj2, spanStart, spanEnd, spanFlags);
    }

    @NotNull
    public static final SpannableStringBuilder strikeThrough(@NotNull SpannableStringBuilder spannableStringBuilder, @NotNull Function1<? super SpannableStringBuilder, Unit> action) {
        Intrinsics.checkNotNullParameter(spannableStringBuilder, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        Object[] objArr = {new StrikethroughSpan()};
        int length = spannableStringBuilder.length();
        action.invoke(spannableStringBuilder);
        Object obj = objArr[0];
        if (obj != null) {
            spannableStringBuilder.setSpan(obj, length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    @NotNull
    public static final SpannableStringBuilder underline(@NotNull SpannableStringBuilder spannableStringBuilder, @NotNull Function1<? super SpannableStringBuilder, Unit> action) {
        Intrinsics.checkNotNullParameter(spannableStringBuilder, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        Object[] objArr = {new UnderlineSpan()};
        int length = spannableStringBuilder.length();
        action.invoke(spannableStringBuilder);
        Object obj = objArr[0];
        if (obj != null) {
            spannableStringBuilder.setSpan(obj, length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    @NotNull
    public static final SpannableStringBuilder wrapIn(@NotNull SpannableStringBuilder spannableStringBuilder, @NotNull Object[] spans, @NotNull Function1<? super SpannableStringBuilder, Unit> action) {
        Intrinsics.checkNotNullParameter(spannableStringBuilder, "<this>");
        Intrinsics.checkNotNullParameter(spans, "spans");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = spannableStringBuilder.length();
        action.invoke(spannableStringBuilder);
        for (Object obj : spans) {
            if (obj != null) {
                spannableStringBuilder.setSpan(obj, length, spannableStringBuilder.length(), 33);
            }
        }
        return spannableStringBuilder;
    }

    @NotNull
    public static final SpannableStringBuilder wrapIn(@NotNull SpannableStringBuilder spannableStringBuilder, @NotNull Object[] spans, int i7, @NotNull Function1<? super SpannableStringBuilder, Unit> action) {
        Intrinsics.checkNotNullParameter(spannableStringBuilder, "<this>");
        Intrinsics.checkNotNullParameter(spans, "spans");
        Intrinsics.checkNotNullParameter(action, "action");
        int i10 = (i7 << 16) | 33;
        int length = spannableStringBuilder.length();
        action.invoke(spannableStringBuilder);
        for (Object obj : spans) {
            if (obj != null) {
                spannableStringBuilder.setSpan(obj, length, spannableStringBuilder.length(), i10);
            }
        }
        return spannableStringBuilder;
    }
}
