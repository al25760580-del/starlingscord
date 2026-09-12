package com.horcrux.svg;

import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class o1 implements ReactModuleInfoProvider {
    @Override // com.facebook.react.module.model.ReactModuleInfoProvider
    public final Map getReactModuleInfos() {
        HashMap map = new HashMap();
        Class[] clsArr = {SvgViewModule.class, RNSVGRenderableManager.class};
        for (int i7 = 0; i7 < 2; i7++) {
            Class cls = clsArr[i7];
            ReactModule reactModule = (ReactModule) cls.getAnnotation(ReactModule.class);
            map.put(reactModule.name(), new ReactModuleInfo(reactModule.name(), cls.getName(), reactModule.canOverrideExistingModule(), reactModule.needsEagerInit(), reactModule.isCxxModule(), true));
        }
        return map;
    }
}
