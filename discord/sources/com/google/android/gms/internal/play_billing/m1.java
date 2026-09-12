package com.google.android.gms.internal.play_billing;

import com.discord.misc.utilities.chat_view_types.ChatViewRecyclerTypes;

/* JADX INFO: loaded from: classes3.dex */
public final class m1 implements f2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m1 f6053b = new m1(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m1 f6054c = new m1(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m1 f6055d = new m1(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m1 f6056e = new m1(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m1 f6057f = new m1(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final m1 f6058g = new m1(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final m1 f6059h = new m1(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final m1 f6060i = new m1(7);
    public static final m1 j = new m1(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6061a;

    public /* synthetic */ m1(int i7) {
        this.f6061a = i7;
    }

    @Override // com.google.android.gms.internal.play_billing.f2
    public final boolean a(int i7) {
        z3 z3Var;
        switch (this.f6061a) {
            case 0:
                switch (i7) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        return true;
                    default:
                        return false;
                }
            case 1:
                switch (i7) {
                    default:
                        switch (i7) {
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
                                break;
                            default:
                                return false;
                        }
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        return true;
                }
                break;
            case 2:
                return com.discord.chat.presentation.list.a.a(i7) != 0;
            case 3:
                if (i7 == 0) {
                    z3Var = z3.BROADCAST_ACTION_UNSPECIFIED;
                } else if (i7 == 1) {
                    z3Var = z3.PURCHASES_UPDATED_ACTION;
                } else if (i7 == 2) {
                    z3Var = z3.LOCAL_PURCHASES_UPDATED_ACTION;
                } else if (i7 == 3) {
                    z3Var = z3.ALTERNATIVE_BILLING_ACTION;
                } else if (i7 != 4) {
                    z3Var = i7 != 5 ? null : z3.PLAY_BILLING_ACTIVITY_CREATED_ACTION;
                } else {
                    z3Var = z3.IN_APP_BILLING_RESULT_UPDATE_ACTION;
                }
                return z3Var != null;
            case 4:
                return i7 == 0 || i7 == 1 || i7 == 2 || i7 == 3;
            case 5:
                switch (i7) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                        return true;
                    case 14:
                    case 15:
                    case 16:
                    default:
                        return false;
                }
            case 6:
                switch (i7) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        return true;
                    default:
                        return false;
                }
            case 7:
                return i7 == 0 || i7 == 1;
            default:
                return i7 == 0 || i7 == 1;
        }
    }
}
