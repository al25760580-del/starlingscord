package em;

import androidx.lifecycle.u;
import app.rive.runtime.kotlin.ResourceType;
import app.rive.runtime.kotlin.RiveAnimationView;
import app.rive.runtime.kotlin.core.RefCount;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends RiveAnimationView {
    @Override // app.rive.runtime.kotlin.RiveAnimationView, app.rive.runtime.kotlin.RiveTextureView
    public final u createObserver() {
        RefCount[] elements = {getController(), getRendererAttributes().getAssetLoader()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        ArrayList dependencies = CollectionsKt.j0(y.r(elements));
        Intrinsics.checkNotNullParameter(dependencies, "dependencies");
        return new f(dependencies);
    }

    @Override // app.rive.runtime.kotlin.RiveAnimationView, app.rive.runtime.kotlin.RiveTextureView, android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        ResourceType resource = getRendererAttributes().getResource();
        if ((resource instanceof ResourceType.ResourceRiveFile) && !((ResourceType.ResourceRiveFile) resource).getFile().getHasCppObject()) {
            getRendererAttributes().setResource(null);
        }
        super.onAttachedToWindow();
    }
}
