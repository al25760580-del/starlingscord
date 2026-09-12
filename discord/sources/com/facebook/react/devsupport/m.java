package com.facebook.react.devsupport;

import androidx.core.util.Supplier;
import com.facebook.react.common.ShakeDetector;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m implements ShakeDetector.ShakeListener, Supplier, ChangeBundleLocationDialog.ChangeBundleLocationDialogListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DevSupportManagerBase f5201a;

    public /* synthetic */ m(DevSupportManagerBase devSupportManagerBase) {
        this.f5201a = devSupportManagerBase;
    }

    @Override // androidx.core.util.Supplier
    public Object get() {
        return DevSupportManagerBase._init_$lambda$3(this.f5201a);
    }

    @Override // com.facebook.react.devsupport.ChangeBundleLocationDialog.ChangeBundleLocationDialogListener
    public void onClick(String str) {
        DevSupportManagerBase.showDevOptionsDialog$lambda$18$lambda$17(this.f5201a, str);
    }

    @Override // com.facebook.react.common.ShakeDetector.ShakeListener
    public void onShake() {
        this.f5201a.showDevOptionsDialog();
    }
}
