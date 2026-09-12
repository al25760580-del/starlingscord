package lc;

import android.media.MediaCodec;
import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f15000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f15001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f15003d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f15004e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15005f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f15006g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f15007h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f15008i;
    public final e4.e j;

    public c() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f15008i = cryptoInfo;
        this.j = e0.f13788a >= 24 ? new e4.e(cryptoInfo) : null;
    }
}
