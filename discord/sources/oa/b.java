package oa;

import com.facebook.imagepipeline.producers.ProducerContext;
import com.facebook.imagepipeline.producers.d1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f17195a;

    public b(Set set) {
        if (set == null) {
            this.f17195a = new ArrayList();
            return;
        }
        ArrayList destination = new ArrayList(set.size());
        this.f17195a = destination;
        Set set2 = set;
        Intrinsics.checkNotNullParameter(set2, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (Object obj : set2) {
            if (obj != null) {
                destination.add(obj);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.a1
    public final void a(ProducerContext producerContext) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        Intrinsics.checkNotNullParameter("NetworkFetchProducer", "producerName");
        Intrinsics.checkNotNullParameter("intermediate_result", "producerEventName");
        Iterator it = this.f17195a.iterator();
        while (it.hasNext()) {
            try {
                ((d) it.next()).a(producerContext);
            } catch (Exception e10) {
                o8.a.h("ForwardingRequestListener2", "InternalListener exception in onIntermediateChunkStart", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.a1
    public final void b(ProducerContext producerContext, String producerName, boolean z5) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        Iterator it = this.f17195a.iterator();
        while (it.hasNext()) {
            try {
                ((d) it.next()).b(producerContext, producerName, z5);
            } catch (Exception e10) {
                o8.a.h("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithSuccess", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.a1
    public final void c(ProducerContext producerContext, String producerName) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        Iterator it = this.f17195a.iterator();
        while (it.hasNext()) {
            try {
                ((d) it.next()).c(producerContext, producerName);
            } catch (Exception e10) {
                o8.a.h("ForwardingRequestListener2", "InternalListener exception in onProducerStart", e10);
            }
        }
    }

    @Override // oa.d
    public final void d(ProducerContext producerContext) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        Iterator it = this.f17195a.iterator();
        while (it.hasNext()) {
            try {
                ((d) it.next()).d(producerContext);
            } catch (Exception e10) {
                o8.a.h("ForwardingRequestListener2", "InternalListener exception in onRequestSuccess", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.a1
    public final void e(ProducerContext producerContext, String str) {
        Iterator it = this.f17195a.iterator();
        while (it.hasNext()) {
            try {
                ((d) it.next()).e(producerContext, str);
            } catch (Exception e10) {
                o8.a.h("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithCancellation", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.a1
    public final boolean f(ProducerContext producerContext, String producerName) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        ArrayList arrayList = this.f17195a;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((d) it.next()).f(producerContext, producerName)) {
                return true;
            }
        }
        return false;
    }

    @Override // oa.d
    public final void g(ProducerContext producerContext, Throwable throwable) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Iterator it = this.f17195a.iterator();
        while (it.hasNext()) {
            try {
                ((d) it.next()).g(producerContext, throwable);
            } catch (Exception e10) {
                o8.a.h("ForwardingRequestListener2", "InternalListener exception in onRequestFailure", e10);
            }
        }
    }

    @Override // oa.d
    public final void h(ProducerContext producerContext) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        Iterator it = this.f17195a.iterator();
        while (it.hasNext()) {
            try {
                ((d) it.next()).h(producerContext);
            } catch (Exception e10) {
                o8.a.h("ForwardingRequestListener2", "InternalListener exception in onRequestCancellation", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.a1
    public final void i(ProducerContext producerContext, String str, Map map) {
        Iterator it = this.f17195a.iterator();
        while (it.hasNext()) {
            try {
                ((d) it.next()).i(producerContext, str, map);
            } catch (Exception e10) {
                o8.a.h("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithSuccess", e10);
            }
        }
    }

    @Override // oa.d
    public final void j(d1 producerContext) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        Iterator it = this.f17195a.iterator();
        while (it.hasNext()) {
            try {
                ((d) it.next()).j(producerContext);
            } catch (Exception e10) {
                o8.a.h("ForwardingRequestListener2", "InternalListener exception in onRequestStart", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.a1
    public final void k(ProducerContext producerContext, String str, Throwable th2, Map map) {
        Iterator it = this.f17195a.iterator();
        while (it.hasNext()) {
            try {
                ((d) it.next()).k(producerContext, str, th2, map);
            } catch (Exception e10) {
                o8.a.h("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithFailure", e10);
            }
        }
    }
}
