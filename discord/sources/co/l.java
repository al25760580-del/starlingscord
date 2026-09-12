package co;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.e0;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public class l {
    public static final d a(File file) {
        int length;
        List list;
        int I;
        Intrinsics.checkNotNullParameter(file, "<this>");
        String path = file.getPath();
        Intrinsics.checkNotNull(path);
        char c8 = File.separatorChar;
        int I2 = StringsKt.I(path, c8, 0, 4);
        if (I2 == 0) {
            if (path.length() <= 1 || path.charAt(1) != c8 || (I = StringsKt.I(path, c8, 2, 4)) < 0) {
                length = 1;
            } else {
                int I3 = StringsKt.I(path, c8, I + 1, 4);
                length = I3 >= 0 ? I3 + 1 : path.length();
            }
        } else if (I2 <= 0 || path.charAt(I2 - 1) != ':') {
            length = (I2 == -1 && StringsKt.G(path, ':')) ? path.length() : 0;
        } else {
            length = I2 + 1;
        }
        String strSubstring = path.substring(0, length);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        String strSubstring2 = path.substring(length);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        if (strSubstring2.length() == 0) {
            list = n0.f14659d;
        } else {
            List listS = StringsKt.S(strSubstring2, new char[]{c8});
            ArrayList arrayList = new ArrayList(e0.l(listS, 10));
            Iterator it = listS.iterator();
            while (it.hasNext()) {
                arrayList.add(new File((String) it.next()));
            }
            list = arrayList;
        }
        return new d(new File(strSubstring), list);
    }
}
