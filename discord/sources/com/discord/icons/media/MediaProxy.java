package com.discord.icons.media;

import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.media.utils.DiscordVideoMediaSource;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.views.image.ReactImageView;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/discord/icons/media/MediaProxy;", "", "<init>", "()V", "IMAGE_SIZE_ASSET_DEFAULT_PX", "", "withSize", "", "urlWithoutExtension", "animated", "", "size", "imageHash", "(Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;)Ljava/lang/String;", "getMediaProxySize", "MEDIA_PROXY_SIZES", "", "[Ljava/lang/Integer;", "icons_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMediaProxy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaProxy.kt\ncom/discord/icons/media/MediaProxy\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,76:1\n29#2:77\n3829#3:78\n4344#3,2:79\n1310#3,2:95\n1999#4,14:81\n*S KotlinDebug\n*F\n+ 1 MediaProxy.kt\ncom/discord/icons/media/MediaProxy\n*L\n15#1:77\n28#1:78\n28#1:79,2\n38#1:95,2\n28#1:81,14\n*E\n"})
public final class MediaProxy {
    public static final int IMAGE_SIZE_ASSET_DEFAULT_PX = 160;

    @NotNull
    public static final MediaProxy INSTANCE = new MediaProxy();

    @NotNull
    private static final Integer[] MEDIA_PROXY_SIZES = {16, 20, 22, 24, 28, 32, 40, 44, 48, 56, 60, 64, 80, 96, 100, Integer.valueOf(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT), 160, 240, Integer.valueOf(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER), Integer.valueOf(ReactImageView.REMOTE_IMAGE_FADE_DURATION_MS), 320, Integer.valueOf(DiscordVideoMediaSource.DEFAULT_HEIGHT), Integer.valueOf(IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING), 600, Integer.valueOf(DiscordVideoMediaSource.DEFAULT_WIDTH), Integer.valueOf(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET), 1280, 1536, Integer.valueOf(RecyclerView.ItemAnimator.FLAG_MOVED), 3072, Integer.valueOf(RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT)};

    private MediaProxy() {
    }

    private final int getMediaProxySize(int size) {
        Object next;
        Integer[] numArr = MEDIA_PROXY_SIZES;
        ArrayList arrayList = new ArrayList();
        for (Integer num : numArr) {
            if (num.intValue() <= size) {
                arrayList.add(num);
            }
        }
        Iterator it = arrayList.iterator();
        Integer num2 = null;
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int iIntValue = ((Number) next).intValue();
                do {
                    Object next2 = it.next();
                    int iIntValue2 = ((Number) next2).intValue();
                    if (iIntValue < iIntValue2) {
                        next = next2;
                        iIntValue = iIntValue2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Integer num3 = (Integer) next;
        if (num3 != null && ((double) size) / ((double) num3.intValue()) <= 1.25d) {
            return num3.intValue();
        }
        for (Integer num4 : MEDIA_PROXY_SIZES) {
            if (num4.intValue() >= size) {
                num2 = num4;
                break;
            }
        }
        return num2 != null ? num2.intValue() : ((Number) y.B(MEDIA_PROXY_SIZES)).intValue();
    }

    @NotNull
    public final String withSize(@NotNull String urlWithoutExtension, boolean animated, Integer size, String imageHash) {
        Intrinsics.checkNotNullParameter(urlWithoutExtension, "urlWithoutExtension");
        Uri.Builder builderBuildUpon = Uri.parse(urlWithoutExtension + "." + MediaExtensionKt.getMediaExtension(animated && MediaExtensionKt.isImageHashAnimated(imageHash))).buildUpon();
        if (size != null && size.intValue() > 0) {
            builderBuildUpon.appendQueryParameter("size", String.valueOf(getMediaProxySize(size.intValue())));
        }
        if (animated) {
            builderBuildUpon.appendQueryParameter("animated", "true");
        }
        String string = builderBuildUpon.build().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
