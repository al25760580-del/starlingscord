package com.facebook.imagepipeline.producers;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.image.EncodedImage;

/* JADX INFO: loaded from: classes3.dex */
public final class y extends r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ga.i f5102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CacheKey f5103d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f5104e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f5105f;

    public y(Consumer consumer, ga.i iVar, CacheKey cacheKey, boolean z5, boolean z6) {
        super(consumer);
        this.f5102c = iVar;
        this.f5103d = cacheKey;
        this.f5104e = z5;
        this.f5105f = z6;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.facebook.imagepipeline.producers.c
    public final void h(int i7, Object obj) {
        EncodedImage encodedImage = (EncodedImage) obj;
        try {
            sa.a.w();
            boolean zE = c.e(i7);
            Consumer consumer = this.f5061b;
            if (!zE && encodedImage != null) {
                if (!((i7 & 10) != 0) && encodedImage.getImageFormat() != z9.c.f23631c) {
                    CloseableReference byteBufferRef = encodedImage.getByteBufferRef();
                    if (byteBufferRef != null) {
                        try {
                            CloseableReference closeableReferenceE = (this.f5105f && this.f5104e) ? this.f5102c.e(this.f5103d, byteBufferRef) : null;
                            byteBufferRef.close();
                            if (closeableReferenceE != null) {
                                try {
                                    EncodedImage encodedImage2 = new EncodedImage(closeableReferenceE);
                                    encodedImage2.copyMetaDataFrom(encodedImage);
                                    closeableReferenceE.close();
                                    try {
                                        consumer.c(1.0f);
                                        consumer.b(i7, encodedImage2);
                                        EncodedImage.closeSafely(encodedImage2);
                                        sa.a.w();
                                        return;
                                    } catch (Throwable th2) {
                                        EncodedImage.closeSafely(encodedImage2);
                                        throw th2;
                                    }
                                } catch (Throwable th3) {
                                    closeableReferenceE.close();
                                    throw th3;
                                }
                            }
                        } catch (Throwable th4) {
                            byteBufferRef.close();
                            throw th4;
                        }
                    }
                    consumer.b(i7, encodedImage);
                    sa.a.w();
                    return;
                }
            }
            consumer.b(i7, encodedImage);
            sa.a.w();
        } catch (Throwable th5) {
            sa.a.w();
            throw th5;
        }
    }
}
