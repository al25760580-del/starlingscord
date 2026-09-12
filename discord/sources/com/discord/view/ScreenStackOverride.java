package com.discord.view;

import android.content.Context;
import android.view.View;
import bn.e;
import com.swmansion.rnscreens.ScreenStack;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/discord/view/ScreenStackOverride;", "Lcom/swmansion/rnscreens/ScreenStack;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "endViewTransition", "", "view", "Landroid/view/View;", "app_googleRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScreenStackOverride extends ScreenStack {
    public ScreenStackOverride(Context context) {
        super(context);
    }

    @Override // com.swmansion.rnscreens.ScreenStack, android.view.ViewGroup
    public void endViewTransition(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view instanceof e) {
            ((e) view).getScreen().endRemovalTransition();
        }
        super.endViewTransition(view);
    }
}
