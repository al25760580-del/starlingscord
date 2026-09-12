package ga;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import android.view.View;
import c5.n;
import ci.a0;
import ci.e0;
import ci.y;
import ci.z;
import com.facebook.soloader.b0;
import com.facebook.soloader.i0;
import eightbitlab.com.blurview.BlurController;
import eightbitlab.com.blurview.BlurViewFacade;
import im.q;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import n.u;
import net.time4j.x0;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import sh.r;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements u, t2.b, BlurController, m, kb.b, r8.c, th.g, qm.a, e0, y2.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static k f9545d;

    public static final String q(byte[] bArr, byte[][] bArr2, int i7) {
        int i10;
        boolean z5;
        int i11;
        int i12;
        byte[] bArr3 = PublicSuffixDatabase.f17405e;
        int length = bArr.length;
        int i13 = 0;
        while (i13 < length) {
            int i14 = (i13 + length) / 2;
            while (i14 > -1 && bArr[i14] != 10) {
                i14--;
            }
            int i15 = i14 + 1;
            int i16 = 1;
            while (true) {
                i10 = i15 + i16;
                if (bArr[i10] == 10) {
                    break;
                }
                i16++;
            }
            int i17 = i10 - i15;
            int i18 = i7;
            boolean z6 = false;
            int i19 = 0;
            int i20 = 0;
            while (true) {
                if (z6) {
                    i11 = 46;
                    z5 = false;
                } else {
                    byte b10 = bArr2[i18][i19];
                    byte[] bArr4 = ds.b.f7815a;
                    int i21 = b10 & 255;
                    z5 = z6;
                    i11 = i21;
                }
                byte b11 = bArr[i15 + i20];
                byte[] bArr5 = ds.b.f7815a;
                i12 = i11 - (b11 & 255);
                if (i12 != 0) {
                    break;
                }
                i20++;
                i19++;
                if (i20 == i17) {
                    break;
                }
                if (bArr2[i18].length != i19) {
                    z6 = z5;
                } else {
                    if (i18 == bArr2.length - 1) {
                        break;
                    }
                    i18++;
                    i19 = -1;
                    z6 = true;
                }
            }
            if (i12 >= 0) {
                if (i12 <= 0) {
                    int i22 = i17 - i20;
                    int length2 = bArr2[i18].length - i19;
                    int length3 = bArr2.length;
                    for (int i23 = i18 + 1; i23 < length3; i23++) {
                        length2 += bArr2[i23].length;
                    }
                    if (length2 >= i22) {
                        if (length2 <= i22) {
                            Charset UTF_8 = StandardCharsets.UTF_8;
                            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
                            return new String(bArr, i15, i17, UTF_8);
                        }
                    }
                }
                i13 = i10 + 1;
            }
            length = i14;
        }
        return null;
    }

    public static final boolean r(View view, Boolean bool) {
        rn.u uVar = q.Z;
        Method method = (Method) q.Z.getValue();
        if (method == null || !method.getDeclaringClass().isInstance(view)) {
            return false;
        }
        try {
            method.invoke(view, bool);
            return true;
        } catch (ReflectiveOperationException unused) {
            return false;
        }
    }

    public static void s(HttpURLConnection httpURLConnection, n nVar, byte[] bArr) throws IOException {
        httpURLConnection.setDoOutput(true);
        if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
            httpURLConnection.setRequestProperty("Content-Type", nVar.getBodyContentType());
        }
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        dataOutputStream.write(bArr);
        dataOutputStream.close();
    }

    public static ArrayList t(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new c5.g((String) entry.getKey(), (String) it.next()));
                }
            }
        }
        return arrayList;
    }

    public static void w(HttpURLConnection httpURLConnection, n nVar) throws IOException {
        switch (nVar.getMethod()) {
            case -1:
                byte[] postBody = nVar.getPostBody();
                if (postBody != null) {
                    httpURLConnection.setRequestMethod("POST");
                    s(httpURLConnection, nVar, postBody);
                    return;
                }
                return;
            case 0:
                httpURLConnection.setRequestMethod("GET");
                return;
            case 1:
                httpURLConnection.setRequestMethod("POST");
                byte[] body = nVar.getBody();
                if (body != null) {
                    s(httpURLConnection, nVar, body);
                    return;
                }
                return;
            case 2:
                httpURLConnection.setRequestMethod("PUT");
                byte[] body2 = nVar.getBody();
                if (body2 != null) {
                    s(httpURLConnection, nVar, body2);
                    return;
                }
                return;
            case 3:
                httpURLConnection.setRequestMethod("DELETE");
                return;
            case 4:
                httpURLConnection.setRequestMethod("HEAD");
                return;
            case 5:
                httpURLConnection.setRequestMethod("OPTIONS");
                return;
            case 6:
                httpURLConnection.setRequestMethod("TRACE");
                return;
            case 7:
                httpURLConnection.setRequestMethod("PATCH");
                byte[] body3 = nVar.getBody();
                if (body3 != null) {
                    s(httpURLConnection, nVar, body3);
                    return;
                }
                return;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
    }

    @Override // th.g
    public /* synthetic */ Object a() {
        return new r();
    }

    @Override // y2.b
    public void c() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // ga.m
    public int e(Object obj) {
        return ((na.c) obj).j();
    }

    @Override // n.u
    public boolean f(n.j jVar) {
        return false;
    }

    @Override // qm.a
    public String g() {
        return "onWillAppear";
    }

    @Override // qm.a
    public String getEventName() {
        return "topWillAppear";
    }

    @Override // ci.e0
    public Object h(IBinder iBinder) {
        int i7 = z.f3726g;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
        return iInterfaceQueryLocalInterface instanceof a0 ? (a0) iInterfaceQueryLocalInterface : new y(iBinder, "com.google.android.play.core.integrity.protocol.IIntegrityService", 0);
    }

    @Override // kb.b
    public boolean i(UnsatisfiedLinkError unsatisfiedLinkError, b0[] b0VarArr) {
        if (!(unsatisfiedLinkError instanceof com.facebook.soloader.a0) || (unsatisfiedLinkError instanceof com.facebook.soloader.z)) {
            return false;
        }
        String str = ((com.facebook.soloader.a0) unsatisfiedLinkError).f5378d;
        StringBuilder sb2 = new StringBuilder("Reunpacking NonApk UnpackingSoSources due to ");
        sb2.append(unsatisfiedLinkError);
        sb2.append(str == null ? "" : ", retrying for specific library ".concat(str));
        Log.e("SoLoader", sb2.toString());
        for (b0 b0Var : b0VarArr) {
            if (b0Var instanceof i0) {
                i0 i0Var = (i0) b0Var;
                if (i0Var instanceof com.facebook.soloader.b) {
                    continue;
                } else {
                    try {
                        Log.e("SoLoader", "Runpacking " + i0Var.b());
                        i0Var.d(2);
                    } catch (Exception e10) {
                        Log.e("SoLoader", "Encountered an exception while reunpacking " + i0Var.b() + " for library " + str + ": ", e10);
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override // y2.b
    public void j(int i7, Object obj) {
        String str;
        switch (i7) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i7 == 6 || i7 == 7 || i7 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    @Override // eightbitlab.com.blurview.BlurController
    public boolean n(Canvas canvas) {
        return true;
    }

    @Override // r8.c
    public void release(Object obj) {
        try {
            n8.a.a((Closeable) obj);
        } catch (IOException unused) {
        }
    }

    public d5.a u(n nVar, Map map) {
        String url = nVar.getUrl();
        HashMap map2 = new HashMap();
        map2.putAll(map);
        map2.putAll(nVar.getHeaders());
        URL url2 = new URL(url);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url2.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        int timeoutMs = nVar.getTimeoutMs();
        httpURLConnection.setConnectTimeout(timeoutMs);
        httpURLConnection.setReadTimeout(timeoutMs);
        boolean z5 = false;
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        "https".equals(url2.getProtocol());
        try {
            for (String str : map2.keySet()) {
                httpURLConnection.setRequestProperty(str, (String) map2.get(str));
            }
            w(httpURLConnection, nVar);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == -1) {
                throw new IOException("Could not retrieve response code from HttpUrlConnection.");
            }
            if (nVar.getMethod() == 4 || ((100 <= responseCode && responseCode < 200) || responseCode == 204 || responseCode == 304)) {
                d5.a aVar = new d5.a(responseCode, t(httpURLConnection.getHeaderFields()), -1, null);
                httpURLConnection.disconnect();
                return aVar;
            }
            try {
                return new d5.a(responseCode, t(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new d5.d(httpURLConnection));
            } catch (Throwable th2) {
                th = th2;
                z5 = true;
                if (!z5) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public long v() {
        return 365241779741L;
    }

    public long x(Object obj) {
        x0 x0Var = (x0) obj;
        return xr.k.UTC.b(xr.m.T(x0Var.a(), x0Var.b(), x0Var.c()), xr.k.MODIFIED_JULIAN_DATE);
    }

    public Object y(long j) {
        if (j == -365243219892L) {
            return x0.f16782v;
        }
        if (j == 365241779741L) {
            return x0.f16783w;
        }
        long jU = xr.m.U(xr.k.MODIFIED_JULIAN_DATE.b(j, xr.k.UTC));
        return x0.z((int) (jU >> 32), (int) ((jU >> 16) & 255), (int) (jU & 255), true);
    }

    @Override // eightbitlab.com.blurview.BlurController
    public void destroy() {
    }

    @Override // eightbitlab.com.blurview.BlurController
    public void m() {
    }

    @Override // eightbitlab.com.blurview.BlurViewFacade
    public BlurViewFacade d(boolean z5) {
        return this;
    }

    @Override // eightbitlab.com.blurview.BlurViewFacade
    public BlurViewFacade k(int i7) {
        return this;
    }

    @Override // eightbitlab.com.blurview.BlurViewFacade
    public BlurViewFacade l(Drawable drawable) {
        return this;
    }

    @Override // eightbitlab.com.blurview.BlurViewFacade
    public BlurViewFacade o(boolean z5) {
        return this;
    }

    @Override // eightbitlab.com.blurview.BlurViewFacade
    public BlurViewFacade p(float f2) {
        return this;
    }

    @Override // n.u
    public void b(n.j jVar, boolean z5) {
    }
}
