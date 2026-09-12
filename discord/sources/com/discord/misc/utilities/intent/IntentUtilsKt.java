package com.discord.misc.utilities.intent;

import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import gn.h;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import y0.c;
import y0.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001f\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a!\u0010\t\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n\u001a*\u0010\f\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u000b\u0018\u0001*\u00020\u0007*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\f\u0010\r\u001a8\u0010\u000f\u001a\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u000e\"\n\b\u0000\u0010\u000b\u0018\u0001*\u00020\u0007*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001d\u0010\u0012\u001a\u00020\u0005*\u00020\u00052\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001d\u0010\u0015\u001a\u00020\u0014*\u00020\u00052\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0000¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lkotlin/reflect/KClass;", "", "kotlin.jvm.PlatformType", "key", "(Lkotlin/reflect/KClass;)Ljava/lang/String;", "Landroid/content/Intent;", "parcelableKey", "Landroid/os/Parcelable;", "actionIntent", "putIntentParcelable", "(Landroid/content/Intent;Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;", "T", "getIntentParcelable", "(Landroid/content/Intent;Ljava/lang/String;)Landroid/os/Parcelable;", "Ljava/util/ArrayList;", "getIntentParcelableArrayList", "(Landroid/content/Intent;Ljava/lang/String;)Ljava/util/ArrayList;", "className", "putExtra", "(Landroid/content/Intent;Lkotlin/reflect/KClass;)Landroid/content/Intent;", "", "hasExtra", "(Landroid/content/Intent;Lkotlin/reflect/KClass;)Z", "misc_utilities_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class IntentUtilsKt {
    public static final /* synthetic */ <T extends Parcelable> T getIntentParcelable(Intent intent, String parcelableKey) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(parcelableKey, "parcelableKey");
        Intrinsics.reifiedOperationMarker(4, "T");
        return (T) d.b(intent, parcelableKey, Parcelable.class);
    }

    public static final <T extends Parcelable> ArrayList<T> getIntentParcelableArrayList(Intent intent, String parcelableKey) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(parcelableKey, "parcelableKey");
        Intrinsics.reifiedOperationMarker(4, "T");
        return Build.VERSION.SDK_INT >= 34 ? c.a(intent, parcelableKey, Parcelable.class) : intent.getParcelableArrayListExtra(parcelableKey);
    }

    public static final boolean hasExtra(@NotNull Intent intent, @NotNull KClass className) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(className, "className");
        return intent.hasExtra(key(className));
    }

    private static final String key(KClass kClass) {
        return h.B(kClass).getName();
    }

    @NotNull
    public static final Intent putExtra(@NotNull Intent intent, @NotNull KClass className) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(className, "className");
        Intent intentPutExtra = intent.putExtra(key(className), true);
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    @NotNull
    public static final Intent putIntentParcelable(@NotNull Intent intent, @NotNull String parcelableKey, @NotNull Parcelable actionIntent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(parcelableKey, "parcelableKey");
        Intrinsics.checkNotNullParameter(actionIntent, "actionIntent");
        Intent intentPutExtra = intent.putExtra(parcelableKey, actionIntent);
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }
}
