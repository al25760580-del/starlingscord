package com.discord.emoji;

import a3.e;
import com.discord.icons.IconUrlUtils;
import com.facebook.react.devsupport.StackTraceHelper;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.y;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import s0.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u000e2\u00020\u0001:\u0004\u000b\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0005H&\u0082\u0001\u0003\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/discord/emoji/RenderableEmoji;", "", "<init>", "()V", "getUrl", "", "allowAnimation", "", "sizePx", "", "getContentDescription", "Unicode", "CustomWithEmojiId", "CustomWithUrl", "Companion", "Lcom/discord/emoji/RenderableEmoji$CustomWithEmojiId;", "Lcom/discord/emoji/RenderableEmoji$CustomWithUrl;", "Lcom/discord/emoji/RenderableEmoji$Unicode;", "emoji_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class RenderableEmoji {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Set<String> exceptions;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006J\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0006J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/discord/emoji/RenderableEmoji$Companion;", "", "<init>", "()V", "exceptions", "", "", "unicode", "Lcom/discord/emoji/RenderableEmoji$Unicode;", "surrogates", "customWithEmojiId", "Lcom/discord/emoji/RenderableEmoji$CustomWithEmojiId;", StackTraceHelper.ID_KEY, "", "isAnimated", "", "alt", "customWithUrl", "Lcom/discord/emoji/RenderableEmoji$CustomWithUrl;", "url", "emoji_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CustomWithEmojiId customWithEmojiId(long id2, boolean isAnimated, @NotNull String alt) {
            Intrinsics.checkNotNullParameter(alt, "alt");
            return new CustomWithEmojiId(id2, isAnimated, alt);
        }

        @NotNull
        public final CustomWithUrl customWithUrl(@NotNull String url, @NotNull String alt) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(alt, "alt");
            return new CustomWithUrl(url, alt);
        }

        @NotNull
        public final Unicode unicode(@NotNull String surrogates) {
            Intrinsics.checkNotNullParameter(surrogates, "surrogates");
            return new Unicode(Surrogates.m934constructorimpl(surrogates), null);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0007H\u0016J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J'\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0012HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001d"}, d2 = {"Lcom/discord/emoji/RenderableEmoji$CustomWithEmojiId;", "Lcom/discord/emoji/RenderableEmoji;", "emojiId", "", "isAnimated", "", "alt", "", "<init>", "(JZLjava/lang/String;)V", "getEmojiId", "()J", "()Z", "getAlt", "()Ljava/lang/String;", "getUrl", "allowAnimation", "sizePx", "", "getContentDescription", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "toString", "emoji_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CustomWithEmojiId extends RenderableEmoji {

        @NotNull
        private final String alt;
        private final long emojiId;
        private final boolean isAnimated;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CustomWithEmojiId(long j, boolean z5, @NotNull String alt) {
            super(null);
            Intrinsics.checkNotNullParameter(alt, "alt");
            this.emojiId = j;
            this.isAnimated = z5;
            this.alt = alt;
        }

        public static /* synthetic */ CustomWithEmojiId copy$default(CustomWithEmojiId customWithEmojiId, long j, boolean z5, String str, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                j = customWithEmojiId.emojiId;
            }
            if ((i7 & 2) != 0) {
                z5 = customWithEmojiId.isAnimated;
            }
            if ((i7 & 4) != 0) {
                str = customWithEmojiId.alt;
            }
            return customWithEmojiId.copy(j, z5, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getEmojiId() {
            return this.emojiId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getIsAnimated() {
            return this.isAnimated;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getAlt() {
            return this.alt;
        }

        @NotNull
        public final CustomWithEmojiId copy(long emojiId, boolean isAnimated, @NotNull String alt) {
            Intrinsics.checkNotNullParameter(alt, "alt");
            return new CustomWithEmojiId(emojiId, isAnimated, alt);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CustomWithEmojiId)) {
                return false;
            }
            CustomWithEmojiId customWithEmojiId = (CustomWithEmojiId) other;
            return this.emojiId == customWithEmojiId.emojiId && this.isAnimated == customWithEmojiId.isAnimated && Intrinsics.areEqual(this.alt, customWithEmojiId.alt);
        }

        @NotNull
        public final String getAlt() {
            return this.alt;
        }

        @Override // com.discord.emoji.RenderableEmoji
        @NotNull
        public String getContentDescription() {
            return this.alt;
        }

        public final long getEmojiId() {
            return this.emojiId;
        }

        @Override // com.discord.emoji.RenderableEmoji
        @NotNull
        public String getUrl(boolean allowAnimation, int sizePx) {
            return IconUrlUtils.INSTANCE.getCustomEmojiUrl(this.emojiId, allowAnimation && this.isAnimated, Integer.valueOf(sizePx));
        }

        public int hashCode() {
            return this.alt.hashCode() + com.discord.chat.presentation.list.a.g(Long.hashCode(this.emojiId) * 31, 31, this.isAnimated);
        }

        public final boolean isAnimated() {
            return this.isAnimated;
        }

        @NotNull
        public String toString() {
            long j = this.emojiId;
            boolean z5 = this.isAnimated;
            String str = this.alt;
            StringBuilder sb2 = new StringBuilder("CustomWithEmojiId(emojiId=");
            sb2.append(j);
            sb2.append(", isAnimated=");
            sb2.append(z5);
            return e.o(sb2, ", alt=", str, ")");
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u0003H\u0016J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\rHÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0017"}, d2 = {"Lcom/discord/emoji/RenderableEmoji$CustomWithUrl;", "Lcom/discord/emoji/RenderableEmoji;", "url", "", "alt", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "getAlt", "allowAnimation", "", "sizePx", "", "getContentDescription", "component1", "component2", "copy", "equals", "other", "", "hashCode", "toString", "emoji_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CustomWithUrl extends RenderableEmoji {

        @NotNull
        private final String alt;

        @NotNull
        private final String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CustomWithUrl(@NotNull String url, @NotNull String alt) {
            super(null);
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(alt, "alt");
            this.url = url;
            this.alt = alt;
        }

        public static /* synthetic */ CustomWithUrl copy$default(CustomWithUrl customWithUrl, String str, String str2, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = customWithUrl.url;
            }
            if ((i7 & 2) != 0) {
                str2 = customWithUrl.alt;
            }
            return customWithUrl.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getAlt() {
            return this.alt;
        }

        @NotNull
        public final CustomWithUrl copy(@NotNull String url, @NotNull String alt) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(alt, "alt");
            return new CustomWithUrl(url, alt);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CustomWithUrl)) {
                return false;
            }
            CustomWithUrl customWithUrl = (CustomWithUrl) other;
            return Intrinsics.areEqual(this.url, customWithUrl.url) && Intrinsics.areEqual(this.alt, customWithUrl.alt);
        }

        @NotNull
        public final String getAlt() {
            return this.alt;
        }

        @Override // com.discord.emoji.RenderableEmoji
        @NotNull
        public String getContentDescription() {
            return this.alt;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.alt.hashCode() + (this.url.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return g.f("CustomWithUrl(url=", this.url, ", alt=", this.alt, ")");
        }

        @Override // com.discord.emoji.RenderableEmoji
        @NotNull
        public String getUrl(boolean allowAnimation, int sizePx) {
            return this.url;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\nH\u0016J\u0010\u0010\u0012\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0007J\u001a\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0010HÖ\u0001J\t\u0010\u001b\u001a\u00020\nHÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007¨\u0006\u001c"}, d2 = {"Lcom/discord/emoji/RenderableEmoji$Unicode;", "Lcom/discord/emoji/RenderableEmoji;", "surrogates", "Lcom/discord/emoji/Surrogates;", "<init>", "(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getSurrogates-Mny0UXI", "()Ljava/lang/String;", "Ljava/lang/String;", "exception", "", "getException", "getUrl", "allowAnimation", "", "sizePx", "", "getContentDescription", "component1", "component1-Mny0UXI", "copy", "copy-hLBmEAo", "(Ljava/lang/String;)Lcom/discord/emoji/RenderableEmoji$Unicode;", "equals", "other", "", "hashCode", "toString", "emoji_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nRenderableEmoji.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderableEmoji.kt\ncom/discord/emoji/RenderableEmoji$Unicode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,151:1\n1#2:152\n*E\n"})
    public static final /* data */ class Unicode extends RenderableEmoji {
        private final String exception;

        @NotNull
        private final String surrogates;

        public /* synthetic */ Unicode(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        /* JADX INFO: renamed from: copy-hLBmEAo$default, reason: not valid java name */
        public static /* synthetic */ Unicode m929copyhLBmEAo$default(Unicode unicode, String str, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = unicode.surrogates;
            }
            return unicode.m931copyhLBmEAo(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1-Mny0UXI, reason: not valid java name and from getter */
        public final String getSurrogates() {
            return this.surrogates;
        }

        @NotNull
        /* JADX INFO: renamed from: copy-hLBmEAo, reason: not valid java name */
        public final Unicode m931copyhLBmEAo(@NotNull String surrogates) {
            Intrinsics.checkNotNullParameter(surrogates, "surrogates");
            return new Unicode(surrogates, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Unicode) && Surrogates.m936equalsimpl0(this.surrogates, ((Unicode) other).surrogates);
        }

        @Override // com.discord.emoji.RenderableEmoji
        @NotNull
        public String getContentDescription() {
            return this.surrogates;
        }

        public final String getException() {
            return this.exception;
        }

        @NotNull
        /* JADX INFO: renamed from: getSurrogates-Mny0UXI, reason: not valid java name */
        public final String m932getSurrogatesMny0UXI() {
            return this.surrogates;
        }

        @Override // com.discord.emoji.RenderableEmoji
        @NotNull
        public String getUrl(boolean allowAnimation, int sizePx) {
            return Surrogates.m938toAssetUrlimpl(this.surrogates);
        }

        public int hashCode() {
            return Surrogates.m937hashCodeimpl(this.surrogates);
        }

        @NotNull
        public String toString() {
            return g.e("Unicode(surrogates=", Surrogates.m940toStringimpl(this.surrogates), ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        private Unicode(String surrogates) {
            super(0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(surrogates, "surrogates");
            this.surrogates = surrogates;
            String strM941withoutDiversityimpl = Surrogates.m941withoutDiversityimpl(surrogates);
            this.exception = RenderableEmoji.exceptions.contains(strM941withoutDiversityimpl) ? strM941withoutDiversityimpl : null;
        }
    }

    static {
        String[] elements = {"™", "©", "®"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        exceptions = y.J(elements);
    }

    public /* synthetic */ RenderableEmoji(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public abstract String getContentDescription();

    @NotNull
    public abstract String getUrl(boolean allowAnimation, int sizePx);

    private RenderableEmoji() {
    }
}
