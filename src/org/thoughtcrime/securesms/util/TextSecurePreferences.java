package org.thoughtcrime.securesms.util;

import android.content.Context;
import android.preference.PreferenceManager;
import android.util.Log;

public class TextSecurePreferences {

  public  static final String IDENTITY_PREF                    = "pref_choose_identity";
  public  static final String CHANGE_PASSPHRASE_PREF           = "pref_change_passphrase";
  public  static final String DISABLE_PASSPHRASE_PREF          = "pref_disable_passphrase";
  public  static final String THEME_PREF                       = "pref_theme";
  public  static final String LANGUAGE_PREF                    = "pref_language";
  public  static final String MMSC_HOST_PREF                   = "pref_apn_mmsc_host";
  public  static final String MMSC_PROXY_HOST_PREF             = "pref_apn_mms_proxy";
  public  static final String MMSC_PROXY_PORT_PREF             = "pref_apn_mms_proxy_port";
  public  static final String THREAD_TRIM_LENGTH               = "pref_trim_length";
  public  static final String THREAD_TRIM_NOW                  = "pref_trim_now";
  public  static final String ENABLE_MANUAL_MMS_PREF           = "pref_enable_manual_mms";

  public  static final String RINGTONE_PREF                    = "pref_key_ringtone";
  private static final String VIBRATE_PREF                     = "pref_key_vibrate";
  private static final String NOTIFICATION_PREF                = "pref_key_enable_notifications";
  public  static final String LED_COLOR_PREF                   = "pref_led_color";
  public  static final String LED_BLINK_PREF                   = "pref_led_blink";
  private static final String LED_BLINK_PREF_CUSTOM            = "pref_led_blink_custom";
  public  static final String ALL_MMS_PREF                     = "pref_all_mms";
  public  static final String ALL_SMS_PREF                     = "pref_all_sms";
  private static final String PASSPHRASE_TIMEOUT_INTERVAL_PREF = "pref_timeout_interval";
  private static final String PASSPHRASE_TIMEOUT_PREF          = "pref_timeout_passphrase";
  private static final String AUTO_KEY_EXCHANGE_PREF           = "pref_auto_complete_key_exchange";
  private static final String SCREEN_SECURITY_PREF             = "pref_screen_security";
  private static final String ENTER_SENDS_PREF                 = "pref_enter_sends";
  private static final String ENTER_PRESENT_PREF               = "pref_enter_key";
  private static final String SMS_DELIVERY_REPORT_PREF         = "pref_delivery_report_sms";
  private static final String THREAD_TRIM_ENABLED              = "pref_trim_threads";
  private static final String LOCAL_NUMBER_PREF                = "pref_local_number";
  private static final String VERIFYING_STATE_PREF             = "pref_verifying";
  public  static final String REGISTERED_GCM_PREF              = "pref_gcm_registered";
  private static final String GCM_PASSWORD_PREF                = "pref_gcm_password";
  private static final String PROMPTED_PUSH_REGISTRATION_PREF  = "pref_prompted_push_registration";
  private static final String PROMPTED_DEFAULT_SMS_PREF        = "pref_prompted_default_sms";
  private static final String SIGNALING_KEY_PREF               = "pref_signaling_key";
  private static final String DIRECTORY_FRESH_TIME_PREF        = "pref_directory_refresh_time";
  private static final String IN_THREAD_NOTIFICATION_PREF      = "pref_key_inthread_notifications";

  private static final String LOCAL_REGISTRATION_ID_PREF       = "pref_local_registration_id";
  private static final String ALLOW_SMS_FALLBACK_PREF          = "pref_allow_sms_traffic_out";
  private static final String SMS_FALLBACK_ASK_PREF            = "pref_sms_fallback_ask";
  private static final String ALLOW_SMS_NON_DATA_PREF          = "pref_sms_non_data_out";

  public static boolean isSmsFallbackEnabled(Context context) {
    return getBooleanPreference(context, ALLOW_SMS_FALLBACK_PREF, true);
  }

  public static void setSmsFallbackEnabled(Context context, boolean enabled) {
    setBooleanPreference(context, ALLOW_SMS_FALLBACK_PREF, enabled);
  }

  public static boolean isSmsNonDataOutEnabled(Context context) {
    return getBooleanPreference(context, ALLOW_SMS_NON_DATA_PREF, true);
  }

  public static void setSmsNonDataOutEnabled(Context context, boolean enabled) {
    setBooleanPreference(context, ALLOW_SMS_NON_DATA_PREF, enabled);
  }

