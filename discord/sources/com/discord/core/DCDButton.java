package com.discord.core;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.discord.core.databinding.DcdButtonBinding;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.progress_dots.ProgressDots;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.google.android.material.button.MaterialButton;
import kh.a;
import kh.f;
import kh.k;
import kh.m;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0012\u001a\u00020\u0013H\u0014J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0016J\u0018\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0001\u0010\u001b\u001a\u00020\u001cJ\u0010\u0010\u001d\u001a\u00020\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0010\u0010\u001e\u001a\u00020\u00132\b\b\u0001\u0010\u001f\u001a\u00020\u001cJ\u0010\u0010 \u001a\u00020\u00132\b\b\u0001\u0010!\u001a\u00020\u001cJ\u0017\u0010\"\u001a\u00020\u00132\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\u001c¢\u0006\u0002\u0010$J\u000e\u0010%\u001a\u00020\u00132\u0006\u0010&\u001a\u00020'J\u0017\u0010(\u001a\u00020\u00132\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\u001c¢\u0006\u0002\u0010$J\u0012\u0010(\u001a\u00020\u00132\b\b\u0001\u0010#\u001a\u00020\u001cH\u0016J3\u0010)\u001a\u00020\u00132\b\b\u0001\u0010*\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020\u001c2\n\b\u0003\u0010,\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010-\u001a\u00020\u001c¢\u0006\u0002\u0010.J\u000e\u0010/\u001a\u00020\u00132\u0006\u00100\u001a\u000201J\u0012\u00102\u001a\u00020\u00132\b\u00103\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u00104\u001a\u00020\u0013H\u0002J\b\u00105\u001a\u00020\u0016H\u0002J\u0017\u00106\u001a\u00020\u00132\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\u001c¢\u0006\u0002\u0010$J\u0010\u00107\u001a\u00020\u00132\b\u00108\u001a\u0004\u0018\u000109J\u0012\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u000109H\u0016J\u0012\u0010=\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010>H\u0016J\u0010\u0010?\u001a\u00020\u00132\u0006\u0010@\u001a\u00020\u0016H\u0016J\u000e\u0010A\u001a\u00020\u00132\u0006\u0010B\u001a\u00020\u001cJ\u000e\u0010C\u001a\u00020\u00132\u0006\u0010D\u001a\u00020EJ\u0010\u0010F\u001a\u00020\u00132\u0006\u0010G\u001a\u00020HH\u0002J\u000e\u0010I\u001a\u00020\u00132\u0006\u0010J\u001a\u00020KR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006L"}, d2 = {"Lcom/discord/core/DCDButton;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/discord/core/databinding/DcdButtonBinding;", "button", "Lcom/google/android/material/button/MaterialButton;", ReactProgressBarViewManager.PROP_PROGRESS, "Landroid/widget/ProgressBar;", "loadingDots", "Lcom/discord/progress_dots/ProgressDots;", "text", "", "onFinishInflate", "", "setLoading", "isLoading", "", "useDots", "setIcon", "iconUrl", "", "iconSize", "", "setText", "setCornerRadius", "cornerRadius", "setIconPadding", "iconPadding", "setTextColor", "colorInt", "(Ljava/lang/Integer;)V", "setTextSizeSp", "sp", "", "setBackgroundColor", "setBackgroundRectangle", ViewProps.COLOR, "radiusPx", "strokeColor", "strokeWidth", "(IILjava/lang/Integer;I)V", "setDiscordFont", "font", "Lcom/discord/fonts/DiscordFont;", "setContentDescription", "contentDescription", "setButtonPadding", "hasPadding", "setBorderColor", "setOnClickButtonListener", "onClickListener", "Landroid/view/View$OnClickListener;", "setOnClickListener", "", "l", "setOnTouchListener", "Landroid/view/View$OnTouchListener;", "setEnabled", ViewProps.ENABLED, "setMaxLines", "maxLines", "ellipsize", "behavior", "Landroid/text/TextUtils$TruncateAt;", "setProgressBarColor", "colorStateList", "Landroid/content/res/ColorStateList;", "setDrawableBackground", "drawable", "Landroid/graphics/drawable/Drawable;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDCDButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DCDButton.kt\ncom/discord/core/DCDButton\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,221:1\n257#2,2:222\n257#2,2:224\n152#2,2:227\n1#3:226\n*S KotlinDebug\n*F\n+ 1 DCDButton.kt\ncom/discord/core/DCDButton\n*L\n84#1:222,2\n85#1:224,2\n168#1:227,2\n*E\n"})
public final class DCDButton extends FrameLayout {

