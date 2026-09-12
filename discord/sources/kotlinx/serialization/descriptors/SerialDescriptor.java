package kotlinx.serialization.descriptors;

import java.util.List;
import ls.d;

/* JADX INFO: loaded from: classes3.dex */
public interface SerialDescriptor {
    d c();

    String d();

    boolean e();

    int f(String str);

    int g();

    List getAnnotations();

    String h(int i7);

    List i(int i7);

    boolean isInline();

    SerialDescriptor j(int i7);

    boolean k(int i7);
}
