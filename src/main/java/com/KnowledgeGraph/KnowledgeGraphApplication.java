package com.KnowledgeGraph;

import com.KnowledgeGraph.banner.KnowledgeBanner;
import org.springframework.boot.Banner;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class KnowledgeGraphApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(KnowledgeGraphApplication.class)
                .web(WebApplicationType.SERVLET)
                .banner(new KnowledgeBanner())
                .bannerMode(Banner.Mode.CONSOLE)
                .run(args);
        System.out.println("Boot Success");
    }
}
