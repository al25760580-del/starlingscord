package a1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import androidx.collection.LruCache;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f42a = new ThreadLocal();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f43b = new WeakHashMap(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f44c = new Object();

    /* JADX WARN: Code duplicated, block: B:39:0x00c9  */
    public static Typeface a(Context context, int i7, TypedValue typedValue, int i10, b bVar, boolean z5, boolean z6) {
        Resources resources = context.getResources();
        resources.getValue(i7, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i7) + "\" (" + Integer.toHexString(i7) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        Typeface typefaceA = null;
        if (string.startsWith("res/")) {
            int i11 = typedValue.assetCookie;
            LruCache lruCache = b1.f.f3029b;
            Typeface typeface = (Typeface) lruCache.a(b1.f.b(resources, i7, string, i11, i10));
            if (typeface != null) {
                if (bVar != null) {
                    new Handler(Looper.getMainLooper()).post(new k(0, bVar, typeface));
                }
                typefaceA = typeface;
            } else if (!z6) {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        e eVarI = b.i(resources.getXml(i7), resources);
                        if (eVarI == null) {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if (bVar != null) {
                                bVar.a(-3);
                            }
                        } else {
                            typefaceA = b1.f.a(context, eVarI, resources, i7, string, typedValue.assetCookie, i10, bVar, z5);
                        }
                    } else {
                        int i12 = typedValue.assetCookie;
                        Typeface typefaceS = b1.f.f3028a.s(context, resources, i7, string, i10);
                        if (typefaceS != null) {
                            lruCache.b(b1.f.b(resources, i7, string, i12, i10), typefaceS);
                        }
                        if (bVar != null) {
                            if (typefaceS != null) {
                                new Handler(Looper.getMainLooper()).post(new k(0, bVar, typefaceS));
                            } else {
                                bVar.a(-3);
                            }
                        }
                        typefaceA = typefaceS;
                    }
                } catch (IOException e10) {
                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(string), e10);
                    if (bVar != null) {
                        bVar.a(-3);
                    }
                } catch (XmlPullParserException e11) {
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), e11);
                    if (bVar != null) {
                        bVar.a(-3);
                    }
                }
            }
        } else if (bVar != null) {
            bVar.a(-3);
        }
        if (typefaceA != null || bVar != null || z6) {
            return typefaceA;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i7) + " could not be retrieved.");
    }
}
