package com.discord.image.fresco.postprocessors.processors;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.request.BasePostprocessor;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/discord/image/fresco/postprocessors/processors/CompositePostprocessor;", "Lcom/facebook/imagepipeline/request/BasePostprocessor;", "postprocessors", "", "<init>", "(Ljava/util/List;)V", "process", "", "destBitmap", "Landroid/graphics/Bitmap;", "sourceBitmap", "fresco_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCompositePostprocessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompositePostprocessor.kt\ncom/discord/image/fresco/postprocessors/processors/CompositePostprocessor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,17:1\n1869#2,2:18\n*S KotlinDebug\n*F\n+ 1 CompositePostprocessor.kt\ncom/discord/image/fresco/postprocessors/processors/CompositePostprocessor\n*L\n14#1:18,2\n*E\n"})
public final class CompositePostprocessor extends BasePostprocessor {

    @NotNull
    private final List<BasePostprocessor> postprocessors;

    /* JADX WARN: Multi-variable type inference failed */
    public CompositePostprocessor(@NotNull List<? extends BasePostprocessor> postprocessors) {
        Intrinsics.checkNotNullParameter(postprocessors, "postprocessors");
        this.postprocessors = postprocessors;
    }

    @Override // com.facebook.imagepipeline.request.BasePostprocessor
    public void process(@NotNull Bitmap destBitmap, @NotNull Bitmap sourceBitmap) {
        Intrinsics.checkNotNullParameter(destBitmap, "destBitmap");
        Intrinsics.checkNotNullParameter(sourceBitmap, "sourceBitmap");
        Iterator<T> it = this.postprocessors.iterator();
        while (it.hasNext()) {
            ((BasePostprocessor) it.next()).process(destBitmap, sourceBitmap);
        }
    }
}
