package org.chromium.net;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class CronetException extends IOException {
    public CronetException(String str, Throwable th2) {
        super(str, th2);
    }
}
