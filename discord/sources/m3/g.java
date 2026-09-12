package m3;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public final class g extends ls.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Rect f15400b;

    public /* synthetic */ g(int i7, Rect rect) {
        this.f15399a = i7;
        this.f15400b = rect;
    }

    @Override // ls.l
    public final Rect u() {
        switch (this.f15399a) {
            case 0:
                return this.f15400b;
            default:
                Rect rect = this.f15400b;
                if (rect.isEmpty()) {
                    return null;
                }
                return rect;
        }
    }
}
