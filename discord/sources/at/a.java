package at;

import com.airbnb.android.react.lottie.LottieAnimationViewManager;
import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.github.yamill.orientation.OrientationModule;
import com.imagepicker.ImagePickerModule;
import com.reactnativecommunity.netinfo.NetInfoModule;
import com.reactnativecommunity.slider.ReactSliderManager;
import com.reactnativecommunity.webview.RNCWebViewManager;
import com.reactnativecommunity.webview.RNCWebViewModule;
import com.releaseprofiler.ReleaseProfilerModule;
import com.rnfs.RNFSManager;
import com.rnlineargradient.LinearGradientManager;
import fr.greweb.reactnativeviewshot.RNViewShotModule;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.collections.c0;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import org.linusu.RNGetRandomValuesModule;
import org.reactnative.maskedview.RNCMaskedViewManager;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ReactPackage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3007a;

    @Override // com.facebook.react.ReactPackage
    public final List createNativeModules(ReactApplicationContext reactContext) {
        switch (this.f3007a) {
            case 0:
                return Arrays.asList(new RNGetRandomValuesModule(reactContext));
            case 1:
                return Collections.EMPTY_LIST;
            case 2:
                ArrayList arrayList = new ArrayList();
                arrayList.add(new ImagePickerModule(reactContext));
                return arrayList;
            case 3:
                Intrinsics.checkNotNullParameter(reactContext, "reactContext");
                return c0.c(new RNCWebViewModule(reactContext));
            case 4:
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new RNFSManager(reactContext));
                return arrayList2;
            case 5:
                Intrinsics.checkNotNullParameter(reactContext, "reactContext");
                return c0.c(new ReleaseProfilerModule(reactContext));
            case 6:
                return Collections.EMPTY_LIST;
            case 7:
                Intrinsics.checkNotNullParameter(reactContext, "reactContext");
                return n0.f14659d;
            case 8:
                return Arrays.asList(new NetInfoModule(reactContext));
            case 9:
                return Collections.EMPTY_LIST;
            case 10:
                return Arrays.asList(new RNViewShotModule(reactContext));
            default:
                Intrinsics.checkNotNullParameter(reactContext, "reactContext");
                return c0.c(new OrientationModule(reactContext));
        }
    }

    @Override // com.facebook.react.ReactPackage
    public final List createViewManagers(ReactApplicationContext reactContext) {
        switch (this.f3007a) {
            case 0:
                return Collections.EMPTY_LIST;
            case 1:
                return Arrays.asList(new RNCMaskedViewManager());
            case 2:
                return Collections.EMPTY_LIST;
            case 3:
                Intrinsics.checkNotNullParameter(reactContext, "reactContext");
                return c0.c(new RNCWebViewManager());
            case 4:
                return Arrays.asList(new ViewManager[0]);
            case 5:
                Intrinsics.checkNotNullParameter(reactContext, "reactContext");
                return n0.f14659d;
            case 6:
                return Collections.singletonList(new LinearGradientManager());
            case 7:
                Intrinsics.checkNotNullParameter(reactContext, "reactContext");
                return c0.c(new LottieAnimationViewManager());
            case 8:
                return Collections.EMPTY_LIST;
            case 9:
                return Arrays.asList(new ReactSliderManager());
            case 10:
                return Collections.EMPTY_LIST;
            default:
                Intrinsics.checkNotNullParameter(reactContext, "reactContext");
                return n0.f14659d;
        }
    }
}
