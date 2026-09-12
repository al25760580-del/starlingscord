package bb;

import com.discord.jank_stats.JankSessionRecorder;
import com.facebook.react.modules.appearance.AppearanceModule;
import com.facebook.react.runtime.ReactHostImpl;
import com.reactnativecommunity.webview.RNCWebViewModule;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3086d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f3087e;

    public /* synthetic */ a(String str, int i7) {
        this.f3086d = i7;
        this.f3087e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3086d) {
            case 0:
                AppearanceModule.setColorScheme$lambda$1(this.f3087e);
                break;
            case 1:
                JankSessionRecorder.hydrateLaunchId$lambda$5(this.f3087e);
                break;
            case 2:
                ReactHostImpl.setEmulatedMedia$lambda$9(this.f3087e);
                break;
            default:
                RNCWebViewModule.lambda$releaseWebView$0(this.f3087e);
                break;
        }
    }
}
