package q9;

import com.facebook.common.references.CloseableReference;
import java.io.Closeable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Closeable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18640d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CloseableReference f18641e;

    public a(int i7, CloseableReference bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.f18640d = i7;
        this.f18641e = bitmap;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f18641e.close();
    }
}
