package com.discord.chat.presentation.list;

import com.discord.chat.presentation.message.view.MediaImageViewKt;
import com.discord.media.engine.MediaEngine;
import com.discord.misc.utilities.chat_view_types.ChatViewRecyclerTypes;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.internal.play_billing.v1;
import com.swmansion.reanimated.BuildConfig;
import io.sentry.ILogger;
import io.sentry.y2;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import mo.h;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static int a(int i7) {
        if (i7 == 90) {
            return 81;
        }
        if (i7 == 91) {
            return 82;
        }
        if (i7 == 93) {
            return 84;
        }
        if (i7 == 94) {
            return 85;
        }
        switch (i7) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 25:
                return 26;
            case 26:
                return 27;
            case 27:
                return 28;
            case 28:
                return 29;
            case 29:
                return 30;
            case 30:
                return 31;
            case 31:
                return 32;
            case 32:
                return 33;
            case 33:
                return 34;
            case 34:
                return 35;
            case 35:
                return 36;
            case 36:
                return 37;
            case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                return 38;
            case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
                return 39;
            case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
                return 40;
            case 40:
                return 41;
            case 41:
                return 42;
            case 42:
                return 43;
            case ChatViewRecyclerTypes.FORWARD_HEADER /* 43 */:
                return 44;
            case ChatViewRecyclerTypes.FORWARD_BREADCRUMB /* 44 */:
                return 45;
            case ChatViewRecyclerTypes.REACTION_BURST_REACTION /* 45 */:
                return 46;
            case 46:
                return 47;
            case ChatViewRecyclerTypes.REACTION_ADD_REACTION /* 47 */:
                return 48;
            case 48:
                return 49;
            case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_IMAGE /* 49 */:
                return 50;
            case 50:
                return 51;
            case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_VISUAL_PLACEHOLDER /* 51 */:
                return 52;
            case ChatViewRecyclerTypes.REFERRAL /* 52 */:
                return 53;
            case ChatViewRecyclerTypes.GUILD_PROFILE_INVITE /* 53 */:
                return 54;
            case ChatViewRecyclerTypes.APP_MESSAGE_EMBED /* 54 */:
                return 55;
            case ChatViewRecyclerTypes.ACTIVITY_RICH_PRESENCE_INVITE_EMBED /* 55 */:
                return 56;
            case ChatViewRecyclerTypes.SHARED_CUSTOM_THEME_EMBED /* 56 */:
                return 57;
            case ChatViewRecyclerTypes.PREMIUM_GROUP_INVITE /* 57 */:
                return 58;
            case ChatViewRecyclerTypes.REFERRAL_REDESIGN /* 58 */:
                return 59;
            case ChatViewRecyclerTypes.VOICE_CHANNEL_LIST_INVITE /* 59 */:
                return 60;
            case ChatViewRecyclerTypes.GIFT_INTENT /* 60 */:
                return 61;
            case 61:
                return 62;
            case 62:
                return 63;
            case 63:
                return 64;
            case 64:
                return 65;
            case 65:
                return 66;
            case 66:
                return 67;
            case 67:
                return 68;
            case 68:
                return 69;
            case 69:
                return 70;
            case 70:
                return 71;
            case 71:
                return 72;
            case 72:
                return 73;
            case 73:
                return 74;
            case 74:
                return 75;
            case 75:
                return 76;
            case 76:
                return 77;
            case 77:
                return 78;
            case 78:
                return 79;
            case 79:
                return 80;
            default:
                switch (i7) {
                    case 96:
                        return 87;
                    case 97:
                        return 88;
                    case 98:
                        return 89;
                    case 99:
                        return 90;
                    case 100:
                        return 91;
                    case 101:
                        return 92;
                    case 102:
                        return 83;
                    case 103:
                        return 86;
                    case 104:
                        return 93;
                    case 105:
                        return 94;
                    case 106:
                        return 95;
                    case 107:
                        return 96;
                    case 108:
                        return 97;
                    case 109:
                        return 98;
                    case 110:
                        return 99;
                    case 111:
                        return 100;
                    case 112:
                        return 101;
                    case 113:
                        return 102;
                    case MediaEngine.MAX_SUPPORTED_PROTOCOL_VERSION /* 114 */:
                        return 103;
                    case 115:
                        return 104;
                    case 116:
                        return 105;
                    case 117:
                        return 106;
                    case 118:
                        return 107;
                    case 119:
                        return 108;
                    case 120:
                        return 109;
                    case 121:
                        return 110;
                    case 122:
                        return 111;
                    case 123:
                        return 112;
                    case 124:
                        return 113;
                    case 125:
                        return MediaEngine.MAX_SUPPORTED_PROTOCOL_VERSION;
                    case 126:
                        return 117;
                    case 127:
                        return 119;
                    case IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT /* 128 */:
                        return 120;
                    case 129:
                        return 121;
                    case 130:
                        return 122;
                    case 131:
                        return 123;
                    case 132:
                        return 124;
                    case 133:
                        return 125;
                    case 134:
                        return 126;
                    case 135:
                        return 127;
                    case 136:
                        return IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                    case 137:
                        return 129;
                    case 138:
                        return 130;
                    case 139:
                        return 131;
                    case 140:
                        return 132;
                    case 141:
                        return 133;
                    case 142:
                        return 134;
                    case 143:
                        return 135;
                    case 144:
                        return 136;
                    case 145:
                        return 115;
                    case MediaImageViewKt.OBSCURED_IMAGE_MIN_WIDTH /* 146 */:
                        return 116;
                    case 147:
                        return 118;
                    case 148:
                        return 137;
                    case 149:
                        return 138;
                    case 150:
                        return 139;
                    case 151:
                        return 140;
                    case 152:
                        return 141;
                    case 153:
                        return 142;
                    case 154:
                        return 143;
                    case 155:
                        return 144;
                    case 156:
                        return 145;
                    case 157:
                        return MediaImageViewKt.OBSCURED_IMAGE_MIN_WIDTH;
                    default:
                        return 0;
                }
        }
    }

    public static /* synthetic */ boolean b(int i7) {
        if (i7 == 1 || i7 == 2) {
            return false;
        }
        if (i7 == 3 || i7 == 4) {
            return true;
        }
        throw null;
    }

    public static /* synthetic */ int c(int i7) {
        switch (i7) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 9;
            case 11:
                return 10;
            case 12:
                return 11;
            case 13:
                return 12;
            case 14:
                return 13;
            case 15:
                return 14;
            case 16:
                return 15;
            case 17:
                return 16;
            case 18:
                return 17;
            case 19:
                return 18;
            case 20:
                return 19;
            case 21:
                return 20;
            case 22:
                return 21;
            case 23:
                return 22;
            case 24:
                return 23;
            case 25:
                return 24;
            case 26:
                return 25;
            case 27:
                return 26;
            case 28:
                return 27;
            case 29:
                return 28;
            case 30:
                return 29;
            case 31:
                return 30;
            case 32:
                return 31;
            case 33:
                return 32;
            case 34:
                return 33;
            case 35:
                return 34;
            case 36:
                return 35;
            case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                return 36;
            case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
                return 37;
            case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
                return 38;
            case 40:
                return 39;
            case 41:
                return 40;
            case 42:
                return 41;
            case ChatViewRecyclerTypes.FORWARD_HEADER /* 43 */:
                return 42;
            case ChatViewRecyclerTypes.FORWARD_BREADCRUMB /* 44 */:
                return 43;
            case ChatViewRecyclerTypes.REACTION_BURST_REACTION /* 45 */:
                return 44;
            case 46:
                return 45;
            case ChatViewRecyclerTypes.REACTION_ADD_REACTION /* 47 */:
                return 46;
            case 48:
                return 47;
            case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_IMAGE /* 49 */:
                return 48;
            case 50:
                return 49;
            case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_VISUAL_PLACEHOLDER /* 51 */:
                return 50;
            case ChatViewRecyclerTypes.REFERRAL /* 52 */:
                return 51;
            case ChatViewRecyclerTypes.GUILD_PROFILE_INVITE /* 53 */:
                return 52;
            case ChatViewRecyclerTypes.APP_MESSAGE_EMBED /* 54 */:
                return 53;
            case ChatViewRecyclerTypes.ACTIVITY_RICH_PRESENCE_INVITE_EMBED /* 55 */:
                return 54;
            case ChatViewRecyclerTypes.SHARED_CUSTOM_THEME_EMBED /* 56 */:
                return 55;
            case ChatViewRecyclerTypes.PREMIUM_GROUP_INVITE /* 57 */:
                return 56;
            case ChatViewRecyclerTypes.REFERRAL_REDESIGN /* 58 */:
                return 57;
            case ChatViewRecyclerTypes.VOICE_CHANNEL_LIST_INVITE /* 59 */:
                return 58;
            case ChatViewRecyclerTypes.GIFT_INTENT /* 60 */:
                return 59;
            case 61:
                return 60;
            case 62:
                return 61;
            case 63:
                return 62;
            case 64:
                return 63;
            case 65:
                return 64;
            case 66:
                return 65;
            case 67:
                return 66;
            case 68:
                return 67;
            case 69:
                return 68;
            case 70:
                return 69;
            case 71:
                return 70;
            case 72:
                return 71;
            case 73:
                return 72;
            case 74:
                return 73;
            case 75:
                return 74;
            case 76:
                return 75;
            case 77:
                return 76;
            case 78:
                return 77;
            case 79:
                return 78;
            case 80:
                return 79;
            case 81:
                return 90;
            case 82:
                return 91;
            case 83:
                return 102;
            case 84:
                return 93;
            case 85:
                return 94;
            case BuildConfig.REACT_NATIVE_MINOR_VERSION /* 86 */:
                return 103;
            case 87:
                return 96;
            case 88:
                return 97;
            case 89:
                return 98;
            case 90:
                return 99;
            case 91:
                return 100;
            case 92:
                return 101;
            case 93:
                return 104;
            case 94:
                return 105;
            case 95:
                return 106;
            case 96:
                return 107;
            case 97:
                return 108;
            case 98:
                return 109;
            case 99:
                return 110;
            case 100:
                return 111;
            case 101:
                return 112;
            case 102:
                return 113;
            case 103:
                return MediaEngine.MAX_SUPPORTED_PROTOCOL_VERSION;
            case 104:
                return 115;
            case 105:
                return 116;
            case 106:
                return 117;
            case 107:
                return 118;
            case 108:
                return 119;
            case 109:
                return 120;
            case 110:
                return 121;
            case 111:
                return 122;
            case 112:
                return 123;
            case 113:
                return 124;
            case MediaEngine.MAX_SUPPORTED_PROTOCOL_VERSION /* 114 */:
                return 125;
            case 115:
                return 145;
            case 116:
                return MediaImageViewKt.OBSCURED_IMAGE_MIN_WIDTH;
            case 117:
                return 126;
            case 118:
                return 147;
            case 119:
                return 127;
            case 120:
                return IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            case 121:
                return 129;
            case 122:
                return 130;
            case 123:
                return 131;
            case 124:
                return 132;
            case 125:
                return 133;
            case 126:
                return 134;
            case 127:
                return 135;
            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT /* 128 */:
                return 136;
            case 129:
                return 137;
            case 130:
                return 138;
            case 131:
                return 139;
            case 132:
                return 140;
            case 133:
                return 141;
            case 134:
                return 142;
            case 135:
                return 143;
            case 136:
                return 144;
            case 137:
                return 148;
            case 138:
                return 149;
            case 139:
                return 150;
            case 140:
                return 151;
            case 141:
                return 152;
            case 142:
                return 153;
            case 143:
                return 154;
            case 144:
                return 155;
            case 145:
                return 156;
            case MediaImageViewKt.OBSCURED_IMAGE_MIN_WIDTH /* 146 */:
                return 157;
            default:
                throw null;
        }
    }

    public static int d(int i7, double d6, int i10) {
        return (Double.hashCode(d6) + i7) * i10;
    }

    public static int e(int i7, int i10, int i11) {
        return v1.S(i7) + i10 + i11;
    }

    public static int f(int i7, int i10, int i11, int i12) {
        return v1.S(i7) + i10 + i11 + i12;
    }

    public static int g(int i7, int i10, boolean z5) {
        return (Boolean.hashCode(z5) + i7) * i10;
    }

    public static int h(long j, int i7, int i10) {
        return (Long.hashCode(j) + i7) * i10;
    }

    public static String i(String str, Thread thread) {
        return str + thread;
    }

    public static String j(StringBuilder sb2, int i7, char c8) {
        sb2.append(i7);
        sb2.append(c8);
        return sb2.toString();
    }

    public static String k(StringBuilder sb2, String str, String str2) {
        sb2.append(str);
        sb2.append(str2);
        return sb2.toString();
    }

    public static String l(StringBuilder sb2, String str, String str2, String str3, String str4) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        return sb2.toString();
    }

    public static String m(StringBuilder sb2, boolean z5, String str) {
        sb2.append(z5);
        sb2.append(str);
        return sb2.toString();
    }

    public static StringBuilder n(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2;
    }

    public static StringBuilder o(String str, String str2, String str3, int i7, String str4) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i7);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        return sb2;
    }

    public static h p(Class cls, String str, String str2, int i7) {
        return Reflection.mutableProperty1(new MutablePropertyReference1Impl(cls, str, str2, i7));
    }

    public static void q(int i7, String str, String str2) {
        je.b.N(str2, str + i7);
    }

    public static void r(Integer num, String str, String str2, String str3, StringBuilder sb2) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(num);
        sb2.append(str3);
    }

    public static void s(ConcurrentHashMap concurrentHashMap, String str, y2 y2Var, String str2, ILogger iLogger) {
        Object obj = concurrentHashMap.get(str);
        y2Var.v(str2);
        y2Var.r(iLogger, obj);
    }

    public static boolean t(rp.b bVar, int i7, String str) {
        Boolean boolG = bVar.g(i7);
        Intrinsics.checkNotNullExpressionValue(boolG, str);
        return boolG.booleanValue();
    }

    public static int u(int i7, int i10, int i11) {
        return (Integer.hashCode(i7) + i10) * i11;
    }

    public static /* synthetic */ int v(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("sharp")) {
            return 1;
        }
        if (str.equals("smooth")) {
            return 2;
        }
        throw new IllegalArgumentException("No enum constant com.horcrux.svg.TextProperties.TextPathMidLine.".concat(str));
    }
}
