package ShiggyXposed.xposed.modules.LogBox;

import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.GravityCompat;
import io.ktor.http.ContentType;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LogBoxComponents.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\u0012J\u001e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tJ \u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u0017J\u001e\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0012J&\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0012J\u0016\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b¨\u0006\u001d"}, d2 = {"LShiggyXposed/xposed/modules/LogBox/LogBoxComponents;", "", "<init>", "()V", "createM3Button", "Landroid/view/View;", "context", "Landroid/content/Context;", ContentType.Text.TYPE, "", "colors", "LShiggyXposed/xposed/modules/LogBox/M3Colors;", "onClick", "Lkotlin/Function0;", "", "createTitle", "Landroid/widget/TextView;", "center", "", "createSubtitle", "createMenuContainer", "Landroid/widget/LinearLayout;", "padding", "", "createM3Switch", "isChecked", "updateSwitchAppearance", "switchView", "createAppearanceSelector", "app_release"}, k = 1, mv = {2, 1, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class LogBoxComponents {
    public static final LogBoxComponents INSTANCE = new LogBoxComponents();

    private LogBoxComponents() {
    }

    public final View createM3Button(Context context, String text, M3Colors colors, final Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setBackground(LogBoxUtils.INSTANCE.createM3Background(context, colors.getPrimaryContainer(), 20.0f));
        linearLayout.setPadding(LogBoxUtils.INSTANCE.dpToPx(context, 24), LogBoxUtils.INSTANCE.dpToPx(context, 10), LogBoxUtils.INSTANCE.dpToPx(context, 24), LogBoxUtils.INSTANCE.dpToPx(context, 10));
        linearLayout.setClipToOutline(true);
        linearLayout.setClickable(true);
        linearLayout.setFocusable(true);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, LogBoxUtils.INSTANCE.dpToPx(context, 40));
        layoutParams.setMargins(0, LogBoxUtils.INSTANCE.dpToPx(context, 8), 0, 0);
        linearLayout.setLayoutParams(layoutParams);
        TextView textView = new TextView(context);
        textView.setText(text);
        textView.setTextColor(colors.getOnPrimaryContainer());
        textView.setTextSize(14.0f);
        textView.setTypeface(Typeface.create("sans-serif-medium", 0));
        textView.setGravity(17);
        linearLayout.addView(textView);
        linearLayout.setBackground(new RippleDrawable(ColorStateList.valueOf(Color.argb(30, 255, 255, 255)), LogBoxUtils.INSTANCE.createM3Background(context, colors.getPrimaryContainer(), 20.0f), null));
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: ShiggyXposed.xposed.modules.LogBox.LogBoxComponents$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                onClick.invoke();
            }
        });
        return linearLayout;
    }

    public static /* synthetic */ TextView createTitle$default(LogBoxComponents logBoxComponents, Context context, M3Colors m3Colors, String str, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        return logBoxComponents.createTitle(context, m3Colors, str, z);
    }

    public final TextView createTitle(Context context, M3Colors colors, String text, boolean center) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(text, "text");
        TextView textView = new TextView(context);
        textView.setText(text);
        textView.setTextSize(center ? 20.0f : 22.0f);
        textView.setTextColor(colors.getOnSurface());
        textView.setTypeface(Typeface.create("sans-serif", 1));
        textView.setPadding(0, 0, 0, LogBoxUtils.INSTANCE.dpToPx(context, center ? 12 : 16));
        textView.setGravity(center ? 17 : GravityCompat.START);
        return textView;
    }

    public final TextView createSubtitle(Context context, M3Colors colors, String text) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(text, "text");
        TextView textView = new TextView(context);
        textView.setText(text);
        textView.setTextSize(14.0f);
        textView.setTextColor(colors.getOnSurfaceVariant());
        textView.setTypeface(Typeface.create("sans-serif", 0));
        textView.setPadding(0, 0, 0, LogBoxUtils.INSTANCE.dpToPx(context, 24));
        textView.setGravity(17);
        return textView;
    }

    public static /* synthetic */ LinearLayout createMenuContainer$default(LogBoxComponents logBoxComponents, Context context, M3Colors m3Colors, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 24;
        }
        return logBoxComponents.createMenuContainer(context, m3Colors, i);
    }

    public final LinearLayout createMenuContainer(Context context, M3Colors colors, int padding) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(colors, "colors");
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(LogBoxUtils.INSTANCE.dpToPx(context, padding), LogBoxUtils.INSTANCE.dpToPx(context, padding), LogBoxUtils.INSTANCE.dpToPx(context, padding), LogBoxUtils.INSTANCE.dpToPx(context, padding));
        linearLayout.setBackground(LogBoxUtils.INSTANCE.createM3Background(context, colors.getSurface(), padding == 24 ? 28.0f : 24.0f));
        return linearLayout;
    }

    public final View createM3Switch(Context context, M3Colors colors, boolean isChecked) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(colors, "colors");
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setTag(Boolean.valueOf(isChecked));
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(LogBoxUtils.INSTANCE.dpToPx(context, 52), LogBoxUtils.INSTANCE.dpToPx(context, 32)));
        LinearLayout linearLayout2 = linearLayout;
        updateSwitchAppearance(context, linearLayout2, colors, isChecked);
        return linearLayout2;
    }

    public final void updateSwitchAppearance(final Context context, final View switchView, M3Colors colors, boolean isChecked) {
        int primary;
        final View childAt;
        int onPrimary;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(switchView, "switchView");
        Intrinsics.checkNotNullParameter(colors, "colors");
        int primary2 = isChecked ? colors.getPrimary() : colors.getSurfaceVariant();
        int onPrimary2 = isChecked ? colors.getOnPrimary() : colors.getOnSurfaceVariant();
        if (switchView.getBackground() instanceof GradientDrawable) {
            Drawable background = switchView.getBackground();
            Intrinsics.checkNotNull(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            ColorStateList color = ((GradientDrawable) background).getColor();
            if (color != null) {
                primary = color.getDefaultColor();
            } else {
                primary = !isChecked ? colors.getPrimary() : colors.getSurfaceVariant();
            }
        } else {
            primary = !isChecked ? colors.getPrimary() : colors.getSurfaceVariant();
        }
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(primary), Integer.valueOf(primary2));
        valueAnimatorOfObject.setDuration(250L);
        valueAnimatorOfObject.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ShiggyXposed.xposed.modules.LogBox.LogBoxComponents$$ExternalSyntheticLambda2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                LogBoxComponents.updateSwitchAppearance$lambda$9(switchView, context, valueAnimator);
            }
        });
        if (switchView instanceof LinearLayout) {
            LinearLayout linearLayout = (LinearLayout) switchView;
            if (linearLayout.getChildCount() > 0) {
                childAt = linearLayout.getChildAt(0);
            } else {
                View view = new View(context);
                int iDpToPx = LogBoxUtils.INSTANCE.dpToPx(context, 24);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iDpToPx, iDpToPx);
                layoutParams.setMarginStart(LogBoxUtils.INSTANCE.dpToPx(context, 4));
                layoutParams.setMarginEnd(LogBoxUtils.INSTANCE.dpToPx(context, 24));
                view.setLayoutParams(layoutParams);
                linearLayout.addView(view);
                childAt = view;
            }
            ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams2, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(((LinearLayout.LayoutParams) layoutParams2).getMarginStart(), isChecked ? LogBoxUtils.INSTANCE.dpToPx(context, 24) : LogBoxUtils.INSTANCE.dpToPx(context, 4));
            valueAnimatorOfInt.setDuration(250L);
            valueAnimatorOfInt.setInterpolator(new DecelerateInterpolator());
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ShiggyXposed.xposed.modules.LogBox.LogBoxComponents$$ExternalSyntheticLambda3
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    LogBoxComponents.updateSwitchAppearance$lambda$12(childAt, context, valueAnimator);
                }
            });
            if (childAt.getBackground() instanceof GradientDrawable) {
                Drawable background2 = childAt.getBackground();
                Intrinsics.checkNotNull(background2, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
                ColorStateList color2 = ((GradientDrawable) background2).getColor();
                if (color2 != null) {
                    onPrimary = color2.getDefaultColor();
                } else {
                    onPrimary = !isChecked ? colors.getOnPrimary() : colors.getOnSurfaceVariant();
                }
            } else {
                onPrimary = !isChecked ? colors.getOnPrimary() : colors.getOnSurfaceVariant();
            }
            ValueAnimator valueAnimatorOfObject2 = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(onPrimary), Integer.valueOf(onPrimary2));
            valueAnimatorOfObject2.setDuration(250L);
            valueAnimatorOfObject2.setInterpolator(new DecelerateInterpolator());
            valueAnimatorOfObject2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ShiggyXposed.xposed.modules.LogBox.LogBoxComponents$$ExternalSyntheticLambda4
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    LogBoxComponents.updateSwitchAppearance$lambda$14(childAt, valueAnimator);
                }
            });
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(valueAnimatorOfObject, valueAnimatorOfInt, valueAnimatorOfObject2);
            animatorSet.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateSwitchAppearance$lambda$9(View view, Context context, ValueAnimator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        Object animatedValue = animator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) animatedValue).intValue();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(iIntValue);
        gradientDrawable.setCornerRadius(LogBoxUtils.INSTANCE.dpToPx(context, 16));
        view.setBackground(gradientDrawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateSwitchAppearance$lambda$12(View view, Context context, ValueAnimator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        Object animatedValue = animator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) animatedValue).intValue();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.setMarginStart(iIntValue);
        layoutParams2.setMarginEnd(LogBoxUtils.INSTANCE.dpToPx(context, 28) - iIntValue);
        view.setLayoutParams(layoutParams2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateSwitchAppearance$lambda$14(View view, ValueAnimator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        Object animatedValue = animator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) animatedValue).intValue();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(iIntValue);
        gradientDrawable.setShape(1);
        view.setBackground(gradientDrawable);
    }

    public final View createAppearanceSelector(Context context, M3Colors colors) {
        final Context context2 = context;
        Intrinsics.checkNotNullParameter(context2, "context");
        final M3Colors colors2 = colors;
        Intrinsics.checkNotNullParameter(colors2, "colors");
        String appearanceMode = LogBoxUtils.INSTANCE.getAppearanceMode(context2);
        List listListOf = CollectionsKt.listOf((Object[]) new String[]{"System", "Light", "Dark"});
        List listListOf2 = CollectionsKt.listOf((Object[]) new String[]{"system", "light", "dark"});
        LinearLayout linearLayout = new LinearLayout(context2);
        linearLayout.setOrientation(1);
        int i = -1;
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setPadding(0, 0, 0, LogBoxUtils.INSTANCE.dpToPx(context2, 8));
        TextView textView = new TextView(context2);
        textView.setText("Appearance");
        float f = 14.0f;
        textView.setTextSize(14.0f);
        textView.setTextColor(colors2.getOnSurface());
        textView.setPadding(0, 0, 0, LogBoxUtils.INSTANCE.dpToPx(context2, 8));
        textView.setTypeface(Typeface.create("sans-serif-medium", 0));
        linearLayout.addView(textView);
        final LinearLayout linearLayout2 = new LinearLayout(context2);
        linearLayout2.setOrientation(0);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, LogBoxUtils.INSTANCE.dpToPx(context2, 40)));
        int i2 = 0;
        for (Object obj : listListOf) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            final String str = (String) listListOf2.get(i2);
            TextView textView2 = new TextView(context2);
            textView2.setText((String) obj);
            textView2.setGravity(17);
            textView2.setTextSize(f);
            textView2.setTypeface(Typeface.create("sans-serif-medium", 0));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, i, 1.0f);
            if (i2 > 0) {
                layoutParams.setMargins(LogBoxUtils.INSTANCE.dpToPx(context2, 8), 0, 0, 0);
            }
            textView2.setLayoutParams(layoutParams);
            boolean zAreEqual = Intrinsics.areEqual(appearanceMode, str);
            textView2.setBackground(LogBoxUtils.INSTANCE.createM3Background(context2, zAreEqual ? colors2.getPrimaryContainer() : colors2.getSurfaceVariant(), 12.0f));
            textView2.setTextColor(zAreEqual ? colors2.getOnPrimaryContainer() : colors2.getOnSurface());
            textView2.setPadding(0, 0, 0, 0);
            final List list = listListOf2;
            textView2.setOnClickListener(new View.OnClickListener() { // from class: ShiggyXposed.xposed.modules.LogBox.LogBoxComponents$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LogBoxComponents.createAppearanceSelector$lambda$20$lambda$19$lambda$18(context2, str, linearLayout2, list, colors2, view);
                }
            });
            linearLayout2.addView(textView2);
            context2 = context;
            colors2 = colors;
            listListOf2 = list;
            i2 = i3;
            i = -1;
            f = 14.0f;
        }
        linearLayout.addView(linearLayout2);
        return linearLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createAppearanceSelector$lambda$20$lambda$19$lambda$18(Context context, String str, LinearLayout linearLayout, List list, M3Colors m3Colors, View view) {
        LogBoxUtils.INSTANCE.setAppearanceMode(context, str);
        int childCount = linearLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = linearLayout.getChildAt(i);
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) childAt;
            boolean zAreEqual = Intrinsics.areEqual(list.get(i), str);
            textView.setBackground(LogBoxUtils.INSTANCE.createM3Background(context, zAreEqual ? m3Colors.getPrimaryContainer() : m3Colors.getSurfaceVariant(), 12.0f));
            textView.setTextColor(zAreEqual ? m3Colors.getOnPrimaryContainer() : m3Colors.getOnSurface());
        }
    }
}
