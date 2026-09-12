package io.sentry.android.replay.viewhierarchy;

import android.annotation.TargetApi;
import android.view.View;
import g0.k;
import i0.u;
import i0.w;
import io.sentry.android.replay.SentryReplayModifiers;
import io.sentry.w5;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import k0.c;
import k0.d;
import k0.e;
import k0.h;
import k0.i;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import rn.l;
import v.a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0012\u001a\u00020\n*\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J;\u0010\u0019\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u001d\u001a\u00020\u001c*\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010!\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b!\u0010\"R\u001d\u0010(\u001a\u0004\u0018\u00010#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0016\u0010)\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R$\u0010-\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b-\u0010.\u0012\u0004\b/\u0010\u0003¨\u00060"}, d2 = {"Lio/sentry/android/replay/viewhierarchy/ComposeViewHierarchyNode;", "", "<init>", "()V", "Li0/u;", "node", "Lk0/d;", "retrieveSemanticsConfiguration$sentry_android_replay_release", "(Li0/u;)Lk0/d;", "retrieveSemanticsConfiguration", "", "isImage", "config", "", "getProxyClassName", "(ZLk0/d;)Ljava/lang/String;", "Lio/sentry/w5;", "options", "shouldMask", "(Lk0/d;ZLio/sentry/w5;)Z", "Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;", "parent", "", "distance", "isComposeRoot", "fromComposeNode", "(Li0/u;Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;IZLio/sentry/w5;)Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;", "parentNode", "", "traverse", "(Li0/u;Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;ZLio/sentry/w5;)V", "Landroid/view/View;", "view", "fromView", "(Landroid/view/View;Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;Lio/sentry/w5;)Z", "Ljava/lang/reflect/Method;", "getSemanticsConfigurationMethod$delegate", "Lkotlin/Lazy;", "getGetSemanticsConfigurationMethod", "()Ljava/lang/reflect/Method;", "getSemanticsConfigurationMethod", "semanticsRetrievalErrorLogged", "Z", "Ljava/lang/ref/WeakReference;", "Lg0/k;", "_rootCoordinates", "Ljava/lang/ref/WeakReference;", "get_rootCoordinates$annotations", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@TargetApi(26)
@SourceDebugExtension({"SMAP\nComposeViewHierarchyNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeViewHierarchyNode.kt\nio/sentry/android/replay/viewhierarchy/ComposeViewHierarchyNode\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,310:1\n652#2:311\n*S KotlinDebug\n*F\n+ 1 ComposeViewHierarchyNode.kt\nio/sentry/android/replay/viewhierarchy/ComposeViewHierarchyNode\n*L\n187#1:311\n*E\n"})
public final class ComposeViewHierarchyNode {
    private static WeakReference<k> _rootCoordinates;
    private static boolean semanticsRetrievalErrorLogged;

    @NotNull
    public static final ComposeViewHierarchyNode INSTANCE = new ComposeViewHierarchyNode();

    /* JADX INFO: renamed from: getSemanticsConfigurationMethod$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy getSemanticsConfigurationMethod = l.b(new Function0<Method>() { // from class: io.sentry.android.replay.viewhierarchy.ComposeViewHierarchyNode$getSemanticsConfigurationMethod$2
        @Override // kotlin.jvm.functions.Function0
        public final Method invoke() {
            try {
                Method declaredMethod = u.class.getDeclaredMethod("getSemanticsConfiguration", null);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
                return null;
            }
        }
    });
    public static final int $stable = 8;

    private ComposeViewHierarchyNode() {
    }

    private final ViewHierarchyNode fromComposeNode(u node, ViewHierarchyNode parent, int distance, boolean isComposeRoot, w5 options) {
        boolean z5 = node.f11326m.f11348i.G;
        return null;
    }

    private final Method getGetSemanticsConfigurationMethod() {
        return (Method) getSemanticsConfigurationMethod.getValue();
    }

    private final String getProxyClassName(boolean isImage, d config) {
        if (isImage) {
            return "android.widget.ImageView";
        }
        if (config == null) {
            return "android.view.View";
        }
        LinkedHashMap linkedHashMap = config.f14211d;
        i key = h.f14221a;
        Intrinsics.checkNotNullParameter(key, "key");
        if (linkedHashMap.containsKey(key)) {
            return "android.widget.TextView";
        }
        i key2 = c.f14210a;
        Intrinsics.checkNotNullParameter(key2, "key");
        if (linkedHashMap.containsKey(key2)) {
            return "android.widget.TextView";
        }
        i key3 = h.f14222b;
        Intrinsics.checkNotNullParameter(key3, "key");
        return linkedHashMap.containsKey(key3) ? "android.widget.TextView" : "android.view.View";
    }

    private static /* synthetic */ void get_rootCoordinates$annotations() {
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, k0.d] */
    public static final d retrieveSemanticsConfiguration$sentry_android_replay_release(@NotNull u node) {
        Intrinsics.checkNotNullParameter(node, "node");
        Method getSemanticsConfigurationMethod2 = INSTANCE.getGetSemanticsConfigurationMethod();
        if (getSemanticsConfigurationMethod2 != null) {
            return (d) getSemanticsConfigurationMethod2.invoke(node, null);
        }
        if ((node.f11325l.f11290e.f23576c & 8) == 0) {
            return null;
        }
        new Ref.ObjectRef().element = new d();
        w.d(node);
        throw null;
    }

    private final boolean shouldMask(d dVar, boolean z5, w5 w5Var) {
        Object obj = null;
        if (dVar != null) {
            i key = SentryReplayModifiers.INSTANCE.getSentryPrivacy();
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(key, "key");
            e defaultValue = e.f14212d;
            Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
            Object obj2 = dVar.f14211d.get(key);
            if (obj2 == null) {
                defaultValue.getClass();
            } else {
                obj = obj2;
            }
            obj = (String) obj;
        }
        if (Intrinsics.areEqual(obj, "unmask")) {
            return false;
        }
        if (Intrinsics.areEqual(obj, "mask")) {
            return true;
        }
        String proxyClassName = getProxyClassName(z5, dVar);
        if (w5Var.getSessionReplay().f12052d.contains(proxyClassName)) {
            return false;
        }
        return w5Var.getSessionReplay().f12051c.contains(proxyClassName);
    }

    private final void traverse(u uVar, ViewHierarchyNode viewHierarchyNode, boolean z5, w5 w5Var) {
        a aVar = (a) ((v.d) uVar.f11319d.f9547e).c();
        v.d dVar = aVar.f21316d;
        if (aVar.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(dVar.f21324i);
        int i7 = dVar.f21324i;
        int i10 = 0;
        while (i10 < i7) {
            u uVar2 = (u) aVar.get(i10);
            ViewHierarchyNode viewHierarchyNode2 = viewHierarchyNode;
            boolean z6 = z5;
            w5 w5Var2 = w5Var;
            ViewHierarchyNode viewHierarchyNodeFromComposeNode = fromComposeNode(uVar2, viewHierarchyNode2, i10, z6, w5Var2);
            if (viewHierarchyNodeFromComposeNode != null) {
                arrayList.add(viewHierarchyNodeFromComposeNode);
                traverse(uVar2, viewHierarchyNodeFromComposeNode, false, w5Var2);
            }
            i10++;
            viewHierarchyNode = viewHierarchyNode2;
            z5 = z6;
            w5Var = w5Var2;
        }
        viewHierarchyNode.setChildren(arrayList);
    }

    public final boolean fromView(@NotNull View view, ViewHierarchyNode parent, @NotNull w5 options) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(options, "options");
        String name = view.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        StringsKt.D(name, "AndroidComposeView", false);
        return false;
    }
}
