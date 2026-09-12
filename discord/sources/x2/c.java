package x2;

import androidx.metrics.performance.FrameData;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class c extends FrameData {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f22597e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ArrayList states) {
        super(states);
        Intrinsics.checkNotNullParameter(states, "states");
        this.f22597e = 0L;
    }

    @Override // androidx.metrics.performance.FrameData
    public boolean equals(Object obj) {
        return (obj instanceof c) && super.equals(obj) && this.f22597e == ((c) obj).f22597e;
    }

    @Override // androidx.metrics.performance.FrameData
    public int hashCode() {
        return Long.hashCode(this.f22597e) + (super.hashCode() * 31);
    }

    @Override // androidx.metrics.performance.FrameData
    public String toString() {
        return "FrameData(frameStartNanos=" + this.f2425b + ", frameDurationUiNanos=" + this.f2426c + ", frameDurationCpuNanos=" + this.f22597e + ", isJank=" + this.f2427d + ", states=" + this.f2424a + ')';
    }
}
