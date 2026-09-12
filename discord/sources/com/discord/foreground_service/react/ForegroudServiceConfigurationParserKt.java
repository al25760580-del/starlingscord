package com.discord.foreground_service.react;

import com.discord.foreground_service.service.ServiceNotificationConfiguration;
import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.modules.dialog.AlertFragment;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.collections.n0;
import kotlin.collections.s0;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import s0.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u0014\u0010\u0006\u001a\u00020\u0002*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0000\u001a\u0014\u0010\t\u001a\u00020\n*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a\u0014\u0010\u000b\u001a\u00020\f*\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH\u0002\u001a\u0014\u0010\u000f\u001a\u00020\u0010*\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH\u0002\u001a\u0014\u0010\u0011\u001a\u00020\u0012*\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH\u0002¨\u0006\u0013"}, d2 = {"parseList", "", "Lcom/discord/foreground_service/service/ServiceNotificationConfiguration;", "Lcom/discord/foreground_service/service/ServiceNotificationConfiguration$Companion;", "readableArray", "Lcom/facebook/react/bridge/ReadableArray;", "parse", "readableMap", "Lcom/facebook/react/bridge/ReadableMap;", "parseAction", "Lcom/discord/foreground_service/service/ServiceNotificationConfiguration$Action;", "parsePriority", "Lcom/discord/foreground_service/service/ServiceNotificationConfiguration$Priority;", "value", "", "parseType", "Lcom/discord/foreground_service/service/ServiceNotificationConfiguration$Type;", "parseIcon", "Lcom/discord/foreground_service/service/ServiceNotificationConfiguration$Icon;", "foreground_service_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nForegroudServiceConfigurationParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ForegroudServiceConfigurationParser.kt\ncom/discord/foreground_service/react/ForegroudServiceConfigurationParserKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1563#2:75\n1634#2,3:76\n1563#2:80\n1634#2,3:81\n1#3:79\n*S KotlinDebug\n*F\n+ 1 ForegroudServiceConfigurationParser.kt\ncom/discord/foreground_service/react/ForegroudServiceConfigurationParserKt\n*L\n13#1:75\n13#1:76,3\n30#1:80\n30#1:81,3\n*E\n"})
public final class ForegroudServiceConfigurationParserKt {
    @NotNull
    public static final ServiceNotificationConfiguration parse(@NotNull ServiceNotificationConfiguration.Companion companion, @NotNull ReadableMap readableMap) {
        List arrayList;
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(readableMap, "readableMap");
        String nonNullString = NativeMapExtensionsKt.getNonNullString(readableMap, AlertFragment.ARG_TITLE);
        String string = readableMap.getString("content");
        ServiceNotificationConfiguration.Companion companion2 = ServiceNotificationConfiguration.INSTANCE;
        ServiceNotificationConfiguration.Priority priority = parsePriority(companion2, readableMap.getInt("priority"));
        ReadableMap map = readableMap.getMap("contentAction");
        ServiceNotificationConfiguration.Action action = map != null ? parseAction(companion2, map) : null;
        ReadableArray array = readableMap.getArray("auxiliaryActions");
        if (array != null) {
            IntRange intRangeSizeRange = NativeArrayExtensionsKt.sizeRange(array);
            arrayList = new ArrayList(e0.l(intRangeSizeRange, 10));
            Iterator it = intRangeSizeRange.iterator();
            while (it.hasNext()) {
                ReadableMap map2 = array.getMap(((s0) it).nextInt());
                Intrinsics.checkNotNull(map2);
                arrayList.add(parseAction(ServiceNotificationConfiguration.INSTANCE, map2));
            }
        } else {
            arrayList = n0.f14659d;
        }
        List list = arrayList;
        ServiceNotificationConfiguration.Companion companion3 = ServiceNotificationConfiguration.INSTANCE;
        ServiceNotificationConfiguration.Type type = parseType(companion3, readableMap.getInt("type"));
        Integer nullableInt$default = NativeMapExtensionsKt.getNullableInt$default(readableMap, "icon", null, 2, null);
        return new ServiceNotificationConfiguration(nonNullString, string, priority, action, list, type, nullableInt$default != null ? parseIcon(companion3, nullableInt$default.intValue()) : null, NativeMapExtensionsKt.getNullableInt$default(readableMap, ViewProps.COLOR, null, 2, null));
    }

