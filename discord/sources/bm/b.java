package bm;

import android.content.ComponentName;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.provider.Settings;
import com.discord.R;
import com.facebook.react.uimanager.ThemedReactContext;
import kotlin.Pair;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;
import lo.j;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f3325a;

    static {
        Integer numValueOf = Integer.valueOf(R.style.aosp_light);
        Pair pair = new Pair("com.android.inputmethod.latin", new Pair(numValueOf, numValueOf));
        Pair pair2 = new Pair("com.google.android.inputmethod.latin", new Pair(Integer.valueOf(R.style.gboard_light), Integer.valueOf(R.style.gboard_dark)));
        Pair pair3 = new Pair("com.touchtype.swiftkey", new Pair(Integer.valueOf(R.style.swiftkey_light), Integer.valueOf(R.style.swiftkey_dark)));
        Integer numValueOf2 = Integer.valueOf(R.style.gboard_tts_light);
        Integer numValueOf3 = Integer.valueOf(R.style.gboard_tts_dark);
        f3325a = w0.g(pair, pair2, pair3, new Pair("com.google.android.googlequicksearchbox", new Pair(numValueOf2, numValueOf3)), new Pair("com.google.android.tts", new Pair(numValueOf2, numValueOf3)), new Pair("ru.yandex.androidkeyboard", new Pair(Integer.valueOf(R.style.yandex_light), Integer.valueOf(R.style.yandex_dark))), new Pair("com.samsung.android.honeyboard", new Pair(Integer.valueOf(R.style.samsung_light), Integer.valueOf(R.style.samsung_dark))));
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map] */
    public static final int a(ThemedReactContext themedReactContext) {
        ComponentName componentNameUnflattenFromString;
        Intrinsics.checkNotNullParameter(themedReactContext, "<this>");
        Intrinsics.checkNotNullParameter(themedReactContext, "<this>");
        String string = Settings.Secure.getString(themedReactContext.getContentResolver(), "default_input_method");
        String packageName = null;
        if (string != null && (componentNameUnflattenFromString = ComponentName.unflattenFromString(string)) != null) {
            packageName = componentNameUnflattenFromString.getPackageName();
        }
        boolean zB = sl.a.b(themedReactContext);
        String message = "Current IME: " + packageName;
        Intrinsics.checkNotNullParameter(message, "message");
        Pair pair = (Pair) f3325a.get(packageName);
        if (pair == null) {
            pair = new Pair(Integer.valueOf(R.style.gboard_light), Integer.valueOf(R.style.gboard_dark));
        }
        int iIntValue = ((Number) pair.f14612d).intValue();
        int iIntValue2 = ((Number) pair.f14613e).intValue();
        if (zB && Build.VERSION.SDK_INT > 29) {
            iIntValue = iIntValue2;
        }
        Intrinsics.checkNotNullParameter(themedReactContext, "<this>");
        TypedArray typedArrayObtainStyledAttributes = themedReactContext.obtainStyledAttributes(iIntValue, pl.a.f18054a);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            int color = typedArrayObtainStyledAttributes.getColor(0, -16777216);
            int i7 = typedArrayObtainStyledAttributes.getInt(1, 0);
            return Color.argb(Color.alpha(color), j.d(Color.red(color) + i7, 0, 255), j.d(Color.green(color) + i7, 0, 255), j.d(Color.blue(color) + i7, 0, 255));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
