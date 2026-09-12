package com.swmansion.reanimated;

import android.util.Log;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.uimanager.UIManagerHelper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
class ReaCompatibility {
    private FabricUIManager fabricUIManager;
    private Object mountingManager;
    private Method updatePropsSynchronouslyMethod;

    public ReaCompatibility(ReactApplicationContext reactApplicationContext) {
        this.fabricUIManager = (FabricUIManager) UIManagerHelper.getUIManager(reactApplicationContext, 2);
    }

    private Object getMountingManager() {
        if (this.mountingManager == null && this.fabricUIManager != null) {
            try {
                Field declaredField = FabricUIManager.class.getDeclaredField("mMountingManager");
                declaredField.setAccessible(true);
                this.mountingManager = declaredField.get(this.fabricUIManager);
            } catch (Exception e10) {
                Log.w("Reanimated", "Unable to resolve MountingManager via reflection", e10);
            }
        }
        return this.mountingManager;
    }

    private Method getUpdatePropsSynchronouslyMethod(Object obj) {
        if (this.updatePropsSynchronouslyMethod == null && obj != null) {
            for (Method method : obj.getClass().getMethods()) {
                if (method.getName().startsWith("updatePropsSynchronously") && method.getParameterTypes().length == 2) {
                    method.setAccessible(true);
                    this.updatePropsSynchronouslyMethod = method;
                    break;
                }
            }
        }
        return this.updatePropsSynchronouslyMethod;
    }

    public void registerFabricEventListener(NodesManager nodesManager) {
        FabricUIManager fabricUIManager = this.fabricUIManager;
        if (fabricUIManager != null) {
            fabricUIManager.getEventDispatcher().addListener(nodesManager);
        }
    }

    public void synchronouslyUpdateUIProps(int i7, ReadableMap readableMap) {
        if (this.fabricUIManager == null) {
            return;
        }
        Object mountingManager = getMountingManager();
        Method updatePropsSynchronouslyMethod = getUpdatePropsSynchronouslyMethod(mountingManager);
        if (mountingManager == null || updatePropsSynchronouslyMethod == null) {
            this.fabricUIManager.synchronouslyUpdateViewOnUIThread(i7, readableMap);
            return;
        }
        try {
            updatePropsSynchronouslyMethod.invoke(mountingManager, Integer.valueOf(i7), readableMap);
        } catch (Exception e10) {
            Log.w("Reanimated", "synchronouslyUpdateUIProps failed for tag " + i7, e10);
        }
    }

    public void unregisterFabricEventListener(NodesManager nodesManager) {
        FabricUIManager fabricUIManager = this.fabricUIManager;
        if (fabricUIManager != null) {
            fabricUIManager.getEventDispatcher().removeListener(nodesManager);
        }
    }
}
