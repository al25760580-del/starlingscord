package com.discord.react.utilities;

import com.discord.react.utilities.ReactModuleInfoProviderExtensionsKt;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.c0;
import kotlin.collections.e0;
import kotlin.collections.n0;
import kotlin.collections.v0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0000\u001a\u00020\u00012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u001a\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u000b"}, d2 = {"createReactModuleInfoProvider", "Lcom/facebook/react/module/model/ReactModuleInfoProvider;", "moduleNames", "", "", "needsEagerInit", "", "moduleName", "createReactModuleInfo", "Lcom/facebook/react/module/model/ReactModuleInfo;", "reactModuleName", "react_utilities_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReactModuleInfoProviderExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactModuleInfoProviderExtensions.kt\ncom/discord/react/utilities/ReactModuleInfoProviderExtensionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,32:1\n1285#2,2:33\n1299#2,4:35\n*S KotlinDebug\n*F\n+ 1 ReactModuleInfoProviderExtensions.kt\ncom/discord/react/utilities/ReactModuleInfoProviderExtensionsKt\n*L\n10#1:33,2\n10#1:35,4\n*E\n"})
public final class ReactModuleInfoProviderExtensionsKt {
    @NotNull
    public static final ReactModuleInfo createReactModuleInfo(@NotNull String reactModuleName, boolean z5) {
        Intrinsics.checkNotNullParameter(reactModuleName, "reactModuleName");
        return new ReactModuleInfo(reactModuleName, reactModuleName, false, z5, false, true);
    }

    @NotNull
    public static final ReactModuleInfoProvider createReactModuleInfoProvider(@NotNull final List<String> moduleNames, final boolean z5) {
        Intrinsics.checkNotNullParameter(moduleNames, "moduleNames");
        return new ReactModuleInfoProvider() { // from class: n7.a
            @Override // com.facebook.react.module.model.ReactModuleInfoProvider
            public final Map getReactModuleInfos() {
                return ReactModuleInfoProviderExtensionsKt.createReactModuleInfoProvider$lambda$1(moduleNames, z5);
            }
        };
    }

    public static /* synthetic */ ReactModuleInfoProvider createReactModuleInfoProvider$default(String str, boolean z5, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z5 = false;
        }
        return createReactModuleInfoProvider(str, z5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map createReactModuleInfoProvider$lambda$1(List list, boolean z5) {
        int iA = v0.a(e0.l(list, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (Object obj : list) {
            linkedHashMap.put(obj, createReactModuleInfo((String) obj, z5));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final ReactModuleInfoProvider createReactModuleInfoProvider(@NotNull String moduleName, boolean z5) {
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        return createReactModuleInfoProvider((List<String>) c0.c(moduleName), z5);
    }

    public static ReactModuleInfoProvider createReactModuleInfoProvider$default(List list, boolean z5, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            list = n0.f14659d;
        }
        if ((i7 & 2) != 0) {
            z5 = false;
        }
        return createReactModuleInfoProvider((List<String>) list, z5);
    }
}
