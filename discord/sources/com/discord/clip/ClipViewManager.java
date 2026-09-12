package com.discord.clip;

import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.viewmanagers.ClipViewManagerDelegate;
import com.facebook.react.viewmanagers.ClipViewManagerInterface;
import com.facebook.react.views.view.ReactViewGroup;
import com.facebook.react.views.view.ReactViewManager;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.s0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00172\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0017B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\u0007H\u0014J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/discord/clip/ClipViewManager;", "Lcom/facebook/react/views/view/ReactViewManager;", "Lcom/facebook/react/viewmanagers/ClipViewManagerInterface;", "Lcom/facebook/react/views/view/ReactViewGroup;", "<init>", "()V", "delegate", "Lcom/facebook/react/viewmanagers/ClipViewManagerDelegate;", "getDelegate", "getName", "", "createViewInstance", "Lcom/discord/clip/ClipView;", "context", "Lcom/facebook/react/uimanager/ThemedReactContext;", "setCutouts", "", "view", "cutouts", "Lcom/facebook/react/bridge/ReadableArray;", "setBorderRadius", "borderRadius", "", "Companion", "clip_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@ReactModule(name = ClipViewManager.NAME)
@SourceDebugExtension({"SMAP\nClipViewManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClipViewManager.kt\ncom/discord/clip/ClipViewManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,100:1\n1869#2,2:101\n*S KotlinDebug\n*F\n+ 1 ClipViewManager.kt\ncom/discord/clip/ClipViewManager\n*L\n30#1:101,2\n*E\n"})
public final class ClipViewManager extends ReactViewManager implements ClipViewManagerInterface<ReactViewGroup> {

    @NotNull
    public static final String NAME = "ClipView";

    @NotNull
    private final ClipViewManagerDelegate<ReactViewGroup, ClipViewManager> delegate = new ClipViewManagerDelegate<>(this);

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ClipViewManagerDelegate<ReactViewGroup, ClipViewManager> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    public void setBorderRadius(@NotNull ReactViewGroup view, float borderRadius) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.setBorderRadius(view, 0, new DynamicFromObject(Double.valueOf(borderRadius)));
        ((ClipView) view).clipToBorderRadius(SizeUtilsKt.getDpToPx(borderRadius));
    }

    @Override // com.facebook.react.viewmanagers.ClipViewManagerInterface
    public void setCutouts(@NotNull ReactViewGroup view, ReadableArray cutouts) {
        IntRange intRangeSizeRange;
        Intrinsics.checkNotNullParameter(view, "view");
        ClipView clipView = (ClipView) view;
        clipView.resetCutouts();
        if (cutouts == null || (intRangeSizeRange = NativeArrayExtensionsKt.sizeRange(cutouts)) == null) {
            return;
        }
        Iterator it = intRangeSizeRange.iterator();
        while (it.hasNext()) {
            ReadableMap map = cutouts.getMap(((s0) it).nextInt());
            Intrinsics.checkNotNull(map);
            String string = map.getString("shape");
            if (Intrinsics.areEqual(string, "circle")) {
                clipView.addCircleCutout(SizeUtilsKt.getDpToPx((float) map.getDouble("x")), SizeUtilsKt.getDpToPx((float) map.getDouble("y")), SizeUtilsKt.getDpToPx((float) map.getDouble("size")));
            } else if (Intrinsics.areEqual(string, "rounded-rect")) {
                clipView.addRoundedRectCutout(SizeUtilsKt.getDpToPx((float) map.getDouble("x")), SizeUtilsKt.getDpToPx((float) map.getDouble("y")), SizeUtilsKt.getDpToPx((float) map.getDouble("width")), SizeUtilsKt.getDpToPx((float) map.getDouble("height")), SizeUtilsKt.getDpToPx((float) map.getDouble("cornerRadius")), map.hasKey("rotationDegrees") ? (float) map.getDouble("rotationDegrees") : 0.0f);
            }
        }
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public ClipView createViewInstance(@NotNull ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new ClipView(context);
    }
}
