package androidx.media;

import java.util.Arrays;
import kk.b;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2420a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2421b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2422c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2423d = -1;

    public final boolean equals(Object obj) {
        int i7;
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f2421b == audioAttributesImplBase.f2421b) {
            int i10 = this.f2422c;
            int i11 = audioAttributesImplBase.f2422c;
            int i12 = audioAttributesImplBase.f2423d;
            if (i12 == -1) {
                int i13 = audioAttributesImplBase.f2420a;
                int i14 = AudioAttributesCompat.f2416b;
                if ((i11 & 1) != 1) {
                    i7 = 4;
                    if ((i11 & 4) != 4) {
                        switch (i13) {
                            case 2:
                                i7 = 0;
                                break;
                            case 3:
                                i7 = 8;
                                break;
                            case 4:
                                break;
                            case 5:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                i7 = 5;
                                break;
                            case 6:
                                i7 = 2;
                                break;
                            case 11:
                                i7 = 10;
                                break;
                            case 12:
                            default:
                                i7 = 3;
                                break;
                            case 13:
                                i7 = 1;
                                break;
                        }
                    } else {
                        i7 = 6;
                    }
                } else {
                    i7 = 7;
                }
            } else {
                i7 = i12;
            }
            if (i7 == 6) {
                i11 |= 4;
            } else if (i7 == 7) {
                i11 |= 1;
            }
            if (i10 == (i11 & 273) && this.f2420a == audioAttributesImplBase.f2420a && this.f2423d == i12) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2421b), Integer.valueOf(this.f2422c), Integer.valueOf(this.f2420a), Integer.valueOf(this.f2423d)});
    }

    public final String toString() {
        String strH;
        StringBuilder sb2 = new StringBuilder("AudioAttributesCompat:");
        if (this.f2423d != -1) {
            sb2.append(" stream=");
            sb2.append(this.f2423d);
            sb2.append(" derived");
        }
        sb2.append(" usage=");
        int i7 = this.f2420a;
        int i10 = AudioAttributesCompat.f2416b;
        switch (i7) {
            case 0:
                strH = "USAGE_UNKNOWN";
                break;
            case 1:
                strH = "USAGE_MEDIA";
                break;
            case 2:
                strH = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                strH = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                strH = "USAGE_ALARM";
                break;
            case 5:
                strH = "USAGE_NOTIFICATION";
                break;
            case 6:
                strH = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                strH = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                strH = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                strH = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                strH = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                strH = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                strH = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                strH = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                strH = "USAGE_GAME";
                break;
            case 15:
            default:
                strH = b.h(i7, "unknown usage ");
                break;
            case 16:
                strH = "USAGE_ASSISTANT";
                break;
        }
        sb2.append(strH);
        sb2.append(" content=");
        sb2.append(this.f2421b);
        sb2.append(" flags=0x");
        sb2.append(Integer.toHexString(this.f2422c).toUpperCase());
        return sb2.toString();
    }
}
