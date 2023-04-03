# 谷粒商城

## 介绍
谷粒商城，业务代码完全一样，优化了视频中的pom依赖，更清晰

## 软件架构
软件架构说明


## 安装教程

1.  找到并启动nacos1.4.3，http://localhost:8848/nacos ，账号密码都是 nacos
2.  运行 renren-fast-vue
3.  依次启动 gulimall-gateway，gulimall-product等服务
4.  本系统已删除敏感信息比如阿里云oss的密钥


## 示例
![img.png](./img/img.png)



# 开始：依赖版本选择
统一编码 **_UTF-8_**
> .properties文件，统一编码为 ISO-8859-1，springboot底层以此编码加载**_，_**可以在idea设置 以ascii格式显示
> 原因：gulimall-common中的ValidationMessages.properties，若不设置无法显示中文

spring的三个版本，为相对较新的兼容版本，不建议更换
```xml
<lombok.version>1.18.22</lombok.version>
<mysql-connector.version>8.0.17</mysql-connector.version>
<mybatis-plus.version>3.5.0</mybatis-plus.version>
<spring-boot.version>2.3.2.RELEASE</spring-boot.version>
<spring-cloud.version>Hoxton.SR9</spring-cloud.version>
<spring-cloud-alibaba.version>2.2.6.RELEASE</spring-cloud-alibaba.version>
```

- mysql 8.0
- Vue 2
- jdk 8，高版本打包需要额外添加依赖
- nacos 1.4.3
# 1.创建数据库 直接导入sql
| gulimall-oms		 | 订单服务 |
| --- | --- |
| gulimall-pms | 商品服务 |
| gulimall-sms	 | 优惠卷服务 |
| gulimall-ums | 会员服务 |
| gulimall-wms	 | 仓储服务 |
| gulimall-admin	 | 这个是renren-fast的数据库 |

# 2.创建maven模块
| gulimall-common   | com.gulimall.common	 | 公共的工具类 |
| --- | --- | --- |
| gulimall-coupon | com.gulimall.coupon	 | 优惠卷服务 |
| gulimall-gateway | com.gulimall.gateway | 网关	 |
| gulimall-member | com.gulimall.member	 | 会员服务 |
| gulimall-order | com.gulimall.order	 | 订单服务 |
| gulimall-product	 |  com.gulimall.product	 | 商品服务 |
| gulimall-third-party | com.gulimall.thirdparty	 | 第三方服务 |
| gulimall-ware	 | com.gulimall.ware | 仓储服务 |

# 3.改pom
下面代码为父工程pom的必备部分，全局约定了**cloud**和**cloudalibaba**的版本，子项目里无需再写
**重要**的地方为 确定项目的统一 **lombok**，版本不一致将会无法运行，很恶心

| springboot | 2.3.2.RELEASE |
| --- | --- |
| springcloud | Hoxton.SR9 |
| springcloudalibaba | 2.2.6.RELEASE |
| nacos 					 | 1.4.3 |

