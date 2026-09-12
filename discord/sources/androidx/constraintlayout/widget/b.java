package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.facebook.react.devsupport.StackTraceHelper;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends View {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f1348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1349e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Context f1350i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public r0.g f1351v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f1352w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f1353x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public HashMap f1354y;

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1348d = new int[32];
        this.f1354y = new HashMap();
        this.f1350i = context;
        h(attributeSet);
    }

    public final void a(String str) {
        Context context = this.f1350i;
        if (str == null || str.length() == 0 || context == null) {
            return;
        }
        String strTrim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int identifier = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object designInformation = constraintLayout.getDesignInformation(0, strTrim);
            if (designInformation instanceof Integer) {
                identifier = ((Integer) designInformation).intValue();
            }
        }
        if (identifier == 0 && constraintLayout != null) {
            identifier = g(constraintLayout, strTrim);
        }
        if (identifier == 0) {
            try {
                identifier = l.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (identifier == 0) {
            identifier = context.getResources().getIdentifier(strTrim, StackTraceHelper.ID_KEY, context.getPackageName());
        }
        if (identifier != 0) {
            this.f1354y.put(Integer.valueOf(identifier), strTrim);
            b(identifier);
        } else {
            Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
        }
    }

    public final void b(int i7) {
        if (i7 == getId()) {
            return;
        }
        int i10 = this.f1349e + 1;
        int[] iArr = this.f1348d;
        if (i10 > iArr.length) {
            this.f1348d = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f1348d;
        int i11 = this.f1349e;
        iArr2[i11] = i7;
        this.f1349e = i11 + 1;
    }

    public final void c(String str) {
        if (str == null || str.length() == 0 || this.f1350i == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = constraintLayout.getChildAt(i7);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.LayoutParams) && strTrim.equals(((ConstraintLayout.LayoutParams) layoutParams).X)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    b(childAt.getId());
                }
            }
        }
    }

    public final void d() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        e((ConstraintLayout) parent);
    }

    public final void e(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i7 = 0; i7 < this.f1349e; i7++) {
            View viewById = constraintLayout.getViewById(this.f1348d[i7]);
            if (viewById != null) {
                viewById.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                }
            }
        }
    }

    public void f(ConstraintLayout constraintLayout) {
    }

    public final int g(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str != null && (resources = this.f1350i.getResources()) != null) {
            int childCount = constraintLayout.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = constraintLayout.getChildAt(i7);
                if (childAt.getId() != -1) {
                    try {
                        resourceEntryName = resources.getResourceEntryName(childAt.getId());
                    } catch (Resources.NotFoundException unused) {
                        resourceEntryName = null;
                    }
                    if (str.equals(resourceEntryName)) {
                        return childAt.getId();
                    }
                }
            }
        }
        return 0;
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f1348d, this.f1349e);
    }

    public void h(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, m.f1445b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i7);
                if (index == 35) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f1352w = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f1353x = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void i(ConstraintWidget constraintWidget, boolean z5) {
    }

    public final void k() {
        if (this.f1351v == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            ((ConstraintLayout.LayoutParams) layoutParams).f1310o0 = this.f1351v;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f1352w;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f1353x;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i10) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f1352w = str;
        if (str == null) {
            return;
        }
        int i7 = 0;
        this.f1349e = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i7);
            if (iIndexOf == -1) {
                a(str.substring(i7));
                return;
            } else {
                a(str.substring(i7, iIndexOf));
                i7 = iIndexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f1353x = str;
        if (str == null) {
            return;
        }
        int i7 = 0;
        this.f1349e = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i7);
            if (iIndexOf == -1) {
                c(str.substring(i7));
                return;
            } else {
                c(str.substring(i7, iIndexOf));
                i7 = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f1352w = null;
        this.f1349e = 0;
        for (int i7 : iArr) {
            b(i7);
        }
    }

    @Override // android.view.View
    public final void setTag(int i7, Object obj) {
        super.setTag(i7, obj);
        if (obj == null && this.f1352w == null) {
            b(i7);
        }
    }

    public void j() {
    }
}
