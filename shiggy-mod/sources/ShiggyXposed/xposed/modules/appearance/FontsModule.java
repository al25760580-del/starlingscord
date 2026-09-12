package ShiggyXposed.xposed.modules.appearance;

import ShiggyXposed.xposed.Module;
import ShiggyXposed.xposed.Utils;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.os.Build;
import androidx.constraintlayout.widget.ConstraintLayout;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XC_MethodReplacement;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import io.ktor.sse.ServerSentEventKt;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.io.files.FileSystemKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.JsonObjectBuilder;

/* JADX INFO: compiled from: FontsModule.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J-\u0010\u0015\u001a\u0004\u0018\u00010\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002¢\u0006\u0002\u0010\u001cJ\"\u0010\u001d\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"LShiggyXposed/xposed/modules/appearance/FontsModule;", "LShiggyXposed/xposed/Module;", "<init>", "()V", "EXTENSIONS", "", "", "[Ljava/lang/String;", "FILE_EXTENSIONS", "FONTS_ASSET_PATH", "fontsDir", "Ljava/io/File;", "fontsDownloadsDir", "fontsAbsPath", "buildPayload", "", "builder", "Lkotlinx/serialization/json/JsonObjectBuilder;", "onLoad", "packageParam", "Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;", "createAssetTypefaceWithFallbacks", "Landroid/graphics/Typeface;", "fontFamilyNames", "style", "", "assetManager", "Landroid/content/res/AssetManager;", "([Ljava/lang/String;ILandroid/content/res/AssetManager;)Landroid/graphics/Typeface;", "createAssetTypeface", "fontFamilyName", "app_release"}, k = 1, mv = {2, 1, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class FontsModule extends Module {
    private static final String FONTS_ASSET_PATH = "fonts/";
    private static String fontsAbsPath;
    private static File fontsDir;
    private static File fontsDownloadsDir;
    public static final FontsModule INSTANCE = new FontsModule();
    private static final String[] EXTENSIONS = {"", "_bold", "_italic", "_bold_italic"};
    private static final String[] FILE_EXTENSIONS = {".ttf", ".otf"};

    private FontsModule() {
    }

    @Override // ShiggyXposed.xposed.Module
    public void buildPayload(JsonObjectBuilder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        JsonElementBuildersKt.put(builder, "fontPatch", (Number) 2);
    }

    @Override // ShiggyXposed.xposed.Module
    public void onLoad(XC_LoadPackage.LoadPackageParam packageParam) {
        Intrinsics.checkNotNullParameter(packageParam, "packageParam");
        XposedHelpers.findAndHookMethod("com.facebook.react.common.assets.ReactFontManager$Companion", packageParam.classLoader, "createAssetTypeface", new Object[]{String.class, Integer.TYPE, "android.content.res.AssetManager", new XC_MethodReplacement() { // from class: ShiggyXposed.xposed.modules.appearance.FontsModule$onLoad$1$1
            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX INFO: renamed from: replaceHookedMethod, reason: merged with bridge method [inline-methods] */
            public Typeface m32replaceHookedMethod(XC_MethodHook.MethodHookParam param) {
                Intrinsics.checkNotNullParameter(param, "param");
                String string = param.args[0].toString();
                Object obj = param.args[1];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue = ((Integer) obj).intValue();
                Object obj2 = param.args[2];
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.content.res.AssetManager");
                return FontsModule.INSTANCE.createAssetTypeface(string, iIntValue, (AssetManager) obj2);
            }
        }});
        File file = new File(packageParam.appInfo.dataDir, "files/pyoncord/fonts.json");
        FontsModule fontsModule = INSTANCE;
        fontsModule.asFile(file);
        if (file.exists()) {
            try {
                Json json = Utils.INSTANCE.getJSON();
                String text$default = FilesKt.readText$default(file, null, 1, null);
                json.getSerializersModule();
                FontDefinition fontDefinition = (FontDefinition) json.decodeFromString(FontDefinition.INSTANCE.serializer(), text$default);
                File file2 = new File(packageParam.appInfo.dataDir, "files/pyoncord/downloads/fonts");
                fontsModule.asDir(file2);
                fontsDownloadsDir = file2;
                File file3 = fontsDownloadsDir;
                if (file3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("fontsDownloadsDir");
                    file3 = null;
                }
                String name = fontDefinition.getName();
                Intrinsics.checkNotNull(name);
                File file4 = new File(file3, name);
                fontsModule.asDir(file4);
                fontsDir = file4;
                StringBuilder sb = new StringBuilder();
                File file5 = fontsDir;
                if (file5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("fontsDir");
                    file5 = null;
                }
                fontsAbsPath = sb.append(file5.getAbsolutePath()).append(FileSystemKt.UnixPathSeparator).toString();
                File file6 = fontsDir;
                if (file6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("fontsDir");
                    file6 = null;
                }
                File[] fileArrListFiles = file6.listFiles();
                if (fileArrListFiles != null) {
                    for (File file7 : fileArrListFiles) {
                        String name2 = file7.getName();
                        Intrinsics.checkNotNull(name2);
                        if (!StringsKt.startsWith$default(name2, ".", false, 2, (Object) null)) {
                            String str = (String) StringsKt.split$default((CharSequence) name2, new char[]{'.'}, false, 0, 6, (Object) null).get(0);
                            Set<String> setKeySet = fontDefinition.getMain().keySet();
                            if ((setKeySet instanceof Collection) && setKeySet.isEmpty()) {
                                Utils.Log.INSTANCE.i("Deleting font file: " + name2);
                                file7.delete();
                                break;
                                break;
                            } else {
                                Iterator<T> it = setKeySet.iterator();
                                do {
                                    if (!it.hasNext()) {
                                        Utils.Log.INSTANCE.i("Deleting font file: " + name2);
                                        file7.delete();
                                        break;
                                    }
                                } while (!Intrinsics.areEqual((String) it.next(), str));
                            }
                        }
                    }
                }
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new FontsModule$onLoad$1$5(fontDefinition, null), 3, null);
            } catch (Throwable unused) {
            }
        }
    }

    private final Typeface createAssetTypefaceWithFallbacks(String[] fontFamilyNames, int style, AssetManager assetManager) {
        int i;
        Font.Builder builder;
        File file;
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        int length = fontFamilyNames.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = 1;
            if (i3 >= length) {
                break;
            }
            String str = fontFamilyNames[i3];
            try {
                String[] strArr = FILE_EXTENSIONS;
                int length2 = strArr.length;
                int i5 = i2;
                while (i5 < length2) {
                    String str2 = strArr[i5];
                    String str3 = str;
                    try {
                        String[] strArr2 = new String[i4];
                        strArr2[i2] = ServerSentEventKt.COLON;
                        List listSplit$default = StringsKt.split$default((CharSequence) str3, strArr2, false, 0, 6, (Object) null);
                        String str4 = (String) listSplit$default.get(i2);
                        String str5 = (String) listSplit$default.get(i4);
                        i = i4;
                        try {
                            File file2 = fontsDownloadsDir;
                            if (file2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("fontsDownloadsDir");
                                file = null;
                            } else {
                                file = file2;
                            }
                            try {
                                File file3 = new File(file, str4 + FileSystemKt.UnixPathSeparator + str5 + '.' + str2);
                                INSTANCE.asFile(file3);
                                Font fontBuild = new Font.Builder(file3).build();
                                Intrinsics.checkNotNullExpressionValue(fontBuild, "build(...)");
                                FontFamily fontFamilyBuild = new FontFamily.Builder(fontBuild).build();
                                Intrinsics.checkNotNullExpressionValue(fontFamilyBuild, "build(...)");
                                arrayList.add(fontFamilyBuild);
                                i5++;
                                i4 = i;
                                i2 = i2;
                            } catch (Throwable unused) {
                            }
                        } catch (Throwable unused2) {
                            i2 = i2;
                        }
                    } catch (Throwable unused3) {
                        i2 = i2;
                        i = i4;
                    }
                }
            } catch (Throwable unused4) {
            }
            i2 = i2;
            i = i4;
            String[] strArr3 = new String[2];
            strArr3[i2] = fontsAbsPath;
            strArr3[i] = FONTS_ASSET_PATH;
            for (String str6 : ArraysKt.filterNotNull(strArr3)) {
                String[] strArr4 = FILE_EXTENSIONS;
                int length3 = strArr4.length;
                int i6 = i2;
                while (i6 < length3) {
                    String str7 = str6 + str + strArr4[i6];
                    Intrinsics.checkNotNullExpressionValue(str7, "toString(...)");
                    try {
                        if (str7.charAt(i2) == '/') {
                            try {
                                builder = new Font.Builder(new File(str7));
                            } catch (IOException | RuntimeException unused5) {
                            }
                        } else {
                            builder = new Font.Builder(assetManager, str7);
                        }
                        Font fontBuild2 = builder.build();
                        Intrinsics.checkNotNullExpressionValue(fontBuild2, "build(...)");
                        FontFamily fontFamilyBuild2 = new FontFamily.Builder(fontBuild2).build();
                        Intrinsics.checkNotNullExpressionValue(fontFamilyBuild2, "build(...)");
                        arrayList.add(fontFamilyBuild2);
                    } catch (IOException | RuntimeException unused6) {
                    }
                    i6++;
                    i2 = 0;
                }
                i2 = 0;
            }
            i3++;
            i2 = 0;
        }
        if (arrayList.isEmpty()) {
            return createAssetTypeface(fontFamilyNames[0], style, assetManager);
        }
        Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder((FontFamily) arrayList.get(0));
        int size = arrayList.size();
        for (int i7 = 1; i7 < size; i7++) {
            customFallbackBuilder.addCustomFallback((FontFamily) arrayList.get(i7));
        }
        return customFallbackBuilder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Typeface createAssetTypeface(String fontFamilyName, int style, AssetManager assetManager) {
        List listEmptyList;
        List<String> listSplit = new Regex(",").split(fontFamilyName, 0);
        if (!listSplit.isEmpty()) {
            ListIterator<String> listIterator = listSplit.listIterator(listSplit.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() != 0) {
                        listEmptyList = CollectionsKt.take(listSplit, listIterator.nextIndex() + 1);
                        break;
                    }
                } else {
                    listEmptyList = CollectionsKt.emptyList();
                    break;
                }
            }
        } else {
            listEmptyList = CollectionsKt.emptyList();
            break;
        }
        String[] strArr = (String[]) listEmptyList.toArray(new String[0]);
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            strArr[i] = StringsKt.trim((CharSequence) strArr[i]).toString();
        }
        if (strArr.length > 1) {
            if (Build.VERSION.SDK_INT >= 29) {
                return createAssetTypefaceWithFallbacks(strArr, style, assetManager);
            }
            fontFamilyName = strArr[0];
        }
        String str = EXTENSIONS[style];
        try {
            String[] strArr2 = FILE_EXTENSIONS;
            if (strArr2.length > 0) {
                String str2 = strArr2[0];
                List listSplit$default = StringsKt.split$default((CharSequence) fontFamilyName, new String[]{ServerSentEventKt.COLON}, false, 0, 6, (Object) null);
                String str3 = (String) listSplit$default.get(0);
                String str4 = (String) listSplit$default.get(1);
                File file = fontsDownloadsDir;
                if (file == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("fontsDownloadsDir");
                    file = null;
                }
                File file2 = new File(file, str3 + FileSystemKt.UnixPathSeparator + str4 + '.' + str2);
                INSTANCE.asFile(file2);
                if (!file2.exists()) {
                    throw new Exception();
                }
                return Typeface.createFromFile(file2.getAbsolutePath());
            }
        } catch (Throwable unused) {
        }
        for (String str5 : ArraysKt.filterNotNull(new String[]{fontsAbsPath, FONTS_ASSET_PATH})) {
            for (String str6 : FILE_EXTENSIONS) {
                String str7 = str5 + fontFamilyName + str + str6;
                Intrinsics.checkNotNullExpressionValue(str7, "toString(...)");
                try {
                    return str7.charAt(0) == '/' ? Typeface.createFromFile(str7) : Typeface.createFromAsset(assetManager, str7);
                } catch (RuntimeException unused2) {
                }
            }
        }
        return Typeface.create(fontFamilyName, style);
    }
}
