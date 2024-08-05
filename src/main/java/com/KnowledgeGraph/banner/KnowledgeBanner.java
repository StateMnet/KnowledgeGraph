package com.KnowledgeGraph.banner;

import org.springframework.boot.Banner;
import org.springframework.core.env.Environment;

import java.io.PrintStream;

public class KnowledgeBanner implements Banner {
    public static final String[] BANNER={"",
            "    __ __                     __         __           ______                 __  " ,
            "   / //_/____  ____ _      __/ /__  ____/ /___ ____  / ____/________ _____  / /_ " ,
            "  / ,<  / __ \\/ __ \\ | /| / / / _ \\/ __  / __ `/ _ \\/ / __/ ___/ __ `/ __ \\/ __ \\" ,
            " / /| |/ / / / /_/ / |/ |/ / /  __/ /_/ / /_/ /  __/ /_/ / /  / /_/ / /_/ / / / /" ,
            "/_/ |_/_/ /_/\\____/|__/|__/_/\\___/\\__,_/\\__, /\\___/\\____/_/   \\__,_/ .___/_/ /_/ " ,
            "                                       /____/                     /_/            ",
            "BUILD ON",
            "   _____            _             ____              __ " ,
            "  / ___/____  _____(_)___  ____ _/ __ )____  ____  / /_" ,
            "  \\__ \\/ __ \\/ ___/ / __ \\/ __ `/ __  / __ \\/ __ \\/ __/" ,
            " ___/ / /_/ / /  / / / / / /_/ / /_/ / /_/ / /_/ / /_  \n" +
            "/____/ .___/_/  /_/_/ /_/\\__, /_____/\\____/\\____/\\__/  " ,
            "    /_/                 /____/                         "
};

    @Override
    public void printBanner(Environment environment, Class<?> sourceClass, PrintStream out) {
        for (String line : BANNER) {
            out.println(line);
        }
    }
}
