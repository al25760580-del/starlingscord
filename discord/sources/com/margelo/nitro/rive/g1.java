package com.margelo.nitro.rive;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class g1 implements Flow {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6940d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Flow f6941e;

    public /* synthetic */ g1(dr.b0 b0Var, int i7) {
        this.f6940d = i7;
        this.f6941e = b0Var;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f6940d) {
            case 0:
                Object objCollect = this.f6941e.collect(new f1(flowCollector, 0), continuation);
                return objCollect == wn.a.f22354d ? objCollect : Unit.f14616a;
            case 1:
                Object objCollect2 = this.f6941e.collect(new f1(flowCollector, 1), continuation);
                return objCollect2 == wn.a.f22354d ? objCollect2 : Unit.f14616a;
            default:
                Object objCollect3 = this.f6941e.collect(new f1(flowCollector, 2), continuation);
                return objCollect3 == wn.a.f22354d ? objCollect3 : Unit.f14616a;
        }
    }
}
