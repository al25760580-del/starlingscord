package okhttp3;

/* JADX INFO: loaded from: classes.dex */
public interface Interceptor {

    public interface Chain {
        Response a(Request request);

        Request i();
    }

    Response intercept(Chain chain);
}
