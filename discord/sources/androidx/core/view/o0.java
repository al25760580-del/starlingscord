package androidx.core.view;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class o0 {
    public static CharSequence a(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static boolean b(View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean c(View view) {
        return view.isScreenReaderFocusable();
    }

    public static void d(View view, boolean z5) {
        view.setAccessibilityHeading(z5);
    }

    public static void e(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void f(View view, boolean z5) {
        view.setScreenReaderFocusable(z5);
    }
}
