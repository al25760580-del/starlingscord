package com.google.android.exoplayer2.audio;

import gc.g;
import ic.b;
import ic.c;
import je.e0;
import ue.i;

/* JADX INFO: loaded from: classes3.dex */
public final class AudioAttributes implements g {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final AudioAttributes f5627y = new AudioAttributes(0, 0, 1, 1, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5628d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5629e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f5630i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f5631v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f5632w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public i f5633x;

    static {
        int i7 = e0.f13788a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public AudioAttributes(int i7, int i10, int i11, int i12, int i13) {
        this.f5628d = i7;
        this.f5629e = i10;
        this.f5630i = i11;
        this.f5631v = i12;
        this.f5632w = i13;
    }

    public final i a() {
        if (this.f5633x == null) {
            i iVar = new i();
            android.media.AudioAttributes.Builder usage = new android.media.AudioAttributes.Builder().setContentType(this.f5628d).setFlags(this.f5629e).setUsage(this.f5630i);
            int i7 = e0.f13788a;
            if (i7 >= 29) {
                b.a(usage, this.f5631v);
            }
            if (i7 >= 32) {
                c.a(usage, this.f5632w);
            }
            iVar.f21117d = usage.build();
            this.f5633x = iVar;
        }
        return this.f5633x;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AudioAttributes.class == obj.getClass()) {
            AudioAttributes audioAttributes = (AudioAttributes) obj;
            if (this.f5628d == audioAttributes.f5628d && this.f5629e == audioAttributes.f5629e && this.f5630i == audioAttributes.f5630i && this.f5631v == audioAttributes.f5631v && this.f5632w == audioAttributes.f5632w) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((527 + this.f5628d) * 31) + this.f5629e) * 31) + this.f5630i) * 31) + this.f5631v) * 31) + this.f5632w;
    }
}
