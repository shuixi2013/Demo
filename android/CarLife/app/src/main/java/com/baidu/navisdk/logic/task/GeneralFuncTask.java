package com.baidu.navisdk.logic.task;

import com.baidu.navisdk.logic.CommandBase;
import com.baidu.navisdk.logic.CommandDispatcher;
import com.baidu.navisdk.logic.CommandResult;
import com.baidu.navisdk.logic.NaviErrCode;
import com.baidu.navisdk.logic.ReqData;
import java.util.concurrent.Callable;

public class GeneralFuncTask {
    public static CommandResult doTask(ReqData reqdata, String cmd) throws Exception {
        CommandResult ret = new CommandResult();
        CommandBase commandParser = CommandDispatcher.getCommandParser(cmd);
        if (commandParser != null) {
            return commandParser.execute(reqdata);
        }
        ret.set((int) NaviErrCode.RET_BUG);
        return ret;
    }

    public static Callable<CommandResult> newTask(final ReqData reqdata) {
        return new Callable<CommandResult>() {
            public CommandResult call() throws Exception {
                CommandResult result = GeneralFuncTask.doTask(reqdata, reqdata.mCmd);
                reqdata.mRequestListener.onRequestFinish(reqdata, result);
                return result;
            }
        };
    }
}
