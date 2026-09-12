package com.swmansion.reanimated.layoutReanimation;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public interface NativeMethodsHolder {
    void cancelAnimation(int i7);

    void checkDuplicateSharedTag(int i7, int i10);

    void clearAnimationConfig(int i7);

    int findPrecedingViewTagForTransition(int i7);

    int[] getSharedGroup(int i7);

    boolean hasAnimation(int i7, int i10);

    boolean isLayoutAnimationEnabled();

    boolean shouldAnimateExiting(int i7, boolean z5);

    void startAnimation(int i7, int i10, HashMap<String, Object> map);
}