    private static final ServiceNotificationConfiguration.Action parseAction(ServiceNotificationConfiguration.Companion companion, ReadableMap readableMap) {
        Map mapD;
        String nonNullString = NativeMapExtensionsKt.getNonNullString(readableMap, "tag");
        String nonNullString2 = NativeMapExtensionsKt.getNonNullString(readableMap, "taskName");
        String stringOrEmpty = NativeMapExtensionsKt.getStringOrEmpty(readableMap, AlertFragment.ARG_TITLE);
        ReadableMap map = readableMap.getMap("data");
        if (map == null || (mapD = NativeMapExtensionsKt.toStringMap(map)) == null) {
            mapD = w0.d();
        }
        return new ServiceNotificationConfiguration.Action(nonNullString, nonNullString2, stringOrEmpty, mapD);
    }

    private static final ServiceNotificationConfiguration.Icon parseIcon(ServiceNotificationConfiguration.Companion companion, int i7) {
        if (i7 == 0) {
            return ServiceNotificationConfiguration.Icon.DEFAULT;
        }
        if (i7 == 1) {
            return ServiceNotificationConfiguration.Icon.DEAFENED;
        }
        if (i7 == 2) {
            return ServiceNotificationConfiguration.Icon.IDLE;
        }
        if (i7 == 3) {
            return ServiceNotificationConfiguration.Icon.MUTED;
        }
        if (i7 == 4) {
            return ServiceNotificationConfiguration.Icon.SPEAKING;
        }
        throw new IllegalArgumentException(g.d(i7, "Unknown icon: ", "."));
    }

    @NotNull
    public static final List<ServiceNotificationConfiguration> parseList(@NotNull ServiceNotificationConfiguration.Companion companion, @NotNull ReadableArray readableArray) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(readableArray, "readableArray");
        IntRange intRangeSizeRange = NativeArrayExtensionsKt.sizeRange(readableArray);
        ArrayList arrayList = new ArrayList(e0.l(intRangeSizeRange, 10));
        Iterator it = intRangeSizeRange.iterator();
        while (it.hasNext()) {
            int iNextInt = ((s0) it).nextInt();
            ServiceNotificationConfiguration.Companion companion2 = ServiceNotificationConfiguration.INSTANCE;
            ReadableMap map = readableArray.getMap(iNextInt);
            Intrinsics.checkNotNull(map);
            arrayList.add(parse(companion2, map));
        }
        return arrayList;
    }

    private static final ServiceNotificationConfiguration.Priority parsePriority(ServiceNotificationConfiguration.Companion companion, int i7) {
        if (i7 == 0) {
            return ServiceNotificationConfiguration.Priority.HIGH;
        }
        if (i7 == 1) {
            return ServiceNotificationConfiguration.Priority.MEDIUM;
        }
        if (i7 == 2) {
            return ServiceNotificationConfiguration.Priority.LOW;
        }
        throw new IllegalArgumentException(g.d(i7, "Unknown priority: ", "."));
    }

    private static final ServiceNotificationConfiguration.Type parseType(ServiceNotificationConfiguration.Companion companion, int i7) {
        if (i7 == 0) {
            return ServiceNotificationConfiguration.Type.FILE_UPLOAD;
        }
        if (i7 == 1) {
            return ServiceNotificationConfiguration.Type.VOICE_CALL;
        }
        if (i7 == 2) {
            return ServiceNotificationConfiguration.Type.SCREEN_SHARE;
        }
        throw new IllegalArgumentException(g.d(i7, "Unknown type: ", "."));
    }
}
