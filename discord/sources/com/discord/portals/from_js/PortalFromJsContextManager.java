package com.discord.portals.from_js;

import android.view.View;
import com.discord.portals.utils.ViewRemoveFromParentKt;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000bH\u0007J\u0018\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000bH\u0007J\u001d\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\u0014J\u0015\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0016J$\u0010\u0017\u001a\u00020\u000e*\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\b2\u0006\u0010\u000f\u001a\u00020\u0006H\u0002J$\u0010\u0018\u001a\u00020\u000e*\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\b2\u0006\u0010\u000f\u001a\u00020\u0006H\u0002R\u001e\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\bX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0005j\u0002`\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/discord/portals/from_js/PortalFromJsContextManager;", "", "<init>", "()V", "portals", "", "", "Landroid/view/View;", "Lcom/discord/portals/from_js/Portals;", "portalContexts", "Ljava/lang/ref/WeakReference;", "Lcom/discord/portals/from_js/PortalFromJsContext;", "Lcom/discord/portals/from_js/PortalContexts;", "addContext", "", "portalId", "portalContext", "removeContext", "portalDidMount", "portalView", "portalDidMount$portals_release", "portalDidUnmount", "portalDidUnmount$portals_release", "addToContext", "removeFromContext", "portals_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PortalFromJsContextManager {

    @NotNull
    public static final PortalFromJsContextManager INSTANCE = new PortalFromJsContextManager();

    @NotNull
    private static final Map<String, View> portals = new HashMap();

    @NotNull
    private static final Map<String, WeakReference<PortalFromJsContext>> portalContexts = new HashMap();

    private PortalFromJsContextManager() {
    }

    private final void addToContext(Map<String, View> map, String str) {
        PortalFromJsContext portalFromJsContext;
        View view;
        WeakReference<PortalFromJsContext> weakReference = portalContexts.get(str);
        if (weakReference == null || (portalFromJsContext = weakReference.get()) == null || (view = map.get(str)) == null) {
            return;
        }
        portalFromJsContext.onPortalFromJsAdded(str, view);
    }

    private final void removeFromContext(Map<String, View> map, String str) {
        View view = map.get(str);
        if (view == null) {
            return;
        }
        WeakReference<PortalFromJsContext> weakReference = portalContexts.get(str);
        PortalFromJsContext portalFromJsContext = weakReference != null ? weakReference.get() : null;
        int portalViewIndex = portalFromJsContext != null ? portalFromJsContext.getPortalViewIndex(view) : -1;
        if (portalFromJsContext == null || portalViewIndex == -1) {
            ViewRemoveFromParentKt.removeFromParent(view);
        } else {
            portalFromJsContext.onPortalFromJsRemoved(str, view);
        }
    }

    public final void addContext(@NotNull String portalId, @NotNull PortalFromJsContext portalContext) {
        Intrinsics.checkNotNullParameter(portalId, "portalId");
        Intrinsics.checkNotNullParameter(portalContext, "portalContext");
        Map<String, WeakReference<PortalFromJsContext>> map = portalContexts;
        WeakReference<PortalFromJsContext> weakReference = map.get(portalId);
        if (Intrinsics.areEqual(weakReference != null ? weakReference.get() : null, portalContext)) {
            return;
        }
        Map<String, View> map2 = portals;
        removeFromContext(map2, portalId);
        map.put(portalId, new WeakReference<>(portalContext));
        addToContext(map2, portalId);
    }

    public final void portalDidMount$portals_release(@NotNull String portalId, @NotNull View portalView) {
        Intrinsics.checkNotNullParameter(portalId, "portalId");
        Intrinsics.checkNotNullParameter(portalView, "portalView");
        Map<String, View> map = portals;
        removeFromContext(map, portalId);
        map.put(portalId, portalView);
        addToContext(map, portalId);
    }

    public final void portalDidUnmount$portals_release(@NotNull String portalId) {
        Intrinsics.checkNotNullParameter(portalId, "portalId");
        Map<String, View> map = portals;
        removeFromContext(map, portalId);
        map.remove(portalId);
    }

    public final void removeContext(@NotNull String portalId, @NotNull PortalFromJsContext portalContext) {
        Intrinsics.checkNotNullParameter(portalId, "portalId");
        Intrinsics.checkNotNullParameter(portalContext, "portalContext");
        Map<String, WeakReference<PortalFromJsContext>> map = portalContexts;
        WeakReference<PortalFromJsContext> weakReference = map.get(portalId);
        if (Intrinsics.areEqual(weakReference != null ? weakReference.get() : null, portalContext)) {
            removeFromContext(portals, portalId);
            map.remove(portalId);
        }
    }
}
