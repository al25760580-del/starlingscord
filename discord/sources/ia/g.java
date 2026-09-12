package ia;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.common.internal.Supplier;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.cache.DefaultCacheKeyFactory;
import com.facebook.imagepipeline.core.DefaultExecutorSupplier;
import com.facebook.imagepipeline.core.DownsampleMode;
import com.facebook.imagepipeline.producers.c1;
import com.facebook.imagepipeline.producers.z0;
import pa.n;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContentResolver f11429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources f11430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AssetManager f11431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f11432d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final la.b f11433e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u4.c f11434f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DownsampleMode f11435g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f11436h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e f11437i;
    public final e4.e j;
    public final Supplier k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ga.i f11438l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ga.i f11439m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final DefaultCacheKeyFactory f11440n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final PlatformBitmapFactory f11441o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final u4.c f11442p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f11443q;

    public g(Context context, n nVar, o9.c cVar, u4.c cVar2, DownsampleMode downsampleMode, boolean z5, e eVar, e4.e eVar2, e4.e eVar3, e4.e eVar4, Supplier supplier, DefaultCacheKeyFactory defaultCacheKeyFactory, PlatformBitmapFactory platformBitmapFactory, u4.c cVar3, int i7) {
        this.f11429a = context.getApplicationContext().getContentResolver();
        this.f11430b = context.getApplicationContext().getResources();
        this.f11431c = context.getApplicationContext().getAssets();
        this.f11432d = nVar;
        this.f11433e = cVar;
        this.f11434f = cVar2;
        this.f11435g = downsampleMode;
        this.f11436h = z5;
        this.f11437i = eVar;
        this.j = eVar2;
        this.f11439m = eVar3;
        this.f11438l = eVar4;
        this.k = supplier;
        this.f11440n = defaultCacheKeyFactory;
        this.f11441o = platformBitmapFactory;
        new vi.d(i7);
        new vi.d(i7);
        this.f11443q = RecyclerView.ItemAnimator.FLAG_MOVED;
        this.f11442p = cVar3;
    }

    public final c1 a(z0 z0Var, boolean z5, ta.b bVar) {
        return new c1(((DefaultExecutorSupplier) this.f11437i).f4826c, this.j, z0Var, z5, bVar);
    }
}
