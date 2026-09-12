package f0;

import g0.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final int $stable = 8;
    private boolean isAttached;
    private k layoutCoordinates;

    public boolean getInterceptOutOfBoundsChildEvents() {
        return false;
    }

    public final k getLayoutCoordinates$ui_release() {
        return this.layoutCoordinates;
    }

    /* JADX INFO: renamed from: getSize-YbymL2g, reason: not valid java name */
    public final long m1244getSizeYbymL2g() {
        k kVar = this.layoutCoordinates;
        if (kVar != null) {
            return kVar.g();
        }
        return 0L;
    }

    public final boolean isAttached$ui_release() {
        return this.isAttached;
    }

    public abstract void onCancel();

    public final void setAttached$ui_release(boolean z5) {
        this.isAttached = z5;
    }

    public final void setLayoutCoordinates$ui_release(k kVar) {
        this.layoutCoordinates = kVar;
    }

    public static /* synthetic */ void getShareWithSiblings$annotations() {
    }
}
