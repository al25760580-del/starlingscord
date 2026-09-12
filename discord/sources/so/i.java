package so;

import ar.c1;
import com.discord.chat.presentation.message.view.MediaImageViewKt;
import com.discord.media.engine.MediaEngine;
import com.discord.misc.utilities.chat_view_types.ChatViewRecyclerTypes;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.swmansion.reanimated.BuildConfig;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import lq.b1;
import lq.d0;
import lq.d1;
import lq.e1;
import lq.q0;
import lq.t0;
import mo.c0;
import vo.e0;
import vo.g0;
import vo.h0;
import vo.l0;
import vo.u;
import yo.b0;
import yo.i0;
import yo.j0;
import yo.z;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final up.e f20342e = up.e.g("<built-ins module>");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z f20343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kq.i f20344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kq.e f20345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kq.l f20346d;

    public i(kq.l lVar) {
        this.f20346d = lVar;
        lVar.b(new f(this, 0));
        this.f20344b = new kq.i(lVar, new f(this, 1));
        this.f20345c = lVar.c(new g(this, 0));
    }

    public static boolean A(vo.l lVar) {
        if (lVar != null) {
            return xp.e.i(lVar, iq.c.class, false) != null;
        }
        a(9);
        throw null;
    }

    public static boolean B(lq.z zVar, up.d dVar) {
        if (zVar == null) {
            a(97);
            throw null;
        }
        if (dVar != null) {
            return I(zVar.r0(), dVar);
        }
        a(98);
        throw null;
    }

    public static boolean C(lq.z zVar, up.d dVar) {
        if (dVar != null) {
            return B(zVar, dVar) && !zVar.t0();
        }
        a(135);
        throw null;
    }

    public static boolean D(u uVar) {
        if (uVar.a().getAnnotations().P(o.f20379m)) {
            return true;
        }
        if (!(uVar instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) uVar;
        boolean zU = l0Var.U();
        i0 getter = l0Var.getGetter();
        j0 setter = l0Var.getSetter();
        if (getter == null || !D(getter)) {
            return false;
        }
        if (zU) {
            return setter != null && D(setter);
        }
        return true;
    }

    public static boolean E(lq.z zVar, up.d dVar) {
        if (zVar == null) {
            a(105);
            throw null;
        }
        if (dVar != null) {
            return !zVar.t0() && B(zVar, dVar);
        }
        a(106);
        throw null;
    }

    public static boolean F(lq.z zVar) {
        if (zVar == null) {
            a(136);
            throw null;
        }
        if (zVar != null) {
            return B(zVar, o.f20364b) && !b1.e(zVar);
        }
        a(138);
        throw null;
    }

    public static boolean G(lq.z zVar) {
        if (zVar == null) {
            a(94);
            throw null;
        }
        if (zVar.t0()) {
            return false;
        }
        vo.i iVarG = zVar.r0().g();
        return (iVarG instanceof vo.f) && u((vo.f) iVarG) != null;
    }

    public static boolean H(lq.z zVar) {
        return E(zVar, o.f20372f);
    }

    public static boolean I(q0 q0Var, up.d dVar) {
        if (q0Var == null) {
            a(101);
            throw null;
        }
        if (dVar != null) {
            vo.i iVarG = q0Var.g();
            return (iVarG instanceof vo.f) && b((vo.f) iVarG, dVar);
        }
        a(102);
        throw null;
    }

    public static boolean J(vo.i iVar) {
        if (iVar == null) {
            a(10);
            throw null;
        }
        for (vo.l lVarG = iVar; lVarG != null; lVarG = lVarG.g()) {
            if (lVarG instanceof e0) {
                return ((b0) ((e0) lVarG)).f23420x.c(p.k);
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0035 A[FALL_THROUGH] */
    public static /* synthetic */ void a(int i7) {
        String str;
        int i10;
        if (i7 != 11 && i7 != 13 && i7 != 15 && i7 != 69 && i7 != 74 && i7 != 81 && i7 != 84 && i7 != 86 && i7 != 87) {
            switch (i7) {
                default:
                    switch (i7) {
                        default:
                            switch (i7) {
                                default:
                                    switch (i7) {
                                        case ChatViewRecyclerTypes.ACTIVITY_RICH_PRESENCE_INVITE_EMBED /* 55 */:
                                        case ChatViewRecyclerTypes.SHARED_CUSTOM_THEME_EMBED /* 56 */:
                                        case ChatViewRecyclerTypes.PREMIUM_GROUP_INVITE /* 57 */:
                                        case ChatViewRecyclerTypes.REFERRAL_REDESIGN /* 58 */:
                                        case ChatViewRecyclerTypes.VOICE_CHANNEL_LIST_INVITE /* 59 */:
                                        case ChatViewRecyclerTypes.GIFT_INTENT /* 60 */:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case 67:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 48:
                                case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_IMAGE /* 49 */:
                                case 50:
                                case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_VISUAL_PLACEHOLDER /* 51 */:
                                case ChatViewRecyclerTypes.REFERRAL /* 52 */:
                                case ChatViewRecyclerTypes.GUILD_PROFILE_INVITE /* 53 */:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                        case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
                        case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
                        case 40:
                        case 41:
                        case 42:
                        case ChatViewRecyclerTypes.FORWARD_HEADER /* 43 */:
                        case ChatViewRecyclerTypes.FORWARD_BREADCRUMB /* 44 */:
                        case ChatViewRecyclerTypes.REACTION_BURST_REACTION /* 45 */:
                        case 46:
                            str = "@NotNull method %s.%s must not return null";
                            break;
                    }
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    str = "@NotNull method %s.%s must not return null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i7 != 11 && i7 != 13 && i7 != 15 && i7 != 69 && i7 != 74 && i7 != 81 && i7 != 84 && i7 != 86 && i7 != 87) {
            switch (i7) {
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    i10 = 2;
                    break;
                default:
                    switch (i7) {
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                        case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
                        case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
                        case 40:
                        case 41:
                        case 42:
                        case ChatViewRecyclerTypes.FORWARD_HEADER /* 43 */:
                        case ChatViewRecyclerTypes.FORWARD_BREADCRUMB /* 44 */:
                        case ChatViewRecyclerTypes.REACTION_BURST_REACTION /* 45 */:
                        case 46:
                            i10 = 2;
                            break;
                        default:
                            switch (i7) {
                                case 48:
                                case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_IMAGE /* 49 */:
                                case 50:
                                case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_VISUAL_PLACEHOLDER /* 51 */:
                                case ChatViewRecyclerTypes.REFERRAL /* 52 */:
                                case ChatViewRecyclerTypes.GUILD_PROFILE_INVITE /* 53 */:
                                    i10 = 2;
                                    break;
                                default:
                                    switch (i7) {
                                        case ChatViewRecyclerTypes.ACTIVITY_RICH_PRESENCE_INVITE_EMBED /* 55 */:
                                        case ChatViewRecyclerTypes.SHARED_CUSTOM_THEME_EMBED /* 56 */:
                                        case ChatViewRecyclerTypes.PREMIUM_GROUP_INVITE /* 57 */:
                                        case ChatViewRecyclerTypes.REFERRAL_REDESIGN /* 58 */:
                                        case ChatViewRecyclerTypes.VOICE_CHANNEL_LIST_INVITE /* 59 */:
                                        case ChatViewRecyclerTypes.GIFT_INTENT /* 60 */:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case 67:
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
            case 72:
                objArr[0] = "module";
                break;
            case 2:
                objArr[0] = "computation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
            case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
            case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
            case 40:
            case 41:
            case 42:
            case ChatViewRecyclerTypes.FORWARD_HEADER /* 43 */:
            case ChatViewRecyclerTypes.FORWARD_BREADCRUMB /* 44 */:
            case ChatViewRecyclerTypes.REACTION_BURST_REACTION /* 45 */:
            case 46:
            case 48:
            case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_IMAGE /* 49 */:
            case 50:
            case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_VISUAL_PLACEHOLDER /* 51 */:
            case ChatViewRecyclerTypes.REFERRAL /* 52 */:
            case ChatViewRecyclerTypes.GUILD_PROFILE_INVITE /* 53 */:
            case ChatViewRecyclerTypes.ACTIVITY_RICH_PRESENCE_INVITE_EMBED /* 55 */:
            case ChatViewRecyclerTypes.SHARED_CUSTOM_THEME_EMBED /* 56 */:
            case ChatViewRecyclerTypes.PREMIUM_GROUP_INVITE /* 57 */:
            case ChatViewRecyclerTypes.REFERRAL_REDESIGN /* 58 */:
            case ChatViewRecyclerTypes.VOICE_CHANNEL_LIST_INVITE /* 59 */:
            case ChatViewRecyclerTypes.GIFT_INTENT /* 60 */:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 74:
            case 81:
            case 84:
            case BuildConfig.REACT_NATIVE_MINOR_VERSION /* 86 */:
            case 87:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 9:
            case 10:
            case 76:
            case 77:
            case 89:
            case 96:
            case 103:
            case 107:
            case 108:
            case 143:
            case MediaImageViewKt.OBSCURED_IMAGE_MIN_WIDTH /* 146 */:
            case 147:
            case 149:
            case 157:
            case 158:
            case 159:
                objArr[0] = "descriptor";
                break;
            case 12:
            case 98:
            case 100:
            case 102:
            case 104:
            case 106:
            case 135:
                objArr[0] = "fqName";
                break;
            case 14:
                objArr[0] = "simpleName";
                break;
            case 16:
            case 17:
            case ChatViewRecyclerTypes.APP_MESSAGE_EMBED /* 54 */:
            case 88:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 97:
            case 99:
            case 105:
            case 109:
            case 110:
            case 111:
            case 113:
            case MediaEngine.MAX_SUPPORTED_PROTOCOL_VERSION /* 114 */:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT /* 128 */:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 144:
            case 145:
            case 148:
            case 150:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 161:
                objArr[0] = "type";
                break;
            case ChatViewRecyclerTypes.REACTION_ADD_REACTION /* 47 */:
                objArr[0] = "classSimpleName";
                break;
            case 68:
            case 70:
                objArr[0] = "arrayType";
                break;
            case 71:
                objArr[0] = "notNullArrayType";
                break;
            case 73:
                objArr[0] = "primitiveType";
                break;
            case 75:
                objArr[0] = "kotlinType";
                break;
            case 78:
            case 82:
                objArr[0] = "projectionType";
                break;
            case 79:
            case 83:
            case 85:
                objArr[0] = "argument";
                break;
            case 80:
                objArr[0] = "annotations";
                break;
            case 101:
                objArr[0] = "typeConstructor";
                break;
            case 112:
                objArr[0] = "classDescriptor";
                break;
            case 160:
                objArr[0] = "declarationDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i7 == 11) {
            objArr[1] = "getBuiltInsPackageScope";
        } else if (i7 == 13) {
            objArr[1] = "getBuiltInClassByFqName";
        } else if (i7 == 15) {
            objArr[1] = "getBuiltInClassByName";
        } else if (i7 == 69) {
            objArr[1] = "getArrayElementType";
        } else if (i7 == 74) {
            objArr[1] = "getPrimitiveArrayKotlinType";
        } else if (i7 == 81 || i7 == 84) {
            objArr[1] = "getArrayType";
        } else if (i7 == 86) {
            objArr[1] = "getEnumType";
        } else if (i7 != 87) {
            switch (i7) {
                case 3:
                    objArr[1] = "getAdditionalClassPartsProvider";
                    break;
                case 4:
                    objArr[1] = "getPlatformDependentDeclarationFilter";
                    break;
                case 5:
                    objArr[1] = "getClassDescriptorFactories";
                    break;
                case 6:
                    objArr[1] = "getStorageManager";
                    break;
                case 7:
                    objArr[1] = "getBuiltInsModule";
                    break;
                case 8:
                    objArr[1] = "getBuiltInPackagesImportedByDefault";
                    break;
                default:
                    switch (i7) {
                        case 18:
                            objArr[1] = "getSuspendFunction";
                            break;
                        case 19:
                            objArr[1] = "getKFunction";
                            break;
                        case 20:
                            objArr[1] = "getKSuspendFunction";
                            break;
                        case 21:
                            objArr[1] = "getKClass";
                            break;
                        case 22:
                            objArr[1] = "getKType";
                            break;
                        case 23:
                            objArr[1] = "getKCallable";
                            break;
                        case 24:
                            objArr[1] = "getKProperty";
                            break;
                        case 25:
                            objArr[1] = "getKProperty0";
                            break;
                        case 26:
                            objArr[1] = "getKProperty1";
                            break;
                        case 27:
                            objArr[1] = "getKProperty2";
                            break;
                        case 28:
                            objArr[1] = "getKMutableProperty0";
                            break;
                        case 29:
                            objArr[1] = "getKMutableProperty1";
                            break;
                        case 30:
                            objArr[1] = "getKMutableProperty2";
                            break;
                        case 31:
                            objArr[1] = "getIterator";
                            break;
                        case 32:
                            objArr[1] = "getIterable";
                            break;
                        case 33:
                            objArr[1] = "getMutableIterable";
                            break;
                        case 34:
                            objArr[1] = "getMutableIterator";
                            break;
                        case 35:
                            objArr[1] = "getCollection";
                            break;
                        case 36:
                            objArr[1] = "getMutableCollection";
                            break;
                        case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                            objArr[1] = "getList";
                            break;
                        case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
                            objArr[1] = "getMutableList";
                            break;
                        case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
                            objArr[1] = "getSet";
                            break;
                        case 40:
                            objArr[1] = "getMutableSet";
                            break;
                        case 41:
                            objArr[1] = "getMap";
                            break;
                        case 42:
                            objArr[1] = "getMutableMap";
                            break;
                        case ChatViewRecyclerTypes.FORWARD_HEADER /* 43 */:
                            objArr[1] = "getMapEntry";
                            break;
                        case ChatViewRecyclerTypes.FORWARD_BREADCRUMB /* 44 */:
                            objArr[1] = "getMutableMapEntry";
                            break;
                        case ChatViewRecyclerTypes.REACTION_BURST_REACTION /* 45 */:
                            objArr[1] = "getListIterator";
                            break;
                        case 46:
                            objArr[1] = "getMutableListIterator";
                            break;
                        default:
                            switch (i7) {
                                case 48:
                                    objArr[1] = "getBuiltInTypeByClassName";
                                    break;
                                case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_IMAGE /* 49 */:
                                    objArr[1] = "getNothingType";
                                    break;
                                case 50:
                                    objArr[1] = "getNullableNothingType";
                                    break;
                                case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_VISUAL_PLACEHOLDER /* 51 */:
                                    objArr[1] = "getAnyType";
                                    break;
                                case ChatViewRecyclerTypes.REFERRAL /* 52 */:
                                    objArr[1] = "getNullableAnyType";
                                    break;
                                case ChatViewRecyclerTypes.GUILD_PROFILE_INVITE /* 53 */:
                                    objArr[1] = "getDefaultBound";
                                    break;
                                default:
                                    switch (i7) {
                                        case ChatViewRecyclerTypes.ACTIVITY_RICH_PRESENCE_INVITE_EMBED /* 55 */:
                                            objArr[1] = "getPrimitiveKotlinType";
                                            break;
                                        case ChatViewRecyclerTypes.SHARED_CUSTOM_THEME_EMBED /* 56 */:
                                            objArr[1] = "getNumberType";
                                            break;
                                        case ChatViewRecyclerTypes.PREMIUM_GROUP_INVITE /* 57 */:
                                            objArr[1] = "getByteType";
                                            break;
                                        case ChatViewRecyclerTypes.REFERRAL_REDESIGN /* 58 */:
                                            objArr[1] = "getShortType";
                                            break;
                                        case ChatViewRecyclerTypes.VOICE_CHANNEL_LIST_INVITE /* 59 */:
                                            objArr[1] = "getIntType";
                                            break;
                                        case ChatViewRecyclerTypes.GIFT_INTENT /* 60 */:
                                            objArr[1] = "getLongType";
                                            break;
                                        case 61:
                                            objArr[1] = "getFloatType";
                                            break;
                                        case 62:
                                            objArr[1] = "getDoubleType";
                                            break;
                                        case 63:
                                            objArr[1] = "getCharType";
                                            break;
                                        case 64:
                                            objArr[1] = "getBooleanType";
                                            break;
                                        case 65:
                                            objArr[1] = "getUnitType";
                                            break;
                                        case 66:
                                            objArr[1] = "getStringType";
                                            break;
                                        case 67:
                                            objArr[1] = "getIterableType";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            objArr[1] = "getAnnotationType";
        }
        switch (i7) {
            case 1:
                objArr[2] = "setBuiltInsModule";
                break;
            case 2:
                objArr[2] = "setPostponedBuiltinsModuleComputation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
            case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
            case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
            case 40:
            case 41:
            case 42:
            case ChatViewRecyclerTypes.FORWARD_HEADER /* 43 */:
            case ChatViewRecyclerTypes.FORWARD_BREADCRUMB /* 44 */:
            case ChatViewRecyclerTypes.REACTION_BURST_REACTION /* 45 */:
            case 46:
            case 48:
            case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_IMAGE /* 49 */:
            case 50:
            case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_VISUAL_PLACEHOLDER /* 51 */:
            case ChatViewRecyclerTypes.REFERRAL /* 52 */:
            case ChatViewRecyclerTypes.GUILD_PROFILE_INVITE /* 53 */:
            case ChatViewRecyclerTypes.ACTIVITY_RICH_PRESENCE_INVITE_EMBED /* 55 */:
            case ChatViewRecyclerTypes.SHARED_CUSTOM_THEME_EMBED /* 56 */:
            case ChatViewRecyclerTypes.PREMIUM_GROUP_INVITE /* 57 */:
            case ChatViewRecyclerTypes.REFERRAL_REDESIGN /* 58 */:
            case ChatViewRecyclerTypes.VOICE_CHANNEL_LIST_INVITE /* 59 */:
            case ChatViewRecyclerTypes.GIFT_INTENT /* 60 */:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 74:
            case 81:
            case 84:
            case BuildConfig.REACT_NATIVE_MINOR_VERSION /* 86 */:
            case 87:
                break;
            case 9:
                objArr[2] = "isBuiltIn";
                break;
            case 10:
                objArr[2] = "isUnderKotlinPackage";
                break;
            case 12:
                objArr[2] = "getBuiltInClassByFqName";
                break;
            case 14:
                objArr[2] = "getBuiltInClassByName";
                break;
            case 16:
                objArr[2] = "getPrimitiveClassDescriptor";
                break;
            case 17:
                objArr[2] = "getPrimitiveArrayClassDescriptor";
                break;
            case ChatViewRecyclerTypes.REACTION_ADD_REACTION /* 47 */:
                objArr[2] = "getBuiltInTypeByClassName";
                break;
            case ChatViewRecyclerTypes.APP_MESSAGE_EMBED /* 54 */:
                objArr[2] = "getPrimitiveKotlinType";
                break;
            case 68:
                objArr[2] = "getArrayElementType";
                break;
            case 70:
                objArr[2] = "getArrayElementTypeOrNull";
                break;
            case 71:
            case 72:
                objArr[2] = "getElementTypeForUnsignedArray";
                break;
            case 73:
                objArr[2] = "getPrimitiveArrayKotlinType";
                break;
            case 75:
                objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                break;
            case 76:
            case 93:
                objArr[2] = "getPrimitiveType";
                break;
            case 77:
                objArr[2] = "getPrimitiveArrayType";
                break;
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
                objArr[2] = "getArrayType";
                break;
            case 85:
                objArr[2] = "getEnumType";
                break;
            case 88:
                objArr[2] = "isArray";
                break;
            case 89:
            case 90:
                objArr[2] = "isArrayOrPrimitiveArray";
                break;
            case 91:
                objArr[2] = "isPrimitiveArray";
                break;
            case 92:
                objArr[2] = "getPrimitiveArrayElementType";
                break;
            case 94:
                objArr[2] = "isPrimitiveType";
                break;
            case 95:
                objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                break;
            case 96:
                objArr[2] = "isPrimitiveClass";
                break;
            case 97:
            case 98:
            case 99:
            case 100:
                objArr[2] = "isConstructedFromGivenClass";
                break;
            case 101:
            case 102:
                objArr[2] = "isTypeConstructorForGivenClass";
                break;
            case 103:
            case 104:
                objArr[2] = "classFqNameEquals";
                break;
            case 105:
            case 106:
                objArr[2] = "isNotNullConstructedFromGivenClass";
                break;
            case 107:
                objArr[2] = "isSpecialClassWithNoSupertypes";
                break;
            case 108:
            case 109:
                objArr[2] = "isAny";
                break;
            case 110:
            case 112:
                objArr[2] = "isBoolean";
                break;
            case 111:
                objArr[2] = "isBooleanOrNullableBoolean";
                break;
            case 113:
                objArr[2] = "isNumber";
                break;
            case MediaEngine.MAX_SUPPORTED_PROTOCOL_VERSION /* 114 */:
                objArr[2] = "isChar";
                break;
            case 115:
                objArr[2] = "isCharOrNullableChar";
                break;
            case 116:
                objArr[2] = "isInt";
                break;
            case 117:
                objArr[2] = "isByte";
                break;
            case 118:
                objArr[2] = "isLong";
                break;
            case 119:
                objArr[2] = "isLongOrNullableLong";
                break;
            case 120:
                objArr[2] = "isShort";
                break;
            case 121:
                objArr[2] = "isFloat";
                break;
            case 122:
                objArr[2] = "isFloatOrNullableFloat";
                break;
            case 123:
                objArr[2] = "isDouble";
                break;
            case 124:
                objArr[2] = "isUByte";
                break;
            case 125:
                objArr[2] = "isUShort";
                break;
            case 126:
                objArr[2] = "isUInt";
                break;
            case 127:
                objArr[2] = "isULong";
                break;
            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT /* 128 */:
                objArr[2] = "isUByteArray";
                break;
            case 129:
                objArr[2] = "isUShortArray";
                break;
            case 130:
                objArr[2] = "isUIntArray";
                break;
            case 131:
                objArr[2] = "isULongArray";
                break;
            case 132:
                objArr[2] = "isUnsignedArrayType";
                break;
            case 133:
                objArr[2] = "isDoubleOrNullableDouble";
                break;
            case 134:
            case 135:
                objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                break;
            case 136:
                objArr[2] = "isNothing";
                break;
            case 137:
                objArr[2] = "isNullableNothing";
                break;
            case 138:
                objArr[2] = "isNothingOrNullableNothing";
                break;
            case 139:
                objArr[2] = "isAnyOrNullableAny";
                break;
            case 140:
                objArr[2] = "isNullableAny";
                break;
            case 141:
                objArr[2] = "isDefaultBound";
                break;
            case 142:
                objArr[2] = "isUnit";
                break;
            case 143:
                objArr[2] = "mayReturnNonUnitValue";
                break;
            case 144:
                objArr[2] = "isUnitOrNullableUnit";
                break;
            case 145:
                objArr[2] = "isBooleanOrSubtype";
                break;
            case MediaImageViewKt.OBSCURED_IMAGE_MIN_WIDTH /* 146 */:
                objArr[2] = "isMemberOfAny";
                break;
            case 147:
            case 148:
                objArr[2] = "isEnum";
                break;
            case 149:
            case 150:
                objArr[2] = "isComparable";
                break;
            case 151:
                objArr[2] = "isCollectionOrNullableCollection";
                break;
            case 152:
                objArr[2] = "isListOrNullableList";
                break;
            case 153:
                objArr[2] = "isSetOrNullableSet";
                break;
            case 154:
                objArr[2] = "isMapOrNullableMap";
                break;
            case 155:
                objArr[2] = "isIterableOrNullableIterable";
                break;
            case 156:
                objArr[2] = "isThrowableOrNullableThrowable";
                break;
            case 157:
                objArr[2] = "isThrowable";
                break;
            case 158:
                objArr[2] = "isKClass";
                break;
            case 159:
                objArr[2] = "isNonPrimitiveArray";
                break;
            case 160:
                objArr[2] = "isDeprecated";
                break;
            case 161:
                objArr[2] = "isNotNullOrNullableFunctionSupertype";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i7 != 11 && i7 != 13 && i7 != 15 && i7 != 69 && i7 != 74 && i7 != 81 && i7 != 84 && i7 != 86 && i7 != 87) {
            switch (i7) {
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    switch (i7) {
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                        case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
                        case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
                        case 40:
                        case 41:
                        case 42:
                        case ChatViewRecyclerTypes.FORWARD_HEADER /* 43 */:
                        case ChatViewRecyclerTypes.FORWARD_BREADCRUMB /* 44 */:
                        case ChatViewRecyclerTypes.REACTION_BURST_REACTION /* 45 */:
                        case 46:
                            break;
                        default:
                            switch (i7) {
                                case 48:
                                case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_IMAGE /* 49 */:
                                case 50:
                                case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_VISUAL_PLACEHOLDER /* 51 */:
                                case ChatViewRecyclerTypes.REFERRAL /* 52 */:
                                case ChatViewRecyclerTypes.GUILD_PROFILE_INVITE /* 53 */:
                                    break;
                                default:
                                    switch (i7) {
                                        case ChatViewRecyclerTypes.ACTIVITY_RICH_PRESENCE_INVITE_EMBED /* 55 */:
                                        case ChatViewRecyclerTypes.SHARED_CUSTOM_THEME_EMBED /* 56 */:
                                        case ChatViewRecyclerTypes.PREMIUM_GROUP_INVITE /* 57 */:
                                        case ChatViewRecyclerTypes.REFERRAL_REDESIGN /* 58 */:
                                        case ChatViewRecyclerTypes.VOICE_CHANNEL_LIST_INVITE /* 59 */:
                                        case ChatViewRecyclerTypes.GIFT_INTENT /* 60 */:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case 67:
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

    public static boolean b(vo.f fVar, up.d dVar) {
        if (fVar == null) {
            a(103);
            throw null;
        }
        if (dVar != null) {
            return fVar.getName().equals(dVar.f()) && dVar.equals(xp.e.g(fVar));
        }
        a(104);
        throw null;
    }

    public static k s(vo.i iVar) {
        if (iVar == null) {
            a(77);
            throw null;
        }
        if (o.f20371e0.contains(iVar.getName())) {
            return (k) o.f20375g0.get(xp.e.g(iVar));
        }
        return null;
    }

    public static k u(vo.f fVar) {
        if (fVar == null) {
            a(76);
            throw null;
        }
        if (o.f20369d0.contains(fVar.getName())) {
            return (k) o.f20373f0.get(xp.e.g(fVar));
        }
        return null;
    }

    public static boolean y(lq.z zVar) {
        if (zVar != null) {
            return B(zVar, o.f20363a);
        }
        a(139);
        throw null;
    }

    public static boolean z(lq.z zVar) {
        if (zVar != null) {
            return B(zVar, o.f20374g);
        }
        a(88);
        throw null;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    public final void c() {
        up.e moduleName = f20342e;
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        kq.l storageManager = this.f20346d;
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(this, "builtIns");
        z zVar = new z(moduleName, storageManager, this, 48);
        this.f20343a = zVar;
        c.f20332a.getClass();
        c cVar = (c) b.f20331b.getValue();
        z module = this.f20343a;
        Iterable classDescriptorFactories = m();
        xo.d platformDependentDeclarationFilter = q();
        xo.b additionalClassPartsProvider = d();
        iq.b bVar = (iq.b) cVar;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(module, "builtInsModule");
        Intrinsics.checkNotNullParameter(classDescriptorFactories, "classDescriptorFactories");
        Intrinsics.checkNotNullParameter(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        Intrinsics.checkNotNullParameter(additionalClassPartsProvider, "additionalClassPartsProvider");
        Set<up.c> packageFqNames = p.f20408r;
        c1 loadResource = new c1(1, bVar.f13402b, iq.d.class, "loadResource", "loadResource(Ljava/lang/String;)Ljava/io/InputStream;", 0, 3);
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(packageFqNames, "packageFqNames");
        Intrinsics.checkNotNullParameter(classDescriptorFactories, "classDescriptorFactories");
        Intrinsics.checkNotNullParameter(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        Intrinsics.checkNotNullParameter(additionalClassPartsProvider, "additionalClassPartsProvider");
        Intrinsics.checkNotNullParameter(loadResource, "loadResource");
        ArrayList arrayList = new ArrayList();
        for (up.c cVar2 : packageFqNames) {
            iq.a.f13401m.getClass();
            InputStream inputStream = (InputStream) loadResource.invoke(iq.a.a(cVar2));
            iq.c cVarM = inputStream != null ? ls.l.m(cVar2, storageManager, module, inputStream) : null;
            if (cVarM != null) {
                arrayList.add(cVarM);
            }
        }
        g0 providerForModuleContent = new g0(arrayList);
        com.google.firebase.messaging.r rVar = new com.google.firebase.messaging.r(storageManager, module);
        u4.c cVar3 = new u4.c((h0) providerForModuleContent);
        iq.a aVar = iq.a.f13401m;
        e4.r rVar2 = new e4.r(module, rVar, aVar);
        hq.k DO_NOTHING = hq.m.f11044a;
        Intrinsics.checkNotNullExpressionValue(DO_NOTHING, "DO_NOTHING");
        hq.j jVar = new hq.j(storageManager, module, cVar3, rVar2, providerForModuleContent, classDescriptorFactories, rVar, additionalClassPartsProvider, platformDependentDeclarationFilter, aVar.f10172a, null, new k8.a(storageManager, n0.f14659d), 851968);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((iq.c) it.next()).C0(jVar);
        }
        Intrinsics.checkNotNullParameter(providerForModuleContent, "providerForModuleContent");
        zVar.F = providerForModuleContent;
        z zVar2 = this.f20343a;
        zVar2.B0(zVar2);
    }

    public xo.b d() {
        return xo.a.f22990b;
    }

    public final d0 e() {
        d0 d0VarJ = k("Any").j();
        if (d0VarJ != null) {
            return d0VarJ;
        }
        a(51);
        throw null;
    }

    public final lq.z f(lq.z zVar) {
        if (zVar == null) {
            a(68);
            throw null;
        }
        lq.z zVarG = g(zVar);
        if (zVarG != null) {
            return zVarG;
        }
        throw new IllegalStateException("not array: " + zVar);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005b  */
    public final lq.z g(lq.z zVar) {
        up.b arrayClassId;
        vo.f fVarO;
        d0 d0VarJ;
        if (zVar == null) {
            a(70);
            throw null;
        }
        if (!z(zVar)) {
            d1 d1VarG = b1.g(zVar, false);
            lq.z zVar2 = (lq.z) ((h) this.f20344b.invoke()).f20341b.get(d1VarG);
            if (zVar2 != null) {
                return zVar2;
            }
            int i7 = xp.e.f22999a;
            vo.i iVarG = d1VarG.r0().g();
            vo.z zVarE = iVarG == null ? null : xp.e.e(iVarG);
            if (zVarE != null) {
                vo.i iVarG2 = d1VarG.r0().g();
                if (iVarG2 == null) {
                    d0VarJ = null;
                } else {
                    Set set = t.f20420a;
                    up.e name = iVarG2.getName();
                    Intrinsics.checkNotNullParameter(name, "name");
                    if (t.f20423d.contains(name) && (arrayClassId = bq.e.f(iVarG2)) != null) {
                        Intrinsics.checkNotNullParameter(arrayClassId, "arrayClassId");
                        up.b bVar = (up.b) t.f20421b.get(arrayClassId);
                        if (bVar == null || (fVarO = c0.o(zVarE, bVar)) == null) {
                            d0VarJ = null;
                        } else {
                            d0VarJ = fVarO.j();
                        }
                    } else {
                        d0VarJ = null;
                    }
                }
                if (d0VarJ != null) {
                    return d0VarJ;
                }
            }
        } else if (zVar.l0().size() == 1) {
            return ((t0) zVar.l0().get(0)).b();
        }
        return null;
    }

    public final d0 h(d1 d1Var) {
        e1 e1Var = e1.INVARIANT;
        if (d1Var != null) {
            return i(e1Var, d1Var, wo.g.f22379a);
        }
        a(83);
        throw null;
    }

    public final d0 i(e1 e1Var, lq.z zVar, wo.h hVar) {
        if (zVar == null) {
            a(79);
            throw null;
        }
        d0 d0VarS = lq.c.s(lq.c.C(hVar), k("Array"), Collections.singletonList(new lq.i0(zVar, e1Var)));
        if (d0VarS != null) {
            return d0VarS;
        }
        a(81);
        throw null;
    }

    public final vo.f j(up.c cVar) {
        if (cVar == null) {
            a(12);
            throw null;
        }
        z zVarL = l();
        dp.c cVar2 = dp.c.f7693d;
        vo.f fVarG = mf.f.G(zVarL, cVar);
        if (fVarG != null) {
            return fVarG;
        }
        a(13);
        throw null;
    }

    public final vo.f k(String str) {
        if (str != null) {
            return (vo.f) this.f20345c.invoke(up.e.e(str));
        }
        a(14);
        throw null;
    }

    public final z l() {
        this.f20343a.getClass();
        z zVar = this.f20343a;
        if (zVar != null) {
            return zVar;
        }
        a(7);
        throw null;
    }

    public Iterable m() {
        List listSingletonList = Collections.singletonList(new to.a(this.f20346d, l()));
        if (listSingletonList != null) {
            return listSingletonList;
        }
        a(5);
        throw null;
    }

    public final d0 n() {
        d0 d0VarP = p();
        if (d0VarP != null) {
            return d0VarP;
        }
        a(53);
        throw null;
    }

    public final d0 o() {
        d0 d0VarJ = k("Nothing").j();
        if (d0VarJ != null) {
            return d0VarJ;
        }
        a(49);
        throw null;
    }

    public final d0 p() {
        d0 d0VarA0 = e().x0(true);
        if (d0VarA0 != null) {
            return d0VarA0;
        }
        a(52);
        throw null;
    }

    public xo.d q() {
        return xo.a.f22992d;
    }

    public final d0 r(k kVar) {
        if (kVar == null) {
            a(73);
            throw null;
        }
        d0 d0Var = (d0) ((h) this.f20344b.invoke()).f20340a.get(kVar);
        if (d0Var != null) {
            return d0Var;
        }
        a(74);
        throw null;
    }

    public final d0 t(k kVar) {
        if (kVar == null) {
            a(54);
            throw null;
        }
        d0 d0VarJ = k(kVar.f20352d.b()).j();
        if (d0VarJ != null) {
            return d0VarJ;
        }
        a(55);
        throw null;
    }

    public final d0 v() {
        d0 d0VarJ = k("String").j();
        if (d0VarJ != null) {
            return d0VarJ;
        }
        a(66);
        throw null;
    }

    public final vo.f w(int i7) {
        return j(p.f20398f.a(up.e.e(to.j.f20863c.f20865b + i7)));
    }

    public final d0 x() {
        d0 d0VarJ = k("Unit").j();
        if (d0VarJ != null) {
            return d0VarJ;
        }
        a(65);
        throw null;
    }
}
