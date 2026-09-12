package jm;

import android.util.SparseArray;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f13953a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f13954b = new SparseArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseArray f13955c = new SparseArray();

    public static int[] b(ReadableMap readableMap, String str) {
        ReadableArray array = readableMap.getArray(str);
        Intrinsics.checkNotNull(array);
        int size = array.size();
        int[] iArr = new int[size];
        for (int i7 = 0; i7 < size; i7++) {
            iArr[i7] = array.getInt(i7);
        }
        return iArr;
    }

    public final void a(im.f handler, ReadableMap config) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(config, "config");
        handler.H = this;
        if (config.hasKey("waitFor")) {
            this.f13953a.put(handler.f11892d, b(config, "waitFor"));
        }
        if (config.hasKey("simultaneousHandlers")) {
            this.f13954b.put(handler.f11892d, b(config, "simultaneousHandlers"));
        }
        if (config.hasKey("blocksHandlers")) {
            this.f13955c.put(handler.f11892d, b(config, "blocksHandlers"));
        }
    }
}
