package com.discord.browser_manager;

import ar.b0;
import ar.v0;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.runtime.ReactHostImpl;
import com.facebook.react.runtime.internal.bolts.Task;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.Job;
import mq.t;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Function2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Serializable f3996e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f3997i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f3998v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f3999w;

    public /* synthetic */ b(Object obj, Serializable serializable, Object obj2, Object obj3, int i7) {
        this.f3995d = i7;
        this.f3997i = obj;
        this.f3996e = serializable;
        this.f3998v = obj2;
        this.f3999w = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v6, types: [T, ar.p1] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3995d) {
            case 0:
                return BrowserManager.openPlayStoreInline$lambda$4((ReactApplicationContext) this.f3997i, (String) this.f3996e, (Function1) this.f3998v, (Function1) this.f3999w, (Unit) obj, (Throwable) obj2);
            case 1:
                return ReactHostImpl.createReactInstanceUnwrapper$lambda$50((ReactHostImpl) this.f3997i, (String) this.f3996e, (String) this.f3998v, (String) this.f3999w, (Task) obj, (String) obj2);
            default:
                Ref.ObjectRef objectRef = (Ref.ObjectRef) this.f3997i;
                Ref.ObjectRef objectRef2 = (Ref.ObjectRef) this.f3996e;
                Ref.ObjectRef objectRef3 = (Ref.ObjectRef) this.f3998v;
                t tVar = (t) this.f3999w;
                objectRef.element = obj;
                objectRef2.element = obj2;
                Job job = (Job) objectRef3.element;
                if (job == null || job.isCompleted()) {
                    objectRef3.element = b0.t(v0.f2972d, null, new pb.c(tVar, objectRef, objectRef2, null), 3);
                }
                return Unit.f14616a;
        }
    }
}
