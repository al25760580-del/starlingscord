package ic;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes3.dex */
public interface n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f11577a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    ByteBuffer a();

    l b(l lVar);

    boolean c();

    void d(ByteBuffer byteBuffer);

    void e();

    boolean f();

    void flush();

    void reset();
}
