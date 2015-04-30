#spring mvc
###核心组件
Dispatcher Servlet Controller HandlerMapping ViewResolver & View Interceptor Validate
###执行流程
http请求首先在浏览器章发出请求，请求经过WEB-INF目录下的web.xml配置
中的Dispatcher Servlet转发给对应的Controller，这个时候转发规则需要根据[name]-servlet.xml中配置的
HandlerMapping来决定将请求交给那个Controller来处理，如果没有配置HandlerMapping就找不到处理器了,
在找到了Controller后就应该根据配置文件或者Controller中的Annotation适配方法，方法在返回字符串或者ModelAndView后交给
ViewResolver来处理，ViewResolver也需要在[name]-servlet.xml中进行相关的配置，在配置ViewResolver时候也要加上ViewClass
ViewResolver是一种策略，通过其可以进行返回字符串或者模型与真实视图之间的映射，比如将返回回来的login映射到/WEB-INF/jsp下面的
login.jsp，在将其导出到jsp之前对ModelAndView的处理就是通过View来处理的，所以Resolver和View是配合来使用的

Intercepter在请求到达Controller之前后之后可以对其进行数据等的处理，Validate可以在JSR标准下实现对数据的验证，从spring4开始
已经[集成Bean Validation 1.1(JSR-349)到SpringMVC](http://sishuok.com/forum/blogPost/list/7798.html)


