package androidx.fragment.app;

import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.Lifecycle;
import com.discord.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0 f2166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k1 f2167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Fragment f2168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2169d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2170e = -1;

    public j1(k0 k0Var, k1 k1Var, Fragment fragment) {
        this.f2166a = k0Var;
        this.f2167b = k1Var;
        this.f2168c = fragment;
    }

    public final void a() {
        boolean zM = FragmentManager.M(3);
        Fragment fragment = this.f2168c;
        if (zM) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + fragment);
        }
        Bundle bundle = fragment.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        fragment.performActivityCreated(bundle2);
        this.f2166a.a(fragment, bundle2, false);
    }

    public final void b() {
        View view;
        View view2;
        Fragment fragment = this.f2168c;
        Fragment expectedParentFragment = FragmentManager.F(fragment.mContainer);
        Fragment parentFragment = fragment.getParentFragment();
        if (expectedParentFragment != null && !expectedParentFragment.equals(parentFragment)) {
            int i7 = fragment.mContainerId;
            p2.c cVar = p2.d.f17776a;
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(expectedParentFragment, "expectedParentFragment");
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(expectedParentFragment, "expectedParentFragment");
            StringBuilder sb2 = new StringBuilder("Attempting to nest fragment ");
            sb2.append(fragment);
            sb2.append(" within the view of parent fragment ");
            sb2.append(expectedParentFragment);
            sb2.append(" via container with ID ");
            p2.o oVar = new p2.o(fragment, kk.b.l(sb2, i7, " without using parent's childFragmentManager"));
            p2.d.c(oVar);
            p2.c cVarA = p2.d.a(fragment);
            if (cVarA.f17774a.contains(p2.b.f17770w) && p2.d.e(cVarA, fragment.getClass(), p2.o.class)) {
                p2.d.b(cVarA, oVar);
            }
        }
        ArrayList arrayList = this.f2167b.f2174a;
        ViewGroup viewGroup = fragment.mContainer;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            int iIndexOf = arrayList.indexOf(fragment);
            for (int i10 = iIndexOf - 1; i10 >= 0; i10--) {
                Fragment fragment2 = (Fragment) arrayList.get(i10);
                if (fragment2.mContainer == viewGroup && (view2 = fragment2.mView) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                }
            }
            while (true) {
                iIndexOf++;
                if (iIndexOf >= arrayList.size()) {
                    break;
                }
                Fragment fragment3 = (Fragment) arrayList.get(iIndexOf);
                if (fragment3.mContainer == viewGroup && (view = fragment3.mView) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view);
                    break;
                }
            }
        }
        fragment.mContainer.addView(fragment.mView, iIndexOfChild);
    }

    public final void c() {
        boolean zM = FragmentManager.M(3);
        Fragment fragment = this.f2168c;
        if (zM) {
            Log.d("FragmentManager", "moveto ATTACHED: " + fragment);
        }
        Fragment fragment2 = fragment.mTarget;
        j1 j1Var = null;
        k1 k1Var = this.f2167b;
        if (fragment2 != null) {
            j1 j1Var2 = (j1) k1Var.f2175b.get(fragment2.mWho);
            if (j1Var2 == null) {
                throw new IllegalStateException("Fragment " + fragment + " declared target fragment " + fragment.mTarget + " that does not belong to this FragmentManager!");
            }
            fragment.mTargetWho = fragment.mTarget.mWho;
            fragment.mTarget = null;
            j1Var = j1Var2;
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (j1Var = (j1) k1Var.f2175b.get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(fragment);
                sb2.append(" declared target fragment ");
                throw new IllegalStateException(com.discord.chat.presentation.list.a.k(sb2, fragment.mTargetWho, " that does not belong to this FragmentManager!"));
            }
        }
        if (j1Var != null) {
            j1Var.k();
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        fragment.mHost = fragmentManager.f2061w;
        fragment.mParentFragment = fragmentManager.f2063y;
        k0 k0Var = this.f2166a;
        k0Var.g(fragment, false);
        fragment.performAttach();
        k0Var.b(fragment, false);
    }

    public final int d() {
        Fragment fragment = this.f2168c;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int iMin = this.f2170e;
        int iOrdinal = fragment.mMaxState.ordinal();
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (fragment.mFromLayout) {
            if (fragment.mInLayout) {
                iMin = Math.max(this.f2170e, 2);
                View view = fragment.mView;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f2170e < 4 ? Math.min(iMin, fragment.mState) : Math.min(iMin, 1);
            }
        }
        if (fragment.mInDynamicContainer && fragment.mContainer == null) {
            iMin = Math.min(iMin, 4);
        }
        if (!fragment.mAdded) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = fragment.mContainer;
        y1 y1Var = null;
        if (viewGroup != null) {
            b2 b2VarJ = b2.j(viewGroup, fragment.getParentFragmentManager());
            Intrinsics.checkNotNullParameter(this, "fragmentStateManager");
            Intrinsics.checkNotNullExpressionValue(fragment, "fragmentStateManager.fragment");
            x1 x1VarG = b2VarJ.g(fragment);
            y1 y1Var2 = x1VarG != null ? x1VarG.f2273b : null;
            x1 x1VarH = b2VarJ.h(fragment);
            y1Var = x1VarH != null ? x1VarH.f2273b : null;
            int i7 = y1Var2 == null ? -1 : a2.f2092a[y1Var2.ordinal()];
            if (i7 != -1 && i7 != 1) {
                y1Var = y1Var2;
            }
        }
        if (y1Var == y1.f2284e) {
            iMin = Math.min(iMin, 6);
        } else if (y1Var == y1.f2285i) {
            iMin = Math.max(iMin, 3);
        } else if (fragment.mRemoving) {
            iMin = fragment.isInBackStack() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (fragment.mDeferStart && fragment.mState < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (fragment.mTransitioning) {
            iMin = Math.max(iMin, 3);
        }
        if (FragmentManager.M(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + fragment);
        }
        return iMin;
    }

    public final void e() {
        boolean zM = FragmentManager.M(3);
        Fragment fragment = this.f2168c;
        if (zM) {
            Log.d("FragmentManager", "moveto CREATED: " + fragment);
        }
        Bundle bundle = fragment.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        if (fragment.mIsCreated) {
            fragment.mState = 1;
            fragment.restoreChildFragmentState();
        } else {
            k0 k0Var = this.f2166a;
            k0Var.h(fragment, bundle2, false);
            fragment.performCreate(bundle2);
            k0Var.c(fragment, bundle2, false);
        }
    }

    public final void f() {
        String resourceName;
        Fragment fragment = this.f2168c;
        if (fragment.mFromLayout) {
            return;
        }
        if (FragmentManager.M(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + fragment);
        }
        Bundle bundle = fragment.mSavedFragmentState;
        ViewGroup container = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterPerformGetLayoutInflater = fragment.performGetLayoutInflater(bundle2);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            container = viewGroup;
        } else {
            int i7 = fragment.mContainerId;
            if (i7 != 0) {
                if (i7 == -1) {
                    throw new IllegalArgumentException(a3.e.k("Cannot create fragment ", fragment, " for a container view with no id"));
                }
                container = (ViewGroup) fragment.mFragmentManager.f2062x.b(i7);
                if (container == null) {
                    if (!fragment.mRestored && !fragment.mInDynamicContainer) {
                        try {
                            resourceName = fragment.getResources().getResourceName(fragment.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(fragment.mContainerId) + " (" + resourceName + ") for fragment " + fragment);
                    }
                } else if (!(container instanceof FragmentContainerView)) {
                    p2.c cVar = p2.d.f17776a;
                    Intrinsics.checkNotNullParameter(fragment, "fragment");
                    Intrinsics.checkNotNullParameter(container, "container");
                    p2.n nVar = new p2.n(fragment, container);
                    p2.d.c(nVar);
                    p2.c cVarA = p2.d.a(fragment);
                    if (cVarA.f17774a.contains(p2.b.F) && p2.d.e(cVarA, fragment.getClass(), p2.n.class)) {
                        p2.d.b(cVarA, nVar);
                    }
                }
            }
        }
        fragment.mContainer = container;
        fragment.performCreateView(layoutInflaterPerformGetLayoutInflater, container, bundle2);
        if (fragment.mView != null) {
            if (FragmentManager.M(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + fragment);
            }
            fragment.mView.setSaveFromParentEnabled(false);
            fragment.mView.setTag(R.id.fragment_container_view_tag, fragment);
            if (container != null) {
                b();
            }
            if (fragment.mHidden) {
                fragment.mView.setVisibility(8);
            }
            if (fragment.mView.isAttachedToWindow()) {
                View view = fragment.mView;
                WeakHashMap weakHashMap = androidx.core.view.u0.f1729a;
                androidx.core.view.j0.c(view);
            } else {
                View view2 = fragment.mView;
                view2.addOnAttachStateChangeListener(new i1(view2));
            }
            fragment.performViewCreated();
            this.f2166a.m(fragment, fragment.mView, bundle2, false);
            int visibility = fragment.mView.getVisibility();
            fragment.setPostOnViewCreatedAlpha(fragment.mView.getAlpha());
            if (fragment.mContainer != null && visibility == 0) {
                View viewFindFocus = fragment.mView.findFocus();
                if (viewFindFocus != null) {
                    fragment.setFocusedView(viewFindFocus);
                    if (FragmentManager.M(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + fragment);
                    }
                }
                fragment.mView.setAlpha(0.0f);
            }
        }
        fragment.mState = 2;
    }

    public final void g() {
        Fragment fragmentB;
        boolean zM = FragmentManager.M(3);
        Fragment fragment = this.f2168c;
        if (zM) {
            Log.d("FragmentManager", "movefrom CREATED: " + fragment);
        }
        boolean zIsChangingConfigurations = true;
        boolean z5 = fragment.mRemoving && !fragment.isInBackStack();
        k1 k1Var = this.f2167b;
        if (z5 && !fragment.mBeingSaved) {
            k1Var.i(fragment.mWho, null);
        }
        if (!z5) {
            f1 f1Var = k1Var.f2177d;
            if (!((f1Var.f2135b.containsKey(fragment.mWho) && f1Var.f2138e) ? f1Var.f2139f : true)) {
                String str = fragment.mTargetWho;
                if (str != null && (fragmentB = k1Var.b(str)) != null && fragmentB.mRetainInstance) {
                    fragment.mTarget = fragmentB;
                }
                fragment.mState = 0;
                return;
            }
        }
        FragmentHostCallback fragmentHostCallback = fragment.mHost;
        if (fragmentHostCallback instanceof androidx.lifecycle.c1) {
            zIsChangingConfigurations = k1Var.f2177d.f2139f;
        } else {
            FragmentActivity fragmentActivity = fragmentHostCallback.f2038e;
            if (fragmentActivity != null) {
                zIsChangingConfigurations = true ^ fragmentActivity.isChangingConfigurations();
            }
        }
        if ((z5 && !fragment.mBeingSaved) || zIsChangingConfigurations) {
            k1Var.f2177d.d(fragment, false);
        }
        fragment.performDestroy();
        this.f2166a.d(fragment, false);
        for (j1 j1Var : k1Var.d()) {
            if (j1Var != null) {
                Fragment fragment2 = j1Var.f2168c;
                if (fragment.mWho.equals(fragment2.mTargetWho)) {
                    fragment2.mTarget = fragment;
                    fragment2.mTargetWho = null;
                }
            }
        }
        String str2 = fragment.mTargetWho;
        if (str2 != null) {
            fragment.mTarget = k1Var.b(str2);
        }
        k1Var.h(this);
    }

    public final void h() {
        View view;
        boolean zM = FragmentManager.M(3);
        Fragment fragment = this.f2168c;
        if (zM) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + fragment);
        }
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        fragment.performDestroyView();
        this.f2166a.n(fragment, false);
        fragment.mContainer = null;
        fragment.mView = null;
        fragment.mViewLifecycleOwner = null;
        fragment.mViewLifecycleOwnerLiveData.h(null);
        fragment.mInLayout = false;
    }

    public final void i() {
        boolean zM = FragmentManager.M(3);
        Fragment fragment = this.f2168c;
        if (zM) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + fragment);
        }
        fragment.performDetach();
        this.f2166a.e(fragment, false);
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if (!fragment.mRemoving || fragment.isInBackStack()) {
            f1 f1Var = this.f2167b.f2177d;
            if (!((f1Var.f2135b.containsKey(fragment.mWho) && f1Var.f2138e) ? f1Var.f2139f : true)) {
                return;
            }
        }
        if (FragmentManager.M(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + fragment);
        }
        fragment.initState();
    }

    public final void j() {
        Fragment fragment = this.f2168c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (FragmentManager.M(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + fragment);
            }
            Bundle bundle = fragment.mSavedFragmentState;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            fragment.performCreateView(fragment.performGetLayoutInflater(bundle2), null, bundle2);
            View view = fragment.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                fragment.mView.setTag(R.id.fragment_container_view_tag, fragment);
                if (fragment.mHidden) {
                    fragment.mView.setVisibility(8);
                }
                fragment.performViewCreated();
                this.f2166a.m(fragment, fragment.mView, bundle2, false);
                fragment.mState = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        boolean z5 = this.f2169d;
        Fragment fragment = this.f2168c;
        if (z5) {
            if (FragmentManager.M(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + fragment);
                return;
            }
            return;
        }
        try {
            this.f2169d = true;
            boolean z6 = false;
            while (true) {
                int iD = d();
                int i7 = fragment.mState;
                z1 z1Var = z1.f2290e;
                z1 z1Var2 = z1.f2291i;
                k1 k1Var = this.f2167b;
                if (iD == i7) {
                    if (!z6 && i7 == -1 && fragment.mRemoving && !fragment.isInBackStack() && !fragment.mBeingSaved) {
                        if (FragmentManager.M(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + fragment);
                        }
                        k1Var.f2177d.d(fragment, true);
                        k1Var.h(this);
                        if (FragmentManager.M(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + fragment);
                        }
                        fragment.initState();
                    }
                    if (fragment.mHiddenChanged) {
                        if (fragment.mView != null && (viewGroup = fragment.mContainer) != null) {
                            b2 b2VarJ = b2.j(viewGroup, fragment.getParentFragmentManager());
                            boolean z7 = fragment.mHidden;
                            y1 y1Var = y1.f2283d;
                            if (z7) {
                                Intrinsics.checkNotNullParameter(this, "fragmentStateManager");
                                if (FragmentManager.M(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + fragment);
                                }
                                b2VarJ.d(z1Var2, y1Var, this);
                            } else {
                                Intrinsics.checkNotNullParameter(this, "fragmentStateManager");
                                if (FragmentManager.M(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + fragment);
                                }
                                b2VarJ.d(z1Var, y1Var, this);
                            }
                        }
                        FragmentManager fragmentManager = fragment.mFragmentManager;
                        if (fragmentManager != null && fragment.mAdded && FragmentManager.N(fragment)) {
                            fragmentManager.G = true;
                        }
                        fragment.mHiddenChanged = false;
                        fragment.onHiddenChanged(fragment.mHidden);
                        fragment.mChildFragmentManager.o();
                    }
                    this.f2169d = false;
                    return;
                }
                k0 k0Var = this.f2166a;
                if (iD <= i7) {
                    switch (i7 - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            if (fragment.mBeingSaved) {
                                if (((Bundle) k1Var.f2176c.get(fragment.mWho)) == null) {
                                    k1Var.i(fragment.mWho, n());
                                }
                            }
                            g();
                            break;
                        case 1:
                            h();
                            fragment.mState = 1;
                            break;
                        case 2:
                            fragment.mInLayout = false;
                            fragment.mState = 2;
                            break;
                        case 3:
                            if (FragmentManager.M(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + fragment);
                            }
                            if (fragment.mBeingSaved) {
                                k1Var.i(fragment.mWho, n());
                            } else if (fragment.mView != null && fragment.mSavedViewState == null) {
                                o();
                            }
                            if (fragment.mView != null && (viewGroup2 = fragment.mContainer) != null) {
                                b2 b2VarJ2 = b2.j(viewGroup2, fragment.getParentFragmentManager());
                                Intrinsics.checkNotNullParameter(this, "fragmentStateManager");
                                if (FragmentManager.M(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + fragment);
                                }
                                b2VarJ2.d(z1.f2289d, y1.f2285i, this);
                            }
                            fragment.mState = 3;
                            break;
                        case 4:
                            if (FragmentManager.M(3)) {
                                Log.d("FragmentManager", "movefrom STARTED: " + fragment);
                            }
                            fragment.performStop();
                            k0Var.l(fragment, false);
                            break;
                        case 5:
                            fragment.mState = 5;
                            break;
                        case 6:
                            if (FragmentManager.M(3)) {
                                Log.d("FragmentManager", "movefrom RESUMED: " + fragment);
                            }
                            fragment.performPause();
                            k0Var.f(fragment, false);
                            break;
                    }
                } else {
                    switch (i7 + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (fragment.mView != null && (viewGroup3 = fragment.mContainer) != null) {
                                b2 b2VarJ3 = b2.j(viewGroup3, fragment.getParentFragmentManager());
                                int visibility = fragment.mView.getVisibility();
                                if (visibility != 0) {
                                    if (visibility == 4) {
                                        z1Var = z1.f2292v;
                                    } else {
                                        if (visibility != 8) {
                                            throw new IllegalArgumentException("Unknown visibility " + visibility);
                                        }
                                        z1Var = z1Var2;
                                    }
                                }
                                b2VarJ3.e(z1Var, this);
                            }
                            fragment.mState = 4;
                            break;
                        case 5:
                            if (FragmentManager.M(3)) {
                                Log.d("FragmentManager", "moveto STARTED: " + fragment);
                            }
                            fragment.performStart();
                            k0Var.k(fragment, false);
                            break;
                        case 6:
                            fragment.mState = 6;
                            break;
                        case 7:
                            m();
                            break;
                    }
                }
                z6 = true;
            }
        } catch (Throwable th2) {
            this.f2169d = false;
            throw th2;
        }
    }

    public final void l(ClassLoader classLoader) {
        Fragment fragment = this.f2168c;
        Bundle bundle = fragment.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (fragment.mSavedFragmentState.getBundle("savedInstanceState") == null) {
            fragment.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
        }
        try {
            fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("viewState");
            fragment.mSavedViewRegistryState = fragment.mSavedFragmentState.getBundle("viewRegistryState");
            h1 h1Var = (h1) fragment.mSavedFragmentState.getParcelable("state");
            if (h1Var != null) {
                fragment.mTargetWho = h1Var.J;
                fragment.mTargetRequestCode = h1Var.K;
                Boolean bool = fragment.mSavedUserVisibleHint;
                if (bool != null) {
                    fragment.mUserVisibleHint = bool.booleanValue();
                    fragment.mSavedUserVisibleHint = null;
                } else {
                    fragment.mUserVisibleHint = h1Var.L;
                }
            }
            if (fragment.mUserVisibleHint) {
                return;
            }
            fragment.mDeferStart = true;
        } catch (BadParcelableException e10) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + fragment, e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003c  */
    /* JADX WARN: Code duplicated, block: B:18:0x004d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0051  */
    public final void m() {
        boolean zRequestFocus;
        String str;
        boolean zM = FragmentManager.M(3);
        Fragment fragment = this.f2168c;
        if (zM) {
            Log.d("FragmentManager", "moveto RESUMED: " + fragment);
        }
        View focusedView = fragment.getFocusedView();
        if (focusedView != null) {
            if (focusedView == fragment.mView) {
                zRequestFocus = focusedView.requestFocus();
                if (FragmentManager.M(2)) {
                    StringBuilder sb2 = new StringBuilder("requestFocus: Restoring focused view ");
                    sb2.append(focusedView);
                    sb2.append(" ");
                    if (zRequestFocus) {
                        str = "succeeded";
                    } else {
                        str = "failed";
                    }
                    sb2.append(str);
                    sb2.append(" on Fragment ");
                    sb2.append(fragment);
                    sb2.append(" resulting in focused view ");
                    sb2.append(fragment.mView.findFocus());
                    Log.v("FragmentManager", sb2.toString());
                }
            } else {
                ViewParent parent = focusedView.getParent();
                while (true) {
                    if (parent != null) {
                        if (parent == fragment.mView) {
                            break;
                        } else {
                            parent = parent.getParent();
                        }
                    }
                }
                zRequestFocus = focusedView.requestFocus();
                if (FragmentManager.M(2)) {
                    StringBuilder sb3 = new StringBuilder("requestFocus: Restoring focused view ");
                    sb3.append(focusedView);
                    sb3.append(" ");
                    if (zRequestFocus) {
                        str = "succeeded";
                    } else {
                        str = "failed";
                    }
                    sb3.append(str);
                    sb3.append(" on Fragment ");
                    sb3.append(fragment);
                    sb3.append(" resulting in focused view ");
                    sb3.append(fragment.mView.findFocus());
                    Log.v("FragmentManager", sb3.toString());
                }
            }
        }
        fragment.setFocusedView(null);
        fragment.performResume();
        this.f2166a.i(fragment, false);
        this.f2167b.i(fragment.mWho, null);
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    public final Bundle n() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        Fragment fragment = this.f2168c;
        if (fragment.mState == -1 && (bundle = fragment.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new h1(fragment));
        if (fragment.mState > 0) {
            Bundle bundle3 = new Bundle();
            fragment.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f2166a.j(fragment, bundle3, false);
            Bundle bundle4 = new Bundle();
            fragment.mSavedStateRegistryController.b(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle bundleA0 = fragment.mChildFragmentManager.a0();
            if (!bundleA0.isEmpty()) {
                bundle2.putBundle("childFragmentManager", bundleA0);
            }
            if (fragment.mView != null) {
                o();
            }
            SparseArray<Parcelable> sparseArray = fragment.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = fragment.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = fragment.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public final void o() {
        Fragment fragment = this.f2168c;
        if (fragment.mView == null) {
            return;
        }
        if (FragmentManager.M(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + fragment + " with view " + fragment.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        fragment.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            fragment.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        fragment.mViewLifecycleOwner.f2084w.b(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        fragment.mSavedViewRegistryState = bundle;
    }

    public j1(k0 k0Var, k1 k1Var, ClassLoader classLoader, t0 t0Var, Bundle bundle) {
        this.f2166a = k0Var;
        this.f2167b = k1Var;
        h1 h1Var = (h1) bundle.getParcelable("state");
        Fragment fragmentInstantiate = Fragment.instantiate(t0Var.f2254a.f2061w.f2038e, h1Var.f2153d, null);
        fragmentInstantiate.mWho = h1Var.f2154e;
        fragmentInstantiate.mFromLayout = h1Var.f2155i;
        fragmentInstantiate.mInDynamicContainer = h1Var.f2156v;
        fragmentInstantiate.mRestored = true;
        fragmentInstantiate.mFragmentId = h1Var.f2157w;
        fragmentInstantiate.mContainerId = h1Var.f2158x;
        fragmentInstantiate.mTag = h1Var.f2159y;
        fragmentInstantiate.mRetainInstance = h1Var.E;
        fragmentInstantiate.mRemoving = h1Var.F;
        fragmentInstantiate.mDetached = h1Var.G;
        fragmentInstantiate.mHidden = h1Var.H;
        fragmentInstantiate.mMaxState = Lifecycle.State.values()[h1Var.I];
        fragmentInstantiate.mTargetWho = h1Var.J;
        fragmentInstantiate.mTargetRequestCode = h1Var.K;
        fragmentInstantiate.mUserVisibleHint = h1Var.L;
        this.f2168c = fragmentInstantiate;
        fragmentInstantiate.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        fragmentInstantiate.setArguments(bundle2);
        if (FragmentManager.M(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + fragmentInstantiate);
        }
    }

    public j1(k0 k0Var, k1 k1Var, Fragment fragment, Bundle bundle) {
        this.f2166a = k0Var;
        this.f2167b = k1Var;
        this.f2168c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        fragment.mSavedFragmentState = bundle;
        fragment.mArguments = bundle.getBundle("arguments");
    }
}
