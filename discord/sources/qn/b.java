package qn;

import co.o;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f18924a;

    public b(File destination) {
        Intrinsics.checkParameterIsNotNull(destination, "destination");
        this.f18924a = destination;
    }

    @Override // qn.a
    public final boolean isSatisfied(File imageFile) {
        Intrinsics.checkParameterIsNotNull(imageFile, "imageFile");
        return Intrinsics.areEqual(imageFile.getAbsolutePath(), this.f18924a.getAbsolutePath());
    }

    @Override // qn.a
    public final File satisfy(File imageFile) {
        Intrinsics.checkParameterIsNotNull(imageFile, "imageFile");
        File file = this.f18924a;
        o.f(imageFile, file);
        return file;
    }
}
