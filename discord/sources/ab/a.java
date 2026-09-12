package ab;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResultCallback;
import com.discord.bundle_updater.BundleUpdater;
import com.discord.timers.TimersManager;
import com.facebook.react.fabric.mounting.SurfaceMountingManager;
import com.facebook.react.fabric.mounting.ViewTransitionCoordinator;
import com.facebook.react.fabric.mounting.ViewTransitionCoordinator$markViewInTransition$listener$1;
import com.facebook.react.jstasks.HeadlessJsTaskConfig;
import com.facebook.react.jstasks.HeadlessJsTaskContext;
import com.facebook.react.modules.toast.ToastModule;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.swmansion.rnscreens.Screen;
import e.g;
import f.c;
import gc.g1;
import hc.u;
import java.util.concurrent.CopyOnWriteArraySet;
import je.j;
import je.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mc.n;
import md.s;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f295e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f296i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f297v;

    public /* synthetic */ a(int i7, BundleUpdater bundleUpdater, Function0 function0) {
        this.f294d = 1;
        this.f295e = i7;
        this.f296i = bundleUpdater;
        this.f297v = function0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, mc.o] */
    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        int i7 = this.f294d;
        ?? r5 = this.f297v;
        int i10 = this.f295e;
        Object obj = this.f296i;
        switch (i7) {
            case 0:
                ((HeadlessJsTaskContext) obj).startTask((HeadlessJsTaskConfig) r5, i10);
                break;
            case 1:
                BundleUpdater.checkForUpdate$lambda$11(i10, (BundleUpdater) obj, (Function0) r5);
                break;
            case 2:
                TimersManager.setTimeout$lambda$0((TimersManager) obj, i10, (Function0) r5);
                break;
            case 3:
                SurfaceMountingManager.addViewAtInternal$lambda$9((View) obj, (ViewGroup) r5, i10);
                break;
            case 4:
                ViewTransitionCoordinator$markViewInTransition$listener$1.onViewDetachedFromWindow$lambda$0((ViewTransitionCoordinator) obj, i10, (Runnable) r5);
                break;
            case 5:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj;
                Screen screen = (Screen) r5;
                Screen.Companion companion = Screen.Companion;
                Intrinsics.checkNotNullParameter(bottomSheetBehavior, "<this>");
                bottomSheetBehavior.f6285l = i10;
                screen.layout(screen.getLeft(), screen.getBottom() - i10, screen.getRight(), screen.getBottom());
                break;
            case 6:
                g gVar = (g) obj;
                Object obj2 = ((g.a) r5).f9429a;
                String str = (String) gVar.f723a.get(Integer.valueOf(i10));
                if (str != null) {
                    c cVar = (c) gVar.f727e.get(str);
                    if ((cVar != null ? cVar.f8765a : null) == null) {
                        gVar.f729g.remove(str);
                        gVar.f728f.put(str, obj2);
                    } else {
                        ActivityResultCallback activityResultCallback = cVar.f8765a;
                        Intrinsics.checkNotNull(activityResultCallback, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
                        if (gVar.f726d.remove(str)) {
                            activityResultCallback.d(obj2);
                        }
                    }
                    break;
                }
                break;
            case 7:
                ((g) obj).a(i10, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) r5));
                break;
            case 8:
                ToastModule.show$lambda$0((ToastModule) obj, (String) r5, i10);
                break;
            case 9:
                Pair pair = (Pair) r5;
                ((u) ((hc.a) ((g1) ((e4.c) obj).f7967i).f9667i)).r(((Integer) pair.first).intValue(), (s) pair.second, i10);
                break;
            case 10:
                j jVar = (j) r5;
                for (l lVar : (CopyOnWriteArraySet) obj) {
                    if (!lVar.f13806d) {
                        if (i10 != -1) {
                            lVar.f13804b.g(i10);
                        }
                        lVar.f13805c = true;
                        jVar.invoke(lVar.f13803a);
                    }
                }
                break;
            case 11:
                n nVar = (n) obj;
                r5.r(nVar.f15568a, nVar.f15569b, i10);
                break;
            case 12:
                ((q.n) obj).onGreatestScrollPercentageIncreased(i10, (Bundle) r5);
                break;
            default:
                ((y2.b) ((ic.j) obj).f11519c).j(i10, r5);
                break;
        }
    }

    public /* synthetic */ a(Object obj, int i7, Object obj2, int i10) {
        this.f294d = i10;
        this.f296i = obj;
        this.f295e = i7;
        this.f297v = obj2;
    }

    public /* synthetic */ a(Object obj, Object obj2, int i7, int i10) {
        this.f294d = i10;
        this.f296i = obj;
        this.f297v = obj2;
        this.f295e = i7;
    }
}
