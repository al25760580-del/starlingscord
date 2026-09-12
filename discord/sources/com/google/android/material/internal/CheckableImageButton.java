package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.appcompat.widget.x;
import androidx.core.view.u0;
import androidx.recyclerview.widget.RecyclerView;
import bh.a;
import bh.b;

/* JADX INFO: loaded from: classes3.dex */
public class CheckableImageButton extends x implements Checkable {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f6403y = {R.attr.state_checked};

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f6404v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f6405w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f6406x;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.discord.R.attr.imageButtonStyle);
        this.f6405w = true;
        this.f6406x = true;
        u0.p(this, new a(0, this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f6404v;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i7) {
        return this.f6404v ? View.mergeDrawableStates(super.onCreateDrawableState(i7 + 1), f6403y) : super.onCreateDrawableState(i7);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.f7578d);
        setChecked(bVar.f3236i);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f3236i = this.f6404v;
        return bVar;
    }

    public void setCheckable(boolean z5) {
        if (this.f6405w != z5) {
            this.f6405w = z5;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z5) {
        if (!this.f6405w || this.f6404v == z5) {
            return;
        }
        this.f6404v = z5;
        refreshDrawableState();
        sendAccessibilityEvent(RecyclerView.ItemAnimator.FLAG_MOVED);
    }

    public void setPressable(boolean z5) {
        this.f6406x = z5;
    }

    @Override // android.view.View
    public void setPressed(boolean z5) {
        if (this.f6406x) {
            super.setPressed(z5);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f6404v);
    }
}