**官方推荐搭配版本，视频中的版本太老了**
![image.png](https://cdn.nlark.com/yuque/0/2022/png/12521721/1664859067801-1929c0e1-330e-4e99-88a7-bf6efb9ee208.png#averageHue=%23edefe7&clientId=ua0ea6cf9-fcc3-4&from=paste&height=110&id=u66ecbfb2&name=image.png&originHeight=506&originWidth=1386&originalType=binary&ratio=1&rotation=0&showTitle=false&size=189274&status=done&style=none&taskId=ud09e84a5-1156-4e91-9525-8be415b7430&title=&width=301)![image.png](https://cdn.nlark.com/yuque/0/2022/png/12521721/1664859101568-f3b0efbc-e48d-4c01-8878-830f04f91b9f.png#averageHue=%23d7c8b2&clientId=u4e5bc447-0569-4&from=paste&height=108&id=ucac03543&name=image.png&originHeight=478&originWidth=1732&originalType=binary&ratio=1&rotation=0&showTitle=false&size=175599&status=done&style=none&taskId=u5f0d655e-66f6-4deb-9966-f07ca092fce&title=&width=393)
按照这么写就不需要每个项目都写一遍 springcloud版本 ，视频里教的麻烦了
```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>

  <groupId>com.gulimall</groupId>
  <artifactId>gulimall</artifactId>
  <version>1.0</version>
  <description>父工程，依赖管理</description>
  <packaging>pom</packaging>
  
  <modules>
    <module>gulimall-coupon</module>
    <module>gulimall-member</module>
    <module>gulimall-order</module>
    <module>gulimall-product</module>
    <module>gulimall-ware</module>
    <module>gulimall-common</module>
    <module>gulimall-gateway</module>
    <module>gulimall-third-party</module>
    <module>renren-generator</module>
    <module>renren-fast</module>
  </modules>

  <properties>
    <lombok.version>1.18.22</lombok.version>
    <spring-boot.version>2.3.2.RELEASE</spring-boot.version>
    <spring-cloud.version>Hoxton.SR9</spring-cloud.version>
    <spring-cloud-alibaba.version>2.2.6.RELEASE</spring-cloud-alibaba.version>
  </properties>

  <dependencyManagement>
    <dependencies>
      <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <version>${lombok.version}</version>
        <optional>true</optional>
      </dependency>

      <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-dependencies</artifactId>
        <version>${spring-boot.version}</version>
        <type>pom</type>
        <scope>import</scope>
      </dependency>
      <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-dependencies</artifactId>
        <version>${spring-cloud.version}</version>
        <type>pom</type>
        <scope>import</scope>
      </dependency>
      <dependency>
        <groupId>com.alibaba.cloud</groupId>
        <artifactId>spring-cloud-alibaba-dependencies</artifactId>
        <version>${spring-cloud-alibaba.version}</version>
        <type>pom</type>
        <scope>import</scope>
      </dependency>
    </dependencies>
  </dependencyManagement>
</project>
```
**示例：子项目pom，部分重要内容**
```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <parent>
    <artifactId>gulimall</artifactId>
    <groupId>com.gulimall</groupId>
    <version>1.0</version>
  </parent>
  <modelVersion>4.0.0</modelVersion>

  <artifactId>gulimall-product</artifactId>
  <description>商品服务</description>

  <dependencies>
    <dependency>
      <groupId>com.baomidou</groupId>
      <artifactId>mybatis-plus-boot-starter</artifactId>
    </dependency>
    <dependency>
      <groupId>org.springframework.cloud</groupId>
      <artifactId>spring-cloud-starter-openfeign</artifactId>
    </dependency>
  </dependencies>
</project>
```
# 4.引入人人开源的坑

1. renren-fast
2. renren-generator
3. renren-fast-vue

注意：

1. 更改renren-fast的pom中，lombok采用继承父pom的版本，无需填写版本号
2. 删除renren-fast与renren-generator的pom中的**oracle**和**sqlserve**数据库驱动，
3. 删除parent改为继承父项目，父pom提供springboot与其他依赖的版本号

更改模板文件：Controller.java.vm
```java
//更改为 com.gulimall
import com.gulimall.common.utils.PageUtils;
import com.gulimall.common.utils.R;

//删除这类代码 完全没用
@RequiresPermissions

```
# 5.renren-fast的坑：
总结：

1. 采用node15.14
2. 然后执行npm i pubsub-js	，填补缺少的依赖
3. 即可运行

**版本冲突**
![image.png](https://cdn.nlark.com/yuque/0/2022/png/12521721/1664859519135-aabb1c8b-c955-4f6f-91ca-b5ac106e13ab.png#averageHue=%23f7f7f6&clientId=uc8b21e92-354a-4&from=paste&height=243&id=u3f7d9360&name=image.png&originHeight=1084&originWidth=1144&originalType=binary&ratio=1&rotation=0&showTitle=false&size=495368&status=done&style=none&taskId=ub910cbcb-fb94-46a6-ad35-38775d5ad80&title=&width=256)![image.png](https://cdn.nlark.com/yuque/0/2022/png/12521721/1664859543409-b50cff0d-9639-4638-b96d-716f4911dce2.png#averageHue=%23f9f8f6&clientId=uc120603f-9adc-4&from=paste&height=228&id=u38585c14&name=image.png&originHeight=570&originWidth=756&originalType=binary&ratio=1&rotation=0&showTitle=false&size=154226&status=done&style=none&taskId=u0a86c1bf-75aa-4471-9ae4-8cf1cba9667&title=&width=302)
根据电脑里的**node**环境修改_ renren-fast-vue _中的 _package.json_
搜索node-sass和sass-loader 进行更改
_renren自带的版本_

- "node-sass": "^6.0.1",
- "sass-loader": "6.0.6",

不作任何修改 ，本人node 16.16及无法运行
更换15.14，完美执行npm install
**npm run dev 出错**
查阅资料发现是webpack新版bug，卸载现有webpack，安装老版本即可
删除node_modules目录，npm cache clean --force  清空缓存

- npm uninstall webpack-dev-server    卸载
- npm install webpack-dev-server@2.9.1   安装
- npm run dev				完成运行
- 执行 npm i pubsub-js		因为官方没有这个依赖，代码里用到了

人人开源全是坑
# 6.mac版本nacos的坑
系统自带jdk路径，后来单独安装jdk8
自带路径包含空格，nacos执行**空格路径**的命令导致出错，无法开启，手动在系统环境变量中添加
export  JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk1.8.0_341.jdk/Contents/Home
# 7.可以看视频了


# 1.renren-fast和网关
目的：添加跨域     注册到nacos
renren-fast需要添加 **nacos**依赖
renre的原本boot版本为2.6、
如果 nacos依赖版本和 springboot保持一致，就要继承父pom，删掉原有的springboot parent，
同时 renren跨域的java配置也要修改

- 不修改：无法登陆，验证码正常
- 视频说注释掉：无法登陆，验证码不显示
- 删了配置的java文件：一切正常
# 2.validator校验bug
**不影响**后续全局拦截异常的校验异常，因为不需要返回默认的报错信息
**bug**：接口返回，不显示 message和错误信息
可能的方法一：添加如下，返回多出message字段，但是没内容
```xml
<dependency>
  <groupId>org.hibernate</groupId>
  <artifactId>hibernate-validator</artifactId>
  <version>6.1.0.Final</version>
</dependency>
```
可能的方法二:
```xml
<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-validation</artifactId>
</dependency>
<dependency>
  <groupId>org.hibernate</groupId>
  <artifactId>hibernate-validator</artifactId>
  <version>6.1.0.Final</version>
</dependency>
```
成功的方法三:
yml中添加
```yaml
server:
  port: 8080
  error:
    include-binding-errors: always
    include-message: always
```
# 3.vue项目设置的修改
注释掉，esLint代码检查
![image.png](https://cdn.nlark.com/yuque/0/2022/png/12521721/1666082334196-91e0c135-adf7-417b-b5ae-5f85bef0c391.png#averageHue=%23808b5d&clientId=u785b3d81-f2be-4&from=paste&height=439&id=u0db75b65&name=image.png&originHeight=878&originWidth=1798&originalType=binary&ratio=1&rotation=0&showTitle=false&size=292811&status=done&style=none&taskId=u14864368-e00c-4261-8a97-7f900708880&title=&width=899)
更改请求url为网关
![image.png](https://cdn.nlark.com/yuque/0/2022/png/12521721/1666082387667-70dd2f19-cd63-4124-827d-a61fb9c9c3b8.png#averageHue=%238c835d&clientId=u785b3d81-f2be-4&from=paste&height=447&id=ub29519a2&name=image.png&originHeight=894&originWidth=2272&originalType=binary&ratio=1&rotation=0&showTitle=false&size=251156&status=done&style=none&taskId=udc047459-29c9-4199-95d6-3d25a8562f0&title=&width=1136)
# 4.至此项目不会有阻碍运行的bug，看视频到validator校验信息


