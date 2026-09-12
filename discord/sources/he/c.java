package he;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends h {
    public long E;
    public boolean F;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final AssetManager f10589w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Uri f10590x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public InputStream f10591y;

    public c(Context context) {
        super(false);
        this.f10589w = context.getAssets();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final void close() {
        this.f10590x = null;
        try {
            try {
                InputStream inputStream = this.f10591y;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f10591y = null;
                if (this.F) {
                    this.F = false;
                    c();
                }
            } catch (IOException e10) {
                throw new b(2000, e10);
            }
        } catch (Throwable th2) {
            this.f10591y = null;
            if (this.F) {
                this.F = false;
                c();
            }
            throw th2;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final long d(p pVar) throws b {
        try {
            Uri uri = pVar.f10649a;
            long j = pVar.f10654f;
            this.f10590x = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            e();
            InputStream inputStreamOpen = this.f10589w.open(path, 1);
            this.f10591y = inputStreamOpen;
            if (inputStreamOpen.skip(j) < j) {
                throw new b(2008, null);
            }
            long j5 = pVar.f10655g;
            if (j5 != -1) {
                this.E = j5;
            } else {
                long jAvailable = this.f10591y.available();
                this.E = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.E = -1L;
                }
            }
            this.F = true;
            f(pVar);
            return this.E;
        } catch (b e10) {
            throw e10;
        } catch (IOException e11) {
            throw new b(e11 instanceof FileNotFoundException ? 2005 : 2000, e11);
        }
    }

    @Override // he.k
    public final int read(byte[] bArr, int i7, int i10) throws b {
        if (i10 == 0) {
            return 0;
        }
        long j = this.E;
        if (j != 0) {
            if (j != -1) {
                try {
                    i10 = (int) Math.min(j, i10);
                } catch (IOException e10) {
                    throw new b(2000, e10);
                }
            }
            InputStream inputStream = this.f10591y;
            int i11 = je.e0.f13788a;
            int i12 = inputStream.read(bArr, i7, i10);
            if (i12 != -1) {
                long j5 = this.E;
                if (j5 != -1) {
                    this.E = j5 - ((long) i12);
                }
                b(i12);
                return i12;
            }
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final Uri y() {
        return this.f10590x;
    }
}
