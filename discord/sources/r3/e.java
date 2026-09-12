package r3;

import androidx.core.view.h;
import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f19197a;

    static {
        f aVar;
        try {
            WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface = (WebViewProviderFactoryBoundaryInterface) zs.a.j(WebViewProviderFactoryBoundaryInterface.class, h.e());
            ph.c cVar = new ph.c();
            cVar.f18031d = webViewProviderFactoryBoundaryInterface;
            aVar = cVar;
        } catch (ClassNotFoundException unused) {
            aVar = new a();
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (NoSuchMethodException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
        f19197a = aVar;
    }
}
