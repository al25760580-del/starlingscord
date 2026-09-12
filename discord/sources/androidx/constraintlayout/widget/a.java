package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1341a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f1344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f1345e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1346f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1347g;

    public a(a aVar, Object obj) {
        aVar.getClass();
        this.f1342b = aVar.f1342b;
        b(obj);
    }

    public static void a(Context context, XmlResourceParser xmlResourceParser, HashMap map) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), m.f1447d);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        int i7 = 0;
        boolean z5 = false;
        Object objValueOf = null;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            int i11 = 1;
            if (index == 0) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == 10) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z5 = true;
            } else if (index == 1) {
                objValueOf = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                i7 = 6;
            } else {
                int i12 = 3;
                if (index == 3) {
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else {
                    i12 = 4;
                    if (index == 2) {
                        objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                    } else {
                        if (index == 7) {
                            objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                        } else if (index == 4) {
                            objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                        } else {
                            i12 = 5;
                            if (index == 5) {
                                objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                                i7 = 2;
                            } else {
                                if (index == 6) {
                                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                                } else if (index == 9) {
                                    objValueOf = typedArrayObtainStyledAttributes.getString(index);
                                } else {
                                    i11 = 8;
                                    if (index == 8) {
                                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                        if (resourceId == -1) {
                                            resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                                        }
                                        objValueOf = Integer.valueOf(resourceId);
                                    }
                                }
                                i7 = i11;
                            }
                        }
                        i7 = 7;
                    }
                }
                i7 = i12;
            }
        }
        if (string != null && objValueOf != null) {
            a aVar = new a();
            aVar.f1342b = i7;
            aVar.f1341a = z5;
            aVar.b(objValueOf);
            map.put(string, aVar);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void b(Object obj) {
        switch (f0.e.b(this.f1342b)) {
            case 0:
            case 7:
                this.f1343c = ((Integer) obj).intValue();
                break;
            case 1:
                this.f1344d = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.f1347g = ((Integer) obj).intValue();
                break;
            case 4:
                this.f1345e = (String) obj;
                break;
            case 5:
                this.f1346f = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.f1344d = ((Float) obj).floatValue();
                break;
        }
    }
}
