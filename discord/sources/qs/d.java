package qs;

import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ByteString f19077b;

    public d(ByteString data, int i7) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f19076a = i7;
        this.f19077b = data;
    }
}
