package x2;

/* JADX INFO: loaded from: classes.dex */
public final class d extends c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f22598f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f22599g;

    @Override // x2.c, androidx.metrics.performance.FrameData
    public final boolean equals(Object obj) {
        if (!(obj instanceof d) || !super.equals(obj)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f22598f == dVar.f22598f && this.f22599g == dVar.f22599g;
    }

    @Override // x2.c, androidx.metrics.performance.FrameData
    public final int hashCode() {
        return Long.hashCode(this.f22599g) + (Long.hashCode(this.f22598f) * 31) + (super.hashCode() * 31);
    }

    @Override // x2.c, androidx.metrics.performance.FrameData
    public final String toString() {
        return "FrameData(frameStartNanos=" + this.f2425b + ", frameDurationUiNanos=" + this.f2426c + ", frameDurationCpuNanos=" + this.f22597e + ", frameDurationTotalNanos=" + this.f22598f + ", frameOverrunNanos=" + this.f22599g + ", isJank=" + this.f2427d + ", states=" + this.f2424a + ')';
    }
}
