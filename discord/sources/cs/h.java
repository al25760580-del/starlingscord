package cs;

import java.io.IOException;
import okhttp3.Call;
import okhttp3.Response;

/* JADX INFO: loaded from: classes.dex */
public interface h {
    void onFailure(Call call, IOException iOException);

    void onResponse(Call call, Response response);
}
