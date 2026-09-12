package a1;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import com.discord.react.utilities.ReactViewExtensionsKt;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.runtime.ReactHostImpl;
import com.facebook.react.uimanager.ReactRoot;
import com.facebook.react.views.debuggingoverlay.DebuggingOverlay;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.swmansion.rnscreens.Screen;
import gc.w;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f39d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f40e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f41i;

    public /* synthetic */ l(int i7, int i10, Object obj) {
        this.f39d = i10;
        this.f41i = obj;
        this.f40e = i7;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, InvocationTargetException {
        Activity currentActivity;
        Window window;
        int i7 = this.f39d;
        int i10 = this.f40e;
        Object obj = this.f41i;
        switch (i7) {
            case 0:
                ((b) obj).g(i10);
                break;
            case 1:
                ReactInstanceManager.lambda$attachRootViewToInstance$6(i10, (ReactRoot) obj);
                break;
            case 2:
                ReactHostImpl.createMemoryPressureListener$lambda$14$lambda$13((WeakReference) obj, i10);
                break;
            case 3:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj;
                Screen.Companion companion = Screen.Companion;
                Intrinsics.checkNotNullParameter(bottomSheetBehavior, "<this>");
                bottomSheetBehavior.f6285l = i10;
                break;
            case 4:
                gc.d dVar = ((gc.c) obj).f9575e;
                if (i10 == -3 || i10 == -2) {
                    if (i10 == -2) {
                        w wVar = dVar.f9588c;
                        if (wVar != null) {
                            com.google.android.exoplayer2.c cVar = wVar.f9916d;
                            boolean zG = cVar.g();
                            cVar.u0(0, zG ? 2 : 1, zG);
                        }
                        dVar.b(2);
                    } else {
                        dVar.b(3);
                    }
                } else if (i10 == -1) {
                    w wVar2 = dVar.f9588c;
                    if (wVar2 != null) {
                        com.google.android.exoplayer2.c cVar2 = wVar2.f9916d;
                        boolean zG2 = cVar2.g();
                        cVar2.u0(-1, zG2 ? 2 : 1, zG2);
                    }
                    dVar.a();
                } else if (i10 == 1) {
                    dVar.b(1);
                    w wVar3 = dVar.f9588c;
                    if (wVar3 != null) {
                        com.google.android.exoplayer2.c cVar3 = wVar3.f9916d;
                        cVar3.u0(1, 1, cVar3.g());
                    }
                } else {
                    com.discord.chat.presentation.list.a.q(i10, "Unknown focus change type: ", "AudioFocusManager");
                }
                break;
            case 5:
                DebuggingOverlay.onDraw$lambda$1((DebuggingOverlay) obj, i10);
                break;
            case 6:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                View view = (View) sideSheetBehavior.f6429p.get();
                if (view != null) {
                    sideSheetBehavior.u(view, i10, false);
                }
                break;
            case 7:
                ReactViewExtensionsKt.queueManualLayout$lambda$3((ReactContext) obj, i10);
                break;
            default:
                yl.c cVar4 = (yl.c) obj;
                if (sl.c.d(cVar4.f23392a) != i10 && (currentActivity = cVar4.f23392a.getCurrentActivity()) != null && (window = currentActivity.getWindow()) != null) {
                    window.setSoftInputMode(i10);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ l(int i7, ReactRoot reactRoot) {
        this.f39d = 1;
        this.f40e = i7;
        this.f41i = reactRoot;
    }
}
