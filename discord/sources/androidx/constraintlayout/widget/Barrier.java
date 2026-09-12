package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class Barrier extends b {
    public int E;
    public int F;
    public r0.a G;

    public Barrier(Context context) {
        super(context);
        this.f1348d = new int[32];
        this.f1354y = new HashMap();
        this.f1350i = context;
        h(null);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.G.f19125s0;
    }

    public int getMargin() {
        return this.G.f19126t0;
    }

    public int getType() {
        return this.E;
    }

    @Override // androidx.constraintlayout.widget.b
    public final void h(AttributeSet attributeSet) {
        super.h(attributeSet);
        r0.a aVar = new r0.a();
        aVar.f19124r0 = 0;
        aVar.f19125s0 = true;
        aVar.f19126t0 = 0;
        aVar.f19127u0 = false;
        this.G = aVar;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, m.f1445b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i7);
                if (index == 26) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 25) {
                    this.G.f19125s0 = typedArrayObtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.G.f19126t0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f1351v = this.G;
        k();
    }

    @Override // androidx.constraintlayout.widget.b
    public final void i(ConstraintWidget constraintWidget, boolean z5) {
        int i7 = this.E;
        this.F = i7;
        if (z5) {
            if (i7 == 5) {
                this.F = 1;
            } else if (i7 == 6) {
                this.F = 0;
            }
        } else if (i7 == 5) {
            this.F = 0;
        } else if (i7 == 6) {
            this.F = 1;
        }
        if (constraintWidget instanceof r0.a) {
            ((r0.a) constraintWidget).f19124r0 = this.F;
        }
    }

    public void setAllowsGoneWidget(boolean z5) {
        this.G.f19125s0 = z5;
    }

    public void setDpMargin(int i7) {
        this.G.f19126t0 = (int) ((i7 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i7) {
        this.G.f19126t0 = i7;
    }

    public void setType(int i7) {
        this.E = i7;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
