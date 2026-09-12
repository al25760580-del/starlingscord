package q9;

import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ConcurrentHashMap f18661d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlatformBitmapFactory f18662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18664c;

    public e(PlatformBitmapFactory platformBitmapFactory, int i7, int i10) {
        Intrinsics.checkNotNullParameter(platformBitmapFactory, "platformBitmapFactory");
        this.f18662a = platformBitmapFactory;
        this.f18663b = i7;
        this.f18664c = i10;
    }
}
