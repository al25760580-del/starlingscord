package mb;

import com.facebook.yoga.YogaConfig;
import com.facebook.yoga.YogaNative;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends YogaConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f15480a;

    public final void finalize() {
        long j = this.f15480a;
        if (j != 0) {
            this.f15480a = 0L;
            YogaNative.jni_YGConfigFreeJNI(j);
        }
    }
}
