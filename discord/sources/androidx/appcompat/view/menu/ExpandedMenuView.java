package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import e4.m;
import n.i;
import n.j;
import n.l;
import n.x;

/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements i, x, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f787e = {R.attr.background, R.attr.divider};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j f788d;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        m mVarE = m.E(context, attributeSet, f787e, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) mVarE.f7994i;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(mVarE.x(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(mVarE.x(1));
        }
        mVarE.H();
    }

    @Override // n.x
    public final void b(j jVar) {
        this.f788d = jVar;
    }

    @Override // n.i
    public final boolean c(l lVar) {
        return this.f788d.q(lVar, null, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i7, long j) {
        c((l) getAdapter().getItem(i7));
    }
}
