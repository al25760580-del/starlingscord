package bn;

import com.swmansion.rnscreens.stack.views.ChildrenDrawingOrderStrategy;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements ChildrenDrawingOrderStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f3326a;

    public a() {
        this.f3326a = false;
    }

    @Override // com.swmansion.rnscreens.stack.views.ChildrenDrawingOrderStrategy
    public void disable() {
        this.f3326a = false;
    }

    @Override // com.swmansion.rnscreens.stack.views.ChildrenDrawingOrderStrategy
    public void enable() {
        this.f3326a = true;
    }

    public a(boolean z5) {
        this.f3326a = z5;
    }
}
