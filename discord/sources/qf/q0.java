package qf;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class q0 extends bf.a {
    public static final Parcelable.Creator<q0> CREATOR = new jf.b(20);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f18856e = "WebAuthn PRF\u0000".getBytes(StandardCharsets.UTF_8);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[][] f18857d;

    public q0(byte[][] bArr) {
        af.w.b(bArr != null);
        af.w.b(1 == ((bArr.length & 1) ^ 1));
        int i7 = 0;
        while (i7 < bArr.length) {
            af.w.b(i7 == 0 || bArr[i7] != null);
            int i10 = i7 + 1;
            af.w.b(bArr[i10] != null);
            int length = bArr[i10].length;
            af.w.b(length == 32 || length == 64);
            i7 += 2;
        }
        this.f18857d = bArr;
    }

    public static q0 h(JSONObject jSONObject, boolean z5) throws JSONException {
        ArrayList arrayList = new ArrayList();
        try {
            if (jSONObject.has("eval")) {
                arrayList.add(null);
                if (z5) {
                    arrayList.add(w(jSONObject.getJSONObject("eval")));
                } else {
                    arrayList.add(x(jSONObject.getJSONObject("eval")));
                }
            }
            if (jSONObject.has("evalByCredential")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("evalByCredential");
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    arrayList.add(ff.c.a(next));
                    if (z5) {
                        arrayList.add(w(jSONObject2.getJSONObject(next)));
                    } else {
                        arrayList.add(x(jSONObject2.getJSONObject(next)));
                    }
                }
            }
            return new q0((byte[][]) arrayList.toArray(new byte[0][]));
        } catch (IllegalArgumentException unused) {
            throw new JSONException("invalid base64url value");
        }
    }

    public static JSONObject i(byte[] bArr) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (bArr.length == 32) {
            jSONObject.put("first", Base64.encodeToString(bArr, 11));
            return jSONObject;
        }
        jSONObject.put("first", Base64.encodeToString(bArr, 0, 32, 11));
        jSONObject.put("second", Base64.encodeToString(bArr, 32, 32, 11));
        return jSONObject;
    }

    public static byte[] v(byte[] bArr) {
        a5.f fVar;
        ag.j0 j0Var;
        int i7 = ag.m0.f544a;
        ag.n0 n0Var = ag.l0.f536a;
        int i10 = n0Var.f548x;
        MessageDigest messageDigest = n0Var.f547w;
        if (n0Var.f549y) {
            try {
                fVar = new a5.f((MessageDigest) messageDigest.clone(), i10);
            } catch (CloneNotSupportedException unused) {
                try {
                    fVar = new a5.f(MessageDigest.getInstance(messageDigest.getAlgorithm()), i10);
                } catch (NoSuchAlgorithmException e10) {
                    throw new AssertionError(e10);
                }
            }
        } else {
            fVar = new a5.f(MessageDigest.getInstance(messageDigest.getAlgorithm()), i10);
        }
        MessageDigest messageDigest2 = (MessageDigest) fVar.f182c;
        byte[] bArr2 = f18856e;
        bArr2.getClass();
        int length = bArr2.length;
        if (fVar.f181b) {
            throw new IllegalStateException("Cannot re-use a Hasher after calling hash() on it");
        }
        messageDigest2.update(bArr2, 0, length);
        bArr.getClass();
        int length2 = bArr.length;
        if (fVar.f181b) {
            throw new IllegalStateException("Cannot re-use a Hasher after calling hash() on it");
        }
        messageDigest2.update(bArr, 0, length2);
        if (fVar.f181b) {
            throw new IllegalStateException("Cannot re-use a Hasher after calling hash() on it");
        }
        fVar.f181b = true;
        int i11 = fVar.f180a;
        if (i11 == messageDigest2.getDigestLength()) {
            byte[] bArrDigest = messageDigest2.digest();
            char[] cArr = ag.k0.f532d;
            j0Var = new ag.j0(bArrDigest);
        } else {
            byte[] bArrCopyOf = Arrays.copyOf(messageDigest2.digest(), i11);
            char[] cArr2 = ag.k0.f532d;
            j0Var = new ag.j0(bArrCopyOf);
        }
        return (byte[]) j0Var.f530e.clone();
    }

    public static byte[] w(JSONObject jSONObject) throws JSONException {
        byte[] bArrA = ff.c.a(jSONObject.getString("first"));
        if (bArrA.length != 32) {
            throw new JSONException("hashed PRF value with wrong length");
        }
        if (!jSONObject.has("second")) {
            return bArrA;
        }
        byte[] bArrA2 = ff.c.a(jSONObject.getString("second"));
        if (bArrA2.length == 32) {
            return ag.c.j(bArrA, bArrA2);
        }
        throw new JSONException("hashed PRF value with wrong length");
    }

    public static byte[] x(JSONObject jSONObject) {
        byte[] bArrV = v(ff.c.a(jSONObject.getString("first")));
        return !jSONObject.has("second") ? bArrV : ag.c.j(bArrV, v(ff.c.a(jSONObject.getString("second"))));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q0) {
            return Arrays.deepEquals(this.f18857d, ((q0) obj).f18857d);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (byte[] bArr : this.f18857d) {
            if (bArr != null) {
                iHashCode ^= Arrays.hashCode(new Object[]{bArr});
            }
        }
        return iHashCode;
    }

    public final String toString() {
        byte[][] bArr = this.f18857d;
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = null;
            for (int i7 = 0; i7 < bArr.length; i7 += 2) {
                if (bArr[i7] == null) {
                    jSONObject.put("eval", i(bArr[i7 + 1]));
                } else {
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                        jSONObject.put("evalByCredential", jSONObject2);
                    }
                    jSONObject2.put(ff.c.b(bArr[i7]), i(bArr[i7 + 1]));
                }
            }
            return "PrfExtension{" + jSONObject.toString() + "}";
        } catch (JSONException e10) {
            return s0.g.e("PrfExtension{Exception:", e10.getMessage(), "}");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iT = ls.d.T(20293, parcel);
        byte[][] bArr = this.f18857d;
        if (bArr != null) {
            int iT2 = ls.d.T(1, parcel);
            parcel.writeInt(bArr.length);
            for (byte[] bArr2 : bArr) {
                parcel.writeByteArray(bArr2);
            }
            ls.d.U(iT2, parcel);
        }
        ls.d.U(iT, parcel);
    }
}
