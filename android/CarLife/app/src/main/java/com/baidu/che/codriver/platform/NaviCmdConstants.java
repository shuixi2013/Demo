package com.baidu.che.codriver.platform;

public class NaviCmdConstants {
    public static final int ACTION_TYPE_NAVI_CONTINUE_NAVI = 217;
    public static final String ACTION_TYPE_NAVI_EDOG_OFF = "close";
    public static final String ACTION_TYPE_NAVI_EDOG_ON = "open";
    public static final String ACTION_TYPE_NAVI_EXIT_APP = "end_app";
    public static final String ACTION_TYPE_NAVI_EXIT_NAVI = "end_navi";
    public static final String ACTION_TYPE_NAVI_FOREGROUND_STATE = "type_foreground";
    public static final int ACTION_TYPE_NAVI_HEAD_FORWARD = 230;
    public static final int ACTION_TYPE_NAVI_MODE_DAY = 232;
    public static final int ACTION_TYPE_NAVI_MODE_NIGHT = 231;
    public static final int ACTION_TYPE_NAVI_MOVE_DOWN = 223;
    public static final int ACTION_TYPE_NAVI_MOVE_LEFT = 221;
    public static final int ACTION_TYPE_NAVI_MOVE_RIGHT = 220;
    public static final int ACTION_TYPE_NAVI_MOVE_UP = 222;
    public static final int ACTION_TYPE_NAVI_NORTH_FORWARD = 229;
    public static final int ACTION_TYPE_NAVI_OVER_VIEW = 216;
    public static final String ACTION_TYPE_NAVI_QUERY_COMPANY_ADDRESS = "type_company_address";
    public static final String ACTION_TYPE_NAVI_QUERY_CURRENT_POSITION = "type_car_point";
    public static final String ACTION_TYPE_NAVI_QUERY_CURRENT_REST_DISTANCE = "type_rest_distance";
    public static final String ACTION_TYPE_NAVI_QUERY_CURRENT_REST_TIME = "type_rest_time";
    public static final String ACTION_TYPE_NAVI_QUERY_CURRENT_ROUTE_MODE = "type_navi_preference";
    public static final String ACTION_TYPE_NAVI_QUERY_DESTINATION = "type_get_destination_viapoint";
    public static final String ACTION_TYPE_NAVI_QUERY_EDOG_STATE = "type_is_incruise";
    public static final String ACTION_TYPE_NAVI_QUERY_HOME_ADDRESS = "type_home_address";
    public static final String ACTION_TYPE_NAVI_QUERY_NAVI_STATE = "type_is_innavi";
    public static final String ACTION_TYPE_NAVI_QUERY_ROUTE_MODE = "type_navi_preference_setting";
    public static final String ACTION_TYPE_NAVI_START_APP = "start_app";
    public static final int ACTION_TYPE_NAVI_TRAFFIC_OFF = 208;
    public static final int ACTION_TYPE_NAVI_TRAFFIC_ON = 207;
    public static final int ACTION_TYPE_NAVI_TTS_MODE_EXPERT = 234;
    public static final int ACTION_TYPE_NAVI_TTS_MODE_NEWER = 233;
    public static final int ACTION_TYPE_NAVI_TTS_MODE_SILENCE = 206;
    public static final int ACTION_TYPE_NAVI_ZOOM_IN = 203;
    public static final int ACTION_TYPE_NAVI_ZOOM_OUT = 202;
    public static final String ACTION_TYPE_PREFER_MODE_AVOID_TRAFFIC = "16";
    public static final String ACTION_TYPE_PREFER_MODE_MAX_HIGHWAY = "2";
    public static final String ACTION_TYPE_PREFER_MODE_MIN_HIGHWAY = "4";
    public static final String ACTION_TYPE_PREFER_MODE_MIN_TOLL = "8";
    public static final String ACTION_TYPE_PREFER_MODE_RECOMMEND = "1";
    public static final String DOMAIN_MAP = "map";
    public static final String DOMAIN_NAVIGATE_INSTRUCTION = "navigate_instruction";
    public static final String FUN_NAVI_ADD_VIA_POINT = "fun_navi_add_via_point";
    public static final String FUN_NAVI_APP_CONTROL = "fun_navi_app_control";
    public static final String FUN_NAVI_CRUISE = "fun_navi_cruise";
    public static final String FUN_NAVI_DIALOG_CANCEL = "fun_navi_dialog_cancel";
    public static final String FUN_NAVI_DIALOG_NOTIFY = "fun_navi_dialog_notify";
    public static final String FUN_NAVI_DIALOG_RESPONSE = "fun_navi_dialog_response";
    public static final String FUN_NAVI_GET_VERSION_INFO = "fun_navi_get_version_info";
    public static final String FUN_NAVI_LIMIT_SPEED = "fun_navi_limit_speed";
    public static final String FUN_NAVI_MAP_CONTROL = "fun_navi_map_control";
    public static final String FUN_NAVI_NAVI_SET = "fun_navi_navi_set";
    public static final String FUN_NAVI_NAVI_STATE = "fun_navi_navi_state";
    public static final String FUN_NAVI_PARK_REC = "fun_navi_park_rec";
    public static final String FUN_NAVI_QUERY_TRAFFIC = "fun_navi_query_traffic";
    public static final String FUN_NAVI_ROUTE_PLAN = "fun_navi_route_plan";
    public static final String FUN_NAVI_START_TASK = "fun_navi_start_task";
    public static final String FUN_NAVI_STATUS_SYNC = "fun_navi_status_sync";
    public static final String FUN_NAVI_SYN_ADDRESS = "fun_navi_syn_address";
    public static final String FUN_NAVI_USER_ACTION = "fun_navi_user_action";
    public static final String FUN_NAVI_VIA_SEARCH = "fun_navi_via_search";
    public static final String INTENT_ASK_GUIDANCE = "ask_guidance";
    public static final String INTENT_CLOSE = "close";
    public static final String INTENT_FAVORITE = "favorite";
    public static final String INTENT_LOCATION = "location";
    public static final String INTENT_MOVE_DOWN = "map_down";
    public static final String INTENT_MOVE_LEFT = "map_left";
    public static final String INTENT_MOVE_RIGHT = "map_right";
    public static final String INTENT_MOVE_UP = "map_up";
    public static final String INTENT_NAVIGATE = "navigate";
    public static final String INTENT_NEARBY = "nearby";
    public static final String INTENT_OPEN = "open";
    public static final String INTENT_POI = "poi";
    public static final String INTENT_QUIT = "quit";
    public static final String INTENT_REPEAT_REMINDER = "repeat_reminder";
    public static final String INTENT_REST_DISTANCE = "rest_distance";
    public static final String INTENT_REST_TIME = "rest_time";
    public static final String INTENT_ROUTE = "route";
    public static final String INTENT_ROUTE_HOME = "route_home";
    public static final String INTENT_ROUTE_WORK = "route_work";
    public static final String INTENT_SET_HOME = "set_home";
    public static final String INTENT_SET_WORK = "set_work";
    public static final String INTENT_SPEED_LIMIT = "speed_limit";
    public static final String INTENT_SWITCH_MODE = "switch_mode";
    public static final String INTENT_VIEW_DIRECTION = "view_direction";
    public static final String INTENT_VIEW_MAP = "view_map";
    public static final String INTENT_ZOOM_IN = "zoom_in";
    public static final String INTENT_ZOOM_OUT = "zoom_out";
    public static final String KEY_CLICK_FIRST_BTN = "key_click_first_btn";
    public static final String KEY_CLICK_SECOND_BTN = "key_click_second_btn";
    public static final String KEY_NAVI_CMD_DEST = "dest";
    public static final String KEY_NAVI_CMD_DEST_ADDRESS = "address";
    public static final String KEY_NAVI_CMD_DEST_DATA = "data";
    public static final String KEY_NAVI_CMD_DEST_LAT = "lat";
    public static final String KEY_NAVI_CMD_DEST_LNG = "lng";
    public static final String KEY_NAVI_CMD_DEST_NAME = "dest_name";
    public static final String KEY_NAVI_CMD_DEST_PASS_POINT = "pass_point";
    public static final String KEY_NAVI_CMD_DEST_PREFERENCE = "preference";
    public static final String KEY_NAVI_CMD_DEST_TYPE = "type";
    public static final String KEY_NAVI_CMD_EVENT = "event";
    public static final String KEY_NAVI_CMD_NAME = "name";
    public static final String KEY_NAVI_CMD_ORDER = "order";
    public static final String KEY_NAVI_CMD_POI = "poi";
    public static final String KEY_NAVI_CMD_SET_ADDRESS_COMPANY = "office";
    public static final String KEY_NAVI_CMD_SET_ADDRESS_HOME = "home";
    public static final String KEY_NAVI_CONTINUE_NAVI = "key_navi_continue_navi";
    public static final String KEY_NAVI_CRUISE_OFF = "key_navi_cruise_off";
    public static final String KEY_NAVI_CRUISE_ON = "key_navi_cruise_on";
    public static final String KEY_NAVI_CURRENT_LIMIT_SPEED = "key_navi_current_limit_speed";
    public static final String KEY_NAVI_EDOG_OFF = "key_navi_edog_off";
    public static final String KEY_NAVI_EDOG_ON = "key_navi_edog_on";
    public static final String KEY_NAVI_EXIT_APP = "key_navi_exit_app";
    public static final String KEY_NAVI_EXIT_NAVI = "key_navi_exit_navi";
    public static final String KEY_NAVI_FOREGROUND_STATE = "key_navi_foreground_state";
    public static final String KEY_NAVI_HEAD_FORWARD = "key_navi_head_forward";
    public static final String KEY_NAVI_MODE_DAY = "key_navi_mode_day";
    public static final String KEY_NAVI_MODE_NIGHT = "key_navi_mode_night";
    public static final String KEY_NAVI_MOVE_DOWN = "key_navi_move_down";
    public static final String KEY_NAVI_MOVE_LEFT = "key_navi_move_left";
    public static final String KEY_NAVI_MOVE_RIGHT = "key_navi_move_right";
    public static final String KEY_NAVI_MOVE_UP = "key_navi_move_up";
    public static final String KEY_NAVI_NORTH_FORWARD = "key_navi_north_forward";
    public static final String KEY_NAVI_OVERVIEW = "key_navi_overview";
    public static final String KEY_NAVI_PREFER_MODE_AVOID_TRAFFIC = "key_navi_prefer_mode_avoid_traffic";
    public static final String KEY_NAVI_PREFER_MODE_MAX_HIGHWAY = "key_navi_prefer_mode_max_highway";
    public static final String KEY_NAVI_PREFER_MODE_MIN_HIGHWAY = "key_navi_prefer_mode_min_highway";
    public static final String KEY_NAVI_PREFER_MODE_MIN_TOLL = "key_navi_prefer_mode_min_toll";
    public static final String KEY_NAVI_PREFER_MODE_RECOMMEND = "key_navi_prefer_mode_recommend";
    public static final String KEY_NAVI_QUERY_COMPANY_ADDRESS = "key_navi_query_company_address";
    public static final String KEY_NAVI_QUERY_CURRENT_POSITION = "key_navi_query_current_position";
    public static final String KEY_NAVI_QUERY_CURRENT_REST_DISTANCE = "key_navi_query_current_rest_distance";
    public static final String KEY_NAVI_QUERY_CURRENT_REST_TIME = "key_navi_query_current_rest_time";
    public static final String KEY_NAVI_QUERY_CURRENT_ROUTE_MODE = "key_navi_query_current_route_mode";
    public static final String KEY_NAVI_QUERY_DESTINATION = "key_navi_query_destination";
    public static final String KEY_NAVI_QUERY_EDOG_STATE = "key_navi_query_edog_state";
    public static final String KEY_NAVI_QUERY_HOME_ADDRESS = "key_navi_query_home_address";
    public static final String KEY_NAVI_QUERY_NAVI_STATE = "key_navi_query_navi_state";
    public static final String KEY_NAVI_QUERY_POI_TRAFFIC = "key_navi_query_poi_traffic";
    public static final String KEY_NAVI_QUERY_ROUTE_MODE = "key_navi_query_route_mode";
    public static final String KEY_NAVI_SET_COMPANY_ADDRESS = "key_navi_set_company_address";
    public static final String KEY_NAVI_SET_HOME_ADDRESS = "key_navi_set_home_address";
    public static final String KEY_NAVI_START_APP = "key_navi_start_app";
    public static final String KEY_NAVI_START_TASK = "key_navi_start_task";
    public static final String KEY_NAVI_START_TASK_COMPANY = "key_navi_start_task_company";
    public static final String KEY_NAVI_START_TASK_HOME = "key_navi_start_task_home";
    public static final String KEY_NAVI_TRAFFIC_OFF = "key_navi_traffic_off";
    public static final String KEY_NAVI_TRAFFIC_ON = "key_navi_traffic_on";
    public static final String KEY_NAVI_TTS_MODE_EXPERT = "key_navi_tts_mode_expert";
    public static final String KEY_NAVI_TTS_MODE_NEWER = "key_navi_tts_mode_newer";
    public static final String KEY_NAVI_TTS_MODE_OLDER = "key_navi_tts_mode_older";
    public static final String KEY_NAVI_TTS_MODE_SAFE = "key_navi_tts_mode_safe";
    public static final String KEY_NAVI_VERSION = "key_navi_version";
    public static final String KEY_NAVI_ZOOM_IN = "key_navi_zoom_in";
    public static final String KEY_NAVI_ZOOM_OUT = "key_navi_zoom_out";
    public static final String KEY_PREFIX = "key_";
    public static final String OBJECT_OPEN_ELECTRONIC_DOG = "electronic_dog";
    public static final String OBJECT_OPEN_ROUTE_CONDITION = "route_condition";
    public static final String OBJECT_SWITCH_MODE_CONTINUE_NAVI = "continue_navi";
    public static final String OBJECT_SWITCH_MODE_DAY = "day";
    public static final String OBJECT_SWITCH_MODE_EXPERT = "expert";
    public static final String OBJECT_SWITCH_MODE_FULL_ROUTE = "full_route";
    public static final String OBJECT_SWITCH_MODE_HEAD_FORWARD = "head_forward";
    public static final String OBJECT_SWITCH_MODE_NEW_HAND = "new_hand";
    public static final String OBJECT_SWITCH_MODE_NIGHT = "night";
    public static final String OBJECT_SWITCH_MODE_NORTH_FORWARD = "north_forward";
    public static final String OBJECT_SWITCH_MODE_OLD_HAND = "old_hand";
    public static final String OBJECT_SWITCH_MODE_SAFE = "safe";
}
