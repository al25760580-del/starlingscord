package com.facebook.react.runtime;

import com.facebook.react.runtime.internal.bolts.Continuation;
import com.facebook.react.runtime.internal.bolts.Task;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements Continuation {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5278d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ReactHostImpl f5279e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Function2 f5280i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f5281v;

    public /* synthetic */ e(ReactHostImpl reactHostImpl, Function2 function2, String str, int i7) {
        this.f5278d = i7;
        this.f5279e = reactHostImpl;
        this.f5280i = function2;
        this.f5281v = str;
    }

    @Override // com.facebook.react.runtime.internal.bolts.Continuation
    public final Object then(Task task) {
        switch (this.f5278d) {
            case 0:
                return ReactHostImpl.getOrCreateReloadTask$lambda$52(this.f5279e, "getOrCreateReloadTask()", this.f5280i, this.f5281v, task);
            case 1:
                return ReactHostImpl.getOrCreateDestroyTask$lambda$61(this.f5279e, "getOrCreateDestroyTask()", this.f5280i, this.f5281v, task);
            default:
                return ReactHostImpl.getOrCreateDestroyTask$lambda$64(this.f5280i, this.f5279e, "getOrCreateDestroyTask()", this.f5281v, task);
        }
    }

    public /* synthetic */ e(Function2 function2, ReactHostImpl reactHostImpl, String str) {
        this.f5278d = 2;
        this.f5280i = function2;
        this.f5279e = reactHostImpl;
        this.f5281v = str;
    }
}
