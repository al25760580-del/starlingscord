package com.discord.contact_sync;

import a3.e;
import com.discord.chat.presentation.list.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kr.f;
import or.e1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000223B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bBU\b\u0010\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\n\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003JE\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010&\u001a\u00020\u00062\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\rHÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001J%\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00002\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0001¢\u0006\u0002\b1R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0012R\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0012R\u001c\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u0012R\u001c\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u0012¨\u00064"}, d2 = {"Lcom/discord/contact_sync/ContactSyncBlobEntry;", "", "phone", "", "unencryptedName", "hasImageData", "", "deviceContactId", "givenName", "familyName", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getPhone", "()Ljava/lang/String;", "getUnencryptedName$annotations", "()V", "getUnencryptedName", "getHasImageData$annotations", "getHasImageData", "()Z", "getDeviceContactId$annotations", "getDeviceContactId", "getGivenName$annotations", "getGivenName", "getFamilyName$annotations", "getFamilyName", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contact_sync_release", "$serializer", "Companion", "contact_sync_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ContactSyncBlobEntry {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String deviceContactId;

    @NotNull
    private final String familyName;

    @NotNull
    private final String givenName;
    private final boolean hasImageData;

    @NotNull
    private final String phone;

    @NotNull
    private final String unencryptedName;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/contact_sync/ContactSyncBlobEntry$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/contact_sync/ContactSyncBlobEntry;", "contact_sync_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return ContactSyncBlobEntry$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ContactSyncBlobEntry(int i7, String str, String str2, boolean z5, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i7 & 63)) {
            e1.l(i7, 63, ContactSyncBlobEntry$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.phone = str;
        this.unencryptedName = str2;
        this.hasImageData = z5;
        this.deviceContactId = str3;
        this.givenName = str4;
        this.familyName = str5;
    }

    public static /* synthetic */ ContactSyncBlobEntry copy$default(ContactSyncBlobEntry contactSyncBlobEntry, String str, String str2, boolean z5, String str3, String str4, String str5, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = contactSyncBlobEntry.phone;
        }
        if ((i7 & 2) != 0) {
            str2 = contactSyncBlobEntry.unencryptedName;
        }
        if ((i7 & 4) != 0) {
            z5 = contactSyncBlobEntry.hasImageData;
        }
        if ((i7 & 8) != 0) {
            str3 = contactSyncBlobEntry.deviceContactId;
        }
        if ((i7 & 16) != 0) {
            str4 = contactSyncBlobEntry.givenName;
        }
        if ((i7 & 32) != 0) {
            str5 = contactSyncBlobEntry.familyName;
        }
        String str6 = str4;
        String str7 = str5;
        return contactSyncBlobEntry.copy(str, str2, z5, str3, str6, str7);
    }

    public static /* synthetic */ void getDeviceContactId$annotations() {
    }

    public static /* synthetic */ void getFamilyName$annotations() {
    }

    public static /* synthetic */ void getGivenName$annotations() {
    }

    public static /* synthetic */ void getHasImageData$annotations() {
    }

    public static /* synthetic */ void getUnencryptedName$annotations() {
    }

    public static final /* synthetic */ void write$Self$contact_sync_release(ContactSyncBlobEntry self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.phone);
        output.q(serialDesc, 1, self.unencryptedName);
        output.p(serialDesc, 2, self.hasImageData);
        output.q(serialDesc, 3, self.deviceContactId);
        output.q(serialDesc, 4, self.givenName);
        output.q(serialDesc, 5, self.familyName);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUnencryptedName() {
        return this.unencryptedName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getHasImageData() {
        return this.hasImageData;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDeviceContactId() {
        return this.deviceContactId;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getGivenName() {
        return this.givenName;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getFamilyName() {
        return this.familyName;
    }

    @NotNull
    public final ContactSyncBlobEntry copy(@NotNull String phone, @NotNull String unencryptedName, boolean hasImageData, @NotNull String deviceContactId, @NotNull String givenName, @NotNull String familyName) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(unencryptedName, "unencryptedName");
        Intrinsics.checkNotNullParameter(deviceContactId, "deviceContactId");
        Intrinsics.checkNotNullParameter(givenName, "givenName");
        Intrinsics.checkNotNullParameter(familyName, "familyName");
        return new ContactSyncBlobEntry(phone, unencryptedName, hasImageData, deviceContactId, givenName, familyName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContactSyncBlobEntry)) {
            return false;
        }
        ContactSyncBlobEntry contactSyncBlobEntry = (ContactSyncBlobEntry) other;
        return Intrinsics.areEqual(this.phone, contactSyncBlobEntry.phone) && Intrinsics.areEqual(this.unencryptedName, contactSyncBlobEntry.unencryptedName) && this.hasImageData == contactSyncBlobEntry.hasImageData && Intrinsics.areEqual(this.deviceContactId, contactSyncBlobEntry.deviceContactId) && Intrinsics.areEqual(this.givenName, contactSyncBlobEntry.givenName) && Intrinsics.areEqual(this.familyName, contactSyncBlobEntry.familyName);
    }

    @NotNull
    public final String getDeviceContactId() {
        return this.deviceContactId;
    }

    @NotNull
    public final String getFamilyName() {
        return this.familyName;
    }

    @NotNull
    public final String getGivenName() {
        return this.givenName;
    }

    public final boolean getHasImageData() {
        return this.hasImageData;
    }

    @NotNull
    public final String getPhone() {
        return this.phone;
    }

    @NotNull
    public final String getUnencryptedName() {
        return this.unencryptedName;
    }

    public int hashCode() {
        return this.familyName.hashCode() + e.d(e.d(a.g(e.d(this.phone.hashCode() * 31, 31, this.unencryptedName), 31, this.hasImageData), 31, this.deviceContactId), 31, this.givenName);
    }

    @NotNull
    public String toString() {
        String str = this.phone;
        String str2 = this.unencryptedName;
        boolean z5 = this.hasImageData;
        String str3 = this.deviceContactId;
        String str4 = this.givenName;
        String str5 = this.familyName;
        StringBuilder sbU = e.u("ContactSyncBlobEntry(phone=", str, ", unencryptedName=", str2, ", hasImageData=");
        sbU.append(z5);
        sbU.append(", deviceContactId=");
        sbU.append(str3);
        sbU.append(", givenName=");
        return a.l(sbU, str4, ", familyName=", str5, ")");
    }

    public ContactSyncBlobEntry(@NotNull String phone, @NotNull String unencryptedName, boolean z5, @NotNull String deviceContactId, @NotNull String givenName, @NotNull String familyName) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(unencryptedName, "unencryptedName");
        Intrinsics.checkNotNullParameter(deviceContactId, "deviceContactId");
        Intrinsics.checkNotNullParameter(givenName, "givenName");
        Intrinsics.checkNotNullParameter(familyName, "familyName");
        this.phone = phone;
        this.unencryptedName = unencryptedName;
        this.hasImageData = z5;
        this.deviceContactId = deviceContactId;
        this.givenName = givenName;
        this.familyName = familyName;
    }
}
