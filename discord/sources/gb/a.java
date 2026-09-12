package gb;

import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import androidx.datastore.preferences.protobuf.d1;
import com.facebook.react.shell.MainReactPackage;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.metadata.Metadata;
import di.e;
import di.j;
import ei.c0;
import ei.p;
import ei.r0;
import ei.w0;
import fj.c;
import gc.f;
import gc.g0;
import gc.h0;
import gc.i0;
import gc.i1;
import gc.j0;
import gc.k0;
import gc.l0;
import gc.m0;
import gc.n0;
import gc.o0;
import gc.o1;
import gc.p0;
import gc.q0;
import gc.r1;
import gc.s0;
import gc.s1;
import gc.t0;
import gc.u0;
import gc.u1;
import gc.v1;
import gc.w1;
import hc.u;
import hc.w;
import hd.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.UUID;
import javax.inject.Provider;
import je.b;
import je.e0;
import je.k;
import je.y;
import mc.i;
import mc.q;
import md.x0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Provider, j, e, je.j, f, k, g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9548d;

    public /* synthetic */ a(int i7) {
        this.f9548d = i7;
    }

    @Override // di.e
    public Object apply(Object obj) {
        return new u((y) obj);
    }

    @Override // gc.f
    public gc.g b(Bundle bundle) {
        w0 w0VarA;
        r0 r0VarJ;
        r0 r0VarV;
        Bundle bundle2;
        Bundle bundle3;
        boolean z5 = true;
        int i7 = 0;
        boolean z6 = false;
        boolean z7 = false;
        switch (this.f9548d) {
            case 8:
                Format format = Format.f5502f0;
                g0 g0Var = new g0();
                if (bundle != null) {
                    ClassLoader classLoader = b.class.getClassLoader();
                    int i10 = e0.f13788a;
                    bundle.setClassLoader(classLoader);
                }
                String string = bundle.getString(Format.f5503g0);
                String str = format.f5524d;
                if (string == null) {
                    string = str;
                }
                g0Var.f9635a = string;
                String string2 = bundle.getString(Format.h0);
                String str2 = format.f5526e;
                if (string2 == null) {
                    string2 = str2;
                }
                g0Var.f9636b = string2;
                String string3 = bundle.getString(Format.f5504i0);
                String str3 = format.f5528i;
                if (string3 == null) {
                    string3 = str3;
                }
                g0Var.f9637c = string3;
                g0Var.f9638d = bundle.getInt(Format.f5505j0, format.f5529v);
                g0Var.f9639e = bundle.getInt(Format.f5506k0, format.f5530w);
                g0Var.f9640f = bundle.getInt(Format.f5507l0, format.f5531x);
                g0Var.f9641g = bundle.getInt(Format.f5508m0, format.f5532y);
                String string4 = bundle.getString(Format.f5509n0);
                String str4 = format.F;
                if (string4 == null) {
                    string4 = str4;
                }
                g0Var.f9642h = string4;
                Metadata metadata = (Metadata) bundle.getParcelable(Format.f5510o0);
                Metadata metadata2 = format.G;
                if (metadata == null) {
                    metadata = metadata2;
                }
                g0Var.f9643i = metadata;
                String string5 = bundle.getString(Format.f5511p0);
                String str5 = format.H;
                if (string5 == null) {
                    string5 = str5;
                }
                g0Var.j = string5;
                String string6 = bundle.getString(Format.f5512q0);
                String str6 = format.I;
                if (string6 == null) {
                    string6 = str6;
                }
                g0Var.k = string6;
                g0Var.f9644l = bundle.getInt(Format.f5513r0, format.J);
                ArrayList arrayList = new ArrayList();
                while (true) {
                    byte[] byteArray = bundle.getByteArray(Format.f5514s0 + "_" + Integer.toString(i7, 36));
                    if (byteArray == null) {
                        g0Var.f9645m = arrayList;
                        g0Var.f9646n = (i) bundle.getParcelable(Format.f5515t0);
                        g0Var.f9647o = bundle.getLong(Format.f5516u0, format.M);
                        g0Var.f9648p = bundle.getInt(Format.f5517v0, format.N);
                        g0Var.f9649q = bundle.getInt(Format.f5518w0, format.O);
                        g0Var.f9650r = bundle.getFloat(Format.f5519x0, format.P);
                        g0Var.f9651s = bundle.getInt(Format.f5520y0, format.Q);
                        g0Var.f9652t = bundle.getFloat(Format.f5521z0, format.R);
                        g0Var.f9653u = bundle.getByteArray(Format.A0);
                        g0Var.f9654v = bundle.getInt(Format.B0, format.T);
                        Bundle bundle4 = bundle.getBundle(Format.C0);
                        if (bundle4 != null) {
                            g0Var.f9655w = (ke.b) ke.b.H.b(bundle4);
                        }
                        g0Var.f9656x = bundle.getInt(Format.D0, format.V);
                        g0Var.f9657y = bundle.getInt(Format.E0, format.W);
                        g0Var.f9658z = bundle.getInt(Format.F0, format.X);
                        g0Var.A = bundle.getInt(Format.G0, format.Y);
                        g0Var.B = bundle.getInt(Format.H0, format.Z);
                        g0Var.C = bundle.getInt(Format.I0, format.a0);
                        g0Var.D = bundle.getInt(Format.K0, format.f5522b0);
                        g0Var.E = bundle.getInt(Format.L0, format.f5523c0);
                        g0Var.F = bundle.getInt(Format.J0, format.f5525d0);
                        return new Format(g0Var);
                    }
                    arrayList.add(byteArray);
                    i7++;
                }
                break;
            case 9:
                b.g(bundle.getInt(o1.f9807d, -1) == 0);
                return bundle.getBoolean(h0.f9674w, false) ? new h0(bundle.getBoolean(h0.f9675x, false)) : new h0();
            case 10:
                String string7 = bundle.getString(MediaItem.F, "");
                string7.getClass();
                Bundle bundle5 = bundle.getBundle(MediaItem.G);
                o0 o0Var = bundle5 == null ? o0.f9800x : (o0) o0.I.b(bundle5);
                Bundle bundle6 = bundle.getBundle(MediaItem.H);
                MediaMetadata mediaMetadata = bundle6 == null ? MediaMetadata.f5540f0 : (MediaMetadata) MediaMetadata.N0.b(bundle6);
                Bundle bundle7 = bundle.getBundle(MediaItem.I);
                l0 l0Var = bundle7 == null ? l0.J : (l0) k0.I.b(bundle7);
                Bundle bundle8 = bundle.getBundle(MediaItem.J);
                q0 q0Var = bundle8 == null ? q0.f9821i : (q0) q0.f9825y.b(bundle8);
                Bundle bundle9 = bundle.getBundle(MediaItem.K);
                return new MediaItem(string7, l0Var, bundle9 != null ? (p0) p0.L.b(bundle9) : null, o0Var, mediaMetadata, q0Var);
            case 11:
                Uri uri = (Uri) bundle.getParcelable(i0.f9693e);
                uri.getClass();
                c cVar = new c(13, z6 ? 1 : 0);
                cVar.f9267e = uri;
                return new i0(cVar);
            case 12:
                j0 j0Var = new j0();
                String str7 = k0.f9738y;
                l0 l0Var2 = k0.f9737x;
                long j = bundle.getLong(str7, l0Var2.f9739d);
                b.g(j >= 0);
                j0Var.f9708a = j;
                long j5 = bundle.getLong(k0.E, l0Var2.f9740e);
                if (j5 != Long.MIN_VALUE && j5 < 0) {
                    z5 = false;
                }
                b.g(z5);
                j0Var.f9709b = j5;
                j0Var.f9710c = bundle.getBoolean(k0.F, l0Var2.f9741i);
                j0Var.f9711d = bundle.getBoolean(k0.G, l0Var2.f9742v);
                j0Var.f9712e = bundle.getBoolean(k0.H, l0Var2.f9743w);
                return new l0(j0Var);
            case 13:
                String string8 = bundle.getString(n0.F);
                string8.getClass();
                UUID uuidFromString = UUID.fromString(string8);
                Uri uri2 = (Uri) bundle.getParcelable(n0.G);
                String str8 = n0.H;
                Bundle bundle10 = Bundle.EMPTY;
                Bundle bundle11 = bundle.getBundle(str8);
                if (bundle11 == null) {
                    bundle11 = bundle10;
                }
                w0 w0Var = w0.f8376y;
                if (bundle11 == bundle10) {
                    w0VarA = w0Var;
                } else {
                    HashMap map = new HashMap();
                    if (bundle11 != bundle10) {
                        for (String str9 : bundle11.keySet()) {
                            String string9 = bundle11.getString(str9);
                            if (string9 != null) {
                                map.put(str9, string9);
                            }
                        }
                    }
                    w0VarA = w0.a(map);
                }
                boolean z10 = bundle.getBoolean(n0.I, false);
                boolean z11 = bundle.getBoolean(n0.J, false);
                boolean z12 = bundle.getBoolean(n0.K, false);
                String str10 = n0.L;
                ArrayList<Integer> arrayList2 = new ArrayList<>();
                ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(str10);
                if (integerArrayList != null) {
                    arrayList2 = integerArrayList;
                }
                ei.e0 e0VarK = ei.e0.k(arrayList2);
                byte[] byteArray2 = bundle.getByteArray(n0.M);
                m0 m0Var = new m0();
                m0Var.f9773a = uuidFromString;
                m0Var.f9775c = w0Var;
                m0Var.f9779g = r0.f8352w;
                m0Var.f9774b = uri2;
                m0Var.f9775c = w0.a(w0VarA);
                m0Var.f9776d = z10;
                m0Var.f9778f = z12;
                m0Var.f9777e = z11;
                m0Var.f9779g = ei.e0.k(e0VarK);
                m0Var.f9780h = byteArray2 != null ? Arrays.copyOf(byteArray2, byteArray2.length) : null;
                return new n0(m0Var);
            case 14:
                return new o0(bundle.getLong(o0.f9801y, -9223372036854775807L), bundle.getLong(o0.E, -9223372036854775807L), bundle.getLong(o0.F, -9223372036854775807L), bundle.getFloat(o0.G, -3.4028235E38f), bundle.getFloat(o0.H, -3.4028235E38f));
            case 15:
                Bundle bundle12 = bundle.getBundle(p0.G);
                n0 n0Var = bundle12 == null ? null : (n0) n0.N.b(bundle12);
                Bundle bundle13 = bundle.getBundle(p0.H);
                i0 i0Var = bundle13 != null ? (i0) i0.f9694i.b(bundle13) : null;
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(p0.I);
                if (parcelableArrayList == null) {
                    c0 c0Var = ei.e0.f8303e;
                    r0VarJ = r0.f8352w;
                } else {
                    c0 c0Var2 = ei.e0.f8303e;
                    p.c(4, "initialCapacity");
                    Object[] objArrCopyOf = new Object[4];
                    int i11 = 0;
                    int i12 = 0;
                    boolean z13 = false;
                    while (i11 < parcelableArrayList.size()) {
                        Bundle bundle14 = (Bundle) parcelableArrayList.get(i11);
                        bundle14.getClass();
                        ld.b bVar = new ld.b(bundle14.getInt(ld.b.f15015v, 0), bundle14.getInt(ld.b.f15016w, 0), bundle14.getInt(ld.b.f15017x, 0));
                        int i13 = i12 + 1;
                        if (objArrCopyOf.length < i13) {
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, ei.y.d(objArrCopyOf.length, i13));
                        } else {
                            if (z13) {
                                objArrCopyOf = (Object[]) objArrCopyOf.clone();
                            }
                            objArrCopyOf[i12] = bVar;
                            i11++;
                            i12++;
                            z13 = z13;
                        }
                        z13 = false;
                        objArrCopyOf[i12] = bVar;
                        i11++;
                        i12++;
                        z13 = z13;
                    }
                    r0VarJ = ei.e0.j(i12, objArrCopyOf);
                }
                r0 r0Var = r0VarJ;
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(p0.K);
                if (parcelableArrayList2 == null) {
                    c0 c0Var3 = ei.e0.f8303e;
                    r0VarV = r0.f8352w;
                } else {
                    r0VarV = b.v(t0.L, parcelableArrayList2);
                }
                r0 r0Var2 = r0VarV;
                Uri uri3 = (Uri) bundle.getParcelable(p0.E);
                uri3.getClass();
                return new p0(uri3, bundle.getString(p0.F), n0Var, i0Var, r0Var, bundle.getString(p0.J), r0Var2);
            case 16:
                io.sentry.internal.debugmeta.c cVar2 = new io.sentry.internal.debugmeta.c(7, z7 ? 1 : 0);
                cVar2.f12759e = (Uri) bundle.getParcelable(q0.f9822v);
                cVar2.f12760i = bundle.getString(q0.f9823w);
                bundle.getBundle(q0.f9824x);
                return new q0(cVar2);
            case 17:
                Uri uri4 = (Uri) bundle.getParcelable(t0.E);
                uri4.getClass();
                String string10 = bundle.getString(t0.F);
                String string11 = bundle.getString(t0.G);
                int i14 = bundle.getInt(t0.H, 0);
                int i15 = bundle.getInt(t0.I, 0);
                String string12 = bundle.getString(t0.J);
                String string13 = bundle.getString(t0.K);
                s0 s0Var = new s0(uri4);
                s0Var.f9839a = string10;
                s0Var.f9843e = string11;
                s0Var.f9840b = i14;
                s0Var.f9841c = i15;
                s0Var.f9844f = string12;
                s0Var.f9845g = string13;
                return new t0(s0Var);
            case 18:
                u0 u0Var = new u0();
                u0Var.f9862a = bundle.getCharSequence(MediaMetadata.f5541g0);
                u0Var.f9863b = bundle.getCharSequence(MediaMetadata.h0);
                u0Var.f9864c = bundle.getCharSequence(MediaMetadata.f5542i0);
                u0Var.f9865d = bundle.getCharSequence(MediaMetadata.f5543j0);
                u0Var.f9866e = bundle.getCharSequence(MediaMetadata.f5544k0);
                u0Var.f9867f = bundle.getCharSequence(MediaMetadata.f5545l0);
                u0Var.f9868g = bundle.getCharSequence(MediaMetadata.f5546m0);
                byte[] byteArray3 = bundle.getByteArray(MediaMetadata.f5549p0);
                String str11 = MediaMetadata.I0;
                Integer numValueOf = bundle.containsKey(str11) ? Integer.valueOf(bundle.getInt(str11)) : null;
                u0Var.j = byteArray3 != null ? (byte[]) byteArray3.clone() : null;
                u0Var.k = numValueOf;
                u0Var.f9871l = (Uri) bundle.getParcelable(MediaMetadata.f5550q0);
                u0Var.f9883x = bundle.getCharSequence(MediaMetadata.B0);
                u0Var.f9884y = bundle.getCharSequence(MediaMetadata.C0);
                u0Var.f9885z = bundle.getCharSequence(MediaMetadata.D0);
                u0Var.C = bundle.getCharSequence(MediaMetadata.G0);
                u0Var.D = bundle.getCharSequence(MediaMetadata.H0);
                u0Var.E = bundle.getCharSequence(MediaMetadata.J0);
                u0Var.G = bundle.getBundle(MediaMetadata.M0);
                String str12 = MediaMetadata.f5547n0;
                if (bundle.containsKey(str12) && (bundle3 = bundle.getBundle(str12)) != null) {
                    u0Var.f9869h = (o1) o1.f9808e.b(bundle3);
                }
                String str13 = MediaMetadata.f5548o0;
                if (bundle.containsKey(str13) && (bundle2 = bundle.getBundle(str13)) != null) {
                    u0Var.f9870i = (o1) o1.f9808e.b(bundle2);
                }
                String str14 = MediaMetadata.f5551r0;
                if (bundle.containsKey(str14)) {
                    u0Var.f9872m = Integer.valueOf(bundle.getInt(str14));
                }
                String str15 = MediaMetadata.f5552s0;
                if (bundle.containsKey(str15)) {
                    u0Var.f9873n = Integer.valueOf(bundle.getInt(str15));
                }
                String str16 = MediaMetadata.f5553t0;
                if (bundle.containsKey(str16)) {
                    u0Var.f9874o = Integer.valueOf(bundle.getInt(str16));
                }
                String str17 = MediaMetadata.L0;
                if (bundle.containsKey(str17)) {
                    u0Var.f9875p = Boolean.valueOf(bundle.getBoolean(str17));
                }
                String str18 = MediaMetadata.f5554u0;
                if (bundle.containsKey(str18)) {
                    u0Var.f9876q = Boolean.valueOf(bundle.getBoolean(str18));
                }
                String str19 = MediaMetadata.f5555v0;
                if (bundle.containsKey(str19)) {
                    u0Var.f9877r = Integer.valueOf(bundle.getInt(str19));
                }
                String str20 = MediaMetadata.f5556w0;
                if (bundle.containsKey(str20)) {
                    u0Var.f9878s = Integer.valueOf(bundle.getInt(str20));
                }
                String str21 = MediaMetadata.f5557x0;
                if (bundle.containsKey(str21)) {
                    u0Var.f9879t = Integer.valueOf(bundle.getInt(str21));
                }
                String str22 = MediaMetadata.f5558y0;
                if (bundle.containsKey(str22)) {
                    u0Var.f9880u = Integer.valueOf(bundle.getInt(str22));
                }
                String str23 = MediaMetadata.f5559z0;
                if (bundle.containsKey(str23)) {
                    u0Var.f9881v = Integer.valueOf(bundle.getInt(str23));
                }
                String str24 = MediaMetadata.A0;
                if (bundle.containsKey(str24)) {
                    u0Var.f9882w = Integer.valueOf(bundle.getInt(str24));
                }
                String str25 = MediaMetadata.E0;
                if (bundle.containsKey(str25)) {
                    u0Var.A = Integer.valueOf(bundle.getInt(str25));
                }
                String str26 = MediaMetadata.F0;
                if (bundle.containsKey(str26)) {
                    u0Var.B = Integer.valueOf(bundle.getInt(str26));
                }
                String str27 = MediaMetadata.K0;
                if (bundle.containsKey(str27)) {
                    u0Var.F = Integer.valueOf(bundle.getInt(str27));
                }
                return new MediaMetadata(u0Var);
            case 19:
                b.g(bundle.getInt(o1.f9807d, -1) == 1);
                float f2 = bundle.getFloat(i1.f9696v, -1.0f);
                return f2 == -1.0f ? new i1() : new i1(f2);
            case 20:
                int i16 = bundle.getInt(o1.f9807d, -1);
                if (i16 == 0) {
                    return (o1) h0.f9676y.b(bundle);
                }
                if (i16 == 1) {
                    return (o1) i1.f9697w.b(bundle);
                }
                if (i16 == 2) {
                    return (o1) r1.f9834y.b(bundle);
                }
                if (i16 == 3) {
                    return (o1) s1.f9848y.b(bundle);
                }
                throw new IllegalArgumentException(kk.b.h(i16, "Unknown RatingType: "));
            case 21:
                b.g(bundle.getInt(o1.f9807d, -1) == 2);
                int i17 = bundle.getInt(r1.f9832w, 5);
                float f7 = bundle.getFloat(r1.f9833x, -1.0f);
                return f7 == -1.0f ? new r1(i17) : new r1(i17, f7);
            case 22:
                b.g(bundle.getInt(o1.f9807d, -1) == 3);
                return bundle.getBoolean(s1.f9846w, false) ? new s1(bundle.getBoolean(s1.f9847x, false)) : new s1();
            case 23:
                int i18 = bundle.getInt(u1.E, 0);
                long j7 = bundle.getLong(u1.F, -9223372036854775807L);
                long j10 = bundle.getLong(u1.G, 0L);
                boolean z14 = bundle.getBoolean(u1.H, false);
                Bundle bundle15 = bundle.getBundle(u1.I);
                nd.b bVar2 = bundle15 != null ? (nd.b) nd.b.I.b(bundle15) : nd.b.f16555x;
                u1 u1Var = new u1();
                u1Var.i(null, null, i18, j7, j10, bVar2, z14);
                return u1Var;
            case 24:
                Bundle bundle16 = bundle.getBundle(v1.R);
                MediaItem mediaItem = bundle16 != null ? (MediaItem) MediaItem.L.b(bundle16) : MediaItem.E;
                long j11 = bundle.getLong(v1.S, -9223372036854775807L);
                long j12 = bundle.getLong(v1.T, -9223372036854775807L);
                long j13 = bundle.getLong(v1.U, -9223372036854775807L);
                boolean z15 = bundle.getBoolean(v1.V, false);
                boolean z16 = bundle.getBoolean(v1.W, false);
                Bundle bundle17 = bundle.getBundle(v1.X);
                o0 o0Var2 = bundle17 != null ? (o0) o0.I.b(bundle17) : null;
                boolean z17 = bundle.getBoolean(v1.Y, false);
                long j14 = bundle.getLong(v1.Z, 0L);
                long j15 = bundle.getLong(v1.a0, -9223372036854775807L);
                int i19 = bundle.getInt(v1.f9906b0, 0);
                int i20 = bundle.getInt(v1.f9907c0, 0);
                long j16 = bundle.getLong(v1.f9908d0, 0L);
                v1 v1Var = new v1();
                v1Var.b(v1.P, mediaItem, null, j11, j12, j13, z15, z16, o0Var2, j14, j15, i19, i20, j16);
                v1Var.I = z17;
                return v1Var;
            default:
                q qVar = x0.E;
                Bundle bundle18 = bundle.getBundle(w1.f9926x);
                bundle18.getClass();
                x0 x0Var = (x0) qVar.b(bundle18);
                int[] intArray = bundle.getIntArray(w1.f9927y);
                int i21 = x0Var.f15727d;
                int[] iArr = new int[i21];
                if (intArray == null) {
                    intArray = iArr;
                }
                boolean[] booleanArray = bundle.getBooleanArray(w1.E);
                boolean[] zArr = new boolean[i21];
                if (booleanArray == null) {
                    booleanArray = zArr;
                }
                return new w1(x0Var, bundle.getBoolean(w1.F, false), intArray, booleanArray);
        }
    }

    @Override // hd.g
    public boolean c(int i7, int i10, int i11, int i12, int i13) {
        return false;
    }

    @Override // javax.inject.Provider
    public Object get() {
        switch (this.f9548d) {
            case 0:
                return MainReactPackage.viewManagersMap$lambda$2();
            case 1:
                return MainReactPackage.viewManagersMap$lambda$3();
            case 2:
                return new gc.j(new he.q(), 50000, 50000, 2500, 5000, false);
            default:
                byte[] bArr = new byte[12];
                w.f10486i.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
        }
    }

    @Override // je.k
    public void h(Object obj, je.g gVar) {
    }

    @Override // je.j
    public void invoke(Object obj) {
        com.google.android.exoplayer2.e eVar = (com.google.android.exoplayer2.e) obj;
        switch (this.f9548d) {
            case 4:
                eVar.onPlayerError(new com.google.android.exoplayer2.b(2, new d1("Player release timed out."), 1003));
                break;
            default:
                eVar.onRenderedFirstFrame();
                break;
        }
    }
}
