package s4;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f19764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PointF f19765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f19766c;

    public k(PointF pointF, boolean z5, List list) {
        this.f19765b = pointF;
        this.f19766c = z5;
        this.f19764a = new ArrayList(list);
    }

    public final void a(float f2, float f7) {
        if (this.f19765b == null) {
            this.f19765b = new PointF();
        }
        this.f19765b.set(f2, f7);
    }

    public final String toString() {
        return "ShapeData{numCurves=" + this.f19764a.size() + "closed=" + this.f19766c + '}';
    }

    public k() {
        this.f19764a = new ArrayList();
    }
}
