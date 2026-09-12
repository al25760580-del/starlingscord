package yr;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f23540a;

    public g0(String[] strArr) {
        this.f23540a = Collections.unmodifiableList(Arrays.asList(strArr));
    }

    public final String toString() {
        List list = this.f23540a;
        int size = list.size();
        StringBuilder sb2 = new StringBuilder((size * 16) + 2);
        sb2.append('{');
        boolean z5 = true;
        for (int i7 = 0; i7 < size; i7++) {
            if (z5) {
                z5 = false;
            } else {
                sb2.append(',');
            }
            sb2.append((String) list.get(i7));
        }
        sb2.append('}');
        return sb2.toString();
    }
}
