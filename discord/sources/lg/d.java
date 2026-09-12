package lg;

import android.animation.TimeInterpolator;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f15078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f15079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TimeInterpolator f15080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15082e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.f15080c;
        return timeInterpolator != null ? timeInterpolator : a.f15072b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f15078a == dVar.f15078a && this.f15079b == dVar.f15079b && this.f15081d == dVar.f15081d && this.f15082e == dVar.f15082e) {
            return a().getClass().equals(dVar.a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f15078a;
        long j5 = this.f15079b;
        return ((((a().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j5 >>> 32) ^ j5))) * 31)) * 31) + this.f15081d) * 31) + this.f15082e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        sb2.append(d.class.getName());
        sb2.append('{');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" delay: ");
        sb2.append(this.f15078a);
        sb2.append(" duration: ");
        sb2.append(this.f15079b);
        sb2.append(" interpolator: ");
        sb2.append(a().getClass());
        sb2.append(" repeatCount: ");
        sb2.append(this.f15081d);
        sb2.append(" repeatMode: ");
        return kk.b.l(sb2, this.f15082e, "}\n");
    }
}
