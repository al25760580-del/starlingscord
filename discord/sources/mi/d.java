package mi;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements xi.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15807b;

    public /* synthetic */ d(int i7, Object obj) {
        this.f15806a = i7;
        this.f15807b = obj;
    }

    @Override // xi.a
    public final Object get() {
        switch (this.f15806a) {
            case 0:
                String str = (String) this.f15807b;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new l("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e10) {
                    throw new l(s0.g.e("Could not instantiate ", str, "."), e10);
                } catch (InstantiationException e11) {
                    throw new l(s0.g.e("Could not instantiate ", str, "."), e11);
                } catch (NoSuchMethodException e12) {
                    throw new l(a3.e.l("Could not instantiate ", str), e12);
                } catch (InvocationTargetException e13) {
                    throw new l(a3.e.l("Could not instantiate ", str), e13);
                }
            case 1:
                return (ComponentRegistrar) this.f15807b;
            default:
                return new zi.b((ji.f) this.f15807b);
        }
    }
}
