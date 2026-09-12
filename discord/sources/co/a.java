package co;

import ag.a1;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends a1 {
    /* JADX WARN: Illegal instructions before constructor call */
    public a(File file, File file2, String str, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        file2 = (i7 & 2) != 0 ? null : file2;
        str = (i7 & 4) != 0 ? null : str;
        Intrinsics.checkNotNullParameter(file, "file");
        super(str, file, file2);
    }
}
