package com.discord.device.utils;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\fJ\u0006\u0010\r\u001a\u00020\nJ\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\fH\u0002R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/discord/device/utils/DeviceFocusLockManager;", "", "<init>", "()V", "focusExcludedViews", "", "", "Landroid/view/View;", "focusExcludedViewPreviousImportantForAccessibilityValue", "enableFocusLock", "", "targetViews", "", "disableFocusLock", "getParallelAncestorViewTrees", "device_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDeviceFocusLockManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceFocusLockManager.kt\ncom/discord/device/utils/DeviceFocusLockManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,76:1\n1869#2,2:77\n216#3,2:79\n*S KotlinDebug\n*F\n+ 1 DeviceFocusLockManager.kt\ncom/discord/device/utils/DeviceFocusLockManager\n*L\n13#1:77,2\n27#1:79,2\n*E\n"})
public final class DeviceFocusLockManager {

    @NotNull
    public static final DeviceFocusLockManager INSTANCE = new DeviceFocusLockManager();

    @NotNull
    private static final Map<Integer, View> focusExcludedViews = new LinkedHashMap();

    @NotNull
    private static final Map<Integer, Integer> focusExcludedViewPreviousImportantForAccessibilityValue = new LinkedHashMap();

    private DeviceFocusLockManager() {
    }

    private final List<View> getParallelAncestorViewTrees(List<? extends View> targetViews) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (View view : targetViews) {
            ArrayList arrayList = new ArrayList();
            View view2 = view;
            while (view2.getParent() instanceof ViewGroup) {
                ViewParent parent = view2.getParent();
                Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ViewGroup viewGroup = (ViewGroup) parent;
                if (linkedHashSet2.contains(viewGroup)) {
                    arrayList.clear();
                    break;
                }
                int iIndexOfChild = viewGroup.indexOfChild(view2);
                for (int i7 = 0; i7 < iIndexOfChild; i7++) {
                    View childAt = viewGroup.getChildAt(i7);
                    if (!targetViews.contains(childAt)) {
                        Intrinsics.checkNotNull(childAt);
                        arrayList.add(childAt);
                    }
                }
                linkedHashSet2.add(viewGroup);
                view2 = viewGroup;
            }
            linkedHashSet.addAll(arrayList);
        }
        return CollectionsKt.i0(linkedHashSet);
    }

    public final void disableFocusLock() {
        Iterator<Map.Entry<Integer, View>> it = focusExcludedViews.entrySet().iterator();
        while (it.hasNext()) {
            View value = it.next().getValue();
            Integer num = focusExcludedViewPreviousImportantForAccessibilityValue.get(Integer.valueOf(value.getId()));
            value.setImportantForAccessibility(num != null ? num.intValue() : 0);
        }
        focusExcludedViews.clear();
        focusExcludedViewPreviousImportantForAccessibilityValue.clear();
    }

    public final void enableFocusLock(@NotNull List<? extends View> targetViews) {
        Intrinsics.checkNotNullParameter(targetViews, "targetViews");
        disableFocusLock();
        for (View view : getParallelAncestorViewTrees(targetViews)) {
            if (view.getId() > 0 && view.getImportantForAccessibility() != 4) {
                focusExcludedViews.put(Integer.valueOf(view.getId()), view);
                focusExcludedViewPreviousImportantForAccessibilityValue.put(Integer.valueOf(view.getId()), Integer.valueOf(view.getImportantForAccessibility()));
                view.setImportantForAccessibility(4);
            }
        }
    }
}
