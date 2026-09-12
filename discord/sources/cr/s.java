package cr;

import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends xn.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ProducerScope f7390d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Function0 f7391e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f7392i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f7393v;

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        this.f7392i = obj;
        this.f7393v |= Integer.MIN_VALUE;
        return mf.f.c(null, null, this);
    }
}
