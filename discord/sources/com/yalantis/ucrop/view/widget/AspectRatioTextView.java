package com.yalantis.ucrop.view.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import com.discord.R;
import hn.a;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class AspectRatioTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f7316d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Paint f7317e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f7318i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f7319v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f7320w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f7321x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f7322y;

    public AspectRatioTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f7316d = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f10949a);
        setGravity(1);
        this.f7320w = typedArrayObtainStyledAttributes.getString(0);
        this.f7321x = typedArrayObtainStyledAttributes.getFloat(1, 0.0f);
        float f2 = typedArrayObtainStyledAttributes.getFloat(2, 0.0f);
        this.f7322y = f2;
        float f7 = this.f7321x;
        if (f7 == 0.0f || f2 == 0.0f) {
            this.f7319v = 0.0f;
        } else {
            this.f7319v = f7 / f2;
        }
        this.f7318i = getContext().getResources().getDimensionPixelSize(R.dimen.ucrop_size_dot_scale_text_view);
        Paint paint = new Paint(1);
        this.f7317e = paint;
        paint.setStyle(Paint.Style.FILL);
        e();
        d(getResources().getColor(R.color.ucrop_color_widget_active));
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void d(int i7) {
        Paint paint = this.f7317e;
        if (paint != null) {
            paint.setColor(i7);
        }
        setTextColor(new ColorStateList(new int[][]{new int[]{android.R.attr.state_selected}, new int[]{0}}, new int[]{i7, getContext().getColor(R.color.ucrop_color_widget)}));
    }

    public final void e() {
        if (!TextUtils.isEmpty(this.f7320w)) {
            setText(this.f7320w);
            return;
        }
        Locale locale = Locale.US;
        setText(((int) this.f7321x) + ":" + ((int) this.f7322y));
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isSelected()) {
            Rect rect = this.f7316d;
            canvas.getClipBounds(rect);
            float f2 = (rect.right - rect.left) / 2.0f;
            float f7 = rect.bottom - (rect.top / 2.0f);
            int i7 = this.f7318i;
            canvas.drawCircle(f2, f7 - (i7 * 1.5f), i7 / 2.0f, this.f7317e);
        }
    }

    public void setActiveColor(int i7) {
        d(i7);
        invalidate();
    }

    public void setAspectRatio(@NonNull jn.a aVar) {
        this.f7320w = aVar.f13974d;
        float f2 = aVar.f13975e;
        this.f7321x = f2;
        float f7 = aVar.f13976i;
        this.f7322y = f7;
        if (f2 == 0.0f || f7 == 0.0f) {
            this.f7319v = 0.0f;
        } else {
            this.f7319v = f2 / f7;
        }
        e();
    }
}
