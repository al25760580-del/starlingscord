package nh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f16874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f16875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TextView f16876d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f16877e;

    public p(r rVar, int i7, TextView textView, int i10, TextView textView2) {
        this.f16877e = rVar;
        this.f16873a = i7;
        this.f16874b = textView;
        this.f16875c = i10;
        this.f16876d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AppCompatTextView appCompatTextView;
        int i7 = this.f16873a;
        r rVar = this.f16877e;
        rVar.f16890n = i7;
        rVar.f16888l = null;
        TextView textView = this.f16874b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f16875c == 1 && (appCompatTextView = rVar.f16894r) != null) {
                appCompatTextView.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f16876d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f16876d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
