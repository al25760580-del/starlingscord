package com.facebook.react.views.drawer;

import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.viewmanagers.AndroidDrawerLayoutManagerDelegate;
import com.facebook.react.viewmanagers.AndroidDrawerLayoutManagerInterface;
import com.facebook.react.views.drawer.events.DrawerClosedEvent;
import com.facebook.react.views.drawer.events.DrawerOpenedEvent;
import com.facebook.react.views.drawer.events.DrawerSlideEvent;
import com.facebook.react.views.drawer.events.DrawerStateChangedEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.v0;
import kotlin.collections.w0;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import o8.a;
import org.jetbrains.annotations.NotNull;
import rn.d;
import s0.g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 62\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u000256B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0014J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\rH\u0014J\u001a\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\tH\u0016J\u0018\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0018\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\tH\u0002J\u0018\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\u001f\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0002\u0010\u0019J\u001a\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\tH\u0017J\u0010\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J\u0010\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J\u001a\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\tH\u0017J\u001f\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u001fH\u0017¢\u0006\u0002\u0010 J\u001f\u0010!\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u001fH\u0017¢\u0006\u0002\u0010 J\u0018\u0010\"\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u0018H\u0016J\b\u0010$\u001a\u00020%H\u0016J\u0014\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001f0'H\u0016J\"\u0010(\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u001f2\b\u0010*\u001a\u0004\u0018\u00010+H\u0017J\u0014\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020-0'H\u0016J\u0014\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020-0'H\u0016J \u0010/\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u00022\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u001fH\u0016J\u000e\u00104\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lcom/facebook/react/views/drawer/ReactDrawerLayoutManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/facebook/react/views/drawer/ReactDrawerLayout;", "Lcom/facebook/react/viewmanagers/AndroidDrawerLayoutManagerInterface;", "<init>", "()V", "delegate", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "getName", "", "addEventEmitters", "", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "view", "createViewInstance", "context", "setDrawerPosition", "value", "drawerPosition", "Lcom/facebook/react/bridge/Dynamic;", "setDrawerPositionInternal", "setDrawerWidth", "width", "", "(Lcom/facebook/react/views/drawer/ReactDrawerLayout;Ljava/lang/Float;)V", "setDrawerLockMode", ReactDrawerLayoutManager.COMMAND_OPEN_DRAWER, ReactDrawerLayoutManager.COMMAND_CLOSE_DRAWER, "setKeyboardDismissMode", "setDrawerBackgroundColor", "", "(Lcom/facebook/react/views/drawer/ReactDrawerLayout;Ljava/lang/Integer;)V", "setStatusBarBackgroundColor", "setElevation", ViewProps.ELEVATION, "needsCustomLayoutForChildren", "", "getCommandsMap", "", "receiveCommand", "commandId", "args", "Lcom/facebook/react/bridge/ReadableArray;", "getExportedViewConstants", "", "getExportedCustomDirectEventTypeConstants", "addView", "parent", "child", "Landroid/view/View;", "index", "getDelegate", "DrawerEventEmitter", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@ReactModule(name = ReactDrawerLayoutManager.REACT_CLASS)
@SourceDebugExtension({"SMAP\nReactDrawerLayoutManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactDrawerLayoutManager.kt\ncom/facebook/react/views/drawer/ReactDrawerLayoutManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,257:1\n1#2:258\n*E\n"})
public final class ReactDrawerLayoutManager extends ViewGroupManager<ReactDrawerLayout> implements AndroidDrawerLayoutManagerInterface<ReactDrawerLayout> {
    public static final int CLOSE_DRAWER = 2;

    @NotNull
    public static final String COMMAND_CLOSE_DRAWER = "closeDrawer";

    @NotNull
    public static final String COMMAND_OPEN_DRAWER = "openDrawer";

    @NotNull
    private static final String DRAWER_POSITION = "DrawerPosition";

    @NotNull
    private static final String DRAWER_POSITION_LEFT = "Left";

    @NotNull
    private static final String DRAWER_POSITION_RIGHT = "Right";
    public static final int OPEN_DRAWER = 1;

    @NotNull
    public static final String REACT_CLASS = "AndroidDrawerLayout";

    @NotNull
    private final ViewManagerDelegate<ReactDrawerLayout> delegate;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/facebook/react/views/drawer/ReactDrawerLayoutManager$DrawerEventEmitter;", "Landroidx/drawerlayout/widget/DrawerLayout$DrawerListener;", "drawerLayout", "Landroidx/drawerlayout/widget/DrawerLayout;", "eventDispatcher", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "<init>", "(Landroidx/drawerlayout/widget/DrawerLayout;Lcom/facebook/react/uimanager/events/EventDispatcher;)V", "onDrawerSlide", "", "view", "Landroid/view/View;", "v", "", "onDrawerOpened", "onDrawerClosed", "onDrawerStateChanged", "i", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DrawerEventEmitter implements DrawerLayout.DrawerListener {

        @NotNull
        private final DrawerLayout drawerLayout;

        @NotNull
        private final EventDispatcher eventDispatcher;

