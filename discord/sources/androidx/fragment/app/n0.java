package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class n0 implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FragmentManager f2204d;

    public n0(FragmentManager fragmentManager) {
        this.f2204d = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        j1 j1VarG;
        boolean zEquals = FragmentContainerView.class.getName().equals(str);
        FragmentManager fragmentManager = this.f2204d;
        if (zEquals) {
            return new FragmentContainerView(context, attributeSet, fragmentManager);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o2.a.f17103a);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    zIsAssignableFrom = Fragment.class.isAssignableFrom(t0.a(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
                if (zIsAssignableFrom) {
                    int id2 = view != null ? view.getId() : 0;
                    if (id2 == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    Fragment fragment = resourceId != -1 ? fragmentManager.D(resourceId) : null;
                    if (fragment == null && string != null) {
                        fragment = fragmentManager.E(string);
                    }
                    if (fragment == null && id2 != -1) {
                        fragment = fragmentManager.D(id2);
                    }
                    if (fragment == null) {
                        t0 t0VarJ = fragmentManager.J();
                        context.getClassLoader();
                        fragment = Fragment.instantiate(t0VarJ.f2254a.f2061w.f2038e, attributeValue, null);
                        fragment.mFromLayout = true;
                        fragment.mFragmentId = resourceId != 0 ? resourceId : id2;
                        fragment.mContainerId = id2;
                        fragment.mTag = string;
                        fragment.mInLayout = true;
                        fragment.mFragmentManager = fragmentManager;
                        FragmentHostCallback fragmentHostCallback = fragmentManager.f2061w;
                        fragment.mHost = fragmentHostCallback;
                        fragment.onInflate((Context) fragmentHostCallback.f2038e, attributeSet, fragment.mSavedFragmentState);
                        j1VarG = fragmentManager.a(fragment);
                        if (FragmentManager.M(2)) {
                            Log.v("FragmentManager", "Fragment " + fragment + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (fragment.mInLayout) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
                        }
                        fragment.mInLayout = true;
                        fragment.mFragmentManager = fragmentManager;
                        FragmentHostCallback fragmentHostCallback2 = fragmentManager.f2061w;
                        fragment.mHost = fragmentHostCallback2;
                        fragment.onInflate((Context) fragmentHostCallback2.f2038e, attributeSet, fragment.mSavedFragmentState);
                        j1VarG = fragmentManager.g(fragment);
                        if (FragmentManager.M(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + fragment + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    p2.c cVar = p2.d.f17776a;
                    Intrinsics.checkNotNullParameter(fragment, "fragment");
                    p2.e eVar = new p2.e(fragment, viewGroup);
                    p2.d.c(eVar);
                    p2.c cVarA = p2.d.a(fragment);
                    if (cVarA.f17774a.contains(p2.b.f17769v) && p2.d.e(cVarA, fragment.getClass(), p2.e.class)) {
                        p2.d.b(cVarA, eVar);
                    }
                    fragment.mContainer = viewGroup;
                    j1VarG.k();
                    j1VarG.j();
                    View view2 = fragment.mView;
                    if (view2 == null) {
                        throw new IllegalStateException(s0.g.e("Fragment ", attributeValue, " did not create a view."));
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (fragment.mView.getTag() == null) {
                        fragment.mView.setTag(string);
                    }
                    fragment.mView.addOnAttachStateChangeListener(new m0(this, j1VarG));
                    return fragment.mView;
                }
            }
        }
        return null;
    }
}
