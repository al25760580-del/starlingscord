package com.discord.jank_stats;

import com.discord.codegen.NativeJankSessionModuleSpec;
import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableNativeArray;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.s0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¨\u0006\u0010"}, d2 = {"Lcom/discord/jank_stats/JankSessionModule;", "Lcom/discord/codegen/NativeJankSessionModuleSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "hydrateLaunchId", "", "launchId", "", "getPendingReports", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "ackReports", "sessionIds", "Lcom/facebook/react/bridge/ReadableArray;", "jank_stats_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nJankSessionModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JankSessionModule.kt\ncom/discord/jank_stats/JankSessionModule\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 WritableBuilders.kt\ncom/discord/react/utilities/WritableBuildersKt\n*L\n1#1,43:1\n1625#2:44\n1869#2:45\n1870#2:47\n1626#2:48\n1#3:46\n14#4:49\n8#4,11:50\n*S KotlinDebug\n*F\n+ 1 JankSessionModule.kt\ncom/discord/jank_stats/JankSessionModule\n*L\n39#1:44\n39#1:45\n39#1:47\n39#1:48\n39#1:46\n21#1:49\n21#1:50,11\n*E\n"})
public final class JankSessionModule extends NativeJankSessionModuleSpec {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JankSessionModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getPendingReports$lambda$1(Promise promise, List records) {
        Intrinsics.checkNotNullParameter(records, "records");
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        Iterator it = records.iterator();
        while (it.hasNext()) {
            JankRecordStore.PendingRecord pendingRecord = (JankRecordStore.PendingRecord) it.next();
            writableNativeArray.pushMap(NativeMapExtensionsKt.nativeMapOf(new Pair("sessionId", pendingRecord.getSessionId()), new Pair("sessionStartMs", Double.valueOf(pendingRecord.getSessionStartWallMs())), new Pair("appVersionCode", Integer.valueOf(pendingRecord.getAppVersionCode())), new Pair("releaseChannel", pendingRecord.getReleaseChannel()), new Pair("totalFrameCount", Double.valueOf(pendingRecord.getTotalFrames())), new Pair("jankFrameCount", Double.valueOf(pendingRecord.getJankFrames()))));
        }
        promise.resolve(writableNativeArray);
        return Unit.f14616a;
    }

    @Override // com.discord.codegen.NativeJankSessionModuleSpec
    public void ackReports(@NotNull ReadableArray sessionIds) {
        Intrinsics.checkNotNullParameter(sessionIds, "sessionIds");
        JankSessionRecorder jankSessionRecorder = JankSessionRecorder.INSTANCE;
        IntRange intRangeSizeRange = NativeArrayExtensionsKt.sizeRange(sessionIds);
        HashSet hashSet = new HashSet();
        Iterator it = intRangeSizeRange.iterator();
        while (it.hasNext()) {
            String string = sessionIds.getString(((s0) it).nextInt());
            if (string != null) {
                hashSet.add(string);
            }
        }
        jankSessionRecorder.acknowledge(hashSet);
    }

    @Override // com.discord.codegen.NativeJankSessionModuleSpec
    public void getPendingReports(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        JankSessionRecorder.INSTANCE.pendingRecords(new com.discord.age_assurance.c(promise, 7));
    }

    @Override // com.discord.codegen.NativeJankSessionModuleSpec
    public void hydrateLaunchId(@NotNull String launchId) {
        Intrinsics.checkNotNullParameter(launchId, "launchId");
        JankSessionRecorder.INSTANCE.hydrateLaunchId(launchId);
    }
}
