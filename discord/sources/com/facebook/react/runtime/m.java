package com.facebook.react.runtime;

import com.facebook.react.runtime.internal.bolts.Continuation;
import com.facebook.react.runtime.internal.bolts.Task;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m implements Continuation {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ReactHostImpl f5315e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f5316i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f5317v;

    public /* synthetic */ m(ReactHostImpl reactHostImpl, String str, Object obj, int i7) {
        this.f5314d = i7;
        this.f5315e = reactHostImpl;
        this.f5316i = str;
        this.f5317v = obj;
    }

    @Override // com.facebook.react.runtime.internal.bolts.Continuation
    public final Object then(Task task) {
        switch (this.f5314d) {
            case 0:
                return ReactHostImpl.callWithExistingReactInstance$lambda$32(this.f5315e, this.f5316i, (Function1) this.f5317v, task);
            case 1:
                return ReactHostImpl.callAfterGetOrCreateReactInstance$lambda$33(this.f5315e, this.f5316i, (Function1) this.f5317v, task);
            default:
                return ReactHostImpl.destroy$lambda$12$lambda$11(this.f5315e, this.f5316i, (Exception) this.f5317v, task);
        }
    }
}
