package t3;

import android.app.Activity;
import android.os.Build;
import androidx.window.layout.WindowMetrics;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.ArrayList;
import kotlin.collections.r;
import kotlin.jvm.internal.Intrinsics;
import u3.e;
import u3.f;

/* JADX INFO: loaded from: classes.dex */
public final class c implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f20591b;

    public c() {
        e densityCompatHelper = Build.VERSION.SDK_INT >= 34 ? f.f20938b : u3.c.f20932f;
        Intrinsics.checkNotNullParameter(densityCompatHelper, "densityCompatHelper");
        this.f20591b = densityCompatHelper;
        Integer[] elements = {1, 2, 4, 8, 16, 32, 64, Integer.valueOf(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        new ArrayList(new r(elements, true));
    }

    public final WindowMetrics a(Activity activity) {
        u3.c cVar;
        Intrinsics.checkNotNullParameter(activity, "activity");
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 34) {
            cVar = u3.c.f20934h;
        } else {
            cVar = i7 >= 30 ? u3.c.f20933g : u3.c.f20935i;
        }
        return cVar.c(activity, this.f20591b);
    }
}
