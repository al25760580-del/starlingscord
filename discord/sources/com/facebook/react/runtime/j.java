package com.facebook.react.runtime;

import com.facebook.react.runtime.internal.bolts.Continuation;
import com.facebook.react.runtime.internal.bolts.Task;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements Continuation {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5306d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5307e;

    public /* synthetic */ j(int i7, Object obj) {
        this.f5306d = i7;
        this.f5307e = obj;
    }

    @Override // com.facebook.react.runtime.internal.bolts.Continuation
    public final Object then(Task task) {
        switch (this.f5306d) {
            case 0:
                return ReactHostImpl.destroy$lambda$10((Function1) this.f5307e, task);
            default:
                return ReactHostImpl.getOrCreateStartTask$lambda$30$lambda$29((Exception) this.f5307e, task);
        }
    }
}
