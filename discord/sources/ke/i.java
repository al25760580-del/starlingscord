package ke;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import bd.z;
import com.discord.jank_stats.JankRecordStore;
import com.discord.media.engine.MediaEngine;
import com.discord.media.utils.DiscordVideoMediaSource;
import com.discord.misc.utilities.chat_view_types.ChatViewRecyclerTypes;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.video.VideoSize;
import com.swmansion.reanimated.BuildConfig;
import ei.b0;
import ei.c0;
import ei.r0;
import gc.g0;
import gc.p1;
import gc.w;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Pattern;
import je.e0;
import je.x;
import kotlin.jvm.internal.ByteCompanionObject;
import md.o0;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends bd.s {
    public static final int[] K1 = {1920, 1600, 1440, 1280, 960, 854, DiscordVideoMediaSource.DEFAULT_WIDTH, 540, DiscordVideoMediaSource.DEFAULT_HEIGHT};
    public static boolean L1;
    public static boolean M1;
    public long A1;
    public long B1;
    public int C1;
    public long D1;
    public VideoSize E1;
    public VideoSize F1;
    public boolean G1;
    public int H1;
    public h I1;
    public o J1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public final Context f14354c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public final t f14355d1;
    public final e4.r e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public final a3.f f14356f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public final long f14357g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public final int f14358h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public final boolean f14359i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public gc.l f14360j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public boolean f14361k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public boolean f14362l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public Surface f14363m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public k f14364n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public boolean f14365o1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public int f14366p1;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public boolean f14367q1;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public boolean f14368r1;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public boolean f14369s1;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public long f14370t1;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public long f14371u1;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public long f14372v1;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public int f14373w1;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public int f14374x1;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public int f14375y1;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public long f14376z1;

    public i(Context context, bd.k kVar, boolean z5, Handler handler, w wVar) {
        super(2, kVar, z5, 30.0f);
        this.f14357g1 = JankRecordStore.FIRST_FLUSH_DELAY_MS;
        this.f14358h1 = 50;
        Context applicationContext = context.getApplicationContext();
        this.f14354c1 = applicationContext;
        this.f14355d1 = new t(applicationContext);
        this.e1 = new e4.r(12, handler, wVar);
        a3.f fVar = new a3.f();
        fVar.f68b = this;
        new ArrayDeque();
        new ArrayDeque();
        fVar.f67a = true;
        VideoSize videoSize = VideoSize.f5848w;
        this.f14356f1 = fVar;
        this.f14359i1 = "NVIDIA".equals(e0.f13790c);
        this.f14371u1 = -9223372036854775807L;
        this.f14366p1 = 1;
        this.E1 = VideoSize.f5848w;
        this.H1 = 0;
        this.F1 = null;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0124  */
    /* JADX WARN: Code duplicated, block: B:102:0x0127  */
    /* JADX WARN: Code duplicated, block: B:105:0x0130  */
    /* JADX WARN: Code duplicated, block: B:106:0x0134  */
    /* JADX WARN: Code duplicated, block: B:109:0x013d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0141  */
    /* JADX WARN: Code duplicated, block: B:113:0x014a  */
    /* JADX WARN: Code duplicated, block: B:114:0x014e  */
    /* JADX WARN: Code duplicated, block: B:117:0x0157  */
    /* JADX WARN: Code duplicated, block: B:118:0x015b  */
    /* JADX WARN: Code duplicated, block: B:121:0x0164  */
    /* JADX WARN: Code duplicated, block: B:122:0x0168  */
    /* JADX WARN: Code duplicated, block: B:125:0x0171  */
    /* JADX WARN: Code duplicated, block: B:126:0x0175  */
    /* JADX WARN: Code duplicated, block: B:129:0x017e  */
    /* JADX WARN: Code duplicated, block: B:130:0x0182  */
    /* JADX WARN: Code duplicated, block: B:133:0x018b  */
    /* JADX WARN: Code duplicated, block: B:134:0x018f  */
    /* JADX WARN: Code duplicated, block: B:137:0x0198  */
    /* JADX WARN: Code duplicated, block: B:138:0x019c  */
    /* JADX WARN: Code duplicated, block: B:141:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:142:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:145:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:146:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:149:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:150:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:153:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:154:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:157:0x01de  */
    /* JADX WARN: Code duplicated, block: B:158:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:161:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:162:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:165:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:166:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:169:0x0208  */
    /* JADX WARN: Code duplicated, block: B:170:0x020c  */
    /* JADX WARN: Code duplicated, block: B:173:0x0216  */
    /* JADX WARN: Code duplicated, block: B:174:0x021a  */
    /* JADX WARN: Code duplicated, block: B:177:0x0224  */
    /* JADX WARN: Code duplicated, block: B:178:0x0228  */
    /* JADX WARN: Code duplicated, block: B:181:0x0232  */
    /* JADX WARN: Code duplicated, block: B:182:0x0236  */
    /* JADX WARN: Code duplicated, block: B:185:0x0240  */
    /* JADX WARN: Code duplicated, block: B:186:0x0244  */
    /* JADX WARN: Code duplicated, block: B:189:0x024e  */
    /* JADX WARN: Code duplicated, block: B:190:0x0252  */
    /* JADX WARN: Code duplicated, block: B:193:0x025c  */
    /* JADX WARN: Code duplicated, block: B:194:0x0260  */
    /* JADX WARN: Code duplicated, block: B:197:0x026a  */
    /* JADX WARN: Code duplicated, block: B:198:0x026e  */
    /* JADX WARN: Code duplicated, block: B:201:0x0278  */
    /* JADX WARN: Code duplicated, block: B:202:0x027c  */
    /* JADX WARN: Code duplicated, block: B:205:0x0286  */
    /* JADX WARN: Code duplicated, block: B:206:0x028a  */
    /* JADX WARN: Code duplicated, block: B:209:0x0294  */
    /* JADX WARN: Code duplicated, block: B:210:0x0298  */
    /* JADX WARN: Code duplicated, block: B:213:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:214:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:217:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:218:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:221:0x02be  */
    /* JADX WARN: Code duplicated, block: B:222:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:225:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:226:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:229:0x02da  */
    /* JADX WARN: Code duplicated, block: B:230:0x02de  */
    /* JADX WARN: Code duplicated, block: B:233:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:234:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:237:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:238:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:241:0x0304  */
    /* JADX WARN: Code duplicated, block: B:242:0x0308  */
    /* JADX WARN: Code duplicated, block: B:245:0x0312  */
    /* JADX WARN: Code duplicated, block: B:246:0x0316  */
    /* JADX WARN: Code duplicated, block: B:249:0x0320  */
    /* JADX WARN: Code duplicated, block: B:250:0x0324  */
    /* JADX WARN: Code duplicated, block: B:253:0x032e  */
    /* JADX WARN: Code duplicated, block: B:254:0x0332  */
    /* JADX WARN: Code duplicated, block: B:257:0x033c  */
    /* JADX WARN: Code duplicated, block: B:258:0x0340  */
    /* JADX WARN: Code duplicated, block: B:261:0x034a  */
    /* JADX WARN: Code duplicated, block: B:262:0x034e  */
    /* JADX WARN: Code duplicated, block: B:265:0x0358  */
    /* JADX WARN: Code duplicated, block: B:266:0x035c  */
    /* JADX WARN: Code duplicated, block: B:269:0x0366  */
    /* JADX WARN: Code duplicated, block: B:270:0x036a  */
    /* JADX WARN: Code duplicated, block: B:273:0x0374  */
    /* JADX WARN: Code duplicated, block: B:274:0x0378  */
    /* JADX WARN: Code duplicated, block: B:277:0x0382  */
    /* JADX WARN: Code duplicated, block: B:278:0x0386  */
    /* JADX WARN: Code duplicated, block: B:281:0x0390  */
    /* JADX WARN: Code duplicated, block: B:282:0x0394  */
    /* JADX WARN: Code duplicated, block: B:285:0x039e  */
    /* JADX WARN: Code duplicated, block: B:286:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:289:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:290:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:293:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:294:0x03be  */
    /* JADX WARN: Code duplicated, block: B:297:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:298:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:301:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:302:0x03da  */
    /* JADX WARN: Code duplicated, block: B:305:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:306:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:309:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:310:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:313:0x0400  */
    /* JADX WARN: Code duplicated, block: B:314:0x0404  */
    /* JADX WARN: Code duplicated, block: B:317:0x040e  */
    /* JADX WARN: Code duplicated, block: B:318:0x0412  */
    /* JADX WARN: Code duplicated, block: B:321:0x041c  */
    /* JADX WARN: Code duplicated, block: B:322:0x0420  */
    /* JADX WARN: Code duplicated, block: B:325:0x042a  */
    /* JADX WARN: Code duplicated, block: B:326:0x042e  */
    /* JADX WARN: Code duplicated, block: B:329:0x0438  */
    /* JADX WARN: Code duplicated, block: B:330:0x043c  */
    /* JADX WARN: Code duplicated, block: B:333:0x0446  */
    /* JADX WARN: Code duplicated, block: B:334:0x044a  */
    /* JADX WARN: Code duplicated, block: B:337:0x0454  */
    /* JADX WARN: Code duplicated, block: B:338:0x0458  */
    /* JADX WARN: Code duplicated, block: B:341:0x0462  */
    /* JADX WARN: Code duplicated, block: B:342:0x0466  */
    /* JADX WARN: Code duplicated, block: B:345:0x0470  */
    /* JADX WARN: Code duplicated, block: B:346:0x0474  */
    /* JADX WARN: Code duplicated, block: B:349:0x047e  */
    /* JADX WARN: Code duplicated, block: B:350:0x0482  */
    /* JADX WARN: Code duplicated, block: B:353:0x048c  */
    /* JADX WARN: Code duplicated, block: B:354:0x0490  */
    /* JADX WARN: Code duplicated, block: B:357:0x049a  */
    /* JADX WARN: Code duplicated, block: B:358:0x049e  */
    /* JADX WARN: Code duplicated, block: B:361:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:362:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:365:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:366:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:369:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:370:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:373:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:374:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:377:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:378:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:381:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:382:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:385:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:386:0x0500  */
    /* JADX WARN: Code duplicated, block: B:389:0x050a  */
    /* JADX WARN: Code duplicated, block: B:390:0x050e  */
    /* JADX WARN: Code duplicated, block: B:393:0x0518  */
    /* JADX WARN: Code duplicated, block: B:394:0x051c  */
    /* JADX WARN: Code duplicated, block: B:397:0x0526  */
    /* JADX WARN: Code duplicated, block: B:398:0x052a  */
    /* JADX WARN: Code duplicated, block: B:401:0x0534  */
    /* JADX WARN: Code duplicated, block: B:402:0x0538  */
    /* JADX WARN: Code duplicated, block: B:405:0x0542  */
    /* JADX WARN: Code duplicated, block: B:406:0x0546  */
    /* JADX WARN: Code duplicated, block: B:409:0x0550  */
    /* JADX WARN: Code duplicated, block: B:410:0x0554  */
    /* JADX WARN: Code duplicated, block: B:413:0x055e  */
    /* JADX WARN: Code duplicated, block: B:414:0x0562  */
    /* JADX WARN: Code duplicated, block: B:417:0x056c  */
    /* JADX WARN: Code duplicated, block: B:418:0x0570  */
    /* JADX WARN: Code duplicated, block: B:421:0x057a  */
    /* JADX WARN: Code duplicated, block: B:422:0x057e  */
    /* JADX WARN: Code duplicated, block: B:425:0x0588  */
    /* JADX WARN: Code duplicated, block: B:426:0x058c  */
    /* JADX WARN: Code duplicated, block: B:429:0x0596  */
    /* JADX WARN: Code duplicated, block: B:430:0x059a  */
    /* JADX WARN: Code duplicated, block: B:433:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:434:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:437:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:438:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:441:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:442:0x05c4  */
    /* JADX WARN: Code duplicated, block: B:445:0x05ce  */
    /* JADX WARN: Code duplicated, block: B:446:0x05d2  */
    /* JADX WARN: Code duplicated, block: B:449:0x05dc  */
    /* JADX WARN: Code duplicated, block: B:450:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:453:0x05ea  */
    /* JADX WARN: Code duplicated, block: B:454:0x05ee  */
    /* JADX WARN: Code duplicated, block: B:457:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:458:0x05fc  */
    /* JADX WARN: Code duplicated, block: B:461:0x0606  */
    /* JADX WARN: Code duplicated, block: B:462:0x060a  */
    /* JADX WARN: Code duplicated, block: B:465:0x0614  */
    /* JADX WARN: Code duplicated, block: B:466:0x0618  */
    /* JADX WARN: Code duplicated, block: B:469:0x0622  */
    /* JADX WARN: Code duplicated, block: B:470:0x0626  */
    /* JADX WARN: Code duplicated, block: B:473:0x0630  */
    /* JADX WARN: Code duplicated, block: B:474:0x0634  */
    /* JADX WARN: Code duplicated, block: B:477:0x063e  */
    /* JADX WARN: Code duplicated, block: B:478:0x0642  */
    /* JADX WARN: Code duplicated, block: B:481:0x064c  */
    /* JADX WARN: Code duplicated, block: B:482:0x0650  */
    /* JADX WARN: Code duplicated, block: B:485:0x065a  */
    /* JADX WARN: Code duplicated, block: B:486:0x065e  */
    /* JADX WARN: Code duplicated, block: B:489:0x0668  */
    /* JADX WARN: Code duplicated, block: B:490:0x066c  */
    /* JADX WARN: Code duplicated, block: B:493:0x0676  */
    /* JADX WARN: Code duplicated, block: B:494:0x067a  */
    /* JADX WARN: Code duplicated, block: B:497:0x0684  */
    /* JADX WARN: Code duplicated, block: B:498:0x0688  */
    /* JADX WARN: Code duplicated, block: B:49:0x008b A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:501:0x0692  */
    /* JADX WARN: Code duplicated, block: B:502:0x0696  */
    /* JADX WARN: Code duplicated, block: B:505:0x06a0  */
    /* JADX WARN: Code duplicated, block: B:506:0x06a4  */
    /* JADX WARN: Code duplicated, block: B:509:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e  */
    /* JADX WARN: Code duplicated, block: B:510:0x06b2  */
    /* JADX WARN: Code duplicated, block: B:513:0x06bc  */
    /* JADX WARN: Code duplicated, block: B:514:0x06c0  */
    /* JADX WARN: Code duplicated, block: B:517:0x06ca  */
    /* JADX WARN: Code duplicated, block: B:518:0x06ce  */
    /* JADX WARN: Code duplicated, block: B:521:0x06d8  */
    /* JADX WARN: Code duplicated, block: B:522:0x06dc  */
    /* JADX WARN: Code duplicated, block: B:525:0x06e6  */
    /* JADX WARN: Code duplicated, block: B:526:0x06ea  */
    /* JADX WARN: Code duplicated, block: B:529:0x06f4  */
    /* JADX WARN: Code duplicated, block: B:530:0x06f8  */
    /* JADX WARN: Code duplicated, block: B:533:0x0702  */
    /* JADX WARN: Code duplicated, block: B:534:0x0706  */
    /* JADX WARN: Code duplicated, block: B:537:0x0710  */
    /* JADX WARN: Code duplicated, block: B:538:0x0714  */
    /* JADX WARN: Code duplicated, block: B:541:0x071e  */
    /* JADX WARN: Code duplicated, block: B:542:0x0722  */
    /* JADX WARN: Code duplicated, block: B:545:0x072c  */
    /* JADX WARN: Code duplicated, block: B:546:0x0730  */
    /* JADX WARN: Code duplicated, block: B:549:0x073a  */
    /* JADX WARN: Code duplicated, block: B:552:0x0744  */
    /* JADX WARN: Code duplicated, block: B:553:0x0747  */
    /* JADX WARN: Code duplicated, block: B:556:0x0751  */
    /* JADX WARN: Code duplicated, block: B:557:0x0754  */
    /* JADX WARN: Code duplicated, block: B:55:0x009d A[Catch: all -> 0x08be, TRY_LEAVE, TryCatch #0 {all -> 0x08be, blocks: (B:7:0x000f, B:9:0x0013, B:11:0x0021, B:664:0x08b9, B:52:0x0092, B:55:0x009d, B:98:0x0118, B:667:0x08c0), top: B:672:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:560:0x075e  */
    /* JADX WARN: Code duplicated, block: B:561:0x0762  */
    /* JADX WARN: Code duplicated, block: B:564:0x076c  */
    /* JADX WARN: Code duplicated, block: B:565:0x0770  */
    /* JADX WARN: Code duplicated, block: B:568:0x077a  */
    /* JADX WARN: Code duplicated, block: B:569:0x077e  */
    /* JADX WARN: Code duplicated, block: B:572:0x0788  */
    /* JADX WARN: Code duplicated, block: B:573:0x078c  */
    /* JADX WARN: Code duplicated, block: B:576:0x0796  */
    /* JADX WARN: Code duplicated, block: B:577:0x079a  */
    /* JADX WARN: Code duplicated, block: B:580:0x07a4  */
    /* JADX WARN: Code duplicated, block: B:581:0x07a8  */
    /* JADX WARN: Code duplicated, block: B:584:0x07b2  */
    /* JADX WARN: Code duplicated, block: B:585:0x07b6  */
    /* JADX WARN: Code duplicated, block: B:588:0x07c0  */
    /* JADX WARN: Code duplicated, block: B:589:0x07c4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:592:0x07ce  */
    /* JADX WARN: Code duplicated, block: B:593:0x07d2  */
    /* JADX WARN: Code duplicated, block: B:596:0x07dc  */
    /* JADX WARN: Code duplicated, block: B:597:0x07e0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:600:0x07ea  */
    /* JADX WARN: Code duplicated, block: B:601:0x07ee  */
    /* JADX WARN: Code duplicated, block: B:604:0x07f8  */
    /* JADX WARN: Code duplicated, block: B:605:0x07fc  */
    /* JADX WARN: Code duplicated, block: B:608:0x0806  */
    /* JADX WARN: Code duplicated, block: B:609:0x080a  */
    /* JADX WARN: Code duplicated, block: B:612:0x0814  */
    /* JADX WARN: Code duplicated, block: B:613:0x0818  */
    /* JADX WARN: Code duplicated, block: B:616:0x0822  */
    /* JADX WARN: Code duplicated, block: B:617:0x0826  */
    /* JADX WARN: Code duplicated, block: B:620:0x0830  */
    /* JADX WARN: Code duplicated, block: B:621:0x0834  */
    /* JADX WARN: Code duplicated, block: B:624:0x083e  */
    /* JADX WARN: Code duplicated, block: B:625:0x0842  */
    /* JADX WARN: Code duplicated, block: B:628:0x084c  */
    /* JADX WARN: Code duplicated, block: B:629:0x084f  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:632:0x0859  */
    /* JADX WARN: Code duplicated, block: B:633:0x085b  */
    /* JADX WARN: Code duplicated, block: B:636:0x0865  */
    /* JADX WARN: Code duplicated, block: B:637:0x0867  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:640:0x0871  */
    /* JADX WARN: Code duplicated, block: B:641:0x0873  */
    /* JADX WARN: Code duplicated, block: B:644:0x087d  */
    /* JADX WARN: Code duplicated, block: B:645:0x087f  */
    /* JADX WARN: Code duplicated, block: B:648:0x0889  */
    /* JADX WARN: Code duplicated, block: B:649:0x088b  */
    /* JADX WARN: Code duplicated, block: B:652:0x0895  */
    /* JADX WARN: Code duplicated, block: B:653:0x0897  */
    /* JADX WARN: Code duplicated, block: B:656:0x08a1  */
    /* JADX WARN: Code duplicated, block: B:657:0x08a3  */
    /* JADX WARN: Code duplicated, block: B:660:0x08ad  */
    /* JADX WARN: Code duplicated, block: B:662:0x08b1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:682:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:683:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:684:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:685:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:686:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:687:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:688:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:689:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:690:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:691:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:692:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:693:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:694:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:695:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:696:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:697:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:698:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:699:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:700:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:701:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:702:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:703:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:704:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:705:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:706:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:707:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:708:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:709:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:710:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:711:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:712:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:713:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:714:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:715:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:716:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:717:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:718:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:719:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:720:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:721:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:722:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:723:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:724:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:725:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:726:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:727:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:728:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:729:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:730:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:731:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:732:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:733:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:734:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:735:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:736:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:737:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:738:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:739:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:740:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:741:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:742:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:743:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:744:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:745:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:746:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:747:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:748:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:749:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:750:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:751:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:752:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:753:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:754:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:755:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:756:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:757:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:758:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:759:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00db  */
    /* JADX WARN: Code duplicated, block: B:760:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:761:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:762:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:763:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:764:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:765:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:766:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:767:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:768:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:769:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:770:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:771:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:772:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:773:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:774:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:775:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:776:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:777:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:778:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:779:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:780:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:781:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:782:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:783:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:784:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:785:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:786:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:787:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:788:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:789:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:790:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:791:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:792:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:793:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:794:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:795:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:796:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:797:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:798:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:799:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:800:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:801:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:802:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:803:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:804:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:805:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:806:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:807:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:808:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:809:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:810:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:811:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:812:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:813:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:814:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:815:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:816:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:817:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:818:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:819:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:820:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:821:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:822:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:823:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:824:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:825:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:826:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:827:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:828:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:829:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:830:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:90:0x0105  */
    /* JADX WARN: Code duplicated, block: B:91:0x0107  */
    /* JADX WARN: Code duplicated, block: B:94:0x0110  */
    /* JADX WARN: Code duplicated, block: B:96:0x0114  */
    /* JADX WARN: Code duplicated, block: B:98:0x0118 A[Catch: all -> 0x08be, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x08be, blocks: (B:7:0x000f, B:9:0x0013, B:11:0x0021, B:664:0x08b9, B:52:0x0092, B:55:0x009d, B:98:0x0118, B:667:0x08c0), top: B:672:0x000f }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static boolean s0(String str) {
        String str2;
        byte b10;
        String str3;
        byte b11;
        boolean z5 = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (i.class) {
            try {
                if (!L1) {
                    int i7 = e0.f13788a;
                    byte b12 = 28;
                    if (i7 <= 28) {
                        String str4 = e0.f13789b;
                        str4.getClass();
                        switch (str4.hashCode()) {
                            case -1339091551:
                                b11 = !str4.equals("dangal") ? (byte) -1 : (byte) 0;
                                break;
                            case -1220081023:
                                b11 = !str4.equals("dangalFHD") ? (byte) -1 : (byte) 1;
                                break;
                            case -1220066608:
                                b11 = !str4.equals("dangalUHD") ? (byte) -1 : (byte) 2;
                                break;
                            case -1012436106:
                                b11 = !str4.equals("oneday") ? (byte) -1 : (byte) 3;
                                break;
                            case -760312546:
                                b11 = !str4.equals("aquaman") ? (byte) -1 : (byte) 4;
                                break;
                            case -64886864:
                                b11 = !str4.equals("magnolia") ? (byte) -1 : (byte) 5;
                                break;
                            case 3415681:
                                b11 = !str4.equals("once") ? (byte) -1 : (byte) 6;
                                break;
                            case 825323514:
                                b11 = !str4.equals("machuca") ? (byte) -1 : (byte) 7;
                                break;
                            default:
                                b11 = -1;
                                break;
                        }
                        switch (b11) {
                            default:
                                if (i7 <= 27 || !"HWEML".equals(e0.f13789b)) {
                                    str2 = e0.f13791d;
                                    str2.getClass();
                                    switch (str2.hashCode()) {
                                        case -349662828:
                                            if (!str2.equals("AFTJMST12")) {
                                                b10 = 0;
                                            } else {
                                                b10 = -1;
                                            }
                                            break;
                                        case -321033677:
                                            if (!str2.equals("AFTKMST12")) {
                                                b10 = 1;
                                            } else {
                                                b10 = -1;
                                            }
                                            break;
                                        case 2006354:
                                            if (!str2.equals("AFTA")) {
                                                b10 = 2;
                                            } else {
                                                b10 = -1;
                                            }
                                            break;
                                        case 2006367:
                                            if (!str2.equals("AFTN")) {
                                                b10 = 3;
                                            } else {
                                                b10 = -1;
                                            }
                                            break;
                                        case 2006371:
                                            if (!str2.equals("AFTR")) {
                                                b10 = 4;
                                            } else {
                                                b10 = -1;
                                            }
                                            break;
                                        case 1785421873:
                                            if (!str2.equals("AFTEU011")) {
                                                b10 = 5;
                                            } else {
                                                b10 = -1;
                                            }
                                            break;
                                        case 1785421876:
                                            if (!str2.equals("AFTEU014")) {
                                                b10 = 6;
                                            } else {
                                                b10 = -1;
                                            }
                                            break;
                                        case 1798172390:
                                            if (!str2.equals("AFTSO001")) {
                                                b10 = 7;
                                            } else {
                                                b10 = -1;
                                            }
                                            break;
                                        case 2119412532:
                                            if (!str2.equals("AFTEUFF014")) {
                                                b10 = 8;
                                            } else {
                                                b10 = -1;
                                            }
                                            break;
                                        default:
                                            b10 = -1;
                                            break;
                                    }
                                    switch (b10) {
                                        default:
                                            if (i7 <= 26) {
                                                str3 = e0.f13789b;
                                                str3.getClass();
                                                switch (str3.hashCode()) {
                                                    case -2144781245:
                                                        if (!str3.equals("GIONEE_SWW1609")) {
                                                            b12 = 0;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -2144781185:
                                                        if (!str3.equals("GIONEE_SWW1627")) {
                                                            b12 = 1;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -2144781160:
                                                        if (!str3.equals("GIONEE_SWW1631")) {
                                                            b12 = 2;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -2097309513:
                                                        if (!str3.equals("K50a40")) {
                                                            b12 = 3;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -2022874474:
                                                        if (!str3.equals("CP8676_I02")) {
                                                            b12 = 4;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1978993182:
                                                        if (!str3.equals("NX541J")) {
                                                            b12 = 5;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1978990237:
                                                        if (!str3.equals("NX573J")) {
                                                            b12 = 6;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1936688988:
                                                        if (!str3.equals("PGN528")) {
                                                            b12 = 7;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1936688066:
                                                        if (!str3.equals("PGN610")) {
                                                            b12 = 8;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1936688065:
                                                        if (!str3.equals("PGN611")) {
                                                            b12 = 9;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1931988508:
                                                        if (!str3.equals("AquaPowerM")) {
                                                            b12 = 10;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1885099851:
                                                        if (!str3.equals("RAIJIN")) {
                                                            b12 = 11;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1696512866:
                                                        if (!str3.equals("XT1663")) {
                                                            b12 = 12;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1680025915:
                                                        if (!str3.equals("ComioS1")) {
                                                            b12 = 13;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1615810839:
                                                        if (!str3.equals("Phantom6")) {
                                                            b12 = 14;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1600724499:
                                                        if (!str3.equals("pacificrim")) {
                                                            b12 = 15;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1554255044:
                                                        if (!str3.equals("vernee_M5")) {
                                                            b12 = 16;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1481772737:
                                                        if (!str3.equals("panell_dl")) {
                                                            b12 = 17;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1481772730:
                                                        if (!str3.equals("panell_ds")) {
                                                            b12 = 18;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1481772729:
                                                        if (!str3.equals("panell_dt")) {
                                                            b12 = 19;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1320080169:
                                                        if (!str3.equals("GiONEE_GBL7319")) {
                                                            b12 = 20;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1217592143:
                                                        if (!str3.equals("BRAVIA_ATV2")) {
                                                            b12 = 21;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1180384755:
                                                        if (!str3.equals("iris60")) {
                                                            b12 = 22;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1139198265:
                                                        if (!str3.equals("Slate_Pro")) {
                                                            b12 = 23;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1052835013:
                                                        if (!str3.equals("namath")) {
                                                            b12 = 24;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -993250464:
                                                        if (!str3.equals("A10-70F")) {
                                                            b12 = 25;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -993250458:
                                                        if (!str3.equals("A10-70L")) {
                                                            b12 = 26;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -965403638:
                                                        if (!str3.equals("s905x018")) {
                                                            b12 = 27;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -958336948:
                                                        if (!str3.equals("ELUGA_Ray_X")) {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -879245230:
                                                        if (!str3.equals("tcl_eu")) {
                                                            b12 = 29;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -842500323:
                                                        if (!str3.equals("nicklaus_f")) {
                                                            b12 = 30;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -821392978:
                                                        if (!str3.equals("A7000-a")) {
                                                            b12 = 31;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -797483286:
                                                        if (!str3.equals("SVP-DTV15")) {
                                                            b12 = 32;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -794946968:
                                                        if (!str3.equals("watson")) {
                                                            b12 = 33;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -788334647:
                                                        if (!str3.equals("whyred")) {
                                                            b12 = 34;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -782144577:
                                                        if (!str3.equals("OnePlus5T")) {
                                                            b12 = 35;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -575125681:
                                                        if (!str3.equals("GiONEE_CBL7513")) {
                                                            b12 = 36;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -521118391:
                                                        if (!str3.equals("GIONEE_GBL7360")) {
                                                            b12 = 37;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -430914369:
                                                        if (!str3.equals("Pixi4-7_3G")) {
                                                            b12 = 38;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -290434366:
                                                        if (!str3.equals("taido_row")) {
                                                            b12 = 39;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -282781963:
                                                        if (!str3.equals("BLACK-1X")) {
                                                            b12 = 40;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -277133239:
                                                        if (!str3.equals("Z12_PRO")) {
                                                            b12 = 41;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -173639913:
                                                        if (!str3.equals("ELUGA_A3_Pro")) {
                                                            b12 = 42;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -56598463:
                                                        if (!str3.equals("woods_fn")) {
                                                            b12 = 43;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2126:
                                                        if (!str3.equals("C1")) {
                                                            b12 = 44;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2564:
                                                        if (!str3.equals("Q5")) {
                                                            b12 = 45;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2715:
                                                        if (!str3.equals("V1")) {
                                                            b12 = 46;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2719:
                                                        if (!str3.equals("V5")) {
                                                            b12 = 47;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 3091:
                                                        if (!str3.equals("b5")) {
                                                            b12 = 48;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 3483:
                                                        if (!str3.equals("mh")) {
                                                            b12 = 49;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 73405:
                                                        if (!str3.equals("JGZ")) {
                                                            b12 = 50;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 75537:
                                                        if (!str3.equals("M04")) {
                                                            b12 = 51;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 75739:
                                                        if (!str3.equals("M5c")) {
                                                            b12 = 52;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 76779:
                                                        if (!str3.equals("MX6")) {
                                                            b12 = 53;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 78669:
                                                        if (!str3.equals("P85")) {
                                                            b12 = 54;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 79305:
                                                        if (!str3.equals("PLE")) {
                                                            b12 = 55;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 80618:
                                                        if (!str3.equals("QX1")) {
                                                            b12 = 56;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 88274:
                                                        if (!str3.equals("Z80")) {
                                                            b12 = 57;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 98846:
                                                        if (!str3.equals("cv1")) {
                                                            b12 = 58;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 98848:
                                                        if (!str3.equals("cv3")) {
                                                            b12 = 59;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 99329:
                                                        if (!str3.equals("deb")) {
                                                            b12 = 60;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 101481:
                                                        if (!str3.equals("flo")) {
                                                            b12 = 61;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 1513190:
                                                        if (!str3.equals("1601")) {
                                                            b12 = 62;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 1514184:
                                                        if (!str3.equals("1713")) {
                                                            b12 = 63;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 1514185:
                                                        if (!str3.equals("1714")) {
                                                            b12 = 64;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2133089:
                                                        if (!str3.equals("F01H")) {
                                                            b12 = 65;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2133091:
                                                        if (!str3.equals("F01J")) {
                                                            b12 = 66;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2133120:
                                                        if (!str3.equals("F02H")) {
                                                            b12 = 67;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2133151:
                                                        if (!str3.equals("F03H")) {
                                                            b12 = 68;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2133182:
                                                        if (!str3.equals("F04H")) {
                                                            b12 = 69;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2133184:
                                                        if (!str3.equals("F04J")) {
                                                            b12 = 70;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2436959:
                                                        if (!str3.equals("P681")) {
                                                            b12 = 71;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2463773:
                                                        if (!str3.equals("Q350")) {
                                                            b12 = 72;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2464648:
                                                        if (!str3.equals("Q427")) {
                                                            b12 = 73;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2689555:
                                                        if (!str3.equals("XE2X")) {
                                                            b12 = 74;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 3154429:
                                                        if (!str3.equals("fugu")) {
                                                            b12 = 75;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 3284551:
                                                        if (!str3.equals("kate")) {
                                                            b12 = 76;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 3351335:
                                                        if (!str3.equals("mido")) {
                                                            b12 = 77;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 3386211:
                                                        if (!str3.equals("p212")) {
                                                            b12 = 78;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 41325051:
                                                        if (!str3.equals("MEIZU_M5")) {
                                                            b12 = 79;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 51349633:
                                                        if (!str3.equals("601LV")) {
                                                            b12 = 80;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 51350594:
                                                        if (!str3.equals("602LV")) {
                                                            b12 = 81;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 55178625:
                                                        if (!str3.equals("Aura_Note_2")) {
                                                            b12 = 82;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 61542055:
                                                        if (!str3.equals("A1601")) {
                                                            b12 = 83;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 65355429:
                                                        if (!str3.equals("E5643")) {
                                                            b12 = 84;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 66214468:
                                                        if (!str3.equals("F3111")) {
                                                            b12 = 85;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 66214470:
                                                        if (!str3.equals("F3113")) {
                                                            b12 = 86;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 66214473:
                                                        if (!str3.equals("F3116")) {
                                                            b12 = 87;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 66215429:
                                                        if (!str3.equals("F3211")) {
                                                            b12 = 88;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 66215431:
                                                        if (!str3.equals("F3213")) {
                                                            b12 = 89;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 66215433:
                                                        if (!str3.equals("F3215")) {
                                                            b12 = 90;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 66216390:
                                                        if (!str3.equals("F3311")) {
                                                            b12 = 91;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 76402249:
                                                        if (!str3.equals("PRO7S")) {
                                                            b12 = 92;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 76404105:
                                                        if (!str3.equals("Q4260")) {
                                                            b12 = 93;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 76404911:
                                                        if (!str3.equals("Q4310")) {
                                                            b12 = 94;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 80963634:
                                                        if (!str3.equals("V23GB")) {
                                                            b12 = 95;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 82882791:
                                                        if (!str3.equals("X3_HK")) {
                                                            b12 = 96;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 98715550:
                                                        if (!str3.equals("i9031")) {
                                                            b12 = 97;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 101370885:
                                                        if (!str3.equals("l5460")) {
                                                            b12 = 98;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 102844228:
                                                        if (!str3.equals("le_x6")) {
                                                            b12 = 99;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 165221241:
                                                        if (!str3.equals("A2016a40")) {
                                                            b12 = 100;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 182191441:
                                                        if (!str3.equals("CPY83_I00")) {
                                                            b12 = 101;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 245388979:
                                                        if (!str3.equals("marino_f")) {
                                                            b12 = 102;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 287431619:
                                                        if (!str3.equals("griffin")) {
                                                            b12 = 103;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 307593612:
                                                        if (!str3.equals("A7010a48")) {
                                                            b12 = 104;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 308517133:
                                                        if (!str3.equals("A7020a48")) {
                                                            b12 = 105;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 316215098:
                                                        if (!str3.equals("TB3-730F")) {
                                                            b12 = 106;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 316215116:
                                                        if (!str3.equals("TB3-730X")) {
                                                            b12 = 107;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 316246811:
                                                        if (!str3.equals("TB3-850F")) {
                                                            b12 = 108;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 316246818:
                                                        if (!str3.equals("TB3-850M")) {
                                                            b12 = 109;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 407160593:
                                                        if (!str3.equals("Pixi5-10_4G")) {
                                                            b12 = 110;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 507412548:
                                                        if (!str3.equals("QM16XE_U")) {
                                                            b12 = 111;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 793982701:
                                                        if (!str3.equals("GIONEE_WBL5708")) {
                                                            b12 = 112;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 794038622:
                                                        if (!str3.equals("GIONEE_WBL7365")) {
                                                            b12 = 113;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 794040393:
                                                        if (!str3.equals("GIONEE_WBL7519")) {
                                                            b12 = 114;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 835649806:
                                                        if (!str3.equals("manning")) {
                                                            b12 = 115;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 917340916:
                                                        if (!str3.equals("A7000plus")) {
                                                            b12 = 116;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 958008161:
                                                        if (!str3.equals("j2xlteins")) {
                                                            b12 = 117;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 1060579533:
                                                        if (!str3.equals("panell_d")) {
                                                            b12 = 118;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 1150207623:
                                                        if (!str3.equals("LS-5017")) {
                                                            b12 = 119;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 1176899427:
                                                        if (!str3.equals("itel_S41")) {
                                                            b12 = 120;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 1280332038:
                                                        if (!str3.equals("hwALE-H")) {
                                                            b12 = 121;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 1306947716:
                                                        if (!str3.equals("EverStar_S")) {
                                                            b12 = 122;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 1349174697:
                                                        if (!str3.equals("htc_e56ml_dtul")) {
                                                            b12 = 123;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 1522194893:
                                                        if (!str3.equals("woods_f")) {
                                                            b12 = 124;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 1691543273:
                                                        if (!str3.equals("CPH1609")) {
                                                            b12 = 125;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 1691544261:
                                                        if (!str3.equals("CPH1715")) {
                                                            b12 = 126;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 1709443163:
                                                        if (!str3.equals("iball8735_9806")) {
                                                            b12 = ByteCompanionObject.MAX_VALUE;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 1865889110:
                                                        if (!str3.equals("santoni")) {
                                                            b12 = ByteCompanionObject.MIN_VALUE;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 1906253259:
                                                        if (!str3.equals("PB2-670M")) {
                                                            b12 = 129;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 1977196784:
                                                        if (!str3.equals("Infinix-X572")) {
                                                            b12 = 130;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2006372676:
                                                        if (!str3.equals("BRAVIA_ATV3_4K")) {
                                                            b12 = 131;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2019281702:
                                                        if (!str3.equals("DM-01K")) {
                                                            b12 = 132;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2029784656:
                                                        if (!str3.equals("HWBLN-H")) {
                                                            b12 = 133;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2030379515:
                                                        if (!str3.equals("HWCAM-H")) {
                                                            b12 = 134;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2033393791:
                                                        if (!str3.equals("ASUS_X00AD_2")) {
                                                            b12 = 135;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2047190025:
                                                        if (!str3.equals("ELUGA_Note")) {
                                                            b12 = 136;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2047252157:
                                                        if (!str3.equals("ELUGA_Prim")) {
                                                            b12 = 137;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2048319463:
                                                        if (!str3.equals("HWVNS-H")) {
                                                            b12 = 138;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2048855701:
                                                        if (!str3.equals("HWWAS-H")) {
                                                            b12 = 139;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    default:
                                                        b12 = -1;
                                                        break;
                                                }
                                                switch (b12) {
                                                    default:
                                                        if (str2.equals("JSN-L21")) {
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
                                                    case 16:
                                                    case 17:
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
                                                    case ChatViewRecyclerTypes.REACTION_ADD_REACTION /* 47 */:
                                                    case 48:
                                                    case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_IMAGE /* 49 */:
                                                    case 50:
                                                    case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_VISUAL_PLACEHOLDER /* 51 */:
                                                    case ChatViewRecyclerTypes.REFERRAL /* 52 */:
                                                    case ChatViewRecyclerTypes.GUILD_PROFILE_INVITE /* 53 */:
                                                    case ChatViewRecyclerTypes.APP_MESSAGE_EMBED /* 54 */:
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
                                                    case 68:
                                                    case 69:
                                                    case 70:
                                                    case 71:
                                                    case 72:
                                                    case 73:
                                                    case 74:
                                                    case 75:
                                                    case 76:
                                                    case 77:
                                                    case 78:
                                                    case 79:
                                                    case 80:
                                                    case 81:
                                                    case 82:
                                                    case 83:
                                                    case 84:
                                                    case 85:
                                                    case BuildConfig.REACT_NATIVE_MINOR_VERSION /* 86 */:
                                                    case 87:
                                                    case 88:
                                                    case 89:
                                                    case 90:
                                                    case 91:
                                                    case 92:
                                                    case 93:
                                                    case 94:
                                                    case 95:
                                                    case 96:
                                                    case 97:
                                                    case 98:
                                                    case 99:
                                                    case 100:
                                                    case 101:
                                                    case 102:
                                                    case 103:
                                                    case 104:
                                                    case 105:
                                                    case 106:
                                                    case 107:
                                                    case 108:
                                                    case 109:
                                                    case 110:
                                                    case 111:
                                                    case 112:
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
                                                    case 135:
                                                    case 136:
                                                    case 137:
                                                    case 138:
                                                    case 139:
                                                        z5 = true;
                                                        break;
                                                }
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
                                            z5 = true;
                                            break;
                                    }
                                }
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                z5 = true;
                                break;
                        }
                    } else if (i7 <= 27) {
                        str2 = e0.f13791d;
                        str2.getClass();
                        switch (str2.hashCode()) {
                            case -349662828:
                                if (!str2.equals("AFTJMST12")) {
                                    b10 = 0;
                                } else {
                                    b10 = -1;
                                }
                                break;
                            case -321033677:
                                if (!str2.equals("AFTKMST12")) {
                                    b10 = 1;
                                } else {
                                    b10 = -1;
                                }
                                break;
                            case 2006354:
                                if (!str2.equals("AFTA")) {
                                    b10 = 2;
                                } else {
                                    b10 = -1;
                                }
                                break;
                            case 2006367:
                                if (!str2.equals("AFTN")) {
                                    b10 = 3;
                                } else {
                                    b10 = -1;
                                }
                                break;
                            case 2006371:
                                if (!str2.equals("AFTR")) {
                                    b10 = 4;
                                } else {
                                    b10 = -1;
                                }
                                break;
                            case 1785421873:
                                if (!str2.equals("AFTEU011")) {
                                    b10 = 5;
                                } else {
                                    b10 = -1;
                                }
                                break;
                            case 1785421876:
                                if (!str2.equals("AFTEU014")) {
                                    b10 = 6;
                                } else {
                                    b10 = -1;
                                }
                                break;
                            case 1798172390:
                                if (!str2.equals("AFTSO001")) {
                                    b10 = 7;
                                } else {
                                    b10 = -1;
                                }
                                break;
                            case 2119412532:
                                if (!str2.equals("AFTEUFF014")) {
                                    b10 = 8;
                                } else {
                                    b10 = -1;
                                }
                                break;
                            default:
                                b10 = -1;
                                break;
                        }
                        switch (b10) {
                            default:
                                if (i7 <= 26) {
                                    str3 = e0.f13789b;
                                    str3.getClass();
                                    switch (str3.hashCode()) {
                                        case -2144781245:
                                            if (!str3.equals("GIONEE_SWW1609")) {
                                                b12 = 0;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -2144781185:
                                            if (!str3.equals("GIONEE_SWW1627")) {
                                                b12 = 1;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -2144781160:
                                            if (!str3.equals("GIONEE_SWW1631")) {
                                                b12 = 2;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -2097309513:
                                            if (!str3.equals("K50a40")) {
                                                b12 = 3;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -2022874474:
                                            if (!str3.equals("CP8676_I02")) {
                                                b12 = 4;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1978993182:
                                            if (!str3.equals("NX541J")) {
                                                b12 = 5;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1978990237:
                                            if (!str3.equals("NX573J")) {
                                                b12 = 6;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1936688988:
                                            if (!str3.equals("PGN528")) {
                                                b12 = 7;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1936688066:
                                            if (!str3.equals("PGN610")) {
                                                b12 = 8;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1936688065:
                                            if (!str3.equals("PGN611")) {
                                                b12 = 9;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1931988508:
                                            if (!str3.equals("AquaPowerM")) {
                                                b12 = 10;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1885099851:
                                            if (!str3.equals("RAIJIN")) {
                                                b12 = 11;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1696512866:
                                            if (!str3.equals("XT1663")) {
                                                b12 = 12;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1680025915:
                                            if (!str3.equals("ComioS1")) {
                                                b12 = 13;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1615810839:
                                            if (!str3.equals("Phantom6")) {
                                                b12 = 14;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1600724499:
                                            if (!str3.equals("pacificrim")) {
                                                b12 = 15;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1554255044:
                                            if (!str3.equals("vernee_M5")) {
                                                b12 = 16;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1481772737:
                                            if (!str3.equals("panell_dl")) {
                                                b12 = 17;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1481772730:
                                            if (!str3.equals("panell_ds")) {
                                                b12 = 18;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1481772729:
                                            if (!str3.equals("panell_dt")) {
                                                b12 = 19;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1320080169:
                                            if (!str3.equals("GiONEE_GBL7319")) {
                                                b12 = 20;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1217592143:
                                            if (!str3.equals("BRAVIA_ATV2")) {
                                                b12 = 21;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1180384755:
                                            if (!str3.equals("iris60")) {
                                                b12 = 22;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1139198265:
                                            if (!str3.equals("Slate_Pro")) {
                                                b12 = 23;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1052835013:
                                            if (!str3.equals("namath")) {
                                                b12 = 24;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -993250464:
                                            if (!str3.equals("A10-70F")) {
                                                b12 = 25;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -993250458:
                                            if (!str3.equals("A10-70L")) {
                                                b12 = 26;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -965403638:
                                            if (!str3.equals("s905x018")) {
                                                b12 = 27;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -958336948:
                                            if (!str3.equals("ELUGA_Ray_X")) {
                                                b12 = -1;
                                            }
                                            break;
                                        case -879245230:
                                            if (!str3.equals("tcl_eu")) {
                                                b12 = 29;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -842500323:
                                            if (!str3.equals("nicklaus_f")) {
                                                b12 = 30;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -821392978:
                                            if (!str3.equals("A7000-a")) {
                                                b12 = 31;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -797483286:
                                            if (!str3.equals("SVP-DTV15")) {
                                                b12 = 32;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -794946968:
                                            if (!str3.equals("watson")) {
                                                b12 = 33;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -788334647:
                                            if (!str3.equals("whyred")) {
                                                b12 = 34;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -782144577:
                                            if (!str3.equals("OnePlus5T")) {
                                                b12 = 35;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -575125681:
                                            if (!str3.equals("GiONEE_CBL7513")) {
                                                b12 = 36;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -521118391:
                                            if (!str3.equals("GIONEE_GBL7360")) {
                                                b12 = 37;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -430914369:
                                            if (!str3.equals("Pixi4-7_3G")) {
                                                b12 = 38;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -290434366:
                                            if (!str3.equals("taido_row")) {
                                                b12 = 39;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -282781963:
                                            if (!str3.equals("BLACK-1X")) {
                                                b12 = 40;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -277133239:
                                            if (!str3.equals("Z12_PRO")) {
                                                b12 = 41;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -173639913:
                                            if (!str3.equals("ELUGA_A3_Pro")) {
                                                b12 = 42;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -56598463:
                                            if (!str3.equals("woods_fn")) {
                                                b12 = 43;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2126:
                                            if (!str3.equals("C1")) {
                                                b12 = 44;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2564:
                                            if (!str3.equals("Q5")) {
                                                b12 = 45;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2715:
                                            if (!str3.equals("V1")) {
                                                b12 = 46;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2719:
                                            if (!str3.equals("V5")) {
                                                b12 = 47;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 3091:
                                            if (!str3.equals("b5")) {
                                                b12 = 48;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 3483:
                                            if (!str3.equals("mh")) {
                                                b12 = 49;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 73405:
                                            if (!str3.equals("JGZ")) {
                                                b12 = 50;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 75537:
                                            if (!str3.equals("M04")) {
                                                b12 = 51;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 75739:
                                            if (!str3.equals("M5c")) {
                                                b12 = 52;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 76779:
                                            if (!str3.equals("MX6")) {
                                                b12 = 53;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 78669:
                                            if (!str3.equals("P85")) {
                                                b12 = 54;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 79305:
                                            if (!str3.equals("PLE")) {
                                                b12 = 55;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 80618:
                                            if (!str3.equals("QX1")) {
                                                b12 = 56;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 88274:
                                            if (!str3.equals("Z80")) {
                                                b12 = 57;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 98846:
                                            if (!str3.equals("cv1")) {
                                                b12 = 58;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 98848:
                                            if (!str3.equals("cv3")) {
                                                b12 = 59;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 99329:
                                            if (!str3.equals("deb")) {
                                                b12 = 60;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 101481:
                                            if (!str3.equals("flo")) {
                                                b12 = 61;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 1513190:
                                            if (!str3.equals("1601")) {
                                                b12 = 62;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 1514184:
                                            if (!str3.equals("1713")) {
                                                b12 = 63;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 1514185:
                                            if (!str3.equals("1714")) {
                                                b12 = 64;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2133089:
                                            if (!str3.equals("F01H")) {
                                                b12 = 65;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2133091:
                                            if (!str3.equals("F01J")) {
                                                b12 = 66;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2133120:
                                            if (!str3.equals("F02H")) {
                                                b12 = 67;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2133151:
                                            if (!str3.equals("F03H")) {
                                                b12 = 68;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2133182:
                                            if (!str3.equals("F04H")) {
                                                b12 = 69;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2133184:
                                            if (!str3.equals("F04J")) {
                                                b12 = 70;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2436959:
                                            if (!str3.equals("P681")) {
                                                b12 = 71;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2463773:
                                            if (!str3.equals("Q350")) {
                                                b12 = 72;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2464648:
                                            if (!str3.equals("Q427")) {
                                                b12 = 73;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2689555:
                                            if (!str3.equals("XE2X")) {
                                                b12 = 74;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 3154429:
                                            if (!str3.equals("fugu")) {
                                                b12 = 75;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 3284551:
                                            if (!str3.equals("kate")) {
                                                b12 = 76;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 3351335:
                                            if (!str3.equals("mido")) {
                                                b12 = 77;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 3386211:
                                            if (!str3.equals("p212")) {
                                                b12 = 78;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 41325051:
                                            if (!str3.equals("MEIZU_M5")) {
                                                b12 = 79;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 51349633:
                                            if (!str3.equals("601LV")) {
                                                b12 = 80;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 51350594:
                                            if (!str3.equals("602LV")) {
                                                b12 = 81;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 55178625:
                                            if (!str3.equals("Aura_Note_2")) {
                                                b12 = 82;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 61542055:
                                            if (!str3.equals("A1601")) {
                                                b12 = 83;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 65355429:
                                            if (!str3.equals("E5643")) {
                                                b12 = 84;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 66214468:
                                            if (!str3.equals("F3111")) {
                                                b12 = 85;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 66214470:
                                            if (!str3.equals("F3113")) {
                                                b12 = 86;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 66214473:
                                            if (!str3.equals("F3116")) {
                                                b12 = 87;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 66215429:
                                            if (!str3.equals("F3211")) {
                                                b12 = 88;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 66215431:
                                            if (!str3.equals("F3213")) {
                                                b12 = 89;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 66215433:
                                            if (!str3.equals("F3215")) {
                                                b12 = 90;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 66216390:
                                            if (!str3.equals("F3311")) {
                                                b12 = 91;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 76402249:
                                            if (!str3.equals("PRO7S")) {
                                                b12 = 92;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 76404105:
                                            if (!str3.equals("Q4260")) {
                                                b12 = 93;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 76404911:
                                            if (!str3.equals("Q4310")) {
                                                b12 = 94;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 80963634:
                                            if (!str3.equals("V23GB")) {
                                                b12 = 95;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 82882791:
                                            if (!str3.equals("X3_HK")) {
                                                b12 = 96;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 98715550:
                                            if (!str3.equals("i9031")) {
                                                b12 = 97;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 101370885:
                                            if (!str3.equals("l5460")) {
                                                b12 = 98;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 102844228:
                                            if (!str3.equals("le_x6")) {
                                                b12 = 99;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 165221241:
                                            if (!str3.equals("A2016a40")) {
                                                b12 = 100;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 182191441:
                                            if (!str3.equals("CPY83_I00")) {
                                                b12 = 101;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 245388979:
                                            if (!str3.equals("marino_f")) {
                                                b12 = 102;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 287431619:
                                            if (!str3.equals("griffin")) {
                                                b12 = 103;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 307593612:
                                            if (!str3.equals("A7010a48")) {
                                                b12 = 104;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 308517133:
                                            if (!str3.equals("A7020a48")) {
                                                b12 = 105;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 316215098:
                                            if (!str3.equals("TB3-730F")) {
                                                b12 = 106;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 316215116:
                                            if (!str3.equals("TB3-730X")) {
                                                b12 = 107;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 316246811:
                                            if (!str3.equals("TB3-850F")) {
                                                b12 = 108;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 316246818:
                                            if (!str3.equals("TB3-850M")) {
                                                b12 = 109;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 407160593:
                                            if (!str3.equals("Pixi5-10_4G")) {
                                                b12 = 110;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 507412548:
                                            if (!str3.equals("QM16XE_U")) {
                                                b12 = 111;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 793982701:
                                            if (!str3.equals("GIONEE_WBL5708")) {
                                                b12 = 112;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 794038622:
                                            if (!str3.equals("GIONEE_WBL7365")) {
                                                b12 = 113;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 794040393:
                                            if (!str3.equals("GIONEE_WBL7519")) {
                                                b12 = 114;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 835649806:
                                            if (!str3.equals("manning")) {
                                                b12 = 115;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 917340916:
                                            if (!str3.equals("A7000plus")) {
                                                b12 = 116;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 958008161:
                                            if (!str3.equals("j2xlteins")) {
                                                b12 = 117;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 1060579533:
                                            if (!str3.equals("panell_d")) {
                                                b12 = 118;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 1150207623:
                                            if (!str3.equals("LS-5017")) {
                                                b12 = 119;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 1176899427:
                                            if (!str3.equals("itel_S41")) {
                                                b12 = 120;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 1280332038:
                                            if (!str3.equals("hwALE-H")) {
                                                b12 = 121;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 1306947716:
                                            if (!str3.equals("EverStar_S")) {
                                                b12 = 122;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 1349174697:
                                            if (!str3.equals("htc_e56ml_dtul")) {
                                                b12 = 123;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 1522194893:
                                            if (!str3.equals("woods_f")) {
                                                b12 = 124;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 1691543273:
                                            if (!str3.equals("CPH1609")) {
                                                b12 = 125;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 1691544261:
                                            if (!str3.equals("CPH1715")) {
                                                b12 = 126;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 1709443163:
                                            if (!str3.equals("iball8735_9806")) {
                                                b12 = ByteCompanionObject.MAX_VALUE;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 1865889110:
                                            if (!str3.equals("santoni")) {
                                                b12 = ByteCompanionObject.MIN_VALUE;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 1906253259:
                                            if (!str3.equals("PB2-670M")) {
                                                b12 = 129;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 1977196784:
                                            if (!str3.equals("Infinix-X572")) {
                                                b12 = 130;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2006372676:
                                            if (!str3.equals("BRAVIA_ATV3_4K")) {
                                                b12 = 131;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2019281702:
                                            if (!str3.equals("DM-01K")) {
                                                b12 = 132;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2029784656:
                                            if (!str3.equals("HWBLN-H")) {
                                                b12 = 133;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2030379515:
                                            if (!str3.equals("HWCAM-H")) {
                                                b12 = 134;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2033393791:
                                            if (!str3.equals("ASUS_X00AD_2")) {
                                                b12 = 135;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2047190025:
                                            if (!str3.equals("ELUGA_Note")) {
                                                b12 = 136;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2047252157:
                                            if (!str3.equals("ELUGA_Prim")) {
                                                b12 = 137;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2048319463:
                                            if (!str3.equals("HWVNS-H")) {
                                                b12 = 138;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2048855701:
                                            if (!str3.equals("HWWAS-H")) {
                                                b12 = 139;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        default:
                                            b12 = -1;
                                            break;
                                    }
                                    switch (b12) {
                                        default:
                                            if (str2.equals("JSN-L21")) {
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
                                        case 16:
                                        case 17:
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
                                        case ChatViewRecyclerTypes.REACTION_ADD_REACTION /* 47 */:
                                        case 48:
                                        case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_IMAGE /* 49 */:
                                        case 50:
                                        case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_VISUAL_PLACEHOLDER /* 51 */:
                                        case ChatViewRecyclerTypes.REFERRAL /* 52 */:
                                        case ChatViewRecyclerTypes.GUILD_PROFILE_INVITE /* 53 */:
                                        case ChatViewRecyclerTypes.APP_MESSAGE_EMBED /* 54 */:
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
                                        case 68:
                                        case 69:
                                        case 70:
                                        case 71:
                                        case 72:
                                        case 73:
                                        case 74:
                                        case 75:
                                        case 76:
                                        case 77:
                                        case 78:
                                        case 79:
                                        case 80:
                                        case 81:
                                        case 82:
                                        case 83:
                                        case 84:
                                        case 85:
                                        case BuildConfig.REACT_NATIVE_MINOR_VERSION /* 86 */:
                                        case 87:
                                        case 88:
                                        case 89:
                                        case 90:
                                        case 91:
                                        case 92:
                                        case 93:
                                        case 94:
                                        case 95:
                                        case 96:
                                        case 97:
                                        case 98:
                                        case 99:
                                        case 100:
                                        case 101:
                                        case 102:
                                        case 103:
                                        case 104:
                                        case 105:
                                        case 106:
                                        case 107:
                                        case 108:
                                        case 109:
                                        case 110:
                                        case 111:
                                        case 112:
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
                                        case 135:
                                        case 136:
                                        case 137:
                                        case 138:
                                        case 139:
                                            z5 = true;
                                            break;
                                    }
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
                                z5 = true;
                                break;
                        }
                    } else {
                        str2 = e0.f13791d;
                        str2.getClass();
                        switch (str2.hashCode()) {
                            case -349662828:
                                if (!str2.equals("AFTJMST12")) {
                                    b10 = -1;
                                } else {
                                    b10 = 0;
                                }
                                break;
                            case -321033677:
                                if (!str2.equals("AFTKMST12")) {
                                    b10 = -1;
                                } else {
                                    b10 = 1;
                                }
                                break;
                            case 2006354:
                                if (!str2.equals("AFTA")) {
                                    b10 = -1;
                                } else {
                                    b10 = 2;
                                }
                                break;
                            case 2006367:
                                if (!str2.equals("AFTN")) {
                                    b10 = -1;
                                } else {
                                    b10 = 3;
                                }
                                break;
                            case 2006371:
                                if (!str2.equals("AFTR")) {
                                    b10 = -1;
                                } else {
                                    b10 = 4;
                                }
                                break;
                            case 1785421873:
                                if (!str2.equals("AFTEU011")) {
                                    b10 = -1;
                                } else {
                                    b10 = 5;
                                }
                                break;
                            case 1785421876:
                                if (!str2.equals("AFTEU014")) {
                                    b10 = -1;
                                } else {
                                    b10 = 6;
                                }
                                break;
                            case 1798172390:
                                if (!str2.equals("AFTSO001")) {
                                    b10 = -1;
                                } else {
                                    b10 = 7;
                                }
                                break;
                            case 2119412532:
                                if (!str2.equals("AFTEUFF014")) {
                                    b10 = -1;
                                } else {
                                    b10 = 8;
                                }
                                break;
                            default:
                                b10 = -1;
                                break;
                        }
                        switch (b10) {
                            default:
                                if (i7 <= 26) {
                                    str3 = e0.f13789b;
                                    str3.getClass();
                                    switch (str3.hashCode()) {
                                        case -2144781245:
                                            if (!str3.equals("GIONEE_SWW1609")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 0;
                                            }
                                            break;
                                        case -2144781185:
                                            if (!str3.equals("GIONEE_SWW1627")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 1;
                                            }
                                            break;
                                        case -2144781160:
                                            if (!str3.equals("GIONEE_SWW1631")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 2;
                                            }
                                            break;
                                        case -2097309513:
                                            if (!str3.equals("K50a40")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 3;
                                            }
                                            break;
                                        case -2022874474:
                                            if (!str3.equals("CP8676_I02")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 4;
                                            }
                                            break;
                                        case -1978993182:
                                            if (!str3.equals("NX541J")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 5;
                                            }
                                            break;
                                        case -1978990237:
                                            if (!str3.equals("NX573J")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 6;
                                            }
                                            break;
                                        case -1936688988:
                                            if (!str3.equals("PGN528")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 7;
                                            }
                                            break;
                                        case -1936688066:
                                            if (!str3.equals("PGN610")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 8;
                                            }
                                            break;
                                        case -1936688065:
                                            if (!str3.equals("PGN611")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 9;
                                            }
                                            break;
                                        case -1931988508:
                                            if (!str3.equals("AquaPowerM")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 10;
                                            }
                                            break;
                                        case -1885099851:
                                            if (!str3.equals("RAIJIN")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 11;
                                            }
                                            break;
                                        case -1696512866:
                                            if (!str3.equals("XT1663")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 12;
                                            }
                                            break;
                                        case -1680025915:
                                            if (!str3.equals("ComioS1")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 13;
                                            }
                                            break;
                                        case -1615810839:
                                            if (!str3.equals("Phantom6")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 14;
                                            }
                                            break;
                                        case -1600724499:
                                            if (!str3.equals("pacificrim")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 15;
                                            }
                                            break;
                                        case -1554255044:
                                            if (!str3.equals("vernee_M5")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 16;
                                            }
                                            break;
                                        case -1481772737:
                                            if (!str3.equals("panell_dl")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 17;
                                            }
                                            break;
                                        case -1481772730:
                                            if (!str3.equals("panell_ds")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 18;
                                            }
                                            break;
                                        case -1481772729:
                                            if (!str3.equals("panell_dt")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 19;
                                            }
                                            break;
                                        case -1320080169:
                                            if (!str3.equals("GiONEE_GBL7319")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 20;
                                            }
                                            break;
                                        case -1217592143:
                                            if (!str3.equals("BRAVIA_ATV2")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 21;
                                            }
                                            break;
                                        case -1180384755:
                                            if (!str3.equals("iris60")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 22;
                                            }
                                            break;
                                        case -1139198265:
                                            if (!str3.equals("Slate_Pro")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 23;
                                            }
                                            break;
                                        case -1052835013:
                                            if (!str3.equals("namath")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 24;
                                            }
                                            break;
                                        case -993250464:
                                            if (!str3.equals("A10-70F")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 25;
                                            }
                                            break;
                                        case -993250458:
                                            if (!str3.equals("A10-70L")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 26;
                                            }
                                            break;
                                        case -965403638:
                                            if (!str3.equals("s905x018")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 27;
                                            }
                                            break;
                                        case -958336948:
                                            if (!str3.equals("ELUGA_Ray_X")) {
                                                b12 = -1;
                                            }
                                            break;
                                        case -879245230:
                                            if (!str3.equals("tcl_eu")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 29;
                                            }
                                            break;
                                        case -842500323:
                                            if (!str3.equals("nicklaus_f")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 30;
                                            }
                                            break;
                                        case -821392978:
                                            if (!str3.equals("A7000-a")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 31;
                                            }
                                            break;
                                        case -797483286:
                                            if (!str3.equals("SVP-DTV15")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 32;
                                            }
                                            break;
                                        case -794946968:
                                            if (!str3.equals("watson")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 33;
                                            }
                                            break;
                                        case -788334647:
                                            if (!str3.equals("whyred")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 34;
                                            }
                                            break;
                                        case -782144577:
                                            if (!str3.equals("OnePlus5T")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 35;
                                            }
                                            break;
                                        case -575125681:
                                            if (!str3.equals("GiONEE_CBL7513")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 36;
                                            }
                                            break;
                                        case -521118391:
                                            if (!str3.equals("GIONEE_GBL7360")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 37;
                                            }
                                            break;
                                        case -430914369:
                                            if (!str3.equals("Pixi4-7_3G")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 38;
                                            }
                                            break;
                                        case -290434366:
                                            if (!str3.equals("taido_row")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 39;
                                            }
                                            break;
                                        case -282781963:
                                            if (!str3.equals("BLACK-1X")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 40;
                                            }
                                            break;
                                        case -277133239:
                                            if (!str3.equals("Z12_PRO")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 41;
                                            }
                                            break;
                                        case -173639913:
                                            if (!str3.equals("ELUGA_A3_Pro")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 42;
                                            }
                                            break;
                                        case -56598463:
                                            if (!str3.equals("woods_fn")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 43;
                                            }
                                            break;
                                        case 2126:
                                            if (!str3.equals("C1")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 44;
                                            }
                                            break;
                                        case 2564:
                                            if (!str3.equals("Q5")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 45;
                                            }
                                            break;
                                        case 2715:
                                            if (!str3.equals("V1")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 46;
                                            }
                                            break;
                                        case 2719:
                                            if (!str3.equals("V5")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 47;
                                            }
                                            break;
                                        case 3091:
                                            if (!str3.equals("b5")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 48;
                                            }
                                            break;
                                        case 3483:
                                            if (!str3.equals("mh")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 49;
                                            }
                                            break;
                                        case 73405:
                                            if (!str3.equals("JGZ")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 50;
                                            }
                                            break;
                                        case 75537:
                                            if (!str3.equals("M04")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 51;
                                            }
                                            break;
                                        case 75739:
                                            if (!str3.equals("M5c")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 52;
                                            }
                                            break;
                                        case 76779:
                                            if (!str3.equals("MX6")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 53;
                                            }
                                            break;
                                        case 78669:
                                            if (!str3.equals("P85")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 54;
                                            }
                                            break;
                                        case 79305:
                                            if (!str3.equals("PLE")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 55;
                                            }
                                            break;
                                        case 80618:
                                            if (!str3.equals("QX1")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 56;
                                            }
                                            break;
                                        case 88274:
                                            if (!str3.equals("Z80")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 57;
                                            }
                                            break;
                                        case 98846:
                                            if (!str3.equals("cv1")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 58;
                                            }
                                            break;
                                        case 98848:
                                            if (!str3.equals("cv3")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 59;
                                            }
                                            break;
                                        case 99329:
                                            if (!str3.equals("deb")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 60;
                                            }
                                            break;
                                        case 101481:
                                            if (!str3.equals("flo")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 61;
                                            }
                                            break;
                                        case 1513190:
                                            if (!str3.equals("1601")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 62;
                                            }
                                            break;
                                        case 1514184:
                                            if (!str3.equals("1713")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 63;
                                            }
                                            break;
                                        case 1514185:
                                            if (!str3.equals("1714")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 64;
                                            }
                                            break;
                                        case 2133089:
                                            if (!str3.equals("F01H")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 65;
                                            }
                                            break;
                                        case 2133091:
                                            if (!str3.equals("F01J")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 66;
                                            }
                                            break;
                                        case 2133120:
                                            if (!str3.equals("F02H")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 67;
                                            }
                                            break;
                                        case 2133151:
                                            if (!str3.equals("F03H")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 68;
                                            }
                                            break;
                                        case 2133182:
                                            if (!str3.equals("F04H")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 69;
                                            }
                                            break;
                                        case 2133184:
                                            if (!str3.equals("F04J")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 70;
                                            }
                                            break;
                                        case 2436959:
                                            if (!str3.equals("P681")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 71;
                                            }
                                            break;
                                        case 2463773:
                                            if (!str3.equals("Q350")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 72;
                                            }
                                            break;
                                        case 2464648:
                                            if (!str3.equals("Q427")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 73;
                                            }
                                            break;
                                        case 2689555:
                                            if (!str3.equals("XE2X")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 74;
                                            }
                                            break;
                                        case 3154429:
                                            if (!str3.equals("fugu")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 75;
                                            }
                                            break;
                                        case 3284551:
                                            if (!str3.equals("kate")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 76;
                                            }
                                            break;
                                        case 3351335:
                                            if (!str3.equals("mido")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 77;
                                            }
                                            break;
                                        case 3386211:
                                            if (!str3.equals("p212")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 78;
                                            }
                                            break;
                                        case 41325051:
                                            if (!str3.equals("MEIZU_M5")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 79;
                                            }
                                            break;
                                        case 51349633:
                                            if (!str3.equals("601LV")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 80;
                                            }
                                            break;
                                        case 51350594:
                                            if (!str3.equals("602LV")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 81;
                                            }
                                            break;
                                        case 55178625:
                                            if (!str3.equals("Aura_Note_2")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 82;
                                            }
                                            break;
                                        case 61542055:
                                            if (!str3.equals("A1601")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 83;
                                            }
                                            break;
                                        case 65355429:
                                            if (!str3.equals("E5643")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 84;
                                            }
                                            break;
                                        case 66214468:
                                            if (!str3.equals("F3111")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 85;
                                            }
                                            break;
                                        case 66214470:
                                            if (!str3.equals("F3113")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 86;
                                            }
                                            break;
                                        case 66214473:
                                            if (!str3.equals("F3116")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 87;
                                            }
                                            break;
                                        case 66215429:
                                            if (!str3.equals("F3211")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 88;
                                            }
                                            break;
                                        case 66215431:
                                            if (!str3.equals("F3213")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 89;
                                            }
                                            break;
                                        case 66215433:
                                            if (!str3.equals("F3215")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 90;
                                            }
                                            break;
                                        case 66216390:
                                            if (!str3.equals("F3311")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 91;
                                            }
                                            break;
                                        case 76402249:
                                            if (!str3.equals("PRO7S")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 92;
                                            }
                                            break;
                                        case 76404105:
                                            if (!str3.equals("Q4260")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 93;
                                            }
                                            break;
                                        case 76404911:
                                            if (!str3.equals("Q4310")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 94;
                                            }
                                            break;
                                        case 80963634:
                                            if (!str3.equals("V23GB")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 95;
                                            }
                                            break;
                                        case 82882791:
                                            if (!str3.equals("X3_HK")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 96;
                                            }
                                            break;
                                        case 98715550:
                                            if (!str3.equals("i9031")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 97;
                                            }
                                            break;
                                        case 101370885:
                                            if (!str3.equals("l5460")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 98;
                                            }
                                            break;
                                        case 102844228:
                                            if (!str3.equals("le_x6")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 99;
                                            }
                                            break;
                                        case 165221241:
                                            if (!str3.equals("A2016a40")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 100;
                                            }
                                            break;
                                        case 182191441:
                                            if (!str3.equals("CPY83_I00")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 101;
                                            }
                                            break;
                                        case 245388979:
                                            if (!str3.equals("marino_f")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 102;
                                            }
                                            break;
                                        case 287431619:
                                            if (!str3.equals("griffin")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 103;
                                            }
                                            break;
                                        case 307593612:
                                            if (!str3.equals("A7010a48")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 104;
                                            }
                                            break;
                                        case 308517133:
                                            if (!str3.equals("A7020a48")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 105;
                                            }
                                            break;
                                        case 316215098:
                                            if (!str3.equals("TB3-730F")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 106;
                                            }
                                            break;
                                        case 316215116:
                                            if (!str3.equals("TB3-730X")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 107;
                                            }
                                            break;
                                        case 316246811:
                                            if (!str3.equals("TB3-850F")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 108;
                                            }
                                            break;
                                        case 316246818:
                                            if (!str3.equals("TB3-850M")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 109;
                                            }
                                            break;
                                        case 407160593:
                                            if (!str3.equals("Pixi5-10_4G")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 110;
                                            }
                                            break;
                                        case 507412548:
                                            if (!str3.equals("QM16XE_U")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 111;
                                            }
                                            break;
                                        case 793982701:
                                            if (!str3.equals("GIONEE_WBL5708")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 112;
                                            }
                                            break;
                                        case 794038622:
                                            if (!str3.equals("GIONEE_WBL7365")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 113;
                                            }
                                            break;
                                        case 794040393:
                                            if (!str3.equals("GIONEE_WBL7519")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 114;
                                            }
                                            break;
                                        case 835649806:
                                            if (!str3.equals("manning")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 115;
                                            }
                                            break;
                                        case 917340916:
                                            if (!str3.equals("A7000plus")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 116;
                                            }
                                            break;
                                        case 958008161:
                                            if (!str3.equals("j2xlteins")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 117;
                                            }
                                            break;
                                        case 1060579533:
                                            if (!str3.equals("panell_d")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 118;
                                            }
                                            break;
                                        case 1150207623:
                                            if (!str3.equals("LS-5017")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 119;
                                            }
                                            break;
                                        case 1176899427:
                                            if (!str3.equals("itel_S41")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 120;
                                            }
                                            break;
                                        case 1280332038:
                                            if (!str3.equals("hwALE-H")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 121;
                                            }
                                            break;
                                        case 1306947716:
                                            if (!str3.equals("EverStar_S")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 122;
                                            }
                                            break;
                                        case 1349174697:
                                            if (!str3.equals("htc_e56ml_dtul")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 123;
                                            }
                                            break;
                                        case 1522194893:
                                            if (!str3.equals("woods_f")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 124;
                                            }
                                            break;
                                        case 1691543273:
                                            if (!str3.equals("CPH1609")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 125;
                                            }
                                            break;
                                        case 1691544261:
                                            if (!str3.equals("CPH1715")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 126;
                                            }
                                            break;
                                        case 1709443163:
                                            if (!str3.equals("iball8735_9806")) {
                                                b12 = -1;
                                            } else {
                                                b12 = ByteCompanionObject.MAX_VALUE;
                                            }
                                            break;
                                        case 1865889110:
                                            if (!str3.equals("santoni")) {
                                                b12 = -1;
                                            } else {
                                                b12 = ByteCompanionObject.MIN_VALUE;
                                            }
                                            break;
                                        case 1906253259:
                                            if (!str3.equals("PB2-670M")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 129;
                                            }
                                            break;
                                        case 1977196784:
                                            if (!str3.equals("Infinix-X572")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 130;
                                            }
                                            break;
                                        case 2006372676:
                                            if (!str3.equals("BRAVIA_ATV3_4K")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 131;
                                            }
                                            break;
                                        case 2019281702:
                                            if (!str3.equals("DM-01K")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 132;
                                            }
                                            break;
                                        case 2029784656:
                                            if (!str3.equals("HWBLN-H")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 133;
                                            }
                                            break;
                                        case 2030379515:
                                            if (!str3.equals("HWCAM-H")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 134;
                                            }
                                            break;
                                        case 2033393791:
                                            if (!str3.equals("ASUS_X00AD_2")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 135;
                                            }
                                            break;
                                        case 2047190025:
                                            if (!str3.equals("ELUGA_Note")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 136;
                                            }
                                            break;
                                        case 2047252157:
                                            if (!str3.equals("ELUGA_Prim")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 137;
                                            }
                                            break;
                                        case 2048319463:
                                            if (!str3.equals("HWVNS-H")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 138;
                                            }
                                            break;
                                        case 2048855701:
                                            if (!str3.equals("HWWAS-H")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 139;
                                            }
                                            break;
                                        default:
                                            b12 = -1;
                                            break;
                                    }
                                    switch (b12) {
                                        default:
                                            if (str2.equals("JSN-L21")) {
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
                                        case 16:
                                        case 17:
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
                                        case ChatViewRecyclerTypes.REACTION_ADD_REACTION /* 47 */:
                                        case 48:
                                        case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_IMAGE /* 49 */:
                                        case 50:
                                        case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_VISUAL_PLACEHOLDER /* 51 */:
                                        case ChatViewRecyclerTypes.REFERRAL /* 52 */:
                                        case ChatViewRecyclerTypes.GUILD_PROFILE_INVITE /* 53 */:
                                        case ChatViewRecyclerTypes.APP_MESSAGE_EMBED /* 54 */:
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
                                        case 68:
                                        case 69:
                                        case 70:
                                        case 71:
                                        case 72:
                                        case 73:
                                        case 74:
                                        case 75:
                                        case 76:
                                        case 77:
                                        case 78:
                                        case 79:
                                        case 80:
                                        case 81:
                                        case 82:
                                        case 83:
                                        case 84:
                                        case 85:
                                        case BuildConfig.REACT_NATIVE_MINOR_VERSION /* 86 */:
                                        case 87:
                                        case 88:
                                        case 89:
                                        case 90:
                                        case 91:
                                        case 92:
                                        case 93:
                                        case 94:
                                        case 95:
                                        case 96:
                                        case 97:
                                        case 98:
                                        case 99:
                                        case 100:
                                        case 101:
                                        case 102:
                                        case 103:
                                        case 104:
                                        case 105:
                                        case 106:
                                        case 107:
                                        case 108:
                                        case 109:
                                        case 110:
                                        case 111:
                                        case 112:
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
                                        case 135:
                                        case 136:
                                        case 137:
                                        case 138:
                                        case 139:
                                            z5 = true;
                                            break;
                                    }
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
                                z5 = true;
                                break;
                        }
                    }
                    M1 = z5;
                    L1 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return M1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int t0(bd.o oVar, Format format) {
        int iIntValue;
        int i7 = format.N;
        int i10 = format.O;
        if (i7 != -1 && i10 != -1) {
            String str = format.I;
            if ("video/dolby-vision".equals(str)) {
                Pair pairD = z.d(format);
                str = (pairD == null || !((iIntValue = ((Integer) pairD.first).intValue()) == 512 || iIntValue == 1 || iIntValue == 2)) ? "video/hevc" : "video/avc";
            }
            str.getClass();
            switch (str) {
                case "video/3gpp":
                case "video/av01":
                case "video/mp4v-es":
                case "video/x-vnd.on2.vp8":
                    return ((i7 * i10) * 3) / 4;
                case "video/hevc":
                    return Math.max(2097152, ((i7 * i10) * 3) / 4);
                case "video/avc":
                    String str2 = e0.f13791d;
                    if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(e0.f13790c) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !oVar.f3177f)))) {
                        return ((e0.f(i10, 16) * e0.f(i7, 16)) * 768) / 4;
                    }
                    break;
                case "video/x-vnd.on2.vp9":
                    return ((i7 * i10) * 3) / 8;
            }
        }
        return -1;
    }

    public static List u0(Context context, bd.t tVar, Format format, boolean z5, boolean z6) {
        Iterable iterableE;
        List listE;
        String str = format.I;
        if (str == null) {
            c0 c0Var = ei.e0.f8303e;
            return r0.f8352w;
        }
        if (e0.f13788a >= 26 && "video/dolby-vision".equals(str) && !g.a(context)) {
            String strB = z.b(format);
            if (strB == null) {
                c0 c0Var2 = ei.e0.f8303e;
                listE = r0.f8352w;
            } else {
                tVar.getClass();
                listE = z.e(strB, z5, z6);
            }
            if (!listE.isEmpty()) {
                return listE;
            }
        }
        Pattern pattern = z.f3221a;
        String str2 = format.I;
        tVar.getClass();
        List listE2 = z.e(str2, z5, z6);
        String strB2 = z.b(format);
        if (strB2 == null) {
            c0 c0Var3 = ei.e0.f8303e;
            iterableE = r0.f8352w;
        } else {
            iterableE = z.e(strB2, z5, z6);
        }
        c0 c0Var4 = ei.e0.f8303e;
        b0 b0Var = new b0();
        b0Var.c(listE2);
        b0Var.c(iterableE);
        return b0Var.f();
    }

    public static int v0(bd.o oVar, Format format) {
        int i7 = format.J;
        List list = format.K;
        if (i7 == -1) {
            return t0(oVar, format);
        }
        int size = list.size();
        int length = 0;
        for (int i10 = 0; i10 < size; i10++) {
            length += ((byte[]) list.get(i10)).length;
        }
        return format.J + length;
    }

    public final void A0(bd.l lVar, int i7, long j) {
        je.b.c("releaseOutputBuffer");
        lVar.j(i7, j);
        je.b.t();
        this.X0.f5674e++;
        this.f14374x1 = 0;
        this.f14356f1.getClass();
        this.A1 = SystemClock.elapsedRealtime() * 1000;
        y0(this.E1);
        x0();
    }

    @Override // bd.s
    public final DecoderReuseEvaluation B(bd.o oVar, Format format, Format format2) {
        DecoderReuseEvaluation decoderReuseEvaluationB = oVar.b(format, format2);
        int i7 = decoderReuseEvaluationB.f5684e;
        int i10 = format2.N;
        gc.l lVar = this.f14360j1;
        if (i10 > lVar.f9744a || format2.O > lVar.f9745b) {
            i7 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
        }
        if (v0(oVar, format2) > this.f14360j1.f9746c) {
            i7 |= 64;
        }
        int i11 = i7;
        return new DecoderReuseEvaluation(oVar.f3172a, format, format2, i11 != 0 ? 0 : decoderReuseEvaluationB.f5683d, i11);
    }

    public final boolean B0(bd.o oVar) {
        if (e0.f13788a < 23 || this.G1 || s0(oVar.f3172a)) {
            return false;
        }
        return !oVar.f3177f || k.h(this.f14354c1);
    }

    @Override // bd.s
    public final bd.m C(IllegalStateException illegalStateException, bd.o oVar) {
        Surface surface = this.f14363m1;
        f fVar = new f(illegalStateException, oVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return fVar;
    }

    public final void C0(bd.l lVar, int i7) {
        je.b.c("skipVideoBuffer");
        lVar.releaseOutputBuffer(i7, false);
        je.b.t();
        this.X0.f5675f++;
    }

    public final void D0(int i7, int i10) {
        DecoderCounters decoderCounters = this.X0;
        decoderCounters.f5677h += i7;
        int i11 = i7 + i10;
        decoderCounters.f5676g += i11;
        this.f14373w1 += i11;
        int i12 = this.f14374x1 + i11;
        this.f14374x1 = i12;
        decoderCounters.f5678i = Math.max(i12, decoderCounters.f5678i);
        int i13 = this.f14358h1;
        if (i13 <= 0 || this.f14373w1 < i13) {
            return;
        }
        w0();
    }

    public final void E0(long j) {
        DecoderCounters decoderCounters = this.X0;
        decoderCounters.k += j;
        decoderCounters.f5679l++;
        this.B1 += j;
        this.C1++;
    }

    @Override // bd.s
    public final boolean K() {
        return this.G1 && e0.f13788a < 23;
    }

    @Override // bd.s
    public final float L(float f2, Format[] formatArr) {
        float fMax = -1.0f;
        for (Format format : formatArr) {
            float f7 = format.P;
            if (f7 != -1.0f) {
                fMax = Math.max(fMax, f7);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f2;
    }

    @Override // bd.s
    public final ArrayList M(bd.t tVar, Format format, boolean z5) {
        List listU0 = u0(this.f14354c1, tVar, format, z5, this.G1);
        Pattern pattern = z.f3221a;
        ArrayList arrayList = new ArrayList(listU0);
        Collections.sort(arrayList, new bd.u(0, new app.rive.runtime.kotlin.core.a(5, format)));
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:88:0x016d  */
    /* JADX WARN: Instruction removed from duplicated block: B:88:0x016d, please report this as an issue */
    @Override // bd.s
    public final bd.j N(bd.o oVar, Format format, MediaCrypto mediaCrypto, float f2) {
        int i7;
        b bVar;
        gc.l lVar;
        Point point;
        Point point2;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        byte b10;
        boolean z5;
        Pair pairD;
        int iT0;
        k kVar = this.f14364n1;
        if (kVar != null && kVar.f14384d != oVar.f3177f) {
            if (this.f14363m1 == kVar) {
                this.f14363m1 = null;
            }
            kVar.release();
            this.f14364n1 = null;
        }
        String str = oVar.f3174c;
        Format[] formatArr = this.F;
        formatArr.getClass();
        int i10 = format.N;
        float f7 = format.P;
        int i11 = format.O;
        b bVar2 = format.U;
        int iV0 = v0(oVar, format);
        if (formatArr.length == 1) {
            if (iV0 != -1 && (iT0 = t0(oVar, format)) != -1) {
                iV0 = Math.min((int) (iV0 * 1.5f), iT0);
            }
            lVar = new gc.l(i10, i11, iV0);
            i7 = i11;
            bVar = bVar2;
        } else {
            int iMax = i10;
            int iMax2 = i11;
            int i12 = 0;
            boolean z6 = false;
            for (int length = formatArr.length; i12 < length; length = length) {
                Format format2 = formatArr[i12];
                int i13 = i12;
                if (bVar2 != null && format2.U == null) {
                    g0 g0VarA = format2.a();
                    g0VarA.f9655w = bVar2;
                    format2 = new Format(g0VarA);
                }
                DecoderReuseEvaluation decoderReuseEvaluationB = oVar.b(format, format2);
                Format[] formatArr2 = formatArr;
                int i14 = format2.O;
                if (decoderReuseEvaluationB.f5683d != 0) {
                    int i15 = format2.N;
                    b10 = -1;
                    z6 |= i15 == -1 || i14 == -1;
                    iMax = Math.max(iMax, i15);
                    iMax2 = Math.max(iMax2, i14);
                    iV0 = Math.max(iV0, v0(oVar, format2));
                } else {
                    b10 = -1;
                }
                i12 = i13 + 1;
                formatArr = formatArr2;
            }
            if (z6) {
                je.b.N("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
                boolean z7 = i11 > i10;
                int i16 = z7 ? i11 : i10;
                boolean z10 = z7;
                int i17 = z7 ? i10 : i11;
                float f10 = i17 / i16;
                bVar = bVar2;
                int i18 = 0;
                while (true) {
                    if (i18 < 9) {
                        int i19 = K1[i18];
                        int i20 = i18;
                        int i21 = (int) (i19 * f10);
                        if (i19 > i16 && i21 > i17) {
                            int i22 = i17;
                            int i23 = i16;
                            if (e0.f13788a >= 21) {
                                int i24 = z10 ? i21 : i19;
                                if (!z10) {
                                    i19 = i21;
                                }
                                MediaCodecInfo.CodecCapabilities codecCapabilities = oVar.f3175d;
                                if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                                    point2 = null;
                                } else {
                                    int widthAlignment = videoCapabilities.getWidthAlignment();
                                    int heightAlignment = videoCapabilities.getHeightAlignment();
                                    point2 = new Point(e0.f(i24, widthAlignment) * widthAlignment, e0.f(i19, heightAlignment) * heightAlignment);
                                }
                                i7 = i11;
                                if (oVar.f(point2.x, f7, point2.y)) {
                                    point = point2;
                                } else {
                                    i18 = i20 + 1;
                                    i11 = i7;
                                    i17 = i22;
                                    i16 = i23;
                                }
                            } else {
                                i7 = i11;
                                try {
                                    int iF = e0.f(i19, 16) * 16;
                                    int iF2 = e0.f(i21, 16) * 16;
                                    if (iF * iF2 <= z.i()) {
                                        int i25 = z10 ? iF2 : iF;
                                        if (!z10) {
                                            iF = iF2;
                                        }
                                        point2 = new Point(i25, iF);
                                        point = point2;
                                    } else {
                                        i18 = i20 + 1;
                                        i11 = i7;
                                        i17 = i22;
                                        i16 = i23;
                                    }
                                } catch (bd.w unused) {
                                    point = null;
                                }
                            }
                        }
                        if (point != null) {
                            iMax = Math.max(iMax, point.x);
                            iMax2 = Math.max(iMax2, point.y);
                            g0 g0VarA2 = format.a();
                            g0VarA2.f9648p = iMax;
                            g0VarA2.f9649q = iMax2;
                            iV0 = Math.max(iV0, t0(oVar, new Format(g0VarA2)));
                            je.b.N("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                        }
                    }
                    i7 = i11;
                    point = null;
                    if (point != null) {
                        iMax = Math.max(iMax, point.x);
                        iMax2 = Math.max(iMax2, point.y);
                        g0 g0VarA3 = format.a();
                        g0VarA3.f9648p = iMax;
                        g0VarA3.f9649q = iMax2;
                        iV0 = Math.max(iV0, t0(oVar, new Format(g0VarA3)));
                        je.b.N("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                    }
                }
            } else {
                i7 = i11;
                bVar = bVar2;
            }
            lVar = new gc.l(iMax, iMax2, iV0);
        }
        this.f14360j1 = lVar;
        int i26 = this.G1 ? this.H1 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i10);
        mediaFormat.setInteger("height", i7);
        je.b.L(mediaFormat, format.K);
        if (f7 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f7);
        }
        je.b.D(mediaFormat, "rotation-degrees", format.Q);
        if (bVar != null) {
            b bVar3 = bVar;
            je.b.D(mediaFormat, "color-transfer", bVar3.f14329i);
            je.b.D(mediaFormat, "color-standard", bVar3.f14327d);
            je.b.D(mediaFormat, "color-range", bVar3.f14328e);
            byte[] bArr = bVar3.f14330v;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(format.I) && (pairD = z.d(format)) != null) {
            je.b.D(mediaFormat, "profile", ((Integer) pairD.first).intValue());
        }
        mediaFormat.setInteger("max-width", lVar.f9744a);
        mediaFormat.setInteger("max-height", lVar.f9745b);
        je.b.D(mediaFormat, "max-input-size", lVar.f9746c);
        if (e0.f13788a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f2 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f2);
            }
        }
        if (this.f14359i1) {
            z5 = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z5 = true;
        }
        if (i26 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z5);
            mediaFormat.setInteger("audio-session-id", i26);
        }
        if (this.f14363m1 == null) {
            if (!B0(oVar)) {
                throw new IllegalStateException();
            }
            if (this.f14364n1 == null) {
                this.f14364n1 = k.i(this.f14354c1, oVar.f3177f);
            }
            this.f14363m1 = this.f14364n1;
        }
        this.f14356f1.getClass();
        return new bd.j(oVar, mediaFormat, format, this.f14363m1, mediaCrypto);
    }

    @Override // bd.s
    public final void O(lc.f fVar) {
        if (this.f14362l1) {
            ByteBuffer byteBuffer = fVar.f15013y;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s2 = byteBuffer.getShort();
                short s5 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s2 == 60 && s5 == 1 && b11 == 4) {
                    if (b12 == 0 || b12 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        bd.l lVar = this.f3195g0;
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        lVar.setParameters(bundle);
                    }
                }
            }
        }
    }

    @Override // bd.s
    public final void S(Exception exc) {
        je.b.s("MediaCodecVideoRenderer", "Video codec error", exc);
        e4.r rVar = this.e1;
        Handler handler = (Handler) rVar.f8034e;
        if (handler != null) {
            handler.post(new io.sentry.react.d(5, rVar, exc));
        }
    }

    @Override // bd.s
    public final void T(long j, long j5, String str) {
        String str2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        e4.r rVar = this.e1;
        Handler handler = (Handler) rVar.f8034e;
        if (handler != null) {
            str2 = str;
            handler.post(new ic.o(rVar, str2, j, j5, 1));
        } else {
            str2 = str;
        }
        this.f14361k1 = s0(str2);
        bd.o oVar = this.f3201n0;
        oVar.getClass();
        boolean z5 = false;
        if (e0.f13788a >= 29 && "video/x-vnd.on2.vp9".equals(oVar.f3173b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = oVar.f3175d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                if (codecProfileLevel.profile == 16384) {
                    z5 = true;
                    break;
                }
            }
        }
        this.f14362l1 = z5;
        int i7 = e0.f13788a;
        if (i7 >= 23 && this.G1) {
            bd.l lVar = this.f3195g0;
            lVar.getClass();
            this.I1 = new h(this, lVar);
        }
        Context context = ((i) this.f14356f1.f68b).f14354c1;
        if (i7 >= 29) {
            int i10 = context.getApplicationContext().getApplicationInfo().targetSdkVersion;
        }
    }

    @Override // bd.s
    public final void U(String str) {
        e4.r rVar = this.e1;
        Handler handler = (Handler) rVar.f8034e;
        if (handler != null) {
            handler.post(new io.sentry.react.d(4, rVar, str));
        }
    }

    @Override // bd.s
    public final DecoderReuseEvaluation V(e4.r rVar) throws com.google.android.exoplayer2.b {
        DecoderReuseEvaluation decoderReuseEvaluationV = super.V(rVar);
        Format format = (Format) rVar.f8035i;
        e4.r rVar2 = this.e1;
        Handler handler = (Handler) rVar2.f8034e;
        if (handler != null) {
            handler.post(new ac.a(rVar2, format, decoderReuseEvaluationV, 27));
        }
        return decoderReuseEvaluationV;
    }

    @Override // bd.s
    public final void W(Format format, MediaFormat mediaFormat) {
        int integer;
        int i7;
        bd.l lVar = this.f3195g0;
        if (lVar != null) {
            lVar.p(this.f14366p1);
        }
        if (this.G1) {
            i7 = format.N;
            integer = format.O;
        } else {
            mediaFormat.getClass();
            boolean z5 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z5 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            integer = z5 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            i7 = integer2;
        }
        float f2 = format.R;
        int i10 = format.Q;
        int i11 = e0.f13788a;
        a3.f fVar = this.f14356f1;
        if (i11 >= 21) {
            if (i10 == 90 || i10 == 270) {
                f2 = 1.0f / f2;
                int i12 = integer;
                integer = i7;
                i7 = i12;
            }
            i10 = 0;
        } else {
            fVar.getClass();
        }
        this.E1 = new VideoSize(i7, integer, i10, f2);
        float f7 = format.P;
        t tVar = this.f14355d1;
        tVar.f14408f = f7;
        d dVar = tVar.f14403a;
        dVar.f14340a.c();
        dVar.f14341b.c();
        dVar.f14342c = false;
        dVar.f14343d = -9223372036854775807L;
        dVar.f14344e = 0;
        tVar.b();
        fVar.getClass();
    }

    @Override // bd.s
    public final void Y(long j) {
        super.Y(j);
        if (this.G1) {
            return;
        }
        this.f14375y1--;
    }

    @Override // bd.s
    public final void Z() {
        r0();
    }

    @Override // bd.s
    public final void a0(lc.f fVar) {
        boolean z5 = this.G1;
        if (!z5) {
            this.f14375y1++;
        }
        if (e0.f13788a >= 23 || !z5) {
            return;
        }
        long j = fVar.f15012x;
        q0(j);
        y0(this.E1);
        this.X0.f5674e++;
        x0();
        Y(j);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0050  */
    @Override // bd.s
    public final void b0(Format format) throws com.google.android.exoplayer2.b {
        boolean z5;
        int i7;
        a3.f fVar = this.f14356f1;
        fVar.getClass();
        long j = this.Y0.f3186b;
        i iVar = (i) fVar.f68b;
        if (!fVar.f67a) {
            return;
        }
        if (((CopyOnWriteArrayList) fVar.f69c) == null) {
            fVar.f67a = false;
            return;
        }
        e0.m(null);
        b bVar = format.U;
        try {
            if (bVar != null) {
                int i10 = bVar.f14329i;
                if (i10 == 7 || i10 == 6) {
                    if (i10 == 7) {
                        Pair.create(bVar, new b(bVar.f14327d, bVar.f14328e, 6, bVar.f14330v));
                    } else {
                        Pair.create(bVar, bVar);
                    }
                }
                if (e0.f13788a >= 21) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (!z5 || (i7 = format.Q) == 0) {
                    c9.a.C();
                    c9.a.f3537g.invoke(c9.a.f3536f.newInstance(null), null).getClass();
                    throw new ClassCastException();
                }
                c9.a.C();
                Object objNewInstance = c9.a.f3533c.newInstance(null);
                c9.a.f3534d.invoke(objNewInstance, Float.valueOf(i7));
                c9.a.f3535e.invoke(objNewInstance, null).getClass();
                throw new ClassCastException();
            }
            b bVar2 = b.f14325x;
            if (e0.f13788a >= 21) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
            }
            c9.a.C();
            c9.a.f3537g.invoke(c9.a.f3536f.newInstance(null), null).getClass();
            throw new ClassCastException();
        } catch (Exception e10) {
            throw iVar.f(e10, format, false, 7000);
        }
        b bVar3 = b.f14325x;
        Pair.create(bVar3, bVar3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [bd.l] */
    /* JADX WARN: Type inference failed for: r11v10, types: [android.view.Surface] */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [android.view.Surface] */
    /* JADX WARN: Type inference failed for: r12v7, types: [ke.k] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // gc.e, gc.k1
    public final void c(int i7, Object obj) throws com.google.android.exoplayer2.b {
        ?? I;
        Surface surface;
        Surface surface2;
        t tVar = this.f14355d1;
        a3.f fVar = this.f14356f1;
        if (i7 != 1) {
            if (i7 == 7) {
                this.J1 = (o) obj;
                return;
            }
            if (i7 == 10) {
                int iIntValue = ((Integer) obj).intValue();
                if (this.H1 != iIntValue) {
                    this.H1 = iIntValue;
                    if (this.G1) {
                        f0();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i7 == 4) {
                int iIntValue2 = ((Integer) obj).intValue();
                this.f14366p1 = iIntValue2;
                bd.l lVar = this.f3195g0;
                if (lVar != null) {
                    lVar.p(iIntValue2);
                    return;
                }
                return;
            }
            if (i7 == 5) {
                int iIntValue3 = ((Integer) obj).intValue();
                if (tVar.j == iIntValue3) {
                    return;
                }
                tVar.j = iIntValue3;
                tVar.c(true);
                return;
            }
            if (i7 == 13) {
                obj.getClass();
                List list = (List) obj;
                CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) fVar.f69c;
                if (copyOnWriteArrayList == null) {
                    fVar.f69c = new CopyOnWriteArrayList(list);
                    return;
                } else {
                    copyOnWriteArrayList.clear();
                    ((CopyOnWriteArrayList) fVar.f69c).addAll(list);
                    return;
                }
            }
            if (i7 != 14) {
                return;
            }
            obj.getClass();
            x xVar = (x) obj;
            if (xVar.f13864a == 0 || xVar.f13865b == 0 || (surface2 = this.f14363m1) == null) {
                return;
            }
            Pair pair = (Pair) fVar.f70d;
            if (pair != null && ((Surface) pair.first).equals(surface2) && ((x) ((Pair) fVar.f70d).second).equals(xVar)) {
                return;
            }
            fVar.f70d = Pair.create(surface2, xVar);
            return;
        }
        if (obj instanceof Surface) {
            surface = (Surface) obj;
        } else {
            I = 0;
        }
        if (I == 0) {
            k kVar = this.f14364n1;
            if (kVar != null) {
                I = surface;
                I = kVar;
            } else {
                bd.o oVar = this.f3201n0;
                if (oVar != null && B0(oVar)) {
                    I = surface;
                    I = k.i(this.f14354c1, oVar.f3177f);
                    this.f14364n1 = I;
                }
            }
        }
        I = surface;
        I = surface;
        I = surface;
        Surface surface3 = this.f14363m1;
        e4.r rVar = this.e1;
        if (surface3 == I) {
            if (I == 0 || I == this.f14364n1) {
                return;
            }
            VideoSize videoSize = this.F1;
            if (videoSize != null) {
                rVar.P(videoSize);
            }
            if (this.f14365o1) {
                Surface surface4 = this.f14363m1;
                Handler handler = (Handler) rVar.f8034e;
                if (handler != null) {
                    handler.post(new app.rive.core.a(rVar, surface4, SystemClock.elapsedRealtime(), 4));
                    return;
                }
                return;
            }
            return;
        }
        this.f14363m1 = I;
        tVar.getClass();
        ?? r11 = I instanceof k ? 0 : I;
        if (tVar.f14407e != r11) {
            tVar.a();
            tVar.f14407e = r11;
            tVar.c(true);
        }
        this.f14365o1 = false;
        int i10 = this.f9607y;
        ?? r5 = this.f3195g0;
        if (r5 != 0) {
            fVar.getClass();
            if (e0.f13788a < 23 || I == 0 || this.f14361k1) {
                f0();
                Q();
            } else {
                r5.setOutputSurface(I);
            }
        }
        if (I == 0 || I == this.f14364n1) {
            this.F1 = null;
            r0();
            fVar.getClass();
            return;
        }
        VideoSize videoSize2 = this.F1;
        if (videoSize2 != null) {
            rVar.P(videoSize2);
        }
        r0();
        if (i10 == 2) {
            long j = this.f14357g1;
            this.f14371u1 = j > 0 ? SystemClock.elapsedRealtime() + j : -9223372036854775807L;
        }
        fVar.getClass();
    }

    @Override // bd.s
    public final boolean d0(long j, long j5, bd.l lVar, ByteBuffer byteBuffer, int i7, int i10, int i11, long j7, boolean z5, boolean z6, Format format) throws com.google.android.exoplayer2.b {
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        t tVar = this.f14355d1;
        a3.f fVar = this.f14356f1;
        lVar.getClass();
        if (this.f14370t1 == -9223372036854775807L) {
            this.f14370t1 = j;
        }
        if (j7 != this.f14376z1) {
            fVar.getClass();
            j10 = -1;
            long j16 = tVar.f14414n;
            if (j16 != -1) {
                tVar.f14416p = j16;
                tVar.f14417q = tVar.f14415o;
            }
            tVar.f14413m++;
            d dVar = tVar.f14403a;
            long j17 = j7 * 1000;
            j11 = 0;
            dVar.f14340a.b(j17);
            if (dVar.f14340a.a()) {
                dVar.f14342c = false;
            } else if (dVar.f14343d != -9223372036854775807L) {
                if (dVar.f14342c) {
                    c cVar = dVar.f14341b;
                    j15 = j17;
                    long j18 = cVar.f14335d;
                    if (j18 == 0 ? false : cVar.f14338g[(int) ((j18 - 1) % 15)]) {
                    }
                    dVar.f14342c = true;
                    j17 = j15;
                    dVar.f14341b.b(j17);
                } else {
                    j15 = j17;
                }
                dVar.f14341b.c();
                dVar.f14341b.b(dVar.f14343d);
                dVar.f14342c = true;
                j17 = j15;
                dVar.f14341b.b(j17);
            }
            if (dVar.f14342c && dVar.f14341b.a()) {
                c cVar2 = dVar.f14340a;
                dVar.f14340a = dVar.f14341b;
                dVar.f14341b = cVar2;
                dVar.f14342c = false;
            }
            dVar.f14343d = j17;
            dVar.f14344e = dVar.f14340a.a() ? 0 : dVar.f14344e + 1;
            tVar.b();
            this.f14376z1 = j7;
        } else {
            j10 = -1;
            j11 = 0;
        }
        long j19 = j7 - this.Y0.f3186b;
        if (z5 && !z6) {
            C0(lVar, i7);
            return true;
        }
        boolean z7 = this.f9607y == 2;
        long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        long j20 = (long) ((j7 - j) / ((double) this.f3193e0));
        if (z7) {
            j20 -= jElapsedRealtime - j5;
        }
        if (this.f14363m1 == this.f14364n1) {
            if (!(j20 < -30000)) {
                return false;
            }
            C0(lVar, i7);
            E0(j20);
            return true;
        }
        boolean z10 = this.f9607y == 2;
        if (this.f14371u1 == -9223372036854775807L && j >= this.Y0.f3186b && ((this.f14369s1 ? !this.f14367q1 : !(!z10 && !this.f14368r1)) || (z10 && j20 < -30000 && (SystemClock.elapsedRealtime() * 1000) - this.A1 > 100000))) {
            fVar.getClass();
            this.f14356f1.getClass();
            long jNanoTime = System.nanoTime();
            o oVar = this.J1;
            if (oVar != null) {
                oVar.d(j19, jNanoTime, format, this.f3196i0);
            }
            if (e0.f13788a >= 21) {
                A0(lVar, i7, jNanoTime);
            } else {
                z0(lVar, i7);
            }
            E0(j20);
            return true;
        }
        if (!z7 || j == this.f14370t1) {
            return false;
        }
        long jNanoTime2 = System.nanoTime();
        long j21 = (j20 * 1000) + jNanoTime2;
        if (tVar.f14416p != j10 && tVar.f14403a.f14340a.a()) {
            d dVar2 = tVar.f14403a;
            if (dVar2.f14340a.a()) {
                c cVar3 = dVar2.f14340a;
                long j22 = cVar3.f14336e;
                j14 = j22 == j11 ? j11 : cVar3.f14337f / j22;
            } else {
                j14 = -9223372036854775807L;
            }
            long j23 = tVar.f14417q + ((long) (((tVar.f14413m - tVar.f14416p) * j14) / tVar.f14411i));
            if (Math.abs(j21 - j23) <= 20000000) {
                j21 = j23;
            } else {
                tVar.f14413m = j11;
                long j24 = j10;
                tVar.f14416p = j24;
                tVar.f14414n = j24;
            }
        }
        tVar.f14414n = tVar.f14413m;
        tVar.f14415o = j21;
        s sVar = tVar.f14405c;
        if (sVar != null && tVar.k != -9223372036854775807L) {
            long j25 = sVar.f14399d;
            if (j25 != -9223372036854775807L) {
                long j26 = tVar.k;
                long j27 = (((j21 - j25) / j26) * j26) + j25;
                if (j21 <= j27) {
                    j13 = j27 - j26;
                } else {
                    j13 = j27;
                    j27 = j26 + j27;
                }
                if (j27 - j21 >= j21 - j13) {
                    j27 = j13;
                }
                j21 = j27 - tVar.f14412l;
            }
        }
        long j28 = j21;
        fVar.getClass();
        long j29 = (j28 - jNanoTime2) / 1000;
        boolean z11 = this.f14371u1 != -9223372036854775807L;
        if (j29 < -500000 && !z6) {
            o0 o0Var = this.E;
            o0Var.getClass();
            int iF = o0Var.f(j - this.G);
            if (iF != 0) {
                if (z11) {
                    DecoderCounters decoderCounters = this.X0;
                    decoderCounters.f5673d += iF;
                    decoderCounters.f5675f += this.f14375y1;
                } else {
                    this.X0.j++;
                    D0(iF, this.f14375y1);
                }
                if (!I()) {
                    return false;
                }
                Q();
                return false;
            }
        }
        if (j29 < -30000 && !z6) {
            if (z11) {
                C0(lVar, i7);
            } else {
                je.b.c("dropVideoBuffer");
                lVar.releaseOutputBuffer(i7, false);
                je.b.t();
                D0(0, 1);
            }
            E0(j29);
            return true;
        }
        if (e0.f13788a < 21) {
            if (j29 >= JankRecordStore.FLUSH_INTERVAL_MS) {
                return false;
            }
            if (j29 > 11000) {
                try {
                    Thread.sleep((j29 - 10000) / 1000);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return false;
                }
            }
            o oVar2 = this.J1;
            if (oVar2 != null) {
                oVar2.d(j19, j28, format, this.f3196i0);
            }
            z0(lVar, i7);
            E0(j29);
            return true;
        }
        if (j29 >= 50000) {
            return false;
        }
        if (j28 == this.D1) {
            C0(lVar, i7);
            j12 = j28;
        } else {
            o oVar3 = this.J1;
            if (oVar3 != null) {
                oVar3.d(j19, j28, format, this.f3196i0);
            }
            j12 = j28;
            A0(lVar, i7, j12);
        }
        E0(j29);
        this.D1 = j12;
        return true;
    }

    @Override // gc.e
    public final String h() {
        return "MediaCodecVideoRenderer";
    }

    @Override // bd.s
    public final void h0() {
        super.h0();
        this.f14375y1 = 0;
    }

    @Override // gc.e
    public final boolean j() {
        boolean z5 = this.T0;
        this.f14356f1.getClass();
        return z5;
    }

    @Override // bd.s, gc.e
    public final boolean k() {
        k kVar;
        if (super.k()) {
            this.f14356f1.getClass();
            if (this.f14367q1 || (((kVar = this.f14364n1) != null && this.f14363m1 == kVar) || this.f3195g0 == null || this.G1)) {
                this.f14371u1 = -9223372036854775807L;
                return true;
            }
        }
        if (this.f14371u1 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.f14371u1) {
            return true;
        }
        this.f14371u1 = -9223372036854775807L;
        return false;
    }

    @Override // bd.s, gc.e
    public final void l() {
        DecoderCounters decoderCounters;
        e4.r rVar = this.e1;
        this.F1 = null;
        r0();
        this.f14365o1 = false;
        this.I1 = null;
        try {
            super.l();
            decoderCounters = this.X0;
            rVar.getClass();
            synchronized (decoderCounters) {
            }
        } finally {
            decoderCounters = this.X0;
            rVar.getClass();
            synchronized (decoderCounters) {
                Handler handler = (Handler) rVar.f8034e;
                if (handler != null) {
                    handler.post(new v(rVar, decoderCounters, 0));
                }
                rVar.P(VideoSize.f5848w);
            }
        }
    }

    @Override // bd.s
    public final boolean l0(bd.o oVar) {
        return this.f14363m1 != null || B0(oVar);
    }

    @Override // gc.e
    public final void m(boolean z5, boolean z6) {
        this.X0 = new DecoderCounters();
        p1 p1Var = this.f9604v;
        p1Var.getClass();
        boolean z7 = p1Var.f9819a;
        je.b.k((z7 && this.H1 == 0) ? false : true);
        if (this.G1 != z7) {
            this.G1 = z7;
            f0();
        }
        DecoderCounters decoderCounters = this.X0;
        e4.r rVar = this.e1;
        Handler handler = (Handler) rVar.f8034e;
        if (handler != null) {
            handler.post(new v(rVar, decoderCounters, 1));
        }
        this.f14368r1 = z6;
        this.f14369s1 = false;
    }

    @Override // bd.s, gc.e
    public final void n(long j, boolean z5) throws com.google.android.exoplayer2.b {
        super.n(j, z5);
        this.f14356f1.getClass();
        r0();
        t tVar = this.f14355d1;
        tVar.f14413m = 0L;
        tVar.f14416p = -1L;
        tVar.f14414n = -1L;
        this.f14376z1 = -9223372036854775807L;
        this.f14370t1 = -9223372036854775807L;
        this.f14374x1 = 0;
        if (!z5) {
            this.f14371u1 = -9223372036854775807L;
        } else {
            long j5 = this.f14357g1;
            this.f14371u1 = j5 > 0 ? SystemClock.elapsedRealtime() + j5 : -9223372036854775807L;
        }
    }

    @Override // bd.s
    public final int n0(bd.t tVar, Format format) {
        boolean z5;
        int i7 = 0;
        if (!je.o.l(format.I)) {
            return gc.e.e(0, 0, 0);
        }
        boolean z6 = format.L != null;
        Context context = this.f14354c1;
        List listU0 = u0(context, tVar, format, z6, false);
        if (z6 && listU0.isEmpty()) {
            listU0 = u0(context, tVar, format, false, false);
        }
        if (listU0.isEmpty()) {
            return gc.e.e(1, 0, 0);
        }
        int i10 = format.f5525d0;
        if (i10 != 0 && i10 != 2) {
            return gc.e.e(2, 0, 0);
        }
        bd.o oVar = (bd.o) listU0.get(0);
        boolean zD = oVar.d(format);
        if (!zD) {
            int i11 = 1;
            while (true) {
                if (i11 >= listU0.size()) {
                    z5 = true;
                    break;
                }
                bd.o oVar2 = (bd.o) listU0.get(i11);
                if (oVar2.d(format)) {
                    z5 = false;
                    zD = true;
                    oVar = oVar2;
                    break;
                }
                i11++;
            }
        } else {
            z5 = true;
            break;
        }
        int i12 = zD ? 4 : 3;
        int i13 = oVar.e(format) ? 16 : 8;
        int i14 = oVar.f3178g ? 64 : 0;
        int i15 = z5 ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT : 0;
        if (e0.f13788a >= 26 && "video/dolby-vision".equals(format.I) && !g.a(context)) {
            i15 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
        }
        if (zD) {
            List listU1 = u0(context, tVar, format, z6, true);
            if (!listU1.isEmpty()) {
                Pattern pattern = z.f3221a;
                ArrayList arrayList = new ArrayList(listU1);
                Collections.sort(arrayList, new bd.u(i7, new app.rive.runtime.kotlin.core.a(5, format)));
                bd.o oVar3 = (bd.o) arrayList.get(0);
                if (oVar3.d(format) && oVar3.e(format)) {
                    i7 = 32;
                }
            }
        }
        return i12 | i13 | i7 | i14 | i15;
    }

    @Override // gc.e
    public final void p() {
        a3.f fVar = this.f14356f1;
        try {
            try {
                D();
                f0();
                mc.k kVar = this.a0;
                if (kVar != null) {
                    kVar.d(null);
                }
                this.a0 = null;
                fVar.getClass();
                k kVar2 = this.f14364n1;
                if (kVar2 != null) {
                    if (this.f14363m1 == kVar2) {
                        this.f14363m1 = null;
                    }
                    kVar2.release();
                    this.f14364n1 = null;
                }
            } catch (Throwable th2) {
                mc.k kVar3 = this.a0;
                if (kVar3 != null) {
                    kVar3.d(null);
                }
                this.a0 = null;
                throw th2;
            }
        } catch (Throwable th3) {
            fVar.getClass();
            k kVar4 = this.f14364n1;
            if (kVar4 != null) {
                if (this.f14363m1 == kVar4) {
                    this.f14363m1 = null;
                }
                kVar4.release();
                this.f14364n1 = null;
            }
            throw th3;
        }
    }

    @Override // gc.e
    public final void q() {
        this.f14373w1 = 0;
        this.f14372v1 = SystemClock.elapsedRealtime();
        this.A1 = SystemClock.elapsedRealtime() * 1000;
        this.B1 = 0L;
        this.C1 = 0;
        t tVar = this.f14355d1;
        tVar.f14406d = true;
        tVar.f14413m = 0L;
        tVar.f14416p = -1L;
        tVar.f14414n = -1L;
        q qVar = tVar.f14404b;
        if (qVar != null) {
            s sVar = tVar.f14405c;
            sVar.getClass();
            sVar.f14400e.sendEmptyMessage(1);
            qVar.c(new gc.o(27, tVar));
        }
        tVar.c(false);
    }

    @Override // gc.e
    public final void r() {
        this.f14371u1 = -9223372036854775807L;
        w0();
        int i7 = this.C1;
        if (i7 != 0) {
            long j = this.B1;
            e4.r rVar = this.e1;
            Handler handler = (Handler) rVar.f8034e;
            if (handler != null) {
                handler.post(new u(rVar, j, i7, 1));
            }
            this.B1 = 0L;
            this.C1 = 0;
        }
        t tVar = this.f14355d1;
        tVar.f14406d = false;
        q qVar = tVar.f14404b;
        if (qVar != null) {
            qVar.g();
            s sVar = tVar.f14405c;
            sVar.getClass();
            sVar.f14400e.sendEmptyMessage(2);
        }
        tVar.a();
    }

    public final void r0() {
        bd.l lVar;
        this.f14367q1 = false;
        if (e0.f13788a < 23 || !this.G1 || (lVar = this.f3195g0) == null) {
            return;
        }
        this.I1 = new h(this, lVar);
    }

    @Override // bd.s, gc.e
    public final void u(long j, long j5) throws com.google.android.exoplayer2.b {
        super.u(j, j5);
        this.f14356f1.getClass();
    }

    public final void w0() {
        if (this.f14373w1 > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.f14372v1;
            int i7 = this.f14373w1;
            e4.r rVar = this.e1;
            Handler handler = (Handler) rVar.f8034e;
            if (handler != null) {
                handler.post(new u(rVar, i7, j));
            }
            this.f14373w1 = 0;
            this.f14372v1 = jElapsedRealtime;
        }
    }

    @Override // bd.s, gc.e
    public final void x(float f2, float f7) throws com.google.android.exoplayer2.b {
        super.x(f2, f7);
        t tVar = this.f14355d1;
        tVar.f14411i = f2;
        tVar.f14413m = 0L;
        tVar.f14416p = -1L;
        tVar.f14414n = -1L;
        tVar.c(false);
    }

    public final void x0() {
        this.f14369s1 = true;
        if (this.f14367q1) {
            return;
        }
        this.f14367q1 = true;
        Surface surface = this.f14363m1;
        e4.r rVar = this.e1;
        Handler handler = (Handler) rVar.f8034e;
        if (handler != null) {
            handler.post(new app.rive.core.a(rVar, surface, SystemClock.elapsedRealtime(), 4));
        }
        this.f14365o1 = true;
    }

    public final void y0(VideoSize videoSize) {
        if (videoSize.equals(VideoSize.f5848w) || videoSize.equals(this.F1)) {
            return;
        }
        this.F1 = videoSize;
        this.e1.P(videoSize);
    }

    public final void z0(bd.l lVar, int i7) {
        je.b.c("releaseOutputBuffer");
        lVar.releaseOutputBuffer(i7, true);
        je.b.t();
        this.X0.f5674e++;
        this.f14374x1 = 0;
        this.f14356f1.getClass();
        this.A1 = SystemClock.elapsedRealtime() * 1000;
        y0(this.E1);
        x0();
    }
}
