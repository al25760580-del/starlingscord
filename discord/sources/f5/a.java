package f5;

import com.brentvatne.exoplayer.ReactExoplayerViewManager;
import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.ReactApplicationContext;
import fj.c;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ReactPackage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f8872a;

    @Override // com.facebook.react.ReactPackage
    public final List createNativeModules(ReactApplicationContext reactApplicationContext) {
        return Collections.EMPTY_LIST;
    }

    @Override // com.facebook.react.ReactPackage
    public final List createViewManagers(ReactApplicationContext reactApplicationContext) {
        if (this.f8872a == null) {
            this.f8872a = new c(reactApplicationContext);
        }
        return Collections.singletonList(new ReactExoplayerViewManager(this.f8872a));
    }
}
