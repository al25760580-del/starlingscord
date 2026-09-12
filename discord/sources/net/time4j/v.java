package net.time4j;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class v implements Serializable {
    private static final long serialVersionUID = -4124961309622141228L;
    private final long days;
    private final b1 time;

    public v(long j, b1 b1Var) {
        this.days = j;
        this.time = b1Var;
    }

    public final long a() {
        return this.days;
    }

    public final b1 b() {
        return this.time;
    }
}
