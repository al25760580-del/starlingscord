package com.discord.user_search_worker.react_events;

import a3.e;
import com.discord.chat.presentation.list.a;
import com.discord.notifications.renderer.NotificationRenderer;
import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.reactevents.ReactEvent;
import com.discord.user_search_worker.UserSearchWorkerResult;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.devsupport.StackTraceHelper;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J7\u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcom/discord/user_search_worker/react_events/ReturnResultsEvent;", "Lcom/discord/reactevents/ReactEvent;", "results", "", "Lcom/discord/user_search_worker/UserSearchWorkerResult;", "query", "", "uuid", "type", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getResults", "()Ljava/util/List;", "getQuery", "()Ljava/lang/String;", "getUuid", "getType", "serialize", "Lcom/facebook/react/bridge/WritableMap;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "user_search_worker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReturnResultsEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReturnResultsEvent.kt\ncom/discord/user_search_worker/react_events/ReturnResultsEvent\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,33:1\n1563#2:34\n1634#2,3:35\n*S KotlinDebug\n*F\n+ 1 ReturnResultsEvent.kt\ncom/discord/user_search_worker/react_events/ReturnResultsEvent\n*L\n22#1:34\n22#1:35,3\n*E\n"})
public final /* data */ class ReturnResultsEvent implements ReactEvent {

    @NotNull
    private final String query;

    @NotNull
    private final List<UserSearchWorkerResult> results;

    @NotNull
    private final String type;

    @NotNull
    private final String uuid;

    public ReturnResultsEvent(@NotNull List<UserSearchWorkerResult> results, @NotNull String query, @NotNull String uuid, @NotNull String type) {
        Intrinsics.checkNotNullParameter(results, "results");
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(type, "type");
        this.results = results;
        this.query = query;
        this.uuid = uuid;
        this.type = type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReturnResultsEvent copy$default(ReturnResultsEvent returnResultsEvent, List list, String str, String str2, String str3, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            list = returnResultsEvent.results;
        }
        if ((i7 & 2) != 0) {
            str = returnResultsEvent.query;
        }
        if ((i7 & 4) != 0) {
            str2 = returnResultsEvent.uuid;
        }
        if ((i7 & 8) != 0) {
            str3 = returnResultsEvent.type;
        }
        return returnResultsEvent.copy(list, str, str2, str3);
    }

    @NotNull
    public final List<UserSearchWorkerResult> component1() {
        return this.results;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getQuery() {
        return this.query;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final ReturnResultsEvent copy(@NotNull List<UserSearchWorkerResult> results, @NotNull String query, @NotNull String uuid, @NotNull String type) {
        Intrinsics.checkNotNullParameter(results, "results");
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(type, "type");
        return new ReturnResultsEvent(results, query, uuid, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReturnResultsEvent)) {
            return false;
        }
        ReturnResultsEvent returnResultsEvent = (ReturnResultsEvent) other;
        return Intrinsics.areEqual(this.results, returnResultsEvent.results) && Intrinsics.areEqual(this.query, returnResultsEvent.query) && Intrinsics.areEqual(this.uuid, returnResultsEvent.uuid) && Intrinsics.areEqual(this.type, returnResultsEvent.type);
    }

    @NotNull
    public final String getQuery() {
        return this.query;
    }

    @NotNull
    public final List<UserSearchWorkerResult> getResults() {
        return this.results;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        return this.type.hashCode() + e.d(e.d(this.results.hashCode() * 31, 31, this.query), 31, this.uuid);
    }

    @Override // com.discord.reactevents.ReactEvent
    @NotNull
    /* JADX INFO: renamed from: serialize */
    public WritableMap getData() {
        Pair pair = new Pair("uuid", this.uuid);
        Pair pair2 = new Pair("type", this.type);
        Pair pair3 = new Pair("query", this.query);
        List<UserSearchWorkerResult> list = this.results;
        ArrayList arrayList = new ArrayList(e0.l(list, 10));
        for (UserSearchWorkerResult userSearchWorkerResult : list) {
            arrayList.add(NativeMapExtensionsKt.nativeMapOf(new Pair(StackTraceHelper.ID_KEY, userSearchWorkerResult.getId()), new Pair(NotificationRenderer.USERNAME, userSearchWorkerResult.getUsername()), new Pair("comparator", userSearchWorkerResult.getComparator()), new Pair("score", Double.valueOf(userSearchWorkerResult.getScore()))));
        }
        return NativeMapExtensionsKt.nativeMapOf(pair, pair2, new Pair("payload", NativeMapExtensionsKt.nativeMapOf(pair3, new Pair("results", NativeArrayExtensionsKt.toNativeArray$default(arrayList, null, 1, null)))));
    }

    @NotNull
    public String toString() {
        List<UserSearchWorkerResult> list = this.results;
        String str = this.query;
        String str2 = this.uuid;
        String str3 = this.type;
        StringBuilder sb2 = new StringBuilder("ReturnResultsEvent(results=");
        sb2.append(list);
        sb2.append(", query=");
        sb2.append(str);
        sb2.append(", uuid=");
        return a.l(sb2, str2, ", type=", str3, ")");
    }
}
