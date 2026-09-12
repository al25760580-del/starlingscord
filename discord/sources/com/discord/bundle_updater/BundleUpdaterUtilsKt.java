package com.discord.bundle_updater;

import android.content.res.AssetManager;
import ar.u;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import ls.d;
import ls.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0014\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\t"}, d2 = {"json", "Lkotlinx/serialization/json/Json;", "getJson", "()Lkotlinx/serialization/json/Json;", "getManifestFromAsset", "Lcom/discord/bundle_updater/AppManifest;", "Landroid/content/res/AssetManager;", "asset", "", "bundle_updater_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBundleUpdaterUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BundleUpdaterUtils.kt\ncom/discord/bundle_updater/BundleUpdaterUtilsKt\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,81:1\n147#2:82\n*S KotlinDebug\n*F\n+ 1 BundleUpdaterUtils.kt\ncom/discord/bundle_updater/BundleUpdaterUtilsKt\n*L\n47#1:82\n*E\n"})
public final class BundleUpdaterUtilsKt {

    @NotNull
    private static final Json json = d.e(new u(21));

    @NotNull
    public static final Json getJson() {
        return json;
    }

    @NotNull
    public static final AppManifest getManifestFromAsset(@NotNull AssetManager assetManager, @NotNull String asset) throws IOException {
        Intrinsics.checkNotNullParameter(assetManager, "<this>");
        Intrinsics.checkNotNullParameter(asset, "asset");
        InputStream inputStreamOpen = assetManager.open(asset);
        Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "open(...)");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, Charsets.UTF_8), 8192);
        try {
            Json json2 = json;
            String strW = l.w(bufferedReader);
            json2.getClass();
            AppManifest appManifest = (AppManifest) json2.b(AppManifest.INSTANCE.serializer(), strW);
            bufferedReader.close();
            return appManifest;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                d.k(bufferedReader, th2);
                throw th3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit json$lambda$0(JsonBuilder Json) {
        Intrinsics.checkNotNullParameter(Json, "$this$Json");
        Json.f14765b = true;
        return Unit.f14616a;
    }
}
