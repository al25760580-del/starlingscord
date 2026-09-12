package com.margelo.nitro.rive;

import app.rive.runtime.kotlin.core.FileAsset;
import app.rive.runtime.kotlin.core.FileAssetLoader;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class v1 extends FileAssetLoader {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Map f6987d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f6988e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ x1 f6989i;

    public v1(Map map, LinkedHashMap linkedHashMap, x1 x1Var) {
        this.f6987d = map;
        this.f6988e = linkedHashMap;
        this.f6989i = x1Var;
    }

    @Override // app.rive.runtime.kotlin.core.FileAssetLoader
    public final boolean loadContents(FileAsset asset, byte[] inBandBytes) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(inBandBytes, "inBandBytes");
        String uniqueFilename = asset.getUniqueFilename();
        String strZ = StringsKt.Z(uniqueFilename, uniqueFilename);
        Map map = this.f6987d;
        ResolvedReferencedAsset resolvedReferencedAsset = (ResolvedReferencedAsset) map.get(strZ);
        if (resolvedReferencedAsset == null) {
            strZ = asset.getName();
            resolvedReferencedAsset = (ResolvedReferencedAsset) map.get(asset.getName());
        }
        if (resolvedReferencedAsset == null) {
            return false;
        }
        this.f6988e.put(strZ, asset);
        this.f6989i.a(resolvedReferencedAsset, asset);
        return true;
    }
}
