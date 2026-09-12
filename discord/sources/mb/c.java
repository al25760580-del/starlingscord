package mb;

import com.facebook.yoga.YogaNative;
import com.facebook.yoga.YogaNodeJNIBase;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends YogaNodeJNIBase {
    public final Object clone() {
        return super.clone();
    }

    public final void finalize() {
        long j = this.f5469x;
        if (j != 0) {
            this.f5469x = 0L;
            YogaNative.jni_YGNodeFinalizeJNI(j);
        }
    }
}
