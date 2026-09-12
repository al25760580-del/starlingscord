package com.facebook.react.internal;

import android.os.Trace;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import w3.q;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/facebook/react/internal/SystraceSection;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "sectionName", "", "<init>", "(Ljava/lang/String;)V", "close", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SystraceSection implements AutoCloseable {
    public SystraceSection(@NotNull String sectionName) {
        Intrinsics.checkNotNullParameter(sectionName, "sectionName");
        q.g(sectionName);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        Trace.endSection();
    }
}
