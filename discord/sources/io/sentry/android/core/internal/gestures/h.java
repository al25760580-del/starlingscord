package io.sentry.android.core.internal.gestures;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ScrollView;
import androidx.core.view.ScrollingView;
import io.sentry.android.core.SentryAndroidOptions;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f12246a = new int[2];

    /* JADX WARN: Code duplicated, block: B:51:0x00dd  */
    public static io.sentry.internal.gestures.b a(SentryAndroidOptions sentryAndroidOptions, View view, float f2, float f7, io.sentry.internal.gestures.a aVar) {
        io.sentry.internal.gestures.b bVar;
        List<a> gestureTargetLocators = sentryAndroidOptions.getGestureTargetLocators();
        LinkedList linkedList = new LinkedList();
        linkedList.add(view);
        io.sentry.internal.gestures.b bVar2 = null;
        while (linkedList.size() > 0) {
            View view2 = (View) linkedList.poll();
            if (view2 != null) {
                int[] iArr = f12246a;
                view2.getLocationOnScreen(iArr);
                int i7 = iArr[0];
                int i10 = iArr[1];
                int width = view2.getWidth();
                int height = view2.getHeight();
                if (f2 >= i7 && f2 <= i7 + width && f7 >= i10 && f7 <= i10 + height) {
                    if (view2 instanceof ViewGroup) {
                        ViewGroup viewGroup = (ViewGroup) view2;
                        for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                            linkedList.add(viewGroup.getChildAt(i11));
                        }
                    }
                    for (int i12 = 0; i12 < gestureTargetLocators.size(); i12++) {
                        a aVar2 = gestureTargetLocators.get(i12);
                        aVar2.getClass();
                        if (aVar == io.sentry.internal.gestures.a.CLICKABLE && view2.isClickable() && view2.getVisibility() == 0) {
                            try {
                                bVar = new io.sentry.internal.gestures.b(view2, mf.f.t(view2), b(view2));
                            } catch (Resources.NotFoundException unused) {
                                bVar = null;
                            }
                        } else if (aVar != io.sentry.internal.gestures.a.SCROLLABLE) {
                            bVar = null;
                        } else if (((!((Boolean) aVar2.f12228a.a()).booleanValue() ? false : ScrollingView.class.isAssignableFrom(view2.getClass())) || AbsListView.class.isAssignableFrom(view2.getClass()) || ScrollView.class.isAssignableFrom(view2.getClass())) && view2.getVisibility() == 0) {
                            bVar = new io.sentry.internal.gestures.b(view2, mf.f.t(view2), b(view2));
                        } else {
                            bVar = null;
                        }
                        if (bVar != null) {
                            if (aVar == io.sentry.internal.gestures.a.CLICKABLE) {
                                bVar2 = bVar;
                            } else if (aVar == io.sentry.internal.gestures.a.SCROLLABLE) {
                                return bVar;
                            }
                        }
                    }
                }
            }
        }
        return bVar2;
    }

    public static String b(View view) {
        int id2 = view.getId();
        if (id2 == -1 || (((-16777216) & id2) == 0 && (16777215 & id2) != 0)) {
            throw new Resources.NotFoundException();
        }
        Resources resources = view.getContext().getResources();
        return resources != null ? resources.getResourceEntryName(id2) : "";
    }
}
