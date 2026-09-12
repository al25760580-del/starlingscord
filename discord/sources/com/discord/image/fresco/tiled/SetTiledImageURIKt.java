package com.discord.image.fresco.tiled;

import android.content.res.Resources;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"setTiledImageURI", "", "Lcom/facebook/drawee/view/SimpleDraweeView;", "uri", "", "fresco_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class SetTiledImageURIKt {
    public static final void setTiledImageURI(@NotNull SimpleDraweeView simpleDraweeView, @NotNull String uri) {
        Intrinsics.checkNotNullParameter(simpleDraweeView, "<this>");
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (((GenericDraweeHierarchy) simpleDraweeView.getHierarchy()).f() != null) {
            throw new IllegalArgumentException("Somebody forgot to set actualImageScaleType='none'");
        }
        Resources resources = simpleDraweeView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        TiledDraweeController tiledDraweeController = new TiledDraweeController(resources, uri, null, 4, null);
        DraweeController controller = simpleDraweeView.getController();
        if (controller == null || !controller.isSameImageRequest(tiledDraweeController)) {
            simpleDraweeView.setController(tiledDraweeController);
        }
    }
}
