package app.rive.runtime.kotlin.fonts;

import app.rive.RiveLog;
import co.m;
import co.q;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.n0;
import kotlin.collections.v0;
import kotlin.collections.w0;
import kotlin.collections.y;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt;
import kotlin.text.x;
import n6.e;
import org.jetbrains.annotations.NotNull;
import rn.d;
import tn.a;
import xq.f;
import xq.n;
import xq.r;
import xq.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lapp/rive/runtime/kotlin/fonts/FontHelper;", "", "()V", "Companion", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FontHelper {
    public static final int $stable = 0;

    @NotNull
    private static final String TAG = "Rive/FontHelper";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final AtomicReference<Map<String, Fonts.Family>> familiesMapCache = new AtomicReference<>(null);

    @NotNull
    private static final AtomicReference<List<Fonts.Family>> familiesListCache = new AtomicReference<>(null);

    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J8\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0002J\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J(\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\n2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\nH\u0002J+\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0000¢\u0006\u0002\b\u001aJ1\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\n2\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0000¢\u0006\u0002\b\u001aJ\u0014\u0010\u001b\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u0019J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u001d2\u0006\u0010 \u001a\u00020\u0010J\u0010\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010 \u001a\u00020\u0010J\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u0014\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\nH\u0007J\u0013\u0010%\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0000¢\u0006\u0002\b&J\u0019\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\nH\u0000¢\u0006\u0002\b(J:\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\b0+2\b\u0010,\u001a\u0004\u0018\u00010\u00042\b\u0010-\u001a\u0004\u0018\u00010\u00122\b\u0010.\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010/\u001a\u00020\fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\n0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lapp/rive/runtime/kotlin/fonts/FontHelper$Companion;", "", "()V", "TAG", "", "familiesListCache", "Ljava/util/concurrent/atomic/AtomicReference;", "", "Lapp/rive/runtime/kotlin/fonts/Fonts$Family;", "familiesMapCache", "", "filterFamilies", "", "families", "resultSet", "", "Lapp/rive/runtime/kotlin/fonts/Fonts$Font;", "weight", "Lapp/rive/runtime/kotlin/fonts/Fonts$Weight;", "style", "filterNonExistingFonts", "fontFamilies", "findMatches", "fontFamiliesList", "opts", "Lapp/rive/runtime/kotlin/fonts/Fonts$FontOpts;", "findMatches$kotlin_release", "getFallbackFont", "getFallbackFontBytes", "", "getFallbackFonts", "getFontBytes", "font", "getFontFile", "Ljava/io/File;", "getSystemFontList", "getSystemFonts", "loadFontList", "loadFontList$kotlin_release", "loadFonts", "loadFonts$kotlin_release", "processMatchingFamilies", "matchingFamiliesSequence", "Lkotlin/sequences/Sequence;", "requestedLang", "requestedWeight", "requestedStyle", "resetForTesting", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nFontHelpers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontHelpers.kt\napp/rive/runtime/kotlin/fonts/FontHelper$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 4 RiveLog.kt\napp/rive/RiveLog\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,1170:1\n1#2:1171\n1#2:1233\n183#3,2:1172\n183#3,2:1177\n1317#3,2:1185\n183#3,2:1200\n69#4,2:1174\n65#4:1176\n69#4,2:1179\n65#4:1181\n69#4,2:1182\n1863#5:1184\n1864#5:1187\n3193#5,10:1188\n1062#5:1198\n1062#5:1199\n1202#5,2:1202\n1230#5,4:1204\n1611#5,9:1208\n1863#5:1217\n1246#5,2:1220\n774#5:1222\n865#5,2:1223\n1249#5:1225\n1864#5:1234\n1620#5:1235\n462#6:1218\n412#6:1219\n503#6,7:1226\n*S KotlinDebug\n*F\n+ 1 FontHelpers.kt\napp/rive/runtime/kotlin/fonts/FontHelper$Companion\n*L\n455#1:1233\n183#1:1172,2\n213#1:1177,2\n292#1:1185,2\n419#1:1200,2\n189#1:1174,2\n193#1:1176\n219#1:1179,2\n223#1:1181\n266#1:1182,2\n283#1:1184\n283#1:1187\n378#1:1188,10\n384#1:1198\n386#1:1199\n443#1:1202,2\n443#1:1204,4\n455#1:1208,9\n455#1:1217\n457#1:1220,2\n458#1:1222\n458#1:1223,2\n457#1:1225\n455#1:1234\n455#1:1235\n457#1:1218\n457#1:1219\n460#1:1226,7\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void filterFamilies(List<Fonts.Family> families, Set<Fonts.Font> resultSet, Fonts.Weight weight, String style) {
            Sequence<Fonts.Font> sequenceC;
            for (Fonts.Family family : families) {
                if (weight == null) {
                    q qVarC = CollectionsKt.C(family.getFonts().values());
                    Intrinsics.checkNotNullParameter(qVarC, "<this>");
                    sequenceC = n.b(qVarC, new e(19));
                } else {
                    List<Fonts.Font> list = family.getFonts().get(weight);
                    sequenceC = list != null ? CollectionsKt.C(list) : f.f23028a;
                }
                for (Fonts.Font font : sequenceC) {
                    if (style == null || StringsKt.K(style) || Intrinsics.areEqual(font.getStyle(), style)) {
                        resultSet.add(font);
                    }
                }
            }
        }

        private final Map<String, Fonts.Family> filterNonExistingFonts(Map<String, Fonts.Family> fontFamilies) {
            if (fontFamilies.isEmpty()) {
                return fontFamilies;
            }
            List<Fonts.Family> listFilterNonExistingFonts = filterNonExistingFonts(CollectionsKt.i0(fontFamilies.values()));
            int iA = v0.a(e0.l(listFilterNonExistingFonts, 10));
            if (iA < 16) {
                iA = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
            for (Object obj : listFilterNonExistingFonts) {
                Fonts.Family family = (Fonts.Family) obj;
                String name = family.getName();
                linkedHashMap.put((name == null || name.length() == 0) ? ((Fonts.Font) CollectionsKt.K(e0.m(family.getFonts().values()))).getName() : family.getName(), obj);
            }
            return linkedHashMap;
        }

        public static /* synthetic */ List findMatches$kotlin_release$default(Companion companion, Map map, Fonts.FontOpts fontOpts, int i7, Object obj) {
            if ((i7 & 2) != 0) {
                fontOpts = Fonts.FontOpts.INSTANCE.getDEFAULT();
            }
            return companion.findMatches$kotlin_release((Map<String, Fonts.Family>) map, fontOpts);
        }

        public static /* synthetic */ Fonts.Font getFallbackFont$default(Companion companion, Fonts.FontOpts fontOpts, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                fontOpts = null;
            }
            return companion.getFallbackFont(fontOpts);
        }

        public static /* synthetic */ byte[] getFallbackFontBytes$default(Companion companion, Fonts.FontOpts fontOpts, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                fontOpts = null;
            }
            return companion.getFallbackFontBytes(fontOpts);
        }

        public static /* synthetic */ List getFallbackFonts$default(Companion companion, Fonts.FontOpts fontOpts, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                fontOpts = Fonts.FontOpts.INSTANCE.getDEFAULT();
            }
            return companion.getFallbackFonts(fontOpts);
        }

        private final List<Fonts.Font> processMatchingFamilies(Sequence<Fonts.Family> matchingFamiliesSequence, final String requestedLang, Fonts.Weight requestedWeight, String requestedStyle) {
            List listQ = r.q(matchingFamiliesSequence);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : listQ) {
                String name = ((Fonts.Family) obj).getName();
                if (name == null || StringsKt.K(name)) {
                    arrayList2.add(obj);
                } else {
                    arrayList.add(obj);
                }
            }
            List<Fonts.Family> listE0 = CollectionsKt.e0(arrayList, new Comparator() { // from class: app.rive.runtime.kotlin.fonts.FontHelper$Companion$processMatchingFamilies$$inlined$sortedByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t5, T t10) {
                    return a.a(Boolean.valueOf(Intrinsics.areEqual(((Fonts.Family) t10).getLang(), requestedLang)), Boolean.valueOf(Intrinsics.areEqual(((Fonts.Family) t5).getLang(), requestedLang)));
                }
            });
            List<Fonts.Family> listE1 = CollectionsKt.e0(arrayList2, new Comparator() { // from class: app.rive.runtime.kotlin.fonts.FontHelper$Companion$processMatchingFamilies$$inlined$sortedByDescending$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t5, T t10) {
                    return a.a(Boolean.valueOf(Intrinsics.areEqual(((Fonts.Family) t10).getLang(), requestedLang)), Boolean.valueOf(Intrinsics.areEqual(((Fonts.Family) t5).getLang(), requestedLang)));
                }
            });
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            filterFamilies(listE0, linkedHashSet, requestedWeight, requestedStyle);
            filterFamilies(listE1, linkedHashSet, requestedWeight, requestedStyle);
            return CollectionsKt.i0(linkedHashSet);
        }

        @NotNull
        public final List<Fonts.Font> findMatches$kotlin_release(@NotNull Map<String, Fonts.Family> fontFamilies, @NotNull Fonts.FontOpts opts) {
            Intrinsics.checkNotNullParameter(fontFamilies, "fontFamilies");
            Intrinsics.checkNotNullParameter(opts, "opts");
            final String familyName = opts.getFamilyName();
            final String lang = opts.getLang();
            Intrinsics.checkNotNullParameter(fontFamilies, "<this>");
            return processMatchingFamilies(r.n(r.h(CollectionsKt.C(fontFamilies.entrySet()), new Function1<Map.Entry<? extends String, ? extends Fonts.Family>, Boolean>() { // from class: app.rive.runtime.kotlin.fonts.FontHelper$Companion$findMatches$matchingFamiliesSequence$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull Map.Entry<String, Fonts.Family> entry) {
                    Intrinsics.checkNotNullParameter(entry, "<name for destructuring parameter 0>");
                    Fonts.Family value = entry.getValue();
                    boolean z5 = true;
                    if ((familyName != null && !x.i(value.getName(), familyName, true)) || (lang != null && !Intrinsics.areEqual(value.getLang(), lang))) {
                        z5 = false;
                    }
                    return Boolean.valueOf(z5);
                }
            }), new Function1<Map.Entry<? extends String, ? extends Fonts.Family>, Fonts.Family>() { // from class: app.rive.runtime.kotlin.fonts.FontHelper$Companion$findMatches$matchingFamiliesSequence$2
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Fonts.Family invoke(@NotNull Map.Entry<String, Fonts.Family> it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return it.getValue();
                }
            }), opts.getLang(), opts.getWeight(), opts.getStyle());
        }

        public final Fonts.Font getFallbackFont(Fonts.FontOpts opts) {
            if (opts == null) {
                opts = Fonts.FontOpts.INSTANCE.getDEFAULT();
            }
            return (Fonts.Font) CollectionsKt.firstOrNull(getFallbackFonts(opts));
        }

        public final byte[] getFallbackFontBytes(Fonts.FontOpts opts) {
            if (opts == null) {
                opts = Fonts.FontOpts.INSTANCE.getDEFAULT();
            }
            Fonts.Font fallbackFont = getFallbackFont(opts);
            if (fallbackFont != null) {
                return FontHelper.INSTANCE.getFontBytes(fallbackFont);
            }
            return null;
        }

        @NotNull
        public final List<Fonts.Font> getFallbackFonts(@NotNull Fonts.FontOpts opts) {
            Intrinsics.checkNotNullParameter(opts, "opts");
            List<Fonts.Family> systemFontList = getSystemFontList();
            if (!systemFontList.isEmpty()) {
                return findMatches$kotlin_release(systemFontList, opts);
            }
            RiveLog.INSTANCE.getLogger().e(FontHelper.TAG, null, new Function0<String>() { // from class: app.rive.runtime.kotlin.fonts.FontHelper$Companion$getFallbackFonts$1
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "getFallbackFonts: no system font found";
                }
            });
            return n0.f14659d;
        }

        public final byte[] getFontBytes(@NotNull Fonts.Font font) {
            Intrinsics.checkNotNullParameter(font, "font");
            File fontFile = getFontFile(font);
            if (fontFile != null) {
                return m.b(fontFile);
            }
            return null;
        }

        public final File getFontFile(@NotNull final Fonts.Font font) {
            Object objInvoke;
            Intrinsics.checkNotNullParameter(font, "font");
            s sVarN = r.n(CollectionsKt.C(SystemFontsParser.INSTANCE.getSYSTEM_FONTS_PATHS$kotlin_release()), new Function1<String, File>() { // from class: app.rive.runtime.kotlin.fonts.FontHelper$Companion$getFontFile$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final File invoke(@NotNull String basePath) {
                    Intrinsics.checkNotNullParameter(basePath, "basePath");
                    return new File(basePath, StringsKt.b0(font.getName()).toString());
                }
            });
            Iterator it = sVarN.f23049a.iterator();
            while (it.hasNext()) {
                objInvoke = sVarN.f23050b.invoke(it.next());
                if (((File) objInvoke).exists()) {
                    return (File) objInvoke;
                }
            }
            objInvoke = null;
            return (File) objInvoke;
        }

        @NotNull
        public final List<Fonts.Family> getSystemFontList() {
            List<Fonts.Family> listLoadFontList$kotlin_release;
            List<Fonts.Family> list = (List) FontHelper.familiesListCache.get();
            if (list != null) {
                return list;
            }
            synchronized (this) {
                try {
                    listLoadFontList$kotlin_release = (List) FontHelper.familiesListCache.get();
                    if (listLoadFontList$kotlin_release == null) {
                        listLoadFontList$kotlin_release = FontHelper.INSTANCE.loadFontList$kotlin_release();
                    } else {
                        Intrinsics.checkNotNull(listLoadFontList$kotlin_release);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return listLoadFontList$kotlin_release;
        }

        @NotNull
        @d
        public final Map<String, Fonts.Family> getSystemFonts() {
            Map<String, Fonts.Family> mapLoadFonts$kotlin_release;
            Map<String, Fonts.Family> map = (Map) FontHelper.familiesMapCache.get();
            if (map != null) {
                return map;
            }
            synchronized (this) {
                try {
                    mapLoadFonts$kotlin_release = (Map) FontHelper.familiesMapCache.get();
                    if (mapLoadFonts$kotlin_release == null) {
                        mapLoadFonts$kotlin_release = FontHelper.INSTANCE.loadFonts$kotlin_release();
                    } else {
                        Intrinsics.checkNotNull(mapLoadFonts$kotlin_release);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return mapLoadFonts$kotlin_release;
        }

        /* JADX WARN: Code duplicated, block: B:25:0x006c  */
        @NotNull
        public final List<Fonts.Family> loadFontList$kotlin_release() throws IOException {
            Object objInvoke;
            List<Fonts.Family> fontsXML$kotlin_release;
            String[] elements = {SystemFontsParser.FONTS_XML_PATH, SystemFontsParser.SYSTEM_FONTS_XML_PATH, SystemFontsParser.FALLBACK_FONTS_XML_PATH};
            Intrinsics.checkNotNullParameter(elements, "elements");
            s sVarN = r.n(y.o(elements), new Function1<String, File>() { // from class: app.rive.runtime.kotlin.fonts.FontHelper$Companion$loadFontList$validPath$1
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final File invoke(@NotNull String pathStr) {
                    Intrinsics.checkNotNullParameter(pathStr, "pathStr");
                    return new File(pathStr);
                }
            });
            Iterator it = sVarN.f23049a.iterator();
            do {
                if (!it.hasNext()) {
                    objInvoke = null;
                    break;
                }
                objInvoke = sVarN.f23050b.invoke(it.next());
            } while (!((File) objInvoke).exists());
            File file = (File) objInvoke;
            if (file != null) {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    try {
                        fontsXML$kotlin_release = SystemFontsParser.INSTANCE.parseFontsXML$kotlin_release(fileInputStream);
                    } catch (Exception e10) {
                        RiveLog.INSTANCE.getLogger().e(FontHelper.TAG, null, new Function0<String>() { // from class: app.rive.runtime.kotlin.fonts.FontHelper$Companion$loadFontList$loadedFonts$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final String invoke() {
                                return a3.e.l("Error parsing fonts XML: ", e10.getMessage());
                            }
                        });
                        fontsXML$kotlin_release = n0.f14659d;
                    }
                    fileInputStream.close();
                    if (fontsXML$kotlin_release == null) {
                        RiveLog.INSTANCE.getLogger().w(FontHelper.TAG, new Function0<String>() { // from class: app.rive.runtime.kotlin.fonts.FontHelper$Companion$loadFontList$loadedFonts$2$1
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final String invoke() {
                                return "No valid system font XML file found at expected paths.";
                            }
                        });
                        fontsXML$kotlin_release = n0.f14659d;
                    }
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        ls.d.k(fileInputStream, th2);
                        throw th3;
                    }
                }
            } else {
                RiveLog.INSTANCE.getLogger().w(FontHelper.TAG, new Function0<String>() { // from class: app.rive.runtime.kotlin.fonts.FontHelper$Companion$loadFontList$loadedFonts$2$1
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final String invoke() {
                        return "No valid system font XML file found at expected paths.";
                    }
                });
                fontsXML$kotlin_release = n0.f14659d;
            }
            List<Fonts.Family> listFilterNonExistingFonts = filterNonExistingFonts(fontsXML$kotlin_release);
            FontHelper.familiesListCache.set(listFilterNonExistingFonts);
            return listFilterNonExistingFonts;
        }

        /* JADX WARN: Code duplicated, block: B:25:0x006e  */
        @NotNull
        public final Map<String, Fonts.Family> loadFonts$kotlin_release() throws IOException {
            Object objInvoke;
            Map<String, Fonts.Family> mapD;
            String[] elements = {SystemFontsParser.FONTS_XML_PATH, SystemFontsParser.SYSTEM_FONTS_XML_PATH, SystemFontsParser.FALLBACK_FONTS_XML_PATH};
            Intrinsics.checkNotNullParameter(elements, "elements");
            s sVarN = r.n(y.o(elements), new Function1<String, File>() { // from class: app.rive.runtime.kotlin.fonts.FontHelper$Companion$loadFonts$validPath$1
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final File invoke(@NotNull String pathStr) {
                    Intrinsics.checkNotNullParameter(pathStr, "pathStr");
                    return new File(pathStr);
                }
            });
            Iterator it = sVarN.f23049a.iterator();
            do {
                if (!it.hasNext()) {
                    objInvoke = null;
                    break;
                }
                objInvoke = sVarN.f23050b.invoke(it.next());
            } while (!((File) objInvoke).exists());
            File file = (File) objInvoke;
            if (file != null) {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    try {
                        mapD = SystemFontsParser.INSTANCE.parseFontsXMLMap$kotlin_release(fileInputStream);
                    } catch (Exception e10) {
                        RiveLog.INSTANCE.getLogger().e(FontHelper.TAG, null, new Function0<String>() { // from class: app.rive.runtime.kotlin.fonts.FontHelper$Companion$loadFonts$loadedFonts$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final String invoke() {
                                return a3.e.l("Error parsing fonts XML: ", e10.getMessage());
                            }
                        });
                        mapD = w0.d();
                    }
                    fileInputStream.close();
                    if (mapD == null) {
                        RiveLog.INSTANCE.getLogger().w(FontHelper.TAG, new Function0<String>() { // from class: app.rive.runtime.kotlin.fonts.FontHelper$Companion$loadFonts$loadedFonts$2$1
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final String invoke() {
                                return "No valid system font XML file found at expected paths.";
                            }
                        });
                        mapD = w0.d();
                    }
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        ls.d.k(fileInputStream, th2);
                        throw th3;
                    }
                }
            } else {
                RiveLog.INSTANCE.getLogger().w(FontHelper.TAG, new Function0<String>() { // from class: app.rive.runtime.kotlin.fonts.FontHelper$Companion$loadFonts$loadedFonts$2$1
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final String invoke() {
                        return "No valid system font XML file found at expected paths.";
                    }
                });
                mapD = w0.d();
            }
            Map<String, Fonts.Family> mapFilterNonExistingFonts = filterNonExistingFonts(mapD);
            FontHelper.familiesMapCache.set(mapFilterNonExistingFonts);
            return mapFilterNonExistingFonts;
        }

        public final void resetForTesting() {
            FontHelper.familiesMapCache.set(null);
            FontHelper.familiesListCache.set(null);
        }

        private Companion() {
        }

        public static /* synthetic */ List findMatches$kotlin_release$default(Companion companion, List list, Fonts.FontOpts fontOpts, int i7, Object obj) {
            if ((i7 & 2) != 0) {
                fontOpts = Fonts.FontOpts.INSTANCE.getDEFAULT();
            }
            return companion.findMatches$kotlin_release((List<Fonts.Family>) list, fontOpts);
        }

        @NotNull
        public final List<Fonts.Font> findMatches$kotlin_release(@NotNull List<Fonts.Family> fontFamiliesList, @NotNull Fonts.FontOpts opts) {
            Intrinsics.checkNotNullParameter(fontFamiliesList, "fontFamiliesList");
            Intrinsics.checkNotNullParameter(opts, "opts");
            final String familyName = opts.getFamilyName();
            final String lang = opts.getLang();
            return processMatchingFamilies(r.h(CollectionsKt.C(fontFamiliesList), new Function1<Fonts.Family, Boolean>() { // from class: app.rive.runtime.kotlin.fonts.FontHelper$Companion$findMatches$matchingFamiliesSequence$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull Fonts.Family family) {
                    Intrinsics.checkNotNullParameter(family, "family");
                    boolean z5 = true;
                    if ((familyName != null && !x.i(family.getName(), familyName, true)) || (lang != null && !Intrinsics.areEqual(family.getLang(), lang))) {
                        z5 = false;
                    }
                    return Boolean.valueOf(z5);
                }
            }), opts.getLang(), opts.getWeight(), opts.getStyle());
        }

        private final List<Fonts.Family> filterNonExistingFonts(List<Fonts.Family> fontFamilies) {
            if (fontFamilies.isEmpty()) {
                return fontFamilies;
            }
            ArrayList arrayList = new ArrayList();
            for (Fonts.Family family : fontFamilies) {
                Map<Fonts.Weight, List<Fonts.Font>> fonts = family.getFonts();
                LinkedHashMap linkedHashMap = new LinkedHashMap(v0.a(fonts.size()));
                Iterator<T> it = fonts.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Object key = entry.getKey();
                    List list = (List) entry.getValue();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : list) {
                        if (FontHelper.INSTANCE.getFontFile((Fonts.Font) obj) != null) {
                            arrayList2.add(obj);
                        }
                    }
                    linkedHashMap.put(key, arrayList2);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    if (!((List) entry2.getValue()).isEmpty()) {
                        linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                    }
                }
                Fonts.Family family2 = !linkedHashMap2.isEmpty() ? new Fonts.Family(family.getName(), family.getVariant(), family.getLang(), linkedHashMap2) : null;
                if (family2 != null) {
                    arrayList.add(family2);
                }
            }
            return arrayList;
        }
    }
}
