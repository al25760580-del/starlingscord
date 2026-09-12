package m3;

import android.view.View;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f15373b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f15372a = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f15374c = new ArrayList();

    public b0(View view) {
        this.f15373b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.f15373b == b0Var.f15373b && this.f15372a.equals(b0Var.f15372a);
    }

    public final int hashCode() {
        return this.f15372a.hashCode() + (this.f15373b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbO = kk.b.o("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        sbO.append(this.f15373b);
        sbO.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        String strJ = kk.b.j(sbO.toString(), "    values:");
        HashMap map = this.f15372a;
        for (String str : map.keySet()) {
            strJ = strJ + "    " + str + ": " + map.get(str) + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE;
        }
        return strJ;
    }
}
