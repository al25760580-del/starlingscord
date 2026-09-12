package oa;

import com.facebook.imagepipeline.listener.RequestListener;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements RequestListener {
    @Override // com.facebook.imagepipeline.listener.RequestListener
    public void onUltimateProducerReached(@NotNull String requestId, @NotNull String producerName, boolean z5) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
    }
}
