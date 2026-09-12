package com.facebook.react.runtime;

import com.facebook.react.runtime.internal.bolts.Continuation;
import com.facebook.react.runtime.internal.bolts.Task;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r implements Continuation {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5329d;

    public /* synthetic */ r(int i7) {
        this.f5329d = i7;
    }

    @Override // com.facebook.react.runtime.internal.bolts.Continuation
    public final Object then(Task task) {
        switch (this.f5329d) {
            case 0:
                return ReactHostImpl.getOrCreateReactInstanceTask$lambda$45$lambda$44(task);
            default:
                return Task.makeVoid$lambda$7(task);
        }
    }
}
