package ok;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface c {
    void onCancelled(String str, List list);

    void onCompleted(String str, List list);

    void onError(String str, Throwable th2, List list);

    void onProgress(String str, float f2);

    void onStarted(String str);
}
