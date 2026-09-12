package oa;

import com.facebook.imagepipeline.listener.RequestListener;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements RequestListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f17196a;

    public c(Set set) {
        this.f17196a = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            RequestListener requestListener = (RequestListener) it.next();
            if (requestListener != null) {
                this.f17196a.add(requestListener);
            }
        }
    }

    public static void a(String str, Exception exc) {
        o8.a.h("ForwardingRequestListener", str, exc);
    }

    @Override // com.facebook.imagepipeline.listener.RequestListener
    public final void onProducerEvent(String str, String str2, String str3) {
        ArrayList arrayList = this.f17196a;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                ((RequestListener) arrayList.get(i7)).onProducerEvent(str, "NetworkFetchProducer", "intermediate_result");
            } catch (Exception e10) {
                a("InternalListener exception in onIntermediateChunkStart", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.listener.RequestListener
    public final void onProducerFinishWithCancellation(String str, String str2, Map map) {
        ArrayList arrayList = this.f17196a;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                ((RequestListener) arrayList.get(i7)).onProducerFinishWithCancellation(str, str2, null);
            } catch (Exception e10) {
                a("InternalListener exception in onProducerFinishWithCancellation", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.listener.RequestListener
    public final void onProducerFinishWithFailure(String str, String str2, Throwable th2, Map map) {
        ArrayList arrayList = this.f17196a;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                ((RequestListener) arrayList.get(i7)).onProducerFinishWithFailure(str, str2, th2, map);
            } catch (Exception e10) {
                a("InternalListener exception in onProducerFinishWithFailure", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.listener.RequestListener
    public final void onProducerFinishWithSuccess(String str, String str2, Map map) {
        ArrayList arrayList = this.f17196a;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                ((RequestListener) arrayList.get(i7)).onProducerFinishWithSuccess(str, str2, map);
            } catch (Exception e10) {
                a("InternalListener exception in onProducerFinishWithSuccess", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.listener.RequestListener
    public final void onProducerStart(String str, String str2) {
        ArrayList arrayList = this.f17196a;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                ((RequestListener) arrayList.get(i7)).onProducerStart(str, str2);
            } catch (Exception e10) {
                a("InternalListener exception in onProducerStart", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.listener.RequestListener
    public final void onRequestCancellation(String str) {
        ArrayList arrayList = this.f17196a;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                ((RequestListener) arrayList.get(i7)).onRequestCancellation(str);
            } catch (Exception e10) {
                a("InternalListener exception in onRequestCancellation", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.listener.RequestListener
    public final void onRequestFailure(ImageRequest imageRequest, String str, Throwable th2, boolean z5) {
        ArrayList arrayList = this.f17196a;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                ((RequestListener) arrayList.get(i7)).onRequestFailure(imageRequest, str, th2, z5);
            } catch (Exception e10) {
                a("InternalListener exception in onRequestFailure", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.listener.RequestListener
    public final void onRequestStart(ImageRequest imageRequest, Object obj, String str, boolean z5) {
        ArrayList arrayList = this.f17196a;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                ((RequestListener) arrayList.get(i7)).onRequestStart(imageRequest, obj, str, z5);
            } catch (Exception e10) {
                a("InternalListener exception in onRequestStart", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.listener.RequestListener
    public final void onRequestSuccess(ImageRequest imageRequest, String str, boolean z5) {
        ArrayList arrayList = this.f17196a;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                ((RequestListener) arrayList.get(i7)).onRequestSuccess(imageRequest, str, z5);
            } catch (Exception e10) {
                a("InternalListener exception in onRequestSuccess", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.listener.RequestListener
    public final void onUltimateProducerReached(String str, String str2, boolean z5) {
        ArrayList arrayList = this.f17196a;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                ((RequestListener) arrayList.get(i7)).onUltimateProducerReached(str, str2, z5);
            } catch (Exception e10) {
                a("InternalListener exception in onProducerFinishWithSuccess", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.listener.RequestListener
    public final boolean requiresExtraMap(String str) {
        ArrayList arrayList = this.f17196a;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (((RequestListener) arrayList.get(i7)).requiresExtraMap(str)) {
                return true;
            }
        }
        return false;
    }

    public c(RequestListener... requestListenerArr) {
        this.f17196a = new ArrayList(requestListenerArr.length);
        for (RequestListener requestListener : requestListenerArr) {
            if (requestListener != null) {
                this.f17196a.add(requestListener);
            }
        }
    }
}
