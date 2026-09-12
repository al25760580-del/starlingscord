package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import androidx.annotation.NonNull;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.u0;
import bh.p;
import com.discord.R;
import com.google.android.material.timepicker.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kh.x;
import oh.a;
import sg.c;

/* JADX INFO: loaded from: classes3.dex */
public class MaterialButtonToggleGroup extends c {
    public static final /* synthetic */ int N = 0;
    public final LinkedHashSet H;
    public boolean I;
    public boolean J;
    public boolean K;
    public final int L;
    public HashSet M;

    public MaterialButtonToggleGroup(@NonNull Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet);
        this.H = new LinkedHashSet();
        this.I = false;
        this.M = new HashSet();
        TypedArray typedArrayF = p.f(getContext(), attributeSet, kg.a.f14445r, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(typedArrayF.getBoolean(7, false));
        this.L = typedArrayF.getResourceId(2, -1);
        this.K = typedArrayF.getBoolean(4, false);
        if (this.f19950x == null) {
            this.f19950x = x.b(new kh.a(0.0f));
        }
        setEnabled(typedArrayF.getBoolean(0, true));
        typedArrayF.recycle();
        setImportantForAccessibility(1);
    }

    @NonNull
    private String getChildrenA11yClassName() {
        return (this.J ? RadioButton.class : ToggleButton.class).getName();
    }

    private int getVisibleButtonCount() {
        int i7 = 0;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if ((getChildAt(i10) instanceof MaterialButton) && getChildAt(i10).getVisibility() != 8) {
                i7++;
            }
        }
        return i7;
    }

    private void setupButtonChild(@NonNull MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setA11yClassName(getChildrenA11yClassName());
    }

    @Override // sg.c, android.view.ViewGroup
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i7, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setupButtonChild(materialButton);
        f(materialButton.getId(), materialButton.L);
        u0.p(materialButton, new bh.a(3, this));
    }

    public final void f(int i7, boolean z5) {
        if (i7 == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i7);
            return;
        }
        HashSet hashSet = new HashSet(this.M);
        if (z5 && !hashSet.contains(Integer.valueOf(i7))) {
            if (this.J && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i7));
        } else {
            if (z5 || !hashSet.contains(Integer.valueOf(i7))) {
                return;
            }
            if (!this.K || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i7));
            }
        }
        g(hashSet);
    }

    public final void g(Set set) {
        HashSet hashSet = this.M;
        this.M = new HashSet(set);
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            int id2 = ((MaterialButton) getChildAt(i7)).getId();
            boolean zContains = set.contains(Integer.valueOf(id2));
            View viewFindViewById = findViewById(id2);
            if (viewFindViewById instanceof MaterialButton) {
                this.I = true;
                ((MaterialButton) viewFindViewById).setChecked(zContains);
                this.I = false;
            }
            if (hashSet.contains(Integer.valueOf(id2)) != set.contains(Integer.valueOf(id2))) {
                set.contains(Integer.valueOf(id2));
                Iterator it = this.H.iterator();
                while (it.hasNext()) {
                    ((i) it.next()).a();
                }
            }
        }
        invalidate();
    }

    public int getCheckedButtonId() {
        if (!this.J || this.M.isEmpty()) {
            return -1;
        }
        return ((Integer) this.M.iterator().next()).intValue();
    }

    @NonNull
    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            int id2 = ((MaterialButton) getChildAt(i7)).getId();
            if (this.M.contains(Integer.valueOf(id2))) {
                arrayList.add(Integer.valueOf(id2));
            }
        }
        return arrayList;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i7 = this.L;
        if (i7 != -1) {
            g(Collections.singleton(Integer.valueOf(i7)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        new AccessibilityNodeInfoCompat(accessibilityNodeInfo).f1613a.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, getVisibleButtonCount(), false, this.J ? 1 : 2));
    }

    public void setSelectionRequired(boolean z5) {
        this.K = z5;
    }

    public void setSingleSelection(boolean z5) {
        if (this.J != z5) {
            this.J = z5;
            g(new HashSet());
        }
        String childrenA11yClassName = getChildrenA11yClassName();
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            ((MaterialButton) getChildAt(i7)).setA11yClassName(childrenA11yClassName);
        }
    }

    public void setSingleSelection(int i7) {
        setSingleSelection(getResources().getBoolean(i7));
    }
}
