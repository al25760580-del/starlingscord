package com.discord.react;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import com.discord.misc.utilities.size.SizeUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\r\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0007J\u0016\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0007J\u0016\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007J\u0014\u0010\u0016\u001a\n \u0018*\u0004\u0018\u00010\u00170\u0017*\u00020\u0007H\u0002R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001aX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/discord/react/FontManager;", "", "<init>", "()V", "setFontSize", "", "context", "Landroid/content/Context;", "fontScale", "", "isClassicChatFontScaleEnabled", "", "getFontScale", "getScaledFontSize", "getScaledPx", "", "px", "getScaledDpToPx", "dp", "getScaledSpToPx", "sp", "getIsClassicChatFontScaleEnabled", "getCache", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", FontManager.FONT_SCALE_KEY, "", FontManager.FONT_SCALE_CHAT_CLASSIC_KEY, "FONT_SCALE_CHAT_CLASSIC_DEFAULT", "fonts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFontManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontManager.kt\ncom/discord/react/FontManager\n+ 2 SharedPreferences.kt\nandroidx/core/content/SharedPreferencesKt\n*L\n1#1,84:1\n45#2,8:85\n40#2,13:93\n*S KotlinDebug\n*F\n+ 1 FontManager.kt\ncom/discord/react/FontManager\n*L\n16#1:85,8\n69#1:93,13\n*E\n"})
public final class FontManager {
    private static final boolean FONT_SCALE_CHAT_CLASSIC_DEFAULT = false;

    @NotNull
    private static final String FONT_SCALE_CHAT_CLASSIC_KEY = "FONT_SCALE_CHAT_CLASSIC_KEY";

    @NotNull
    private static final String FONT_SCALE_KEY = "FONT_SCALE_KEY";

    @NotNull
    public static final FontManager INSTANCE = new FontManager();

    private FontManager() {
    }

    private final SharedPreferences getCache(Context context) {
        return context.getSharedPreferences("FontScaleManager", 0);
    }

    public static /* synthetic */ void setFontSize$default(FontManager fontManager, Context context, float f2, boolean z5, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            f2 = fontManager.getFontScale(context);
        }
        if ((i7 & 4) != 0) {
            z5 = fontManager.getIsClassicChatFontScaleEnabled(context);
        }
        fontManager.setFontSize(context, f2, z5);
    }

    public final synchronized float getFontScale(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getCache(context).getFloat(FONT_SCALE_KEY, 1.0f);
    }

    public final synchronized boolean getIsClassicChatFontScaleEnabled(@NotNull Context context) {
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            if (!getCache(context).contains(FONT_SCALE_CHAT_CLASSIC_KEY)) {
                SharedPreferences cache = getCache(context);
                Intrinsics.checkNotNullExpressionValue(cache, "getCache(...)");
                SharedPreferences.Editor editorEdit = cache.edit();
                editorEdit.putBoolean(FONT_SCALE_CHAT_CLASSIC_KEY, false);
                editorEdit.apply();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return getCache(context).getBoolean(FONT_SCALE_CHAT_CLASSIC_KEY, false);
    }

    public final synchronized int getScaledDpToPx(int dp2, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getScaledPx(SizeUtilsKt.getDpToPx(dp2), context);
    }

    public final synchronized float getScaledFontSize(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return Resources.getSystem().getConfiguration().fontScale * getFontScale(context);
    }

    public final synchronized int getScaledPx(int px, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (int) (px * getFontScale(context));
    }

    public final synchronized int getScaledSpToPx(int sp2, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getScaledPx(SizeUtilsKt.getSpToPx(sp2), context);
    }

    public final synchronized void setFontSize(@NotNull Context context, float fontScale, boolean isClassicChatFontScaleEnabled) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences cache = getCache(context);
        Intrinsics.checkNotNullExpressionValue(cache, "getCache(...)");
        SharedPreferences.Editor editorEdit = cache.edit();
        editorEdit.putFloat(FONT_SCALE_KEY, fontScale);
        editorEdit.putBoolean(FONT_SCALE_CHAT_CLASSIC_KEY, isClassicChatFontScaleEnabled);
        editorEdit.commit();
    }
}