        public DrawerEventEmitter(@NotNull DrawerLayout drawerLayout, @NotNull EventDispatcher eventDispatcher) {
            Intrinsics.checkNotNullParameter(drawerLayout, "drawerLayout");
            Intrinsics.checkNotNullParameter(eventDispatcher, "eventDispatcher");
            this.drawerLayout = drawerLayout;
            this.eventDispatcher = eventDispatcher;
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void onDrawerClosed(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.eventDispatcher.dispatchEvent(new DrawerClosedEvent(UIManagerHelper.getSurfaceId(this.drawerLayout), this.drawerLayout.getId()));
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void onDrawerOpened(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.eventDispatcher.dispatchEvent(new DrawerOpenedEvent(UIManagerHelper.getSurfaceId(this.drawerLayout), this.drawerLayout.getId()));
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void onDrawerSlide(@NotNull View view, float v6) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.eventDispatcher.dispatchEvent(new DrawerSlideEvent(UIManagerHelper.getSurfaceId(this.drawerLayout), this.drawerLayout.getId(), v6));
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void onDrawerStateChanged(int i7) {
            this.eventDispatcher.dispatchEvent(new DrawerStateChangedEvent(UIManagerHelper.getSurfaceId(this.drawerLayout), this.drawerLayout.getId(), i7));
        }
    }

    public ReactDrawerLayoutManager() {
        super(null, 1, null);
        this.delegate = new AndroidDrawerLayoutManagerDelegate(this);
    }

    private final void setDrawerPositionInternal(ReactDrawerLayout view, String drawerPosition) {
        if (Intrinsics.areEqual(drawerPosition, ViewProps.LEFT)) {
            view.setDrawerPosition$ReactAndroid_release(8388611);
            return;
        }
        if (Intrinsics.areEqual(drawerPosition, ViewProps.RIGHT)) {
            view.setDrawerPosition$ReactAndroid_release(8388613);
            return;
        }
        a.v(ReactConstants.TAG, "drawerPosition must be 'left' or 'right', received" + drawerPosition);
        view.setDrawerPosition$ReactAndroid_release(8388611);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public Map<String, Integer> getCommandsMap() {
        return w0.g(new Pair(COMMAND_OPEN_DRAWER, 1), new Pair(COMMAND_CLOSE_DRAWER, 2));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ViewManagerDelegate<ReactDrawerLayout> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new LinkedHashMap<>();
        }
        exportedCustomDirectEventTypeConstants.put(DrawerSlideEvent.EVENT_NAME, v0.b(new Pair("registrationName", "onDrawerSlide")));
        exportedCustomDirectEventTypeConstants.put(DrawerOpenedEvent.EVENT_NAME, v0.b(new Pair("registrationName", "onDrawerOpen")));
        exportedCustomDirectEventTypeConstants.put(DrawerClosedEvent.EVENT_NAME, v0.b(new Pair("registrationName", "onDrawerClose")));
        exportedCustomDirectEventTypeConstants.put(DrawerStateChangedEvent.EVENT_NAME, v0.b(new Pair("registrationName", "onDrawerStateChanged")));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public Map<String, Object> getExportedViewConstants() {
        return v0.b(new Pair(DRAWER_POSITION, w0.g(new Pair(DRAWER_POSITION_LEFT, 8388611), new Pair(DRAWER_POSITION_RIGHT, 8388613))));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.IViewManagerWithChildren
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @Override // com.facebook.react.viewmanagers.AndroidDrawerLayoutManagerInterface
    @ReactProp(customType = "Color", name = "drawerBackgroundColor")
    public void setDrawerBackgroundColor(@NotNull ReactDrawerLayout view, Integer value) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.facebook.react.viewmanagers.AndroidDrawerLayoutManagerInterface
    @ReactProp(name = "keyboardDismissMode")
    public void setKeyboardDismissMode(@NotNull ReactDrawerLayout view, String value) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.facebook.react.viewmanagers.AndroidDrawerLayoutManagerInterface
    @ReactProp(customType = "Color", name = "statusBarBackgroundColor")
    public void setStatusBarBackgroundColor(@NotNull ReactDrawerLayout view, Integer value) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(@NotNull ThemedReactContext reactContext, @NotNull ReactDrawerLayout view) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(view, "view");
        EventDispatcher eventDispatcher = UIManagerHelper.getEventDispatcher(reactContext);
        if (eventDispatcher == null) {
            return;
        }
        view.addDrawerListener(new DrawerEventEmitter(view, eventDispatcher));
    }

    @Override // com.facebook.react.viewmanagers.AndroidDrawerLayoutManagerInterface
    public void closeDrawer(@NotNull ReactDrawerLayout view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.closeDrawer$ReactAndroid_release();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ReactDrawerLayout createViewInstance(@NotNull ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new ReactDrawerLayout(context);
    }

    @Override // com.facebook.react.viewmanagers.AndroidDrawerLayoutManagerInterface
    public void openDrawer(@NotNull ReactDrawerLayout view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.openDrawer$ReactAndroid_release();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @d
    public void receiveCommand(@NotNull ReactDrawerLayout view, int commandId, ReadableArray args) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (commandId == 1) {
            view.openDrawer$ReactAndroid_release();
        } else {
            if (commandId != 2) {
                return;
            }
            view.closeDrawer$ReactAndroid_release();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r5.equals("unlocked") != false) goto L25;
     */
    @Override // com.facebook.react.viewmanagers.AndroidDrawerLayoutManagerInterface
    @com.facebook.react.uimanager.annotations.ReactProp(name = "drawerLockMode")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setDrawerLockMode(@org.jetbrains.annotations.NotNull com.facebook.react.views.drawer.ReactDrawerLayout r4, java.lang.String r5) {
        /*
            r3 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            if (r5 == 0) goto L4f
            int r1 = r5.hashCode()
            r2 = -1292600945(0xffffffffb2f4798f, float:-2.8460617E-8)
            if (r1 == r2) goto L33
            r2 = -210949405(0xfffffffff36d2ae3, float:-1.8790347E31)
            if (r1 == r2) goto L2a
            r2 = 168848173(0xa106b2d, float:6.953505E-33)
            if (r1 == r2) goto L1c
            goto L3b
        L1c:
            java.lang.String r1 = "locked-open"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L25
            goto L3b
        L25:
            r5 = 2
            r4.setDrawerLockMode(r5)
            return
        L2a:
            java.lang.String r1 = "unlocked"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L3b
            goto L4f
        L33:
            java.lang.String r1 = "locked-closed"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L4a
        L3b:
            java.lang.String r1 = "Unknown drawerLockMode "
            java.lang.String r5 = r1.concat(r5)
            java.lang.String r1 = "ReactNative"
            o8.a.v(r1, r5)
            r4.setDrawerLockMode(r0)
            return
        L4a:
            r5 = 1
            r4.setDrawerLockMode(r5)
            return
        L4f:
            r4.setDrawerLockMode(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.drawer.ReactDrawerLayoutManager.setDrawerLockMode(com.facebook.react.views.drawer.ReactDrawerLayout, java.lang.String):void");
    }

    @Override // com.facebook.react.viewmanagers.AndroidDrawerLayoutManagerInterface
    public void setDrawerPosition(@NotNull ReactDrawerLayout view, String value) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (value == null) {
            view.setDrawerPosition$ReactAndroid_release(8388611);
        } else {
            setDrawerPositionInternal(view, value);
        }
    }

    @ReactProp(defaultFloat = FloatCompanionObject.NaN, name = "drawerWidth")
    public final void setDrawerWidth(@NotNull ReactDrawerLayout view, float width) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setDrawerWidth$ReactAndroid_release(Float.isNaN(width) ? -1 : Math.round(PixelUtil.INSTANCE.dpToPx(width)));
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    public void setElevation(@NotNull ReactDrawerLayout view, float elevation) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setDrawerElevation(PixelUtil.INSTANCE.dpToPx(elevation));
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(@NotNull ReactDrawerLayout parent, @NotNull View child, int index) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        if (getChildCount(parent) >= 2) {
            throw new JSApplicationIllegalArgumentException("The Drawer cannot have more than two children");
        }
        if (index != 0 && index != 1) {
            throw new JSApplicationIllegalArgumentException(g.d(index, "The only valid indices for drawer's child are 0 or 1. Got ", " instead."));
        }
        parent.addView(child, index);
        parent.setDrawerProperties$ReactAndroid_release();
    }

    @ReactProp(name = "drawerPosition")
    public final void setDrawerPosition(@NotNull ReactDrawerLayout view, @NotNull Dynamic drawerPosition) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(drawerPosition, "drawerPosition");
        if (drawerPosition.isNull()) {
            view.setDrawerPosition$ReactAndroid_release(8388611);
            return;
        }
        if (drawerPosition.getType() == ReadableType.Number) {
            int iAsInt = drawerPosition.asInt();
            if (8388611 != iAsInt && 8388613 != iAsInt) {
                a.v(ReactConstants.TAG, "Unknown drawerPosition " + iAsInt);
                view.setDrawerPosition$ReactAndroid_release(8388611);
                return;
            }
            view.setDrawerPosition$ReactAndroid_release(iAsInt);
            return;
        }
        if (drawerPosition.getType() == ReadableType.String) {
            String strAsString = drawerPosition.asString();
            if (strAsString == null) {
                throw new IllegalStateException("Required value was null.");
            }
            setDrawerPositionInternal(view, strAsString);
            return;
        }
        a.v(ReactConstants.TAG, "drawerPosition must be a string or int");
        view.setDrawerPosition$ReactAndroid_release(8388611);
    }

    @Override // com.facebook.react.viewmanagers.AndroidDrawerLayoutManagerInterface
    public void setDrawerWidth(@NotNull ReactDrawerLayout view, Float value) {
        int iRound;
        Intrinsics.checkNotNullParameter(view, "view");
        if (value != null) {
            iRound = Math.round(PixelUtil.INSTANCE.dpToPx(value.floatValue()));
        } else {
            iRound = -1;
        }
        view.setDrawerWidth$ReactAndroid_release(iRound);
    }
}
