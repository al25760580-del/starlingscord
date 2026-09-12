package na;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f extends a {
    public final void finalize() throws Throwable {
        if (isClosed()) {
            return;
        }
        o8.a.x("CloseableImage", "finalize: %s %x still open.", getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(this)));
        try {
            close();
        } finally {
            super.finalize();
        }
    }
}
