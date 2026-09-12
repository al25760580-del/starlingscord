package yl;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.uimanager.UIManagerHelper;
import io.sentry.h4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReactApplicationContext f23392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UIManager f23393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23394c;

    public c(ReactApplicationContext mReactContext) {
        Intrinsics.checkNotNullParameter(mReactContext, "mReactContext");
        this.f23392a = mReactContext;
        Intrinsics.checkNotNullParameter(mReactContext, "<this>");
        this.f23393b = UIManagerHelper.getUIManager(mReactContext, 2);
        new h4();
        this.f23394c = sl.c.d(mReactContext);
    }
}
