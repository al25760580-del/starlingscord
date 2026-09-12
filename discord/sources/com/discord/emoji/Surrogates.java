package com.discord.emoji;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import s0.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\u0005J\r\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u0005J\u001a\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0019"}, d2 = {"Lcom/discord/emoji/Surrogates;", "", "value", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "withoutDiversity", "withoutDiversity-impl", "toCodePoints", "toCodePoints-impl", "toAssetUrl", "toAssetUrl-impl", "equals", "", "other", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "emoji_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Surrogates {

    @NotNull
    private final String value;

    private /* synthetic */ Surrogates(String str) {
        this.value = str;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Surrogates m933boximpl(String str) {
        return new Surrogates(str);
    }

    @NotNull
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static String m934constructorimpl(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return value;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m935equalsimpl(String str, Object obj) {
        return (obj instanceof Surrogates) && Intrinsics.areEqual(str, ((Surrogates) obj).m942unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m936equalsimpl0(String str, String str2) {
        return Intrinsics.areEqual(str, str2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m937hashCodeimpl(String str) {
        return str.hashCode();
    }

    @NotNull
    /* JADX INFO: renamed from: toAssetUrl-impl, reason: not valid java name */
    public static final String m938toAssetUrlimpl(String str) {
        return g.e("asset:///emoji-", m939toCodePointsimpl(str), ".png");
    }

    /* JADX INFO: renamed from: toCodePoints-impl, reason: not valid java name */
    private static final String m939toCodePointsimpl(String str) {
        StringBuilder sb2 = new StringBuilder();
        int iCharCount = 0;
        while (iCharCount < str.length()) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (sb2.length() > 0) {
                sb2.append("-");
            }
            sb2.append(Integer.toHexString(iCodePointAt));
            iCharCount += Character.charCount(iCodePointAt);
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m940toStringimpl(String str) {
        return g.e("Surrogates(value=", str, ")");
    }

    @NotNull
    /* JADX INFO: renamed from: withoutDiversity-impl, reason: not valid java name */
    public static final String m941withoutDiversityimpl(String str) {
        char[] chars = Character.toChars(str.codePointAt(0));
        Intrinsics.checkNotNullExpressionValue(chars, "toChars(...)");
        Intrinsics.checkNotNullParameter(chars, "<this>");
        Intrinsics.checkNotNullParameter("", "separator");
        Intrinsics.checkNotNullParameter("", "prefix");
        Intrinsics.checkNotNullParameter("", "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        StringBuilder buffer = new StringBuilder();
        Intrinsics.checkNotNullParameter(chars, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter("", "separator");
        Intrinsics.checkNotNullParameter("", "prefix");
        Intrinsics.checkNotNullParameter("", "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        buffer.append((CharSequence) "");
        int i7 = 0;
        for (char c8 : chars) {
            i7++;
            if (i7 > 1) {
                buffer.append((CharSequence) "");
            }
            buffer.append(c8);
        }
        buffer.append((CharSequence) "");
        return buffer.toString();
    }

    public boolean equals(Object obj) {
        return m935equalsimpl(this.value, obj);
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return m937hashCodeimpl(this.value);
    }

    public String toString() {
        return m940toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m942unboximpl() {
        return this.value;
    }
}
