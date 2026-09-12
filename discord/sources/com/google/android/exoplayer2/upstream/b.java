package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import he.p;
import he.u0;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements DataSource {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f5838d = new b();

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final void close() {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final long d(p pVar) throws IOException {
        throw new IOException("PlaceholderDataSource cannot be opened");
    }

    @Override // he.k
    public final int read(byte[] bArr, int i7, int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final Uri y() {
        return null;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final void B(u0 u0Var) {
    }
}
