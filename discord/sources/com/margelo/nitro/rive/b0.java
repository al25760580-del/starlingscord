package com.margelo.nitro.rive;

import java.nio.ByteBuffer;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 extends xn.h implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ByteBuffer f6911d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ HybridRiveFileFactory f6912e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ReferencedAssetsType f6913i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(ByteBuffer byteBuffer, HybridRiveFileFactory hybridRiveFileFactory, ReferencedAssetsType referencedAssetsType, Continuation continuation) {
        super(1, continuation);
        this.f6911d = byteBuffer;
        this.f6912e = hybridRiveFileFactory;
        this.f6913i = referencedAssetsType;
    }

    @Override // xn.a
    public final Continuation create(Continuation continuation) {
        return new b0(this.f6911d, this.f6912e, this.f6913i, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((b0) create((Continuation) obj)).invokeSuspend(Unit.f14616a);
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        ByteBuffer byteBuffer = this.f6911d;
        wn.a aVar = wn.a.f22354d;
        ib.a.L(obj);
        try {
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            s sVarBuildRiveFile = this.f6912e.buildRiveFile(bArr, this.f6913i);
            HybridRiveFile hybridRiveFile = new HybridRiveFile();
            hybridRiveFile.setRiveFile(sVarBuildRiveFile.f6975a);
            hybridRiveFile.setReferencedAssetCache(sVarBuildRiveFile.f6976b);
            hybridRiveFile.setAssetLoader(sVarBuildRiveFile.f6977c);
            return hybridRiveFile;
        } catch (Exception e10) {
            throw new Error(a3.e.l("Failed to load Rive file from bytes: ", e10.getMessage()));
        }
    }
}
