package ja;

import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.producers.ProducerContext;
import com.facebook.imagepipeline.producers.c;
import com.facebook.imagepipeline.producers.d1;
import com.facebook.imagepipeline.producers.e0;
import com.facebook.imagepipeline.producers.s0;
import com.facebook.imagepipeline.producers.z0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends x8.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d1 f13718h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e0 f13719i;
    public final /* synthetic */ int j;

    public b(z0 producer, d1 settableProducerContext, e0 requestListener, int i7) {
        this.j = i7;
        Intrinsics.checkNotNullParameter(producer, "producer");
        Intrinsics.checkNotNullParameter(settableProducerContext, "settableProducerContext");
        Intrinsics.checkNotNullParameter(requestListener, "requestListener");
        this.f13718h = settableProducerContext;
        this.f13719i = requestListener;
        sa.a.w();
        this.f22642a = settableProducerContext.f4970x;
        sa.a.w();
        requestListener.j(settableProducerContext);
        sa.a.w();
        producer.b(new s0(1, this), settableProducerContext);
    }

    @Override // x8.a, com.facebook.datasource.DataSource
    public final boolean close() {
        if (!super.close()) {
            return false;
        }
        if (isFinished()) {
            return true;
        }
        e0 e0Var = this.f13719i;
        d1 d1Var = this.f13718h;
        e0Var.h(d1Var);
        d1Var.e();
        return true;
    }

    @Override // x8.a
    public void e(Object obj) {
        switch (this.j) {
            case 0:
                CloseableReference.l((CloseableReference) obj);
                break;
        }
    }

    @Override // x8.a, com.facebook.datasource.DataSource
    public Object getResult() {
        switch (this.j) {
            case 0:
                return CloseableReference.g((CloseableReference) super.getResult());
            default:
                return super.getResult();
        }
    }

    public final void l(Object obj, int i7, ProducerContext producerContext) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        boolean zD = c.d(i7);
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        if (j(obj, zD, producerContext.getExtras()) && zD) {
            this.f13719i.d(this.f13718h);
        }
    }
}
