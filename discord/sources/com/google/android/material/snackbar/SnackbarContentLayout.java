package com.google.android.material.snackbar;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.discord.R;
import io.sentry.config.a;

/* JADX INFO: loaded from: classes3.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f6437d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Button f6438e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f6439i;

    public SnackbarContentLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a.T(context, R.attr.motionEasingEmphasizedInterpolator, lg.a.f15072b);
    }

    public final boolean a(int i7, int i10, int i11) {
        boolean z5;
        if (i7 != getOrientation()) {
            setOrientation(i7);
            z5 = true;
        } else {
            z5 = false;
        }
        if (this.f6437d.getPaddingTop() == i10 && this.f6437d.getPaddingBottom() == i11) {
            return z5;
        }
        TextView textView = this.f6437d;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i10, textView.getPaddingEnd(), i11);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i10, textView.getPaddingRight(), i11);
        return true;
    }

    public Button getActionView() {
        return this.f6438e;
    }

    public TextView getMessageView() {
        return this.f6437d;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f6437d = (TextView) findViewById(R.id.snackbar_text);
        this.f6438e = (Button) findViewById(R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.f6437d.getLayout();
        boolean z5 = layout != null && layout.getLineCount() > 1;
        if (!z5 || this.f6439i <= 0 || this.f6438e.getMeasuredWidth() <= this.f6439i) {
            if (!z5) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i7, i10);
    }

    public void setMaxInlineActionWidth(int i7) {
        this.f6439i = i7;
    }
}