    @NotNull
    private final DcdButtonBinding binding;

    @NotNull
    private final MaterialButton button;

    @NotNull
    private final ProgressDots loadingDots;

    @NotNull
    private final ProgressBar progress;
    private CharSequence text;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DCDButton(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final boolean hasPadding() {
        return getPaddingStart() > 0 || getPaddingEnd() > 0 || getPaddingTop() > 0 || getPaddingBottom() > 0;
    }

    public static /* synthetic */ void setBackgroundRectangle$default(DCDButton dCDButton, int i7, int i10, Integer num, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            num = null;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        dCDButton.setBackgroundRectangle(i7, i10, num, i11);
    }

    private final void setButtonPadding() {
        if (hasPadding()) {
            this.button.setPaddingRelative(getPaddingStart(), getPaddingTop(), getPaddingEnd(), getPaddingBottom());
            setPadding(0, 0, 0, 0);
        }
    }

    public static /* synthetic */ void setLoading$default(DCDButton dCDButton, boolean z5, boolean z6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z6 = false;
        }
        dCDButton.setLoading(z5, z6);
    }

    private final void setProgressBarColor(ColorStateList colorStateList) {
        this.progress.setIndeterminateTintList(colorStateList);
    }

    public final void ellipsize(@NotNull TextUtils.TruncateAt behavior) {
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        this.button.setEllipsize(behavior);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setButtonPadding();
    }

    public final void setBackgroundColor(Integer colorInt) {
        if (colorInt != null) {
            setBackgroundColor(colorInt.intValue());
        }
    }

    public final void setBackgroundRectangle(int color, int radiusPx, Integer strokeColor, int strokeWidth) {
        setBackgroundColor(color);
        MaterialButton materialButton = this.button;
        k kVar = new k();
        k kVar2 = new k();
        k kVar3 = new k();
        k kVar4 = new k();
        f fVar = new f(0);
        f fVar2 = new f(0);
        f fVar3 = new f(0);
        f fVar4 = new f(0);
        float f2 = radiusPx;
        a aVar = new a(f2);
        a aVar2 = new a(f2);
        a aVar3 = new a(f2);
        a aVar4 = new a(f2);
        m mVar = new m();
        mVar.f14500a = kVar;
        mVar.f14501b = kVar2;
        mVar.f14502c = kVar3;
        mVar.f14503d = kVar4;
        mVar.f14504e = aVar;
        mVar.f14505f = aVar2;
        mVar.f14506g = aVar3;
        mVar.f14507h = aVar4;
        mVar.f14508i = fVar;
        mVar.j = fVar2;
        mVar.k = fVar3;
        mVar.f14509l = fVar4;
        materialButton.setShapeAppearanceModel(mVar);
        if (strokeColor == null) {
            this.button.setStrokeWidth(0);
        } else {
            this.button.setStrokeColor(ColorStateList.valueOf(strokeColor.intValue()));
            this.button.setStrokeWidth(strokeWidth);
        }
    }

    public final void setBorderColor(Integer colorInt) {
        if (colorInt == null) {
            this.button.setStrokeColor(null);
            this.button.setStrokeWidth(0);
        } else {
            this.button.setStrokeColor(ColorStateList.valueOf(colorInt.intValue()));
            this.button.setStrokeWidth(SizeUtilsKt.getDpToPx(1));
        }
    }

