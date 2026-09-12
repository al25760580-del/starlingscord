package he;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends h {
    public FileInputStream E;
    public long F;
    public boolean G;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ContentResolver f10615w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Uri f10616x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public AssetFileDescriptor f10617y;

    public j(Context context) {
        super(false);
        this.f10615w = context.getContentResolver();
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x000e */
    /* JADX WARN: Bottom block not found for handler: all -> 0x004e */
    @Override // com.google.android.exoplayer2.upstream.DataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() {
        /*
            r5 = this;
            r0 = 0
            r5.f10616x = r0
            r1 = 2000(0x7d0, float:2.803E-42)
            r2 = 0
            java.io.FileInputStream r3 = r5.E     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10
            if (r3 == 0) goto L12
            r3.close()     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10
            goto L12
        Le:
            r3 = move-exception
            goto L44
        L10:
            r3 = move-exception
            goto L3e
        L12:
            r5.E = r0
            android.content.res.AssetFileDescriptor r3 = r5.f10617y     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            if (r3 == 0) goto L20
            r3.close()     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            goto L20
        L1c:
            r1 = move-exception
            goto L32
        L1e:
            r3 = move-exception
            goto L2c
        L20:
            r5.f10617y = r0
            boolean r0 = r5.G
            if (r0 == 0) goto L2b
            r5.G = r2
            r5.c()
        L2b:
            return
        L2c:
            he.i r4 = new he.i     // Catch: java.lang.Throwable -> L1c
            r4.<init>(r1, r3)     // Catch: java.lang.Throwable -> L1c
            throw r4     // Catch: java.lang.Throwable -> L1c
        L32:
            r5.f10617y = r0
            boolean r0 = r5.G
            if (r0 == 0) goto L3d
            r5.G = r2
            r5.c()
        L3d:
            throw r1
        L3e:
            he.i r4 = new he.i     // Catch: java.lang.Throwable -> Le
            r4.<init>(r1, r3)     // Catch: java.lang.Throwable -> Le
            throw r4     // Catch: java.lang.Throwable -> Le
        L44:
            r5.E = r0
            android.content.res.AssetFileDescriptor r4 = r5.f10617y     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            if (r4 == 0) goto L52
            r4.close()     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            goto L52
        L4e:
            r1 = move-exception
            goto L64
        L50:
            r3 = move-exception
            goto L5e
        L52:
            r5.f10617y = r0
            boolean r0 = r5.G
            if (r0 == 0) goto L5d
            r5.G = r2
            r5.c()
        L5d:
            throw r3
        L5e:
            he.i r4 = new he.i     // Catch: java.lang.Throwable -> L4e
            r4.<init>(r1, r3)     // Catch: java.lang.Throwable -> L4e
            throw r4     // Catch: java.lang.Throwable -> L4e
        L64:
            r5.f10617y = r0
            boolean r0 = r5.G
            if (r0 == 0) goto L6f
            r5.G = r2
            r5.c()
        L6f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: he.j.close():void");
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final long d(p pVar) throws i {
        int i7;
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            try {
                Uri uri = pVar.f10649a;
                long j = pVar.f10655g;
                long j5 = pVar.f10654f;
                Uri uriNormalizeScheme = uri.normalizeScheme();
                this.f10616x = uriNormalizeScheme;
                e();
                boolean zEquals = "content".equals(uriNormalizeScheme.getScheme());
                ContentResolver contentResolver = this.f10615w;
                if (zEquals) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
                } else {
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriNormalizeScheme, "r");
                }
                this.f10617y = assetFileDescriptorOpenAssetFileDescriptor;
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    i7 = 2000;
                    try {
                        throw new i(2000, new IOException("Could not open file descriptor for: " + uriNormalizeScheme));
                    } catch (IOException e10) {
                        e = e10;
                        if (e instanceof FileNotFoundException) {
                            i7 = 2005;
                        }
                        throw new i(i7, e);
                    }
                }
                long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                this.E = fileInputStream;
                if (length != -1 && j5 > length) {
                    throw new i(2008, null);
                }
                long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j5) - startOffset;
                if (jSkip != j5) {
                    throw new i(2008, null);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.F = -1L;
                    } else {
                        long jPosition = size - channel.position();
                        this.F = jPosition;
                        if (jPosition < 0) {
                            throw new i(2008, null);
                        }
                    }
                } else {
                    long j7 = length - jSkip;
                    this.F = j7;
                    if (j7 < 0) {
                        throw new i(2008, null);
                    }
                }
                if (j != -1) {
                    long j10 = this.F;
                    this.F = j10 == -1 ? j : Math.min(j10, j);
                }
                this.G = true;
                f(pVar);
                return j != -1 ? j : this.F;
            } catch (IOException e11) {
                e = e11;
                i7 = 2000;
            }
        } catch (i e12) {
            throw e12;
        }
    }

    @Override // he.k
    public final int read(byte[] bArr, int i7, int i10) throws i {
        if (i10 == 0) {
            return 0;
        }
        long j = this.F;
        if (j != 0) {
            if (j != -1) {
                try {
                    i10 = (int) Math.min(j, i10);
                } catch (IOException e10) {
                    throw new i(2000, e10);
                }
            }
            FileInputStream fileInputStream = this.E;
            int i11 = je.e0.f13788a;
            int i12 = fileInputStream.read(bArr, i7, i10);
            if (i12 != -1) {
                long j5 = this.F;
                if (j5 != -1) {
                    this.F = j5 - ((long) i12);
                }
                b(i12);
                return i12;
            }
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final Uri y() {
        return this.f10616x;
    }
}
