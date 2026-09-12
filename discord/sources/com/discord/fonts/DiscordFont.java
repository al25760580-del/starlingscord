package com.discord.fonts;

import android.content.Context;
import android.graphics.Typeface;
import app.rive.runtime.kotlin.fonts.Fonts;
import com.facebook.imagepipeline.nativecode.b;
import com.facebook.react.common.assets.ReactFontManager;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'PrimaryNormalItalic' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001.B+\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)¨\u0006/"}, d2 = {"Lcom/discord/fonts/DiscordFont;", "", "rawName", "", "weight", "", Fonts.Font.STYLE_ITALIC, "", "monospace", "<init>", "(Ljava/lang/String;ILjava/lang/String;IZZ)V", "getRawName", "()Ljava/lang/String;", "getWeight", "()I", "getItalic", "()Z", "getMonospace", "CodeNormal", "CodeBold", "PrimaryNormal", "PrimaryNormalItalic", "PrimaryMedium", "PrimaryMediumItalic", "PrimarySemibold", "PrimarySemiboldItalic", "PrimaryBold", "PrimaryBoldItalic", "PrimaryExtraBold", "PrimaryExtraBoldItalic", "DisplayExtraBold", "ChicleNormal", "CherryBombOneNormal", "MuseoModernoMedium", "NeoCastelNormal", "PixelifySansNormal", "SinistreNormal", "ZillaSlabSemibold", "PlaypenSansBold", "OrbitronBold", "NewRockerRegular", "KalamBold", "typeface", "Landroid/graphics/Typeface;", "context", "Landroid/content/Context;", "Companion", "fonts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DiscordFont {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DiscordFont[] $VALUES;
    public static final DiscordFont CherryBombOneNormal;
    public static final DiscordFont ChicleNormal;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final DiscordFont DisplayExtraBold;
    public static final DiscordFont KalamBold;
    public static final DiscordFont MuseoModernoMedium;
    public static final DiscordFont NeoCastelNormal;
    public static final DiscordFont NewRockerRegular;
    public static final DiscordFont OrbitronBold;
    public static final DiscordFont PixelifySansNormal;
    public static final DiscordFont PlaypenSansBold;
    public static final DiscordFont PrimaryBold;
    public static final DiscordFont PrimaryBoldItalic;
    public static final DiscordFont PrimaryExtraBoldItalic;
    public static final DiscordFont PrimaryMedium;
    public static final DiscordFont PrimaryMediumItalic;
    public static final DiscordFont PrimaryNormalItalic;
    public static final DiscordFont PrimarySemibold;
    public static final DiscordFont PrimarySemiboldItalic;
    public static final DiscordFont SinistreNormal;
    public static final DiscordFont ZillaSlabSemibold;

    @NotNull
    private static final ConcurrentHashMap<DiscordFont, Typeface> typefaces;
    private final boolean italic;
    private final boolean monospace;

    @NotNull
    private final String rawName;
    private final int weight;
    public static final DiscordFont CodeNormal = new DiscordFont("CodeNormal", 0, "ggmono-Normal, SourceCodePro-Normal", ReactFontManager.TypefaceStyle.NORMAL, false, true);
    public static final DiscordFont CodeBold = new DiscordFont("CodeBold", 1, "ggmono-Bold, SourceCodePro-Bold", ReactFontManager.TypefaceStyle.BOLD, false, true);
    public static final DiscordFont PrimaryNormal = new DiscordFont("PrimaryNormal", 2, "ggsans-Normal, NotoSans-Normal", ReactFontManager.TypefaceStyle.NORMAL, false, false, 8, null);
    public static final DiscordFont PrimaryExtraBold = new DiscordFont("PrimaryExtraBold", 10, "ggsans-ExtraBold, NotoSans-ExtraBold", 800, false, false, 8, null);

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0002J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u0007J\"\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0012R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/discord/fonts/DiscordFont$Companion;", "", "<init>", "()V", "typefaces", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/discord/fonts/DiscordFont;", "Landroid/graphics/Typeface;", "getFontFromRN", "context", "Landroid/content/Context;", "font", "fromTypeface", "typeface", "findByStyle", "weight", "", Fonts.Font.STYLE_ITALIC, "", "monospace", "fonts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nDiscordFont.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiscordFont.kt\ncom/discord/fonts/DiscordFont$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,175:1\n1#2:176\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ DiscordFont findByStyle$default(Companion companion, int i7, boolean z5, boolean z6, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                z6 = false;
            }
            return companion.findByStyle(i7, z5, z6);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Typeface getFontFromRN(Context context, DiscordFont font) {
            Typeface typeface = ReactFontManager.INSTANCE.getInstance().getTypeface(font.getRawName(), 0, context.getAssets());
            if (!Intrinsics.areEqual(typeface, Typeface.DEFAULT)) {
                return typeface;
            }
            throw new IllegalStateException(("Cannot find typeface " + typeface + ".rawName").toString());
        }

        public final DiscordFont findByStyle(int weight, boolean italic, boolean monospace) {
            Object next;
            Iterator<E> it = DiscordFont.getEntries().iterator();
            while (it.hasNext()) {
                next = it.next();
                DiscordFont discordFont = (DiscordFont) next;
                if (discordFont.getWeight() == weight && discordFont.getItalic() == italic && discordFont.getMonospace() == monospace) {
                    return (DiscordFont) next;
                }
            }
            next = null;
            return (DiscordFont) next;
        }

        public final DiscordFont fromTypeface(Typeface typeface) {
            Object next;
            if (typeface == null) {
                return null;
            }
            Set setEntrySet = DiscordFont.typefaces.entrySet();
            Intrinsics.checkNotNullExpressionValue(setEntrySet, "<get-entries>(...)");
            Iterator it = setEntrySet.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(((Map.Entry) next).getValue(), typeface));
            Map.Entry entry = (Map.Entry) next;
            if (entry != null) {
                return (DiscordFont) entry.getKey();
            }
            return null;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ DiscordFont[] $values() {
        return new DiscordFont[]{CodeNormal, CodeBold, PrimaryNormal, PrimaryNormalItalic, PrimaryMedium, PrimaryMediumItalic, PrimarySemibold, PrimarySemiboldItalic, PrimaryBold, PrimaryBoldItalic, PrimaryExtraBold, PrimaryExtraBoldItalic, DisplayExtraBold, ChicleNormal, CherryBombOneNormal, MuseoModernoMedium, NeoCastelNormal, PixelifySansNormal, SinistreNormal, ZillaSlabSemibold, PlaypenSansBold, OrbitronBold, NewRockerRegular, KalamBold};
    }

    static {
        boolean z5 = false;
        PrimaryNormalItalic = new DiscordFont("PrimaryNormalItalic", 3, "ggsans-NormalItalic, NotoSans-NormalItalic", ReactFontManager.TypefaceStyle.NORMAL, true, z5, 8, null);
        PrimaryMedium = new DiscordFont("PrimaryMedium", 4, "ggsans-Medium, NotoSans-Medium", 500, z5, false, 8, null);
        boolean z6 = false;
        PrimaryMediumItalic = new DiscordFont("PrimaryMediumItalic", 5, "ggsans-MediumItalic, NotoSans-MediumItalic", 500, true, z6, 8, null);
        PrimarySemibold = new DiscordFont("PrimarySemibold", 6, "ggsans-Semibold, NotoSans-Semibold", 600, z6, false, 8, null);
        boolean z7 = false;
        PrimarySemiboldItalic = new DiscordFont("PrimarySemiboldItalic", 7, "ggsans-SemiboldItalic, NotoSans-SemiboldItalic", 600, true, z7, 8, null);
        PrimaryBold = new DiscordFont("PrimaryBold", 8, "ggsans-Bold, NotoSans-Bold", ReactFontManager.TypefaceStyle.BOLD, z7, false, 8, null);
        DefaultConstructorMarker defaultConstructorMarker = null;
        PrimaryBoldItalic = new DiscordFont("PrimaryBoldItalic", 9, "ggsans-BoldItalic, NotoSans-BoldItalic", ReactFontManager.TypefaceStyle.BOLD, true, false, 8, defaultConstructorMarker);
        boolean z10 = false;
        PrimaryExtraBoldItalic = new DiscordFont("PrimaryExtraBoldItalic", 11, "ggsans-ExtraBoldItalic, NotoSans-ExtraBoldItalic", 800, true, z10, 8, null);
        boolean z11 = false;
        DisplayExtraBold = new DiscordFont("DisplayExtraBold", 12, "ABCGintoNord-ExtraBold, ggsans-ExtraBold, NotoSans-ExtraBold", 800, z10, z11, 8, null);
        boolean z12 = false;
        ChicleNormal = new DiscordFont("ChicleNormal", 13, "Jellybean-Normal, ggsans-Normal, NotoSans-Normal", ReactFontManager.TypefaceStyle.NORMAL, z11, z12, 8, null);
        boolean z13 = false;
        CherryBombOneNormal = new DiscordFont("CherryBombOneNormal", 14, "Sakura-Normal, ggsans-Normal, NotoSans-Normal", ReactFontManager.TypefaceStyle.NORMAL, z12, z13, 8, null);
        boolean z14 = false;
        MuseoModernoMedium = new DiscordFont("MuseoModernoMedium", 15, "Modern-Medium, ggsans-Normal, NotoSans-Normal", 500, z13, z14, 8, null);
        boolean z15 = false;
        NeoCastelNormal = new DiscordFont("NeoCastelNormal", 16, "Medieval-Normal, ggsans-Normal, NotoSans-Normal", ReactFontManager.TypefaceStyle.NORMAL, z14, z15, 8, null);
        boolean z16 = false;
        PixelifySansNormal = new DiscordFont("PixelifySansNormal", 17, "8Bit-Normal, ggsans-Normal, NotoSans-Normal", ReactFontManager.TypefaceStyle.NORMAL, z15, z16, 8, null);
        boolean z17 = false;
        SinistreNormal = new DiscordFont("SinistreNormal", 18, "Vampyre-Normal, ggsans-Normal, NotoSans-Normal", ReactFontManager.TypefaceStyle.NORMAL, z16, z17, 8, null);
        ZillaSlabSemibold = new DiscordFont("ZillaSlabSemibold", 19, "Tempo-SemiBold, ggsans-Normal, NotoSans-Normal", 600, z17, false, 8, defaultConstructorMarker);
        boolean z18 = false;
        PlaypenSansBold = new DiscordFont("PlaypenSansBold", 20, "MonkeyBars-Bold, ggsans-Normal, NotoSans-Normal", ReactFontManager.TypefaceStyle.BOLD, false, z18, 8, null);
        boolean z19 = false;
        OrbitronBold = new DiscordFont("OrbitronBold", 21, "Mainframe-Bold, ggsans-Normal, NotoSans-Normal", ReactFontManager.TypefaceStyle.BOLD, z18, z19, 8, null);
        boolean z20 = false;
        NewRockerRegular = new DiscordFont("NewRockerRegular", 22, "Headbang-Normal, ggsans-Normal, NotoSans-Normal", ReactFontManager.TypefaceStyle.NORMAL, z19, z20, 8, null);
        KalamBold = new DiscordFont("KalamBold", 23, "Journal-Bold, ggsans-Normal, NotoSans-Normal", ReactFontManager.TypefaceStyle.BOLD, z20, false, 8, null);
        DiscordFont[] discordFontArr$values = $values();
        $VALUES = discordFontArr$values;
        $ENTRIES = b.l(discordFontArr$values);
        INSTANCE = new Companion(null);
        typefaces = new ConcurrentHashMap<>();
    }

    private DiscordFont(String str, int i7, String str2, int i10, boolean z5, boolean z6) {
        super(str, i7);
        this.rawName = str2;
        this.weight = i10;
        this.italic = z5;
        this.monospace = z6;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static DiscordFont valueOf(String str) {
        return (DiscordFont) Enum.valueOf(DiscordFont.class, str);
    }

    public static DiscordFont[] values() {
        return (DiscordFont[]) $VALUES.clone();
    }

    public final boolean getItalic() {
        return this.italic;
    }

    public final boolean getMonospace() {
        return this.monospace;
    }

    @NotNull
    public final String getRawName() {
        return this.rawName;
    }

    public final int getWeight() {
        return this.weight;
    }

    @NotNull
    public final Typeface typeface(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ConcurrentHashMap<DiscordFont, Typeface> concurrentHashMap = typefaces;
        if (concurrentHashMap.get(this) != null) {
            Typeface typeface = concurrentHashMap.get(this);
            Intrinsics.checkNotNull(typeface);
            return typeface;
        }
        Typeface fontFromRN = INSTANCE.getFontFromRN(context, this);
        concurrentHashMap.put(this, fontFromRN);
        return fontFromRN;
    }

    public /* synthetic */ DiscordFont(String str, int i7, String str2, int i10, boolean z5, boolean z6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i7, str2, i10, z5, (i11 & 8) != 0 ? false : z6);
    }
}
