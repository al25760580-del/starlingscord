package com.facebook.react;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import com.discord.codegen.RTNCodegenPackage;
import com.discord.kvstorage.KvStoragePackage;
import com.discord.markdown.reactnative.DiscordMarkdownPackage;
import com.discord.reanimatedview.ReanimatedViewPackage;
import com.facebook.react.shell.MainPackageConfig;
import com.facebook.react.shell.MainReactPackage;
import com.horcrux.svg.SvgPackage;
import com.swmansion.reanimated.ReanimatedPackage;
import em.h;
import io.sentry.react.RNSentryPackage;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class PackageList {
    private Application application;
    private MainPackageConfig mConfig;
    private ReactNativeHost reactNativeHost;

    public PackageList(ReactNativeHost reactNativeHost) {
        this(reactNativeHost, (MainPackageConfig) null);
    }

    private Application getApplication() {
        ReactNativeHost reactNativeHost = this.reactNativeHost;
        return reactNativeHost == null ? this.application : reactNativeHost.getApplication();
    }

    private Context getApplicationContext() {
        return getApplication().getApplicationContext();
    }

    private ReactNativeHost getReactNativeHost() {
        return this.reactNativeHost;
    }

    private Resources getResources() {
        return getApplication().getResources();
    }

    public ArrayList<ReactPackage> getPackages() {
        return new ArrayList<>(Arrays.asList(new MainReactPackage(this.mConfig), new f5.a(), new ReanimatedViewPackage(), new DiscordMarkdownPackage(), new KvStoragePackage(), new RTNCodegenPackage(), new jl.b(), new at.a(8), new at.a(9), new bl.c(3), new at.a(1), new h(), new RNSentryPackage(), new at.a(7), new com.mkuczera.haptic.d(1), new at.a(4), new hm.b(), new at.a(0), new com.mkuczera.haptic.d(0), new com.mkuczera.haptic.d(2), new at.a(2), new bl.c(4), new at.a(6), new bl.c(5), new at.a(11), new bl.c(0), new com.margelo.nitro.playagerangedeclaration.f(), new ReanimatedPackage(), new at.a(5), new bl.c(2), new bl.c(1), new SvgPackage(), new at.a(10), new at.a(3)));
    }

    public PackageList(Application application) {
        this(application, (MainPackageConfig) null);
    }

    public PackageList(ReactNativeHost reactNativeHost, MainPackageConfig mainPackageConfig) {
        this.reactNativeHost = reactNativeHost;
        this.mConfig = mainPackageConfig;
    }

    public PackageList(Application application, MainPackageConfig mainPackageConfig) {
        this.reactNativeHost = null;
        this.application = application;
        this.mConfig = mainPackageConfig;
    }
}
