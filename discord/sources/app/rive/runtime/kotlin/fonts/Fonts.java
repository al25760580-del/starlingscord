package app.rive.runtime.kotlin.fonts;

import a3.e;
import com.discord.chat.presentation.list.a;
import com.facebook.react.common.assets.ReactFontManager;
import com.facebook.react.devsupport.StackTraceHelper;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import lo.j;
import org.jetbrains.annotations.NotNull;
import s0.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\tB\u0005¢\u0006\u0002\u0010\u0002¨\u0006\n"}, d2 = {"Lapp/rive/runtime/kotlin/fonts/Fonts;", "", "()V", "Alias", "Axis", "Family", "FileFont", "Font", "FontOpts", "Weight", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Fonts {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lapp/rive/runtime/kotlin/fonts/Fonts$Axis;", "", "tag", "", "styleValue", "(Ljava/lang/String;Ljava/lang/String;)V", "getStyleValue", "()Ljava/lang/String;", "getTag", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Axis {
        public static final int $stable = 0;

        @NotNull
        private final String styleValue;

        @NotNull
        private final String tag;

        public Axis(@NotNull String tag, @NotNull String styleValue) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(styleValue, "styleValue");
            this.tag = tag;
            this.styleValue = styleValue;
        }

        public static /* synthetic */ Axis copy$default(Axis axis, String str, String str2, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = axis.tag;
            }
            if ((i7 & 2) != 0) {
                str2 = axis.styleValue;
            }
            return axis.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTag() {
            return this.tag;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getStyleValue() {
            return this.styleValue;
        }

        @NotNull
        public final Axis copy(@NotNull String tag, @NotNull String styleValue) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(styleValue, "styleValue");
            return new Axis(tag, styleValue);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Axis)) {
                return false;
            }
            Axis axis = (Axis) other;
            return Intrinsics.areEqual(this.tag, axis.tag) && Intrinsics.areEqual(this.styleValue, axis.styleValue);
        }

        @NotNull
        public final String getStyleValue() {
            return this.styleValue;
        }

        @NotNull
        public final String getTag() {
            return this.tag;
        }

        public int hashCode() {
            return this.styleValue.hashCode() + (this.tag.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return g.f("Axis(tag=", this.tag, ", styleValue=", this.styleValue, ")");
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lapp/rive/runtime/kotlin/fonts/Fonts$FontOpts;", "", "familyName", "", "lang", "weight", "Lapp/rive/runtime/kotlin/fonts/Fonts$Weight;", "style", "(Ljava/lang/String;Ljava/lang/String;Lapp/rive/runtime/kotlin/fonts/Fonts$Weight;Ljava/lang/String;)V", "getFamilyName", "()Ljava/lang/String;", "getLang", "getStyle", "getWeight", "()Lapp/rive/runtime/kotlin/fonts/Fonts$Weight;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FontOpts {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private static final FontOpts DEFAULT = new FontOpts("sans-serif", null, null, null, 14, null);
        private final String familyName;
        private final String lang;
        private final String style;
        private final Weight weight;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lapp/rive/runtime/kotlin/fonts/Fonts$FontOpts$Companion;", "", "()V", "DEFAULT", "Lapp/rive/runtime/kotlin/fonts/Fonts$FontOpts;", "getDEFAULT", "()Lapp/rive/runtime/kotlin/fonts/Fonts$FontOpts;", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final FontOpts getDEFAULT() {
                return FontOpts.DEFAULT;
            }

            private Companion() {
            }
        }

        public FontOpts() {
            this(null, null, null, null, 15, null);
        }

        public static /* synthetic */ FontOpts copy$default(FontOpts fontOpts, String str, String str2, Weight weight, String str3, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = fontOpts.familyName;
            }
            if ((i7 & 2) != 0) {
                str2 = fontOpts.lang;
            }
            if ((i7 & 4) != 0) {
                weight = fontOpts.weight;
            }
            if ((i7 & 8) != 0) {
                str3 = fontOpts.style;
            }
            return fontOpts.copy(str, str2, weight, str3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getFamilyName() {
            return this.familyName;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getLang() {
            return this.lang;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Weight getWeight() {
            return this.weight;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getStyle() {
            return this.style;
        }

        @NotNull
        public final FontOpts copy(String familyName, String lang, Weight weight, String style) {
            return new FontOpts(familyName, lang, weight, style);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FontOpts)) {
                return false;
            }
            FontOpts fontOpts = (FontOpts) other;
            return Intrinsics.areEqual(this.familyName, fontOpts.familyName) && Intrinsics.areEqual(this.lang, fontOpts.lang) && Intrinsics.areEqual(this.weight, fontOpts.weight) && Intrinsics.areEqual(this.style, fontOpts.style);
        }

        public final String getFamilyName() {
            return this.familyName;
        }

        public final String getLang() {
            return this.lang;
        }

        public final String getStyle() {
            return this.style;
        }

        public final Weight getWeight() {
            return this.weight;
        }

        public int hashCode() {
            String str = this.familyName;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.lang;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Weight weight = this.weight;
            int iHashCode3 = (iHashCode2 + (weight == null ? 0 : weight.hashCode())) * 31;
            String str3 = this.style;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.familyName;
            String str2 = this.lang;
            Weight weight = this.weight;
            String str3 = this.style;
            StringBuilder sbU = e.u("FontOpts(familyName=", str, ", lang=", str2, ", weight=");
            sbU.append(weight);
            sbU.append(", style=");
            sbU.append(str3);
            sbU.append(")");
            return sbU.toString();
        }

        public FontOpts(String str, String str2, Weight weight, String str3) {
            this.familyName = str;
            this.lang = str2;
            this.weight = weight;
            this.style = str3;
        }

        public /* synthetic */ FontOpts(String str, String str2, Weight weight, String str3, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? Weight.INSTANCE.getNORMAL() : weight, (i7 & 8) != 0 ? "normal" : str3);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0000H\u0096\u0002J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lapp/rive/runtime/kotlin/fonts/Fonts$Weight;", "", "weight", "", "(I)V", "getWeight", "()I", "compareTo", "other", "component1", "copy", "equals", "", "", "hashCode", "toString", "", "Companion", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Weight implements Comparable<Weight> {
        public static final int $stable = 0;
        private final int weight;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private static final Weight NORMAL = new Weight(ReactFontManager.TypefaceStyle.NORMAL);

        @NotNull
        private static final Weight BOLD = new Weight(ReactFontManager.TypefaceStyle.BOLD);

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000bJ\u0010\u0010\f\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u000eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\u000f"}, d2 = {"Lapp/rive/runtime/kotlin/fonts/Fonts$Weight$Companion;", "", "()V", "BOLD", "Lapp/rive/runtime/kotlin/fonts/Fonts$Weight;", "getBOLD", "()Lapp/rive/runtime/kotlin/fonts/Fonts$Weight;", "NORMAL", "getNORMAL", "fromInt", "intValue", "", "fromString", "stringValue", "", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public static /* synthetic */ Weight fromInt$default(Companion companion, int i7, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    i7 = ReactFontManager.TypefaceStyle.NORMAL;
                }
                return companion.fromInt(i7);
            }

            @NotNull
            public final Weight fromInt(int intValue) {
                return new Weight(j.e(intValue, new IntRange(0, 1000, 1)));
            }

            @NotNull
            public final Weight fromString(String stringValue) {
                Integer intOrNull;
                return new Weight((stringValue == null || (intOrNull = StringsKt.toIntOrNull(stringValue)) == null) ? ReactFontManager.TypefaceStyle.NORMAL : j.e(intOrNull.intValue(), new IntRange(0, 1000, 1)));
            }

            @NotNull
            public final Weight getBOLD() {
                return Weight.BOLD;
            }

            @NotNull
            public final Weight getNORMAL() {
                return Weight.NORMAL;
            }

            private Companion() {
            }
        }

        public Weight() {
            this(0, 1, null);
        }

        public static /* synthetic */ Weight copy$default(Weight weight, int i7, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                i7 = weight.weight;
            }
            return weight.copy(i7);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getWeight() {
            return this.weight;
        }

        @NotNull
        public final Weight copy(int weight) {
            return new Weight(weight);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Weight) && this.weight == ((Weight) other).weight;
        }

        public final int getWeight() {
            return this.weight;
        }

        public int hashCode() {
            return Integer.hashCode(this.weight);
        }

        @NotNull
        public String toString() {
            return g.d(this.weight, "Weight(weight=", ")");
        }

        public Weight(int i7) {
            this.weight = i7;
        }

        @Override // java.lang.Comparable
        public int compareTo(@NotNull Weight other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return Intrinsics.compare(this.weight, other.weight);
        }

        public /* synthetic */ Weight(int i7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? ReactFontManager.TypefaceStyle.NORMAL : i7);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lapp/rive/runtime/kotlin/fonts/Fonts$Alias;", "", StackTraceHelper.NAME_KEY, "", "original", "weight", "Lapp/rive/runtime/kotlin/fonts/Fonts$Weight;", "(Ljava/lang/String;Ljava/lang/String;Lapp/rive/runtime/kotlin/fonts/Fonts$Weight;)V", "getName", "()Ljava/lang/String;", "getOriginal", "getWeight", "()Lapp/rive/runtime/kotlin/fonts/Fonts$Weight;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Alias {
        public static final int $stable = 0;

        @NotNull
        private final String name;

        @NotNull
        private final String original;
        private final Weight weight;

        public Alias(@NotNull String name, @NotNull String original, Weight weight) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(original, "original");
            this.name = name;
            this.original = original;
            this.weight = weight;
        }

        public static /* synthetic */ Alias copy$default(Alias alias, String str, String str2, Weight weight, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = alias.name;
            }
            if ((i7 & 2) != 0) {
                str2 = alias.original;
            }
            if ((i7 & 4) != 0) {
                weight = alias.weight;
            }
            return alias.copy(str, str2, weight);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getOriginal() {
            return this.original;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Weight getWeight() {
            return this.weight;
        }

        @NotNull
        public final Alias copy(@NotNull String name, @NotNull String original, Weight weight) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(original, "original");
            return new Alias(name, original, weight);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Alias)) {
                return false;
            }
            Alias alias = (Alias) other;
            return Intrinsics.areEqual(this.name, alias.name) && Intrinsics.areEqual(this.original, alias.original) && Intrinsics.areEqual(this.weight, alias.weight);
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final String getOriginal() {
            return this.original;
        }

        public final Weight getWeight() {
            return this.weight;
        }

        public int hashCode() {
            int iD = e.d(this.name.hashCode() * 31, 31, this.original);
            Weight weight = this.weight;
            return iD + (weight == null ? 0 : weight.hashCode());
        }

        @NotNull
        public String toString() {
            String str = this.name;
            String str2 = this.original;
            Weight weight = this.weight;
            StringBuilder sbU = e.u("Alias(name=", str, ", original=", str2, ", weight=");
            sbU.append(weight);
            sbU.append(")");
            return sbU.toString();
        }

        public /* synthetic */ Alias(String str, String str2, Weight weight, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i7 & 4) != 0 ? Weight.INSTANCE.getNORMAL() : weight);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lapp/rive/runtime/kotlin/fonts/Fonts$FileFont;", "", StackTraceHelper.NAME_KEY, "", "variant", "lang", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLang", "()Ljava/lang/String;", "getName", "getVariant", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FileFont {
        public static final int $stable = 0;
        private final String lang;

        @NotNull
        private final String name;
        private final String variant;

        public FileFont(@NotNull String name, String str, String str2) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
            this.variant = str;
            this.lang = str2;
        }

        public static /* synthetic */ FileFont copy$default(FileFont fileFont, String str, String str2, String str3, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = fileFont.name;
            }
            if ((i7 & 2) != 0) {
                str2 = fileFont.variant;
            }
            if ((i7 & 4) != 0) {
                str3 = fileFont.lang;
            }
            return fileFont.copy(str, str2, str3);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getVariant() {
            return this.variant;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getLang() {
            return this.lang;
        }

        @NotNull
        public final FileFont copy(@NotNull String name, String variant, String lang) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new FileFont(name, variant, lang);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FileFont)) {
                return false;
            }
            FileFont fileFont = (FileFont) other;
            return Intrinsics.areEqual(this.name, fileFont.name) && Intrinsics.areEqual(this.variant, fileFont.variant) && Intrinsics.areEqual(this.lang, fileFont.lang);
        }

        public final String getLang() {
            return this.lang;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public final String getVariant() {
            return this.variant;
        }

        public int hashCode() {
            int iHashCode = this.name.hashCode() * 31;
            String str = this.variant;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.lang;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.name;
            String str2 = this.variant;
            return a.k(e.u("FileFont(name=", str, ", variant=", str2, ", lang="), this.lang, ")");
        }

        public /* synthetic */ FileFont(String str, String str2, String str3, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : str3);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0007¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0007HÆ\u0003JI\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R#\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001d"}, d2 = {"Lapp/rive/runtime/kotlin/fonts/Fonts$Family;", "", StackTraceHelper.NAME_KEY, "", "variant", "lang", "fonts", "", "Lapp/rive/runtime/kotlin/fonts/Fonts$Weight;", "", "Lapp/rive/runtime/kotlin/fonts/Fonts$Font;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getFonts", "()Ljava/util/Map;", "getLang", "()Ljava/lang/String;", "getName", "getVariant", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Family {
        public static final int $stable = 8;

        @NotNull
        private final Map<Weight, List<Font>> fonts;
        private final String lang;
        private final String name;
        private final String variant;

        /* JADX WARN: Multi-variable type inference failed */
        public Family(String str, String str2, String str3, @NotNull Map<Weight, ? extends List<Font>> fonts) {
            Intrinsics.checkNotNullParameter(fonts, "fonts");
            this.name = str;
            this.variant = str2;
            this.lang = str3;
            this.fonts = fonts;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Family copy$default(Family family, String str, String str2, String str3, Map map, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = family.name;
            }
            if ((i7 & 2) != 0) {
                str2 = family.variant;
            }
            if ((i7 & 4) != 0) {
                str3 = family.lang;
            }
            if ((i7 & 8) != 0) {
                map = family.fonts;
            }
            return family.copy(str, str2, str3, map);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getVariant() {
            return this.variant;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getLang() {
            return this.lang;
        }

        @NotNull
        public final Map<Weight, List<Font>> component4() {
            return this.fonts;
        }

        @NotNull
        public final Family copy(String name, String variant, String lang, @NotNull Map<Weight, ? extends List<Font>> fonts) {
            Intrinsics.checkNotNullParameter(fonts, "fonts");
            return new Family(name, variant, lang, fonts);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Family)) {
                return false;
            }
            Family family = (Family) other;
            return Intrinsics.areEqual(this.name, family.name) && Intrinsics.areEqual(this.variant, family.variant) && Intrinsics.areEqual(this.lang, family.lang) && Intrinsics.areEqual(this.fonts, family.fonts);
        }

        @NotNull
        public final Map<Weight, List<Font>> getFonts() {
            return this.fonts;
        }

        public final String getLang() {
            return this.lang;
        }

        public final String getName() {
            return this.name;
        }

        public final String getVariant() {
            return this.variant;
        }

        public int hashCode() {
            String str = this.name;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.variant;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.lang;
            return this.fonts.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            String str = this.name;
            String str2 = this.variant;
            String str3 = this.lang;
            Map<Weight, List<Font>> map = this.fonts;
            StringBuilder sbU = e.u("Family(name=", str, ", variant=", str2, ", lang=");
            sbU.append(str3);
            sbU.append(", fonts=");
            sbU.append(map);
            sbU.append(")");
            return sbU.toString();
        }

        public /* synthetic */ Family(String str, String str2, String str3, Map map, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : str3, map);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0001'BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J[\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u000bHÖ\u0001J\t\u0010&\u001a\u00020\u0005HÖ\u0001R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006("}, d2 = {"Lapp/rive/runtime/kotlin/fonts/Fonts$Font;", "", "weight", "Lapp/rive/runtime/kotlin/fonts/Fonts$Weight;", "style", "", StackTraceHelper.NAME_KEY, "axis", "", "Lapp/rive/runtime/kotlin/fonts/Fonts$Axis;", "ttcIndex", "", "postScriptName", "fallbackFor", "(Lapp/rive/runtime/kotlin/fonts/Fonts$Weight;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;)V", "getAxis", "()Ljava/util/List;", "getFallbackFor", "()Ljava/lang/String;", "getName", "getPostScriptName", "getStyle", "getTtcIndex", "()I", "getWeight", "()Lapp/rive/runtime/kotlin/fonts/Fonts$Weight;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Font {

        @NotNull
        public static final String STYLE_ITALIC = "italic";

        @NotNull
        public static final String STYLE_NORMAL = "normal";
        private final List<Axis> axis;
        private final String fallbackFor;

        @NotNull
        private final String name;
        private final String postScriptName;

        @NotNull
        private final String style;
        private final int ttcIndex;

        @NotNull
        private final Weight weight;
        public static final int $stable = 8;

        public Font(@NotNull Weight weight, @NotNull String style, @NotNull String name, List<Axis> list, int i7, String str, String str2) {
            Intrinsics.checkNotNullParameter(weight, "weight");
            Intrinsics.checkNotNullParameter(style, "style");
            Intrinsics.checkNotNullParameter(name, "name");
            this.weight = weight;
            this.style = style;
            this.name = name;
            this.axis = list;
            this.ttcIndex = i7;
            this.postScriptName = str;
            this.fallbackFor = str2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Font copy$default(Font font, Weight weight, String str, String str2, List list, int i7, String str3, String str4, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                weight = font.weight;
            }
            if ((i10 & 2) != 0) {
                str = font.style;
            }
            if ((i10 & 4) != 0) {
                str2 = font.name;
            }
            if ((i10 & 8) != 0) {
                list = font.axis;
            }
            if ((i10 & 16) != 0) {
                i7 = font.ttcIndex;
            }
            if ((i10 & 32) != 0) {
                str3 = font.postScriptName;
            }
            if ((i10 & 64) != 0) {
                str4 = font.fallbackFor;
            }
            String str5 = str3;
            String str6 = str4;
            int i11 = i7;
            String str7 = str2;
            return font.copy(weight, str, str7, list, i11, str5, str6);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Weight getWeight() {
            return this.weight;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getStyle() {
            return this.style;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public final List<Axis> component4() {
            return this.axis;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final int getTtcIndex() {
            return this.ttcIndex;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getPostScriptName() {
            return this.postScriptName;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getFallbackFor() {
            return this.fallbackFor;
        }

        @NotNull
        public final Font copy(@NotNull Weight weight, @NotNull String style, @NotNull String name, List<Axis> axis, int ttcIndex, String postScriptName, String fallbackFor) {
            Intrinsics.checkNotNullParameter(weight, "weight");
            Intrinsics.checkNotNullParameter(style, "style");
            Intrinsics.checkNotNullParameter(name, "name");
            return new Font(weight, style, name, axis, ttcIndex, postScriptName, fallbackFor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Font)) {
                return false;
            }
            Font font = (Font) other;
            return Intrinsics.areEqual(this.weight, font.weight) && Intrinsics.areEqual(this.style, font.style) && Intrinsics.areEqual(this.name, font.name) && Intrinsics.areEqual(this.axis, font.axis) && this.ttcIndex == font.ttcIndex && Intrinsics.areEqual(this.postScriptName, font.postScriptName) && Intrinsics.areEqual(this.fallbackFor, font.fallbackFor);
        }

        public final List<Axis> getAxis() {
            return this.axis;
        }

        public final String getFallbackFor() {
            return this.fallbackFor;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public final String getPostScriptName() {
            return this.postScriptName;
        }

        @NotNull
        public final String getStyle() {
            return this.style;
        }

        public final int getTtcIndex() {
            return this.ttcIndex;
        }

        @NotNull
        public final Weight getWeight() {
            return this.weight;
        }

        public int hashCode() {
            int iD = e.d(e.d(this.weight.hashCode() * 31, 31, this.style), 31, this.name);
            List<Axis> list = this.axis;
            int iU = a.u(this.ttcIndex, (iD + (list == null ? 0 : list.hashCode())) * 31, 31);
            String str = this.postScriptName;
            int iHashCode = (iU + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.fallbackFor;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Weight weight = this.weight;
            String str = this.style;
            String str2 = this.name;
            List<Axis> list = this.axis;
            int i7 = this.ttcIndex;
            String str3 = this.postScriptName;
            String str4 = this.fallbackFor;
            StringBuilder sb2 = new StringBuilder("Font(weight=");
            sb2.append(weight);
            sb2.append(", style=");
            sb2.append(str);
            sb2.append(", name=");
            sb2.append(str2);
            sb2.append(", axis=");
            sb2.append(list);
            sb2.append(", ttcIndex=");
            sb2.append(i7);
            sb2.append(", postScriptName=");
            sb2.append(str3);
            sb2.append(", fallbackFor=");
            return a.k(sb2, str4, ")");
        }

        public /* synthetic */ Font(Weight weight, String str, String str2, List list, int i7, String str3, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(weight, str, str2, (i10 & 8) != 0 ? null : list, (i10 & 16) != 0 ? 0 : i7, (i10 & 32) != 0 ? null : str3, (i10 & 64) != 0 ? null : str4);
        }
    }
}
