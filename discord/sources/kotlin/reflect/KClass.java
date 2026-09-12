package kotlin.reflect;

import java.util.Collection;
import java.util.List;
import mo.b;
import mo.c;

/* JADX INFO: loaded from: classes3.dex */
public interface KClass extends KDeclarationContainer, b, c {
    Collection getMembers();

    String getQualifiedName();

    String getSimpleName();

    List getTypeParameters();

    int hashCode();

    boolean isInstance(Object obj);

    boolean isValue();
}
