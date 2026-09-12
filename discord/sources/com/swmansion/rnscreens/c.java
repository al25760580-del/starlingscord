package com.swmansion.rnscreens;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.f3;
import androidx.appcompat.widget.m3;
import androidx.appcompat.widget.y2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends f3 {
    public y2 H0;
    public View.OnClickListener I0;
    public final m3 J0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, e0 fragment) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        b onBackPressedCallback = new b(this);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        m3 m3Var = new m3();
        m3Var.f1034c = fragment;
        m3Var.f1035d = onBackPressedCallback;
        m3Var.f1033b = true;
        this.J0 = m3Var;
        super.setOnSearchClickListener(new com.discord.chat.presentation.list.delegate.b(6, this));
        super.setOnCloseListener(new app.rive.runtime.kotlin.core.a(23, this));
        setMaxWidth(Integer.MAX_VALUE);
    }

    public final boolean getOverrideBackAction() {
        return this.J0.f1033b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f965p0) {
            return;
        }
        this.J0.d();
    }

    @Override // androidx.appcompat.widget.f3, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m3 m3Var = this.J0;
        if (m3Var.f1032a) {
            ((b) m3Var.f1035d).remove();
            m3Var.f1032a = false;
        }
    }

    @Override // androidx.appcompat.widget.f3
    public void setOnCloseListener(y2 y2Var) {
        this.H0 = y2Var;
    }

    @Override // androidx.appcompat.widget.f3
    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.I0 = onClickListener;
    }

    public final void setOverrideBackAction(boolean z5) {
        this.J0.f1033b = z5;
    }

    public final void setText(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        r(text);
    }
}
