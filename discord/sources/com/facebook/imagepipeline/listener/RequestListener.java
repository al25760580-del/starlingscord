package com.facebook.imagepipeline.listener;

import com.facebook.imagepipeline.request.ImageRequest;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface RequestListener {
    void onProducerEvent(String str, String str2, String str3);

    void onProducerFinishWithCancellation(String str, String str2, Map map);

    void onProducerFinishWithFailure(String str, String str2, Throwable th2, Map map);

    void onProducerFinishWithSuccess(String str, String str2, Map map);

    void onProducerStart(String str, String str2);

    void onRequestCancellation(String str);

    void onRequestFailure(ImageRequest imageRequest, String str, Throwable th2, boolean z5);

    void onRequestStart(ImageRequest imageRequest, Object obj, String str, boolean z5);

    void onRequestSuccess(ImageRequest imageRequest, String str, boolean z5);

    void onUltimateProducerReached(String str, String str2, boolean z5);

    boolean requiresExtraMap(String str);
}
