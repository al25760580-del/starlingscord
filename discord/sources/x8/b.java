package x8;

import com.facebook.datasource.DataSource;
import com.facebook.datasource.DataSubscriber;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements DataSubscriber {
    @Override // com.facebook.datasource.DataSubscriber
    public void onFailure(DataSource dataSource) {
        try {
            onFailureImpl(dataSource);
        } finally {
            dataSource.close();
        }
    }

    public abstract void onFailureImpl(DataSource dataSource);

    @Override // com.facebook.datasource.DataSubscriber
    public void onNewResult(DataSource dataSource) {
        boolean zIsFinished = dataSource.isFinished();
        try {
            onNewResultImpl(dataSource);
        } finally {
            if (zIsFinished) {
                dataSource.close();
            }
        }
    }

    public abstract void onNewResultImpl(DataSource dataSource);

    @Override // com.facebook.datasource.DataSubscriber
    public void onCancellation(DataSource dataSource) {
    }

    @Override // com.facebook.datasource.DataSubscriber
    public void onProgressUpdate(DataSource dataSource) {
    }
}
