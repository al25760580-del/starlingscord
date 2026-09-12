package sm;

import androidx.work.CoroutineWorker;
import com.facebook.react.bridge.queue.MessageQueueThreadImpl;
import com.facebook.react.common.futures.SimpleSettableFuture;
import com.facebook.react.modules.core.ReactChoreographer;
import com.google.android.material.carousel.CarouselLayoutManager;
import kotlin.jvm.internal.Intrinsics;
import o1.o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f20287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f20288e;

    public /* synthetic */ f(int i7, Object obj) {
        this.f20287d = i7;
        this.f20288e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20287d) {
            case 0:
                ((g) this.f20288e).v();
                break;
            case 1:
                ((td.e) this.f20288e).w();
                break;
            case 2:
                ((u1.d) this.f20288e).f().h(new o("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."));
                break;
            case 3:
                ((CarouselLayoutManager) this.f20288e).requestLayout();
                break;
            case 4:
                CoroutineWorker this$0 = (CoroutineWorker) this.f20288e;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.f2809x.f9490d instanceof g4.a) {
                    this$0.f2808w.f(null);
                }
                break;
            case 5:
                vm.e eVar = (vm.e) this.f20288e;
                com.facebook.react.modules.core.b bVar = eVar.f21762e0;
                if (!eVar.H && bVar != null) {
                    eVar.H = true;
                    ReactChoreographer.INSTANCE.getInstance().postFrameCallback(ReactChoreographer.CallbackType.NATIVE_ANIMATED_MODULE, bVar);
                }
                Intrinsics.checkNotNullParameter("TabsHost", "tag");
                Intrinsics.checkNotNullParameter("BottomNavigationView request layout", "message");
                break;
            case 6:
                vm.c cVar = (vm.c) this.f20288e;
                if (cVar.f21750a) {
                    cVar.c();
                }
                break;
            default:
                MessageQueueThreadImpl.Companion.startNewBackgroundThread$lambda$0((SimpleSettableFuture) this.f20288e);
                break;
        }
    }
}
