package me.morishima.methoxymethane.api.utils;

import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class DMELog {
    public static Logger logger;

    private DMELog() {
    }

    public static void init(@NotNull Logger modLogger) {
        logger = modLogger;
    }
}
