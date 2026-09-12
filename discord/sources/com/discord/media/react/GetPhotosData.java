package com.discord.media.react;

import com.discord.media.utils.ContentResolverMedia;
import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\f\u0010\u0007\u001a\u00020\b*\u00020\u0004H\u0002R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/discord/media/react/GetPhotosData;", "", "edges", "", "Lcom/discord/media/utils/ContentResolverMedia;", "<init>", "(Ljava/util/List;)V", "toNativeMap", "Lcom/facebook/react/bridge/WritableNativeMap;", "Companion", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGetPhotosData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetPhotosData.kt\ncom/discord/media/react/GetPhotosData\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,37:1\n1563#2:38\n1634#2,3:39\n*S KotlinDebug\n*F\n+ 1 GetPhotosData.kt\ncom/discord/media/react/GetPhotosData\n*L\n13#1:38\n13#1:39,3\n*E\n"})
public final class GetPhotosData {

    @NotNull
    public static final String FAILED_TO_LOAD = "E_UNABLE_TO_LOAD";

    @NotNull
    private final List<ContentResolverMedia> edges;

    public GetPhotosData(@NotNull List<ContentResolverMedia> edges) {
        Intrinsics.checkNotNullParameter(edges, "edges");
        this.edges = edges;
    }

    @NotNull
    public final WritableNativeMap toNativeMap() {
        List<ContentResolverMedia> list = this.edges;
        ArrayList arrayList = new ArrayList(e0.l(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(NativeMapExtensionsKt.nativeMapOf(new Pair("node", toNativeMap((ContentResolverMedia) it.next()))));
        }
        return NativeMapExtensionsKt.nativeMapOf(new Pair("edges", NativeArrayExtensionsKt.toNativeArray$default(arrayList, null, 1, null)));
    }

    private final WritableNativeMap toNativeMap(ContentResolverMedia contentResolverMedia) {
        return NativeMapExtensionsKt.nativeMapOf(new Pair("type", String.valueOf(contentResolverMedia.getMediaType())), new Pair("image", NativeMapExtensionsKt.nativeMapOf(new Pair("uri", String.valueOf(contentResolverMedia.getUri())), new Pair("mimeType", contentResolverMedia.getMimeType()), new Pair("filename", contentResolverMedia.getName()), new Pair("width", Integer.valueOf(contentResolverMedia.getWidth())), new Pair("height", Integer.valueOf(contentResolverMedia.getHeight())), new Pair("playableDuration", Integer.valueOf(contentResolverMedia.getDuration())))));
    }
}
