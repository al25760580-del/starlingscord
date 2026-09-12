package com.discord.user_search_worker;

import com.discord.chat.presentation.message.viewholder.f;
import com.discord.reactevents.ReactEvents;
import com.discord.user_search_worker.react_events.ReturnResultsEvent;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bH\u0007J\b\u0010\u000f\u001a\u00020\rH\u0007J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u000bH\u0007J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u0007R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/discord/user_search_worker/UserSearchWorkerManagerModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "worker", "Lcom/discord/user_search_worker/UserSearchWorker;", "getName", "", "onmessage", "", "dataJSON", "terminate", "addListener", "type", "removeListeners", "count", "", "user_search_worker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UserSearchWorkerManagerModule extends ReactContextBaseJavaModule {

    @NotNull
    private final ReactEvents reactEvents;

    @NotNull
    private UserSearchWorker worker;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserSearchWorkerManagerModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactEvents = new ReactEvents(new Pair("ReturnResults", Reflection.getOrCreateKotlinClass(ReturnResultsEvent.class)));
        this.worker = new UserSearchWorker(new f(2, this, reactContext));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit worker$lambda$0(UserSearchWorkerManagerModule userSearchWorkerManagerModule, ReactApplicationContext reactApplicationContext, List results, String query, String uuid) {
        Intrinsics.checkNotNullParameter(results, "results");
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        userSearchWorkerManagerModule.reactEvents.emitModuleEvent(reactApplicationContext, new ReturnResultsEvent(results, query, uuid, "USER_RESULTS"));
        return Unit.f14616a;
    }

    @ReactMethod
    public final void addListener(@NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "UserSearchWorkerManager";
    }

    @ReactMethod
    public final void onmessage(@NotNull String dataJSON) {
        Intrinsics.checkNotNullParameter(dataJSON, "dataJSON");
        this.worker.onMessage(dataJSON);
    }

    @ReactMethod
    public final void removeListeners(int count) {
    }

    @ReactMethod
    public final void terminate() {
        this.worker.terminate();
    }
}
