package qj;

import a5.b0;
import c5.e;
import com.discord.media.engine.MediaEngine;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b[] f18906h = {new b(1, 10, 10, 8, 8, new b0(5, new e(1, 3, 8))), new b(2, 12, 12, 10, 10, new b0(7, new e(1, 5, 8))), new b(3, 14, 14, 12, 12, new b0(10, new e(1, 8, 8))), new b(4, 16, 16, 14, 14, new b0(12, new e(1, 12, 8))), new b(5, 18, 18, 16, 16, new b0(14, new e(1, 18, 8))), new b(6, 20, 20, 18, 18, new b0(18, new e(1, 22, 8))), new b(7, 22, 22, 20, 20, new b0(20, new e(1, 30, 8))), new b(8, 24, 24, 22, 22, new b0(24, new e(1, 36, 8))), new b(9, 26, 26, 24, 24, new b0(28, new e(1, 44, 8))), new b(10, 32, 32, 14, 14, new b0(36, new e(1, 62, 8))), new b(11, 36, 36, 16, 16, new b0(42, new e(1, 86, 8))), new b(12, 40, 40, 18, 18, new b0(48, new e(1, MediaEngine.MAX_SUPPORTED_PROTOCOL_VERSION, 8))), new b(13, 44, 44, 20, 20, new b0(56, new e(1, 144, 8))), new b(14, 48, 48, 22, 22, new b0(68, new e(1, 174, 8))), new b(15, 52, 52, 24, 24, new b0(42, new e(2, 102, 8))), new b(16, 64, 64, 14, 14, new b0(56, new e(2, 140, 8))), new b(17, 72, 72, 16, 16, new b0(36, new e(4, 92, 8))), new b(18, 80, 80, 18, 18, new b0(48, new e(4, MediaEngine.MAX_SUPPORTED_PROTOCOL_VERSION, 8))), new b(19, 88, 88, 20, 20, new b0(56, new e(4, 144, 8))), new b(20, 96, 96, 22, 22, new b0(68, new e(4, 174, 8))), new b(21, 104, 104, 24, 24, new b0(56, new e(6, 136, 8))), new b(22, 120, 120, 18, 18, new b0(68, new e(6, 175, 8))), new b(23, 132, 132, 20, 20, new b0(62, new e(8, 163, 8))), new b(24, 144, 144, 22, 22, new b0(new e(8, 156, 8), new e(2, 155, 8))), new b(25, 8, 18, 6, 16, new b0(7, new e(1, 5, 8))), new b(26, 8, 32, 6, 14, new b0(11, new e(1, 10, 8))), new b(27, 12, 26, 10, 24, new b0(14, new e(1, 16, 8))), new b(28, 12, 36, 10, 16, new b0(18, new e(1, 22, 8))), new b(29, 16, 36, 14, 16, new b0(24, new e(1, 32, 8))), new b(30, 16, 48, 14, 22, new b0(28, new e(1, 49, 8)))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f18911e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b0 f18912f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f18913g;

    public b(int i7, int i10, int i11, int i12, int i13, b0 b0Var) {
        this.f18907a = i7;
        this.f18908b = i10;
        this.f18909c = i11;
        this.f18910d = i12;
        this.f18911e = i13;
        this.f18912f = b0Var;
        int i14 = b0Var.f173e;
        int i15 = 0;
        for (e eVar : (e[]) b0Var.f174i) {
            i15 += (eVar.f3486c + i14) * eVar.f3485b;
        }
        this.f18913g = i15;
    }

    public final String toString() {
        return String.valueOf(this.f18907a);
    }
}
