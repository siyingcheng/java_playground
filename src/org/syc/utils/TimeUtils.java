package org.syc.utils;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.*;

public class TimeUtils {
    private static final SimpleDateFormat DEFAULT_DATE_FORMAT = new SimpleDateFormat("HH:mm:ss.SSS");

    private static final ZoneId DEFAULT_ZONE_ID = ZoneId.systemDefault();

    private static final String DEUFALT_SEPARATOR = "--------------------------------------------------------------";

    public interface ITask {
        void execute();
    }

    /**
     * Do a task and calculate time cost
     *
     * @param title task title, may be null
     * @param task see {@link ITask}
     */
    public static void check(String title, ITask task) {
        if (task == null) {
            return;
        }
        if (StringUtils.isBlank(title)) {
            title = "";
        } else {
            title = "【" + title + "】";
        }
        System.out.println(title);
        LocalDateTime begin = LocalDateTime.now();
        System.out.println("开始： " + DEFAULT_DATE_FORMAT.format(Date.from(begin.atZone(DEFAULT_ZONE_ID).toInstant())));
        task.execute();
        LocalDateTime end = LocalDateTime.now();
        System.out.println("结束： " + DEFAULT_DATE_FORMAT.format(Date.from(end.atZone(DEFAULT_ZONE_ID).toInstant())));
        Duration duration = Duration.between(begin, end);
        long seconds = duration.getSeconds();
        System.out.println("耗时： " + seconds + " 秒");
        System.out.println(DEUFALT_SEPARATOR);
    }
}
