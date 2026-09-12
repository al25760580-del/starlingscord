package com.facebook.drawee.span;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public class SimpleDraweeSpanTextView extends TextView {
    private DraweeSpanStringBuilder mDraweeStringBuilder;
    private boolean mIsAttached;

    public SimpleDraweeSpanTextView(Context context) {
        super(context);
        this.mIsAttached = false;
    }

    public void detachCurrentDraweeSpanStringBuilder() {
        DraweeSpanStringBuilder draweeSpanStringBuilder = this.mDraweeStringBuilder;
        if (draweeSpanStringBuilder != null) {
            draweeSpanStringBuilder.b(this);
        }
        this.mDraweeStringBuilder = null;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mIsAttached = true;
        DraweeSpanStringBuilder draweeSpanStringBuilder = this.mDraweeStringBuilder;
        if (draweeSpanStringBuilder != null) {
            draweeSpanStringBuilder.a(this);
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        this.mIsAttached = false;
        DraweeSpanStringBuilder draweeSpanStringBuilder = this.mDraweeStringBuilder;
        if (draweeSpanStringBuilder != null) {
            draweeSpanStringBuilder.b(this);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        this.mIsAttached = true;
        DraweeSpanStringBuilder draweeSpanStringBuilder = this.mDraweeStringBuilder;
        if (draweeSpanStringBuilder != null) {
            draweeSpanStringBuilder.a(this);
        }
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        this.mIsAttached = false;
        DraweeSpanStringBuilder draweeSpanStringBuilder = this.mDraweeStringBuilder;
        if (draweeSpanStringBuilder != null) {
            draweeSpanStringBuilder.b(this);
        }
        super.onStartTemporaryDetach();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        super.onTextChanged(charSequence, i7, i10, i11);
        detachCurrentDraweeSpanStringBuilder();
    }

    public void setDraweeSpanStringBuilder(DraweeSpanStringBuilder draweeSpanStringBuilder) {
        setText(draweeSpanStringBuilder, TextView.BufferType.SPANNABLE);
        this.mDraweeStringBuilder = draweeSpanStringBuilder;
        if (draweeSpanStringBuilder == null || !this.mIsAttached) {
            return;
        }
        draweeSpanStringBuilder.a(this);
    }

    public SimpleDraweeSpanTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mIsAttached = false;
    }

    public SimpleDraweeSpanTextView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.mIsAttached = false;
    }
}
