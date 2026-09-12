package com.discord.react_gesture_handler.accessibility_focus;

import android.annotation.SuppressLint;
import android.content.Context;
import com.facebook.react.views.view.ReactViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o5.a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/discord/react_gesture_handler/accessibility_focus/AccessibilityFocusViewGroup;", "Lcom/facebook/react/views/view/ReactViewGroup;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "onAccessibilityFocus", "Lkotlin/Function0;", "", "getOnAccessibilityFocus", "()Lkotlin/jvm/functions/Function0;", "setOnAccessibilityFocus", "(Lkotlin/jvm/functions/Function0;)V", "onAccessibilityBlur", "getOnAccessibilityBlur", "setOnAccessibilityBlur", "sendAccessibilityEvent", "eventType", "", "react_gesture_handler_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
public final class AccessibilityFocusViewGroup extends ReactViewGroup {

    @NotNull
    private Function0<Unit> onAccessibilityBlur;

    @NotNull
    private Function0<Unit> onAccessibilityFocus;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccessibilityFocusViewGroup(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.onAccessibilityFocus = new a(4);
        this.onAccessibilityBlur = new a(5);
    }

    @NotNull
    public final Function0<Unit> getOnAccessibilityBlur() {
        return this.onAccessibilityBlur;
    }

    @NotNull
    public final Function0<Unit> getOnAccessibilityFocus() {
        return this.onAccessibilityFocus;
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEvent(int eventType) {
        super.sendAccessibilityEvent(eventType);
        if (eventType == 32768) {
            this.onAccessibilityFocus.invoke();
        } else {
            if (eventType != 65536) {
                return;
            }
            this.onAccessibilityBlur.invoke();
        }
    }

    public final void setOnAccessibilityBlur(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onAccessibilityBlur = function0;
    }

    public final void setOnAccessibilityFocus(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onAccessibilityFocus = function0;
    }
}
