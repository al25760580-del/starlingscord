package com.facebook.imagepipeline.producers;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.Resources;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 extends o0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5004c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f5005d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(Executor executor, e4.e pooledByteBufferFactory, AssetManager assetManager) {
        super(executor, pooledByteBufferFactory);
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(pooledByteBufferFactory, "pooledByteBufferFactory");
        Intrinsics.checkNotNullParameter(assetManager, "assetManager");
        this.f5005d = assetManager;
    }

    @Override // com.facebook.imagepipeline.producers.o0
    public final EncodedImage d(ImageRequest imageRequest) throws IOException {
        int length;
        int length2;
        switch (this.f5004c) {
            case 0:
                Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
                AssetManager assetManager = (AssetManager) this.f5005d;
                String path = imageRequest.getSourceUri().getPath();
                Intrinsics.checkNotNull(path);
                String strSubstring = path.substring(1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                InputStream inputStreamOpen = assetManager.open(strSubstring, 2);
                AssetFileDescriptor assetFileDescriptorOpenFd = null;
                try {
                    String path2 = imageRequest.getSourceUri().getPath();
                    Intrinsics.checkNotNull(path2);
                    String strSubstring2 = path2.substring(1);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                    assetFileDescriptorOpenFd = assetManager.openFd(strSubstring2);
                    length = (int) assetFileDescriptorOpenFd.getLength();
                    try {
                        assetFileDescriptorOpenFd.close();
                        break;
                    } catch (IOException unused) {
                    }
                } catch (IOException unused2) {
                    if (assetFileDescriptorOpenFd != null) {
                        try {
                            assetFileDescriptorOpenFd.close();
                            break;
                        } catch (IOException unused3) {
                        }
                    }
                    length = -1;
                } catch (Throwable th2) {
                    if (assetFileDescriptorOpenFd != null) {
                        try {
                            assetFileDescriptorOpenFd.close();
                            break;
                        } catch (IOException unused4) {
                        }
                    }
                    throw th2;
                }
                return c(inputStreamOpen, length);
            default:
                Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
                Resources resources = (Resources) this.f5005d;
                InputStream inputStreamOpenRawResource = resources.openRawResource(vi.d.b(imageRequest));
                AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = null;
                try {
                    assetFileDescriptorOpenRawResourceFd = resources.openRawResourceFd(vi.d.b(imageRequest));
                    length2 = (int) assetFileDescriptorOpenRawResourceFd.getLength();
                    try {
                        assetFileDescriptorOpenRawResourceFd.close();
                        break;
                    } catch (IOException unused5) {
                    }
                } catch (Resources.NotFoundException unused6) {
                    if (assetFileDescriptorOpenRawResourceFd != null) {
                        try {
                            assetFileDescriptorOpenRawResourceFd.close();
                            break;
                        } catch (IOException unused7) {
                        }
                    }
                    length2 = -1;
                } catch (Throwable th3) {
                    if (assetFileDescriptorOpenRawResourceFd != null) {
                        try {
                            assetFileDescriptorOpenRawResourceFd.close();
                            break;
                        } catch (IOException unused8) {
                        }
                    }
                    throw th3;
                }
                return c(inputStreamOpenRawResource, length2);
        }
    }

    @Override // com.facebook.imagepipeline.producers.o0
    public final String e() {
        switch (this.f5004c) {
            case 0:
                return "LocalAssetFetchProducer";
            default:
                return "LocalResourceFetchProducer";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(Executor executor, e4.e pooledByteBufferFactory, Resources resources) {
        super(executor, pooledByteBufferFactory);
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(pooledByteBufferFactory, "pooledByteBufferFactory");
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.f5005d = resources;
    }
}
