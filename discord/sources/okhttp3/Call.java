package okhttp3;

import gs.i;

/* JADX INFO: loaded from: classes.dex */
public interface Call extends Cloneable {

    public interface Factory {
        i a(Request request);
    }

    void cancel();

    Request i();

    boolean y();
}
