package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import he.k;
import he.p;
import he.u0;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface DataSource extends k {

    public interface Factory {
        DataSource createDataSource();
    }

    void B(u0 u0Var);

    void close();

    long d(p pVar);

    default Map s() {
        return Collections.EMPTY_MAP;
    }

    Uri y();
}
