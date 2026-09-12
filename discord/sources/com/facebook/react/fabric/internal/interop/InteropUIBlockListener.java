package com.facebook.react.fabric.internal.interop;

import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import com.facebook.react.fabric.interop.UIBlock;
import com.facebook.react.fabric.interop.UIBlockViewResolver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0006J\u000e\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0006J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\u0003\u001a\u0004\b\b\u0010\tR\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\u0003\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/facebook/react/fabric/internal/interop/InteropUIBlockListener;", "Lcom/facebook/react/bridge/UIManagerListener;", "<init>", "()V", "beforeUIBlocks", "", "Lcom/facebook/react/fabric/interop/UIBlock;", "getBeforeUIBlocks$ReactAndroid_release$annotations", "getBeforeUIBlocks$ReactAndroid_release", "()Ljava/util/List;", "afterUIBlocks", "getAfterUIBlocks$ReactAndroid_release$annotations", "getAfterUIBlocks$ReactAndroid_release", "prependUIBlock", "", "block", "addUIBlock", "willMountItems", "uiManager", "Lcom/facebook/react/bridge/UIManager;", "didMountItems", "didDispatchMountItems", "willDispatchViewUpdates", "didScheduleMountItems", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nInteropUIBlockListener.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InteropUIBlockListener.kt\ncom/facebook/react/fabric/internal/interop/InteropUIBlockListener\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,82:1\n1#2:83\n1869#3,2:84\n1869#3,2:86\n*S KotlinDebug\n*F\n+ 1 InteropUIBlockListener.kt\ncom/facebook/react/fabric/internal/interop/InteropUIBlockListener\n*L\n56#1:84,2\n73#1:86,2\n*E\n"})
public final class InteropUIBlockListener implements UIManagerListener {

    @NotNull
    private final List<UIBlock> beforeUIBlocks = new ArrayList();

    @NotNull
    private final List<UIBlock> afterUIBlocks = new ArrayList();

    public static /* synthetic */ void getAfterUIBlocks$ReactAndroid_release$annotations() {
    }

    public static /* synthetic */ void getBeforeUIBlocks$ReactAndroid_release$annotations() {
    }

    public final synchronized void addUIBlock(@NotNull UIBlock block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.afterUIBlocks.add(block);
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didDispatchMountItems(@NotNull UIManager uiManager) {
        Intrinsics.checkNotNullParameter(uiManager, "uiManager");
        didMountItems(uiManager);
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didMountItems(@NotNull UIManager uiManager) {
        Intrinsics.checkNotNullParameter(uiManager, "uiManager");
        if (uiManager instanceof UIBlockViewResolver) {
            synchronized (this) {
                if (this.afterUIBlocks.isEmpty()) {
                    return;
                }
                List listI0 = CollectionsKt.i0(this.afterUIBlocks);
                this.afterUIBlocks.clear();
                Iterator it = listI0.iterator();
                while (it.hasNext()) {
                    ((UIBlock) it.next()).execute((UIBlockViewResolver) uiManager);
                }
            }
        }
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didScheduleMountItems(@NotNull UIManager uiManager) {
        Intrinsics.checkNotNullParameter(uiManager, "uiManager");
    }

    @NotNull
    public final List<UIBlock> getAfterUIBlocks$ReactAndroid_release() {
        return this.afterUIBlocks;
    }

    @NotNull
    public final List<UIBlock> getBeforeUIBlocks$ReactAndroid_release() {
        return this.beforeUIBlocks;
    }

    public final synchronized void prependUIBlock(@NotNull UIBlock block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.beforeUIBlocks.add(block);
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willDispatchViewUpdates(@NotNull UIManager uiManager) {
        Intrinsics.checkNotNullParameter(uiManager, "uiManager");
        willMountItems(uiManager);
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willMountItems(@NotNull UIManager uiManager) {
        Intrinsics.checkNotNullParameter(uiManager, "uiManager");
        if (uiManager instanceof UIBlockViewResolver) {
            synchronized (this) {
                if (this.beforeUIBlocks.isEmpty()) {
                    return;
                }
                List listI0 = CollectionsKt.i0(this.beforeUIBlocks);
                this.beforeUIBlocks.clear();
                Iterator it = listI0.iterator();
                while (it.hasNext()) {
                    ((UIBlock) it.next()).execute((UIBlockViewResolver) uiManager);
                }
            }
        }
    }
}
