package x2;

import android.view.Choreographer;
import android.view.ViewTreeObserver;
import java.lang.reflect.Field;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Field f22596d;

    static {
        Field declaredField = Choreographer.class.getDeclaredField("mLastFrameTimeNanos");
        Intrinsics.checkNotNullExpressionValue(declaredField, "Choreographer::class.jav…ld(\"mLastFrameTimeNanos\")");
        f22596d = declaredField;
        declaredField.setAccessible(true);
    }
}
