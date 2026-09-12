package ie;

import android.os.ConditionVariable;
import com.google.android.exoplayer2.upstream.cache.SimpleCache;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends Thread {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ConditionVariable f11760d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ SimpleCache f11761e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(SimpleCache simpleCache, ConditionVariable conditionVariable) {
        super("ExoPlayer:SimpleCacheInit");
        this.f11761e = simpleCache;
        this.f11760d = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        synchronized (this.f11761e) {
            this.f11760d.open();
            SimpleCache.a(this.f11761e);
            this.f11761e.f5840b.getClass();
        }
    }
}
