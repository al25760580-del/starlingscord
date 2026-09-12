package iq;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.x;
import vp.g;
import vp.m;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends gq.a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f13401m;

    static {
        g gVar = new g();
        qp.b.a(gVar);
        Intrinsics.checkNotNullExpressionValue(gVar, "apply(...)");
        m packageFqName = qp.b.f18979a;
        Intrinsics.checkNotNullExpressionValue(packageFqName, "packageFqName");
        m constructorAnnotation = qp.b.f18981c;
        Intrinsics.checkNotNullExpressionValue(constructorAnnotation, "constructorAnnotation");
        m classAnnotation = qp.b.f18980b;
        Intrinsics.checkNotNullExpressionValue(classAnnotation, "classAnnotation");
        m functionAnnotation = qp.b.f18982d;
        Intrinsics.checkNotNullExpressionValue(functionAnnotation, "functionAnnotation");
        m propertyAnnotation = qp.b.f18983e;
        Intrinsics.checkNotNullExpressionValue(propertyAnnotation, "propertyAnnotation");
        m propertyGetterAnnotation = qp.b.f18984f;
        Intrinsics.checkNotNullExpressionValue(propertyGetterAnnotation, "propertyGetterAnnotation");
        m propertySetterAnnotation = qp.b.f18985g;
        Intrinsics.checkNotNullExpressionValue(propertySetterAnnotation, "propertySetterAnnotation");
        m enumEntryAnnotation = qp.b.f18987i;
        Intrinsics.checkNotNullExpressionValue(enumEntryAnnotation, "enumEntryAnnotation");
        m compileTimeValue = qp.b.f18986h;
        Intrinsics.checkNotNullExpressionValue(compileTimeValue, "compileTimeValue");
        m parameterAnnotation = qp.b.j;
        Intrinsics.checkNotNullExpressionValue(parameterAnnotation, "parameterAnnotation");
        m typeAnnotation = qp.b.k;
        Intrinsics.checkNotNullExpressionValue(typeAnnotation, "typeAnnotation");
        m typeParameterAnnotation = qp.b.f18988l;
        Intrinsics.checkNotNullExpressionValue(typeParameterAnnotation, "typeParameterAnnotation");
        f13401m = new a(gVar, packageFqName, constructorAnnotation, classAnnotation, functionAnnotation, propertyAnnotation, propertyGetterAnnotation, propertySetterAnnotation, enumEntryAnnotation, compileTimeValue, parameterAnnotation, typeAnnotation, typeParameterAnnotation);
    }

    public static String a(up.c fqName) {
        String strB;
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(x.m(fqName.f21262a.f21265a, '.', '/'));
        sb2.append('/');
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        StringBuilder sb3 = new StringBuilder();
        up.d dVar = fqName.f21262a;
        if (dVar.c()) {
            strB = "default-package";
        } else {
            strB = dVar.f().b();
            Intrinsics.checkNotNullExpressionValue(strB, "asString(...)");
        }
        sb3.append(strB);
        sb3.append(".kotlin_builtins");
        sb2.append(sb3.toString());
        return sb2.toString();
    }
}
