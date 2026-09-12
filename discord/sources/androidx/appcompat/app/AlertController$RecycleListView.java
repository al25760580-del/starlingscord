package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;

/* JADX INFO: loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f730d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f731e;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.a.f10270t);
        this.f731e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f730d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
