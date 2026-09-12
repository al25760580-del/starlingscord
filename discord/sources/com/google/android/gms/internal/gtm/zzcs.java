package com.google.android.gms.internal.gtm;

import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import com.facebook.react.devsupport.StackTraceHelper;
import com.google.android.gms.internal.gtm.zzcq;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
class zzcs<T extends zzcq> extends zzbr {
    final zzcr<T> zza;

    public zzcs(zzbv zzbvVar, zzcr<T> zzcrVar) {
        super(zzbvVar);
        this.zza = zzcrVar;
    }

    private final T zzb(XmlResourceParser xmlResourceParser) {
        try {
            xmlResourceParser.next();
            int eventType = xmlResourceParser.getEventType();
            while (eventType != 1) {
                if (xmlResourceParser.getEventType() == 2) {
                    String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.US);
                    if (lowerCase.equals("screenname")) {
                        String attributeValue = xmlResourceParser.getAttributeValue(null, StackTraceHelper.NAME_KEY);
                        String strTrim = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue) && !TextUtils.isEmpty(strTrim)) {
                            this.zza.zzb(attributeValue, strTrim);
                        }
                    } else if (lowerCase.equals("string")) {
                        String attributeValue2 = xmlResourceParser.getAttributeValue(null, StackTraceHelper.NAME_KEY);
                        String strTrim2 = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue2) && strTrim2 != null) {
                            this.zza.zze(attributeValue2, strTrim2);
                        }
                    } else if (lowerCase.equals("bool")) {
                        String attributeValue3 = xmlResourceParser.getAttributeValue(null, StackTraceHelper.NAME_KEY);
                        String strTrim3 = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue3) && !TextUtils.isEmpty(strTrim3)) {
                            try {
                                this.zza.zzc(attributeValue3, Boolean.parseBoolean(strTrim3));
                            } catch (NumberFormatException e10) {
                                zzT("Error parsing bool configuration value", strTrim3, e10);
                            }
                        }
                    } else if (lowerCase.equals("integer")) {
                        String attributeValue4 = xmlResourceParser.getAttributeValue(null, StackTraceHelper.NAME_KEY);
                        String strTrim4 = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue4) && !TextUtils.isEmpty(strTrim4)) {
                            try {
                                this.zza.zzd(attributeValue4, Integer.parseInt(strTrim4));
                            } catch (NumberFormatException e11) {
                                zzT("Error parsing int configuration value", strTrim4, e11);
                            }
                        }
                    }
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e12) {
            zzK("Error parsing tracker configuration file", e12);
        } catch (XmlPullParserException e13) {
            zzK("Error parsing tracker configuration file", e13);
        }
        return (T) this.zza.zza();
    }

    public final T zza(int i7) {
        try {
            return (T) zzb(zzt().zzb().getResources().getXml(i7));
        } catch (Resources.NotFoundException e10) {
            zzS("inflate() called with unknown resourceId", e10);
            return null;
        }
    }
}
