package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.discord.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public class t1 extends ListView {
    public boolean E;
    public final boolean F;
    public boolean G;
    public androidx.core.widget.d H;
    public a3.h I;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f1113d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1114e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1115i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f1116v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f1117w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f1118x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public r1 f1119y;

    public t1(Context context, boolean z5) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f1113d = new Rect();
        this.f1114e = 0;
        this.f1115i = 0;
        this.f1116v = 0;
        this.f1117w = 0;
        this.F = z5;
        setCacheColorHint(0);
    }

    public final int a(int i7, int i10) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i11 = 0;
        View view = null;
        for (int i12 = 0; i12 < count; i12++) {
            int itemViewType = adapter.getItemViewType(i12);
            if (itemViewType != i11) {
                view = null;
                i11 = itemViewType;
            }
            view = adapter.getView(i12, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i13 = layoutParams.height;
            view.measure(i7, i13 > 0 ? View.MeasureSpec.makeMeasureSpec(i13, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i12 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i10) {
                return i10;
            }
        }
        return measuredHeight;
    }

    /* JADX WARN: Code duplicated, block: B:82:0x014c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0162  */
    /* JADX WARN: Code duplicated, block: B:86:0x0167  */
    /* JADX WARN: Code duplicated, block: B:88:0x016b  */
    /* JADX WARN: Code duplicated, block: B:90:0x017d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0181  */
    /* JADX WARN: Code duplicated, block: B:94:0x0185  */
    /* JADX WARN: Code duplicated, block: B:9:0x0015  */
    public final boolean b(MotionEvent motionEvent, int i7) {
        boolean z5;
        boolean zA;
        View childAt;
        View childAt2;
        androidx.core.widget.d dVar;
        int actionMasked = motionEvent.getActionMasked();
        boolean z6 = false;
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                z5 = true;
            } else if (actionMasked != 3) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5 || z6) {
                this.G = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.f1118x - getFirstVisiblePosition());
                if (childAt2 != null) {
                    childAt2.setPressed(false);
                }
            }
            if (z5) {
                if (this.H == null) {
                    this.H = new androidx.core.widget.d(this);
                }
                androidx.core.widget.d dVar2 = this.H;
                boolean z7 = dVar2.M;
                dVar2.M = true;
                dVar2.onTouch(this, motionEvent);
            } else {
                dVar = this.H;
                if (dVar != null) {
                    if (dVar.M) {
                        dVar.d();
                    }
                    dVar.M = false;
                }
            }
            return z5;
        }
        z5 = false;
        int iFindPointerIndex = motionEvent.findPointerIndex(i7);
        if (iFindPointerIndex < 0) {
            z5 = false;
        } else {
            int x5 = (int) motionEvent.getX(iFindPointerIndex);
            int y5 = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x5, y5);
            if (iPointToPosition == -1) {
                z6 = true;
            } else {
                View childAt3 = getChildAt(iPointToPosition - getFirstVisiblePosition());
                float f2 = x5;
                float f7 = y5;
                this.G = true;
                int i10 = Build.VERSION.SDK_INT;
                o1.a(this, f2, f7);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i11 = this.f1118x;
                if (i11 != -1 && (childAt = getChildAt(i11 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f1118x = iPointToPosition;
                o1.a(childAt3, f2 - childAt3.getLeft(), f7 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z10 = (selector == null || iPointToPosition == -1) ? false : true;
                if (z10) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f1113d;
                rect.set(left, top, right, bottom);
                rect.left -= this.f1114e;
                rect.top -= this.f1115i;
                rect.right += this.f1116v;
                rect.bottom += this.f1117w;
                if (i10 >= 33) {
                    zA = q1.a(this);
                } else {
                    Field field = s1.f1102a;
                    if (field != null) {
                        try {
                            zA = field.getBoolean(this);
                        } catch (IllegalAccessException e10) {
                            e10.printStackTrace();
                            zA = false;
                        }
                    } else {
                        zA = false;
                    }
                }
                if (childAt3.isEnabled() != zA) {
                    boolean z11 = !zA;
                    if (Build.VERSION.SDK_INT >= 33) {
                        q1.b(this, z11);
                    } else {
                        Field field2 = s1.f1102a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z11));
                            } catch (IllegalAccessException e11) {
                                e11.printStackTrace();
                            }
                        }
                    }
                    if (iPointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z10) {
                    float fExactCenterX = rect.exactCenterX();
                    float fExactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    selector.setHotspot(fExactCenterX, fExactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && iPointToPosition != -1) {
                    selector2.setHotspot(f2, f7);
                }
                r1 r1Var = this.f1119y;
                if (r1Var != null) {
                    r1Var.f1094e = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                }
                z5 = true;
                z6 = false;
            }
        }
        if (z5) {
            this.G = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f1118x - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        } else {
            this.G = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f1118x - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        }
        if (z5) {
            if (this.H == null) {
                this.H = new androidx.core.widget.d(this);
            }
            androidx.core.widget.d dVar3 = this.H;
            boolean z12 = dVar3.M;
            dVar3.M = true;
            dVar3.onTouch(this, motionEvent);
        } else {
            dVar = this.H;
            if (dVar != null) {
                if (dVar.M) {
                    dVar.d();
                }
                dVar.M = false;
            }
        }
        return z5;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f1113d;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.I != null) {
            return;
        }
        super.drawableStateChanged();
        r1 r1Var = this.f1119y;
        if (r1Var != null) {
            r1Var.f1094e = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.G && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.F || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.F || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.F || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.F && this.E) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.I = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.I == null) {
            a3.h hVar = new a3.h(2, this);
            this.I = hVar;
            post(hVar);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i7 < 30 || !p1.f1071d) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        p1.f1068a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                        p1.f1069b.invoke(this, Integer.valueOf(iPointToPosition));
                        p1.f1070c.invoke(this, Integer.valueOf(iPointToPosition));
                    } catch (IllegalAccessException e10) {
                        e10.printStackTrace();
                    } catch (InvocationTargetException e11) {
                        e11.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.G && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1118x = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        a3.h hVar = this.I;
        if (hVar != null) {
            t1 t1Var = (t1) hVar.f72e;
            t1Var.I = null;
            t1Var.removeCallbacks(hVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z5) {
        this.E = z5;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        r1 r1Var;
        if (drawable != null) {
            r1Var = new r1();
            Drawable drawable2 = r1Var.f1093d;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            r1Var.f1093d = drawable;
            if (drawable != null) {
                drawable.setCallback(r1Var);
            }
            r1Var.f1094e = true;
        } else {
            r1Var = null;
        }
        this.f1119y = r1Var;
        super.setSelector(r1Var);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1114e = rect.left;
        this.f1115i = rect.top;
        this.f1116v = rect.right;
        this.f1117w = rect.bottom;
    }
}
