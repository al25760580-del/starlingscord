package ja;

import android.graphics.Bitmap;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.DataSource;
import na.d;
import na.g;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends x8.b {
    public abstract void onNewResultImpl(Bitmap bitmap);

    @Override // x8.b
    public void onNewResultImpl(DataSource dataSource) {
        if (dataSource.isFinished()) {
            CloseableReference closeableReference = (CloseableReference) dataSource.getResult();
            try {
                onNewResultImpl((closeableReference == null || !(closeableReference.q() instanceof d)) ? null : ((g) ((d) closeableReference.q())).f16528w);
            } finally {
                CloseableReference.l(closeableReference);
            }
        }
    }
}
