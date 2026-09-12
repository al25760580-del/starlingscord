package ag;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes3.dex */
public final class p0 extends r0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final char[] f565e;

    public p0(o0 o0Var) {
        super(o0Var, (Character) null);
        this.f565e = new char[IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING];
        char[] cArr = o0Var.f554b;
        if (cArr.length != 16) {
            throw new IllegalArgumentException();
        }
        for (int i7 = 0; i7 < 256; i7++) {
            char[] cArr2 = this.f565e;
            cArr2[i7] = cArr[i7 >>> 4];
            cArr2[i7 | IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER] = cArr[i7 & 15];
        }
    }

    @Override // ag.r0
    public final void a(StringBuilder sb2, byte[] bArr, int i7) {
        c.m(0, i7, bArr.length);
        for (int i10 = 0; i10 < i7; i10++) {
            int i11 = bArr[i10] & 255;
            char[] cArr = this.f565e;
            sb2.append(cArr[i11]);
            sb2.append(cArr[i11 | IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER]);
        }
    }
}
