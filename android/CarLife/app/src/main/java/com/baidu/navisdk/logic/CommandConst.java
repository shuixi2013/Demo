package com.baidu.navisdk.logic;

public abstract interface CommandConst
{
  public static final int K_APP_SUBSYSTEM_BASE = 2000;
  public static final String K_COMMAND_PARAM_KEY_DATACHECK_JSON = "param.datacheck.json";
  public static final String K_COMMAND_PARAM_KEY_ROUTEPLAN_GETROUTEINFO_INPUTLIST = "param.rp.getrouteinfoinputlist";
  public static final String K_COMMAND_PARAM_KEY_SDKOP_INITENGINECONFIG = "param.sdkop.initengineconfig";
  public static final String K_COMMAND_PARAM_KEY_SDKOP_VERIFYACCESSKEY = "param.sdkop.verifyaccesskey";
  public static final String K_COMMAND_PARAM_KEY_SEARCH_BYPOINTTYPE = "param.search.bypointtype";
  public static final String K_COMMAND_PARAM_KEY_SEARCH_CATALOGID = "param.search.catalogid";
  public static final String K_COMMAND_PARAM_KEY_SEARCH_CIRCLE = "param.search.circle";
  public static final String K_COMMAND_PARAM_KEY_SEARCH_DISTID = "param.search.districtid";
  public static final String K_COMMAND_PARAM_KEY_SEARCH_IS_LAST_PAGE = "param.search.islastpage";
  public static final String K_COMMAND_PARAM_KEY_SEARCH_JUMP_TO_RP = "search_jump_to_rp";
  public static final String K_COMMAND_PARAM_KEY_SEARCH_KEY = "param.search.key";
  public static final String K_COMMAND_PARAM_KEY_SEARCH_MRSL = "param.search.mrsl";
  public static final String K_COMMAND_PARAM_KEY_SEARCH_NETMODE = "param.search.netmode";
  public static final String K_COMMAND_PARAM_KEY_SEARCH_PAGER = "param.search.pager";
  public static final String K_COMMAND_PARAM_KEY_SEARCH_PAGERNUM = "param.search.pagernum";
  public static final String K_COMMAND_PARAM_KEY_SEARCH_PB_DATA = "pb_data";
  public static final String K_COMMAND_PARAM_KEY_SEARCH_POI = "search_poi";
  public static final String K_COMMAND_PARAM_KEY_SEARCH_POICNT = "param.search.poicount";
  public static final String K_COMMAND_PARAM_KEY_SEARCH_POINT = "param.search.point";
  public static final String K_COMMAND_PARAM_KEY_SEARCH_PROVINCEID = "param.search.proviceid";
  public static final String K_COMMAND_PARAM_KEY_SEARCH_RADIUS = "param.search.radius";
  public static final String K_COMMAND_PARAM_KEY_SEARCH_RANGE = "param.search.range";
  public static final String K_COMMAND_PARAM_KEY_SEARCH_ROUTE_NODE_COUNT = "route_node_count";
  public static final String K_COMMAND_PARAM_KEY_SEARCH_ROUTE_NODE_TYPE = "route_node_type";
  public static final String K_COMMAND_PARAM_KEY_SEARCH_ROUTE_SEARCH_MODE = "param.search.route_search_mode";
  public static final String K_COMMAND_PARAM_KEY_SEARCH_SORT_TYPE = "param.search.sort_type";
  public static final String K_COMMAND_PARAM_KEY_SEARCH_SUBTYPE = "param.search.subtype";
  public static final String K_COMMAND_PARAM_KEY_SEARCH_SUGPREFIX = "param.search.sugprefix";
  public static final String K_COMMAND_PARAM_KEY_SEARCH_VIA_ROUTE_NODE_INDEX = "param.search.via_route_node_index";
  public static final String K_COMMAND_PARAM_KEY_STATISTICS_EVENTID = "param.statistics.eventid";
  public static final String K_COMMAND_PARAM_KEY_STATISTICS_PAIRS = "param.statistics.pairs";
  public static final String K_COMMAND_PARAM_KEY_STATISTICS_VALUE = "param.statistics.value";
  public static final int K_MSG_ENTRY_AUTH_FELLOW = 2003;
  public static final int K_MSG_FINISH_DOWNLOAD_VOICE = 2002;
  public static final int K_MSG_FINISH_UPLOAD_VOICE = 2001;
  public static final int K_MSG_GENERAL_BASE = 1400;
  public static final int K_MSG_GENERAL_FINISH_EXEC = 1401;
  public static final int K_MSG_GENERAL_HTTP_DEBUG_MODE_GET_URL_EXEC = 1405;
  public static final int K_MSG_GENERAL_HTTP_IMAGE_FINISH_EXEC = 1403;
  public static final int K_MSG_GENERAL_HTTP_IPO_GUIDE_EXEC = 1404;
  public static final int K_MSG_GENERAL_HTTP_JSON_FINISH_EXEC = 1402;
  public static final int K_MSG_GENERAL_HTTP_TYPE_HUDSDK_SWITCH = 1420;
  public static final int K_MSG_GENERAL_HTTP_TYPE_HUSDK_CLIENT_ENTH = 1421;
  public static final int K_MSG_GENERAL_HTTP_TYPE_UPDATE_ISSUELIST = 1408;
  public static final int K_MSG_GENERAL_HTTP_TYPE_UPDATE_PERSONRELIABLE = 1409;
  public static final int K_MSG_GENERAL_HTTP_TYPE_UPDATE_ROUTELIST = 1407;
  public static final int K_MSG_GENERAL_HTTP_TYPE_UPDATE_TASKLIST = 1406;
  public static final int K_MSG_GENERAL_HTTP_TYPE_UPLOAD_KEY_LOG = 1411;
  public static final int K_MSG_GENERAL_HTTP_TYPE_UPLOAD_LOCALFILE = 1410;
  public static final int K_MSG_REQUEST_CANCELLED = 100000;
  public static final int K_MSG_ROUTEPLAN_BASE = 1200;
  public static final int K_MSG_ROUTEPLAN_GETCOMMONROUTEINFO = 1202;
  public static final int K_MSG_ROUTEPLAN_GETROUTEINFO = 1201;
  public static final int K_MSG_ROUTE_SEARCH_FOR_MAP_POI_RESULT_PB = 1010;
  public static final int K_MSG_SDKOP_BASE = 1300;
  public static final int K_MSG_SDKOP_INIT = 1301;
  public static final int K_MSG_SDKOP_VERIFY = 1302;
  public static final int K_MSG_SEARCH_AROUND_PARK = 1006;
  public static final int K_MSG_SEARCH_BASE = 1000;
  public static final int K_MSG_SEARCH_BYKEY = 1001;
  public static final int K_MSG_SEARCH_BYPOINT = 1003;
  public static final int K_MSG_SEARCH_BY_CIRCLE_FOR_MAP_POI_RESULT_PB = 1009;
  public static final int K_MSG_SEARCH_BY_KEY_FOR_MAP_POI_RESULT_PB = 1008;
  public static final int K_MSG_SEARCH_BY_KEY_FOR_MAP_RP_NODE_POI_RESULT_PB = 1007;
  public static final int K_MSG_SEARCH_GETSUG = 1004;
  public static final int K_MSG_SEARCH_NEAREST = 1002;
  public static final int K_MSG_SEARCH_WITH_PAGER = 1005;
  public static final int K_MSG_STATISTICS_BASE = 1100;
  public static final int K_MSG_STATISTICS_RECORD = 1101;
  public static final int K_MSG_STATISTICS_UPLOAD = 1102;
  public static final int K_NETMODE_UNDEFINE = 3;
  public static final String K_PARAM_KEY_DOWNLOAD_VOICE_MSGID = "param.download.voice.msgid";
  public static final String K_PARAM_KEY_DOWNLOAD_VOICE_URL = "param.download.voice.url";
  public static final String K_PARAM_KEY_DOWNLOAD_VOICE_USERID = "param.download.voice.userid";
  public static final String K_PARAM_KEY_FELLOW_THREAD_LOOPER = "param.fellow.thread.looper";
  public static final String K_PARAM_KEY_UPLOAD_VOICE_CRTEATE_TIME = "param.upload.voice.creattime";
  public static final String K_PARAM_KEY_UPLOAD_VOICE_DURATION = "param.upload.voice.duration";
  public static final String K_PARAM_KEY_UPLOAD_VOICE_GROUPID = "param.upload.voice.groupid";
  public static final String K_PARAM_KEY_UPLOAD_VOICE_PATH = "param.upload.voice.path";
  public static final String K_PARAM_KEY_UPLOAD_VOICE_RECORDID = "param.upload.voice.voiceid";
  public static final String K_PARAM_KEY_UPLOAD_VOICE_USERID = "param.upload.voice.userid";
  public static final int K_SUBTYPE_GETDISTRICTS = 2;
  public static final int K_SUBTYPE_GETPOI = 1;
  public static final int K_TASK_SUBSYSTEM_APP = 5;
  public static final int K_TASK_SUBSYSTEM_FELLOW = 6;
  public static final int K_TASK_SUBSYSTEM_GENERAL = 7;
  public static final int K_TASK_SUBSYSTEM_GENERAL_HTTPREQUEST = 3;
  public static final int K_TASK_SUBSYSTEM_POISEARCH = 1;
  public static final int K_TASK_SUBSYSTEM_ROUTEPLAN = 2;
  public static final int K_TASK_SUBSYSTEM_STATISTICS = 4;
}


/* Location:              /Users/objectyan/Documents/OY/baiduCarLife_40/dist/classes2-dex2jar.jar!/com/baidu/navisdk/logic/CommandConst.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */