package com.discord.external_pip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import c6.a;
import com.discord.misc.utilities.activity.ActivityExtensionsKt;
import com.discord.theme.ThemeManagerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¨\u0006\u000f"}, d2 = {"Lcom/discord/external_pip/ExternalPipTransitionView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "fadeOut", "", "animDelay", "", "animDuration", "onComplete", "Lkotlin/Function0;", "", "Companion", "external_pip_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ExternalPipTransitionView extends View {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final String transitionViewTag = "ExternalPipTransitionView";

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007J\u001a\u0010\u000b\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\rH\u0007R\u0016\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/discord/external_pip/ExternalPipTransitionView$Companion;", "", "<init>", "()V", "transitionViewTag", "", "kotlin.jvm.PlatformType", "tryShow", "", "activity", "Landroid/app/Activity;", "tryHide", "animate", "", "external_pip_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit tryHide$lambda$0(ViewGroup viewGroup, ExternalPipTransitionView externalPipTransitionView) {
            viewGroup.removeView(externalPipTransitionView);
            return Unit.f14616a;
        }

        public final void tryHide(Activity activity, boolean animate) {
            ExternalPipTransitionView externalPipTransitionView;
            View rootView = activity != null ? ActivityExtensionsKt.getRootView(activity) : null;
            ViewGroup viewGroup = rootView instanceof ViewGroup ? (ViewGroup) rootView : null;
            if (viewGroup == null || (externalPipTransitionView = (ExternalPipTransitionView) viewGroup.findViewWithTag(ExternalPipTransitionView.transitionViewTag)) == null) {
                return;
            }
            if (animate) {
                ExternalPipTransitionView.fadeOut$default(externalPipTransitionView, 0L, 0L, new a(13, viewGroup, externalPipTransitionView), 3, null);
            } else {
                viewGroup.removeView(externalPipTransitionView);
            }
        }

        public final void tryShow(Activity activity) {
            tryHide(activity, false);
            View rootView = activity != null ? ActivityExtensionsKt.getRootView(activity) : null;
            ViewGroup viewGroup = rootView instanceof ViewGroup ? (ViewGroup) rootView : null;
            if (viewGroup == null) {
                return;
            }
            Context context = viewGroup.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            viewGroup.addView(new ExternalPipTransitionView(context));
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExternalPipTransitionView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSurfaceHigh());
        setTag(transitionViewTag);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    }

    private final boolean fadeOut(long animDelay, long animDuration, Function0<Unit> onComplete) {
        return postDelayed(new app.rive.core.a(this, animDuration, onComplete, 1), animDelay);
    }

    public static /* synthetic */ boolean fadeOut$default(ExternalPipTransitionView externalPipTransitionView, long j, long j5, Function0 function0, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            j = externalPipTransitionView.getResources().getInteger(android.R.integer.config_shortAnimTime);
        }
        long j7 = j;
        if ((i7 & 2) != 0) {
            j5 = externalPipTransitionView.getResources().getInteger(android.R.integer.config_mediumAnimTime);
        }
        return externalPipTransitionView.fadeOut(j7, j5, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fadeOut$lambda$0(ExternalPipTransitionView externalPipTransitionView, long j, final Function0 function0) {
        externalPipTransitionView.animate().alpha(0.0f).setDuration(j).setListener(new AnimatorListenerAdapter() { // from class: com.discord.external_pip.ExternalPipTransitionView$fadeOut$1$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                function0.invoke();
            }
        });
    }
}
