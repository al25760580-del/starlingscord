package e4;

import a5.b0;
import a5.l0;
import android.content.Context;
import android.database.Cursor;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.HandlerThread;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.lifecycle.MutableLiveData;
import androidx.work.impl.WorkDatabase;
import com.discord.js_watchdog.SharedPreferencesKey;
import com.facebook.common.references.CloseableReference;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.google.android.exoplayer2.Format;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import ei.c0;
import ei.e0;
import gc.g0;
import io.sentry.ILogger;
import io.sentry.y2;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Callable;
import javax.inject.Provider;
import k2.v;
import kotlin.jvm.internal.Intrinsics;
import pa.s;
import sh.m0;
import sh.s0;
import sh.u0;
import sh.v0;
import v3.u;
import v3.w;
import v3.x;
import zc.d0;

/* JADX INFO: loaded from: classes.dex */
public final class e implements bd.k, xb.b, ga.i, y2, k2.n, sd.p, u0, x, ci.p, OnCompleteListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f7971e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f7972i;

    public /* synthetic */ e(char c8, int i7) {
        this.f7970d = i7;
    }

    public byte[] A(ed.a aVar) {
        DataOutputStream dataOutputStream = (DataOutputStream) this.f7972i;
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.f7971e;
        byteArrayOutputStream.reset();
        try {
            dataOutputStream.writeBytes(aVar.f8131d);
            dataOutputStream.writeByte(0);
            String str = aVar.f8132e;
            if (str == null) {
                str = "";
            }
            dataOutputStream.writeBytes(str);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(aVar.f8133i);
            dataOutputStream.writeLong(aVar.f8134v);
            dataOutputStream.write(aVar.f8135w);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public int B(int i7) {
        int[] iArr = (int[]) this.f7972i;
        if (i7 == 0) {
            return D(0);
        }
        if (i7 != 1) {
            int iB = iArr[0];
            int length = iArr.length;
            for (int i10 = 1; i10 < length; i10++) {
                iB = ((oj.a) this.f7971e).b(i7, iB) ^ iArr[i10];
            }
            return iB;
        }
        int i11 = 0;
        for (int i12 : iArr) {
            oj.a aVar = oj.a.f17261h;
            i11 ^= i12;
        }
        return i11;
    }

    public byte[] C() {
        Callable callable;
        if (((byte[]) this.f7971e) == null && (callable = (Callable) this.f7972i) != null) {
            this.f7971e = (byte[]) callable.call();
        }
        byte[] bArr = (byte[]) this.f7971e;
        return bArr != null ? bArr : new byte[0];
    }

    public int D(int i7) {
        int[] iArr = (int[]) this.f7972i;
        return iArr[(iArr.length - 1) - i7];
    }

    public int E() {
        return ((int[]) this.f7972i).length - 1;
    }

    public Long F(String str) {
        WorkDatabase workDatabase = (WorkDatabase) this.f7971e;
        a3.o oVarG = a3.o.g(1, "SELECT long_value FROM Preference where `key`=?");
        oVarG.o(1, str);
        workDatabase.b();
        Cursor cursorM = l0.M(workDatabase, oVarG);
        try {
            Long lValueOf = null;
            if (cursorM.moveToFirst() && !cursorM.isNull(0)) {
                lValueOf = Long.valueOf(cursorM.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorM.close();
            oVarG.i();
        }
    }

    public void G(d dVar) {
        WorkDatabase workDatabase = (WorkDatabase) this.f7971e;
        workDatabase.b();
        workDatabase.c();
        try {
            ((b) this.f7972i).g(dVar);
            workDatabase.o();
        } finally {
            workDatabase.k();
        }
    }

    public boolean H() {
        return ((int[]) this.f7972i)[0] == 0;
    }

    public void I(com.facebook.imagepipeline.nativecode.c cVar) {
        g4.j jVar = (g4.j) this.f7972i;
        ((MutableLiveData) this.f7971e).i(cVar);
        if (cVar instanceof w) {
            jVar.j((w) cVar);
        } else if (cVar instanceof u) {
            jVar.k(((u) cVar).f21431c);
        }
    }

    public e J(int i7) {
        int[] iArr = (int[]) this.f7972i;
        oj.a aVar = (oj.a) this.f7971e;
        if (i7 == 0) {
            return aVar.f17269c;
        }
        if (i7 == 1) {
            return this;
        }
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr2[i10] = aVar.b(iArr[i10], i7);
        }
        return new e(aVar, iArr2);
    }

    public y2 K() {
        ((io.sentry.vendor.gson.stream.c) this.f7971e).i();
        return this;
    }

    public void L(Exception exc, boolean z5) {
        this.f7972i = null;
        HashSet hashSet = (HashSet) this.f7971e;
        e0 e0VarK = e0.k(hashSet);
        hashSet.clear();
        c0 c0VarListIterator = e0VarK.listIterator(0);
        while (c0VarListIterator.hasNext()) {
            mc.c cVar = (mc.c) c0VarListIterator.next();
            cVar.getClass();
            cVar.i(z5 ? 1 : 3, exc);
        }
    }

    public void M(i1.e eVar) {
        c5.f fVar = (c5.f) this.f7972i;
        fj.c cVar = (fj.c) this.f7971e;
        int i7 = eVar.f11367b;
        if (i7 != 0) {
            fVar.execute(new com.google.android.material.datepicker.g(i7, 3, cVar));
        } else {
            fVar.execute(new hi.o(10, cVar, eVar.f11366a));
        }
    }

    public i N(up.e name, String desc) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(desc, "desc");
        String name2 = name.b();
        Intrinsics.checkNotNullExpressionValue(name2, "asString(...)");
        Intrinsics.checkNotNullParameter(name2, "name");
        Intrinsics.checkNotNullParameter(desc, "desc");
        return new i(this, new np.p(kk.b.j(name2, desc)));
    }

    @Override // sh.u0
    public Object a() {
        switch (this.f7970d) {
            case 21:
                v0 v0Var = (v0) this.f7971e;
                Bundle bundle = (Bundle) this.f7972i;
                int i7 = bundle.getInt(SharedPreferencesKey.SESSION_ID);
                if (i7 == 0) {
                    return Boolean.TRUE;
                }
                HashMap map = v0Var.f20210c;
                Integer numValueOf = Integer.valueOf(i7);
                if (!map.containsKey(numValueOf)) {
                    return Boolean.TRUE;
                }
                s0 s0Var = (s0) v0Var.f20210c.get(numValueOf);
                if (s0Var.f20176c.f20164d == 6) {
                    return Boolean.FALSE;
                }
                ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
                if (stringArrayList == null || stringArrayList.isEmpty()) {
                    throw new sh.l0("Session without pack received.");
                }
                return Boolean.valueOf(!m0.d(s0Var.f20176c.f20164d, bundle.getInt(sa.a.a("status", stringArrayList.get(0)))));
            default:
                return new com.google.android.play.core.integrity.a((com.google.android.play.core.integrity.c) ((ci.o) this.f7971e).a(), (com.google.android.play.core.integrity.f) ((ci.o) this.f7972i).a());
        }
    }

    @Override // ga.i
    public boolean b(gc.o oVar) {
        return ((ga.i) this.f7971e).b(oVar);
    }

    @Override // io.sentry.y2
    public y2 c(long j) throws IOException {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.f7971e;
        cVar.q();
        cVar.c();
        cVar.f13262d.write(Long.toString(j));
        return this;
    }

    @Override // io.sentry.y2
    public y2 d(double d6) throws IOException {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.f7971e;
        cVar.q();
        if (cVar.f13267x || !(Double.isNaN(d6) || Double.isInfinite(d6))) {
            cVar.c();
            cVar.f13262d.append((CharSequence) Double.toString(d6));
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + d6);
    }

    @Override // ga.i
    public CloseableReference e(Object obj, CloseableReference closeableReference) {
        ((ga.j) this.f7972i).H(obj);
        return ((ga.i) this.f7971e).e(obj, closeableReference);
    }

    @Override // io.sentry.y2
    public y2 f(String str) {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.f7971e;
        if (str == null) {
            cVar.i();
            return this;
        }
        cVar.q();
        cVar.c();
        cVar.n(str);
        return this;
    }

    @Override // io.sentry.y2
    public void g(boolean z5) {
        ((io.sentry.vendor.gson.stream.c) this.f7971e).f13267x = z5;
    }

    @Override // javax.inject.Provider
    public Object get() {
        switch (this.f7970d) {
            case 4:
                q8.c cVar = new q8.c();
                s sVar = new s();
                Object obj = ((Provider) this.f7971e).get();
                Provider provider = (Provider) this.f7972i;
                return new cc.h(cVar, sVar, cc.a.f3564f, (cc.j) obj, provider);
            default:
                return new wb.d((Context) ((ph.c) this.f7971e).f18031d, (n8.f) ((pf.b) this.f7972i).get());
        }
    }

    @Override // k2.n
    public Object getResult() {
        return (k2.x) this.f7971e;
    }

    @Override // io.sentry.y2
    public String i() {
        return ((io.sentry.vendor.gson.stream.c) this.f7971e).f13265v;
    }

    @Override // io.sentry.y2
    public y2 j(boolean z5) {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.f7971e;
        cVar.q();
        cVar.c();
        cVar.f13262d.write(z5 ? "true" : "false");
        return this;
    }

    @Override // ga.i
    public int k(n8.g gVar) {
        return ((ga.i) this.f7971e).k(gVar);
    }

    @Override // io.sentry.y2
    public y2 l() {
        ((io.sentry.vendor.gson.stream.c) this.f7971e).f('}', 3, 5);
        return this;
    }

    @Override // io.sentry.y2
    public void m(String str) {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.f7971e;
        if (str != null) {
            cVar.getClass();
            if (str.length() != 0) {
                cVar.f13265v = str;
                cVar.f13266w = ": ";
                return;
            }
        }
        cVar.f13265v = null;
        cVar.f13266w = ":";
    }

    @Override // k2.n
    public boolean n(CharSequence charSequence, int i7, int i10, k2.u uVar) {
        if ((uVar.f14268c & 4) > 0) {
            return true;
        }
        if (((k2.x) this.f7971e) == null) {
            this.f7971e = new k2.x(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((k8.a) this.f7972i).getClass();
        ((k2.x) this.f7971e).setSpan(new v(uVar), i7, i10, 33);
        return true;
    }

    @Override // io.sentry.y2
    public y2 o(Number number) {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.f7971e;
        if (number == null) {
            cVar.i();
            return this;
        }
        cVar.q();
        String string = number.toString();
        if (cVar.f13267x || !(string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            cVar.c();
            cVar.f13262d.append((CharSequence) string);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        zh.g gVar = (zh.g) this.f7971e;
        ig.g gVar2 = (ig.g) this.f7972i;
        synchronized (gVar.f24000f) {
            gVar.f23999e.remove(gVar2);
        }
    }

    @Override // io.sentry.y2
    public y2 p() throws IOException {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.f7971e;
        cVar.q();
        cVar.c();
        cVar.f13262d.append((CharSequence) ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        return this;
    }

    @Override // io.sentry.y2
    public y2 q() {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.f7971e;
        cVar.q();
        cVar.c();
        int i7 = cVar.f13264i;
        int[] iArr = cVar.f13263e;
        if (i7 == iArr.length) {
            cVar.f13263e = Arrays.copyOf(iArr, i7 * 2);
        }
        int[] iArr2 = cVar.f13263e;
        int i10 = cVar.f13264i;
        cVar.f13264i = i10 + 1;
        iArr2[i10] = 3;
        cVar.f13262d.write(123);
        return this;
    }

    @Override // io.sentry.y2
    public y2 r(ILogger iLogger, Object obj) throws IOException {
        ((ue.i) this.f7972i).p(this, iLogger, obj);
        return this;
    }

    @Override // sd.p
    public he.m0 s(sd.l lVar, sd.i iVar) {
        return new l(12, ((sd.p) this.f7971e).s(lVar, iVar), (List) this.f7972i);
    }

    @Override // io.sentry.y2
    public y2 t(Boolean bool) throws IOException {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.f7971e;
        if (bool == null) {
            cVar.i();
            return this;
        }
        cVar.q();
        cVar.c();
        cVar.f13262d.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public String toString() {
        switch (this.f7970d) {
            case 2:
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append(this.f7972i.getClass().getSimpleName());
                sb2.append('{');
                ArrayList arrayList = (ArrayList) this.f7971e;
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    sb2.append((String) arrayList.get(i7));
                    if (i7 < size - 1) {
                        sb2.append(", ");
                    }
                }
                sb2.append('}');
                return sb2.toString();
            case 16:
                StringBuilder sb3 = new StringBuilder(E() * 8);
                for (int iE = E(); iE >= 0; iE--) {
                    int iD = D(iE);
                    if (iD != 0) {
                        if (iD < 0) {
                            sb3.append(" - ");
                            iD = -iD;
                        } else if (sb3.length() > 0) {
                            sb3.append(" + ");
                        }
                        if (iE == 0 || iD != 1) {
                            oj.a aVar = (oj.a) this.f7971e;
                            if (iD == 0) {
                                aVar.getClass();
                                throw new IllegalArgumentException();
                            }
                            int i10 = aVar.f17268b[iD];
                            if (i10 == 0) {
                                sb3.append('1');
                            } else if (i10 == 1) {
                                sb3.append('a');
                            } else {
                                sb3.append("a^");
                                sb3.append(i10);
                            }
                        }
                        if (iE != 0) {
                            if (iE == 1) {
                                sb3.append('x');
                            } else {
                                sb3.append("x^");
                                sb3.append(iE);
                            }
                        }
                    }
                }
                return sb3.toString();
            default:
                return super.toString();
        }
    }

    @Override // sd.p
    public he.m0 u() {
        return new l(12, ((sd.p) this.f7971e).u(), (List) this.f7972i);
    }

    @Override // io.sentry.y2
    public y2 v(String str) {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.f7971e;
        if (str == null) {
            cVar.getClass();
            throw new NullPointerException("name == null");
        }
        if (cVar.f13268y != null) {
            throw new IllegalStateException();
        }
        if (cVar.f13264i == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        cVar.f13268y = str;
        return this;
    }

    public void w(Object obj, String str) {
        int length = str.length();
        String strValueOf = String.valueOf(obj);
        ((ArrayList) this.f7971e).add(a3.e.o(new StringBuilder(length + 1 + strValueOf.length()), str, "=", strValueOf));
    }

    public e x(e eVar) {
        oj.a aVar = (oj.a) this.f7971e;
        if (!aVar.equals((oj.a) eVar.f7971e)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (H()) {
            return eVar;
        }
        if (eVar.H()) {
            return this;
        }
        int[] iArr = (int[]) this.f7972i;
        int[] iArr2 = (int[]) eVar.f7972i;
        if (iArr.length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i7 = length; i7 < iArr.length; i7++) {
            iArr3[i7] = iArr2[i7 - length] ^ iArr[i7];
        }
        return new e(aVar, iArr3);
    }

    @Override // bd.k
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public bd.c h(bd.j jVar) throws Exception {
        MediaCodec mediaCodecCreateByCodecName;
        String str = jVar.f3166a.f3172a;
        bd.c cVar = null;
        try {
            je.b.c("createCodec:" + str);
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                bd.c cVar2 = new bd.c(mediaCodecCreateByCodecName, (HandlerThread) ((bd.b) this.f7971e).get(), (HandlerThread) ((bd.b) this.f7972i).get());
                try {
                    je.b.t();
                    bd.c.b(cVar2, jVar.f3167b, jVar.f3169d, jVar.f3170e);
                    return cVar2;
                } catch (Exception e10) {
                    e = e10;
                    cVar = cVar2;
                    if (cVar != null) {
                        cVar.release();
                    } else if (mediaCodecCreateByCodecName != null) {
                        mediaCodecCreateByCodecName.release();
                    }
                    throw e;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Exception e12) {
            e = e12;
            mediaCodecCreateByCodecName = null;
        }
    }

    public void z(pc.m mVar, d0 d0Var) {
        pc.x[] xVarArr = (pc.x[]) this.f7972i;
        for (int i7 = 0; i7 < xVarArr.length; i7++) {
            d0Var.a();
            d0Var.b();
            pc.x xVarX = mVar.x(d0Var.f23691d, 3);
            Format format = (Format) ((List) this.f7971e).get(i7);
            String str = format.I;
            je.b.f("Invalid closed caption MIME type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            String str2 = format.f5524d;
            if (str2 == null) {
                d0Var.b();
                str2 = d0Var.f23692e;
            }
            g0 g0Var = new g0();
            g0Var.f9635a = str2;
            g0Var.k = str;
            g0Var.f9638d = format.f5529v;
            g0Var.f9637c = format.f5528i;
            g0Var.C = format.a0;
            g0Var.f9645m = format.K;
            xVarX.e(new Format(g0Var));
            xVarArr[i7] = xVarX;
        }
    }

    public /* synthetic */ e(int i7, Object obj, Object obj2) {
        this.f7970d = i7;
        this.f7971e = obj;
        this.f7972i = obj2;
    }

    public /* synthetic */ e(Object obj) {
        this.f7970d = 2;
        this.f7972i = obj;
        this.f7971e = new ArrayList();
    }

    public e(Writer writer, int i7) {
        this.f7970d = 10;
        this.f7971e = new io.sentry.vendor.gson.stream.c(writer);
        ue.i iVar = new ue.i();
        iVar.f21117d = new b0(i7, 7);
        this.f7972i = iVar;
    }

    public e(pa.p pool, b0 pooledByteStreams) {
        this.f7970d = 17;
        Intrinsics.checkNotNullParameter(pool, "pool");
        Intrinsics.checkNotNullParameter(pooledByteStreams, "pooledByteStreams");
        this.f7971e = pool;
        this.f7972i = pooledByteStreams;
    }

    @Override // ga.i
    public CloseableReference get(Object obj) {
        ga.j jVar = (ga.j) this.f7972i;
        CloseableReference closeableReference = ((ga.i) this.f7971e).get(obj);
        if (closeableReference == null) {
            jVar.t(obj);
            return closeableReference;
        }
        jVar.q(obj);
        return closeableReference;
    }

    public e(WorkDatabase workDatabase) {
        this.f7970d = 0;
        this.f7971e = workDatabase;
        this.f7972i = new b(workDatabase);
    }

    public e(int i7, byte b10) {
        this.f7970d = i7;
        switch (i7) {
            case 14:
                this.f7971e = new HashSet();
                break;
            case 22:
                this.f7971e = new ArrayList();
                this.f7972i = new ArrayList();
                break;
            case 23:
                this.f7971e = new MutableLiveData();
                this.f7972i = new g4.j();
                I(x.B);
                break;
            default:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING);
                this.f7971e = byteArrayOutputStream;
                this.f7972i = new DataOutputStream(byteArrayOutputStream);
                break;
        }
    }

    public e(oj.a aVar, int[] iArr) {
        this.f7970d = 16;
        if (iArr.length != 0) {
            this.f7971e = aVar;
            int length = iArr.length;
            int i7 = 1;
            if (length > 1 && iArr[0] == 0) {
                while (i7 < length && iArr[i7] == 0) {
                    i7++;
                }
                if (i7 == length) {
                    this.f7972i = new int[]{0};
                    return;
                }
                int i10 = length - i7;
                int[] iArr2 = new int[i10];
                this.f7972i = iArr2;
                System.arraycopy(iArr, i7, iArr2, 0, i10);
                return;
            }
            this.f7972i = iArr;
            return;
        }
        throw new IllegalArgumentException();
    }

    public e(List list) {
        this.f7970d = 27;
        this.f7971e = list;
        this.f7972i = new pc.x[list.size()];
    }

    public e(int i7) {
        this.f7970d = 3;
        bd.b bVar = new bd.b(i7, 0);
        bd.b bVar2 = new bd.b(i7, 1);
        this.f7971e = bVar;
        this.f7972i = bVar2;
    }

    public e(af.c cVar, HashMap map, HashMap map2) {
        this.f7970d = 15;
        this.f7971e = cVar;
        this.f7972i = map;
    }

    public e(MediaCodec.CryptoInfo cryptoInfo) {
        this.f7970d = 13;
        this.f7971e = cryptoInfo;
        this.f7972i = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    public e(Callable callable) {
        this.f7970d = 11;
        this.f7972i = callable;
    }
}
