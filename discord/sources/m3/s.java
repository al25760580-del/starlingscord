package m3;

import androidx.transition.Transition;

/* JADX INFO: loaded from: classes.dex */
public interface s {
    void onTransitionCancel(Transition transition);

    void onTransitionEnd(Transition transition);

    default void onTransitionEnd(Transition transition, boolean z5) {
        onTransitionEnd(transition);
    }

    void onTransitionPause(Transition transition);

    void onTransitionResume(Transition transition);

    void onTransitionStart(Transition transition);

    default void onTransitionStart(Transition transition, boolean z5) {
        onTransitionStart(transition);
    }
}
