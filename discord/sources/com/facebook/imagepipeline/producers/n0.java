package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.media.ThumbnailUtils;
import android.os.ParcelFileDescriptor;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import org.webrtc.MediaStreamTrack;

/* JADX INFO: loaded from: classes3.dex */
public final class n0 extends e1 {
    public final /* synthetic */ ProducerContext E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ z0 G;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f5034x = 2;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ a1 f5035y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(Consumer consumer, a1 a1Var, ProducerContext producerContext, f1 f1Var) {
        super(consumer, a1Var, producerContext, "BackgroundThreadHandoffProducer");
        this.F = consumer;
        this.f5035y = a1Var;
        this.E = producerContext;
        this.G = f1Var;
    }

    @Override // com.facebook.imagepipeline.producers.e1
    public final void b(Object obj) {
        switch (this.f5034x) {
            case 0:
                EncodedImage.closeSafely((EncodedImage) obj);
                break;
            case 1:
                CloseableReference.l((CloseableReference) obj);
                break;
        }
    }

    @Override // com.facebook.imagepipeline.producers.e1
    public Map c(Object obj) {
        switch (this.f5034x) {
            case 1:
                return n8.e.a("createdThumbnail", String.valueOf(((CloseableReference) obj) != null));
            default:
                return super.c(obj);
        }
    }

    @Override // com.facebook.imagepipeline.producers.e1
    public final Object d() throws Throwable {
        String strA;
        Bitmap bitmapCreateVideoThumbnail;
        MediaMetadataRetriever mediaMetadataRetriever;
        Bitmap frameAtTime;
        int i7 = this.f5034x;
        int i10 = 1;
        Object obj = this.F;
        z0 z0Var = this.G;
        ProducerContext producerContext = this.E;
        MediaMetadataRetriever mediaMetadataRetriever2 = null;
        switch (i7) {
            case 0:
                o0 o0Var = (o0) z0Var;
                EncodedImage encodedImageD = o0Var.d((ImageRequest) obj);
                a1 a1Var = this.f5035y;
                if (encodedImageD == null) {
                    a1Var.b(producerContext, o0Var.e(), false);
                    producerContext.n("local", "fetch");
                    return null;
                }
                encodedImageD.parseMetaData();
                a1Var.b(producerContext, o0Var.e(), true);
                producerContext.n("local", "fetch");
                producerContext.B(encodedImageD.getColorSpace(), "image_color_space");
                return encodedImageD;
            case 1:
                ContentResolver contentResolver = ((q0) z0Var).f5060c;
                ImageRequest imageRequest = (ImageRequest) obj;
                try {
                    strA = v8.a.a(contentResolver, imageRequest.getSourceUri());
                    break;
                } catch (IllegalArgumentException unused) {
                    strA = null;
                }
                if (strA != null) {
                    if (imageRequest.getPreferredWidth() <= 96 && imageRequest.getPreferredHeight() <= 96) {
                        i10 = 3;
                    }
                    bitmapCreateVideoThumbnail = ThumbnailUtils.createVideoThumbnail(strA, i10);
                } else {
                    bitmapCreateVideoThumbnail = null;
                }
                if (bitmapCreateVideoThumbnail == null) {
                    try {
                        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(imageRequest.getSourceUri(), "r");
                        parcelFileDescriptorOpenFileDescriptor.getClass();
                        mediaMetadataRetriever = new MediaMetadataRetriever();
                        try {
                            mediaMetadataRetriever.setDataSource(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                            frameAtTime = mediaMetadataRetriever.getFrameAtTime(-1L);
                            try {
                                mediaMetadataRetriever.release();
                                break;
                            } catch (IOException unused2) {
                            }
                        } catch (FileNotFoundException unused3) {
                            if (mediaMetadataRetriever != null) {
                                try {
                                    mediaMetadataRetriever.release();
                                    break;
                                } catch (IOException unused4) {
                                }
                            }
                            frameAtTime = null;
                        } catch (Throwable th2) {
                            th = th2;
                            mediaMetadataRetriever2 = mediaMetadataRetriever;
                            if (mediaMetadataRetriever2 != null) {
                                try {
                                    mediaMetadataRetriever2.release();
                                    break;
                                } catch (IOException unused5) {
                                }
                            }
                            throw th;
                        }
                    } catch (FileNotFoundException unused6) {
                        mediaMetadataRetriever = null;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    bitmapCreateVideoThumbnail = frameAtTime;
                }
                if (bitmapCreateVideoThumbnail == null) {
                    return null;
                }
                io.sentry.hints.j jVarC = io.sentry.hints.j.C();
                na.j jVar = na.j.f16536d;
                int i11 = na.g.F;
                na.g gVar = new na.g(bitmapCreateVideoThumbnail, jVarC, jVar);
                producerContext.B("thumbnail", "image_format");
                gVar.q(producerContext.getExtras());
                return CloseableReference.B(gVar);
            default:
                return null;
        }
    }

    @Override // com.facebook.imagepipeline.producers.e1
    public void f(Exception exc) {
        switch (this.f5034x) {
            case 1:
                super.f(exc);
                a1 a1Var = this.f5035y;
                ProducerContext producerContext = this.E;
                a1Var.b(producerContext, "VideoThumbnailProducer", false);
                producerContext.n("local", MediaStreamTrack.VIDEO_TRACK_KIND);
                break;
            default:
                super.f(exc);
                break;
        }
    }

    @Override // com.facebook.imagepipeline.producers.e1
    public void g(Object obj) {
        switch (this.f5034x) {
            case 1:
                CloseableReference closeableReference = (CloseableReference) obj;
                super.g(closeableReference);
                boolean z5 = closeableReference != null;
                a1 a1Var = this.f5035y;
                ProducerContext producerContext = this.E;
                a1Var.b(producerContext, "VideoThumbnailProducer", z5);
                producerContext.n("local", MediaStreamTrack.VIDEO_TRACK_KIND);
                break;
            case 2:
                a1 a1Var2 = this.f5035y;
                ProducerContext producerContext2 = this.E;
                a1Var2.i(producerContext2, "BackgroundThreadHandoffProducer", null);
                ((f1) this.G).f4984b.b((Consumer) this.F, producerContext2);
                break;
            default:
                super.g(obj);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(o0 o0Var, Consumer consumer, a1 a1Var, ProducerContext producerContext, String str, ImageRequest imageRequest, a1 a1Var2, ProducerContext producerContext2) {
        super(consumer, a1Var, producerContext, str);
        this.G = o0Var;
        this.F = imageRequest;
        this.f5035y = a1Var2;
        this.E = producerContext2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(q0 q0Var, Consumer consumer, a1 a1Var, ProducerContext producerContext, a1 a1Var2, ProducerContext producerContext2, ImageRequest imageRequest) {
        super(consumer, a1Var, producerContext, "VideoThumbnailProducer");
        this.G = q0Var;
        this.f5035y = a1Var2;
        this.E = producerContext2;
        this.F = imageRequest;
    }

    private final void h(Object obj) {
    }
}
