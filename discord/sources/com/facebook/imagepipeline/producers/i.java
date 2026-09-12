package com.facebook.imagepipeline.producers;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.references.CloseableReference;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5000c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CacheKey f5001d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f5002e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f5003f;

    public i(Consumer consumer, CacheKey cacheKey, ga.i iVar, boolean z5) {
        super(consumer);
        this.f5001d = cacheKey;
        this.f5003f = iVar;
        this.f5002e = z5;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00ba A[Catch: all -> 0x0059, TRY_LEAVE, TryCatch #2 {all -> 0x0059, blocks: (B:26:0x0047, B:30:0x0055, B:35:0x0061, B:37:0x006d, B:42:0x007a, B:49:0x00a6, B:52:0x00ad, B:54:0x00b2, B:55:0x00b5, B:56:0x00b6, B:58:0x00ba, B:68:0x00d2, B:69:0x00d5, B:67:0x00ce, B:70:0x00d6, B:44:0x0080, B:46:0x009b, B:51:0x00aa, B:61:0x00c2, B:66:0x00cb), top: B:79:0x0047, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ca  */
    @Override // com.facebook.imagepipeline.producers.c
    public final void h(int i7, Object obj) {
        CloseableReference closeableReferenceE;
        CloseableReference closeableReference;
        switch (this.f5000c) {
            case 0:
                CloseableReference closeableReference2 = (CloseableReference) obj;
                ga.i iVar = ((j) this.f5003f).f5007a;
                try {
                    sa.a.w();
                    boolean zD = c.d(i7);
                    Consumer consumer = this.f5061b;
                    if (closeableReference2 == null) {
                        if (zD) {
                            consumer.b(i7, null);
                        }
                    } else if (((na.c) closeableReference2.q()).h0() || c.k(i7, 8)) {
                        consumer.b(i7, closeableReference2);
                    } else {
                        CacheKey cacheKey = this.f5001d;
                        if (zD || (closeableReference = iVar.get(cacheKey)) == null) {
                            closeableReferenceE = this.f5002e ? iVar.e(cacheKey, closeableReference2) : null;
                            if (zD) {
                                try {
                                    consumer.c(1.0f);
                                } catch (Throwable th2) {
                                    CloseableReference.l(closeableReferenceE);
                                    throw th2;
                                }
                            }
                            if (closeableReferenceE != null) {
                                closeableReference2 = closeableReferenceE;
                            }
                            consumer.b(i7, closeableReference2);
                            CloseableReference.l(closeableReferenceE);
                        } else {
                            try {
                                na.k kVarG = ((na.c) closeableReference2.q()).G();
                                na.k kVarG2 = ((na.c) closeableReference.q()).G();
                                if (((na.j) kVarG2).f16539c || ((na.j) kVarG2).f16537a >= ((na.j) kVarG).f16537a) {
                                    consumer.b(i7, closeableReference);
                                    closeableReference.close();
                                } else {
                                    closeableReference.close();
                                    if (this.f5002e) {
                                    }
                                    if (zD) {
                                        consumer.c(1.0f);
                                    }
                                    if (closeableReferenceE != null) {
                                        closeableReference2 = closeableReferenceE;
                                    }
                                    consumer.b(i7, closeableReference2);
                                    CloseableReference.l(closeableReferenceE);
                                }
                            } catch (Throwable th3) {
                                closeableReference.close();
                                throw th3;
                            }
                        }
                    }
                    sa.a.w();
                    return;
                } catch (Throwable th4) {
                    sa.a.w();
                    throw th4;
                }
            default:
                CloseableReference closeableReference3 = (CloseableReference) obj;
                Consumer consumer2 = this.f5061b;
                if (closeableReference3 == null) {
                    if (c.d(i7)) {
                        consumer2.b(i7, null);
                        return;
                    }
                    return;
                } else {
                    if (c.e(i7)) {
                        return;
                    }
                    CloseableReference closeableReferenceE2 = this.f5002e ? ((ga.i) this.f5003f).e(this.f5001d, closeableReference3) : null;
                    try {
                        consumer2.c(1.0f);
                        if (closeableReferenceE2 != null) {
                            closeableReference3 = closeableReferenceE2;
                        }
                        consumer2.b(i7, closeableReference3);
                        return;
                    } finally {
                        CloseableReference.l(closeableReferenceE2);
                    }
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, Consumer consumer, CacheKey cacheKey, boolean z5) {
        super(consumer);
        this.f5003f = jVar;
        this.f5001d = cacheKey;
        this.f5002e = z5;
    }
}
