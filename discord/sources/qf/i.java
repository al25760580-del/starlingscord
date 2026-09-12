package qf;

import ag.d1;
import ag.e1;
import ag.f1;
import ag.g1;
import ag.h1;
import ag.i1;
import ag.j1;
import ag.l1;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends k {

    @NonNull
    public static final Parcelable.Creator<i> CREATOR = new s0(14);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ag.y0 f18821d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ag.y0 f18822e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ag.y0 f18823i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String[] f18824v;

    public i(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        af.w.g(bArr);
        ag.y0 y0VarK = ag.y0.k(bArr, bArr.length);
        af.w.g(bArr2);
        ag.y0 y0VarK2 = ag.y0.k(bArr2, bArr2.length);
        af.w.g(bArr3);
        ag.y0 y0VarK3 = ag.y0.k(bArr3, bArr3.length);
        this.f18821d = y0VarK;
        this.f18822e = y0VarK2;
        this.f18823i = y0VarK3;
        af.w.g(strArr);
        this.f18824v = strArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return af.w.j(this.f18821d, iVar.f18821d) && af.w.j(this.f18822e, iVar.f18822e) && af.w.j(this.f18823i, iVar.f18823i);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0145 A[Catch: JSONException -> 0x0021, i1 -> 0x01a9, TRY_LEAVE, TryCatch #2 {i1 -> 0x01a9, blocks: (B:41:0x0111, B:47:0x0134, B:49:0x0145, B:54:0x015b, B:57:0x0177, B:59:0x018c, B:61:0x0191, B:64:0x01ac, B:65:0x01b1, B:66:0x01b2, B:67:0x01b9, B:72:0x01c6, B:74:0x01d3, B:76:0x01e0, B:77:0x01f5, B:78:0x01fa, B:79:0x01fb, B:80:0x0200, B:86:0x0222, B:87:0x0227), top: B:124:0x0111, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:70:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:74:0x01d3 A[Catch: JSONException -> 0x0021, i1 -> 0x01a9, TryCatch #2 {i1 -> 0x01a9, blocks: (B:41:0x0111, B:47:0x0134, B:49:0x0145, B:54:0x015b, B:57:0x0177, B:59:0x018c, B:61:0x0191, B:64:0x01ac, B:65:0x01b1, B:66:0x01b2, B:67:0x01b9, B:72:0x01c6, B:74:0x01d3, B:76:0x01e0, B:77:0x01f5, B:78:0x01fa, B:79:0x01fb, B:80:0x0200, B:86:0x0222, B:87:0x0227), top: B:124:0x0111, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01e0 A[Catch: JSONException -> 0x0021, i1 -> 0x01a9, TryCatch #2 {i1 -> 0x01a9, blocks: (B:41:0x0111, B:47:0x0134, B:49:0x0145, B:54:0x015b, B:57:0x0177, B:59:0x018c, B:61:0x0191, B:64:0x01ac, B:65:0x01b1, B:66:0x01b2, B:67:0x01b9, B:72:0x01c6, B:74:0x01d3, B:76:0x01e0, B:77:0x01f5, B:78:0x01fa, B:79:0x01fb, B:80:0x0200, B:86:0x0222, B:87:0x0227), top: B:124:0x0111, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x01f5 A[Catch: JSONException -> 0x0021, i1 -> 0x01a9, TryCatch #2 {i1 -> 0x01a9, blocks: (B:41:0x0111, B:47:0x0134, B:49:0x0145, B:54:0x015b, B:57:0x0177, B:59:0x018c, B:61:0x0191, B:64:0x01ac, B:65:0x01b1, B:66:0x01b2, B:67:0x01b9, B:72:0x01c6, B:74:0x01d3, B:76:0x01e0, B:77:0x01f5, B:78:0x01fa, B:79:0x01fb, B:80:0x0200, B:86:0x0222, B:87:0x0227), top: B:124:0x0111, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x01fb A[Catch: JSONException -> 0x0021, i1 -> 0x01a9, TryCatch #2 {i1 -> 0x01a9, blocks: (B:41:0x0111, B:47:0x0134, B:49:0x0145, B:54:0x015b, B:57:0x0177, B:59:0x018c, B:61:0x0191, B:64:0x01ac, B:65:0x01b1, B:66:0x01b2, B:67:0x01b9, B:72:0x01c6, B:74:0x01d3, B:76:0x01e0, B:77:0x01f5, B:78:0x01fa, B:79:0x01fb, B:80:0x0200, B:86:0x0222, B:87:0x0227), top: B:124:0x0111, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0221  */
    public final JSONObject h() {
        j1 j1Var;
        j1 j1Var2;
        ag.y0 y0Var;
        String[] strArr = this.f18824v;
        try {
            JSONObject jSONObject = new JSONObject();
            ag.y0 y0Var2 = this.f18822e;
            if (y0Var2 != null) {
                jSONObject.put("clientDataJSON", ff.c.b(y0Var2.m()));
            }
            ag.y0 y0Var3 = this.f18823i;
            if (y0Var3 != null) {
                jSONObject.put("attestationObject", ff.c.b(y0Var3.m()));
            }
            JSONArray jSONArray = new JSONArray();
            for (int i7 = 0; i7 < strArr.length; i7++) {
                if (strArr[i7].equals("cable")) {
                    jSONArray.put(i7, "hybrid");
                } else {
                    jSONArray.put(i7, strArr[i7]);
                }
            }
            jSONObject.put("transports", jSONArray);
            try {
                try {
                    j1 j1Var3 = (j1) ((g1) j1.e(y0Var3.m()).c(g1.class)).f527e.get(new h1("authData"));
                    if (j1Var3 == null) {
                        throw new IllegalArgumentException("attestation object missing authData");
                    }
                    ag.y0 y0Var4 = ((d1) j1Var3.c(d1.class)).f519d;
                    byte[] bArr = y0Var4.f602e;
                    ByteBuffer byteBufferAsReadOnlyBuffer = ByteBuffer.wrap(bArr, 0, y0Var4.e()).asReadOnlyBuffer();
                    try {
                        byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + 32);
                        if ((byteBufferAsReadOnlyBuffer.get() & 64) == 0) {
                            throw new IllegalArgumentException("authData does not include credential data");
                        }
                        byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + 4);
                        byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + 16);
                        byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + byteBufferAsReadOnlyBuffer.getShort());
                        try {
                            try {
                                int iPosition = byteBufferAsReadOnlyBuffer.position();
                                int iJ = ag.y0.j(iPosition, bArr.length, y0Var4.e());
                                l1 l1Var = new l1((iJ == 0 ? ag.y0.f600i : new ag.x0(bArr, iPosition, iJ)).i());
                                try {
                                    j1 j1VarK = ag.c.k(l1Var);
                                    try {
                                        l1Var.close();
                                    } catch (IOException unused) {
                                    }
                                    ag.w wVar = ((g1) j1VarK.c(g1.class)).f527e;
                                    j1 j1Var4 = (j1) wVar.get(new f1(3L));
                                    j1 j1Var5 = (j1) wVar.get(new f1(1L));
                                    if (j1Var4 == null || j1Var5 == null) {
                                        throw new IllegalArgumentException("COSE key missing required fields");
                                    }
                                    try {
                                        long j = ((f1) j1Var4.c(f1.class)).f523d;
                                        long j5 = ((f1) j1Var5.c(f1.class)).f523d;
                                        byte[] bArrJ = null;
                                        if (j5 == 1) {
                                            j1Var = (j1) wVar.get(new f1(-1L));
                                            if (j1Var != null) {
                                                throw new IllegalArgumentException("COSE key missing required fields");
                                            }
                                            long j7 = ((f1) j1Var.c(f1.class)).f523d;
                                            if (j5 != 2 && j7 == 1) {
                                                j1 j1Var6 = (j1) wVar.get(new f1(-2L));
                                                j1 j1Var7 = (j1) wVar.get(new f1(-3L));
                                                if (j1Var6 == null || j1Var7 == null) {
                                                    throw new IllegalArgumentException("COSE key missing required fields");
                                                }
                                                ag.y0 y0Var5 = ((d1) j1Var6.c(d1.class)).f519d;
                                                ag.y0 y0Var6 = ((d1) j1Var7.c(d1.class)).f519d;
                                                if (y0Var5.f602e.length != 32 || y0Var6.f602e.length != 32) {
                                                    throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                                }
                                                bArrJ = ag.c.j(Base64.decode("MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAE", 0), y0Var5.m(), y0Var6.m());
                                            } else if (j5 == 1 && j7 == 6) {
                                                j1Var2 = (j1) wVar.get(new f1(-2L));
                                                if (j1Var2 == null) {
                                                    throw new IllegalArgumentException("COSE key missing required fields");
                                                }
                                                y0Var = ((d1) j1Var2.c(d1.class)).f519d;
                                                if (y0Var.f602e.length != 32) {
                                                    throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                                }
                                                bArrJ = ag.c.j(Base64.decode("MCowBQYDK2VwAyEA", 0), y0Var.m());
                                            }
                                        } else if (j5 == 2) {
                                            j5 = 2;
                                            j1Var = (j1) wVar.get(new f1(-1L));
                                            if (j1Var != null) {
                                                throw new IllegalArgumentException("COSE key missing required fields");
                                            }
                                            long j10 = ((f1) j1Var.c(f1.class)).f523d;
                                            if (j5 != 2) {
                                                if (j5 == 1) {
                                                    j1Var2 = (j1) wVar.get(new f1(-2L));
                                                    if (j1Var2 == null) {
                                                        throw new IllegalArgumentException("COSE key missing required fields");
                                                    }
                                                    y0Var = ((d1) j1Var2.c(d1.class)).f519d;
                                                    if (y0Var.f602e.length != 32) {
                                                        throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                                    }
                                                    bArrJ = ag.c.j(Base64.decode("MCowBQYDK2VwAyEA", 0), y0Var.m());
                                                }
                                            } else if (j5 == 1) {
                                                j1Var2 = (j1) wVar.get(new f1(-2L));
                                                if (j1Var2 == null) {
                                                    throw new IllegalArgumentException("COSE key missing required fields");
                                                }
                                                y0Var = ((d1) j1Var2.c(d1.class)).f519d;
                                                if (y0Var.f602e.length != 32) {
                                                    throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                                }
                                                bArrJ = ag.c.j(Base64.decode("MCowBQYDK2VwAyEA", 0), y0Var.m());
                                            }
                                        }
                                        byte[] bArr2 = bArrJ;
                                        jSONObject.put("authenticatorData", ff.c.b(y0Var4.m()));
                                        jSONObject.put("publicKeyAlgorithm", j);
                                        if (bArr2 != null) {
                                            jSONObject.put("publicKey", Base64.encodeToString(bArr2, 11));
                                        }
                                        return jSONObject;
                                    } catch (i1 e10) {
                                        throw new IllegalArgumentException("COSE key ill-formed", e10);
                                    }
                                } catch (Throwable th2) {
                                    try {
                                        l1Var.close();
                                    } catch (IOException unused2) {
                                    }
                                    throw th2;
                                }
                            } catch (i1 e11) {
                                e = e11;
                                throw new IllegalArgumentException("failed to parse COSE key", e);
                            }
                        } catch (e1 e12) {
                            e = e12;
                            throw new IllegalArgumentException("failed to parse COSE key", e);
                        }
                    } catch (IllegalArgumentException e13) {
                        throw new IllegalArgumentException("ill-formed authenticator data", e13);
                    }
                } catch (i1 e14) {
                    throw new IllegalArgumentException("authData value has wrong type", e14);
                }
            } catch (e1 e15) {
                e = e15;
                throw new IllegalArgumentException("failed to parse attestation object", e);
            } catch (i1 e16) {
                e = e16;
                throw new IllegalArgumentException("failed to parse attestation object", e);
            }
        } catch (JSONException e17) {
            throw new RuntimeException("Error encoding AuthenticatorAttestationResponse to JSON object", e17);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.f18821d})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f18822e})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f18823i}))});
    }

    public final String toString() {
        e4.m mVar = new e4.m(getClass().getSimpleName(), 5);
        ag.p0 p0Var = ag.r0.f570d;
        byte[] bArrM = this.f18821d.m();
        mVar.O("keyHandle", p0Var.c(bArrM, bArrM.length));
        byte[] bArrM2 = this.f18822e.m();
        mVar.O("clientDataJSON", p0Var.c(bArrM2, bArrM2.length));
        byte[] bArrM3 = this.f18823i.m();
        mVar.O("attestationObject", p0Var.c(bArrM3, bArrM3.length));
        mVar.O("transports", Arrays.toString(this.f18824v));
        return mVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iT = ls.d.T(20293, parcel);
        ls.d.L(parcel, 2, this.f18821d.m());
        ls.d.L(parcel, 3, this.f18822e.m());
        ls.d.L(parcel, 4, this.f18823i.m());
        String[] strArr = this.f18824v;
        if (strArr != null) {
            int iT2 = ls.d.T(5, parcel);
            parcel.writeStringArray(strArr);
            ls.d.U(iT2, parcel);
        }
        ls.d.U(iT, parcel);
    }
}
