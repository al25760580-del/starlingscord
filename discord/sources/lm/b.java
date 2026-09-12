package lm;

import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15108d;

    public b(im.f handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f15105a = handler.f11892d;
        this.f15106b = handler.f11896h;
        this.f15107c = handler.I;
        this.f15108d = handler.D;
    }

    public void a(WritableMap eventData) {
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        eventData.putInt("numberOfPointers", this.f15108d);
        eventData.putInt("pointerType", this.f15107c);
    }
}
