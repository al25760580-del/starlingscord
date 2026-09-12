package com.horcrux.svg;

import com.facebook.react.uimanager.ThemedReactContext;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class v extends e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f6800d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public u f6801e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public u f6802i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final FilterRegion f6803v;

    public v(ThemedReactContext themedReactContext) {
        super(themedReactContext);
        this.f6800d = new HashMap();
        this.f6803v = new FilterRegion();
    }

    @Override // com.horcrux.svg.VirtualView
    public final void saveDefinition() {
        SvgView svgView;
        if (this.mName == null || (svgView = getSvgView()) == null) {
            return;
        }
        svgView.defineFilter(this, this.mName);
    }
}
