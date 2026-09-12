package app.rive.runtime.kotlin.fonts;

import a3.e;
import android.util.Xml;
import app.rive.RiveLog;
import com.discord.chat.presentation.list.a;
import com.facebook.react.devsupport.StackTraceHelper;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.collections.d0;
import kotlin.collections.e0;
import kotlin.collections.n0;
import kotlin.collections.v0;
import kotlin.collections.w0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import s0.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lapp/rive/runtime/kotlin/fonts/SystemFontsParser;", "", "()V", "Companion", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SystemFontsParser {
    public static final int $stable = 0;

    @NotNull
    public static final String FALLBACK_FONTS_XML_PATH = "/system/etc/system_fallback.xml";

    @NotNull
    public static final String FONTS_XML_PATH = "/system/etc/fonts.xml";

    @NotNull
    public static final String SYSTEM_FONTS_XML_PATH = "/system/etc/system_fonts.xml";

    @NotNull
    private static final String TAG = "SystemFontsParser";

    @NotNull
    private static final List<Pair<Fonts.Weight, String>> fontFilesOrder;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final List<String> SYSTEM_FONTS_PATHS = d0.g("/system/fonts/", "/system/font/", "/data/fonts/", "/system/product/fonts/");

    @Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JR\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00070\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00072\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\u0006\u0010\u0015\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004H\u0002JD\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00070\r2\u0006\u0010\u0015\u001a\u00020\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0002J&\u0010\u001d\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00042\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0004H\u0002J\u0018\u0010\"\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0004H\u0002J\u001b\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010$\u001a\u00020%H\u0000¢\u0006\u0002\b&J!\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00100(2\u0006\u0010$\u001a\u00020%H\u0000¢\u0006\u0002\b)J\u0012\u0010*\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010+\u001a\u00020,2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u001a\u0010-\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J \u0010.\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001e\u001a\u00020\u001f2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001100H\u0002J\u0016\u00101\u001a\b\u0012\u0004\u0012\u00020\u00130\u00072\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u00102\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J$\u00103\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0007\u0018\u00010\r2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0016\u00104\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J2\u00105\u001a\u0002062\u0006\u0010\u001e\u001a\u00020\u001f2\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0010082\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001100H\u0002J$\u00109\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u001e\u001a\u00020\u001f2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001100H\u0002J\u0016\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u001c\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00100(2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u001a\u0010<\u001a\u0004\u0018\u00010\u00102\u0006\u0010=\u001a\u00020\u00112\u0006\u0010>\u001a\u00020\u0010H\u0002J\u0010\u0010?\u001a\u0002062\u0006\u0010\u001e\u001a\u00020\u001fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R \u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\r0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006@"}, d2 = {"Lapp/rive/runtime/kotlin/fonts/SystemFontsParser$Companion;", "", "()V", "FALLBACK_FONTS_XML_PATH", "", "FONTS_XML_PATH", "SYSTEM_FONTS_PATHS", "", "getSYSTEM_FONTS_PATHS$kotlin_release", "()Ljava/util/List;", "SYSTEM_FONTS_XML_PATH", "TAG", "fontFilesOrder", "Lkotlin/Pair;", "Lapp/rive/runtime/kotlin/fonts/Fonts$Weight;", "fromFileFonts", "Lapp/rive/runtime/kotlin/fonts/Fonts$Family;", "Lapp/rive/runtime/kotlin/fonts/Fonts$Alias;", "filesList", "Lapp/rive/runtime/kotlin/fonts/Fonts$FileFont;", "aliasNames", "familyName", "familyLang", "familyVariant", "fromFontList", "fontList", "Lapp/rive/runtime/kotlin/fonts/Fonts$Font;", "lang", "variant", "getOptionalAttribute", "parser", "Lorg/xmlpull/v1/XmlPullParser;", StackTraceHelper.NAME_KEY, "default", "getRequiredAttribute", "parseFontsXML", "xmlFileStream", "Ljava/io/InputStream;", "parseFontsXML$kotlin_release", "parseFontsXMLMap", "", "parseFontsXMLMap$kotlin_release", "readAlias", "readAxis", "Lapp/rive/runtime/kotlin/fonts/Fonts$Axis;", "readFamily", "readFamilyEntry", "aliases", "", "readFileset", "readFont", "readLegacyFamily", "readNameset", "readNestedFamilies", "", "familiesMap", "", "readNestedFamiliesList", "readRootElement", "readRootElementMap", "remapAlias", "alias", "ogFamily", "skip", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nFontHelpers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontHelpers.kt\napp/rive/runtime/kotlin/fonts/SystemFontsParser$Companion\n+ 2 RiveLog.kt\napp/rive/RiveLog\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,1170:1\n65#2:1171\n65#2:1174\n65#2:1175\n65#2:1177\n65#2:1183\n65#2:1185\n65#2:1186\n69#2,2:1187\n65#2:1189\n69#2,2:1197\n69#2,2:1199\n65#2:1203\n65#2:1204\n69#2,2:1213\n65#2:1229\n65#2:1238\n69#2,2:1239\n65#2:1241\n65#2:1242\n65#2:1243\n1#3:1172\n1#3:1225\n1863#4:1173\n1864#4:1176\n1557#4:1178\n1628#4,3:1179\n1863#4:1182\n1864#4:1184\n1872#4,2:1201\n1874#4:1212\n1611#4,9:1215\n1863#4:1224\n1864#4:1226\n1620#4:1227\n1863#4:1228\n1864#4:1237\n381#5,7:1190\n381#5,7:1205\n381#5,7:1230\n*S KotlinDebug\n*F\n+ 1 FontHelpers.kt\napp/rive/runtime/kotlin/fonts/SystemFontsParser$Companion\n*L\n537#1:1171\n573#1:1174\n576#1:1175\n611#1:1177\n642#1:1183\n735#1:1185\n755#1:1186\n761#1:1187,2\n784#1:1189\n820#1:1197,2\n868#1:1199,2\n921#1:1203\n928#1:1204\n938#1:1213,2\n982#1:1229\n991#1:1238\n1034#1:1239,2\n1087#1:1241\n1126#1:1242\n1133#1:1243\n949#1:1225\n566#1:1173\n566#1:1176\n633#1:1178\n633#1:1179,3\n634#1:1182\n634#1:1184\n919#1:1201,2\n919#1:1212\n949#1:1215,9\n949#1:1224\n949#1:1226\n949#1:1227\n980#1:1228\n980#1:1237\n817#1:1190,7\n934#1:1205,7\n986#1:1230,7\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Pair<Fonts.Family, List<Fonts.Alias>> fromFileFonts(List<Fonts.FileFont> filesList, List<String> aliasNames, final String familyName, String familyLang, String familyVariant) {
            String lang = familyLang;
            String variant = familyVariant;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<T> it = filesList.iterator();
            int i7 = 0;
            while (true) {
                String str = null;
                if (!it.hasNext()) {
                    if (linkedHashMap.isEmpty()) {
                        RiveLog.INSTANCE.getLogger().e(SystemFontsParser.TAG, null, new Function0<String>() { // from class: app.rive.runtime.kotlin.fonts.SystemFontsParser$Companion$fromFileFonts$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final String invoke() {
                                return g.e("Could not extract any valid fonts from <fileset> for legacy family '", familyName, "'");
                            }
                        });
                        return new Pair<>(new Fonts.Family(familyName, variant, lang, w0.d()), n0.f14659d);
                    }
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it2 = aliasNames.iterator();
                    while (it2.hasNext()) {
                        String string = StringsKt.b0((String) it2.next()).toString();
                        Fonts.Alias alias = string.length() > 0 ? new Fonts.Alias(string, familyName, null) : null;
                        if (alias != null) {
                            arrayList.add(alias);
                        }
                    }
                    if (variant == null) {
                        Fonts.FileFont fileFont = (Fonts.FileFont) CollectionsKt.firstOrNull(filesList);
                        variant = fileFont != null ? fileFont.getVariant() : null;
                    }
                    if (lang == null) {
                        Fonts.FileFont fileFont2 = (Fonts.FileFont) CollectionsKt.firstOrNull(filesList);
                        lang = fileFont2 != null ? fileFont2.getLang() : null;
                    }
                    String string2 = variant != null ? StringsKt.b0(variant).toString() : null;
                    if (string2 == null || StringsKt.K(string2)) {
                        string2 = null;
                    }
                    String string3 = lang != null ? StringsKt.b0(lang).toString() : null;
                    if (string3 != null && !StringsKt.K(string3)) {
                        str = string3;
                    }
                    return new Pair<>(new Fonts.Family(familyName, string2, str, linkedHashMap), arrayList);
                }
                Object next = it.next();
                int i10 = i7 + 1;
                if (i7 < 0) {
                    d0.k();
                    throw null;
                }
                final Fonts.FileFont fileFont3 = (Fonts.FileFont) next;
                if (i7 >= SystemFontsParser.fontFilesOrder.size()) {
                    RiveLog.INSTANCE.getLogger().w(SystemFontsParser.TAG, new Function0<String>() { // from class: app.rive.runtime.kotlin.fonts.SystemFontsParser$Companion$fromFileFonts$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final String invoke() {
                            String str2 = familyName;
                            int size = SystemFontsParser.fontFilesOrder.size();
                            return a.k(e.t("Legacy family '", str2, "' has more than ", size, " files in <fileset>. Ignoring extra file: '"), fileFont3.getName(), "'");
                        }
                    });
                } else {
                    Pair pair = (Pair) SystemFontsParser.fontFilesOrder.get(i7);
                    Fonts.Weight weight = (Fonts.Weight) pair.f14612d;
                    String str2 = (String) pair.f14613e;
                    String string4 = StringsKt.b0(fileFont3.getName()).toString();
                    if (string4.length() == 0) {
                        RiveLog.INSTANCE.getLogger().w(SystemFontsParser.TAG, new Function0<String>() { // from class: app.rive.runtime.kotlin.fonts.SystemFontsParser$Companion$fromFileFonts$1$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final String invoke() {
                                return g.e("Skipping empty filename in <fileset> for family '", familyName, "'.");
                            }
                        });
                    } else {
                        Fonts.Font font = new Fonts.Font(weight, str2, string4, null, 0, null, null, 112, null);
                        Object arrayList2 = linkedHashMap.get(weight);
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                            linkedHashMap.put(weight, arrayList2);
                        }
                        ((List) arrayList2).add(font);
                    }
                }
                i7 = i10;
            }
        }

        private final Pair<Fonts.Family, List<Fonts.Alias>> fromFontList(final String familyName, List<Fonts.Font> fontList, String lang, String variant) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Fonts.Font font : fontList) {
                if (StringsKt.K(font.getName())) {
                    RiveLog.INSTANCE.getLogger().w(SystemFontsParser.TAG, new Function0<String>() { // from class: app.rive.runtime.kotlin.fonts.SystemFontsParser$Companion$fromFontList$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final String invoke() {
                            return g.e("Skipping font with blank filename in family '", familyName, "'.");
                        }
                    });
                } else {
                    Fonts.Weight weight = font.getWeight();
                    Object arrayList = linkedHashMap.get(weight);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(weight, arrayList);
                    }
                    ((List) arrayList).add(font);
                }
            }
            if (!linkedHashMap.isEmpty()) {
                return new Pair<>(new Fonts.Family(familyName, variant, lang, linkedHashMap), n0.f14659d);
            }
            RiveLog.INSTANCE.getLogger().w(SystemFontsParser.TAG, new Function0<String>() { // from class: app.rive.runtime.kotlin.fonts.SystemFontsParser$Companion$fromFontList$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return g.e("Family '", familyName, "' from <font> list resulted in no valid fonts. Creating empty family.");
                }
            });
            return new Pair<>(new Fonts.Family(familyName, variant, lang, w0.d()), n0.f14659d);
        }

        private final String getOptionalAttribute(XmlPullParser parser, String name, String str) {
            String attributeValue = parser.getAttributeValue(null, name);
            return attributeValue == null ? str : attributeValue;
        }

        public static /* synthetic */ String getOptionalAttribute$default(Companion companion, XmlPullParser xmlPullParser, String str, String str2, int i7, Object obj) {
            if ((i7 & 4) != 0) {
                str2 = null;
            }
            return companion.getOptionalAttribute(xmlPullParser, str, str2);
        }

        private final String getRequiredAttribute(XmlPullParser parser, String name) {
            String attributeValue = parser.getAttributeValue(null, name);
            if (attributeValue != null) {
                return attributeValue;
            }
            throw new IllegalArgumentException(e.l("Missing required attribute: ", name));
        }

        private final Fonts.Alias readAlias(XmlPullParser parser) throws XmlPullParserException, IOException {
            XmlPullParser xmlPullParser;
            parser.require(2, null, "alias");
            try {
                final String requiredAttribute = getRequiredAttribute(parser, StackTraceHelper.NAME_KEY);
                final String requiredAttribute2 = getRequiredAttribute(parser, "to");
                xmlPullParser = parser;
                try {
                    String optionalAttribute$default = getOptionalAttribute$default(this, xmlPullParser, "weight", null, 4, null);
                    Fonts.Weight weightFromString = optionalAttribute$default != null ? Fonts.Weight.INSTANCE.fromString(optionalAttribute$default) : null;
                    skip(xmlPullParser);
                    if (!StringsKt.K(requiredAttribute) && !StringsKt.K(requiredAttribute2)) {
                        return new Fonts.Alias(StringsKt.b0(requiredAttribute).toString(), StringsKt.b0(requiredAttribute2).toString(), weightFromString);
                    }
                    RiveLog.INSTANCE.getLogger().w(SystemFontsParser.TAG, new Function0<String>() { // from class: app.rive.runtime.kotlin.fonts.SystemFontsParser$Companion$readAlias$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final String invoke() {
                            return g.f("Skipping alias with blank name ('", requiredAttribute, "') or to ('", requiredAttribute2, "').");
                        }
                    });
                    return null;
                } catch (IllegalArgumentException e10) {
                    e = e10;
                    final IllegalArgumentException illegalArgumentException = e;
                    RiveLog.INSTANCE.getLogger().e(SystemFontsParser.TAG, null, new Function0<String>() { // from class: app.rive.runtime.kotlin.fonts.SystemFontsParser$Companion$readAlias$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final String invoke() {
                            return e.l("Skipping alias due to missing required attribute: ", illegalArgumentException.getMessage());
                        }
                    });
                    skip(xmlPullParser);
                    return null;
                }
            } catch (IllegalArgumentException e11) {
                e = e11;
                xmlPullParser = parser;
            }
        }

        private final Fonts.Axis readAxis(XmlPullParser parser) throws XmlPullParserException, IOException {
            String requiredAttribute = getRequiredAttribute(parser, "tag");
            String requiredAttribute2 = getRequiredAttribute(parser, "stylevalue");
            skip(parser);
            if (StringsKt.K(requiredAttribute) || StringsKt.K(requiredAttribute2)) {
                throw new IllegalArgumentException("Axis tag found with blank 'tag' or 'stylevalue'.");
            }
            return new Fonts.Axis(requiredAttribute, requiredAttribute2);
        }

        private final Fonts.Family readFamily(final String familyName, XmlPullParser parser) throws XmlPullParserException, IOException {
            Companion companion = SystemFontsParser.INSTANCE;
            String optionalAttribute$default = getOptionalAttribute$default(companion, parser, "lang", null, 4, null);
            String optionalAttribute$default2 = getOptionalAttribute$default(companion, parser, "variant", null, 4, null);
            String optionalAttribute$default3 = getOptionalAttribute$default(companion, parser, "ignore", null, 4, null);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (parser.next() != 3) {
                if (parser.getEventType() == 2) {
                    String name = parser.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    if (Intrinsics.areEqual(StringsKt.b0(name).toString(), "font")) {
                        try {
                            Fonts.Font font = readFont(parser);
                            Fonts.Weight weight = font.getWeight();
                            Object arrayList = linkedHashMap.get(weight);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                linkedHashMap.put(weight, arrayList);
                            }
                            ((List) arrayList).add(font);
                        } catch (Exception e10) {
                            RiveLog.INSTANCE.getLogger().e(SystemFontsParser.TAG, null, new Function0<String>() { // from class: app.rive.runtime.kotlin.fonts.SystemFontsParser$Companion$readFamily$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final String invoke() {
                                    return e.m("Failed to read <font> in family '", familyName, "': ", e10.getMessage());
                                }
                            });
                        }
                    } else {
                        skip(parser);
                    }
                }
            }
            if (CollectionsKt.E(d0.g("true", "1"), optionalAttribute$default3) || linkedHashMap.isEmpty()) {
                return null;
            }
            return new Fonts.Family(familyName, optionalAttribute$default2, optionalAttribute$default, linkedHashMap);
        }

        private final Fonts.Family readFamilyEntry(XmlPullParser parser, List<Fonts.Alias> aliases) throws XmlPullParserException, IOException {
            parser.require(2, null, "family");
            String optionalAttribute$default = getOptionalAttribute$default(this, parser, StackTraceHelper.NAME_KEY, null, 4, null);
            String string = optionalAttribute$default != null ? StringsKt.b0(optionalAttribute$default).toString() : null;
            if (string != null && string.length() > 0) {
                return readFamily(string, parser);
            }
            Pair<Fonts.Family, List<Fonts.Alias>> legacyFamily = readLegacyFamily(parser);
            if (legacyFamily == null) {
                return null;
            }
            Fonts.Family family = (Fonts.Family) legacyFamily.f14612d;
            List list = (List) legacyFamily.f14613e;
            if (!list.isEmpty()) {
                RiveLog.INSTANCE.getLogger().w(SystemFontsParser.TAG, new Function0<String>() { // from class: app.rive.runtime.kotlin.fonts.SystemFontsParser$Companion$readFamilyEntry$1$1
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final String invoke() {
                        return "Legacy family generated aliases - these will be processed globally.";
                    }
                });
                aliases.addAll(list);
            }
            return family;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x007a  */
        /* JADX WARN: Code duplicated, block: B:33:0x00a9  */
        private final List<Fonts.FileFont> readFileset(XmlPullParser parser) throws XmlPullParserException, IOException {
            final XmlPullParser xmlPullParser;
            String string;
            sn.e eVarB = c0.b();
            parser.require(2, null, "fileset");
            while (parser.next() != 3) {
                if (parser.getEventType() == 2) {
                    String name = parser.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    if (Intrinsics.areEqual(StringsKt.b0(name).toString(), "file")) {
                        Companion companion = SystemFontsParser.INSTANCE;
                        xmlPullParser = parser;
                        String optionalAttribute$default = getOptionalAttribute$default(companion, xmlPullParser, "variant", null, 4, null);
                        if (optionalAttribute$default == null || StringsKt.K(optionalAttribute$default)) {
                            optionalAttribute$default = null;
                        }
                        String optionalAttribute$default2 = getOptionalAttribute$default(companion, xmlPullParser, "lang", null, 4, null);
                        if (optionalAttribute$default2 == null || StringsKt.K(optionalAttribute$default2)) {
                            optionalAttribute$default2 = null;
                        }
                        StringBuilder sb2 = new StringBuilder();
                        if (xmlPullParser.next() == 4) {
                            String text = xmlPullParser.getText();
                            if (text != null) {
                                Intrinsics.checkNotNull(text);
                                string = StringsKt.b0(text).toString();
                                if (string == null) {
                                    string = "";
                                }
                            } else {
                                string = "";
                            }
                            sb2.append(string);
                            xmlPullParser.next();
                        }
                        String string2 = sb2.toString();
                        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                        if (xmlPullParser.getEventType() == 3) {
                            String name2 = xmlPullParser.getName();
                            Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                            if (!Intrinsics.areEqual(StringsKt.b0(name2).toString(), "file")) {
                                RiveLog.INSTANCE.getLogger().w(SystemFontsParser.TAG, new Function0<String>() { // from class: app.rive.runtime.kotlin.fonts.SystemFontsParser$Companion$readFileset$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final String invoke() throws XmlPullParserException {
                                        return "Expected </file> tag after reading text, found " + xmlPullParser.getEventType() + " " + xmlPullParser.getName();
                                    }
                                });
                            }
                        } else {
                            RiveLog.INSTANCE.getLogger().w(SystemFontsParser.TAG, new Function0<String>() { // from class: app.rive.runtime.kotlin.fonts.SystemFontsParser$Companion$readFileset$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final String invoke() throws XmlPullParserException {
                                    return "Expected </file> tag after reading text, found " + xmlPullParser.getEventType() + " " + xmlPullParser.getName();
                                }
                            });
                        }
                        if (string2.length() == 0) {
                            string2 = null;
                        }
                        if (string2 != null) {
                            eVarB.add(new Fonts.FileFont(string2, optionalAttribute$default, optionalAttribute$default2));
                        } else {
                            RiveLog.INSTANCE.getLogger().w(SystemFontsParser.TAG, new Function0<String>() { // from class: app.rive.runtime.kotlin.fonts.SystemFontsParser$Companion$readFileset$1$4
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final String invoke() {
                                    return "Skipping <file> tag with empty content within <fileset>";
                                }
                            });
                        }
                    } else {
                        xmlPullParser = parser;
                        SystemFontsParser.INSTANCE.skip(xmlPullParser);
                    }
                    parser = xmlPullParser;
                }
            }
            return c0.a(eVarB);
        }

        private final Fonts.Font readFont(XmlPullParser parser) throws XmlPullParserException, IOException {
            String text;
            Integer intOrNull;
            parser.require(2, null, "font");
            Fonts.Weight.Companion companion = Fonts.Weight.INSTANCE;
            Fonts.Weight weightFromString = companion.fromString(getOptionalAttribute(parser, "weight", String.valueOf(companion.getNORMAL().getWeight())));
            String optionalAttribute = getOptionalAttribute(parser, "style", "normal");
            String str = optionalAttribute == null ? "normal" : optionalAttribute;
            String optionalAttribute$default = getOptionalAttribute$default(this, parser, "index", null, 4, null);
            int iIntValue = (optionalAttribute$default == null || (intOrNull = StringsKt.toIntOrNull(optionalAttribute$default)) == null) ? 0 : intOrNull.intValue();
            String optionalAttribute$default2 = getOptionalAttribute$default(this, parser, "postScriptName", null, 4, null);
            String str2 = (optionalAttribute$default2 == null || StringsKt.K(optionalAttribute$default2)) ? null : optionalAttribute$default2;
            String optionalAttribute$default3 = getOptionalAttribute$default(this, parser, "fallbackFor", null, 4, null);
            String str3 = (optionalAttribute$default3 == null || StringsKt.K(optionalAttribute$default3)) ? null : optionalAttribute$default3;
            StringBuilder sb2 = new StringBuilder();
            ArrayList arrayList = new ArrayList();
            while (parser.next() != 3) {
                int eventType = parser.getEventType();
                if (eventType == 2) {
                    String name = parser.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    if (Intrinsics.areEqual(StringsKt.b0(name).toString(), "axis")) {
                        try {
                            arrayList.add(readAxis(parser));
                        } catch (Exception e10) {
                            RiveLog.INSTANCE.getLogger().e(SystemFontsParser.TAG, null, new Function0<String>() { // from class: app.rive.runtime.kotlin.fonts.SystemFontsParser$Companion$readFont$3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final String invoke() {
                                    return e.l("Failed to read <axis> tag: ", e10.getMessage());
                                }
                            });
                        }
                    } else {
                        skip(parser);
                    }
                } else if (eventType == 4 && (text = parser.getText()) != null) {
                    sb2.append(text);
                }
            }
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            String string2 = StringsKt.b0(string).toString();
            if (string2.length() == 0) {
                string2 = null;
            }
            if (string2 != null) {
                return new Fonts.Font(weightFromString, str, string2, !arrayList.isEmpty() ? arrayList : null, iIntValue, str2, str3);
            }
            throw new IllegalStateException("Font tag found with empty filename");
        }

        private final Pair<Fonts.Family, List<Fonts.Alias>> readLegacyFamily(final XmlPullParser parser) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            String optionalAttribute$default = getOptionalAttribute$default(this, parser, "variant", null, 4, null);
            String optionalAttribute$default2 = getOptionalAttribute$default(this, parser, "lang", null, 4, null);
            while (parser.next() != 3) {
                if (parser.getEventType() == 2) {
                    try {
                        String name = parser.getName();
                        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                        String string = StringsKt.b0(name).toString();
                        int iHashCode = string.hashCode();
                        if (iHashCode != -854981274) {
                            if (iHashCode != 3148879) {
                                if (iHashCode == 1721971191 && string.equals("nameset")) {
                                    arrayList.addAll(readNameset(parser));
                                } else {
                                    skip(parser);
                                }
                            } else if (string.equals("font")) {
                                arrayList3.add(readFont(parser));
                            } else {
                                skip(parser);
                            }
                        } else if (string.equals("fileset")) {
                            arrayList2.addAll(readFileset(parser));
                        } else {
                            skip(parser);
                        }
                    } catch (Exception e10) {
                        RiveLog.INSTANCE.getLogger().e(SystemFontsParser.TAG, null, new Function0<String>() { // from class: app.rive.runtime.kotlin.fonts.SystemFontsParser$Companion$readLegacyFamily$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final String invoke() {
                                return e.m("Error reading tag '", parser.getName(), "' inside legacy family - Skipping tag - ", e10.getMessage());
                            }
                        });
                    }
                }
            }
            if (!arrayList3.isEmpty()) {
                return fromFontList(arrayList.isEmpty() ? "" : (String) arrayList.remove(0), arrayList3, optionalAttribute$default2, optionalAttribute$default);
            }
            if (arrayList2.isEmpty()) {
                return null;
            }
            if (arrayList.isEmpty()) {
                arrayList.add("");
            }
            return fromFileFonts(arrayList2, arrayList, StringsKt.b0((String) arrayList.remove(0)).toString(), optionalAttribute$default2, optionalAttribute$default);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x006b  */
        private final List<String> readNameset(final XmlPullParser parser) throws XmlPullParserException, IOException {
            String string;
            parser.require(2, null, "nameset");
            ArrayList arrayList = new ArrayList();
            while (parser.next() != 3) {
                if (parser.getEventType() == 2) {
                    String name = parser.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    if (Intrinsics.areEqual(StringsKt.b0(name).toString(), StackTraceHelper.NAME_KEY)) {
                        String str = "";
                        if (parser.next() == 4) {
                            String text = parser.getText();
                            if (text != null && (string = StringsKt.b0(text).toString()) != null) {
                                str = string;
                            }
                            parser.next();
                        }
                        if (parser.getEventType() == 3) {
                            String name2 = parser.getName();
                            Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                            if (!Intrinsics.areEqual(StringsKt.b0(name2).toString(), StackTraceHelper.NAME_KEY)) {
                                RiveLog.INSTANCE.getLogger().w(SystemFontsParser.TAG, new Function0<String>() { // from class: app.rive.runtime.kotlin.fonts.SystemFontsParser$Companion$readNameset$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final String invoke() throws XmlPullParserException {
                                        return "Expected </name> tag after reading text, but found " + parser.getEventType() + " " + parser.getName();
                                    }
                                });
                            }
                        } else {
                            RiveLog.INSTANCE.getLogger().w(SystemFontsParser.TAG, new Function0<String>() { // from class: app.rive.runtime.kotlin.fonts.SystemFontsParser$Companion$readNameset$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final String invoke() throws XmlPullParserException {
                                    return "Expected </name> tag after reading text, but found " + parser.getEventType() + " " + parser.getName();
                                }
                            });
                        }
                        if (!StringsKt.K(str)) {
                            arrayList.add(str);
                        }
                    } else {
                        skip(parser);
                    }
                }
            }
            return arrayList;
        }

        private final void readNestedFamilies(XmlPullParser parser, Map<String, Fonts.Family> familiesMap, List<Fonts.Alias> aliases) throws XmlPullParserException, IOException {
            parser.require(2, null, "familyset");
            while (parser.next() != 3) {
                if (parser.getEventType() == 2) {
                    String name = parser.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    String string = StringsKt.b0(name).toString();
                    if (Intrinsics.areEqual(string, "family")) {
                        Fonts.Family familyEntry = readFamilyEntry(parser, aliases);
                        if (familyEntry != null) {
                            String name2 = familyEntry.getName();
                            familiesMap.put((name2 == null || name2.length() == 0) ? ((Fonts.Font) CollectionsKt.K(e0.m(familyEntry.getFonts().values()))).getName() : familyEntry.getName(), familyEntry);
                        }
                    } else if (Intrinsics.areEqual(string, "alias")) {
                        Fonts.Alias alias = readAlias(parser);
                        if (alias != null) {
                            aliases.add(alias);
                        }
                    } else {
                        skip(parser);
                    }
                }
            }
        }

        private final List<Fonts.Family> readNestedFamiliesList(XmlPullParser parser, List<Fonts.Alias> aliases) throws XmlPullParserException, IOException {
            parser.require(2, null, "familyset");
            ArrayList arrayList = new ArrayList();
            while (parser.next() != 3) {
                if (parser.getEventType() == 2) {
                    String name = parser.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    String string = StringsKt.b0(name).toString();
                    if (Intrinsics.areEqual(string, "family")) {
                        Fonts.Family familyEntry = readFamilyEntry(parser, aliases);
                        if (familyEntry != null) {
                            arrayList.add(familyEntry);
                        }
                    } else if (Intrinsics.areEqual(string, "alias")) {
                        Fonts.Alias alias = readAlias(parser);
                        if (alias != null) {
                            aliases.add(alias);
                        }
                    } else {
                        skip(parser);
                    }
                }
            }
            return arrayList;
        }

        private final List<Fonts.Family> readRootElement(XmlPullParser parser) throws XmlPullParserException, IOException {
            boolean z5;
            Object next;
            Fonts.Family familyRemapAlias;
            Object next2;
            parser.require(2, null, null);
            final String name = parser.getName();
            if (!Intrinsics.areEqual(name, "familyset") && !Intrinsics.areEqual(name, "fonts-modification") && !Intrinsics.areEqual(name, "config")) {
                RiveLog.INSTANCE.getLogger().w(SystemFontsParser.TAG, new Function0<String>() { // from class: app.rive.runtime.kotlin.fonts.SystemFontsParser$Companion$readRootElement$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final String invoke() {
                        return g.e("Unexpected root tag '", name, "' in font XML");
                    }
                });
            }
            ArrayList arrayList = new ArrayList();
            ArrayList<Fonts.Alias> arrayList2 = new ArrayList();
            while (parser.next() != 3) {
                if (parser.getEventType() == 2) {
                    String name2 = parser.getName();
                    Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                    String string = StringsKt.b0(name2).toString();
                    int iHashCode = string.hashCode();
                    if (iHashCode != -1359677826) {
                        if (iHashCode != -1281860764) {
                            if (iHashCode == 92902992 && string.equals("alias")) {
                                Fonts.Alias alias = readAlias(parser);
                                if (alias != null) {
                                    arrayList2.add(alias);
                                }
                            } else {
                                skip(parser);
                            }
                        } else if (string.equals("family")) {
                            Fonts.Family familyEntry = readFamilyEntry(parser, arrayList2);
                            if (familyEntry != null) {
                                arrayList.add(familyEntry);
                            }
                        } else {
                            skip(parser);
                        }
                    } else if (string.equals("familyset")) {
                        arrayList.addAll(readNestedFamiliesList(parser, arrayList2));
                    } else {
                        skip(parser);
                    }
                }
            }
            ArrayList arrayList3 = new ArrayList(e0.l(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList3.add(((Fonts.Family) it.next()).getName());
            }
            LinkedHashSet linkedHashSetK0 = CollectionsKt.k0(arrayList3);
            for (final Fonts.Alias alias2 : arrayList2) {
                if (!linkedHashSetK0.contains(alias2.getName())) {
                    Iterator it2 = arrayList.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it2.next();
                    } while (!Intrinsics.areEqual(((Fonts.Family) next2).getName(), alias2.getOriginal()));
                    Fonts.Family family = (Fonts.Family) next2;
                    if (family != null) {
                        Fonts.Family familyRemapAlias2 = SystemFontsParser.INSTANCE.remapAlias(alias2, family);
                        if (familyRemapAlias2 != null) {
                            linkedHashSetK0.add(alias2.getName());
                            arrayList.add(familyRemapAlias2);
                        } else {
                            RiveLog.INSTANCE.getLogger().w(SystemFontsParser.TAG, new Function0<String>() { // from class: app.rive.runtime.kotlin.fonts.SystemFontsParser$Companion$readRootElement$4$2$2
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final String invoke() {
                                    return g.f("Could not remap alias '", alias2.getName(), "' because target '", alias2.getOriginal(), "' not found.");
                                }
                            });
                        }
                    }
                }
            }
            ArrayList arrayListJ0 = CollectionsKt.j0(arrayList2);
            for (boolean z6 = true; z6 && !arrayListJ0.isEmpty(); z6 = z5) {
                Iterator it3 = arrayListJ0.iterator();
                z5 = false;
                while (it3.hasNext()) {
                    Fonts.Alias alias3 = (Fonts.Alias) it3.next();
                    if (linkedHashSetK0.contains(alias3.getName())) {
                        it3.remove();
                    } else {
                        Iterator it4 = arrayList.iterator();
                        do {
                            if (!it4.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it4.next();
                        } while (!Intrinsics.areEqual(((Fonts.Family) next).getName(), alias3.getOriginal()));
                        Fonts.Family family2 = (Fonts.Family) next;
                        if (family2 != null && (familyRemapAlias = SystemFontsParser.INSTANCE.remapAlias(alias3, family2)) != null) {
                            linkedHashSetK0.add(alias3.getName());
                            arrayList.add(familyRemapAlias);
                            it3.remove();
                            z5 = true;
                        }
                    }
                }
            }
            return arrayList;
        }

        private final Map<String, Fonts.Family> readRootElementMap(XmlPullParser parser) throws XmlPullParserException, IOException {
            boolean z5;
            Fonts.Family familyRemapAlias;
            Unit unit;
            parser.require(2, null, null);
            final String name = parser.getName();
            if (!Intrinsics.areEqual(name, "familyset") && !Intrinsics.areEqual(name, "fonts-modification") && !Intrinsics.areEqual(name, "config")) {
                RiveLog.INSTANCE.getLogger().w(SystemFontsParser.TAG, new Function0<String>() { // from class: app.rive.runtime.kotlin.fonts.SystemFontsParser$Companion$readRootElementMap$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final String invoke() {
                        return g.e("Unexpected root tag '", name, "' in font XML");
                    }
                });
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ArrayList<Fonts.Alias> arrayList = new ArrayList();
            while (parser.next() != 3) {
                if (parser.getEventType() == 2) {
                    String name2 = parser.getName();
                    Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                    String string = StringsKt.b0(name2).toString();
                    int iHashCode = string.hashCode();
                    if (iHashCode != -1359677826) {
                        if (iHashCode != -1281860764) {
                            if (iHashCode == 92902992 && string.equals("alias")) {
                                Fonts.Alias alias = readAlias(parser);
                                if (alias != null) {
                                    arrayList.add(alias);
                                }
                            } else {
                                skip(parser);
                            }
                        } else if (string.equals("family")) {
                            Fonts.Family familyEntry = readFamilyEntry(parser, arrayList);
                            if (familyEntry != null) {
                                String name3 = familyEntry.getName();
                                linkedHashMap.put((name3 == null || name3.length() == 0) ? ((Fonts.Font) CollectionsKt.K(e0.m(familyEntry.getFonts().values()))).getName() : familyEntry.getName(), familyEntry);
                            }
                        } else {
                            skip(parser);
                        }
                    } else if (string.equals("familyset")) {
                        readNestedFamilies(parser, linkedHashMap, arrayList);
                    } else {
                        skip(parser);
                    }
                }
            }
            for (final Fonts.Alias alias2 : arrayList) {
                if (linkedHashMap.containsKey(alias2.getName())) {
                    RiveLog.INSTANCE.getLogger().w(SystemFontsParser.TAG, new Function0<String>() { // from class: app.rive.runtime.kotlin.fonts.SystemFontsParser$Companion$readRootElementMap$4$2
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final String invoke() {
                            return g.e("Skipping alias '", alias2.getName(), "' because a family with that name already exists.");
                        }
                    });
                } else {
                    Fonts.Family family = (Fonts.Family) linkedHashMap.get(alias2.getOriginal());
                    if (family != null) {
                        Fonts.Family familyRemapAlias2 = SystemFontsParser.INSTANCE.remapAlias(alias2, family);
                        if (familyRemapAlias2 != null) {
                            linkedHashMap.put(alias2.getName(), familyRemapAlias2);
                            unit = Unit.f14616a;
                        } else {
                            unit = null;
                        }
                        if (unit == null) {
                            RiveLog.INSTANCE.getLogger().w(SystemFontsParser.TAG, new Function0<String>() { // from class: app.rive.runtime.kotlin.fonts.SystemFontsParser$Companion$readRootElementMap$4$1$2
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final String invoke() {
                                    return g.f("Could not remap alias '", alias2.getName(), "' because target '", alias2.getOriginal(), "' not found.");
                                }
                            });
                        }
                    }
                }
            }
            ArrayList arrayListJ0 = CollectionsKt.j0(arrayList);
            for (boolean z6 = true; z6 && !arrayListJ0.isEmpty(); z6 = z5) {
                Iterator it = arrayListJ0.iterator();
                z5 = false;
                while (it.hasNext()) {
                    Fonts.Alias alias3 = (Fonts.Alias) it.next();
                    if (linkedHashMap.containsKey(alias3.getName())) {
                        it.remove();
                    } else {
                        Fonts.Family family2 = (Fonts.Family) linkedHashMap.get(alias3.getOriginal());
                        if (family2 != null && (familyRemapAlias = SystemFontsParser.INSTANCE.remapAlias(alias3, family2)) != null) {
                            linkedHashMap.put(alias3.getName(), familyRemapAlias);
                            it.remove();
                            z5 = true;
                        }
                    }
                }
            }
            return linkedHashMap;
        }

        private final Fonts.Family remapAlias(final Fonts.Alias alias, Fonts.Family ogFamily) {
            final Fonts.Weight weight = alias.getWeight();
            if (weight == null) {
                return new Fonts.Family(alias.getName(), ogFamily.getVariant(), ogFamily.getLang(), ogFamily.getFonts());
            }
            List<Fonts.Font> list = ogFamily.getFonts().get(weight);
            if (list == null || list.isEmpty()) {
                RiveLog.INSTANCE.getLogger().w(SystemFontsParser.TAG, new Function0<String>() { // from class: app.rive.runtime.kotlin.fonts.SystemFontsParser$Companion$remapAlias$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final String invoke() {
                        String name = alias.getName();
                        int weight2 = weight.getWeight();
                        return a.k(e.t("Alias '", name, "' targets weight ", weight2, " in family '"), alias.getOriginal(), "', but that doesn't exist");
                    }
                });
                return null;
            }
            return new Fonts.Family(alias.getName(), ogFamily.getVariant(), ogFamily.getLang(), v0.b(new Pair(weight, list)));
        }

        private final void skip(XmlPullParser parser) throws XmlPullParserException, IOException {
            int i7 = 1;
            while (i7 > 0) {
                int next = parser.next();
                if (next == 1) {
                    return;
                }
                if (next == 2) {
                    i7++;
                } else if (next == 3) {
                    i7--;
                }
            }
        }

        @NotNull
        public final List<String> getSYSTEM_FONTS_PATHS$kotlin_release() {
            return SystemFontsParser.SYSTEM_FONTS_PATHS;
        }

        @NotNull
        public final List<Fonts.Family> parseFontsXML$kotlin_release(@NotNull InputStream xmlFileStream) throws XmlPullParserException, IOException {
            Intrinsics.checkNotNullParameter(xmlFileStream, "xmlFileStream");
            XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
            xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
            xmlPullParserNewPullParser.setInput(xmlFileStream, null);
            xmlPullParserNewPullParser.nextTag();
            Intrinsics.checkNotNull(xmlPullParserNewPullParser);
            return readRootElement(xmlPullParserNewPullParser);
        }

        @NotNull
        public final Map<String, Fonts.Family> parseFontsXMLMap$kotlin_release(@NotNull InputStream xmlFileStream) throws XmlPullParserException, IOException {
            Intrinsics.checkNotNullParameter(xmlFileStream, "xmlFileStream");
            XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
            xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
            xmlPullParserNewPullParser.setInput(xmlFileStream, null);
            xmlPullParserNewPullParser.nextTag();
            Intrinsics.checkNotNull(xmlPullParserNewPullParser);
            return readRootElementMap(xmlPullParserNewPullParser);
        }

        private Companion() {
        }
    }

    static {
        Fonts.Weight.Companion companion = Fonts.Weight.INSTANCE;
        fontFilesOrder = d0.g(new Pair(companion.getNORMAL(), "normal"), new Pair(companion.getBOLD(), "normal"), new Pair(companion.getNORMAL(), Fonts.Font.STYLE_ITALIC), new Pair(companion.getBOLD(), Fonts.Font.STYLE_ITALIC));
    }
}
