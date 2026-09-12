package vd;

import android.app.NotificationChannelGroup;
import android.app.Person;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.Layout;
import com.discord.image.fresco.config.FrescoMemoryCacheExperimentSettingsExtensionsKt;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.react.views.image.ReactImageRequestBuilderHook;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import xc.o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements gc.f, hd.g, ReactImageRequestBuilderHook.Hook, di.e, mi.e {
    public static /* bridge */ /* synthetic */ NotificationChannelGroup d(Object obj) {
        return (NotificationChannelGroup) obj;
    }

    public static /* bridge */ /* synthetic */ Person e(Object obj) {
        return (Person) obj;
    }

    public static /* bridge */ /* synthetic */ ShortcutManager f(Object obj) {
        return (ShortcutManager) obj;
    }

    public static /* bridge */ /* synthetic */ Class g() {
        return ShortcutManager.class;
    }

    @Override // mi.e
    public Object a(zl.e eVar) {
        return FirebaseInstallationsRegistrar.lambda$getComponents$0(eVar);
    }

    @Override // di.e
    public Object apply(Object obj) {
        return (o) obj;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0052  */
    /* JADX WARN: Code duplicated, block: B:41:0x009e  */
    @Override // gc.f
    public gc.g b(Bundle bundle) {
        float f2;
        int i7;
        float f7;
        int i10;
        int i11;
        boolean z5;
        CharSequence charSequence = bundle.getCharSequence(c.P);
        CharSequence charSequence2 = charSequence != null ? charSequence : null;
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(c.Q);
        Layout.Alignment alignment2 = alignment != null ? alignment : null;
        Layout.Alignment alignment3 = (Layout.Alignment) bundle.getSerializable(c.R);
        Layout.Alignment alignment4 = alignment3 != null ? alignment3 : null;
        Bitmap bitmap = (Bitmap) bundle.getParcelable(c.S);
        Bitmap bitmap2 = bitmap != null ? bitmap : null;
        String str = c.T;
        if (bundle.containsKey(str)) {
            String str2 = c.U;
            if (bundle.containsKey(str2)) {
                f2 = bundle.getFloat(str);
                i7 = bundle.getInt(str2);
            } else {
                f2 = -3.4028235E38f;
                i7 = Integer.MIN_VALUE;
            }
        } else {
            f2 = -3.4028235E38f;
            i7 = Integer.MIN_VALUE;
        }
        String str3 = c.V;
        int i12 = bundle.containsKey(str3) ? bundle.getInt(str3) : Integer.MIN_VALUE;
        String str4 = c.W;
        float f10 = bundle.containsKey(str4) ? bundle.getFloat(str4) : -3.4028235E38f;
        String str5 = c.X;
        int i13 = bundle.containsKey(str5) ? bundle.getInt(str5) : Integer.MIN_VALUE;
        String str6 = c.Z;
        if (bundle.containsKey(str6)) {
            String str7 = c.Y;
            if (bundle.containsKey(str7)) {
                float f11 = bundle.getFloat(str6);
                i10 = bundle.getInt(str7);
                f7 = f11;
            } else {
                f7 = -3.4028235E38f;
                i10 = Integer.MIN_VALUE;
            }
        } else {
            f7 = -3.4028235E38f;
            i10 = Integer.MIN_VALUE;
        }
        String str8 = c.a0;
        float f12 = bundle.containsKey(str8) ? bundle.getFloat(str8) : -3.4028235E38f;
        String str9 = c.f21633b0;
        float f13 = bundle.containsKey(str9) ? bundle.getFloat(str9) : -3.4028235E38f;
        String str10 = c.f21634c0;
        if (bundle.containsKey(str10)) {
            i11 = bundle.getInt(str10);
            z5 = true;
        } else {
            i11 = -16777216;
            z5 = false;
        }
        int i14 = i11;
        boolean z6 = bundle.getBoolean(c.f21635d0, false) ? z5 : false;
        String str11 = c.f21636e0;
        int i15 = bundle.containsKey(str11) ? bundle.getInt(str11) : Integer.MIN_VALUE;
        String str12 = c.f21637f0;
        return new c(charSequence2, alignment2, alignment4, bitmap2, f2, i7, i12, f10, i13, i10, f7, f12, f13, z6, i14, i15, bundle.containsKey(str12) ? bundle.getFloat(str12) : 0.0f);
    }

    @Override // hd.g
    public boolean c(int i7, int i10, int i11, int i12, int i13) {
        if (i10 == 67 && i11 == 79 && i12 == 77 && (i13 == 77 || i7 == 2)) {
            return true;
        }
        if (i10 == 77 && i11 == 76 && i12 == 76) {
            return i13 == 84 || i7 == 2;
        }
        return false;
    }

    @Override // com.facebook.react.views.image.ReactImageRequestBuilderHook.Hook
    public void apply(Uri uri, ImageRequestBuilder imageRequestBuilder) {
        FrescoMemoryCacheExperimentSettingsExtensionsKt.configureReactImageRequestBuilderHook$lambda$0(uri, imageRequestBuilder);
    }
}