    @Override // android.view.View
    public void setContentDescription(CharSequence contentDescription) {
        this.button.setContentDescription(contentDescription);
    }

    public final void setCornerRadius(int cornerRadius) {
        this.button.setCornerRadius(cornerRadius);
    }

    public final void setDiscordFont(@NotNull DiscordFont font) {
        Intrinsics.checkNotNullParameter(font, "font");
        DiscordFontUtilsKt.setDiscordFont(this.button, font);
    }

    public final void setDrawableBackground(@NotNull Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        this.button.setBackground(drawable);
        this.button.setBackgroundTintList(null);
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        this.button.setEnabled(enabled);
    }

    public final void setIcon(@NotNull String iconUrl, int iconSize) {
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        ReactAssetUtilsKt.setReactIcon(this.button, iconUrl, iconSize);
    }

    public final void setIconPadding(int iconPadding) {
        this.button.setIconPadding(iconPadding);
    }

    public final void setLoading(boolean isLoading, boolean useDots) {
        this.button.setText(isLoading ? "" : this.text);
        setClickable(!isLoading);
        this.progress.setVisibility(isLoading && !useDots ? 0 : 8);
        this.loadingDots.setVisibility(isLoading && useDots ? 0 : 8);
    }

    public final void setMaxLines(int maxLines) {
        this.button.setMaxLines(maxLines);
    }

    public final void setOnClickButtonListener(View.OnClickListener onClickListener) {
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(this.button, false, onClickListener, 1, null);
    }

    public final void setText(CharSequence text) {
        this.button.setText(text);
        this.text = text;
    }

    public final void setTextColor(Integer colorInt) {
        int iIntValue = colorInt != null ? colorInt.intValue() : -1;
        this.button.setTextColor(iIntValue);
        this.button.setIconTint(ColorStateList.valueOf(iIntValue));
        this.progress.setIndeterminateTintList(ColorStateList.valueOf(iIntValue));
    }

    public final void setTextSizeSp(float sp2) {
        this.button.setTextSize(2, sp2);
    }

    public /* synthetic */ DCDButton(Context context, AttributeSet attributeSet, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : attributeSet);
    }

    @Override // android.view.View
    public void setBackgroundColor(int colorInt) {
        this.button.setBackgroundTintList(ColorStateList.valueOf(colorInt));
    }

    @Override // android.view.View
    @NotNull
    public Void setOnClickListener(View.OnClickListener l6) {
        throw new IllegalAccessError("Use setButtonOnClickListener instead.");
    }

    @Override // android.view.View
    @NotNull
    public Void setOnTouchListener(View.OnTouchListener l6) {
        throw new IllegalAccessError("Use setButtonOnClickListener instead.");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DCDButton(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        DcdButtonBinding dcdButtonBindingInflate = DcdButtonBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(dcdButtonBindingInflate, "inflate(...)");
        this.binding = dcdButtonBindingInflate;
        MaterialButton button = dcdButtonBindingInflate.button;
        Intrinsics.checkNotNullExpressionValue(button, "button");
        this.button = button;
        ProgressBar progress = dcdButtonBindingInflate.progress;
        Intrinsics.checkNotNullExpressionValue(progress, "progress");
        this.progress = progress;
        ProgressDots loadingDots = dcdButtonBindingInflate.loadingDots;
        Intrinsics.checkNotNullExpressionValue(loadingDots, "loadingDots");
        this.loadingDots = loadingDots;
        button.setStateListAnimator(null);
        button.setMinimumHeight(progress.getHeight());
        button.setMinHeight(progress.getHeight());
        button.setMinimumWidth(progress.getWidth());
        button.setMinWidth(progress.getWidth());
        button.setInsetTop(0);
        button.setInsetBottom(0);
        setTextSizeSp(14.0f);
        setDiscordFont(DiscordFont.PrimarySemibold);
        setButtonPadding();
    }
}
