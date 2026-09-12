package com.facebook.react.common.assets;

import android.content.res.AssetManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/facebook/react/common/assets/CreateTypefaceObject;", "", "fontFamilyName", "", "style", "", "assetManager", "Landroid/content/res/AssetManager;", "<init>", "(Ljava/lang/String;ILandroid/content/res/AssetManager;)V", "getFontFamilyName", "()Ljava/lang/String;", "setFontFamilyName", "(Ljava/lang/String;)V", "getStyle", "()I", "setStyle", "(I)V", "getAssetManager", "()Landroid/content/res/AssetManager;", "setAssetManager", "(Landroid/content/res/AssetManager;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CreateTypefaceObject {

    @NotNull
    private AssetManager assetManager;

    @NotNull
    private String fontFamilyName;
    private int style;

    public CreateTypefaceObject(@NotNull String fontFamilyName, int i7, @NotNull AssetManager assetManager) {
        Intrinsics.checkNotNullParameter(fontFamilyName, "fontFamilyName");
        Intrinsics.checkNotNullParameter(assetManager, "assetManager");
        this.fontFamilyName = fontFamilyName;
        this.style = i7;
        this.assetManager = assetManager;
    }

    @NotNull
    public final AssetManager getAssetManager() {
        return this.assetManager;
    }

    @NotNull
    public final String getFontFamilyName() {
        return this.fontFamilyName;
    }

    public final int getStyle() {
        return this.style;
    }

    public final void setAssetManager(@NotNull AssetManager assetManager) {
        Intrinsics.checkNotNullParameter(assetManager, "<set-?>");
        this.assetManager = assetManager;
    }

    public final void setFontFamilyName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.fontFamilyName = str;
    }

    public final void setStyle(int i7) {
        this.style = i7;
    }
}
