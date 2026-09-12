package com.swmansion.rnscreens;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 extends io.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ScreenStackHeaderConfig f7191e;

    /* JADX WARN: Illegal instructions before constructor call */
    public f0(ScreenStackHeaderConfig screenStackHeaderConfig, int i7) {
        this.f7190d = i7;
        switch (i7) {
            case 1:
                Boolean bool = Boolean.TRUE;
                this.f7191e = screenStackHeaderConfig;
                super(bool);
                break;
            case 2:
                Boolean bool2 = Boolean.TRUE;
                this.f7191e = screenStackHeaderConfig;
                super(bool2);
                break;
            default:
                Boolean bool3 = Boolean.TRUE;
                this.f7191e = screenStackHeaderConfig;
                super(bool3);
                break;
        }
    }

    @Override // io.c
    public final void afterChange(KProperty property, Object obj, Object obj2) {
        switch (this.f7190d) {
            case 0:
                Intrinsics.checkNotNullParameter(property, "property");
                if (((Boolean) obj).booleanValue() != ((Boolean) obj2).booleanValue()) {
                    ScreenStackHeaderConfig screenStackHeaderConfig = this.f7191e;
                    if (screenStackHeaderConfig.T) {
                        screenStackHeaderConfig.getToolbar().requestApplyInsets();
                    }
                }
                break;
            case 1:
                Intrinsics.checkNotNullParameter(property, "property");
                if (((Boolean) obj).booleanValue() != ((Boolean) obj2).booleanValue()) {
                    ScreenStackHeaderConfig screenStackHeaderConfig2 = this.f7191e;
                    if (screenStackHeaderConfig2.T) {
                        screenStackHeaderConfig2.getToolbar().requestApplyInsets();
                    }
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(property, "property");
                if (((Boolean) obj).booleanValue() != ((Boolean) obj2).booleanValue()) {
                    ScreenStackHeaderConfig screenStackHeaderConfig3 = this.f7191e;
                    if (screenStackHeaderConfig3.T) {
                        screenStackHeaderConfig3.getToolbar().requestApplyInsets();
                    }
                }
                break;
        }
    }
}
