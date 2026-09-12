package xp;

import com.discord.misc.utilities.chat_view_types.ChatViewRecyclerTypes;
import com.facebook.react.devsupport.StackTraceHelper;
import com.swmansion.reanimated.BuildConfig;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import lq.q0;
import lq.z;
import vo.e0;
import vo.i0;
import vo.o0;
import vo.p;
import vo.y;
import yo.b0;
import yo.j0;
import yo.v;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f22999a = 0;

    static {
        new up.c("kotlin.jvm.JvmName");
    }

    public static /* synthetic */ void a(int i7) {
        String str;
        int i10;
        switch (i7) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case ChatViewRecyclerTypes.FORWARD_HEADER /* 43 */:
            case ChatViewRecyclerTypes.REACTION_ADD_REACTION /* 47 */:
            case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_IMAGE /* 49 */:
            case 50:
            case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_VISUAL_PLACEHOLDER /* 51 */:
            case ChatViewRecyclerTypes.REFERRAL /* 52 */:
            case ChatViewRecyclerTypes.GUILD_PROFILE_INVITE /* 53 */:
            case ChatViewRecyclerTypes.VOICE_CHANNEL_LIST_INVITE /* 59 */:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i7) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case ChatViewRecyclerTypes.FORWARD_HEADER /* 43 */:
            case ChatViewRecyclerTypes.REACTION_ADD_REACTION /* 47 */:
            case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_IMAGE /* 49 */:
            case 50:
            case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_VISUAL_PLACEHOLDER /* 51 */:
            case ChatViewRecyclerTypes.REFERRAL /* 52 */:
            case ChatViewRecyclerTypes.GUILD_PROFILE_INVITE /* 53 */:
            case ChatViewRecyclerTypes.VOICE_CHANNEL_LIST_INVITE /* 59 */:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                i10 = 2;
                break;
            default:
                i10 = 3;
                break;
        }
        Object[] objArr = new Object[i10];
        switch (i7) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case 13:
            case 14:
            case 15:
            case 21:
            case 23:
            case 24:
            case 34:
            case 35:
            case 36:
            case ChatViewRecyclerTypes.PREMIUM_GROUP_INVITE /* 57 */:
            case ChatViewRecyclerTypes.REFERRAL_REDESIGN /* 58 */:
            case ChatViewRecyclerTypes.GIFT_INTENT /* 60 */:
            case 63:
            case 81:
            case 94:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case ChatViewRecyclerTypes.FORWARD_HEADER /* 43 */:
            case ChatViewRecyclerTypes.REACTION_ADD_REACTION /* 47 */:
            case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_IMAGE /* 49 */:
            case 50:
            case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_VISUAL_PLACEHOLDER /* 51 */:
            case ChatViewRecyclerTypes.REFERRAL /* 52 */:
            case ChatViewRecyclerTypes.GUILD_PROFILE_INVITE /* 53 */:
            case ChatViewRecyclerTypes.VOICE_CHANNEL_LIST_INVITE /* 59 */:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 16:
                objArr[0] = "first";
                break;
            case 17:
                objArr[0] = "second";
                break;
            case 18:
            case 19:
                objArr[0] = "aClass";
                break;
            case 20:
                objArr[0] = "kotlinType";
                break;
            case 25:
                objArr[0] = "declarationDescriptor";
                break;
            case 26:
            case 28:
                objArr[0] = "subClass";
                break;
            case 27:
            case 29:
            case 33:
                objArr[0] = "superClass";
                break;
            case 30:
            case 32:
            case ChatViewRecyclerTypes.REACTION_BURST_REACTION /* 45 */:
            case 66:
                objArr[0] = "type";
                break;
            case 31:
                objArr[0] = "other";
                break;
            case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                objArr[0] = "classKind";
                break;
            case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
            case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
            case 41:
            case ChatViewRecyclerTypes.FORWARD_BREADCRUMB /* 44 */:
            case 48:
            case ChatViewRecyclerTypes.APP_MESSAGE_EMBED /* 54 */:
            case 67:
            case 68:
            case 69:
            case 76:
            case 77:
                objArr[0] = "classDescriptor";
                break;
            case 46:
                objArr[0] = "typeConstructor";
                break;
            case ChatViewRecyclerTypes.ACTIVITY_RICH_PRESENCE_INVITE_EMBED /* 55 */:
                objArr[0] = "innerClassName";
                break;
            case ChatViewRecyclerTypes.SHARED_CUSTOM_THEME_EMBED /* 56 */:
                objArr[0] = "location";
                break;
            case 65:
                objArr[0] = "variable";
                break;
            case 70:
                objArr[0] = "f";
                break;
            case 72:
                objArr[0] = "current";
                break;
            case 73:
                objArr[0] = "result";
                break;
            case 74:
                objArr[0] = "memberDescriptor";
                break;
            case 78:
            case 79:
            case 80:
                objArr[0] = "annotated";
                break;
            case 84:
            case BuildConfig.REACT_NATIVE_MINOR_VERSION /* 86 */:
            case 89:
            case 91:
                objArr[0] = "scope";
                break;
            case 87:
            case 90:
            case 92:
                objArr[0] = StackTraceHelper.NAME_KEY;
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i7) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 12:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case 22:
                objArr[1] = "getContainingModule";
                break;
            case 40:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case 42:
            case ChatViewRecyclerTypes.FORWARD_HEADER /* 43 */:
                objArr[1] = "getSuperClassType";
                break;
            case ChatViewRecyclerTypes.REACTION_ADD_REACTION /* 47 */:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_IMAGE /* 49 */:
            case 50:
            case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_VISUAL_PLACEHOLDER /* 51 */:
            case ChatViewRecyclerTypes.REFERRAL /* 52 */:
            case ChatViewRecyclerTypes.GUILD_PROFILE_INVITE /* 53 */:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case ChatViewRecyclerTypes.VOICE_CHANNEL_LIST_INVITE /* 59 */:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 61:
            case 62:
                objArr[1] = "unwrapSubstitutionOverride";
                break;
            case 64:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 71:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 75:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 82:
            case 83:
                objArr[1] = "getContainingSourceFile";
                break;
            case 85:
                objArr[1] = "getAllDescriptors";
                break;
            case 88:
                objArr[1] = "getFunctionByName";
                break;
            case 93:
                objArr[1] = "getPropertyByName";
                break;
            case 95:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i7) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case ChatViewRecyclerTypes.FORWARD_HEADER /* 43 */:
            case ChatViewRecyclerTypes.REACTION_ADD_REACTION /* 47 */:
            case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_IMAGE /* 49 */:
            case 50:
            case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_VISUAL_PLACEHOLDER /* 51 */:
            case ChatViewRecyclerTypes.REFERRAL /* 52 */:
            case ChatViewRecyclerTypes.GUILD_PROFILE_INVITE /* 53 */:
            case ChatViewRecyclerTypes.VOICE_CHANNEL_LIST_INVITE /* 59 */:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case 13:
                objArr[2] = "isExtension";
                break;
            case 14:
                objArr[2] = "isOverride";
                break;
            case 15:
                objArr[2] = "isStaticDeclaration";
                break;
            case 16:
            case 17:
                objArr[2] = "areInSameModule";
                break;
            case 18:
            case 19:
                objArr[2] = "getParentOfType";
                break;
            case 20:
            case 23:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 21:
                objArr[2] = "getContainingModule";
                break;
            case 24:
                objArr[2] = "getContainingClass";
                break;
            case 25:
                objArr[2] = "isAncestor";
                break;
            case 26:
            case 27:
                objArr[2] = "isDirectSubclass";
                break;
            case 28:
            case 29:
                objArr[2] = "isSubclass";
                break;
            case 30:
            case 31:
                objArr[2] = "isSameClass";
                break;
            case 32:
            case 33:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 34:
                objArr[2] = "isAnonymousObject";
                break;
            case 35:
                objArr[2] = "isAnonymousFunction";
                break;
            case 36:
                objArr[2] = "isEnumEntry";
                break;
            case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                objArr[2] = "isKindOf";
                break;
            case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
                objArr[2] = "hasAbstractMembers";
                break;
            case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case 41:
                objArr[2] = "getSuperClassType";
                break;
            case ChatViewRecyclerTypes.FORWARD_BREADCRUMB /* 44 */:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case ChatViewRecyclerTypes.REACTION_BURST_REACTION /* 45 */:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 46:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case 48:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case ChatViewRecyclerTypes.APP_MESSAGE_EMBED /* 54 */:
            case ChatViewRecyclerTypes.ACTIVITY_RICH_PRESENCE_INVITE_EMBED /* 55 */:
            case ChatViewRecyclerTypes.SHARED_CUSTOM_THEME_EMBED /* 56 */:
                objArr[2] = "getInnerClassByName";
                break;
            case ChatViewRecyclerTypes.PREMIUM_GROUP_INVITE /* 57 */:
                objArr[2] = "isStaticNestedClass";
                break;
            case ChatViewRecyclerTypes.REFERRAL_REDESIGN /* 58 */:
                objArr[2] = "unwrapFakeOverride";
                break;
            case ChatViewRecyclerTypes.GIFT_INTENT /* 60 */:
                objArr[2] = "unwrapSubstitutionOverride";
                break;
            case 63:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 65:
            case 66:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 67:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 68:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 69:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 70:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 72:
            case 73:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 74:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 76:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 77:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 78:
                objArr[2] = "getJvmName";
                break;
            case 79:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case 80:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 81:
                objArr[2] = "getContainingSourceFile";
                break;
            case 84:
                objArr[2] = "getAllDescriptors";
                break;
            case BuildConfig.REACT_NATIVE_MINOR_VERSION /* 86 */:
            case 87:
                objArr[2] = "getFunctionByName";
                break;
            case 89:
            case 90:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 91:
            case 92:
                objArr[2] = "getPropertyByName";
                break;
            case 94:
                objArr[2] = "getDirectMember";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i7) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case ChatViewRecyclerTypes.FORWARD_HEADER /* 43 */:
            case ChatViewRecyclerTypes.REACTION_ADD_REACTION /* 47 */:
            case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_IMAGE /* 49 */:
            case 50:
            case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_VISUAL_PLACEHOLDER /* 51 */:
            case ChatViewRecyclerTypes.REFERRAL /* 52 */:
            case ChatViewRecyclerTypes.GUILD_PROFILE_INVITE /* 53 */:
            case ChatViewRecyclerTypes.VOICE_CHANNEL_LIST_INVITE /* 59 */:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static void b(vo.b bVar, LinkedHashSet linkedHashSet) {
        if (bVar == null) {
            a(72);
            throw null;
        }
        if (linkedHashSet.contains(bVar)) {
            return;
        }
        Iterator it = bVar.a().h().iterator();
        while (it.hasNext()) {
            vo.b bVarA = ((vo.b) it.next()).a();
            b(bVarA, linkedHashSet);
            linkedHashSet.add(bVarA);
        }
    }

    public static vo.f c(z zVar) {
        if (zVar == null) {
            a(45);
            throw null;
        }
        q0 q0VarR0 = zVar.r0();
        if (q0VarR0 == null) {
            a(46);
            throw null;
        }
        vo.f fVar = (vo.f) q0VarR0.g();
        if (fVar != null) {
            return fVar;
        }
        a(47);
        throw null;
    }

    public static vo.z d(vo.l lVar) {
        if (lVar == null) {
            a(21);
            throw null;
        }
        vo.z zVarE = e(lVar);
        if (zVarE != null) {
            return zVarE;
        }
        a(22);
        throw null;
    }

    public static vo.z e(vo.l lVar) {
        if (lVar == null) {
            a(23);
            throw null;
        }
        while (lVar != null) {
            if (lVar instanceof vo.z) {
                return (vo.z) lVar;
            }
            if (lVar instanceof i0) {
                return ((v) ((i0) lVar)).f23484v;
            }
            lVar = lVar.g();
        }
        return null;
    }

    public static o0 f(vo.l lVar) {
        o0 o0Var = o0.f21821e;
        if (lVar == null) {
            a(81);
            throw null;
        }
        if (lVar instanceof j0) {
            lVar = ((j0) lVar).B0();
        }
        if (lVar instanceof vo.m) {
            ((vo.m) lVar).d().a();
        }
        return o0Var;
    }

    public static up.d g(vo.l lVar) {
        if (lVar != null) {
            up.c cVarH = h(lVar);
            return cVarH != null ? cVarH.f21262a : g(lVar.g()).a(lVar.getName());
        }
        a(2);
        throw null;
    }

    public static up.c h(vo.l lVar) {
        if (lVar == null) {
            a(5);
            throw null;
        }
        if ((lVar instanceof vo.z) || nq.l.f(lVar)) {
            return up.c.f21261c;
        }
        if (lVar instanceof i0) {
            return ((v) ((i0) lVar)).f23485w;
        }
        if (lVar instanceof e0) {
            return ((b0) ((e0) lVar)).f23420x;
        }
        return null;
    }

    public static vo.l i(vo.l lVar, Class cls, boolean z5) {
        if (lVar == null) {
            return null;
        }
        if (z5) {
            lVar = lVar.g();
        }
        while (lVar != null) {
            if (cls.isInstance(lVar)) {
                return lVar;
            }
            lVar = lVar.g();
        }
        return null;
    }

    public static vo.f j(vo.f fVar) {
        if (fVar == null) {
            a(44);
            throw null;
        }
        Iterator it = fVar.n().h().iterator();
        while (it.hasNext()) {
            vo.f fVarC = c((z) it.next());
            if (fVarC.c() != vo.g.f21809e) {
                return fVarC;
            }
        }
        return null;
    }

    public static boolean k(vo.l lVar) {
        return n(lVar, vo.g.f21808d) && lVar.getName().equals(up.g.f21273a);
    }

    public static boolean l(vo.l lVar) {
        return n(lVar, vo.g.f21813x) && ((vo.f) lVar).o();
    }

    public static boolean m(vo.l lVar) {
        if (lVar != null) {
            return n(lVar, vo.g.f21811v);
        }
        a(36);
        throw null;
    }

    public static boolean n(vo.l lVar, vo.g gVar) {
        return (lVar instanceof vo.f) && ((vo.f) lVar).c() == gVar;
    }

    public static boolean o(vo.l lVar) {
        if (lVar == null) {
            a(1);
            throw null;
        }
        while (lVar != null) {
            if (k(lVar) || ((lVar instanceof vo.o) && ((vo.o) lVar).getVisibility() == p.f21829f)) {
                return true;
            }
            lVar = lVar.g();
        }
        return false;
    }

    public static boolean p(z zVar, vo.l lVar) {
        if (zVar == null) {
            a(30);
            throw null;
        }
        if (lVar == null) {
            a(31);
            throw null;
        }
        vo.i iVarG = zVar.r0().g();
        if (iVarG == null) {
            return false;
        }
        vo.l lVarA = iVarG.a();
        return (lVarA instanceof vo.i) && (lVar instanceof vo.i) && ((vo.i) lVar).n().equals(((vo.i) lVarA).n());
    }

    public static boolean q(vo.l lVar) {
        return (n(lVar, vo.g.f21808d) || n(lVar, vo.g.f21809e)) && ((vo.f) lVar).e() == y.f21853i;
    }

    public static boolean r(z zVar, vo.l lVar) {
        if (zVar == null) {
            a(32);
            throw null;
        }
        if (lVar == null) {
            a(33);
            throw null;
        }
        if (p(zVar, lVar)) {
            return true;
        }
        Iterator it = zVar.r0().h().iterator();
        while (it.hasNext()) {
            if (r((z) it.next(), lVar)) {
                return true;
            }
        }
        return false;
    }

    public static boolean s(vo.l lVar) {
        return lVar != null && (lVar.g() instanceof e0);
    }

    public static vo.d t(vo.d dVar) {
        if (dVar == null) {
            a(58);
            throw null;
        }
        while (dVar.c() == vo.c.f21793e) {
            Collection collectionH = dVar.h();
            if (collectionH.isEmpty()) {
                throw new IllegalStateException("Fake override should have at least one overridden descriptor: " + dVar);
            }
            dVar = (vo.d) collectionH.iterator().next();
        }
        return dVar;
    }
}
