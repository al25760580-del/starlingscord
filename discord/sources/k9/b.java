package k9;

import android.content.Context;
import android.util.AttributeSet;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b extends a {
    public void inflateHierarchy(Context context, AttributeSet attributeSet) {
        sa.a.w();
        GenericDraweeHierarchyBuilder genericDraweeHierarchyBuilderQ = a.a.q(context, attributeSet);
        setAspectRatio(genericDraweeHierarchyBuilderQ.f4707c);
        setHierarchy(genericDraweeHierarchyBuilderQ.a());
        sa.a.w();
    }
}
