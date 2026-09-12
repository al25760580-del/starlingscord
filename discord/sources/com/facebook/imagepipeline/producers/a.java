package com.facebook.imagepipeline.producers;

import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.image.EncodedImage;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4939c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Consumer consumer, int i7) {
        super(consumer);
        this.f4939c = i7;
    }

    @Override // com.facebook.imagepipeline.producers.c
    public final void h(int i7, Object obj) throws Throwable {
        switch (this.f4939c) {
            case 0:
                EncodedImage encodedImage = (EncodedImage) obj;
                Consumer consumer = this.f5061b;
                if (encodedImage == null) {
                    consumer.b(i7, null);
                    return;
                }
                if (!EncodedImage.isMetaDataAvailable(encodedImage)) {
                    encodedImage.parseMetaData();
                }
                consumer.b(i7, encodedImage);
                return;
            case 1:
                CloseableReference closeableReference = (CloseableReference) obj;
                if (c.e(i7)) {
                    return;
                }
                this.f5061b.b(i7, closeableReference);
                return;
            case 2:
                EncodedImage encodedImage2 = (EncodedImage) obj;
                CloseableReference byteBufferRef = null;
                try {
                    if (EncodedImage.isValid(encodedImage2) && encodedImage2 != null) {
                        byteBufferRef = encodedImage2.getByteBufferRef();
                    }
                    this.f5061b.b(i7, byteBufferRef);
                    return;
                } finally {
                    CloseableReference.l(byteBufferRef);
                }
            default:
                if (c.d(i7)) {
                    this.f5061b.b(i7, null);
                    return;
                }
                return;
        }
    }
}
