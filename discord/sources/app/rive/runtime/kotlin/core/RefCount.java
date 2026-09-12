package app.rive.runtime.kotlin.core;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\b\u0010\f\u001a\u00020\u0003H\u0017J\b\u0010\r\u001a\u00020\u0003H\u0017R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\u00020\u0007X¦\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lapp/rive/runtime/kotlin/core/RefCount;", "", "refCount", "", "getRefCount", "()I", "refs", "Ljava/util/concurrent/atomic/AtomicInteger;", "getRefs", "()Ljava/util/concurrent/atomic/AtomicInteger;", "setRefs", "(Ljava/util/concurrent/atomic/AtomicInteger;)V", "acquire", "release", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface RefCount {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static int acquire(@NotNull RefCount refCount) {
            return refCount.getRefs().incrementAndGet();
        }

        public static int getRefCount(@NotNull RefCount refCount) {
            return refCount.getRefs().get();
        }

        public static int release(@NotNull RefCount refCount) {
            return refCount.getRefs().decrementAndGet();
        }
    }

    int acquire();

    int getRefCount();

    @NotNull
    AtomicInteger getRefs();

    int release();

    void setRefs(@NotNull AtomicInteger atomicInteger);
}
