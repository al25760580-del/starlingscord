package com.discord.react_asset_fetcher;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.webkit.URLUtil;
import ar.b0;
import ar.k0;
import com.discord.misc.utilities.coroutines.CoroutineViewUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.react.views.imagehelper.ImageSource;
import com.facebook.react.views.imagehelper.ResourceDrawableIdHelper;
import com.google.android.material.button.MaterialButton;
import hr.e;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import wn.a;
import xn.d;
import xn.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001\u001a\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u001a\u0014\u0010\u0006\u001a\u00020\u0007*\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u001a\u0012\u0010\t\u001a\u00020\u0007*\u00020\b2\u0006\u0010\n\u001a\u00020\u000b\u001a\u0012\u0010\f\u001a\u00020\u0007*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0001\u001a\u001c\u0010\r\u001a\u00020\u0007*\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00012\b\b\u0001\u0010\u000f\u001a\u00020\u0010¨\u0006\u0011"}, d2 = {"getReactImageUrl", "", "Landroid/content/Context;", "assetUrl", "inflateUrl", "url", "setOptionalReactImageUrl", "", "Lcom/facebook/drawee/view/SimpleDraweeView;", "setReactAsset", "asset", "Lcom/discord/react_asset_fetcher/ReactAsset;", "setReactImageUrl", "setReactIcon", "Lcom/google/android/material/button/MaterialButton;", "iconSize", "", "react_asset_fetcher_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ReactAssetUtilsKt {

    /* JADX INFO: renamed from: com.discord.react_asset_fetcher.ReactAssetUtilsKt$setReactIcon$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @d(c = "com.discord.react_asset_fetcher.ReactAssetUtilsKt$setReactIcon$2", f = "ReactAssetUtils.kt", l = {72}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ String $assetUrl;
        final /* synthetic */ MaterialButton $this_setReactIcon;
        Object L$0;
        int label;

        /* JADX INFO: renamed from: com.discord.react_asset_fetcher.ReactAssetUtilsKt$setReactIcon$2$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/Drawable;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @d(c = "com.discord.react_asset_fetcher.ReactAssetUtilsKt$setReactIcon$2$1", f = "ReactAssetUtils.kt", l = {}, m = "invokeSuspend")
        @SourceDebugExtension({"SMAP\nReactAssetUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactAssetUtils.kt\ncom/discord/react_asset_fetcher/ReactAssetUtilsKt$setReactIcon$2$1\n+ 2 BitmapDrawable.kt\nandroidx/core/graphics/drawable/BitmapDrawableKt\n*L\n1#1,93:1\n27#2:94\n*S KotlinDebug\n*F\n+ 1 ReactAssetUtils.kt\ncom/discord/react_asset_fetcher/ReactAssetUtilsKt$setReactIcon$2$1\n*L\n86#1:94\n*E\n"})
        public static final class AnonymousClass1 extends h implements Function2<CoroutineScope, Continuation, Object> {
            final /* synthetic */ String $assetUrl;
            final /* synthetic */ MaterialButton $this_setReactIcon;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(MaterialButton materialButton, String str, Continuation continuation) {
                super(2, continuation);
                this.$this_setReactIcon = materialButton;
                this.$assetUrl = str;
            }

            @Override // xn.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass1(this.$this_setReactIcon, this.$assetUrl, continuation);
            }

            @Override // xn.a
            public final Object invokeSuspend(Object obj) throws IOException {
                a aVar = a.f22354d;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
                Context context = this.$this_setReactIcon.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                ImageSource imageSource = new ImageSource(context, this.$assetUrl, 0.0d, 0.0d, null, false, 60, null);
                MaterialButton materialButton = this.$this_setReactIcon;
                if (imageSource.get_isResource()) {
                    ResourceDrawableIdHelper.getInstance();
                    Context context2 = materialButton.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    Drawable resourceDrawable = ResourceDrawableIdHelper.getResourceDrawable(context2, imageSource.getSource());
                    Intrinsics.checkNotNull(resourceDrawable);
                    return resourceDrawable;
                }
                if (Intrinsics.areEqual(imageSource.getUri().getScheme(), "file")) {
                    Drawable drawableCreateFromPath = Drawable.createFromPath(imageSource.getUri().getPath());
                    Intrinsics.checkNotNull(drawableCreateFromPath);
                    return drawableCreateFromPath;
                }
                URLConnection uRLConnectionOpenConnection = new URL(imageSource.getSource()).openConnection();
                Intrinsics.checkNotNull(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                httpURLConnection.connect();
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(httpURLConnection.getInputStream());
                Intrinsics.checkNotNull(bitmapDecodeStream);
                Resources resources = materialButton.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                return new BitmapDrawable(resources, bitmapDecodeStream);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(MaterialButton materialButton, String str, Continuation continuation) {
            super(2, continuation);
            this.$this_setReactIcon = materialButton;
            this.$assetUrl = str;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.$this_setReactIcon, this.$assetUrl, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            MaterialButton materialButton;
            a aVar = a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                MaterialButton materialButton2 = this.$this_setReactIcon;
                e eVar = k0.f2938a;
                hr.d dVar = hr.d.f11103i;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(materialButton2, this.$assetUrl, null);
                this.L$0 = materialButton2;
                this.label = 1;
                Object objA = b0.A(dVar, anonymousClass1, this);
                if (objA == aVar) {
                    return aVar;
                }
                materialButton = materialButton2;
                obj = objA;
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                materialButton = (MaterialButton) this.L$0;
                ib.a.L(obj);
            }
            materialButton.setIcon((Drawable) obj);
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    @NotNull
    public static final String getReactImageUrl(@NotNull Context context, @NotNull String assetUrl) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(assetUrl, "assetUrl");
        String string = new ImageSource(context, assetUrl, 0.0d, 0.0d, null, false, 60, null).getUri().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static final String inflateUrl(@NotNull Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (str == null) {
            return null;
        }
        return URLUtil.isNetworkUrl(str) ? str : getReactImageUrl(context, str);
    }

    public static final void setOptionalReactImageUrl(@NotNull SimpleDraweeView simpleDraweeView, String str) {
        Intrinsics.checkNotNullParameter(simpleDraweeView, "<this>");
        if (str == null || StringsKt.K(str)) {
            simpleDraweeView.setVisibility(8);
            simpleDraweeView.setImageURI((String) null);
        } else {
            simpleDraweeView.setVisibility(0);
            setReactImageUrl(simpleDraweeView, str);
        }
    }

    public static final void setReactAsset(@NotNull SimpleDraweeView simpleDraweeView, @NotNull ReactAsset asset) {
        Intrinsics.checkNotNullParameter(simpleDraweeView, "<this>");
        Intrinsics.checkNotNullParameter(asset, "asset");
        Context context = simpleDraweeView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setReactImageUrl(simpleDraweeView, ReactAssetExtensionsKt.getUri(asset, context));
    }

    public static final void setReactIcon(@NotNull MaterialButton materialButton, @NotNull String assetUrl, int i7) {
        Intrinsics.checkNotNullParameter(materialButton, "<this>");
        Intrinsics.checkNotNullParameter(assetUrl, "assetUrl");
        materialButton.setIconSize(i7);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.getPaint().setColor(0);
        materialButton.setIcon(shapeDrawable);
        b0.t(CoroutineViewUtilsKt.getAttachedScope(materialButton), null, new AnonymousClass2(materialButton, assetUrl, null), 3);
    }

    public static final void setReactImageUrl(@NotNull SimpleDraweeView simpleDraweeView, @NotNull String assetUrl) {
        Intrinsics.checkNotNullParameter(simpleDraweeView, "<this>");
        Intrinsics.checkNotNullParameter(assetUrl, "assetUrl");
        Context context = simpleDraweeView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        simpleDraweeView.setImageURI(getReactImageUrl(context, assetUrl));
    }
}
