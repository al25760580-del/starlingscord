package com.facebook.react.fabric;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.PixelCopy;
import android.view.View;
import android.view.Window;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.fabric.mounting.MountingManager;
import com.facebook.react.fabric.mounting.SurfaceMountingManager;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 (2\u00020\u0001:\u0001(B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u000bH\u0003J\b\u0010\u0016\u001a\u00020\u0013H\u0003J\u0016\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\nJ \u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001dH\u0003J\u0016\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\nJ\u0006\u0010!\u001a\u00020\u0013J\u0010\u0010\"\u001a\u00020\u00132\u0006\u0010\u0002\u001a\u00020#H\u0016J\u0010\u0010$\u001a\u00020\u00132\u0006\u0010\u0002\u001a\u00020#H\u0016J\u0010\u0010%\u001a\u00020\u00132\u0006\u0010\u0002\u001a\u00020#H\u0017J\u0010\u0010&\u001a\u00020\u00132\u0006\u0010\u0002\u001a\u00020#H\u0016J\u0010\u0010'\u001a\u00020\u00132\u0006\u0010\u0002\u001a\u00020#H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R,\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b`\f8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R,\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n`\f8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/facebook/react/fabric/ViewTransitionSnapshotManager;", "Lcom/facebook/react/bridge/UIManagerListener;", "uiManager", "Lcom/facebook/react/fabric/FabricUIManager;", "mountingManager", "Lcom/facebook/react/fabric/mounting/MountingManager;", "<init>", "(Lcom/facebook/react/fabric/FabricUIManager;Lcom/facebook/react/fabric/mounting/MountingManager;)V", "viewSnapshots", "Ljava/util/LinkedHashMap;", "", "Landroid/graphics/Bitmap;", "Lkotlin/collections/LinkedHashMap;", "pendingTargets", "listenerRegistered", "", "mainHandler", "Landroid/os/Handler;", "onBitmapCaptured", "", "reactTag", "bitmap", "ensureListenerRegistered", "captureViewSnapshot", "surfaceId", "captureHardwareBitmap", "view", "Landroid/view/View;", "window", "Landroid/view/Window;", "setViewSnapshot", "sourceTag", "targetTag", "clearPendingSnapshots", "willDispatchViewUpdates", "Lcom/facebook/react/bridge/UIManager;", "willMountItems", "didMountItems", "didDispatchMountItems", "didScheduleMountItems", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nViewTransitionSnapshotManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewTransitionSnapshotManager.kt\ncom/facebook/react/fabric/ViewTransitionSnapshotManager\n+ 2 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,224:1\n90#2,6:225\n90#2,6:232\n1#3:231\n*S KotlinDebug\n*F\n+ 1 ViewTransitionSnapshotManager.kt\ncom/facebook/react/fabric/ViewTransitionSnapshotManager\n*L\n141#1:225,6\n157#1:232,6\n*E\n"})
public final class ViewTransitionSnapshotManager implements UIManagerListener {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private boolean listenerRegistered;

    @NotNull
    private final Handler mainHandler;

    @NotNull
    private final MountingManager mountingManager;

    @NotNull
    private final LinkedHashMap<Integer, Integer> pendingTargets;

    @NotNull
    private final FabricUIManager uiManager;

    @NotNull
    private final LinkedHashMap<Integer, Bitmap> viewSnapshots;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\b"}, d2 = {"Lcom/facebook/react/fabric/ViewTransitionSnapshotManager$Companion;", "", "<init>", "()V", "captureSoftwareBitmap", "Landroid/graphics/Bitmap;", "view", "Landroid/view/View;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nViewTransitionSnapshotManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewTransitionSnapshotManager.kt\ncom/facebook/react/fabric/ViewTransitionSnapshotManager$Companion\n+ 2 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n*L\n1#1,224:1\n90#2,6:225\n*S KotlinDebug\n*F\n+ 1 ViewTransitionSnapshotManager.kt\ncom/facebook/react/fabric/ViewTransitionSnapshotManager$Companion\n*L\n43#1:225,6\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Bitmap captureSoftwareBitmap(View view) {
            if (view.getWidth() <= 0 || view.getHeight() <= 0) {
                return null;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
            view.draw(new Canvas(bitmapCreateBitmap));
            return bitmapCreateBitmap;
        }

        private Companion() {
        }
    }

    public ViewTransitionSnapshotManager(@NotNull FabricUIManager uiManager, @NotNull MountingManager mountingManager) {
        Intrinsics.checkNotNullParameter(uiManager, "uiManager");
        Intrinsics.checkNotNullParameter(mountingManager, "mountingManager");
        this.uiManager = uiManager;
        this.mountingManager = mountingManager;
        this.viewSnapshots = new LinkedHashMap<>();
        this.pendingTargets = new LinkedHashMap<>();
        this.mainHandler = new Handler(Looper.getMainLooper());
    }

    private final void captureHardwareBitmap(View view, int reactTag, Window window) {
        final View view2;
        final int i7;
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        final int width = view.getWidth();
        final int height = view.getHeight();
        if (width > 0 && height > 0) {
            int i10 = iArr[0];
            int i11 = iArr[1];
            Rect rect = new Rect(i10, i11, i10 + width, i11 + height);
            int width2 = window.getDecorView().getWidth();
            int height2 = window.getDecorView().getHeight();
            int i12 = rect.left;
            if (i12 < 0) {
                i12 = 0;
            }
            int i13 = rect.top;
            int i14 = i13 >= 0 ? i13 : 0;
            int i15 = rect.right;
            if (i15 <= width2) {
                width2 = i15;
            }
            int i16 = rect.bottom;
            if (i16 <= height2) {
                height2 = i16;
            }
            Rect rect2 = new Rect(i12, i14, width2, height2);
            if (!rect2.isEmpty()) {
                final Bitmap bitmapCreateBitmap = Bitmap.createBitmap(rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888);
                final int i17 = rect2.left - rect.left;
                final int i18 = rect2.top - rect.top;
                try {
                    view2 = view;
                    i7 = reactTag;
                    try {
                        PixelCopy.request(window, rect2, bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: com.facebook.react.fabric.e
                            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                            public final void onPixelCopyFinished(int i19) {
                                ViewTransitionSnapshotManager.captureHardwareBitmap$lambda$3(width, height, bitmapCreateBitmap, i17, i18, this, i7, view2, i19);
                            }
                        }, this.mainHandler);
                    } catch (IllegalArgumentException unused) {
                        bitmapCreateBitmap.recycle();
                        Bitmap bitmapCaptureSoftwareBitmap = INSTANCE.captureSoftwareBitmap(view2);
                        if (bitmapCaptureSoftwareBitmap != null) {
                            onBitmapCaptured(i7, bitmapCaptureSoftwareBitmap);
                        }
                    }
                } catch (IllegalArgumentException unused2) {
                    view2 = view;
                    i7 = reactTag;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void captureHardwareBitmap$lambda$3(int i7, int i10, Bitmap bitmap, int i11, int i12, ViewTransitionSnapshotManager viewTransitionSnapshotManager, int i13, View view, int i14) {
        if (i14 == 0) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i7, i10, Bitmap.Config.ARGB_8888);
            new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, i11, i12, (Paint) null);
            bitmap.recycle();
            viewTransitionSnapshotManager.onBitmapCaptured(i13, bitmapCreateBitmap);
            return;
        }
        bitmap.recycle();
        Bitmap bitmapCaptureSoftwareBitmap = INSTANCE.captureSoftwareBitmap(view);
        if (bitmapCaptureSoftwareBitmap != null) {
            viewTransitionSnapshotManager.onBitmapCaptured(i13, bitmapCaptureSoftwareBitmap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void captureViewSnapshot$lambda$1(ViewTransitionSnapshotManager viewTransitionSnapshotManager, int i7, int i10) {
        Activity currentActivity;
        SurfaceMountingManager surfaceManager = viewTransitionSnapshotManager.mountingManager.getSurfaceManager(i7);
        if (surfaceManager != null && surfaceManager.getViewExists(i10)) {
            View view = surfaceManager.getView(i10);
            if (view.getWidth() <= 0 || view.getHeight() <= 0) {
                return;
            }
            Window window = null;
            if (Build.VERSION.SDK_INT >= 26) {
                Context context = view.getContext();
                ReactContext reactContext = context instanceof ReactContext ? (ReactContext) context : null;
                if (reactContext != null && (currentActivity = reactContext.getCurrentActivity()) != null) {
                    window = currentActivity.getWindow();
                }
            }
            if (window != null) {
                viewTransitionSnapshotManager.captureHardwareBitmap(view, i10, window);
                return;
            }
            Bitmap bitmapCaptureSoftwareBitmap = INSTANCE.captureSoftwareBitmap(view);
            if (bitmapCaptureSoftwareBitmap != null) {
                viewTransitionSnapshotManager.onBitmapCaptured(i10, bitmapCaptureSoftwareBitmap);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clearPendingSnapshots$lambda$6(ViewTransitionSnapshotManager viewTransitionSnapshotManager) {
        viewTransitionSnapshotManager.viewSnapshots.clear();
        viewTransitionSnapshotManager.pendingTargets.clear();
        if (viewTransitionSnapshotManager.listenerRegistered) {
            viewTransitionSnapshotManager.listenerRegistered = false;
            viewTransitionSnapshotManager.uiManager.removeUIManagerEventListener(viewTransitionSnapshotManager);
        }
    }

    private final void ensureListenerRegistered() {
        if (this.listenerRegistered) {
            return;
        }
        this.listenerRegistered = true;
        this.uiManager.addUIManagerEventListener(this);
    }

    private final void onBitmapCaptured(int reactTag, Bitmap bitmap) {
        this.viewSnapshots.put(Integer.valueOf(reactTag), bitmap);
        if (this.pendingTargets.containsKey(Integer.valueOf(reactTag))) {
            ensureListenerRegistered();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setViewSnapshot$lambda$5(ViewTransitionSnapshotManager viewTransitionSnapshotManager, int i7, int i10) {
        viewTransitionSnapshotManager.pendingTargets.put(Integer.valueOf(i7), Integer.valueOf(i10));
        if (viewTransitionSnapshotManager.viewSnapshots.containsKey(Integer.valueOf(i7))) {
            viewTransitionSnapshotManager.ensureListenerRegistered();
        }
    }

    public final void captureViewSnapshot(int reactTag, int surfaceId) {
        UiThreadUtil.runOnUiThread(new d(this, surfaceId, reactTag, 1));
    }

    public final void clearPendingSnapshots() {
        UiThreadUtil.runOnUiThread(new b(1, this));
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didDispatchMountItems(@NotNull UIManager uiManager) {
        Intrinsics.checkNotNullParameter(uiManager, "uiManager");
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didMountItems(@NotNull UIManager uiManager) {
        Bitmap bitmap;
        Intrinsics.checkNotNullParameter(uiManager, "uiManager");
        for (Map.Entry<Integer, Integer> entry : this.pendingTargets.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            SurfaceMountingManager surfaceManagerForView = this.mountingManager.getSurfaceManagerForView(iIntValue2);
            if (surfaceManagerForView != null && (bitmap = this.viewSnapshots.get(Integer.valueOf(iIntValue))) != null) {
                surfaceManagerForView.applyViewSnapshot(iIntValue2, bitmap);
            }
        }
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didScheduleMountItems(@NotNull UIManager uiManager) {
        Intrinsics.checkNotNullParameter(uiManager, "uiManager");
    }

    public final void setViewSnapshot(int sourceTag, int targetTag) {
        UiThreadUtil.runOnUiThread(new d(this, sourceTag, targetTag, 0));
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willDispatchViewUpdates(@NotNull UIManager uiManager) {
        Intrinsics.checkNotNullParameter(uiManager, "uiManager");
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willMountItems(@NotNull UIManager uiManager) {
        Intrinsics.checkNotNullParameter(uiManager, "uiManager");
    }
}
