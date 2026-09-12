package vp;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends IOException {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f21916d;

    public q(String str) {
        super(str);
        this.f21916d = null;
    }

    public static q a() {
        return new q("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }
}
