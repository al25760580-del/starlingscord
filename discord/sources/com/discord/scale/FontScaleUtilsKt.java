package com.discord.scale;

import android.content.Context;
import android.content.res.Configuration;
import com.discord.react.FontManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001\u001a\u0014\u0010\u0002\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0002¨\u0006\u0005"}, d2 = {"getFontScaledContext", "Landroid/content/Context;", "modifyFontScale", "Landroid/content/res/Configuration;", "context", "fonts_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class FontScaleUtilsKt {
    @NotNull
    public static final Context getFontScaledContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "getConfiguration(...)");
        Context contextCreateConfigurationContext = context.createConfigurationContext(modifyFontScale(configuration, context));
        Intrinsics.checkNotNullExpressionValue(contextCreateConfigurationContext, "createConfigurationContext(...)");
        return contextCreateConfigurationContext;
    }

    private static final Configuration modifyFontScale(Configuration configuration, Context context) {
        configuration.fontScale = FontManager.INSTANCE.getScaledFontSize(context);
        return configuration;
    }
}
