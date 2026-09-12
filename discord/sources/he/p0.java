package he;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes3.dex */
public final class p0 extends h {
    public AssetFileDescriptor E;
    public FileInputStream F;
    public long G;
    public boolean H;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Resources f10658w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f10659x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Uri f10660y;

    public p0(Context context) {
        super(false);
        this.f10658w = context.getResources();
        this.f10659x = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i7) {
        return Uri.parse("rawresource:///" + i7);
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
            r5.f10660y = r0
            r1 = 2000(0x7d0, float:2.803E-42)
            r2 = 0
            java.io.FileInputStream r3 = r5.F     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10
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
            r5.F = r0
            android.content.res.AssetFileDescriptor r3 = r5.E     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
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
            r5.E = r0
            boolean r0 = r5.H
            if (r0 == 0) goto L2b
            r5.H = r2
            r5.c()
        L2b:
            return
        L2c:
            he.o0 r4 = new he.o0     // Catch: java.lang.Throwable -> L1c
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> L1c
            throw r4     // Catch: java.lang.Throwable -> L1c
        L32:
            r5.E = r0
            boolean r0 = r5.H
            if (r0 == 0) goto L3d
            r5.H = r2
            r5.c()
        L3d:
            throw r1
        L3e:
            he.o0 r4 = new he.o0     // Catch: java.lang.Throwable -> Le
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> Le
            throw r4     // Catch: java.lang.Throwable -> Le
        L44:
            r5.F = r0
            android.content.res.AssetFileDescriptor r4 = r5.E     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
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
            r5.E = r0
            boolean r0 = r5.H
            if (r0 == 0) goto L5d
            r5.H = r2
            r5.c()
        L5d:
            throw r3
        L5e:
            he.o0 r4 = new he.o0     // Catch: java.lang.Throwable -> L4e
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> L4e
            throw r4     // Catch: java.lang.Throwable -> L4e
        L64:
            r5.E = r0
            boolean r0 = r5.H
            if (r0 == 0) goto L6f
            r5.H = r2
            r5.c()
        L6f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: he.p0.close():void");
    }

    /* JADX WARN: Code duplicated, block: B:84:0x00b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final long d(p pVar) throws o0 {
        int identifier;
        Uri uri = pVar.f10649a;
        long j = pVar.f10655g;
        long j5 = pVar.f10654f;
        Uri uriNormalizeScheme = uri.normalizeScheme();
        this.f10660y = uriNormalizeScheme;
        boolean zEquals = TextUtils.equals("rawresource", uriNormalizeScheme.getScheme());
        Resources resources = this.f10658w;
        if (zEquals) {
            try {
                String lastPathSegment = uriNormalizeScheme.getLastPathSegment();
                lastPathSegment.getClass();
                identifier = Integer.parseInt(lastPathSegment);
            } catch (NumberFormatException unused) {
                throw new o0("Resource identifier must be an integer.", null, 1004);
            }
        } else {
            if (TextUtils.equals("android.resource", uriNormalizeScheme.getScheme()) && uriNormalizeScheme.getPathSegments().size() == 1) {
                String lastPathSegment2 = uriNormalizeScheme.getLastPathSegment();
                lastPathSegment2.getClass();
                if (lastPathSegment2.matches("\\d+")) {
                    String lastPathSegment3 = uriNormalizeScheme.getLastPathSegment();
                    lastPathSegment3.getClass();
                    identifier = Integer.parseInt(lastPathSegment3);
                }
            }
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                throw new o0("Unsupported URI scheme (" + uriNormalizeScheme.getScheme() + "). Only rawresource and android.resource are supported.", null, 1004);
            }
            String path = uriNormalizeScheme.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String host = uriNormalizeScheme.getHost();
            identifier = resources.getIdentifier(com.discord.chat.presentation.list.a.k(new StringBuilder(), TextUtils.isEmpty(host) ? "" : kk.b.j(host, ":"), path), "raw", this.f10659x);
            if (identifier == 0) {
                throw new o0("Resource not found.", null, 2005);
            }
        }
        e();
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resources.openRawResourceFd(identifier);
            this.E = assetFileDescriptorOpenRawResourceFd;
            if (assetFileDescriptorOpenRawResourceFd == null) {
                throw new o0("Resource is compressed: " + uriNormalizeScheme, null, 2000);
            }
            long length = assetFileDescriptorOpenRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenRawResourceFd.getFileDescriptor());
            this.F = fileInputStream;
            try {
                if (length != -1 && j5 > length) {
                    throw new o0(null, null, 2008);
                }
                long startOffset = assetFileDescriptorOpenRawResourceFd.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j5) - startOffset;
                if (jSkip != j5) {
                    throw new o0(null, null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    if (channel.size() == 0) {
                        this.G = -1L;
                    } else {
                        long size = channel.size() - channel.position();
                        this.G = size;
                        if (size < 0) {
                            throw new o0(null, null, 2008);
                        }
                    }
                } else {
                    long j7 = length - jSkip;
                    this.G = j7;
                    if (j7 < 0) {
                        throw new m(2008);
                    }
                }
                if (j != -1) {
                    long j10 = this.G;
                    this.G = j10 == -1 ? j : Math.min(j10, j);
                }
                this.H = true;
                f(pVar);
                return j != -1 ? j : this.G;
            } catch (o0 e10) {
                throw e10;
            } catch (IOException e11) {
                throw new o0(null, e11, 2000);
            }
        } catch (Resources.NotFoundException e12) {
            throw new o0(null, e12, 2005);
        }
    }

    @Override // he.k
    public final int read(byte[] bArr, int i7, int i10) throws o0 {
        if (i10 == 0) {
            return 0;
        }
        long j = this.G;
        if (j != 0) {
            if (j != -1) {
                try {
                    i10 = (int) Math.min(j, i10);
                } catch (IOException e10) {
                    throw new o0(null, e10, 2000);
                }
            }
            FileInputStream fileInputStream = this.F;
            int i11 = je.e0.f13788a;
            int i12 = fileInputStream.read(bArr, i7, i10);
            if (i12 != -1) {
                long j5 = this.G;
                if (j5 != -1) {
                    this.G = j5 - ((long) i12);
                }
                b(i12);
                return i12;
            }
            if (this.G != -1) {
                throw new o0("End of stream reached having not read sufficient data.", new EOFException(), 2000);
            }
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final Uri y() {
        return this.f10660y;
    }
}
