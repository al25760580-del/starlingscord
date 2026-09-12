package q8;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements k1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hs.c f18629a = new hs.c(5);

    @Override // k1.b
    public final Object acquire() {
        return (ByteBuffer) f18629a.get();
    }

    @Override // k1.b
    public final /* bridge */ /* synthetic */ boolean release(Object obj) {
        return true;
    }
}
