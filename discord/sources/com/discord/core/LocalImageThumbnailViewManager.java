package com.discord.core;

import android.net.Uri;
import com.discord.logging.Log;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.viewmanagers.DCDLocalImageThumbnailManagerDelegate;
import com.facebook.react.viewmanagers.DCDLocalImageThumbnailManagerInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u001bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000f\u001a\u001e\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00000\u00000\u0007H\u0014J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0014J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0002H\u0016J\u001a\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016R*\u0010\u0006\u001a\u001e\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00000\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\rR\u0012\u0010\u000e\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/discord/core/LocalImageThumbnailViewManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/discord/core/LocalImageThumbnailView;", "Lcom/facebook/react/viewmanagers/DCDLocalImageThumbnailManagerInterface;", "<init>", "()V", "mDelegate", "Lcom/facebook/react/viewmanagers/DCDLocalImageThumbnailManagerDelegate;", "kotlin.jvm.PlatformType", "lastUri", "Landroid/net/Uri;", "lastWidthDp", "", "Ljava/lang/Integer;", "lastHeightDp", "getDelegate", "getName", "", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "onDropViewInstance", "", "view", "setLocalImageSource", "source", "Lcom/facebook/react/bridge/ReadableMap;", "Companion", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@ReactModule(name = LocalImageThumbnailViewManager.NAME)
@SourceDebugExtension({"SMAP\nLocalImageThumbnailViewManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalImageThumbnailViewManager.kt\ncom/discord/core/LocalImageThumbnailViewManager\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,69:1\n29#2:70\n*S KotlinDebug\n*F\n+ 1 LocalImageThumbnailViewManager.kt\ncom/discord/core/LocalImageThumbnailViewManager\n*L\n44#1:70\n*E\n"})
public final class LocalImageThumbnailViewManager extends SimpleViewManager<LocalImageThumbnailView> implements DCDLocalImageThumbnailManagerInterface<LocalImageThumbnailView> {

    @NotNull
    public static final String NAME = "DCDLocalImageThumbnail";
    private Integer lastHeightDp;
    private Uri lastUri;
    private Integer lastWidthDp;

    @NotNull
    private final DCDLocalImageThumbnailManagerDelegate<LocalImageThumbnailView, LocalImageThumbnailViewManager> mDelegate = new DCDLocalImageThumbnailManagerDelegate<>(this);

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public LocalImageThumbnailView createViewInstance(@NotNull ThemedReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return new LocalImageThumbnailView(reactContext, null, 0, 6, null);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public DCDLocalImageThumbnailManagerDelegate<LocalImageThumbnailView, LocalImageThumbnailViewManager> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(@NotNull LocalImageThumbnailView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onDropViewInstance(view);
        this.lastUri = null;
        this.lastWidthDp = null;
        this.lastHeightDp = null;
    }

    @Override // com.facebook.react.viewmanagers.DCDLocalImageThumbnailManagerInterface
    public void setLocalImageSource(@NotNull LocalImageThumbnailView view, ReadableMap source) {
        String string;
        Uri uri;
        Integer num;
        Integer num2;
        Intrinsics.checkNotNullParameter(view, "view");
        if (source == null || (string = source.getString("uri")) == null || (uri = Uri.parse(string)) == null) {
            return;
        }
        int i7 = (int) source.getDouble("width");
        int i10 = (int) source.getDouble("height");
        if (!Intrinsics.areEqual(this.lastUri, uri) || (num = this.lastWidthDp) == null || num.intValue() != i7 || (num2 = this.lastHeightDp) == null || num2.intValue() != i10) {
            this.lastUri = uri;
            this.lastWidthDp = Integer.valueOf(i7);
            this.lastHeightDp = Integer.valueOf(i10);
            view.setLocalImageSource(uri, i7, i10);
            return;
        }
        Log.i$default(Log.INSTANCE, "LocalImageThumbnailViewManager", "🚫 DUPLICATE PROPS - Skipping duplicate request for URI: " + uri + " - Size: " + i7 + "x" + i10, (Throwable) null, 4, (Object) null);
    }
}
