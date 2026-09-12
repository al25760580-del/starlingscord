package com.facebook.react.views.switchview;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import androidx.appcompat.widget.j3;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\nJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\t\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\t\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0018\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\nJ\u0017\u0010\u001b\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u001b\u0010\u0017J\u0017\u0010\u001c\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u001c\u0010\u0017R\u0016\u0010\u001d\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010!\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010 ¨\u0006\""}, d2 = {"Lcom/facebook/react/views/switchview/ReactSwitch;", "Landroidx/appcompat/widget/j3;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "checked", "", "setTrackColor", "(Z)V", "", ViewProps.COLOR, "Landroid/content/res/ColorStateList;", "createRippleDrawableColorStateList", "(I)Landroid/content/res/ColorStateList;", "setChecked", "setBackgroundColor", "(I)V", "Landroid/graphics/drawable/Drawable;", "drawable", "setColor", "(Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;)V", "(Ljava/lang/Integer;)V", "setThumbColor", ViewProps.ON, "setOn", "setTrackColorForTrue", "setTrackColorForFalse", "allowChange", "Z", "trackColorForFalse", "Ljava/lang/Integer;", "trackColorForTrue", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactSwitch extends j3 {
    private boolean allowChange;
    private Integer trackColorForFalse;
    private Integer trackColorForTrue;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactSwitch(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.allowChange = true;
    }

    private final ColorStateList createRippleDrawableColorStateList(int color) {
        return new ColorStateList(new int[][]{new int[]{R.attr.state_pressed}}, new int[]{color});
    }

    @Override // android.view.View
    public void setBackgroundColor(int color) {
        setBackground(new RippleDrawable(createRippleDrawableColorStateList(color), new ColorDrawable(color), null));
    }

    @Override // androidx.appcompat.widget.j3, android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean checked) {
        if (!this.allowChange || isChecked() == checked) {
            super.setChecked(isChecked());
            return;
        }
        this.allowChange = false;
        super.setChecked(checked);
        setTrackColor(checked);
    }

    public final void setColor(@NotNull Drawable drawable, Integer color) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        if (color == null) {
            drawable.clearColorFilter();
        } else {
            drawable.setColorFilter(new PorterDuffColorFilter(color.intValue(), PorterDuff.Mode.MULTIPLY));
        }
    }

    public final void setOn(boolean on2) {
        if (isChecked() != on2) {
            super.setChecked(on2);
            setTrackColor(on2);
        }
        this.allowChange = true;
    }

    public final void setThumbColor(Integer color) {
        Drawable thumbDrawable = super.getThumbDrawable();
        Intrinsics.checkNotNullExpressionValue(thumbDrawable, "getThumbDrawable(...)");
        setColor(thumbDrawable, color);
        if (color == null || !(getBackground() instanceof RippleDrawable)) {
            return;
        }
        ColorStateList colorStateListCreateRippleDrawableColorStateList = createRippleDrawableColorStateList(color.intValue());
        Drawable background = getBackground();
        Intrinsics.checkNotNull(background, "null cannot be cast to non-null type android.graphics.drawable.RippleDrawable");
        ((RippleDrawable) background).setColor(colorStateListCreateRippleDrawableColorStateList);
    }

    public final void setTrackColor(Integer color) {
        Drawable trackDrawable = super.getTrackDrawable();
        Intrinsics.checkNotNullExpressionValue(trackDrawable, "getTrackDrawable(...)");
        setColor(trackDrawable, color);
    }

    public final void setTrackColorForFalse(Integer color) {
        if (Intrinsics.areEqual(color, this.trackColorForFalse)) {
            return;
        }
        this.trackColorForFalse = color;
        if (isChecked()) {
            return;
        }
        setTrackColor(this.trackColorForFalse);
    }

    public final void setTrackColorForTrue(Integer color) {
        if (Intrinsics.areEqual(color, this.trackColorForTrue)) {
            return;
        }
        this.trackColorForTrue = color;
        if (isChecked()) {
            setTrackColor(this.trackColorForTrue);
        }
    }

    private final void setTrackColor(boolean checked) {
        Integer num = this.trackColorForTrue;
        if (num == null && this.trackColorForFalse == null) {
            return;
        }
        if (!checked) {
            num = this.trackColorForFalse;
        }
        setTrackColor(num);
    }
}
