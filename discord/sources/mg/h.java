package mg;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import com.facebook.react.uimanager.ViewProps;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f15786a = {R.attr.stateListAnimator};

    public static void a(f fVar, float f2) {
        int integer = fVar.getResources().getInteger(com.discord.R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = integer;
        stateListAnimator.addState(new int[]{R.attr.state_enabled, com.discord.R.attr.state_liftable, -2130969909}, ObjectAnimator.ofFloat(fVar, ViewProps.ELEVATION, 0.0f).setDuration(j));
        stateListAnimator.addState(new int[]{R.attr.state_enabled}, ObjectAnimator.ofFloat(fVar, ViewProps.ELEVATION, f2).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(fVar, ViewProps.ELEVATION, 0.0f).setDuration(0L));
        fVar.setStateListAnimator(stateListAnimator);
    }
}
