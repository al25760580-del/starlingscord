package bl;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.LruCache;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.text.ReactTypefaceUtils;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends AppCompatTextView {
    public String E;
    public int F;
    public int G;
    public String H;
    public String I;
    public final Typeface J;
    public Typeface K;
    public boolean L;
    public boolean M;
    public final d N;
    public float O;
    public final d P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f3314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3315e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f3316i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f3317v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f3318w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f3319x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f3320y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v3, types: [bl.d] */
    /* JADX WARN: Type inference failed for: r1v3, types: [bl.d] */
    public e(Context context) {
        super(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f3314d = 14.0f;
        final int i7 = 1;
        this.f3315e = true;
        this.f3317v = Float.NaN;
        this.f3319x = Float.NaN;
        this.F = -1;
        this.G = -1;
        Typeface typeface = getTypeface();
        this.J = typeface;
        this.K = typeface;
        final int i10 = 0;
        this.N = new Runnable(this) { // from class: bl.d

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ e f3313e;

            {
                this.f3313e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        e eVar = this.f3313e;
                        eVar.M = false;
                        if (eVar.isLayoutRequested()) {
                            eVar.measure(View.MeasureSpec.makeMeasureSpec(eVar.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(eVar.getHeight(), 1073741824));
                            eVar.layout(eVar.getLeft(), eVar.getTop(), eVar.getRight(), eVar.getBottom());
                            break;
                        }
                        break;
                    default:
                        float pixelFromSP$default = PixelUtil.toPixelFromSP$default(1.0f, 0.0f, 2, null);
                        e eVar2 = this.f3313e;
                        if (pixelFromSP$default != eVar2.O) {
                            eVar2.O = pixelFromSP$default;
                            eVar2.Q = true;
                            eVar2.T = true;
                            eVar2.d();
                            break;
                        }
                        break;
                }
            }
        };
        float pixelFromSP = 0.0f;
        this.O = PixelUtil.toPixelFromSP$default(1.0f, 0.0f, 2, null);
        this.P = new Runnable(this) { // from class: bl.d

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ e f3313e;

            {
                this.f3313e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        e eVar = this.f3313e;
                        eVar.M = false;
                        if (eVar.isLayoutRequested()) {
                            eVar.measure(View.MeasureSpec.makeMeasureSpec(eVar.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(eVar.getHeight(), 1073741824));
                            eVar.layout(eVar.getLeft(), eVar.getTop(), eVar.getRight(), eVar.getBottom());
                            break;
                        }
                        break;
                    default:
                        float pixelFromSP$default = PixelUtil.toPixelFromSP$default(1.0f, 0.0f, 2, null);
                        e eVar2 = this.f3313e;
                        if (pixelFromSP$default != eVar2.O) {
                            eVar2.O = pixelFromSP$default;
                            eVar2.Q = true;
                            eVar2.T = true;
                            eVar2.d();
                            break;
                        }
                        break;
                }
            }
        };
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        setTextColor(-16777216);
        float f2 = this.f3314d;
        boolean z5 = this.f3315e;
        float f7 = this.f3316i;
        LruCache lruCache = f.f3321a;
        setTextSize(0, (float) Math.ceil(z5 ? PixelUtil.toPixelFromSP(f2, f7) : PixelUtil.toPixelFromDIP(f2)));
        float f10 = this.f3317v;
        float textSize = getTextSize();
        boolean z6 = this.f3315e;
        float f11 = this.f3316i;
        if (!Float.isNaN(f10) && f10 != 0.0f) {
            pixelFromSP = (z6 ? PixelUtil.toPixelFromSP(f10, f11) : PixelUtil.toPixelFromDIP(f10)) / textSize;
        }
        setLetterSpacing(pixelFromSP);
        setBreakStrategy(1);
        setHyphenationFrequency(0);
    }

    public final void d() {
        String string;
        Typeface typeface;
        if (this.Q) {
            this.Q = false;
            float f2 = this.f3314d;
            boolean z5 = this.f3315e;
            float f7 = this.f3316i;
            LruCache lruCache = f.f3321a;
            setTextSize(0, (float) Math.ceil(z5 ? PixelUtil.toPixelFromSP(f2, f7) : PixelUtil.toPixelFromDIP(f2)));
            this.R = true;
        }
        if (this.R) {
            this.R = false;
            float f10 = this.f3317v;
            float textSize = getTextSize();
            boolean z6 = this.f3315e;
            float f11 = this.f3316i;
            LruCache lruCache2 = f.f3321a;
            float pixelFromSP = 0.0f;
            if (!Float.isNaN(f10) && f10 != 0.0f) {
                pixelFromSP = (z6 ? PixelUtil.toPixelFromSP(f10, f11) : PixelUtil.toPixelFromDIP(f10)) / textSize;
            }
            setLetterSpacing(pixelFromSP);
        }
        if (this.S) {
            this.S = false;
            int i7 = this.G != 2 ? 0 : 2;
            int i10 = this.F;
            String str = this.E;
            AssetManager assets = getContext().getAssets();
            Intrinsics.checkNotNullExpressionValue(assets, "getAssets(...)");
            Typeface typefaceApplyStyles = ReactTypefaceUtils.applyStyles(this.J, i7, i10, str, assets);
            if (typefaceApplyStyles != this.K) {
                this.K = typefaceApplyStyles;
                setTypeface(typefaceApplyStyles);
                this.I = null;
            }
        }
        if (Build.VERSION.SDK_INT >= 26) {
            String str2 = this.H;
            if (!Intrinsics.areEqual(str2, this.I)) {
                Typeface typeface2 = this.K;
                if (str2 == null || typeface2 == null || (typeface = (Typeface) f.f3321a.get(new i(str2, typeface2))) == null) {
                    if (this.I != null) {
                        setTypeface(this.K);
                    }
                    setFontVariationSettings(null);
                    this.I = str2;
                    if (str2 != null) {
                        try {
                            setFontVariationSettings(str2);
                            if (typeface2 != null) {
                                f.f3321a.put(new i(str2, typeface2), getPaint().getTypeface());
                            }
                        } catch (IllegalArgumentException e10) {
                            o8.a.v(ReactConstants.TAG, "PlainText: invalid fontVariationSettings: " + e10.getMessage());
                        }
                    }
                } else {
                    setTypeface(typeface);
                    this.I = str2;
                }
            }
        }
        if (this.T) {
            this.T = false;
            String str3 = this.f3318w;
            if (str3 == null || (string = str3.toString()) == null) {
                string = "";
            }
            String str4 = this.f3320y;
            LruCache lruCache3 = f.f3321a;
            if (str4 != null) {
                int iHashCode = str4.hashCode();
                if (iHashCode != -1765638420) {
                    if (iHashCode != -514507343) {
                        if (iHashCode == 223523538 && str4.equals("uppercase")) {
                            Locale locale = Locale.getDefault();
                            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
                            string = string.toUpperCase(locale);
                            Intrinsics.checkNotNullExpressionValue(string, "toUpperCase(...)");
                        }
                    } else if (str4.equals("lowercase")) {
                        Locale locale2 = Locale.getDefault();
                        Intrinsics.checkNotNullExpressionValue(locale2, "getDefault(...)");
                        string = string.toLowerCase(locale2);
                        Intrinsics.checkNotNullExpressionValue(string, "toLowerCase(...)");
                    }
                } else if (str4.equals("capitalize")) {
                    BreakIterator wordInstance = BreakIterator.getWordInstance();
                    wordInstance.setText(string);
                    StringBuilder sb2 = new StringBuilder(string.length());
                    int iFirst = wordInstance.first();
                    int next = wordInstance.next();
                    while (true) {
                        int i11 = next;
                        int i12 = iFirst;
                        iFirst = i11;
                        if (iFirst == -1) {
                            break;
                        }
                        String strSubstring = string.substring(i12, iFirst);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                        if (strSubstring.length() > 0) {
                            char upperCase = Character.toUpperCase(strSubstring.charAt(0));
                            String strSubstring2 = strSubstring.substring(1);
                            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                            strSubstring = upperCase + strSubstring2;
                        }
                        sb2.append(strSubstring);
                        next = wordInstance.next();
                    }
                    string = sb2.toString();
                    Intrinsics.checkNotNull(string);
                }
            }
            if (Float.isNaN(this.f3319x)) {
                setText(string);
                return;
            }
            SpannableString spannableString = new SpannableString(string);
            float f12 = this.f3319x;
            spannableString.setSpan(new a(this.f3315e ? PixelUtil.toPixelFromSP(f12, this.f3316i) : PixelUtil.toPixelFromDIP(f12)), 0, spannableString.length(), 18);
            setText(spannableString);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.L) {
            return;
        }
        d dVar = this.P;
        removeCallbacks(dVar);
        post(dVar);
    }

    @Override // android.view.View
    public final void requestLayout() {
        super.requestLayout();
        if (this.L || getWidth() == 0 || getHeight() == 0 || this.M) {
            return;
        }
        this.M = true;
        post(this.N);
    }

    public final void setAllowFontScaling(boolean z5) {
        if (this.f3315e == z5) {
            return;
        }
        this.f3315e = z5;
        this.Q = true;
        this.T = true;
    }

    public final void setColor(Integer num) {
        setTextColor(num != null ? num.intValue() : -16777216);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0039  */
    public final void setEllipsizeMode(String str) {
        TextUtils.TruncateAt truncateAt;
        if (str == null) {
            truncateAt = TextUtils.TruncateAt.END;
        } else {
            int iHashCode = str.hashCode();
            if (iHashCode != -1074341483) {
                if (iHashCode != 3056464) {
                    if (iHashCode == 3198432 && str.equals("head")) {
                        truncateAt = TextUtils.TruncateAt.START;
                    } else {
                        truncateAt = TextUtils.TruncateAt.END;
                    }
                } else if (str.equals("clip")) {
                    truncateAt = null;
                } else {
                    truncateAt = TextUtils.TruncateAt.END;
                }
            } else if (str.equals("middle")) {
                truncateAt = TextUtils.TruncateAt.MIDDLE;
            } else {
                truncateAt = TextUtils.TruncateAt.END;
            }
        }
        setEllipsize(truncateAt);
    }

    public final void setFontFamily(String str) {
        this.E = str;
        this.S = true;
    }

    public final void setFontSizeSp(float f2) {
        this.f3314d = f2;
        this.Q = true;
    }

    public final void setFontStyle(String str) {
        this.G = ReactTypefaceUtils.parseFontStyle(str);
        this.S = true;
    }

    public final void setFontVariant(ReadableArray readableArray) {
        setFontFeatureSettings(ReactTypefaceUtils.parseFontVariant(readableArray));
    }

    public final void setFontWeight(String str) {
        this.F = ReactTypefaceUtils.parseFontWeight(str);
        this.S = true;
    }

    public final void setLetterSpacingDip(float f2) {
        this.f3317v = f2;
        this.R = true;
    }

    public final void setLineHeight(float f2) {
        if (f2 <= 0.0f) {
            f2 = Float.NaN;
        }
        this.f3319x = f2;
        this.T = true;
    }

    public final void setMaxFontSizeMultiplier(float f2) {
        if (this.f3316i == f2) {
            return;
        }
        this.f3316i = f2;
        this.Q = true;
        this.T = true;
    }

    public final void setMeasureOnly$react_native_plain_text_release(boolean z5) {
        this.L = z5;
    }

    public final void setNumberOfLines(int i7) {
        if (i7 <= 0) {
            i7 = Integer.MAX_VALUE;
        }
        setMaxLines(i7);
    }

    public final void setPlainText(String str) {
        this.f3318w = str;
        this.T = true;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0024  */
    /* JADX WARN: Code duplicated, block: B:16:0x0026  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void setTextAlign(String str) {
        int i7 = 0;
        Object[] objArr = getLayoutDirection() == 1;
        if (str != null) {
            switch (str.hashCode()) {
                case -1364013995:
                    if (str.equals("center")) {
                        i7 = 1;
                    }
                    break;
                case -1249482096:
                    if (str.equals("justify")) {
                        i7 = 3;
                    }
                    break;
                case 3005871:
                    str.equals("auto");
                    break;
                case 3317767:
                    if (str.equals(ViewProps.LEFT)) {
                        if (objArr != true) {
                            i7 = 3;
                        } else {
                            i7 = 5;
                        }
                    }
                    break;
                case 108511772:
                    if (str.equals(ViewProps.RIGHT)) {
                        if (objArr != true) {
                            i7 = 5;
                        } else {
                            i7 = 3;
                        }
                    }
                    break;
            }
        }
        setGravity((getGravity() & (-8388616)) | i7);
        if (Build.VERSION.SDK_INT >= 26) {
            setJustificationMode(Intrinsics.areEqual(str, "justify") ? 1 : 0);
        }
    }

    public final void setTextAlignVertical(String str) {
        int i7 = 48;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1383228885) {
                if (iHashCode != -1364013995) {
                    if (iHashCode == 115029) {
                        str.equals(ViewProps.TOP);
                    }
                } else if (str.equals("center")) {
                    i7 = 16;
                }
            } else if (str.equals(ViewProps.BOTTOM)) {
                i7 = 80;
            }
        }
        setGravity((getGravity() & (-113)) | i7);
    }

    public final void setTextDecorationLine(String str) {
        setPaintFlags((str == null || !StringsKt.D(str, "underline", false)) ? getPaintFlags() & (-9) : getPaintFlags() | 8);
        setPaintFlags((str == null || !StringsKt.D(str, "line-through", false)) ? getPaintFlags() & (-17) : getPaintFlags() | 16);
    }

    public final void setTextTransform(String str) {
        this.f3320y = str;
        this.T = true;
    }

    public final void setVariationSettings(String str) {
        String str2 = null;
        String string = str != null ? StringsKt.b0(str).toString() : null;
        if (string != null && string.length() != 0 && !string.equalsIgnoreCase("normal")) {
            str2 = string;
        }
        this.H = str2;
    }
}
