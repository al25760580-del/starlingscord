package com.discord.chat.presentation.list;

import android.R;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ar.u;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0000\u001a(\u0010\u0007\u001a\u00020\u0001*\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u00042\b\b\u0001\u0010\u000b\u001a\u00020\u0004H\u0002¨\u0006\f"}, d2 = {"chatListHighlightItemAtPosition", "", "Landroidx/recyclerview/widget/RecyclerView;", ViewProps.POSITION, "", "delayMilliseconds", "", "animateBackgroundColor", "Landroid/view/View;", "delay", "startColor", "endColor", "chat_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nChatListHighlightItemAtPosition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatListHighlightItemAtPosition.kt\ncom/discord/chat/presentation/list/ChatListHighlightItemAtPositionKt\n+ 2 Animator.kt\nandroidx/core/animation/AnimatorKt\n*L\n1#1,49:1\n85#2,18:50\n*S KotlinDebug\n*F\n+ 1 ChatListHighlightItemAtPosition.kt\ncom/discord/chat/presentation/list/ChatListHighlightItemAtPositionKt\n*L\n35#1:50,18\n*E\n"})
public final class ChatListHighlightItemAtPositionKt {
    private static final void animateBackgroundColor(final View view, final long j, final int i7, final int i10) {
        animateBackgroundColor$anim(j, view, i7, i10, new Function1() { // from class: com.discord.chat.presentation.list.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChatListHighlightItemAtPositionKt.animateBackgroundColor$lambda$3(i10, i7, j, view, (Animator) obj);
            }
        });
    }

    private static final void animateBackgroundColor$anim(long j, View view, int i7, int i10, final Function1<? super Animator, Unit> function1) {
        ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(i7, i10);
        valueAnimatorOfArgb.addUpdateListener(new c(0, view));
        Intrinsics.checkNotNull(valueAnimatorOfArgb);
        valueAnimatorOfArgb.addListener(new Animator.AnimatorListener() { // from class: com.discord.chat.presentation.list.ChatListHighlightItemAtPositionKt$animateBackgroundColor$anim$lambda$2$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                function1.invoke(animator);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        valueAnimatorOfArgb.setStartDelay(j + ((long) 100));
        valueAnimatorOfArgb.setDuration(600L);
        valueAnimatorOfArgb.start();
    }

    public static /* synthetic */ void animateBackgroundColor$anim$default(long j, View view, int i7, int i10, Function1 function1, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            function1 = new u(27);
        }
        animateBackgroundColor$anim(j, view, i7, i10, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit animateBackgroundColor$anim$lambda$0(Animator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateBackgroundColor$anim$lambda$2$lambda$1(View view, ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "valueAnimator");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        view.setBackgroundColor(((Integer) animatedValue).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit animateBackgroundColor$lambda$3(int i7, int i10, long j, View view, Animator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        animateBackgroundColor$anim$default(j, view, i7, i10, null, 16, null);
        return Unit.f14616a;
    }

    public static final void chatListHighlightItemAtPosition(@NotNull RecyclerView recyclerView, int i7, long j) {
        View viewFindViewByPosition;
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null || (viewFindViewByPosition = layoutManager.findViewByPosition(i7)) == null) {
            return;
        }
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        animateBackgroundColor(viewFindViewByPosition, j, ColorUtilsKt.getColorCompat(context, R.color.transparent), ThemeManagerKt.getTheme().getInteractiveBackgroundSelected());
    }

    public static /* synthetic */ void chatListHighlightItemAtPosition$default(RecyclerView recyclerView, int i7, long j, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j = 300;
        }
        chatListHighlightItemAtPosition(recyclerView, i7, j);
    }
}
