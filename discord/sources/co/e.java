package co;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e extends j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(File rootDir) {
        super(rootDir);
        Intrinsics.checkNotNullParameter(rootDir, "rootDir");
    }
}
