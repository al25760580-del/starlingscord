package e9;

import java.util.concurrent.ArrayBlockingQueue;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f8121b = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f8122c = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayBlockingQueue f8123a = new ArrayBlockingQueue(20);

    public final void a(c cVar) {
        if (!f8122c) {
            return;
        }
        int i7 = 5;
        while (true) {
            ArrayBlockingQueue arrayBlockingQueue = this.f8123a;
            if (arrayBlockingQueue.offer(cVar) || i7 <= 0) {
                return;
            }
            arrayBlockingQueue.poll();
            i7--;
        }
    }

    public final String toString() {
        return this.f8123a.toString();
    }
}
