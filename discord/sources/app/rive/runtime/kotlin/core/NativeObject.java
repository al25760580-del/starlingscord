package app.rive.runtime.kotlin.core;

import app.rive.runtime.kotlin.core.errors.RiveException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.collections.y;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import s0.g;
import xq.r;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b'\u0018\u0000 &2\u00020\u0001:\u0001&B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00100 H\u0002J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0003H\u0016J\b\u0010$\u001a\u00020\"H\u0002J\b\u0010%\u001a\u00020\u001eH\u0016R$\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0004R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lapp/rive/runtime/kotlin/core/NativeObject;", "Lapp/rive/runtime/kotlin/core/RefCount;", "initialPointer", "", "(J)V", "value", "cppPointer", "getCppPointer", "()J", "setCppPointer", "dependencies", "", "getDependencies", "()Ljava/util/List;", "disposeStackTrace", "Lkotlin/sequences/Sequence;", "Ljava/lang/StackTraceElement;", "hasCppObject", "", "getHasCppObject", "()Z", "refs", "Ljava/util/concurrent/atomic/AtomicInteger;", "getRefs", "()Ljava/util/concurrent/atomic/AtomicInteger;", "setRefs", "(Ljava/util/concurrent/atomic/AtomicInteger;)V", "unsafeCppPointer", "Ljava/util/concurrent/atomic/AtomicLong;", "acquire", "", "buildCombinedStackTrace", "", "cppDelete", "", "pointer", "dispose", "release", "Companion", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNativeObject.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeObject.kt\napp/rive/runtime/kotlin/core/NativeObject\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,158:1\n37#2,2:159\n1#3:161\n1863#4,2:162\n*S KotlinDebug\n*F\n+ 1 NativeObject.kt\napp/rive/runtime/kotlin/core/NativeObject\n*L\n55#1:159,2\n151#1:162,2\n*E\n"})
public abstract class NativeObject implements RefCount {
    public static final long NULL_POINTER = 0;

    @NotNull
    private final List<RefCount> dependencies;
    private Sequence<StackTraceElement> disposeStackTrace;

    @NotNull
    private AtomicInteger refs;

    @NotNull
    private final AtomicLong unsafeCppPointer;
    public static final int $stable = 8;

    public NativeObject(long j) {
        this.unsafeCppPointer = new AtomicLong(j);
        this.refs = new AtomicInteger(j == 0 ? 0 : 1);
        List<RefCount> listSynchronizedList = Collections.synchronizedList(new ArrayList());
        Intrinsics.checkNotNullExpressionValue(listSynchronizedList, "synchronizedList(...)");
        this.dependencies = listSynchronizedList;
    }

    private final List<StackTraceElement> buildCombinedStackTrace() {
        ArrayList arrayList = new ArrayList();
        Sequence<StackTraceElement> sequence = this.disposeStackTrace;
        if (sequence != null) {
            arrayList.add(new StackTraceElement("--- Stack Trace for NativeObject Dispose ---", "", null, -1));
            i0.p(arrayList, sequence);
            arrayList.add(new StackTraceElement("--- Current Stack Trace ---", "", null, -1));
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
        i0.p(arrayList, r.f(r.g(y.o(stackTrace), new Function1<StackTraceElement, Boolean>() { // from class: app.rive.runtime.kotlin.core.NativeObject.buildCombinedStackTrace.2
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(StackTraceElement stackTraceElement) {
                return Boolean.valueOf(!Intrinsics.areEqual(stackTraceElement.getClassName(), NativeObject.class.getName()));
            }
        }), 1));
        return arrayList;
    }

    private final synchronized void dispose() {
        try {
            if (this.refs.get() != 0) {
                throw new IllegalArgumentException("Cannot dispose an object with a non-zero reference count.");
            }
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
            this.disposeStackTrace = r.g(y.o(stackTrace), new Function1<StackTraceElement, Boolean>() { // from class: app.rive.runtime.kotlin.core.NativeObject.dispose.2
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(StackTraceElement stackTraceElement) {
                    return Boolean.valueOf(!Intrinsics.areEqual(stackTraceElement.getClassName(), NativeObject.class.getName()));
                }
            });
            List<RefCount> list = this.dependencies;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((RefCount) it.next()).release();
            }
            list.clear();
            cppDelete(this.unsafeCppPointer.get());
            this.unsafeCppPointer.set(0L);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // app.rive.runtime.kotlin.core.RefCount
    public synchronized int acquire() {
        int iAcquire;
        iAcquire = RefCount.DefaultImpls.acquire(this);
        if (iAcquire <= 1) {
            throw new IllegalArgumentException("Cannot acquire a disposed object.");
        }
        return iAcquire;
    }

    public void cppDelete(long pointer) {
    }

    public final long getCppPointer() throws RiveException {
        long j = this.unsafeCppPointer.get();
        if (j != 0) {
            return j;
        }
        RiveException riveException = new RiveException(g.e("Accessing disposed C++ object ", getClass().getSimpleName(), "."));
        riveException.setStackTrace((StackTraceElement[]) buildCombinedStackTrace().toArray(new StackTraceElement[0]));
        throw riveException;
    }

    @NotNull
    public final List<RefCount> getDependencies() {
        return this.dependencies;
    }

    public final boolean getHasCppObject() {
        return this.unsafeCppPointer.get() != 0;
    }

    @Override // app.rive.runtime.kotlin.core.RefCount
    public int getRefCount() {
        return RefCount.DefaultImpls.getRefCount(this);
    }

    @Override // app.rive.runtime.kotlin.core.RefCount
    @NotNull
    public final AtomicInteger getRefs() {
        return this.refs;
    }

    @Override // app.rive.runtime.kotlin.core.RefCount
    public synchronized int release() {
        int iRelease;
        iRelease = RefCount.DefaultImpls.release(this);
        if (iRelease < 0) {
            throw new IllegalArgumentException("Cannot release a disposed object.");
        }
        if (iRelease == 0 && getHasCppObject()) {
            dispose();
        }
        return iRelease;
    }

    public final void setCppPointer(long j) {
        this.unsafeCppPointer.set(j);
    }

    @Override // app.rive.runtime.kotlin.core.RefCount
    public final void setRefs(@NotNull AtomicInteger atomicInteger) {
        Intrinsics.checkNotNullParameter(atomicInteger, "<set-?>");
        this.refs = atomicInteger;
    }
}
