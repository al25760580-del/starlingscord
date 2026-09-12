package org.jni_zero;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class JniTestInstancesSnapshot {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final Object[] mValues;

    private JniTestInstancesSnapshot(Object[] objArr) {
        this.mValues = objArr;
    }

    public static void clearAllForTesting() {
        restoreSnapshotForTesting(new JniTestInstancesSnapshot(new Object[0]));
    }

    public static void restoreSnapshotForTesting(JniTestInstancesSnapshot jniTestInstancesSnapshot) {
        synchronized (JniTestInstanceHolder.class) {
            try {
                Object[] objArr = jniTestInstancesSnapshot.mValues;
                ArrayList<JniTestInstanceHolder> arrayList = JniTestInstanceHolder.sAllOverrides;
                int length = objArr.length;
                if (arrayList == null) {
                    return;
                }
                int size = arrayList.size();
                for (int i7 = 0; i7 < length; i7++) {
                    arrayList.get(i7).value = objArr[i7];
                }
                while (length < size) {
                    arrayList.get(length).value = null;
                    length++;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static JniTestInstancesSnapshot snapshotOverridesForTesting() {
        synchronized (JniTestInstanceHolder.class) {
            try {
                ArrayList<JniTestInstanceHolder> arrayList = JniTestInstanceHolder.sAllOverrides;
                if (arrayList == null) {
                    return new JniTestInstancesSnapshot(new Object[0]);
                }
                Object[] objArr = new Object[arrayList.size()];
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    objArr[i7] = arrayList.get(i7).value;
                }
                return new JniTestInstancesSnapshot(objArr);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
