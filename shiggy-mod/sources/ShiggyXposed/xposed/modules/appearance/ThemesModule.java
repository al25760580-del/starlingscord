package ShiggyXposed.xposed.modules.appearance;

import ShiggyXposed.xposed.Module;
import ShiggyXposed.xposed.Utils;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import androidx.constraintlayout.widget.ConstraintLayout;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import java.io.File;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.JsonObjectBuilder;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: compiled from: ThemesModule.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0017J\f\u0010\u0011\u001a\u00020\n*\u00020\nH\u0002J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0005H\u0016J\f\u0010\u0014\u001a\u00020\u0015*\u00020\u0016H\u0002J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0007H\u0002J\u0006\u0010\u0018\u001a\u00020\u000eJ\u0010\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\nH\u0002J$\u0010\u001b\u001a\u00020\u000e2\n\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u001d2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u000bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"LShiggyXposed/xposed/modules/appearance/ThemesModule;", "LShiggyXposed/xposed/Module;", "<init>", "()V", "param", "Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;", "theme", "LShiggyXposed/xposed/modules/appearance/Theme;", "rawColorMap", "", "", "", "THEME_FILE", "buildPayload", "", "builder", "Lkotlinx/serialization/json/JsonObjectBuilder;", "fromScreamingSnakeToCamelCase", "onLoad", "packageParam", "isValidThemeFile", "", "Ljava/io/File;", "getTheme", "hookTheme", "hexStringToColorInt", "hexString", "hookThemeMethod", "themeClass", "Ljava/lang/Class;", "methodName", "themeValue", "app_release"}, k = 1, mv = {2, 1, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class ThemesModule extends Module {
    private static final String THEME_FILE = "current-theme.json";
    private static XC_LoadPackage.LoadPackageParam param;
    private static Theme theme;
    public static final ThemesModule INSTANCE = new ThemesModule();
    private static final Map<String, Integer> rawColorMap = new LinkedHashMap();

    private ThemesModule() {
    }

    @Override // ShiggyXposed.xposed.Module
    @ExperimentalSerializationApi
    public void buildPayload(JsonObjectBuilder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        JsonElementBuildersKt.put(builder, "hasThemeSupport", (Boolean) true);
        if (theme == null) {
            JsonElementBuildersKt.put(builder, "storedTheme", (Void) null);
            return;
        }
        Json json = Utils.INSTANCE.getJSON();
        Theme theme2 = theme;
        Intrinsics.checkNotNull(theme2);
        json.getSerializersModule();
        builder.put("storedTheme", json.encodeToJsonElement(Theme.INSTANCE.serializer(), theme2));
    }

    private final String fromScreamingSnakeToCamelCase(String str) {
        return CollectionsKt.joinToString$default(StringsKt.split$default((CharSequence) str, new String[]{"_"}, false, 0, 6, (Object) null), "", null, null, 0, null, new Function1() { // from class: ShiggyXposed.xposed.modules.appearance.ThemesModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ThemesModule.fromScreamingSnakeToCamelCase$lambda$2((String) obj);
            }
        }, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence fromScreamingSnakeToCamelCase$lambda$2(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String lowerCase = it.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (lowerCase.length() > 0) {
            StringBuilder sb = new StringBuilder();
            String strValueOf = String.valueOf(lowerCase.charAt(0));
            Intrinsics.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = strValueOf.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            StringBuilder sbAppend = sb.append((Object) upperCase);
            String strSubstring = lowerCase.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            lowerCase = sbAppend.append(strSubstring).toString();
        }
        return lowerCase;
    }

    @Override // ShiggyXposed.xposed.Module
    public void onLoad(XC_LoadPackage.LoadPackageParam packageParam) throws NoSuchMethodException, ClassNotFoundException {
        Intrinsics.checkNotNullParameter(packageParam, "packageParam");
        param = packageParam;
        theme = getTheme();
        hookTheme();
    }

    private final boolean isValidThemeFile(File file) {
        if (!file.exists()) {
            return false;
        }
        String text$default = FilesKt.readText$default(file, null, 1, null);
        return (StringsKt.isBlank(text$default) || Intrinsics.areEqual(text$default, "{}") || Intrinsics.areEqual(text$default, AbstractJsonLexerKt.NULL)) ? false : true;
    }

    private final Theme getTheme() {
        XC_LoadPackage.LoadPackageParam loadPackageParam = param;
        if (loadPackageParam == null) {
            Intrinsics.throwUninitializedPropertyAccessException("param");
            loadPackageParam = null;
        }
        File file = new File(loadPackageParam.appInfo.dataDir, "files/pyoncord/current-theme.json");
        INSTANCE.asFile(file);
        if (!isValidThemeFile(file)) {
            return null;
        }
        try {
            String text$default = FilesKt.readText$default(file, null, 1, null);
            Json json = Utils.INSTANCE.getJSON();
            json.getSerializersModule();
            return (Theme) json.decodeFromString(Theme.INSTANCE.serializer(), text$default);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void hookTheme() throws NoSuchMethodException, ClassNotFoundException {
        XC_LoadPackage.LoadPackageParam loadPackageParam = param;
        XC_LoadPackage.LoadPackageParam loadPackageParam2 = null;
        if (loadPackageParam == null) {
            Intrinsics.throwUninitializedPropertyAccessException("param");
            loadPackageParam = null;
        }
        Class<?> clsLoadClass = loadPackageParam.classLoader.loadClass("com.discord.theme.utils.ColorUtilsKt");
        XC_LoadPackage.LoadPackageParam loadPackageParam3 = param;
        if (loadPackageParam3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("param");
            loadPackageParam3 = null;
        }
        Class<?> clsLoadClass2 = loadPackageParam3.classLoader.loadClass("com.discord.theme.DarkerTheme");
        XC_LoadPackage.LoadPackageParam loadPackageParam4 = param;
        if (loadPackageParam4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("param");
        } else {
            loadPackageParam2 = loadPackageParam4;
        }
        Class<?> clsLoadClass3 = loadPackageParam2.classLoader.loadClass("com.discord.theme.LightTheme");
        Theme theme2 = theme;
        if (theme2 == null) {
            return;
        }
        Map<String, String> rawColors = theme2.getData().getRawColors();
        if (rawColors != null) {
            for (Map.Entry<String, String> entry : rawColors.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                Map<String, Integer> map = rawColorMap;
                String lowerCase = key.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                map.put(lowerCase, Integer.valueOf(INSTANCE.hexStringToColorInt(value)));
            }
        }
        Map<String, List<String>> semanticColors = theme2.getData().getSemanticColors();
        if (semanticColors != null) {
            for (Map.Entry<String, List<String>> entry2 : semanticColors.entrySet()) {
                String key2 = entry2.getKey();
                List<String> value2 = entry2.getValue();
                String str = "get" + INSTANCE.fromScreamingSnakeToCamelCase(key2);
                int i = 0;
                for (Object obj : value2) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    String str2 = (String) obj;
                    if (i == 0) {
                        ThemesModule themesModule = INSTANCE;
                        Intrinsics.checkNotNull(clsLoadClass2);
                        themesModule.hookThemeMethod(clsLoadClass2, str, themesModule.hexStringToColorInt(str2));
                    } else if (i == 1) {
                        ThemesModule themesModule2 = INSTANCE;
                        Intrinsics.checkNotNull(clsLoadClass3);
                        themesModule2.hookThemeMethod(clsLoadClass3, str, themesModule2.hexStringToColorInt(str2));
                    }
                    i = i2;
                }
            }
        }
        Map<String, String> rawColors2 = theme2.getData().getRawColors();
        if (rawColors2 == null || rawColors2.isEmpty()) {
            return;
        }
        Method declaredMethod = clsLoadClass.getDeclaredMethod("getColorCompat", Resources.class, Integer.TYPE, Resources.Theme.class);
        Method declaredMethod2 = clsLoadClass.getDeclaredMethod("getColorCompat", Context.class, Integer.TYPE);
        Module.MethodHookBuilder methodHookBuilder = new Module.MethodHookBuilder();
        methodHookBuilder.before(new Function1() { // from class: ShiggyXposed.xposed.modules.appearance.ThemesModule$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return ThemesModule.hookTheme$lambda$8$lambda$7((Module.HookScope) obj2);
            }
        });
        XC_MethodHook xC_MethodHookBuild = methodHookBuilder.build();
        Intrinsics.checkNotNull(declaredMethod);
        hook(declaredMethod, xC_MethodHookBuild);
        Intrinsics.checkNotNull(declaredMethod2);
        hook(declaredMethod2, xC_MethodHookBuild);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit hookTheme$lambda$8$lambda$7(Module.HookScope before) {
        Resources resources;
        Intrinsics.checkNotNullParameter(before, "$this$before");
        Object obj = before.getArgs()[0];
        if (obj instanceof Context) {
            resources = ((Context) obj).getResources();
        } else {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.content.res.Resources");
            resources = (Resources) obj;
        }
        Object obj2 = before.getArgs()[1];
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
        String resourceEntryName = resources.getResourceEntryName(((Integer) obj2).intValue());
        Map<String, Integer> map = rawColorMap;
        if (map.get(resourceEntryName) != null) {
            before.setResult(map.get(resourceEntryName));
        }
        return Unit.INSTANCE;
    }

    private final int hexStringToColorInt(String hexString) {
        if (hexString.length() == 9) {
            String strSubstring = hexString.substring(7, 9);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            String strSubstring2 = hexString.substring(1, 7);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            return Color.parseColor("#" + strSubstring + strSubstring2);
        }
        return Color.parseColor(hexString);
    }

    private final void hookThemeMethod(Class<?> themeClass, String methodName, final int themeValue) {
        try {
            Method declaredMethod = themeClass.getDeclaredMethod(methodName, new Class[0]);
            ThemesModule themesModule = INSTANCE;
            Intrinsics.checkNotNull(declaredMethod);
            themesModule.hook(declaredMethod, new Function1() { // from class: ShiggyXposed.xposed.modules.appearance.ThemesModule$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ThemesModule.hookThemeMethod$lambda$11$lambda$10(themeValue, (Module.MethodHookBuilder) obj);
                }
            });
        } catch (NoSuchMethodException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit hookThemeMethod$lambda$11$lambda$10(final int i, Module.MethodHookBuilder hook) {
        Intrinsics.checkNotNullParameter(hook, "$this$hook");
        hook.before(new Function1() { // from class: ShiggyXposed.xposed.modules.appearance.ThemesModule$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ThemesModule.hookThemeMethod$lambda$11$lambda$10$lambda$9(i, (Module.HookScope) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit hookThemeMethod$lambda$11$lambda$10$lambda$9(int i, Module.HookScope before) {
        Intrinsics.checkNotNullParameter(before, "$this$before");
        before.setResult(Integer.valueOf(i));
        return Unit.INSTANCE;
    }
}
