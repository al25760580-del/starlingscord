package he;

import android.net.Uri;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes3.dex */
public final class z extends h {
    public boolean E;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public RandomAccessFile f10721w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Uri f10722x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f10723y;

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final void close() {
        this.f10722x = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f10721w;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.f10721w = null;
                if (this.E) {
                    this.E = false;
                    c();
                }
            } catch (IOException e10) {
                throw new y(2000, e10);
            }
        } catch (Throwable th2) {
            this.f10721w = null;
            if (this.E) {
                this.E = false;
                c();
            }
            throw th2;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final long d(p pVar) throws y {
        Uri uri = pVar.f10649a;
        long j = pVar.f10654f;
        this.f10722x = uri;
        e();
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f10721w = randomAccessFile;
            try {
                randomAccessFile.seek(j);
                long length = pVar.f10655g;
                if (length == -1) {
                    length = this.f10721w.length() - j;
                }
                this.f10723y = length;
                if (length < 0) {
                    throw new y(null, null, 2008);
                }
                this.E = true;
                f(pVar);
                return this.f10723y;
            } catch (IOException e10) {
                throw new y(2000, e10);
            }
        } catch (FileNotFoundException e11) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new y((je.e0.f13788a < 21 || !x.b(e11.getCause())) ? 2005 : 2006, e11);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder sbU = a3.e.u("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            sbU.append(fragment);
            throw new y(sbU.toString(), e11, 1004);
        } catch (SecurityException e12) {
            throw new y(2006, e12);
        } catch (RuntimeException e13) {
            throw new y(2000, e13);
        }
    }

    @Override // he.k
    public final int read(byte[] bArr, int i7, int i10) throws y {
        if (i10 == 0) {
            return 0;
        }
        long j = this.f10723y;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f10721w;
            int i11 = je.e0.f13788a;
            int i12 = randomAccessFile.read(bArr, i7, (int) Math.min(j, i10));
            if (i12 > 0) {
                this.f10723y -= (long) i12;
                b(i12);
            }
            return i12;
        } catch (IOException e10) {
            throw new y(2000, e10);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final Uri y() {
        return this.f10722x;
    }
}
