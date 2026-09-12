package com.discord.react_gesture_handler.passthrough_touch;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.views.view.ReactViewGroup;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o5.a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0017J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/discord/react_gesture_handler/passthrough_touch/PassthroughTouchViewGroup;", "Lcom/facebook/react/views/view/ReactViewGroup;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "onTouchDown", "Lkotlin/Function0;", "", "getOnTouchDown", "()Lkotlin/jvm/functions/Function0;", "setOnTouchDown", "(Lkotlin/jvm/functions/Function0;)V", "onTouchEvent", "", "event", "Landroid/view/MotionEvent;", "onInterceptTouchEvent", "react_gesture_handler_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PassthroughTouchViewGroup extends ReactViewGroup {

    @NotNull
    private Function0<Unit> onTouchDown;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassthroughTouchViewGroup(@NotNull Context context) throws IllegalAccessException, NoSuchFieldException {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Field declaredField = ReactViewGroup.class.getDeclaredField("mPointerEvents");
        declaredField.setAccessible(true);
        declaredField.set(this, PointerEvents.BOX_NONE);
        this.onTouchDown = new a(12);
    }

    @NotNull
    public final Function0<Unit> getOnTouchDown() {
        return this.onTouchDown;
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return false;
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() != 0) {
            return false;
        }
        this.onTouchDown.invoke();
        return false;
    }

    public final void setOnTouchDown(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onTouchDown = function0;
    }
}
