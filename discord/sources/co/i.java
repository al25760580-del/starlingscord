package co;

import java.io.File;
import java.util.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends kotlin.collections.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayDeque f3766i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ k f3767v;

    public i(k kVar) {
        this.f3767v = kVar;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f3766i = arrayDeque;
        File rootFile = kVar.f3769a;
        if (rootFile.isDirectory()) {
            arrayDeque.push(b(rootFile));
        } else if (!rootFile.isFile()) {
            this.f14631d = 2;
        } else {
            Intrinsics.checkNotNullParameter(rootFile, "rootFile");
            arrayDeque.push(new g(rootFile));
        }
    }

    @Override // kotlin.collections.c
    public final void a() {
        File file;
        while (true) {
            ArrayDeque arrayDeque = this.f3766i;
            j jVar = (j) arrayDeque.peek();
            if (jVar == null) {
                file = null;
                break;
            }
            File fileA = jVar.a();
            if (fileA == null) {
                arrayDeque.pop();
            } else {
                if (Intrinsics.areEqual(fileA, jVar.f3768a) || !fileA.isDirectory() || arrayDeque.size() >= this.f3767v.f3774f) {
                    file = fileA;
                    break;
                }
                arrayDeque.push(b(fileA));
            }
        }
        if (file == null) {
            this.f14631d = 2;
        } else {
            this.f14632e = file;
            this.f14631d = 1;
        }
    }

    public final e b(File file) {
        int iOrdinal = this.f3767v.f3770b.ordinal();
        if (iOrdinal == 0) {
            return new h(this, file);
        }
        if (iOrdinal == 1) {
            return new f(this, file);
        }
        throw new rn.n();
    }
}
