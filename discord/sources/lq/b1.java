package lq;

import com.discord.misc.utilities.chat_view_types.ChatViewRecyclerTypes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nq.i f15178a = nq.l.c(nq.k.DONT_CARE, new String[0]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final nq.i f15179b = nq.l.c(nq.k.UNINFERRED_LAMBDA_PARAMETER_TYPE, new String[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a1 f15180c = new a1("NO_EXPECTED_TYPE");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a1 f15181d = new a1("UNIT_EXPECTED_TYPE");

    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    /* JADX WARN: Code duplicated, block: B:75:0x010b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0120  */
    public static /* synthetic */ void a(int i7) {
        String str;
        int i10;
        if (i7 != 4 && i7 != 9 && i7 != 11 && i7 != 15 && i7 != 17 && i7 != 19 && i7 != 26 && i7 != 35 && i7 != 48 && i7 != 53 && i7 != 6 && i7 != 7) {
            switch (i7) {
                case ChatViewRecyclerTypes.SHARED_CUSTOM_THEME_EMBED /* 56 */:
                case ChatViewRecyclerTypes.PREMIUM_GROUP_INVITE /* 57 */:
                case ChatViewRecyclerTypes.REFERRAL_REDESIGN /* 58 */:
                case ChatViewRecyclerTypes.VOICE_CHANNEL_LIST_INVITE /* 59 */:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i7 != 4 && i7 != 9 && i7 != 11 && i7 != 15 && i7 != 17 && i7 != 19 && i7 != 26 && i7 != 35 && i7 != 48 && i7 != 53 && i7 != 6 && i7 != 7) {
            switch (i7) {
                case ChatViewRecyclerTypes.SHARED_CUSTOM_THEME_EMBED /* 56 */:
                case ChatViewRecyclerTypes.PREMIUM_GROUP_INVITE /* 57 */:
                case ChatViewRecyclerTypes.REFERRAL_REDESIGN /* 58 */:
                case ChatViewRecyclerTypes.VOICE_CHANNEL_LIST_INVITE /* 59 */:
                    i10 = 2;
                    break;
                default:
                    i10 = 3;
                    break;
            }
        } else {
            i10 = 2;
        }
        Object[] objArr = new Object[i10];
        switch (i7) {
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case 15:
            case 17:
            case 19:
            case 26:
            case 35:
            case 48:
            case ChatViewRecyclerTypes.GUILD_PROFILE_INVITE /* 53 */:
            case ChatViewRecyclerTypes.SHARED_CUSTOM_THEME_EMBED /* 56 */:
            case ChatViewRecyclerTypes.PREMIUM_GROUP_INVITE /* 57 */:
            case ChatViewRecyclerTypes.REFERRAL_REDESIGN /* 58 */:
            case ChatViewRecyclerTypes.VOICE_CHANNEL_LIST_INVITE /* 59 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                break;
            case 5:
            case 8:
            case 10:
            case 18:
            case 23:
            case 25:
            case 27:
            case 28:
            case 29:
            case 30:
            case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
            case 40:
            default:
                objArr[0] = "type";
                break;
            case 12:
                objArr[0] = "typeConstructor";
                break;
            case 13:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 14:
                objArr[0] = "refinedTypeFactory";
                break;
            case 16:
                objArr[0] = "parameters";
                break;
            case 20:
                objArr[0] = "subType";
                break;
            case 21:
                objArr[0] = "superType";
                break;
            case 22:
                objArr[0] = "substitutor";
                break;
            case 24:
                objArr[0] = "result";
                break;
            case 31:
            case 33:
                objArr[0] = "clazz";
                break;
            case 32:
                objArr[0] = "typeArguments";
                break;
            case 34:
                objArr[0] = "projections";
                break;
            case 36:
                objArr[0] = "a";
                break;
            case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                objArr[0] = "b";
                break;
            case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
                objArr[0] = "typeParameters";
                break;
            case 41:
                objArr[0] = "typeParameterConstructors";
                break;
            case 42:
                objArr[0] = "specialType";
                break;
            case ChatViewRecyclerTypes.FORWARD_HEADER /* 43 */:
            case ChatViewRecyclerTypes.FORWARD_BREADCRUMB /* 44 */:
                objArr[0] = "isSpecialType";
                break;
            case ChatViewRecyclerTypes.REACTION_BURST_REACTION /* 45 */:
            case 46:
                objArr[0] = "parameterDescriptor";
                break;
            case ChatViewRecyclerTypes.REACTION_ADD_REACTION /* 47 */:
            case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_VISUAL_PLACEHOLDER /* 51 */:
                objArr[0] = "numberValueTypeConstructor";
                break;
            case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_IMAGE /* 49 */:
            case 50:
                objArr[0] = "supertypes";
                break;
            case ChatViewRecyclerTypes.REFERRAL /* 52 */:
            case ChatViewRecyclerTypes.ACTIVITY_RICH_PRESENCE_INVITE_EMBED /* 55 */:
                objArr[0] = "expectedType";
                break;
            case ChatViewRecyclerTypes.APP_MESSAGE_EMBED /* 54 */:
                objArr[0] = "literalTypeConstructor";
                break;
        }
        if (i7 == 4) {
            objArr[1] = "makeNullableAsSpecified";
        } else if (i7 == 9) {
            objArr[1] = "makeNullableIfNeeded";
        } else if (i7 == 11 || i7 == 15) {
            objArr[1] = "makeUnsubstitutedType";
        } else if (i7 == 17) {
            objArr[1] = "getDefaultTypeProjections";
        } else if (i7 == 19) {
            objArr[1] = "getImmediateSupertypes";
        } else if (i7 == 26) {
            objArr[1] = "getAllSupertypes";
        } else if (i7 == 35) {
            objArr[1] = "substituteProjectionsForParameters";
        } else if (i7 == 48) {
            objArr[1] = "getDefaultPrimitiveNumberType";
        } else if (i7 != 53) {
            if (i7 != 6 && i7 != 7) {
                switch (i7) {
                    case ChatViewRecyclerTypes.SHARED_CUSTOM_THEME_EMBED /* 56 */:
                    case ChatViewRecyclerTypes.PREMIUM_GROUP_INVITE /* 57 */:
                    case ChatViewRecyclerTypes.REFERRAL_REDESIGN /* 58 */:
                    case ChatViewRecyclerTypes.VOICE_CHANNEL_LIST_INVITE /* 59 */:
                        objArr[1] = "getPrimitiveNumberType";
                        break;
                    default:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                        break;
                }
            } else {
                objArr[1] = "makeNullableIfNeeded";
            }
        } else {
            objArr[1] = "getPrimitiveNumberType";
        }
        switch (i7) {
            case 1:
                objArr[2] = "makeNullable";
                break;
            case 2:
                objArr[2] = "makeNotNullable";
                break;
            case 3:
                objArr[2] = "makeNullableAsSpecified";
                break;
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case 15:
            case 17:
            case 19:
            case 26:
            case 35:
            case 48:
            case ChatViewRecyclerTypes.GUILD_PROFILE_INVITE /* 53 */:
            case ChatViewRecyclerTypes.SHARED_CUSTOM_THEME_EMBED /* 56 */:
            case ChatViewRecyclerTypes.PREMIUM_GROUP_INVITE /* 57 */:
            case ChatViewRecyclerTypes.REFERRAL_REDESIGN /* 58 */:
            case ChatViewRecyclerTypes.VOICE_CHANNEL_LIST_INVITE /* 59 */:
                break;
            case 5:
            case 8:
                objArr[2] = "makeNullableIfNeeded";
                break;
            case 10:
                objArr[2] = "canHaveSubtypes";
                break;
            case 12:
            case 13:
            case 14:
                objArr[2] = "makeUnsubstitutedType";
                break;
            case 16:
                objArr[2] = "getDefaultTypeProjections";
                break;
            case 18:
                objArr[2] = "getImmediateSupertypes";
                break;
            case 20:
            case 21:
            case 22:
                objArr[2] = "createSubstitutedSupertype";
                break;
            case 23:
            case 24:
                objArr[2] = "collectAllSupertypes";
                break;
            case 25:
                objArr[2] = "getAllSupertypes";
                break;
            case 27:
                objArr[2] = "isNullableType";
                break;
            case 28:
                objArr[2] = "acceptsNullable";
                break;
            case 29:
                objArr[2] = "hasNullableSuperType";
                break;
            case 30:
                objArr[2] = "getClassDescriptor";
                break;
            case 31:
            case 32:
                objArr[2] = "substituteParameters";
                break;
            case 33:
            case 34:
                objArr[2] = "substituteProjectionsForParameters";
                break;
            case 36:
            case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                objArr[2] = "equalTypes";
                break;
            case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
            case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
                objArr[2] = "dependsOnTypeParameters";
                break;
            case 40:
            case 41:
                objArr[2] = "dependsOnTypeConstructors";
                break;
            case 42:
            case ChatViewRecyclerTypes.FORWARD_HEADER /* 43 */:
            case ChatViewRecyclerTypes.FORWARD_BREADCRUMB /* 44 */:
                objArr[2] = "contains";
                break;
            case ChatViewRecyclerTypes.REACTION_BURST_REACTION /* 45 */:
            case 46:
                objArr[2] = "makeStarProjection";
                break;
            case ChatViewRecyclerTypes.REACTION_ADD_REACTION /* 47 */:
            case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_IMAGE /* 49 */:
                objArr[2] = "getDefaultPrimitiveNumberType";
                break;
            case 50:
                objArr[2] = "findByFqName";
                break;
            case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_VISUAL_PLACEHOLDER /* 51 */:
            case ChatViewRecyclerTypes.REFERRAL /* 52 */:
            case ChatViewRecyclerTypes.APP_MESSAGE_EMBED /* 54 */:
            case ChatViewRecyclerTypes.ACTIVITY_RICH_PRESENCE_INVITE_EMBED /* 55 */:
                objArr[2] = "getPrimitiveNumberType";
                break;
            case ChatViewRecyclerTypes.GIFT_INTENT /* 60 */:
                objArr[2] = "isTypeParameter";
                break;
            case 61:
                objArr[2] = "isReifiedTypeParameter";
                break;
            case 62:
                objArr[2] = "isNonReifiedTypeParameter";
                break;
            case 63:
                objArr[2] = "getTypeParameterDescriptorOrNull";
                break;
            default:
                objArr[2] = "noExpectedType";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i7 != 4 && i7 != 9 && i7 != 11 && i7 != 15 && i7 != 17 && i7 != 19 && i7 != 26 && i7 != 35 && i7 != 48 && i7 != 53 && i7 != 6 && i7 != 7) {
            switch (i7) {
                case ChatViewRecyclerTypes.SHARED_CUSTOM_THEME_EMBED /* 56 */:
                case ChatViewRecyclerTypes.PREMIUM_GROUP_INVITE /* 57 */:
                case ChatViewRecyclerTypes.REFERRAL_REDESIGN /* 58 */:
                case ChatViewRecyclerTypes.VOICE_CHANNEL_LIST_INVITE /* 59 */:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    public static boolean b(z zVar) {
        if (zVar == null) {
            a(28);
            throw null;
        }
        if (zVar.t0()) {
            return true;
        }
        if (!c.k(zVar)) {
            return false;
        }
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        d1 d1VarW0 = zVar.w0();
        Intrinsics.checkNotNull(d1VarW0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        return b(((s) d1VarW0).f15249i);
    }

    public static boolean c(z zVar, Function1 function1, vq.j jVar) {
        if (zVar == null) {
            return false;
        }
        d1 d1VarW0 = zVar.w0();
        if (l(zVar)) {
            return ((Boolean) function1.invoke(d1VarW0)).booleanValue();
        }
        if (jVar != null && jVar.contains(zVar)) {
            return false;
        }
        if (((Boolean) function1.invoke(d1VarW0)).booleanValue()) {
            return true;
        }
        if (jVar == null) {
            int i7 = vq.j.f21949i;
            jVar = vq.m.f();
        }
        jVar.add(zVar);
        s sVar = d1VarW0 instanceof s ? (s) d1VarW0 : null;
        if (sVar != null && (c(sVar.f15248e, function1, jVar) || c(sVar.f15249i, function1, jVar))) {
            return true;
        }
        if ((d1VarW0 instanceof o) && c(((o) d1VarW0).f15230e, function1, jVar)) {
            return true;
        }
        q0 q0VarR0 = zVar.r0();
        if (q0VarR0 instanceof y) {
            Iterator it = ((y) q0VarR0).f15265b.iterator();
            while (it.hasNext()) {
                if (c((z) it.next(), function1, jVar)) {
                    return true;
                }
            }
            return false;
        }
        for (t0 t0Var : zVar.l0()) {
            if (!t0Var.c() && c(t0Var.b(), function1, jVar)) {
                return true;
            }
        }
        return false;
    }

    public static List d(List list) {
        if (list == null) {
            a(16);
            throw null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new i0(((vo.r0) it.next()).j()));
        }
        List listI0 = CollectionsKt.i0(arrayList);
        if (listI0 != null) {
            return listI0;
        }
        a(17);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002c  */
    /* JADX WARN: Code duplicated, block: B:15:0x003a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0040  */
    /* JADX WARN: Code duplicated, block: B:20:0x004d  */
    /* JADX WARN: Code duplicated, block: B:23:0x006c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0074  */
    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0085  */
    /* JADX WARN: Code duplicated, block: B:36:0x009c  */
    /* JADX WARN: Code duplicated, block: B:40:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:? A[LOOP:1: B:34:0x0096->B:59:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x00cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:? A[LOOP:2: B:43:0x00ba->B:62:?, LOOP_END, SYNTHETIC] */
    public static boolean e(z zVar) {
        q0 q0VarR0;
        Iterator it;
        y0 y0VarD;
        ArrayList arrayList;
        Iterator it2;
        z zVarJ;
        z zVarH;
        if (zVar == null) {
            a(27);
            throw null;
        }
        if (!zVar.t0()) {
            if (!c.k(zVar)) {
                Intrinsics.checkNotNullParameter(zVar, "<this>");
                if (!(zVar.w0() instanceof o)) {
                    if (f(zVar)) {
                        if (!(zVar.r0().g() instanceof vo.f)) {
                            y0VarD = y0.d(zVar);
                            Collection<z> collectionH = zVar.r0().h();
                            arrayList = new ArrayList(collectionH.size());
                            for (z zVar2 : collectionH) {
                                if (zVar2 != null) {
                                    a(21);
                                    throw null;
                                }
                                zVarJ = y0VarD.j(zVar2, e1.INVARIANT);
                                if (zVarJ != null) {
                                    zVarH = h(zVarJ, zVar.t0());
                                } else {
                                    zVarH = null;
                                }
                                if (zVarH != null) {
                                    arrayList.add(zVarH);
                                }
                            }
                            it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                if (e((z) it2.next())) {
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                    q0VarR0 = zVar.r0();
                    if (q0VarR0 instanceof y) {
                        it = ((y) q0VarR0).f15265b.iterator();
                        while (it.hasNext()) {
                            if (e((z) it.next())) {
                            }
                        }
                    }
                }
                return false;
            }
            Intrinsics.checkNotNullParameter(zVar, "<this>");
            d1 d1VarW0 = zVar.w0();
            Intrinsics.checkNotNull(d1VarW0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
            if (!e(((s) d1VarW0).f15249i)) {
                Intrinsics.checkNotNullParameter(zVar, "<this>");
                if (!(zVar.w0() instanceof o)) {
                    if (f(zVar)) {
                        if (!(zVar.r0().g() instanceof vo.f)) {
                            y0VarD = y0.d(zVar);
                            Collection<z> collectionH2 = zVar.r0().h();
                            arrayList = new ArrayList(collectionH2.size());
                            while (r4.hasNext()) {
                                if (zVar2 != null) {
                                    a(21);
                                    throw null;
                                }
                                zVarJ = y0VarD.j(zVar2, e1.INVARIANT);
                                if (zVarJ != null) {
                                    zVarH = h(zVarJ, zVar.t0());
                                } else {
                                    zVarH = null;
                                }
                                if (zVarH != null) {
                                    arrayList.add(zVarH);
                                }
                            }
                            it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                if (e((z) it2.next())) {
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                    q0VarR0 = zVar.r0();
                    if (q0VarR0 instanceof y) {
                        it = ((y) q0VarR0).f15265b.iterator();
                        while (it.hasNext()) {
                            if (e((z) it.next())) {
                            }
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    public static boolean f(z zVar) {
        if (zVar == null) {
            a(60);
            throw null;
        }
        if ((zVar.r0().g() instanceof vo.r0 ? (vo.r0) zVar.r0().g() : null) != null) {
            return true;
        }
        zVar.r0();
        return false;
    }

    public static d1 g(z zVar, boolean z5) {
        if (zVar == null) {
            a(3);
            throw null;
        }
        d1 d1VarX0 = zVar.w0().x0(z5);
        if (d1VarX0 != null) {
            return d1VarX0;
        }
        a(4);
        throw null;
    }

    public static z h(z zVar, boolean z5) {
        if (zVar != null) {
            return z5 ? g(zVar, true) : zVar;
        }
        a(8);
        throw null;
    }

    public static d0 i(d0 d0Var, boolean z5) {
        if (d0Var == null) {
            a(5);
            throw null;
        }
        if (!z5) {
            return d0Var;
        }
        d0 d0VarA0 = d0Var.x0(true);
        if (d0VarA0 != null) {
            return d0VarA0;
        }
        a(6);
        throw null;
    }

    public static i0 j(vo.r0 r0Var) {
        if (r0Var != null) {
            return new i0(r0Var);
        }
        a(45);
        throw null;
    }

    public static t0 k(vo.r0 r0Var, jp.a aVar) {
        if (r0Var != null) {
            return aVar.f13990a == z0.f15270d ? new i0(c.x(r0Var)) : new i0(r0Var);
        }
        a(46);
        throw null;
    }

    public static boolean l(z zVar) {
        if (zVar != null) {
            return zVar == f15180c || zVar == f15181d;
        }
        a(0);
        throw null;
    }
}
