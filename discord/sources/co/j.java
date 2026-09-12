package co;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f3768a;

    public j(File root) {
        Intrinsics.checkNotNullParameter(root, "root");
        this.f3768a = root;
    }

    public abstract File a();
}
