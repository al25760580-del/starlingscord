package bd;

import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t implements y {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final t f3214e = new t(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3215d;

    public /* synthetic */ t(int i7) {
        this.f3215d = i7;
    }

    @Override // bd.y
    public int a(Object obj) {
        o oVar = (o) obj;
        switch (this.f3215d) {
            case 2:
                String str = oVar.f3172a;
                if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
                    return 1;
                }
                return (e0.f13788a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
            default:
                return oVar.f3172a.startsWith("OMX.google") ? 1 : 0;
        }
    }
}
