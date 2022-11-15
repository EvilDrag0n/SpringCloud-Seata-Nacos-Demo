# SpringCloud-Seata-Nacos-Demo
SpringCloud+Seata+Nacos整合Demo

### 全局事务ID
![image](https://user-images.githubusercontent.com/29672402/201820879-0bd4255e-aa36-4e7f-925a-4e283a6ca76c.png)
#### TM 全局事务xid
TM模块在执行`@GlobalTransactional`注解标识的方法时，通过AOP增强实现向TC注册全局事务 获取全局事务xid：当前服务`ip:port:transactionalId`
并在RPC远程调用时传递xid
![TM 全局事务xid](https://user-images.githubusercontent.com/29672402/201641447-4c8b16f7-1aa1-454e-88e1-29487db7e64f.png)
#### RM 全局事务xid
RM模块可通过`RootContext.getXID()`获取全局事务xid，同时携带`xid`以及当前分支数据资源即`数据库信息`向TC注册并获取当前分支事务id `branchId`
![RM Order-service分支事务日志](https://user-images.githubusercontent.com/29672402/201641454-e8a02fe4-c63e-4e0b-aacf-02dc3c0d9737.png)
![RM Stock-service分支事务日志](https://user-images.githubusercontent.com/29672402/201641461-474ff81e-39a4-47f9-a12f-b4da98ada505.png)
![RM User-service分支事务日志](https://user-images.githubusercontent.com/29672402/201641465-09264f21-22a6-4e62-8b4e-b668d5c19191.png)
![分布式事务请求-创建订单](https://user-images.githubusercontent.com/29672402/201641438-6c6abdf7-be12-41b8-a13f-77a0648e8e39.png)
### 环境
- Nacos 2.1.2
- Seata-Server 1.5.2
- jdk1.8
### 技术栈
- MyBatis-Plus 3.4.2
- SpringCloud Hoxton.SR9
- SpringCloudAlibaba 2.2.2.RELEASE
- SpringBoot 2.3.7.RELEASE
- OpenFeign 
