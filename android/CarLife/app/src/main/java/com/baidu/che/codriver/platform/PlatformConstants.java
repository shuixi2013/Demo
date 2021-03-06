package com.baidu.che.codriver.platform;

import com.baidu.che.codriver.util.INoProguard;

public class PlatformConstants implements INoProguard {
    public static final String BAIDU_NAVIAUTO_PACKAGE_NAME = "com.baidu.naviauto";
    public static final String BAIDU_NAVIAUTO_START_ACTIVITY_ACTION = "com.baidu.naviauto.action.START";
    public static final String BAIDU_NAVI_PACKAGE_NAME = "com.baidu.navi";
    public static final String BAIDU_NAVI_START_ACTIVITY_ACTION = "com.baidu.navi.action.START";
    public static final int CMD_TYPE_MUSIC = 4;
    public static final int CMD_TYPE_NAVI = 8;
    public static final int CMD_TYPE_OTHER = 16;
    public static final int CMD_TYPE_PHONE = 2;
    public static final int CMD_TYPE_SYSTEM = 1;
    public static final String CONNECT_EXTRA_KEY = "from";
    public static final String CONNECT_EXTRA_VALUE_LOCAL = "local";
    public static final String CONNECT_EXTRA_VALUE_REMOTER = "remoter";
    public static final int ERRORNO_COMMAND_NOT_EXECUTED = 4;
    public static final int ERRORNO_EMPTY_DATA = 5;
    public static final int ERRORNO_NETWORK = 6;
    public static final int ERRORNO_OTHER = 1;
    public static final int ERRORNO_PARAM = 2;
    public static final int ERRORNO_SUCCEED = 0;
    public static final int ERRORNO_WRONG_STATE = 3;
    public static final int EVENT_ERROR_NOT_INITED = 4;
    public static final int EVENT_SERVICE_CONNECTED = 1;
    public static final int EVENT_SERVICE_CONNECT_FAIL = 3;
    public static final int EVENT_SERVICE_DISCONNECTED = 2;
    public static final int EVENT_VERSION_NOT_MATCH = 5;
    public static final String INTENT_SERVICE_ACTION = "com.baidu.NaviControllerService";
    public static final String KEY_AUDIO_FOCUS_STATE = "audio_focus_state";
    public static final String KEY_AWAKEN_STATE = "awaken_state";
    public static final String KEY_BT_STATE = "bt_state";
    public static final String KEY_CONTACT = "contact";
    public static final String KEY_LIFE_STATE = "life_state";
    public static final String KEY_RECORD_STATE = "record_state";
    public static final String KEY_SPEECH_STATE = "speech_state";
    public static final String KEY_TEL_STATE = "tel_state";
    public static final String KEY_TTS_TEXT = "tts_text";
    public static final String KEY_TTS_TEXT_PREEMPTIVE = "tts_text_preemptive";
    public static final String KEY_WAKE_UP_STATE = "wake_up";
    public static final int TYPE_NOTIFICATION = 3;
    public static final int TYPE_REQUEST = 1;
    public static final int TYPE_RESPONSE = 2;
    public static final String VALUE_AWAKEN_DISABLE = "awaken_disable";
    public static final String VALUE_AWAKEN_ENABLE = "awaken_enable";
    public static final String VALUE_BT_STATE_CONNECTED = "bt_state_connected";
    public static final String VALUE_BT_STATE_DISABLE = "bt_state_disable";
    public static final String VALUE_BT_STATE_DISCONNECTED = "bt_state_disconnected";
    public static final String VALUE_CONTACT_CONTENTPROVIDER = "contact_contentprovider";
    public static final String VALUE_CONTACT_NOT_READY = "contact_not_ready";
    public static final String VALUE_END_RECORD = "end_record";
    public static final String VALUE_FINISH_LIFE = "finish_life";
    public static final String VALUE_RELEASE_AUDIO_FOCUS = "release_audio_focus";
    public static final String VALUE_REQUEST_AUDIO_FOCUS = "request_audio_focus";
    public static final String VALUE_SPEECH_END = "speech_end";
    public static final String VALUE_START_LIFE = "start_life";
    public static final String VALUE_START_RECORD = "start_record";
    public static final String VALUE_TEL_IDLE = "tel_idle";
    public static final String VALUE_TEL_INCALLING = "tel_incalling";
    public static final String VALUE_TEL_INCOMING = "tel_incoming";
    public static final String VALUE_TEL_OUTING = "tel_outing";
    public static final String VALUE_UNSUPPORT_KEY = "unsupport_key";
    public static final String VALUE_WAKE_UP_DISABLE = "wake_up_disable";
    public static final String VALUE_WAKE_UP_ENABLE = "wake_up_enable";
    public static final int VERSION_CODE = 65536;
}
