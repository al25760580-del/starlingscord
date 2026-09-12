package c9;

import android.content.Context;
import android.content.res.Resources;
import androidx.appcompat.widget.b4;
import com.facebook.common.internal.Supplier;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import com.facebook.imagepipeline.core.DefaultExecutorSupplier;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import l8.d;
import l8.e;
import n8.i;
import sh.t1;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImagePipeline f3545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b4 f3546c;

    /* JADX WARN: Type inference failed for: r10v3, types: [t9.a] */
    /* JADX WARN: Type inference failed for: r9v1, types: [t9.a] */
    public c(Context context, u4.c cVar) {
        e9.b bVar;
        t1 t1Var;
        com.facebook.imagepipeline.core.c cVar2 = com.facebook.imagepipeline.core.c.f4894p;
        i.d(cVar2, "ImagePipelineFactory was not initialized!");
        this.f3544a = context;
        ImagePipeline imagePipelineE = cVar2.e();
        this.f3545b = imagePipelineE;
        b4 b4Var = new b4();
        this.f3546c = b4Var;
        Resources resources = context.getResources();
        synchronized (e9.b.class) {
            try {
                if (e9.b.f8108x == null) {
                    e9.b.f8108x = new e9.b();
                }
                bVar = e9.b.f8108x;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        AnimatedFactoryV2Impl animatedFactoryV2ImplA = cVar2.a();
        if (animatedFactoryV2ImplA == null) {
            t1Var = null;
        } else {
            if (animatedFactoryV2ImplA.f4739h == null) {
                final int i7 = 0;
                ?? r10 = new Supplier() { // from class: t9.a
                    @Override // com.facebook.common.internal.Supplier
                    public final Object get() {
                        int i10;
                        switch (i7) {
                            case 0:
                                i10 = 2;
                                break;
                            default:
                                i10 = 3;
                                break;
                        }
                        return Integer.valueOf(i10);
                    }
                };
                d dVar = animatedFactoryV2ImplA.f4740i;
                d bVar2 = dVar == null ? new l8.b(((DefaultExecutorSupplier) animatedFactoryV2ImplA.f4733b).f4825b) : dVar;
                final int i10 = 1;
                ?? r11 = new Supplier() { // from class: t9.a
                    @Override // com.facebook.common.internal.Supplier
                    public final Object get() {
                        int i11;
                        switch (i10) {
                            case 0:
                                i11 = 2;
                                break;
                            default:
                                i11 = 3;
                                break;
                        }
                        return Integer.valueOf(i11);
                    }
                };
                if (animatedFactoryV2ImplA.f4737f == null) {
                    animatedFactoryV2ImplA.f4737f = new op.c(8, animatedFactoryV2ImplA);
                }
                animatedFactoryV2ImplA.f4739h = new t1(animatedFactoryV2ImplA.f4737f, e.f(), bVar2, RealtimeSinceBootClock.get(), animatedFactoryV2ImplA.f4732a, animatedFactoryV2ImplA.f4734c, r10, r11, new j8.c(1, Boolean.valueOf(animatedFactoryV2ImplA.k)), new j8.c(1, Boolean.valueOf(animatedFactoryV2ImplA.f4735d)), new j8.c(1, Integer.valueOf(animatedFactoryV2ImplA.j)), new j8.c(1, Integer.valueOf(animatedFactoryV2ImplA.f4741l)));
            }
            t1Var = animatedFactoryV2ImplA.f4739h;
        }
        k8.a aVar = ((ImagePipelineConfig) cVar2.f4897b).f4860u.j ? new k8.a() : null;
        e eVarF = e.f();
        ga.i iVar = imagePipelineE.f4838f;
        j8.c cVar3 = cVar != null ? (j8.c) cVar.f20946d : null;
        b4Var.f909d = resources;
        b4Var.f910e = bVar;
        b4Var.f911i = t1Var;
        b4Var.f912v = aVar;
        b4Var.f913w = eVarF;
        b4Var.f914x = iVar;
        b4Var.f915y = cVar3;
    }

    @Override // com.facebook.common.internal.Supplier
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final PipelineDraweeControllerBuilder get() {
        return new PipelineDraweeControllerBuilder(this.f3544a, this.f3546c, this.f3545b);
    }
}
