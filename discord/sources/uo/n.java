package uo;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends vq.m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f21233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f21234c;

    public n(String str, Ref.ObjectRef objectRef) {
        this.f21233b = str;
        this.f21234c = objectRef;
    }

    /* JADX WARN: Type inference failed for: r3v10, types: [T, uo.l] */
    /* JADX WARN: Type inference failed for: r3v4, types: [T, uo.l] */
    /* JADX WARN: Type inference failed for: r3v5, types: [T, uo.l] */
    /* JADX WARN: Type inference failed for: r3v6, types: [T, uo.l] */
    @Override // vq.m
    public final boolean d(Object obj) {
        vo.f javaClassDescriptor = (vo.f) obj;
        Intrinsics.checkNotNullParameter(javaClassDescriptor, "javaClassDescriptor");
        String strI = c9.a.I(javaClassDescriptor, this.f21233b);
        boolean zContains = r.f21250b.contains(strI);
        Ref.ObjectRef objectRef = this.f21234c;
        if (zContains) {
            objectRef.element = l.f21227d;
        } else if (r.f21252d.contains(strI)) {
            objectRef.element = l.f21228e;
        } else if (r.f21251c.contains(strI)) {
            objectRef.element = l.f21229i;
        } else if (r.f21249a.contains(strI)) {
            objectRef.element = l.f21231w;
        }
        return objectRef.element == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vq.m
    public final Object k() {
        l lVar = (l) this.f21234c.element;
        return lVar == null ? l.f21230v : lVar;
    }
}
