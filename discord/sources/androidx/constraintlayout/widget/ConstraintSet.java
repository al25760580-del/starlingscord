package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import com.discord.misc.utilities.chat_view_types.ChatViewRecyclerTypes;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.uimanager.ViewProps;
import com.swmansion.reanimated.BuildConfig;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class ConstraintSet {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f1335d = {0, 4, 8};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f1336e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final SparseIntArray f1337f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f1338a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1339b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f1340c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1336e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f1337f = sparseIntArray2;
        sparseIntArray.append(81, 25);
        sparseIntArray.append(82, 26);
        sparseIntArray.append(84, 29);
        sparseIntArray.append(85, 30);
        sparseIntArray.append(91, 36);
        sparseIntArray.append(90, 35);
        sparseIntArray.append(62, 4);
        sparseIntArray.append(61, 3);
        sparseIntArray.append(57, 1);
        sparseIntArray.append(59, 91);
        sparseIntArray.append(58, 92);
        sparseIntArray.append(100, 6);
        sparseIntArray.append(101, 7);
        sparseIntArray.append(69, 17);
        sparseIntArray.append(70, 18);
        sparseIntArray.append(71, 19);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(86, 32);
        sparseIntArray.append(87, 33);
        sparseIntArray.append(68, 10);
        sparseIntArray.append(67, 9);
        sparseIntArray.append(105, 13);
        sparseIntArray.append(108, 16);
        sparseIntArray.append(106, 14);
        sparseIntArray.append(103, 11);
        sparseIntArray.append(107, 15);
        sparseIntArray.append(104, 12);
        sparseIntArray.append(94, 40);
        sparseIntArray.append(79, 39);
        sparseIntArray.append(78, 41);
        sparseIntArray.append(93, 42);
        sparseIntArray.append(77, 20);
        sparseIntArray.append(92, 37);
        sparseIntArray.append(66, 5);
        sparseIntArray.append(80, 87);
        sparseIntArray.append(89, 87);
        sparseIntArray.append(83, 87);
        sparseIntArray.append(60, 87);
        sparseIntArray.append(56, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(95, 95);
        sparseIntArray.append(72, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(96, 54);
        sparseIntArray.append(73, 55);
        sparseIntArray.append(97, 56);
        sparseIntArray.append(74, 57);
        sparseIntArray.append(98, 58);
        sparseIntArray.append(75, 59);
        sparseIntArray.append(63, 61);
        sparseIntArray.append(65, 62);
        sparseIntArray.append(64, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(120, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(121, 67);
        sparseIntArray.append(112, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(111, 68);
        sparseIntArray.append(99, 69);
        sparseIntArray.append(76, 70);
        sparseIntArray.append(110, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(113, 76);
        sparseIntArray.append(88, 77);
        sparseIntArray.append(122, 78);
        sparseIntArray.append(55, 80);
        sparseIntArray.append(54, 81);
        sparseIntArray.append(115, 82);
        sparseIntArray.append(119, 83);
        sparseIntArray.append(118, 84);
        sparseIntArray.append(117, 85);
        sparseIntArray.append(116, 86);
        sparseIntArray2.append(84, 6);
        sparseIntArray2.append(84, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(88, 13);
        sparseIntArray2.append(91, 16);
        sparseIntArray2.append(89, 14);
        sparseIntArray2.append(86, 11);
        sparseIntArray2.append(90, 15);
        sparseIntArray2.append(87, 12);
        sparseIntArray2.append(77, 40);
        sparseIntArray2.append(70, 39);
        sparseIntArray2.append(69, 41);
        sparseIntArray2.append(76, 42);
        sparseIntArray2.append(68, 20);
        sparseIntArray2.append(75, 37);
        sparseIntArray2.append(59, 5);
        sparseIntArray2.append(71, 87);
        sparseIntArray2.append(74, 87);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(55, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(78, 95);
        sparseIntArray2.append(63, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(79, 54);
        sparseIntArray2.append(64, 55);
        sparseIntArray2.append(80, 56);
        sparseIntArray2.append(65, 57);
        sparseIntArray2.append(81, 58);
        sparseIntArray2.append(66, 59);
        sparseIntArray2.append(58, 62);
        sparseIntArray2.append(57, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(104, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(105, 67);
        sparseIntArray2.append(95, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(96, 98);
        sparseIntArray2.append(94, 68);
        sparseIntArray2.append(82, 69);
        sparseIntArray2.append(67, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(97, 76);
        sparseIntArray2.append(73, 77);
        sparseIntArray2.append(106, 78);
        sparseIntArray2.append(54, 80);
        sparseIntArray2.append(53, 81);
        sparseIntArray2.append(99, 82);
        sparseIntArray2.append(103, 83);
        sparseIntArray2.append(102, 84);
        sparseIntArray2.append(101, 85);
        sparseIntArray2.append(100, 86);
        sparseIntArray2.append(93, 97);
    }

    public static int[] e(Barrier barrier, String str) {
        int iIntValue;
        Object designInformation;
        String[] strArrSplit = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i7 = 0;
        int i10 = 0;
        while (i7 < strArrSplit.length) {
            String strTrim = strArrSplit[i7].trim();
            try {
                iIntValue = l.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, StackTraceHelper.ID_KEY, context.getPackageName());
            }
            if (iIntValue == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout) && (designInformation = ((ConstraintLayout) barrier.getParent()).getDesignInformation(0, strTrim)) != null && (designInformation instanceof Integer)) {
                iIntValue = ((Integer) designInformation).intValue();
            }
            iArr[i10] = iIntValue;
            i7++;
            i10++;
        }
        return i10 != strArrSplit.length ? Arrays.copyOf(iArr, i10) : iArr;
    }

    public static g f(Context context, AttributeSet attributeSet, boolean z5) {
        int i7;
        int i10;
        g gVar = new g();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z5 ? m.f1446c : m.f1444a);
        j jVar = gVar.f1377b;
        k kVar = gVar.f1380e;
        i iVar = gVar.f1378c;
        h hVar = gVar.f1379d;
        int[] iArr = f1335d;
        String[] strArr = q0.a.f18576a;
        SparseIntArray sparseIntArray = f1336e;
        if (z5) {
            f fVar = new f();
            fVar.f1366a = new int[10];
            fVar.f1367b = new int[10];
            fVar.f1368c = 0;
            fVar.f1369d = new int[10];
            fVar.f1370e = new float[10];
            fVar.f1371f = 0;
            fVar.f1372g = new int[5];
            fVar.f1373h = new String[5];
            fVar.f1374i = 0;
            fVar.j = new int[4];
            fVar.k = new boolean[4];
            fVar.f1375l = 0;
            iVar.getClass();
            hVar.getClass();
            kVar.getClass();
            int i11 = 0;
            for (int indexCount = typedArrayObtainStyledAttributes.getIndexCount(); i11 < indexCount; indexCount = i10) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                int i12 = i11;
                switch (f1337f.get(index)) {
                    case 2:
                        i10 = indexCount;
                        fVar.b(2, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, hVar.H));
                        continue;
                        i11 = i12 + 1;
                        break;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        StringBuilder sb2 = new StringBuilder("Unknown attribute 0x");
                        i10 = indexCount;
                        sb2.append(Integer.toHexString(index));
                        sb2.append("   ");
                        sb2.append(sparseIntArray.get(index));
                        Log.w("ConstraintSet", sb2.toString());
                        break;
                    case 5:
                        i10 = indexCount;
                        fVar.c(5, typedArrayObtainStyledAttributes.getString(index));
                        continue;
                        i11 = i12 + 1;
                        break;
                    case 6:
                        i10 = indexCount;
                        fVar.b(6, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, hVar.B));
                        break;
                    case 7:
                        i10 = indexCount;
                        fVar.b(7, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, hVar.C));
                        break;
                    case 8:
                        i10 = indexCount;
                        fVar.b(8, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, hVar.I));
                        break;
                    case 11:
                        i10 = indexCount;
                        fVar.b(11, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, hVar.O));
                        break;
                    case 12:
                        i10 = indexCount;
                        fVar.b(12, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, hVar.P));
                        break;
                    case 13:
                        i10 = indexCount;
                        fVar.b(13, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, hVar.L));
                        break;
                    case 14:
                        i10 = indexCount;
                        fVar.b(14, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, hVar.N));
                        break;
                    case 15:
                        i10 = indexCount;
                        fVar.b(15, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, hVar.Q));
                        break;
                    case 16:
                        i10 = indexCount;
                        fVar.b(16, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, hVar.M));
                        break;
                    case 17:
                        i10 = indexCount;
                        fVar.b(17, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, hVar.f1388d));
                        break;
                    case 18:
                        i10 = indexCount;
                        fVar.b(18, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, hVar.f1390e));
                        break;
                    case 19:
                        i10 = indexCount;
                        fVar.a(typedArrayObtainStyledAttributes.getFloat(index, hVar.f1392f), 19);
                        break;
                    case 20:
                        i10 = indexCount;
                        fVar.a(typedArrayObtainStyledAttributes.getFloat(index, hVar.f1414v), 20);
                        break;
                    case 21:
                        i10 = indexCount;
                        fVar.b(21, typedArrayObtainStyledAttributes.getLayoutDimension(index, hVar.f1386c));
                        break;
                    case 22:
                        i10 = indexCount;
                        fVar.b(22, iArr[typedArrayObtainStyledAttributes.getInt(index, jVar.f1428a)]);
                        break;
                    case 23:
                        i10 = indexCount;
                        fVar.b(23, typedArrayObtainStyledAttributes.getLayoutDimension(index, hVar.f1384b));
                        break;
                    case 24:
                        i10 = indexCount;
                        fVar.b(24, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, hVar.E));
                        break;
                    case 27:
                        i10 = indexCount;
                        fVar.b(27, typedArrayObtainStyledAttributes.getInt(index, hVar.D));
                        break;
                    case 28:
                        i10 = indexCount;
                        fVar.b(28, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, hVar.F));
                        break;
                    case 31:
                        i10 = indexCount;
                        fVar.b(31, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, hVar.J));
                        break;
                    case 34:
                        i10 = indexCount;
                        fVar.b(34, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, hVar.G));
                        break;
                    case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                        i10 = indexCount;
                        fVar.a(typedArrayObtainStyledAttributes.getFloat(index, hVar.f1415w), 37);
                        break;
                    case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
                        i10 = indexCount;
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, gVar.f1376a);
                        gVar.f1376a = resourceId;
                        fVar.b(38, resourceId);
                        break;
                    case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
                        i10 = indexCount;
                        fVar.a(typedArrayObtainStyledAttributes.getFloat(index, hVar.T), 39);
                        break;
                    case 40:
                        i10 = indexCount;
                        fVar.a(typedArrayObtainStyledAttributes.getFloat(index, hVar.S), 40);
                        break;
                    case 41:
                        i10 = indexCount;
                        fVar.b(41, typedArrayObtainStyledAttributes.getInt(index, hVar.U));
                        break;
                    case 42:
                        i10 = indexCount;
                        fVar.b(42, typedArrayObtainStyledAttributes.getInt(index, hVar.V));
                        break;
                    case ChatViewRecyclerTypes.FORWARD_HEADER /* 43 */:
                        i10 = indexCount;
                        fVar.a(typedArrayObtainStyledAttributes.getFloat(index, jVar.f1430c), 43);
                        break;
                    case ChatViewRecyclerTypes.FORWARD_BREADCRUMB /* 44 */:
                        i10 = indexCount;
                        fVar.d(44, true);
                        fVar.a(typedArrayObtainStyledAttributes.getDimension(index, kVar.f1443m), 44);
                        break;
                    case ChatViewRecyclerTypes.REACTION_BURST_REACTION /* 45 */:
                        i10 = indexCount;
                        fVar.a(typedArrayObtainStyledAttributes.getFloat(index, kVar.f1434b), 45);
                        break;
                    case 46:
                        i10 = indexCount;
                        fVar.a(typedArrayObtainStyledAttributes.getFloat(index, kVar.f1435c), 46);
                        break;
                    case ChatViewRecyclerTypes.REACTION_ADD_REACTION /* 47 */:
                        i10 = indexCount;
                        fVar.a(typedArrayObtainStyledAttributes.getFloat(index, kVar.f1436d), 47);
                        break;
                    case 48:
                        i10 = indexCount;
                        fVar.a(typedArrayObtainStyledAttributes.getFloat(index, kVar.f1437e), 48);
                        break;
                    case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_IMAGE /* 49 */:
                        i10 = indexCount;
                        fVar.a(typedArrayObtainStyledAttributes.getDimension(index, kVar.f1438f), 49);
                        break;
                    case 50:
                        i10 = indexCount;
                        fVar.a(typedArrayObtainStyledAttributes.getDimension(index, kVar.f1439g), 50);
                        break;
                    case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_VISUAL_PLACEHOLDER /* 51 */:
                        i10 = indexCount;
                        fVar.a(typedArrayObtainStyledAttributes.getDimension(index, kVar.f1441i), 51);
                        break;
                    case ChatViewRecyclerTypes.REFERRAL /* 52 */:
                        i10 = indexCount;
                        fVar.a(typedArrayObtainStyledAttributes.getDimension(index, kVar.j), 52);
                        break;
                    case ChatViewRecyclerTypes.GUILD_PROFILE_INVITE /* 53 */:
                        i10 = indexCount;
                        fVar.a(typedArrayObtainStyledAttributes.getDimension(index, kVar.k), 53);
                        break;
                    case ChatViewRecyclerTypes.APP_MESSAGE_EMBED /* 54 */:
                        i10 = indexCount;
                        fVar.b(54, typedArrayObtainStyledAttributes.getInt(index, hVar.W));
                        break;
                    case ChatViewRecyclerTypes.ACTIVITY_RICH_PRESENCE_INVITE_EMBED /* 55 */:
                        i10 = indexCount;
                        fVar.b(55, typedArrayObtainStyledAttributes.getInt(index, hVar.X));
                        break;
                    case ChatViewRecyclerTypes.SHARED_CUSTOM_THEME_EMBED /* 56 */:
                        i10 = indexCount;
                        fVar.b(56, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, hVar.Y));
                        break;
                    case ChatViewRecyclerTypes.PREMIUM_GROUP_INVITE /* 57 */:
                        i10 = indexCount;
                        fVar.b(57, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, hVar.Z));
                        break;
                    case ChatViewRecyclerTypes.REFERRAL_REDESIGN /* 58 */:
                        i10 = indexCount;
                        fVar.b(58, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, hVar.a0));
                        break;
                    case ChatViewRecyclerTypes.VOICE_CHANNEL_LIST_INVITE /* 59 */:
                        i10 = indexCount;
                        fVar.b(59, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, hVar.f1385b0));
                        break;
                    case ChatViewRecyclerTypes.GIFT_INTENT /* 60 */:
                        i10 = indexCount;
                        fVar.a(typedArrayObtainStyledAttributes.getFloat(index, kVar.f1433a), 60);
                        break;
                    case 62:
                        i10 = indexCount;
                        fVar.b(62, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, hVar.f1418z));
                        break;
                    case 63:
                        i10 = indexCount;
                        fVar.a(typedArrayObtainStyledAttributes.getFloat(index, hVar.A), 63);
                        break;
                    case 64:
                        i10 = indexCount;
                        fVar.b(64, h(typedArrayObtainStyledAttributes, index, iVar.f1419a));
                        break;
                    case 65:
                        i10 = indexCount;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            fVar.c(65, typedArrayObtainStyledAttributes.getString(index));
                        } else {
                            fVar.c(65, strArr[typedArrayObtainStyledAttributes.getInteger(index, 0)]);
                        }
                        break;
                    case 66:
                        i10 = indexCount;
                        fVar.b(66, typedArrayObtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        i10 = indexCount;
                        fVar.a(typedArrayObtainStyledAttributes.getFloat(index, iVar.f1423e), 67);
                        break;
                    case 68:
                        i10 = indexCount;
                        fVar.a(typedArrayObtainStyledAttributes.getFloat(index, jVar.f1431d), 68);
                        break;
                    case 69:
                        i10 = indexCount;
                        fVar.a(typedArrayObtainStyledAttributes.getFloat(index, 1.0f), 69);
                        break;
                    case 70:
                        i10 = indexCount;
                        fVar.a(typedArrayObtainStyledAttributes.getFloat(index, 1.0f), 70);
                        break;
                    case 71:
                        i10 = indexCount;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i10 = indexCount;
                        fVar.b(72, typedArrayObtainStyledAttributes.getInt(index, hVar.f1391e0));
                        break;
                    case 73:
                        i10 = indexCount;
                        fVar.b(73, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, hVar.f1393f0));
                        break;
                    case 74:
                        i10 = indexCount;
                        fVar.c(74, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 75:
                        i10 = indexCount;
                        fVar.d(75, typedArrayObtainStyledAttributes.getBoolean(index, hVar.f1404m0));
                        break;
                    case 76:
                        i10 = indexCount;
                        fVar.b(76, typedArrayObtainStyledAttributes.getInt(index, iVar.f1421c));
                        break;
                    case 77:
                        i10 = indexCount;
                        fVar.c(77, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 78:
                        i10 = indexCount;
                        fVar.b(78, typedArrayObtainStyledAttributes.getInt(index, jVar.f1429b));
                        break;
                    case 79:
                        i10 = indexCount;
                        fVar.a(typedArrayObtainStyledAttributes.getFloat(index, iVar.f1422d), 79);
                        break;
                    case 80:
                        i10 = indexCount;
                        fVar.d(80, typedArrayObtainStyledAttributes.getBoolean(index, hVar.f1400k0));
                        break;
                    case 81:
                        i10 = indexCount;
                        fVar.d(81, typedArrayObtainStyledAttributes.getBoolean(index, hVar.f1402l0));
                        break;
                    case 82:
                        i10 = indexCount;
                        fVar.b(82, typedArrayObtainStyledAttributes.getInteger(index, iVar.f1420b));
                        break;
                    case 83:
                        i10 = indexCount;
                        fVar.b(83, h(typedArrayObtainStyledAttributes, index, kVar.f1440h));
                        break;
                    case 84:
                        i10 = indexCount;
                        fVar.b(84, typedArrayObtainStyledAttributes.getInteger(index, iVar.f1425g));
                        break;
                    case 85:
                        i10 = indexCount;
                        fVar.a(typedArrayObtainStyledAttributes.getFloat(index, iVar.f1424f), 85);
                        break;
                    case BuildConfig.REACT_NATIVE_MINOR_VERSION /* 86 */:
                        i10 = indexCount;
                        int i13 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i13 == 1) {
                            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            iVar.f1427i = resourceId2;
                            fVar.b(89, resourceId2);
                            if (iVar.f1427i != -1) {
                                fVar.b(88, -2);
                            }
                        } else if (i13 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            iVar.f1426h = string;
                            fVar.c(90, string);
                            if (iVar.f1426h.indexOf("/") > 0) {
                                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                iVar.f1427i = resourceId3;
                                fVar.b(89, resourceId3);
                                fVar.b(88, -2);
                            } else {
                                fVar.b(88, -1);
                            }
                        } else {
                            fVar.b(88, typedArrayObtainStyledAttributes.getInteger(index, iVar.f1427i));
                        }
                        break;
                    case 87:
                        i10 = indexCount;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 93:
                        i10 = indexCount;
                        fVar.b(93, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, hVar.K));
                        break;
                    case 94:
                        i10 = indexCount;
                        fVar.b(94, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, hVar.R));
                        break;
                    case 95:
                        i10 = indexCount;
                        i(fVar, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        i10 = indexCount;
                        i(fVar, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        i10 = indexCount;
                        fVar.b(97, typedArrayObtainStyledAttributes.getInt(index, hVar.f1406n0));
                        break;
                    case 98:
                        i10 = indexCount;
                        int i14 = t0.a.f20569d;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            gVar.f1376a = typedArrayObtainStyledAttributes.getResourceId(index, gVar.f1376a);
                        }
                        break;
                }
                i11 = i12 + 1;
            }
        } else {
            int i15 = 0;
            for (int indexCount2 = typedArrayObtainStyledAttributes.getIndexCount(); i15 < indexCount2; indexCount2 = i7) {
                int index2 = typedArrayObtainStyledAttributes.getIndex(i15);
                if (index2 != 1 && 23 != index2) {
                    if (24 != index2) {
                        iVar.getClass();
                        hVar.getClass();
                        kVar.getClass();
                    }
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i7 = indexCount2;
                        hVar.f1407o = h(typedArrayObtainStyledAttributes, index2, hVar.f1407o);
                        continue;
                        i15++;
                        break;
                    case 2:
                        i7 = indexCount2;
                        hVar.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, hVar.H);
                        continue;
                        i15++;
                        break;
                    case 3:
                        i7 = indexCount2;
                        hVar.f1405n = h(typedArrayObtainStyledAttributes, index2, hVar.f1405n);
                        continue;
                        i15++;
                        break;
                    case 4:
                        i7 = indexCount2;
                        hVar.f1403m = h(typedArrayObtainStyledAttributes, index2, hVar.f1403m);
                        continue;
                        i15++;
                        break;
                    case 5:
                        i7 = indexCount2;
                        hVar.f1416x = typedArrayObtainStyledAttributes.getString(index2);
                        continue;
                        i15++;
                        break;
                    case 6:
                        i7 = indexCount2;
                        hVar.B = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, hVar.B);
                        continue;
                        i15++;
                        break;
                    case 7:
                        i7 = indexCount2;
                        hVar.C = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, hVar.C);
                        continue;
                        i15++;
                        break;
                    case 8:
                        i7 = indexCount2;
                        hVar.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, hVar.I);
                        continue;
                        i15++;
                        break;
                    case 9:
                        i7 = indexCount2;
                        hVar.f1413u = h(typedArrayObtainStyledAttributes, index2, hVar.f1413u);
                        continue;
                        i15++;
                        break;
                    case 10:
                        i7 = indexCount2;
                        hVar.f1412t = h(typedArrayObtainStyledAttributes, index2, hVar.f1412t);
                        continue;
                        i15++;
                        break;
                    case 11:
                        i7 = indexCount2;
                        hVar.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, hVar.O);
                        continue;
                        i15++;
                        break;
                    case 12:
                        i7 = indexCount2;
                        hVar.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, hVar.P);
                        continue;
                        i15++;
                        break;
                    case 13:
                        i7 = indexCount2;
                        hVar.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, hVar.L);
                        continue;
                        i15++;
                        break;
                    case 14:
                        i7 = indexCount2;
                        hVar.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, hVar.N);
                        continue;
                        i15++;
                        break;
                    case 15:
                        i7 = indexCount2;
                        hVar.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, hVar.Q);
                        continue;
                        i15++;
                        break;
                    case 16:
                        i7 = indexCount2;
                        hVar.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, hVar.M);
                        continue;
                        i15++;
                        break;
                    case 17:
                        i7 = indexCount2;
                        hVar.f1388d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, hVar.f1388d);
                        continue;
                        i15++;
                        break;
                    case 18:
                        i7 = indexCount2;
                        hVar.f1390e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, hVar.f1390e);
                        continue;
                        i15++;
                        break;
                    case 19:
                        i7 = indexCount2;
                        hVar.f1392f = typedArrayObtainStyledAttributes.getFloat(index2, hVar.f1392f);
                        continue;
                        i15++;
                        break;
                    case 20:
                        i7 = indexCount2;
                        hVar.f1414v = typedArrayObtainStyledAttributes.getFloat(index2, hVar.f1414v);
                        continue;
                        i15++;
                        break;
                    case 21:
                        i7 = indexCount2;
                        hVar.f1386c = typedArrayObtainStyledAttributes.getLayoutDimension(index2, hVar.f1386c);
                        continue;
                        i15++;
                        break;
                    case 22:
                        i7 = indexCount2;
                        int i16 = typedArrayObtainStyledAttributes.getInt(index2, jVar.f1428a);
                        jVar.f1428a = i16;
                        jVar.f1428a = iArr[i16];
                        continue;
                        i15++;
                        break;
                    case 23:
                        i7 = indexCount2;
                        hVar.f1384b = typedArrayObtainStyledAttributes.getLayoutDimension(index2, hVar.f1384b);
                        continue;
                        i15++;
                        break;
                    case 24:
                        i7 = indexCount2;
                        hVar.E = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, hVar.E);
                        continue;
                        i15++;
                        break;
                    case 25:
                        i7 = indexCount2;
                        hVar.f1394g = h(typedArrayObtainStyledAttributes, index2, hVar.f1394g);
                        continue;
                        i15++;
                        break;
                    case 26:
                        i7 = indexCount2;
                        hVar.f1396h = h(typedArrayObtainStyledAttributes, index2, hVar.f1396h);
                        continue;
                        i15++;
                        break;
                    case 27:
                        i7 = indexCount2;
                        hVar.D = typedArrayObtainStyledAttributes.getInt(index2, hVar.D);
                        continue;
                        i15++;
                        break;
                    case 28:
                        i7 = indexCount2;
                        hVar.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, hVar.F);
                        continue;
                        i15++;
                        break;
                    case 29:
                        i7 = indexCount2;
                        hVar.f1397i = h(typedArrayObtainStyledAttributes, index2, hVar.f1397i);
                        continue;
                        i15++;
                        break;
                    case 30:
                        i7 = indexCount2;
                        hVar.j = h(typedArrayObtainStyledAttributes, index2, hVar.j);
                        continue;
                        i15++;
                        break;
                    case 31:
                        i7 = indexCount2;
                        hVar.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, hVar.J);
                        continue;
                        i15++;
                        break;
                    case 32:
                        i7 = indexCount2;
                        hVar.f1410r = h(typedArrayObtainStyledAttributes, index2, hVar.f1410r);
                        continue;
                        i15++;
                        break;
                    case 33:
                        i7 = indexCount2;
                        hVar.f1411s = h(typedArrayObtainStyledAttributes, index2, hVar.f1411s);
                        continue;
                        i15++;
                        break;
                    case 34:
                        i7 = indexCount2;
                        hVar.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, hVar.G);
                        continue;
                        i15++;
                        break;
                    case 35:
                        i7 = indexCount2;
                        hVar.f1401l = h(typedArrayObtainStyledAttributes, index2, hVar.f1401l);
                        continue;
                        i15++;
                        break;
                    case 36:
                        i7 = indexCount2;
                        hVar.k = h(typedArrayObtainStyledAttributes, index2, hVar.k);
                        continue;
                        i15++;
                        break;
                    case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                        i7 = indexCount2;
                        hVar.f1415w = typedArrayObtainStyledAttributes.getFloat(index2, hVar.f1415w);
                        continue;
                        i15++;
                        break;
                    case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
                        i7 = indexCount2;
                        gVar.f1376a = typedArrayObtainStyledAttributes.getResourceId(index2, gVar.f1376a);
                        continue;
                        i15++;
                        break;
                    case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
                        i7 = indexCount2;
                        hVar.T = typedArrayObtainStyledAttributes.getFloat(index2, hVar.T);
                        continue;
                        i15++;
                        break;
                    case 40:
                        i7 = indexCount2;
                        hVar.S = typedArrayObtainStyledAttributes.getFloat(index2, hVar.S);
                        continue;
                        i15++;
                        break;
                    case 41:
                        i7 = indexCount2;
                        hVar.U = typedArrayObtainStyledAttributes.getInt(index2, hVar.U);
                        continue;
                        i15++;
                        break;
                    case 42:
                        i7 = indexCount2;
                        hVar.V = typedArrayObtainStyledAttributes.getInt(index2, hVar.V);
                        continue;
                        i15++;
                        break;
                    case ChatViewRecyclerTypes.FORWARD_HEADER /* 43 */:
                        i7 = indexCount2;
                        jVar.f1430c = typedArrayObtainStyledAttributes.getFloat(index2, jVar.f1430c);
                        continue;
                        i15++;
                        break;
                    case ChatViewRecyclerTypes.FORWARD_BREADCRUMB /* 44 */:
                        i7 = indexCount2;
                        kVar.f1442l = true;
                        kVar.f1443m = typedArrayObtainStyledAttributes.getDimension(index2, kVar.f1443m);
                        continue;
                        i15++;
                        break;
                    case ChatViewRecyclerTypes.REACTION_BURST_REACTION /* 45 */:
                        i7 = indexCount2;
                        kVar.f1434b = typedArrayObtainStyledAttributes.getFloat(index2, kVar.f1434b);
                        continue;
                        i15++;
                        break;
                    case 46:
                        i7 = indexCount2;
                        kVar.f1435c = typedArrayObtainStyledAttributes.getFloat(index2, kVar.f1435c);
                        continue;
                        i15++;
                        break;
                    case ChatViewRecyclerTypes.REACTION_ADD_REACTION /* 47 */:
                        i7 = indexCount2;
                        kVar.f1436d = typedArrayObtainStyledAttributes.getFloat(index2, kVar.f1436d);
                        continue;
                        i15++;
                        break;
                    case 48:
                        i7 = indexCount2;
                        kVar.f1437e = typedArrayObtainStyledAttributes.getFloat(index2, kVar.f1437e);
                        continue;
                        i15++;
                        break;
                    case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_IMAGE /* 49 */:
                        i7 = indexCount2;
                        kVar.f1438f = typedArrayObtainStyledAttributes.getDimension(index2, kVar.f1438f);
                        continue;
                        i15++;
                        break;
                    case 50:
                        i7 = indexCount2;
                        kVar.f1439g = typedArrayObtainStyledAttributes.getDimension(index2, kVar.f1439g);
                        continue;
                        i15++;
                        break;
                    case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_VISUAL_PLACEHOLDER /* 51 */:
                        i7 = indexCount2;
                        kVar.f1441i = typedArrayObtainStyledAttributes.getDimension(index2, kVar.f1441i);
                        continue;
                        i15++;
                        break;
                    case ChatViewRecyclerTypes.REFERRAL /* 52 */:
                        i7 = indexCount2;
                        kVar.j = typedArrayObtainStyledAttributes.getDimension(index2, kVar.j);
                        continue;
                        i15++;
                        break;
                    case ChatViewRecyclerTypes.GUILD_PROFILE_INVITE /* 53 */:
                        i7 = indexCount2;
                        kVar.k = typedArrayObtainStyledAttributes.getDimension(index2, kVar.k);
                        continue;
                        i15++;
                        break;
                    case ChatViewRecyclerTypes.APP_MESSAGE_EMBED /* 54 */:
                        i7 = indexCount2;
                        hVar.W = typedArrayObtainStyledAttributes.getInt(index2, hVar.W);
                        continue;
                        i15++;
                        break;
                    case ChatViewRecyclerTypes.ACTIVITY_RICH_PRESENCE_INVITE_EMBED /* 55 */:
                        i7 = indexCount2;
                        hVar.X = typedArrayObtainStyledAttributes.getInt(index2, hVar.X);
                        continue;
                        i15++;
                        break;
                    case ChatViewRecyclerTypes.SHARED_CUSTOM_THEME_EMBED /* 56 */:
                        i7 = indexCount2;
                        hVar.Y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, hVar.Y);
                        continue;
                        i15++;
                        break;
                    case ChatViewRecyclerTypes.PREMIUM_GROUP_INVITE /* 57 */:
                        i7 = indexCount2;
                        hVar.Z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, hVar.Z);
                        continue;
                        i15++;
                        break;
                    case ChatViewRecyclerTypes.REFERRAL_REDESIGN /* 58 */:
                        i7 = indexCount2;
                        hVar.a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, hVar.a0);
                        continue;
                        i15++;
                        break;
                    case ChatViewRecyclerTypes.VOICE_CHANNEL_LIST_INVITE /* 59 */:
                        i7 = indexCount2;
                        hVar.f1385b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, hVar.f1385b0);
                        continue;
                        i15++;
                        break;
                    case ChatViewRecyclerTypes.GIFT_INTENT /* 60 */:
                        i7 = indexCount2;
                        kVar.f1433a = typedArrayObtainStyledAttributes.getFloat(index2, kVar.f1433a);
                        continue;
                        i15++;
                        break;
                    case 61:
                        i7 = indexCount2;
                        hVar.f1417y = h(typedArrayObtainStyledAttributes, index2, hVar.f1417y);
                        continue;
                        i15++;
                        break;
                    case 62:
                        i7 = indexCount2;
                        hVar.f1418z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, hVar.f1418z);
                        continue;
                        i15++;
                        break;
                    case 63:
                        i7 = indexCount2;
                        hVar.A = typedArrayObtainStyledAttributes.getFloat(index2, hVar.A);
                        continue;
                        i15++;
                        break;
                    case 64:
                        i7 = indexCount2;
                        iVar.f1419a = h(typedArrayObtainStyledAttributes, index2, iVar.f1419a);
                        continue;
                        i15++;
                        break;
                    case 65:
                        i7 = indexCount2;
                        if (typedArrayObtainStyledAttributes.peekValue(index2).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index2);
                            iVar.getClass();
                        } else {
                            String str = strArr[typedArrayObtainStyledAttributes.getInteger(index2, 0)];
                            iVar.getClass();
                        }
                        i15++;
                        break;
                    case 66:
                        i7 = indexCount2;
                        typedArrayObtainStyledAttributes.getInt(index2, 0);
                        iVar.getClass();
                        continue;
                        i15++;
                        break;
                    case 67:
                        i7 = indexCount2;
                        iVar.f1423e = typedArrayObtainStyledAttributes.getFloat(index2, iVar.f1423e);
                        break;
                    case 68:
                        i7 = indexCount2;
                        jVar.f1431d = typedArrayObtainStyledAttributes.getFloat(index2, jVar.f1431d);
                        break;
                    case 69:
                        i7 = indexCount2;
                        hVar.f1387c0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        i7 = indexCount2;
                        hVar.f1389d0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        i7 = indexCount2;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i7 = indexCount2;
                        hVar.f1391e0 = typedArrayObtainStyledAttributes.getInt(index2, hVar.f1391e0);
                        break;
                    case 73:
                        i7 = indexCount2;
                        hVar.f1393f0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, hVar.f1393f0);
                        break;
                    case 74:
                        i7 = indexCount2;
                        hVar.f1398i0 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        i7 = indexCount2;
                        hVar.f1404m0 = typedArrayObtainStyledAttributes.getBoolean(index2, hVar.f1404m0);
                        break;
                    case 76:
                        i7 = indexCount2;
                        iVar.f1421c = typedArrayObtainStyledAttributes.getInt(index2, iVar.f1421c);
                        break;
                    case 77:
                        i7 = indexCount2;
                        hVar.f1399j0 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        i7 = indexCount2;
                        jVar.f1429b = typedArrayObtainStyledAttributes.getInt(index2, jVar.f1429b);
                        break;
                    case 79:
                        i7 = indexCount2;
                        iVar.f1422d = typedArrayObtainStyledAttributes.getFloat(index2, iVar.f1422d);
                        break;
                    case 80:
                        i7 = indexCount2;
                        hVar.f1400k0 = typedArrayObtainStyledAttributes.getBoolean(index2, hVar.f1400k0);
                        break;
                    case 81:
                        i7 = indexCount2;
                        hVar.f1402l0 = typedArrayObtainStyledAttributes.getBoolean(index2, hVar.f1402l0);
                        break;
                    case 82:
                        i7 = indexCount2;
                        iVar.f1420b = typedArrayObtainStyledAttributes.getInteger(index2, iVar.f1420b);
                        break;
                    case 83:
                        i7 = indexCount2;
                        kVar.f1440h = h(typedArrayObtainStyledAttributes, index2, kVar.f1440h);
                        break;
                    case 84:
                        i7 = indexCount2;
                        iVar.f1425g = typedArrayObtainStyledAttributes.getInteger(index2, iVar.f1425g);
                        break;
                    case 85:
                        i7 = indexCount2;
                        iVar.f1424f = typedArrayObtainStyledAttributes.getFloat(index2, iVar.f1424f);
                        break;
                    case BuildConfig.REACT_NATIVE_MINOR_VERSION /* 86 */:
                        i7 = indexCount2;
                        int i17 = typedArrayObtainStyledAttributes.peekValue(index2).type;
                        if (i17 == 1) {
                            iVar.f1427i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                        } else if (i17 == 3) {
                            String string2 = typedArrayObtainStyledAttributes.getString(index2);
                            iVar.f1426h = string2;
                            if (string2.indexOf("/") > 0) {
                                iVar.f1427i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            typedArrayObtainStyledAttributes.getInteger(index2, iVar.f1427i);
                        }
                        break;
                    case 87:
                        i7 = indexCount2;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        StringBuilder sb3 = new StringBuilder("Unknown attribute 0x");
                        i7 = indexCount2;
                        sb3.append(Integer.toHexString(index2));
                        sb3.append("   ");
                        sb3.append(sparseIntArray.get(index2));
                        Log.w("ConstraintSet", sb3.toString());
                        break;
                    case 91:
                        i7 = indexCount2;
                        hVar.f1408p = h(typedArrayObtainStyledAttributes, index2, hVar.f1408p);
                        break;
                    case 92:
                        i7 = indexCount2;
                        hVar.f1409q = h(typedArrayObtainStyledAttributes, index2, hVar.f1409q);
                        break;
                    case 93:
                        i7 = indexCount2;
                        hVar.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, hVar.K);
                        break;
                    case 94:
                        i7 = indexCount2;
                        hVar.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, hVar.R);
                        break;
                    case 95:
                        i7 = indexCount2;
                        i(hVar, typedArrayObtainStyledAttributes, index2, 0);
                        continue;
                        i15++;
                        break;
                    case 96:
                        i7 = indexCount2;
                        i(hVar, typedArrayObtainStyledAttributes, index2, 1);
                        break;
                    case 97:
                        i7 = indexCount2;
                        hVar.f1406n0 = typedArrayObtainStyledAttributes.getInt(index2, hVar.f1406n0);
                        break;
                }
                i15++;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return gVar;
    }

    public static int h(TypedArray typedArray, int i7, int i10) {
        int resourceId = typedArray.getResourceId(i7, i10);
        return resourceId == -1 ? typedArray.getInt(i7, -1) : resourceId;
    }

    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0036  */
    /* JADX WARN: Code duplicated, block: B:22:0x003a  */
    /* JADX WARN: Code duplicated, block: B:24:0x003f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0044  */
    /* JADX WARN: Code duplicated, block: B:28:0x0048  */
    /* JADX WARN: Code duplicated, block: B:30:0x004c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0051  */
    /* JADX WARN: Code duplicated, block: B:34:0x0056  */
    /* JADX WARN: Code duplicated, block: B:36:0x005a  */
    /* JADX WARN: Code duplicated, block: B:38:0x005e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0067  */
    public static void i(Object obj, TypedArray typedArray, int i7, int i10) {
        int dimensionPixelSize;
        f fVar;
        h hVar;
        ConstraintLayout.LayoutParams layoutParams;
        if (obj == null) {
            return;
        }
        int i11 = typedArray.peekValue(i7).type;
        boolean z5 = true;
        int i12 = 0;
        if (i11 != 3) {
            if (i11 != 5) {
                dimensionPixelSize = typedArray.getInt(i7, 0);
                if (dimensionPixelSize == -4) {
                    i12 = -2;
                } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                    z5 = false;
                }
                if (obj instanceof ConstraintLayout.LayoutParams) {
                    layoutParams = (ConstraintLayout.LayoutParams) obj;
                    if (i10 == 0) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).width = i12;
                        layoutParams.V = z5;
                        return;
                    } else {
                        ((ViewGroup.MarginLayoutParams) layoutParams).height = i12;
                        layoutParams.W = z5;
                        return;
                    }
                }
                if (obj instanceof h) {
                    hVar = (h) obj;
                    if (i10 == 0) {
                        hVar.f1384b = i12;
                        hVar.f1400k0 = z5;
                        return;
                    } else {
                        hVar.f1386c = i12;
                        hVar.f1402l0 = z5;
                        return;
                    }
                }
                if (obj instanceof f) {
                    fVar = (f) obj;
                    if (i10 == 0) {
                        fVar.b(23, i12);
                        fVar.d(80, z5);
                        return;
                    } else {
                        fVar.b(21, i12);
                        fVar.d(81, z5);
                        return;
                    }
                }
                return;
            }
            dimensionPixelSize = typedArray.getDimensionPixelSize(i7, 0);
            z5 = false;
            i12 = dimensionPixelSize;
            if (obj instanceof ConstraintLayout.LayoutParams) {
                layoutParams = (ConstraintLayout.LayoutParams) obj;
                if (i10 == 0) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).width = i12;
                    layoutParams.V = z5;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) layoutParams).height = i12;
                    layoutParams.W = z5;
                    return;
                }
            }
            if (obj instanceof h) {
                hVar = (h) obj;
                if (i10 == 0) {
                    hVar.f1384b = i12;
                    hVar.f1400k0 = z5;
                    return;
                } else {
                    hVar.f1386c = i12;
                    hVar.f1402l0 = z5;
                    return;
                }
            }
            if (obj instanceof f) {
                fVar = (f) obj;
                if (i10 == 0) {
                    fVar.b(23, i12);
                    fVar.d(80, z5);
                    return;
                } else {
                    fVar.b(21, i12);
                    fVar.d(81, z5);
                    return;
                }
            }
            return;
        }
        String string = typedArray.getString(i7);
        if (string == null) {
            return;
        }
        int iIndexOf = string.indexOf(61);
        int length = string.length();
        if (iIndexOf <= 0 || iIndexOf >= length - 1) {
            return;
        }
        String strSubstring = string.substring(0, iIndexOf);
        String strSubstring2 = string.substring(iIndexOf + 1);
        if (strSubstring2.length() > 0) {
            String strTrim = strSubstring.trim();
            String strTrim2 = strSubstring2.trim();
            if ("ratio".equalsIgnoreCase(strTrim)) {
                if (obj instanceof ConstraintLayout.LayoutParams) {
                    ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) obj;
                    if (i10 == 0) {
                        ((ViewGroup.MarginLayoutParams) layoutParams2).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) layoutParams2).height = 0;
                    }
                    j(layoutParams2, strTrim2);
                    return;
                }
                if (obj instanceof h) {
                    ((h) obj).f1416x = strTrim2;
                    return;
                } else {
                    if (obj instanceof f) {
                        ((f) obj).c(5, strTrim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(strTrim)) {
                    float f2 = Float.parseFloat(strTrim2);
                    if (obj instanceof ConstraintLayout.LayoutParams) {
                        ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) obj;
                        if (i10 == 0) {
                            ((ViewGroup.MarginLayoutParams) layoutParams3).width = 0;
                            layoutParams3.G = f2;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) layoutParams3).height = 0;
                            layoutParams3.H = f2;
                            return;
                        }
                    }
                    if (obj instanceof h) {
                        h hVar2 = (h) obj;
                        if (i10 == 0) {
                            hVar2.f1384b = 0;
                            hVar2.T = f2;
                            return;
                        } else {
                            hVar2.f1386c = 0;
                            hVar2.S = f2;
                            return;
                        }
                    }
                    if (obj instanceof f) {
                        f fVar2 = (f) obj;
                        if (i10 == 0) {
                            fVar2.b(23, 0);
                            fVar2.a(f2, 39);
                            return;
                        } else {
                            fVar2.b(21, 0);
                            fVar2.a(f2, 40);
                            return;
                        }
                    }
                    return;
                }
                if ("parent".equalsIgnoreCase(strTrim)) {
                    float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                    if (obj instanceof ConstraintLayout.LayoutParams) {
                        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) obj;
                        if (i10 == 0) {
                            ((ViewGroup.MarginLayoutParams) layoutParams4).width = 0;
                            layoutParams4.Q = fMax;
                            layoutParams4.K = 2;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) layoutParams4).height = 0;
                            layoutParams4.R = fMax;
                            layoutParams4.L = 2;
                            return;
                        }
                    }
                    if (obj instanceof h) {
                        h hVar3 = (h) obj;
                        if (i10 == 0) {
                            hVar3.f1384b = 0;
                            hVar3.f1387c0 = fMax;
                            hVar3.W = 2;
                            return;
                        } else {
                            hVar3.f1386c = 0;
                            hVar3.f1389d0 = fMax;
                            hVar3.X = 2;
                            return;
                        }
                    }
                    if (obj instanceof f) {
                        f fVar3 = (f) obj;
                        if (i10 == 0) {
                            fVar3.b(23, 0);
                            fVar3.b(54, 2);
                        } else {
                            fVar3.b(21, 0);
                            fVar3.b(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    public static void j(ConstraintLayout.LayoutParams layoutParams, String str) {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i7 = 0;
            int i10 = -1;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (!strSubstring.equalsIgnoreCase("W")) {
                    i7 = strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                }
                i10 = i7;
                i7 = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i7);
                    if (strSubstring2.length() > 0) {
                        Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i7, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f2 = Float.parseFloat(strSubstring3);
                        float f7 = Float.parseFloat(strSubstring4);
                        if (f2 > 0.0f && f7 > 0.0f) {
                            if (i10 == 1) {
                                Math.abs(f7 / f2);
                            } else {
                                Math.abs(f2 / f7);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        layoutParams.F = str;
    }

    public static String k(int i7) {
        switch (i7) {
            case 1:
                return ViewProps.LEFT;
            case 2:
                return ViewProps.RIGHT;
            case 3:
                return ViewProps.TOP;
            case 4:
                return ViewProps.BOTTOM;
            case 5:
                return "baseline";
            case 6:
                return ViewProps.START;
            case 7:
                return ViewProps.END;
            default:
                return "undefined";
        }
    }

    public final void a(ConstraintLayout constraintLayout) {
        b(constraintLayout);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void b(ConstraintLayout constraintLayout) {
        HashSet hashSet;
        int i7;
        HashMap map;
        String resourceEntryName;
        ConstraintSet constraintSet = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map2 = constraintSet.f1340c;
        HashSet<Integer> hashSet2 = new HashSet(map2.keySet());
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = constraintLayout.getChildAt(i10);
            int id2 = childAt.getId();
            if (!map2.containsKey(Integer.valueOf(id2))) {
                StringBuilder sb2 = new StringBuilder("id unknown ");
                try {
                    resourceEntryName = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    resourceEntryName = "UNKNOWN";
                }
                sb2.append(resourceEntryName);
                Log.w("ConstraintSet", sb2.toString());
            } else {
                if (constraintSet.f1339b && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id2 != -1) {
                    if (map2.containsKey(Integer.valueOf(id2))) {
                        hashSet2.remove(Integer.valueOf(id2));
                        g gVar = (g) map2.get(Integer.valueOf(id2));
                        if (gVar != null) {
                            j jVar = gVar.f1377b;
                            h hVar = gVar.f1379d;
                            k kVar = gVar.f1380e;
                            if (childAt instanceof Barrier) {
                                hVar.f1395g0 = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id2);
                                barrier.setType(hVar.f1391e0);
                                barrier.setMargin(hVar.f1393f0);
                                barrier.setAllowsGoneWidget(hVar.f1404m0);
                                int[] iArr = hVar.h0;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = hVar.f1398i0;
                                    if (str != null) {
                                        int[] iArrE = e(barrier, str);
                                        hVar.h0 = iArrE;
                                        barrier.setReferencedIds(iArrE);
                                    }
                                }
                            }
                            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                            layoutParams.a();
                            gVar.a(layoutParams);
                            HashMap map3 = gVar.f1381f;
                            Class<?> cls = childAt.getClass();
                            for (String str2 : map3.keySet()) {
                                a aVar = (a) map3.get(str2);
                                HashSet hashSet3 = hashSet2;
                                String strL = !aVar.f1341a ? a3.e.l("set", str2) : str2;
                                int i11 = i10;
                                try {
                                    int iB = f0.e.b(aVar.f1342b);
                                    Class cls2 = Float.TYPE;
                                    Class cls3 = Integer.TYPE;
                                    switch (iB) {
                                        case 0:
                                            map = map3;
                                            cls.getMethod(strL, cls3).invoke(childAt, Integer.valueOf(aVar.f1343c));
                                            break;
                                        case 1:
                                            map = map3;
                                            cls.getMethod(strL, cls2).invoke(childAt, Float.valueOf(aVar.f1344d));
                                            break;
                                        case 2:
                                            map = map3;
                                            cls.getMethod(strL, cls3).invoke(childAt, Integer.valueOf(aVar.f1347g));
                                            break;
                                        case 3:
                                            Method method = cls.getMethod(strL, Drawable.class);
                                            map = map3;
                                            try {
                                                ColorDrawable colorDrawable = new ColorDrawable();
                                                colorDrawable.setColor(aVar.f1347g);
                                                method.invoke(childAt, colorDrawable);
                                            } catch (IllegalAccessException e10) {
                                                e = e10;
                                                StringBuilder sbN = com.discord.chat.presentation.list.a.n(" Custom Attribute \"", str2, "\" not found on ");
                                                sbN.append(cls.getName());
                                                Log.e("TransitionLayout", sbN.toString());
                                                e.printStackTrace();
                                            } catch (NoSuchMethodException e11) {
                                                e = e11;
                                                Log.e("TransitionLayout", e.getMessage());
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + strL);
                                            } catch (InvocationTargetException e12) {
                                                e = e12;
                                                StringBuilder sbN2 = com.discord.chat.presentation.list.a.n(" Custom Attribute \"", str2, "\" not found on ");
                                                sbN2.append(cls.getName());
                                                Log.e("TransitionLayout", sbN2.toString());
                                                e.printStackTrace();
                                            }
                                            break;
                                        case 4:
                                            cls.getMethod(strL, CharSequence.class).invoke(childAt, aVar.f1345e);
                                            map = map3;
                                            break;
                                        case 5:
                                            cls.getMethod(strL, Boolean.TYPE).invoke(childAt, Boolean.valueOf(aVar.f1346f));
                                            map = map3;
                                            break;
                                        case 6:
                                            cls.getMethod(strL, cls2).invoke(childAt, Float.valueOf(aVar.f1344d));
                                            map = map3;
                                            break;
                                        case 7:
                                            cls.getMethod(strL, cls3).invoke(childAt, Integer.valueOf(aVar.f1343c));
                                            map = map3;
                                            break;
                                        default:
                                            map = map3;
                                            break;
                                    }
                                } catch (IllegalAccessException e13) {
                                    e = e13;
                                    map = map3;
                                } catch (NoSuchMethodException e14) {
                                    e = e14;
                                    map = map3;
                                } catch (InvocationTargetException e15) {
                                    e = e15;
                                    map = map3;
                                }
                                hashSet2 = hashSet3;
                                i10 = i11;
                                map3 = map;
                            }
                            hashSet = hashSet2;
                            i7 = i10;
                            childAt.setLayoutParams(layoutParams);
                            if (jVar.f1429b == 0) {
                                childAt.setVisibility(jVar.f1428a);
                            }
                            childAt.setAlpha(jVar.f1430c);
                            childAt.setRotation(kVar.f1433a);
                            childAt.setRotationX(kVar.f1434b);
                            childAt.setRotationY(kVar.f1435c);
                            childAt.setScaleX(kVar.f1436d);
                            childAt.setScaleY(kVar.f1437e);
                            if (kVar.f1440h != -1) {
                                View viewFindViewById = ((View) childAt.getParent()).findViewById(kVar.f1440h);
                                if (viewFindViewById != null) {
                                    float bottom = (viewFindViewById.getBottom() + viewFindViewById.getTop()) / 2.0f;
                                    float right = (viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        float left = right - childAt.getLeft();
                                        float top = bottom - childAt.getTop();
                                        childAt.setPivotX(left);
                                        childAt.setPivotY(top);
                                    }
                                }
                            } else {
                                if (!Float.isNaN(kVar.f1438f)) {
                                    childAt.setPivotX(kVar.f1438f);
                                }
                                if (!Float.isNaN(kVar.f1439g)) {
                                    childAt.setPivotY(kVar.f1439g);
                                }
                            }
                            childAt.setTranslationX(kVar.f1441i);
                            childAt.setTranslationY(kVar.j);
                            childAt.setTranslationZ(kVar.k);
                            if (kVar.f1442l) {
                                childAt.setElevation(kVar.f1443m);
                            }
                        }
                    } else {
                        hashSet = hashSet2;
                        i7 = i10;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id2);
                    }
                }
                i10 = i7 + 1;
                constraintSet = this;
                hashSet2 = hashSet;
            }
            hashSet = hashSet2;
            i7 = i10;
            i10 = i7 + 1;
            constraintSet = this;
            hashSet2 = hashSet;
        }
        for (Integer num : hashSet2) {
            g gVar2 = (g) map2.get(num);
            if (gVar2 != null) {
                h hVar2 = gVar2.f1379d;
                if (hVar2.f1395g0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = hVar2.h0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str3 = hVar2.f1398i0;
                        if (str3 != null) {
                            int[] iArrE2 = e(barrier2, str3);
                            hVar2.h0 = iArrE2;
                            barrier2.setReferencedIds(iArrE2);
                        }
                    }
                    barrier2.setType(hVar2.f1391e0);
                    barrier2.setMargin(hVar2.f1393f0);
                    ConstraintLayout.LayoutParams layoutParamsGenerateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.k();
                    gVar2.a(layoutParamsGenerateDefaultLayoutParams);
                    constraintLayout.addView(barrier2, layoutParamsGenerateDefaultLayoutParams);
                }
                if (hVar2.f1383a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.LayoutParams layoutParamsGenerateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    gVar2.a(layoutParamsGenerateDefaultLayoutParams2);
                    constraintLayout.addView(guideline, layoutParamsGenerateDefaultLayoutParams2);
                }
            }
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = constraintLayout.getChildAt(i12);
            if (childAt2 instanceof b) {
                ((b) childAt2).f(constraintLayout);
            }
        }
    }

    public final void c(ConstraintLayout constraintLayout) {
        int i7;
        HashMap map;
        HashMap map2;
        ConstraintSet constraintSet = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map3 = constraintSet.f1340c;
        map3.clear();
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = constraintLayout.getChildAt(i10);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (constraintSet.f1339b && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map3.containsKey(Integer.valueOf(id2))) {
                map3.put(Integer.valueOf(id2), new g());
            }
            g gVar = (g) map3.get(Integer.valueOf(id2));
            if (gVar == null) {
                i7 = childCount;
                map = map3;
            } else {
                j jVar = gVar.f1377b;
                h hVar = gVar.f1379d;
                k kVar = gVar.f1380e;
                HashMap map4 = new HashMap();
                Class<?> cls = childAt.getClass();
                HashMap map5 = constraintSet.f1338a;
                for (String str : map5.keySet()) {
                    a aVar = (a) map5.get(str);
                    int i11 = childCount;
                    try {
                        if (str.equals("BackgroundColor")) {
                            map2 = map3;
                            try {
                                map4.put(str, new a(aVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                            } catch (IllegalAccessException e10) {
                                e = e10;
                                e.printStackTrace();
                            } catch (NoSuchMethodException e11) {
                                e = e11;
                                e.printStackTrace();
                            } catch (InvocationTargetException e12) {
                                e = e12;
                                e.printStackTrace();
                            }
                        } else {
                            map2 = map3;
                            map4.put(str, new a(aVar, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e13) {
                        e = e13;
                        map2 = map3;
                    } catch (NoSuchMethodException e14) {
                        e = e14;
                        map2 = map3;
                    } catch (InvocationTargetException e15) {
                        e = e15;
                        map2 = map3;
                    }
                    childCount = i11;
                    map3 = map2;
                }
                i7 = childCount;
                map = map3;
                gVar.f1381f = map4;
                gVar.f1376a = id2;
                hVar.f1394g = layoutParams.f1290d;
                hVar.f1396h = layoutParams.f1292e;
                hVar.f1397i = layoutParams.f1294f;
                hVar.j = layoutParams.f1296g;
                hVar.k = layoutParams.f1298h;
                hVar.f1401l = layoutParams.f1299i;
                hVar.f1403m = layoutParams.j;
                hVar.f1405n = layoutParams.k;
                hVar.f1407o = layoutParams.f1303l;
                hVar.f1408p = layoutParams.f1305m;
                hVar.f1409q = layoutParams.f1307n;
                hVar.f1410r = layoutParams.f1313r;
                hVar.f1411s = layoutParams.f1314s;
                hVar.f1412t = layoutParams.f1315t;
                hVar.f1413u = layoutParams.f1316u;
                hVar.f1414v = layoutParams.D;
                hVar.f1415w = layoutParams.E;
                hVar.f1416x = layoutParams.F;
                hVar.f1417y = layoutParams.f1309o;
                hVar.f1418z = layoutParams.f1311p;
                hVar.A = layoutParams.f1312q;
                hVar.B = layoutParams.S;
                hVar.C = layoutParams.T;
                hVar.D = layoutParams.U;
                hVar.f1392f = layoutParams.f1288c;
                hVar.f1388d = layoutParams.f1285a;
                hVar.f1390e = layoutParams.f1286b;
                hVar.f1384b = ((ViewGroup.MarginLayoutParams) layoutParams).width;
                hVar.f1386c = ((ViewGroup.MarginLayoutParams) layoutParams).height;
                hVar.E = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                hVar.F = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                hVar.G = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                hVar.H = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                hVar.K = layoutParams.C;
                hVar.S = layoutParams.H;
                hVar.T = layoutParams.G;
                hVar.V = layoutParams.J;
                hVar.U = layoutParams.I;
                hVar.f1400k0 = layoutParams.V;
                hVar.f1402l0 = layoutParams.W;
                hVar.W = layoutParams.K;
                hVar.X = layoutParams.L;
                hVar.Y = layoutParams.O;
                hVar.Z = layoutParams.P;
                hVar.a0 = layoutParams.M;
                hVar.f1385b0 = layoutParams.N;
                hVar.f1387c0 = layoutParams.Q;
                hVar.f1389d0 = layoutParams.R;
                hVar.f1399j0 = layoutParams.X;
                hVar.M = layoutParams.f1318w;
                hVar.O = layoutParams.f1320y;
                hVar.L = layoutParams.f1317v;
                hVar.N = layoutParams.f1319x;
                hVar.Q = layoutParams.f1321z;
                hVar.P = layoutParams.A;
                hVar.R = layoutParams.B;
                hVar.f1406n0 = layoutParams.Y;
                hVar.I = layoutParams.getMarginEnd();
                hVar.J = layoutParams.getMarginStart();
                jVar.f1428a = childAt.getVisibility();
                jVar.f1430c = childAt.getAlpha();
                kVar.f1433a = childAt.getRotation();
                kVar.f1434b = childAt.getRotationX();
                kVar.f1435c = childAt.getRotationY();
                kVar.f1436d = childAt.getScaleX();
                kVar.f1437e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    kVar.f1438f = pivotX;
                    kVar.f1439g = pivotY;
                }
                kVar.f1441i = childAt.getTranslationX();
                kVar.j = childAt.getTranslationY();
                kVar.k = childAt.getTranslationZ();
                if (kVar.f1442l) {
                    kVar.f1443m = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    hVar.f1404m0 = barrier.getAllowsGoneWidget();
                    hVar.h0 = barrier.getReferencedIds();
                    hVar.f1391e0 = barrier.getType();
                    hVar.f1393f0 = barrier.getMargin();
                }
            }
            i10++;
            constraintSet = this;
            childCount = i7;
            map3 = map;
        }
    }

    public final void d(int i7, int i10, int i11) {
        Integer numValueOf = Integer.valueOf(i7);
        HashMap map = this.f1340c;
        if (!map.containsKey(numValueOf)) {
            map.put(Integer.valueOf(i7), new g());
        }
        g gVar = (g) map.get(Integer.valueOf(i7));
        if (gVar == null) {
            return;
        }
        h hVar = gVar.f1379d;
        switch (i10) {
            case 1:
                if (i11 == 1) {
                    hVar.f1394g = 0;
                    hVar.f1396h = -1;
                } else {
                    if (i11 != 2) {
                        throw new IllegalArgumentException("Left to " + k(i11) + " undefined");
                    }
                    hVar.f1396h = 0;
                    hVar.f1394g = -1;
                }
                hVar.E = 0;
                return;
            case 2:
                if (i11 == 1) {
                    hVar.f1397i = 0;
                    hVar.j = -1;
                } else {
                    if (i11 != 2) {
                        throw new IllegalArgumentException("right to " + k(i11) + " undefined");
                    }
                    hVar.j = 0;
                    hVar.f1397i = -1;
                }
                hVar.F = 0;
                return;
            case 3:
                if (i11 == 3) {
                    hVar.k = 0;
                    hVar.f1401l = -1;
                    hVar.f1407o = -1;
                    hVar.f1408p = -1;
                    hVar.f1409q = -1;
                } else {
                    if (i11 != 4) {
                        throw new IllegalArgumentException("right to " + k(i11) + " undefined");
                    }
                    hVar.f1401l = 0;
                    hVar.k = -1;
                    hVar.f1407o = -1;
                    hVar.f1408p = -1;
                    hVar.f1409q = -1;
                }
                hVar.G = 0;
                return;
            case 4:
                if (i11 == 4) {
                    hVar.f1405n = 0;
                    hVar.f1403m = -1;
                    hVar.f1407o = -1;
                    hVar.f1408p = -1;
                    hVar.f1409q = -1;
                } else {
                    if (i11 != 3) {
                        throw new IllegalArgumentException("right to " + k(i11) + " undefined");
                    }
                    hVar.f1403m = 0;
                    hVar.f1405n = -1;
                    hVar.f1407o = -1;
                    hVar.f1408p = -1;
                    hVar.f1409q = -1;
                }
                hVar.H = 0;
                return;
            case 5:
                if (i11 == 5) {
                    hVar.f1407o = 0;
                    hVar.f1405n = -1;
                    hVar.f1403m = -1;
                    hVar.k = -1;
                    hVar.f1401l = -1;
                    return;
                }
                if (i11 == 3) {
                    hVar.f1408p = 0;
                    hVar.f1405n = -1;
                    hVar.f1403m = -1;
                    hVar.k = -1;
                    hVar.f1401l = -1;
                    return;
                }
                if (i11 != 4) {
                    throw new IllegalArgumentException("right to " + k(i11) + " undefined");
                }
                hVar.f1409q = 0;
                hVar.f1405n = -1;
                hVar.f1403m = -1;
                hVar.k = -1;
                hVar.f1401l = -1;
                return;
            case 6:
                if (i11 == 6) {
                    hVar.f1411s = 0;
                    hVar.f1410r = -1;
                } else {
                    if (i11 != 7) {
                        throw new IllegalArgumentException("right to " + k(i11) + " undefined");
                    }
                    hVar.f1410r = 0;
                    hVar.f1411s = -1;
                }
                hVar.J = 0;
                return;
            case 7:
                if (i11 == 7) {
                    hVar.f1413u = 0;
                    hVar.f1412t = -1;
                } else {
                    if (i11 != 6) {
                        throw new IllegalArgumentException("right to " + k(i11) + " undefined");
                    }
                    hVar.f1412t = 0;
                    hVar.f1413u = -1;
                }
                hVar.I = 0;
                return;
            default:
                throw new IllegalArgumentException(k(i10) + " to " + k(i11) + " unknown");
        }
    }

    public final void g(Context context, int i7) {
        XmlResourceParser xml = context.getResources().getXml(i7);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    g gVarF = f(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        gVarF.f1379d.f1383a = true;
                    }
                    this.f1340c.put(Integer.valueOf(gVarF.f1376a), gVarF);
                }
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }
}
