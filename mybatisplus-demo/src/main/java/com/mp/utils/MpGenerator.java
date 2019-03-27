package com.mp.utils;


import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class MpGenerator {
    public static void main(String[] args) {
        String packageName = "com.mp";
        generateByTables(false, packageName, "zrblog", "mp", "user");

        System.out.println("completed...");
    }

    /**
     * @param serviceNameStartWithI
     * @param packageName           包名
     * @param author                作者
     * @param database              数据库名
     * @param tableNames            表名
     */
    private static void generateByTables(boolean serviceNameStartWithI, String packageName, String author, String database, String... tableNames) {
        GlobalConfig config = new GlobalConfig();
//        String dbUrl = "jdbc:mysql://yuhan007.com:3306/" + database + "?useUnicode=true&characterEncoding=utf8&autoReconnect=true&useSSL=false";
        String dbUrl = "jdbc:oracle:thin:@192.168.81.42:1521/ninvoice";
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.ORACLE)
                .setUrl(dbUrl)
                .setUsername("charge")
                .setPassword("charge")
//                .setDriverName("com.mysql.jdbc.Driver");
                .setDriverName("oracle.jdbc.driver.OracleDriver");
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig
                .setCapitalMode(true)
                .setEntityLombokModel(false)
                .setDbColumnUnderline(true)
                .setNaming(NamingStrategy.underline_to_camel);
//              .setSuperMapperClass("cn.saytime.mapper.BaseMapper")
        //.setInclude(tableNames);//修改替换成你需要的表名，多个表名传数组
        config.setActiveRecord(true)
                .setOutputDir("F:\\wksidea\\myproject\\mybatisplus-demo\\src\\main\\java")
                .setFileOverride(true)
                .setEnableCache(false)
                .setServiceName("%sService")
                .setAuthor("wj") // 作者
                .setFileOverride(true)  // 文件覆盖
                //.setEnableCache(true)//二级缓存
                //        .setIdType(IdType.AUTO) // 主键策略
                .setBaseResultMap(true)//生成基本的resultMap
                .setBaseColumnList(true);//生成基本的SQL片段
        new AutoGenerator().setGlobalConfig(config)
                .setDataSource(dataSourceConfig)
                .setStrategy(strategyConfig)
                .setPackageInfo(
                        new PackageConfig()
                                .setParent(packageName)
                                .setController("controller")
                                .setEntity("model")
                                .setMapper("mapper")
                                .setService("service")
                                .setServiceImpl("service.impl")
                                .setXml("mapper")
                ).execute();
    }

}
