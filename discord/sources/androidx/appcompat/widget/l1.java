package androidx.appcompat.widget;

import android.graphics.drawable.Drawable;
import com.facebook.react.uimanager.ViewProps;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f1022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Method f1023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Field f1024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Field f1025d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Field f1026e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Field f1027f;

    /* JADX WARN: Code duplicated, block: B:25:0x004b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0058  */
    static {
        Method method;
        Field field;
        Field field2;
        Field field3;
        Field field4;
        boolean z5;
        try {
            Class<?> cls = Class.forName("android.graphics.Insets");
            method = Drawable.class.getMethod("getOpticalInsets", null);
            try {
                field = cls.getField(ViewProps.LEFT);
                try {
                    field2 = cls.getField(ViewProps.TOP);
                    try {
                        field3 = cls.getField(ViewProps.RIGHT);
                        try {
                            field4 = cls.getField(ViewProps.BOTTOM);
                            z5 = true;
                        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused) {
                            field4 = null;
                            z5 = false;
                        }
                    } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused2) {
                        field3 = null;
                    }
                } catch (ClassNotFoundException unused3) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z5 = false;
                    if (z5) {
                        f1023b = method;
                        f1024c = field;
                        f1025d = field2;
                        f1026e = field3;
                        f1027f = field4;
                        f1022a = true;
                        return;
                    }
                    f1023b = null;
                    f1024c = null;
                    f1025d = null;
                    f1026e = null;
                    f1027f = null;
                    f1022a = false;
                } catch (NoSuchFieldException unused4) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z5 = false;
                    if (z5) {
                        f1023b = method;
                        f1024c = field;
                        f1025d = field2;
                        f1026e = field3;
                        f1027f = field4;
                        f1022a = true;
                        return;
                    }
                    f1023b = null;
                    f1024c = null;
                    f1025d = null;
                    f1026e = null;
                    f1027f = null;
                    f1022a = false;
                } catch (NoSuchMethodException unused5) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z5 = false;
                    if (z5) {
                        f1023b = method;
                        f1024c = field;
                        f1025d = field2;
                        f1026e = field3;
                        f1027f = field4;
                        f1022a = true;
                        return;
                    }
                    f1023b = null;
                    f1024c = null;
                    f1025d = null;
                    f1026e = null;
                    f1027f = null;
                    f1022a = false;
                }
            } catch (ClassNotFoundException unused6) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z5 = false;
                if (z5) {
                    f1023b = method;
                    f1024c = field;
                    f1025d = field2;
                    f1026e = field3;
                    f1027f = field4;
                    f1022a = true;
                    return;
                }
                f1023b = null;
                f1024c = null;
                f1025d = null;
                f1026e = null;
                f1027f = null;
                f1022a = false;
            } catch (NoSuchFieldException unused7) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z5 = false;
                if (z5) {
                    f1023b = method;
                    f1024c = field;
                    f1025d = field2;
                    f1026e = field3;
                    f1027f = field4;
                    f1022a = true;
                    return;
                }
                f1023b = null;
                f1024c = null;
                f1025d = null;
                f1026e = null;
                f1027f = null;
                f1022a = false;
            } catch (NoSuchMethodException unused8) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z5 = false;
                if (z5) {
                    f1023b = method;
                    f1024c = field;
                    f1025d = field2;
                    f1026e = field3;
                    f1027f = field4;
                    f1022a = true;
                    return;
                }
                f1023b = null;
                f1024c = null;
                f1025d = null;
                f1026e = null;
                f1027f = null;
                f1022a = false;
            }
        } catch (ClassNotFoundException unused9) {
            method = null;
            field = null;
        } catch (NoSuchFieldException unused10) {
            method = null;
            field = null;
        } catch (NoSuchMethodException unused11) {
            method = null;
            field = null;
        }
        if (z5) {
            f1023b = method;
            f1024c = field;
            f1025d = field2;
            f1026e = field3;
            f1027f = field4;
            f1022a = true;
            return;
        }
        f1023b = null;
        f1024c = null;
        f1025d = null;
        f1026e = null;
        f1027f = null;
        f1022a = false;
    }
}
