package com.discord.device;

import android.os.LocaleList;
import com.discord.codegen.NativeDeviceLocaleModuleSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007H\u0014¨\u0006\n"}, d2 = {"Lcom/discord/device/DeviceLocaleModule;", "Lcom/discord/codegen/NativeDeviceLocaleModuleSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getTypedExportedConstants", "", "", "", "device_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DeviceLocaleModule extends NativeDeviceLocaleModuleSpec {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceLocaleModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    @Override // com.discord.codegen.NativeDeviceLocaleModuleSpec
    @NotNull
    public Map<String, Object> getTypedExportedConstants() {
        ArrayList arrayList = new ArrayList();
        LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
        Intrinsics.checkNotNullExpressionValue(adjustedDefault, "getAdjustedDefault(...)");
        int size = adjustedDefault.size();
        int i7 = 10;
        for (int i10 = 0; i10 < size; i10++) {
            String languageTag = adjustedDefault.get(i10).toLanguageTag();
            if (i10 == 0) {
                Intrinsics.checkNotNull(languageTag);
                arrayList.add(languageTag);
            } else {
                arrayList.add(languageTag + ";q=0." + i7);
            }
            i7--;
            if (1 >= i7) {
                i7 = 1;
            }
        }
        CollectionsKt.O(arrayList, ",", null, null, null, 62);
        return w0.h(new Pair("Language", CollectionsKt.K(arrayList)), new Pair("Languages", arrayList));
    }
}
