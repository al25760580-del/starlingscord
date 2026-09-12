package xq;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements Iterator, KMappedMarker {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f23035d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23036e = -2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e f23037i;

    public i(e eVar) {
        this.f23037i = eVar;
    }

    public final void a() {
        Object objInvoke;
        int i7 = this.f23036e;
        e eVar = this.f23037i;
        if (i7 == -2) {
            objInvoke = ((Function0) eVar.f23026b).invoke();
        } else {
            Function1 function1 = eVar.f23027c;
            Object obj = this.f23035d;
            Intrinsics.checkNotNull(obj);
            objInvoke = function1.invoke(obj);
        }
        this.f23035d = objInvoke;
        this.f23036e = objInvoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f23036e < 0) {
            a();
        }
        return this.f23036e == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f23036e < 0) {
            a();
        }
        if (this.f23036e == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f23035d;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
        this.f23036e = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
