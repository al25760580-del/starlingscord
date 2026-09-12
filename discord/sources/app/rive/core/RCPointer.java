package app.rive.core;

import a3.e;
import app.rive.RiveLog;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kk.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import s0.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\u0010\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u0005H\u0016J\u0018\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u0005H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lapp/rive/core/RCPointer;", "Lapp/rive/core/RefCounted;", "cppPointer", "", "label", "", "onDispose", "Lkotlin/Function1;", "", "(JLjava/lang/String;Lkotlin/jvm/functions/Function1;)V", "disposed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isDisposed", "", "()Z", "getLabel", "()Ljava/lang/String;", "pointer", "getPointer", "()J", "refCount", "", "getRefCount", "()I", "referenceCount", "Ljava/util/concurrent/atomic/AtomicInteger;", "acquire", "source", "release", "reason", "Companion", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRCPointer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RCPointer.kt\napp/rive/core/RCPointer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 RiveLog.kt\napp/rive/RiveLog\n*L\n1#1,120:1\n1#2:121\n53#3:122\n53#3:123\n57#3:124\n*S KotlinDebug\n*F\n+ 1 RCPointer.kt\napp/rive/core/RCPointer\n*L\n88#1:122\n106#1:123\n114#1:124\n*E\n"})
public final class RCPointer implements RefCounted {

    @NotNull
    private static final String TAG = "Rive/RCPointer";
    private final long cppPointer;

    @NotNull
    private AtomicBoolean disposed;

    @NotNull
    private final String label;

    @NotNull
    private final Function1<Long, Unit> onDispose;

    @NotNull
    private AtomicInteger referenceCount;
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public RCPointer(long j, @NotNull String label, @NotNull Function1<? super Long, Unit> onDispose) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(onDispose, "onDispose");
        this.cppPointer = j;
        this.label = label;
        this.onDispose = onDispose;
        this.referenceCount = new AtomicInteger(1);
        this.disposed = new AtomicBoolean(false);
    }

    @Override // app.rive.core.RefCounted
    public void acquire(@NotNull final String source) {
        final int i7;
        Intrinsics.checkNotNullParameter(source, "source");
        do {
            i7 = this.referenceCount.get();
            if (i7 <= 0) {
                throw new IllegalStateException(g.e("Attempting to acquire a null RCPointer (", this.label, ").").toString());
            }
        } while (!this.referenceCount.compareAndSet(i7, i7 + 1));
        RiveLog.INSTANCE.getLogger().v(TAG, new Function0<String>() { // from class: app.rive.core.RCPointer.acquire.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                String label = RCPointer.this.getLabel();
                String str = source;
                return b.l(e.u("Acquiring ", label, " (source: ", str, "; ref count before acquire: "), i7, ")");
            }
        });
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    public final long getPointer() {
        if (this.referenceCount.get() > 0) {
            return this.cppPointer;
        }
        throw new IllegalStateException(g.e("Attempting to access a disposed RCPointer (", this.label, ")").toString());
    }

    @Override // app.rive.core.RefCounted
    public int getRefCount() {
        return this.referenceCount.get();
    }

    @Override // app.rive.core.RefCounted
    public boolean isDisposed() {
        return this.disposed.get();
    }

    @Override // app.rive.core.RefCounted
    public void release(@NotNull final String source, @NotNull String reason) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(reason, "reason");
        final String strL = reason.length() == 0 ? "" : e.l("; reason: ", reason);
        Function0<String> function0 = new Function0<String>() { // from class: app.rive.core.RCPointer.release.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                String label = RCPointer.this.getLabel();
                String str = source;
                String str2 = strL;
                int i7 = RCPointer.this.referenceCount.get();
                StringBuilder sbU = e.u("Releasing ", label, " (source: ", str, str2);
                sbU.append("; ref count before release: ");
                sbU.append(i7);
                sbU.append(")");
                return sbU.toString();
            }
        };
        RiveLog riveLog = RiveLog.INSTANCE;
        riveLog.getLogger().v(TAG, function0);
        int iDecrementAndGet = this.referenceCount.decrementAndGet();
        if (iDecrementAndGet < 0) {
            StringBuilder sbU = e.u("RCPointer ", this.label, " (source: ", source, strL);
            sbU.append(") released too many times.");
            throw new IllegalStateException(sbU.toString().toString());
        }
        if (iDecrementAndGet == 0) {
            riveLog.getLogger().d(TAG, new Function0<String>() { // from class: app.rive.core.RCPointer.release.3
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return e.l("Disposing ", RCPointer.this.getLabel());
                }
            });
            this.onDispose.invoke(Long.valueOf(this.cppPointer));
            this.disposed.set(true);
        }
    }
}
