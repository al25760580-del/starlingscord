package com.facebook.soloader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.webrtc.PeerConnection;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends h0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5407d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f5408e;

    /* JADX WARN: Bottom block not found for handler: all -> 0x0105 */
    /* JADX WARN: Code duplicated, block: B:6:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j(com.facebook.soloader.l r18, com.facebook.soloader.l r19) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.j.<init>(com.facebook.soloader.l, com.facebook.soloader.l):void");
    }

    @Override // com.facebook.soloader.h0
    public final g0[] f() {
        switch (this.f5407d) {
            case 0:
                return (k[]) this.f5408e;
            default:
                ArrayList arrayList = new ArrayList();
                for (p pVar : ((b) this.f5408e).f5379e) {
                    pVar.getClass();
                    o oVar = new o(pVar, pVar);
                    try {
                        n[] nVarArrI = oVar.f5412d;
                        if (nVarArrI == null) {
                            nVarArrI = oVar.i();
                            oVar.f5412d = nVarArrI;
                        }
                        arrayList.addAll(Arrays.asList(nVarArrI));
                        oVar.close();
                    } catch (Throwable th2) {
                        try {
                            oVar.close();
                            break;
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
                return (g0[]) arrayList.toArray(new g0[arrayList.size()]);
        }
    }

    @Override // com.facebook.soloader.h0
    public final void g(File file) throws IOException {
        switch (this.f5407d) {
            case 0:
                byte[] bArr = new byte[PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS];
                for (k kVar : (k[]) this.f5408e) {
                    FileInputStream fileInputStream = new FileInputStream(kVar.f5409i);
                    try {
                        q qVar = new q(kVar, fileInputStream);
                        fileInputStream = null;
                        try {
                            h0.c(qVar, bArr, file);
                            qVar.close();
                        } catch (Throwable th2) {
                            try {
                                qVar.close();
                                break;
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        throw th4;
                    }
                }
                return;
            default:
                for (p pVar : ((b) this.f5408e).f5379e) {
                    pVar.getClass();
                    o oVar = new o(pVar, pVar);
                    try {
                        oVar.g(file);
                        oVar.close();
                    } catch (Throwable th5) {
                        try {
                            oVar.close();
                            break;
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                        throw th5;
                    }
                }
                return;
        }
    }

    public j(b bVar) {
        this.f5408e = bVar;
    }
}
