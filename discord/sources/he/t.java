package he;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.upstream.DataSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements DataSource {
    public w0 E;
    public l F;
    public p0 G;
    public DataSource H;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f10702d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f10703e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final DataSource f10704i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public z f10705v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public c f10706w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public j f10707x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public DataSource f10708y;

    public t(Context context, DataSource dataSource) {
        this.f10702d = context.getApplicationContext();
        dataSource.getClass();
        this.f10704i = dataSource;
        this.f10703e = new ArrayList();
    }

    public static void c(DataSource dataSource, u0 u0Var) {
        if (dataSource != null) {
            dataSource.B(u0Var);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final void B(u0 u0Var) {
        u0Var.getClass();
        this.f10704i.B(u0Var);
        this.f10703e.add(u0Var);
        c(this.f10705v, u0Var);
        c(this.f10706w, u0Var);
        c(this.f10707x, u0Var);
        c(this.f10708y, u0Var);
        c(this.E, u0Var);
        c(this.F, u0Var);
        c(this.G, u0Var);
    }

    public final void b(DataSource dataSource) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f10703e;
            if (i7 >= arrayList.size()) {
                return;
            }
            dataSource.B((u0) arrayList.get(i7));
            i7++;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final void close() {
        DataSource dataSource = this.H;
        if (dataSource != null) {
            try {
                dataSource.close();
            } finally {
                this.H = null;
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final long d(p pVar) {
        je.b.k(this.H == null);
        Uri uri = pVar.f10649a;
        String scheme = uri.getScheme();
        int i7 = je.e0.f13788a;
        String scheme2 = uri.getScheme();
        boolean zIsEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f10702d;
        if (zIsEmpty || "file".equals(scheme2)) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f10705v == null) {
                    z zVar = new z(false);
                    this.f10705v = zVar;
                    b(zVar);
                }
                this.H = this.f10705v;
            } else {
                if (this.f10706w == null) {
                    c cVar = new c(context);
                    this.f10706w = cVar;
                    b(cVar);
                }
                this.H = this.f10706w;
            }
        } else if ("asset".equals(scheme)) {
            if (this.f10706w == null) {
                c cVar2 = new c(context);
                this.f10706w = cVar2;
                b(cVar2);
            }
            this.H = this.f10706w;
        } else if ("content".equals(scheme)) {
            if (this.f10707x == null) {
                j jVar = new j(context);
                this.f10707x = jVar;
                b(jVar);
            }
            this.H = this.f10707x;
        } else {
            boolean zEquals = "rtmp".equals(scheme);
            DataSource dataSource = this.f10704i;
            if (zEquals) {
                if (this.f10708y == null) {
                    try {
                        DataSource dataSource2 = (DataSource) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                        this.f10708y = dataSource2;
                        b(dataSource2);
                    } catch (ClassNotFoundException unused) {
                        je.b.N("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e10) {
                        throw new RuntimeException("Error instantiating RTMP extension", e10);
                    }
                    if (this.f10708y == null) {
                        this.f10708y = dataSource;
                    }
                }
                this.H = this.f10708y;
            } else if ("udp".equals(scheme)) {
                if (this.E == null) {
                    w0 w0Var = new w0();
                    this.E = w0Var;
                    b(w0Var);
                }
                this.H = this.E;
            } else if ("data".equals(scheme)) {
                if (this.F == null) {
                    l lVar = new l(false);
                    this.F = lVar;
                    b(lVar);
                }
                this.H = this.F;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.G == null) {
                    p0 p0Var = new p0(context);
                    this.G = p0Var;
                    b(p0Var);
                }
                this.H = this.G;
            } else {
                this.H = dataSource;
            }
        }
        return this.H.d(pVar);
    }

    @Override // he.k
    public final int read(byte[] bArr, int i7, int i10) {
        DataSource dataSource = this.H;
        dataSource.getClass();
        return dataSource.read(bArr, i7, i10);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final Map s() {
        DataSource dataSource = this.H;
        return dataSource == null ? Collections.EMPTY_MAP : dataSource.s();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final Uri y() {
        DataSource dataSource = this.H;
        if (dataSource == null) {
            return null;
        }
        return dataSource.y();
    }
}
