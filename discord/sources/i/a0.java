package i;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class a0 implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f11144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f11145e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Method f11146i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Context f11147v;

    public a0(View view, String str) {
        this.f11144d = view;
        this.f11145e = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.f11146i != null) {
            break;
        }
        View view2 = this.f11144d;
        Context context = view2.getContext();
        while (true) {
            String str2 = this.f11145e;
            if (context == null) {
                int id2 = view2.getId();
                if (id2 == -1) {
                    str = "";
                } else {
                    str = " with id '" + view2.getContext().getResources().getResourceEntryName(id2) + "'";
                }
                StringBuilder sbN = com.discord.chat.presentation.list.a.n("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                sbN.append(view2.getClass());
                sbN.append(str);
                throw new IllegalStateException(sbN.toString());
            }
            try {
                if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                    this.f11146i = method;
                    this.f11147v = context;
                    break;
                }
            } catch (NoSuchMethodException unused) {
            }
            context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
        }
        try {
            this.f11146i.invoke(this.f11147v, view);
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e10);
        } catch (InvocationTargetException e11) {
            throw new IllegalStateException("Could not execute method for android:onClick", e11);
        }
    }
}
