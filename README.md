# SpringCloud-Seata-Nacos-Demo
SpringCloud+Seata+Nacos整合Demo

### 全局事务ID
[![zEmRAK.png](https://s1.ax1x.com/2022/11/15/zEmRAK.png)](https://imgse.com/i/zEmRAK)
#### TM 全局事务xid
TM模块在执行`@GlobalTransactional`注解标识的方法时，通过AOP增强实现向TC注册全局事务 获取全局事务xid：当前服务`ip:port:transactionalId`
并在RPC远程调用时传递xid
[![TM 全局事务xid](https://s1.ax1x.com/2022/11/15/zEm1pQ.png)](https://imgse.com/i/zEm1pQ)
#### RM 全局事务xid
RM模块可通过`RootContext.getXID()`获取全局事务xid，同时携带`xid`以及当前分支数据资源即`数据库信息`向TC注册并获取当前分支事务id `branchId`
[![RM Order-service分支事务日志](https://s1.ax1x.com/2022/11/15/zEmD1J.png)](https://imgse.com/i/zEmD1J)
[![RM Stock-service分支事务日志](https://s1.ax1x.com/2022/11/15/zEmBp4.png)](https://imgse.com/i/zEmBp4)
[![RM User-service分支事务日志](https://s1.ax1x.com/2022/11/15/zEmwhF.png)](https://imgse.com/i/zEmwhF)
[![分布式事务请求-创建订单](https://s1.ax1x.com/2022/11/15/zEmdtU.png)](https://imgse.com/i/zEmdtU)
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
