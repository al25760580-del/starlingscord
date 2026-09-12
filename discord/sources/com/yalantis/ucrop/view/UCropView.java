package com.yalantis.ucrop.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.discord.R;
import ga.l;
import hn.a;
import u4.b;

/* JADX INFO: loaded from: classes3.dex */
public class UCropView extends FrameLayout {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final GestureCropImageView f7314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final OverlayView f7315e;

    public UCropView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.ucrop_view, (ViewGroup) this, true);
        GestureCropImageView gestureCropImageView = (GestureCropImageView) findViewById(R.id.image_view_crop);
        this.f7314d = gestureCropImageView;
        OverlayView overlayView = (OverlayView) findViewById(R.id.view_overlay);
        this.f7315e = overlayView;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f10950b);
        overlayView.getClass();
        overlayView.I = typedArrayObtainStyledAttributes.getBoolean(2, false);
        int color = typedArrayObtainStyledAttributes.getColor(3, overlayView.getResources().getColor(R.color.ucrop_color_default_dimmed));
        overlayView.J = color;
        Paint paint = overlayView.L;
        paint.setColor(color);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(1.0f);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, overlayView.getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_frame_stoke_width));
        int color2 = typedArrayObtainStyledAttributes.getColor(4, overlayView.getResources().getColor(R.color.ucrop_color_default_crop_frame));
        Paint paint2 = overlayView.N;
        paint2.setStrokeWidth(dimensionPixelSize);
        paint2.setColor(color2);
        paint2.setStyle(style);
        Paint paint3 = overlayView.O;
        paint3.setStrokeWidth(dimensionPixelSize * 3);
        paint3.setColor(color2);
        paint3.setStyle(style);
        overlayView.G = typedArrayObtainStyledAttributes.getBoolean(10, true);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, overlayView.getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_grid_stoke_width));
        int color3 = typedArrayObtainStyledAttributes.getColor(6, overlayView.getResources().getColor(R.color.ucrop_color_default_crop_grid));
        Paint paint4 = overlayView.M;
        paint4.setStrokeWidth(dimensionPixelSize2);
        paint4.setColor(color3);
        overlayView.f7312x = typedArrayObtainStyledAttributes.getInt(8, 2);
        overlayView.f7313y = typedArrayObtainStyledAttributes.getInt(7, 2);
        overlayView.H = typedArrayObtainStyledAttributes.getBoolean(11, true);
        gestureCropImageView.getClass();
        float fAbs = Math.abs(typedArrayObtainStyledAttributes.getFloat(0, 0.0f));
        float fAbs2 = Math.abs(typedArrayObtainStyledAttributes.getFloat(1, 0.0f));
        if (fAbs == 0.0f || fAbs2 == 0.0f) {
            gestureCropImageView.O = 0.0f;
        } else {
            gestureCropImageView.O = fAbs / fAbs2;
        }
        typedArrayObtainStyledAttributes.recycle();
        gestureCropImageView.setCropBoundsChangeListener(new l(24, this));
        overlayView.setOverlayViewChangeListener(new b(25, this));
    }

    @NonNull
    public GestureCropImageView getCropImageView() {
        return this.f7314d;
    }

    @NonNull
    public OverlayView getOverlayView() {
        return this.f7315e;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
