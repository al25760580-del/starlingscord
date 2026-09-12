package com.discord.app_icon;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.uimanager.ViewProps;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import s0.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0002J \u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002¨\u0006\u0017"}, d2 = {"Lcom/discord/app_icon/AppIconUtil;", "", "<init>", "()V", "getAvailableIcons", "", "Lcom/discord/app_icon/AppIcon;", "()[Lcom/discord/app_icon/AppIcon;", "getCurrentAppIcon", "context", "Landroid/content/Context;", "setAppIcon", "", StackTraceHelper.ID_KEY, "", "getAppIconFromId", "setComponentState", "packageManager", "Landroid/content/pm/PackageManager;", "componentName", "Landroid/content/ComponentName;", ViewProps.ENABLED, "", "app_icon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAppIconUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppIconUtil.kt\ncom/discord/app_icon/AppIconUtil\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,51:1\n37#2:52\n36#2,3:53\n295#3,2:56\n295#3,2:58\n*S KotlinDebug\n*F\n+ 1 AppIconUtil.kt\ncom/discord/app_icon/AppIconUtil\n*L\n8#1:52\n8#1:53,3\n12#1:56,2\n30#1:58,2\n*E\n"})
public final class AppIconUtil {

    @NotNull
    public static final AppIconUtil INSTANCE = new AppIconUtil();

    private AppIconUtil() {
    }

    private final AppIcon getAppIconFromId(String id2) {
        Object next;
        Iterator<E> it = AppIcon.getEntries().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (Intrinsics.areEqual(((AppIcon) next).getId(), id2)) {
                return (AppIcon) next;
            }
        }
        next = null;
        return (AppIcon) next;
    }

    private final void setComponentState(PackageManager packageManager, ComponentName componentName, boolean enabled) {
        packageManager.setComponentEnabledSetting(componentName, enabled ? 1 : 2, 1);
    }

    @NotNull
    public final AppIcon[] getAvailableIcons() {
        return (AppIcon[]) AppIcon.getEntries().toArray(new AppIcon[0]);
    }

    @NotNull
    public final AppIcon getCurrentAppIcon(@NotNull Context context) {
        Object next;
        Intrinsics.checkNotNullParameter(context, "context");
        PackageManager packageManager = context.getPackageManager();
        Iterator<E> it = AppIcon.getEntries().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (packageManager.getComponentEnabledSetting(new ComponentName(context, ((AppIcon) next).getAlias())) != 1);
        AppIcon appIcon = (AppIcon) next;
        return appIcon == null ? AppIcon.DEFAULT : appIcon;
    }

    public final void setAppIcon(@NotNull Context context, @NotNull String id2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(id2, "id");
        AppIcon appIconFromId = getAppIconFromId(id2);
        if (appIconFromId == null) {
            throw new IllegalArgumentException(g.e("App Icon ", id2, " does not exist."));
        }
        PackageManager packageManager = context.getPackageManager();
        for (AppIcon appIcon : AppIcon.getEntries()) {
            ComponentName componentName = new ComponentName(context, appIcon.getAlias());
            boolean z5 = appIcon == appIconFromId;
            Intrinsics.checkNotNull(packageManager);
            setComponentState(packageManager, componentName, z5);
        }
    }
}
