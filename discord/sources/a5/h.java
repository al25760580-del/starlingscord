package a5;

import java.io.IOException;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f189b;

    public void a(StringBuilder sb2, AbstractCollection abstractCollection) {
        Iterator it = abstractCollection.iterator();
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                sb2.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb2.append((CharSequence) this.f189b);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    sb2.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public String toString() {
        switch (this.f188a) {
            case 2:
                return s0.g.g(new StringBuilder("<"), this.f189b, '>');
            default:
                return super.toString();
        }
    }

    public h(String str, int i7) {
        this.f188a = i7;
        switch (i7) {
            case 2:
                this.f189b = str;
                break;
            default:
                str.getClass();
                this.f189b = str;
                break;
        }
    }
}
