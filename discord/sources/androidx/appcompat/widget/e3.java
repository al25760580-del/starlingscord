package androidx.appcompat.widget;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class e3 extends TouchDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f936d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f937e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f938f;

    public e3(View view, Rect rect, Rect rect2) {
        super(rect, view);
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f937e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f934b = rect3;
        Rect rect4 = new Rect();
        this.f936d = rect4;
        Rect rect5 = new Rect();
        this.f935c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i7 = -scaledTouchSlop;
        rect4.inset(i7, i7);
        rect5.set(rect2);
        this.f933a = view;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003e  */
    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z5;
        boolean z6;
        int x5 = (int) motionEvent.getX();
        int y5 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z7 = true;
        if (action != 0) {
            if (action == 1 || action == 2) {
                z6 = this.f938f;
                if (z6 && !this.f936d.contains(x5, y5)) {
                    z7 = z6;
                    z5 = false;
                }
            } else if (action != 3) {
                z5 = true;
                z7 = false;
            } else {
                z6 = this.f938f;
                this.f938f = false;
            }
            z7 = z6;
            z5 = true;
        } else if (this.f934b.contains(x5, y5)) {
            this.f938f = true;
            z5 = true;
        } else {
            z5 = true;
            z7 = false;
        }
        if (!z7) {
            return false;
        }
        Rect rect = this.f935c;
        View view = this.f933a;
        if (!z5 || rect.contains(x5, y5)) {
            motionEvent.setLocation(x5 - rect.left, y5 - rect.top);
        } else {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
