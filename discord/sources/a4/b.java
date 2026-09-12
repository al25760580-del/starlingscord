package a4;

/* JADX INFO: loaded from: classes.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f121a;

    public b(int i7) {
        this.f121a = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f121a == ((b) obj).f121a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f121a);
    }

    public final String toString() {
        return com.discord.chat.presentation.list.a.j(new StringBuilder("ConstraintsNotMet(reason="), this.f121a, ')');
    }
}
