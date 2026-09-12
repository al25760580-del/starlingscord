package com.horcrux.svg;

import android.graphics.Bitmap;
import com.facebook.react.bridge.ReactContext;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o extends e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f6769d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FilterRegion f6770e;

    public o(ReactContext reactContext) {
        super(reactContext);
        this.f6770e = new FilterRegion();
    }

    public static Bitmap d(HashMap map, Bitmap bitmap, String str) {
        Bitmap bitmap2 = str != null ? (Bitmap) map.get(str) : null;
        return bitmap2 != null ? bitmap2 : bitmap;
    }

    public abstract Bitmap c(HashMap map, Bitmap bitmap);

    @Override // com.horcrux.svg.VirtualView
    public final void saveDefinition() {
    }
}
