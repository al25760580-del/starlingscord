package com.discord.simpleast.code;

import com.discord.simpleast.core.node.StyleNode;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B¥\u0001\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u000eJ\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u0004HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004HÆ\u0003J¯\u0001\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004HÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006,"}, d2 = {"Lcom/discord/simpleast/code/CodeStyleProviders;", "R", "", "defaultStyleProvider", "Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;", "commentStyleProvider", "literalStyleProvider", "keywordStyleProvider", "identifierStyleProvider", "typesStyleProvider", "genericsStyleProvider", "paramsStyleProvider", "additionStyleProvider", "deletionStyleProvider", "(Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;)V", "getAdditionStyleProvider", "()Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;", "getCommentStyleProvider", "getDefaultStyleProvider", "getDeletionStyleProvider", "getGenericsStyleProvider", "getIdentifierStyleProvider", "getKeywordStyleProvider", "getLiteralStyleProvider", "getParamsStyleProvider", "getTypesStyleProvider", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "", "simpleast-core_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class CodeStyleProviders<R> {

    @NotNull
    private final StyleNode.SpanProvider<R> additionStyleProvider;

    @NotNull
    private final StyleNode.SpanProvider<R> commentStyleProvider;

    @NotNull
    private final StyleNode.SpanProvider<R> defaultStyleProvider;

    @NotNull
    private final StyleNode.SpanProvider<R> deletionStyleProvider;

    @NotNull
    private final StyleNode.SpanProvider<R> genericsStyleProvider;

    @NotNull
    private final StyleNode.SpanProvider<R> identifierStyleProvider;

    @NotNull
    private final StyleNode.SpanProvider<R> keywordStyleProvider;

    @NotNull
    private final StyleNode.SpanProvider<R> literalStyleProvider;

    @NotNull
    private final StyleNode.SpanProvider<R> paramsStyleProvider;

    @NotNull
    private final StyleNode.SpanProvider<R> typesStyleProvider;

    public CodeStyleProviders() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CodeStyleProviders copy$default(CodeStyleProviders codeStyleProviders, StyleNode.SpanProvider spanProvider, StyleNode.SpanProvider spanProvider2, StyleNode.SpanProvider spanProvider3, StyleNode.SpanProvider spanProvider4, StyleNode.SpanProvider spanProvider5, StyleNode.SpanProvider spanProvider6, StyleNode.SpanProvider spanProvider7, StyleNode.SpanProvider spanProvider8, StyleNode.SpanProvider spanProvider9, StyleNode.SpanProvider spanProvider10, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            spanProvider = codeStyleProviders.defaultStyleProvider;
        }
        if ((i7 & 2) != 0) {
            spanProvider2 = codeStyleProviders.commentStyleProvider;
        }
        if ((i7 & 4) != 0) {
            spanProvider3 = codeStyleProviders.literalStyleProvider;
        }
        if ((i7 & 8) != 0) {
            spanProvider4 = codeStyleProviders.keywordStyleProvider;
        }
        if ((i7 & 16) != 0) {
            spanProvider5 = codeStyleProviders.identifierStyleProvider;
        }
        if ((i7 & 32) != 0) {
            spanProvider6 = codeStyleProviders.typesStyleProvider;
        }
        if ((i7 & 64) != 0) {
            spanProvider7 = codeStyleProviders.genericsStyleProvider;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            spanProvider8 = codeStyleProviders.paramsStyleProvider;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
            spanProvider9 = codeStyleProviders.additionStyleProvider;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0) {
            spanProvider10 = codeStyleProviders.deletionStyleProvider;
        }
        StyleNode.SpanProvider spanProvider11 = spanProvider9;
        StyleNode.SpanProvider spanProvider12 = spanProvider10;
        StyleNode.SpanProvider spanProvider13 = spanProvider7;
        StyleNode.SpanProvider spanProvider14 = spanProvider8;
        StyleNode.SpanProvider spanProvider15 = spanProvider5;
        StyleNode.SpanProvider spanProvider16 = spanProvider6;
        return codeStyleProviders.copy(spanProvider, spanProvider2, spanProvider3, spanProvider4, spanProvider15, spanProvider16, spanProvider13, spanProvider14, spanProvider11, spanProvider12);
    }

    @NotNull
    public final StyleNode.SpanProvider<R> component1() {
        return this.defaultStyleProvider;
    }

    @NotNull
    public final StyleNode.SpanProvider<R> component10() {
        return this.deletionStyleProvider;
    }

    @NotNull
    public final StyleNode.SpanProvider<R> component2() {
        return this.commentStyleProvider;
    }

    @NotNull
    public final StyleNode.SpanProvider<R> component3() {
        return this.literalStyleProvider;
    }

    @NotNull
    public final StyleNode.SpanProvider<R> component4() {
        return this.keywordStyleProvider;
    }

    @NotNull
    public final StyleNode.SpanProvider<R> component5() {
        return this.identifierStyleProvider;
    }

    @NotNull
    public final StyleNode.SpanProvider<R> component6() {
        return this.typesStyleProvider;
    }

    @NotNull
    public final StyleNode.SpanProvider<R> component7() {
        return this.genericsStyleProvider;
    }

    @NotNull
    public final StyleNode.SpanProvider<R> component8() {
        return this.paramsStyleProvider;
    }

    @NotNull
    public final StyleNode.SpanProvider<R> component9() {
        return this.additionStyleProvider;
    }

    @NotNull
    public final CodeStyleProviders<R> copy(@NotNull StyleNode.SpanProvider<R> defaultStyleProvider, @NotNull StyleNode.SpanProvider<R> commentStyleProvider, @NotNull StyleNode.SpanProvider<R> literalStyleProvider, @NotNull StyleNode.SpanProvider<R> keywordStyleProvider, @NotNull StyleNode.SpanProvider<R> identifierStyleProvider, @NotNull StyleNode.SpanProvider<R> typesStyleProvider, @NotNull StyleNode.SpanProvider<R> genericsStyleProvider, @NotNull StyleNode.SpanProvider<R> paramsStyleProvider, @NotNull StyleNode.SpanProvider<R> additionStyleProvider, @NotNull StyleNode.SpanProvider<R> deletionStyleProvider) {
        Intrinsics.checkNotNullParameter(defaultStyleProvider, "defaultStyleProvider");
        Intrinsics.checkNotNullParameter(commentStyleProvider, "commentStyleProvider");
        Intrinsics.checkNotNullParameter(literalStyleProvider, "literalStyleProvider");
        Intrinsics.checkNotNullParameter(keywordStyleProvider, "keywordStyleProvider");
        Intrinsics.checkNotNullParameter(identifierStyleProvider, "identifierStyleProvider");
        Intrinsics.checkNotNullParameter(typesStyleProvider, "typesStyleProvider");
        Intrinsics.checkNotNullParameter(genericsStyleProvider, "genericsStyleProvider");
        Intrinsics.checkNotNullParameter(paramsStyleProvider, "paramsStyleProvider");
        Intrinsics.checkNotNullParameter(additionStyleProvider, "additionStyleProvider");
        Intrinsics.checkNotNullParameter(deletionStyleProvider, "deletionStyleProvider");
        return new CodeStyleProviders<>(defaultStyleProvider, commentStyleProvider, literalStyleProvider, keywordStyleProvider, identifierStyleProvider, typesStyleProvider, genericsStyleProvider, paramsStyleProvider, additionStyleProvider, deletionStyleProvider);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CodeStyleProviders)) {
            return false;
        }
        CodeStyleProviders codeStyleProviders = (CodeStyleProviders) other;
        return Intrinsics.areEqual(this.defaultStyleProvider, codeStyleProviders.defaultStyleProvider) && Intrinsics.areEqual(this.commentStyleProvider, codeStyleProviders.commentStyleProvider) && Intrinsics.areEqual(this.literalStyleProvider, codeStyleProviders.literalStyleProvider) && Intrinsics.areEqual(this.keywordStyleProvider, codeStyleProviders.keywordStyleProvider) && Intrinsics.areEqual(this.identifierStyleProvider, codeStyleProviders.identifierStyleProvider) && Intrinsics.areEqual(this.typesStyleProvider, codeStyleProviders.typesStyleProvider) && Intrinsics.areEqual(this.genericsStyleProvider, codeStyleProviders.genericsStyleProvider) && Intrinsics.areEqual(this.paramsStyleProvider, codeStyleProviders.paramsStyleProvider) && Intrinsics.areEqual(this.additionStyleProvider, codeStyleProviders.additionStyleProvider) && Intrinsics.areEqual(this.deletionStyleProvider, codeStyleProviders.deletionStyleProvider);
    }

    @NotNull
    public final StyleNode.SpanProvider<R> getAdditionStyleProvider() {
        return this.additionStyleProvider;
    }

    @NotNull
    public final StyleNode.SpanProvider<R> getCommentStyleProvider() {
        return this.commentStyleProvider;
    }

    @NotNull
    public final StyleNode.SpanProvider<R> getDefaultStyleProvider() {
        return this.defaultStyleProvider;
    }

    @NotNull
    public final StyleNode.SpanProvider<R> getDeletionStyleProvider() {
        return this.deletionStyleProvider;
    }

    @NotNull
    public final StyleNode.SpanProvider<R> getGenericsStyleProvider() {
        return this.genericsStyleProvider;
    }

    @NotNull
    public final StyleNode.SpanProvider<R> getIdentifierStyleProvider() {
        return this.identifierStyleProvider;
    }

    @NotNull
    public final StyleNode.SpanProvider<R> getKeywordStyleProvider() {
        return this.keywordStyleProvider;
    }

    @NotNull
    public final StyleNode.SpanProvider<R> getLiteralStyleProvider() {
        return this.literalStyleProvider;
    }

    @NotNull
    public final StyleNode.SpanProvider<R> getParamsStyleProvider() {
        return this.paramsStyleProvider;
    }

    @NotNull
    public final StyleNode.SpanProvider<R> getTypesStyleProvider() {
        return this.typesStyleProvider;
    }

    public int hashCode() {
        StyleNode.SpanProvider<R> spanProvider = this.defaultStyleProvider;
        int iHashCode = (spanProvider != null ? spanProvider.hashCode() : 0) * 31;
        StyleNode.SpanProvider<R> spanProvider2 = this.commentStyleProvider;
        int iHashCode2 = (iHashCode + (spanProvider2 != null ? spanProvider2.hashCode() : 0)) * 31;
        StyleNode.SpanProvider<R> spanProvider3 = this.literalStyleProvider;
        int iHashCode3 = (iHashCode2 + (spanProvider3 != null ? spanProvider3.hashCode() : 0)) * 31;
        StyleNode.SpanProvider<R> spanProvider4 = this.keywordStyleProvider;
        int iHashCode4 = (iHashCode3 + (spanProvider4 != null ? spanProvider4.hashCode() : 0)) * 31;
        StyleNode.SpanProvider<R> spanProvider5 = this.identifierStyleProvider;
        int iHashCode5 = (iHashCode4 + (spanProvider5 != null ? spanProvider5.hashCode() : 0)) * 31;
        StyleNode.SpanProvider<R> spanProvider6 = this.typesStyleProvider;
        int iHashCode6 = (iHashCode5 + (spanProvider6 != null ? spanProvider6.hashCode() : 0)) * 31;
        StyleNode.SpanProvider<R> spanProvider7 = this.genericsStyleProvider;
        int iHashCode7 = (iHashCode6 + (spanProvider7 != null ? spanProvider7.hashCode() : 0)) * 31;
        StyleNode.SpanProvider<R> spanProvider8 = this.paramsStyleProvider;
        int iHashCode8 = (iHashCode7 + (spanProvider8 != null ? spanProvider8.hashCode() : 0)) * 31;
        StyleNode.SpanProvider<R> spanProvider9 = this.additionStyleProvider;
        int iHashCode9 = (iHashCode8 + (spanProvider9 != null ? spanProvider9.hashCode() : 0)) * 31;
        StyleNode.SpanProvider<R> spanProvider10 = this.deletionStyleProvider;
        return iHashCode9 + (spanProvider10 != null ? spanProvider10.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CodeStyleProviders(defaultStyleProvider=" + this.defaultStyleProvider + ", commentStyleProvider=" + this.commentStyleProvider + ", literalStyleProvider=" + this.literalStyleProvider + ", keywordStyleProvider=" + this.keywordStyleProvider + ", identifierStyleProvider=" + this.identifierStyleProvider + ", typesStyleProvider=" + this.typesStyleProvider + ", genericsStyleProvider=" + this.genericsStyleProvider + ", paramsStyleProvider=" + this.paramsStyleProvider + ", additionStyleProvider=" + this.additionStyleProvider + ", deletionStyleProvider=" + this.deletionStyleProvider + ")";
    }

    public CodeStyleProviders(@NotNull StyleNode.SpanProvider<R> defaultStyleProvider, @NotNull StyleNode.SpanProvider<R> commentStyleProvider, @NotNull StyleNode.SpanProvider<R> literalStyleProvider, @NotNull StyleNode.SpanProvider<R> keywordStyleProvider, @NotNull StyleNode.SpanProvider<R> identifierStyleProvider, @NotNull StyleNode.SpanProvider<R> typesStyleProvider, @NotNull StyleNode.SpanProvider<R> genericsStyleProvider, @NotNull StyleNode.SpanProvider<R> paramsStyleProvider, @NotNull StyleNode.SpanProvider<R> additionStyleProvider, @NotNull StyleNode.SpanProvider<R> deletionStyleProvider) {
        Intrinsics.checkNotNullParameter(defaultStyleProvider, "defaultStyleProvider");
        Intrinsics.checkNotNullParameter(commentStyleProvider, "commentStyleProvider");
        Intrinsics.checkNotNullParameter(literalStyleProvider, "literalStyleProvider");
        Intrinsics.checkNotNullParameter(keywordStyleProvider, "keywordStyleProvider");
        Intrinsics.checkNotNullParameter(identifierStyleProvider, "identifierStyleProvider");
        Intrinsics.checkNotNullParameter(typesStyleProvider, "typesStyleProvider");
        Intrinsics.checkNotNullParameter(genericsStyleProvider, "genericsStyleProvider");
        Intrinsics.checkNotNullParameter(paramsStyleProvider, "paramsStyleProvider");
        Intrinsics.checkNotNullParameter(additionStyleProvider, "additionStyleProvider");
        Intrinsics.checkNotNullParameter(deletionStyleProvider, "deletionStyleProvider");
        this.defaultStyleProvider = defaultStyleProvider;
        this.commentStyleProvider = commentStyleProvider;
        this.literalStyleProvider = literalStyleProvider;
        this.keywordStyleProvider = keywordStyleProvider;
        this.identifierStyleProvider = identifierStyleProvider;
        this.typesStyleProvider = typesStyleProvider;
        this.genericsStyleProvider = genericsStyleProvider;
        this.paramsStyleProvider = paramsStyleProvider;
        this.additionStyleProvider = additionStyleProvider;
        this.deletionStyleProvider = deletionStyleProvider;
    }

    public /* synthetic */ CodeStyleProviders(StyleNode.SpanProvider spanProvider, StyleNode.SpanProvider spanProvider2, StyleNode.SpanProvider spanProvider3, StyleNode.SpanProvider spanProvider4, StyleNode.SpanProvider spanProvider5, StyleNode.SpanProvider spanProvider6, StyleNode.SpanProvider spanProvider7, StyleNode.SpanProvider spanProvider8, StyleNode.SpanProvider spanProvider9, StyleNode.SpanProvider spanProvider10, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? CodeStyleProvidersKt.emptyProvider() : spanProvider, (i7 & 2) != 0 ? CodeStyleProvidersKt.emptyProvider() : spanProvider2, (i7 & 4) != 0 ? CodeStyleProvidersKt.emptyProvider() : spanProvider3, (i7 & 8) != 0 ? CodeStyleProvidersKt.emptyProvider() : spanProvider4, (i7 & 16) != 0 ? CodeStyleProvidersKt.emptyProvider() : spanProvider5, (i7 & 32) != 0 ? CodeStyleProvidersKt.emptyProvider() : spanProvider6, (i7 & 64) != 0 ? CodeStyleProvidersKt.emptyProvider() : spanProvider7, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? CodeStyleProvidersKt.emptyProvider() : spanProvider8, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? CodeStyleProvidersKt.emptyProvider() : spanProvider9, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? CodeStyleProvidersKt.emptyProvider() : spanProvider10);
    }
}
