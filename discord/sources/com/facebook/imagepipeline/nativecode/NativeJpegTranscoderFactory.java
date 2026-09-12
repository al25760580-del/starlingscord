package com.facebook.imagepipeline.nativecode;

/* JADX INFO: loaded from: classes3.dex */
@n8.c
public class NativeJpegTranscoderFactory implements ta.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f4919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f4920c;

    @n8.c
    public NativeJpegTranscoderFactory(int i7, boolean z5, boolean z6) {
        this.f4918a = i7;
        this.f4919b = z5;
        this.f4920c = z6;
    }

    @Override // ta.b
    @n8.c
    public ta.a createImageTranscoder(z9.c cVar, boolean z5) {
        if (cVar != z9.b.f23618a) {
            return null;
        }
        NativeJpegTranscoder nativeJpegTranscoder = new NativeJpegTranscoder();
        nativeJpegTranscoder.f4915a = z5;
        nativeJpegTranscoder.f4916b = this.f4918a;
        nativeJpegTranscoder.f4917c = this.f4919b;
        if (this.f4920c) {
            b.k();
        }
        return nativeJpegTranscoder;
    }
}
