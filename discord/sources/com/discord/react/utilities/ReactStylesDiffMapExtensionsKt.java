package com.discord.react.utilities;

import com.facebook.react.bridge.NoSuchKeyException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a*\u0010\u0000\u001a\u0002H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0001H\u0086\b¢\u0006\u0002\u0010\u0006\u001a\u0012\u0010\u0007\u001a\u00020\b*\u00020\u00022\u0006\u0010\t\u001a\u00020\u0004\u001a\u0012\u0010\n\u001a\u00020\u000b*\u00020\u00022\u0006\u0010\t\u001a\u00020\u0004\u001a\u0012\u0010\f\u001a\u00020\r*\u00020\u00022\u0006\u0010\t\u001a\u00020\u0004\u001a\u0012\u0010\u000e\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\t\u001a\u00020\u0004\u001a\u0012\u0010\u0010\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\t\u001a\u00020\u0004¨\u0006\u0011"}, d2 = {"getSafe", "T", "Lcom/facebook/react/uimanager/ReactStylesDiffMap;", StackTraceHelper.NAME_KEY, "", "default", "(Lcom/facebook/react/uimanager/ReactStylesDiffMap;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "getBoolean", "", "key", "getNonNullInt", "", "getNonNullMap", "Lcom/facebook/react/bridge/ReadableMap;", "getNonNullArray", "Lcom/facebook/react/bridge/ReadableArray;", "getNonNullString", "react_utilities_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ReactStylesDiffMapExtensionsKt {
    public static final boolean getBoolean(@NotNull ReactStylesDiffMap reactStylesDiffMap, @NotNull String key) {
        Intrinsics.checkNotNullParameter(reactStylesDiffMap, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (reactStylesDiffMap.isNull(key)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        return reactStylesDiffMap.getBoolean(key, false);
    }

    @NotNull
    public static final ReadableArray getNonNullArray(@NotNull ReactStylesDiffMap reactStylesDiffMap, @NotNull String key) {
        Intrinsics.checkNotNullParameter(reactStylesDiffMap, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        ReadableArray array = reactStylesDiffMap.getArray(key);
        Intrinsics.checkNotNull(array);
        return array;
    }

    public static final int getNonNullInt(@NotNull ReactStylesDiffMap reactStylesDiffMap, @NotNull String key) {
        Intrinsics.checkNotNullParameter(reactStylesDiffMap, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (reactStylesDiffMap.isNull(key)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        return reactStylesDiffMap.getInt(key, Integer.MAX_VALUE);
    }

    @NotNull
    public static final ReadableMap getNonNullMap(@NotNull ReactStylesDiffMap reactStylesDiffMap, @NotNull String key) {
        Intrinsics.checkNotNullParameter(reactStylesDiffMap, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        ReadableMap map = reactStylesDiffMap.getMap(key);
        Intrinsics.checkNotNull(map);
        return map;
    }

    @NotNull
    public static final String getNonNullString(@NotNull ReactStylesDiffMap reactStylesDiffMap, @NotNull String key) {
        Intrinsics.checkNotNullParameter(reactStylesDiffMap, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        String string = reactStylesDiffMap.getString(key);
        Intrinsics.checkNotNull(string);
        return string;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ <T> T getSafe(ReactStylesDiffMap reactStylesDiffMap, String name, T t5) {
        Intrinsics.checkNotNullParameter(reactStylesDiffMap, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        try {
            Intrinsics.reifiedOperationMarker(4, "T");
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                Intrinsics.checkNotNull(t5, "null cannot be cast to non-null type kotlin.Boolean");
                T t10 = (T) Boolean.valueOf(reactStylesDiffMap.getBoolean(name, ((Boolean) t5).booleanValue()));
                Intrinsics.reifiedOperationMarker(1, "T");
                return t10;
            }
            if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                Intrinsics.checkNotNull(t5, "null cannot be cast to non-null type kotlin.Int");
                T t11 = (T) Integer.valueOf(reactStylesDiffMap.getInt(name, ((Integer) t5).intValue()));
                Intrinsics.reifiedOperationMarker(1, "T");
                return t11;
            }
            if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Float.TYPE))) {
                Intrinsics.checkNotNull(t5, "null cannot be cast to non-null type kotlin.Float");
                T t12 = (T) Float.valueOf(reactStylesDiffMap.getFloat(name, ((Float) t5).floatValue()));
                Intrinsics.reifiedOperationMarker(1, "T");
                return t12;
            }
            Intrinsics.reifiedOperationMarker(4, "T");
            throw new IllegalStateException(("Unsupported type " + Reflection.getOrCreateKotlinClass(Object.class)).toString());
        } catch (NoSuchKeyException | IllegalArgumentException unused) {
            return t5;
        }
    }
}
