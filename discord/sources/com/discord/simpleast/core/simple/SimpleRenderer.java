package com.discord.simpleast.core.simple;

import android.text.SpannableStringBuilder;
import android.widget.TextView;
import com.discord.simpleast.core.node.Node;
import com.discord.simpleast.core.parser.Parser;
import com.discord.simpleast.core.parser.Rule;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JA\u0010\u0003\u001a\u0002H\u0004\"\b\b\u0000\u0010\u0004*\u00020\u0005\"\u0004\b\u0001\u0010\u00062\u0006\u0010\u0007\u001a\u0002H\u00042\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\n0\t2\u0006\u0010\u000b\u001a\u0002H\u0006H\u0007¢\u0006\u0002\u0010\fJQ\u0010\u0003\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u001e\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u0002H\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\n\u0012\u0004\u0012\u0002H\r0\u00112\u0006\u0010\u000b\u001a\u0002H\u00062\u0006\u0010\u0012\u001a\u0002H\rH\u0007¢\u0006\u0002\u0010\u0013JW\u0010\u0003\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\r2\u0006\u0010\u000e\u001a\u00020\u000f2$\u0010\u0014\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u0002H\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\n\u0012\u0004\u0012\u0002H\r0\u00150\t2\u0006\u0010\u0012\u001a\u0002H\r2\u0006\u0010\u000b\u001a\u0002H\u0006H\u0007¢\u0006\u0002\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u001a\u0010\u0017\u001a\u00020\u00182\b\b\u0001\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u001aH\u0007¨\u0006\u001d"}, d2 = {"Lcom/discord/simpleast/core/simple/SimpleRenderer;", "", "()V", "render", "T", "Landroid/text/SpannableStringBuilder;", "R", "builder", "ast", "", "Lcom/discord/simpleast/core/node/Node;", "renderContext", "(Landroid/text/SpannableStringBuilder;Ljava/util/Collection;Ljava/lang/Object;)Landroid/text/SpannableStringBuilder;", "S", "source", "", "parser", "Lcom/discord/simpleast/core/parser/Parser;", "initialState", "(Ljava/lang/CharSequence;Lcom/discord/simpleast/core/parser/Parser;Ljava/lang/Object;Ljava/lang/Object;)Landroid/text/SpannableStringBuilder;", "rules", "Lcom/discord/simpleast/core/parser/Rule;", "(Ljava/lang/CharSequence;Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)Landroid/text/SpannableStringBuilder;", "renderBasicMarkdown", "", "textView", "Landroid/widget/TextView;", "sourceResId", "", "simpleast-core_release"}, k = 1, mv = {1, 4, 0})
public final class SimpleRenderer {
    public static final SimpleRenderer INSTANCE = new SimpleRenderer();

    private SimpleRenderer() {
    }

    @NotNull
    public static final <R, S> SpannableStringBuilder render(@NotNull CharSequence source, @NotNull Collection<? extends Rule<R, Node<R>, S>> rules, S initialState, R renderContext) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(rules, "rules");
        return render(new SpannableStringBuilder(), Parser.parse$default(new Parser(false, 1, null).addRules(rules), source, initialState, null, 4, null), renderContext);
    }

    public static final void renderBasicMarkdown(int sourceResId, @NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        String string = textView.getContext().getString(sourceResId);
        Intrinsics.checkNotNullExpressionValue(string, "textView.context.getString(sourceResId)");
        renderBasicMarkdown(string, textView);
    }

    @NotNull
    public static final <R, S> SpannableStringBuilder render(@NotNull CharSequence source, @NotNull Parser<R, Node<R>, S> parser, R renderContext, S initialState) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(parser, "parser");
        return render(new SpannableStringBuilder(), Parser.parse$default(parser, source, initialState, null, 4, null), renderContext);
    }

    public static final void renderBasicMarkdown(@NotNull CharSequence source, @NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(textView, "textView");
        textView.setText(renderBasicMarkdown(source));
    }

    @NotNull
    public static final <T extends SpannableStringBuilder, R> T render(@NotNull T builder, @NotNull Collection<? extends Node<R>> ast, R renderContext) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(ast, "ast");
        Iterator<? extends Node<R>> it = ast.iterator();
        while (it.hasNext()) {
            it.next().render(builder, renderContext);
        }
        return builder;
    }

    @NotNull
    public static final SpannableStringBuilder renderBasicMarkdown(@NotNull CharSequence source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return render(source, SimpleMarkdownRules.createSimpleMarkdownRules$default(false, false, 3, null), (Object) null, (Object) null);
    }
}
