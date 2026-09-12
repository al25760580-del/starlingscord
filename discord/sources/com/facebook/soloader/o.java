package com.facebook.soloader;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.webrtc.PeerConnection;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends h0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n[] f5412d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ZipFile f5413e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p f5414i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ p f5415v;

    public o(p pVar, p pVar2) {
        this.f5415v = pVar;
        this.f5413e = new ZipFile(pVar.f5416e);
        this.f5414i = pVar2;
    }

    @Override // com.facebook.soloader.h0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f5413e.close();
    }

    @Override // com.facebook.soloader.h0
    public final g0[] f() {
        n[] nVarArr = this.f5412d;
        if (nVarArr != null) {
            return nVarArr;
        }
        n[] nVarArrI = i();
        this.f5412d = nVarArrI;
        return nVarArrI;
    }

    @Override // com.facebook.soloader.h0
    public final void g(File file) throws IOException {
        n[] nVarArrI = this.f5412d;
        if (nVarArrI == null) {
            nVarArrI = i();
            this.f5412d = nVarArrI;
        }
        byte[] bArr = new byte[PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS];
        for (n nVar : nVarArrI) {
            InputStream inputStream = this.f5413e.getInputStream(nVar.f5410i);
            try {
                q qVar = new q(nVar, inputStream);
                inputStream = null;
                try {
                    h0.c(qVar, bArr, file);
                    qVar.close();
                } catch (Throwable th2) {
                    try {
                        qVar.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th4;
            }
        }
    }

    public final n[] i() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        HashMap map = new HashMap();
        Pattern patternCompile = Pattern.compile(this.f5415v.f5417f);
        String[] supportedAbis = SysUtil$MarshmallowSysdeps.getSupportedAbis();
        Enumeration<? extends ZipEntry> enumerationEntries = this.f5413e.entries();
        while (enumerationEntries.hasMoreElements()) {
            ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
            Matcher matcher = patternCompile.matcher(zipEntryNextElement.getName());
            if (matcher.matches()) {
                int iGroupCount = matcher.groupCount();
                String strGroup = matcher.group(iGroupCount - 1);
                String strGroup2 = matcher.group(iGroupCount);
                int i7 = 0;
                while (true) {
                    if (i7 >= supportedAbis.length) {
                        i7 = -1;
                        break;
                    }
                    String str = supportedAbis[i7];
                    if (str != null && strGroup.equals(str)) {
                        break;
                    }
                    i7++;
                }
                if (i7 >= 0) {
                    linkedHashSet.add(strGroup);
                    n nVar = (n) map.get(strGroup2);
                    if (nVar == null || i7 < nVar.f5411v) {
                        map.put(strGroup2, new n(strGroup2, zipEntryNextElement, i7));
                    }
                }
            }
        }
        this.f5414i.getClass();
        n[] nVarArr = (n[]) map.values().toArray(new n[map.size()]);
        Arrays.sort(nVarArr);
        return nVarArr;
    }
}
