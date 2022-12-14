package com.atguigu.mybatisplus;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

public class FreemarkerGeneratorTest {

    public static void main(String[] args) {
        FastAutoGenerator.create(
                            "jdbc:mysql://localhost:3306/mybatisplus_slave?characterEncoding=utf-8&useSSL=false",
                        "root",
                        "root")
                .globalConfig(builder -> {
                    builder.author("DELL_") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir("F://IDEA-Java//notes//11-SGG-MyBatisPlus//AutoGenerator2"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.atguigu") // 设置父包名
                            .moduleName("mybatisplus") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.mapperXml, "F://IDEA-Java//notes//11-SGG-MyBatisPlus//AutoGenerator2//resources")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("t_product") // 设置需要生成的表名
                            .addTablePrefix("t_", "c_"); // 设置过滤表前缀
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();

    }



}
