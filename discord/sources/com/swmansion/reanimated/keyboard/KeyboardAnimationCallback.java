package com.swmansion.reanimated.keyboard;

import androidx.annotation.NonNull;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.f1;
import androidx.core.view.g1;
import androidx.core.view.p1;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class KeyboardAnimationCallback extends g1 {
    private static final int CONTENT_TYPE_MASK = 8;
    private final boolean mIsNavigationBarTranslucent;
    private final Keyboard mKeyboard;
    private final NotifyAboutKeyboardChangeFunction mNotifyAboutKeyboardChange;

    public KeyboardAnimationCallback(Keyboard keyboard, NotifyAboutKeyboardChangeFunction notifyAboutKeyboardChangeFunction, boolean z5) {
        super(1);
        this.mNotifyAboutKeyboardChange = notifyAboutKeyboardChangeFunction;
        this.mIsNavigationBarTranslucent = z5;
        this.mKeyboard = keyboard;
    }

    private static boolean isKeyboardAnimation(@NonNull p1 p1Var) {
        return (p1Var.f1715a.c() & CONTENT_TYPE_MASK) != 0;
    }

    @Override // androidx.core.view.g1
    public void onEnd(@NonNull p1 p1Var) {
        if (isKeyboardAnimation(p1Var)) {
            this.mKeyboard.onAnimationEnd();
            this.mNotifyAboutKeyboardChange.call();
        }
    }

    @Override // androidx.core.view.g1
    @NonNull
    public WindowInsetsCompat onProgress(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull List<p1> list) {
        Iterator<p1> it = list.iterator();
        while (it.hasNext()) {
            if (isKeyboardAnimation(it.next())) {
                this.mKeyboard.updateHeight(windowInsetsCompat, this.mIsNavigationBarTranslucent);
                this.mNotifyAboutKeyboardChange.call();
                break;
            }
        }
        return windowInsetsCompat;
    }

    @Override // androidx.core.view.g1
    @NonNull
    public f1 onStart(@NonNull p1 p1Var, @NonNull f1 f1Var) {
        if (!isKeyboardAnimation(p1Var)) {
            return f1Var;
        }
        this.mKeyboard.onAnimationStart();
        this.mNotifyAboutKeyboardChange.call();
        return f1Var;
    }
}
