package net.time4j.tz;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends SoftReference {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16722a;

    public g(i iVar, ReferenceQueue referenceQueue) {
        super(iVar, referenceQueue);
        this.f16722a = iVar.a().a();
    }
}
