package com.facebook.react.bridge;

import a1.n;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.ColorSpace;
import android.os.Build;
import android.util.TypedValue;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.x;
import o8.a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002J!\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0011\u001a\u00020\u0012H\u0002¢\u0006\u0002\u0010\u0013J\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0010\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J!\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¢\u0006\u0002\u0010\u0013J\"\u0010\u0016\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u000fH\u0007J!\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0019\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0002\u0010\u001aJ\u0018\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0007H\u0002J\u0018\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0007H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/facebook/react/bridge/ColorPropConverter;", "", "<init>", "()V", "supportWideGamut", "", "JSON_KEY", "", "PREFIX_RESOURCE", "PREFIX_ATTR", "PACKAGE_DELIMITER", "PATH_DELIMITER", "ATTR", "ATTR_SEGMENT", "getColorInteger", "", "value", "context", "Landroid/content/Context;", "(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;", "getColorInstance", "Landroid/graphics/Color;", "getColor", "defaultInt", "resolveResourcePath", "resourcePath", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Integer;", "resolveResource", "resolveThemeAttribute", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ColorPropConverter {

    @NotNull
    private static final String ATTR = "attr";

    @NotNull
    private static final String ATTR_SEGMENT = "attr/";

    @NotNull
    public static final ColorPropConverter INSTANCE = new ColorPropConverter();

    @NotNull
    private static final String JSON_KEY = "resource_paths";

    @NotNull
    private static final String PACKAGE_DELIMITER = ":";

    @NotNull
    private static final String PATH_DELIMITER = "/";

    @NotNull
    private static final String PREFIX_ATTR = "?";

    @NotNull
    private static final String PREFIX_RESOURCE = "@";

    private ColorPropConverter() {
    }

    public static final Integer getColor(Object value, @NotNull Context context) {
        Color colorInstance;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            if (INSTANCE.supportWideGamut() && (colorInstance = getColorInstance(value, context)) != null) {
                return Integer.valueOf(colorInstance.toArgb());
            }
        } catch (JSApplicationCausedNativeException e10) {
            a.y(e10, "Error extracting color from WideGamut", new Object[0]);
        }
        return INSTANCE.getColorInteger(value, context);
    }

    public static final Color getColorInstance(Object value, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (value == null) {
            return null;
        }
        ColorPropConverter colorPropConverter = INSTANCE;
        if (colorPropConverter.supportWideGamut() && (value instanceof Double)) {
            return Color.valueOf((int) ((Number) value).doubleValue());
        }
        if (!(value instanceof ReadableMap)) {
            throw new JSApplicationCausedNativeException("ColorValue: the value must be a number or Object.");
        }
        if (colorPropConverter.supportWideGamut()) {
            ReadableMap readableMap = (ReadableMap) value;
            if (readableMap.hasKey("space")) {
                ColorSpace colorSpace = ColorSpace.get(Intrinsics.areEqual(readableMap.getString("space"), "display-p3") ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
                Intrinsics.checkNotNullExpressionValue(colorSpace, "get(...)");
                return Color.valueOf(Color.pack((float) readableMap.getDouble("r"), (float) readableMap.getDouble("g"), (float) readableMap.getDouble("b"), (float) readableMap.getDouble("a"), colorSpace));
            }
        }
        ReadableArray array = ((ReadableMap) value).getArray(JSON_KEY);
        if (array == null) {
            throw new JSApplicationCausedNativeException("ColorValue: The `resource_paths` must be an array of color resource path strings.");
        }
        int size = array.size();
        for (int i7 = 0; i7 < size; i7++) {
            Integer numResolveResourcePath = resolveResourcePath(context, array.getString(i7));
            if (INSTANCE.supportWideGamut() && numResolveResourcePath != null) {
                return Color.valueOf(numResolveResourcePath.intValue());
            }
        }
        throw new JSApplicationCausedNativeException("ColorValue: None of the paths in the `resource_paths` array resolved to a color resource.");
    }

    private final Integer getColorInteger(Object value, Context context) {
        if (value == null) {
            return null;
        }
        if (value instanceof Double) {
            return Integer.valueOf((int) ((Number) value).doubleValue());
        }
        if (context == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (!(value instanceof ReadableMap)) {
            throw new JSApplicationCausedNativeException("ColorValue: the value must be a number or Object.");
        }
        ReadableMap readableMap = (ReadableMap) value;
        if (readableMap.hasKey("space")) {
            float f2 = (float) readableMap.getDouble("r");
            float f7 = 255;
            return Integer.valueOf(Color.argb((int) (((float) readableMap.getDouble("a")) * f7), (int) (f2 * f7), (int) (((float) readableMap.getDouble("g")) * f7), (int) (((float) readableMap.getDouble("b")) * f7)));
        }
        ReadableArray array = readableMap.getArray(JSON_KEY);
        if (array == null) {
            throw new JSApplicationCausedNativeException("ColorValue: The `resource_paths` must be an array of color resource path strings.");
        }
        int size = array.size();
        for (int i7 = 0; i7 < size; i7++) {
            Integer numResolveResourcePath = resolveResourcePath(context, array.getString(i7));
            if (numResolveResourcePath != null) {
                return numResolveResourcePath;
            }
        }
        throw new JSApplicationCausedNativeException("ColorValue: None of the paths in the `resource_paths` array resolved to a color resource.");
    }

    private final int resolveResource(Context context, String resourcePath) {
        List listSplit$default = StringsKt__StringsKt.split$default(resourcePath, new String[]{PACKAGE_DELIMITER}, false, 0, 6, null);
        String packageName = context.getPackageName();
        if (listSplit$default.size() > 1) {
            packageName = (String) listSplit$default.get(0);
            resourcePath = (String) listSplit$default.get(1);
        }
        List listSplit$default2 = StringsKt__StringsKt.split$default(resourcePath, new String[]{PATH_DELIMITER}, false, 0, 6, null);
        String str = (String) listSplit$default2.get(0);
        int identifier = context.getResources().getIdentifier((String) listSplit$default2.get(1), str, packageName);
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        ThreadLocal threadLocal = n.f42a;
        return resources.getColor(identifier, theme);
    }

    public static final Integer resolveResourcePath(@NotNull Context context, String resourcePath) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (resourcePath == null || resourcePath.length() == 0) {
            return null;
        }
        boolean zO = x.o(resourcePath, PREFIX_RESOURCE, false);
        boolean zO2 = x.o(resourcePath, PREFIX_ATTR, false);
        String strSubstring = resourcePath.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        try {
            if (zO) {
                return Integer.valueOf(INSTANCE.resolveResource(context, strSubstring));
            }
            if (zO2) {
                return Integer.valueOf(INSTANCE.resolveThemeAttribute(context, strSubstring));
            }
            return null;
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    private final int resolveThemeAttribute(Context context, String resourcePath) {
        String strL = x.l(resourcePath, ATTR_SEGMENT, "", false);
        List listSplit$default = StringsKt__StringsKt.split$default(strL, new String[]{PACKAGE_DELIMITER}, false, 0, 6, null);
        String packageName = context.getPackageName();
        if (listSplit$default.size() > 1) {
            packageName = (String) listSplit$default.get(0);
            strL = (String) listSplit$default.get(1);
        }
        int identifier = context.getResources().getIdentifier(strL, ATTR, packageName);
        if (identifier == 0) {
            identifier = context.getResources().getIdentifier(strL, ATTR, "android");
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(identifier, typedValue, true)) {
            return typedValue.data;
        }
        throw new Resources.NotFoundException();
    }

    private final boolean supportWideGamut() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static final int getColor(Object value, @NotNull Context context, int defaultInt) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Integer color = getColor(value, context);
            return color != null ? color.intValue() : defaultInt;
        } catch (JSApplicationCausedNativeException e10) {
            a.y(e10, "Error converting ColorValue", new Object[0]);
            return defaultInt;
        }
    }
}
