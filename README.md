# thymeleaf-demo

## Thymeleaf内置对象

Thymeleaf中提供了一些内置对象，并且在这些对象中提供了一些方法，方便我们来调用。获取这些对象，需要使用`#对象名`来引用。

- 一些环境相关对象

|       对象        | 作用                                          |
| :---------------: | :-------------------------------------------- |
|      `#ctx`       | 获取Thymeleaf自己的Context对象                |
|    `#requset`     | 如果是web程序，可以获取HttpServletRequest对象 |
|    `#response`    | 如果是web程序，可以获取HttpServletReponse对象 |
|    `#session`     | 如果是web程序，可以获取HttpSession对象        |
| `#servletContext` | 如果是web程序，可以获取HttpServletContext对象 |

- Thymeleaf提供的全局对象：

|     对象     | 作用                             |
| :----------: | :------------------------------- |
|   `#dates`   | 处理java.util.date的工具对象     |
| `#calendars` | 处理java.util.calendar的工具对象 |
|  `#numbers`  | 用来对数字格式化的方法           |
|  `#strings`  | 用来处理字符串的方法             |
|   `#bools`   | 用来判断布尔值的方法             |
|  `#arrays`   | 用来护理数组的方法               |
|   `#lists`   | 用来处理List集合的方法           |
|   `#sets`    | 用来处理set集合的方法            |
|   `#maps`    | 用来处理map集合的方法            |

