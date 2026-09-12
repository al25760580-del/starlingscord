package com.discord.image.dominant_color;

import android.graphics.Bitmap;
import android.util.Base64;
import com.discord.age_assurance.c;
import com.discord.image.DominantColor;
import com.discord.image.fresco.FrescoFetchDecodedImageKt;
import com.discord.image.fresco.postprocessors.PostProcessor;
import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u001a\u0010\u000e\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\rH\u0002¨\u0006\u0011"}, d2 = {"Lcom/discord/image/dominant_color/ImageManagerModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "getAvatarBase64", "", "imageSource", "Lcom/facebook/react/bridge/ReadableMap;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "getDominantColors", "getDominantColorsLocalAsset", "uri", "dominant_color_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nImageManagerModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageManagerModule.kt\ncom/discord/image/dominant_color/ImageManagerModule\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Color.kt\nandroidx/core/graphics/ColorKt\n*L\n1#1,64:1\n1563#2:65\n1634#2,2:66\n1636#2:87\n105#3,19:68\n*S KotlinDebug\n*F\n+ 1 ImageManagerModule.kt\ncom/discord/image/dominant_color/ImageManagerModule\n*L\n52#1:65\n52#1:66,2\n52#1:87\n52#1:68,19\n*E\n"})
public final class ImageManagerModule extends ReactContextBaseJavaModule {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageManagerModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getAvatarBase64$lambda$0(Promise promise, Bitmap bitmap) {
        if (bitmap != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
            promise.resolve(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0));
        } else {
            promise.reject(new Exception("Unable to decode image source."));
        }
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getDominantColors$lambda$2(Promise promise, Bitmap bitmap) {
        if (bitmap != null) {
            List<Integer> representativeColors = DominantColor.INSTANCE.getRepresentativeColors(bitmap);
            if (representativeColors != null) {
                ArrayList arrayList = new ArrayList(e0.l(representativeColors, 10));
                Iterator<T> it = representativeColors.iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Number) it.next()).intValue();
                    arrayList.add(NativeArrayExtensionsKt.nativeArrayOf(Integer.valueOf((iIntValue >> 16) & 255), Integer.valueOf((iIntValue >> 8) & 255), Integer.valueOf(iIntValue & 255)));
                }
                promise.resolve(NativeArrayExtensionsKt.toNativeArray$default(arrayList, null, 1, null));
            } else {
                promise.reject(new Exception("Unable get representative color."));
            }
        } else {
            promise.reject(new Exception("Unable to decode image source."));
        }
        return Unit.f14616a;
    }

    @ReactMethod
    public final void getAvatarBase64(@NotNull ReadableMap imageSource, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(imageSource, "imageSource");
        Intrinsics.checkNotNullParameter(promise, "promise");
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        FrescoFetchDecodedImageKt.fetchDecodedImage$default(reactApplicationContext, imageSource.getString("uri"), (PostProcessor) null, new c(promise, 10), 2, (Object) null);
    }

    @ReactMethod
    public final void getDominantColors(@NotNull ReadableMap imageSource, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(imageSource, "imageSource");
        Intrinsics.checkNotNullParameter(promise, "promise");
        getDominantColors(imageSource.getString("uri"), promise);
    }

    @ReactMethod
    public final void getDominantColorsLocalAsset(@NotNull ReadableMap imageSource, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(imageSource, "imageSource");
        Intrinsics.checkNotNullParameter(promise, "promise");
        getDominantColors(imageSource.getString("uri"), promise);
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "ImageManager";
    }

    private final void getDominantColors(String uri, Promise promise) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        FrescoFetchDecodedImageKt.fetchDecodedImage$default(reactApplicationContext, uri, (PostProcessor) null, new c(promise, 9), 2, (Object) null);
    }
}