  public static boolean isSmsFallbackAskEnabled(Context context) {
    return getBooleanPreference(context, SMS_FALLBACK_ASK_PREF, false);
  }

  public static void setSmsFallbackAskEnabled(Context context, boolean enabled) {
    setBooleanPreference(context, SMS_FALLBACK_ASK_PREF, enabled);
  }


  public static int getLocalRegistrationId(Context context) {
    return getIntegerPreference(context, LOCAL_REGISTRATION_ID_PREF, 0);
  }

  public static void setLocalRegistrationId(Context context, int registrationId) {
    setIntegerPrefrence(context, LOCAL_REGISTRATION_ID_PREF, registrationId);
  }

  public static boolean isInThreadNotifications(Context context) {
    return getBooleanPreference(context, IN_THREAD_NOTIFICATION_PREF, true);
  }

  public static long getDirectoryRefreshTime(Context context) {
    return getLongPreference(context, DIRECTORY_FRESH_TIME_PREF, 0L);
  }

  public static void setDirectoryRefreshTime(Context context, long value) {
    setLongPreference(context, DIRECTORY_FRESH_TIME_PREF, value);
  }

  public static String getLocalNumber(Context context) {
    return getStringPreference(context, LOCAL_NUMBER_PREF, "No Stored Number");
  }

  public static void setLocalNumber(Context context, String localNumber) {
    setStringPreference(context, LOCAL_NUMBER_PREF, localNumber);
  }

  public static String getPushServerPassword(Context context) {
    return getStringPreference(context, GCM_PASSWORD_PREF, null);
  }

  public static void setPushServerPassword(Context context, String password) {
    setStringPreference(context, GCM_PASSWORD_PREF, password);
  }

  public static void setSignalingKey(Context context, String signalingKey) {
    setStringPreference(context, SIGNALING_KEY_PREF, signalingKey);
  }

  public static String getSignalingKey(Context context) {
    return getStringPreference(context, SIGNALING_KEY_PREF, null);
  }

  public static boolean isEnterImeKeyEnabled(Context context) {
    return getBooleanPreference(context, ENTER_PRESENT_PREF, false);
  }

  public static boolean isEnterSendsEnabled(Context context) {
    return getBooleanPreference(context, ENTER_SENDS_PREF, false);
  }

  public static boolean isPasswordDisabled(Context context) {
    return getBooleanPreference(context, DISABLE_PASSPHRASE_PREF, false);
  }

  public static void setPasswordDisabled(Context context, boolean disabled) {
    setBooleanPreference(context, DISABLE_PASSPHRASE_PREF, disabled);
  }

  public static String getMmscUrl(Context context) {
    return getStringPreference(context, MMSC_HOST_PREF, "");
  }

  public static String getMmscProxy(Context context) {
    return getStringPreference(context, MMSC_PROXY_HOST_PREF, "");
  }

  public static String getMmscProxyPort(Context context) {
    return getStringPreference(context, MMSC_PROXY_PORT_PREF, "");
  }

  public static String getIdentityContactUri(Context context) {
    return getStringPreference(context, IDENTITY_PREF, null);
  }

  public static void setIdentityContactUri(Context context, String identityUri) {
    setStringPreference(context, IDENTITY_PREF, identityUri);
  }

  public static boolean isAutoRespondKeyExchangeEnabled(Context context) {
    return getBooleanPreference(context, AUTO_KEY_EXCHANGE_PREF, true);
  }

  public static boolean isScreenSecurityEnabled(Context context) {
    return getBooleanPreference(context, SCREEN_SECURITY_PREF, true);
  }

  public static boolean isUseLocalApnsEnabled(Context context) {
    return getBooleanPreference(context, ENABLE_MANUAL_MMS_PREF, false);
  }

  public static String getTheme(Context context) {
    return getStringPreference(context, THEME_PREF, "light");
  }

  public static boolean isVerifying(Context context) {
    return getBooleanPreference(context, VERIFYING_STATE_PREF, false);
  }

  public static void setVerifying(Context context, boolean verifying) {
    setBooleanPreference(context, VERIFYING_STATE_PREF, verifying);
  }

  public static boolean isPushRegistered(Context context) {
    return getBooleanPreference(context, REGISTERED_GCM_PREF, false);
  }

  public static void setPushRegistered(Context context, boolean registered) {
    Log.w("TextSecurePreferences", "Setting push registered: " + registered);
    setBooleanPreference(context, REGISTERED_GCM_PREF, registered);
  }

