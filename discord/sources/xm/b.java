package xm;

import android.graphics.drawable.Drawable;
import androidx.core.view.WindowInsetsControllerCompat;
import com.facebook.react.bridge.queue.MessageQueueThreadImpl;
import com.facebook.react.common.futures.SimpleSettableFuture;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import n1.h;
import n1.w;
import vm.k;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f22979d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f22980e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f22981i;

    public /* synthetic */ b(int i7, Object obj, Object obj2) {
        this.f22979d = i7;
        this.f22980e = obj;
        this.f22981i = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22979d) {
            case 0:
                ((k) this.f22980e).setIcon((Drawable) this.f22981i);
                break;
            case 1:
                MessageQueueThreadImpl.callOnQueue$lambda$0((SimpleSettableFuture) this.f22980e, (Callable) this.f22981i);
                break;
            case 2:
                ((h) this.f22980e).onResult((w) this.f22981i);
                break;
            default:
                zl.c cVar = (zl.c) this.f22980e;
                String str = (String) this.f22981i;
                WindowInsetsControllerCompat windowInsetsControllerCompatA = cVar.a();
                if (windowInsetsControllerCompatA != null) {
                    windowInsetsControllerCompatA.c(Intrinsics.areEqual(str, "dark-content"));
                }
                break;
        }
    }
}
