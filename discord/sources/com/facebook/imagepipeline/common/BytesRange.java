package com.facebook.imagepipeline.common;

import a3.e;
import com.discord.sticker.sticker_types.c;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import rn.l;
import rn.u;
import vi.d;

/* JADX INFO: loaded from: classes3.dex */
public final class BytesRange {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u f4806c = l.b(new c(27));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4808b;

    public BytesRange(int i7, int i10) {
        this.f4807a = i7;
        this.f4808b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(BytesRange.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.facebook.imagepipeline.common.BytesRange");
        BytesRange bytesRange = (BytesRange) obj;
        return this.f4807a == bytesRange.f4807a && this.f4808b == bytesRange.f4808b;
    }

    public final int hashCode() {
        return (this.f4807a * 31) + this.f4808b;
    }

    public final String toString() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return e.q(new Object[]{d.m(this.f4807a), d.m(this.f4808b)}, 2, null, "%s-%s", "format(...)");
    }
}
