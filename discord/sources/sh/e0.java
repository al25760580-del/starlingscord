package sh;

import android.os.ParcelFileDescriptor;
import com.google.android.play.core.assetpacks.AssetPackState;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.SequenceInputStream;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a5.o f20023g = new a5.o("ExtractChunkTaskHandler", 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f20024a = new byte[8192];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f20025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p0 f20026c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g1 f20027d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final th.f f20028e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final th.f f20029f;

    public e0(s sVar, th.f fVar, th.f fVar2, p0 p0Var, g1 g1Var) {
        this.f20025b = sVar;
        this.f20028e = fVar;
        this.f20029f = fVar2;
        this.f20026c = p0Var;
        this.f20027d = g1Var;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0267  */
    /* JADX WARN: Code duplicated, block: B:102:0x026a  */
    /* JADX WARN: Code duplicated, block: B:104:0x026d A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:10:0x004d, B:12:0x0053, B:14:0x005f, B:19:0x006a, B:28:0x0094, B:70:0x01cd, B:72:0x01e9, B:73:0x01ec, B:75:0x01f4, B:77:0x01f8, B:82:0x0202, B:87:0x0210, B:89:0x0230, B:90:0x023c, B:85:0x0208, B:91:0x0240, B:92:0x0245, B:94:0x0249, B:96:0x024d, B:98:0x0251, B:99:0x025f, B:104:0x026d, B:106:0x0271, B:107:0x0282, B:109:0x0286, B:110:0x0295, B:112:0x0299, B:114:0x02bb, B:115:0x02be, B:121:0x02ea, B:118:0x02d1, B:119:0x02d8, B:120:0x02d9, B:35:0x00a9, B:36:0x00b2, B:43:0x00bf, B:42:0x00bc, B:44:0x00c0, B:45:0x00da, B:46:0x00db, B:48:0x0119, B:49:0x0125, B:50:0x012e, B:51:0x012f, B:53:0x014b, B:54:0x0159, B:56:0x016c, B:57:0x0171, B:60:0x017b, B:62:0x0185, B:63:0x019b, B:64:0x01a4, B:65:0x01a5, B:66:0x01c7, B:39:0x00b7, B:20:0x0082, B:21:0x0085, B:23:0x008b), top: B:155:0x004d, outer: #4, inners: #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x0271 A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:10:0x004d, B:12:0x0053, B:14:0x005f, B:19:0x006a, B:28:0x0094, B:70:0x01cd, B:72:0x01e9, B:73:0x01ec, B:75:0x01f4, B:77:0x01f8, B:82:0x0202, B:87:0x0210, B:89:0x0230, B:90:0x023c, B:85:0x0208, B:91:0x0240, B:92:0x0245, B:94:0x0249, B:96:0x024d, B:98:0x0251, B:99:0x025f, B:104:0x026d, B:106:0x0271, B:107:0x0282, B:109:0x0286, B:110:0x0295, B:112:0x0299, B:114:0x02bb, B:115:0x02be, B:121:0x02ea, B:118:0x02d1, B:119:0x02d8, B:120:0x02d9, B:35:0x00a9, B:36:0x00b2, B:43:0x00bf, B:42:0x00bc, B:44:0x00c0, B:45:0x00da, B:46:0x00db, B:48:0x0119, B:49:0x0125, B:50:0x012e, B:51:0x012f, B:53:0x014b, B:54:0x0159, B:56:0x016c, B:57:0x0171, B:60:0x017b, B:62:0x0185, B:63:0x019b, B:64:0x01a4, B:65:0x01a5, B:66:0x01c7, B:39:0x00b7, B:20:0x0082, B:21:0x0085, B:23:0x008b), top: B:155:0x004d, outer: #4, inners: #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x0282 A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:10:0x004d, B:12:0x0053, B:14:0x005f, B:19:0x006a, B:28:0x0094, B:70:0x01cd, B:72:0x01e9, B:73:0x01ec, B:75:0x01f4, B:77:0x01f8, B:82:0x0202, B:87:0x0210, B:89:0x0230, B:90:0x023c, B:85:0x0208, B:91:0x0240, B:92:0x0245, B:94:0x0249, B:96:0x024d, B:98:0x0251, B:99:0x025f, B:104:0x026d, B:106:0x0271, B:107:0x0282, B:109:0x0286, B:110:0x0295, B:112:0x0299, B:114:0x02bb, B:115:0x02be, B:121:0x02ea, B:118:0x02d1, B:119:0x02d8, B:120:0x02d9, B:35:0x00a9, B:36:0x00b2, B:43:0x00bf, B:42:0x00bc, B:44:0x00c0, B:45:0x00da, B:46:0x00db, B:48:0x0119, B:49:0x0125, B:50:0x012e, B:51:0x012f, B:53:0x014b, B:54:0x0159, B:56:0x016c, B:57:0x0171, B:60:0x017b, B:62:0x0185, B:63:0x019b, B:64:0x01a4, B:65:0x01a5, B:66:0x01c7, B:39:0x00b7, B:20:0x0082, B:21:0x0085, B:23:0x008b), top: B:155:0x004d, outer: #4, inners: #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x0286 A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:10:0x004d, B:12:0x0053, B:14:0x005f, B:19:0x006a, B:28:0x0094, B:70:0x01cd, B:72:0x01e9, B:73:0x01ec, B:75:0x01f4, B:77:0x01f8, B:82:0x0202, B:87:0x0210, B:89:0x0230, B:90:0x023c, B:85:0x0208, B:91:0x0240, B:92:0x0245, B:94:0x0249, B:96:0x024d, B:98:0x0251, B:99:0x025f, B:104:0x026d, B:106:0x0271, B:107:0x0282, B:109:0x0286, B:110:0x0295, B:112:0x0299, B:114:0x02bb, B:115:0x02be, B:121:0x02ea, B:118:0x02d1, B:119:0x02d8, B:120:0x02d9, B:35:0x00a9, B:36:0x00b2, B:43:0x00bf, B:42:0x00bc, B:44:0x00c0, B:45:0x00da, B:46:0x00db, B:48:0x0119, B:49:0x0125, B:50:0x012e, B:51:0x012f, B:53:0x014b, B:54:0x0159, B:56:0x016c, B:57:0x0171, B:60:0x017b, B:62:0x0185, B:63:0x019b, B:64:0x01a4, B:65:0x01a5, B:66:0x01c7, B:39:0x00b7, B:20:0x0082, B:21:0x0085, B:23:0x008b), top: B:155:0x004d, outer: #4, inners: #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x0295 A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:10:0x004d, B:12:0x0053, B:14:0x005f, B:19:0x006a, B:28:0x0094, B:70:0x01cd, B:72:0x01e9, B:73:0x01ec, B:75:0x01f4, B:77:0x01f8, B:82:0x0202, B:87:0x0210, B:89:0x0230, B:90:0x023c, B:85:0x0208, B:91:0x0240, B:92:0x0245, B:94:0x0249, B:96:0x024d, B:98:0x0251, B:99:0x025f, B:104:0x026d, B:106:0x0271, B:107:0x0282, B:109:0x0286, B:110:0x0295, B:112:0x0299, B:114:0x02bb, B:115:0x02be, B:121:0x02ea, B:118:0x02d1, B:119:0x02d8, B:120:0x02d9, B:35:0x00a9, B:36:0x00b2, B:43:0x00bf, B:42:0x00bc, B:44:0x00c0, B:45:0x00da, B:46:0x00db, B:48:0x0119, B:49:0x0125, B:50:0x012e, B:51:0x012f, B:53:0x014b, B:54:0x0159, B:56:0x016c, B:57:0x0171, B:60:0x017b, B:62:0x0185, B:63:0x019b, B:64:0x01a4, B:65:0x01a5, B:66:0x01c7, B:39:0x00b7, B:20:0x0082, B:21:0x0085, B:23:0x008b), top: B:155:0x004d, outer: #4, inners: #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x0299 A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:10:0x004d, B:12:0x0053, B:14:0x005f, B:19:0x006a, B:28:0x0094, B:70:0x01cd, B:72:0x01e9, B:73:0x01ec, B:75:0x01f4, B:77:0x01f8, B:82:0x0202, B:87:0x0210, B:89:0x0230, B:90:0x023c, B:85:0x0208, B:91:0x0240, B:92:0x0245, B:94:0x0249, B:96:0x024d, B:98:0x0251, B:99:0x025f, B:104:0x026d, B:106:0x0271, B:107:0x0282, B:109:0x0286, B:110:0x0295, B:112:0x0299, B:114:0x02bb, B:115:0x02be, B:121:0x02ea, B:118:0x02d1, B:119:0x02d8, B:120:0x02d9, B:35:0x00a9, B:36:0x00b2, B:43:0x00bf, B:42:0x00bc, B:44:0x00c0, B:45:0x00da, B:46:0x00db, B:48:0x0119, B:49:0x0125, B:50:0x012e, B:51:0x012f, B:53:0x014b, B:54:0x0159, B:56:0x016c, B:57:0x0171, B:60:0x017b, B:62:0x0185, B:63:0x019b, B:64:0x01a4, B:65:0x01a5, B:66:0x01c7, B:39:0x00b7, B:20:0x0082, B:21:0x0085, B:23:0x008b), top: B:155:0x004d, outer: #4, inners: #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x02bb A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:10:0x004d, B:12:0x0053, B:14:0x005f, B:19:0x006a, B:28:0x0094, B:70:0x01cd, B:72:0x01e9, B:73:0x01ec, B:75:0x01f4, B:77:0x01f8, B:82:0x0202, B:87:0x0210, B:89:0x0230, B:90:0x023c, B:85:0x0208, B:91:0x0240, B:92:0x0245, B:94:0x0249, B:96:0x024d, B:98:0x0251, B:99:0x025f, B:104:0x026d, B:106:0x0271, B:107:0x0282, B:109:0x0286, B:110:0x0295, B:112:0x0299, B:114:0x02bb, B:115:0x02be, B:121:0x02ea, B:118:0x02d1, B:119:0x02d8, B:120:0x02d9, B:35:0x00a9, B:36:0x00b2, B:43:0x00bf, B:42:0x00bc, B:44:0x00c0, B:45:0x00da, B:46:0x00db, B:48:0x0119, B:49:0x0125, B:50:0x012e, B:51:0x012f, B:53:0x014b, B:54:0x0159, B:56:0x016c, B:57:0x0171, B:60:0x017b, B:62:0x0185, B:63:0x019b, B:64:0x01a4, B:65:0x01a5, B:66:0x01c7, B:39:0x00b7, B:20:0x0082, B:21:0x0085, B:23:0x008b), top: B:155:0x004d, outer: #4, inners: #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:118:0x02d1 A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:10:0x004d, B:12:0x0053, B:14:0x005f, B:19:0x006a, B:28:0x0094, B:70:0x01cd, B:72:0x01e9, B:73:0x01ec, B:75:0x01f4, B:77:0x01f8, B:82:0x0202, B:87:0x0210, B:89:0x0230, B:90:0x023c, B:85:0x0208, B:91:0x0240, B:92:0x0245, B:94:0x0249, B:96:0x024d, B:98:0x0251, B:99:0x025f, B:104:0x026d, B:106:0x0271, B:107:0x0282, B:109:0x0286, B:110:0x0295, B:112:0x0299, B:114:0x02bb, B:115:0x02be, B:121:0x02ea, B:118:0x02d1, B:119:0x02d8, B:120:0x02d9, B:35:0x00a9, B:36:0x00b2, B:43:0x00bf, B:42:0x00bc, B:44:0x00c0, B:45:0x00da, B:46:0x00db, B:48:0x0119, B:49:0x0125, B:50:0x012e, B:51:0x012f, B:53:0x014b, B:54:0x0159, B:56:0x016c, B:57:0x0171, B:60:0x017b, B:62:0x0185, B:63:0x019b, B:64:0x01a4, B:65:0x01a5, B:66:0x01c7, B:39:0x00b7, B:20:0x0082, B:21:0x0085, B:23:0x008b), top: B:155:0x004d, outer: #4, inners: #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:120:0x02d9 A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:10:0x004d, B:12:0x0053, B:14:0x005f, B:19:0x006a, B:28:0x0094, B:70:0x01cd, B:72:0x01e9, B:73:0x01ec, B:75:0x01f4, B:77:0x01f8, B:82:0x0202, B:87:0x0210, B:89:0x0230, B:90:0x023c, B:85:0x0208, B:91:0x0240, B:92:0x0245, B:94:0x0249, B:96:0x024d, B:98:0x0251, B:99:0x025f, B:104:0x026d, B:106:0x0271, B:107:0x0282, B:109:0x0286, B:110:0x0295, B:112:0x0299, B:114:0x02bb, B:115:0x02be, B:121:0x02ea, B:118:0x02d1, B:119:0x02d8, B:120:0x02d9, B:35:0x00a9, B:36:0x00b2, B:43:0x00bf, B:42:0x00bc, B:44:0x00c0, B:45:0x00da, B:46:0x00db, B:48:0x0119, B:49:0x0125, B:50:0x012e, B:51:0x012f, B:53:0x014b, B:54:0x0159, B:56:0x016c, B:57:0x0171, B:60:0x017b, B:62:0x0185, B:63:0x019b, B:64:0x01a4, B:65:0x01a5, B:66:0x01c7, B:39:0x00b7, B:20:0x0082, B:21:0x0085, B:23:0x008b), top: B:155:0x004d, outer: #4, inners: #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:136:0x0372  */
    /* JADX WARN: Code duplicated, block: B:145:0x03c0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:160:0x0300 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x0384 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x024d A[EDGE_INSN: B:173:0x024d->B:96:0x024d BREAK  A[LOOP:1: B:73:0x01ec->B:176:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x01cd A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:10:0x004d, B:12:0x0053, B:14:0x005f, B:19:0x006a, B:28:0x0094, B:70:0x01cd, B:72:0x01e9, B:73:0x01ec, B:75:0x01f4, B:77:0x01f8, B:82:0x0202, B:87:0x0210, B:89:0x0230, B:90:0x023c, B:85:0x0208, B:91:0x0240, B:92:0x0245, B:94:0x0249, B:96:0x024d, B:98:0x0251, B:99:0x025f, B:104:0x026d, B:106:0x0271, B:107:0x0282, B:109:0x0286, B:110:0x0295, B:112:0x0299, B:114:0x02bb, B:115:0x02be, B:121:0x02ea, B:118:0x02d1, B:119:0x02d8, B:120:0x02d9, B:35:0x00a9, B:36:0x00b2, B:43:0x00bf, B:42:0x00bc, B:44:0x00c0, B:45:0x00da, B:46:0x00db, B:48:0x0119, B:49:0x0125, B:50:0x012e, B:51:0x012f, B:53:0x014b, B:54:0x0159, B:56:0x016c, B:57:0x0171, B:60:0x017b, B:62:0x0185, B:63:0x019b, B:64:0x01a4, B:65:0x01a5, B:66:0x01c7, B:39:0x00b7, B:20:0x0082, B:21:0x0085, B:23:0x008b), top: B:155:0x004d, outer: #4, inners: #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x01e9 A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:10:0x004d, B:12:0x0053, B:14:0x005f, B:19:0x006a, B:28:0x0094, B:70:0x01cd, B:72:0x01e9, B:73:0x01ec, B:75:0x01f4, B:77:0x01f8, B:82:0x0202, B:87:0x0210, B:89:0x0230, B:90:0x023c, B:85:0x0208, B:91:0x0240, B:92:0x0245, B:94:0x0249, B:96:0x024d, B:98:0x0251, B:99:0x025f, B:104:0x026d, B:106:0x0271, B:107:0x0282, B:109:0x0286, B:110:0x0295, B:112:0x0299, B:114:0x02bb, B:115:0x02be, B:121:0x02ea, B:118:0x02d1, B:119:0x02d8, B:120:0x02d9, B:35:0x00a9, B:36:0x00b2, B:43:0x00bf, B:42:0x00bc, B:44:0x00c0, B:45:0x00da, B:46:0x00db, B:48:0x0119, B:49:0x0125, B:50:0x012e, B:51:0x012f, B:53:0x014b, B:54:0x0159, B:56:0x016c, B:57:0x0171, B:60:0x017b, B:62:0x0185, B:63:0x019b, B:64:0x01a4, B:65:0x01a5, B:66:0x01c7, B:39:0x00b7, B:20:0x0082, B:21:0x0085, B:23:0x008b), top: B:155:0x004d, outer: #4, inners: #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x01f4 A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:10:0x004d, B:12:0x0053, B:14:0x005f, B:19:0x006a, B:28:0x0094, B:70:0x01cd, B:72:0x01e9, B:73:0x01ec, B:75:0x01f4, B:77:0x01f8, B:82:0x0202, B:87:0x0210, B:89:0x0230, B:90:0x023c, B:85:0x0208, B:91:0x0240, B:92:0x0245, B:94:0x0249, B:96:0x024d, B:98:0x0251, B:99:0x025f, B:104:0x026d, B:106:0x0271, B:107:0x0282, B:109:0x0286, B:110:0x0295, B:112:0x0299, B:114:0x02bb, B:115:0x02be, B:121:0x02ea, B:118:0x02d1, B:119:0x02d8, B:120:0x02d9, B:35:0x00a9, B:36:0x00b2, B:43:0x00bf, B:42:0x00bc, B:44:0x00c0, B:45:0x00da, B:46:0x00db, B:48:0x0119, B:49:0x0125, B:50:0x012e, B:51:0x012f, B:53:0x014b, B:54:0x0159, B:56:0x016c, B:57:0x0171, B:60:0x017b, B:62:0x0185, B:63:0x019b, B:64:0x01a4, B:65:0x01a5, B:66:0x01c7, B:39:0x00b7, B:20:0x0082, B:21:0x0085, B:23:0x008b), top: B:155:0x004d, outer: #4, inners: #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:82:0x0202 A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:10:0x004d, B:12:0x0053, B:14:0x005f, B:19:0x006a, B:28:0x0094, B:70:0x01cd, B:72:0x01e9, B:73:0x01ec, B:75:0x01f4, B:77:0x01f8, B:82:0x0202, B:87:0x0210, B:89:0x0230, B:90:0x023c, B:85:0x0208, B:91:0x0240, B:92:0x0245, B:94:0x0249, B:96:0x024d, B:98:0x0251, B:99:0x025f, B:104:0x026d, B:106:0x0271, B:107:0x0282, B:109:0x0286, B:110:0x0295, B:112:0x0299, B:114:0x02bb, B:115:0x02be, B:121:0x02ea, B:118:0x02d1, B:119:0x02d8, B:120:0x02d9, B:35:0x00a9, B:36:0x00b2, B:43:0x00bf, B:42:0x00bc, B:44:0x00c0, B:45:0x00da, B:46:0x00db, B:48:0x0119, B:49:0x0125, B:50:0x012e, B:51:0x012f, B:53:0x014b, B:54:0x0159, B:56:0x016c, B:57:0x0171, B:60:0x017b, B:62:0x0185, B:63:0x019b, B:64:0x01a4, B:65:0x01a5, B:66:0x01c7, B:39:0x00b7, B:20:0x0082, B:21:0x0085, B:23:0x008b), top: B:155:0x004d, outer: #4, inners: #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0206  */
    /* JADX WARN: Code duplicated, block: B:85:0x0208 A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:10:0x004d, B:12:0x0053, B:14:0x005f, B:19:0x006a, B:28:0x0094, B:70:0x01cd, B:72:0x01e9, B:73:0x01ec, B:75:0x01f4, B:77:0x01f8, B:82:0x0202, B:87:0x0210, B:89:0x0230, B:90:0x023c, B:85:0x0208, B:91:0x0240, B:92:0x0245, B:94:0x0249, B:96:0x024d, B:98:0x0251, B:99:0x025f, B:104:0x026d, B:106:0x0271, B:107:0x0282, B:109:0x0286, B:110:0x0295, B:112:0x0299, B:114:0x02bb, B:115:0x02be, B:121:0x02ea, B:118:0x02d1, B:119:0x02d8, B:120:0x02d9, B:35:0x00a9, B:36:0x00b2, B:43:0x00bf, B:42:0x00bc, B:44:0x00c0, B:45:0x00da, B:46:0x00db, B:48:0x0119, B:49:0x0125, B:50:0x012e, B:51:0x012f, B:53:0x014b, B:54:0x0159, B:56:0x016c, B:57:0x0171, B:60:0x017b, B:62:0x0185, B:63:0x019b, B:64:0x01a4, B:65:0x01a5, B:66:0x01c7, B:39:0x00b7, B:20:0x0082, B:21:0x0085, B:23:0x008b), top: B:155:0x004d, outer: #4, inners: #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0210 A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:10:0x004d, B:12:0x0053, B:14:0x005f, B:19:0x006a, B:28:0x0094, B:70:0x01cd, B:72:0x01e9, B:73:0x01ec, B:75:0x01f4, B:77:0x01f8, B:82:0x0202, B:87:0x0210, B:89:0x0230, B:90:0x023c, B:85:0x0208, B:91:0x0240, B:92:0x0245, B:94:0x0249, B:96:0x024d, B:98:0x0251, B:99:0x025f, B:104:0x026d, B:106:0x0271, B:107:0x0282, B:109:0x0286, B:110:0x0295, B:112:0x0299, B:114:0x02bb, B:115:0x02be, B:121:0x02ea, B:118:0x02d1, B:119:0x02d8, B:120:0x02d9, B:35:0x00a9, B:36:0x00b2, B:43:0x00bf, B:42:0x00bc, B:44:0x00c0, B:45:0x00da, B:46:0x00db, B:48:0x0119, B:49:0x0125, B:50:0x012e, B:51:0x012f, B:53:0x014b, B:54:0x0159, B:56:0x016c, B:57:0x0171, B:60:0x017b, B:62:0x0185, B:63:0x019b, B:64:0x01a4, B:65:0x01a5, B:66:0x01c7, B:39:0x00b7, B:20:0x0082, B:21:0x0085, B:23:0x008b), top: B:155:0x004d, outer: #4, inners: #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0230 A[Catch: all -> 0x00b3, LOOP:2: B:88:0x022e->B:89:0x0230, LOOP_END, TryCatch #0 {all -> 0x00b3, blocks: (B:10:0x004d, B:12:0x0053, B:14:0x005f, B:19:0x006a, B:28:0x0094, B:70:0x01cd, B:72:0x01e9, B:73:0x01ec, B:75:0x01f4, B:77:0x01f8, B:82:0x0202, B:87:0x0210, B:89:0x0230, B:90:0x023c, B:85:0x0208, B:91:0x0240, B:92:0x0245, B:94:0x0249, B:96:0x024d, B:98:0x0251, B:99:0x025f, B:104:0x026d, B:106:0x0271, B:107:0x0282, B:109:0x0286, B:110:0x0295, B:112:0x0299, B:114:0x02bb, B:115:0x02be, B:121:0x02ea, B:118:0x02d1, B:119:0x02d8, B:120:0x02d9, B:35:0x00a9, B:36:0x00b2, B:43:0x00bf, B:42:0x00bc, B:44:0x00c0, B:45:0x00da, B:46:0x00db, B:48:0x0119, B:49:0x0125, B:50:0x012e, B:51:0x012f, B:53:0x014b, B:54:0x0159, B:56:0x016c, B:57:0x0171, B:60:0x017b, B:62:0x0185, B:63:0x019b, B:64:0x01a4, B:65:0x01a5, B:66:0x01c7, B:39:0x00b7, B:20:0x0082, B:21:0x0085, B:23:0x008b), top: B:155:0x004d, outer: #4, inners: #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0240 A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:10:0x004d, B:12:0x0053, B:14:0x005f, B:19:0x006a, B:28:0x0094, B:70:0x01cd, B:72:0x01e9, B:73:0x01ec, B:75:0x01f4, B:77:0x01f8, B:82:0x0202, B:87:0x0210, B:89:0x0230, B:90:0x023c, B:85:0x0208, B:91:0x0240, B:92:0x0245, B:94:0x0249, B:96:0x024d, B:98:0x0251, B:99:0x025f, B:104:0x026d, B:106:0x0271, B:107:0x0282, B:109:0x0286, B:110:0x0295, B:112:0x0299, B:114:0x02bb, B:115:0x02be, B:121:0x02ea, B:118:0x02d1, B:119:0x02d8, B:120:0x02d9, B:35:0x00a9, B:36:0x00b2, B:43:0x00bf, B:42:0x00bc, B:44:0x00c0, B:45:0x00da, B:46:0x00db, B:48:0x0119, B:49:0x0125, B:50:0x012e, B:51:0x012f, B:53:0x014b, B:54:0x0159, B:56:0x016c, B:57:0x0171, B:60:0x017b, B:62:0x0185, B:63:0x019b, B:64:0x01a4, B:65:0x01a5, B:66:0x01c7, B:39:0x00b7, B:20:0x0082, B:21:0x0085, B:23:0x008b), top: B:155:0x004d, outer: #4, inners: #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0249 A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:10:0x004d, B:12:0x0053, B:14:0x005f, B:19:0x006a, B:28:0x0094, B:70:0x01cd, B:72:0x01e9, B:73:0x01ec, B:75:0x01f4, B:77:0x01f8, B:82:0x0202, B:87:0x0210, B:89:0x0230, B:90:0x023c, B:85:0x0208, B:91:0x0240, B:92:0x0245, B:94:0x0249, B:96:0x024d, B:98:0x0251, B:99:0x025f, B:104:0x026d, B:106:0x0271, B:107:0x0282, B:109:0x0286, B:110:0x0295, B:112:0x0299, B:114:0x02bb, B:115:0x02be, B:121:0x02ea, B:118:0x02d1, B:119:0x02d8, B:120:0x02d9, B:35:0x00a9, B:36:0x00b2, B:43:0x00bf, B:42:0x00bc, B:44:0x00c0, B:45:0x00da, B:46:0x00db, B:48:0x0119, B:49:0x0125, B:50:0x012e, B:51:0x012f, B:53:0x014b, B:54:0x0159, B:56:0x016c, B:57:0x0171, B:60:0x017b, B:62:0x0185, B:63:0x019b, B:64:0x01a4, B:65:0x01a5, B:66:0x01c7, B:39:0x00b7, B:20:0x0082, B:21:0x0085, B:23:0x008b), top: B:155:0x004d, outer: #4, inners: #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0251 A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:10:0x004d, B:12:0x0053, B:14:0x005f, B:19:0x006a, B:28:0x0094, B:70:0x01cd, B:72:0x01e9, B:73:0x01ec, B:75:0x01f4, B:77:0x01f8, B:82:0x0202, B:87:0x0210, B:89:0x0230, B:90:0x023c, B:85:0x0208, B:91:0x0240, B:92:0x0245, B:94:0x0249, B:96:0x024d, B:98:0x0251, B:99:0x025f, B:104:0x026d, B:106:0x0271, B:107:0x0282, B:109:0x0286, B:110:0x0295, B:112:0x0299, B:114:0x02bb, B:115:0x02be, B:121:0x02ea, B:118:0x02d1, B:119:0x02d8, B:120:0x02d9, B:35:0x00a9, B:36:0x00b2, B:43:0x00bf, B:42:0x00bc, B:44:0x00c0, B:45:0x00da, B:46:0x00db, B:48:0x0119, B:49:0x0125, B:50:0x012e, B:51:0x012f, B:53:0x014b, B:54:0x0159, B:56:0x016c, B:57:0x0171, B:60:0x017b, B:62:0x0185, B:63:0x019b, B:64:0x01a4, B:65:0x01a5, B:66:0x01c7, B:39:0x00b7, B:20:0x0082, B:21:0x0085, B:23:0x008b), top: B:155:0x004d, outer: #4, inners: #5, #7 }] */
    public final void a(d0 d0Var) {
        boolean z5;
        InputStream sequenceInputStream;
        int i7;
        String str;
        p0 p0Var;
        b0 b0Var;
        File fileK;
        z zVarC;
        boolean z6;
        File fileC;
        long length;
        File fileK2;
        boolean z7;
        String str2;
        boolean zEndsWith;
        FileOutputStream fileOutputStream;
        int i10;
        int iMin;
        int iMax;
        int i11;
        s sVar = this.f20025b;
        String str3 = (String) d0Var.f10850b;
        int i12 = d0Var.f20004c;
        long j = d0Var.f20005d;
        String str4 = d0Var.f20007f;
        n1 n1Var = new n1(sVar, str3, i12, j, str4);
        sVar.getClass();
        File file = new File(new File(new File(sVar.c(i12, j, str3), "_slices"), "_metadata"), str4);
        if (!file.exists()) {
            file.mkdirs();
        }
        try {
            ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = d0Var.f20011l;
            InputStream gZIPInputStream = d0Var.f20008g != 1 ? autoCloseInputStream : new GZIPInputStream(autoCloseInputStream, 8192);
            try {
                try {
                    if (d0Var.f20009h > 0) {
                        y yVarB = n1Var.b();
                        int i13 = yVarB.f20242e;
                        int i14 = d0Var.f20009h;
                        if (i13 != i14 - 1) {
                            throw new l0("Trying to resume with chunk number " + i14 + " when previously processed chunk was number " + yVarB.f20242e + ".", d0Var.f10849a);
                        }
                        int i15 = yVarB.f20238a;
                        if (i15 == 1) {
                            z5 = true;
                            f20023g.a("Resuming zip entry from last chunk during file %s.", yVarB.f20239b);
                            File file2 = new File(yVarB.f20239b);
                            if (!file2.exists()) {
                                throw new l0("Partial file specified in checkpoint does not exist. Corrupt directory.", d0Var.f10849a);
                            }
                            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
                            randomAccessFile.seek(yVarB.f20240c);
                            long j5 = yVarB.f20241d;
                            do {
                                iMin = (int) Math.min(j5, 8192L);
                                iMax = Math.max(gZIPInputStream.read(this.f20024a, 0, iMin), 0);
                                if (iMax > 0) {
                                    randomAccessFile.write(this.f20024a, 0, iMax);
                                }
                                j5 -= (long) iMax;
                                if (j5 <= 0) {
                                    break;
                                }
                            } while (iMax > 0);
                            long length2 = randomAccessFile.length();
                            randomAccessFile.close();
                            if (iMax != iMin) {
                                f20023g.a("Chunk has ended while resuming the previous chunks file content.", new Object[0]);
                                n1Var.f(length2, j5, file2.getCanonicalPath(), d0Var.f20009h);
                            }
                            if (sequenceInputStream != null) {
                                b0Var = new b0(sequenceInputStream);
                                fileK = this.f20025b.k(d0Var.f20004c, (String) d0Var.f10850b, d0Var.f20005d, d0Var.f20007f);
                                if (!fileK.exists()) {
                                    fileK.mkdirs();
                                }
                                do {
                                    zVarC = b0Var.c();
                                    if (!zVarC.f20248d) {
                                        if (zVarC.f20247c == 0) {
                                            z7 = z5;
                                        } else {
                                            z7 = false;
                                        }
                                        if (z7) {
                                            str2 = zVarC.f20245a;
                                            if (str2 == null) {
                                                zEndsWith = false;
                                            } else {
                                                zEndsWith = str2.endsWith("/");
                                            }
                                            if (zEndsWith) {
                                                n1Var.j(b0Var, zVarC.f20250f);
                                            } else {
                                                n1Var.i(zVarC.f20250f);
                                                File file3 = new File(fileK, zVarC.f20245a);
                                                file3.getParentFile().mkdirs();
                                                fileOutputStream = new FileOutputStream(file3);
                                                i10 = b0Var.read(this.f20024a, 0, 8192);
                                                while (i10 > 0) {
                                                    fileOutputStream.write(this.f20024a, 0, i10);
                                                    i10 = b0Var.read(this.f20024a, 0, 8192);
                                                }
                                                fileOutputStream.close();
                                            }
                                        } else {
                                            n1Var.j(b0Var, zVarC.f20250f);
                                        }
                                    }
                                    if (!b0Var.f19987v) {
                                        break;
                                        break;
                                    }
                                } while (!b0Var.f19988w);
                                if (b0Var.f19988w) {
                                    f20023g.a("Writing central directory metadata.", new Object[0]);
                                    n1Var.j(sequenceInputStream, zVarC.f20250f);
                                }
                                if (d0Var.f20009h + 1 == d0Var.f20010i) {
                                    z6 = z5;
                                } else {
                                    z6 = false;
                                }
                                if (!z6) {
                                    if (zVarC.f20248d) {
                                        f20023g.a("Writing slice checkpoint for partial local file header.", new Object[0]);
                                        n1Var.g(zVarC.f20250f, d0Var.f20009h);
                                    } else if (b0Var.f19988w) {
                                        f20023g.a("Writing slice checkpoint for central directory.", new Object[0]);
                                        n1Var.e(d0Var.f20009h);
                                    } else {
                                        if (zVarC.f20247c == 0) {
                                            f20023g.a("Writing slice checkpoint for partial file.", new Object[0]);
                                            fileK2 = this.f20025b.k(d0Var.f20004c, (String) d0Var.f10850b, d0Var.f20005d, d0Var.f20007f);
                                            if (!fileK2.exists()) {
                                                fileK2.mkdirs();
                                            }
                                            fileC = new File(fileK2, zVarC.f20245a);
                                            length = zVarC.f20246b - b0Var.f19986i;
                                            if (fileC.length() == length) {
                                                throw new l0("Partial file is of unexpected size.");
                                            }
                                        } else {
                                            f20023g.a("Writing slice checkpoint for partial unextractable file.", new Object[0]);
                                            fileC = n1Var.c();
                                            length = fileC.length();
                                        }
                                        n1Var.f(length, b0Var.f19986i, fileC.getCanonicalPath(), d0Var.f20009h);
                                    }
                                }
                            }
                            gZIPInputStream.close();
                            i7 = d0Var.f20009h;
                            if (i7 + 1 == d0Var.f20010i) {
                                n1Var.h(i7);
                            }
                            f20023g.d("Extraction finished for chunk %s of slice %s of pack %s of session %s.", Integer.valueOf(d0Var.f20009h), d0Var.f20007f, (String) d0Var.f10850b, Integer.valueOf(d0Var.f10849a));
                            ((v1) this.f20028e.a()).d(d0Var.f10849a, d0Var.f20009h, (String) d0Var.f10850b, d0Var.f20007f);
                            d0Var.f20011l.close();
                            if (d0Var.k == 3) {
                                r rVar = (r) this.f20029f.a();
                                str = (String) d0Var.f10850b;
                                long j7 = d0Var.j;
                                p0Var = this.f20026c;
                                synchronized (p0Var) {
                                    double d6 = (((double) d0Var.f20009h) + 1.0d) / ((double) d0Var.f20010i);
                                    p0Var.f20150a.put(str, Double.valueOf(d6));
                                    w wVarA = AssetPackState.a(str, 3, 0, j7, j7, d6, 1, d0Var.f20006e, this.f20027d.a((String) d0Var.f10850b));
                                    rVar.getClass();
                                    rVar.f20160b.post(new com.google.android.gms.internal.play_billing.u0(18, rVar, wVarA));
                                }
                            }
                        }
                        if (i15 == 2) {
                            f20023g.a("Resuming zip entry from last chunk during local file header.", new Object[0]);
                            s sVar2 = this.f20025b;
                            String str5 = (String) d0Var.f10850b;
                            int i16 = d0Var.f20004c;
                            long j10 = d0Var.f20005d;
                            String str6 = d0Var.f20007f;
                            sVar2.getClass();
                            z5 = true;
                            File file4 = new File(new File(new File(new File(sVar2.c(i16, j10, str5), "_slices"), "_metadata"), str6), "checkpoint_ext.dat");
                            if (!file4.exists()) {
                                throw new l0("Checkpoint extension file not found.", d0Var.f10849a);
                            }
                            sequenceInputStream = new SequenceInputStream(new FileInputStream(file4), gZIPInputStream);
                        } else {
                            if (i15 != 3) {
                                throw new l0("Slice checkpoint file corrupt. Unexpected FileExtractionStatus " + yVarB.f20238a + ".", d0Var.f10849a);
                            }
                            f20023g.a("Resuming central directory from last chunk.", new Object[0]);
                            long j11 = yVarB.f20240c;
                            byte[] bArr = n1Var.f20124a;
                            RandomAccessFile randomAccessFile2 = new RandomAccessFile(n1Var.c(), "rw");
                            try {
                                randomAccessFile2.seek(j11);
                                do {
                                    i11 = gZIPInputStream.read(bArr);
                                    if (i11 > 0) {
                                        randomAccessFile2.write(bArr, 0, i11);
                                    }
                                } while (i11 >= 0);
                                randomAccessFile2.close();
                                if (!(d0Var.f20009h + 1 == d0Var.f20010i)) {
                                    throw new l0("Chunk has ended twice during central directory. This should not be possible with chunk sizes of 50MB.", d0Var.f10849a);
                                }
                                z5 = true;
                            } catch (Throwable th2) {
                                try {
                                    randomAccessFile2.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        }
                        if (sequenceInputStream != null) {
                            b0Var = new b0(sequenceInputStream);
                            fileK = this.f20025b.k(d0Var.f20004c, (String) d0Var.f10850b, d0Var.f20005d, d0Var.f20007f);
                            if (!fileK.exists()) {
                                fileK.mkdirs();
                            }
                            do {
                                zVarC = b0Var.c();
                                if (!zVarC.f20248d && !b0Var.f19988w) {
                                    if (zVarC.f20247c == 0) {
                                        z7 = z5;
                                    } else {
                                        z7 = false;
                                    }
                                    if (z7) {
                                        n1Var.j(b0Var, zVarC.f20250f);
                                    } else {
                                        str2 = zVarC.f20245a;
                                        if (str2 == null) {
                                            zEndsWith = false;
                                        } else {
                                            zEndsWith = str2.endsWith("/");
                                        }
                                        if (zEndsWith) {
                                            n1Var.i(zVarC.f20250f);
                                            File file5 = new File(fileK, zVarC.f20245a);
                                            file5.getParentFile().mkdirs();
                                            fileOutputStream = new FileOutputStream(file5);
                                            i10 = b0Var.read(this.f20024a, 0, 8192);
                                            while (i10 > 0) {
                                                fileOutputStream.write(this.f20024a, 0, i10);
                                                i10 = b0Var.read(this.f20024a, 0, 8192);
                                            }
                                            fileOutputStream.close();
                                        } else {
                                            n1Var.j(b0Var, zVarC.f20250f);
                                        }
                                    }
                                }
                                if (!b0Var.f19987v) {
                                    break;
                                }
                            } while (!b0Var.f19988w);
                            if (b0Var.f19988w) {
                                f20023g.a("Writing central directory metadata.", new Object[0]);
                                n1Var.j(sequenceInputStream, zVarC.f20250f);
                            }
                            if (d0Var.f20009h + 1 == d0Var.f20010i) {
                                z6 = z5;
                            } else {
                                z6 = false;
                            }
                            if (!z6) {
                                if (zVarC.f20248d) {
                                    f20023g.a("Writing slice checkpoint for partial local file header.", new Object[0]);
                                    n1Var.g(zVarC.f20250f, d0Var.f20009h);
                                } else if (b0Var.f19988w) {
                                    f20023g.a("Writing slice checkpoint for central directory.", new Object[0]);
                                    n1Var.e(d0Var.f20009h);
                                } else {
                                    if (zVarC.f20247c == 0) {
                                        f20023g.a("Writing slice checkpoint for partial file.", new Object[0]);
                                        fileK2 = this.f20025b.k(d0Var.f20004c, (String) d0Var.f10850b, d0Var.f20005d, d0Var.f20007f);
                                        if (!fileK2.exists()) {
                                            fileK2.mkdirs();
                                        }
                                        fileC = new File(fileK2, zVarC.f20245a);
                                        length = zVarC.f20246b - b0Var.f19986i;
                                        if (fileC.length() == length) {
                                            throw new l0("Partial file is of unexpected size.");
                                        }
                                    } else {
                                        f20023g.a("Writing slice checkpoint for partial unextractable file.", new Object[0]);
                                        fileC = n1Var.c();
                                        length = fileC.length();
                                    }
                                    n1Var.f(length, b0Var.f19986i, fileC.getCanonicalPath(), d0Var.f20009h);
                                }
                            }
                        }
                        gZIPInputStream.close();
                        i7 = d0Var.f20009h;
                        if (i7 + 1 == d0Var.f20010i) {
                            try {
                                n1Var.h(i7);
                            } catch (IOException e10) {
                                f20023g.b("Writing extraction finished checkpoint failed with %s.", e10.getMessage());
                                throw new l0("Writing extraction finished checkpoint failed.", e10, d0Var.f10849a);
                            }
                        }
                        f20023g.d("Extraction finished for chunk %s of slice %s of pack %s of session %s.", Integer.valueOf(d0Var.f20009h), d0Var.f20007f, (String) d0Var.f10850b, Integer.valueOf(d0Var.f10849a));
                        ((v1) this.f20028e.a()).d(d0Var.f10849a, d0Var.f20009h, (String) d0Var.f10850b, d0Var.f20007f);
                        d0Var.f20011l.close();
                        if (d0Var.k == 3) {
                            r rVar2 = (r) this.f20029f.a();
                            str = (String) d0Var.f10850b;
                            long j12 = d0Var.j;
                            p0Var = this.f20026c;
                            synchronized (p0Var) {
                                double d7 = (((double) d0Var.f20009h) + 1.0d) / ((double) d0Var.f20010i);
                                p0Var.f20150a.put(str, Double.valueOf(d7));
                            }
                            w wVarA2 = AssetPackState.a(str, 3, 0, j12, j12, d7, 1, d0Var.f20006e, this.f20027d.a((String) d0Var.f10850b));
                            rVar2.getClass();
                            rVar2.f20160b.post(new com.google.android.gms.internal.play_billing.u0(18, rVar2, wVarA2));
                        }
                        sequenceInputStream = null;
                        if (sequenceInputStream != null) {
                            b0Var = new b0(sequenceInputStream);
                            fileK = this.f20025b.k(d0Var.f20004c, (String) d0Var.f10850b, d0Var.f20005d, d0Var.f20007f);
                            if (!fileK.exists()) {
                                fileK.mkdirs();
                            }
                            do {
                                zVarC = b0Var.c();
                                if (!zVarC.f20248d) {
                                    if (zVarC.f20247c == 0) {
                                        z7 = z5;
                                    } else {
                                        z7 = false;
                                    }
                                    if (z7) {
                                        n1Var.j(b0Var, zVarC.f20250f);
                                    } else {
                                        str2 = zVarC.f20245a;
                                        if (str2 == null) {
                                            zEndsWith = false;
                                        } else {
                                            zEndsWith = str2.endsWith("/");
                                        }
                                        if (zEndsWith) {
                                            n1Var.i(zVarC.f20250f);
                                            File file6 = new File(fileK, zVarC.f20245a);
                                            file6.getParentFile().mkdirs();
                                            fileOutputStream = new FileOutputStream(file6);
                                            i10 = b0Var.read(this.f20024a, 0, 8192);
                                            while (i10 > 0) {
                                                fileOutputStream.write(this.f20024a, 0, i10);
                                                i10 = b0Var.read(this.f20024a, 0, 8192);
                                            }
                                            fileOutputStream.close();
                                        } else {
                                            n1Var.j(b0Var, zVarC.f20250f);
                                        }
                                    }
                                }
                                if (!b0Var.f19987v) {
                                    break;
                                    break;
                                }
                            } while (!b0Var.f19988w);
                            if (b0Var.f19988w) {
                                f20023g.a("Writing central directory metadata.", new Object[0]);
                                n1Var.j(sequenceInputStream, zVarC.f20250f);
                            }
                            if (d0Var.f20009h + 1 == d0Var.f20010i) {
                                z6 = z5;
                            } else {
                                z6 = false;
                            }
                            if (!z6) {
                                if (zVarC.f20248d) {
                                    f20023g.a("Writing slice checkpoint for partial local file header.", new Object[0]);
                                    n1Var.g(zVarC.f20250f, d0Var.f20009h);
                                } else if (b0Var.f19988w) {
                                    f20023g.a("Writing slice checkpoint for central directory.", new Object[0]);
                                    n1Var.e(d0Var.f20009h);
                                } else {
                                    if (zVarC.f20247c == 0) {
                                        f20023g.a("Writing slice checkpoint for partial file.", new Object[0]);
                                        fileK2 = this.f20025b.k(d0Var.f20004c, (String) d0Var.f10850b, d0Var.f20005d, d0Var.f20007f);
                                        if (!fileK2.exists()) {
                                            fileK2.mkdirs();
                                        }
                                        fileC = new File(fileK2, zVarC.f20245a);
                                        length = zVarC.f20246b - b0Var.f19986i;
                                        if (fileC.length() == length) {
                                            throw new l0("Partial file is of unexpected size.");
                                        }
                                    } else {
                                        f20023g.a("Writing slice checkpoint for partial unextractable file.", new Object[0]);
                                        fileC = n1Var.c();
                                        length = fileC.length();
                                    }
                                    n1Var.f(length, b0Var.f19986i, fileC.getCanonicalPath(), d0Var.f20009h);
                                }
                            }
                        }
                        gZIPInputStream.close();
                        i7 = d0Var.f20009h;
                        if (i7 + 1 == d0Var.f20010i) {
                            n1Var.h(i7);
                        }
                        f20023g.d("Extraction finished for chunk %s of slice %s of pack %s of session %s.", Integer.valueOf(d0Var.f20009h), d0Var.f20007f, (String) d0Var.f10850b, Integer.valueOf(d0Var.f10849a));
                        ((v1) this.f20028e.a()).d(d0Var.f10849a, d0Var.f20009h, (String) d0Var.f10850b, d0Var.f20007f);
                        d0Var.f20011l.close();
                        if (d0Var.k == 3) {
                            r rVar3 = (r) this.f20029f.a();
                            str = (String) d0Var.f10850b;
                            long j13 = d0Var.j;
                            p0Var = this.f20026c;
                            synchronized (p0Var) {
                                double d8 = (((double) d0Var.f20009h) + 1.0d) / ((double) d0Var.f20010i);
                                p0Var.f20150a.put(str, Double.valueOf(d8));
                                w wVarA3 = AssetPackState.a(str, 3, 0, j13, j13, d8, 1, d0Var.f20006e, this.f20027d.a((String) d0Var.f10850b));
                                rVar3.getClass();
                                rVar3.f20160b.post(new com.google.android.gms.internal.play_billing.u0(18, rVar3, wVarA3));
                            }
                        }
                        f20023g.b("IOException during extraction %s.", e.getMessage());
                        int i17 = d0Var.f20009h;
                        String str7 = d0Var.f20007f;
                        String str8 = (String) d0Var.f10850b;
                        int i18 = d0Var.f10849a;
                        StringBuilder sbO = com.discord.chat.presentation.list.a.o("Error extracting chunk ", " of slice ", str7, i17, " of pack ");
                        sbO.append(str8);
                        sbO.append(" of session ");
                        sbO.append(i18);
                        sbO.append(".");
                        throw new l0(sbO.toString(), e, d0Var.f10849a);
                    }
                    z5 = true;
                    d0Var.f20011l.close();
                } catch (IOException unused) {
                    f20023g.e("Could not close file for chunk %s of slice %s of pack %s.", Integer.valueOf(d0Var.f20009h), d0Var.f20007f, (String) d0Var.f10850b);
                }
                sequenceInputStream = gZIPInputStream;
                if (sequenceInputStream != null) {
                    b0Var = new b0(sequenceInputStream);
                    fileK = this.f20025b.k(d0Var.f20004c, (String) d0Var.f10850b, d0Var.f20005d, d0Var.f20007f);
                    if (!fileK.exists()) {
                        fileK.mkdirs();
                    }
                    do {
                        zVarC = b0Var.c();
                        if (!zVarC.f20248d) {
                            if (zVarC.f20247c == 0) {
                                z7 = z5;
                            } else {
                                z7 = false;
                            }
                            if (z7) {
                                n1Var.j(b0Var, zVarC.f20250f);
                            } else {
                                str2 = zVarC.f20245a;
                                if (str2 == null) {
                                    zEndsWith = false;
                                } else {
                                    zEndsWith = str2.endsWith("/");
                                }
                                if (zEndsWith) {
                                    n1Var.i(zVarC.f20250f);
                                    File file7 = new File(fileK, zVarC.f20245a);
                                    file7.getParentFile().mkdirs();
                                    fileOutputStream = new FileOutputStream(file7);
                                    i10 = b0Var.read(this.f20024a, 0, 8192);
                                    while (i10 > 0) {
                                        fileOutputStream.write(this.f20024a, 0, i10);
                                        i10 = b0Var.read(this.f20024a, 0, 8192);
                                    }
                                    fileOutputStream.close();
                                } else {
                                    n1Var.j(b0Var, zVarC.f20250f);
                                }
                            }
                        }
                        if (!b0Var.f19987v) {
                            break;
                            break;
                        }
                    } while (!b0Var.f19988w);
                    if (b0Var.f19988w) {
                        f20023g.a("Writing central directory metadata.", new Object[0]);
                        n1Var.j(sequenceInputStream, zVarC.f20250f);
                    }
                    if (d0Var.f20009h + 1 == d0Var.f20010i) {
                        z6 = z5;
                    } else {
                        z6 = false;
                    }
                    if (!z6) {
                        if (zVarC.f20248d) {
                            f20023g.a("Writing slice checkpoint for partial local file header.", new Object[0]);
                            n1Var.g(zVarC.f20250f, d0Var.f20009h);
                        } else if (b0Var.f19988w) {
                            f20023g.a("Writing slice checkpoint for central directory.", new Object[0]);
                            n1Var.e(d0Var.f20009h);
                        } else {
                            if (zVarC.f20247c == 0) {
                                f20023g.a("Writing slice checkpoint for partial file.", new Object[0]);
                                fileK2 = this.f20025b.k(d0Var.f20004c, (String) d0Var.f10850b, d0Var.f20005d, d0Var.f20007f);
                                if (!fileK2.exists()) {
                                    fileK2.mkdirs();
                                }
                                fileC = new File(fileK2, zVarC.f20245a);
                                length = zVarC.f20246b - b0Var.f19986i;
                                if (fileC.length() == length) {
                                    throw new l0("Partial file is of unexpected size.");
                                }
                            } else {
                                f20023g.a("Writing slice checkpoint for partial unextractable file.", new Object[0]);
                                fileC = n1Var.c();
                                length = fileC.length();
                            }
                            n1Var.f(length, b0Var.f19986i, fileC.getCanonicalPath(), d0Var.f20009h);
                        }
                    }
                }
                gZIPInputStream.close();
                i7 = d0Var.f20009h;
                if (i7 + 1 == d0Var.f20010i) {
                    n1Var.h(i7);
                }
                f20023g.d("Extraction finished for chunk %s of slice %s of pack %s of session %s.", Integer.valueOf(d0Var.f20009h), d0Var.f20007f, (String) d0Var.f10850b, Integer.valueOf(d0Var.f10849a));
                ((v1) this.f20028e.a()).d(d0Var.f10849a, d0Var.f20009h, (String) d0Var.f10850b, d0Var.f20007f);
                if (d0Var.k == 3) {
                    r rVar4 = (r) this.f20029f.a();
                    str = (String) d0Var.f10850b;
                    long j14 = d0Var.j;
                    p0Var = this.f20026c;
                    synchronized (p0Var) {
                        double d9 = (((double) d0Var.f20009h) + 1.0d) / ((double) d0Var.f20010i);
                        p0Var.f20150a.put(str, Double.valueOf(d9));
                        w wVarA4 = AssetPackState.a(str, 3, 0, j14, j14, d9, 1, d0Var.f20006e, this.f20027d.a((String) d0Var.f10850b));
                        rVar4.getClass();
                        rVar4.f20160b.post(new com.google.android.gms.internal.play_billing.u0(18, rVar4, wVarA4));
                    }
                }
            } catch (Throwable th4) {
                try {
                    gZIPInputStream.close();
                    throw th4;
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                    throw th4;
                }
            }
        } catch (IOException e11) {
            f20023g.b("IOException during extraction %s.", e11.getMessage());
            int i19 = d0Var.f20009h;
            String str9 = d0Var.f20007f;
            String str10 = (String) d0Var.f10850b;
            int i110 = d0Var.f10849a;
            StringBuilder sbO2 = com.discord.chat.presentation.list.a.o("Error extracting chunk ", " of slice ", str9, i19, " of pack ");
            sbO2.append(str10);
            sbO2.append(" of session ");
            sbO2.append(i110);
            sbO2.append(".");
            throw new l0(sbO2.toString(), e11, d0Var.f10849a);
        }
    }
}
