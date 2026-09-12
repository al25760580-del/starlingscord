package com.discord.chat.presentation.textutils;

import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.RelativeSizeSpan;
import com.discord.chat.bridge.contentnode.CodeBlockContentNode;
import com.discord.chat.presentation.textutils.CodeStyle;
import com.discord.chat.presentation.textutils.RenderContext;
import com.discord.fonts.DiscordFont;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.simpleast.code.CodeRules;
import com.discord.simpleast.code.CodeStyleProviders;
import com.discord.simpleast.core.node.Node;
import com.discord.simpleast.core.node.StyleNode;
import com.discord.simpleast.core.node.TextNode;
import com.discord.simpleast.core.parser.Parser;
import com.discord.simpleast.core.parser.Rule;
import com.discord.simpleast.core.simple.SimpleRenderer;
import com.discord.span.utilities.SpannableStringBuilderExtensionsKt;
import com.discord.span.utilities.spannable.BlockBackgroundSpan;
import com.discord.span.utilities.spannable.VerticalPaddingSpan;
import com.facebook.drawee.span.DraweeSpanStringBuilder;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import i5.a;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.c0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import rn.l;
import rn.q;
import rn.r;
import s0.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\t0\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J \u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0006H\u0002J\u001e\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0006R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R7\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\t\u0012\u0004\u0012\u00020\u00010\bj\u0002`\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/discord/chat/presentation/textutils/CodeStyle;", "", "<init>", "()V", "codeStyles", "Lcom/discord/simpleast/code/CodeStyleProviders;", "Lcom/discord/chat/presentation/textutils/RenderContext;", "parser", "Lcom/discord/simpleast/core/parser/Parser;", "Lcom/discord/simpleast/core/node/Node;", "Lcom/discord/chat/presentation/textutils/CodeParser;", "getParser", "()Lcom/discord/simpleast/core/parser/Parser;", "parser$delegate", "Lkotlin/Lazy;", "generateAst", "", "node", "Lcom/discord/chat/bridge/contentnode/CodeBlockContentNode;", "renderCode", "", "builder", "Lcom/facebook/drawee/span/DraweeSpanStringBuilder;", "rc", "renderCodeBlock", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCodeStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CodeStyle.kt\ncom/discord/chat/presentation/textutils/CodeStyle\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SpannableStringBuilderExtensions.kt\ncom/discord/span/utilities/SpannableStringBuilderExtensionsKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,93:1\n1#2:94\n1#2:100\n43#3,4:95\n47#3:102\n13472#4:99\n13473#4:101\n*S KotlinDebug\n*F\n+ 1 CodeStyle.kt\ncom/discord/chat/presentation/textutils/CodeStyle\n*L\n80#1:100\n80#1:95,4\n80#1:102\n80#1:99\n80#1:101\n*E\n"})
public final class CodeStyle {

    @NotNull
    public static final CodeStyle INSTANCE = new CodeStyle();

    @NotNull
    private static final CodeStyleProviders<RenderContext> codeStyles;

    /* JADX INFO: renamed from: parser$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy parser;

    static {
        final int i7 = 0;
        StyleNode.SpanProvider spanProvider = new StyleNode.SpanProvider() { // from class: n6.a
            @Override // com.discord.simpleast.core.node.StyleNode.SpanProvider
            public final Iterable get(Object obj) {
                RenderContext renderContext = (RenderContext) obj;
                switch (i7) {
                    case 0:
                        return CodeStyle.codeStyles$lambda$0(renderContext);
                    case 1:
                        return CodeStyle.codeStyles$lambda$9(renderContext);
                    case 2:
                        return CodeStyle.codeStyles$lambda$1(renderContext);
                    case 3:
                        return CodeStyle.codeStyles$lambda$2(renderContext);
                    case 4:
                        return CodeStyle.codeStyles$lambda$3(renderContext);
                    case 5:
                        return CodeStyle.codeStyles$lambda$4(renderContext);
                    case 6:
                        return CodeStyle.codeStyles$lambda$5(renderContext);
                    case 7:
                        return CodeStyle.codeStyles$lambda$6(renderContext);
                    case 8:
                        return CodeStyle.codeStyles$lambda$7(renderContext);
                    default:
                        return CodeStyle.codeStyles$lambda$8(renderContext);
                }
            }
        };
        final int i10 = 2;
        StyleNode.SpanProvider spanProvider2 = new StyleNode.SpanProvider() { // from class: n6.a
            @Override // com.discord.simpleast.core.node.StyleNode.SpanProvider
            public final Iterable get(Object obj) {
                RenderContext renderContext = (RenderContext) obj;
                switch (i10) {
                    case 0:
                        return CodeStyle.codeStyles$lambda$0(renderContext);
                    case 1:
                        return CodeStyle.codeStyles$lambda$9(renderContext);
                    case 2:
                        return CodeStyle.codeStyles$lambda$1(renderContext);
                    case 3:
                        return CodeStyle.codeStyles$lambda$2(renderContext);
                    case 4:
                        return CodeStyle.codeStyles$lambda$3(renderContext);
                    case 5:
                        return CodeStyle.codeStyles$lambda$4(renderContext);
                    case 6:
                        return CodeStyle.codeStyles$lambda$5(renderContext);
                    case 7:
                        return CodeStyle.codeStyles$lambda$6(renderContext);
                    case 8:
                        return CodeStyle.codeStyles$lambda$7(renderContext);
                    default:
                        return CodeStyle.codeStyles$lambda$8(renderContext);
                }
            }
        };
        final int i11 = 3;
        StyleNode.SpanProvider spanProvider3 = new StyleNode.SpanProvider() { // from class: n6.a
            @Override // com.discord.simpleast.core.node.StyleNode.SpanProvider
            public final Iterable get(Object obj) {
                RenderContext renderContext = (RenderContext) obj;
                switch (i11) {
                    case 0:
                        return CodeStyle.codeStyles$lambda$0(renderContext);
                    case 1:
                        return CodeStyle.codeStyles$lambda$9(renderContext);
                    case 2:
                        return CodeStyle.codeStyles$lambda$1(renderContext);
                    case 3:
                        return CodeStyle.codeStyles$lambda$2(renderContext);
                    case 4:
                        return CodeStyle.codeStyles$lambda$3(renderContext);
                    case 5:
                        return CodeStyle.codeStyles$lambda$4(renderContext);
                    case 6:
                        return CodeStyle.codeStyles$lambda$5(renderContext);
                    case 7:
                        return CodeStyle.codeStyles$lambda$6(renderContext);
                    case 8:
                        return CodeStyle.codeStyles$lambda$7(renderContext);
                    default:
                        return CodeStyle.codeStyles$lambda$8(renderContext);
                }
            }
        };
        final int i12 = 4;
        StyleNode.SpanProvider spanProvider4 = new StyleNode.SpanProvider() { // from class: n6.a
            @Override // com.discord.simpleast.core.node.StyleNode.SpanProvider
            public final Iterable get(Object obj) {
                RenderContext renderContext = (RenderContext) obj;
                switch (i12) {
                    case 0:
                        return CodeStyle.codeStyles$lambda$0(renderContext);
                    case 1:
                        return CodeStyle.codeStyles$lambda$9(renderContext);
                    case 2:
                        return CodeStyle.codeStyles$lambda$1(renderContext);
                    case 3:
                        return CodeStyle.codeStyles$lambda$2(renderContext);
                    case 4:
                        return CodeStyle.codeStyles$lambda$3(renderContext);
                    case 5:
                        return CodeStyle.codeStyles$lambda$4(renderContext);
                    case 6:
                        return CodeStyle.codeStyles$lambda$5(renderContext);
                    case 7:
                        return CodeStyle.codeStyles$lambda$6(renderContext);
                    case 8:
                        return CodeStyle.codeStyles$lambda$7(renderContext);
                    default:
                        return CodeStyle.codeStyles$lambda$8(renderContext);
                }
            }
        };
        final int i13 = 5;
        StyleNode.SpanProvider spanProvider5 = new StyleNode.SpanProvider() { // from class: n6.a
            @Override // com.discord.simpleast.core.node.StyleNode.SpanProvider
            public final Iterable get(Object obj) {
                RenderContext renderContext = (RenderContext) obj;
                switch (i13) {
                    case 0:
                        return CodeStyle.codeStyles$lambda$0(renderContext);
                    case 1:
                        return CodeStyle.codeStyles$lambda$9(renderContext);
                    case 2:
                        return CodeStyle.codeStyles$lambda$1(renderContext);
                    case 3:
                        return CodeStyle.codeStyles$lambda$2(renderContext);
                    case 4:
                        return CodeStyle.codeStyles$lambda$3(renderContext);
                    case 5:
                        return CodeStyle.codeStyles$lambda$4(renderContext);
                    case 6:
                        return CodeStyle.codeStyles$lambda$5(renderContext);
                    case 7:
                        return CodeStyle.codeStyles$lambda$6(renderContext);
                    case 8:
                        return CodeStyle.codeStyles$lambda$7(renderContext);
                    default:
                        return CodeStyle.codeStyles$lambda$8(renderContext);
                }
            }
        };
        final int i14 = 6;
        StyleNode.SpanProvider spanProvider6 = new StyleNode.SpanProvider() { // from class: n6.a
            @Override // com.discord.simpleast.core.node.StyleNode.SpanProvider
            public final Iterable get(Object obj) {
                RenderContext renderContext = (RenderContext) obj;
                switch (i14) {
                    case 0:
                        return CodeStyle.codeStyles$lambda$0(renderContext);
                    case 1:
                        return CodeStyle.codeStyles$lambda$9(renderContext);
                    case 2:
                        return CodeStyle.codeStyles$lambda$1(renderContext);
                    case 3:
                        return CodeStyle.codeStyles$lambda$2(renderContext);
                    case 4:
                        return CodeStyle.codeStyles$lambda$3(renderContext);
                    case 5:
                        return CodeStyle.codeStyles$lambda$4(renderContext);
                    case 6:
                        return CodeStyle.codeStyles$lambda$5(renderContext);
                    case 7:
                        return CodeStyle.codeStyles$lambda$6(renderContext);
                    case 8:
                        return CodeStyle.codeStyles$lambda$7(renderContext);
                    default:
                        return CodeStyle.codeStyles$lambda$8(renderContext);
                }
            }
        };
        final int i15 = 7;
        StyleNode.SpanProvider spanProvider7 = new StyleNode.SpanProvider() { // from class: n6.a
            @Override // com.discord.simpleast.core.node.StyleNode.SpanProvider
            public final Iterable get(Object obj) {
                RenderContext renderContext = (RenderContext) obj;
                switch (i15) {
                    case 0:
                        return CodeStyle.codeStyles$lambda$0(renderContext);
                    case 1:
                        return CodeStyle.codeStyles$lambda$9(renderContext);
                    case 2:
                        return CodeStyle.codeStyles$lambda$1(renderContext);
                    case 3:
                        return CodeStyle.codeStyles$lambda$2(renderContext);
                    case 4:
                        return CodeStyle.codeStyles$lambda$3(renderContext);
                    case 5:
                        return CodeStyle.codeStyles$lambda$4(renderContext);
                    case 6:
                        return CodeStyle.codeStyles$lambda$5(renderContext);
                    case 7:
                        return CodeStyle.codeStyles$lambda$6(renderContext);
                    case 8:
                        return CodeStyle.codeStyles$lambda$7(renderContext);
                    default:
                        return CodeStyle.codeStyles$lambda$8(renderContext);
                }
            }
        };
        final int i16 = 8;
        StyleNode.SpanProvider spanProvider8 = new StyleNode.SpanProvider() { // from class: n6.a
            @Override // com.discord.simpleast.core.node.StyleNode.SpanProvider
            public final Iterable get(Object obj) {
                RenderContext renderContext = (RenderContext) obj;
                switch (i16) {
                    case 0:
                        return CodeStyle.codeStyles$lambda$0(renderContext);
                    case 1:
                        return CodeStyle.codeStyles$lambda$9(renderContext);
                    case 2:
                        return CodeStyle.codeStyles$lambda$1(renderContext);
                    case 3:
                        return CodeStyle.codeStyles$lambda$2(renderContext);
                    case 4:
                        return CodeStyle.codeStyles$lambda$3(renderContext);
                    case 5:
                        return CodeStyle.codeStyles$lambda$4(renderContext);
                    case 6:
                        return CodeStyle.codeStyles$lambda$5(renderContext);
                    case 7:
                        return CodeStyle.codeStyles$lambda$6(renderContext);
                    case 8:
                        return CodeStyle.codeStyles$lambda$7(renderContext);
                    default:
                        return CodeStyle.codeStyles$lambda$8(renderContext);
                }
            }
        };
        final int i17 = 9;
        StyleNode.SpanProvider spanProvider9 = new StyleNode.SpanProvider() { // from class: n6.a
            @Override // com.discord.simpleast.core.node.StyleNode.SpanProvider
            public final Iterable get(Object obj) {
                RenderContext renderContext = (RenderContext) obj;
                switch (i17) {
                    case 0:
                        return CodeStyle.codeStyles$lambda$0(renderContext);
                    case 1:
                        return CodeStyle.codeStyles$lambda$9(renderContext);
                    case 2:
                        return CodeStyle.codeStyles$lambda$1(renderContext);
                    case 3:
                        return CodeStyle.codeStyles$lambda$2(renderContext);
                    case 4:
                        return CodeStyle.codeStyles$lambda$3(renderContext);
                    case 5:
                        return CodeStyle.codeStyles$lambda$4(renderContext);
                    case 6:
                        return CodeStyle.codeStyles$lambda$5(renderContext);
                    case 7:
                        return CodeStyle.codeStyles$lambda$6(renderContext);
                    case 8:
                        return CodeStyle.codeStyles$lambda$7(renderContext);
                    default:
                        return CodeStyle.codeStyles$lambda$8(renderContext);
                }
            }
        };
        final int i18 = 1;
        codeStyles = new CodeStyleProviders<>(spanProvider, spanProvider2, spanProvider3, spanProvider4, spanProvider5, spanProvider6, spanProvider7, spanProvider8, spanProvider9, new StyleNode.SpanProvider() { // from class: n6.a
            @Override // com.discord.simpleast.core.node.StyleNode.SpanProvider
            public final Iterable get(Object obj) {
                RenderContext renderContext = (RenderContext) obj;
                switch (i18) {
                    case 0:
                        return CodeStyle.codeStyles$lambda$0(renderContext);
                    case 1:
                        return CodeStyle.codeStyles$lambda$9(renderContext);
                    case 2:
                        return CodeStyle.codeStyles$lambda$1(renderContext);
                    case 3:
                        return CodeStyle.codeStyles$lambda$2(renderContext);
                    case 4:
                        return CodeStyle.codeStyles$lambda$3(renderContext);
                    case 5:
                        return CodeStyle.codeStyles$lambda$4(renderContext);
                    case 6:
                        return CodeStyle.codeStyles$lambda$5(renderContext);
                    case 7:
                        return CodeStyle.codeStyles$lambda$6(renderContext);
                    case 8:
                        return CodeStyle.codeStyles$lambda$7(renderContext);
                    default:
                        return CodeStyle.codeStyles$lambda$8(renderContext);
                }
            }
        });
        parser = l.b(new a(21));
    }

    private CodeStyle() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable codeStyles$lambda$0(RenderContext it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return c0.c(new ForegroundColorSpan(it.getTheme().getTextCode()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable codeStyles$lambda$1(RenderContext it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return c0.c(new ForegroundColorSpan(it.getTheme().getTextCodeComment()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable codeStyles$lambda$2(RenderContext it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return c0.c(new ForegroundColorSpan(it.getTheme().getTextCodeString()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable codeStyles$lambda$3(RenderContext it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return c0.c(new ForegroundColorSpan(it.getTheme().getTextCodeKeyword()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable codeStyles$lambda$4(RenderContext it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return c0.c(new ForegroundColorSpan(it.getTheme().getTextCodeTitle()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable codeStyles$lambda$5(RenderContext it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return c0.c(new ForegroundColorSpan(it.getTheme().getTextCodeType()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable codeStyles$lambda$6(RenderContext it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return c0.c(new ForegroundColorSpan(it.getTheme().getTextCodeBuiltin()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable codeStyles$lambda$7(RenderContext it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return c0.c(new ForegroundColorSpan(it.getTheme().getTextCodeProperty()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable codeStyles$lambda$8(RenderContext it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return c0.c(new ForegroundColorSpan(it.getTheme().getTextCodeAddition()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable codeStyles$lambda$9(RenderContext it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return c0.c(new ForegroundColorSpan(it.getTheme().getTextCodeDeletion()));
    }

    private final List<Node<RenderContext>> generateAst(CodeBlockContentNode node) {
        Object objO;
        String string = StringsKt.b0(node.getLang()).toString();
        String content = node.getContent();
        String strF = g.f("```", string, ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, content, "\n```");
        try {
            q qVar = Result.f14614e;
            objO = Parser.parse$default(getParser(), strF, Unit.f14616a, null, 4, null);
        } catch (Throwable th2) {
            q qVar2 = Result.f14614e;
            objO = ib.a.o(th2);
        }
        Object objC = c0.c(new TextNode(content));
        if (objO instanceof r) {
            objO = objC;
        }
        return (List) objO;
    }

    private final Parser<RenderContext, Node<RenderContext>, Object> getParser() {
        return (Parser) parser.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Parser parser_delegate$lambda$11() {
        CodeRules codeRules = CodeRules.INSTANCE;
        CodeStyleProviders<RenderContext> codeStyleProviders = codeStyles;
        Rule ruleCreateCodeRule$default = CodeRules.createCodeRule$default(codeRules, codeStyleProviders.getDefaultStyleProvider(), codeRules.createCodeLanguageMap(codeStyleProviders), null, 4, null);
        boolean z5 = false;
        Parser parser2 = new Parser(z5, 1, null);
        parser2.addRule(ruleCreateCodeRule$default);
        return parser2;
    }

    private final void renderCode(DraweeSpanStringBuilder builder, CodeBlockContentNode node, RenderContext rc2) {
        SimpleRenderer.render(builder, generateAst(node), rc2);
    }

    public final void renderCodeBlock(@NotNull DraweeSpanStringBuilder builder, @NotNull CodeBlockContentNode node, @NotNull RenderContext rc2) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(rc2, "rc");
        BlockBackgroundSpan blockBackgroundSpan = new BlockBackgroundSpan(rc2.spoilerIsHidden() ? rc2.getTheme().getSpoilerHiddenBackground() : rc2.getTheme().getBackgroundCode(), rc2.getTheme().getBorderNormal(), SizeUtilsKt.getDpToPx(1), SizeUtilsKt.getDpToPx(4), rc2.getInsets().getStart(), rc2.getInsets().getTop(), rc2.getInsets().getBottom());
        int dpToPx = SizeUtilsKt.getDpToPx(4);
        LeadingMarginSpan.Standard standard = new LeadingMarginSpan.Standard(SizeUtilsKt.getDpToPx(8));
        VerticalPaddingSpan verticalPaddingSpan = new VerticalPaddingSpan(SizeUtilsKt.getDpToPx(4));
        RelativeSizeSpan relativeSizeSpan = new RelativeSizeSpan(0.85f);
        DiscordFontSpan discordFontSpan = new DiscordFontSpan(rc2.getContext(), DiscordFont.CodeNormal);
        SpannableStringBuilderExtensionsKt.ensureNewline$default(builder, null, 1, null);
        Object[] objArr = {blockBackgroundSpan, standard, verticalPaddingSpan, relativeSizeSpan, discordFontSpan};
        int length = builder.length();
        SpannableStringBuilderExtensionsKt.ensureNewline(builder, new AbsoluteSizeSpan(dpToPx));
        INSTANCE.renderCode(builder, node, rc2);
        SpannableStringBuilderExtensionsKt.ensureNewline(builder, new AbsoluteSizeSpan(dpToPx));
        for (int i7 = 0; i7 < 5; i7++) {
            Object obj = objArr[i7];
            if (obj != null) {
                builder.setSpan(obj, length, builder.length(), 33);
            }
        }
    }
}
