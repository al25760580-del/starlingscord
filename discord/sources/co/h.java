package co;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public File[] f3763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3764d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f3765e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, File rootDir) {
        super(rootDir);
        Intrinsics.checkNotNullParameter(rootDir, "rootDir");
        this.f3765e = iVar;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0035  */
    /* JADX WARN: Code duplicated, block: B:22:0x0039  */
    /* JADX WARN: Code duplicated, block: B:29:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005c, code lost:
    
        if (r1.length == 0) goto L31;
     */
    @Override // co.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.File a() {
        /*
            r10 = this;
            co.i r0 = r10.f3765e
            co.k r0 = r0.f3767v
            boolean r1 = r10.f3762b
            r2 = 0
            java.io.File r3 = r10.f3768a
            if (r1 != 0) goto L20
            kotlin.jvm.functions.Function1 r0 = r0.f3771c
            if (r0 == 0) goto L1c
            java.lang.Object r0 = r0.invoke(r3)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L1c
            goto L65
        L1c:
            r0 = 1
            r10.f3762b = r0
            return r3
        L20:
            java.io.File[] r1 = r10.f3763c
            if (r1 == 0) goto L35
            int r4 = r10.f3764d
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            int r1 = r1.length
            if (r4 >= r1) goto L2d
            goto L35
        L2d:
            kotlin.jvm.functions.Function1 r0 = r0.f3772d
            if (r0 == 0) goto L65
            r0.invoke(r3)
            return r2
        L35:
            java.io.File[] r1 = r10.f3763c
            if (r1 != 0) goto L66
            java.io.File[] r1 = r3.listFiles()
            r10.f3763c = r1
            if (r1 != 0) goto L54
            kotlin.jvm.functions.Function2 r1 = r0.f3773e
            if (r1 == 0) goto L54
            co.a r4 = new co.a
            r8 = 2
            r9 = 0
            java.io.File r5 = r10.f3768a
            r6 = 0
            java.lang.String r7 = "Cannot list files in a directory"
            r4.<init>(r5, r6, r7, r8, r9)
            r1.invoke(r3, r4)
        L54:
            java.io.File[] r1 = r10.f3763c
            if (r1 == 0) goto L5e
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            int r1 = r1.length
            if (r1 != 0) goto L66
        L5e:
            kotlin.jvm.functions.Function1 r0 = r0.f3772d
            if (r0 == 0) goto L65
            r0.invoke(r3)
        L65:
            return r2
        L66:
            java.io.File[] r0 = r10.f3763c
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r1 = r10.f3764d
            int r2 = r1 + 1
            r10.f3764d = r2
            r0 = r0[r1]
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: co.h.a():java.io.File");
    }
}
