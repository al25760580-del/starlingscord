package xc;

import com.facebook.react.uimanager.events.PointerEventHelper;
import com.reactnativecommunity.clipboard.ClipboardModule;
import ei.e0;
import java.nio.ByteBuffer;
import java.util.UUID;
import je.w;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f22796a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f22797b = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static byte[] a(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(uuidArr != null ? PointerEventHelper.X_FLAG_SUPPORTS_HOVER : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    public static hd.e b(int i7, w wVar) {
        int iG = wVar.g();
        if (wVar.g() == 1684108385) {
            wVar.G(8);
            String strQ = wVar.q(iG - 16);
            return new hd.e("und", strQ, strQ);
        }
        je.b.N("MetadataUtil", "Failed to parse comment attribute: " + lc.a.b(i7));
        return null;
    }

    public static hd.a c(w wVar) {
        String str;
        int iG = wVar.g();
        if (wVar.g() != 1684108385) {
            je.b.N("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int iG2 = wVar.g() & 16777215;
        if (iG2 == 13) {
            str = ClipboardModule.MIMETYPE_JPEG;
        } else {
            str = iG2 == 14 ? ClipboardModule.MIMETYPE_PNG : null;
        }
        if (str == null) {
            com.discord.chat.presentation.list.a.q(iG2, "Unrecognized cover art flags: ", "MetadataUtil");
            return null;
        }
        wVar.G(4);
        int i7 = iG - 16;
        byte[] bArr = new byte[i7];
        wVar.e(bArr, 0, i7);
        return new hd.a(str, null, 3, bArr);
    }

    public static hd.n d(int i7, String str, w wVar) {
        int iG = wVar.g();
        if (wVar.g() == 1684108385 && iG >= 22) {
            wVar.G(10);
            int iZ = wVar.z();
            if (iZ > 0) {
                String strH = kk.b.h(iZ, "");
                int iZ2 = wVar.z();
                if (iZ2 > 0) {
                    strH = strH + "/" + iZ2;
                }
                return new hd.n(str, null, e0.r(strH));
            }
        }
        je.b.N("MetadataUtil", "Failed to parse index/count attribute: " + lc.a.b(i7));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [byte[], java.io.Serializable] */
    public static a1.d e(byte[] bArr) {
        w wVar = new w(bArr);
        if (wVar.f13862c >= 32) {
            wVar.F(0);
            if (wVar.g() == wVar.a() + 4 && wVar.g() == 1886614376) {
                int iD = lc.a.d(wVar.g());
                if (iD > 1) {
                    com.discord.chat.presentation.list.a.q(iD, "Unsupported pssh version: ", "PsshAtomUtil");
                    return null;
                }
                UUID uuid = new UUID(wVar.o(), wVar.o());
                if (iD == 1) {
                    wVar.G(wVar.x() * 16);
                }
                int iX = wVar.x();
                if (iX == wVar.a()) {
                    ?? r5 = new byte[iX];
                    wVar.e(r5, 0, iX);
                    return new a1.d(uuid, iD, r5, 13);
                }
            }
        }
        return null;
    }

    public static byte[] f(byte[] bArr, UUID uuid) {
        a1.d dVarE = e(bArr);
        if (dVarE == null) {
            return null;
        }
        UUID uuid2 = (UUID) dVarE.f18i;
        if (uuid.equals(uuid2)) {
            return (byte[]) dVarE.f19v;
        }
        je.b.N("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + uuid2 + ".");
        return null;
    }

    public static hd.n g(int i7, String str, w wVar) {
        int iG = wVar.g();
        if (wVar.g() == 1684108385) {
            wVar.G(8);
            return new hd.n(str, null, e0.r(wVar.q(iG - 16)));
        }
        je.b.N("MetadataUtil", "Failed to parse text attribute: " + lc.a.b(i7));
        return null;
    }

    public static hd.j h(int i7, String str, w wVar, boolean z5, boolean z6) {
        int i10 = i(wVar);
        if (z6) {
            i10 = Math.min(1, i10);
        }
        if (i10 >= 0) {
            return z5 ? new hd.n(str, null, e0.r(Integer.toString(i10))) : new hd.e("und", str, Integer.toString(i10));
        }
        je.b.N("MetadataUtil", "Failed to parse uint8 attribute: " + lc.a.b(i7));
        return null;
    }

    public static int i(w wVar) {
        wVar.G(4);
        if (wVar.g() == 1684108385) {
            wVar.G(8);
            return wVar.u();
        }
        je.b.N("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    public static boolean j(pc.l lVar, boolean z5, boolean z6) {
        boolean z7;
        int i7;
        long length = lVar.getLength();
        long j = -1;
        int i10 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j5 = 4096;
        if (i10 != 0 && length <= 4096) {
            j5 = length;
        }
        int i11 = (int) j5;
        w wVar = new w(64);
        int i12 = 0;
        int i13 = 0;
        boolean z10 = false;
        while (true) {
            if (i13 < i11) {
                wVar.C(8);
                if (lVar.g(wVar.f13860a, i12, 8, true)) {
                    long jV = wVar.v();
                    int iG = wVar.g();
                    if (jV == 1) {
                        lVar.C(wVar.f13860a, 8, 8);
                        wVar.E(16);
                        i7 = 16;
                        jV = wVar.o();
                    } else {
                        if (jV == 0) {
                            long length2 = lVar.getLength();
                            if (length2 != j) {
                                jV = (length2 - lVar.m()) + ((long) 8);
                            }
                        }
                        i7 = 8;
                    }
                    long j7 = i7;
                    if (jV < j7) {
                        return false;
                    }
                    int i14 = i13 + i7;
                    if (iG == 1836019574) {
                        i11 += (int) jV;
                        if (i10 != 0 && i11 > length) {
                            i11 = (int) length;
                        }
                        i13 = i14;
                    } else {
                        if (iG == 1836019558 || iG == 1836475768) {
                            z7 = true;
                            return z10 && z5 == z7;
                        }
                        int i15 = i10;
                        if ((((long) i14) + jV) - j7 < i11) {
                            int i16 = (int) (jV - j7);
                            i13 = i14 + i16;
                            if (iG == 1718909296) {
                                if (i16 < 8) {
                                    return false;
                                }
                                wVar.C(i16);
                                lVar.C(wVar.f13860a, 0, i16);
                                int i17 = i16 / 4;
                                for (int i18 = 0; i18 < i17; i18++) {
                                    if (i18 != 1) {
                                        int iG2 = wVar.g();
                                        if ((iG2 >>> 8) != 3368816 && (iG2 != 1751476579 || !z6)) {
                                            int i19 = 0;
                                            while (true) {
                                                if (i19 >= 29) {
                                                    continue;
                                                } else if (f22797b[i19] != iG2) {
                                                    i19++;
                                                }
                                            }
                                        }
                                        z10 = true;
                                        break;
                                    }
                                    wVar.G(4);
                                }
                                if (!z10) {
                                    return false;
                                }
                            } else if (i16 != 0) {
                                lVar.n(i16);
                            }
                            i10 = i15;
                        }
                    }
                    j = -1;
                    i12 = 0;
                }
            }
            z7 = false;
            if (z10) {
                return false;
            }
        }
    }
}
