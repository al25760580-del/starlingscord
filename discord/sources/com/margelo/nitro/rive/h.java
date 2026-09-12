package com.margelo.nitro.rive;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends k {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String url) {
        super("Invalid URL: " + url);
        Intrinsics.checkNotNullParameter(url, "url");
    }
}
