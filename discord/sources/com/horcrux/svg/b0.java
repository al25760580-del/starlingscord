package com.horcrux.svg;

import android.graphics.Bitmap;
import com.facebook.datasource.DataSource;
import com.facebook.react.uimanager.UIManagerHelper;
import com.horcrux.svg.events.SvgLoadEvent;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 extends ja.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c0 f6671a;

    public b0(c0 c0Var) {
        this.f6671a = c0Var;
    }

    @Override // x8.b
    public final void onFailureImpl(DataSource dataSource) {
        this.f6671a.G.set(false);
        o8.a.y(dataSource.b(), "RNSVG: fetchDecodedImage failed!", new Object[0]);
    }

    @Override // ja.a
    public final void onNewResultImpl(Bitmap bitmap) {
        c0 c0Var = this.f6671a;
        UIManagerHelper.getEventDispatcherForReactTag(c0Var.mContext, c0Var.getId()).dispatchEvent(new SvgLoadEvent(UIManagerHelper.getSurfaceId(c0Var), c0Var.getId(), c0Var.mContext, c0Var.f6676w, bitmap.getWidth(), bitmap.getHeight()));
        c0Var.G.set(false);
        SvgView svgView = c0Var.getSvgView();
        if (svgView != null) {
            svgView.invalidate();
        }
    }
}
