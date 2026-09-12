package yg;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements View.OnTouchListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Dialog f23335d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f23336e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f23337i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f23338v;

    public a(Dialog dialog, Rect rect) {
        this.f23335d = dialog;
        this.f23336e = rect.left;
        this.f23337i = rect.top;
        this.f23338v = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = viewFindViewById.getLeft() + this.f23336e;
        int width = viewFindViewById.getWidth() + left;
        int top = viewFindViewById.getTop() + this.f23337i;
        if (new RectF(left, top, width, viewFindViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            int i7 = this.f23338v;
            motionEventObtain.setLocation((-i7) - 1, (-i7) - 1);
        }
        view.performClick();
        return this.f23335d.onTouchEvent(motionEventObtain);
    }
}
