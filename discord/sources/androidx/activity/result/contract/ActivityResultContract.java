package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;
import g.a;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class ActivityResultContract {
    public abstract Intent a(Context context, Object obj);

    public a b(Context context, Object obj) {
        Intrinsics.checkNotNullParameter(context, "context");
        return null;
    }

    public abstract Object c(int i7, Intent intent);
}
