package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.view.u0;

/* JADX INFO: loaded from: classes3.dex */
final class MaterialCalendarGridView extends GridView {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f6323d;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        z.c(null);
        if (o.w(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(com.discord.R.id.cancel_button);
            setNextFocusRightId(com.discord.R.id.confirm_button);
        }
        this.f6323d = o.w(getContext(), com.discord.R.attr.nestedScrollable);
        u0.p(this, new h(2));
    }

    public final r a() {
        return (r) super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final Adapter getAdapter() {
        return (r) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((r) super.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        r rVar = (r) super.getAdapter();
        rVar.getClass();
        int iMax = Math.max(rVar.a(), getFirstVisiblePosition());
        int iMin = Math.min(rVar.c(), getLastVisiblePosition());
        rVar.getItem(iMax);
        rVar.getItem(iMin);
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z5, int i7, Rect rect) {
        if (!z5) {
            super.onFocusChanged(false, i7, rect);
            return;
        }
        if (i7 == 33) {
            setSelection(((r) super.getAdapter()).c());
        } else if (i7 == 130) {
            setSelection(((r) super.getAdapter()).a());
        } else {
            super.onFocusChanged(true, i7, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        if (!super.onKeyDown(i7, keyEvent)) {
            return false;
        }
        int selectedItemPosition = getSelectedItemPosition();
        if (selectedItemPosition == -1 || (selectedItemPosition >= ((r) super.getAdapter()).a() && selectedItemPosition <= ((r) super.getAdapter()).c())) {
            return true;
        }
        if (19 != i7) {
            return false;
        }
        setSelection(((r) super.getAdapter()).a());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i7, int i10) {
        if (!this.f6323d) {
            super.onMeasure(i7, i10);
            return;
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i7) {
        if (i7 < ((r) super.getAdapter()).a()) {
            super.setSelection(((r) super.getAdapter()).a());
        } else {
            super.setSelection(i7);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (r) super.getAdapter();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof r)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), r.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}
