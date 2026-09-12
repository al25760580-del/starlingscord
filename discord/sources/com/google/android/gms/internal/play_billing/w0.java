package com.google.android.gms.internal.play_billing;

import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f6172a = new n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Logger f6174c;

    public w0(Class cls) {
        this.f6173b = cls.getName();
    }

    public final Logger a() {
        Logger logger = this.f6174c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f6172a) {
            try {
                Logger logger2 = this.f6174c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f6173b);
                this.f6174c = logger3;
                return logger3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
