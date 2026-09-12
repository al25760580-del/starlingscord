package kotlin.collections;

import com.discord.misc.utilities.chat_view_types.ChatViewRecyclerTypes;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u001a\u001f\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"T", "", "firstOrNull", "(Ljava/util/List;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_IMAGE, xs = "kotlin/collections/CollectionsKt")
@SourceDebugExtension({"SMAP\n_Collections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,3800:1\n295#1,2:3801\n528#1,7:3803\n543#1,6:3810\n865#1,2:3817\n796#1:3819\n1878#1,2:3820\n797#1,2:3822\n1880#1:3824\n799#1:3825\n1878#1,3:3826\n817#1,2:3829\n855#1,2:3831\n1267#1,4:3841\n1236#1,4:3845\n1252#1,4:3849\n1299#1,4:3853\n1460#1,5:3857\n1475#1,5:3862\n1516#1,3:3867\n1519#1,3:3877\n1534#1,3:3880\n1537#1,3:3890\n1634#1,3:3907\n1604#1,4:3910\n1593#1:3914\n1878#1,2:3915\n1880#1:3918\n1594#1:3919\n1878#1,3:3920\n1625#1:3923\n1869#1:3924\n1870#1:3926\n1626#1:3927\n1869#1,2:3928\n1878#1,3:3930\n2967#1,3:3933\n2970#1,6:3937\n2992#1,3:3943\n2995#1,7:3947\n865#1,2:3954\n827#1:3956\n855#1,2:3957\n827#1:3959\n855#1,2:3960\n827#1:3962\n855#1,2:3963\n3522#1,8:3969\n3550#1,7:3977\n3581#1,10:3984\n1#2:3816\n1#2:3917\n1#2:3925\n1#2:3936\n1#2:3946\n37#3:3833\n36#3,3:3834\n37#3:3837\n36#3,3:3838\n384#4,7:3870\n384#4,7:3883\n384#4,7:3893\n384#4,7:3900\n32#5,2:3965\n32#5,2:3967\n*S KotlinDebug\n*F\n+ 1 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n174#1:3801,2\n184#1:3803,7\n194#1:3810,6\n774#1:3817,2\n785#1:3819\n785#1:3820,2\n785#1:3822,2\n785#1:3824\n785#1:3825\n796#1:3826,3\n808#1:3829,2\n827#1:3831,2\n1194#1:3841,4\n1209#1:3845,4\n1223#1:3849,4\n1286#1:3853,4\n1374#1:3857,5\n1387#1:3862,5\n1491#1:3867,3\n1491#1:3877,3\n1504#1:3880,3\n1504#1:3890,3\n1563#1:3907,3\n1573#1:3910,4\n1583#1:3914\n1583#1:3915,2\n1583#1:3918\n1583#1:3919\n1593#1:3920,3\n1617#1:3923\n1617#1:3924\n1617#1:3926\n1617#1:3927\n1625#1:3928,2\n2767#1:3930,3\n3067#1:3933,3\n3067#1:3937,6\n3084#1:3943,3\n3084#1:3947,7\n3260#1:3954,2\n3268#1:3956\n3268#1:3957,2\n3278#1:3959\n3278#1:3960,2\n3288#1:3962\n3288#1:3963,2\n3511#1:3969,8\n3539#1:3977,7\n3568#1:3984,10\n1583#1:3917\n1617#1:3925\n3067#1:3936\n3084#1:3946\n1042#1:3833\n1042#1:3834,3\n1089#1:3837\n1089#1:3838,3\n1491#1:3870,7\n1504#1:3883,7\n1518#1:3893,7\n1536#1:3900,7\n3456#1:3965,2\n3498#1:3967,2\n*E\n"})
public class CollectionsKt___CollectionsKt extends k0 {
    public static final void A(Iterable iterable, AbstractCollection destination) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
    }

    public static final List B(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            return CollectionsKt.j0((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        A(iterable, arrayList);
        return arrayList;
    }

    public static <T> T firstOrNull(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static final void z(Iterable iterable, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, Function1 function1) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        buffer.append(prefix);
        int i7 = 0;
        for (Object obj : iterable) {
            i7++;
            if (i7 > 1) {
                buffer.append(separator);
            }
            kotlin.text.q.a(buffer, obj, function1);
        }
        buffer.append(postfix);
    }
}
