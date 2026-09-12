package com.facebook.react.views.debuggingoverlay;

import android.graphics.RectF;
import com.facebook.react.bridge.NoSuchKeyException;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UnexpectedNativeTypeException;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.viewmanagers.DebuggingOverlayManagerDelegate;
import com.facebook.react.viewmanagers.DebuggingOverlayManagerInterface;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@ReactModule(name = DebuggingOverlayManager.REACT_CLASS)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0016B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0014J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\rH\u0016J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/facebook/react/views/debuggingoverlay/DebuggingOverlayManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/facebook/react/views/debuggingoverlay/DebuggingOverlay;", "Lcom/facebook/react/viewmanagers/DebuggingOverlayManagerInterface;", "<init>", "()V", "delegate", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "getDelegate", "highlightTraceUpdates", "", "view", "updates", "Lcom/facebook/react/bridge/ReadableArray;", "highlightElements", "elements", "clearElementsHighlights", "createViewInstance", "context", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getName", "", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DebuggingOverlayManager extends SimpleViewManager<DebuggingOverlay> implements DebuggingOverlayManagerInterface<DebuggingOverlay> {

    @NotNull
    public static final String REACT_CLASS = "DebuggingOverlay";

    @NotNull
    private final ViewManagerDelegate<DebuggingOverlay> delegate = new DebuggingOverlayManagerDelegate(this);

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ViewManagerDelegate<DebuggingOverlay> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.viewmanagers.DebuggingOverlayManagerInterface
    public void clearElementsHighlights(@NotNull DebuggingOverlay view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.clearElementsHighlights();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public DebuggingOverlay createViewInstance(@NotNull ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new DebuggingOverlay(context);
    }

    @Override // com.facebook.react.viewmanagers.DebuggingOverlayManagerInterface
    public void highlightElements(@NotNull DebuggingOverlay view, @NotNull ReadableArray elements) throws Exception {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(elements, "elements");
        ArrayList arrayList = new ArrayList();
        int size = elements.size();
        boolean z5 = true;
        for (int i7 = 0; i7 < size; i7++) {
            ReadableMap map = elements.getMap(i7);
            if (map != null) {
                try {
                    float f2 = (float) map.getDouble("x");
                    float f7 = (float) map.getDouble("y");
                    float f10 = (float) (((double) f2) + map.getDouble("width"));
                    float f11 = (float) (((double) f7) + map.getDouble("height"));
                    PixelUtil pixelUtil = PixelUtil.INSTANCE;
                    arrayList.add(new RectF(pixelUtil.dpToPx(f2), pixelUtil.dpToPx(f7), pixelUtil.dpToPx(f10), pixelUtil.dpToPx(f11)));
                } catch (Exception e10) {
                    if (!(e10 instanceof NoSuchKeyException) && !(e10 instanceof UnexpectedNativeTypeException)) {
                        throw e10;
                    }
                    ReactSoftExceptionLogger.logSoftException(REACT_CLASS, new ReactNoCrashSoftException("Unexpected payload for highlighting elements: every element should have x, y, width, height fields"));
                    Unit unit = Unit.f14616a;
                    z5 = false;
                }
            }
        }
        if (z5) {
            view.setHighlightedElementsRectangles(arrayList);
        }
    }

    @Override // com.facebook.react.viewmanagers.DebuggingOverlayManagerInterface
    public void highlightTraceUpdates(@NotNull DebuggingOverlay view, @NotNull ReadableArray updates) throws Exception {
        boolean z5;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(updates, "updates");
        ArrayList arrayList = new ArrayList();
        int size = updates.size();
        boolean z6 = true;
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                z5 = z6;
                break;
            }
            ReadableMap map = updates.getMap(i7);
            if (map != null) {
                ReadableMap map2 = map.getMap("rectangle");
                if (map2 == null) {
                    ReactSoftExceptionLogger.logSoftException(REACT_CLASS, new ReactNoCrashSoftException("Unexpected payload for highlighting trace updates: rectangle field is null"));
                    z5 = false;
                    break;
                }
                int i10 = map.getInt(StackTraceHelper.ID_KEY);
                int i11 = map.getInt(ViewProps.COLOR);
                try {
                    float f2 = (float) map2.getDouble("x");
                    float f7 = (float) map2.getDouble("y");
                    float f10 = (float) (((double) f2) + map2.getDouble("width"));
                    float f11 = (float) (((double) f7) + map2.getDouble("height"));
                    PixelUtil pixelUtil = PixelUtil.INSTANCE;
                    arrayList.add(new TraceUpdate(i10, new RectF(pixelUtil.dpToPx(f2), pixelUtil.dpToPx(f7), pixelUtil.dpToPx(f10), pixelUtil.dpToPx(f11)), i11));
                } catch (Exception e10) {
                    if (!(e10 instanceof NoSuchKeyException) && !(e10 instanceof UnexpectedNativeTypeException)) {
                        throw e10;
                    }
                    ReactSoftExceptionLogger.logSoftException(REACT_CLASS, new ReactNoCrashSoftException("Unexpected payload for highlighting trace updates: rectangle field should have x, y, width, height fields"));
                    Unit unit = Unit.f14616a;
                    z6 = false;
                }
            }
            i7++;
        }
        if (z5) {
            view.setTraceUpdates(arrayList);
        }
    }
}
