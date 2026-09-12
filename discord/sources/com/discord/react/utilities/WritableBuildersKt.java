package com.discord.react.utilities;

import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a1\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a1\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00072\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0002H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a=\u0010\u000e\u001a\u00020\u0000\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\fH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a5\u0010\u0010\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u00072\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0002H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a=\u0010\u0014\u001a\u00020\u0003*\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0001\u001a\u00020\u00072\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0002H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a=\u0010\u0016\u001a\u00020\u0003*\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0018"}, d2 = {"Lcom/facebook/react/bridge/WritableArray;", "instance", "Lkotlin/Function1;", "", "build", "buildWritableArray", "(Lcom/facebook/react/bridge/WritableArray;Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/bridge/WritableArray;", "Lcom/facebook/react/bridge/WritableMap;", "buildWritableMap", "(Lcom/facebook/react/bridge/WritableMap;Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/bridge/WritableMap;", "T", "", "Lkotlin/Function2;", "map", "buildIntoWritableArray", "(Ljava/util/Collection;Lkotlin/jvm/functions/Function2;)Lcom/facebook/react/bridge/WritableArray;", "pushMap", "(Lcom/facebook/react/bridge/WritableArray;Lcom/facebook/react/bridge/WritableMap;Lkotlin/jvm/functions/Function1;)V", "", "key", "putMap", "(Lcom/facebook/react/bridge/WritableMap;Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;Lkotlin/jvm/functions/Function1;)V", "putArray", "(Lcom/facebook/react/bridge/WritableMap;Ljava/lang/String;Lcom/facebook/react/bridge/WritableArray;Lkotlin/jvm/functions/Function1;)V", "react_utilities_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWritableBuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WritableBuilders.kt\ncom/discord/react/utilities/WritableBuildersKt\n*L\n1#1,31:1\n8#1,2:32\n*S KotlinDebug\n*F\n+ 1 WritableBuilders.kt\ncom/discord/react/utilities/WritableBuildersKt\n*L\n14#1:32,2\n*E\n"})
public final class WritableBuildersKt {
    @NotNull
    public static final <T> WritableArray buildIntoWritableArray(@NotNull Collection<? extends T> collection, @NotNull Function2<? super WritableArray, ? super T, Unit> map) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(map, "map");
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        Iterator<? extends T> it = collection.iterator();
        while (it.hasNext()) {
            map.invoke(writableNativeArray, it.next());
        }
        return writableNativeArray;
    }

    @NotNull
    public static final WritableArray buildWritableArray(@NotNull WritableArray instance, @NotNull Function1<? super WritableArray, Unit> build) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(build, "build");
        build.invoke(instance);
        return instance;
    }

    public static /* synthetic */ WritableArray buildWritableArray$default(WritableArray instance, Function1 build, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            instance = new WritableNativeArray();
        }
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(build, "build");
        build.invoke(instance);
        return instance;
    }

    @NotNull
    public static final WritableMap buildWritableMap(@NotNull WritableMap instance, @NotNull Function1<? super WritableMap, Unit> build) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(build, "build");
        build.invoke(instance);
        return instance;
    }

    public static /* synthetic */ WritableMap buildWritableMap$default(WritableMap instance, Function1 build, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            instance = new WritableNativeMap();
        }
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(build, "build");
        build.invoke(instance);
        return instance;
    }

    public static final void pushMap(@NotNull WritableArray writableArray, @NotNull WritableMap instance, @NotNull Function1<? super WritableMap, Unit> build) {
        Intrinsics.checkNotNullParameter(writableArray, "<this>");
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(build, "build");
        build.invoke(instance);
        writableArray.pushMap(instance);
    }

    public static /* synthetic */ void pushMap$default(WritableArray writableArray, WritableMap instance, Function1 build, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            instance = new WritableNativeMap();
        }
        Intrinsics.checkNotNullParameter(writableArray, "<this>");
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(build, "build");
        build.invoke(instance);
        writableArray.pushMap(instance);
    }

    public static final void putArray(@NotNull WritableMap writableMap, @NotNull String key, @NotNull WritableArray instance, @NotNull Function1<? super WritableArray, Unit> build) {
        Intrinsics.checkNotNullParameter(writableMap, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(build, "build");
        build.invoke(instance);
        writableMap.putArray(key, instance);
    }

    public static /* synthetic */ void putArray$default(WritableMap writableMap, String key, WritableArray instance, Function1 build, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            instance = new WritableNativeArray();
        }
        Intrinsics.checkNotNullParameter(writableMap, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(build, "build");
        build.invoke(instance);
        writableMap.putArray(key, instance);
    }

    public static final void putMap(@NotNull WritableMap writableMap, @NotNull String key, @NotNull WritableMap instance, @NotNull Function1<? super WritableMap, Unit> build) {
        Intrinsics.checkNotNullParameter(writableMap, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(build, "build");
        build.invoke(instance);
        writableMap.putMap(key, instance);
    }

    public static /* synthetic */ void putMap$default(WritableMap writableMap, String key, WritableMap instance, Function1 build, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            instance = new WritableNativeMap();
        }
        Intrinsics.checkNotNullParameter(writableMap, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(build, "build");
        build.invoke(instance);
        writableMap.putMap(key, instance);
    }
}
