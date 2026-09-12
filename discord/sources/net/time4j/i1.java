package net.time4j;

/* JADX INFO: loaded from: classes3.dex */
public enum i1 implements xr.h {
    /* JADX INFO: Fake field, exist only in values array */
    SECONDS(1.0d),
    /* JADX INFO: Fake field, exist only in values array */
    NANOSECONDS(1.0E-9d);

    private final double length;

    i1(double d6) {
        this.length = d6;
    }

    @Override // xr.h
    public final double getLength() {
        return this.length;
    }
}
