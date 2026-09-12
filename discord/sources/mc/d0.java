package mc;

import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 implements z {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final q f15517v = new q(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final UUID f15518d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MediaDrm f15519e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f15520i;

    public d0(UUID uuid) {
        uuid.getClass();
        UUID uuid2 = gc.h.f9670b;
        je.b.f("Use C.CLEARKEY_UUID instead", !uuid2.equals(uuid));
        this.f15518d = uuid;
        MediaDrm mediaDrm = new MediaDrm((je.e0.f13788a >= 27 || !gc.h.f9671c.equals(uuid)) ? uuid : uuid2);
        this.f15519e = mediaDrm;
        this.f15520i = 1;
        if (gc.h.f9672d.equals(uuid) && "ASUS_Z00AD".equals(je.e0.f13791d)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    @Override // mc.z
    public final void a(byte[] bArr, hc.c0 c0Var) {
        if (je.e0.f13788a >= 31) {
            try {
                c0.b(this.f15519e, bArr, c0Var);
            } catch (UnsupportedOperationException unused) {
                je.b.N("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // mc.z
    public final Map c(byte[] bArr) {
        return this.f15519e.queryKeyStatus(bArr);
    }

    @Override // mc.z
    public final y e() {
        MediaDrm.ProvisionRequest provisionRequest = this.f15519e.getProvisionRequest();
        return new y(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // mc.z
    public final void f(final fj.c cVar) {
        this.f15519e.setOnEventListener(new MediaDrm.OnEventListener() { // from class: mc.b0
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i7, int i10, byte[] bArr2) {
                d0 d0Var = this.f15493a;
                fj.c cVar2 = cVar;
                d0Var.getClass();
                bd.d dVar = ((f) cVar2.f9267e).f15549x;
                dVar.getClass();
                dVar.obtainMessage(i7, bArr).sendToTarget();
            }
        });
    }

    @Override // mc.z
    public final lc.b h(byte[] bArr) {
        int i7 = je.e0.f13788a;
        UUID uuid = this.f15518d;
        boolean z5 = i7 < 21 && gc.h.f9672d.equals(uuid) && "L3".equals(this.f15519e.getPropertyString("securityLevel"));
        if (i7 < 27 && gc.h.f9671c.equals(uuid)) {
            uuid = gc.h.f9670b;
        }
        return new a0(uuid, bArr, z5);
    }

    @Override // mc.z
    public final byte[] j() {
        return this.f15519e.openSession();
    }

    @Override // mc.z
    public final boolean m(byte[] bArr, String str) {
        if (je.e0.f13788a >= 31) {
            return c0.a(this.f15519e, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.f15518d, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    @Override // mc.z
    public final void n(byte[] bArr, byte[] bArr2) {
        this.f15519e.restoreKeys(bArr, bArr2);
    }

    @Override // mc.z
    public final void o(byte[] bArr) {
        this.f15519e.closeSession(bArr);
    }

    @Override // mc.z
    public final byte[] p(byte[] bArr, byte[] bArr2) {
        if (gc.h.f9671c.equals(this.f15518d) && je.e0.f13788a < 27) {
            try {
                JSONObject jSONObject = new JSONObject(je.e0.n(bArr2));
                StringBuilder sb2 = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray("keys");
                for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                    if (i7 != 0) {
                        sb2.append(",");
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i7);
                    sb2.append("{\"k\":\"");
                    sb2.append(jSONObject2.getString("k").replace('-', '+').replace('_', '/'));
                    sb2.append("\",\"kid\":\"");
                    sb2.append(jSONObject2.getString("kid").replace('-', '+').replace('_', '/'));
                    sb2.append("\",\"kty\":\"");
                    sb2.append(jSONObject2.getString("kty"));
                    sb2.append("\"}");
                }
                sb2.append("]}");
                bArr2 = sb2.toString().getBytes(di.d.f7631c);
            } catch (JSONException e10) {
                je.b.s("ClearKeyUtil", "Failed to adjust response data: ".concat(je.e0.n(bArr2)), e10);
            }
        }
        return this.f15519e.provideKeyResponse(bArr, bArr2);
    }

    @Override // mc.z
    public final void q(byte[] bArr) throws DeniedByServerException {
        this.f15519e.provideProvisionResponse(bArr);
    }

    /* JADX WARN: Code duplicated, block: B:125:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0094  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:77:0x019b  */
    @Override // mc.z
    public final x r(byte[] bArr, List list, int i7, HashMap map) throws NotProvisionedException {
        byte[] bArr2;
        String str;
        int i10;
        h hVar;
        a1.d dVarE;
        int i11;
        int i12;
        byte[] bArrF;
        UUID uuid = this.f15518d;
        h hVar2 = null;
        if (list != null) {
            if (!gc.h.f9672d.equals(uuid)) {
                hVar = (h) list.get(0);
            } else if (je.e0.f13788a < 28 || list.size() <= 1) {
                i10 = 0;
                while (true) {
                    if (i10 < list.size()) {
                        hVar = (h) list.get(0);
                        break;
                    }
                    h hVar3 = (h) list.get(i10);
                    byte[] bArr3 = hVar3.f15557w;
                    bArr3.getClass();
                    dVarE = xc.j.e(bArr3);
                    if (dVarE == null) {
                        i11 = -1;
                    } else {
                        i11 = dVarE.f17e;
                    }
                    i12 = je.e0.f13788a;
                    if ((i12 >= 23 && i11 == 0) || (i12 >= 23 && i11 == 1)) {
                        hVar = hVar3;
                        break;
                    }
                }
            } else {
                h hVar4 = (h) list.get(0);
                int i13 = 0;
                int length = 0;
                while (true) {
                    if (i13 < list.size()) {
                        h hVar5 = (h) list.get(i13);
                        byte[] bArr4 = hVar5.f15557w;
                        bArr4.getClass();
                        if (!je.e0.a(hVar5.f15556v, hVar4.f15556v) || !je.e0.a(hVar5.f15555i, hVar4.f15555i) || xc.j.e(bArr4) == null) {
                            i10 = 0;
                            while (true) {
                                if (i10 < list.size()) {
                                    hVar = (h) list.get(0);
                                    break;
                                }
                                h hVar6 = (h) list.get(i10);
                                byte[] bArr5 = hVar6.f15557w;
                                bArr5.getClass();
                                dVarE = xc.j.e(bArr5);
                                if (dVarE == null) {
                                    i11 = -1;
                                } else {
                                    i11 = dVarE.f17e;
                                }
                                i12 = je.e0.f13788a;
                                i10 = i12 >= 23 ? i10 + 1 : i10 + 1;
                                hVar = hVar6;
                                break;
                            }
                        }
                        length += bArr4.length;
                        i13++;
                    } else {
                        byte[] bArr6 = new byte[length];
                        int i14 = 0;
                        for (int i15 = 0; i15 < list.size(); i15++) {
                            byte[] bArr7 = ((h) list.get(i15)).f15557w;
                            bArr7.getClass();
                            int length2 = bArr7.length;
                            System.arraycopy(bArr7, 0, bArr6, i14, length2);
                            i14 += length2;
                        }
                        hVar = new h(hVar4.f15554e, hVar4.f15555i, hVar4.f15556v, bArr6);
                    }
                }
            }
            byte[] bArrA = hVar.f15557w;
            bArrA.getClass();
            UUID uuid2 = gc.h.f9673e;
            if (uuid2.equals(uuid)) {
                byte[] bArrF2 = xc.j.f(bArrA, uuid);
                if (bArrF2 != null) {
                    bArrA = bArrF2;
                }
                je.w wVar = new je.w(bArrA);
                int i16 = wVar.i();
                short sK = wVar.k();
                short sK2 = wVar.k();
                if (sK == 1 && sK2 == 1) {
                    short sK3 = wVar.k();
                    Charset charset = di.d.f7633e;
                    String strS = wVar.s(sK3, charset);
                    if (!strS.contains("<LA_URL>")) {
                        int iIndexOf = strS.indexOf("</DATA>");
                        if (iIndexOf == -1) {
                            je.b.N("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
                        }
                        String str2 = strS.substring(0, iIndexOf) + "<LA_URL>https://x</LA_URL>" + strS.substring(iIndexOf);
                        int i17 = i16 + 52;
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i17);
                        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
                        byteBufferAllocate.putInt(i17);
                        byteBufferAllocate.putShort(sK);
                        byteBufferAllocate.putShort(sK2);
                        byteBufferAllocate.putShort((short) (str2.length() * 2));
                        byteBufferAllocate.put(str2.getBytes(charset));
                        bArrA = byteBufferAllocate.array();
                    }
                } else {
                    je.b.y("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
                }
                bArrA = xc.j.a(uuid2, null, bArrA);
            }
            int i18 = je.e0.f13788a;
            if (i18 >= 23 || !gc.h.f9672d.equals(uuid)) {
                if (uuid2.equals(uuid) && "Amazon".equals(je.e0.f13790c)) {
                    String str3 = je.e0.f13791d;
                    if ("AFTB".equals(str3) || "AFTS".equals(str3) || "AFTM".equals(str3) || "AFTT".equals(str3)) {
                        bArrF = xc.j.f(bArrA, uuid);
                        if (bArrF == null) {
                        }
                    }
                }
                bArrF = bArrA;
            } else {
                bArrF = xc.j.f(bArrA, uuid);
                if (bArrF == null) {
                    bArrF = bArrA;
                }
            }
            String str4 = hVar.f15556v;
            str = (i18 < 26 && gc.h.f9671c.equals(uuid) && ("video/mp4".equals(str4) || "audio/mp4".equals(str4))) ? "cenc" : str4;
            bArr2 = bArrF;
            hVar2 = hVar;
        } else {
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f15519e.getKeyRequest(bArr, bArr2, str, i7, map);
        byte[] data = keyRequest.getData();
        if (gc.h.f9671c.equals(uuid) && je.e0.f13788a < 27) {
            data = je.e0.n(data).replace('+', '-').replace('/', '_').getBytes(di.d.f7631c);
        }
        String defaultUrl = keyRequest.getDefaultUrl();
        if ("<LA_URL>https://x</LA_URL>".equals(defaultUrl) || (je.e0.f13788a == 33 && "https://default.url".equals(defaultUrl))) {
            defaultUrl = "";
        }
        if (TextUtils.isEmpty(defaultUrl) && hVar2 != null) {
            String str5 = hVar2.f15555i;
            if (!TextUtils.isEmpty(str5)) {
                defaultUrl = str5;
            }
        }
        if (je.e0.f13788a >= 23) {
            keyRequest.getRequestType();
        }
        return new x(data, defaultUrl);
    }

    @Override // mc.z
    public final synchronized void release() {
        int i7 = this.f15520i - 1;
        this.f15520i = i7;
        if (i7 == 0) {
            this.f15519e.release();
        }
    }

    @Override // mc.z
    public final int s() {
        return 2;
    }
}
