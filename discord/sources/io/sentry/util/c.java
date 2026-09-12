package io.sentry.util;

import io.sentry.ILogger;
import io.sentry.SentryEvent;
import io.sentry.SentryLevel;
import io.sentry.c1;
import io.sentry.protocol.i0;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f13222a = Charset.forName("UTF-8");

    public static ArrayList a(AtomicIntegerArray atomicIntegerArray) {
        int length = atomicIntegerArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i7 = 0; i7 < length; i7++) {
            arrayList.add(Integer.valueOf(atomicIntegerArray.get(i7)));
        }
        return arrayList;
    }

    public static long b(c1 c1Var, ILogger iLogger, SentryEvent sentryEvent) {
        if (sentryEvent == null) {
            return 0L;
        }
        try {
            b bVar = new b();
            c1Var.b(sentryEvent, bVar);
            return bVar.f13221d;
        } catch (Throwable th2) {
            iLogger.g(SentryLevel.ERROR, "Could not calculate size of serializable", th2);
            return 0L;
        }
    }

    public static byte[] c(c1 c1Var, ILogger iLogger, i0 i0Var) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f13222a));
                try {
                    c1Var.b(i0Var, bufferedWriter);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    bufferedWriter.close();
                    byteArrayOutputStream.close();
                    return byteArray;
                } catch (Throwable th2) {
                    try {
                        bufferedWriter.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        } catch (Throwable th6) {
            iLogger.g(SentryLevel.ERROR, "Could not serialize serializable", th6);
            return null;
        }
    }

    public static HashMap d(Calendar calendar) {
        HashMap map = new HashMap();
        map.put("year", Integer.valueOf(calendar.get(1)));
        map.put("month", Integer.valueOf(calendar.get(2)));
        map.put("dayOfMonth", Integer.valueOf(calendar.get(5)));
        map.put("hourOfDay", Integer.valueOf(calendar.get(11)));
        map.put("minute", Integer.valueOf(calendar.get(12)));
        map.put("second", Integer.valueOf(calendar.get(13)));
        return map;
    }
}
