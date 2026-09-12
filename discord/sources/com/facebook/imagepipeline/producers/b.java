package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.common.ResizeOptions;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4944b;

    public /* synthetic */ b(z0 z0Var, int i7) {
        this.f4943a = i7;
        this.f4944b = z0Var;
    }

    @Override // com.facebook.imagepipeline.producers.z0
    public final void b(Consumer consumer, ProducerContext context) {
        switch (this.f4943a) {
            case 0:
                ((z0) this.f4944b).b(new a(consumer, 0), context);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(consumer, "consumer");
                Intrinsics.checkNotNullParameter(context, "context");
                z0 z0Var = (z0) this.f4944b;
                Intrinsics.checkNotNullParameter(consumer, "consumer");
                z0Var.b(new a(consumer, 2), context);
                break;
            case 2:
                ((z0) this.f4944b).b(new a(consumer, 3), context);
                break;
            default:
                if (context.g().getResizeOptions() == null) {
                    consumer.b(1, null);
                } else if (!c(0, consumer, context)) {
                    consumer.b(1, null);
                }
                break;
        }
    }

    public boolean c(int i7, Consumer consumer, ProducerContext producerContext) {
        l1[] l1VarArr = (l1[]) this.f4944b;
        ResizeOptions resizeOptions = producerContext.g().getResizeOptions();
        while (true) {
            if (i7 >= l1VarArr.length) {
                i7 = -1;
                break;
            }
            if (l1VarArr[i7].a(resizeOptions)) {
                break;
            }
            i7++;
        }
        if (i7 == -1) {
            return false;
        }
        l1VarArr[i7].b(new k1(this, consumer, producerContext, i7), producerContext);
        return true;
    }

    public b(z0 inputProducer) {
        this.f4943a = 1;
        Intrinsics.checkNotNullParameter(inputProducer, "inputProducer");
        this.f4944b = inputProducer;
    }

    public b(l1[] l1VarArr) {
        this.f4943a = 3;
        l1[] l1VarArr2 = l1VarArr;
        this.f4944b = l1VarArr2;
        int length = l1VarArr2.length;
        if (length <= 0) {
            if (length >= 0) {
                throw new IndexOutOfBoundsException(n8.i.g("%s (%s) must be less than size (%s)", "index", 0, Integer.valueOf(length)));
            }
            throw new IllegalArgumentException(kk.b.h(length, "negative size: "));
        }
    }
}
