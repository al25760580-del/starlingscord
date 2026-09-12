package lg;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleArrayMap f15076a = new SimpleArrayMap(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SimpleArrayMap f15077b = new SimpleArrayMap(0);

    public static c a(Context context, int i7) {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i7);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return b(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return b(arrayList);
        } catch (Exception e10) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i7), e10);
            return null;
        }
    }

    public static c b(ArrayList arrayList) {
        c cVar = new c();
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            Animator animator = (Animator) arrayList.get(i7);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            cVar.f15077b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            d dVar = new d();
            dVar.f15081d = 0;
            dVar.f15082e = 1;
            dVar.f15078a = startDelay;
            dVar.f15079b = duration;
            dVar.f15080c = interpolator;
            dVar.f15081d = objectAnimator.getRepeatCount();
            dVar.f15082e = objectAnimator.getRepeatMode();
            cVar.f15076a.put(propertyName, dVar);
        }
        return cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return this.f15076a.equals(((c) obj).f15076a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15076a.hashCode();
    }

    public final String toString() {
        return ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + c.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f15076a + "}\n";
    }
}
