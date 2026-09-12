package kotlin.text;

import com.discord.misc.utilities.chat_view_types.ChatViewRecyclerTypes;
import kotlin.Metadata;
import kotlin.ranges.IntRange;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "radix", "checkRadix", "(I)I", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_IMAGE, xs = "kotlin/text/CharsKt")
public class CharsKt__CharJVMKt {
    public static int checkRadix(int i7) {
        if (2 <= i7 && i7 < 37) {
            return i7;
        }
        StringBuilder sbS = a3.e.s(i7, "radix ", " was not in valid range ");
        sbS.append(new IntRange(2, 36, 1));
        throw new IllegalArgumentException(sbS.toString());
    }
}
