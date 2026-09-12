package androidx.core.view;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public final class NestedScrollingChildHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewParent f1596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewParent f1597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewGroup f1598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1599d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f1600e;

    public NestedScrollingChildHelper(ViewGroup viewGroup) {
        this.f1598c = viewGroup;
    }

    public final boolean a(float f2, float f7, boolean z5) {
        ViewParent viewParentE;
        if (this.f1599d && (viewParentE = e(0)) != null) {
            try {
                return viewParentE.onNestedFling(this.f1598c, f2, f7, z5);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedFling", e10);
            }
        }
        return false;
    }

    public final boolean b(float f2, float f7) {
        ViewParent viewParentE;
        if (this.f1599d && (viewParentE = e(0)) != null) {
            try {
                return viewParentE.onNestedPreFling(this.f1598c, f2, f7);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedPreFling", e10);
            }
        }
        return false;
    }

    public final boolean c(int i7, int i10, int[] iArr, int[] iArr2, int i11) {
        ViewParent viewParentE;
        int i12;
        int i13;
        if (!this.f1599d || (viewParentE = e(i11)) == null) {
            return false;
        }
        if (i7 == 0 && i10 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.f1598c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i12 = iArr2[0];
            i13 = iArr2[1];
        } else {
            i12 = 0;
            i13 = 0;
        }
        if (iArr == null) {
            if (this.f1600e == null) {
                this.f1600e = new int[2];
            }
            iArr = this.f1600e;
        }
        int[] iArr3 = iArr;
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (viewParentE instanceof r) {
            ((r) viewParentE).onNestedPreScroll(viewGroup, i7, i10, iArr3, i11);
        } else if (i11 == 0) {
            try {
                viewParentE.onNestedPreScroll(viewGroup, i7, i10, iArr3);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedPreScroll", e10);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i12;
            iArr2[1] = iArr2[1] - i13;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public final boolean d(int i7, int i10, int i11, int i12, int[] iArr, int i13, int[] iArr2) {
        ViewParent viewParentE;
        int i14;
        int i15;
        int[] iArr3;
        if (this.f1599d && (viewParentE = e(i13)) != null) {
            if (i7 != 0 || i10 != 0 || i11 != 0 || i12 != 0) {
                ViewGroup viewGroup = this.f1598c;
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    i14 = iArr[0];
                    i15 = iArr[1];
                } else {
                    i14 = 0;
                    i15 = 0;
                }
                if (iArr2 == null) {
                    if (this.f1600e == null) {
                        this.f1600e = new int[2];
                    }
                    int[] iArr4 = this.f1600e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (viewParentE instanceof s) {
                    ((s) viewParentE).onNestedScroll(viewGroup, i7, i10, i11, i12, i13, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i11;
                    iArr3[1] = iArr3[1] + i12;
                    if (viewParentE instanceof r) {
                        ((r) viewParentE).onNestedScroll(viewGroup, i7, i10, i11, i12, i13);
                    } else if (i13 == 0) {
                        try {
                            viewParentE.onNestedScroll(viewGroup, i7, i10, i11, i12);
                        } catch (AbstractMethodError e10) {
                            Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedScroll", e10);
                        }
                    }
                }
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i14;
                    iArr[1] = iArr[1] - i15;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    public final ViewParent e(int i7) {
        if (i7 == 0) {
            return this.f1596a;
        }
        if (i7 != 1) {
            return null;
        }
        return this.f1597b;
    }

    public final boolean f(int i7) {
        return e(i7) != null;
    }

    public final boolean g(int i7, int i10) {
        boolean zOnStartNestedScroll;
        if (!f(i10)) {
            if (this.f1599d) {
                View view = this.f1598c;
                View view2 = view;
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z5 = parent instanceof r;
                    if (z5) {
                        zOnStartNestedScroll = ((r) parent).onStartNestedScroll(view2, view, i7, i10);
                    } else if (i10 == 0) {
                        try {
                            zOnStartNestedScroll = parent.onStartNestedScroll(view2, view, i7);
                        } catch (AbstractMethodError e10) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e10);
                            zOnStartNestedScroll = false;
                        }
                    } else {
                        zOnStartNestedScroll = false;
                    }
                    if (zOnStartNestedScroll) {
                        if (i10 == 0) {
                            this.f1596a = parent;
                        } else if (i10 == 1) {
                            this.f1597b = parent;
                        }
                        if (z5) {
                            ((r) parent).onNestedScrollAccepted(view2, view, i7, i10);
                        } else if (i10 == 0) {
                            try {
                                parent.onNestedScrollAccepted(view2, view, i7);
                            } catch (AbstractMethodError e11) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e11);
                            }
                        }
                    } else {
                        if (parent instanceof View) {
                            view2 = (View) parent;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void h(int i7) {
        ViewParent viewParentE = e(i7);
        if (viewParentE != null) {
            boolean z5 = viewParentE instanceof r;
            ViewGroup viewGroup = this.f1598c;
            if (z5) {
                ((r) viewParentE).onStopNestedScroll(viewGroup, i7);
            } else if (i7 == 0) {
                try {
                    viewParentE.onStopNestedScroll(viewGroup);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onStopNestedScroll", e10);
                }
            }
            if (i7 == 0) {
                this.f1596a = null;
            } else {
                if (i7 != 1) {
                    return;
                }
                this.f1597b = null;
            }
        }
    }
}
