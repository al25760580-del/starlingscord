package com.facebook.react.uimanager;

import a1.k;
import a3.e;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.tencent.mmkv.MMKV;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class UIManagerConstantsCache {
    private static final UIManagerConstantsCache INSTANCE = new UIManagerConstantsCache();
    private static final String MMKV_KEY_BUBBLING = "UIManagerModuleBubbling_v1";
    private static final String MMKV_KEY_CONSTANTS = "UIManagerModuleConstants_v1";
    private static final String MMKV_KEY_VERSION = "UIManagerConstantsCacheVersion";
    private static final String TAG = "UIManagerConstantsCache";
    private Map<String, Object> cachedConstants = null;
    private Map<String, Object> cachedBubblingEventsTypes = null;
    private WritableNativeMap cachedNativeMap = null;
    private final CountDownLatch loadLatch = new CountDownLatch(1);
    private volatile boolean initCalled = false;
    private String cacheVersionName = null;

    private UIManagerConstantsCache() {
    }

    public static UIManagerConstantsCache getInstance() {
        return INSTANCE;
    }

    private static List<Object> jsonArrayToList(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < jSONArray.length(); i7++) {
            Object obj = jSONArray.get(i7);
            if (obj == JSONObject.NULL) {
                arrayList.add(null);
            } else if ((obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof String)) {
                arrayList.add(obj);
            } else if (obj instanceof JSONObject) {
                arrayList.add(jsonToMap((JSONObject) obj));
            } else {
                if (!(obj instanceof JSONArray)) {
                    StringBuilder sbS = e.s(i7, "Unsupported JSON array element at index ", ": ");
                    sbS.append(obj.getClass());
                    throw new JSONException(sbS.toString());
                }
                arrayList.add(jsonArrayToList((JSONArray) obj));
            }
        }
        return arrayList;
    }

    private static Map<String, Object> jsonToMap(JSONObject jSONObject) throws JSONException {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (obj == JSONObject.NULL) {
                map.put(next, null);
            } else if ((obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof String)) {
                map.put(next, obj);
            } else if (obj instanceof JSONObject) {
                map.put(next, jsonToMap((JSONObject) obj));
            } else {
                if (!(obj instanceof JSONArray)) {
                    StringBuilder sbN = com.discord.chat.presentation.list.a.n("Unsupported JSON type in UIManager constants for key \"", next, "\": ");
                    sbN.append(obj.getClass());
                    throw new JSONException(sbN.toString());
                }
                map.put(next, jsonArrayToList((JSONArray) obj));
            }
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$0(String str) {
        try {
            MMKV mmkvB = MMKV.b();
            String strA = mmkvB.a(MMKV_KEY_VERSION);
            if (strA == null || !strA.equals(str)) {
                Log.w(TAG, "UIManagerConstantsCache version mismatch! Expected: " + str + ", found: " + strA + ". Will regenerate constants and bubblingEventTypes.");
                mmkvB.e(MMKV_KEY_CONSTANTS);
                mmkvB.e(MMKV_KEY_BUBBLING);
            } else {
                Log.v(TAG, "UIManagerConstantsCache version matches: " + str);
            }
            String strA2 = mmkvB.a(MMKV_KEY_CONSTANTS);
            int size = 0;
            if (strA2 != null) {
                try {
                    Map<String, Object> mapJsonToMap = jsonToMap(new JSONObject(strA2));
                    synchronized (this) {
                        this.cachedConstants = mapJsonToMap;
                    }
                    StringBuilder sb2 = new StringBuilder("Background-loaded full UIManager constants (size=");
                    sb2.append(mapJsonToMap == null ? 0 : mapJsonToMap.size());
                    sb2.append(")");
                    Log.v(TAG, sb2.toString());
                } catch (JSONException e10) {
                    Log.w(TAG, "Invalid JSON in MMKV (constants). Will regenerate.\n" + strA2, e10);
                    synchronized (this) {
                        this.cachedConstants = null;
                    }
                }
            } else {
                synchronized (this) {
                    this.cachedConstants = null;
                }
                Log.v(TAG, "No UIManager constants found in MMKV.");
            }
            String strA3 = mmkvB.a(MMKV_KEY_BUBBLING);
            if (strA3 != null) {
                try {
                    Map<String, Object> mapJsonToMap2 = jsonToMap(new JSONObject(strA3));
                    synchronized (this) {
                        this.cachedBubblingEventsTypes = mapJsonToMap2;
                    }
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Background-loaded bubblingEventTypes (size=");
                    if (mapJsonToMap2 != null) {
                        size = mapJsonToMap2.size();
                    }
                    sb3.append(size);
                    sb3.append(")");
                    Log.v(TAG, sb3.toString());
                } catch (JSONException e11) {
                    Log.w(TAG, "Invalid JSON in MMKV (bubblingEventTypes). Will regenerate.\n" + strA3, e11);
                    synchronized (this) {
                        this.cachedBubblingEventsTypes = null;
                    }
                }
            } else {
                synchronized (this) {
                    this.cachedBubblingEventsTypes = null;
                }
                Log.v(TAG, "No bubblingEventTypes found in MMKV.");
            }
            synchronized (this) {
                try {
                    Map<String, Object> map = this.cachedConstants;
                    if (map != null) {
                        this.cachedNativeMap = Arguments.makeNativeMap((Map<String, ? extends Object>) map);
                    } else {
                        this.cachedNativeMap = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.loadLatch.countDown();
        } catch (Throwable th3) {
            this.loadLatch.countDown();
            throw th3;
        }
    }

    private static JSONArray listToJsonArray(List<Object> list) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : list) {
            if (obj == null) {
                jSONArray.put(JSONObject.NULL);
            } else if (obj instanceof String) {
                jSONArray.put((String) obj);
            } else if (obj instanceof Boolean) {
                jSONArray.put((Boolean) obj);
            } else if (obj instanceof Number) {
                jSONArray.put((Number) obj);
            } else if (obj instanceof Map) {
                jSONArray.put(mapToJson((Map) obj));
            } else {
                if (!(obj instanceof List)) {
                    throw new JSONException("Unsupported list element type: " + obj.getClass());
                }
                jSONArray.put(listToJsonArray((List) obj));
            }
        }
        return jSONArray;
    }

    private static JSONObject mapToJson(Map<String, Object> map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                jSONObject.put(key, JSONObject.NULL);
            } else if (value instanceof String) {
                jSONObject.put(key, (String) value);
            } else if (value instanceof Boolean) {
                jSONObject.put(key, (Boolean) value);
            } else if (value instanceof Number) {
                jSONObject.put(key, (Number) value);
            } else if (value instanceof Map) {
                jSONObject.put(key, mapToJson((Map) value));
            } else {
                if (!(value instanceof List)) {
                    StringBuilder sbN = com.discord.chat.presentation.list.a.n("Unsupported value type for key \"", key, "\": ");
                    sbN.append(value.getClass());
                    throw new JSONException(sbN.toString());
                }
                jSONObject.put(key, listToJsonArray((List) value));
            }
        }
        return jSONObject;
    }

    public Map<String, Object> getCachedBubblingEventsTypes() {
        Map<String, Object> map;
        try {
            this.loadLatch.await();
            synchronized (this) {
                map = this.cachedBubblingEventsTypes;
            }
            return map;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            Log.w(TAG, "getCachedBubblingEventsTypes() interrupted while waiting.");
            return null;
        }
    }

    public Map<String, Object> getCachedConstants() {
        Map<String, Object> map;
        try {
            this.loadLatch.await();
            synchronized (this) {
                map = this.cachedConstants;
            }
            return map;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            Log.w(TAG, "getCachedConstants() interrupted while waiting.");
            return null;
        }
    }

    public WritableNativeMap getUIManagerConstantsAsWritableMap() {
        WritableNativeMap writableNativeMap;
        try {
            this.loadLatch.await();
            synchronized (this) {
                writableNativeMap = this.cachedNativeMap;
            }
            return writableNativeMap;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            Log.w(TAG, "getUIManagerConstantsAsWritableMap() interrupted while waiting.");
            return null;
        }
    }

    public synchronized void init(Context context) {
        try {
            if (this.initCalled) {
                return;
            }
            this.initCalled = true;
            try {
                this.cacheVersionName = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.cacheVersionName);
                sb2.append("-");
                sb2.append(ReactNativeFeatureFlags.enableFabricRenderer() ? "Fabric" : "NonFabric");
                this.cacheVersionName = sb2.toString();
                MMKV.d(context.getApplicationContext());
                new Thread(new k(26, this, this.cacheVersionName), "UIManagerConstantsCache-Loader").start();
            } catch (PackageManager.NameNotFoundException e10) {
                Log.e(TAG, "Failed to get app version name; continuing without caching!", e10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void saveConstantsAndBubblingEventsTypes(Map<String, Object> map, Map<String, Object> map2) {
        if (map == null) {
            return;
        }
        if (this.cacheVersionName == null) {
            throw new IllegalStateException("UIManagerConstantsCache not initialized! Call init(...) first.");
        }
        try {
            JSONObject jSONObjectMapToJson = mapToJson(map);
            long jCurrentTimeMillis = System.currentTimeMillis();
            MMKV.b().c(MMKV_KEY_CONSTANTS, jSONObjectMapToJson.toString());
            Log.v(TAG, "Saved UIManager constants to MMKV in " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms");
        } catch (JSONException e10) {
            Log.e(TAG, "Failed to JSON-serialize UIManager constants; not caching.", e10);
        }
        if (map2 != null) {
            try {
                JSONObject jSONObjectMapToJson2 = mapToJson(map2);
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                MMKV.b().c(MMKV_KEY_BUBBLING, jSONObjectMapToJson2.toString());
                Log.v(TAG, "Saved bubblingEventTypes to MMKV in " + (System.currentTimeMillis() - jCurrentTimeMillis2) + "ms");
            } catch (JSONException e11) {
                Log.e(TAG, "Failed to JSON-serialize bubblingEventTypes; not caching.", e11);
            }
        }
        MMKV.b().c(MMKV_KEY_VERSION, this.cacheVersionName);
    }
}
