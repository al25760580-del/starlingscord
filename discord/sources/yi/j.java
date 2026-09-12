package yi;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f23372b = TimeUnit.HOURS.toSeconds(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f23373c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static j f23374d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k8.a f23375a;

    public j(k8.a aVar) {
        this.f23375a = aVar;
    }

    public final boolean a(zi.a aVar) {
        if (TextUtils.isEmpty(aVar.f24009c)) {
            return true;
        }
        long j = aVar.f24012f + aVar.f24011e;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f23375a.getClass();
        return j < timeUnit.toSeconds(System.currentTimeMillis()) + f23372b;
    }
}
