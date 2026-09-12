package j2;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class d extends sa.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f13624g;

    public /* synthetic */ d(int i7) {
        this.f13624g = i7;
    }

    @Override // sa.a
    public final void I(Object obj, float f2) {
        switch (this.f13624g) {
            case 0:
                ((View) obj).setY(f2);
                break;
            case 1:
                ((View) obj).setAlpha(f2);
                break;
            case 2:
                ((View) obj).setScaleX(f2);
                break;
            case 3:
                ((View) obj).setScaleY(f2);
                break;
            case 4:
                ((View) obj).setRotation(f2);
                break;
            case 5:
                ((View) obj).setRotationX(f2);
                break;
            case 6:
                ((View) obj).setRotationY(f2);
                break;
            default:
                ((View) obj).setX(f2);
                break;
        }
    }

    @Override // sa.a
    public final float q(Object obj) {
        switch (this.f13624g) {
            case 0:
                return ((View) obj).getY();
            case 1:
                return ((View) obj).getAlpha();
            case 2:
                return ((View) obj).getScaleX();
            case 3:
                return ((View) obj).getScaleY();
            case 4:
                return ((View) obj).getRotation();
            case 5:
                return ((View) obj).getRotationX();
            case 6:
                return ((View) obj).getRotationY();
            default:
                return ((View) obj).getX();
        }
    }
}
