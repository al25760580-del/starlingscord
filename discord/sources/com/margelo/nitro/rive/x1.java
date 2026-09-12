package com.margelo.nitro.rive;

import android.util.Log;
import app.rive.runtime.kotlin.core.FileAsset;
import app.rive.runtime.kotlin.core.ImageAsset;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fr.d f6998a;

    public x1() {
        hr.e eVar = ar.k0.f2938a;
        hr.d dVar = hr.d.f11103i;
        ar.q1 q1Var = new ar.q1();
        dVar.getClass();
        this.f6998a = ar.b0.b(kotlin.coroutines.e.c(dVar, q1Var));
    }

    public final ar.p a(ResolvedReferencedAsset resolvedReferencedAsset, FileAsset fileAsset) {
        ar.p pVarA = ar.b0.a();
        if (resolvedReferencedAsset.getImage() != null) {
            HybridRiveImageSpec image = resolvedReferencedAsset.getImage();
            if ((fileAsset instanceof ImageAsset) && (image instanceof HybridRiveImage)) {
                ((ImageAsset) fileAsset).setImage(((HybridRiveImage) image).getRenderImage());
            }
            pVarA.S(Unit.f14616a);
            return pVarA;
        }
        try {
            p pVarU = com.facebook.imagepipeline.nativecode.b.u(resolvedReferencedAsset);
            if (pVarU == null) {
                pVarA.S(Unit.f14616a);
                return pVarA;
            }
            ar.b0.t(this.f6998a, null, new androidx.lifecycle.f0(pVarU, this, fileAsset, pVarA, (Continuation) null, 1), 3);
            return pVarA;
        } catch (Exception e10) {
            Log.e("ReferencedAssetLoader", "Failed to resolve asset: " + e10.getMessage());
            pVarA.S(Unit.f14616a);
            return pVarA;
        }
    }
}
