package ni;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class i implements Executor {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f16951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Handler f16952e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ i[] f16953i;

    static {
        i iVar = new i("INSTANCE", 0);
        f16951d = iVar;
        f16953i = new i[]{iVar};
        f16952e = new Handler(Looper.getMainLooper());
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f16953i.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f16952e.post(runnable);
    }
}
