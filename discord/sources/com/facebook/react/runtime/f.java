package com.facebook.react.runtime;

import com.facebook.react.runtime.internal.bolts.Continuation;
import com.facebook.react.runtime.internal.bolts.Task;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements Continuation {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function2 f5283e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ReactHostImpl f5284i;

    public /* synthetic */ f(Function2 function2, ReactHostImpl reactHostImpl, int i7) {
        this.f5282d = i7;
        this.f5283e = function2;
        this.f5284i = reactHostImpl;
    }

    @Override // com.facebook.react.runtime.internal.bolts.Continuation
    public final Object then(Task task) {
        switch (this.f5282d) {
            case 0:
                return ReactHostImpl.getOrCreateReloadTask$lambda$53(this.f5283e, this.f5284i, "getOrCreateReloadTask()", task);
            case 1:
                return ReactHostImpl.getOrCreateReloadTask$lambda$55(this.f5283e, this.f5284i, "getOrCreateReloadTask()", task);
            case 2:
                return ReactHostImpl.getOrCreateReloadTask$lambda$56(this.f5283e, this.f5284i, "getOrCreateReloadTask()", task);
            case 3:
                return ReactHostImpl.getOrCreateReloadTask$lambda$57(this.f5283e, this.f5284i, "getOrCreateReloadTask()", task);
            case 4:
                return ReactHostImpl.getOrCreateDestroyTask$lambda$63(this.f5283e, this.f5284i, "getOrCreateDestroyTask()", task);
            default:
                return ReactHostImpl.getOrCreateDestroyTask$lambda$65(this.f5283e, this.f5284i, "getOrCreateDestroyTask()", task);
        }
    }
}
