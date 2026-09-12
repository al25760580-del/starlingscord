package org.jni_zero;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class JniUtil {
    @CalledByNative
    private static Map<Object, Object> arrayToMap(Object[] objArr) {
        int length = objArr.length;
        HashMap map = new HashMap(length / 2);
        for (int i7 = 0; i7 < length; i7 += 2) {
            map.put(objArr[i7], objArr[i7 + 1]);
        }
        return map;
    }

    @CalledByNative
    private static Object[] mapToArray(Map<Object, Object> map) {
        Object[] objArr = new Object[map.size() * 2];
        int i7 = 0;
        for (Map.Entry<Object, Object> entry : map.entrySet()) {
            int i10 = i7 + 1;
            objArr[i7] = entry.getKey();
            i7 += 2;
            objArr[i10] = entry.getValue();
        }
        return objArr;
    }
}
