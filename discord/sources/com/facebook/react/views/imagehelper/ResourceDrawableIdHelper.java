package com.facebook.react.views.imagehelper;

import a1.n;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.react.devsupport.StackTraceHelper;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.x;
import org.jetbrains.annotations.NotNull;
import rn.d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0007J\u001a\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0007J\u0018\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0006H\u0002J\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0007J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0007J\r\u0010\u0016\u001a\u00020\u0000H\u0007¢\u0006\u0002\b\u0019R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/facebook/react/views/imagehelper/ResourceDrawableIdHelper;", "", "<init>", "()V", "resourceDrawableIdMap", "", "", "", "clear", "", "getResourceDrawableId", "context", "Landroid/content/Context;", StackTraceHelper.NAME_KEY, "addDrawableId", "normalizedName", "getResourceDrawable", "Landroid/graphics/drawable/Drawable;", "getResourceDrawableUri", "Landroid/net/Uri;", "instance", "getInstance$annotations", "getInstance", "()Lcom/facebook/react/views/imagehelper/ResourceDrawableIdHelper;", "LOCAL_RESOURCE_SCHEME", "DEPRECATED$getInstance", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ResourceDrawableIdHelper {

    @NotNull
    private static final String LOCAL_RESOURCE_SCHEME = "res";

    @NotNull
    public static final ResourceDrawableIdHelper INSTANCE = new ResourceDrawableIdHelper();

    @NotNull
    private static final Map<String, Integer> resourceDrawableIdMap = new HashMap();

    private ResourceDrawableIdHelper() {
    }

    private final int addDrawableId(Context context, String normalizedName) {
        int identifier = context.getResources().getIdentifier(normalizedName, "drawable", context.getPackageName());
        resourceDrawableIdMap.put(normalizedName, Integer.valueOf(identifier));
        return identifier;
    }

    public static final synchronized void clear() {
        resourceDrawableIdMap.clear();
    }

    @NotNull
    public static final ResourceDrawableIdHelper getInstance() {
        return INSTANCE;
    }

    @d
    public static /* synthetic */ void getInstance$annotations() {
    }

    public static final Drawable getResourceDrawable(@NotNull Context context, String name) {
        Intrinsics.checkNotNullParameter(context, "context");
        int resourceDrawableId = getResourceDrawableId(context, name);
        if (resourceDrawableId <= 0) {
            return null;
        }
        Resources resources = context.getResources();
        ThreadLocal threadLocal = n.f42a;
        return resources.getDrawable(resourceDrawableId, null);
    }

    public static final int getResourceDrawableId(@NotNull Context context, String name) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (name == null || name.length() == 0) {
            return 0;
        }
        String lowerCase = name.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String strL = x.l(lowerCase, "-", "_", false);
        try {
            return Integer.parseInt(strL);
        } catch (NumberFormatException unused) {
            ResourceDrawableIdHelper resourceDrawableIdHelper = INSTANCE;
            synchronized (resourceDrawableIdHelper) {
                try {
                    Integer num = resourceDrawableIdMap.get(strL);
                    return num != null ? num.intValue() : resourceDrawableIdHelper.addDrawableId(context, strL);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @NotNull
    public static final Uri getResourceDrawableUri(@NotNull Context context, String name) {
        Intrinsics.checkNotNullParameter(context, "context");
        int resourceDrawableId = getResourceDrawableId(context, name);
        if (resourceDrawableId > 0) {
            Uri uriBuild = new Uri.Builder().scheme(LOCAL_RESOURCE_SCHEME).path(String.valueOf(resourceDrawableId)).build();
            Intrinsics.checkNotNull(uriBuild);
            return uriBuild;
        }
        Uri uri = Uri.EMPTY;
        Intrinsics.checkNotNull(uri);
        return uri;
    }

    @NotNull
    @d
    public final ResourceDrawableIdHelper DEPRECATED$getInstance() {
        return this;
    }
}
