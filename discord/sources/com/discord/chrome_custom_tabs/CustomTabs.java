package com.discord.chrome_custom_tabs;

import android.app.ActivityOptions;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import e4.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n8.f;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJy\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\f2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0016\u0010\u0016\u001a\u0012\u0012\b\u0012\u00060\u0013j\u0002`\u0014\u0012\u0004\u0012\u00020\u00150\u0012¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/discord/chrome_custom_tabs/CustomTabs;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "supportsCustomTabs", "(Landroid/content/Context;)Z", "Landroid/net/Uri;", "uri", "showTitle", "", "toolbarColor", "animShowEnterResId", "animShowExitResId", "animHideEnterResId", "animHideExitResId", "Lkotlin/Function1;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "onFailure", "openUrlWithCustomTabs", "(Landroid/content/Context;Landroid/net/Uri;ZILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;)V", "chrome_custom_tabs_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CustomTabs {

    @NotNull
    public static final CustomTabs INSTANCE = new CustomTabs();

    private CustomTabs() {
    }

    public static /* synthetic */ void openUrlWithCustomTabs$default(CustomTabs customTabs, Context context, Uri uri, boolean z5, int i7, Integer num, Integer num2, Integer num3, Integer num4, Function1 function1, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z5 = false;
        }
        customTabs.openUrlWithCustomTabs(context, uri, z5, i7, (i10 & 16) != 0 ? null : num, (i10 & 32) != 0 ? null : num2, (i10 & 64) != 0 ? null : num3, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? null : num4, function1);
    }

    public final void openUrlWithCustomTabs(@NotNull Context context, @NotNull Uri uri, boolean showTitle, int toolbarColor, Integer animShowEnterResId, Integer animShowExitResId, Integer animHideEnterResId, Integer animHideExitResId, @NotNull Function1<? super Exception, Unit> onFailure) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        if (!supportsCustomTabs(context)) {
            onFailure.invoke(new IllegalStateException("Unable to find custom tabs package."));
            return;
        }
        int i7 = (-16777216) | toolbarColor;
        f fVar = new f(Integer.valueOf(i7), Integer.valueOf(toolbarColor), Integer.valueOf(i7), 6);
        Intrinsics.checkNotNullExpressionValue(fVar, "build(...)");
        r9.a aVar = new r9.a();
        Intent intent = (Intent) aVar.f19215b;
        aVar.f19218e = fVar.j0();
        intent.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", showTitle ? 1 : 0);
        if (animShowEnterResId != null && animShowExitResId != null) {
            aVar.f19217d = ActivityOptions.makeCustomAnimation(context, animShowEnterResId.intValue(), animShowExitResId.intValue());
        }
        if (animHideEnterResId != null && animHideExitResId != null) {
            intent.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", ActivityOptions.makeCustomAnimation(context, animHideEnterResId.intValue(), animHideExitResId.intValue()).toBundle());
        }
        e eVarJ = aVar.j();
        Intent intent2 = (Intent) eVarJ.f7971e;
        Intrinsics.checkNotNullExpressionValue(eVarJ, "build(...)");
        try {
            intent2.setData(uri);
            intent2.setData(uri);
            context.startActivity(intent2, (Bundle) eVarJ.f7972i);
        } catch (ActivityNotFoundException e10) {
            onFailure.invoke(e10);
        }
    }

    public final boolean supportsCustomTabs(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return CustomTabsPackages.INSTANCE.getCustomTabsDefaultPackage(context) != null;
    }
}
