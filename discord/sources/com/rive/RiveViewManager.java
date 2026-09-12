package com.rive;

import android.view.View;
import com.margelo.nitro.rive.views.HybridRiveViewManager;
import em.m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/rive/RiveViewManager;", "Lcom/margelo/nitro/rive/views/HybridRiveViewManager;", "<init>", "()V", "onDropViewInstance", "", "view", "Landroid/view/View;", "rive-app_react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RiveViewManager extends HybridRiveViewManager {
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        m mVar = view instanceof m ? (m) view : null;
        if (mVar != null) {
            mVar.f8471w = true;
        }
        super.onDropViewInstance(view);
    }
}
