#spring mvc
##Dispatcher Servlet
##Controller
##HandlerMapping
##ViewResolver & View
##Interceptor
##Validate
##执行流程
http请求首先在浏览器章发出请求，请求经过WEB-INF目录下的web.xml配置
中的Dispatcher Servlet转发给对应的Controller，这个时候转发规则需要根据[name]-servlet.xml中配置的
HandlerMapping来决定将请求交给那个Controller来处理，如果没有配置HandlerMapping就找不到处理器了,
在找到了Controller后就应该根据配置文件或者Controller中的Annotation适配方法，方法在返回字符串或者ModelAndView交给
ViewResolver来处理ViewResolver也需要在[name]-servlet.xml中进行相关的配置。




