package io.ktor.client.plugins.cache.storage;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: FileCacheStorage.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class FileCacheStorage$updateCache$mutex$1 implements Function0<Mutex> {
    public static final FileCacheStorage$updateCache$mutex$1 INSTANCE = new FileCacheStorage$updateCache$mutex$1();

    @Override // kotlin.jvm.functions.Function0
    public final Mutex invoke() {
        return MutexKt.Mutex$default(false, 1, null);
    }
}
