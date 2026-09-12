package fr;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a5.h f9364a = new a5.h("CLOSED", 2);

    public static final Object a(u uVar, long j, Function2 function2) {
        while (true) {
            if (uVar.f9398i >= j && !uVar.d()) {
                return uVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f9365d;
            Object obj = atomicReferenceFieldUpdater.get(uVar);
            a5.h hVar = f9364a;
            if (obj == hVar) {
                return hVar;
            }
            u uVar2 = (u) ((c) obj);
            if (uVar2 == null) {
                uVar2 = (u) function2.invoke(Long.valueOf(uVar.f9398i + 1), uVar);
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(uVar, null, uVar2)) {
                        if (uVar.d()) {
                            uVar.e();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(uVar) == null);
            }
            uVar = uVar2;
        }
    }
}
