package a1;

import android.content.res.Resources;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f34a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources.Theme f35b;

    public j(Resources resources, Resources.Theme theme) {
        this.f34a = resources;
        this.f35b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (this.f34a.equals(jVar.f34a) && Objects.equals(this.f35b, jVar.f35b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f34a, this.f35b);
    }
}
