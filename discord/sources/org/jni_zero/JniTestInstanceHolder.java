package org.jni_zero;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class JniTestInstanceHolder {
    static ArrayList<JniTestInstanceHolder> sAllOverrides;
    public Object value;

    private JniTestInstanceHolder() {
    }

    public static synchronized JniTestInstanceHolder create() {
        JniTestInstanceHolder jniTestInstanceHolder;
        try {
            if (sAllOverrides == null) {
                sAllOverrides = new ArrayList<>();
            }
            jniTestInstanceHolder = new JniTestInstanceHolder();
            sAllOverrides.add(jniTestInstanceHolder);
        } catch (Throwable th2) {
            throw th2;
        }
        return jniTestInstanceHolder;
    }
}
