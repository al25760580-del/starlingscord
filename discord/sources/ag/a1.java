package ag;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class a1 extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    public a1(long j, long j5, int i7, IndexOutOfBoundsException indexOutOfBoundsException) {
        Locale locale = Locale.US;
        StringBuilder sbM = kk.b.m(j, "Pos: ", ", limit: ");
        sbM.append(j5);
        sbM.append(", len: ");
        sbM.append(i7);
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sbM.toString()), indexOutOfBoundsException);
    }

    public a1(String str, File file, File file2) {
        Intrinsics.checkNotNullParameter(file, "file");
        StringBuilder sb2 = new StringBuilder(file.toString());
        if (file2 != null) {
            sb2.append(" -> " + file2);
        }
        if (str != null) {
            sb2.append(": ".concat(str));
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        super(string);
    }
}
