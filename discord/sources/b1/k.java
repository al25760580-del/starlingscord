package b1;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.react.common.assets.ReactFontManager;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class k extends gn.h {
    public static Font T(FontFamily fontFamily, int i7) {
        FontStyle fontStyle = new FontStyle((i7 & 1) != 0 ? ReactFontManager.TypefaceStyle.BOLD : ReactFontManager.TypefaceStyle.NORMAL, (i7 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iW = W(fontStyle, font.getStyle());
        for (int i10 = 1; i10 < fontFamily.getSize(); i10++) {
            Font font2 = fontFamily.getFont(i10);
            int iW2 = W(fontStyle, font2.getStyle());
            if (iW2 < iW) {
                font = font2;
                iW = iW2;
            }
        }
        return font;
    }

    public static int W(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    public final FontFamily U(i1.h[] hVarArr, ContentResolver contentResolver) {
        Font fontBuild;
        FontFamily.Builder builder = null;
        for (i1.h hVar : hVarArr) {
            if (Objects.equals(hVar.f11374a.getScheme(), "systemfont")) {
                fontBuild = V(hVar);
            } else {
                try {
                    Uri uri = hVar.f11374a;
                    String str = hVar.f11378e;
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor == null) {
                        if (parcelFileDescriptorOpenFileDescriptor != null) {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        }
                        fontBuild = null;
                    } else {
                        try {
                            Font.Builder ttcIndex = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(hVar.f11376c).setSlant(hVar.f11377d ? 1 : 0).setTtcIndex(hVar.f11375b);
                            if (!TextUtils.isEmpty(str)) {
                                ttcIndex.setFontVariationSettings(str);
                            }
                            fontBuild = ttcIndex.build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th2) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    }
                } catch (IOException e10) {
                    Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
                }
            }
            if (fontBuild != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(fontBuild);
                } else {
                    builder.addFont(fontBuild);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public Font V(i1.h hVar) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }

    @Override // gn.h
    public final Typeface o(Context context, a1.f fVar, Resources resources, int i7) {
        try {
            FontFamily.Builder builder = null;
            for (a1.g gVar : fVar.f20a) {
                try {
                    Font fontBuild = new Font.Builder(resources, gVar.f26f).setWeight(gVar.f22b).setSlant(gVar.f23c ? 1 : 0).setTtcIndex(gVar.f25e).setFontVariationSettings(gVar.f24d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(T(fontFamilyBuild, i7).getStyle()).build();
        } catch (Exception e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    @Override // gn.h
    public final Typeface p(Context context, i1.h[] hVarArr, int i7) {
        try {
            FontFamily fontFamilyU = U(hVarArr, context.getContentResolver());
            if (fontFamilyU == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(fontFamilyU).setStyle(T(fontFamilyU, i7).getStyle()).build();
        } catch (Exception e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    @Override // gn.h
    public final Typeface q(Context context, List list, int i7) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyU = U((i1.h[]) list.get(0), contentResolver);
            if (fontFamilyU == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyU);
            for (int i10 = 1; i10 < list.size(); i10++) {
                FontFamily fontFamilyU2 = U((i1.h[]) list.get(i10), contentResolver);
                if (fontFamilyU2 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyU2);
                }
            }
            return customFallbackBuilder.setStyle(T(fontFamilyU, i7).getStyle()).build();
        } catch (Exception e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    @Override // gn.h
    public final Typeface r(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // gn.h
    public final Typeface s(Context context, Resources resources, int i7, String str, int i10) {
        try {
            Font fontBuild = new Font.Builder(resources, i7).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    @Override // gn.h
    public final i1.h w(i1.h[] hVarArr, int i7) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
