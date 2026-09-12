package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import yk.a;
import z0.d;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {
    public static final PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f1561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f1562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Parcelable f1563d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1564e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1565f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f1566g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f1567h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f1568i;
    public String j;

    public IconCompat() {
        this.f1560a = -1;
        this.f1562c = null;
        this.f1563d = null;
        this.f1564e = 0;
        this.f1565f = 0;
        this.f1566g = null;
        this.f1567h = k;
        this.f1568i = null;
    }

    public static IconCompat a(Bundle bundle) {
        int i7 = bundle.getInt("type");
        IconCompat iconCompat = new IconCompat(i7);
        iconCompat.f1564e = bundle.getInt("int1");
        iconCompat.f1565f = bundle.getInt("int2");
        iconCompat.j = bundle.getString("string1");
        if (bundle.containsKey("tint_list")) {
            iconCompat.f1566g = (ColorStateList) bundle.getParcelable("tint_list");
        }
        if (bundle.containsKey("tint_mode")) {
            iconCompat.f1567h = PorterDuff.Mode.valueOf(bundle.getString("tint_mode"));
        }
        switch (i7) {
            case -1:
            case 1:
            case 5:
                iconCompat.f1561b = bundle.getParcelable("obj");
                return iconCompat;
            case 0:
            default:
                Log.w("IconCompat", "Unknown type " + i7);
                return null;
            case 2:
            case 4:
            case 6:
                iconCompat.f1561b = bundle.getString("obj");
                return iconCompat;
            case 3:
                iconCompat.f1561b = bundle.getByteArray("obj");
                return iconCompat;
        }
    }

    public static Bitmap b(Bitmap bitmap, boolean z5) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f2 = iMin;
        float f7 = 0.5f * f2;
        float f10 = 0.9166667f * f7;
        if (z5) {
            float f11 = 0.010416667f * f2;
            paint.setColor(0);
            paint.setShadowLayer(f11, 0.0f, f2 * 0.020833334f, 1023410176);
            canvas.drawCircle(f7, f7, f10, paint);
            paint.setShadowLayer(f11, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f7, f7, f10, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f7, f7, f10, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    public static IconCompat c(Bitmap bitmap) {
        bitmap.getClass();
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f1561b = bitmap;
        return iconCompat;
    }

    public static IconCompat d(Resources resources, String str, int i7) {
        str.getClass();
        if (i7 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f1564e = i7;
        if (resources != null) {
            try {
                iconCompat.f1561b = resources.getResourceName(i7);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f1561b = str;
        }
        iconCompat.j = str;
        return iconCompat;
    }

    public final Bitmap e() {
        int i7 = this.f1560a;
        if (i7 == -1) {
            Object obj = this.f1561b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i7 == 1) {
            return (Bitmap) this.f1561b;
        }
        if (i7 == 5) {
            return b((Bitmap) this.f1561b, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    public final int f() {
        int i7 = this.f1560a;
        if (i7 == -1) {
            return a.s(this.f1561b);
        }
        if (i7 == 2) {
            return this.f1564e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public final Uri g() {
        int i7 = this.f1560a;
        if (i7 == -1) {
            return a.w(this.f1561b);
        }
        if (i7 == 4 || i7 == 6) {
            return Uri.parse((String) this.f1561b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public final InputStream h(Context context) {
        Uri uriG = g();
        String scheme = uriG.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(uriG);
            } catch (Exception e10) {
                Log.w("IconCompat", "Unable to load image from URI: " + uriG, e10);
                return null;
            }
        }
        try {
            return new FileInputStream(new File((String) this.f1561b));
        } catch (FileNotFoundException e11) {
            Log.w("IconCompat", "Unable to load image from path: " + uriG, e11);
            return null;
        }
    }

    public final Icon i(Context context) {
        Icon iconCreateWithBitmap;
        String strT;
        int i7 = Build.VERSION.SDK_INT;
        switch (this.f1560a) {
            case -1:
                return (Icon) this.f1561b;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) this.f1561b);
                break;
            case 2:
                int i10 = this.f1560a;
                if (i10 == -1) {
                    strT = a.t(this.f1561b);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("called getResPackage() on " + this);
                    }
                    String str = this.j;
                    strT = (str == null || TextUtils.isEmpty(str)) ? ((String) this.f1561b).split(":", -1)[0] : this.j;
                }
                iconCreateWithBitmap = Icon.createWithResource(strT, this.f1564e);
                break;
            case 3:
                iconCreateWithBitmap = Icon.createWithData((byte[]) this.f1561b, this.f1564e, this.f1565f);
                break;
            case 4:
                iconCreateWithBitmap = Icon.createWithContentUri((String) this.f1561b);
                break;
            case 5:
                iconCreateWithBitmap = i7 < 26 ? Icon.createWithBitmap(b((Bitmap) this.f1561b, false)) : hf.a.d((Bitmap) this.f1561b);
                break;
            case 6:
                if (i7 >= 30) {
                    iconCreateWithBitmap = d.a(g());
                } else {
                    if (context == null) {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + g());
                    }
                    InputStream inputStreamH = h(context);
                    if (inputStreamH == null) {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + g());
                    }
                    if (i7 < 26) {
                        iconCreateWithBitmap = Icon.createWithBitmap(b(BitmapFactory.decodeStream(inputStreamH), false));
                    } else {
                        iconCreateWithBitmap = hf.a.d(BitmapFactory.decodeStream(inputStreamH));
                    }
                }
                break;
        }
        ColorStateList colorStateList = this.f1566g;
        if (colorStateList != null) {
            iconCreateWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.f1567h;
        if (mode != k) {
            iconCreateWithBitmap.setTintMode(mode);
        }
        return iconCreateWithBitmap;
    }

    public final String toString() {
        String str;
        if (this.f1560a == -1) {
            return String.valueOf(this.f1561b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        switch (this.f1560a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb2.append(str);
        switch (this.f1560a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f1561b).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.f1561b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(f())));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f1564e);
                if (this.f1565f != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f1565f);
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f1561b);
                break;
        }
        if (this.f1566g != null) {
            sb2.append(" tint=");
            sb2.append(this.f1566g);
        }
        if (this.f1567h != k) {
            sb2.append(" mode=");
            sb2.append(this.f1567h);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public IconCompat(int i7) {
        this.f1562c = null;
        this.f1563d = null;
        this.f1564e = 0;
        this.f1565f = 0;
        this.f1566g = null;
        this.f1567h = k;
        this.f1568i = null;
        this.f1560a = i7;
    }
}
