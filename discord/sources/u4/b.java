package u4;

import android.content.ClipDescription;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.ColorSpace;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import android.view.MenuItem;
import androidx.activity.result.ActivityResultCallback;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.t3;
import androidx.appcompat.widget.z2;
import androidx.core.view.MenuProvider;
import c5.f;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.discord.R;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.exoplayer2.Format;
import com.google.android.gms.internal.play_billing.r;
import com.google.android.gms.internal.play_billing.u0;
import ep.p;
import ga.j;
import ga.k;
import ge.s;
import ig.d;
import io.sentry.SentryLevel;
import io.sentry.android.core.k0;
import io.sentry.i1;
import io.sentry.j2;
import io.sentry.v4;
import io.sentry.w5;
import io.sentry.x0;
import io.sentry.x3;
import io.sentry.y3;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import je.c0;
import je.e0;
import kotlin.Result;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kq.n;
import lq.z;
import md.q0;
import n.h;
import np.l;
import np.m;
import rn.q;
import s0.g;
import up.e;
import vo.t;
import vo.u;
import vo.y;
import ze.i;

/* JADX INFO: loaded from: classes.dex */
public class b implements ActivityResultCallback, h, i, z2, j, s, t3, r8.a, d, ig.c, ig.b, i1, y3, k2.h, n, la.b, q0, in.b, n1.h, t, l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f20944d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f20945e;

    public /* synthetic */ b(int i7, Object obj) {
        this.f20944d = i7;
        this.f20945e = obj;
    }

    public static String c0(String str, a aVar, boolean z5) {
        String strConcat = aVar.f20943d;
        if (z5) {
            strConcat = ".temp".concat(strConcat);
        }
        String strReplaceAll = str.replaceAll("\\W+", "");
        int length = 242 - strConcat.length();
        if (strReplaceAll.length() > length) {
            try {
                byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(strReplaceAll.getBytes());
                StringBuilder sb2 = new StringBuilder();
                for (byte b10 : bArrDigest) {
                    sb2.append(String.format("%02x", Byte.valueOf(b10)));
                }
                strReplaceAll = sb2.toString();
            } catch (NoSuchAlgorithmException unused) {
                strReplaceAll = strReplaceAll.substring(0, length);
            }
        }
        return g.e("lottie_cache_", strReplaceAll, strConcat);
    }

    @Override // vo.t
    public t A(vo.c cVar) {
        vo.c kind = vo.c.f21793e;
        Intrinsics.checkNotNullParameter(kind, "kind");
        return this;
    }

    @Override // vo.t
    public t B(e name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this;
    }

    @Override // md.q0
    public boolean C() {
        for (q0 q0Var : (q0[]) this.f20945e) {
            if (q0Var.C()) {
                return true;
            }
        }
        return false;
    }

    @Override // r8.a
    public void E() {
        ((q8.c) this.f20945e).getClass();
    }

    @Override // np.l
    public l F(up.b bVar, e eVar) {
        return null;
    }

    @Override // ga.j
    public void H(Object obj) {
        ((k) this.f20945e).getClass();
    }

    @Override // ig.b
    public void J() {
        ((CountDownLatch) this.f20945e).countDown();
    }

    @Override // r8.a
    public void L(r8.d reference, Throwable th2) {
        ((q8.c) this.f20945e).getClass();
        Intrinsics.checkNotNullParameter(reference, "reference");
        Object objA = reference.a();
        o8.a.x("Fresco", "Finalized without closing: %x %x (type = %s).\nStack:\n%s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(reference)), objA != null ? objA.getClass().getName() : "<value is null>", th2 == null ? "" : Log.getStackTraceString(th2));
    }

    @Override // np.l
    public void M(e eVar, Object obj) {
        op.e eVar2 = (op.e) this.f20945e;
        String strB = eVar.b();
        if ("version".equals(strB)) {
            if (obj instanceof int[]) {
                eVar2.f17493d = (int[]) obj;
            }
        } else if ("multifileClassName".equals(strB)) {
            eVar2.f17494e = obj instanceof String ? (String) obj : null;
        }
    }

    @Override // k2.h
    public void O(a.a aVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new c0("EmojiCompatInitializer", 1));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new ac.a(this, aVar, threadPoolExecutor, 26));
    }

    @Override // n.h
    public void R(n.j jVar) {
        switch (this.f20944d) {
            case 2:
                Toolbar toolbar = (Toolbar) this.f20945e;
                androidx.appcompat.widget.n nVar = toolbar.f865d.Q;
                if (nVar == null || !nVar.m()) {
                    Iterator it = toolbar.f870g0.f1594b.iterator();
                    while (it.hasNext()) {
                        ((MenuProvider) it.next()).d(jVar);
                    }
                }
                c cVar = toolbar.f878o0;
                if (cVar != null) {
                    cVar.R(jVar);
                }
                break;
        }
    }

    @Override // md.q0
    public long S() {
        long jMin = Long.MAX_VALUE;
        for (q0 q0Var : (q0[]) this.f20945e) {
            long jS = q0Var.S();
            if (jS != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jS);
            }
        }
        if (jMin == LongCompanionObject.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // vo.t
    public t U(z type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return this;
    }

    @Override // vo.t
    public t V(vo.l owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        return this;
    }

    @Override // md.q0
    public void W(long j) {
        for (q0 q0Var : (q0[]) this.f20945e) {
            q0Var.W(j);
        }
    }

    public kh.d Y(kh.d dVar) {
        return dVar instanceof kh.j ? dVar : new kh.b(-((kh.i) this.f20945e).j(), dVar);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0040  */
    public String Z(Format format) {
        String displayName;
        String str = format.f5528i;
        String str2 = format.f5526e;
        if (TextUtils.isEmpty(str) || "und".equals(str)) {
            displayName = "";
        } else {
            int i7 = e0.f13788a;
            Locale localeForLanguageTag = i7 >= 21 ? Locale.forLanguageTag(str) : new Locale(str);
            Locale locale = i7 >= 24 ? Locale.getDefault(Locale.Category.DISPLAY) : Locale.getDefault();
            displayName = localeForLanguageTag.getDisplayName(locale);
            if (TextUtils.isEmpty(displayName)) {
                displayName = "";
            } else {
                try {
                    int iOffsetByCodePoints = displayName.offsetByCodePoints(0, 1);
                    displayName = displayName.substring(0, iOffsetByCodePoints).toUpperCase(locale) + displayName.substring(iOffsetByCodePoints);
                } catch (IndexOutOfBoundsException unused) {
                }
            }
        }
        String strE0 = e0(displayName, a0(format));
        if (!TextUtils.isEmpty(strE0)) {
            return strE0;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        return str2;
    }

    public String a0(Format format) {
        Resources resources = (Resources) this.f20945e;
        int i7 = format.f5530w;
        String string = (i7 & 2) != 0 ? resources.getString(R.string.exo_track_role_alternate) : "";
        if ((i7 & 4) != 0) {
            string = e0(string, resources.getString(R.string.exo_track_role_supplementary));
        }
        if ((i7 & 8) != 0) {
            string = e0(string, resources.getString(R.string.exo_track_role_commentary));
        }
        return (i7 & 1088) != 0 ? e0(string, resources.getString(R.string.exo_track_role_closed_captions)) : string;
    }

    @Override // ze.i
    public void accept(Object obj, Object obj2) {
        ig.g gVar = (ig.g) obj2;
        cf.a aVar = (cf.a) ((cf.c) obj).o();
        af.k kVar = (af.k) this.f20945e;
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(aVar.f3676h);
        int i7 = wf.a.f22223a;
        if (kVar == null) {
            parcelObtain.writeInt(0);
        } else {
            parcelObtain.writeInt(1);
            kVar.writeToParcel(parcelObtain, 0);
        }
        try {
            aVar.f3675g.transact(1, parcelObtain, null, 1);
            parcelObtain.recycle();
            gVar.b(null);
        } catch (Throwable th2) {
            parcelObtain.recycle();
            throw th2;
        }
    }

    @Override // vo.t
    public t b(n0 parameters) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        return this;
    }

    public void b0(io.sentry.android.core.q0 q0Var) {
        ((k0) this.f20945e).getClass();
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 26 || i7 > 28) {
            return;
        }
        String callingPackage = q0Var.getCallingPackage();
        String packageName = q0Var.getContext().getPackageName();
        if (callingPackage == null || !callingPackage.equals(packageName)) {
            throw new SecurityException("Provider does not allow for granting of Uri permissions");
        }
    }

    @Override // vo.t
    public u build() {
        return (nq.c) this.f20945e;
    }

    @Override // vo.t
    public t c(List parameters) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        return this;
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public void d(Object obj) {
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f20945e;
        f.a aVar = (f.a) obj;
        proxyBillingActivityV2.getClass();
        Intent intent = aVar.f8760e;
        int i7 = r.e(intent, "ProxyBillingActivityV2").f3788a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.F;
        if (resultReceiver != null) {
            resultReceiver.send(i7, intent == null ? null : intent.getExtras());
        }
        int i10 = aVar.f8759d;
        if (i10 != -1 || i7 != 0) {
            r.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i10 + " and billing's responseCode: " + i7);
        }
        proxyBillingActivityV2.finish();
    }

    public File d0(String str) {
        File file = new File(g0(), c0(str, a.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(g0(), c0(str, a.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        File file3 = new File(g0(), c0(str, a.GZIP, false));
        if (file3.exists()) {
            return file3;
        }
        return null;
    }

    @Override // vo.t
    public t e(p visibility) {
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        return this;
    }

    public String e0(String... strArr) {
        String string = "";
        for (String str : strArr) {
            if (str.length() > 0) {
                string = TextUtils.isEmpty(string) ? str : ((Resources) this.f20945e).getString(R.string.exo_item_list, string, str);
            }
        }
        return string;
    }

    @Override // vo.t
    public t f(wo.h additionalAnnotations) {
        Intrinsics.checkNotNullParameter(additionalAnnotations, "additionalAnnotations");
        return this;
    }

    @Override // la.b
    public na.c g(EncodedImage encodedImage, int i7, na.k kVar, ImageDecodeOptions imageDecodeOptions) throws Throwable {
        ColorSpace colorSpace;
        z9.c imageFormat = encodedImage.getImageFormat();
        o9.c cVar = (o9.c) this.f20945e;
        Boolean bool = Boolean.FALSE;
        if (bool.booleanValue()) {
            imageDecodeOptions.getClass();
            colorSpace = encodedImage.getColorSpace();
        } else {
            imageDecodeOptions.getClass();
            colorSpace = null;
        }
        if (imageFormat == z9.b.f23618a) {
            CloseableReference closeableReferenceB = ((qa.d) cVar.f17182v).b(encodedImage, imageDecodeOptions.f4810a, i7, colorSpace);
            try {
                closeableReferenceB.getClass();
                int rotationAngle = encodedImage.getRotationAngle();
                int exifOrientation = encodedImage.getExifOrientation();
                int i10 = na.g.F;
                na.g gVar = new na.g(closeableReferenceB, kVar, rotationAngle, exifOrientation);
                gVar.B(bool, "is_rounded");
                closeableReferenceB.close();
                return gVar;
            } catch (Throwable th2) {
                CloseableReference.l(closeableReferenceB);
                throw th2;
            }
        }
        if (imageFormat == z9.b.f23620c) {
            if (encodedImage.getWidth() == -1 || encodedImage.getHeight() == -1) {
                throw new la.a("image width or height is incorrect", encodedImage);
            }
            imageDecodeOptions.getClass();
            la.b bVar = (la.b) cVar.f17179d;
            return bVar != null ? bVar.g(encodedImage, i7, kVar, imageDecodeOptions) : cVar.b(encodedImage, imageDecodeOptions);
        }
        if (imageFormat == z9.b.j) {
            imageDecodeOptions.getClass();
            la.b bVar2 = (la.b) cVar.f17180e;
            return bVar2 != null ? bVar2.g(encodedImage, i7, kVar, imageDecodeOptions) : cVar.b(encodedImage, imageDecodeOptions);
        }
        if (imageFormat != z9.b.f23628m) {
            if (imageFormat != z9.c.f23631c) {
                return cVar.b(encodedImage, imageDecodeOptions);
            }
            throw new la.a("unknown image format", encodedImage);
        }
        la.b bVar3 = (la.b) cVar.f17181i;
        if (bVar3 != null) {
            return bVar3.g(encodedImage, i7, kVar, imageDecodeOptions);
        }
        return null;
    }

    public File g0() {
        File file = new File(((com.discord.chat.input.views.d) this.f20945e).f4079e.getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    @Override // n1.h
    public void h(Object obj) {
        o1.l e10 = (o1.l) obj;
        Intrinsics.checkNotNullParameter(e10, "e");
        ar.k kVar = (ar.k) this.f20945e;
        if (kVar.c()) {
            q qVar = Result.f14614e;
            kVar.resumeWith(ib.a.o(e10));
        }
    }

    public void h0(c5.n nVar, c5.r rVar, u0 u0Var) {
        nVar.markDelivered();
        nVar.addMarker("post-response");
        ((f) this.f20945e).execute(new a5.t(nVar, rVar, u0Var, 3));
    }

    public File i0(String str, InputStream inputStream, a aVar) throws IOException {
        File file = new File(g0(), c0(str, aVar, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET];
                while (true) {
                    int i7 = inputStream.read(bArr);
                    if (i7 == -1) {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        inputStream.close();
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, i7);
                }
            } catch (Throwable th2) {
                fileOutputStream.close();
                throw th2;
            }
        } catch (Throwable th3) {
            inputStream.close();
            throw th3;
        }
    }

    @Override // io.sentry.i1
    public boolean j() {
        return v4.d().c(((w5) this.f20945e).getFatalLogger());
    }

    @Override // md.q0
    public long k() {
        long jMin = Long.MAX_VALUE;
        for (q0 q0Var : (q0[]) this.f20945e) {
            long jK = q0Var.k();
            if (jK != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jK);
            }
        }
        if (jMin == LongCompanionObject.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // kq.n
    public void lock() {
        ((ReentrantLock) this.f20945e).lock();
    }

    @Override // np.l
    public m m(e eVar) {
        String strB = eVar.b();
        if ("data".equals(strB) || "filePartClassNames".equals(strB)) {
            return new op.d(this, 0);
        }
        if ("strings".equals(strB)) {
            return new op.d(this, 1);
        }
        return null;
    }

    @Override // n.h
    public boolean o(n.j jVar, MenuItem menuItem) {
        switch (this.f20944d) {
            case 2:
                break;
            default:
                eh.n nVar = ((qg.e) this.f20945e).f8275w;
                if (nVar != null) {
                    vm.e.a((vm.e) ((mi.a) nVar).f15798e, menuItem);
                }
                break;
        }
        return false;
    }

    @Override // ig.c
    public void onFailure(Exception exc) {
        ((CountDownLatch) this.f20945e).countDown();
    }

    @Override // n1.h
    public void onResult(Object obj) {
        n1.p result = (n1.p) obj;
        Intrinsics.checkNotNullParameter(result, "result");
        ar.k kVar = (ar.k) this.f20945e;
        if (kVar.c()) {
            q qVar = Result.f14614e;
            kVar.resumeWith(result);
        }
    }

    @Override // ig.d
    public void onSuccess(Object obj) {
        ((CountDownLatch) this.f20945e).countDown();
    }

    @Override // vo.t
    public t p(y modality) {
        Intrinsics.checkNotNullParameter(modality, "modality");
        return this;
    }

    @Override // ga.j
    public void q(Object obj) {
        ((k) this.f20945e).getClass();
    }

    @Override // ga.j
    public void t(Object obj) {
        ((k) this.f20945e).getClass();
    }

    @Override // io.sentry.y3
    public x3 u(x0 x0Var, w5 w5Var) {
        com.facebook.imagepipeline.nativecode.c.H(x0Var, "Scopes are required");
        com.facebook.imagepipeline.nativecode.c.H(w5Var, "SentryOptions is required");
        String outboxPath = ((com.discord.crash_reporting.b) this.f20945e).f4336d.getOutboxPath();
        if (outboxPath == null || !y3.T(outboxPath, w5Var.getLogger())) {
            w5Var.getLogger().q(SentryLevel.ERROR, "No outbox dir path is defined in options.", new Object[0]);
            return null;
        }
        return new x3(w5Var.getLogger(), outboxPath, new io.sentry.z2(x0Var, w5Var.getEnvelopeReader(), w5Var.getSerializer(), w5Var.getLogger(), w5Var.getFlushTimeoutMillis(), w5Var.getMaxQueueSize()), new File(outboxPath));
    }

    @Override // kq.n
    public void unlock() {
        ((ReentrantLock) this.f20945e).unlock();
    }

    @Override // vo.t
    public t x() {
        aq.b userDataKey = gp.e.f10169e0;
        Intrinsics.checkNotNullParameter(userDataKey, "userDataKey");
        return this;
    }

    @Override // md.q0
    public boolean z(long j) {
        boolean z5;
        boolean z6 = false;
        do {
            long jK = k();
            if (jK == Long.MIN_VALUE) {
                return z6;
            }
            z5 = false;
            for (q0 q0Var : (q0[]) this.f20945e) {
                long jK2 = q0Var.k();
                boolean z7 = jK2 != Long.MIN_VALUE && jK2 <= j;
                if (jK2 == jK || z7) {
                    z5 |= q0Var.z(j);
                }
            }
            z6 |= z5;
        } while (z5);
        return z6;
    }

    public b(int i7) {
        this.f20944d = i7;
        switch (i7) {
            case 15:
                this.f20945e = new CountDownLatch(1);
                break;
            case 18:
                this.f20945e = new k0(j2.f12781d);
                break;
        }
    }

    public b(Handler handler) {
        this.f20944d = 4;
        this.f20945e = new f(handler, 0);
    }

    public b(Resources resources) {
        this.f20944d = 10;
        resources.getClass();
        this.f20945e = resources;
    }

    public b(ReentrantLock lock) {
        this.f20944d = 21;
        Intrinsics.checkNotNullParameter(lock, "lock");
        this.f20945e = lock;
    }

    public b(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f20944d = 23;
        if (Build.VERSION.SDK_INT >= 25) {
            this.f20945e = new m1.e(uri, clipDescription, uri2);
        } else {
            this.f20945e = new e4.m(uri, clipDescription, uri2, 28);
        }
    }

    public b(Context context) {
        this.f20944d = 19;
        this.f20945e = context.getApplicationContext();
    }

    @Override // vo.t
    public t D() {
        return this;
    }

    @Override // vo.t
    public t N() {
        return this;
    }

    @Override // vo.t
    public t X() {
        return this;
    }

    @Override // np.l
    public void i() {
    }

    @Override // vo.t
    public t n() {
        return this;
    }

    @Override // vo.t
    public t y() {
        return this;
    }

    private final void f0(n.j jVar) {
    }

    @Override // vo.t
    public t s(yo.t tVar) {
        return this;
    }

    @Override // np.l
    public void K(e eVar, zp.f fVar) {
    }

    @Override // np.l
    public void G(e eVar, up.b bVar, e eVar2) {
    }
}
