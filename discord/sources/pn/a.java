package pn;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f18055a;

    static {
        int[] iArr = new int[Bitmap.CompressFormat.values().length];
        f18055a = iArr;
        iArr[Bitmap.CompressFormat.PNG.ordinal()] = 1;
        iArr[Bitmap.CompressFormat.WEBP.ordinal()] = 2;
    }
}
