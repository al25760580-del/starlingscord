package com.discord.react.utilities;

import android.view.ViewGroup;
import com.discord.react.utilities.ReactSelfMeasuringView;
import com.facebook.react.uimanager.ViewGroupManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u0000*\f\b\u0000\u0010\u0001*\u00020\u0002*\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/discord/react/utilities/SelfMeasuringViewGroupManager;", "T", "Landroid/view/ViewGroup;", "Lcom/discord/react/utilities/ReactSelfMeasuringView;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "<init>", "()V", "onDropViewInstance", "", "view", "(Landroid/view/ViewGroup;)V", "react_utilities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class SelfMeasuringViewGroupManager<T extends ViewGroup & ReactSelfMeasuringView> extends ViewGroupManager<T> {
    public SelfMeasuringViewGroupManager() {
        super(null, 1, null);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(@NotNull T view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.getReactSelfMeasurer().applyState(null);
        super.onDropViewInstance(view);
    }
}
