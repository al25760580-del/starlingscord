package io.sentry;

import java.io.BufferedInputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public interface c1 {
    void a(e4.c cVar, OutputStream outputStream);

    void b(Object obj, Writer writer);

    String c(ConcurrentHashMap concurrentHashMap);

    Object d(Reader reader, Class cls);

    e4.c e(BufferedInputStream bufferedInputStream);
}
