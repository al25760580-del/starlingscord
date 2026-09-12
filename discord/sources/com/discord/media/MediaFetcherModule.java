package com.discord.media;

import a3.e;
import com.discord.media.react.GetPhotosData;
import com.discord.media.utils.ContentResolverMedia;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import tn.a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007H\u0002¨\u0006\u0011"}, d2 = {"Lcom/discord/media/MediaFetcherModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "getPhotos", "", "params", "Lcom/facebook/react/bridge/ReadableMap;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "getQueryType", "Lcom/discord/media/utils/ContentResolverMedia$QueryType;", ViewProps.FILTER, "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMediaFetcherModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaFetcherModule.kt\ncom/discord/media/MediaFetcherModule\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,69:1\n808#2,11:70\n1068#2:81\n*S KotlinDebug\n*F\n+ 1 MediaFetcherModule.kt\ncom/discord/media/MediaFetcherModule\n*L\n24#1:70,11\n38#1:81\n*E\n"})
public final class MediaFetcherModule extends ReactContextBaseJavaModule {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaFetcherModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    private final ContentResolverMedia.QueryType getQueryType(String filter) {
        if (filter != null) {
            int iHashCode = filter.hashCode();
            if (iHashCode != -989034367) {
                if (iHashCode != -816678056) {
                    if (iHashCode == 65921 && filter.equals("All")) {
                        return ContentResolverMedia.QueryType.ALL;
                    }
                } else if (filter.equals("videos")) {
                    return ContentResolverMedia.QueryType.VIDEO;
                }
            } else if (filter.equals("photos")) {
                return ContentResolverMedia.QueryType.IMAGE;
            }
        }
        throw new IllegalArgumentException(e.l("Unknown filter type: ", filter));
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "CameraRollUtils";
    }

    @ReactMethod
    public final void getPhotos(@NotNull ReadableMap params, @NotNull Promise promise) {
        ReadableArray array;
        ArrayList<Object> arrayList;
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(promise, "promise");
        int i7 = params.getInt("first");
        ArrayList arrayList2 = null;
        Integer numValueOf = params.hasKey("offset") ? Integer.valueOf(params.getInt("offset")) : null;
        ContentResolverMedia.QueryType queryType = getQueryType(params.getString("assetType"));
        if (params.hasKey("extensions") && (array = params.getArray("extensions")) != null && (arrayList = array.toArrayList()) != null) {
            arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (obj instanceof String) {
                    arrayList2.add(obj);
                }
            }
        }
        ArrayList arrayList3 = arrayList2;
        try {
            ContentResolverMedia.Companion companion = ContentResolverMedia.INSTANCE;
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
            List listF0 = CollectionsKt.f0(CollectionsKt.e0(companion.getMedia(reactApplicationContext, queryType, i7, numValueOf, arrayList3), new Comparator() { // from class: com.discord.media.MediaFetcherModule$getPhotos$$inlined$sortedByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t5, T t10) {
                    return a.a(Integer.valueOf(((ContentResolverMedia) t10).getDateAdded()), Integer.valueOf(((ContentResolverMedia) t5).getDateAdded()));
                }
            }), i7);
            WritableNativeMap writableNativeMapNativeMapOf = listF0.size() == i7 ? NativeMapExtensionsKt.nativeMapOf(new Pair("start_cursor", String.valueOf(((ContentResolverMedia) CollectionsKt.K(listF0)).getUri())), new Pair("end_cursor", String.valueOf(((ContentResolverMedia) CollectionsKt.Q(listF0)).getUri())), new Pair("has_next_page", Boolean.TRUE)) : NativeMapExtensionsKt.nativeMapOf(new Pair("has_next_page", Boolean.FALSE));
            WritableNativeMap nativeMap = new GetPhotosData(listF0).toNativeMap();
            nativeMap.putMap("page_info", writableNativeMapNativeMapOf);
            promise.resolve(nativeMap);
        } catch (Exception e10) {
            promise.reject(GetPhotosData.FAILED_TO_LOAD, e10);
        }
    }
}
