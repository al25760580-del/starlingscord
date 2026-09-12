package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f1360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f1361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f1363d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1364e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ConstraintSet f1365f;

    public e(Context context, XmlResourceParser xmlResourceParser) {
        this.f1360a = Float.NaN;
        this.f1361b = Float.NaN;
        this.f1362c = Float.NaN;
        this.f1363d = Float.NaN;
        this.f1364e = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), m.j);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i7);
            if (index == 0) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f1364e);
                this.f1364e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    ConstraintSet constraintSet = new ConstraintSet();
                    this.f1365f = constraintSet;
                    constraintSet.c((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f1363d = typedArrayObtainStyledAttributes.getDimension(index, this.f1363d);
            } else if (index == 2) {
                this.f1361b = typedArrayObtainStyledAttributes.getDimension(index, this.f1361b);
            } else if (index == 3) {
                this.f1362c = typedArrayObtainStyledAttributes.getDimension(index, this.f1362c);
            } else if (index == 4) {
                this.f1360a = typedArrayObtainStyledAttributes.getDimension(index, this.f1360a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final boolean a(float f2, float f7) {
        float f10 = this.f1360a;
        if (!Float.isNaN(f10) && f2 < f10) {
            return false;
        }
        float f11 = this.f1361b;
        if (!Float.isNaN(f11) && f7 < f11) {
            return false;
        }
        float f12 = this.f1362c;
        if (!Float.isNaN(f12) && f2 > f12) {
            return false;
        }
        float f13 = this.f1363d;
        return Float.isNaN(f13) || f7 <= f13;
    }
}
