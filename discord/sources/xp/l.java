package xp;

import com.discord.misc.utilities.chat_view_types.ChatViewRecyclerTypes;
import com.facebook.react.devsupport.StackTraceHelper;
import com.swmansion.reanimated.BuildConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.ServiceLoader;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lq.d1;
import lq.p0;
import lq.z;
import mo.c0;
import vo.k0;
import vo.l0;
import vo.p;
import vo.r0;
import vo.u;
import vo.y;
import yo.f0;
import yo.h0;
import yo.j0;
import yo.q0;
import yo.s;
import yo.t;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f23011b = CollectionsKt.i0(ServiceLoader.load(f.class, f.class.getClassLoader()));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f23012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f23013d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mq.c f23014a;

    static {
        c cVar = new c();
        f23013d = cVar;
        f23012c = new l(cVar);
    }

    public l(mq.c cVar) {
        if (cVar != null) {
            this.f23014a = cVar;
        } else {
            a(5);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:17:0x0035 A[FALL_THROUGH] */
    public static /* synthetic */ void a(int i7) {
        String str;
        int i10;
        if (i7 != 11 && i7 != 12 && i7 != 16 && i7 != 21 && i7 != 93 && i7 != 96 && i7 != 101 && i7 != 42 && i7 != 43) {
            switch (i7) {
                default:
                    switch (i7) {
                        default:
                            switch (i7) {
                                default:
                                    switch (i7) {
                                        case 88:
                                        case 89:
                                        case 90:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                            str = "@NotNull method %s.%s must not return null";
                            break;
                    }
                case 24:
                case 25:
                case 26:
                case 27:
                    str = "@NotNull method %s.%s must not return null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i7 != 11 && i7 != 12 && i7 != 16 && i7 != 21 && i7 != 93 && i7 != 96 && i7 != 101 && i7 != 42 && i7 != 43) {
            switch (i7) {
                case 24:
                case 25:
                case 26:
                case 27:
                    i10 = 2;
                    break;
                default:
                    switch (i7) {
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                            i10 = 2;
                            break;
                        default:
                            switch (i7) {
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    i10 = 2;
                                    break;
                                default:
                                    switch (i7) {
                                        case 88:
                                        case 89:
                                        case 90:
                                            i10 = 2;
                                            break;
                                        default:
                                            i10 = 3;
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            i10 = 2;
        }
        Object[] objArr = new Object[i10];
        switch (i7) {
            case 1:
            case 7:
                objArr[0] = "kotlinTypePreparator";
                break;
            case 2:
                objArr[0] = "customSubtype";
                break;
            case 3:
            case 6:
            default:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 4:
                objArr[0] = "equalityAxioms";
                break;
            case 5:
                objArr[0] = "axioms";
                break;
            case 8:
            case 9:
                objArr[0] = "candidateSet";
                break;
            case 10:
                objArr[0] = "transformFirst";
                break;
            case 11:
            case 12:
            case 16:
            case 21:
            case 24:
            case 25:
            case 26:
            case 27:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
            case 42:
            case ChatViewRecyclerTypes.FORWARD_HEADER /* 43 */:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 88:
            case 89:
            case 90:
            case 93:
            case 96:
            case 101:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                break;
            case 13:
                objArr[0] = "f";
                break;
            case 14:
                objArr[0] = "g";
                break;
            case 15:
            case 17:
                objArr[0] = "descriptor";
                break;
            case 18:
                objArr[0] = "result";
                break;
            case 19:
            case 22:
            case 28:
            case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
                objArr[0] = "superDescriptor";
                break;
            case 20:
            case 23:
            case 29:
            case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
                objArr[0] = "subDescriptor";
                break;
            case 40:
                objArr[0] = "firstParameters";
                break;
            case 41:
                objArr[0] = "secondParameters";
                break;
            case ChatViewRecyclerTypes.FORWARD_BREADCRUMB /* 44 */:
                objArr[0] = "typeInSuper";
                break;
            case ChatViewRecyclerTypes.REACTION_BURST_REACTION /* 45 */:
                objArr[0] = "typeInSub";
                break;
            case 46:
            case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_IMAGE /* 49 */:
            case 75:
                objArr[0] = "typeCheckerState";
                break;
            case ChatViewRecyclerTypes.REACTION_ADD_REACTION /* 47 */:
                objArr[0] = "superTypeParameter";
                break;
            case 48:
                objArr[0] = "subTypeParameter";
                break;
            case 50:
                objArr[0] = StackTraceHelper.NAME_KEY;
                break;
            case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_VISUAL_PLACEHOLDER /* 51 */:
                objArr[0] = "membersFromSupertypes";
                break;
            case ChatViewRecyclerTypes.REFERRAL /* 52 */:
                objArr[0] = "membersFromCurrent";
                break;
            case ChatViewRecyclerTypes.GUILD_PROFILE_INVITE /* 53 */:
            case ChatViewRecyclerTypes.VOICE_CHANNEL_LIST_INVITE /* 59 */:
            case 62:
            case 84:
            case 87:
            case 94:
                objArr[0] = "current";
                break;
            case ChatViewRecyclerTypes.APP_MESSAGE_EMBED /* 54 */:
            case ChatViewRecyclerTypes.GIFT_INTENT /* 60 */:
            case 64:
            case 85:
            case 104:
                objArr[0] = "strategy";
                break;
            case ChatViewRecyclerTypes.ACTIVITY_RICH_PRESENCE_INVITE_EMBED /* 55 */:
                objArr[0] = "overriding";
                break;
            case ChatViewRecyclerTypes.SHARED_CUSTOM_THEME_EMBED /* 56 */:
                objArr[0] = "fromSuper";
                break;
            case ChatViewRecyclerTypes.PREMIUM_GROUP_INVITE /* 57 */:
                objArr[0] = "fromCurrent";
                break;
            case ChatViewRecyclerTypes.REFERRAL_REDESIGN /* 58 */:
                objArr[0] = "descriptorsFromSuper";
                break;
            case 61:
            case 63:
                objArr[0] = "notOverridden";
                break;
            case 65:
            case 67:
            case 71:
                objArr[0] = "a";
                break;
            case 66:
            case 68:
            case 73:
                objArr[0] = "b";
                break;
            case 69:
                objArr[0] = "candidate";
                break;
            case 70:
            case BuildConfig.REACT_NATIVE_MINOR_VERSION /* 86 */:
            case 91:
            case 107:
                objArr[0] = "descriptors";
                break;
            case 72:
                objArr[0] = "aReturnType";
                break;
            case 74:
                objArr[0] = "bReturnType";
                break;
            case 76:
            case 83:
                objArr[0] = "overridables";
                break;
            case 77:
            case 99:
                objArr[0] = "descriptorByHandle";
                break;
            case 92:
                objArr[0] = "classModality";
                break;
            case 95:
                objArr[0] = "toFilter";
                break;
            case 97:
            case 102:
                objArr[0] = "overrider";
                break;
            case 98:
            case 103:
                objArr[0] = "extractFrom";
                break;
            case 100:
                objArr[0] = "onConflict";
                break;
            case 105:
            case 106:
                objArr[0] = "memberDescriptor";
                break;
        }
        if (i7 == 11 || i7 == 12) {
            objArr[1] = "filterOverrides";
        } else if (i7 == 16) {
            objArr[1] = "getOverriddenDeclarations";
        } else if (i7 == 21) {
            objArr[1] = "isOverridableBy";
        } else if (i7 == 93) {
            objArr[1] = "getMinimalModality";
        } else if (i7 == 96) {
            objArr[1] = "filterVisibleFakeOverrides";
        } else if (i7 == 101) {
            objArr[1] = "extractMembersOverridableInBothWays";
        } else if (i7 != 42 && i7 != 43) {
            switch (i7) {
                case 24:
                case 25:
                case 26:
                case 27:
                    objArr[1] = "isOverridableBy";
                    break;
                default:
                    switch (i7) {
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                            objArr[1] = "isOverridableByWithoutExternalConditions";
                            break;
                        default:
                            switch (i7) {
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    objArr[1] = "selectMostSpecificMember";
                                    break;
                                default:
                                    switch (i7) {
                                        case 88:
                                        case 89:
                                        case 90:
                                            objArr[1] = "determineModalityForFakeOverride";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            objArr[1] = "createTypeCheckerState";
        }
        switch (i7) {
            case 1:
            case 2:
                objArr[2] = "createWithTypePreparatorAndCustomSubtype";
                break;
            case 3:
            case 4:
                objArr[2] = "create";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "<init>";
                break;
            case 8:
                objArr[2] = "filterOutOverridden";
                break;
            case 9:
            case 10:
                objArr[2] = "filterOverrides";
                break;
            case 11:
            case 12:
            case 16:
            case 21:
            case 24:
            case 25:
            case 26:
            case 27:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
            case 42:
            case ChatViewRecyclerTypes.FORWARD_HEADER /* 43 */:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 88:
            case 89:
            case 90:
            case 93:
            case 96:
            case 101:
                break;
            case 13:
            case 14:
                objArr[2] = "overrides";
                break;
            case 15:
                objArr[2] = "getOverriddenDeclarations";
                break;
            case 17:
            case 18:
                objArr[2] = "collectOverriddenDeclarations";
                break;
            case 19:
            case 20:
            case 22:
            case 23:
                objArr[2] = "isOverridableBy";
                break;
            case 28:
            case 29:
                objArr[2] = "isOverridableByWithoutExternalConditions";
                break;
            case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
            case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
                objArr[2] = "getBasicOverridabilityProblem";
                break;
            case 40:
            case 41:
                objArr[2] = "createTypeCheckerState";
                break;
            case ChatViewRecyclerTypes.FORWARD_BREADCRUMB /* 44 */:
            case ChatViewRecyclerTypes.REACTION_BURST_REACTION /* 45 */:
            case 46:
                objArr[2] = "areTypesEquivalent";
                break;
            case ChatViewRecyclerTypes.REACTION_ADD_REACTION /* 47 */:
            case 48:
            case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_IMAGE /* 49 */:
                objArr[2] = "areTypeParametersEquivalent";
                break;
            case 50:
            case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_VISUAL_PLACEHOLDER /* 51 */:
            case ChatViewRecyclerTypes.REFERRAL /* 52 */:
            case ChatViewRecyclerTypes.GUILD_PROFILE_INVITE /* 53 */:
            case ChatViewRecyclerTypes.APP_MESSAGE_EMBED /* 54 */:
                objArr[2] = "generateOverridesInFunctionGroup";
                break;
            case ChatViewRecyclerTypes.ACTIVITY_RICH_PRESENCE_INVITE_EMBED /* 55 */:
            case ChatViewRecyclerTypes.SHARED_CUSTOM_THEME_EMBED /* 56 */:
                objArr[2] = "isVisibleForOverride";
                break;
            case ChatViewRecyclerTypes.PREMIUM_GROUP_INVITE /* 57 */:
            case ChatViewRecyclerTypes.REFERRAL_REDESIGN /* 58 */:
            case ChatViewRecyclerTypes.VOICE_CHANNEL_LIST_INVITE /* 59 */:
            case ChatViewRecyclerTypes.GIFT_INTENT /* 60 */:
                objArr[2] = "extractAndBindOverridesForMember";
                break;
            case 61:
                objArr[2] = "allHasSameContainingDeclaration";
                break;
            case 62:
            case 63:
            case 64:
                objArr[2] = "createAndBindFakeOverrides";
                break;
            case 65:
            case 66:
                objArr[2] = "isMoreSpecific";
                break;
            case 67:
            case 68:
                objArr[2] = "isVisibilityMoreSpecific";
                break;
            case 69:
            case 70:
                objArr[2] = "isMoreSpecificThenAllOf";
                break;
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
                objArr[2] = "isReturnTypeMoreSpecific";
                break;
            case 76:
            case 77:
                objArr[2] = "selectMostSpecificMember";
                break;
            case 83:
            case 84:
            case 85:
                objArr[2] = "createAndBindFakeOverride";
                break;
            case BuildConfig.REACT_NATIVE_MINOR_VERSION /* 86 */:
            case 87:
                objArr[2] = "determineModalityForFakeOverride";
                break;
            case 91:
            case 92:
                objArr[2] = "getMinimalModality";
                break;
            case 94:
            case 95:
                objArr[2] = "filterVisibleFakeOverrides";
                break;
            case 97:
            case 98:
            case 99:
            case 100:
            case 102:
            case 103:
            case 104:
                objArr[2] = "extractMembersOverridableInBothWays";
                break;
            case 105:
                objArr[2] = "resolveUnknownVisibilityForMember";
                break;
            case 106:
                objArr[2] = "computeVisibilityToInherit";
                break;
            case 107:
                objArr[2] = "findMaxVisibility";
                break;
            default:
                objArr[2] = "createWithTypeRefiner";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i7 != 11 && i7 != 12 && i7 != 16 && i7 != 21 && i7 != 93 && i7 != 96 && i7 != 101 && i7 != 42 && i7 != 43) {
            switch (i7) {
                case 24:
                case 25:
                case 26:
                case 27:
                    break;
                default:
                    switch (i7) {
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                            break;
                        default:
                            switch (i7) {
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    break;
                                default:
                                    switch (i7) {
                                        case 88:
                                        case 89:
                                        case 90:
                                            break;
                                        default:
                                            throw new IllegalArgumentException(str2);
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        throw new IllegalStateException(str2);
    }

    public static boolean b(z zVar, z zVar2, p0 p0Var) {
        if (zVar == null) {
            a(44);
            throw null;
        }
        if (zVar2 == null) {
            a(45);
            throw null;
        }
        if (lq.c.j(zVar) && lq.c.j(zVar2)) {
            return true;
        }
        return lq.f.g(p0Var, zVar.w0(), zVar2.w0());
    }

    public static void c(vo.d dVar, LinkedHashSet linkedHashSet) {
        if (dVar == null) {
            a(17);
            throw null;
        }
        vo.c cVarC = dVar.c();
        cVarC.getClass();
        if (cVarC != vo.c.f21793e) {
            linkedHashSet.add(dVar);
            return;
        }
        if (dVar.h().isEmpty()) {
            throw new IllegalStateException("No overridden descriptors found for (fake override) " + dVar);
        }
        Iterator it = dVar.h().iterator();
        while (it.hasNext()) {
            c((vo.d) it.next(), linkedHashSet);
        }
    }

    public static ArrayList d(vo.b bVar) {
        t tVarV = bVar.V();
        ArrayList arrayList = new ArrayList();
        if (tVarV != null) {
            arrayList.add(tVarV.getType());
        }
        Iterator it = bVar.L().iterator();
        while (it.hasNext()) {
            arrayList.add(((q0) it.next()).getType());
        }
        return arrayList;
    }

    public static void e(Collection collection, vo.f fVar, c0 c0Var) {
        y yVar;
        if (collection == null) {
            a(83);
            throw null;
        }
        if (fVar == null) {
            a(84);
            throw null;
        }
        ArrayList arrayListH = CollectionsKt.H(collection, new jp.f(fVar));
        boolean zIsEmpty = arrayListH.isEmpty();
        if (!zIsEmpty) {
            collection = arrayListH;
        }
        Iterator it = collection.iterator();
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        while (true) {
            if (!it.hasNext()) {
                if (fVar.y() && fVar.e() != y.f21855w && fVar.e() != y.f21853i) {
                    z5 = true;
                }
                if (z6 && !z7) {
                    yVar = y.f21854v;
                    break;
                }
                if (!z6 && z7) {
                    y yVarE = z5 ? fVar.e() : y.f21855w;
                    if (yVarE != null) {
                        yVar = yVarE;
                        break;
                    } else {
                        a(90);
                        throw null;
                    }
                }
                HashSet<vo.d> hashSet = new HashSet();
                for (vo.d dVar : collection) {
                    if (dVar == null) {
                        a(15);
                        throw null;
                    }
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    c(dVar, linkedHashSet);
                    hashSet.addAll(linkedHashSet);
                }
                if (!hashSet.isEmpty()) {
                    vo.z zVarJ = bq.e.j((vo.l) hashSet.iterator().next());
                    Intrinsics.checkNotNullParameter(zVarJ, "<this>");
                    if (zVarJ.c0(mq.g.f16019a) != null) {
                        throw new ClassCastException();
                    }
                }
                if (hashSet.size() > 1) {
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                    for (Object obj : hashSet) {
                        Iterator it2 = linkedHashSet2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                linkedHashSet2.add(obj);
                                break;
                            }
                            vo.b bVar = (vo.b) obj;
                            vo.b bVar2 = (vo.b) it2.next();
                            if (!q(bVar, bVar2)) {
                                if (q(bVar2, bVar)) {
                                    break;
                                }
                            } else {
                                it2.remove();
                            }
                        }
                    }
                    hashSet = linkedHashSet2;
                }
                y yVarE2 = fVar.e();
                if (yVarE2 == null) {
                    a(92);
                    throw null;
                }
                y yVar2 = y.f21855w;
                for (vo.d dVar2 : hashSet) {
                    y yVarE3 = (z5 && dVar2.e() == y.f21855w) ? yVarE2 : dVar2.e();
                    if (yVarE3.compareTo(yVar2) < 0) {
                        yVar2 = yVarE3;
                    }
                }
                if (yVar2 != null) {
                    yVar = yVar2;
                    break;
                } else {
                    a(93);
                    throw null;
                }
            }
            vo.d dVar3 = (vo.d) it.next();
            int iOrdinal = dVar3.e().ordinal();
            if (iOrdinal == 0) {
                yVar = y.f21852e;
                break;
            }
            if (iOrdinal == 1) {
                throw new IllegalStateException("Member cannot have SEALED modality: " + dVar3);
            }
            if (iOrdinal == 2) {
                z6 = true;
            } else if (iOrdinal == 3) {
                z7 = true;
            }
        }
        vo.d dVarD0 = ((vo.d) s(collection, new i(0))).d0(fVar, yVar, zIsEmpty ? p.f21831h : p.f21830g);
        c0Var.J(dVarD0, collection);
        c0Var.c(dVarD0);
    }

    public static ArrayList g(Object obj, LinkedList linkedList, Function1 function1, Function1 function2) {
        if (obj == null) {
            a(97);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj);
        vo.b bVar = (vo.b) function1.invoke(obj);
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            vo.b bVar2 = (vo.b) function1.invoke(next);
            if (obj == next) {
                it.remove();
            } else {
                j jVarJ = j(bVar, bVar2);
                if (jVarJ == j.f23004d) {
                    arrayList.add(next);
                    it.remove();
                } else if (jVarJ == j.f23006i) {
                    function2.invoke(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    public static k i(vo.b bVar, vo.b bVar2) {
        boolean z5;
        k kVarC;
        if (bVar == null) {
            a(38);
            throw null;
        }
        if (bVar2 == null) {
            a(39);
            throw null;
        }
        boolean z6 = bVar instanceof u;
        if ((z6 && !(bVar2 instanceof u)) || (((z5 = bVar instanceof l0)) && !(bVar2 instanceof l0))) {
            return k.c("Member kind mismatch");
        }
        if (!z6 && !z5) {
            throw new IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: " + bVar);
        }
        if (!bVar.getName().equals(bVar2.getName())) {
            return k.c("Name mismatch");
        }
        if ((bVar.V() == null) != (bVar2.V() == null)) {
            kVarC = k.c("Receiver presence mismatch");
        } else {
            kVarC = bVar.L().size() != bVar2.L().size() ? k.c("Value parameter number mismatch") : null;
        }
        if (kVarC != null) {
            return kVarC;
        }
        return null;
    }

    public static j j(vo.b bVar, vo.b bVar2) {
        l lVar = f23012c;
        j jVarB = lVar.l(bVar2, bVar, null).b();
        j jVarB2 = lVar.m(bVar, bVar2, null, false).b();
        j jVar = j.f23004d;
        if (jVarB == jVar && jVarB2 == jVar) {
            return jVar;
        }
        j jVar2 = j.f23006i;
        return (jVarB == jVar2 || jVarB2 == jVar2) ? jVar2 : j.f23005e;
    }

    public static boolean k(vo.b bVar, vo.b bVar2) {
        if (bVar == null) {
            a(65);
            throw null;
        }
        if (bVar2 == null) {
            a(66);
            throw null;
        }
        z returnType = bVar.getReturnType();
        z returnType2 = bVar2.getReturnType();
        if (!p(bVar, bVar2)) {
            return false;
        }
        p0 p0VarF = f23012c.f(bVar.getTypeParameters(), bVar2.getTypeParameters());
        if (bVar instanceof u) {
            return o(bVar, returnType, bVar2, returnType2, p0VarF);
        }
        if (!(bVar instanceof l0)) {
            throw new IllegalArgumentException("Unexpected callable: " + bVar.getClass());
        }
        l0 l0Var = (l0) bVar;
        l0 l0Var2 = (l0) bVar2;
        j0 setter = l0Var.getSetter();
        j0 setter2 = l0Var2.getSetter();
        if (!((setter == null || setter2 == null) ? true : p(setter, setter2))) {
            return false;
        }
        if (l0Var.U() && l0Var2.U()) {
            return lq.f.g(p0VarF, returnType.w0(), returnType2.w0());
        }
        return (l0Var.U() || !l0Var2.U()) && o(bVar, returnType, bVar2, returnType2, p0VarF);
    }

    public static boolean o(vo.b bVar, z zVar, vo.b bVar2, z zVar2, p0 state) {
        if (bVar == null) {
            a(71);
            throw null;
        }
        if (zVar == null) {
            a(72);
            throw null;
        }
        if (bVar2 == null) {
            a(73);
            throw null;
        }
        if (zVar2 == null) {
            a(74);
            throw null;
        }
        lq.f fVar = lq.f.f15202a;
        d1 subType = zVar.w0();
        d1 superType = zVar2.w0();
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(subType, "subType");
        Intrinsics.checkNotNullParameter(superType, "superType");
        return lq.f.k(fVar, state, subType, superType);
    }

    public static boolean p(vo.b bVar, vo.b bVar2) {
        if (bVar == null) {
            a(67);
            throw null;
        }
        if (bVar2 != null) {
            Integer numB = p.b(bVar.getVisibility(), bVar2.getVisibility());
            return numB == null || numB.intValue() >= 0;
        }
        a(68);
        throw null;
    }

    public static boolean q(vo.b bVar, vo.b bVar2) {
        if (bVar == null) {
            a(13);
            throw null;
        }
        if (bVar2 == null) {
            a(14);
            throw null;
        }
        boolean zEquals = bVar.equals(bVar2);
        c cVar = c.f22998a;
        if (!zEquals && cVar.c(bVar.a(), bVar2.a(), false)) {
            return true;
        }
        vo.b bVarA = bVar2.a();
        int i7 = e.f22999a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        e.b(bVar.a(), linkedHashSet);
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            if (cVar.c(bVarA, (vo.b) it.next(), false)) {
                return true;
            }
        }
        return false;
    }

    public static void r(vo.d dVar, Function1 function1) {
        ep.p pVar;
        ep.p pVarF;
        ep.p pVar2;
        if (dVar == null) {
            a(105);
            throw null;
        }
        for (vo.d dVar2 : dVar.h()) {
            if (dVar2.getVisibility() == p.f21830g) {
                r(dVar2, function1);
            }
        }
        if (dVar.getVisibility() != p.f21830g) {
            return;
        }
        Collection<vo.d> collectionH = dVar.h();
        if (collectionH == null) {
            a(107);
            throw null;
        }
        if (!collectionH.isEmpty()) {
            Iterator it = collectionH.iterator();
            loop3: while (true) {
                pVar = null;
                while (true) {
                    if (!it.hasNext()) {
                        break loop3;
                    }
                    ep.p visibility = ((vo.d) it.next()).getVisibility();
                    if (pVar != null) {
                        Integer numB = p.b(visibility, pVar);
                        if (numB != null) {
                            if (numB.intValue() > 0) {
                            }
                        }
                    }
                    pVar = visibility;
                }
            }
            if (pVar == null) {
                pVarF = null;
                break;
            }
            Iterator it2 = collectionH.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    pVarF = pVar;
                    break;
                }
                Integer numB2 = p.b(pVar, ((vo.d) it2.next()).getVisibility());
                if (numB2 == null || numB2.intValue() < 0) {
                    pVarF = null;
                    break;
                }
            }
        } else {
            pVarF = p.j;
        }
        if (pVarF == null) {
            pVarF = null;
            break;
        }
        if (dVar.c() == vo.c.f21793e) {
            for (vo.d dVar3 : collectionH) {
                if (dVar3.e() != y.f21855w && !dVar3.getVisibility().equals(pVarF)) {
                    pVarF = null;
                    break;
                }
            }
        } else {
            pVarF = p.f(pVarF.f8580a.u());
            Intrinsics.checkNotNullExpressionValue(pVarF, "toDescriptorVisibility(...)");
        }
        if (pVarF == null) {
            if (function1 != null) {
                function1.invoke(dVar);
            }
            pVar2 = p.f21828e;
        } else {
            pVar2 = pVarF;
        }
        if (dVar instanceof h0) {
            h0 h0Var = (h0) dVar;
            if (pVar2 == null) {
                h0.v0(20);
                throw null;
            }
            h0Var.H = pVar2;
            Iterator it3 = ((l0) dVar).m().iterator();
            while (it3.hasNext()) {
                r((k0) it3.next(), pVarF == null ? null : function1);
            }
            return;
        }
        if (dVar instanceof s) {
            s sVar = (s) dVar;
            if (pVar2 != null) {
                sVar.J = pVar2;
                return;
            } else {
                s.v0(10);
                throw null;
            }
        }
        f0 f0Var = (f0) dVar;
        f0Var.I = pVar2;
        if (pVar2 != f0Var.B0().getVisibility()) {
            f0Var.f23431x = false;
        }
    }

    public static Object s(Collection collection, Function1 transform) {
        Object next;
        if (collection.size() == 1) {
            Object objJ = CollectionsKt.J(collection);
            if (objJ != null) {
                return objJ;
            }
            a(78);
            throw null;
        }
        ArrayList arrayList = new ArrayList(2);
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList2 = new ArrayList(e0.l(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList2.add(transform.invoke(it.next()));
        }
        Object objJ2 = CollectionsKt.J(collection);
        vo.b bVar = (vo.b) transform.invoke(objJ2);
        for (Object obj : collection) {
            vo.b bVar2 = (vo.b) transform.invoke(obj);
            if (bVar2 == null) {
                a(69);
                throw null;
            }
            Iterator it2 = arrayList2.iterator();
            do {
                if (!it2.hasNext()) {
                    arrayList.add(obj);
                    break;
                }
            } while (k(bVar2, (vo.b) it2.next()));
            if (k(bVar2, bVar) && !k(bVar, bVar2)) {
                objJ2 = obj;
            }
        }
        if (arrayList.isEmpty()) {
            if (objJ2 != null) {
                return objJ2;
            }
            a(79);
            throw null;
        }
        if (arrayList.size() == 1) {
            Object objJ3 = CollectionsKt.J(arrayList);
            if (objJ3 != null) {
                return objJ3;
            }
            a(80);
            throw null;
        }
        Iterator it3 = arrayList.iterator();
        do {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
        } while (lq.c.k(((vo.b) transform.invoke(next)).getReturnType()));
        if (next != null) {
            return next;
        }
        Object objJ4 = CollectionsKt.J(arrayList);
        if (objJ4 != null) {
            return objJ4;
        }
        a(82);
        throw null;
    }

    public final p0 f(List list, List list2) {
        if (list == null) {
            a(40);
            throw null;
        }
        if (list2 == null) {
            a(41);
            throw null;
        }
        boolean zIsEmpty = list.isEmpty();
        mq.c cVar = this.f23014a;
        if (zIsEmpty) {
            return new io.sentry.internal.debugmeta.c((HashMap) null, cVar).C0();
        }
        HashMap map = new HashMap();
        for (int i7 = 0; i7 < list.size(); i7++) {
            map.put(((r0) list.get(i7)).n(), ((r0) list2.get(i7)).n());
        }
        return new io.sentry.internal.debugmeta.c(map, cVar).C0();
    }

    public final void h(up.e eVar, Collection collection, Collection collection2, vo.f fVar, c0 c0Var) {
        Integer numB;
        if (eVar == null) {
            a(50);
            throw null;
        }
        if (collection == null) {
            a(51);
            throw null;
        }
        if (collection2 == null) {
            a(52);
            throw null;
        }
        if (fVar == null) {
            a(53);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            vo.d fromCurrent = (vo.d) it.next();
            if (fromCurrent == null) {
                a(57);
                throw null;
            }
            ArrayList arrayList = new ArrayList(collection.size());
            int i7 = vq.j.f21949i;
            vq.j jVarF = vq.m.f();
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                vo.d fromSuper = (vo.d) it2.next();
                j jVarB = l(fromSuper, fromCurrent, fVar).b();
                boolean z5 = !p.e(fromSuper.getVisibility()) && p.c(p.f21833l, fromSuper, fromCurrent) == null;
                int iOrdinal = jVarB.ordinal();
                if (iOrdinal == 0) {
                    if (z5) {
                        jVarF.add(fromSuper);
                    }
                    arrayList.add(fromSuper);
                } else if (iOrdinal == 2) {
                    if (z5) {
                        Intrinsics.checkNotNullParameter(fromSuper, "fromSuper");
                        Intrinsics.checkNotNullParameter(fromCurrent, "fromCurrent");
                        c0Var.h(fromSuper, fromCurrent);
                    }
                    arrayList.add(fromSuper);
                }
            }
            c0Var.J(fromCurrent, jVarF);
            linkedHashSet.removeAll(arrayList);
        }
        if (linkedHashSet.size() >= 2) {
            bp.i predicate = new bp.i(19, ((vo.d) linkedHashSet.iterator().next()).g());
            Intrinsics.checkNotNullParameter(linkedHashSet, "<this>");
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            if (!linkedHashSet.isEmpty()) {
                Iterator it3 = linkedHashSet.iterator();
                while (it3.hasNext()) {
                    if (!((Boolean) predicate.invoke(it3.next())).booleanValue()) {
                        LinkedList<vo.d> descriptors = new LinkedList(linkedHashSet);
                        while (!descriptors.isEmpty()) {
                            Intrinsics.checkNotNullParameter(descriptors, "descriptors");
                            descriptors.isEmpty();
                            vo.d dVar = null;
                            for (vo.d dVar2 : descriptors) {
                                if (dVar == null || ((numB = p.b(dVar.getVisibility(), dVar2.getVisibility())) != null && numB.intValue() < 0)) {
                                    dVar = dVar2;
                                }
                            }
                            Intrinsics.checkNotNull(dVar);
                            if (dVar == null) {
                                a(102);
                                throw null;
                            }
                            e(g(dVar, descriptors, new i(1), new ip.m(6, c0Var, dVar)), fVar, c0Var);
                        }
                        return;
                    }
                }
            }
        }
        Iterator it4 = linkedHashSet.iterator();
        while (it4.hasNext()) {
            e(Collections.singleton((vo.d) it4.next()), fVar, c0Var);
        }
    }

    public final k l(vo.b bVar, vo.b bVar2, vo.f fVar) {
        if (bVar == null) {
            a(19);
            throw null;
        }
        if (bVar2 != null) {
            return m(bVar, bVar2, fVar, false);
        }
        a(20);
        throw null;
    }

    public final k m(vo.b bVar, vo.b bVar2, vo.f fVar, boolean z5) {
        if (bVar == null) {
            a(22);
            throw null;
        }
        if (bVar2 == null) {
            a(23);
            throw null;
        }
        k kVarN = n(bVar, bVar2, z5);
        boolean z6 = kVarN.b() == j.f23004d;
        List<f> list = f23011b;
        for (f fVar2 : list) {
            if (fVar2.a() != 1 && (!z6 || fVar2.a() != 2)) {
                int iB = f0.e.b(fVar2.b(bVar, bVar2, fVar));
                if (iB == 0) {
                    z6 = true;
                } else if (iB == 1) {
                    return k.c("External condition");
                }
            }
        }
        if (!z6) {
            return kVarN;
        }
        for (f fVar3 : list) {
            if (fVar3.a() == 1) {
                int iB2 = f0.e.b(fVar3.b(bVar, bVar2, fVar));
                if (iB2 == 0) {
                    throw new IllegalStateException("Contract violation in " + fVar3.getClass().getName() + " condition. It's not supposed to end with success");
                }
                if (iB2 == 1) {
                    return k.c("External condition");
                }
            }
        }
        k kVar = k.f23008c;
        if (kVar != null) {
            return kVar;
        }
        k.a(0);
        throw null;
    }

    public final k n(vo.b bVar, vo.b bVar2, boolean z5) {
        if (bVar == null) {
            a(28);
            throw null;
        }
        if (bVar2 == null) {
            a(29);
            throw null;
        }
        k kVarI = i(bVar, bVar2);
        if (kVarI != null) {
            return kVarI;
        }
        ArrayList arrayListD = d(bVar);
        ArrayList arrayListD2 = d(bVar2);
        List typeParameters = bVar.getTypeParameters();
        List typeParameters2 = bVar2.getTypeParameters();
        int size = typeParameters.size();
        int size2 = typeParameters2.size();
        j jVar = j.f23006i;
        if (size != size2) {
            for (int i7 = 0; i7 < arrayListD.size(); i7++) {
                if (!mq.d.f16016a.a((z) arrayListD.get(i7), (z) arrayListD2.get(i7))) {
                    return k.c("Type parameter number mismatch");
                }
            }
            return new k(jVar, "Type parameter number mismatch");
        }
        p0 state = f(typeParameters, typeParameters2);
        for (int i10 = 0; i10 < typeParameters.size(); i10++) {
            r0 r0Var = (r0) typeParameters.get(i10);
            r0 r0Var2 = (r0) typeParameters2.get(i10);
            if (r0Var == null) {
                a(47);
                throw null;
            }
            if (r0Var2 == null) {
                a(48);
                throw null;
            }
            List<z> upperBounds = r0Var.getUpperBounds();
            ArrayList arrayList = new ArrayList(r0Var2.getUpperBounds());
            if (upperBounds.size() == arrayList.size()) {
                for (z zVar : upperBounds) {
                    ListIterator listIterator = arrayList.listIterator();
                    do {
                        if (listIterator.hasNext()) {
                        }
                    } while (!b(zVar, (z) listIterator.next(), state));
                    listIterator.remove();
                }
            }
            return k.c("Type parameter bounds mismatch");
        }
        for (int i11 = 0; i11 < arrayListD.size(); i11++) {
            if (!b((z) arrayListD.get(i11), (z) arrayListD2.get(i11), state)) {
                return k.c("Value parameter type mismatch");
            }
        }
        if ((bVar instanceof u) && (bVar2 instanceof u) && ((u) bVar).isSuspend() != ((u) bVar2).isSuspend()) {
            return new k(jVar, "Incompatible suspendability");
        }
        if (z5) {
            z returnType = bVar.getReturnType();
            z returnType2 = bVar2.getReturnType();
            if (returnType != null && returnType2 != null && (!lq.c.j(returnType2) || !lq.c.j(returnType))) {
                lq.f fVar = lq.f.f15202a;
                d1 subType = returnType2.w0();
                d1 superType = returnType.w0();
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(subType, "subType");
                Intrinsics.checkNotNullParameter(superType, "superType");
                if (!lq.f.k(fVar, state, subType, superType)) {
                    return new k(jVar, "Return type mismatch");
                }
            }
        }
        k kVar = k.f23008c;
        if (kVar != null) {
            return kVar;
        }
        k.a(0);
        throw null;
    }
}
