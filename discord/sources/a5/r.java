package a5;

import com.facebook.react.bridge.Promise;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements Callable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f254e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f255i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f256v;

    public /* synthetic */ r(Object obj, Object obj2, Object obj3, int i7) {
        this.f253d = i7;
        this.f254e = obj;
        this.f255i = obj2;
        this.f256v = obj3;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x02d5 */
    /* JADX WARN: Bottom block not found for handler: all -> 0x057f */
    /* JADX WARN: Code duplicated, block: B:102:0x0296  */
    /* JADX WARN: Code duplicated, block: B:103:0x029e  */
    /* JADX WARN: Code duplicated, block: B:107:0x02c5 A[LOOP:0: B:38:0x011d->B:107:0x02c5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:122:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:123:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:306:0x020b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:307:0x02bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:310:0x027b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0213  */
    /* JADX WARN: Code duplicated, block: B:93:0x022f  */
    /* JADX WARN: Code duplicated, block: B:97:0x0273  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object call() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a5.r.call():java.lang.Object");
    }

    public r(b bVar, com.discord.billing.b bVar2, String str) {
        this.f253d = 3;
        this.f256v = bVar2;
        this.f255i = str;
        Objects.requireNonNull(bVar);
        this.f254e = bVar;
    }

    public r(String str, il.e eVar, Promise promise) {
        this.f253d = 5;
        this.f255i = str;
        this.f254e = eVar;
        this.f256v = promise;
    }
}
