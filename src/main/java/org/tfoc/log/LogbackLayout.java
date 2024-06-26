package org.tfoc.log;

import ch.qos.logback.classic.PatternLayout;

public class LogbackLayout
        extends PatternLayout {

    public static final String LOG_BANNER =
            """
             
             ████████╗██╗  ██╗███████╗    ███████╗███████╗██╗     ██╗      ██████╗ ██╗    ██╗███████╗██╗  ██╗██╗██████╗      ██████╗ ███████╗     ██████╗ ██████╗ ██████╗ ███████╗
             ╚══██╔══╝██║  ██║██╔════╝    ██╔════╝██╔════╝██║     ██║     ██╔═══██╗██║    ██║██╔════╝██║  ██║██║██╔══██╗    ██╔═══██╗██╔════╝    ██╔════╝██╔═══██╗██╔══██╗██╔════╝
                ██║   ███████║█████╗      █████╗  █████╗  ██║     ██║     ██║   ██║██║ █╗ ██║███████╗███████║██║██████╔╝    ██║   ██║█████╗      ██║     ██║   ██║██║  ██║█████╗  
                ██║   ██╔══██║██╔══╝      ██╔══╝  ██╔══╝  ██║     ██║     ██║   ██║██║███╗██║╚════██║██╔══██║██║██╔═══╝     ██║   ██║██╔══╝      ██║     ██║   ██║██║  ██║██╔══╝  
                ██║   ██║  ██║███████╗    ██║     ███████╗███████╗███████╗╚██████╔╝╚███╔███╔╝███████║██║  ██║██║██║         ╚██████╔╝██║         ╚██████╗╚██████╔╝██████╔╝███████╗
                ╚═╝   ╚═╝  ╚═╝╚══════╝    ╚═╝     ╚══════╝╚══════╝╚══════╝ ╚═════╝  ╚══╝╚══╝ ╚══════╝╚═╝  ╚═╝╚═╝╚═╝          ╚═════╝ ╚═╝          ╚═════╝ ╚═════╝ ╚═════╝ ╚══════╝
             
             The Mirror of Galadriel: Episode #012 - Linked List Cycle
             
             Congratulations on running your first test!

            """;

    @Override
    public String getFileHeader() {

        return LOG_BANNER;
    }

}
