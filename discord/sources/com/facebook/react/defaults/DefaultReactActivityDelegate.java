package com.facebook.react.defaults;

import com.facebook.react.ReactActivity;
import com.facebook.react.ReactActivityDelegate;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rn.d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\u000bJ\b\u0010\f\u001a\u00020\u0007H\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/facebook/react/defaults/DefaultReactActivityDelegate;", "Lcom/facebook/react/ReactActivityDelegate;", "activity", "Lcom/facebook/react/ReactActivity;", "mainComponentName", "", "fabricEnabled", "", "<init>", "(Lcom/facebook/react/ReactActivity;Ljava/lang/String;Z)V", "concurrentReactEnabled", "(Lcom/facebook/react/ReactActivity;Ljava/lang/String;ZZ)V", "isFabricEnabled", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class DefaultReactActivityDelegate extends ReactActivityDelegate {
    private final boolean fabricEnabled;

    public /* synthetic */ DefaultReactActivityDelegate(ReactActivity reactActivity, String str, boolean z5, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(reactActivity, str, (i7 & 4) != 0 ? false : z5);
    }

    @Override // com.facebook.react.ReactActivityDelegate
    /* JADX INFO: renamed from: isFabricEnabled, reason: from getter */
    public boolean getFabricEnabled() {
        return this.fabricEnabled;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultReactActivityDelegate(@NotNull ReactActivity activity, @NotNull String mainComponentName, boolean z5) {
        super(activity, mainComponentName);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(mainComponentName, "mainComponentName");
        this.fabricEnabled = z5;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @d
    public DefaultReactActivityDelegate(@NotNull ReactActivity activity, @NotNull String mainComponentName, boolean z5, boolean z6) {
        this(activity, mainComponentName, z5);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(mainComponentName, "mainComponentName");
    }
}
