package com.discord.media.engine.types;

import com.discord.p000native.engine.AudioInputDeviceDescription;
import com.discord.p000native.engine.AudioOutputDeviceDescription;
import com.discord.p000native.engine.ConnectionInfo;
import com.discord.p000native.engine.VideoInputDeviceDescription;
import com.discord.p000native.engine.VideoInputDeviceFacing;
import com.facebook.react.devsupport.StackTraceHelper;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.d0;
import kotlin.collections.e0;
import kotlin.collections.w0;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a)\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0000¢\u0006\u0002\u0010\u0007\u001a)\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001*\b\u0012\u0004\u0012\u00020\b0\u0005H\u0000¢\u0006\u0002\u0010\t\u001a)\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001*\b\u0012\u0004\u0012\u00020\n0\u0005H\u0000¢\u0006\u0002\u0010\u000b\u001a\u0018\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002*\u00020\u0006H\u0000\u001a\u0018\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002*\u00020\rH\u0000¨\u0006\u000e"}, d2 = {"toListOfMaps", "", "", "", "", "", "Lcom/discord/native/engine/AudioInputDeviceDescription;", "([Lcom/discord/native/engine/AudioInputDeviceDescription;)Ljava/util/List;", "Lcom/discord/native/engine/AudioOutputDeviceDescription;", "([Lcom/discord/native/engine/AudioOutputDeviceDescription;)Ljava/util/List;", "Lcom/discord/native/engine/VideoInputDeviceDescription;", "([Lcom/discord/native/engine/VideoInputDeviceDescription;)Ljava/util/List;", "toMap", "Lcom/discord/native/engine/ConnectionInfo;", "media_engine_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNativeTypeExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeTypeExtensions.kt\ncom/discord/media/engine/types/NativeTypeExtensionsKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,62:1\n11318#2:63\n11429#2,4:64\n11318#2:68\n11429#2,4:69\n23663#2,10:73\n1573#3:83\n1604#3,4:84\n1#4:88\n*S KotlinDebug\n*F\n+ 1 NativeTypeExtensions.kt\ncom/discord/media/engine/types/NativeTypeExtensionsKt\n*L\n10#1:63\n10#1:64,4\n19#1:68\n19#1:69,4\n29#1:73,10\n33#1:83\n33#1:84,4\n*E\n"})
public final class NativeTypeExtensionsKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoInputDeviceFacing.values().length];
            try {
                iArr[VideoInputDeviceFacing.Front.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoInputDeviceFacing.Back.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final List<Map<String, Object>> toListOfMaps(@NotNull AudioInputDeviceDescription[] audioInputDeviceDescriptionArr) {
        Intrinsics.checkNotNullParameter(audioInputDeviceDescriptionArr, "<this>");
        ArrayList arrayList = new ArrayList(audioInputDeviceDescriptionArr.length);
        int length = audioInputDeviceDescriptionArr.length;
        int i7 = 0;
        int i10 = 0;
        while (i7 < length) {
            AudioInputDeviceDescription audioInputDeviceDescription = audioInputDeviceDescriptionArr[i7];
            arrayList.add(w0.g(new Pair(StackTraceHelper.NAME_KEY, audioInputDeviceDescription.getName()), new Pair("guid", audioInputDeviceDescription.getGuid()), new Pair("index", Integer.valueOf(i10))));
            i7++;
            i10++;
        }
        return arrayList;
    }

    @NotNull
    public static final Map<String, Object> toMap(@NotNull AudioInputDeviceDescription audioInputDeviceDescription) {
        Intrinsics.checkNotNullParameter(audioInputDeviceDescription, "<this>");
        return w0.g(new Pair(StackTraceHelper.NAME_KEY, audioInputDeviceDescription.getName()), new Pair("guid", audioInputDeviceDescription.getGuid()));
    }

    @NotNull
    public static final Map<String, Object> toMap(@NotNull ConnectionInfo connectionInfo) {
        Intrinsics.checkNotNullParameter(connectionInfo, "<this>");
        Pair pair = new Pair("protocol", connectionInfo.getProtocol());
        Pair pair2 = new Pair("address", connectionInfo.getLocalAddress());
        Pair pair3 = new Pair("port", Integer.valueOf(connectionInfo.getLocalPort()));
        Integer createConnectionTime = connectionInfo.getCreateConnectionTime();
        Pair pair4 = createConnectionTime != null ? new Pair("createConnectionTime", Integer.valueOf(createConnectionTime.intValue())) : null;
        Integer connectTime = connectionInfo.getConnectTime();
        Pair[] elements = {pair, pair2, pair3, pair4, connectTime != null ? new Pair("connectTime", Integer.valueOf(connectTime.intValue())) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return w0.l(y.r(elements));
    }

    @NotNull
    public static final List<Map<String, Object>> toListOfMaps(@NotNull AudioOutputDeviceDescription[] audioOutputDeviceDescriptionArr) {
        Intrinsics.checkNotNullParameter(audioOutputDeviceDescriptionArr, "<this>");
        ArrayList arrayList = new ArrayList(audioOutputDeviceDescriptionArr.length);
        int length = audioOutputDeviceDescriptionArr.length;
        int i7 = 0;
        int i10 = 0;
        while (i7 < length) {
            AudioOutputDeviceDescription audioOutputDeviceDescription = audioOutputDeviceDescriptionArr[i7];
            arrayList.add(w0.g(new Pair(StackTraceHelper.NAME_KEY, audioOutputDeviceDescription.getName()), new Pair("guid", audioOutputDeviceDescription.getGuid()), new Pair("index", Integer.valueOf(i10))));
            i7++;
            i10++;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final List<Map<String, Object>> toListOfMaps(@NotNull VideoInputDeviceDescription[] videoInputDeviceDescriptionArr) {
        String str;
        Intrinsics.checkNotNullParameter(videoInputDeviceDescriptionArr, "<this>");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i7 = 0;
        for (VideoInputDeviceDescription videoInputDeviceDescription : videoInputDeviceDescriptionArr) {
            if (videoInputDeviceDescription.getFacing() == VideoInputDeviceFacing.Front) {
                arrayList.add(videoInputDeviceDescription);
            } else {
                arrayList2.add(videoInputDeviceDescription);
            }
        }
        ArrayList arrayListI = CollectionsKt.I(d0.g(CollectionsKt.firstOrNull(arrayList), CollectionsKt.firstOrNull(arrayList2)));
        ArrayList arrayList3 = new ArrayList(e0.l(arrayListI, 10));
        for (Object obj : arrayListI) {
            int i10 = i7 + 1;
            if (i7 < 0) {
                d0.k();
                throw null;
            }
            VideoInputDeviceDescription videoInputDeviceDescription2 = (VideoInputDeviceDescription) obj;
            int i11 = WhenMappings.$EnumSwitchMapping$0[videoInputDeviceDescription2.getFacing().ordinal()];
            if (i11 == 1) {
                str = "front";
            } else if (i11 != 2) {
                str = "unknown";
            } else {
                str = "back";
            }
            arrayList3.add(w0.g(new Pair(StackTraceHelper.NAME_KEY, videoInputDeviceDescription2.getName()), new Pair("guid", videoInputDeviceDescription2.getGuid()), new Pair("facing", str), new Pair("index", Integer.valueOf(i7))));
            i7 = i10;
        }
        return arrayList3;
    }
}
