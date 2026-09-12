package com.github.luben.zstd;

/* JADX INFO: loaded from: classes3.dex */
abstract class SharedDictBase extends AutoCloseBase {
    public void finalize() {
        close();
    }
}
