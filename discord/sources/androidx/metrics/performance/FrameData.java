package androidx.metrics.performance;

import com.discord.chat.presentation.list.a;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class FrameData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f2424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f2425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f2426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2427d;

    public FrameData(List states) {
        Intrinsics.checkNotNullParameter(states, "states");
        this.f2424a = states;
        this.f2425b = 0L;
        this.f2426c = 0L;
        this.f2427d = false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.metrics.performance.FrameData");
        FrameData frameData = (FrameData) obj;
        return this.f2425b == frameData.f2425b && this.f2426c == frameData.f2426c && this.f2427d == frameData.f2427d && Intrinsics.areEqual(this.f2424a, frameData.f2424a);
    }

    public int hashCode() {
        return this.f2424a.hashCode() + a.g(a.h(this.f2426c, Long.hashCode(this.f2425b) * 31, 31), 31, this.f2427d);
    }

    public String toString() {
        return "FrameData(frameStartNanos=" + this.f2425b + ", frameDurationUiNanos=" + this.f2426c + ", isJank=" + this.f2427d + ", states=" + this.f2424a + ')';
    }
}
