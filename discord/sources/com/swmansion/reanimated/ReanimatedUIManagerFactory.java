package com.swmansion.reanimated;

import android.util.Log;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ReanimatedUIImplementation;
import com.facebook.react.uimanager.ReanimatedUIManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.ViewManagerRegistry;
import java.lang.reflect.Field;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class ReanimatedUIManagerFactory {
    public static UIManagerModule create(ReactApplicationContext reactApplicationContext, List<ViewManager> list, int i7) {
        ViewManagerRegistry viewManagerRegistry = new ViewManagerRegistry(list);
        ReanimatedUIManager reanimatedUIManager = new ReanimatedUIManager(reactApplicationContext, list, i7);
        ReanimatedUIImplementation reanimatedUIImplementation = new ReanimatedUIImplementation(reactApplicationContext, viewManagerRegistry, reanimatedUIManager.getEventDispatcher(), i7);
        Class superclass = ReanimatedUIManager.class.getSuperclass();
        if (superclass == null) {
            Log.e("reanimated", "unable to resolve super class of ReanimatedUIManager");
            return reanimatedUIManager;
        }
        try {
            Field declaredField = superclass.getDeclaredField("mUIImplementation");
            declaredField.setAccessible(true);
            try {
                Field declaredField2 = Field.class.getDeclaredField("accessFlags");
                declaredField2.setAccessible(true);
                declaredField2.setInt(declaredField, declaredField.getModifiers() & (-17));
            } catch (IllegalAccessException | NoSuchFieldException e10) {
                e10.printStackTrace();
            }
            declaredField.set(reanimatedUIManager, reanimatedUIImplementation);
        } catch (IllegalAccessException | NoSuchFieldException e11) {
            e11.printStackTrace();
        }
        return reanimatedUIManager;
    }
}
