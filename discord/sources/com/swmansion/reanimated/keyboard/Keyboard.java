package com.swmansion.reanimated.keyboard;

import androidx.core.view.WindowInsetsCompat;
import com.facebook.react.uimanager.PixelUtil;

/* JADX INFO: loaded from: classes3.dex */
public class Keyboard {
    private static final int CONTENT_TYPE_MASK = 8;
    private static final int SYSTEM_BAR_TYPE_MASK = 519;
    private KeyboardState mState = KeyboardState.UNKNOWN;
    private int mHeight = 0;
    private int mActiveTransitionCounter = 0;

    public int getHeight() {
        return this.mHeight;
    }

    public KeyboardState getState() {
        return this.mState;
    }

    public void onAnimationEnd() {
        int i7 = this.mActiveTransitionCounter - 1;
        this.mActiveTransitionCounter = i7;
        if (i7 == 0) {
            this.mState = this.mHeight <= 0 ? KeyboardState.CLOSED : KeyboardState.OPEN;
        }
    }

    public void onAnimationStart() {
        int i7 = this.mActiveTransitionCounter;
        if (i7 > 0) {
            KeyboardState keyboardState = this.mState;
            KeyboardState keyboardState2 = KeyboardState.OPENING;
            if (keyboardState == keyboardState2) {
                keyboardState2 = KeyboardState.CLOSING;
            }
            this.mState = keyboardState2;
        } else {
            this.mState = this.mHeight <= 0 ? KeyboardState.OPENING : KeyboardState.CLOSING;
        }
        this.mActiveTransitionCounter = i7 + 1;
    }

    public void updateHeight(WindowInsetsCompat windowInsetsCompat, boolean z5) {
        int i7;
        int i10 = windowInsetsCompat.f1605a.f(CONTENT_TYPE_MASK).f1559d;
        if (z5) {
            i7 = 0;
        } else {
            i7 = windowInsetsCompat.f1605a.f(SYSTEM_BAR_TYPE_MASK).f1559d;
        }
        int dIPFromPixel = (int) PixelUtil.toDIPFromPixel(Math.max(0, i10 - i7));
        if (dIPFromPixel > 0 || this.mState != KeyboardState.OPEN) {
            this.mHeight = dIPFromPixel;
        }
    }
}