  public static boolean isPassphraseTimeoutEnabled(Context context) {
    return getBooleanPreference(context, PASSPHRASE_TIMEOUT_PREF, false);
  }

  public static int getPassphraseTimeoutInterval(Context context) {
    return getIntegerPreference(context, PASSPHRASE_TIMEOUT_INTERVAL_PREF, 5 * 60);
  }

  public static void setPassphraseTimeoutInterval(Context context, int interval) {
    setIntegerPrefrence(context, PASSPHRASE_TIMEOUT_INTERVAL_PREF, interval);
  }

  public static String getLanguage(Context context) {
    return getStringPreference(context, LANGUAGE_PREF, "zz");
  }

  public static void setLanguage(Context context, String language) {
    setStringPreference(context, LANGUAGE_PREF, language);
  }

  public static boolean isSmsDeliveryReportsEnabled(Context context) {
    return getBooleanPreference(context, SMS_DELIVERY_REPORT_PREF, false);
  }

  public static boolean hasPromptedPushRegistration(Context context) {
    return getBooleanPreference(context, PROMPTED_PUSH_REGISTRATION_PREF, false);
  }

  public static void setPromptedPushRegistration(Context context, boolean value) {
    setBooleanPreference(context, PROMPTED_PUSH_REGISTRATION_PREF, value);
  }

  public static boolean hasPromptedDefaultSmsProvider(Context context) {
    return getBooleanPreference(context, PROMPTED_DEFAULT_SMS_PREF, false);
  }

  public static void setPromptedDefaultSmsProvider(Context context, boolean value) {
    setBooleanPreference(context, PROMPTED_DEFAULT_SMS_PREF, value);
  }

  public static boolean isInterceptAllMmsEnabled(Context context) {
    return getBooleanPreference(context, ALL_MMS_PREF, true);
  }

  public static boolean isInterceptAllSmsEnabled(Context context) {
    return getBooleanPreference(context, ALL_SMS_PREF, true);
  }

  public static boolean isNotificationsEnabled(Context context) {
    return getBooleanPreference(context, NOTIFICATION_PREF, true);
  }

  public static String getNotificationRingtone(Context context) {
    return getStringPreference(context, RINGTONE_PREF, null);
  }

  public static boolean isNotificationVibrateEnabled(Context context) {
    return getBooleanPreference(context, VIBRATE_PREF, true);
  }

  public static String getNotificationLedColor(Context context) {
    return getStringPreference(context, LED_COLOR_PREF, "green");
  }

  public static String getNotificationLedPattern(Context context) {
    return getStringPreference(context, LED_BLINK_PREF, "500,2000");
  }

  public static String getNotificationLedPatternCustom(Context context) {
    return getStringPreference(context, LED_BLINK_PREF_CUSTOM, "500,2000");
  }

  public static void setNotificationLedPatternCustom(Context context, String pattern) {
    setStringPreference(context, LED_BLINK_PREF_CUSTOM, pattern);
  }

  public static boolean isThreadLengthTrimmingEnabled(Context context) {
    return getBooleanPreference(context, THREAD_TRIM_ENABLED, false);
  }

  public static int getThreadTrimLength(Context context) {
    return Integer.parseInt(getStringPreference(context, THREAD_TRIM_LENGTH, "500"));
  }

  private static void setBooleanPreference(Context context, String key, boolean value) {
    PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean(key, value).commit();
  }

  private static boolean getBooleanPreference(Context context, String key, boolean defaultValue) {
    return PreferenceManager.getDefaultSharedPreferences(context).getBoolean(key, defaultValue);
  }

  public static void setStringPreference(Context context, String key, String value) {
    PreferenceManager.getDefaultSharedPreferences(context).edit().putString(key, value).commit();
  }

  private static String getStringPreference(Context context, String key, String defaultValue) {
    return PreferenceManager.getDefaultSharedPreferences(context).getString(key, defaultValue);
  }

  private static int getIntegerPreference(Context context, String key, int defaultValue) {
    return PreferenceManager.getDefaultSharedPreferences(context).getInt(key, defaultValue);
  }

  private static void setIntegerPrefrence(Context context, String key, int value) {
    PreferenceManager.getDefaultSharedPreferences(context).edit().putInt(key, value).commit();
  }

  private static long getLongPreference(Context context, String key, long defaultValue) {
    return PreferenceManager.getDefaultSharedPreferences(context).getLong(key, defaultValue);
  }

  private static void setLongPreference(Context context, String key, long value) {
    PreferenceManager.getDefaultSharedPreferences(context).edit().putLong(key, value).commit();
  }


}
