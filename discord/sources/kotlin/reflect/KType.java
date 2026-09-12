package kotlin.reflect;

import java.util.List;
import mo.b;
import mo.c;

/* JADX INFO: loaded from: classes3.dex */
public interface KType extends b {
    List getArguments();

    c getClassifier();

    boolean isMarkedNullable();
}
