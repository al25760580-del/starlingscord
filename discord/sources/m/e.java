package m;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import androidx.appcompat.widget.n1;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import n.m;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class e extends MenuInflater {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Class[] f15328e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Class[] f15329f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f15330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f15331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f15332c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f15333d;

    static {
        Class[] clsArr = {Context.class};
        f15328e = clsArr;
        f15329f = clsArr;
    }

    public e(Context context) {
        super(context);
        this.f15332c = context;
        Object[] objArr = {context};
        this.f15330a = objArr;
        this.f15331b = objArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i7;
        ColorStateList colorStateList;
        int resourceId;
        d dVar = new d(this, menu);
        int eventType = xmlPullParser.getEventType();
        do {
            i7 = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlPullParser.next();
                break;
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        boolean z5 = false;
        boolean z6 = false;
        String str = null;
        while (!z5) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType == i7) {
                if (!z6) {
                    String name2 = xmlPullParser.getName();
                    boolean zEquals = name2.equals("group");
                    Context context = this.f15332c;
                    if (zEquals) {
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.a.f10266p);
                        dVar.f15305b = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                        dVar.f15306c = typedArrayObtainStyledAttributes.getInt(3, 0);
                        dVar.f15307d = typedArrayObtainStyledAttributes.getInt(4, 0);
                        dVar.f15308e = typedArrayObtainStyledAttributes.getInt(5, 0);
                        dVar.f15309f = typedArrayObtainStyledAttributes.getBoolean(2, true);
                        dVar.f15310g = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                    } else if (name2.equals("item")) {
                        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, h.a.f10267q);
                        dVar.f15312i = typedArrayObtainStyledAttributes2.getResourceId(2, 0);
                        dVar.j = (typedArrayObtainStyledAttributes2.getInt(5, dVar.f15306c) & (-65536)) | (typedArrayObtainStyledAttributes2.getInt(6, dVar.f15307d) & 65535);
                        dVar.k = typedArrayObtainStyledAttributes2.getText(7);
                        dVar.f15313l = typedArrayObtainStyledAttributes2.getText(8);
                        dVar.f15314m = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                        String string = typedArrayObtainStyledAttributes2.getString(9);
                        dVar.f15315n = string == null ? (char) 0 : string.charAt(0);
                        dVar.f15316o = typedArrayObtainStyledAttributes2.getInt(16, RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT);
                        String string2 = typedArrayObtainStyledAttributes2.getString(10);
                        dVar.f15317p = string2 == null ? (char) 0 : string2.charAt(0);
                        dVar.f15318q = typedArrayObtainStyledAttributes2.getInt(20, RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT);
                        if (typedArrayObtainStyledAttributes2.hasValue(11)) {
                            dVar.f15319r = typedArrayObtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                        } else {
                            dVar.f15319r = dVar.f15308e;
                        }
                        dVar.f15320s = typedArrayObtainStyledAttributes2.getBoolean(3, false);
                        dVar.f15321t = typedArrayObtainStyledAttributes2.getBoolean(4, dVar.f15309f);
                        dVar.f15322u = typedArrayObtainStyledAttributes2.getBoolean(1, dVar.f15310g);
                        dVar.f15323v = typedArrayObtainStyledAttributes2.getInt(21, -1);
                        dVar.f15326y = typedArrayObtainStyledAttributes2.getString(12);
                        dVar.f15324w = typedArrayObtainStyledAttributes2.getResourceId(13, 0);
                        dVar.f15325x = typedArrayObtainStyledAttributes2.getString(15);
                        String string3 = typedArrayObtainStyledAttributes2.getString(14);
                        boolean z7 = string3 != null;
                        if (z7 && dVar.f15324w == 0 && dVar.f15325x == null) {
                            dVar.f15327z = (m) dVar.a(string3, f15329f, this.f15331b);
                        } else {
                            if (z7) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            dVar.f15327z = null;
                        }
                        dVar.A = typedArrayObtainStyledAttributes2.getText(17);
                        dVar.B = typedArrayObtainStyledAttributes2.getText(22);
                        if (typedArrayObtainStyledAttributes2.hasValue(19)) {
                            dVar.D = n1.c(typedArrayObtainStyledAttributes2.getInt(19, -1), dVar.D);
                        } else {
                            dVar.D = null;
                        }
                        if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                            if (!typedArrayObtainStyledAttributes2.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = y0.b.c(context, resourceId)) == null) {
                                colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(18);
                            }
                            dVar.C = colorStateList;
                        } else {
                            dVar.C = null;
                        }
                        typedArrayObtainStyledAttributes2.recycle();
                        dVar.f15311h = false;
                        xmlPullParser = xmlPullParser;
                    } else if (name2.equals("menu")) {
                        dVar.f15311h = true;
                        SubMenu subMenuAddSubMenu = dVar.f15304a.addSubMenu(dVar.f15305b, dVar.f15312i, dVar.j, dVar.k);
                        dVar.b(subMenuAddSubMenu.getItem());
                        xmlPullParser = xmlPullParser;
                        b(xmlPullParser, attributeSet, subMenuAddSubMenu);
                    } else {
                        xmlPullParser = xmlPullParser;
                        str = name2;
                        z6 = true;
                    }
                }
                z5 = z5;
            } else if (eventType != 3) {
                z5 = z5;
            } else {
                String name3 = xmlPullParser.getName();
                if (z6 && name3.equals(str)) {
                    xmlPullParser = xmlPullParser;
                    z6 = false;
                    str = null;
                } else {
                    if (name3.equals("group")) {
                        dVar.f15305b = 0;
                        dVar.f15306c = 0;
                        dVar.f15307d = 0;
                        dVar.f15308e = 0;
                        dVar.f15309f = true;
                        dVar.f15310g = true;
                    } else if (name3.equals("item")) {
                        if (!dVar.f15311h) {
                            m mVar = dVar.f15327z;
                            if (mVar == null || !mVar.f16192b.hasSubMenu()) {
                                dVar.f15311h = true;
                                dVar.b(dVar.f15304a.add(dVar.f15305b, dVar.f15312i, dVar.j, dVar.k));
                            } else {
                                dVar.f15311h = true;
                                dVar.b(dVar.f15304a.addSubMenu(dVar.f15305b, dVar.f15312i, dVar.j, dVar.k).getItem());
                            }
                        }
                    } else if (name3.equals("menu")) {
                        z5 = true;
                    }
                    z5 = z5;
                }
            }
            eventType = xmlPullParser.next();
            i7 = 2;
            z5 = z5;
            z6 = z6;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i7, Menu menu) {
        if (!(menu instanceof n.j)) {
            super.inflate(i7, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z5 = false;
        try {
            try {
                layout = this.f15332c.getResources().getLayout(i7);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof n.j) {
                    n.j jVar = (n.j) menu;
                    if (!jVar.f16155p) {
                        jVar.w();
                        z5 = true;
                    }
                }
                b(layout, attributeSetAsAttributeSet, menu);
                if (z5) {
                    ((n.j) menu).v();
                }
                layout.close();
            } catch (IOException e10) {
                throw new InflateException("Error inflating menu XML", e10);
            } catch (XmlPullParserException e11) {
                throw new InflateException("Error inflating menu XML", e11);
            }
        } catch (Throwable th2) {
            if (z5) {
                ((n.j) menu).v();
            }
            if (layout != null) {
                layout.close();
            }
            throw th2;
        }
    }
}
